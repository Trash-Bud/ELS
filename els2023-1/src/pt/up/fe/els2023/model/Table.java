package pt.up.fe.els2023.model;

import org.apache.commons.math3.util.Precision;

import java.util.*;

public class Table implements Cloneable {
    private List<String> columnNames;
    private List<List<String>> rows = new ArrayList<>();

    public Table(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    private Table(List<String> columnNames, List<List<String>> rows) {
        this.columnNames = columnNames;
        this.rows = rows;
    }

    public void addColumn(String name, String defaultValue) {
        if (columnNames.contains(name)) {
            return;
        }

        columnNames.add(name);
        for (var row : rows) {
            row.add(defaultValue);
        }
    }

    public void foldAverage(String groupBy){
        var newRows = new ArrayList<List<String>>();

        var groupByList = getGroupByList(groupBy);

        for(var group:groupByList){
            List<String> newRow = new ArrayList<>();
            for (var i = 0; i < getColumnNames().size(); i++){
                if (getColumnNames().get(i).equals(groupBy)){
                    newRow.add(group.get(0).get(i));
                    continue;
                }
                var failed = false;
                double sum = 0;
                for (var row: group){
                    try{
                        var num = Double.parseDouble(row.get(i));
                        sum += num;
                    }
                    catch (NumberFormatException e){
                        newRow.add("");
                        failed = true;
                        break;
                    }
                }
                if (!failed){
                    var avg = sum / (double)group.size();
                    newRow.add(Double.toString(avg));
                }
            }
            newRows.add(newRow);
        }

        rows = newRows;

    }

    public void foldSum(String groupBy){
        var newRows = new ArrayList<List<String>>();

        var groupByList = getGroupByList(groupBy);

        for(var group:groupByList){
            List<String> newRow = new ArrayList<>();
            for (var i = 0; i < getColumnNames().size(); i++){
                if (getColumnNames().get(i).equals(groupBy)){
                    newRow.add(group.get(0).get(i));
                    continue;
                }
                var failed = false;
                double sum = 0;
                for (var row: group){
                    try{
                        var num = Double.parseDouble(row.get(i));
                        sum += num;
                    }
                    catch (NumberFormatException e){
                        newRow.add("");
                        failed = true;
                        break;
                    }
                }
                if (!failed){
                    newRow.add(Double.toString(sum));
                }
            }
            newRows.add(newRow);
        }

        rows = newRows;
    }

    public void addRow(List<String> row) {
        assert row.size() == columnNames.size();
        rows.add(row);
    }

    public void renameColumn(String from, String to) {
        var index = columnNames.indexOf(from);
        if (index < 0) {
            return;
        }

        columnNames.set(index, to);
    }

    public void renameColumns(String regex, String replacement) {
        var strictRegex = "^" + regex + "$";
        columnNames = columnNames.stream().map(s -> s.replaceAll(strictRegex, replacement)).toList();
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    public void removeColumn(String column){
        int index = columnNames.indexOf(column);
        if (index == -1) {
            return;
        }

        columnNames.remove(index);
        for (var row: rows) {
            row.remove(index);
        }
    }


    public void selectColumns(List<String> columns){
        Table newTable = combine(columns, List.of(this));
        columnNames = newTable.getColumnNames();
        rows = newTable.getRows();
    }

    private List<List<List<String>>> getGroupByList(String groupBy) {
        if (groupBy == null) {
            var list = new ArrayList<List<List<String>>>();
            list.add(rows);
            return list;
        }

        int groupByIndex = columnNames.indexOf(groupBy);
        if (groupByIndex == -1){
            throw new RuntimeException("Column " + groupBy + " doesn't exist. You need to group by an existing column.");
        }

        Map<String, List<List<String>>> map = new HashMap<>();
        for (var row: rows){
            var list = map.getOrDefault(row.get(groupByIndex), null);
            if (list == null){
                list = new ArrayList<>();
            }

            list.add(row);
            map.put(row.get(groupByIndex), list);
        }

        return map.values().stream().toList();
    }

    public void selectRows(int start, int length, String groupBy) {
        var groupByList = getGroupByList(groupBy);

        List<List<String>> newRows = new ArrayList<>();
        for (var groupOfRows: groupByList) {
            newRows.addAll(groupOfRows.subList(start, start + length));
        }

        newRows.sort(Comparator.comparingInt(rows::indexOf));

        rows = newRows;
    }

    public void roundValues(int digits, String column) {
        int index = columnNames.indexOf(column);
        if (index == -1){
            throw new RuntimeException("Column " + column + " doesn't exist.");
        }

        for (var row: rows) {
            double value;
            try {
                value = Double.parseDouble(row.get(index));
            } catch (NumberFormatException nfe) {
                continue;
            }

            value = Precision.round(value, digits);
            row.set(index, String.valueOf(value));
        }
    }

    public void setValue(String column, Integer rowIdx, String value) {
        if (rowIdx == null) {
            for (var row: rows) {
                innerSetValue(column, row, value);
            }
        } else {
            // With this, we can use negative indexes to count from the last row, for example.
            var indexNormalized = (((rowIdx % rows.size()) + rows.size()) % rows.size());
            var row = rows.get(indexNormalized);
            innerSetValue(column, row, value);
        }
    }

    private void innerSetValue(String column, List<String> row, String value) {
        if (column == null) {
            row.replaceAll(ignored -> value);
        } else {
            row.set(columnNames.indexOf(column), value);
        }
    }

    public interface FoldOperation {
        List<String> apply(List<List<String>> rows, int index);
    }

    public void fold(String column, String groupBy, FoldOperation op){
        int index = columnNames.indexOf(column);
        if (index == -1){
            throw new RuntimeException("Column " + column + " doesn't exist.");
        }

        var groupByList = getGroupByList(groupBy);

        List<List<String>> newRows = new ArrayList<>();
        for (var groupOfRows: groupByList){
            newRows.add(op.apply(groupOfRows, index));
        }

        newRows.sort(Comparator.comparingInt(rows::indexOf));

        rows = newRows;
    }

    public boolean isNumeric(String column) {
        var idx = columnNames.indexOf(column);
        for (var row: rows){
            try {
                Double.parseDouble(row.get(idx));
            } catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }

    private static int compareRows(List<Integer> columns, List<Type> types, List<String> row1, List<String> row2, boolean ascending) {
        for (int i = 0; i < columns.size(); i++) {
            var column = columns.get(i);
            var el1 = ascending? row1.get(column) : row2.get(column);
            var el2 = ascending? row2.get(column) : row1.get(column);
            var type = types.get(i);

            var comparison = switch (type) {
                case Text -> el1.compareTo(el2);
                case Numeric -> Double.compare(Double.parseDouble(el1), Double.parseDouble(el2));
            };

            if (comparison == 0) {
                continue;
            }
            return comparison;
        }
        return 0;
    }

    enum Type {
        Text,
        Numeric,
    }

    public void sortRows(List<String> onColumns, boolean ascending) {
        List<Integer> columnIndexes = new ArrayList<>();
        List<Type> columnTypes = new ArrayList<>();
        for (String column: onColumns) {
            int index = columnNames.indexOf(column);
            if (index == -1) {
                throw new RuntimeException("Column " + column + " doesn't exist.");
            }
            columnIndexes.add(index);

            if (isNumeric(column)) {
                columnTypes.add(Type.Numeric);
            } else {
                columnTypes.add(Type.Text);
            }
        }

        rows.sort((row1, row2) -> compareRows(columnIndexes, columnTypes, row1, row2, ascending));
    }

    public static Table combine(List<String> columns, List<Table> tables) {
        if (columns == null) {
            var columnSet = new LinkedHashSet<String>();
            for (var table: tables) {
                columnSet.addAll(table.getColumnNames());
            }
            columns = new ArrayList<>(columnSet);
        }

        var newTable = new Table(columns);
        var columnCount = newTable.getColumnNames().size();
        for (var table : tables) {
            var indexMapping = new int[columnCount];
            for (int i = 0; i < columnCount; i++) {
                indexMapping[i] = table.getColumnNames().indexOf(newTable.getColumnNames().get(i));
            }

            for (var row : table.getRows()) {
                List<String> newRow = new ArrayList<>(columnCount);
                for (var i : indexMapping) {
                    if (i >= 0) {
                        newRow.add(row.get(i));
                    } else {
                        newRow.add("");
                    }
                }
                newTable.addRow(newRow);
            }
        }

        return newTable;
    }

    public static Table combine(List<Table> tables) {
        return combine(null, tables);
    }

    @Override
    public Table clone() {
        List<List<String>> clonedRows = new ArrayList<>();
        rows.forEach(row -> clonedRows.add(new ArrayList<>(row)));
        return new Table(new ArrayList<>(columnNames), clonedRows);
    }
}
