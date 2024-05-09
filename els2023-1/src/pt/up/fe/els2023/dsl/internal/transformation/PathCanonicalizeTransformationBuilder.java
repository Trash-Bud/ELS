package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;
import pt.up.fe.els2023.model.transformation.path.CanonicalizePathTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class PathCanonicalizeTransformationBuilder implements TransformationBuilder {
    private final String column;

    PathCanonicalizeTransformationBuilder(String column) {
        this.column = column;
    }

    @Override
    public TransformationApplier build() {
        return new CanonicalizePathTransformationApplier(column);
    }
}
