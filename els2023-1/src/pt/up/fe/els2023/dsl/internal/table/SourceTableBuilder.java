package pt.up.fe.els2023.dsl.internal.table;

import pt.up.fe.els2023.dsl.internal.source.SourceBuilder;
import pt.up.fe.els2023.model.operation.SelectionOperation;
import pt.up.fe.els2023.model.operation.TableOperation;

public class SourceTableBuilder extends TableBuilder {
    private final SourceBuilder source;

    SourceTableBuilder(SourceBuilder source) {
        this.source = source;
    }

    @Override
    public TableOperation build() {
        return new SelectionOperation(source.build());
    }
}
