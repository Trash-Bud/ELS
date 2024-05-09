package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;
import pt.up.fe.els2023.model.transformation.path.AppendPathTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class PathAppendTransformationBuilder implements TransformationBuilder {
    private final String column;
    private final String value;

    PathAppendTransformationBuilder(String column, String value) {
        this.column = column;
        this.value = value;
    }

    @Override
    public TransformationApplier build() {
        return new AppendPathTransformationApplier(column, value);
    }
}
