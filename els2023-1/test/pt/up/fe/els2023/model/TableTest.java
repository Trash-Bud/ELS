package pt.up.fe.els2023.model;

import static org.junit.Assert.*;

import org.junit.Test;

import pt.up.fe.specs.util.SpecsIo;
import java.util.ArrayList;
import java.util.List;

public class TableTest {
    @Test
    public void renameRegexColumns() {
        List<String> cols = new ArrayList<>();
        cols.add("test");
        cols.add("teste");
        cols.add("tost");
        Table table = new Table(cols);

        table.renameColumns("test(.*)", "prefix $0 suffix");
        assertEquals(table.getColumnNames().get(0), "prefix test suffix");
        assertEquals(table.getColumnNames().get(1), "prefix teste suffix");
        assertEquals(table.getColumnNames().get(2), "tost");
    }

    @Test
    public void renameRegexColumnsStrict() {
        List<String> cols = new ArrayList<>();
        cols.add("test");
        cols.add("teste");
        cols.add("tost");
        Table table = new Table(cols);

        table.renameColumns("(t)(.*)", "$1 prefix $0 suffix $2");
        assertEquals(table.getColumnNames().get(0), "t prefix test suffix est");
        assertEquals(table.getColumnNames().get(1), "t prefix teste suffix este");
        assertEquals(table.getColumnNames().get(2), "t prefix tost suffix ost");
    }

    @Test
    public void renameRegexColumnsStrict2() {
        List<String> cols = new ArrayList<>();
        cols.add("test");
        cols.add("teste");
        cols.add("tost");
        Table table = new Table(cols);

        table.renameColumns("t", "$1 prefix $0 suffix $2");
        assertEquals(table.getColumnNames().get(0), "test");
        assertEquals(table.getColumnNames().get(1), "teste");
        assertEquals(table.getColumnNames().get(2), "tost");
    }
}
