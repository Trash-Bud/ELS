package pt.up.fe.els2023.dsl.internal.table;

import pt.up.fe.els2023.model.operation.AppendOperation;
import pt.up.fe.els2023.model.operation.MergeOperation;
import pt.up.fe.els2023.model.operation.TableOperation;

import java.util.List;

public class MergeTableBuilder extends TableBuilder {
    private final List<TableBuilder> tables;
    private MergeOperation.Mode mode;

    MergeTableBuilder(List<TableBuilder> tables) {
        this.mode = MergeOperation.Mode.Exact;
        this.tables = tables;
    }

    public MergeTableBuilder intersection() {
        mode = MergeOperation.Mode.Intersection;
        return this;
    }

    public MergeTableBuilder union() {
        mode = MergeOperation.Mode.Union;
        return this;
    }

    @Override
    public TableOperation build() {
        return new MergeOperation(tables.stream().map(TableBuilder::cachedBuild).toList(),mode);
    }
}
