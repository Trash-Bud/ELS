package pt.up.fe.els2023.dsl.external.table.transform;

import pt.up.fe.els2023.externalDsl.TransformationTableOperation;
import pt.up.fe.els2023.dsl.external.transformation.TransformationParser;
import pt.up.fe.els2023.model.operation.TableOperation;
import pt.up.fe.els2023.model.operation.TransformationOperation;

public class TransformOperationParser {


    public static TransformationOperation parse(TransformationTableOperation transformationTableOperation, TableOperation source) {

        var transformation = transformationTableOperation.getTransformation();
        var tableOp = TransformationParser.parse(transformation);

        return new TransformationOperation(tableOp, source);
    }

}
