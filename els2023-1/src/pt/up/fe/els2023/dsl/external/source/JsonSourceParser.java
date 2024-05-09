package pt.up.fe.els2023.dsl.external.source;

import pt.up.fe.els2023.externalDsl.JsonType;
import pt.up.fe.els2023.model.source.reader.JsonReader;
import pt.up.fe.els2023.model.source.reader.query.JsonPathQuery;
import pt.up.fe.els2023.model.source.reader.query.Query;

public class JsonSourceParser {
    public static JsonReader parse(JsonType jsonType, String queryString) {
        var jsonPathQuery = jsonType.getPath();
        if (jsonPathQuery != null) {
            if (queryString != null) {
                throw new RuntimeException("Multiple queries specified for the same source");
            }
            return new JsonReader(new JsonPathQuery(jsonPathQuery));
        } else {
            return new JsonReader(new Query(queryString));
        }
    }
}
