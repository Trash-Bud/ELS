package pt.up.fe.els2023.dsl.internal;

import pt.up.fe.els2023.dsl.internal.transformation.TransformationBuilder;
import pt.up.fe.els2023.model.PipelineApplier;

import java.util.Arrays;
import java.util.List;

public class Pipeline {
    private final List<TransformationBuilder> transformations;
    private Pipeline(List<TransformationBuilder> transformations) {
        this.transformations = transformations;
    }

    public static Pipeline with(TransformationBuilder... transformations) {
        return Pipeline.with(Arrays.asList(transformations));
    }

    public static Pipeline with(List<TransformationBuilder> transformations) {
        return new Pipeline(transformations);
    }

    public PipelineApplier build() {
        return new PipelineApplier(transformations.stream().map(TransformationBuilder::build).toList());
    }
}
