package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.model.transformation.fold.FoldSumTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class FoldSumTransformationBuilder implements TransformationBuilder {
    private String groupBy;

    FoldSumTransformationBuilder() {
    }

    public FoldSumTransformationBuilder groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    @Override
    public TransformationApplier build() {
        return new FoldSumTransformationApplier(groupBy);
    }
}
