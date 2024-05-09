package pt.up.fe.els2023.dsl.external.source;

import pt.up.fe.els2023.model.source.reader.SourceReader;

public class AutoSourceParser {

    public static SourceReader parse() {
        return SourceReader.get(null);
    }

}
