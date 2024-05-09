package pt.up.fe.els2023.model.source.reader;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;

import pt.up.fe.els2023.model.Table;

public class CsvReader implements SourceReader {
    @Override
    public Table read(File file) throws IOException {
        var mapper = new CsvMapper();

        MappingIterator<List<String>> csvIterator = mapper
            .readerForListOf(String.class)
            .with(CsvParser.Feature.WRAP_AS_ARRAY)
            .readValues(file);

        var columns = csvIterator.nextValue();

        var table = new Table(columns);

        while (csvIterator.hasNextValue()) {
            var nextRow = csvIterator.nextValue();
            table.addRow(nextRow);
        }

        return table;
    }
}
