package pt.up.fe.els2023.dsl.external;

import jakarta.inject.Inject;
import org.apache.commons.lang3.NotImplementedException;
import org.eclipse.xtext.parser.IParser;
import pt.up.fe.els2023.ExternalDslStandaloneSetup;
import pt.up.fe.els2023.externalDsl.Statement;
import pt.up.fe.els2023.externalDsl.impl.StatementImpl;
import pt.up.fe.els2023.model.output.OutputProcessor;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class ExternalDslParser {

    @Inject
    private IParser parser;

    private final String code;

    private List<OutputProcessor> outputs;

    public List<OutputProcessor> getOutputs() {
        if (outputs == null){
            parse();
        }
        return outputs;
    }

    public ExternalDslParser(String code){
        var injector = new ExternalDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        injector.injectMembers(this);
        this.code = code;
    }

    public void parse(){

        outputs = new ArrayList<>();

        var result = parser.parse(new StringReader(code));

        var parser = new pt.up.fe.els2023.dsl.external.Parser();

        if (result.hasSyntaxErrors()) {
            for (var error : result.getSyntaxErrors()) {
                System.out.println("Error at line " + error.getStartLine() + " - " + error.getSyntaxErrorMessage());
            }
            throw new RuntimeException("File has syntax errors");
        }

        var ast = result.getRootASTElement();

        var iterator = ast.eContents();

        for (var element: iterator){
            if (element instanceof StatementImpl statement){
                outputs.addAll(parser.parse(statement));
            }else{
                throw new NotImplementedException("Parsing " + element.getClass().getName() + " not implemented.");
            }
        }


    }


}
