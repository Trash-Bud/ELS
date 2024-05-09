package pt.up.fe.els2023.dsl.external;

import pt.up.fe.els2023.externalDsl.Export;
import pt.up.fe.els2023.dsl.external.output.OutputBuilderParser;
import pt.up.fe.els2023.model.output.OutputProcessor;

public class ExportParser {

    public static OutputProcessor parse(Export export) {
        var tableObj = export.getTable();
        var output = export.getOutput();
        var writer = OutputBuilderParser.parse(output);

        var path = export.getPath();

        var table = TableParser.parse(tableObj);

        return new OutputProcessor(path, table, writer);
    }
}
