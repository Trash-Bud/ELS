package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;
import pt.up.fe.els2023.model.transformation.column.RemoveColumnsTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

import java.util.List;

public final class ColumnRemoveTransformationBuilder implements TransformationBuilder {
    private final List<String> columns;

    ColumnRemoveTransformationBuilder(List<String> columns) {
        this.columns = columns;
    }

    @Override
    public TransformationApplier build() {
        return new RemoveColumnsTransformationApplier(columns);
    }
}

