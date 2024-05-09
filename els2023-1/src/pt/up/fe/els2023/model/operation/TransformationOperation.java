package pt.up.fe.els2023.model.operation;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class TransformationOperation extends TableOperation {
    private final TransformationApplier transformation;
    private final TableOperation table;

    public TransformationOperation(TransformationApplier transformation, TableOperation table) {
        this.transformation = transformation;
        this.table = table;
    }

    @Override
    public Table intoTable() {
        var table = this.table.cachedIntoTable().clone();
        transformation.apply(table);
        return table;
    }
}
