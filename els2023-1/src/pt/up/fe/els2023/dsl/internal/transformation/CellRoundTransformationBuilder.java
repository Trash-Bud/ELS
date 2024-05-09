package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.cell.RoundValuesTransformationApplier;

import java.util.List;

public class CellRoundTransformationBuilder implements TransformationBuilder {
    private final List<String> columns;
    private int digits;

    CellRoundTransformationBuilder(List<String> columns) {
        this.columns = columns;
        this.digits = 0;
    }

    public CellRoundTransformationBuilder digits(int digits) {
        this.digits = digits;
        return this;
    }

    @Override
    public TransformationApplier build() {
        return new RoundValuesTransformationApplier(columns, digits);
    }
}
