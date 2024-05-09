package pt.up.fe.els2023.model.source.reader;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import pt.up.fe.els2023.model.source.reader.query.IntoJsonPathQuery;

public class YamlReader extends GenericJsonReader {
    public YamlReader(IntoJsonPathQuery query) {
        super(query);
    }

    public YamlReader() {
        super();
    }

    @Override
    public JsonFactory getFactory() {
        return new YAMLFactory();
    }
}
