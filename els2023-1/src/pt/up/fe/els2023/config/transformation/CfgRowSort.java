package pt.up.fe.els2023.config.transformation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.row.SortRowsTransformationApplier;

@JsonTypeName("sort")
public final class CfgRowSort implements CfgTransformation {
    @JsonProperty(value = "on_columns", required = true)
    public List<String> onColumns;
    public boolean ascending = true;

    @Override
    public TransformationApplier intoApplier() {
        return new SortRowsTransformationApplier(onColumns, ascending);
    }
}
