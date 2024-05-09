package pt.up.fe.els2023.config.operation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;


@JsonTypeName("append")
@JsonIgnoreProperties("operation")
public final class CfgAppendOperation implements CfgTableOperation {
    public enum Mode {
        @JsonProperty("intersection")
        Intersection,
        @JsonProperty("union")
        Union,
    }

    public Mode mode;

    @JsonProperty(required = true)
    public List<JsonNode> tables;
}
