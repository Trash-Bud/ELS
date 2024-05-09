package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.row.SelectRowsTransformationApplier;

public class RowSelectTransformationBuilder implements TransformationBuilder {
    private int from;
    private final int amount;
    private String groupBy;

    RowSelectTransformationBuilder(int amount) {
        this.from = 0;
        this.amount = amount;
    }

    public RowSelectTransformationBuilder skip(int amount) {
        this.from += amount;
        return this;
    }

    public RowSelectTransformationBuilder groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    @Override
    public TransformationApplier build() {
        return new SelectRowsTransformationApplier(from, amount, groupBy);
    }
}
