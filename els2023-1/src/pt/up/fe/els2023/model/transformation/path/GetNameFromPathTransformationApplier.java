package pt.up.fe.els2023.model.transformation.path;

import java.nio.file.Path;

public class GetNameFromPathTransformationApplier extends PathTransformationApplier {
    public GetNameFromPathTransformationApplier(String column) {
        this.column = column;
    }

    @Override
    Path transformPath(Path path) {
        return path.getFileName();
    }
}
