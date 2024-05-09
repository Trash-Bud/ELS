package pt.up.fe.els2023.dsl.external.source;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.*;
import pt.up.fe.els2023.model.source.reader.*;

public class SourceReaderParser {

    public static SourceReader parse(InputType inputType, String queryString) {

        if (inputType == null || inputType instanceof CsvType) {
            if (queryString != null) {
                throw new RuntimeException("Query defined for file type that does not accept a query.");
            }
        }

        if (inputType == null) {
            return AutoSourceParser.parse();
        } else if (inputType instanceof JsonType jsonType) {
            return JsonSourceParser.parse(jsonType, queryString);
        } else if (inputType instanceof XmlType xmlType) {
            return XmlSourceParser.parse(xmlType, queryString);
        } else if (inputType instanceof CsvType) {
            return CsvSourceParser.parse();
        } else if (inputType instanceof YamlType) {
            return YamlSourceParser.parse(queryString);
        } else {
            throw new NotImplementedException("Parsing for " + inputType.eClass().getName() + " not implemented.");

        }


    }

}
