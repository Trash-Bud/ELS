package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.model.transformation.fold.FoldAverageTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class FoldAverageTransformationBuilder implements TransformationBuilder {
    private String groupBy;

    FoldAverageTransformationBuilder() {
    }

    public FoldAverageTransformationBuilder groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    @Override
    public TransformationApplier build() {
        return new FoldAverageTransformationApplier(groupBy);
    }
}
