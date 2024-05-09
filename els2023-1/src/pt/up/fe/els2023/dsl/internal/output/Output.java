package pt.up.fe.els2023.dsl.internal.output;

import pt.up.fe.els2023.dsl.internal.table.TableBuilder;

public class Output {
    private Output() {}

    public static AutoOutputBuilder auto(String path, TableBuilder table) {
        return new AutoOutputBuilder(path, table);
    }

    public static CsvOutputBuilder csv(String path, TableBuilder table) {
        return new CsvOutputBuilder(path, table);
    }

    public static HtmlOutputBuilder html(String path, TableBuilder table) {
        return new HtmlOutputBuilder(path, table);
    }
}
