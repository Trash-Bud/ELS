package pt.up.fe.els2023.config.operation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "operation")
@JsonSubTypes({@Type(CfgSelectionOperation.class), @Type(CfgPipelineOperation.class), @Type(CfgTransformationOperation.class), @Type(CfgAppendOperation.class), @Type(CfgMergeOperation.class)})
public sealed interface CfgTableOperation permits CfgAppendOperation, CfgMergeOperation, CfgPipelineOperation, CfgSelectionOperation, CfgTransformationOperation {}
