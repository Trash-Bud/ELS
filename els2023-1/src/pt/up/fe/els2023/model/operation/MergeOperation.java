package pt.up.fe.els2023.model.operation;

import pt.up.fe.els2023.model.Table;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class MergeOperation extends TableOperation {

    public enum Mode {
        Exact,
        Intersection,
        Union,
    }

    public Mode mode;

    public List<TableOperation> tables;

    public MergeOperation(List<TableOperation> tables, Mode mode) {
        this.mode = mode;
        this.tables = tables;
    }


    private List<String> findKeyColumns(Table table1, Table table2){
        return table1.getColumnNames().stream().filter(table2.getColumnNames()::contains).toList();
    }

    private boolean keysMatch(Table table1, Table table2, List<String> row1, List<String> row2, List<String> coincidingColumns){

        for(var column : coincidingColumns){
            var t1Index = table1.getColumnNames().indexOf(column);
            var t2Index = table2.getColumnNames().indexOf(column);

            if (!row1.get(t1Index).equals(row2.get(t2Index))) {
                return false;
            }
        }
        return true;
    }

    private Table mergeTwoTables(Table table1, Table table2){
        var columns = new LinkedHashSet<>(table1.getColumnNames());
        columns.addAll(table2.getColumnNames());
        var coincidingColumns = findKeyColumns(table1,table2);
        var addedRowsTable2 = new ArrayList<Integer>();

        Table newTable = new Table(new ArrayList<>(columns));

        for (var row: table1.getRows()){
            boolean found = false;
            int row2Index = 0;
            for(var rowTable2: table2.getRows()){

                // If table1 and 2 have all the keys matching
                if(keysMatch(table1,table2,row,rowTable2,coincidingColumns) && !addedRowsTable2.contains(row2Index)){
                    addedRowsTable2.add(row2Index);

                    // add row of table1 since columns follow that order
                    var newRow = new ArrayList<>(row);

                    // making row the proper size
                    while(newRow.size() != columns.size()){
                        newRow.add("");
                    }

                    // and then add the rest of the data from the table 2 row
                    for (int i = 0; i < rowTable2.size(); i++){
                        // only add if the columns don't coincide
                        if (!coincidingColumns.contains(table2.getColumnNames().get(i))){
                            // getting indexes properly so values are placed correctly
                            var index = newTable.getColumnNames().indexOf(table2.getColumnNames().get(i));
                            newRow.set(index,rowTable2.get(i));
                        }
                    }
                    if(mode == Mode.Intersection){
                        if (!newRow.contains("")){
                            newTable.addRow(newRow);
                        }
                    }else{
                        newTable.addRow(newRow);
                    }
                    found = true;
                    break;
                }
                row2Index ++;
            }
            if (!found){
                // otherwise, just add the row
                var newRow = new ArrayList<>(row);
                // adding nulls to fix array size
                while(newRow.size() != columns.size()){
                    newRow.add("");
                }
                if(mode == Mode.Intersection){
                    if (!newRow.contains("")){
                        newTable.addRow(newRow);
                    }
                }else {
                    newTable.addRow(newRow);
                }
            }

        }

        int indexTable2 = 0;
        // now add table 2 rows without match
        for (var rowTable2: table2.getRows()){
            boolean found = false;
            for(var row: table1.getRows()){
                if(keysMatch(table1,table2,row,rowTable2,coincidingColumns) && addedRowsTable2.contains(indexTable2)){
                    found = true;
                    break;
                }

            }
            if (!found ) {
                var newRow = new ArrayList<String>();
                // making row the proper size
                while(newRow.size() != columns.size()){
                    newRow.add("");
                }
                // adding elements from table2
                for (int i = 0; i < rowTable2.size(); i++){
                    var index = newTable.getColumnNames().indexOf(table2.getColumnNames().get(i));
                    newRow.set(index,rowTable2.get(i));
                }
                if(mode == Mode.Intersection){
                    if (!newRow.contains("")){
                        newTable.addRow(newRow);
                    }
                }else {
                    //adding row
                    newTable.addRow(newRow);
                }
                addedRowsTable2.add(indexTable2);
            }

            indexTable2++;

        }

        return newTable;
    }

    @Override
    public Table intoTable() {
        var tables = this.tables.stream().map(TableOperation::cachedIntoTable).toList();

        if (tables.size() == 1 ){
            return tables.get(0);
        }
        if(tables.isEmpty()){
            // Is it supposed to return an empty table?
            return new Table(new ArrayList<>());
        }

        if (mode == MergeOperation.Mode.Exact) {
            for (var i = 0; i < tables.size()-1; i++){
                for (var j = i+1; j < tables.size(); j++){
                    var table1 = tables.get(i);
                    var table2 = tables.get(j);
                    if (table1.getRows().size() != table2.getRows().size()){
                        throw new RuntimeException("Choose the type of merge you wish to use (Union or Intersection) or make sure all tables have the same amount of rows.");
                    }
                    var repeatedCols = findKeyColumns(table1,table2);
                    if (!repeatedCols.isEmpty()){
                        for (var row1: table1.getRows()){
                            var found = false;
                            for (var row2: table2.getRows()){
                                if (keysMatch(table1,table2,row1,row2,repeatedCols)){
                                    found = true;
                                    break;
                                }
                            }
                            if (!found){
                                throw new RuntimeException("Choose the type of merge you wish to use (Union or Intersection) or make sure columns have distinct names between tables.");
                            }

                        }
                    }

                }
            }
        }

        var mergeTable = tables.get(0);

        for (var i = 1; i < tables.size();i++){
            mergeTable = mergeTwoTables(mergeTable,tables.get(i));
        }

        return mergeTable;
    }
}
