package pt.up.fe.els2023.dsl.external.transformation.column;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.*;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class ColumnTransformationParser {

    public static TransformationApplier parse(ColumnTransformation columnTransformation){



        if (columnTransformation instanceof AddColumnTransformation addColumnTransformation){
            return AddColumnParser.parse(addColumnTransformation);
        }else if (columnTransformation instanceof RenameColumnTransformation renameColumnTransformation){
            return RenameColumnParser.parse(renameColumnTransformation);
        }else if (columnTransformation instanceof RemoveColumnTransformation removeColumnTransformation){
            return RemoveColumnParser.parse(removeColumnTransformation);
        } else if(columnTransformation instanceof SelectColumnTransformation selectColumnTransformation ){
            return SelectColumnParser.parse(selectColumnTransformation);
        }
        else{
            throw new NotImplementedException("Parsing for " + columnTransformation.eClass().getName()  + " not implemented." );
        }


    }
}
