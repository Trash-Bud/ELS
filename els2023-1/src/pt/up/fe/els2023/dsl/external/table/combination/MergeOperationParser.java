package pt.up.fe.els2023.dsl.external.table.combination;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.model.operation.MergeOperation;
import pt.up.fe.els2023.model.operation.TableOperation;

import java.util.List;

public class MergeOperationParser {

    public static MergeOperation.Mode getType(String type) {
        return switch (type) {
            case "union" -> MergeOperation.Mode.Union;
            case "intersection" -> MergeOperation.Mode.Intersection;
            case null -> MergeOperation.Mode.Exact;
            default -> throw new NotImplementedException("Parsing for " + type + " not implemented.");
        };
    }

    public static MergeOperation parse(List<TableOperation> tables, String type) {

        return new MergeOperation(tables, getType(type));

    }
}
