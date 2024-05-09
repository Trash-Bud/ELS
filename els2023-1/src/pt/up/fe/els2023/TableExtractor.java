package pt.up.fe.els2023;

import pt.up.fe.els2023.config.Config;
import pt.up.fe.els2023.dsl.external.ExternalDslParser;
import pt.up.fe.els2023.dsl.internal.Outputs;
import pt.up.fe.els2023.dsl.internal.output.OutputBuilder;
import pt.up.fe.els2023.model.output.OutputProcessor;

import java.io.IOException;

public class TableExtractor {
    private final Iterable<OutputProcessor> outputs;

    public TableExtractor(Iterable<OutputProcessor> outputs) {
        this.outputs = outputs;
    }

    public static int process(Iterable<OutputProcessor> outputs) {
        return new TableExtractor(outputs).process();
    }

    public static int process(Config config) {
        return new TableExtractor(config.intoOutputs()).process();
    }

    public static int process(ExternalDslParser parser) {
        return new TableExtractor(parser.getOutputs()).process();
    }

    public static int process(OutputBuilder... outputs) {
        return new TableExtractor(Outputs.compile(outputs)).process();
    }

    public int process() {
        int processedOutputs = 0;
        for (OutputProcessor output: outputs) {
            try {
                output.process();
                processedOutputs++;
            } catch (IOException | RuntimeException exception) {
                System.err.println("Error while processing output '" + output.getPath() + "': " + exception.getMessage());

                var tracebackEnv = System.getenv("TRACEBACK");
                if (tracebackEnv != null && !tracebackEnv.isBlank() && !tracebackEnv.equals("0")) {
                    exception.printStackTrace();
                }
            }
        }
        return processedOutputs;
    }
}
