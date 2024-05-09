package pt.up.fe.els2023.dsl.external.transformation.cell;

import pt.up.fe.els2023.externalDsl.RoundCellsTransformation;
import pt.up.fe.els2023.model.transformation.cell.RoundValuesTransformationApplier;

public class RoundValuesParser {

    public static RoundValuesTransformationApplier parse(RoundCellsTransformation roundTransformation){
        var columns = roundTransformation.getColumns();
        var digits = roundTransformation.getDigits();

        return new RoundValuesTransformationApplier(columns,digits);

    }


}
