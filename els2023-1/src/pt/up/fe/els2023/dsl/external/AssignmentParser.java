package pt.up.fe.els2023.dsl.external;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.Assignment;
import pt.up.fe.els2023.externalDsl.Pipeline;
import pt.up.fe.els2023.externalDsl.impl.AssignmentImpl;
import pt.up.fe.els2023.externalDsl.Source;
import pt.up.fe.els2023.externalDsl.Table;

import static pt.up.fe.els2023.dsl.external.Parser.tableMap;

public class AssignmentParser {

    public static void parse(Assignment assignment){
        var name = assignment.getName();
        var expression = assignment.getExpression();

        if (expression instanceof Pipeline pipeline) {
            var pipelineObj = PipelineParser.parse(pipeline);
            Parser.putPipelineApplier(name, pipelineObj);
        } else if (expression instanceof Source source) {
            var sourceObj = SourceParser.parse(source);
            Parser.putTableOperation(name, sourceObj);
        } else if (expression instanceof Table table) {
            var tableObj = TableParser.parse(table);
            Parser.putTableOperation(name, tableObj);
        } else {
            throw new NotImplementedException("Parsing " + expression.getClass().getName() + " not implemented.");
        }

    }
}
