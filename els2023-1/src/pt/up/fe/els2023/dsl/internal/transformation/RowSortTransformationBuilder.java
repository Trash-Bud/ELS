package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.row.SortRowsTransformationApplier;

import java.util.List;

public class RowSortTransformationBuilder implements TransformationBuilder {
    private final List<String> onColumns;
    private boolean ascending;

    RowSortTransformationBuilder(List<String> onColumns) {
        this.onColumns = onColumns;
        this.ascending = true;
    }

    public RowSortTransformationBuilder ascending() {
        this.ascending = true;
        return this;
    }

    public RowSortTransformationBuilder descending() {
        this.ascending = false;
        return this;
    }

    @Override
    public TransformationApplier build() {
        return new SortRowsTransformationApplier(onColumns, ascending);
    }
}
