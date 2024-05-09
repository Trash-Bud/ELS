package pt.up.fe.els2023.dsl.external.transformation.fold;

import pt.up.fe.els2023.dsl.external.transformation.GroupByParser;
import pt.up.fe.els2023.externalDsl.FoldSumTranformation;
import pt.up.fe.els2023.externalDsl.GroupBy;
import pt.up.fe.els2023.model.transformation.fold.FoldSumTransformationApplier;

public class FoldSumParser {

    public static FoldSumTransformationApplier parse(FoldSumTranformation transformation, GroupBy groupBy){
        return new FoldSumTransformationApplier(GroupByParser.parse(groupBy));
    }

}
