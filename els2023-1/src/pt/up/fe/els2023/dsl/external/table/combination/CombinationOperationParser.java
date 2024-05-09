package pt.up.fe.els2023.dsl.external.table.combination;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.dsl.external.TableParser;
import pt.up.fe.els2023.externalDsl.CombinationOperations;
import pt.up.fe.els2023.externalDsl.Table;
import pt.up.fe.els2023.model.operation.TableOperation;

import java.util.ArrayList;
import java.util.List;


public class CombinationOperationParser {

    public static List<TableOperation> getOperations(List<Table> tableOperations) {
        List<TableOperation> tables = new ArrayList<>();
        for (var tableOp : tableOperations) {
            var parsedTableOp = TableParser.parse(tableOp);
            tables.add(parsedTableOp);
        }

        return tables;
    }


    public static TableOperation parse(CombinationOperations combinationOperation) {

        var operation = combinationOperation.getOperation();
        var type = combinationOperation.getType();

        var tableOperations = combinationOperation.getTableOperation();

        List<TableOperation> tables = getOperations(tableOperations);

        switch (operation) {
            case "merge" -> {
                return MergeOperationParser.parse(tables, type);
            }
            case "append" -> {
                return AppendOperationParser.parse(tables, type);
            }
            default -> throw new NotImplementedException("Parsing " + operation + " not implemented.");
        }


    }

}
