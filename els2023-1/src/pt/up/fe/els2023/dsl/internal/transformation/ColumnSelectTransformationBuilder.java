package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;
import pt.up.fe.els2023.model.transformation.column.SelectColumnsTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

import java.util.List;

public final class ColumnSelectTransformationBuilder implements TransformationBuilder {
    private final List<String> columns;

    ColumnSelectTransformationBuilder(List<String> columns) {
        this.columns = columns;
    }

    @Override
    public TransformationApplier build() {
        return new SelectColumnsTransformationApplier(columns);
    }
}
