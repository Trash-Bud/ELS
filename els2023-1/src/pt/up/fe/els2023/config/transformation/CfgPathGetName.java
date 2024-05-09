package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.path.GetNameFromPathTransformationApplier;

@JsonTypeName("get_name_from_path")
public final class CfgPathGetName implements CfgTransformation {
    @JsonProperty(required = true)
    public String column;

    @Override
    public TransformationApplier intoApplier() {
        return new GetNameFromPathTransformationApplier(column);
    }
}
