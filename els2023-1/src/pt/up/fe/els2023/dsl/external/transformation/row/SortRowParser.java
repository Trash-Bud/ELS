package pt.up.fe.els2023.dsl.external.transformation.row;

import pt.up.fe.els2023.externalDsl.SortRowsTransformation;
import pt.up.fe.els2023.model.transformation.row.SortRowsTransformationApplier;

public class SortRowParser {
    public static SortRowsTransformationApplier parse(SortRowsTransformation sortTransformation) {

        var columns = sortTransformation.getColumns();
        var order = sortTransformation.getOrder();
        var ascending = true;
        if (order != null) {
            ascending = order.equals("ascending");
        }


        return new SortRowsTransformationApplier(columns,ascending);



    }


}
