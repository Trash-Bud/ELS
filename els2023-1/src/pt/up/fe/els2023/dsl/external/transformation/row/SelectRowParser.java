package pt.up.fe.els2023.dsl.external.transformation.row;

import pt.up.fe.els2023.dsl.external.transformation.GroupByParser;
import pt.up.fe.els2023.externalDsl.SelectRowsTransformation;
import pt.up.fe.els2023.model.transformation.fold.FoldAverageTransformationApplier;
import pt.up.fe.els2023.model.transformation.row.SelectRowsTransformationApplier;

public class SelectRowParser {
    public static SelectRowsTransformationApplier parse(SelectRowsTransformation selectTransformation) {

        var length = selectTransformation.getLength();
        var start = selectTransformation.getStart();
        var groupBy = selectTransformation.getGroupBy();

        return new SelectRowsTransformationApplier(start,length, GroupByParser.parse(groupBy));
    }


}
