package pt.up.fe.els2023.model.output.writer;

import pt.up.fe.els2023.model.Table;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class AutoWriter implements TableWriter {
    public void write(Table table, File file) throws IOException {
        var nameSplit = file.getName().split("\\.");
        var format = nameSplit[nameSplit.length - 1];

        TableWriter.getSpecific(format).write(table, file);
    }
}
