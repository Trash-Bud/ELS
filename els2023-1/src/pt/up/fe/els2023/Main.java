package pt.up.fe.els2023;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.cli.*;

import pt.up.fe.els2023.config.Config;
import pt.up.fe.els2023.dsl.external.ExternalDslParser;

public class Main {


    public static void main(String[] args) {
        CommandLine commandLine;
        try {
            commandLine = parseArgs(args);
        } catch (ParseException exception) {
            System.err.println(exception.getMessage());
            return;
        }

        var configMode = commandLine.hasOption("config");

        var inputPath = commandLine.getOptionValue("input");
        System.out.println("Reading from " + inputPath);

        int processed = 0;
        int failed = 0;

        if (configMode) {
            var mapper = new ObjectMapper();
            Config config;
            try {
                config = mapper.readValue(new File(inputPath), Config.class);
            } catch (IOException exception) {
                System.err.println("Error while reading configuration file: " + exception.getMessage());
                return;
            }

            processed = TableExtractor.process(config);
            failed = config.outputs().size() - processed;
        } else {
            ExternalDslParser outputs;
            try {
                String content = new String(Files.readAllBytes(Paths.get(inputPath)));
                outputs = new ExternalDslParser(content);
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
                return;
            }

            processed = TableExtractor.process(outputs);
            failed = outputs.getOutputs().size() - processed;
        }


        System.out.println("Successfully processed " + processed + " outputs" + (failed > 0 ? " (" + failed + " failed)" : ""));
    }

    private static CommandLine parseArgs(String[] args) throws ParseException {
        var parser = new DefaultParser();
        var options = new Options();

        options.addOption((Option.builder("c")
                .longOpt("config")
                .desc("Use config file")
                .build()));

        options.addOption(Option.builder("i")
            .longOpt("input")
            .desc("Path to file")
            .hasArg()
            .required()
            .build());

        return parser.parse(options, args);
    }
}
