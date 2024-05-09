package pt.up.fe.els2023.dsl.external;

import pt.up.fe.els2023.externalDsl.Source;
import pt.up.fe.els2023.dsl.external.source.MetaDataParser;
import pt.up.fe.els2023.dsl.external.source.SourceReaderParser;
import pt.up.fe.els2023.model.operation.SelectionOperation;
import pt.up.fe.els2023.model.source.SourceProcessor;
import pt.up.fe.els2023.model.source.reader.SourceReader;

import java.util.List;

public class SourceParser {


    public static SelectionOperation parse(Source source) {

        var filePath = source.getFilePath();

        var query = source.getQuery();
        var fileType = source.getInputType();
        SourceReader sourceReader = SourceReaderParser.parse(fileType, query);

        var store = source.getStore();
        var metaData = MetaDataParser.parse(store);

        var select = source.getSelect();
        List<String> columns = null;
        if (select != null) {
            columns = select.getColumns();
        }

        var sourceProcessor = new SourceProcessor(filePath, metaData, columns, sourceReader);

        return new SelectionOperation(sourceProcessor);


    }

}
