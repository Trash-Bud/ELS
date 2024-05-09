package pt.up.fe.els2023.model.source.reader.query;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XPathQuery implements IntoXPathQuery {
    private final XPathExpression expr;

    public XPathQuery(String query) {
        var xpath = XPathFactory.newInstance().newXPath();
        try {
            expr = xpath.compile(query);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
    }

    public XPathQuery() {
        this("/*");
    }

    public Node apply(Document doc) throws XPathExpressionException {
        return (Node) expr.evaluate(doc, XPathConstants.NODE);
    }

    @Override
    public XPathQuery intoXPathQuery() {
        return this;
    }
}
