package pt.up.fe.els2023.config.operation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;

import pt.up.fe.els2023.config.transformation.CfgTransformation;

@JsonTypeName("transformation")
@JsonIgnoreProperties("operation")
public final class CfgTransformationOperation implements CfgTableOperation {
    @JsonProperty(required = true)
    public CfgTransformation transformation;

    @JsonProperty(required = true)
    public JsonNode table;
}
