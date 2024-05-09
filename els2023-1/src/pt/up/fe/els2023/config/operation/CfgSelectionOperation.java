package pt.up.fe.els2023.config.operation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("selection")
@JsonIgnoreProperties("operation")
public final class CfgSelectionOperation implements CfgTableOperation {
    @JsonProperty(required = true)
    public String source;
}
