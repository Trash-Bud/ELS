package pt.up.fe.els2023.dsl.external.transformation.cell;

import pt.up.fe.els2023.externalDsl.SetCellsTransformation;
import pt.up.fe.els2023.model.transformation.cell.SetValueTransformationApplier;

public class SetValuesParser {

    public static SetValueTransformationApplier parse(SetCellsTransformation roundTransformation){
        var column = roundTransformation.getColumn();
        var value = roundTransformation.getValue();
        var rowNode = roundTransformation.getRow();

        if (rowNode == null){
            return new SetValueTransformationApplier(column, null,value);
        }else{
            return new SetValueTransformationApplier(column,rowNode.getRow(),value);
        }
    }


}
