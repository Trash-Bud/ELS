package pt.up.fe.els2023.config.operation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;


@JsonTypeName("merge")
@JsonIgnoreProperties("operation")
public final class CfgMergeOperation implements CfgTableOperation {

    public enum Mode {
        @JsonProperty("intersection")
        Intersection,
        @JsonProperty("union")
        Union,
    }

    @JsonProperty(required = true)
    public List<JsonNode> tables;
    public Mode mode;
}
