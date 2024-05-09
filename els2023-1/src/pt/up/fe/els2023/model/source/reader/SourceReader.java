package pt.up.fe.els2023.model.source.reader;

import pt.up.fe.els2023.model.Table;

import java.io.File;
import java.io.IOException;

public interface SourceReader {
    Table read(File file) throws IOException;

    static SourceReader get(String format) {
        return switch (format) {
            case null -> new AutoReader();
            case "auto" -> new AutoReader();
            default -> getSpecific(format);
        };
    }

    static SourceReader getSpecific(String format) {
        return switch (format) {
            case "csv" -> new CsvReader();
            case "json" -> new JsonReader();
            case "xml" -> new XmlReader();
            case "yaml", "yml" -> new YamlReader();
            default -> throw new RuntimeException("Unknown format: " + format);
        };
    }
}
