package pt.up.fe.els2023.model.source.reader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.source.reader.query.IntoXPathQuery;
import pt.up.fe.els2023.model.source.reader.query.XPathQuery;

public class XmlReader implements SourceReader {
    private final XPathQuery query;

    public XmlReader(IntoXPathQuery query) {
        this.query = query.intoXPathQuery();
    }

    public XmlReader() {
        this.query = new XPathQuery();
    }

    @Override
    public Table read(File file) throws IOException {
        try {
            var builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            var doc = builder.parse(file);

            return parseDocument(doc);
        } catch (ParserConfigurationException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public Table read(InputStream input) throws IOException {
        try {
            var builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            var doc = builder.parse(input);

            return parseDocument(doc);
        } catch (ParserConfigurationException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    private Table parseDocument(Document doc) {
        Node result;
        try {
            result = query.apply(doc);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }

        if (result == null) {
            return new Table(new ArrayList<>());
        }

        var children = result.getChildNodes();

        List<String> fields = new ArrayList<>();
        List<String> values = new ArrayList<>();

        for (int i = 0; i < children.getLength(); i++) {
            var child = children.item(i);
            if (child.getNodeName().equals("#text") || xmlHasChildren(child)) {
                continue;
            }

            fields.add(child.getNodeName());
            values.add(getNodeValue(child));
        }

        var table = new Table(fields);
        table.addRow(values);

        return table;
    }

    private static boolean xmlHasChildren(Node node) {
        var hasChildren = false;
        var children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            var child = children.item(i);
            if (!child.getNodeName().equals("#text")) {
                hasChildren = true;
                break;
            }
        }
        return hasChildren;
    }

    private static String getNodeValue(Node node) {
        var children = node.getChildNodes();
        if (children.getLength() != 1) {
            throw new RuntimeException("Node has more than one child");
        }

        var child = children.item(0);
        assert child.getNodeName().equals("#text");
        return child.getNodeValue();
    }
}
