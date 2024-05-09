package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.cell.SetValueTransformationApplier;

public class CellSetValueTransformationBuilder implements TransformationBuilder {
    private String column;
    private Integer row;
    private final String value;

    CellSetValueTransformationBuilder(String value) {
        this.value = value;
        this.column = null;
        this.row = null;
    }

    public CellSetValueTransformationBuilder atColumn(String column) {
        this.column = column;
        return this;
    }

    public CellSetValueTransformationBuilder atRow(int index) {
        this.row = index;
        return this;
    }

    @Override
    public TransformationApplier build() {
        return new SetValueTransformationApplier(column, row, value);
    }
}
