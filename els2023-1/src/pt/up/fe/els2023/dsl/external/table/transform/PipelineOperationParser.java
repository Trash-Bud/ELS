package pt.up.fe.els2023.dsl.external.table.transform;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.Pipeline;
import pt.up.fe.els2023.externalDsl.PipelineTableOperation;
import pt.up.fe.els2023.externalDsl.SelectPipeline;
import pt.up.fe.els2023.dsl.external.Parser;
import pt.up.fe.els2023.dsl.external.PipelineParser;
import pt.up.fe.els2023.model.operation.PipelineOperation;
import pt.up.fe.els2023.model.operation.TableOperation;


public class PipelineOperationParser {


    public static PipelineOperation parse(PipelineTableOperation pipelineTableOperation, TableOperation source) {

        var pipelineObj = pipelineTableOperation.getPipeline();

        if (pipelineObj instanceof SelectPipeline selectPipeline){

            var pipeline = selectPipeline.getName();
            var pipelineOp = Parser.getPipelineApplier(pipeline);

            return new PipelineOperation(pipelineOp, source);
        }else if(pipelineObj instanceof Pipeline inlinePipeline){
            return new PipelineOperation(PipelineParser.parse(inlinePipeline),source);
        }else{
            throw new NotImplementedException("Parsing for " + pipelineObj.eClass().getName() + " not implemented.");

        }
    }

}
