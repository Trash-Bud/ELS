package pt.up.fe.els2023.model.transformation.column;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class AddColumnTransformationApplier implements TransformationApplier {
    private final String column;
    private final String value;

    public AddColumnTransformationApplier(String column, String value) {
        this.column = column;
        this.value = value;
    }

    @Override
    public void apply(Table table) {
        table.addColumn(column, value);
    }
}

