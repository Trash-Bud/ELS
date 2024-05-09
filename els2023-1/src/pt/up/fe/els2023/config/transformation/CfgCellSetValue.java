package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.cell.SetValueTransformationApplier;

@JsonTypeName("set_value")
public final class CfgCellSetValue implements CfgTransformation {
    public String column = null;
    public Integer row = null;
    @JsonProperty(required = true)
    public String value;

    @Override
    public TransformationApplier intoApplier() {
        return new SetValueTransformationApplier(column, row, value);
    }
}
