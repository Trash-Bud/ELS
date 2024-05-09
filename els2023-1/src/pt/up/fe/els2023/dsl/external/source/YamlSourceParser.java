package pt.up.fe.els2023.dsl.external.source;

import pt.up.fe.els2023.model.source.reader.YamlReader;
import pt.up.fe.els2023.model.source.reader.query.Query;

public class YamlSourceParser {

    public static YamlReader parse(String queryString) {
        var query = new Query(queryString);
        return new YamlReader(query);
    }

}
