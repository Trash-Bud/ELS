package internal_dsl.assignment3;

import pt.up.fe.els2023.TableExtractor;
import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.dsl.internal.Pipeline;
import pt.up.fe.els2023.dsl.internal.output.Output;
import pt.up.fe.els2023.dsl.internal.source.Source;
import pt.up.fe.els2023.dsl.internal.table.Table;
import pt.up.fe.els2023.dsl.internal.transformation.Transformation;

public class AssignmentBasic {
    public static void main(String[] args) {
        var folderNamePip = Pipeline.with(
            Transformation.appendPath("execution", ".."),
            Transformation.canonicalizePath("execution"),
            Transformation.getNameFromPath("execution")
        );

        var fold1Pip = Pipeline.with(
            Transformation.select(1).groupBy("execution"),
            Transformation.renameColumn("time%", "% 1"),
            Transformation.renameColumn("name", "name 1")
        );

        var fold2Pip = Pipeline.with(
            Transformation.select(1).skip(1).groupBy("execution"),
            Transformation.renameColumn("time%", "% 2"),
            Transformation.renameColumn("name", "name 2")
        );

        var fold3Pip = Pipeline.with(
            Transformation.select(1).skip(2).groupBy("execution"),
            Transformation.renameColumn("time%", "% 3"),
            Transformation.renameColumn("name", "name 3")
        );

        var sumPip = Pipeline.with(
            Transformation.foldSum(),
            Transformation.round("% 1", "% 2", "% 3").digits(4),
            Transformation.setValue("sum").atColumn("execution")
        );

        var avgPip = Pipeline.with(
            Transformation.foldAverage(),
            Transformation.round("% 1", "% 2", "% 3").digits(4),
            Transformation.setValue("avg").atColumn("execution")
        );

        var yamlSrc = Source.yaml("test/data/assignment3/*/analysis.yaml")
            .query("total.results.dynamic")
            .store(Metadata.Filepath, "execution");

        var xmlSrc = Source.xml("test/data/assignment3/*/analysis.xml")
            .xpathQuery("root/total/results/static")
            .store(Metadata.Filepath, "execution");

        var profilingSrc = Source.json("test/data/assignment3/*/profiling.json")
            .query("functions")
            .store(Metadata.Filepath, "execution")
            .columns("execution", "time%", "name");

        var profilingTable = Table.from(profilingSrc)
            .transform(Transformation.sort("time%").descending())
            .transform(folderNamePip);

        var baseTable = Table.merge(
            profilingTable.transform(fold1Pip),
            profilingTable.transform(fold2Pip),
            profilingTable.transform(fold3Pip),

            Table.from(yamlSrc).transform(
                Transformation.renameColumn("(?!execution)", "$0 (Dynamic)").regex()
            ).transform(folderNamePip),

            Table.from(xmlSrc).transform(
                Transformation.renameColumn("(?!execution)", "$0 (Static)").regex()
            ).transform(folderNamePip)
        ).transform(Transformation.sort("execution"));

        var sum = baseTable.transform(sumPip);
        var avg = baseTable.transform(avgPip);

        var finalTable = Table.append(
            baseTable,
            sum,
            avg
        );

        TableExtractor.process(
            Output.html("out/output.html", finalTable)
                .css("test/data/css/sober.css")
        );
    }
}
