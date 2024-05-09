package pt.up.fe.els2023.dsl.internal.source;


import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.model.source.reader.AutoReader;
import pt.up.fe.els2023.model.source.reader.SourceReader;

import java.util.Collection;

public class AutoSourceBuilder extends SourceBuilder {
    AutoSourceBuilder(String path) {
        super(path);
    }

    public AutoSourceBuilder store(Metadata metadata, String column) {
        super.store(metadata, column);
        return this;
    }

    public AutoSourceBuilder columns(String... columns) {
        super.columns(columns);
        return this;
    }

    public AutoSourceBuilder columns(Collection<String> columns) {
        super.columns(columns);
        return this;
    }

    @Override
    public SourceReader buildReader() {
        return new AutoReader();
    }
}
