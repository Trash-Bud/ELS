package pt.up.fe.els2023.dsl.internal;

import pt.up.fe.els2023.dsl.internal.output.OutputBuilder;
import pt.up.fe.els2023.model.output.OutputProcessor;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class Outputs {
    private Outputs() {}

    public static Iterable<OutputProcessor> compile(OutputBuilder... outputs) {
        return Outputs.compile(Arrays.asList(outputs));
    }

    public static Iterable<OutputProcessor> compile(Iterable<OutputBuilder> outputs) {
        return StreamSupport.stream(outputs.spliterator(), false)
            .map(OutputBuilder::build)
            .toList();
    }
}
