package internal_dsl.assignment2;

import pt.up.fe.els2023.TableExtractor;
import pt.up.fe.els2023.dsl.internal.Metadata;
import pt.up.fe.els2023.dsl.internal.output.Output;
import pt.up.fe.els2023.dsl.internal.source.Source;
import pt.up.fe.els2023.dsl.internal.table.Table;
import pt.up.fe.els2023.dsl.internal.transformation.Transformation;

import java.util.List;

public class SumTest {

    public static void main(String[] args) {

        var table1 = Table.from(
                Source.csv("test/data/csv/table1.csv")
                    .store(Metadata.Filepath, "sanity1")
            ).transform(Transformation.foldAverage().groupBy("colB"));

        TableExtractor.process(
            Output.html("out/sum_test.html", table1)
                .css("test/data/css/sober.css")
        );
    }


}
