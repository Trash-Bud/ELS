package pt.up.fe.els2023.model;

import pt.up.fe.els2023.model.transformation.TransformationApplier;

import java.util.List;

public class PipelineApplier {

    private final List<TransformationApplier> transformations;

    public PipelineApplier(List<TransformationApplier> transformations) {
        this.transformations = transformations;
    }

    public void apply(Table table) {
        for (var transformation: transformations) {
            transformation.apply(table);
        }
    }
}
