package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.fold.FoldSumTransformationApplier;

@JsonTypeName("fold_sum_row")
public final class CfgFoldSum implements CfgTransformation {

    @JsonProperty("group_by")
    public String groupBy;

    @Override
    public TransformationApplier intoApplier() {
        return new FoldSumTransformationApplier(groupBy);
    }
}

