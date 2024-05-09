package pt.up.fe.els2023.config.operation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;

@JsonTypeName("pipeline")
@JsonIgnoreProperties("operation")
public final class CfgPipelineOperation implements CfgTableOperation {
    @JsonProperty(required = true)
    public String pipeline;

    @JsonProperty(required = true)
    public JsonNode table;
}
