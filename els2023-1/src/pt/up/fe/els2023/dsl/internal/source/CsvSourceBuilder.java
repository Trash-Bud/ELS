package pt.up.fe.els2023.dsl.internal.source;

import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.model.source.reader.CsvReader;
import pt.up.fe.els2023.model.source.reader.SourceReader;

import java.util.Collection;

public class CsvSourceBuilder extends SourceBuilder {
    CsvSourceBuilder(String path) {
        super(path);
    }

    public CsvSourceBuilder store(Metadata metadata, String column) {
        super.store(metadata, column);
        return this;
    }

    public CsvSourceBuilder columns(String... columns) {
        super.columns(columns);
        return this;
    }

    public CsvSourceBuilder columns(Collection<String> columns) {
        super.columns(columns);
        return this;
    }

    @Override
    public SourceReader buildReader() {
        return new CsvReader();
    }
}
