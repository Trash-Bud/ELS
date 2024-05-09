package pt.up.fe.els2023.dsl.external.transformation.fold;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.*;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class FoldTransformationParser {

    public static TransformationApplier parse(FoldTransformation transformation){
        var operation = transformation.getOperation();
        var groupBy = transformation.getGroupBy();

        if (operation instanceof FoldAverageTranformation foldAverageTranformation){
            return FoldAverageParser.parse(foldAverageTranformation,groupBy);
        }else if (operation instanceof FoldSumTranformation foldSumTranformation){
            return FoldSumParser.parse(foldSumTranformation,groupBy);
        }else{
            throw new NotImplementedException("Parsing for " + operation.eClass().getName() + " not implemented." );
        }

    }
}
