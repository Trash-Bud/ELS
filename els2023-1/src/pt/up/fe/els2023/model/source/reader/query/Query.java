package pt.up.fe.els2023.model.source.reader.query;

public class Query implements IntoJsonPathQuery, IntoXPathQuery {
    private final String query;

    public Query(String query) {
        this.query = query;
    }

    public Query() {
        this.query = null;
    }

    @Override
    public JsonPathQuery intoJsonPathQuery() {
        if (query == null || query.isEmpty()) {
            return new JsonPathQuery();
        }

        var jsonpathQuery = new StringBuilder("$");
        for (var part : query.split("\\.")) {
            jsonpathQuery.append('[');

            try {
                var intValue = Integer.parseInt(part);
                jsonpathQuery.append(intValue);
            } catch (NumberFormatException ignored) {
                jsonpathQuery
                    .append('\'')
                    .append(part)
                    .append('\'');
            }

            jsonpathQuery.append(']');
        }

        return new JsonPathQuery(jsonpathQuery.toString());
    }

    @Override
    public XPathQuery intoXPathQuery() {
        if (query == null || query.isEmpty()) {
            return new XPathQuery();
        }

        var xpathQuery = new StringBuilder();
        for (var part : query.split("\\.")) {
            try {
                var intValue = Integer.parseInt(part) + 1;
                xpathQuery.append("/*[")
                    .append(intValue)
                    .append(']');
                continue;
            } catch (NumberFormatException ignored) {}

            xpathQuery.append('/').append(part);
        }

        return new XPathQuery(xpathQuery.toString());
    }
}
