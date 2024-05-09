package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.column.AddColumnTransformationApplier;

@JsonTypeName("add_column")
public final class CfgColumnAdd implements CfgTransformation {
    @JsonProperty(required = true)
    public String column;

    @JsonProperty(required = true)
    public String value;

    @Override
    public TransformationApplier intoApplier() {
        return new AddColumnTransformationApplier(column, value);
    }
}
