package pt.up.fe.els2023.dsl.internal.table;

import pt.up.fe.els2023.dsl.internal.Pipeline;
import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;
import pt.up.fe.els2023.model.operation.TableOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class TableBuilder {
    private TableOperation cache;

    TableBuilder() {
        this.cache = null;
    }

    public MergeTableBuilder merge(TableBuilder... tables) {
        return this.merge(Arrays.stream(tables).toList());
    }

    public MergeTableBuilder merge(List<TableBuilder> tables) {
        var t = new ArrayList<TableBuilder>();
        t.add(this);
        t.addAll(tables);
        return Table.merge(t);
    }

    public AppendTableBuilder append(TableBuilder... tables) {
        return this.append(Arrays.stream(tables).toList());
    }

    public AppendTableBuilder append(List<TableBuilder> tables) {
        var t = new ArrayList<TableBuilder>();
        t.add(this);
        t.addAll(tables);
        return Table.append(t);
    }

    public TransformationTableBuilder transform(TransformationBuilder transformation) {
        return new TransformationTableBuilder(transformation, this);
    }

    public PipelineTableBuilder transform(Pipeline pipeline) {
        return new PipelineTableBuilder(pipeline, this);
    }

    public TableOperation cachedBuild() {
        if (cache == null) {
            cache = this.build();
        }
        return cache;
    }

    public abstract TableOperation build();
}
