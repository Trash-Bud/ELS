package pt.up.fe.els2023.model.transformation.cell;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

import java.util.List;

public class RoundValuesTransformationApplier implements TransformationApplier {
    private final List<String> columns;
    private final int digits;

    public RoundValuesTransformationApplier(List<String> columns, int digits) {

        this.columns = columns;
        this.digits = digits;
    }

    @Override
    public void apply(Table table) {
        for (var column: columns) {
            table.roundValues(digits, column);
        }
    }
}
