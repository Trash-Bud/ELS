package pt.up.fe.els2023.dsl.external.transformation.column;

import pt.up.fe.els2023.externalDsl.AddColumnTransformation;
import pt.up.fe.els2023.model.transformation.column.AddColumnTransformationApplier;

public class AddColumnParser {

    public static AddColumnTransformationApplier parse(AddColumnTransformation transformation){

        var column = transformation.getColumn();
        var value = transformation.getValue();
        if (value == null){
            value = "";
        }
        return new AddColumnTransformationApplier(column,value);


    }

}
