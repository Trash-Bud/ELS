package pt.up.fe.els2023.dsl.internal.output;

import pt.up.fe.els2023.dsl.internal.table.TableBuilder;
import pt.up.fe.els2023.model.output.writer.HtmlWriter;
import pt.up.fe.els2023.model.output.writer.TableWriter;

public class HtmlOutputBuilder extends OutputBuilder {
    private String cssPath;
    HtmlOutputBuilder(String path, TableBuilder table) {
        super(path, table);
    }

    public HtmlOutputBuilder css(String path) {
        this.cssPath = path;
        return this;
    }

    @Override
    public TableWriter buildWriter() {
        return new HtmlWriter(cssPath);
    }
}
