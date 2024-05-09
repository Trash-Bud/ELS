package pt.up.fe.els2023.model.operation;

import pt.up.fe.els2023.model.Table;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class AppendOperation extends TableOperation {
    public enum Mode {
        Exact,
        Intersection,
        Union,
    }

    private final Mode mode;
    private final List<TableOperation> tables;

    public AppendOperation(Mode mode, List<TableOperation> tables) {
        this.mode = mode;
        this.tables = tables;
    }

    @Override
    public Table intoTable() {
        var tables = this.tables.stream().map(TableOperation::cachedIntoTable).toList();
        if (mode == Mode.Exact) {
            var col = tables.get(0).getColumnNames();
            for (var table : tables) {
                var tableCol = table.getColumnNames();
                if (!tableCol.containsAll(col) || tableCol.size() != col.size()) {
                    throw new RuntimeException("Choose the type of append you wish to use (Union or Intersection) or make sure column names match between tables.");
                }
            }
        }

        var columns = new LinkedHashSet<>(tables.getFirst().getColumnNames());
        switch (mode) {
            case Intersection -> tables.stream().skip(1).forEach(table -> columns.retainAll(table.getColumnNames()));
            case Exact, Union -> tables.stream().skip(1).forEach(table -> columns.addAll(table.getColumnNames()));
        }

        return Table.combine(new ArrayList<>(columns), tables);
    }
}
