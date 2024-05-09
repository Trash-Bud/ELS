package internal_dsl.assignment2;

import pt.up.fe.els2023.TableExtractor;
import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.dsl.internal.Pipeline;
import pt.up.fe.els2023.dsl.internal.output.Output;
import pt.up.fe.els2023.dsl.internal.source.Source;
import pt.up.fe.els2023.dsl.internal.table.Table;
import pt.up.fe.els2023.dsl.internal.transformation.Transformation;

public class MergeTest {

    public static void main(String[] args) {

        var table1 = Table.merge(
            Table.from(
                Source.csv("test/data/csv/table4.csv")
                    .store(Metadata.Filepath, "sanity1")
            ),
            Table.from(
                Source.csv("test/data/csv/table5.csv")
                    .store(Metadata.Filepath, "sanity2")
            )
        );

        TableExtractor.process(
            Output.html("out/merge_test.html", table1)
                .css("test/data/css/sober.css")
        );
    }
}
