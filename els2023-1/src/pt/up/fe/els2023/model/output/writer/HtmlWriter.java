package pt.up.fe.els2023.model.output.writer;

import pt.up.fe.els2023.model.Table;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class HtmlWriter implements TableWriter {
    private final String cssPath;

    public HtmlWriter(String cssPath) {
        this.cssPath = cssPath;
    }

    public HtmlWriter() {
        this.cssPath = null;
    }

    @Override
    public void write(Table table, File file) throws IOException {
        String head = "<head>\n<meta charset=\"utf-8\"/>\n";

        if(cssPath != null){
            head += "<style>"+ Files.readString(Path.of(cssPath)) +"</style>\n";
        }

        head += "<title>" + file.getName() + "</title>\n</head>\n";

        try (var writer = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
            writer.write("<!doctype html>\n<html>\n"+ head +"<body>\n<table>\n");

            writeRow(writer, table.getColumnNames(), "th");
            for (var row: table.getRows()) {
                writeRow(writer, row, "td");
            }

            writer.write("</table>\n</body>\n</html>\n");
        }

    }

    private static void writeRow(Writer write, Iterable<String> row, String tag) throws IOException {
        write.write("<tr>");
        for (var item : row) {
            write.write("<" + tag + ">" + item + "</" + tag + ">");
        }
        write.write("</tr>\n");
    }
}
