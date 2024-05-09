package pt.up.fe.els2023.dsl.external.output;

import pt.up.fe.els2023.externalDsl.HtmlType;
import pt.up.fe.els2023.model.output.writer.HtmlWriter;

public class HtmlOutputParser {

    public static HtmlWriter parse(HtmlType htmlType){
        var css = htmlType.getCssPath();
        if (css != null){
            return new HtmlWriter(css);

        }else{
            return new HtmlWriter();
        }
    }

}
