package pt.up.fe.els2023.model.transformation.row;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class SelectRowsTransformationApplier implements TransformationApplier {
    private final int start;
    private final int length;
    private final String groupBy;

    public SelectRowsTransformationApplier(int start, int length, String groupBy) {
        this.start = start;
        this.length = length;
        this.groupBy = groupBy;
    }

    @Override
    public void apply(Table table) {
        table.selectRows(start, length, groupBy);
    }
}
