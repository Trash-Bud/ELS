package pt.up.fe.els2023.dsl.external.transformation.cell;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.*;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class CellTransformationParser {

    public static TransformationApplier parse(CellTransformation cellTransformation){

        if (cellTransformation instanceof RoundCellsTransformation roundTransformation){
            return RoundValuesParser.parse(roundTransformation);
        }else if(cellTransformation instanceof SetCellsTransformation setCellsTransformation){
            return SetValuesParser.parse(setCellsTransformation);
        }
        else{
            throw new NotImplementedException("Parsing for " + cellTransformation.eClass().getName() + " not implemented." );
        }

    }

}
