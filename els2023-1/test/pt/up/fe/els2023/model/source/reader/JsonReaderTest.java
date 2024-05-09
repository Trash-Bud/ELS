package pt.up.fe.els2023.model.source.reader;

import java.io.IOException;

import org.junit.Test;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.source.reader.JsonReader;
import pt.up.fe.els2023.model.source.reader.query.JsonPathQuery;
import pt.up.fe.els2023.model.source.reader.query.Query;
import pt.up.fe.specs.util.SpecsIo;

import static org.junit.Assert.assertEquals;

public class JsonReaderTest {
    @Test
    public void readFlat() throws IOException {
        var fileContent = SpecsIo.getResource("data/json/sample.json");
        Table table = new JsonReader(new Query("data")).read(fileContent);

        assertEquals(table.getColumnNames().size(), 3);
        assertEquals(table.getColumnNames().get(1), "manual");
        assertEquals(table.getRows().getFirst().get(2), "lgtm");
    }

    @Test
    public void readAssignmentBadQuery() throws IOException {
        var fileContent = SpecsIo.getResource("data/json/sample.json");
        Table table = new JsonReader(new Query("bad")).read(fileContent);

        assertEquals(table.getColumnNames().size(), 0);
        assertEquals(table.getRows().size(), 0);
    }

    @Test
    public void readNested() throws IOException {
        var fileContent = SpecsIo.getResource("data/json/sample.json");
        Table table = new JsonReader(new Query("nesting.is.cool")).read(fileContent);

        assertEquals(table.getColumnNames().size(), 2);
        assertEquals(table.getColumnNames().getFirst(), "ice");
        assertEquals(table.getRows().getFirst().get(1), "alright alright alright");
    }

    @Test
    public void readArray() throws IOException {
        var fileContent = SpecsIo.getResource("data/json/sample.json");
        Table table = new JsonReader(new Query("nesting.is.arrayful.2")).read(fileContent);

        assertEquals(table.getColumnNames().size(), 1);
        assertEquals(table.getColumnNames().getFirst(), "very");
        assertEquals(table.getRows().getFirst().getFirst(), "deep");
    }

    @Test
    public void readArrayJsonPath() throws IOException {
        var fileContent = SpecsIo.getResource("data/json/sample.json");
        Table table = new JsonReader(new JsonPathQuery("$.nesting.is.arrayful[2]")).read(fileContent);

        assertEquals(table.getColumnNames().size(), 1);
        assertEquals(table.getColumnNames().getFirst(), "very");
        assertEquals(table.getRows().getFirst().getFirst(), "deep");
    }
}
