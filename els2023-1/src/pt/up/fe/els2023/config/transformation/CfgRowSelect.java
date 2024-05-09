package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.row.SelectRowsTransformationApplier;

@JsonTypeName("select")
public final class CfgRowSelect implements CfgTransformation {
    public int from = 0;
    @JsonProperty(required = true)
    public int amount;
    @JsonProperty("group_by")
    public String groupBy;

    @Override
    public TransformationApplier intoApplier() {
        return new SelectRowsTransformationApplier(from, amount, groupBy);
    }
}
