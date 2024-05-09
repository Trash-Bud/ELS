package pt.up.fe.els2023.dsl.external.table.transform;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.*;
import pt.up.fe.els2023.model.operation.*;

public class TransformationOperationParser {

    public static TableOperation parse(TableOperation source, TransformOperation transformOperation) {

        var operations = transformOperation.getOperation();

        TableOperation tableOperation = null;

        for (var operation : operations) {
            if (operation instanceof TransformationTableOperation transformationTableOperation) {
                tableOperation = TransformOperationParser.parse(transformationTableOperation,source);

            }else if (operation instanceof PipelineTableOperation pipelineTableOperation) {

                tableOperation = PipelineOperationParser.parse(pipelineTableOperation,source);

            }else{
                throw new NotImplementedException("Parsing " + operation.getClass().getName() + " not implemented.");
            }
        }

        if (tableOperation == null) {
            throw new RuntimeException("Transformation Operation has no transformations");
        }

        return tableOperation;

    }


}
