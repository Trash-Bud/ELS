package pt.up.fe.els2023.dsl.internal.output;

import pt.up.fe.els2023.dsl.internal.table.TableBuilder;
import pt.up.fe.els2023.model.output.writer.CsvWriter;
import pt.up.fe.els2023.model.output.writer.TableWriter;

public class CsvOutputBuilder extends OutputBuilder {
    CsvOutputBuilder(String path, TableBuilder table) {
        super(path, table);
    }

    @Override
    public TableWriter buildWriter() {
        return new CsvWriter();
    }
}
