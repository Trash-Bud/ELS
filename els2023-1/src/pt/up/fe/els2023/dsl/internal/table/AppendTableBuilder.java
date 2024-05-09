package pt.up.fe.els2023.dsl.internal.table;

import pt.up.fe.els2023.model.operation.AppendOperation;
import pt.up.fe.els2023.model.operation.TableOperation;

import java.util.List;

public class AppendTableBuilder extends TableBuilder {
    private final List<TableBuilder> tables;
    private AppendOperation.Mode mode;

    AppendTableBuilder(List<TableBuilder> tables) {
        this.tables = tables;
        this.mode = AppendOperation.Mode.Exact;
    }

    public AppendTableBuilder intersection() {
        mode = AppendOperation.Mode.Intersection;
        return this;
    }

    public AppendTableBuilder union() {
        mode = AppendOperation.Mode.Union;
        return this;
    }

    @Override
    public TableOperation build() {
        return new AppendOperation(mode, tables.stream().map(TableBuilder::cachedBuild).toList());
    }
}
