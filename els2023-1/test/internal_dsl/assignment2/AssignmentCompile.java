package internal_dsl.assignment2;

import pt.up.fe.els2023.TableExtractor;
import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.dsl.internal.Outputs;
import pt.up.fe.els2023.dsl.internal.Pipeline;
import pt.up.fe.els2023.dsl.internal.output.Output;
import pt.up.fe.els2023.dsl.internal.source.Source;
import pt.up.fe.els2023.dsl.internal.table.Table;
import pt.up.fe.els2023.dsl.internal.transformation.Transformation;

public class AssignmentCompile {
    public static void main(String[] args) {
        var pip1 = Pipeline.with(
            Transformation.sort("time%"),
            Transformation.select(1),
            Transformation.appendPath("folder", ".."),
            Transformation.canonicalizePath("folder"),
            Transformation.getNameFromPath("folder")
        );

        var table1 = Table.merge(
            Table.from(
                Source.json("test/data/assignment2/profiling.json")
                    .query("functions")
                    .store(Metadata.Filepath, "folder")
                    .columns("folder", "time%", "name")
            ).transform(pip1),

            Table.from(
                Source.xml("test/data/assignment2/vitis-report.xml")
                    .xpathQuery("/profile/AreaEstimates/Resources")
            ),

            Table.from(
                Source.yaml("test/data/assignment2/decision_tree.yaml")
            ),

            Table.from(
                Source.yaml("test/data/assignment2/decision_tree.yaml")
                    .query("params")
            )
        );

        var outs = Outputs.compile(
            Output.html("out/output.html", table1)
                .css("test/data/css/sober.css")
        );

        TableExtractor.process(outs);
    }
}
