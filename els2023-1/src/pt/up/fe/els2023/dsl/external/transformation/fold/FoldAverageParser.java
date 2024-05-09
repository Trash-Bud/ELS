package pt.up.fe.els2023.dsl.external.transformation.fold;

import pt.up.fe.els2023.dsl.external.transformation.GroupByParser;
import pt.up.fe.els2023.externalDsl.FoldAverageTranformation;
import pt.up.fe.els2023.externalDsl.GroupBy;
import pt.up.fe.els2023.model.transformation.fold.FoldAverageTransformationApplier;

public class FoldAverageParser {

    public static FoldAverageTransformationApplier parse(FoldAverageTranformation transformation, GroupBy groupBy){

        return new FoldAverageTransformationApplier(GroupByParser.parse(groupBy));
    }

}
