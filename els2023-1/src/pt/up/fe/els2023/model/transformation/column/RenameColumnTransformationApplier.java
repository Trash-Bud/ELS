package pt.up.fe.els2023.model.transformation.column;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class RenameColumnTransformationApplier implements TransformationApplier {
    private final String from;
    private final String to;

    public RenameColumnTransformationApplier(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void apply(Table table) {
        table.renameColumn(from, to);
    }
}
