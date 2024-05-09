package pt.up.fe.els2023.config.transformation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import pt.up.fe.els2023.model.transformation.TransformationApplier;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "transformation")
@JsonSubTypes({@Type(CfgCellRound.class), @Type(CfgCellSetValue.class), @Type(CfgColumnAdd.class), @Type(CfgColumnRemove.class), @Type(CfgColumnRename.class), @Type(CfgColumnSelect.class), @Type(CfgFoldAverage.class), @Type(CfgFoldSum.class), @Type(CfgPathAppend.class), @Type(CfgPathCanonicalize.class), @Type(CfgPathGetName.class), @Type(CfgRowSelect.class), @Type(CfgRowSort.class)})
public sealed interface CfgTransformation permits CfgCellRound, CfgCellSetValue, CfgColumnAdd, CfgColumnRemove, CfgColumnRename, CfgColumnSelect, CfgFoldAverage, CfgFoldSum, CfgPathAppend, CfgPathCanonicalize, CfgPathGetName, CfgRowSelect, CfgRowSort {
    TransformationApplier intoApplier();
}
