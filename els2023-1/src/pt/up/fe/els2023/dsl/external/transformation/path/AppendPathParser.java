package pt.up.fe.els2023.dsl.external.transformation.path;

import pt.up.fe.els2023.externalDsl.AppendPathTransformation;
import pt.up.fe.els2023.model.transformation.path.AppendPathTransformationApplier;

public class AppendPathParser {

    public static AppendPathTransformationApplier parse(AppendPathTransformation transformation,  String column){
        var path = transformation.getPath();

        return new AppendPathTransformationApplier(column,path);

    }

}
