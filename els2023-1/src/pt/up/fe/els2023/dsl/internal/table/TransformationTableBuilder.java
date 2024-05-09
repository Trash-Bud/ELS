package pt.up.fe.els2023.dsl.internal.table;

import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;
import pt.up.fe.els2023.model.operation.TableOperation;
import pt.up.fe.els2023.model.operation.TransformationOperation;

public class TransformationTableBuilder extends TableBuilder {
    private final TransformationBuilder transformation;
    private final TableBuilder table;

    TransformationTableBuilder(TransformationBuilder transformation, TableBuilder table) {
        this.transformation = transformation;
        this.table = table;
    }

    @Override
    public TableOperation build() {
        return new TransformationOperation(transformation.build(), table.cachedBuild());
    }
}
