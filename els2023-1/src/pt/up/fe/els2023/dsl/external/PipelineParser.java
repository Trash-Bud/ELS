package pt.up.fe.els2023.dsl.external;

import pt.up.fe.els2023.externalDsl.Pipeline;
import pt.up.fe.els2023.dsl.external.transformation.TransformationParser;
import pt.up.fe.els2023.model.PipelineApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

import java.util.ArrayList;
import java.util.List;

public class PipelineParser {

    public static PipelineApplier parse(Pipeline pipeline) {

        List<TransformationApplier> transformations = new ArrayList<>();
        for (var transformation : pipeline.getTransformation()) {
            TransformationApplier transformationApplier = TransformationParser.parse(transformation);
            transformations.add(transformationApplier);
        }
        return new PipelineApplier(transformations);
    }

}
