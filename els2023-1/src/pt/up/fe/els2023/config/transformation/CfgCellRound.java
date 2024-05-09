package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import pt.up.fe.els2023.config.transformation.CfgTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.cell.RoundValuesTransformationApplier;

import java.util.List;

@JsonTypeName("round")
public final class CfgCellRound implements CfgTransformation {
    @JsonProperty(required = true)
    public List<String> columns;

    public int digits = 0;

    @Override
    public TransformationApplier intoApplier() {
        return new RoundValuesTransformationApplier(columns, digits);
    }
}
