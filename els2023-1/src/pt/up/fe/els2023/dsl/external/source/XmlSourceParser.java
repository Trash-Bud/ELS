package pt.up.fe.els2023.dsl.external.source;

import pt.up.fe.els2023.externalDsl.XmlType;
import pt.up.fe.els2023.model.source.reader.CsvReader;
import pt.up.fe.els2023.model.source.reader.XmlReader;
import pt.up.fe.els2023.model.source.reader.query.Query;
import pt.up.fe.els2023.model.source.reader.query.XPathQuery;

public class XmlSourceParser {

    public static XmlReader parse(XmlType xmlType, String queryString){

        var xmlQuery = xmlType.getPath();
        if (xmlQuery != null){
            if (queryString != null){
                throw new RuntimeException("Multiple queries specified for the same source");
            }

            var xPathQuery = new XPathQuery(xmlQuery);
            return new XmlReader(xPathQuery);
        }else{
            var query = new Query(queryString);
            return new XmlReader(query);
        }


    }
}
