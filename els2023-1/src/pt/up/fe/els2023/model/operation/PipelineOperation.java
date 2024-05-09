package pt.up.fe.els2023.model.operation;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.PipelineApplier;

public class PipelineOperation extends TableOperation {
    public final PipelineApplier pipeline;
    public final TableOperation table;

    public PipelineOperation(PipelineApplier pipeline, TableOperation table) {
        this.pipeline = pipeline;
        this.table = table;
    }

    @Override
    public Table intoTable() {
        var table = this.table.cachedIntoTable().clone();
        pipeline.apply(table);
        return table;
    }
}
