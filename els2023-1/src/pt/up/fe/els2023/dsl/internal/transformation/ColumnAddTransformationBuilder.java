package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.model.transformation.column.AddColumnTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public final class ColumnAddTransformationBuilder implements TransformationBuilder {
    private final String column;
    private String value;

    ColumnAddTransformationBuilder(String column) {
        this.column = column;
        this.value = "";
    }

    public ColumnAddTransformationBuilder value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public TransformationApplier build() {
        return new AddColumnTransformationApplier(column, value);
    }
}

