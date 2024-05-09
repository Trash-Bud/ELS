package pt.up.fe.els2023.model.operation;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.source.SourceProcessor;

public class SelectionOperation extends TableOperation {
    private final SourceProcessor source;

    public SelectionOperation(SourceProcessor source) {
        this.source = source;
    }

    @Override
    public Table intoTable() {
        return source.cachedProcess();
    }
}
