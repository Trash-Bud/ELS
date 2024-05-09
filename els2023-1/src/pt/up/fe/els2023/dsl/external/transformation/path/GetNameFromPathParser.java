package pt.up.fe.els2023.dsl.external.transformation.path;

import pt.up.fe.els2023.externalDsl.GetPathTransformation;
import pt.up.fe.els2023.model.transformation.path.GetNameFromPathTransformationApplier;

public class GetNameFromPathParser {

    public static GetNameFromPathTransformationApplier parse(GetPathTransformation transformation, String column){

        return new GetNameFromPathTransformationApplier(column);

    }

}
