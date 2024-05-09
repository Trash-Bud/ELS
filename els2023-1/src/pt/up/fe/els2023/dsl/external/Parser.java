package pt.up.fe.els2023.dsl.external;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.Assignment;
import pt.up.fe.els2023.externalDsl.Export;
import pt.up.fe.els2023.externalDsl.impl.StatementImpl;
import pt.up.fe.els2023.model.PipelineApplier;
import pt.up.fe.els2023.model.operation.*;
import pt.up.fe.els2023.model.output.OutputProcessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser {

    static Map<String, PipelineApplier> pipelineMap = new HashMap<>();
    static Map<String, TableOperation> tableMap = new HashMap<>();


    static public TableOperation getTableOperation(String tableName) {
        if (tableName != null) {
            TableOperation table = tableMap.get(tableName);
            if (table == null) {
                throw new RuntimeException("Table " + tableName + " is not defined");
            }
            return table;
        }
        throw new RuntimeException("Table name must not be null.");
    }

    static public PipelineApplier getPipelineApplier(String pipelineName) {
        if (pipelineName != null) {
            PipelineApplier pipelineApplier = pipelineMap.get(pipelineName);
            if (pipelineApplier == null) {
                throw new RuntimeException("Table " + pipelineName + " is not defined");
            }
            return pipelineApplier;
        }
        throw new RuntimeException("Pipeline name must not be null.");
    }

    static public void putTableOperation(String name, TableOperation tableOperation) {
        tableMap.put(name, tableOperation);
    }

    static public void putPipelineApplier(String name, PipelineApplier tableOperation) {
        pipelineMap.put(name, tableOperation);
    }


    public List<OutputProcessor> parse(StatementImpl statement) {

        List<OutputProcessor> outputs = new ArrayList<>();
        var type = statement.getType();

        if (type instanceof Assignment assignment){
            AssignmentParser.parse(assignment);
        } else if (type instanceof Export export) {
            outputs.add(ExportParser.parse(export));
        } else {
            throw new NotImplementedException("Parsing " + type.getClass().getName() + " not implemented.");
        }

        return outputs;
    }

}
