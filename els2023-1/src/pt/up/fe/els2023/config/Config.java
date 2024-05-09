package pt.up.fe.els2023.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.up.fe.els2023.config.operation.*;
import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.PipelineApplier;
import pt.up.fe.els2023.model.operation.*;
import pt.up.fe.els2023.model.output.OutputProcessor;
import pt.up.fe.els2023.model.output.writer.HtmlWriter;
import pt.up.fe.els2023.model.output.writer.TableWriter;
import pt.up.fe.els2023.model.source.SourceProcessor;
import pt.up.fe.els2023.model.source.SourceStoreMetadata;
import pt.up.fe.els2023.model.source.reader.*;
import pt.up.fe.els2023.model.source.reader.query.JsonPathQuery;
import pt.up.fe.els2023.model.source.reader.query.Query;
import pt.up.fe.els2023.model.source.reader.query.XPathQuery;


public record Config(
    @JsonProperty(required = true) Map<String, Source> sources,
    @JsonProperty("pipelines") Map<String, List<CfgTransformation>> pipelines_,
    @JsonProperty(required = true) Map<String, CfgTableOperation> tables,
    @JsonProperty(required = true) List<Output> outputs
) {
    public record Source(
        @JsonProperty(required = true) String path,
        String query,
        String jsonpathQuery,
        String xpathQuery,
        @JsonProperty("store_in_columns") Map<String, String> storeInColumns,
        List<String> columns,
        String format
    ) {
        public SourceProcessor intoSourceProcessor() {
            String storeFilename = null;
            String storeModifiedDate = null;
            if (storeInColumns != null) {
                for (var metadata : storeInColumns.entrySet()) {
                    switch (metadata.getKey()) {
                        case "path" -> storeFilename = metadata.getValue();
                        case "modification_date" -> storeModifiedDate = metadata.getValue();
                        default -> throw new RuntimeException("unknown value for store_in_columns");
                    }
                }
            }

            if (Stream.of(query, jsonpathQuery, xpathQuery).filter(Objects::nonNull).count() > 1) {
                throw new RuntimeException("Multiple queries specified for the same source");
            }

            if (query != null && (format == null || format.equals("auto") || format.equals("csv"))) {
                throw new RuntimeException("Query was specified for source format that doesn't support it");
            }

            if (jsonpathQuery != null && !List.of("json", "yaml", "yml").contains(format)) {
                throw new RuntimeException("JsonPath query specified for non JSON/YAML source");
            }

            if (xpathQuery != null && !"xml".equals(format)) {
                throw new RuntimeException("XPath query specified for non XML source");
            }

            var reader = switch (format) {
                case null -> new AutoReader();
                case "auto" -> new AutoReader();
                case "csv" -> new CsvReader();
                case "json" -> new JsonReader(jsonpathQuery != null ? new JsonPathQuery(jsonpathQuery) : new Query(query));
                case "xml" -> new XmlReader(xpathQuery != null ? new XPathQuery(xpathQuery) : new Query(query));
                case "yaml", "yml" -> new YamlReader(jsonpathQuery != null ? new JsonPathQuery(jsonpathQuery) : new Query(query));
                default -> throw new RuntimeException("Unknown format: " + format);
            };

            return new SourceProcessor(path,
                new SourceStoreMetadata(storeFilename, storeModifiedDate),
                columns,
                reader
            );
        }
    }

    public record Output(
        @JsonProperty(required = true) String path,
        @JsonProperty(required = true) String table,
        String format,
        String cssPath
    ) {}

    public Map<String, PipelineApplier> pipelines() {
        Map<String, PipelineApplier> pipelines = new HashMap<>();
        if (pipelines_ == null) {
            return pipelines;
        }
        pipelines_.forEach((key, transformations) -> pipelines.put(key, new PipelineApplier(transformations.stream().map(CfgTransformation::intoApplier).toList())));
        return pipelines;
    }

    private static TableOperation getTableOrTableOperation(Map<String, SourceProcessor> sources, Map<String, PipelineApplier> pipelines, Map<String, TableOperation> tables, JsonNode node) {
        if (node.isObject()) {
            var mapper = new ObjectMapper();
            var cfgOp = mapper.convertValue(node, CfgTableOperation.class);
            return cfgOpToTableOperation(sources, pipelines, tables, cfgOp);
        } else if (node.isTextual()) {
            return getOrThrow(tables, node.textValue());
        } else {
            throw new RuntimeException("invalid value for table in operation: " + node.toPrettyString());
        }
    }

    private static TableOperation cfgOpToTableOperation(Map<String, SourceProcessor> sources, Map<String, PipelineApplier> pipelines, Map<String, TableOperation> tableOperations, CfgTableOperation cfgOp) {
        switch (cfgOp) {
            case CfgAppendOperation op -> {
                var mode = switch (op.mode) {
                    case null -> AppendOperation.Mode.Exact;
                    case Intersection -> AppendOperation.Mode.Intersection;
                    case Union -> AppendOperation.Mode.Union;
                };

                var tables = op.tables.stream().map(n -> getTableOrTableOperation(sources, pipelines, tableOperations, n)).toList();
                return new AppendOperation(mode, tables);
            }
            case CfgMergeOperation op -> {
                var mode = switch (op.mode) {
                    case null -> MergeOperation.Mode.Exact;
                    case Intersection -> MergeOperation.Mode.Intersection;
                    case Union -> MergeOperation.Mode.Union;
                };
                var tables = op.tables.stream().map(n -> getTableOrTableOperation(sources, pipelines, tableOperations, n)).toList();
                return new MergeOperation(tables,mode);
            }
            case CfgPipelineOperation op -> {
                var table = getTableOrTableOperation(sources, pipelines, tableOperations, op.table);
                var pipeline = getOrThrow(pipelines, op.pipeline);
                return new PipelineOperation(pipeline, table);
            }
            case CfgSelectionOperation op -> {
                var source = getOrThrow(sources, op.source);
                return new SelectionOperation(source);
            }
            case CfgTransformationOperation op -> {
                var table = getTableOrTableOperation(sources, pipelines, tableOperations, op.table);
                return new TransformationOperation(op.transformation.intoApplier(), table);
            }
        }
    }

    private static <T> T getOrThrow(Map<String, T> map, String name) {
        var v = map.get(name);
        if (v == null) {
            throw new RuntimeException("'" + name + "' not defined");
        }
        return v;
    }

    public List<OutputProcessor> intoOutputs() {
        var sourceProcessors = sources.entrySet()
            .stream()
            .map(entry -> Map.entry(entry.getKey(), entry.getValue().intoSourceProcessor()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        var pipelines = pipelines();

        var tableOperations = new HashMap<String, TableOperation>();
        for (var entry : tables.entrySet()) {
            var name = entry.getKey();
            tableOperations.put(name, cfgOpToTableOperation(sourceProcessors, pipelines, tableOperations, entry.getValue()));
        }

        return outputs.stream().map(output -> {
            TableWriter tableWriter;
            if ("html".equals(output.format)) {
                tableWriter = new HtmlWriter(output.cssPath);
            } else {
                if (output.cssPath != null) {
                    throw new RuntimeException("CSS files can only be added to HTML outputs.");
                }
                tableWriter = TableWriter.get(output.format);
            }

            return new OutputProcessor(output.path, getOrThrow(tableOperations, output.table), tableWriter);
        }).toList();
    }
}
