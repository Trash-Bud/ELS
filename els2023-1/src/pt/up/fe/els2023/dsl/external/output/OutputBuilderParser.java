package pt.up.fe.els2023.dsl.external.output;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.CsvType;
import pt.up.fe.els2023.externalDsl.HtmlType;
import pt.up.fe.els2023.externalDsl.OutputType;
import pt.up.fe.els2023.model.output.writer.TableWriter;

public class OutputBuilderParser {


    public static TableWriter parse(OutputType outputType) {

        if (outputType == null){
            return AutoOutputParser.parse();
        } else if (outputType instanceof HtmlType htmlType) {
            return HtmlOutputParser.parse(htmlType);
        } else if (outputType instanceof CsvType) {
            return CsvOutputParser.parse();
        } else {
            throw new NotImplementedException("Parsing for " + outputType.eClass().getName() + " not implemented.");
        }

    }

}
