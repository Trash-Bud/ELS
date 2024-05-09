package pt.up.fe.els2023.dsl.external.source;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.SourceStore;
import pt.up.fe.els2023.model.source.SourceStoreMetadata;

import java.util.List;

public class MetaDataParser {

    public static SourceStoreMetadata parse(List<SourceStore> sourceStores) {

        String filePath = null;
        String lastModified = null;

        for (var sourceStore : sourceStores) {
            var metaData = sourceStore.getMetadata().getMetadata();
            var columnName = sourceStore.getColumn();

            switch (metaData) {
                case "filepath" -> filePath = columnName;
                case "lastmodified" -> lastModified = columnName;
                default -> throw new NotImplementedException("Parsing for metadata " + metaData + " not implemented.");
            }

        }

        return new SourceStoreMetadata(filePath, lastModified);

    }


}
