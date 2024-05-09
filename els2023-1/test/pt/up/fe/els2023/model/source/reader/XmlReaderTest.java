package pt.up.fe.els2023.reader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.source.reader.XmlReader;
import pt.up.fe.els2023.model.source.reader.query.Query;
import pt.up.fe.els2023.model.source.reader.query.XPathQuery;
import pt.up.fe.specs.util.SpecsIo;

import static org.junit.Assert.assertEquals;

public class XmlReaderTest {
    @Test
    public void rootSimple() throws IOException {
        var fileContent = SpecsIo.getResource("data/xml/sample.xml");
        var inputStream = new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8));
        Table table = new XmlReader(new Query()).read(inputStream);

        assertEquals(table.getColumnNames().size(), 3);
        assertEquals(table.getColumnNames().get(2), "h");
        assertEquals(table.getRows().getFirst().get(1), "7");
    }

    @Test
    public void rootXPath() throws IOException {
        var fileContent = SpecsIo.getResource("data/xml/sample.xml");
        var inputStream = new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8));
        Table table = new XmlReader(new XPathQuery()).read(inputStream);

        assertEquals(table.getColumnNames().size(), 3);
        assertEquals(table.getColumnNames().get(2), "h");
        assertEquals(table.getRows().getFirst().get(1), "7");
    }

    @Test
    public void nestedSimple() throws IOException {
        var fileContent = SpecsIo.getResource("data/xml/sample.xml");
        var inputStream = new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8));
        Table table = new XmlReader(new Query("root.a.b")).read(inputStream);

        assertEquals(table.getColumnNames().size(), 3);
        assertEquals(table.getColumnNames().get(0), "c1");
        assertEquals(table.getRows().getFirst().get(2), "test3");
    }

    @Test
    public void nestedXPath() throws IOException {
        var fileContent = SpecsIo.getResource("data/xml/sample.xml");
        var inputStream = new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8));
        Table table = new XmlReader(new XPathQuery("/root/a/b")).read(inputStream);

        assertEquals(table.getColumnNames().size(), 3);
        assertEquals(table.getColumnNames().get(0), "c1");
        assertEquals(table.getRows().getFirst().get(2), "test3");
    }

    @Test
    public void arraySimple() throws IOException {
        var fileContent = SpecsIo.getResource("data/xml/sample.xml");
        var inputStream = new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8));
        Table table = new XmlReader(new Query("root.array.3")).read(inputStream);

        assertEquals(table.getColumnNames().size(), 2);
        assertEquals(table.getColumnNames().get(1), "z");
        assertEquals(table.getRows().getFirst().get(0), "A");
    }

    @Test
    public void arrayXPath() throws IOException {
        var fileContent = SpecsIo.getResource("data/xml/sample.xml");
        var inputStream = new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8));
        Table table = new XmlReader(new XPathQuery("/root/array/*[4]")).read(inputStream);

        assertEquals(table.getColumnNames().size(), 2);
        assertEquals(table.getColumnNames().get(1), "z");
        assertEquals(table.getRows().getFirst().get(0), "A");
    }

    @Test
    public void fail() throws IOException {
        var fileContent = SpecsIo.getResource("data/xml/sample.xml");
        var inputStream = new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8));
        Table table = new XmlReader(new XPathQuery("/root/bad/query")).read(inputStream);

        assertEquals(table.getColumnNames().size(), 0);
        assertEquals(table.getRows().size(), 0);
    }
}
