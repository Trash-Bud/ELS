package pt.up.fe.els2023.model.transformation.column;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

import java.util.List;

public class SelectColumnsTransformationApplier implements TransformationApplier {
    private final List<String> columns;

    public SelectColumnsTransformationApplier(List<String> columns) {
        this.columns = columns;
    }

    @Override
    public void apply(Table table) {
        table.selectColumns(columns);
    }
}
