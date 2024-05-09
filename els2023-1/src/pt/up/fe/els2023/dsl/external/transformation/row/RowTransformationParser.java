package pt.up.fe.els2023.dsl.external.transformation.row;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.*;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class RowTransformationParser {

    public static  TransformationApplier parse(RowTransformation rowTransformation){

        if (rowTransformation instanceof SortRowsTransformation sortTransformation){
            return SortRowParser.parse(sortTransformation);
        }else if (rowTransformation instanceof SelectRowsTransformation selectTransformation){
            return SelectRowParser.parse(selectTransformation);
        }else{
            throw new NotImplementedException("Parsing for " + rowTransformation.eClass().getName() + " not implemented." );
        }

    }

}
