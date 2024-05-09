package pt.up.fe.els2023.dsl.internal.output;

import pt.up.fe.els2023.dsl.internal.table.TableBuilder;
import pt.up.fe.els2023.model.output.OutputProcessor;
import pt.up.fe.els2023.model.output.writer.TableWriter;

public abstract class OutputBuilder {
    private final String path;
    private final TableBuilder table;

    OutputBuilder(String path, TableBuilder table) {
        this.path = path;
        this.table = table;
    }

    public abstract TableWriter buildWriter();

    public OutputProcessor build() {
        return new OutputProcessor(path, table.cachedBuild(), buildWriter());
    }
}
