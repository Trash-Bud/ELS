package pt.up.fe.els2023.dsl.external.table.combination;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.model.operation.AppendOperation;
import pt.up.fe.els2023.model.operation.TableOperation;

import java.util.List;

public class AppendOperationParser {

    public static AppendOperation.Mode getType(String type) {
        return switch (type) {
            case "union" -> AppendOperation.Mode.Union;
            case "intersection" -> AppendOperation.Mode.Intersection;
            case null -> AppendOperation.Mode.Exact;
            default -> throw new NotImplementedException("Parsing for " + type + " not implemented.");
        };
    }

    public static AppendOperation parse(List<TableOperation> tables, String type) {

        return new AppendOperation(getType(type), tables);

    }

}
