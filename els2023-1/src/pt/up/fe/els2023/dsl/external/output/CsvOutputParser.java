package pt.up.fe.els2023.dsl.external.output;

import pt.up.fe.els2023.model.output.writer.CsvWriter;

public class CsvOutputParser {

    public static CsvWriter parse() {
        return new CsvWriter();
    }

}
