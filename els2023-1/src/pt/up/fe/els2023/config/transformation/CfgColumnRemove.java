package pt.up.fe.els2023.config.transformation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.column.RemoveColumnsTransformationApplier;

@JsonTypeName("remove_columns")
public final class CfgColumnRemove implements CfgTransformation {
    @JsonProperty(required = true)
    public List<String> columns;

    @Override
    public TransformationApplier intoApplier() {
        return new RemoveColumnsTransformationApplier(columns);
    }
}

