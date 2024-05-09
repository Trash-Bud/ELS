package pt.up.fe.els2023.dsl.internal.source;

import java.util.Collection;

import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.model.source.reader.SourceReader;
import pt.up.fe.els2023.model.source.reader.XmlReader;
import pt.up.fe.els2023.model.source.reader.query.IntoXPathQuery;
import pt.up.fe.els2023.model.source.reader.query.Query;
import pt.up.fe.els2023.model.source.reader.query.XPathQuery;

public class XmlSourceBuilder extends SourceBuilder {
    private IntoXPathQuery query = new Query();

    XmlSourceBuilder(String path) {
        super(path);
    }

    public XmlSourceBuilder query(String query) {
        this.query = new Query(query);
        return this;
    }

    public XmlSourceBuilder xpathQuery(String query) {
        this.query = new XPathQuery(query);
        return this;
    }

    public XmlSourceBuilder store(Metadata metadata, String column) {
        super.store(metadata, column);
        return this;
    }

    public XmlSourceBuilder columns(String... columns) {
        super.columns(columns);
        return this;
    }

    public XmlSourceBuilder columns(Collection<String> columns) {
        super.columns(columns);
        return this;
    }

    @Override
    public SourceReader buildReader() {
        return new XmlReader(query);
    }
}
