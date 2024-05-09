package pt.up.fe.els2023.model.transformation.path;

import java.nio.file.Path;

public class AppendPathTransformationApplier extends PathTransformationApplier {
    String value;

    public AppendPathTransformationApplier(String column, String value) {
        this.column = column;
        this.value = value;
    }

    @Override
    Path transformPath(Path path) {
        return path.resolve(value);
    }
}
