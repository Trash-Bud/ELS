package pt.up.fe.els2023.model.source.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.source.reader.query.IntoJsonPathQuery;
import pt.up.fe.els2023.model.source.reader.query.JsonPathQuery;

public abstract class GenericJsonReader implements SourceReader {
    private final JsonPathQuery query;

    public GenericJsonReader(IntoJsonPathQuery query) {
        this.query = query.intoJsonPathQuery();
    }

    public GenericJsonReader() {
        this.query = new JsonPathQuery();
    }

    public abstract JsonFactory getFactory();

    public Table read(File file) throws IOException {
        var mapper = new ObjectMapper(getFactory());
        var root = mapper.readTree(file);
        return parse(root);
    }

    public Table read(String fileContent) throws IOException {
        var mapper = new ObjectMapper(getFactory());
        var root = mapper.readTree(fileContent);
        return parse(root);
    }

    private Table parse(JsonNode root) {
        var selected = query.selectNode(root);
        if (selected == null) {
            return new Table(new ArrayList<>());
        }

        if (selected.isObject()) {
            return parseObject(selected);
        } else if (selected.isArray()) {
            List<Table> tables = new ArrayList<>();
            var it = selected.elements();
            while (it.hasNext()) {
                var element = it.next();
                if (!element.isObject()) {
                    throw new RuntimeException("Array value isn't an object");
                }
                tables.add(parseObject(element));
            }
            return Table.combine(tables);
        } else {
            throw new RuntimeException("Selected value is not an object or an array");
        }
    }

    private static Table parseObject(JsonNode node) {
        List<String> fields = new ArrayList<>();
        List<String> values = new ArrayList<>();

        var it = node.fields();
        while (it.hasNext()) {
            var pair = it.next();
            if (!pair.getValue().isValueNode()) {
                continue;
            }

            fields.add(pair.getKey());
            values.add(pair.getValue().asText());
        }

        var table = new Table(fields);
        table.addRow(values);

        return table;
    }
}
