package pt.up.fe.els2023.model.source.reader;

import java.io.IOException;

import org.junit.Test;
import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.source.reader.YamlReader;
import pt.up.fe.els2023.model.source.reader.query.Query;
import pt.up.fe.specs.util.SpecsIo;

import static org.junit.Assert.assertEquals;

public class YamlReaderTest {
    @Test
    public void readAssignment() throws IOException {
        var fileContent = SpecsIo.getResource("data/assignment1/decision_tree_1.yaml");
        Table table = new YamlReader(new Query("params")).read(fileContent);

        assertEquals(table.getColumnNames().size(), 13);
        assertEquals(table.getColumnNames().get(3), "max_depth");
        assertEquals(table.getRows().getFirst().get(2), "gini");
    }

    @Test
    public void readAssignmentBadQuery() throws IOException {
        var fileContent = SpecsIo.getResource("data/assignment1/decision_tree_1.yaml");
        Table table = new YamlReader(new Query("bad")).read(fileContent);

        assertEquals(table.getColumnNames().size(), 0);
        assertEquals(table.getRows().size(), 0);
    }
}
