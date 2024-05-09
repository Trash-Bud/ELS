package pt.up.fe.els2023.dsl.external.transformation.column;

import pt.up.fe.els2023.externalDsl.RemoveColumnTransformation;
import pt.up.fe.els2023.model.transformation.column.RemoveColumnsTransformationApplier;

public class RemoveColumnParser {

    public static RemoveColumnsTransformationApplier parse(RemoveColumnTransformation transformation){

        var column = transformation.getColumn();
        return new RemoveColumnsTransformationApplier(column);


    }

}
