package pt.up.fe.els2023.model.transformation.cell;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class SetValueTransformationApplier implements TransformationApplier {
    private final String column;
    private final Integer row;
    private final String value;

    public SetValueTransformationApplier(String column, Integer row, String value) {
        this.column = column;
        this.row = row;
        this.value = value;
    }

    @Override
    public void apply(Table table) {
        table.setValue(column, row, value);
    }
}
