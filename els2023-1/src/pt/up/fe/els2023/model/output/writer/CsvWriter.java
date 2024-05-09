package pt.up.fe.els2023.model.output.writer;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import pt.up.fe.els2023.model.Table;


public class CsvWriter implements TableWriter {
    @Override
    public void write(Table table, File file) throws IOException {
        var schema = CsvSchema.builder()
            .addColumns(table.getColumnNames(), CsvSchema.ColumnType.NUMBER_OR_STRING)
            .build()
            .withHeader();

        var mapper = new CsvMapper();
        mapper.writer()
            .with(schema)
            .writeValue(file, table.getRows());
    }
}
