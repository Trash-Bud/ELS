package pt.up.fe.els2023.dsl.external.transformation.column;

import pt.up.fe.els2023.externalDsl.SelectColumnTransformation;
import pt.up.fe.els2023.model.transformation.column.SelectColumnsTransformationApplier;

public class SelectColumnParser {

    public static SelectColumnsTransformationApplier parse(SelectColumnTransformation transformation){

        var columns = transformation.getColumn();

        return new SelectColumnsTransformationApplier(columns);

    }

}
