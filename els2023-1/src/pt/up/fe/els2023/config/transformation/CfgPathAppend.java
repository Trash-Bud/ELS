package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.path.AppendPathTransformationApplier;

@JsonTypeName("append_path")
public final class CfgPathAppend implements CfgTransformation {
    @JsonProperty(required = true)
    public String column;

    @JsonProperty(required = true)
    public String value;

    @Override
    public TransformationApplier intoApplier() {
        return new AppendPathTransformationApplier(column, value);
    }
}
