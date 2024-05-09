package pt.up.fe.els2023.dsl.external;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.dsl.external.table.SourceSelectionParser;
import pt.up.fe.els2023.dsl.external.table.combination.CombinationOperationParser;
import pt.up.fe.els2023.dsl.external.table.transform.TransformationOperationParser;
import pt.up.fe.els2023.externalDsl.CombinationOperations;
import pt.up.fe.els2023.externalDsl.SourceOperation;
import pt.up.fe.els2023.externalDsl.Table;
import pt.up.fe.els2023.model.operation.TableOperation;

public class TableParser {

    public static TableOperation parse(Table table) {

        var operation = table.getOperation();
        var transformations = table.getTransformations();

        TableOperation tableOp;

        if (operation instanceof CombinationOperations combinationOperations) {
            tableOp = CombinationOperationParser.parse(combinationOperations);
        } else if (operation instanceof SourceOperation sourceOperation) {
            tableOp =  SourceSelectionParser.parse(sourceOperation);
        } else {
            throw new NotImplementedException("Parsing " + table.getClass().getName() + " not implemented.");
        }


        if (transformations != null){
            for(var transformation: transformations){
                tableOp = TransformationOperationParser.parse(tableOp, transformation);
            }
        }

        return tableOp;
    }
}
