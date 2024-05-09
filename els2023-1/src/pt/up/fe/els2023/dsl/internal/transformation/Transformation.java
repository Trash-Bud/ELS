package pt.up.fe.els2023.dsl.internal.transformation;

import java.util.Arrays;
import java.util.List;

public class Transformation {
    private Transformation() {}

    public static ColumnAddTransformationBuilder addColumn(String column) {
        return new ColumnAddTransformationBuilder(column);
    }

    public static PathAppendTransformationBuilder appendPath(String column, String value) {
        return new PathAppendTransformationBuilder(column, value);
    }

    public static PathCanonicalizeTransformationBuilder canonicalizePath(String column) {
        return new PathCanonicalizeTransformationBuilder(column);
    }

    public static PathGetNameTransformationBuilder getNameFromPath(String column) {
        return new PathGetNameTransformationBuilder(column);
    }

    public static ColumnRemoveTransformationBuilder removeColumns(List<String> columns) {
        return new ColumnRemoveTransformationBuilder(columns);
    }

    public static ColumnRemoveTransformationBuilder removeColumns(String... columns) {
        return new ColumnRemoveTransformationBuilder(Arrays.asList(columns));
    }

    public static ColumnSelectTransformationBuilder selectColumns(List<String> columns) {
        return new ColumnSelectTransformationBuilder(columns);
    }

    public static ColumnSelectTransformationBuilder selectColumns(String... columns) {
        return new ColumnSelectTransformationBuilder(Arrays.asList(columns));
    }

    public static ColumnRenameTransformationBuilder renameColumn(String from, String to) {
        return new ColumnRenameTransformationBuilder(from, to);
    }

    public static RowSelectTransformationBuilder select(int amount) {
        return new RowSelectTransformationBuilder(amount);
    }

    public static RowSortTransformationBuilder sort(List<String> onColumns) {
        return new RowSortTransformationBuilder(onColumns);
    }

    public static RowSortTransformationBuilder sort(String... onColumn) {
        return new RowSortTransformationBuilder(Arrays.asList(onColumn));
    }

    public static FoldSumTransformationBuilder foldSum() {
        return new FoldSumTransformationBuilder();
    }

    public static FoldAverageTransformationBuilder foldAverage() {
        return new FoldAverageTransformationBuilder();
    }

    public static CellRoundTransformationBuilder round(List<String> columns) {
        return new CellRoundTransformationBuilder(columns);
    }

    public static CellRoundTransformationBuilder round(String... columns) {
        return new CellRoundTransformationBuilder(Arrays.asList(columns));
    }

    public static CellSetValueTransformationBuilder setValue(String value) {
        return new CellSetValueTransformationBuilder(value);
    }
}
