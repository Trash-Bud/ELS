package pt.up.fe.els2023.model.source.reader;

import pt.up.fe.els2023.model.Table;

import java.io.File;
import java.io.IOException;

public class AutoReader implements SourceReader {
    @Override
    public Table read(File file) throws IOException {
        var nameSplit = file.getName().split("\\.");
        var format = nameSplit[nameSplit.length - 1];

        return SourceReader.getSpecific(format).read(file);
    }
}
