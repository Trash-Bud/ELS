package pt.up.fe.els2023.model.output.writer;

import java.io.File;
import java.io.IOException;

import pt.up.fe.els2023.model.Table;

public interface TableWriter {
    void write(Table table, File file) throws IOException;

    static TableWriter get(String format) {
        return switch (format) {
            case null -> new AutoWriter();
            case "auto" -> new AutoWriter();
            default -> getSpecific(format);
        };
    }

    static TableWriter getSpecific(String format) {
        return switch (format) {
            case "csv" -> new CsvWriter();
            case "html" -> new HtmlWriter();
            default -> throw new RuntimeException("Unknown format: " + format);
        };
    }
}
