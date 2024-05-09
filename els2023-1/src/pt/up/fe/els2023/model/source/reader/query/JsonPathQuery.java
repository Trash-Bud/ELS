package pt.up.fe.els2023.model.source.reader.query;

import com.fasterxml.jackson.databind.JsonNode;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider;

public class JsonPathQuery implements IntoJsonPathQuery {
    private final static Configuration config = Configuration.builder()
        .jsonProvider(new JacksonJsonNodeJsonProvider())
        .build();

    private final JsonPath path;

    public JsonPathQuery(String query) {
        this.path = JsonPath.compile(query);
    }

    public JsonPathQuery() {
        this.path = JsonPath.compile("$");
    }

    public JsonNode selectNode(JsonNode root) {
        try {
            return JsonPath.using(config).parse(root).read(path);
        } catch (PathNotFoundException ex) {
            return null;
        }
    }

    @Override
    public JsonPathQuery intoJsonPathQuery() {
        return this;
    }
}
