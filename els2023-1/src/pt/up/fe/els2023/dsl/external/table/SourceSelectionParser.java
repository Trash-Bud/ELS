package pt.up.fe.els2023.dsl.external.table;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.InlineSource;
import pt.up.fe.els2023.externalDsl.SelectSource;
import pt.up.fe.els2023.externalDsl.SourceOperation;
import pt.up.fe.els2023.dsl.external.Parser;
import pt.up.fe.els2023.dsl.external.SourceParser;
import pt.up.fe.els2023.model.operation.SelectionOperation;
import pt.up.fe.els2023.model.operation.TableOperation;

public class SourceSelectionParser {

    public static TableOperation parse(SourceOperation sourceOperation) {

        var sourceObj = sourceOperation.getSource();

        if (sourceObj instanceof SelectSource selectSource){
            var source = selectSource.getName();
            return Parser.getTableOperation(source);
        }else if( sourceObj instanceof InlineSource inlineSource){
            var sourceBuilder = inlineSource.getSourceExpr();
            return SourceParser.parse(sourceBuilder);
        }else{
            throw new NotImplementedException("Parsing " + sourceObj.getClass().getName() + " not implemented.");
        }

    }


}
