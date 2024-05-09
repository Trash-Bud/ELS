package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.column.RegexRenameColumnsTransformationApplier;
import pt.up.fe.els2023.model.transformation.column.RenameColumnTransformationApplier;

@JsonTypeName("rename")
public final class CfgColumnRename implements CfgTransformation {
    @JsonProperty(required = true)
    public String from;

    @JsonProperty(required = true)
    public String to;

    public boolean regex = false;

    @Override
    public TransformationApplier intoApplier() {
        if (regex) {
            return new RegexRenameColumnsTransformationApplier(from, to);
        } else {
            return new RenameColumnTransformationApplier(from, to);
        }
    }
}
