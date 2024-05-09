package pt.up.fe.els2023.model.transformation.fold;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class FoldSumTransformationApplier implements TransformationApplier {
    private final String groupBy;

    public FoldSumTransformationApplier(String groupBy) {
        this.groupBy = groupBy;
    }


    @Override
    public void apply(Table table) {
        table.foldSum(groupBy);


    }
}
