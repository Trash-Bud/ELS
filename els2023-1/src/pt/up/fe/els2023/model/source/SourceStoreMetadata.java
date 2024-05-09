package pt.up.fe.els2023.model.source;

import pt.up.fe.els2023.model.Table;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SourceStoreMetadata {
    private final String filepathColumn;
    private final String lastModifiedColumn;

    public SourceStoreMetadata(String filepathColumn, String lastModifiedColumn) {
        this.filepathColumn = filepathColumn;
        this.lastModifiedColumn = lastModifiedColumn;
    }

    public void store(File file, Table table) {
        if (filepathColumn != null) {
            table.addColumn(filepathColumn, file.getAbsolutePath());
        }
        if (lastModifiedColumn != null) {
            table.addColumn(lastModifiedColumn, String.valueOf(file.lastModified()));
        }
    }
}
