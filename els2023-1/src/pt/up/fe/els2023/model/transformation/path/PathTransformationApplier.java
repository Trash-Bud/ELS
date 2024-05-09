package pt.up.fe.els2023.model.transformation.path;

import java.nio.file.Path;
import java.nio.file.Paths;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;


abstract class PathTransformationApplier implements TransformationApplier {
    String column;

    abstract Path transformPath(Path path);

    @Override
    public void apply(Table table) {
        var columnIndex = table.getColumnNames().indexOf(column);
        for (var row : table.getRows()) {
            var path = Paths.get(row.get(columnIndex));
            var newPath = transformPath(path);
            row.set(columnIndex, newPath.toString());
        }
    }
}
