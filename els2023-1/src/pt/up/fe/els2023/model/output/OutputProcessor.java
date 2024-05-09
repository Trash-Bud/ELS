package pt.up.fe.els2023.model.output;

import pt.up.fe.els2023.model.operation.TableOperation;
import pt.up.fe.els2023.model.output.writer.TableWriter;

import java.io.File;
import java.io.IOException;

public class OutputProcessor {
    private final String path;
    private final TableOperation table;
    private final TableWriter writer;

    public OutputProcessor(String path, TableOperation table, TableWriter writer) {
        this.path = path;
        this.table = table;
        this.writer = writer;
    }

    public void process() throws IOException {
        this.writer.write(table.cachedIntoTable(), new File(path));
    }

    public String getPath() {
        return path;
    }
}
