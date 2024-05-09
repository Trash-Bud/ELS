package pt.up.fe.els2023.model.source.reader;

import com.fasterxml.jackson.core.JsonFactory;

import pt.up.fe.els2023.model.source.reader.query.IntoJsonPathQuery;

public class JsonReader extends GenericJsonReader {
    public JsonReader(IntoJsonPathQuery query) {
        super(query);
    }

    public JsonReader() {
        super();
    }

    @Override
    public JsonFactory getFactory() {
        return new JsonFactory();
    }
}
