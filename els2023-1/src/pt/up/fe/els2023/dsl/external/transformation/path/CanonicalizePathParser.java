package pt.up.fe.els2023.dsl.external.transformation.path;

import pt.up.fe.els2023.externalDsl.CanonicalizePathTransformation;
import pt.up.fe.els2023.model.transformation.path.CanonicalizePathTransformationApplier;

public class CanonicalizePathParser {

    public static CanonicalizePathTransformationApplier parse(CanonicalizePathTransformation transformation, String column){
        return new CanonicalizePathTransformationApplier(column);
    }

}
