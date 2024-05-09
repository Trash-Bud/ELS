package pt.up.fe.els2023.dsl.internal.table;

import pt.up.fe.els2023.dsl.internal.Pipeline;
import pt.up.fe.els2023.dsl.internal.source.SourceBuilder;
import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;

import java.util.Arrays;
import java.util.List;

public class Table {
    private Table() {}

    public static MergeTableBuilder merge(TableBuilder... tables) {
        return Table.merge(Arrays.stream(tables).toList());
    }

    public static MergeTableBuilder merge(List<TableBuilder> tables) {
        return new MergeTableBuilder(tables);
    }

    public static AppendTableBuilder append(TableBuilder... tables) {
        return Table.append(Arrays.stream(tables).toList());
    }

    public static AppendTableBuilder append(List<TableBuilder> tables) {
        return new AppendTableBuilder(tables);
    }

    public static SourceTableBuilder from(SourceBuilder source) {
        return new SourceTableBuilder(source);
    }
}
