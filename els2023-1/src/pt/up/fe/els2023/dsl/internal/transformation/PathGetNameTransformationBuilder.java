package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;
import pt.up.fe.els2023.model.transformation.path.GetNameFromPathTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class PathGetNameTransformationBuilder implements TransformationBuilder {
    private final String column;

    PathGetNameTransformationBuilder(String column) {
        this.column = column;
    }

    @Override
    public TransformationApplier build() {
        return new GetNameFromPathTransformationApplier(column);
    }
}
