package pt.up.fe.els2023.dsl.external.transformation.path;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.*;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class PathTransformationConverter {

    public static TransformationApplier parse(PathTransformation pathTransformation){
        var column = pathTransformation.getColumn();
        var operation = pathTransformation.getOperation();

        if (operation instanceof AppendPathTransformation appendPathTransformation){
            return AppendPathParser.parse(appendPathTransformation,column);
        } else if (operation instanceof CanonicalizePathTransformation canonicalizePathTransformation){
            return CanonicalizePathParser.parse(canonicalizePathTransformation,column);
        } else if (operation instanceof GetPathTransformation getPathTransformation){
            return GetNameFromPathParser.parse(getPathTransformation,column);
        }else{
            throw new NotImplementedException("Parsing for " + operation.eClass().getName()  + " not implemented." );
        }

    }
}
