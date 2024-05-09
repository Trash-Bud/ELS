package pt.up.fe.els2023.dsl.internal.table;

import pt.up.fe.els2023.dsl.internal.Pipeline;
import pt.up.fe.els2023.model.operation.PipelineOperation;
import pt.up.fe.els2023.model.operation.TableOperation;

public class PipelineTableBuilder extends TableBuilder {

    private final Pipeline pipeline;
    private final TableBuilder table;

    PipelineTableBuilder(Pipeline pipeline, TableBuilder table) {
        this.pipeline = pipeline;
        this.table = table;
    }

    @Override
    public TableOperation build() {
        return new PipelineOperation(pipeline.build(), table.cachedBuild());
    }
}
