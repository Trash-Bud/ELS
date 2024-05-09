package pt.up.fe.els2023.model.operation;

import pt.up.fe.els2023.model.Table;

public abstract class TableOperation {
    private Table cache;

    public TableOperation() {
        this.cache = null;
    }

    public Table cachedIntoTable() {
        if (cache == null) {
            cache = this.intoTable();
        }
        return cache;
    }

    public abstract Table intoTable();
}
