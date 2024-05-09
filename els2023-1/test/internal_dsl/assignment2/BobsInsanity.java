package internal_dsl.assignment2;

import pt.up.fe.els2023.TableExtractor;
import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.dsl.internal.Pipeline;
import pt.up.fe.els2023.dsl.internal.output.Output;
import pt.up.fe.els2023.dsl.internal.source.Source;
import pt.up.fe.els2023.dsl.internal.table.Table;
import pt.up.fe.els2023.dsl.internal.transformation.Transformation;

public class BobsInsanity {
    public static void main(String[] args) {
        var folderNamePip = Pipeline.with(
            Transformation.appendPath("folder", ".."),
            Transformation.canonicalizePath("folder"),
            Transformation.getNameFromPath("folder")
        );

        var getMaxPip = Pipeline.with(
            Transformation.sort("time%"),
            Transformation.select(1).groupBy("folder")
        );

        var table1 = Table.merge(
            Table.from(
                Source.json("test/data/bobs_insanity/*/profiling.json")
                    .query("functions")
                    .store(Metadata.Filepath, "folder")
                    .columns("folder", "time%", "name")
            ).transform(getMaxPip).transform(folderNamePip),

            Table.from(
                Source.xml("test/data/bobs_insanity/*/vitis-report.xml")
                    .xpathQuery("/profile/AreaEstimates/Resources")
                    .store(Metadata.Filepath, "folder")
            ).transform(folderNamePip),

            Table.from(
                Source.yaml("test/data/bobs_insanity/*/decision_tree.yaml")
                    .store(Metadata.Filepath, "folder")
            ).transform(folderNamePip),

            Table.from(
                Source.yaml("test/data/bobs_insanity/*/decision_tree.yaml")
                    .query("params")
                    .store(Metadata.Filepath, "folder")
            ).transform(folderNamePip)
        );

        TableExtractor.process(
            Output.html("out/output.html", table1)
                .css("test/data/css/sober.css")
        );
    }
}
