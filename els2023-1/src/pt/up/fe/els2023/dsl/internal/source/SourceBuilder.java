package pt.up.fe.els2023.dsl.internal.source;

import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.model.source.SourceProcessor;
import pt.up.fe.els2023.model.source.SourceStoreMetadata;
import pt.up.fe.els2023.model.source.reader.SourceReader;

import java.util.*;

public abstract class SourceBuilder {
    private final String path;
    private List<String> dataColumns;
    private final Map<Metadata, String> metadataColumns;

    SourceBuilder(String path) {
        this.path = path;
        this.dataColumns = null;
        this.metadataColumns = new HashMap<>();
    }

    public SourceBuilder store(Metadata metadata, String column) {
        this.metadataColumns.put(metadata, column);
        return this;
    }

    public SourceBuilder columns(String... columns) {
        return this.columns(Arrays.asList(columns));
    }

    public SourceBuilder columns(Collection<String> columns) {
        if (this.dataColumns == null) {
            this.dataColumns = new ArrayList<>();
        }
        this.dataColumns.addAll(columns);
        return this;
    }

    public abstract SourceReader buildReader();

    public SourceProcessor build() {
        SourceStoreMetadata metadata = new SourceStoreMetadata(
            this.metadataColumns.getOrDefault(Metadata.Filepath, null),
            this.metadataColumns.getOrDefault(Metadata.LastModified, null)
        );

        return new SourceProcessor(this.path, metadata, this.dataColumns, this.buildReader());
    }
}
