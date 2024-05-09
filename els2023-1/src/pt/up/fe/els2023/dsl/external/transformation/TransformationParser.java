package pt.up.fe.els2023.dsl.external.transformation;

import org.apache.commons.lang3.NotImplementedException;
import pt.up.fe.els2023.externalDsl.*;
import pt.up.fe.els2023.dsl.external.transformation.cell.CellTransformationParser;
import pt.up.fe.els2023.dsl.external.transformation.column.ColumnTransformationParser;
import pt.up.fe.els2023.dsl.external.transformation.fold.FoldTransformationParser;
import pt.up.fe.els2023.dsl.external.transformation.path.PathTransformationConverter;
import pt.up.fe.els2023.dsl.external.transformation.row.RowTransformationParser;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class TransformationParser {

    public static TransformationApplier parse(Transformation transformation){
        if (transformation instanceof PathTransformation pathTransformation){
            return PathTransformationConverter.parse(pathTransformation);

        }else if(transformation instanceof ColumnTransformation columnTransformation){
            return ColumnTransformationParser.parse(columnTransformation);
        }else if(transformation instanceof FoldTransformation foldTransformation) {
            return FoldTransformationParser.parse(foldTransformation);
        }else if(transformation instanceof CellTransformation cellTransformation) {
            return CellTransformationParser.parse(cellTransformation);
        }else if(transformation instanceof RowTransformation rowTransformation) {
            return RowTransformationParser.parse(rowTransformation);
        }else{
            throw new NotImplementedException("Parsing for " + transformation.eClass().getName() + " not implemented." );
        }

    }
}
