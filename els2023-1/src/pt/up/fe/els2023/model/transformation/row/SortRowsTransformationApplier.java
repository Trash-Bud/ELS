package pt.up.fe.els2023.model.transformation.row;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

import java.util.List;

public class SortRowsTransformationApplier implements TransformationApplier {
    private final List<String> onColumns;
    private final boolean ascending;

    public SortRowsTransformationApplier(List<String> onColumns, boolean ascending) {
        this.onColumns = onColumns;
        this.ascending = ascending;
    }

    @Override
    public void apply(Table table) {
        table.sortRows(onColumns, ascending);
    }
}
