package pt.up.fe.els2023.dsl.internal.source;

import java.util.Collection;

import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.model.source.reader.SourceReader;
import pt.up.fe.els2023.model.source.reader.YamlReader;
import pt.up.fe.els2023.model.source.reader.query.IntoJsonPathQuery;
import pt.up.fe.els2023.model.source.reader.query.JsonPathQuery;
import pt.up.fe.els2023.model.source.reader.query.Query;

public class YamlSourceBuilder extends SourceBuilder {
    private IntoJsonPathQuery query = new Query();

    YamlSourceBuilder(String path) {
        super(path);
    }

    public YamlSourceBuilder query(String query) {
        this.query = new Query(query);
        return this;
    }

    public YamlSourceBuilder jsonPathQuery(String query) {
        this.query = new JsonPathQuery(query);
        return this;
    }

    public YamlSourceBuilder store(Metadata metadata, String column) {
        super.store(metadata, column);
        return this;
    }

    public YamlSourceBuilder columns(String... columns) {
        super.columns(columns);
        return this;
    }

    public YamlSourceBuilder columns(Collection<String> columns) {
        super.columns(columns);
        return this;
    }

    @Override
    public SourceReader buildReader() {
        return new YamlReader(query);
    }
}
