package pt.up.fe.els2023.dsl.external.transformation.column;

import pt.up.fe.els2023.externalDsl.RenameColumnTransformation;
import pt.up.fe.els2023.model.transformation.TransformationApplier;
import pt.up.fe.els2023.model.transformation.column.RegexRenameColumnsTransformationApplier;
import pt.up.fe.els2023.model.transformation.column.RenameColumnTransformationApplier;

public class RenameColumnParser {

    public static TransformationApplier parse(RenameColumnTransformation transformation){

        var from = transformation.getFrom();
        var to = transformation.getTo();
        var regex = transformation.getRegex();

        if (regex != null){
            return new RegexRenameColumnsTransformationApplier(from,to);
        }else{
            return new RenameColumnTransformationApplier(from,to);
        }

    }

}
