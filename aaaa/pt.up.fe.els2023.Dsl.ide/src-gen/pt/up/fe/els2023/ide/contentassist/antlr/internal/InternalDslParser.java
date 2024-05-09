package pt.up.fe.els2023.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import pt.up.fe.els2023.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'merge'", "'append'", "'union'", "'intersection'", "'filepath'", "'lastmodified'", "'descending'", "'ascending'", "'='", "'['", "','", "']'", "'('", "')'", "'apply'", "';'", "'xml'", "'{'", "'xpath'", "'}'", "'json'", "'jsonpath'", "'yaml'", "'csv'", "'auto'", "'html'", "'css'", "'store'", "'in'", "'select'", "'import'", "'from'", "'as'", "'canonicalize'", "'path'", "'name'", "'of'", "'fold'", "'average'", "'sum'", "'group'", "'by'", "'add'", "'with'", "'remove'", "'rename'", "'to'", "'round'", "'digits'", "'set'", "'value'", "'at'", "'column'", "'row'", "'skip'", "'groupby'", "'sort'", "'pipe'", "'export'", "'regex'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMyDsl"
    // InternalDsl.g:53:1: entryRuleMyDsl : ruleMyDsl EOF ;
    public final void entryRuleMyDsl() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleMyDsl EOF )
            // InternalDsl.g:55:1: ruleMyDsl EOF
            {
             before(grammarAccess.getMyDslRule()); 
            pushFollow(FOLLOW_1);
            ruleMyDsl();

            state._fsp--;

             after(grammarAccess.getMyDslRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyDsl"


    // $ANTLR start "ruleMyDsl"
    // InternalDsl.g:62:1: ruleMyDsl : ( ( rule__MyDsl__Group__0 ) ) ;
    public final void ruleMyDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__MyDsl__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__MyDsl__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__MyDsl__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__MyDsl__Group__0 )
            {
             before(grammarAccess.getMyDslAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__MyDsl__Group__0 )
            // InternalDsl.g:69:4: rule__MyDsl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyDsl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyDslAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyDsl"


    // $ANTLR start "entryRuleAssignment"
    // InternalDsl.g:78:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleAssignment EOF )
            // InternalDsl.g:80:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalDsl.g:87:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Assignment__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Assignment__Group__0 )
            // InternalDsl.g:94:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleCombinationOperations"
    // InternalDsl.g:103:1: entryRuleCombinationOperations : ruleCombinationOperations EOF ;
    public final void entryRuleCombinationOperations() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleCombinationOperations EOF )
            // InternalDsl.g:105:1: ruleCombinationOperations EOF
            {
             before(grammarAccess.getCombinationOperationsRule()); 
            pushFollow(FOLLOW_1);
            ruleCombinationOperations();

            state._fsp--;

             after(grammarAccess.getCombinationOperationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCombinationOperations"


    // $ANTLR start "ruleCombinationOperations"
    // InternalDsl.g:112:1: ruleCombinationOperations : ( ( rule__CombinationOperations__Group__0 ) ) ;
    public final void ruleCombinationOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__CombinationOperations__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__CombinationOperations__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__CombinationOperations__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__CombinationOperations__Group__0 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__CombinationOperations__Group__0 )
            // InternalDsl.g:119:4: rule__CombinationOperations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCombinationOperationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombinationOperations"


    // $ANTLR start "entryRuleTableOperations"
    // InternalDsl.g:128:1: entryRuleTableOperations : ruleTableOperations EOF ;
    public final void entryRuleTableOperations() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleTableOperations EOF )
            // InternalDsl.g:130:1: ruleTableOperations EOF
            {
             before(grammarAccess.getTableOperationsRule()); 
            pushFollow(FOLLOW_1);
            ruleTableOperations();

            state._fsp--;

             after(grammarAccess.getTableOperationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableOperations"


    // $ANTLR start "ruleTableOperations"
    // InternalDsl.g:137:1: ruleTableOperations : ( ( rule__TableOperations__Group__0 ) ) ;
    public final void ruleTableOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__TableOperations__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__TableOperations__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__TableOperations__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__TableOperations__Group__0 )
            {
             before(grammarAccess.getTableOperationsAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__TableOperations__Group__0 )
            // InternalDsl.g:144:4: rule__TableOperations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableOperations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableOperationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableOperations"


    // $ANTLR start "entryRuleSelectSource"
    // InternalDsl.g:153:1: entryRuleSelectSource : ruleSelectSource EOF ;
    public final void entryRuleSelectSource() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleSelectSource EOF )
            // InternalDsl.g:155:1: ruleSelectSource EOF
            {
             before(grammarAccess.getSelectSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectSource();

            state._fsp--;

             after(grammarAccess.getSelectSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectSource"


    // $ANTLR start "ruleSelectSource"
    // InternalDsl.g:162:1: ruleSelectSource : ( ( rule__SelectSource__NameAssignment ) ) ;
    public final void ruleSelectSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__SelectSource__NameAssignment ) ) )
            // InternalDsl.g:167:2: ( ( rule__SelectSource__NameAssignment ) )
            {
            // InternalDsl.g:167:2: ( ( rule__SelectSource__NameAssignment ) )
            // InternalDsl.g:168:3: ( rule__SelectSource__NameAssignment )
            {
             before(grammarAccess.getSelectSourceAccess().getNameAssignment()); 
            // InternalDsl.g:169:3: ( rule__SelectSource__NameAssignment )
            // InternalDsl.g:169:4: rule__SelectSource__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SelectSource__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSelectSourceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectSource"


    // $ANTLR start "entryRuleInlineSource"
    // InternalDsl.g:178:1: entryRuleInlineSource : ruleInlineSource EOF ;
    public final void entryRuleInlineSource() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleInlineSource EOF )
            // InternalDsl.g:180:1: ruleInlineSource EOF
            {
             before(grammarAccess.getInlineSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleInlineSource();

            state._fsp--;

             after(grammarAccess.getInlineSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInlineSource"


    // $ANTLR start "ruleInlineSource"
    // InternalDsl.g:187:1: ruleInlineSource : ( ( rule__InlineSource__Group__0 ) ) ;
    public final void ruleInlineSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__InlineSource__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__InlineSource__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__InlineSource__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__InlineSource__Group__0 )
            {
             before(grammarAccess.getInlineSourceAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__InlineSource__Group__0 )
            // InternalDsl.g:194:4: rule__InlineSource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InlineSource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInlineSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineSource"


    // $ANTLR start "entryRuleSourceOperation"
    // InternalDsl.g:203:1: entryRuleSourceOperation : ruleSourceOperation EOF ;
    public final void entryRuleSourceOperation() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleSourceOperation EOF )
            // InternalDsl.g:205:1: ruleSourceOperation EOF
            {
             before(grammarAccess.getSourceOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceOperation();

            state._fsp--;

             after(grammarAccess.getSourceOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceOperation"


    // $ANTLR start "ruleSourceOperation"
    // InternalDsl.g:212:1: ruleSourceOperation : ( ( rule__SourceOperation__SourceAssignment ) ) ;
    public final void ruleSourceOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__SourceOperation__SourceAssignment ) ) )
            // InternalDsl.g:217:2: ( ( rule__SourceOperation__SourceAssignment ) )
            {
            // InternalDsl.g:217:2: ( ( rule__SourceOperation__SourceAssignment ) )
            // InternalDsl.g:218:3: ( rule__SourceOperation__SourceAssignment )
            {
             before(grammarAccess.getSourceOperationAccess().getSourceAssignment()); 
            // InternalDsl.g:219:3: ( rule__SourceOperation__SourceAssignment )
            // InternalDsl.g:219:4: rule__SourceOperation__SourceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SourceOperation__SourceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSourceOperationAccess().getSourceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceOperation"


    // $ANTLR start "entryRuleTransformationTableOperation"
    // InternalDsl.g:228:1: entryRuleTransformationTableOperation : ruleTransformationTableOperation EOF ;
    public final void entryRuleTransformationTableOperation() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleTransformationTableOperation EOF )
            // InternalDsl.g:230:1: ruleTransformationTableOperation EOF
            {
             before(grammarAccess.getTransformationTableOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformationTableOperation();

            state._fsp--;

             after(grammarAccess.getTransformationTableOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformationTableOperation"


    // $ANTLR start "ruleTransformationTableOperation"
    // InternalDsl.g:237:1: ruleTransformationTableOperation : ( ( rule__TransformationTableOperation__Group__0 ) ) ;
    public final void ruleTransformationTableOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__TransformationTableOperation__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__TransformationTableOperation__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__TransformationTableOperation__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__TransformationTableOperation__Group__0 )
            {
             before(grammarAccess.getTransformationTableOperationAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__TransformationTableOperation__Group__0 )
            // InternalDsl.g:244:4: rule__TransformationTableOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransformationTableOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationTableOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformationTableOperation"


    // $ANTLR start "entryRuleSelectPipeline"
    // InternalDsl.g:253:1: entryRuleSelectPipeline : ruleSelectPipeline EOF ;
    public final void entryRuleSelectPipeline() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleSelectPipeline EOF )
            // InternalDsl.g:255:1: ruleSelectPipeline EOF
            {
             before(grammarAccess.getSelectPipelineRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectPipeline();

            state._fsp--;

             after(grammarAccess.getSelectPipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectPipeline"


    // $ANTLR start "ruleSelectPipeline"
    // InternalDsl.g:262:1: ruleSelectPipeline : ( ( rule__SelectPipeline__NameAssignment ) ) ;
    public final void ruleSelectPipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__SelectPipeline__NameAssignment ) ) )
            // InternalDsl.g:267:2: ( ( rule__SelectPipeline__NameAssignment ) )
            {
            // InternalDsl.g:267:2: ( ( rule__SelectPipeline__NameAssignment ) )
            // InternalDsl.g:268:3: ( rule__SelectPipeline__NameAssignment )
            {
             before(grammarAccess.getSelectPipelineAccess().getNameAssignment()); 
            // InternalDsl.g:269:3: ( rule__SelectPipeline__NameAssignment )
            // InternalDsl.g:269:4: rule__SelectPipeline__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SelectPipeline__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSelectPipelineAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectPipeline"


    // $ANTLR start "entryRuleInlinePipeline"
    // InternalDsl.g:278:1: entryRuleInlinePipeline : ruleInlinePipeline EOF ;
    public final void entryRuleInlinePipeline() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleInlinePipeline EOF )
            // InternalDsl.g:280:1: ruleInlinePipeline EOF
            {
             before(grammarAccess.getInlinePipelineRule()); 
            pushFollow(FOLLOW_1);
            ruleInlinePipeline();

            state._fsp--;

             after(grammarAccess.getInlinePipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInlinePipeline"


    // $ANTLR start "ruleInlinePipeline"
    // InternalDsl.g:287:1: ruleInlinePipeline : ( ( rule__InlinePipeline__Group__0 ) ) ;
    public final void ruleInlinePipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__InlinePipeline__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__InlinePipeline__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__InlinePipeline__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__InlinePipeline__Group__0 )
            {
             before(grammarAccess.getInlinePipelineAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__InlinePipeline__Group__0 )
            // InternalDsl.g:294:4: rule__InlinePipeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InlinePipeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInlinePipelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlinePipeline"


    // $ANTLR start "entryRulePipelineTableOperation"
    // InternalDsl.g:303:1: entryRulePipelineTableOperation : rulePipelineTableOperation EOF ;
    public final void entryRulePipelineTableOperation() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( rulePipelineTableOperation EOF )
            // InternalDsl.g:305:1: rulePipelineTableOperation EOF
            {
             before(grammarAccess.getPipelineTableOperationRule()); 
            pushFollow(FOLLOW_1);
            rulePipelineTableOperation();

            state._fsp--;

             after(grammarAccess.getPipelineTableOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePipelineTableOperation"


    // $ANTLR start "rulePipelineTableOperation"
    // InternalDsl.g:312:1: rulePipelineTableOperation : ( ( rule__PipelineTableOperation__PipelineAssignment ) ) ;
    public final void rulePipelineTableOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__PipelineTableOperation__PipelineAssignment ) ) )
            // InternalDsl.g:317:2: ( ( rule__PipelineTableOperation__PipelineAssignment ) )
            {
            // InternalDsl.g:317:2: ( ( rule__PipelineTableOperation__PipelineAssignment ) )
            // InternalDsl.g:318:3: ( rule__PipelineTableOperation__PipelineAssignment )
            {
             before(grammarAccess.getPipelineTableOperationAccess().getPipelineAssignment()); 
            // InternalDsl.g:319:3: ( rule__PipelineTableOperation__PipelineAssignment )
            // InternalDsl.g:319:4: rule__PipelineTableOperation__PipelineAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PipelineTableOperation__PipelineAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPipelineTableOperationAccess().getPipelineAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePipelineTableOperation"


    // $ANTLR start "entryRuleTransformOperation"
    // InternalDsl.g:328:1: entryRuleTransformOperation : ruleTransformOperation EOF ;
    public final void entryRuleTransformOperation() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleTransformOperation EOF )
            // InternalDsl.g:330:1: ruleTransformOperation EOF
            {
             before(grammarAccess.getTransformOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformOperation();

            state._fsp--;

             after(grammarAccess.getTransformOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformOperation"


    // $ANTLR start "ruleTransformOperation"
    // InternalDsl.g:337:1: ruleTransformOperation : ( ( rule__TransformOperation__Group__0 ) ) ;
    public final void ruleTransformOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__TransformOperation__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__TransformOperation__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__TransformOperation__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__TransformOperation__Group__0 )
            {
             before(grammarAccess.getTransformOperationAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__TransformOperation__Group__0 )
            // InternalDsl.g:344:4: rule__TransformOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransformOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformOperation"


    // $ANTLR start "entryRuleTable"
    // InternalDsl.g:353:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleTable EOF )
            // InternalDsl.g:355:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDsl.g:362:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__Table__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__Table__Group__0 )
            // InternalDsl.g:369:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleXmlType"
    // InternalDsl.g:378:1: entryRuleXmlType : ruleXmlType EOF ;
    public final void entryRuleXmlType() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleXmlType EOF )
            // InternalDsl.g:380:1: ruleXmlType EOF
            {
             before(grammarAccess.getXmlTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleXmlType();

            state._fsp--;

             after(grammarAccess.getXmlTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmlType"


    // $ANTLR start "ruleXmlType"
    // InternalDsl.g:387:1: ruleXmlType : ( ( rule__XmlType__Group__0 ) ) ;
    public final void ruleXmlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__XmlType__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__XmlType__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__XmlType__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__XmlType__Group__0 )
            {
             before(grammarAccess.getXmlTypeAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__XmlType__Group__0 )
            // InternalDsl.g:394:4: rule__XmlType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XmlType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmlType"


    // $ANTLR start "entryRuleJsonType"
    // InternalDsl.g:403:1: entryRuleJsonType : ruleJsonType EOF ;
    public final void entryRuleJsonType() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleJsonType EOF )
            // InternalDsl.g:405:1: ruleJsonType EOF
            {
             before(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // InternalDsl.g:412:1: ruleJsonType : ( ( rule__JsonType__Group__0 ) ) ;
    public final void ruleJsonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__JsonType__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__JsonType__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__JsonType__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__JsonType__Group__0 )
            {
             before(grammarAccess.getJsonTypeAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__JsonType__Group__0 )
            // InternalDsl.g:419:4: rule__JsonType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleYamlType"
    // InternalDsl.g:428:1: entryRuleYamlType : ruleYamlType EOF ;
    public final void entryRuleYamlType() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleYamlType EOF )
            // InternalDsl.g:430:1: ruleYamlType EOF
            {
             before(grammarAccess.getYamlTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleYamlType();

            state._fsp--;

             after(grammarAccess.getYamlTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYamlType"


    // $ANTLR start "ruleYamlType"
    // InternalDsl.g:437:1: ruleYamlType : ( ( rule__YamlType__Group__0 ) ) ;
    public final void ruleYamlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__YamlType__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__YamlType__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__YamlType__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__YamlType__Group__0 )
            {
             before(grammarAccess.getYamlTypeAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__YamlType__Group__0 )
            // InternalDsl.g:444:4: rule__YamlType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YamlType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYamlTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYamlType"


    // $ANTLR start "entryRuleCsvType"
    // InternalDsl.g:453:1: entryRuleCsvType : ruleCsvType EOF ;
    public final void entryRuleCsvType() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleCsvType EOF )
            // InternalDsl.g:455:1: ruleCsvType EOF
            {
             before(grammarAccess.getCsvTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCsvType();

            state._fsp--;

             after(grammarAccess.getCsvTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCsvType"


    // $ANTLR start "ruleCsvType"
    // InternalDsl.g:462:1: ruleCsvType : ( ( rule__CsvType__Group__0 ) ) ;
    public final void ruleCsvType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__CsvType__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__CsvType__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__CsvType__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__CsvType__Group__0 )
            {
             before(grammarAccess.getCsvTypeAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__CsvType__Group__0 )
            // InternalDsl.g:469:4: rule__CsvType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CsvType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCsvTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCsvType"


    // $ANTLR start "entryRuleAutoType"
    // InternalDsl.g:478:1: entryRuleAutoType : ruleAutoType EOF ;
    public final void entryRuleAutoType() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleAutoType EOF )
            // InternalDsl.g:480:1: ruleAutoType EOF
            {
             before(grammarAccess.getAutoTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAutoType();

            state._fsp--;

             after(grammarAccess.getAutoTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutoType"


    // $ANTLR start "ruleAutoType"
    // InternalDsl.g:487:1: ruleAutoType : ( ( rule__AutoType__Group__0 ) ) ;
    public final void ruleAutoType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__AutoType__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__AutoType__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__AutoType__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__AutoType__Group__0 )
            {
             before(grammarAccess.getAutoTypeAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__AutoType__Group__0 )
            // InternalDsl.g:494:4: rule__AutoType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutoType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutoTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutoType"


    // $ANTLR start "entryRuleInputType"
    // InternalDsl.g:503:1: entryRuleInputType : ruleInputType EOF ;
    public final void entryRuleInputType() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleInputType EOF )
            // InternalDsl.g:505:1: ruleInputType EOF
            {
             before(grammarAccess.getInputTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleInputType();

            state._fsp--;

             after(grammarAccess.getInputTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputType"


    // $ANTLR start "ruleInputType"
    // InternalDsl.g:512:1: ruleInputType : ( ( rule__InputType__Alternatives ) ) ;
    public final void ruleInputType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__InputType__Alternatives ) ) )
            // InternalDsl.g:517:2: ( ( rule__InputType__Alternatives ) )
            {
            // InternalDsl.g:517:2: ( ( rule__InputType__Alternatives ) )
            // InternalDsl.g:518:3: ( rule__InputType__Alternatives )
            {
             before(grammarAccess.getInputTypeAccess().getAlternatives()); 
            // InternalDsl.g:519:3: ( rule__InputType__Alternatives )
            // InternalDsl.g:519:4: rule__InputType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputType"


    // $ANTLR start "entryRuleHtmlType"
    // InternalDsl.g:528:1: entryRuleHtmlType : ruleHtmlType EOF ;
    public final void entryRuleHtmlType() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleHtmlType EOF )
            // InternalDsl.g:530:1: ruleHtmlType EOF
            {
             before(grammarAccess.getHtmlTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleHtmlType();

            state._fsp--;

             after(grammarAccess.getHtmlTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHtmlType"


    // $ANTLR start "ruleHtmlType"
    // InternalDsl.g:537:1: ruleHtmlType : ( ( rule__HtmlType__Group__0 ) ) ;
    public final void ruleHtmlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__HtmlType__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__HtmlType__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__HtmlType__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__HtmlType__Group__0 )
            {
             before(grammarAccess.getHtmlTypeAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__HtmlType__Group__0 )
            // InternalDsl.g:544:4: rule__HtmlType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HtmlType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHtmlTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHtmlType"


    // $ANTLR start "entryRuleOutputType"
    // InternalDsl.g:553:1: entryRuleOutputType : ruleOutputType EOF ;
    public final void entryRuleOutputType() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleOutputType EOF )
            // InternalDsl.g:555:1: ruleOutputType EOF
            {
             before(grammarAccess.getOutputTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputType();

            state._fsp--;

             after(grammarAccess.getOutputTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputType"


    // $ANTLR start "ruleOutputType"
    // InternalDsl.g:562:1: ruleOutputType : ( ( rule__OutputType__TypeAssignment ) ) ;
    public final void ruleOutputType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__OutputType__TypeAssignment ) ) )
            // InternalDsl.g:567:2: ( ( rule__OutputType__TypeAssignment ) )
            {
            // InternalDsl.g:567:2: ( ( rule__OutputType__TypeAssignment ) )
            // InternalDsl.g:568:3: ( rule__OutputType__TypeAssignment )
            {
             before(grammarAccess.getOutputTypeAccess().getTypeAssignment()); 
            // InternalDsl.g:569:3: ( rule__OutputType__TypeAssignment )
            // InternalDsl.g:569:4: rule__OutputType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__OutputType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOutputTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputType"


    // $ANTLR start "entryRuleMetaData"
    // InternalDsl.g:578:1: entryRuleMetaData : ruleMetaData EOF ;
    public final void entryRuleMetaData() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleMetaData EOF )
            // InternalDsl.g:580:1: ruleMetaData EOF
            {
             before(grammarAccess.getMetaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getMetaDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetaData"


    // $ANTLR start "ruleMetaData"
    // InternalDsl.g:587:1: ruleMetaData : ( ( rule__MetaData__MetadataAssignment ) ) ;
    public final void ruleMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__MetaData__MetadataAssignment ) ) )
            // InternalDsl.g:592:2: ( ( rule__MetaData__MetadataAssignment ) )
            {
            // InternalDsl.g:592:2: ( ( rule__MetaData__MetadataAssignment ) )
            // InternalDsl.g:593:3: ( rule__MetaData__MetadataAssignment )
            {
             before(grammarAccess.getMetaDataAccess().getMetadataAssignment()); 
            // InternalDsl.g:594:3: ( rule__MetaData__MetadataAssignment )
            // InternalDsl.g:594:4: rule__MetaData__MetadataAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__MetadataAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataAccess().getMetadataAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaData"


    // $ANTLR start "entryRuleSourceStore"
    // InternalDsl.g:603:1: entryRuleSourceStore : ruleSourceStore EOF ;
    public final void entryRuleSourceStore() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleSourceStore EOF )
            // InternalDsl.g:605:1: ruleSourceStore EOF
            {
             before(grammarAccess.getSourceStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceStore();

            state._fsp--;

             after(grammarAccess.getSourceStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceStore"


    // $ANTLR start "ruleSourceStore"
    // InternalDsl.g:612:1: ruleSourceStore : ( ( rule__SourceStore__Group__0 ) ) ;
    public final void ruleSourceStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__SourceStore__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__SourceStore__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__SourceStore__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__SourceStore__Group__0 )
            {
             before(grammarAccess.getSourceStoreAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__SourceStore__Group__0 )
            // InternalDsl.g:619:4: rule__SourceStore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceStore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceStore"


    // $ANTLR start "entryRuleSourceCoumnSelect"
    // InternalDsl.g:628:1: entryRuleSourceCoumnSelect : ruleSourceCoumnSelect EOF ;
    public final void entryRuleSourceCoumnSelect() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleSourceCoumnSelect EOF )
            // InternalDsl.g:630:1: ruleSourceCoumnSelect EOF
            {
             before(grammarAccess.getSourceCoumnSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceCoumnSelect();

            state._fsp--;

             after(grammarAccess.getSourceCoumnSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceCoumnSelect"


    // $ANTLR start "ruleSourceCoumnSelect"
    // InternalDsl.g:637:1: ruleSourceCoumnSelect : ( ( rule__SourceCoumnSelect__Group__0 ) ) ;
    public final void ruleSourceCoumnSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__SourceCoumnSelect__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__SourceCoumnSelect__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__SourceCoumnSelect__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__SourceCoumnSelect__Group__0 )
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__SourceCoumnSelect__Group__0 )
            // InternalDsl.g:644:4: rule__SourceCoumnSelect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceCoumnSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceCoumnSelect"


    // $ANTLR start "entryRuleSource"
    // InternalDsl.g:653:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleSource EOF )
            // InternalDsl.g:655:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalDsl.g:662:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__Source__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__Source__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__Source__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__Source__Group__0 )
            // InternalDsl.g:669:4: rule__Source__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleCanonicalizePathTransformation"
    // InternalDsl.g:678:1: entryRuleCanonicalizePathTransformation : ruleCanonicalizePathTransformation EOF ;
    public final void entryRuleCanonicalizePathTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:679:1: ( ruleCanonicalizePathTransformation EOF )
            // InternalDsl.g:680:1: ruleCanonicalizePathTransformation EOF
            {
             before(grammarAccess.getCanonicalizePathTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleCanonicalizePathTransformation();

            state._fsp--;

             after(grammarAccess.getCanonicalizePathTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCanonicalizePathTransformation"


    // $ANTLR start "ruleCanonicalizePathTransformation"
    // InternalDsl.g:687:1: ruleCanonicalizePathTransformation : ( ( rule__CanonicalizePathTransformation__Group__0 ) ) ;
    public final void ruleCanonicalizePathTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:2: ( ( ( rule__CanonicalizePathTransformation__Group__0 ) ) )
            // InternalDsl.g:692:2: ( ( rule__CanonicalizePathTransformation__Group__0 ) )
            {
            // InternalDsl.g:692:2: ( ( rule__CanonicalizePathTransformation__Group__0 ) )
            // InternalDsl.g:693:3: ( rule__CanonicalizePathTransformation__Group__0 )
            {
             before(grammarAccess.getCanonicalizePathTransformationAccess().getGroup()); 
            // InternalDsl.g:694:3: ( rule__CanonicalizePathTransformation__Group__0 )
            // InternalDsl.g:694:4: rule__CanonicalizePathTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CanonicalizePathTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCanonicalizePathTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCanonicalizePathTransformation"


    // $ANTLR start "entryRuleGetPathTransformation"
    // InternalDsl.g:703:1: entryRuleGetPathTransformation : ruleGetPathTransformation EOF ;
    public final void entryRuleGetPathTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:704:1: ( ruleGetPathTransformation EOF )
            // InternalDsl.g:705:1: ruleGetPathTransformation EOF
            {
             before(grammarAccess.getGetPathTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleGetPathTransformation();

            state._fsp--;

             after(grammarAccess.getGetPathTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetPathTransformation"


    // $ANTLR start "ruleGetPathTransformation"
    // InternalDsl.g:712:1: ruleGetPathTransformation : ( ( rule__GetPathTransformation__Group__0 ) ) ;
    public final void ruleGetPathTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:2: ( ( ( rule__GetPathTransformation__Group__0 ) ) )
            // InternalDsl.g:717:2: ( ( rule__GetPathTransformation__Group__0 ) )
            {
            // InternalDsl.g:717:2: ( ( rule__GetPathTransformation__Group__0 ) )
            // InternalDsl.g:718:3: ( rule__GetPathTransformation__Group__0 )
            {
             before(grammarAccess.getGetPathTransformationAccess().getGroup()); 
            // InternalDsl.g:719:3: ( rule__GetPathTransformation__Group__0 )
            // InternalDsl.g:719:4: rule__GetPathTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetPathTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetPathTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetPathTransformation"


    // $ANTLR start "entryRuleAppendPathTransformation"
    // InternalDsl.g:728:1: entryRuleAppendPathTransformation : ruleAppendPathTransformation EOF ;
    public final void entryRuleAppendPathTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:729:1: ( ruleAppendPathTransformation EOF )
            // InternalDsl.g:730:1: ruleAppendPathTransformation EOF
            {
             before(grammarAccess.getAppendPathTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleAppendPathTransformation();

            state._fsp--;

             after(grammarAccess.getAppendPathTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppendPathTransformation"


    // $ANTLR start "ruleAppendPathTransformation"
    // InternalDsl.g:737:1: ruleAppendPathTransformation : ( ( rule__AppendPathTransformation__Group__0 ) ) ;
    public final void ruleAppendPathTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:741:2: ( ( ( rule__AppendPathTransformation__Group__0 ) ) )
            // InternalDsl.g:742:2: ( ( rule__AppendPathTransformation__Group__0 ) )
            {
            // InternalDsl.g:742:2: ( ( rule__AppendPathTransformation__Group__0 ) )
            // InternalDsl.g:743:3: ( rule__AppendPathTransformation__Group__0 )
            {
             before(grammarAccess.getAppendPathTransformationAccess().getGroup()); 
            // InternalDsl.g:744:3: ( rule__AppendPathTransformation__Group__0 )
            // InternalDsl.g:744:4: rule__AppendPathTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppendPathTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppendPathTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppendPathTransformation"


    // $ANTLR start "entryRulePathTransformation"
    // InternalDsl.g:753:1: entryRulePathTransformation : rulePathTransformation EOF ;
    public final void entryRulePathTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:754:1: ( rulePathTransformation EOF )
            // InternalDsl.g:755:1: rulePathTransformation EOF
            {
             before(grammarAccess.getPathTransformationRule()); 
            pushFollow(FOLLOW_1);
            rulePathTransformation();

            state._fsp--;

             after(grammarAccess.getPathTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathTransformation"


    // $ANTLR start "rulePathTransformation"
    // InternalDsl.g:762:1: rulePathTransformation : ( ( rule__PathTransformation__Group__0 ) ) ;
    public final void rulePathTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:766:2: ( ( ( rule__PathTransformation__Group__0 ) ) )
            // InternalDsl.g:767:2: ( ( rule__PathTransformation__Group__0 ) )
            {
            // InternalDsl.g:767:2: ( ( rule__PathTransformation__Group__0 ) )
            // InternalDsl.g:768:3: ( rule__PathTransformation__Group__0 )
            {
             before(grammarAccess.getPathTransformationAccess().getGroup()); 
            // InternalDsl.g:769:3: ( rule__PathTransformation__Group__0 )
            // InternalDsl.g:769:4: rule__PathTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PathTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathTransformation"


    // $ANTLR start "entryRuleFoldAverageTranformation"
    // InternalDsl.g:778:1: entryRuleFoldAverageTranformation : ruleFoldAverageTranformation EOF ;
    public final void entryRuleFoldAverageTranformation() throws RecognitionException {
        try {
            // InternalDsl.g:779:1: ( ruleFoldAverageTranformation EOF )
            // InternalDsl.g:780:1: ruleFoldAverageTranformation EOF
            {
             before(grammarAccess.getFoldAverageTranformationRule()); 
            pushFollow(FOLLOW_1);
            ruleFoldAverageTranformation();

            state._fsp--;

             after(grammarAccess.getFoldAverageTranformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoldAverageTranformation"


    // $ANTLR start "ruleFoldAverageTranformation"
    // InternalDsl.g:787:1: ruleFoldAverageTranformation : ( ( rule__FoldAverageTranformation__Group__0 ) ) ;
    public final void ruleFoldAverageTranformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:791:2: ( ( ( rule__FoldAverageTranformation__Group__0 ) ) )
            // InternalDsl.g:792:2: ( ( rule__FoldAverageTranformation__Group__0 ) )
            {
            // InternalDsl.g:792:2: ( ( rule__FoldAverageTranformation__Group__0 ) )
            // InternalDsl.g:793:3: ( rule__FoldAverageTranformation__Group__0 )
            {
             before(grammarAccess.getFoldAverageTranformationAccess().getGroup()); 
            // InternalDsl.g:794:3: ( rule__FoldAverageTranformation__Group__0 )
            // InternalDsl.g:794:4: rule__FoldAverageTranformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FoldAverageTranformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFoldAverageTranformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoldAverageTranformation"


    // $ANTLR start "entryRuleFoldSumTranformation"
    // InternalDsl.g:803:1: entryRuleFoldSumTranformation : ruleFoldSumTranformation EOF ;
    public final void entryRuleFoldSumTranformation() throws RecognitionException {
        try {
            // InternalDsl.g:804:1: ( ruleFoldSumTranformation EOF )
            // InternalDsl.g:805:1: ruleFoldSumTranformation EOF
            {
             before(grammarAccess.getFoldSumTranformationRule()); 
            pushFollow(FOLLOW_1);
            ruleFoldSumTranformation();

            state._fsp--;

             after(grammarAccess.getFoldSumTranformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoldSumTranformation"


    // $ANTLR start "ruleFoldSumTranformation"
    // InternalDsl.g:812:1: ruleFoldSumTranformation : ( ( rule__FoldSumTranformation__Group__0 ) ) ;
    public final void ruleFoldSumTranformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:816:2: ( ( ( rule__FoldSumTranformation__Group__0 ) ) )
            // InternalDsl.g:817:2: ( ( rule__FoldSumTranformation__Group__0 ) )
            {
            // InternalDsl.g:817:2: ( ( rule__FoldSumTranformation__Group__0 ) )
            // InternalDsl.g:818:3: ( rule__FoldSumTranformation__Group__0 )
            {
             before(grammarAccess.getFoldSumTranformationAccess().getGroup()); 
            // InternalDsl.g:819:3: ( rule__FoldSumTranformation__Group__0 )
            // InternalDsl.g:819:4: rule__FoldSumTranformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FoldSumTranformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFoldSumTranformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoldSumTranformation"


    // $ANTLR start "entryRuleGroupBy"
    // InternalDsl.g:828:1: entryRuleGroupBy : ruleGroupBy EOF ;
    public final void entryRuleGroupBy() throws RecognitionException {
        try {
            // InternalDsl.g:829:1: ( ruleGroupBy EOF )
            // InternalDsl.g:830:1: ruleGroupBy EOF
            {
             before(grammarAccess.getGroupByRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupBy();

            state._fsp--;

             after(grammarAccess.getGroupByRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupBy"


    // $ANTLR start "ruleGroupBy"
    // InternalDsl.g:837:1: ruleGroupBy : ( ( rule__GroupBy__Group__0 ) ) ;
    public final void ruleGroupBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:841:2: ( ( ( rule__GroupBy__Group__0 ) ) )
            // InternalDsl.g:842:2: ( ( rule__GroupBy__Group__0 ) )
            {
            // InternalDsl.g:842:2: ( ( rule__GroupBy__Group__0 ) )
            // InternalDsl.g:843:3: ( rule__GroupBy__Group__0 )
            {
             before(grammarAccess.getGroupByAccess().getGroup()); 
            // InternalDsl.g:844:3: ( rule__GroupBy__Group__0 )
            // InternalDsl.g:844:4: rule__GroupBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupBy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupByAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupBy"


    // $ANTLR start "entryRuleFoldTransformation"
    // InternalDsl.g:853:1: entryRuleFoldTransformation : ruleFoldTransformation EOF ;
    public final void entryRuleFoldTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:854:1: ( ruleFoldTransformation EOF )
            // InternalDsl.g:855:1: ruleFoldTransformation EOF
            {
             before(grammarAccess.getFoldTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleFoldTransformation();

            state._fsp--;

             after(grammarAccess.getFoldTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFoldTransformation"


    // $ANTLR start "ruleFoldTransformation"
    // InternalDsl.g:862:1: ruleFoldTransformation : ( ( rule__FoldTransformation__Group__0 ) ) ;
    public final void ruleFoldTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:2: ( ( ( rule__FoldTransformation__Group__0 ) ) )
            // InternalDsl.g:867:2: ( ( rule__FoldTransformation__Group__0 ) )
            {
            // InternalDsl.g:867:2: ( ( rule__FoldTransformation__Group__0 ) )
            // InternalDsl.g:868:3: ( rule__FoldTransformation__Group__0 )
            {
             before(grammarAccess.getFoldTransformationAccess().getGroup()); 
            // InternalDsl.g:869:3: ( rule__FoldTransformation__Group__0 )
            // InternalDsl.g:869:4: rule__FoldTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FoldTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFoldTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoldTransformation"


    // $ANTLR start "entryRuleAddColumnTransformation"
    // InternalDsl.g:878:1: entryRuleAddColumnTransformation : ruleAddColumnTransformation EOF ;
    public final void entryRuleAddColumnTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:879:1: ( ruleAddColumnTransformation EOF )
            // InternalDsl.g:880:1: ruleAddColumnTransformation EOF
            {
             before(grammarAccess.getAddColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleAddColumnTransformation();

            state._fsp--;

             after(grammarAccess.getAddColumnTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddColumnTransformation"


    // $ANTLR start "ruleAddColumnTransformation"
    // InternalDsl.g:887:1: ruleAddColumnTransformation : ( ( rule__AddColumnTransformation__Group__0 ) ) ;
    public final void ruleAddColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:891:2: ( ( ( rule__AddColumnTransformation__Group__0 ) ) )
            // InternalDsl.g:892:2: ( ( rule__AddColumnTransformation__Group__0 ) )
            {
            // InternalDsl.g:892:2: ( ( rule__AddColumnTransformation__Group__0 ) )
            // InternalDsl.g:893:3: ( rule__AddColumnTransformation__Group__0 )
            {
             before(grammarAccess.getAddColumnTransformationAccess().getGroup()); 
            // InternalDsl.g:894:3: ( rule__AddColumnTransformation__Group__0 )
            // InternalDsl.g:894:4: rule__AddColumnTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddColumnTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddColumnTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddColumnTransformation"


    // $ANTLR start "entryRuleRemoveColumnTransformation"
    // InternalDsl.g:903:1: entryRuleRemoveColumnTransformation : ruleRemoveColumnTransformation EOF ;
    public final void entryRuleRemoveColumnTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:904:1: ( ruleRemoveColumnTransformation EOF )
            // InternalDsl.g:905:1: ruleRemoveColumnTransformation EOF
            {
             before(grammarAccess.getRemoveColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleRemoveColumnTransformation();

            state._fsp--;

             after(grammarAccess.getRemoveColumnTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveColumnTransformation"


    // $ANTLR start "ruleRemoveColumnTransformation"
    // InternalDsl.g:912:1: ruleRemoveColumnTransformation : ( ( rule__RemoveColumnTransformation__Group__0 ) ) ;
    public final void ruleRemoveColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:916:2: ( ( ( rule__RemoveColumnTransformation__Group__0 ) ) )
            // InternalDsl.g:917:2: ( ( rule__RemoveColumnTransformation__Group__0 ) )
            {
            // InternalDsl.g:917:2: ( ( rule__RemoveColumnTransformation__Group__0 ) )
            // InternalDsl.g:918:3: ( rule__RemoveColumnTransformation__Group__0 )
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getGroup()); 
            // InternalDsl.g:919:3: ( rule__RemoveColumnTransformation__Group__0 )
            // InternalDsl.g:919:4: rule__RemoveColumnTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveColumnTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveColumnTransformation"


    // $ANTLR start "entryRuleRenameColumnTransformation"
    // InternalDsl.g:928:1: entryRuleRenameColumnTransformation : ruleRenameColumnTransformation EOF ;
    public final void entryRuleRenameColumnTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:929:1: ( ruleRenameColumnTransformation EOF )
            // InternalDsl.g:930:1: ruleRenameColumnTransformation EOF
            {
             before(grammarAccess.getRenameColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameColumnTransformation();

            state._fsp--;

             after(grammarAccess.getRenameColumnTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameColumnTransformation"


    // $ANTLR start "ruleRenameColumnTransformation"
    // InternalDsl.g:937:1: ruleRenameColumnTransformation : ( ( rule__RenameColumnTransformation__Group__0 ) ) ;
    public final void ruleRenameColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:941:2: ( ( ( rule__RenameColumnTransformation__Group__0 ) ) )
            // InternalDsl.g:942:2: ( ( rule__RenameColumnTransformation__Group__0 ) )
            {
            // InternalDsl.g:942:2: ( ( rule__RenameColumnTransformation__Group__0 ) )
            // InternalDsl.g:943:3: ( rule__RenameColumnTransformation__Group__0 )
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getGroup()); 
            // InternalDsl.g:944:3: ( rule__RenameColumnTransformation__Group__0 )
            // InternalDsl.g:944:4: rule__RenameColumnTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameColumnTransformation"


    // $ANTLR start "entryRuleSelectColumnTransformation"
    // InternalDsl.g:953:1: entryRuleSelectColumnTransformation : ruleSelectColumnTransformation EOF ;
    public final void entryRuleSelectColumnTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:954:1: ( ruleSelectColumnTransformation EOF )
            // InternalDsl.g:955:1: ruleSelectColumnTransformation EOF
            {
             before(grammarAccess.getSelectColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectColumnTransformation();

            state._fsp--;

             after(grammarAccess.getSelectColumnTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectColumnTransformation"


    // $ANTLR start "ruleSelectColumnTransformation"
    // InternalDsl.g:962:1: ruleSelectColumnTransformation : ( ( rule__SelectColumnTransformation__Group__0 ) ) ;
    public final void ruleSelectColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:966:2: ( ( ( rule__SelectColumnTransformation__Group__0 ) ) )
            // InternalDsl.g:967:2: ( ( rule__SelectColumnTransformation__Group__0 ) )
            {
            // InternalDsl.g:967:2: ( ( rule__SelectColumnTransformation__Group__0 ) )
            // InternalDsl.g:968:3: ( rule__SelectColumnTransformation__Group__0 )
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getGroup()); 
            // InternalDsl.g:969:3: ( rule__SelectColumnTransformation__Group__0 )
            // InternalDsl.g:969:4: rule__SelectColumnTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectColumnTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectColumnTransformation"


    // $ANTLR start "entryRuleColumnTransformation"
    // InternalDsl.g:978:1: entryRuleColumnTransformation : ruleColumnTransformation EOF ;
    public final void entryRuleColumnTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:979:1: ( ruleColumnTransformation EOF )
            // InternalDsl.g:980:1: ruleColumnTransformation EOF
            {
             before(grammarAccess.getColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnTransformation();

            state._fsp--;

             after(grammarAccess.getColumnTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnTransformation"


    // $ANTLR start "ruleColumnTransformation"
    // InternalDsl.g:987:1: ruleColumnTransformation : ( ( rule__ColumnTransformation__Alternatives ) ) ;
    public final void ruleColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:991:2: ( ( ( rule__ColumnTransformation__Alternatives ) ) )
            // InternalDsl.g:992:2: ( ( rule__ColumnTransformation__Alternatives ) )
            {
            // InternalDsl.g:992:2: ( ( rule__ColumnTransformation__Alternatives ) )
            // InternalDsl.g:993:3: ( rule__ColumnTransformation__Alternatives )
            {
             before(grammarAccess.getColumnTransformationAccess().getAlternatives()); 
            // InternalDsl.g:994:3: ( rule__ColumnTransformation__Alternatives )
            // InternalDsl.g:994:4: rule__ColumnTransformation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnTransformation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnTransformationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnTransformation"


    // $ANTLR start "entryRuleRoundCellsTransformation"
    // InternalDsl.g:1003:1: entryRuleRoundCellsTransformation : ruleRoundCellsTransformation EOF ;
    public final void entryRuleRoundCellsTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:1004:1: ( ruleRoundCellsTransformation EOF )
            // InternalDsl.g:1005:1: ruleRoundCellsTransformation EOF
            {
             before(grammarAccess.getRoundCellsTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleRoundCellsTransformation();

            state._fsp--;

             after(grammarAccess.getRoundCellsTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoundCellsTransformation"


    // $ANTLR start "ruleRoundCellsTransformation"
    // InternalDsl.g:1012:1: ruleRoundCellsTransformation : ( ( rule__RoundCellsTransformation__Group__0 ) ) ;
    public final void ruleRoundCellsTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1016:2: ( ( ( rule__RoundCellsTransformation__Group__0 ) ) )
            // InternalDsl.g:1017:2: ( ( rule__RoundCellsTransformation__Group__0 ) )
            {
            // InternalDsl.g:1017:2: ( ( rule__RoundCellsTransformation__Group__0 ) )
            // InternalDsl.g:1018:3: ( rule__RoundCellsTransformation__Group__0 )
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getGroup()); 
            // InternalDsl.g:1019:3: ( rule__RoundCellsTransformation__Group__0 )
            // InternalDsl.g:1019:4: rule__RoundCellsTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundCellsTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoundCellsTransformation"


    // $ANTLR start "entryRuleSetCellsTransformation"
    // InternalDsl.g:1028:1: entryRuleSetCellsTransformation : ruleSetCellsTransformation EOF ;
    public final void entryRuleSetCellsTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:1029:1: ( ruleSetCellsTransformation EOF )
            // InternalDsl.g:1030:1: ruleSetCellsTransformation EOF
            {
             before(grammarAccess.getSetCellsTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleSetCellsTransformation();

            state._fsp--;

             after(grammarAccess.getSetCellsTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetCellsTransformation"


    // $ANTLR start "ruleSetCellsTransformation"
    // InternalDsl.g:1037:1: ruleSetCellsTransformation : ( ( rule__SetCellsTransformation__Group__0 ) ) ;
    public final void ruleSetCellsTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1041:2: ( ( ( rule__SetCellsTransformation__Group__0 ) ) )
            // InternalDsl.g:1042:2: ( ( rule__SetCellsTransformation__Group__0 ) )
            {
            // InternalDsl.g:1042:2: ( ( rule__SetCellsTransformation__Group__0 ) )
            // InternalDsl.g:1043:3: ( rule__SetCellsTransformation__Group__0 )
            {
             before(grammarAccess.getSetCellsTransformationAccess().getGroup()); 
            // InternalDsl.g:1044:3: ( rule__SetCellsTransformation__Group__0 )
            // InternalDsl.g:1044:4: rule__SetCellsTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetCellsTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetCellsTransformation"


    // $ANTLR start "entryRuleCellTransformation"
    // InternalDsl.g:1053:1: entryRuleCellTransformation : ruleCellTransformation EOF ;
    public final void entryRuleCellTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:1054:1: ( ruleCellTransformation EOF )
            // InternalDsl.g:1055:1: ruleCellTransformation EOF
            {
             before(grammarAccess.getCellTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleCellTransformation();

            state._fsp--;

             after(grammarAccess.getCellTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellTransformation"


    // $ANTLR start "ruleCellTransformation"
    // InternalDsl.g:1062:1: ruleCellTransformation : ( ( rule__CellTransformation__Alternatives ) ) ;
    public final void ruleCellTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1066:2: ( ( ( rule__CellTransformation__Alternatives ) ) )
            // InternalDsl.g:1067:2: ( ( rule__CellTransformation__Alternatives ) )
            {
            // InternalDsl.g:1067:2: ( ( rule__CellTransformation__Alternatives ) )
            // InternalDsl.g:1068:3: ( rule__CellTransformation__Alternatives )
            {
             before(grammarAccess.getCellTransformationAccess().getAlternatives()); 
            // InternalDsl.g:1069:3: ( rule__CellTransformation__Alternatives )
            // InternalDsl.g:1069:4: rule__CellTransformation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CellTransformation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellTransformationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellTransformation"


    // $ANTLR start "entryRuleSelectRowsTransformation"
    // InternalDsl.g:1078:1: entryRuleSelectRowsTransformation : ruleSelectRowsTransformation EOF ;
    public final void entryRuleSelectRowsTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:1079:1: ( ruleSelectRowsTransformation EOF )
            // InternalDsl.g:1080:1: ruleSelectRowsTransformation EOF
            {
             before(grammarAccess.getSelectRowsTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectRowsTransformation();

            state._fsp--;

             after(grammarAccess.getSelectRowsTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectRowsTransformation"


    // $ANTLR start "ruleSelectRowsTransformation"
    // InternalDsl.g:1087:1: ruleSelectRowsTransformation : ( ( rule__SelectRowsTransformation__Group__0 ) ) ;
    public final void ruleSelectRowsTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1091:2: ( ( ( rule__SelectRowsTransformation__Group__0 ) ) )
            // InternalDsl.g:1092:2: ( ( rule__SelectRowsTransformation__Group__0 ) )
            {
            // InternalDsl.g:1092:2: ( ( rule__SelectRowsTransformation__Group__0 ) )
            // InternalDsl.g:1093:3: ( rule__SelectRowsTransformation__Group__0 )
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getGroup()); 
            // InternalDsl.g:1094:3: ( rule__SelectRowsTransformation__Group__0 )
            // InternalDsl.g:1094:4: rule__SelectRowsTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectRowsTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectRowsTransformation"


    // $ANTLR start "entryRuleSortRowsTransformation"
    // InternalDsl.g:1103:1: entryRuleSortRowsTransformation : ruleSortRowsTransformation EOF ;
    public final void entryRuleSortRowsTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:1104:1: ( ruleSortRowsTransformation EOF )
            // InternalDsl.g:1105:1: ruleSortRowsTransformation EOF
            {
             before(grammarAccess.getSortRowsTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleSortRowsTransformation();

            state._fsp--;

             after(grammarAccess.getSortRowsTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSortRowsTransformation"


    // $ANTLR start "ruleSortRowsTransformation"
    // InternalDsl.g:1112:1: ruleSortRowsTransformation : ( ( rule__SortRowsTransformation__Group__0 ) ) ;
    public final void ruleSortRowsTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1116:2: ( ( ( rule__SortRowsTransformation__Group__0 ) ) )
            // InternalDsl.g:1117:2: ( ( rule__SortRowsTransformation__Group__0 ) )
            {
            // InternalDsl.g:1117:2: ( ( rule__SortRowsTransformation__Group__0 ) )
            // InternalDsl.g:1118:3: ( rule__SortRowsTransformation__Group__0 )
            {
             before(grammarAccess.getSortRowsTransformationAccess().getGroup()); 
            // InternalDsl.g:1119:3: ( rule__SortRowsTransformation__Group__0 )
            // InternalDsl.g:1119:4: rule__SortRowsTransformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSortRowsTransformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSortRowsTransformation"


    // $ANTLR start "entryRuleRowTransformation"
    // InternalDsl.g:1128:1: entryRuleRowTransformation : ruleRowTransformation EOF ;
    public final void entryRuleRowTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:1129:1: ( ruleRowTransformation EOF )
            // InternalDsl.g:1130:1: ruleRowTransformation EOF
            {
             before(grammarAccess.getRowTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleRowTransformation();

            state._fsp--;

             after(grammarAccess.getRowTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRowTransformation"


    // $ANTLR start "ruleRowTransformation"
    // InternalDsl.g:1137:1: ruleRowTransformation : ( ( rule__RowTransformation__Alternatives ) ) ;
    public final void ruleRowTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1141:2: ( ( ( rule__RowTransformation__Alternatives ) ) )
            // InternalDsl.g:1142:2: ( ( rule__RowTransformation__Alternatives ) )
            {
            // InternalDsl.g:1142:2: ( ( rule__RowTransformation__Alternatives ) )
            // InternalDsl.g:1143:3: ( rule__RowTransformation__Alternatives )
            {
             before(grammarAccess.getRowTransformationAccess().getAlternatives()); 
            // InternalDsl.g:1144:3: ( rule__RowTransformation__Alternatives )
            // InternalDsl.g:1144:4: rule__RowTransformation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RowTransformation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRowTransformationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRowTransformation"


    // $ANTLR start "entryRuleTransformation"
    // InternalDsl.g:1153:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // InternalDsl.g:1154:1: ( ruleTransformation EOF )
            // InternalDsl.g:1155:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalDsl.g:1162:1: ruleTransformation : ( ( rule__Transformation__Alternatives ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1166:2: ( ( ( rule__Transformation__Alternatives ) ) )
            // InternalDsl.g:1167:2: ( ( rule__Transformation__Alternatives ) )
            {
            // InternalDsl.g:1167:2: ( ( rule__Transformation__Alternatives ) )
            // InternalDsl.g:1168:3: ( rule__Transformation__Alternatives )
            {
             before(grammarAccess.getTransformationAccess().getAlternatives()); 
            // InternalDsl.g:1169:3: ( rule__Transformation__Alternatives )
            // InternalDsl.g:1169:4: rule__Transformation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRulePipeline"
    // InternalDsl.g:1178:1: entryRulePipeline : rulePipeline EOF ;
    public final void entryRulePipeline() throws RecognitionException {
        try {
            // InternalDsl.g:1179:1: ( rulePipeline EOF )
            // InternalDsl.g:1180:1: rulePipeline EOF
            {
             before(grammarAccess.getPipelineRule()); 
            pushFollow(FOLLOW_1);
            rulePipeline();

            state._fsp--;

             after(grammarAccess.getPipelineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePipeline"


    // $ANTLR start "rulePipeline"
    // InternalDsl.g:1187:1: rulePipeline : ( ( rule__Pipeline__Group__0 ) ) ;
    public final void rulePipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1191:2: ( ( ( rule__Pipeline__Group__0 ) ) )
            // InternalDsl.g:1192:2: ( ( rule__Pipeline__Group__0 ) )
            {
            // InternalDsl.g:1192:2: ( ( rule__Pipeline__Group__0 ) )
            // InternalDsl.g:1193:3: ( rule__Pipeline__Group__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup()); 
            // InternalDsl.g:1194:3: ( rule__Pipeline__Group__0 )
            // InternalDsl.g:1194:4: rule__Pipeline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleExport"
    // InternalDsl.g:1203:1: entryRuleExport : ruleExport EOF ;
    public final void entryRuleExport() throws RecognitionException {
        try {
            // InternalDsl.g:1204:1: ( ruleExport EOF )
            // InternalDsl.g:1205:1: ruleExport EOF
            {
             before(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getExportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalDsl.g:1212:1: ruleExport : ( ( rule__Export__Group__0 ) ) ;
    public final void ruleExport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1216:2: ( ( ( rule__Export__Group__0 ) ) )
            // InternalDsl.g:1217:2: ( ( rule__Export__Group__0 ) )
            {
            // InternalDsl.g:1217:2: ( ( rule__Export__Group__0 ) )
            // InternalDsl.g:1218:3: ( rule__Export__Group__0 )
            {
             before(grammarAccess.getExportAccess().getGroup()); 
            // InternalDsl.g:1219:3: ( rule__Export__Group__0 )
            // InternalDsl.g:1219:4: rule__Export__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Export__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExport"


    // $ANTLR start "rule__Assignment__ExpressionAlternatives_2_0"
    // InternalDsl.g:1227:1: rule__Assignment__ExpressionAlternatives_2_0 : ( ( rulePipeline ) | ( ruleSource ) | ( ruleTable ) );
    public final void rule__Assignment__ExpressionAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1231:1: ( ( rulePipeline ) | ( ruleSource ) | ( ruleTable ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
            case 11:
            case 12:
            case 23:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDsl.g:1232:2: ( rulePipeline )
                    {
                    // InternalDsl.g:1232:2: ( rulePipeline )
                    // InternalDsl.g:1233:3: rulePipeline
                    {
                     before(grammarAccess.getAssignmentAccess().getExpressionPipelineParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePipeline();

                    state._fsp--;

                     after(grammarAccess.getAssignmentAccess().getExpressionPipelineParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1238:2: ( ruleSource )
                    {
                    // InternalDsl.g:1238:2: ( ruleSource )
                    // InternalDsl.g:1239:3: ruleSource
                    {
                     before(grammarAccess.getAssignmentAccess().getExpressionSourceParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSource();

                    state._fsp--;

                     after(grammarAccess.getAssignmentAccess().getExpressionSourceParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1244:2: ( ruleTable )
                    {
                    // InternalDsl.g:1244:2: ( ruleTable )
                    // InternalDsl.g:1245:3: ruleTable
                    {
                     before(grammarAccess.getAssignmentAccess().getExpressionTableParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getAssignmentAccess().getExpressionTableParserRuleCall_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpressionAlternatives_2_0"


    // $ANTLR start "rule__CombinationOperations__OperationAlternatives_0_0"
    // InternalDsl.g:1254:1: rule__CombinationOperations__OperationAlternatives_0_0 : ( ( 'merge' ) | ( 'append' ) );
    public final void rule__CombinationOperations__OperationAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1258:1: ( ( 'merge' ) | ( 'append' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:1259:2: ( 'merge' )
                    {
                    // InternalDsl.g:1259:2: ( 'merge' )
                    // InternalDsl.g:1260:3: 'merge'
                    {
                     before(grammarAccess.getCombinationOperationsAccess().getOperationMergeKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCombinationOperationsAccess().getOperationMergeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1265:2: ( 'append' )
                    {
                    // InternalDsl.g:1265:2: ( 'append' )
                    // InternalDsl.g:1266:3: 'append'
                    {
                     before(grammarAccess.getCombinationOperationsAccess().getOperationAppendKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCombinationOperationsAccess().getOperationAppendKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__OperationAlternatives_0_0"


    // $ANTLR start "rule__CombinationOperations__TypeAlternatives_1_0"
    // InternalDsl.g:1275:1: rule__CombinationOperations__TypeAlternatives_1_0 : ( ( 'union' ) | ( 'intersection' ) );
    public final void rule__CombinationOperations__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( ( 'union' ) | ( 'intersection' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:1280:2: ( 'union' )
                    {
                    // InternalDsl.g:1280:2: ( 'union' )
                    // InternalDsl.g:1281:3: 'union'
                    {
                     before(grammarAccess.getCombinationOperationsAccess().getTypeUnionKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCombinationOperationsAccess().getTypeUnionKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1286:2: ( 'intersection' )
                    {
                    // InternalDsl.g:1286:2: ( 'intersection' )
                    // InternalDsl.g:1287:3: 'intersection'
                    {
                     before(grammarAccess.getCombinationOperationsAccess().getTypeIntersectionKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCombinationOperationsAccess().getTypeIntersectionKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__TypeAlternatives_1_0"


    // $ANTLR start "rule__TableOperations__OperationAlternatives_0_0"
    // InternalDsl.g:1296:1: rule__TableOperations__OperationAlternatives_0_0 : ( ( ruleSourceOperation ) | ( ruleCombinationOperations ) );
    public final void rule__TableOperations__OperationAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1300:1: ( ( ruleSourceOperation ) | ( ruleCombinationOperations ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==23) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:1301:2: ( ruleSourceOperation )
                    {
                    // InternalDsl.g:1301:2: ( ruleSourceOperation )
                    // InternalDsl.g:1302:3: ruleSourceOperation
                    {
                     before(grammarAccess.getTableOperationsAccess().getOperationSourceOperationParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceOperation();

                    state._fsp--;

                     after(grammarAccess.getTableOperationsAccess().getOperationSourceOperationParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1307:2: ( ruleCombinationOperations )
                    {
                    // InternalDsl.g:1307:2: ( ruleCombinationOperations )
                    // InternalDsl.g:1308:3: ruleCombinationOperations
                    {
                     before(grammarAccess.getTableOperationsAccess().getOperationCombinationOperationsParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCombinationOperations();

                    state._fsp--;

                     after(grammarAccess.getTableOperationsAccess().getOperationCombinationOperationsParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOperations__OperationAlternatives_0_0"


    // $ANTLR start "rule__SourceOperation__SourceAlternatives_0"
    // InternalDsl.g:1317:1: rule__SourceOperation__SourceAlternatives_0 : ( ( ruleSelectSource ) | ( ruleInlineSource ) );
    public final void rule__SourceOperation__SourceAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1321:1: ( ( ruleSelectSource ) | ( ruleInlineSource ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:1322:2: ( ruleSelectSource )
                    {
                    // InternalDsl.g:1322:2: ( ruleSelectSource )
                    // InternalDsl.g:1323:3: ruleSelectSource
                    {
                     before(grammarAccess.getSourceOperationAccess().getSourceSelectSourceParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectSource();

                    state._fsp--;

                     after(grammarAccess.getSourceOperationAccess().getSourceSelectSourceParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1328:2: ( ruleInlineSource )
                    {
                    // InternalDsl.g:1328:2: ( ruleInlineSource )
                    // InternalDsl.g:1329:3: ruleInlineSource
                    {
                     before(grammarAccess.getSourceOperationAccess().getSourceInlineSourceParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInlineSource();

                    state._fsp--;

                     after(grammarAccess.getSourceOperationAccess().getSourceInlineSourceParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOperation__SourceAlternatives_0"


    // $ANTLR start "rule__PipelineTableOperation__PipelineAlternatives_0"
    // InternalDsl.g:1338:1: rule__PipelineTableOperation__PipelineAlternatives_0 : ( ( ruleSelectPipeline ) | ( ruleInlinePipeline ) );
    public final void rule__PipelineTableOperation__PipelineAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1342:1: ( ( ruleSelectPipeline ) | ( ruleInlinePipeline ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:1343:2: ( ruleSelectPipeline )
                    {
                    // InternalDsl.g:1343:2: ( ruleSelectPipeline )
                    // InternalDsl.g:1344:3: ruleSelectPipeline
                    {
                     before(grammarAccess.getPipelineTableOperationAccess().getPipelineSelectPipelineParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectPipeline();

                    state._fsp--;

                     after(grammarAccess.getPipelineTableOperationAccess().getPipelineSelectPipelineParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1349:2: ( ruleInlinePipeline )
                    {
                    // InternalDsl.g:1349:2: ( ruleInlinePipeline )
                    // InternalDsl.g:1350:3: ruleInlinePipeline
                    {
                     before(grammarAccess.getPipelineTableOperationAccess().getPipelineInlinePipelineParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInlinePipeline();

                    state._fsp--;

                     after(grammarAccess.getPipelineTableOperationAccess().getPipelineInlinePipelineParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PipelineTableOperation__PipelineAlternatives_0"


    // $ANTLR start "rule__TransformOperation__OperationAlternatives_1_0"
    // InternalDsl.g:1359:1: rule__TransformOperation__OperationAlternatives_1_0 : ( ( ruleTransformationTableOperation ) | ( rulePipelineTableOperation ) );
    public final void rule__TransformOperation__OperationAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1363:1: ( ( ruleTransformationTableOperation ) | ( rulePipelineTableOperation ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==68) ) {
                    alt7=2;
                }
                else if ( (LA7_1==12||LA7_1==40||LA7_1==44||LA7_1==46||LA7_1==48||LA7_1==53||(LA7_1>=55 && LA7_1<=56)||LA7_1==58||LA7_1==60||LA7_1==67) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:1364:2: ( ruleTransformationTableOperation )
                    {
                    // InternalDsl.g:1364:2: ( ruleTransformationTableOperation )
                    // InternalDsl.g:1365:3: ruleTransformationTableOperation
                    {
                     before(grammarAccess.getTransformOperationAccess().getOperationTransformationTableOperationParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTransformationTableOperation();

                    state._fsp--;

                     after(grammarAccess.getTransformOperationAccess().getOperationTransformationTableOperationParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1370:2: ( rulePipelineTableOperation )
                    {
                    // InternalDsl.g:1370:2: ( rulePipelineTableOperation )
                    // InternalDsl.g:1371:3: rulePipelineTableOperation
                    {
                     before(grammarAccess.getTransformOperationAccess().getOperationPipelineTableOperationParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePipelineTableOperation();

                    state._fsp--;

                     after(grammarAccess.getTransformOperationAccess().getOperationPipelineTableOperationParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__OperationAlternatives_1_0"


    // $ANTLR start "rule__InputType__Alternatives"
    // InternalDsl.g:1380:1: rule__InputType__Alternatives : ( ( ruleJsonType ) | ( ruleXmlType ) | ( ruleCsvType ) | ( ruleYamlType ) | ( ruleAutoType ) );
    public final void rule__InputType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1384:1: ( ( ruleJsonType ) | ( ruleXmlType ) | ( ruleCsvType ) | ( ruleYamlType ) | ( ruleAutoType ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1385:2: ( ruleJsonType )
                    {
                    // InternalDsl.g:1385:2: ( ruleJsonType )
                    // InternalDsl.g:1386:3: ruleJsonType
                    {
                     before(grammarAccess.getInputTypeAccess().getJsonTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonType();

                    state._fsp--;

                     after(grammarAccess.getInputTypeAccess().getJsonTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1391:2: ( ruleXmlType )
                    {
                    // InternalDsl.g:1391:2: ( ruleXmlType )
                    // InternalDsl.g:1392:3: ruleXmlType
                    {
                     before(grammarAccess.getInputTypeAccess().getXmlTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXmlType();

                    state._fsp--;

                     after(grammarAccess.getInputTypeAccess().getXmlTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1397:2: ( ruleCsvType )
                    {
                    // InternalDsl.g:1397:2: ( ruleCsvType )
                    // InternalDsl.g:1398:3: ruleCsvType
                    {
                     before(grammarAccess.getInputTypeAccess().getCsvTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCsvType();

                    state._fsp--;

                     after(grammarAccess.getInputTypeAccess().getCsvTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1403:2: ( ruleYamlType )
                    {
                    // InternalDsl.g:1403:2: ( ruleYamlType )
                    // InternalDsl.g:1404:3: ruleYamlType
                    {
                     before(grammarAccess.getInputTypeAccess().getYamlTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleYamlType();

                    state._fsp--;

                     after(grammarAccess.getInputTypeAccess().getYamlTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1409:2: ( ruleAutoType )
                    {
                    // InternalDsl.g:1409:2: ( ruleAutoType )
                    // InternalDsl.g:1410:3: ruleAutoType
                    {
                     before(grammarAccess.getInputTypeAccess().getAutoTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAutoType();

                    state._fsp--;

                     after(grammarAccess.getInputTypeAccess().getAutoTypeParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputType__Alternatives"


    // $ANTLR start "rule__OutputType__TypeAlternatives_0"
    // InternalDsl.g:1419:1: rule__OutputType__TypeAlternatives_0 : ( ( ruleHtmlType ) | ( ruleAutoType ) | ( ruleCsvType ) );
    public final void rule__OutputType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1423:1: ( ( ruleHtmlType ) | ( ruleAutoType ) | ( ruleCsvType ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1424:2: ( ruleHtmlType )
                    {
                    // InternalDsl.g:1424:2: ( ruleHtmlType )
                    // InternalDsl.g:1425:3: ruleHtmlType
                    {
                     before(grammarAccess.getOutputTypeAccess().getTypeHtmlTypeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHtmlType();

                    state._fsp--;

                     after(grammarAccess.getOutputTypeAccess().getTypeHtmlTypeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1430:2: ( ruleAutoType )
                    {
                    // InternalDsl.g:1430:2: ( ruleAutoType )
                    // InternalDsl.g:1431:3: ruleAutoType
                    {
                     before(grammarAccess.getOutputTypeAccess().getTypeAutoTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAutoType();

                    state._fsp--;

                     after(grammarAccess.getOutputTypeAccess().getTypeAutoTypeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1436:2: ( ruleCsvType )
                    {
                    // InternalDsl.g:1436:2: ( ruleCsvType )
                    // InternalDsl.g:1437:3: ruleCsvType
                    {
                     before(grammarAccess.getOutputTypeAccess().getTypeCsvTypeParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCsvType();

                    state._fsp--;

                     after(grammarAccess.getOutputTypeAccess().getTypeCsvTypeParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputType__TypeAlternatives_0"


    // $ANTLR start "rule__MetaData__MetadataAlternatives_0"
    // InternalDsl.g:1446:1: rule__MetaData__MetadataAlternatives_0 : ( ( 'filepath' ) | ( 'lastmodified' ) );
    public final void rule__MetaData__MetadataAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1450:1: ( ( 'filepath' ) | ( 'lastmodified' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1451:2: ( 'filepath' )
                    {
                    // InternalDsl.g:1451:2: ( 'filepath' )
                    // InternalDsl.g:1452:3: 'filepath'
                    {
                     before(grammarAccess.getMetaDataAccess().getMetadataFilepathKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMetaDataAccess().getMetadataFilepathKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1457:2: ( 'lastmodified' )
                    {
                    // InternalDsl.g:1457:2: ( 'lastmodified' )
                    // InternalDsl.g:1458:3: 'lastmodified'
                    {
                     before(grammarAccess.getMetaDataAccess().getMetadataLastmodifiedKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMetaDataAccess().getMetadataLastmodifiedKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__MetadataAlternatives_0"


    // $ANTLR start "rule__PathTransformation__OperationAlternatives_0_0"
    // InternalDsl.g:1467:1: rule__PathTransformation__OperationAlternatives_0_0 : ( ( ruleAppendPathTransformation ) | ( ruleCanonicalizePathTransformation ) | ( ruleGetPathTransformation ) );
    public final void rule__PathTransformation__OperationAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1471:1: ( ( ruleAppendPathTransformation ) | ( ruleCanonicalizePathTransformation ) | ( ruleGetPathTransformation ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt11=1;
                }
                break;
            case 44:
                {
                alt11=2;
                }
                break;
            case 46:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1472:2: ( ruleAppendPathTransformation )
                    {
                    // InternalDsl.g:1472:2: ( ruleAppendPathTransformation )
                    // InternalDsl.g:1473:3: ruleAppendPathTransformation
                    {
                     before(grammarAccess.getPathTransformationAccess().getOperationAppendPathTransformationParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAppendPathTransformation();

                    state._fsp--;

                     after(grammarAccess.getPathTransformationAccess().getOperationAppendPathTransformationParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1478:2: ( ruleCanonicalizePathTransformation )
                    {
                    // InternalDsl.g:1478:2: ( ruleCanonicalizePathTransformation )
                    // InternalDsl.g:1479:3: ruleCanonicalizePathTransformation
                    {
                     before(grammarAccess.getPathTransformationAccess().getOperationCanonicalizePathTransformationParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCanonicalizePathTransformation();

                    state._fsp--;

                     after(grammarAccess.getPathTransformationAccess().getOperationCanonicalizePathTransformationParserRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1484:2: ( ruleGetPathTransformation )
                    {
                    // InternalDsl.g:1484:2: ( ruleGetPathTransformation )
                    // InternalDsl.g:1485:3: ruleGetPathTransformation
                    {
                     before(grammarAccess.getPathTransformationAccess().getOperationGetPathTransformationParserRuleCall_0_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGetPathTransformation();

                    state._fsp--;

                     after(grammarAccess.getPathTransformationAccess().getOperationGetPathTransformationParserRuleCall_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__OperationAlternatives_0_0"


    // $ANTLR start "rule__FoldTransformation__OperationAlternatives_0_0"
    // InternalDsl.g:1494:1: rule__FoldTransformation__OperationAlternatives_0_0 : ( ( ruleFoldSumTranformation ) | ( ruleFoldAverageTranformation ) );
    public final void rule__FoldTransformation__OperationAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1498:1: ( ( ruleFoldSumTranformation ) | ( ruleFoldAverageTranformation ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==50) ) {
                    alt12=1;
                }
                else if ( (LA12_1==49) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1499:2: ( ruleFoldSumTranformation )
                    {
                    // InternalDsl.g:1499:2: ( ruleFoldSumTranformation )
                    // InternalDsl.g:1500:3: ruleFoldSumTranformation
                    {
                     before(grammarAccess.getFoldTransformationAccess().getOperationFoldSumTranformationParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFoldSumTranformation();

                    state._fsp--;

                     after(grammarAccess.getFoldTransformationAccess().getOperationFoldSumTranformationParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1505:2: ( ruleFoldAverageTranformation )
                    {
                    // InternalDsl.g:1505:2: ( ruleFoldAverageTranformation )
                    // InternalDsl.g:1506:3: ruleFoldAverageTranformation
                    {
                     before(grammarAccess.getFoldTransformationAccess().getOperationFoldAverageTranformationParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFoldAverageTranformation();

                    state._fsp--;

                     after(grammarAccess.getFoldTransformationAccess().getOperationFoldAverageTranformationParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldTransformation__OperationAlternatives_0_0"


    // $ANTLR start "rule__ColumnTransformation__Alternatives"
    // InternalDsl.g:1515:1: rule__ColumnTransformation__Alternatives : ( ( ruleAddColumnTransformation ) | ( ruleRemoveColumnTransformation ) | ( ruleRenameColumnTransformation ) | ( ruleSelectColumnTransformation ) );
    public final void rule__ColumnTransformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1519:1: ( ( ruleAddColumnTransformation ) | ( ruleRemoveColumnTransformation ) | ( ruleRenameColumnTransformation ) | ( ruleSelectColumnTransformation ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt13=1;
                }
                break;
            case 55:
                {
                alt13=2;
                }
                break;
            case 56:
                {
                alt13=3;
                }
                break;
            case 40:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1520:2: ( ruleAddColumnTransformation )
                    {
                    // InternalDsl.g:1520:2: ( ruleAddColumnTransformation )
                    // InternalDsl.g:1521:3: ruleAddColumnTransformation
                    {
                     before(grammarAccess.getColumnTransformationAccess().getAddColumnTransformationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddColumnTransformation();

                    state._fsp--;

                     after(grammarAccess.getColumnTransformationAccess().getAddColumnTransformationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1526:2: ( ruleRemoveColumnTransformation )
                    {
                    // InternalDsl.g:1526:2: ( ruleRemoveColumnTransformation )
                    // InternalDsl.g:1527:3: ruleRemoveColumnTransformation
                    {
                     before(grammarAccess.getColumnTransformationAccess().getRemoveColumnTransformationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRemoveColumnTransformation();

                    state._fsp--;

                     after(grammarAccess.getColumnTransformationAccess().getRemoveColumnTransformationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1532:2: ( ruleRenameColumnTransformation )
                    {
                    // InternalDsl.g:1532:2: ( ruleRenameColumnTransformation )
                    // InternalDsl.g:1533:3: ruleRenameColumnTransformation
                    {
                     before(grammarAccess.getColumnTransformationAccess().getRenameColumnTransformationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameColumnTransformation();

                    state._fsp--;

                     after(grammarAccess.getColumnTransformationAccess().getRenameColumnTransformationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1538:2: ( ruleSelectColumnTransformation )
                    {
                    // InternalDsl.g:1538:2: ( ruleSelectColumnTransformation )
                    // InternalDsl.g:1539:3: ruleSelectColumnTransformation
                    {
                     before(grammarAccess.getColumnTransformationAccess().getSelectColumnTransformationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectColumnTransformation();

                    state._fsp--;

                     after(grammarAccess.getColumnTransformationAccess().getSelectColumnTransformationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnTransformation__Alternatives"


    // $ANTLR start "rule__CellTransformation__Alternatives"
    // InternalDsl.g:1548:1: rule__CellTransformation__Alternatives : ( ( ruleRoundCellsTransformation ) | ( ruleSetCellsTransformation ) );
    public final void rule__CellTransformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1552:1: ( ( ruleRoundCellsTransformation ) | ( ruleSetCellsTransformation ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==58) ) {
                alt14=1;
            }
            else if ( (LA14_0==60) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1553:2: ( ruleRoundCellsTransformation )
                    {
                    // InternalDsl.g:1553:2: ( ruleRoundCellsTransformation )
                    // InternalDsl.g:1554:3: ruleRoundCellsTransformation
                    {
                     before(grammarAccess.getCellTransformationAccess().getRoundCellsTransformationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoundCellsTransformation();

                    state._fsp--;

                     after(grammarAccess.getCellTransformationAccess().getRoundCellsTransformationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1559:2: ( ruleSetCellsTransformation )
                    {
                    // InternalDsl.g:1559:2: ( ruleSetCellsTransformation )
                    // InternalDsl.g:1560:3: ruleSetCellsTransformation
                    {
                     before(grammarAccess.getCellTransformationAccess().getSetCellsTransformationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSetCellsTransformation();

                    state._fsp--;

                     after(grammarAccess.getCellTransformationAccess().getSetCellsTransformationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellTransformation__Alternatives"


    // $ANTLR start "rule__SortRowsTransformation__OrderAlternatives_7_0"
    // InternalDsl.g:1569:1: rule__SortRowsTransformation__OrderAlternatives_7_0 : ( ( 'descending' ) | ( 'ascending' ) );
    public final void rule__SortRowsTransformation__OrderAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1573:1: ( ( 'descending' ) | ( 'ascending' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            else if ( (LA15_0==18) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1574:2: ( 'descending' )
                    {
                    // InternalDsl.g:1574:2: ( 'descending' )
                    // InternalDsl.g:1575:3: 'descending'
                    {
                     before(grammarAccess.getSortRowsTransformationAccess().getOrderDescendingKeyword_7_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSortRowsTransformationAccess().getOrderDescendingKeyword_7_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1580:2: ( 'ascending' )
                    {
                    // InternalDsl.g:1580:2: ( 'ascending' )
                    // InternalDsl.g:1581:3: 'ascending'
                    {
                     before(grammarAccess.getSortRowsTransformationAccess().getOrderAscendingKeyword_7_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSortRowsTransformationAccess().getOrderAscendingKeyword_7_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__OrderAlternatives_7_0"


    // $ANTLR start "rule__RowTransformation__Alternatives"
    // InternalDsl.g:1590:1: rule__RowTransformation__Alternatives : ( ( ruleSortRowsTransformation ) | ( ruleSelectRowsTransformation ) );
    public final void rule__RowTransformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1594:1: ( ( ruleSortRowsTransformation ) | ( ruleSelectRowsTransformation ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==67) ) {
                alt16=1;
            }
            else if ( (LA16_0==40) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1595:2: ( ruleSortRowsTransformation )
                    {
                    // InternalDsl.g:1595:2: ( ruleSortRowsTransformation )
                    // InternalDsl.g:1596:3: ruleSortRowsTransformation
                    {
                     before(grammarAccess.getRowTransformationAccess().getSortRowsTransformationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSortRowsTransformation();

                    state._fsp--;

                     after(grammarAccess.getRowTransformationAccess().getSortRowsTransformationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1601:2: ( ruleSelectRowsTransformation )
                    {
                    // InternalDsl.g:1601:2: ( ruleSelectRowsTransformation )
                    // InternalDsl.g:1602:3: ruleSelectRowsTransformation
                    {
                     before(grammarAccess.getRowTransformationAccess().getSelectRowsTransformationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectRowsTransformation();

                    state._fsp--;

                     after(grammarAccess.getRowTransformationAccess().getSelectRowsTransformationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowTransformation__Alternatives"


    // $ANTLR start "rule__Transformation__Alternatives"
    // InternalDsl.g:1611:1: rule__Transformation__Alternatives : ( ( rulePathTransformation ) | ( ruleFoldTransformation ) | ( ruleColumnTransformation ) | ( ruleCellTransformation ) | ( ruleRowTransformation ) );
    public final void rule__Transformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1615:1: ( ( rulePathTransformation ) | ( ruleFoldTransformation ) | ( ruleColumnTransformation ) | ( ruleCellTransformation ) | ( ruleRowTransformation ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 12:
            case 44:
            case 46:
                {
                alt17=1;
                }
                break;
            case 48:
                {
                alt17=2;
                }
                break;
            case 53:
            case 55:
            case 56:
                {
                alt17=3;
                }
                break;
            case 40:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==RULE_INT) ) {
                    alt17=5;
                }
                else if ( (LA17_4==20) ) {
                    alt17=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case 58:
            case 60:
                {
                alt17=4;
                }
                break;
            case 67:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1616:2: ( rulePathTransformation )
                    {
                    // InternalDsl.g:1616:2: ( rulePathTransformation )
                    // InternalDsl.g:1617:3: rulePathTransformation
                    {
                     before(grammarAccess.getTransformationAccess().getPathTransformationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePathTransformation();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getPathTransformationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1622:2: ( ruleFoldTransformation )
                    {
                    // InternalDsl.g:1622:2: ( ruleFoldTransformation )
                    // InternalDsl.g:1623:3: ruleFoldTransformation
                    {
                     before(grammarAccess.getTransformationAccess().getFoldTransformationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFoldTransformation();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getFoldTransformationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1628:2: ( ruleColumnTransformation )
                    {
                    // InternalDsl.g:1628:2: ( ruleColumnTransformation )
                    // InternalDsl.g:1629:3: ruleColumnTransformation
                    {
                     before(grammarAccess.getTransformationAccess().getColumnTransformationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnTransformation();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getColumnTransformationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1634:2: ( ruleCellTransformation )
                    {
                    // InternalDsl.g:1634:2: ( ruleCellTransformation )
                    // InternalDsl.g:1635:3: ruleCellTransformation
                    {
                     before(grammarAccess.getTransformationAccess().getCellTransformationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCellTransformation();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getCellTransformationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1640:2: ( ruleRowTransformation )
                    {
                    // InternalDsl.g:1640:2: ( ruleRowTransformation )
                    // InternalDsl.g:1641:3: ruleRowTransformation
                    {
                     before(grammarAccess.getTransformationAccess().getRowTransformationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRowTransformation();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getRowTransformationParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transformation__Alternatives"


    // $ANTLR start "rule__MyDsl__Group__0"
    // InternalDsl.g:1650:1: rule__MyDsl__Group__0 : rule__MyDsl__Group__0__Impl rule__MyDsl__Group__1 ;
    public final void rule__MyDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1654:1: ( rule__MyDsl__Group__0__Impl rule__MyDsl__Group__1 )
            // InternalDsl.g:1655:2: rule__MyDsl__Group__0__Impl rule__MyDsl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MyDsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyDsl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__Group__0"


    // $ANTLR start "rule__MyDsl__Group__0__Impl"
    // InternalDsl.g:1662:1: rule__MyDsl__Group__0__Impl : ( ( rule__MyDsl__AssignmentAssignment_0 )* ) ;
    public final void rule__MyDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1666:1: ( ( ( rule__MyDsl__AssignmentAssignment_0 )* ) )
            // InternalDsl.g:1667:1: ( ( rule__MyDsl__AssignmentAssignment_0 )* )
            {
            // InternalDsl.g:1667:1: ( ( rule__MyDsl__AssignmentAssignment_0 )* )
            // InternalDsl.g:1668:2: ( rule__MyDsl__AssignmentAssignment_0 )*
            {
             before(grammarAccess.getMyDslAccess().getAssignmentAssignment_0()); 
            // InternalDsl.g:1669:2: ( rule__MyDsl__AssignmentAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1669:3: rule__MyDsl__AssignmentAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MyDsl__AssignmentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMyDslAccess().getAssignmentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__Group__0__Impl"


    // $ANTLR start "rule__MyDsl__Group__1"
    // InternalDsl.g:1677:1: rule__MyDsl__Group__1 : rule__MyDsl__Group__1__Impl ;
    public final void rule__MyDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1681:1: ( rule__MyDsl__Group__1__Impl )
            // InternalDsl.g:1682:2: rule__MyDsl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyDsl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__Group__1"


    // $ANTLR start "rule__MyDsl__Group__1__Impl"
    // InternalDsl.g:1688:1: rule__MyDsl__Group__1__Impl : ( ( rule__MyDsl__ExportAssignment_1 )* ) ;
    public final void rule__MyDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1692:1: ( ( ( rule__MyDsl__ExportAssignment_1 )* ) )
            // InternalDsl.g:1693:1: ( ( rule__MyDsl__ExportAssignment_1 )* )
            {
            // InternalDsl.g:1693:1: ( ( rule__MyDsl__ExportAssignment_1 )* )
            // InternalDsl.g:1694:2: ( rule__MyDsl__ExportAssignment_1 )*
            {
             before(grammarAccess.getMyDslAccess().getExportAssignment_1()); 
            // InternalDsl.g:1695:2: ( rule__MyDsl__ExportAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==69) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:1695:3: rule__MyDsl__ExportAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MyDsl__ExportAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMyDslAccess().getExportAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalDsl.g:1704:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1708:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalDsl.g:1709:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalDsl.g:1716:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1720:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // InternalDsl.g:1721:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // InternalDsl.g:1721:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // InternalDsl.g:1722:2: ( rule__Assignment__NameAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            // InternalDsl.g:1723:2: ( rule__Assignment__NameAssignment_0 )
            // InternalDsl.g:1723:3: rule__Assignment__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalDsl.g:1731:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1735:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalDsl.g:1736:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalDsl.g:1743:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1747:1: ( ( '=' ) )
            // InternalDsl.g:1748:1: ( '=' )
            {
            // InternalDsl.g:1748:1: ( '=' )
            // InternalDsl.g:1749:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalDsl.g:1758:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1762:1: ( rule__Assignment__Group__2__Impl )
            // InternalDsl.g:1763:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalDsl.g:1769:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1773:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // InternalDsl.g:1774:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // InternalDsl.g:1774:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // InternalDsl.g:1775:2: ( rule__Assignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            // InternalDsl.g:1776:2: ( rule__Assignment__ExpressionAssignment_2 )
            // InternalDsl.g:1776:3: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__CombinationOperations__Group__0"
    // InternalDsl.g:1785:1: rule__CombinationOperations__Group__0 : rule__CombinationOperations__Group__0__Impl rule__CombinationOperations__Group__1 ;
    public final void rule__CombinationOperations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1789:1: ( rule__CombinationOperations__Group__0__Impl rule__CombinationOperations__Group__1 )
            // InternalDsl.g:1790:2: rule__CombinationOperations__Group__0__Impl rule__CombinationOperations__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CombinationOperations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__0"


    // $ANTLR start "rule__CombinationOperations__Group__0__Impl"
    // InternalDsl.g:1797:1: rule__CombinationOperations__Group__0__Impl : ( ( rule__CombinationOperations__OperationAssignment_0 ) ) ;
    public final void rule__CombinationOperations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1801:1: ( ( ( rule__CombinationOperations__OperationAssignment_0 ) ) )
            // InternalDsl.g:1802:1: ( ( rule__CombinationOperations__OperationAssignment_0 ) )
            {
            // InternalDsl.g:1802:1: ( ( rule__CombinationOperations__OperationAssignment_0 ) )
            // InternalDsl.g:1803:2: ( rule__CombinationOperations__OperationAssignment_0 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getOperationAssignment_0()); 
            // InternalDsl.g:1804:2: ( rule__CombinationOperations__OperationAssignment_0 )
            // InternalDsl.g:1804:3: rule__CombinationOperations__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CombinationOperations__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCombinationOperationsAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__0__Impl"


    // $ANTLR start "rule__CombinationOperations__Group__1"
    // InternalDsl.g:1812:1: rule__CombinationOperations__Group__1 : rule__CombinationOperations__Group__1__Impl rule__CombinationOperations__Group__2 ;
    public final void rule__CombinationOperations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1816:1: ( rule__CombinationOperations__Group__1__Impl rule__CombinationOperations__Group__2 )
            // InternalDsl.g:1817:2: rule__CombinationOperations__Group__1__Impl rule__CombinationOperations__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CombinationOperations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__1"


    // $ANTLR start "rule__CombinationOperations__Group__1__Impl"
    // InternalDsl.g:1824:1: rule__CombinationOperations__Group__1__Impl : ( ( rule__CombinationOperations__TypeAssignment_1 )? ) ;
    public final void rule__CombinationOperations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1828:1: ( ( ( rule__CombinationOperations__TypeAssignment_1 )? ) )
            // InternalDsl.g:1829:1: ( ( rule__CombinationOperations__TypeAssignment_1 )? )
            {
            // InternalDsl.g:1829:1: ( ( rule__CombinationOperations__TypeAssignment_1 )? )
            // InternalDsl.g:1830:2: ( rule__CombinationOperations__TypeAssignment_1 )?
            {
             before(grammarAccess.getCombinationOperationsAccess().getTypeAssignment_1()); 
            // InternalDsl.g:1831:2: ( rule__CombinationOperations__TypeAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=13 && LA20_0<=14)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1831:3: rule__CombinationOperations__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CombinationOperations__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCombinationOperationsAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__1__Impl"


    // $ANTLR start "rule__CombinationOperations__Group__2"
    // InternalDsl.g:1839:1: rule__CombinationOperations__Group__2 : rule__CombinationOperations__Group__2__Impl rule__CombinationOperations__Group__3 ;
    public final void rule__CombinationOperations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1843:1: ( rule__CombinationOperations__Group__2__Impl rule__CombinationOperations__Group__3 )
            // InternalDsl.g:1844:2: rule__CombinationOperations__Group__2__Impl rule__CombinationOperations__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__CombinationOperations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__2"


    // $ANTLR start "rule__CombinationOperations__Group__2__Impl"
    // InternalDsl.g:1851:1: rule__CombinationOperations__Group__2__Impl : ( '[' ) ;
    public final void rule__CombinationOperations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1855:1: ( ( '[' ) )
            // InternalDsl.g:1856:1: ( '[' )
            {
            // InternalDsl.g:1856:1: ( '[' )
            // InternalDsl.g:1857:2: '['
            {
             before(grammarAccess.getCombinationOperationsAccess().getLeftSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCombinationOperationsAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__2__Impl"


    // $ANTLR start "rule__CombinationOperations__Group__3"
    // InternalDsl.g:1866:1: rule__CombinationOperations__Group__3 : rule__CombinationOperations__Group__3__Impl rule__CombinationOperations__Group__4 ;
    public final void rule__CombinationOperations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1870:1: ( rule__CombinationOperations__Group__3__Impl rule__CombinationOperations__Group__4 )
            // InternalDsl.g:1871:2: rule__CombinationOperations__Group__3__Impl rule__CombinationOperations__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__CombinationOperations__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__3"


    // $ANTLR start "rule__CombinationOperations__Group__3__Impl"
    // InternalDsl.g:1878:1: rule__CombinationOperations__Group__3__Impl : ( ( rule__CombinationOperations__TableOperationAssignment_3 ) ) ;
    public final void rule__CombinationOperations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1882:1: ( ( ( rule__CombinationOperations__TableOperationAssignment_3 ) ) )
            // InternalDsl.g:1883:1: ( ( rule__CombinationOperations__TableOperationAssignment_3 ) )
            {
            // InternalDsl.g:1883:1: ( ( rule__CombinationOperations__TableOperationAssignment_3 ) )
            // InternalDsl.g:1884:2: ( rule__CombinationOperations__TableOperationAssignment_3 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_3()); 
            // InternalDsl.g:1885:2: ( rule__CombinationOperations__TableOperationAssignment_3 )
            // InternalDsl.g:1885:3: rule__CombinationOperations__TableOperationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CombinationOperations__TableOperationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__3__Impl"


    // $ANTLR start "rule__CombinationOperations__Group__4"
    // InternalDsl.g:1893:1: rule__CombinationOperations__Group__4 : rule__CombinationOperations__Group__4__Impl rule__CombinationOperations__Group__5 ;
    public final void rule__CombinationOperations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1897:1: ( rule__CombinationOperations__Group__4__Impl rule__CombinationOperations__Group__5 )
            // InternalDsl.g:1898:2: rule__CombinationOperations__Group__4__Impl rule__CombinationOperations__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__CombinationOperations__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__4"


    // $ANTLR start "rule__CombinationOperations__Group__4__Impl"
    // InternalDsl.g:1905:1: rule__CombinationOperations__Group__4__Impl : ( ( rule__CombinationOperations__Group_4__0 )* ) ;
    public final void rule__CombinationOperations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1909:1: ( ( ( rule__CombinationOperations__Group_4__0 )* ) )
            // InternalDsl.g:1910:1: ( ( rule__CombinationOperations__Group_4__0 )* )
            {
            // InternalDsl.g:1910:1: ( ( rule__CombinationOperations__Group_4__0 )* )
            // InternalDsl.g:1911:2: ( rule__CombinationOperations__Group_4__0 )*
            {
             before(grammarAccess.getCombinationOperationsAccess().getGroup_4()); 
            // InternalDsl.g:1912:2: ( rule__CombinationOperations__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_ID||(LA21_1>=11 && LA21_1<=12)||LA21_1==23) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1912:3: rule__CombinationOperations__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CombinationOperations__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCombinationOperationsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__4__Impl"


    // $ANTLR start "rule__CombinationOperations__Group__5"
    // InternalDsl.g:1920:1: rule__CombinationOperations__Group__5 : rule__CombinationOperations__Group__5__Impl rule__CombinationOperations__Group__6 ;
    public final void rule__CombinationOperations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1924:1: ( rule__CombinationOperations__Group__5__Impl rule__CombinationOperations__Group__6 )
            // InternalDsl.g:1925:2: rule__CombinationOperations__Group__5__Impl rule__CombinationOperations__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__CombinationOperations__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__5"


    // $ANTLR start "rule__CombinationOperations__Group__5__Impl"
    // InternalDsl.g:1932:1: rule__CombinationOperations__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__CombinationOperations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1936:1: ( ( ( ',' )? ) )
            // InternalDsl.g:1937:1: ( ( ',' )? )
            {
            // InternalDsl.g:1937:1: ( ( ',' )? )
            // InternalDsl.g:1938:2: ( ',' )?
            {
             before(grammarAccess.getCombinationOperationsAccess().getCommaKeyword_5()); 
            // InternalDsl.g:1939:2: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1939:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCombinationOperationsAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__5__Impl"


    // $ANTLR start "rule__CombinationOperations__Group__6"
    // InternalDsl.g:1947:1: rule__CombinationOperations__Group__6 : rule__CombinationOperations__Group__6__Impl ;
    public final void rule__CombinationOperations__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1951:1: ( rule__CombinationOperations__Group__6__Impl )
            // InternalDsl.g:1952:2: rule__CombinationOperations__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__6"


    // $ANTLR start "rule__CombinationOperations__Group__6__Impl"
    // InternalDsl.g:1958:1: rule__CombinationOperations__Group__6__Impl : ( ']' ) ;
    public final void rule__CombinationOperations__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1962:1: ( ( ']' ) )
            // InternalDsl.g:1963:1: ( ']' )
            {
            // InternalDsl.g:1963:1: ( ']' )
            // InternalDsl.g:1964:2: ']'
            {
             before(grammarAccess.getCombinationOperationsAccess().getRightSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCombinationOperationsAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group__6__Impl"


    // $ANTLR start "rule__CombinationOperations__Group_4__0"
    // InternalDsl.g:1974:1: rule__CombinationOperations__Group_4__0 : rule__CombinationOperations__Group_4__0__Impl rule__CombinationOperations__Group_4__1 ;
    public final void rule__CombinationOperations__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1978:1: ( rule__CombinationOperations__Group_4__0__Impl rule__CombinationOperations__Group_4__1 )
            // InternalDsl.g:1979:2: rule__CombinationOperations__Group_4__0__Impl rule__CombinationOperations__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__CombinationOperations__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group_4__0"


    // $ANTLR start "rule__CombinationOperations__Group_4__0__Impl"
    // InternalDsl.g:1986:1: rule__CombinationOperations__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CombinationOperations__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1990:1: ( ( ',' ) )
            // InternalDsl.g:1991:1: ( ',' )
            {
            // InternalDsl.g:1991:1: ( ',' )
            // InternalDsl.g:1992:2: ','
            {
             before(grammarAccess.getCombinationOperationsAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCombinationOperationsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group_4__0__Impl"


    // $ANTLR start "rule__CombinationOperations__Group_4__1"
    // InternalDsl.g:2001:1: rule__CombinationOperations__Group_4__1 : rule__CombinationOperations__Group_4__1__Impl ;
    public final void rule__CombinationOperations__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2005:1: ( rule__CombinationOperations__Group_4__1__Impl )
            // InternalDsl.g:2006:2: rule__CombinationOperations__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CombinationOperations__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group_4__1"


    // $ANTLR start "rule__CombinationOperations__Group_4__1__Impl"
    // InternalDsl.g:2012:1: rule__CombinationOperations__Group_4__1__Impl : ( ( rule__CombinationOperations__TableOperationAssignment_4_1 ) ) ;
    public final void rule__CombinationOperations__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2016:1: ( ( ( rule__CombinationOperations__TableOperationAssignment_4_1 ) ) )
            // InternalDsl.g:2017:1: ( ( rule__CombinationOperations__TableOperationAssignment_4_1 ) )
            {
            // InternalDsl.g:2017:1: ( ( rule__CombinationOperations__TableOperationAssignment_4_1 ) )
            // InternalDsl.g:2018:2: ( rule__CombinationOperations__TableOperationAssignment_4_1 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_4_1()); 
            // InternalDsl.g:2019:2: ( rule__CombinationOperations__TableOperationAssignment_4_1 )
            // InternalDsl.g:2019:3: rule__CombinationOperations__TableOperationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CombinationOperations__TableOperationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__Group_4__1__Impl"


    // $ANTLR start "rule__TableOperations__Group__0"
    // InternalDsl.g:2028:1: rule__TableOperations__Group__0 : rule__TableOperations__Group__0__Impl rule__TableOperations__Group__1 ;
    public final void rule__TableOperations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2032:1: ( rule__TableOperations__Group__0__Impl rule__TableOperations__Group__1 )
            // InternalDsl.g:2033:2: rule__TableOperations__Group__0__Impl rule__TableOperations__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TableOperations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableOperations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOperations__Group__0"


    // $ANTLR start "rule__TableOperations__Group__0__Impl"
    // InternalDsl.g:2040:1: rule__TableOperations__Group__0__Impl : ( ( rule__TableOperations__OperationAssignment_0 ) ) ;
    public final void rule__TableOperations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2044:1: ( ( ( rule__TableOperations__OperationAssignment_0 ) ) )
            // InternalDsl.g:2045:1: ( ( rule__TableOperations__OperationAssignment_0 ) )
            {
            // InternalDsl.g:2045:1: ( ( rule__TableOperations__OperationAssignment_0 ) )
            // InternalDsl.g:2046:2: ( rule__TableOperations__OperationAssignment_0 )
            {
             before(grammarAccess.getTableOperationsAccess().getOperationAssignment_0()); 
            // InternalDsl.g:2047:2: ( rule__TableOperations__OperationAssignment_0 )
            // InternalDsl.g:2047:3: rule__TableOperations__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TableOperations__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableOperationsAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOperations__Group__0__Impl"


    // $ANTLR start "rule__TableOperations__Group__1"
    // InternalDsl.g:2055:1: rule__TableOperations__Group__1 : rule__TableOperations__Group__1__Impl ;
    public final void rule__TableOperations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2059:1: ( rule__TableOperations__Group__1__Impl )
            // InternalDsl.g:2060:2: rule__TableOperations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableOperations__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOperations__Group__1"


    // $ANTLR start "rule__TableOperations__Group__1__Impl"
    // InternalDsl.g:2066:1: rule__TableOperations__Group__1__Impl : ( ( rule__TableOperations__TransformationsAssignment_1 )* ) ;
    public final void rule__TableOperations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2070:1: ( ( ( rule__TableOperations__TransformationsAssignment_1 )* ) )
            // InternalDsl.g:2071:1: ( ( rule__TableOperations__TransformationsAssignment_1 )* )
            {
            // InternalDsl.g:2071:1: ( ( rule__TableOperations__TransformationsAssignment_1 )* )
            // InternalDsl.g:2072:2: ( rule__TableOperations__TransformationsAssignment_1 )*
            {
             before(grammarAccess.getTableOperationsAccess().getTransformationsAssignment_1()); 
            // InternalDsl.g:2073:2: ( rule__TableOperations__TransformationsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:2073:3: rule__TableOperations__TransformationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__TableOperations__TransformationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTableOperationsAccess().getTransformationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOperations__Group__1__Impl"


    // $ANTLR start "rule__InlineSource__Group__0"
    // InternalDsl.g:2082:1: rule__InlineSource__Group__0 : rule__InlineSource__Group__0__Impl rule__InlineSource__Group__1 ;
    public final void rule__InlineSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2086:1: ( rule__InlineSource__Group__0__Impl rule__InlineSource__Group__1 )
            // InternalDsl.g:2087:2: rule__InlineSource__Group__0__Impl rule__InlineSource__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__InlineSource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineSource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineSource__Group__0"


    // $ANTLR start "rule__InlineSource__Group__0__Impl"
    // InternalDsl.g:2094:1: rule__InlineSource__Group__0__Impl : ( '(' ) ;
    public final void rule__InlineSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2098:1: ( ( '(' ) )
            // InternalDsl.g:2099:1: ( '(' )
            {
            // InternalDsl.g:2099:1: ( '(' )
            // InternalDsl.g:2100:2: '('
            {
             before(grammarAccess.getInlineSourceAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInlineSourceAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineSource__Group__0__Impl"


    // $ANTLR start "rule__InlineSource__Group__1"
    // InternalDsl.g:2109:1: rule__InlineSource__Group__1 : rule__InlineSource__Group__1__Impl rule__InlineSource__Group__2 ;
    public final void rule__InlineSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2113:1: ( rule__InlineSource__Group__1__Impl rule__InlineSource__Group__2 )
            // InternalDsl.g:2114:2: rule__InlineSource__Group__1__Impl rule__InlineSource__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__InlineSource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineSource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineSource__Group__1"


    // $ANTLR start "rule__InlineSource__Group__1__Impl"
    // InternalDsl.g:2121:1: rule__InlineSource__Group__1__Impl : ( ( rule__InlineSource__SourceExprAssignment_1 ) ) ;
    public final void rule__InlineSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2125:1: ( ( ( rule__InlineSource__SourceExprAssignment_1 ) ) )
            // InternalDsl.g:2126:1: ( ( rule__InlineSource__SourceExprAssignment_1 ) )
            {
            // InternalDsl.g:2126:1: ( ( rule__InlineSource__SourceExprAssignment_1 ) )
            // InternalDsl.g:2127:2: ( rule__InlineSource__SourceExprAssignment_1 )
            {
             before(grammarAccess.getInlineSourceAccess().getSourceExprAssignment_1()); 
            // InternalDsl.g:2128:2: ( rule__InlineSource__SourceExprAssignment_1 )
            // InternalDsl.g:2128:3: rule__InlineSource__SourceExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InlineSource__SourceExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInlineSourceAccess().getSourceExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineSource__Group__1__Impl"


    // $ANTLR start "rule__InlineSource__Group__2"
    // InternalDsl.g:2136:1: rule__InlineSource__Group__2 : rule__InlineSource__Group__2__Impl ;
    public final void rule__InlineSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2140:1: ( rule__InlineSource__Group__2__Impl )
            // InternalDsl.g:2141:2: rule__InlineSource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InlineSource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineSource__Group__2"


    // $ANTLR start "rule__InlineSource__Group__2__Impl"
    // InternalDsl.g:2147:1: rule__InlineSource__Group__2__Impl : ( ')' ) ;
    public final void rule__InlineSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2151:1: ( ( ')' ) )
            // InternalDsl.g:2152:1: ( ')' )
            {
            // InternalDsl.g:2152:1: ( ')' )
            // InternalDsl.g:2153:2: ')'
            {
             before(grammarAccess.getInlineSourceAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInlineSourceAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineSource__Group__2__Impl"


    // $ANTLR start "rule__TransformationTableOperation__Group__0"
    // InternalDsl.g:2163:1: rule__TransformationTableOperation__Group__0 : rule__TransformationTableOperation__Group__0__Impl rule__TransformationTableOperation__Group__1 ;
    public final void rule__TransformationTableOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2167:1: ( rule__TransformationTableOperation__Group__0__Impl rule__TransformationTableOperation__Group__1 )
            // InternalDsl.g:2168:2: rule__TransformationTableOperation__Group__0__Impl rule__TransformationTableOperation__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TransformationTableOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationTableOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationTableOperation__Group__0"


    // $ANTLR start "rule__TransformationTableOperation__Group__0__Impl"
    // InternalDsl.g:2175:1: rule__TransformationTableOperation__Group__0__Impl : ( '(' ) ;
    public final void rule__TransformationTableOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2179:1: ( ( '(' ) )
            // InternalDsl.g:2180:1: ( '(' )
            {
            // InternalDsl.g:2180:1: ( '(' )
            // InternalDsl.g:2181:2: '('
            {
             before(grammarAccess.getTransformationTableOperationAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransformationTableOperationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationTableOperation__Group__0__Impl"


    // $ANTLR start "rule__TransformationTableOperation__Group__1"
    // InternalDsl.g:2190:1: rule__TransformationTableOperation__Group__1 : rule__TransformationTableOperation__Group__1__Impl rule__TransformationTableOperation__Group__2 ;
    public final void rule__TransformationTableOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2194:1: ( rule__TransformationTableOperation__Group__1__Impl rule__TransformationTableOperation__Group__2 )
            // InternalDsl.g:2195:2: rule__TransformationTableOperation__Group__1__Impl rule__TransformationTableOperation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TransformationTableOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformationTableOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationTableOperation__Group__1"


    // $ANTLR start "rule__TransformationTableOperation__Group__1__Impl"
    // InternalDsl.g:2202:1: rule__TransformationTableOperation__Group__1__Impl : ( ( rule__TransformationTableOperation__TransformationAssignment_1 ) ) ;
    public final void rule__TransformationTableOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2206:1: ( ( ( rule__TransformationTableOperation__TransformationAssignment_1 ) ) )
            // InternalDsl.g:2207:1: ( ( rule__TransformationTableOperation__TransformationAssignment_1 ) )
            {
            // InternalDsl.g:2207:1: ( ( rule__TransformationTableOperation__TransformationAssignment_1 ) )
            // InternalDsl.g:2208:2: ( rule__TransformationTableOperation__TransformationAssignment_1 )
            {
             before(grammarAccess.getTransformationTableOperationAccess().getTransformationAssignment_1()); 
            // InternalDsl.g:2209:2: ( rule__TransformationTableOperation__TransformationAssignment_1 )
            // InternalDsl.g:2209:3: rule__TransformationTableOperation__TransformationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransformationTableOperation__TransformationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationTableOperationAccess().getTransformationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationTableOperation__Group__1__Impl"


    // $ANTLR start "rule__TransformationTableOperation__Group__2"
    // InternalDsl.g:2217:1: rule__TransformationTableOperation__Group__2 : rule__TransformationTableOperation__Group__2__Impl ;
    public final void rule__TransformationTableOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2221:1: ( rule__TransformationTableOperation__Group__2__Impl )
            // InternalDsl.g:2222:2: rule__TransformationTableOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransformationTableOperation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationTableOperation__Group__2"


    // $ANTLR start "rule__TransformationTableOperation__Group__2__Impl"
    // InternalDsl.g:2228:1: rule__TransformationTableOperation__Group__2__Impl : ( ')' ) ;
    public final void rule__TransformationTableOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2232:1: ( ( ')' ) )
            // InternalDsl.g:2233:1: ( ')' )
            {
            // InternalDsl.g:2233:1: ( ')' )
            // InternalDsl.g:2234:2: ')'
            {
             before(grammarAccess.getTransformationTableOperationAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTransformationTableOperationAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationTableOperation__Group__2__Impl"


    // $ANTLR start "rule__InlinePipeline__Group__0"
    // InternalDsl.g:2244:1: rule__InlinePipeline__Group__0 : rule__InlinePipeline__Group__0__Impl rule__InlinePipeline__Group__1 ;
    public final void rule__InlinePipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2248:1: ( rule__InlinePipeline__Group__0__Impl rule__InlinePipeline__Group__1 )
            // InternalDsl.g:2249:2: rule__InlinePipeline__Group__0__Impl rule__InlinePipeline__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__InlinePipeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlinePipeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlinePipeline__Group__0"


    // $ANTLR start "rule__InlinePipeline__Group__0__Impl"
    // InternalDsl.g:2256:1: rule__InlinePipeline__Group__0__Impl : ( '(' ) ;
    public final void rule__InlinePipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2260:1: ( ( '(' ) )
            // InternalDsl.g:2261:1: ( '(' )
            {
            // InternalDsl.g:2261:1: ( '(' )
            // InternalDsl.g:2262:2: '('
            {
             before(grammarAccess.getInlinePipelineAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInlinePipelineAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlinePipeline__Group__0__Impl"


    // $ANTLR start "rule__InlinePipeline__Group__1"
    // InternalDsl.g:2271:1: rule__InlinePipeline__Group__1 : rule__InlinePipeline__Group__1__Impl rule__InlinePipeline__Group__2 ;
    public final void rule__InlinePipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2275:1: ( rule__InlinePipeline__Group__1__Impl rule__InlinePipeline__Group__2 )
            // InternalDsl.g:2276:2: rule__InlinePipeline__Group__1__Impl rule__InlinePipeline__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__InlinePipeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlinePipeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlinePipeline__Group__1"


    // $ANTLR start "rule__InlinePipeline__Group__1__Impl"
    // InternalDsl.g:2283:1: rule__InlinePipeline__Group__1__Impl : ( ( rule__InlinePipeline__PipelineExprAssignment_1 ) ) ;
    public final void rule__InlinePipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2287:1: ( ( ( rule__InlinePipeline__PipelineExprAssignment_1 ) ) )
            // InternalDsl.g:2288:1: ( ( rule__InlinePipeline__PipelineExprAssignment_1 ) )
            {
            // InternalDsl.g:2288:1: ( ( rule__InlinePipeline__PipelineExprAssignment_1 ) )
            // InternalDsl.g:2289:2: ( rule__InlinePipeline__PipelineExprAssignment_1 )
            {
             before(grammarAccess.getInlinePipelineAccess().getPipelineExprAssignment_1()); 
            // InternalDsl.g:2290:2: ( rule__InlinePipeline__PipelineExprAssignment_1 )
            // InternalDsl.g:2290:3: rule__InlinePipeline__PipelineExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InlinePipeline__PipelineExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInlinePipelineAccess().getPipelineExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlinePipeline__Group__1__Impl"


    // $ANTLR start "rule__InlinePipeline__Group__2"
    // InternalDsl.g:2298:1: rule__InlinePipeline__Group__2 : rule__InlinePipeline__Group__2__Impl ;
    public final void rule__InlinePipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2302:1: ( rule__InlinePipeline__Group__2__Impl )
            // InternalDsl.g:2303:2: rule__InlinePipeline__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InlinePipeline__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlinePipeline__Group__2"


    // $ANTLR start "rule__InlinePipeline__Group__2__Impl"
    // InternalDsl.g:2309:1: rule__InlinePipeline__Group__2__Impl : ( ')' ) ;
    public final void rule__InlinePipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2313:1: ( ( ')' ) )
            // InternalDsl.g:2314:1: ( ')' )
            {
            // InternalDsl.g:2314:1: ( ')' )
            // InternalDsl.g:2315:2: ')'
            {
             before(grammarAccess.getInlinePipelineAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInlinePipelineAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlinePipeline__Group__2__Impl"


    // $ANTLR start "rule__TransformOperation__Group__0"
    // InternalDsl.g:2325:1: rule__TransformOperation__Group__0 : rule__TransformOperation__Group__0__Impl rule__TransformOperation__Group__1 ;
    public final void rule__TransformOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2329:1: ( rule__TransformOperation__Group__0__Impl rule__TransformOperation__Group__1 )
            // InternalDsl.g:2330:2: rule__TransformOperation__Group__0__Impl rule__TransformOperation__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TransformOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__Group__0"


    // $ANTLR start "rule__TransformOperation__Group__0__Impl"
    // InternalDsl.g:2337:1: rule__TransformOperation__Group__0__Impl : ( 'apply' ) ;
    public final void rule__TransformOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2341:1: ( ( 'apply' ) )
            // InternalDsl.g:2342:1: ( 'apply' )
            {
            // InternalDsl.g:2342:1: ( 'apply' )
            // InternalDsl.g:2343:2: 'apply'
            {
             before(grammarAccess.getTransformOperationAccess().getApplyKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTransformOperationAccess().getApplyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__Group__0__Impl"


    // $ANTLR start "rule__TransformOperation__Group__1"
    // InternalDsl.g:2352:1: rule__TransformOperation__Group__1 : rule__TransformOperation__Group__1__Impl ;
    public final void rule__TransformOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2356:1: ( rule__TransformOperation__Group__1__Impl )
            // InternalDsl.g:2357:2: rule__TransformOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransformOperation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__Group__1"


    // $ANTLR start "rule__TransformOperation__Group__1__Impl"
    // InternalDsl.g:2363:1: rule__TransformOperation__Group__1__Impl : ( ( rule__TransformOperation__OperationAssignment_1 ) ) ;
    public final void rule__TransformOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2367:1: ( ( ( rule__TransformOperation__OperationAssignment_1 ) ) )
            // InternalDsl.g:2368:1: ( ( rule__TransformOperation__OperationAssignment_1 ) )
            {
            // InternalDsl.g:2368:1: ( ( rule__TransformOperation__OperationAssignment_1 ) )
            // InternalDsl.g:2369:2: ( rule__TransformOperation__OperationAssignment_1 )
            {
             before(grammarAccess.getTransformOperationAccess().getOperationAssignment_1()); 
            // InternalDsl.g:2370:2: ( rule__TransformOperation__OperationAssignment_1 )
            // InternalDsl.g:2370:3: rule__TransformOperation__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransformOperation__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformOperationAccess().getOperationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalDsl.g:2379:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2383:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalDsl.g:2384:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalDsl.g:2391:1: rule__Table__Group__0__Impl : ( ( rule__Table__OperationAssignment_0 ) ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2395:1: ( ( ( rule__Table__OperationAssignment_0 ) ) )
            // InternalDsl.g:2396:1: ( ( rule__Table__OperationAssignment_0 ) )
            {
            // InternalDsl.g:2396:1: ( ( rule__Table__OperationAssignment_0 ) )
            // InternalDsl.g:2397:2: ( rule__Table__OperationAssignment_0 )
            {
             before(grammarAccess.getTableAccess().getOperationAssignment_0()); 
            // InternalDsl.g:2398:2: ( rule__Table__OperationAssignment_0 )
            // InternalDsl.g:2398:3: rule__Table__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalDsl.g:2406:1: rule__Table__Group__1 : rule__Table__Group__1__Impl ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2410:1: ( rule__Table__Group__1__Impl )
            // InternalDsl.g:2411:2: rule__Table__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalDsl.g:2417:1: rule__Table__Group__1__Impl : ( ';' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2421:1: ( ( ';' ) )
            // InternalDsl.g:2422:1: ( ';' )
            {
            // InternalDsl.g:2422:1: ( ';' )
            // InternalDsl.g:2423:2: ';'
            {
             before(grammarAccess.getTableAccess().getSemicolonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__XmlType__Group__0"
    // InternalDsl.g:2433:1: rule__XmlType__Group__0 : rule__XmlType__Group__0__Impl rule__XmlType__Group__1 ;
    public final void rule__XmlType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2437:1: ( rule__XmlType__Group__0__Impl rule__XmlType__Group__1 )
            // InternalDsl.g:2438:2: rule__XmlType__Group__0__Impl rule__XmlType__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__XmlType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XmlType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group__0"


    // $ANTLR start "rule__XmlType__Group__0__Impl"
    // InternalDsl.g:2445:1: rule__XmlType__Group__0__Impl : ( () ) ;
    public final void rule__XmlType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2449:1: ( ( () ) )
            // InternalDsl.g:2450:1: ( () )
            {
            // InternalDsl.g:2450:1: ( () )
            // InternalDsl.g:2451:2: ()
            {
             before(grammarAccess.getXmlTypeAccess().getXmlTypeAction_0()); 
            // InternalDsl.g:2452:2: ()
            // InternalDsl.g:2452:3: 
            {
            }

             after(grammarAccess.getXmlTypeAccess().getXmlTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group__0__Impl"


    // $ANTLR start "rule__XmlType__Group__1"
    // InternalDsl.g:2460:1: rule__XmlType__Group__1 : rule__XmlType__Group__1__Impl rule__XmlType__Group__2 ;
    public final void rule__XmlType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2464:1: ( rule__XmlType__Group__1__Impl rule__XmlType__Group__2 )
            // InternalDsl.g:2465:2: rule__XmlType__Group__1__Impl rule__XmlType__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__XmlType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XmlType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group__1"


    // $ANTLR start "rule__XmlType__Group__1__Impl"
    // InternalDsl.g:2472:1: rule__XmlType__Group__1__Impl : ( 'xml' ) ;
    public final void rule__XmlType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2476:1: ( ( 'xml' ) )
            // InternalDsl.g:2477:1: ( 'xml' )
            {
            // InternalDsl.g:2477:1: ( 'xml' )
            // InternalDsl.g:2478:2: 'xml'
            {
             before(grammarAccess.getXmlTypeAccess().getXmlKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXmlTypeAccess().getXmlKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group__1__Impl"


    // $ANTLR start "rule__XmlType__Group__2"
    // InternalDsl.g:2487:1: rule__XmlType__Group__2 : rule__XmlType__Group__2__Impl ;
    public final void rule__XmlType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2491:1: ( rule__XmlType__Group__2__Impl )
            // InternalDsl.g:2492:2: rule__XmlType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XmlType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group__2"


    // $ANTLR start "rule__XmlType__Group__2__Impl"
    // InternalDsl.g:2498:1: rule__XmlType__Group__2__Impl : ( ( rule__XmlType__Group_2__0 )? ) ;
    public final void rule__XmlType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2502:1: ( ( ( rule__XmlType__Group_2__0 )? ) )
            // InternalDsl.g:2503:1: ( ( rule__XmlType__Group_2__0 )? )
            {
            // InternalDsl.g:2503:1: ( ( rule__XmlType__Group_2__0 )? )
            // InternalDsl.g:2504:2: ( rule__XmlType__Group_2__0 )?
            {
             before(grammarAccess.getXmlTypeAccess().getGroup_2()); 
            // InternalDsl.g:2505:2: ( rule__XmlType__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2505:3: rule__XmlType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XmlType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmlTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group__2__Impl"


    // $ANTLR start "rule__XmlType__Group_2__0"
    // InternalDsl.g:2514:1: rule__XmlType__Group_2__0 : rule__XmlType__Group_2__0__Impl rule__XmlType__Group_2__1 ;
    public final void rule__XmlType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2518:1: ( rule__XmlType__Group_2__0__Impl rule__XmlType__Group_2__1 )
            // InternalDsl.g:2519:2: rule__XmlType__Group_2__0__Impl rule__XmlType__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__XmlType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XmlType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__0"


    // $ANTLR start "rule__XmlType__Group_2__0__Impl"
    // InternalDsl.g:2526:1: rule__XmlType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__XmlType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2530:1: ( ( '{' ) )
            // InternalDsl.g:2531:1: ( '{' )
            {
            // InternalDsl.g:2531:1: ( '{' )
            // InternalDsl.g:2532:2: '{'
            {
             before(grammarAccess.getXmlTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXmlTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__0__Impl"


    // $ANTLR start "rule__XmlType__Group_2__1"
    // InternalDsl.g:2541:1: rule__XmlType__Group_2__1 : rule__XmlType__Group_2__1__Impl rule__XmlType__Group_2__2 ;
    public final void rule__XmlType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2545:1: ( rule__XmlType__Group_2__1__Impl rule__XmlType__Group_2__2 )
            // InternalDsl.g:2546:2: rule__XmlType__Group_2__1__Impl rule__XmlType__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__XmlType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XmlType__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__1"


    // $ANTLR start "rule__XmlType__Group_2__1__Impl"
    // InternalDsl.g:2553:1: rule__XmlType__Group_2__1__Impl : ( 'xpath' ) ;
    public final void rule__XmlType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2557:1: ( ( 'xpath' ) )
            // InternalDsl.g:2558:1: ( 'xpath' )
            {
            // InternalDsl.g:2558:1: ( 'xpath' )
            // InternalDsl.g:2559:2: 'xpath'
            {
             before(grammarAccess.getXmlTypeAccess().getXpathKeyword_2_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXmlTypeAccess().getXpathKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__1__Impl"


    // $ANTLR start "rule__XmlType__Group_2__2"
    // InternalDsl.g:2568:1: rule__XmlType__Group_2__2 : rule__XmlType__Group_2__2__Impl rule__XmlType__Group_2__3 ;
    public final void rule__XmlType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2572:1: ( rule__XmlType__Group_2__2__Impl rule__XmlType__Group_2__3 )
            // InternalDsl.g:2573:2: rule__XmlType__Group_2__2__Impl rule__XmlType__Group_2__3
            {
            pushFollow(FOLLOW_22);
            rule__XmlType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XmlType__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__2"


    // $ANTLR start "rule__XmlType__Group_2__2__Impl"
    // InternalDsl.g:2580:1: rule__XmlType__Group_2__2__Impl : ( '=' ) ;
    public final void rule__XmlType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2584:1: ( ( '=' ) )
            // InternalDsl.g:2585:1: ( '=' )
            {
            // InternalDsl.g:2585:1: ( '=' )
            // InternalDsl.g:2586:2: '='
            {
             before(grammarAccess.getXmlTypeAccess().getEqualsSignKeyword_2_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getXmlTypeAccess().getEqualsSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__2__Impl"


    // $ANTLR start "rule__XmlType__Group_2__3"
    // InternalDsl.g:2595:1: rule__XmlType__Group_2__3 : rule__XmlType__Group_2__3__Impl rule__XmlType__Group_2__4 ;
    public final void rule__XmlType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2599:1: ( rule__XmlType__Group_2__3__Impl rule__XmlType__Group_2__4 )
            // InternalDsl.g:2600:2: rule__XmlType__Group_2__3__Impl rule__XmlType__Group_2__4
            {
            pushFollow(FOLLOW_23);
            rule__XmlType__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XmlType__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__3"


    // $ANTLR start "rule__XmlType__Group_2__3__Impl"
    // InternalDsl.g:2607:1: rule__XmlType__Group_2__3__Impl : ( ( rule__XmlType__PathAssignment_2_3 ) ) ;
    public final void rule__XmlType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2611:1: ( ( ( rule__XmlType__PathAssignment_2_3 ) ) )
            // InternalDsl.g:2612:1: ( ( rule__XmlType__PathAssignment_2_3 ) )
            {
            // InternalDsl.g:2612:1: ( ( rule__XmlType__PathAssignment_2_3 ) )
            // InternalDsl.g:2613:2: ( rule__XmlType__PathAssignment_2_3 )
            {
             before(grammarAccess.getXmlTypeAccess().getPathAssignment_2_3()); 
            // InternalDsl.g:2614:2: ( rule__XmlType__PathAssignment_2_3 )
            // InternalDsl.g:2614:3: rule__XmlType__PathAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__XmlType__PathAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getXmlTypeAccess().getPathAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__3__Impl"


    // $ANTLR start "rule__XmlType__Group_2__4"
    // InternalDsl.g:2622:1: rule__XmlType__Group_2__4 : rule__XmlType__Group_2__4__Impl rule__XmlType__Group_2__5 ;
    public final void rule__XmlType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2626:1: ( rule__XmlType__Group_2__4__Impl rule__XmlType__Group_2__5 )
            // InternalDsl.g:2627:2: rule__XmlType__Group_2__4__Impl rule__XmlType__Group_2__5
            {
            pushFollow(FOLLOW_24);
            rule__XmlType__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XmlType__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__4"


    // $ANTLR start "rule__XmlType__Group_2__4__Impl"
    // InternalDsl.g:2634:1: rule__XmlType__Group_2__4__Impl : ( ',' ) ;
    public final void rule__XmlType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2638:1: ( ( ',' ) )
            // InternalDsl.g:2639:1: ( ',' )
            {
            // InternalDsl.g:2639:1: ( ',' )
            // InternalDsl.g:2640:2: ','
            {
             before(grammarAccess.getXmlTypeAccess().getCommaKeyword_2_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getXmlTypeAccess().getCommaKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__4__Impl"


    // $ANTLR start "rule__XmlType__Group_2__5"
    // InternalDsl.g:2649:1: rule__XmlType__Group_2__5 : rule__XmlType__Group_2__5__Impl ;
    public final void rule__XmlType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2653:1: ( rule__XmlType__Group_2__5__Impl )
            // InternalDsl.g:2654:2: rule__XmlType__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XmlType__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__5"


    // $ANTLR start "rule__XmlType__Group_2__5__Impl"
    // InternalDsl.g:2660:1: rule__XmlType__Group_2__5__Impl : ( '}' ) ;
    public final void rule__XmlType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2664:1: ( ( '}' ) )
            // InternalDsl.g:2665:1: ( '}' )
            {
            // InternalDsl.g:2665:1: ( '}' )
            // InternalDsl.g:2666:2: '}'
            {
             before(grammarAccess.getXmlTypeAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXmlTypeAccess().getRightCurlyBracketKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__Group_2__5__Impl"


    // $ANTLR start "rule__JsonType__Group__0"
    // InternalDsl.g:2676:1: rule__JsonType__Group__0 : rule__JsonType__Group__0__Impl rule__JsonType__Group__1 ;
    public final void rule__JsonType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2680:1: ( rule__JsonType__Group__0__Impl rule__JsonType__Group__1 )
            // InternalDsl.g:2681:2: rule__JsonType__Group__0__Impl rule__JsonType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__JsonType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__0"


    // $ANTLR start "rule__JsonType__Group__0__Impl"
    // InternalDsl.g:2688:1: rule__JsonType__Group__0__Impl : ( () ) ;
    public final void rule__JsonType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2692:1: ( ( () ) )
            // InternalDsl.g:2693:1: ( () )
            {
            // InternalDsl.g:2693:1: ( () )
            // InternalDsl.g:2694:2: ()
            {
             before(grammarAccess.getJsonTypeAccess().getJsonTypeAction_0()); 
            // InternalDsl.g:2695:2: ()
            // InternalDsl.g:2695:3: 
            {
            }

             after(grammarAccess.getJsonTypeAccess().getJsonTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__0__Impl"


    // $ANTLR start "rule__JsonType__Group__1"
    // InternalDsl.g:2703:1: rule__JsonType__Group__1 : rule__JsonType__Group__1__Impl rule__JsonType__Group__2 ;
    public final void rule__JsonType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2707:1: ( rule__JsonType__Group__1__Impl rule__JsonType__Group__2 )
            // InternalDsl.g:2708:2: rule__JsonType__Group__1__Impl rule__JsonType__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__JsonType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__1"


    // $ANTLR start "rule__JsonType__Group__1__Impl"
    // InternalDsl.g:2715:1: rule__JsonType__Group__1__Impl : ( 'json' ) ;
    public final void rule__JsonType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2719:1: ( ( 'json' ) )
            // InternalDsl.g:2720:1: ( 'json' )
            {
            // InternalDsl.g:2720:1: ( 'json' )
            // InternalDsl.g:2721:2: 'json'
            {
             before(grammarAccess.getJsonTypeAccess().getJsonKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getJsonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__1__Impl"


    // $ANTLR start "rule__JsonType__Group__2"
    // InternalDsl.g:2730:1: rule__JsonType__Group__2 : rule__JsonType__Group__2__Impl ;
    public final void rule__JsonType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2734:1: ( rule__JsonType__Group__2__Impl )
            // InternalDsl.g:2735:2: rule__JsonType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__2"


    // $ANTLR start "rule__JsonType__Group__2__Impl"
    // InternalDsl.g:2741:1: rule__JsonType__Group__2__Impl : ( ( rule__JsonType__Group_2__0 )? ) ;
    public final void rule__JsonType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2745:1: ( ( ( rule__JsonType__Group_2__0 )? ) )
            // InternalDsl.g:2746:1: ( ( rule__JsonType__Group_2__0 )? )
            {
            // InternalDsl.g:2746:1: ( ( rule__JsonType__Group_2__0 )? )
            // InternalDsl.g:2747:2: ( rule__JsonType__Group_2__0 )?
            {
             before(grammarAccess.getJsonTypeAccess().getGroup_2()); 
            // InternalDsl.g:2748:2: ( rule__JsonType__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:2748:3: rule__JsonType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJsonTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group__2__Impl"


    // $ANTLR start "rule__JsonType__Group_2__0"
    // InternalDsl.g:2757:1: rule__JsonType__Group_2__0 : rule__JsonType__Group_2__0__Impl rule__JsonType__Group_2__1 ;
    public final void rule__JsonType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2761:1: ( rule__JsonType__Group_2__0__Impl rule__JsonType__Group_2__1 )
            // InternalDsl.g:2762:2: rule__JsonType__Group_2__0__Impl rule__JsonType__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__JsonType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__0"


    // $ANTLR start "rule__JsonType__Group_2__0__Impl"
    // InternalDsl.g:2769:1: rule__JsonType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__JsonType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2773:1: ( ( '{' ) )
            // InternalDsl.g:2774:1: ( '{' )
            {
            // InternalDsl.g:2774:1: ( '{' )
            // InternalDsl.g:2775:2: '{'
            {
             before(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__0__Impl"


    // $ANTLR start "rule__JsonType__Group_2__1"
    // InternalDsl.g:2784:1: rule__JsonType__Group_2__1 : rule__JsonType__Group_2__1__Impl rule__JsonType__Group_2__2 ;
    public final void rule__JsonType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2788:1: ( rule__JsonType__Group_2__1__Impl rule__JsonType__Group_2__2 )
            // InternalDsl.g:2789:2: rule__JsonType__Group_2__1__Impl rule__JsonType__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__JsonType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__1"


    // $ANTLR start "rule__JsonType__Group_2__1__Impl"
    // InternalDsl.g:2796:1: rule__JsonType__Group_2__1__Impl : ( 'jsonpath' ) ;
    public final void rule__JsonType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2800:1: ( ( 'jsonpath' ) )
            // InternalDsl.g:2801:1: ( 'jsonpath' )
            {
            // InternalDsl.g:2801:1: ( 'jsonpath' )
            // InternalDsl.g:2802:2: 'jsonpath'
            {
             before(grammarAccess.getJsonTypeAccess().getJsonpathKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getJsonpathKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__1__Impl"


    // $ANTLR start "rule__JsonType__Group_2__2"
    // InternalDsl.g:2811:1: rule__JsonType__Group_2__2 : rule__JsonType__Group_2__2__Impl rule__JsonType__Group_2__3 ;
    public final void rule__JsonType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2815:1: ( rule__JsonType__Group_2__2__Impl rule__JsonType__Group_2__3 )
            // InternalDsl.g:2816:2: rule__JsonType__Group_2__2__Impl rule__JsonType__Group_2__3
            {
            pushFollow(FOLLOW_22);
            rule__JsonType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__2"


    // $ANTLR start "rule__JsonType__Group_2__2__Impl"
    // InternalDsl.g:2823:1: rule__JsonType__Group_2__2__Impl : ( '=' ) ;
    public final void rule__JsonType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2827:1: ( ( '=' ) )
            // InternalDsl.g:2828:1: ( '=' )
            {
            // InternalDsl.g:2828:1: ( '=' )
            // InternalDsl.g:2829:2: '='
            {
             before(grammarAccess.getJsonTypeAccess().getEqualsSignKeyword_2_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getEqualsSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__2__Impl"


    // $ANTLR start "rule__JsonType__Group_2__3"
    // InternalDsl.g:2838:1: rule__JsonType__Group_2__3 : rule__JsonType__Group_2__3__Impl rule__JsonType__Group_2__4 ;
    public final void rule__JsonType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2842:1: ( rule__JsonType__Group_2__3__Impl rule__JsonType__Group_2__4 )
            // InternalDsl.g:2843:2: rule__JsonType__Group_2__3__Impl rule__JsonType__Group_2__4
            {
            pushFollow(FOLLOW_23);
            rule__JsonType__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__3"


    // $ANTLR start "rule__JsonType__Group_2__3__Impl"
    // InternalDsl.g:2850:1: rule__JsonType__Group_2__3__Impl : ( ( rule__JsonType__PathAssignment_2_3 ) ) ;
    public final void rule__JsonType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2854:1: ( ( ( rule__JsonType__PathAssignment_2_3 ) ) )
            // InternalDsl.g:2855:1: ( ( rule__JsonType__PathAssignment_2_3 ) )
            {
            // InternalDsl.g:2855:1: ( ( rule__JsonType__PathAssignment_2_3 ) )
            // InternalDsl.g:2856:2: ( rule__JsonType__PathAssignment_2_3 )
            {
             before(grammarAccess.getJsonTypeAccess().getPathAssignment_2_3()); 
            // InternalDsl.g:2857:2: ( rule__JsonType__PathAssignment_2_3 )
            // InternalDsl.g:2857:3: rule__JsonType__PathAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__JsonType__PathAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getPathAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__3__Impl"


    // $ANTLR start "rule__JsonType__Group_2__4"
    // InternalDsl.g:2865:1: rule__JsonType__Group_2__4 : rule__JsonType__Group_2__4__Impl rule__JsonType__Group_2__5 ;
    public final void rule__JsonType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2869:1: ( rule__JsonType__Group_2__4__Impl rule__JsonType__Group_2__5 )
            // InternalDsl.g:2870:2: rule__JsonType__Group_2__4__Impl rule__JsonType__Group_2__5
            {
            pushFollow(FOLLOW_24);
            rule__JsonType__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__4"


    // $ANTLR start "rule__JsonType__Group_2__4__Impl"
    // InternalDsl.g:2877:1: rule__JsonType__Group_2__4__Impl : ( ',' ) ;
    public final void rule__JsonType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2881:1: ( ( ',' ) )
            // InternalDsl.g:2882:1: ( ',' )
            {
            // InternalDsl.g:2882:1: ( ',' )
            // InternalDsl.g:2883:2: ','
            {
             before(grammarAccess.getJsonTypeAccess().getCommaKeyword_2_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getCommaKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__4__Impl"


    // $ANTLR start "rule__JsonType__Group_2__5"
    // InternalDsl.g:2892:1: rule__JsonType__Group_2__5 : rule__JsonType__Group_2__5__Impl ;
    public final void rule__JsonType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2896:1: ( rule__JsonType__Group_2__5__Impl )
            // InternalDsl.g:2897:2: rule__JsonType__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonType__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__5"


    // $ANTLR start "rule__JsonType__Group_2__5__Impl"
    // InternalDsl.g:2903:1: rule__JsonType__Group_2__5__Impl : ( '}' ) ;
    public final void rule__JsonType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2907:1: ( ( '}' ) )
            // InternalDsl.g:2908:1: ( '}' )
            {
            // InternalDsl.g:2908:1: ( '}' )
            // InternalDsl.g:2909:2: '}'
            {
             before(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__Group_2__5__Impl"


    // $ANTLR start "rule__YamlType__Group__0"
    // InternalDsl.g:2919:1: rule__YamlType__Group__0 : rule__YamlType__Group__0__Impl rule__YamlType__Group__1 ;
    public final void rule__YamlType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2923:1: ( rule__YamlType__Group__0__Impl rule__YamlType__Group__1 )
            // InternalDsl.g:2924:2: rule__YamlType__Group__0__Impl rule__YamlType__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__YamlType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__YamlType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YamlType__Group__0"


    // $ANTLR start "rule__YamlType__Group__0__Impl"
    // InternalDsl.g:2931:1: rule__YamlType__Group__0__Impl : ( () ) ;
    public final void rule__YamlType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2935:1: ( ( () ) )
            // InternalDsl.g:2936:1: ( () )
            {
            // InternalDsl.g:2936:1: ( () )
            // InternalDsl.g:2937:2: ()
            {
             before(grammarAccess.getYamlTypeAccess().getYamlTypeAction_0()); 
            // InternalDsl.g:2938:2: ()
            // InternalDsl.g:2938:3: 
            {
            }

             after(grammarAccess.getYamlTypeAccess().getYamlTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YamlType__Group__0__Impl"


    // $ANTLR start "rule__YamlType__Group__1"
    // InternalDsl.g:2946:1: rule__YamlType__Group__1 : rule__YamlType__Group__1__Impl ;
    public final void rule__YamlType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2950:1: ( rule__YamlType__Group__1__Impl )
            // InternalDsl.g:2951:2: rule__YamlType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YamlType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YamlType__Group__1"


    // $ANTLR start "rule__YamlType__Group__1__Impl"
    // InternalDsl.g:2957:1: rule__YamlType__Group__1__Impl : ( 'yaml' ) ;
    public final void rule__YamlType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2961:1: ( ( 'yaml' ) )
            // InternalDsl.g:2962:1: ( 'yaml' )
            {
            // InternalDsl.g:2962:1: ( 'yaml' )
            // InternalDsl.g:2963:2: 'yaml'
            {
             before(grammarAccess.getYamlTypeAccess().getYamlKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getYamlTypeAccess().getYamlKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YamlType__Group__1__Impl"


    // $ANTLR start "rule__CsvType__Group__0"
    // InternalDsl.g:2973:1: rule__CsvType__Group__0 : rule__CsvType__Group__0__Impl rule__CsvType__Group__1 ;
    public final void rule__CsvType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2977:1: ( rule__CsvType__Group__0__Impl rule__CsvType__Group__1 )
            // InternalDsl.g:2978:2: rule__CsvType__Group__0__Impl rule__CsvType__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__CsvType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvType__Group__0"


    // $ANTLR start "rule__CsvType__Group__0__Impl"
    // InternalDsl.g:2985:1: rule__CsvType__Group__0__Impl : ( () ) ;
    public final void rule__CsvType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2989:1: ( ( () ) )
            // InternalDsl.g:2990:1: ( () )
            {
            // InternalDsl.g:2990:1: ( () )
            // InternalDsl.g:2991:2: ()
            {
             before(grammarAccess.getCsvTypeAccess().getCsvTypeAction_0()); 
            // InternalDsl.g:2992:2: ()
            // InternalDsl.g:2992:3: 
            {
            }

             after(grammarAccess.getCsvTypeAccess().getCsvTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvType__Group__0__Impl"


    // $ANTLR start "rule__CsvType__Group__1"
    // InternalDsl.g:3000:1: rule__CsvType__Group__1 : rule__CsvType__Group__1__Impl ;
    public final void rule__CsvType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3004:1: ( rule__CsvType__Group__1__Impl )
            // InternalDsl.g:3005:2: rule__CsvType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvType__Group__1"


    // $ANTLR start "rule__CsvType__Group__1__Impl"
    // InternalDsl.g:3011:1: rule__CsvType__Group__1__Impl : ( 'csv' ) ;
    public final void rule__CsvType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3015:1: ( ( 'csv' ) )
            // InternalDsl.g:3016:1: ( 'csv' )
            {
            // InternalDsl.g:3016:1: ( 'csv' )
            // InternalDsl.g:3017:2: 'csv'
            {
             before(grammarAccess.getCsvTypeAccess().getCsvKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCsvTypeAccess().getCsvKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvType__Group__1__Impl"


    // $ANTLR start "rule__AutoType__Group__0"
    // InternalDsl.g:3027:1: rule__AutoType__Group__0 : rule__AutoType__Group__0__Impl rule__AutoType__Group__1 ;
    public final void rule__AutoType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3031:1: ( rule__AutoType__Group__0__Impl rule__AutoType__Group__1 )
            // InternalDsl.g:3032:2: rule__AutoType__Group__0__Impl rule__AutoType__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__AutoType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoType__Group__0"


    // $ANTLR start "rule__AutoType__Group__0__Impl"
    // InternalDsl.g:3039:1: rule__AutoType__Group__0__Impl : ( () ) ;
    public final void rule__AutoType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3043:1: ( ( () ) )
            // InternalDsl.g:3044:1: ( () )
            {
            // InternalDsl.g:3044:1: ( () )
            // InternalDsl.g:3045:2: ()
            {
             before(grammarAccess.getAutoTypeAccess().getAutoTypeAction_0()); 
            // InternalDsl.g:3046:2: ()
            // InternalDsl.g:3046:3: 
            {
            }

             after(grammarAccess.getAutoTypeAccess().getAutoTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoType__Group__0__Impl"


    // $ANTLR start "rule__AutoType__Group__1"
    // InternalDsl.g:3054:1: rule__AutoType__Group__1 : rule__AutoType__Group__1__Impl ;
    public final void rule__AutoType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3058:1: ( rule__AutoType__Group__1__Impl )
            // InternalDsl.g:3059:2: rule__AutoType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutoType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoType__Group__1"


    // $ANTLR start "rule__AutoType__Group__1__Impl"
    // InternalDsl.g:3065:1: rule__AutoType__Group__1__Impl : ( 'auto' ) ;
    public final void rule__AutoType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3069:1: ( ( 'auto' ) )
            // InternalDsl.g:3070:1: ( 'auto' )
            {
            // InternalDsl.g:3070:1: ( 'auto' )
            // InternalDsl.g:3071:2: 'auto'
            {
             before(grammarAccess.getAutoTypeAccess().getAutoKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAutoTypeAccess().getAutoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoType__Group__1__Impl"


    // $ANTLR start "rule__HtmlType__Group__0"
    // InternalDsl.g:3081:1: rule__HtmlType__Group__0 : rule__HtmlType__Group__0__Impl rule__HtmlType__Group__1 ;
    public final void rule__HtmlType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3085:1: ( rule__HtmlType__Group__0__Impl rule__HtmlType__Group__1 )
            // InternalDsl.g:3086:2: rule__HtmlType__Group__0__Impl rule__HtmlType__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__HtmlType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group__0"


    // $ANTLR start "rule__HtmlType__Group__0__Impl"
    // InternalDsl.g:3093:1: rule__HtmlType__Group__0__Impl : ( () ) ;
    public final void rule__HtmlType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3097:1: ( ( () ) )
            // InternalDsl.g:3098:1: ( () )
            {
            // InternalDsl.g:3098:1: ( () )
            // InternalDsl.g:3099:2: ()
            {
             before(grammarAccess.getHtmlTypeAccess().getHtmlTypeAction_0()); 
            // InternalDsl.g:3100:2: ()
            // InternalDsl.g:3100:3: 
            {
            }

             after(grammarAccess.getHtmlTypeAccess().getHtmlTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group__0__Impl"


    // $ANTLR start "rule__HtmlType__Group__1"
    // InternalDsl.g:3108:1: rule__HtmlType__Group__1 : rule__HtmlType__Group__1__Impl rule__HtmlType__Group__2 ;
    public final void rule__HtmlType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3112:1: ( rule__HtmlType__Group__1__Impl rule__HtmlType__Group__2 )
            // InternalDsl.g:3113:2: rule__HtmlType__Group__1__Impl rule__HtmlType__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__HtmlType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group__1"


    // $ANTLR start "rule__HtmlType__Group__1__Impl"
    // InternalDsl.g:3120:1: rule__HtmlType__Group__1__Impl : ( 'html' ) ;
    public final void rule__HtmlType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3124:1: ( ( 'html' ) )
            // InternalDsl.g:3125:1: ( 'html' )
            {
            // InternalDsl.g:3125:1: ( 'html' )
            // InternalDsl.g:3126:2: 'html'
            {
             before(grammarAccess.getHtmlTypeAccess().getHtmlKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getHtmlTypeAccess().getHtmlKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group__1__Impl"


    // $ANTLR start "rule__HtmlType__Group__2"
    // InternalDsl.g:3135:1: rule__HtmlType__Group__2 : rule__HtmlType__Group__2__Impl ;
    public final void rule__HtmlType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3139:1: ( rule__HtmlType__Group__2__Impl )
            // InternalDsl.g:3140:2: rule__HtmlType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HtmlType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group__2"


    // $ANTLR start "rule__HtmlType__Group__2__Impl"
    // InternalDsl.g:3146:1: rule__HtmlType__Group__2__Impl : ( ( rule__HtmlType__Group_2__0 )? ) ;
    public final void rule__HtmlType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3150:1: ( ( ( rule__HtmlType__Group_2__0 )? ) )
            // InternalDsl.g:3151:1: ( ( rule__HtmlType__Group_2__0 )? )
            {
            // InternalDsl.g:3151:1: ( ( rule__HtmlType__Group_2__0 )? )
            // InternalDsl.g:3152:2: ( rule__HtmlType__Group_2__0 )?
            {
             before(grammarAccess.getHtmlTypeAccess().getGroup_2()); 
            // InternalDsl.g:3153:2: ( rule__HtmlType__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:3153:3: rule__HtmlType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HtmlType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHtmlTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group__2__Impl"


    // $ANTLR start "rule__HtmlType__Group_2__0"
    // InternalDsl.g:3162:1: rule__HtmlType__Group_2__0 : rule__HtmlType__Group_2__0__Impl rule__HtmlType__Group_2__1 ;
    public final void rule__HtmlType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3166:1: ( rule__HtmlType__Group_2__0__Impl rule__HtmlType__Group_2__1 )
            // InternalDsl.g:3167:2: rule__HtmlType__Group_2__0__Impl rule__HtmlType__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__HtmlType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__0"


    // $ANTLR start "rule__HtmlType__Group_2__0__Impl"
    // InternalDsl.g:3174:1: rule__HtmlType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__HtmlType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3178:1: ( ( '{' ) )
            // InternalDsl.g:3179:1: ( '{' )
            {
            // InternalDsl.g:3179:1: ( '{' )
            // InternalDsl.g:3180:2: '{'
            {
             before(grammarAccess.getHtmlTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHtmlTypeAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__0__Impl"


    // $ANTLR start "rule__HtmlType__Group_2__1"
    // InternalDsl.g:3189:1: rule__HtmlType__Group_2__1 : rule__HtmlType__Group_2__1__Impl rule__HtmlType__Group_2__2 ;
    public final void rule__HtmlType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3193:1: ( rule__HtmlType__Group_2__1__Impl rule__HtmlType__Group_2__2 )
            // InternalDsl.g:3194:2: rule__HtmlType__Group_2__1__Impl rule__HtmlType__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__HtmlType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlType__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__1"


    // $ANTLR start "rule__HtmlType__Group_2__1__Impl"
    // InternalDsl.g:3201:1: rule__HtmlType__Group_2__1__Impl : ( 'css' ) ;
    public final void rule__HtmlType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3205:1: ( ( 'css' ) )
            // InternalDsl.g:3206:1: ( 'css' )
            {
            // InternalDsl.g:3206:1: ( 'css' )
            // InternalDsl.g:3207:2: 'css'
            {
             before(grammarAccess.getHtmlTypeAccess().getCssKeyword_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getHtmlTypeAccess().getCssKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__1__Impl"


    // $ANTLR start "rule__HtmlType__Group_2__2"
    // InternalDsl.g:3216:1: rule__HtmlType__Group_2__2 : rule__HtmlType__Group_2__2__Impl rule__HtmlType__Group_2__3 ;
    public final void rule__HtmlType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3220:1: ( rule__HtmlType__Group_2__2__Impl rule__HtmlType__Group_2__3 )
            // InternalDsl.g:3221:2: rule__HtmlType__Group_2__2__Impl rule__HtmlType__Group_2__3
            {
            pushFollow(FOLLOW_22);
            rule__HtmlType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlType__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__2"


    // $ANTLR start "rule__HtmlType__Group_2__2__Impl"
    // InternalDsl.g:3228:1: rule__HtmlType__Group_2__2__Impl : ( '=' ) ;
    public final void rule__HtmlType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3232:1: ( ( '=' ) )
            // InternalDsl.g:3233:1: ( '=' )
            {
            // InternalDsl.g:3233:1: ( '=' )
            // InternalDsl.g:3234:2: '='
            {
             before(grammarAccess.getHtmlTypeAccess().getEqualsSignKeyword_2_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getHtmlTypeAccess().getEqualsSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__2__Impl"


    // $ANTLR start "rule__HtmlType__Group_2__3"
    // InternalDsl.g:3243:1: rule__HtmlType__Group_2__3 : rule__HtmlType__Group_2__3__Impl rule__HtmlType__Group_2__4 ;
    public final void rule__HtmlType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3247:1: ( rule__HtmlType__Group_2__3__Impl rule__HtmlType__Group_2__4 )
            // InternalDsl.g:3248:2: rule__HtmlType__Group_2__3__Impl rule__HtmlType__Group_2__4
            {
            pushFollow(FOLLOW_32);
            rule__HtmlType__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlType__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__3"


    // $ANTLR start "rule__HtmlType__Group_2__3__Impl"
    // InternalDsl.g:3255:1: rule__HtmlType__Group_2__3__Impl : ( ( rule__HtmlType__CssPathAssignment_2_3 ) ) ;
    public final void rule__HtmlType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3259:1: ( ( ( rule__HtmlType__CssPathAssignment_2_3 ) ) )
            // InternalDsl.g:3260:1: ( ( rule__HtmlType__CssPathAssignment_2_3 ) )
            {
            // InternalDsl.g:3260:1: ( ( rule__HtmlType__CssPathAssignment_2_3 ) )
            // InternalDsl.g:3261:2: ( rule__HtmlType__CssPathAssignment_2_3 )
            {
             before(grammarAccess.getHtmlTypeAccess().getCssPathAssignment_2_3()); 
            // InternalDsl.g:3262:2: ( rule__HtmlType__CssPathAssignment_2_3 )
            // InternalDsl.g:3262:3: rule__HtmlType__CssPathAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__HtmlType__CssPathAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getHtmlTypeAccess().getCssPathAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__3__Impl"


    // $ANTLR start "rule__HtmlType__Group_2__4"
    // InternalDsl.g:3270:1: rule__HtmlType__Group_2__4 : rule__HtmlType__Group_2__4__Impl rule__HtmlType__Group_2__5 ;
    public final void rule__HtmlType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3274:1: ( rule__HtmlType__Group_2__4__Impl rule__HtmlType__Group_2__5 )
            // InternalDsl.g:3275:2: rule__HtmlType__Group_2__4__Impl rule__HtmlType__Group_2__5
            {
            pushFollow(FOLLOW_32);
            rule__HtmlType__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlType__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__4"


    // $ANTLR start "rule__HtmlType__Group_2__4__Impl"
    // InternalDsl.g:3282:1: rule__HtmlType__Group_2__4__Impl : ( ( ',' )? ) ;
    public final void rule__HtmlType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3286:1: ( ( ( ',' )? ) )
            // InternalDsl.g:3287:1: ( ( ',' )? )
            {
            // InternalDsl.g:3287:1: ( ( ',' )? )
            // InternalDsl.g:3288:2: ( ',' )?
            {
             before(grammarAccess.getHtmlTypeAccess().getCommaKeyword_2_4()); 
            // InternalDsl.g:3289:2: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:3289:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHtmlTypeAccess().getCommaKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__4__Impl"


    // $ANTLR start "rule__HtmlType__Group_2__5"
    // InternalDsl.g:3297:1: rule__HtmlType__Group_2__5 : rule__HtmlType__Group_2__5__Impl ;
    public final void rule__HtmlType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3301:1: ( rule__HtmlType__Group_2__5__Impl )
            // InternalDsl.g:3302:2: rule__HtmlType__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HtmlType__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__5"


    // $ANTLR start "rule__HtmlType__Group_2__5__Impl"
    // InternalDsl.g:3308:1: rule__HtmlType__Group_2__5__Impl : ( '}' ) ;
    public final void rule__HtmlType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3312:1: ( ( '}' ) )
            // InternalDsl.g:3313:1: ( '}' )
            {
            // InternalDsl.g:3313:1: ( '}' )
            // InternalDsl.g:3314:2: '}'
            {
             before(grammarAccess.getHtmlTypeAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHtmlTypeAccess().getRightCurlyBracketKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__Group_2__5__Impl"


    // $ANTLR start "rule__SourceStore__Group__0"
    // InternalDsl.g:3324:1: rule__SourceStore__Group__0 : rule__SourceStore__Group__0__Impl rule__SourceStore__Group__1 ;
    public final void rule__SourceStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3328:1: ( rule__SourceStore__Group__0__Impl rule__SourceStore__Group__1 )
            // InternalDsl.g:3329:2: rule__SourceStore__Group__0__Impl rule__SourceStore__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__SourceStore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__Group__0"


    // $ANTLR start "rule__SourceStore__Group__0__Impl"
    // InternalDsl.g:3336:1: rule__SourceStore__Group__0__Impl : ( 'store' ) ;
    public final void rule__SourceStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3340:1: ( ( 'store' ) )
            // InternalDsl.g:3341:1: ( 'store' )
            {
            // InternalDsl.g:3341:1: ( 'store' )
            // InternalDsl.g:3342:2: 'store'
            {
             before(grammarAccess.getSourceStoreAccess().getStoreKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSourceStoreAccess().getStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__Group__0__Impl"


    // $ANTLR start "rule__SourceStore__Group__1"
    // InternalDsl.g:3351:1: rule__SourceStore__Group__1 : rule__SourceStore__Group__1__Impl rule__SourceStore__Group__2 ;
    public final void rule__SourceStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3355:1: ( rule__SourceStore__Group__1__Impl rule__SourceStore__Group__2 )
            // InternalDsl.g:3356:2: rule__SourceStore__Group__1__Impl rule__SourceStore__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__SourceStore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__Group__1"


    // $ANTLR start "rule__SourceStore__Group__1__Impl"
    // InternalDsl.g:3363:1: rule__SourceStore__Group__1__Impl : ( ( rule__SourceStore__MetadataAssignment_1 ) ) ;
    public final void rule__SourceStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3367:1: ( ( ( rule__SourceStore__MetadataAssignment_1 ) ) )
            // InternalDsl.g:3368:1: ( ( rule__SourceStore__MetadataAssignment_1 ) )
            {
            // InternalDsl.g:3368:1: ( ( rule__SourceStore__MetadataAssignment_1 ) )
            // InternalDsl.g:3369:2: ( rule__SourceStore__MetadataAssignment_1 )
            {
             before(grammarAccess.getSourceStoreAccess().getMetadataAssignment_1()); 
            // InternalDsl.g:3370:2: ( rule__SourceStore__MetadataAssignment_1 )
            // InternalDsl.g:3370:3: rule__SourceStore__MetadataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceStore__MetadataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceStoreAccess().getMetadataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__Group__1__Impl"


    // $ANTLR start "rule__SourceStore__Group__2"
    // InternalDsl.g:3378:1: rule__SourceStore__Group__2 : rule__SourceStore__Group__2__Impl rule__SourceStore__Group__3 ;
    public final void rule__SourceStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3382:1: ( rule__SourceStore__Group__2__Impl rule__SourceStore__Group__3 )
            // InternalDsl.g:3383:2: rule__SourceStore__Group__2__Impl rule__SourceStore__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SourceStore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceStore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__Group__2"


    // $ANTLR start "rule__SourceStore__Group__2__Impl"
    // InternalDsl.g:3390:1: rule__SourceStore__Group__2__Impl : ( 'in' ) ;
    public final void rule__SourceStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3394:1: ( ( 'in' ) )
            // InternalDsl.g:3395:1: ( 'in' )
            {
            // InternalDsl.g:3395:1: ( 'in' )
            // InternalDsl.g:3396:2: 'in'
            {
             before(grammarAccess.getSourceStoreAccess().getInKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSourceStoreAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__Group__2__Impl"


    // $ANTLR start "rule__SourceStore__Group__3"
    // InternalDsl.g:3405:1: rule__SourceStore__Group__3 : rule__SourceStore__Group__3__Impl ;
    public final void rule__SourceStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3409:1: ( rule__SourceStore__Group__3__Impl )
            // InternalDsl.g:3410:2: rule__SourceStore__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceStore__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__Group__3"


    // $ANTLR start "rule__SourceStore__Group__3__Impl"
    // InternalDsl.g:3416:1: rule__SourceStore__Group__3__Impl : ( ( rule__SourceStore__ColumnAssignment_3 ) ) ;
    public final void rule__SourceStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3420:1: ( ( ( rule__SourceStore__ColumnAssignment_3 ) ) )
            // InternalDsl.g:3421:1: ( ( rule__SourceStore__ColumnAssignment_3 ) )
            {
            // InternalDsl.g:3421:1: ( ( rule__SourceStore__ColumnAssignment_3 ) )
            // InternalDsl.g:3422:2: ( rule__SourceStore__ColumnAssignment_3 )
            {
             before(grammarAccess.getSourceStoreAccess().getColumnAssignment_3()); 
            // InternalDsl.g:3423:2: ( rule__SourceStore__ColumnAssignment_3 )
            // InternalDsl.g:3423:3: rule__SourceStore__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SourceStore__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSourceStoreAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__Group__3__Impl"


    // $ANTLR start "rule__SourceCoumnSelect__Group__0"
    // InternalDsl.g:3432:1: rule__SourceCoumnSelect__Group__0 : rule__SourceCoumnSelect__Group__0__Impl rule__SourceCoumnSelect__Group__1 ;
    public final void rule__SourceCoumnSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3436:1: ( rule__SourceCoumnSelect__Group__0__Impl rule__SourceCoumnSelect__Group__1 )
            // InternalDsl.g:3437:2: rule__SourceCoumnSelect__Group__0__Impl rule__SourceCoumnSelect__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SourceCoumnSelect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__0"


    // $ANTLR start "rule__SourceCoumnSelect__Group__0__Impl"
    // InternalDsl.g:3444:1: rule__SourceCoumnSelect__Group__0__Impl : ( 'select' ) ;
    public final void rule__SourceCoumnSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3448:1: ( ( 'select' ) )
            // InternalDsl.g:3449:1: ( 'select' )
            {
            // InternalDsl.g:3449:1: ( 'select' )
            // InternalDsl.g:3450:2: 'select'
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getSelectKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSourceCoumnSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__0__Impl"


    // $ANTLR start "rule__SourceCoumnSelect__Group__1"
    // InternalDsl.g:3459:1: rule__SourceCoumnSelect__Group__1 : rule__SourceCoumnSelect__Group__1__Impl rule__SourceCoumnSelect__Group__2 ;
    public final void rule__SourceCoumnSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3463:1: ( rule__SourceCoumnSelect__Group__1__Impl rule__SourceCoumnSelect__Group__2 )
            // InternalDsl.g:3464:2: rule__SourceCoumnSelect__Group__1__Impl rule__SourceCoumnSelect__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SourceCoumnSelect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__1"


    // $ANTLR start "rule__SourceCoumnSelect__Group__1__Impl"
    // InternalDsl.g:3471:1: rule__SourceCoumnSelect__Group__1__Impl : ( '[' ) ;
    public final void rule__SourceCoumnSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3475:1: ( ( '[' ) )
            // InternalDsl.g:3476:1: ( '[' )
            {
            // InternalDsl.g:3476:1: ( '[' )
            // InternalDsl.g:3477:2: '['
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getLeftSquareBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSourceCoumnSelectAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__1__Impl"


    // $ANTLR start "rule__SourceCoumnSelect__Group__2"
    // InternalDsl.g:3486:1: rule__SourceCoumnSelect__Group__2 : rule__SourceCoumnSelect__Group__2__Impl rule__SourceCoumnSelect__Group__3 ;
    public final void rule__SourceCoumnSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3490:1: ( rule__SourceCoumnSelect__Group__2__Impl rule__SourceCoumnSelect__Group__3 )
            // InternalDsl.g:3491:2: rule__SourceCoumnSelect__Group__2__Impl rule__SourceCoumnSelect__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SourceCoumnSelect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__2"


    // $ANTLR start "rule__SourceCoumnSelect__Group__2__Impl"
    // InternalDsl.g:3498:1: rule__SourceCoumnSelect__Group__2__Impl : ( ( rule__SourceCoumnSelect__ColumnAssignment_2 ) ) ;
    public final void rule__SourceCoumnSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3502:1: ( ( ( rule__SourceCoumnSelect__ColumnAssignment_2 ) ) )
            // InternalDsl.g:3503:1: ( ( rule__SourceCoumnSelect__ColumnAssignment_2 ) )
            {
            // InternalDsl.g:3503:1: ( ( rule__SourceCoumnSelect__ColumnAssignment_2 ) )
            // InternalDsl.g:3504:2: ( rule__SourceCoumnSelect__ColumnAssignment_2 )
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_2()); 
            // InternalDsl.g:3505:2: ( rule__SourceCoumnSelect__ColumnAssignment_2 )
            // InternalDsl.g:3505:3: rule__SourceCoumnSelect__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__2__Impl"


    // $ANTLR start "rule__SourceCoumnSelect__Group__3"
    // InternalDsl.g:3513:1: rule__SourceCoumnSelect__Group__3 : rule__SourceCoumnSelect__Group__3__Impl rule__SourceCoumnSelect__Group__4 ;
    public final void rule__SourceCoumnSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3517:1: ( rule__SourceCoumnSelect__Group__3__Impl rule__SourceCoumnSelect__Group__4 )
            // InternalDsl.g:3518:2: rule__SourceCoumnSelect__Group__3__Impl rule__SourceCoumnSelect__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SourceCoumnSelect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__3"


    // $ANTLR start "rule__SourceCoumnSelect__Group__3__Impl"
    // InternalDsl.g:3525:1: rule__SourceCoumnSelect__Group__3__Impl : ( ( rule__SourceCoumnSelect__Group_3__0 )* ) ;
    public final void rule__SourceCoumnSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3529:1: ( ( ( rule__SourceCoumnSelect__Group_3__0 )* ) )
            // InternalDsl.g:3530:1: ( ( rule__SourceCoumnSelect__Group_3__0 )* )
            {
            // InternalDsl.g:3530:1: ( ( rule__SourceCoumnSelect__Group_3__0 )* )
            // InternalDsl.g:3531:2: ( rule__SourceCoumnSelect__Group_3__0 )*
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getGroup_3()); 
            // InternalDsl.g:3532:2: ( rule__SourceCoumnSelect__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_STRING) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalDsl.g:3532:3: rule__SourceCoumnSelect__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SourceCoumnSelect__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSourceCoumnSelectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__3__Impl"


    // $ANTLR start "rule__SourceCoumnSelect__Group__4"
    // InternalDsl.g:3540:1: rule__SourceCoumnSelect__Group__4 : rule__SourceCoumnSelect__Group__4__Impl rule__SourceCoumnSelect__Group__5 ;
    public final void rule__SourceCoumnSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3544:1: ( rule__SourceCoumnSelect__Group__4__Impl rule__SourceCoumnSelect__Group__5 )
            // InternalDsl.g:3545:2: rule__SourceCoumnSelect__Group__4__Impl rule__SourceCoumnSelect__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SourceCoumnSelect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__4"


    // $ANTLR start "rule__SourceCoumnSelect__Group__4__Impl"
    // InternalDsl.g:3552:1: rule__SourceCoumnSelect__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__SourceCoumnSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3556:1: ( ( ( ',' )? ) )
            // InternalDsl.g:3557:1: ( ( ',' )? )
            {
            // InternalDsl.g:3557:1: ( ( ',' )? )
            // InternalDsl.g:3558:2: ( ',' )?
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_4()); 
            // InternalDsl.g:3559:2: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:3559:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__4__Impl"


    // $ANTLR start "rule__SourceCoumnSelect__Group__5"
    // InternalDsl.g:3567:1: rule__SourceCoumnSelect__Group__5 : rule__SourceCoumnSelect__Group__5__Impl ;
    public final void rule__SourceCoumnSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3571:1: ( rule__SourceCoumnSelect__Group__5__Impl )
            // InternalDsl.g:3572:2: rule__SourceCoumnSelect__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__5"


    // $ANTLR start "rule__SourceCoumnSelect__Group__5__Impl"
    // InternalDsl.g:3578:1: rule__SourceCoumnSelect__Group__5__Impl : ( ']' ) ;
    public final void rule__SourceCoumnSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3582:1: ( ( ']' ) )
            // InternalDsl.g:3583:1: ( ']' )
            {
            // InternalDsl.g:3583:1: ( ']' )
            // InternalDsl.g:3584:2: ']'
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getRightSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSourceCoumnSelectAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group__5__Impl"


    // $ANTLR start "rule__SourceCoumnSelect__Group_3__0"
    // InternalDsl.g:3594:1: rule__SourceCoumnSelect__Group_3__0 : rule__SourceCoumnSelect__Group_3__0__Impl rule__SourceCoumnSelect__Group_3__1 ;
    public final void rule__SourceCoumnSelect__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3598:1: ( rule__SourceCoumnSelect__Group_3__0__Impl rule__SourceCoumnSelect__Group_3__1 )
            // InternalDsl.g:3599:2: rule__SourceCoumnSelect__Group_3__0__Impl rule__SourceCoumnSelect__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__SourceCoumnSelect__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group_3__0"


    // $ANTLR start "rule__SourceCoumnSelect__Group_3__0__Impl"
    // InternalDsl.g:3606:1: rule__SourceCoumnSelect__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SourceCoumnSelect__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3610:1: ( ( ',' ) )
            // InternalDsl.g:3611:1: ( ',' )
            {
            // InternalDsl.g:3611:1: ( ',' )
            // InternalDsl.g:3612:2: ','
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group_3__0__Impl"


    // $ANTLR start "rule__SourceCoumnSelect__Group_3__1"
    // InternalDsl.g:3621:1: rule__SourceCoumnSelect__Group_3__1 : rule__SourceCoumnSelect__Group_3__1__Impl ;
    public final void rule__SourceCoumnSelect__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3625:1: ( rule__SourceCoumnSelect__Group_3__1__Impl )
            // InternalDsl.g:3626:2: rule__SourceCoumnSelect__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group_3__1"


    // $ANTLR start "rule__SourceCoumnSelect__Group_3__1__Impl"
    // InternalDsl.g:3632:1: rule__SourceCoumnSelect__Group_3__1__Impl : ( ( rule__SourceCoumnSelect__ColumnAssignment_3_1 ) ) ;
    public final void rule__SourceCoumnSelect__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3636:1: ( ( ( rule__SourceCoumnSelect__ColumnAssignment_3_1 ) ) )
            // InternalDsl.g:3637:1: ( ( rule__SourceCoumnSelect__ColumnAssignment_3_1 ) )
            {
            // InternalDsl.g:3637:1: ( ( rule__SourceCoumnSelect__ColumnAssignment_3_1 ) )
            // InternalDsl.g:3638:2: ( rule__SourceCoumnSelect__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_3_1()); 
            // InternalDsl.g:3639:2: ( rule__SourceCoumnSelect__ColumnAssignment_3_1 )
            // InternalDsl.g:3639:3: rule__SourceCoumnSelect__ColumnAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SourceCoumnSelect__ColumnAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__Group_3__1__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // InternalDsl.g:3648:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3652:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalDsl.g:3653:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Source__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0"


    // $ANTLR start "rule__Source__Group__0__Impl"
    // InternalDsl.g:3660:1: rule__Source__Group__0__Impl : ( 'import' ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3664:1: ( ( 'import' ) )
            // InternalDsl.g:3665:1: ( 'import' )
            {
            // InternalDsl.g:3665:1: ( 'import' )
            // InternalDsl.g:3666:2: 'import'
            {
             before(grammarAccess.getSourceAccess().getImportKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0__Impl"


    // $ANTLR start "rule__Source__Group__1"
    // InternalDsl.g:3675:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3679:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // InternalDsl.g:3680:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Source__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1"


    // $ANTLR start "rule__Source__Group__1__Impl"
    // InternalDsl.g:3687:1: rule__Source__Group__1__Impl : ( ( rule__Source__QueryAssignment_1 )? ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3691:1: ( ( ( rule__Source__QueryAssignment_1 )? ) )
            // InternalDsl.g:3692:1: ( ( rule__Source__QueryAssignment_1 )? )
            {
            // InternalDsl.g:3692:1: ( ( rule__Source__QueryAssignment_1 )? )
            // InternalDsl.g:3693:2: ( rule__Source__QueryAssignment_1 )?
            {
             before(grammarAccess.getSourceAccess().getQueryAssignment_1()); 
            // InternalDsl.g:3694:2: ( rule__Source__QueryAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:3694:3: rule__Source__QueryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__QueryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getQueryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1__Impl"


    // $ANTLR start "rule__Source__Group__2"
    // InternalDsl.g:3702:1: rule__Source__Group__2 : rule__Source__Group__2__Impl rule__Source__Group__3 ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3706:1: ( rule__Source__Group__2__Impl rule__Source__Group__3 )
            // InternalDsl.g:3707:2: rule__Source__Group__2__Impl rule__Source__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Source__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2"


    // $ANTLR start "rule__Source__Group__2__Impl"
    // InternalDsl.g:3714:1: rule__Source__Group__2__Impl : ( 'from' ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3718:1: ( ( 'from' ) )
            // InternalDsl.g:3719:1: ( 'from' )
            {
            // InternalDsl.g:3719:1: ( 'from' )
            // InternalDsl.g:3720:2: 'from'
            {
             before(grammarAccess.getSourceAccess().getFromKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2__Impl"


    // $ANTLR start "rule__Source__Group__3"
    // InternalDsl.g:3729:1: rule__Source__Group__3 : rule__Source__Group__3__Impl rule__Source__Group__4 ;
    public final void rule__Source__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3733:1: ( rule__Source__Group__3__Impl rule__Source__Group__4 )
            // InternalDsl.g:3734:2: rule__Source__Group__3__Impl rule__Source__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Source__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3"


    // $ANTLR start "rule__Source__Group__3__Impl"
    // InternalDsl.g:3741:1: rule__Source__Group__3__Impl : ( ( rule__Source__FilePathAssignment_3 ) ) ;
    public final void rule__Source__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3745:1: ( ( ( rule__Source__FilePathAssignment_3 ) ) )
            // InternalDsl.g:3746:1: ( ( rule__Source__FilePathAssignment_3 ) )
            {
            // InternalDsl.g:3746:1: ( ( rule__Source__FilePathAssignment_3 ) )
            // InternalDsl.g:3747:2: ( rule__Source__FilePathAssignment_3 )
            {
             before(grammarAccess.getSourceAccess().getFilePathAssignment_3()); 
            // InternalDsl.g:3748:2: ( rule__Source__FilePathAssignment_3 )
            // InternalDsl.g:3748:3: rule__Source__FilePathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Source__FilePathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getFilePathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3__Impl"


    // $ANTLR start "rule__Source__Group__4"
    // InternalDsl.g:3756:1: rule__Source__Group__4 : rule__Source__Group__4__Impl rule__Source__Group__5 ;
    public final void rule__Source__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3760:1: ( rule__Source__Group__4__Impl rule__Source__Group__5 )
            // InternalDsl.g:3761:2: rule__Source__Group__4__Impl rule__Source__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Source__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4"


    // $ANTLR start "rule__Source__Group__4__Impl"
    // InternalDsl.g:3768:1: rule__Source__Group__4__Impl : ( ( rule__Source__Group_4__0 )? ) ;
    public final void rule__Source__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3772:1: ( ( ( rule__Source__Group_4__0 )? ) )
            // InternalDsl.g:3773:1: ( ( rule__Source__Group_4__0 )? )
            {
            // InternalDsl.g:3773:1: ( ( rule__Source__Group_4__0 )? )
            // InternalDsl.g:3774:2: ( rule__Source__Group_4__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_4()); 
            // InternalDsl.g:3775:2: ( rule__Source__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:3775:3: rule__Source__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4__Impl"


    // $ANTLR start "rule__Source__Group__5"
    // InternalDsl.g:3783:1: rule__Source__Group__5 : rule__Source__Group__5__Impl rule__Source__Group__6 ;
    public final void rule__Source__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3787:1: ( rule__Source__Group__5__Impl rule__Source__Group__6 )
            // InternalDsl.g:3788:2: rule__Source__Group__5__Impl rule__Source__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Source__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__5"


    // $ANTLR start "rule__Source__Group__5__Impl"
    // InternalDsl.g:3795:1: rule__Source__Group__5__Impl : ( ( rule__Source__StoreAssignment_5 )* ) ;
    public final void rule__Source__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3799:1: ( ( ( rule__Source__StoreAssignment_5 )* ) )
            // InternalDsl.g:3800:1: ( ( rule__Source__StoreAssignment_5 )* )
            {
            // InternalDsl.g:3800:1: ( ( rule__Source__StoreAssignment_5 )* )
            // InternalDsl.g:3801:2: ( rule__Source__StoreAssignment_5 )*
            {
             before(grammarAccess.getSourceAccess().getStoreAssignment_5()); 
            // InternalDsl.g:3802:2: ( rule__Source__StoreAssignment_5 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDsl.g:3802:3: rule__Source__StoreAssignment_5
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Source__StoreAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getStoreAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__5__Impl"


    // $ANTLR start "rule__Source__Group__6"
    // InternalDsl.g:3810:1: rule__Source__Group__6 : rule__Source__Group__6__Impl rule__Source__Group__7 ;
    public final void rule__Source__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3814:1: ( rule__Source__Group__6__Impl rule__Source__Group__7 )
            // InternalDsl.g:3815:2: rule__Source__Group__6__Impl rule__Source__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__Source__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__6"


    // $ANTLR start "rule__Source__Group__6__Impl"
    // InternalDsl.g:3822:1: rule__Source__Group__6__Impl : ( ( rule__Source__SelectAssignment_6 )? ) ;
    public final void rule__Source__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3826:1: ( ( ( rule__Source__SelectAssignment_6 )? ) )
            // InternalDsl.g:3827:1: ( ( rule__Source__SelectAssignment_6 )? )
            {
            // InternalDsl.g:3827:1: ( ( rule__Source__SelectAssignment_6 )? )
            // InternalDsl.g:3828:2: ( rule__Source__SelectAssignment_6 )?
            {
             before(grammarAccess.getSourceAccess().getSelectAssignment_6()); 
            // InternalDsl.g:3829:2: ( rule__Source__SelectAssignment_6 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:3829:3: rule__Source__SelectAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__SelectAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getSelectAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__6__Impl"


    // $ANTLR start "rule__Source__Group__7"
    // InternalDsl.g:3837:1: rule__Source__Group__7 : rule__Source__Group__7__Impl ;
    public final void rule__Source__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3841:1: ( rule__Source__Group__7__Impl )
            // InternalDsl.g:3842:2: rule__Source__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__7"


    // $ANTLR start "rule__Source__Group__7__Impl"
    // InternalDsl.g:3848:1: rule__Source__Group__7__Impl : ( ';' ) ;
    public final void rule__Source__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3852:1: ( ( ';' ) )
            // InternalDsl.g:3853:1: ( ';' )
            {
            // InternalDsl.g:3853:1: ( ';' )
            // InternalDsl.g:3854:2: ';'
            {
             before(grammarAccess.getSourceAccess().getSemicolonKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__7__Impl"


    // $ANTLR start "rule__Source__Group_4__0"
    // InternalDsl.g:3864:1: rule__Source__Group_4__0 : rule__Source__Group_4__0__Impl rule__Source__Group_4__1 ;
    public final void rule__Source__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3868:1: ( rule__Source__Group_4__0__Impl rule__Source__Group_4__1 )
            // InternalDsl.g:3869:2: rule__Source__Group_4__0__Impl rule__Source__Group_4__1
            {
            pushFollow(FOLLOW_39);
            rule__Source__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_4__0"


    // $ANTLR start "rule__Source__Group_4__0__Impl"
    // InternalDsl.g:3876:1: rule__Source__Group_4__0__Impl : ( 'as' ) ;
    public final void rule__Source__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3880:1: ( ( 'as' ) )
            // InternalDsl.g:3881:1: ( 'as' )
            {
            // InternalDsl.g:3881:1: ( 'as' )
            // InternalDsl.g:3882:2: 'as'
            {
             before(grammarAccess.getSourceAccess().getAsKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getAsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_4__0__Impl"


    // $ANTLR start "rule__Source__Group_4__1"
    // InternalDsl.g:3891:1: rule__Source__Group_4__1 : rule__Source__Group_4__1__Impl ;
    public final void rule__Source__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3895:1: ( rule__Source__Group_4__1__Impl )
            // InternalDsl.g:3896:2: rule__Source__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_4__1"


    // $ANTLR start "rule__Source__Group_4__1__Impl"
    // InternalDsl.g:3902:1: rule__Source__Group_4__1__Impl : ( ( rule__Source__InputTypeAssignment_4_1 ) ) ;
    public final void rule__Source__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3906:1: ( ( ( rule__Source__InputTypeAssignment_4_1 ) ) )
            // InternalDsl.g:3907:1: ( ( rule__Source__InputTypeAssignment_4_1 ) )
            {
            // InternalDsl.g:3907:1: ( ( rule__Source__InputTypeAssignment_4_1 ) )
            // InternalDsl.g:3908:2: ( rule__Source__InputTypeAssignment_4_1 )
            {
             before(grammarAccess.getSourceAccess().getInputTypeAssignment_4_1()); 
            // InternalDsl.g:3909:2: ( rule__Source__InputTypeAssignment_4_1 )
            // InternalDsl.g:3909:3: rule__Source__InputTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__InputTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getInputTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_4__1__Impl"


    // $ANTLR start "rule__CanonicalizePathTransformation__Group__0"
    // InternalDsl.g:3918:1: rule__CanonicalizePathTransformation__Group__0 : rule__CanonicalizePathTransformation__Group__0__Impl rule__CanonicalizePathTransformation__Group__1 ;
    public final void rule__CanonicalizePathTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3922:1: ( rule__CanonicalizePathTransformation__Group__0__Impl rule__CanonicalizePathTransformation__Group__1 )
            // InternalDsl.g:3923:2: rule__CanonicalizePathTransformation__Group__0__Impl rule__CanonicalizePathTransformation__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__CanonicalizePathTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CanonicalizePathTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CanonicalizePathTransformation__Group__0"


    // $ANTLR start "rule__CanonicalizePathTransformation__Group__0__Impl"
    // InternalDsl.g:3930:1: rule__CanonicalizePathTransformation__Group__0__Impl : ( () ) ;
    public final void rule__CanonicalizePathTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3934:1: ( ( () ) )
            // InternalDsl.g:3935:1: ( () )
            {
            // InternalDsl.g:3935:1: ( () )
            // InternalDsl.g:3936:2: ()
            {
             before(grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizePathTransformationAction_0()); 
            // InternalDsl.g:3937:2: ()
            // InternalDsl.g:3937:3: 
            {
            }

             after(grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizePathTransformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CanonicalizePathTransformation__Group__0__Impl"


    // $ANTLR start "rule__CanonicalizePathTransformation__Group__1"
    // InternalDsl.g:3945:1: rule__CanonicalizePathTransformation__Group__1 : rule__CanonicalizePathTransformation__Group__1__Impl rule__CanonicalizePathTransformation__Group__2 ;
    public final void rule__CanonicalizePathTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3949:1: ( rule__CanonicalizePathTransformation__Group__1__Impl rule__CanonicalizePathTransformation__Group__2 )
            // InternalDsl.g:3950:2: rule__CanonicalizePathTransformation__Group__1__Impl rule__CanonicalizePathTransformation__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__CanonicalizePathTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CanonicalizePathTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CanonicalizePathTransformation__Group__1"


    // $ANTLR start "rule__CanonicalizePathTransformation__Group__1__Impl"
    // InternalDsl.g:3957:1: rule__CanonicalizePathTransformation__Group__1__Impl : ( 'canonicalize' ) ;
    public final void rule__CanonicalizePathTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3961:1: ( ( 'canonicalize' ) )
            // InternalDsl.g:3962:1: ( 'canonicalize' )
            {
            // InternalDsl.g:3962:1: ( 'canonicalize' )
            // InternalDsl.g:3963:2: 'canonicalize'
            {
             before(grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizeKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CanonicalizePathTransformation__Group__1__Impl"


    // $ANTLR start "rule__CanonicalizePathTransformation__Group__2"
    // InternalDsl.g:3972:1: rule__CanonicalizePathTransformation__Group__2 : rule__CanonicalizePathTransformation__Group__2__Impl ;
    public final void rule__CanonicalizePathTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3976:1: ( rule__CanonicalizePathTransformation__Group__2__Impl )
            // InternalDsl.g:3977:2: rule__CanonicalizePathTransformation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CanonicalizePathTransformation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CanonicalizePathTransformation__Group__2"


    // $ANTLR start "rule__CanonicalizePathTransformation__Group__2__Impl"
    // InternalDsl.g:3983:1: rule__CanonicalizePathTransformation__Group__2__Impl : ( 'path' ) ;
    public final void rule__CanonicalizePathTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3987:1: ( ( 'path' ) )
            // InternalDsl.g:3988:1: ( 'path' )
            {
            // InternalDsl.g:3988:1: ( 'path' )
            // InternalDsl.g:3989:2: 'path'
            {
             before(grammarAccess.getCanonicalizePathTransformationAccess().getPathKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCanonicalizePathTransformationAccess().getPathKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CanonicalizePathTransformation__Group__2__Impl"


    // $ANTLR start "rule__GetPathTransformation__Group__0"
    // InternalDsl.g:3999:1: rule__GetPathTransformation__Group__0 : rule__GetPathTransformation__Group__0__Impl rule__GetPathTransformation__Group__1 ;
    public final void rule__GetPathTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4003:1: ( rule__GetPathTransformation__Group__0__Impl rule__GetPathTransformation__Group__1 )
            // InternalDsl.g:4004:2: rule__GetPathTransformation__Group__0__Impl rule__GetPathTransformation__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__GetPathTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetPathTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPathTransformation__Group__0"


    // $ANTLR start "rule__GetPathTransformation__Group__0__Impl"
    // InternalDsl.g:4011:1: rule__GetPathTransformation__Group__0__Impl : ( () ) ;
    public final void rule__GetPathTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4015:1: ( ( () ) )
            // InternalDsl.g:4016:1: ( () )
            {
            // InternalDsl.g:4016:1: ( () )
            // InternalDsl.g:4017:2: ()
            {
             before(grammarAccess.getGetPathTransformationAccess().getGetPathTransformationAction_0()); 
            // InternalDsl.g:4018:2: ()
            // InternalDsl.g:4018:3: 
            {
            }

             after(grammarAccess.getGetPathTransformationAccess().getGetPathTransformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPathTransformation__Group__0__Impl"


    // $ANTLR start "rule__GetPathTransformation__Group__1"
    // InternalDsl.g:4026:1: rule__GetPathTransformation__Group__1 : rule__GetPathTransformation__Group__1__Impl rule__GetPathTransformation__Group__2 ;
    public final void rule__GetPathTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4030:1: ( rule__GetPathTransformation__Group__1__Impl rule__GetPathTransformation__Group__2 )
            // InternalDsl.g:4031:2: rule__GetPathTransformation__Group__1__Impl rule__GetPathTransformation__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__GetPathTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetPathTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPathTransformation__Group__1"


    // $ANTLR start "rule__GetPathTransformation__Group__1__Impl"
    // InternalDsl.g:4038:1: rule__GetPathTransformation__Group__1__Impl : ( 'name' ) ;
    public final void rule__GetPathTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4042:1: ( ( 'name' ) )
            // InternalDsl.g:4043:1: ( 'name' )
            {
            // InternalDsl.g:4043:1: ( 'name' )
            // InternalDsl.g:4044:2: 'name'
            {
             before(grammarAccess.getGetPathTransformationAccess().getNameKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getGetPathTransformationAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPathTransformation__Group__1__Impl"


    // $ANTLR start "rule__GetPathTransformation__Group__2"
    // InternalDsl.g:4053:1: rule__GetPathTransformation__Group__2 : rule__GetPathTransformation__Group__2__Impl rule__GetPathTransformation__Group__3 ;
    public final void rule__GetPathTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4057:1: ( rule__GetPathTransformation__Group__2__Impl rule__GetPathTransformation__Group__3 )
            // InternalDsl.g:4058:2: rule__GetPathTransformation__Group__2__Impl rule__GetPathTransformation__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__GetPathTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetPathTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPathTransformation__Group__2"


    // $ANTLR start "rule__GetPathTransformation__Group__2__Impl"
    // InternalDsl.g:4065:1: rule__GetPathTransformation__Group__2__Impl : ( 'of' ) ;
    public final void rule__GetPathTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4069:1: ( ( 'of' ) )
            // InternalDsl.g:4070:1: ( 'of' )
            {
            // InternalDsl.g:4070:1: ( 'of' )
            // InternalDsl.g:4071:2: 'of'
            {
             before(grammarAccess.getGetPathTransformationAccess().getOfKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getGetPathTransformationAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPathTransformation__Group__2__Impl"


    // $ANTLR start "rule__GetPathTransformation__Group__3"
    // InternalDsl.g:4080:1: rule__GetPathTransformation__Group__3 : rule__GetPathTransformation__Group__3__Impl ;
    public final void rule__GetPathTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4084:1: ( rule__GetPathTransformation__Group__3__Impl )
            // InternalDsl.g:4085:2: rule__GetPathTransformation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetPathTransformation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPathTransformation__Group__3"


    // $ANTLR start "rule__GetPathTransformation__Group__3__Impl"
    // InternalDsl.g:4091:1: rule__GetPathTransformation__Group__3__Impl : ( 'path' ) ;
    public final void rule__GetPathTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4095:1: ( ( 'path' ) )
            // InternalDsl.g:4096:1: ( 'path' )
            {
            // InternalDsl.g:4096:1: ( 'path' )
            // InternalDsl.g:4097:2: 'path'
            {
             before(grammarAccess.getGetPathTransformationAccess().getPathKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGetPathTransformationAccess().getPathKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetPathTransformation__Group__3__Impl"


    // $ANTLR start "rule__AppendPathTransformation__Group__0"
    // InternalDsl.g:4107:1: rule__AppendPathTransformation__Group__0 : rule__AppendPathTransformation__Group__0__Impl rule__AppendPathTransformation__Group__1 ;
    public final void rule__AppendPathTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4111:1: ( rule__AppendPathTransformation__Group__0__Impl rule__AppendPathTransformation__Group__1 )
            // InternalDsl.g:4112:2: rule__AppendPathTransformation__Group__0__Impl rule__AppendPathTransformation__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__AppendPathTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppendPathTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppendPathTransformation__Group__0"


    // $ANTLR start "rule__AppendPathTransformation__Group__0__Impl"
    // InternalDsl.g:4119:1: rule__AppendPathTransformation__Group__0__Impl : ( 'append' ) ;
    public final void rule__AppendPathTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4123:1: ( ( 'append' ) )
            // InternalDsl.g:4124:1: ( 'append' )
            {
            // InternalDsl.g:4124:1: ( 'append' )
            // InternalDsl.g:4125:2: 'append'
            {
             before(grammarAccess.getAppendPathTransformationAccess().getAppendKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAppendPathTransformationAccess().getAppendKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppendPathTransformation__Group__0__Impl"


    // $ANTLR start "rule__AppendPathTransformation__Group__1"
    // InternalDsl.g:4134:1: rule__AppendPathTransformation__Group__1 : rule__AppendPathTransformation__Group__1__Impl rule__AppendPathTransformation__Group__2 ;
    public final void rule__AppendPathTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4138:1: ( rule__AppendPathTransformation__Group__1__Impl rule__AppendPathTransformation__Group__2 )
            // InternalDsl.g:4139:2: rule__AppendPathTransformation__Group__1__Impl rule__AppendPathTransformation__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__AppendPathTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppendPathTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppendPathTransformation__Group__1"


    // $ANTLR start "rule__AppendPathTransformation__Group__1__Impl"
    // InternalDsl.g:4146:1: rule__AppendPathTransformation__Group__1__Impl : ( 'path' ) ;
    public final void rule__AppendPathTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4150:1: ( ( 'path' ) )
            // InternalDsl.g:4151:1: ( 'path' )
            {
            // InternalDsl.g:4151:1: ( 'path' )
            // InternalDsl.g:4152:2: 'path'
            {
             before(grammarAccess.getAppendPathTransformationAccess().getPathKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAppendPathTransformationAccess().getPathKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppendPathTransformation__Group__1__Impl"


    // $ANTLR start "rule__AppendPathTransformation__Group__2"
    // InternalDsl.g:4161:1: rule__AppendPathTransformation__Group__2 : rule__AppendPathTransformation__Group__2__Impl ;
    public final void rule__AppendPathTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4165:1: ( rule__AppendPathTransformation__Group__2__Impl )
            // InternalDsl.g:4166:2: rule__AppendPathTransformation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppendPathTransformation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppendPathTransformation__Group__2"


    // $ANTLR start "rule__AppendPathTransformation__Group__2__Impl"
    // InternalDsl.g:4172:1: rule__AppendPathTransformation__Group__2__Impl : ( ( rule__AppendPathTransformation__PathAssignment_2 ) ) ;
    public final void rule__AppendPathTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4176:1: ( ( ( rule__AppendPathTransformation__PathAssignment_2 ) ) )
            // InternalDsl.g:4177:1: ( ( rule__AppendPathTransformation__PathAssignment_2 ) )
            {
            // InternalDsl.g:4177:1: ( ( rule__AppendPathTransformation__PathAssignment_2 ) )
            // InternalDsl.g:4178:2: ( rule__AppendPathTransformation__PathAssignment_2 )
            {
             before(grammarAccess.getAppendPathTransformationAccess().getPathAssignment_2()); 
            // InternalDsl.g:4179:2: ( rule__AppendPathTransformation__PathAssignment_2 )
            // InternalDsl.g:4179:3: rule__AppendPathTransformation__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AppendPathTransformation__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAppendPathTransformationAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppendPathTransformation__Group__2__Impl"


    // $ANTLR start "rule__PathTransformation__Group__0"
    // InternalDsl.g:4188:1: rule__PathTransformation__Group__0 : rule__PathTransformation__Group__0__Impl rule__PathTransformation__Group__1 ;
    public final void rule__PathTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4192:1: ( rule__PathTransformation__Group__0__Impl rule__PathTransformation__Group__1 )
            // InternalDsl.g:4193:2: rule__PathTransformation__Group__0__Impl rule__PathTransformation__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__PathTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__Group__0"


    // $ANTLR start "rule__PathTransformation__Group__0__Impl"
    // InternalDsl.g:4200:1: rule__PathTransformation__Group__0__Impl : ( ( rule__PathTransformation__OperationAssignment_0 ) ) ;
    public final void rule__PathTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4204:1: ( ( ( rule__PathTransformation__OperationAssignment_0 ) ) )
            // InternalDsl.g:4205:1: ( ( rule__PathTransformation__OperationAssignment_0 ) )
            {
            // InternalDsl.g:4205:1: ( ( rule__PathTransformation__OperationAssignment_0 ) )
            // InternalDsl.g:4206:2: ( rule__PathTransformation__OperationAssignment_0 )
            {
             before(grammarAccess.getPathTransformationAccess().getOperationAssignment_0()); 
            // InternalDsl.g:4207:2: ( rule__PathTransformation__OperationAssignment_0 )
            // InternalDsl.g:4207:3: rule__PathTransformation__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PathTransformation__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathTransformationAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__Group__0__Impl"


    // $ANTLR start "rule__PathTransformation__Group__1"
    // InternalDsl.g:4215:1: rule__PathTransformation__Group__1 : rule__PathTransformation__Group__1__Impl rule__PathTransformation__Group__2 ;
    public final void rule__PathTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4219:1: ( rule__PathTransformation__Group__1__Impl rule__PathTransformation__Group__2 )
            // InternalDsl.g:4220:2: rule__PathTransformation__Group__1__Impl rule__PathTransformation__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__PathTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__Group__1"


    // $ANTLR start "rule__PathTransformation__Group__1__Impl"
    // InternalDsl.g:4227:1: rule__PathTransformation__Group__1__Impl : ( 'in' ) ;
    public final void rule__PathTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4231:1: ( ( 'in' ) )
            // InternalDsl.g:4232:1: ( 'in' )
            {
            // InternalDsl.g:4232:1: ( 'in' )
            // InternalDsl.g:4233:2: 'in'
            {
             before(grammarAccess.getPathTransformationAccess().getInKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPathTransformationAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__Group__1__Impl"


    // $ANTLR start "rule__PathTransformation__Group__2"
    // InternalDsl.g:4242:1: rule__PathTransformation__Group__2 : rule__PathTransformation__Group__2__Impl ;
    public final void rule__PathTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4246:1: ( rule__PathTransformation__Group__2__Impl )
            // InternalDsl.g:4247:2: rule__PathTransformation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathTransformation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__Group__2"


    // $ANTLR start "rule__PathTransformation__Group__2__Impl"
    // InternalDsl.g:4253:1: rule__PathTransformation__Group__2__Impl : ( ( rule__PathTransformation__ColumnAssignment_2 ) ) ;
    public final void rule__PathTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4257:1: ( ( ( rule__PathTransformation__ColumnAssignment_2 ) ) )
            // InternalDsl.g:4258:1: ( ( rule__PathTransformation__ColumnAssignment_2 ) )
            {
            // InternalDsl.g:4258:1: ( ( rule__PathTransformation__ColumnAssignment_2 ) )
            // InternalDsl.g:4259:2: ( rule__PathTransformation__ColumnAssignment_2 )
            {
             before(grammarAccess.getPathTransformationAccess().getColumnAssignment_2()); 
            // InternalDsl.g:4260:2: ( rule__PathTransformation__ColumnAssignment_2 )
            // InternalDsl.g:4260:3: rule__PathTransformation__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PathTransformation__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPathTransformationAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__Group__2__Impl"


    // $ANTLR start "rule__FoldAverageTranformation__Group__0"
    // InternalDsl.g:4269:1: rule__FoldAverageTranformation__Group__0 : rule__FoldAverageTranformation__Group__0__Impl rule__FoldAverageTranformation__Group__1 ;
    public final void rule__FoldAverageTranformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4273:1: ( rule__FoldAverageTranformation__Group__0__Impl rule__FoldAverageTranformation__Group__1 )
            // InternalDsl.g:4274:2: rule__FoldAverageTranformation__Group__0__Impl rule__FoldAverageTranformation__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__FoldAverageTranformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoldAverageTranformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldAverageTranformation__Group__0"


    // $ANTLR start "rule__FoldAverageTranformation__Group__0__Impl"
    // InternalDsl.g:4281:1: rule__FoldAverageTranformation__Group__0__Impl : ( () ) ;
    public final void rule__FoldAverageTranformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4285:1: ( ( () ) )
            // InternalDsl.g:4286:1: ( () )
            {
            // InternalDsl.g:4286:1: ( () )
            // InternalDsl.g:4287:2: ()
            {
             before(grammarAccess.getFoldAverageTranformationAccess().getFoldAverageTranformationAction_0()); 
            // InternalDsl.g:4288:2: ()
            // InternalDsl.g:4288:3: 
            {
            }

             after(grammarAccess.getFoldAverageTranformationAccess().getFoldAverageTranformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldAverageTranformation__Group__0__Impl"


    // $ANTLR start "rule__FoldAverageTranformation__Group__1"
    // InternalDsl.g:4296:1: rule__FoldAverageTranformation__Group__1 : rule__FoldAverageTranformation__Group__1__Impl rule__FoldAverageTranformation__Group__2 ;
    public final void rule__FoldAverageTranformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4300:1: ( rule__FoldAverageTranformation__Group__1__Impl rule__FoldAverageTranformation__Group__2 )
            // InternalDsl.g:4301:2: rule__FoldAverageTranformation__Group__1__Impl rule__FoldAverageTranformation__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__FoldAverageTranformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoldAverageTranformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldAverageTranformation__Group__1"


    // $ANTLR start "rule__FoldAverageTranformation__Group__1__Impl"
    // InternalDsl.g:4308:1: rule__FoldAverageTranformation__Group__1__Impl : ( 'fold' ) ;
    public final void rule__FoldAverageTranformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4312:1: ( ( 'fold' ) )
            // InternalDsl.g:4313:1: ( 'fold' )
            {
            // InternalDsl.g:4313:1: ( 'fold' )
            // InternalDsl.g:4314:2: 'fold'
            {
             before(grammarAccess.getFoldAverageTranformationAccess().getFoldKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFoldAverageTranformationAccess().getFoldKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldAverageTranformation__Group__1__Impl"


    // $ANTLR start "rule__FoldAverageTranformation__Group__2"
    // InternalDsl.g:4323:1: rule__FoldAverageTranformation__Group__2 : rule__FoldAverageTranformation__Group__2__Impl ;
    public final void rule__FoldAverageTranformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4327:1: ( rule__FoldAverageTranformation__Group__2__Impl )
            // InternalDsl.g:4328:2: rule__FoldAverageTranformation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoldAverageTranformation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldAverageTranformation__Group__2"


    // $ANTLR start "rule__FoldAverageTranformation__Group__2__Impl"
    // InternalDsl.g:4334:1: rule__FoldAverageTranformation__Group__2__Impl : ( 'average' ) ;
    public final void rule__FoldAverageTranformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4338:1: ( ( 'average' ) )
            // InternalDsl.g:4339:1: ( 'average' )
            {
            // InternalDsl.g:4339:1: ( 'average' )
            // InternalDsl.g:4340:2: 'average'
            {
             before(grammarAccess.getFoldAverageTranformationAccess().getAverageKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFoldAverageTranformationAccess().getAverageKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldAverageTranformation__Group__2__Impl"


    // $ANTLR start "rule__FoldSumTranformation__Group__0"
    // InternalDsl.g:4350:1: rule__FoldSumTranformation__Group__0 : rule__FoldSumTranformation__Group__0__Impl rule__FoldSumTranformation__Group__1 ;
    public final void rule__FoldSumTranformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4354:1: ( rule__FoldSumTranformation__Group__0__Impl rule__FoldSumTranformation__Group__1 )
            // InternalDsl.g:4355:2: rule__FoldSumTranformation__Group__0__Impl rule__FoldSumTranformation__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__FoldSumTranformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoldSumTranformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldSumTranformation__Group__0"


    // $ANTLR start "rule__FoldSumTranformation__Group__0__Impl"
    // InternalDsl.g:4362:1: rule__FoldSumTranformation__Group__0__Impl : ( () ) ;
    public final void rule__FoldSumTranformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4366:1: ( ( () ) )
            // InternalDsl.g:4367:1: ( () )
            {
            // InternalDsl.g:4367:1: ( () )
            // InternalDsl.g:4368:2: ()
            {
             before(grammarAccess.getFoldSumTranformationAccess().getFoldSumTranformationAction_0()); 
            // InternalDsl.g:4369:2: ()
            // InternalDsl.g:4369:3: 
            {
            }

             after(grammarAccess.getFoldSumTranformationAccess().getFoldSumTranformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldSumTranformation__Group__0__Impl"


    // $ANTLR start "rule__FoldSumTranformation__Group__1"
    // InternalDsl.g:4377:1: rule__FoldSumTranformation__Group__1 : rule__FoldSumTranformation__Group__1__Impl rule__FoldSumTranformation__Group__2 ;
    public final void rule__FoldSumTranformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4381:1: ( rule__FoldSumTranformation__Group__1__Impl rule__FoldSumTranformation__Group__2 )
            // InternalDsl.g:4382:2: rule__FoldSumTranformation__Group__1__Impl rule__FoldSumTranformation__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__FoldSumTranformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoldSumTranformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldSumTranformation__Group__1"


    // $ANTLR start "rule__FoldSumTranformation__Group__1__Impl"
    // InternalDsl.g:4389:1: rule__FoldSumTranformation__Group__1__Impl : ( 'fold' ) ;
    public final void rule__FoldSumTranformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4393:1: ( ( 'fold' ) )
            // InternalDsl.g:4394:1: ( 'fold' )
            {
            // InternalDsl.g:4394:1: ( 'fold' )
            // InternalDsl.g:4395:2: 'fold'
            {
             before(grammarAccess.getFoldSumTranformationAccess().getFoldKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFoldSumTranformationAccess().getFoldKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldSumTranformation__Group__1__Impl"


    // $ANTLR start "rule__FoldSumTranformation__Group__2"
    // InternalDsl.g:4404:1: rule__FoldSumTranformation__Group__2 : rule__FoldSumTranformation__Group__2__Impl ;
    public final void rule__FoldSumTranformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4408:1: ( rule__FoldSumTranformation__Group__2__Impl )
            // InternalDsl.g:4409:2: rule__FoldSumTranformation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoldSumTranformation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldSumTranformation__Group__2"


    // $ANTLR start "rule__FoldSumTranformation__Group__2__Impl"
    // InternalDsl.g:4415:1: rule__FoldSumTranformation__Group__2__Impl : ( 'sum' ) ;
    public final void rule__FoldSumTranformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4419:1: ( ( 'sum' ) )
            // InternalDsl.g:4420:1: ( 'sum' )
            {
            // InternalDsl.g:4420:1: ( 'sum' )
            // InternalDsl.g:4421:2: 'sum'
            {
             before(grammarAccess.getFoldSumTranformationAccess().getSumKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFoldSumTranformationAccess().getSumKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldSumTranformation__Group__2__Impl"


    // $ANTLR start "rule__GroupBy__Group__0"
    // InternalDsl.g:4431:1: rule__GroupBy__Group__0 : rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1 ;
    public final void rule__GroupBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4435:1: ( rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1 )
            // InternalDsl.g:4436:2: rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__GroupBy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__0"


    // $ANTLR start "rule__GroupBy__Group__0__Impl"
    // InternalDsl.g:4443:1: rule__GroupBy__Group__0__Impl : ( 'group' ) ;
    public final void rule__GroupBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4447:1: ( ( 'group' ) )
            // InternalDsl.g:4448:1: ( 'group' )
            {
            // InternalDsl.g:4448:1: ( 'group' )
            // InternalDsl.g:4449:2: 'group'
            {
             before(grammarAccess.getGroupByAccess().getGroupKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getGroupByAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__0__Impl"


    // $ANTLR start "rule__GroupBy__Group__1"
    // InternalDsl.g:4458:1: rule__GroupBy__Group__1 : rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2 ;
    public final void rule__GroupBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4462:1: ( rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2 )
            // InternalDsl.g:4463:2: rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__GroupBy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupBy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__1"


    // $ANTLR start "rule__GroupBy__Group__1__Impl"
    // InternalDsl.g:4470:1: rule__GroupBy__Group__1__Impl : ( 'by' ) ;
    public final void rule__GroupBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4474:1: ( ( 'by' ) )
            // InternalDsl.g:4475:1: ( 'by' )
            {
            // InternalDsl.g:4475:1: ( 'by' )
            // InternalDsl.g:4476:2: 'by'
            {
             before(grammarAccess.getGroupByAccess().getByKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getGroupByAccess().getByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__1__Impl"


    // $ANTLR start "rule__GroupBy__Group__2"
    // InternalDsl.g:4485:1: rule__GroupBy__Group__2 : rule__GroupBy__Group__2__Impl ;
    public final void rule__GroupBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4489:1: ( rule__GroupBy__Group__2__Impl )
            // InternalDsl.g:4490:2: rule__GroupBy__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupBy__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__2"


    // $ANTLR start "rule__GroupBy__Group__2__Impl"
    // InternalDsl.g:4496:1: rule__GroupBy__Group__2__Impl : ( ( rule__GroupBy__ColumnAssignment_2 ) ) ;
    public final void rule__GroupBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4500:1: ( ( ( rule__GroupBy__ColumnAssignment_2 ) ) )
            // InternalDsl.g:4501:1: ( ( rule__GroupBy__ColumnAssignment_2 ) )
            {
            // InternalDsl.g:4501:1: ( ( rule__GroupBy__ColumnAssignment_2 ) )
            // InternalDsl.g:4502:2: ( rule__GroupBy__ColumnAssignment_2 )
            {
             before(grammarAccess.getGroupByAccess().getColumnAssignment_2()); 
            // InternalDsl.g:4503:2: ( rule__GroupBy__ColumnAssignment_2 )
            // InternalDsl.g:4503:3: rule__GroupBy__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GroupBy__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupByAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__Group__2__Impl"


    // $ANTLR start "rule__FoldTransformation__Group__0"
    // InternalDsl.g:4512:1: rule__FoldTransformation__Group__0 : rule__FoldTransformation__Group__0__Impl rule__FoldTransformation__Group__1 ;
    public final void rule__FoldTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4516:1: ( rule__FoldTransformation__Group__0__Impl rule__FoldTransformation__Group__1 )
            // InternalDsl.g:4517:2: rule__FoldTransformation__Group__0__Impl rule__FoldTransformation__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__FoldTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoldTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldTransformation__Group__0"


    // $ANTLR start "rule__FoldTransformation__Group__0__Impl"
    // InternalDsl.g:4524:1: rule__FoldTransformation__Group__0__Impl : ( ( rule__FoldTransformation__OperationAssignment_0 ) ) ;
    public final void rule__FoldTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4528:1: ( ( ( rule__FoldTransformation__OperationAssignment_0 ) ) )
            // InternalDsl.g:4529:1: ( ( rule__FoldTransformation__OperationAssignment_0 ) )
            {
            // InternalDsl.g:4529:1: ( ( rule__FoldTransformation__OperationAssignment_0 ) )
            // InternalDsl.g:4530:2: ( rule__FoldTransformation__OperationAssignment_0 )
            {
             before(grammarAccess.getFoldTransformationAccess().getOperationAssignment_0()); 
            // InternalDsl.g:4531:2: ( rule__FoldTransformation__OperationAssignment_0 )
            // InternalDsl.g:4531:3: rule__FoldTransformation__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FoldTransformation__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFoldTransformationAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldTransformation__Group__0__Impl"


    // $ANTLR start "rule__FoldTransformation__Group__1"
    // InternalDsl.g:4539:1: rule__FoldTransformation__Group__1 : rule__FoldTransformation__Group__1__Impl ;
    public final void rule__FoldTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4543:1: ( rule__FoldTransformation__Group__1__Impl )
            // InternalDsl.g:4544:2: rule__FoldTransformation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoldTransformation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldTransformation__Group__1"


    // $ANTLR start "rule__FoldTransformation__Group__1__Impl"
    // InternalDsl.g:4550:1: rule__FoldTransformation__Group__1__Impl : ( ( rule__FoldTransformation__GroupByAssignment_1 )? ) ;
    public final void rule__FoldTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4554:1: ( ( ( rule__FoldTransformation__GroupByAssignment_1 )? ) )
            // InternalDsl.g:4555:1: ( ( rule__FoldTransformation__GroupByAssignment_1 )? )
            {
            // InternalDsl.g:4555:1: ( ( rule__FoldTransformation__GroupByAssignment_1 )? )
            // InternalDsl.g:4556:2: ( rule__FoldTransformation__GroupByAssignment_1 )?
            {
             before(grammarAccess.getFoldTransformationAccess().getGroupByAssignment_1()); 
            // InternalDsl.g:4557:2: ( rule__FoldTransformation__GroupByAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:4557:3: rule__FoldTransformation__GroupByAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FoldTransformation__GroupByAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFoldTransformationAccess().getGroupByAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldTransformation__Group__1__Impl"


    // $ANTLR start "rule__AddColumnTransformation__Group__0"
    // InternalDsl.g:4566:1: rule__AddColumnTransformation__Group__0 : rule__AddColumnTransformation__Group__0__Impl rule__AddColumnTransformation__Group__1 ;
    public final void rule__AddColumnTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4570:1: ( rule__AddColumnTransformation__Group__0__Impl rule__AddColumnTransformation__Group__1 )
            // InternalDsl.g:4571:2: rule__AddColumnTransformation__Group__0__Impl rule__AddColumnTransformation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AddColumnTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddColumnTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__Group__0"


    // $ANTLR start "rule__AddColumnTransformation__Group__0__Impl"
    // InternalDsl.g:4578:1: rule__AddColumnTransformation__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddColumnTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4582:1: ( ( 'add' ) )
            // InternalDsl.g:4583:1: ( 'add' )
            {
            // InternalDsl.g:4583:1: ( 'add' )
            // InternalDsl.g:4584:2: 'add'
            {
             before(grammarAccess.getAddColumnTransformationAccess().getAddKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAddColumnTransformationAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__Group__0__Impl"


    // $ANTLR start "rule__AddColumnTransformation__Group__1"
    // InternalDsl.g:4593:1: rule__AddColumnTransformation__Group__1 : rule__AddColumnTransformation__Group__1__Impl rule__AddColumnTransformation__Group__2 ;
    public final void rule__AddColumnTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4597:1: ( rule__AddColumnTransformation__Group__1__Impl rule__AddColumnTransformation__Group__2 )
            // InternalDsl.g:4598:2: rule__AddColumnTransformation__Group__1__Impl rule__AddColumnTransformation__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__AddColumnTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddColumnTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__Group__1"


    // $ANTLR start "rule__AddColumnTransformation__Group__1__Impl"
    // InternalDsl.g:4605:1: rule__AddColumnTransformation__Group__1__Impl : ( ( rule__AddColumnTransformation__ColumnAssignment_1 ) ) ;
    public final void rule__AddColumnTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4609:1: ( ( ( rule__AddColumnTransformation__ColumnAssignment_1 ) ) )
            // InternalDsl.g:4610:1: ( ( rule__AddColumnTransformation__ColumnAssignment_1 ) )
            {
            // InternalDsl.g:4610:1: ( ( rule__AddColumnTransformation__ColumnAssignment_1 ) )
            // InternalDsl.g:4611:2: ( rule__AddColumnTransformation__ColumnAssignment_1 )
            {
             before(grammarAccess.getAddColumnTransformationAccess().getColumnAssignment_1()); 
            // InternalDsl.g:4612:2: ( rule__AddColumnTransformation__ColumnAssignment_1 )
            // InternalDsl.g:4612:3: rule__AddColumnTransformation__ColumnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddColumnTransformation__ColumnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddColumnTransformationAccess().getColumnAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__Group__1__Impl"


    // $ANTLR start "rule__AddColumnTransformation__Group__2"
    // InternalDsl.g:4620:1: rule__AddColumnTransformation__Group__2 : rule__AddColumnTransformation__Group__2__Impl rule__AddColumnTransformation__Group__3 ;
    public final void rule__AddColumnTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4624:1: ( rule__AddColumnTransformation__Group__2__Impl rule__AddColumnTransformation__Group__3 )
            // InternalDsl.g:4625:2: rule__AddColumnTransformation__Group__2__Impl rule__AddColumnTransformation__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__AddColumnTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddColumnTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__Group__2"


    // $ANTLR start "rule__AddColumnTransformation__Group__2__Impl"
    // InternalDsl.g:4632:1: rule__AddColumnTransformation__Group__2__Impl : ( 'with' ) ;
    public final void rule__AddColumnTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4636:1: ( ( 'with' ) )
            // InternalDsl.g:4637:1: ( 'with' )
            {
            // InternalDsl.g:4637:1: ( 'with' )
            // InternalDsl.g:4638:2: 'with'
            {
             before(grammarAccess.getAddColumnTransformationAccess().getWithKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAddColumnTransformationAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__Group__2__Impl"


    // $ANTLR start "rule__AddColumnTransformation__Group__3"
    // InternalDsl.g:4647:1: rule__AddColumnTransformation__Group__3 : rule__AddColumnTransformation__Group__3__Impl ;
    public final void rule__AddColumnTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4651:1: ( rule__AddColumnTransformation__Group__3__Impl )
            // InternalDsl.g:4652:2: rule__AddColumnTransformation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddColumnTransformation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__Group__3"


    // $ANTLR start "rule__AddColumnTransformation__Group__3__Impl"
    // InternalDsl.g:4658:1: rule__AddColumnTransformation__Group__3__Impl : ( ( rule__AddColumnTransformation__ValueAssignment_3 ) ) ;
    public final void rule__AddColumnTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4662:1: ( ( ( rule__AddColumnTransformation__ValueAssignment_3 ) ) )
            // InternalDsl.g:4663:1: ( ( rule__AddColumnTransformation__ValueAssignment_3 ) )
            {
            // InternalDsl.g:4663:1: ( ( rule__AddColumnTransformation__ValueAssignment_3 ) )
            // InternalDsl.g:4664:2: ( rule__AddColumnTransformation__ValueAssignment_3 )
            {
             before(grammarAccess.getAddColumnTransformationAccess().getValueAssignment_3()); 
            // InternalDsl.g:4665:2: ( rule__AddColumnTransformation__ValueAssignment_3 )
            // InternalDsl.g:4665:3: rule__AddColumnTransformation__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddColumnTransformation__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddColumnTransformationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__Group__3__Impl"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__0"
    // InternalDsl.g:4674:1: rule__RemoveColumnTransformation__Group__0 : rule__RemoveColumnTransformation__Group__0__Impl rule__RemoveColumnTransformation__Group__1 ;
    public final void rule__RemoveColumnTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4678:1: ( rule__RemoveColumnTransformation__Group__0__Impl rule__RemoveColumnTransformation__Group__1 )
            // InternalDsl.g:4679:2: rule__RemoveColumnTransformation__Group__0__Impl rule__RemoveColumnTransformation__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__RemoveColumnTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__0"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__0__Impl"
    // InternalDsl.g:4686:1: rule__RemoveColumnTransformation__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveColumnTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4690:1: ( ( 'remove' ) )
            // InternalDsl.g:4691:1: ( 'remove' )
            {
            // InternalDsl.g:4691:1: ( 'remove' )
            // InternalDsl.g:4692:2: 'remove'
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getRemoveKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRemoveColumnTransformationAccess().getRemoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__0__Impl"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__1"
    // InternalDsl.g:4701:1: rule__RemoveColumnTransformation__Group__1 : rule__RemoveColumnTransformation__Group__1__Impl rule__RemoveColumnTransformation__Group__2 ;
    public final void rule__RemoveColumnTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4705:1: ( rule__RemoveColumnTransformation__Group__1__Impl rule__RemoveColumnTransformation__Group__2 )
            // InternalDsl.g:4706:2: rule__RemoveColumnTransformation__Group__1__Impl rule__RemoveColumnTransformation__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RemoveColumnTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__1"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__1__Impl"
    // InternalDsl.g:4713:1: rule__RemoveColumnTransformation__Group__1__Impl : ( '[' ) ;
    public final void rule__RemoveColumnTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4717:1: ( ( '[' ) )
            // InternalDsl.g:4718:1: ( '[' )
            {
            // InternalDsl.g:4718:1: ( '[' )
            // InternalDsl.g:4719:2: '['
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRemoveColumnTransformationAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__1__Impl"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__2"
    // InternalDsl.g:4728:1: rule__RemoveColumnTransformation__Group__2 : rule__RemoveColumnTransformation__Group__2__Impl rule__RemoveColumnTransformation__Group__3 ;
    public final void rule__RemoveColumnTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4732:1: ( rule__RemoveColumnTransformation__Group__2__Impl rule__RemoveColumnTransformation__Group__3 )
            // InternalDsl.g:4733:2: rule__RemoveColumnTransformation__Group__2__Impl rule__RemoveColumnTransformation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__RemoveColumnTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__2"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__2__Impl"
    // InternalDsl.g:4740:1: rule__RemoveColumnTransformation__Group__2__Impl : ( ( rule__RemoveColumnTransformation__ColumnAssignment_2 ) ) ;
    public final void rule__RemoveColumnTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4744:1: ( ( ( rule__RemoveColumnTransformation__ColumnAssignment_2 ) ) )
            // InternalDsl.g:4745:1: ( ( rule__RemoveColumnTransformation__ColumnAssignment_2 ) )
            {
            // InternalDsl.g:4745:1: ( ( rule__RemoveColumnTransformation__ColumnAssignment_2 ) )
            // InternalDsl.g:4746:2: ( rule__RemoveColumnTransformation__ColumnAssignment_2 )
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_2()); 
            // InternalDsl.g:4747:2: ( rule__RemoveColumnTransformation__ColumnAssignment_2 )
            // InternalDsl.g:4747:3: rule__RemoveColumnTransformation__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__2__Impl"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__3"
    // InternalDsl.g:4755:1: rule__RemoveColumnTransformation__Group__3 : rule__RemoveColumnTransformation__Group__3__Impl rule__RemoveColumnTransformation__Group__4 ;
    public final void rule__RemoveColumnTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4759:1: ( rule__RemoveColumnTransformation__Group__3__Impl rule__RemoveColumnTransformation__Group__4 )
            // InternalDsl.g:4760:2: rule__RemoveColumnTransformation__Group__3__Impl rule__RemoveColumnTransformation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RemoveColumnTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__3"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__3__Impl"
    // InternalDsl.g:4767:1: rule__RemoveColumnTransformation__Group__3__Impl : ( ( rule__RemoveColumnTransformation__Group_3__0 )* ) ;
    public final void rule__RemoveColumnTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4771:1: ( ( ( rule__RemoveColumnTransformation__Group_3__0 )* ) )
            // InternalDsl.g:4772:1: ( ( rule__RemoveColumnTransformation__Group_3__0 )* )
            {
            // InternalDsl.g:4772:1: ( ( rule__RemoveColumnTransformation__Group_3__0 )* )
            // InternalDsl.g:4773:2: ( rule__RemoveColumnTransformation__Group_3__0 )*
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getGroup_3()); 
            // InternalDsl.g:4774:2: ( rule__RemoveColumnTransformation__Group_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==21) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==RULE_STRING) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalDsl.g:4774:3: rule__RemoveColumnTransformation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RemoveColumnTransformation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getRemoveColumnTransformationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__3__Impl"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__4"
    // InternalDsl.g:4782:1: rule__RemoveColumnTransformation__Group__4 : rule__RemoveColumnTransformation__Group__4__Impl rule__RemoveColumnTransformation__Group__5 ;
    public final void rule__RemoveColumnTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4786:1: ( rule__RemoveColumnTransformation__Group__4__Impl rule__RemoveColumnTransformation__Group__5 )
            // InternalDsl.g:4787:2: rule__RemoveColumnTransformation__Group__4__Impl rule__RemoveColumnTransformation__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__RemoveColumnTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__4"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__4__Impl"
    // InternalDsl.g:4794:1: rule__RemoveColumnTransformation__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__RemoveColumnTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4798:1: ( ( ( ',' )? ) )
            // InternalDsl.g:4799:1: ( ( ',' )? )
            {
            // InternalDsl.g:4799:1: ( ( ',' )? )
            // InternalDsl.g:4800:2: ( ',' )?
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_4()); 
            // InternalDsl.g:4801:2: ( ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:4801:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__4__Impl"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__5"
    // InternalDsl.g:4809:1: rule__RemoveColumnTransformation__Group__5 : rule__RemoveColumnTransformation__Group__5__Impl ;
    public final void rule__RemoveColumnTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4813:1: ( rule__RemoveColumnTransformation__Group__5__Impl )
            // InternalDsl.g:4814:2: rule__RemoveColumnTransformation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__5"


    // $ANTLR start "rule__RemoveColumnTransformation__Group__5__Impl"
    // InternalDsl.g:4820:1: rule__RemoveColumnTransformation__Group__5__Impl : ( ']' ) ;
    public final void rule__RemoveColumnTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4824:1: ( ( ']' ) )
            // InternalDsl.g:4825:1: ( ']' )
            {
            // InternalDsl.g:4825:1: ( ']' )
            // InternalDsl.g:4826:2: ']'
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getRightSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRemoveColumnTransformationAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group__5__Impl"


    // $ANTLR start "rule__RemoveColumnTransformation__Group_3__0"
    // InternalDsl.g:4836:1: rule__RemoveColumnTransformation__Group_3__0 : rule__RemoveColumnTransformation__Group_3__0__Impl rule__RemoveColumnTransformation__Group_3__1 ;
    public final void rule__RemoveColumnTransformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4840:1: ( rule__RemoveColumnTransformation__Group_3__0__Impl rule__RemoveColumnTransformation__Group_3__1 )
            // InternalDsl.g:4841:2: rule__RemoveColumnTransformation__Group_3__0__Impl rule__RemoveColumnTransformation__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__RemoveColumnTransformation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group_3__0"


    // $ANTLR start "rule__RemoveColumnTransformation__Group_3__0__Impl"
    // InternalDsl.g:4848:1: rule__RemoveColumnTransformation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RemoveColumnTransformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4852:1: ( ( ',' ) )
            // InternalDsl.g:4853:1: ( ',' )
            {
            // InternalDsl.g:4853:1: ( ',' )
            // InternalDsl.g:4854:2: ','
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group_3__0__Impl"


    // $ANTLR start "rule__RemoveColumnTransformation__Group_3__1"
    // InternalDsl.g:4863:1: rule__RemoveColumnTransformation__Group_3__1 : rule__RemoveColumnTransformation__Group_3__1__Impl ;
    public final void rule__RemoveColumnTransformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4867:1: ( rule__RemoveColumnTransformation__Group_3__1__Impl )
            // InternalDsl.g:4868:2: rule__RemoveColumnTransformation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group_3__1"


    // $ANTLR start "rule__RemoveColumnTransformation__Group_3__1__Impl"
    // InternalDsl.g:4874:1: rule__RemoveColumnTransformation__Group_3__1__Impl : ( ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 ) ) ;
    public final void rule__RemoveColumnTransformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4878:1: ( ( ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 ) ) )
            // InternalDsl.g:4879:1: ( ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 ) )
            {
            // InternalDsl.g:4879:1: ( ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 ) )
            // InternalDsl.g:4880:2: ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_3_1()); 
            // InternalDsl.g:4881:2: ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 )
            // InternalDsl.g:4881:3: rule__RemoveColumnTransformation__ColumnAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveColumnTransformation__ColumnAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__Group_3__1__Impl"


    // $ANTLR start "rule__RenameColumnTransformation__Group__0"
    // InternalDsl.g:4890:1: rule__RenameColumnTransformation__Group__0 : rule__RenameColumnTransformation__Group__0__Impl rule__RenameColumnTransformation__Group__1 ;
    public final void rule__RenameColumnTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4894:1: ( rule__RenameColumnTransformation__Group__0__Impl rule__RenameColumnTransformation__Group__1 )
            // InternalDsl.g:4895:2: rule__RenameColumnTransformation__Group__0__Impl rule__RenameColumnTransformation__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__RenameColumnTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__0"


    // $ANTLR start "rule__RenameColumnTransformation__Group__0__Impl"
    // InternalDsl.g:4902:1: rule__RenameColumnTransformation__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameColumnTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4906:1: ( ( 'rename' ) )
            // InternalDsl.g:4907:1: ( 'rename' )
            {
            // InternalDsl.g:4907:1: ( 'rename' )
            // InternalDsl.g:4908:2: 'rename'
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getRenameKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRenameColumnTransformationAccess().getRenameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__0__Impl"


    // $ANTLR start "rule__RenameColumnTransformation__Group__1"
    // InternalDsl.g:4917:1: rule__RenameColumnTransformation__Group__1 : rule__RenameColumnTransformation__Group__1__Impl rule__RenameColumnTransformation__Group__2 ;
    public final void rule__RenameColumnTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4921:1: ( rule__RenameColumnTransformation__Group__1__Impl rule__RenameColumnTransformation__Group__2 )
            // InternalDsl.g:4922:2: rule__RenameColumnTransformation__Group__1__Impl rule__RenameColumnTransformation__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__RenameColumnTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__1"


    // $ANTLR start "rule__RenameColumnTransformation__Group__1__Impl"
    // InternalDsl.g:4929:1: rule__RenameColumnTransformation__Group__1__Impl : ( ( rule__RenameColumnTransformation__RegexAssignment_1 )? ) ;
    public final void rule__RenameColumnTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4933:1: ( ( ( rule__RenameColumnTransformation__RegexAssignment_1 )? ) )
            // InternalDsl.g:4934:1: ( ( rule__RenameColumnTransformation__RegexAssignment_1 )? )
            {
            // InternalDsl.g:4934:1: ( ( rule__RenameColumnTransformation__RegexAssignment_1 )? )
            // InternalDsl.g:4935:2: ( rule__RenameColumnTransformation__RegexAssignment_1 )?
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getRegexAssignment_1()); 
            // InternalDsl.g:4936:2: ( rule__RenameColumnTransformation__RegexAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==70) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:4936:3: rule__RenameColumnTransformation__RegexAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RenameColumnTransformation__RegexAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRenameColumnTransformationAccess().getRegexAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__1__Impl"


    // $ANTLR start "rule__RenameColumnTransformation__Group__2"
    // InternalDsl.g:4944:1: rule__RenameColumnTransformation__Group__2 : rule__RenameColumnTransformation__Group__2__Impl rule__RenameColumnTransformation__Group__3 ;
    public final void rule__RenameColumnTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4948:1: ( rule__RenameColumnTransformation__Group__2__Impl rule__RenameColumnTransformation__Group__3 )
            // InternalDsl.g:4949:2: rule__RenameColumnTransformation__Group__2__Impl rule__RenameColumnTransformation__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__RenameColumnTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__2"


    // $ANTLR start "rule__RenameColumnTransformation__Group__2__Impl"
    // InternalDsl.g:4956:1: rule__RenameColumnTransformation__Group__2__Impl : ( ( rule__RenameColumnTransformation__FromAssignment_2 ) ) ;
    public final void rule__RenameColumnTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4960:1: ( ( ( rule__RenameColumnTransformation__FromAssignment_2 ) ) )
            // InternalDsl.g:4961:1: ( ( rule__RenameColumnTransformation__FromAssignment_2 ) )
            {
            // InternalDsl.g:4961:1: ( ( rule__RenameColumnTransformation__FromAssignment_2 ) )
            // InternalDsl.g:4962:2: ( rule__RenameColumnTransformation__FromAssignment_2 )
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getFromAssignment_2()); 
            // InternalDsl.g:4963:2: ( rule__RenameColumnTransformation__FromAssignment_2 )
            // InternalDsl.g:4963:3: rule__RenameColumnTransformation__FromAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnTransformationAccess().getFromAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__2__Impl"


    // $ANTLR start "rule__RenameColumnTransformation__Group__3"
    // InternalDsl.g:4971:1: rule__RenameColumnTransformation__Group__3 : rule__RenameColumnTransformation__Group__3__Impl rule__RenameColumnTransformation__Group__4 ;
    public final void rule__RenameColumnTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4975:1: ( rule__RenameColumnTransformation__Group__3__Impl rule__RenameColumnTransformation__Group__4 )
            // InternalDsl.g:4976:2: rule__RenameColumnTransformation__Group__3__Impl rule__RenameColumnTransformation__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__RenameColumnTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__3"


    // $ANTLR start "rule__RenameColumnTransformation__Group__3__Impl"
    // InternalDsl.g:4983:1: rule__RenameColumnTransformation__Group__3__Impl : ( 'to' ) ;
    public final void rule__RenameColumnTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4987:1: ( ( 'to' ) )
            // InternalDsl.g:4988:1: ( 'to' )
            {
            // InternalDsl.g:4988:1: ( 'to' )
            // InternalDsl.g:4989:2: 'to'
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getToKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRenameColumnTransformationAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__3__Impl"


    // $ANTLR start "rule__RenameColumnTransformation__Group__4"
    // InternalDsl.g:4998:1: rule__RenameColumnTransformation__Group__4 : rule__RenameColumnTransformation__Group__4__Impl ;
    public final void rule__RenameColumnTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5002:1: ( rule__RenameColumnTransformation__Group__4__Impl )
            // InternalDsl.g:5003:2: rule__RenameColumnTransformation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__4"


    // $ANTLR start "rule__RenameColumnTransformation__Group__4__Impl"
    // InternalDsl.g:5009:1: rule__RenameColumnTransformation__Group__4__Impl : ( ( rule__RenameColumnTransformation__ToAssignment_4 ) ) ;
    public final void rule__RenameColumnTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5013:1: ( ( ( rule__RenameColumnTransformation__ToAssignment_4 ) ) )
            // InternalDsl.g:5014:1: ( ( rule__RenameColumnTransformation__ToAssignment_4 ) )
            {
            // InternalDsl.g:5014:1: ( ( rule__RenameColumnTransformation__ToAssignment_4 ) )
            // InternalDsl.g:5015:2: ( rule__RenameColumnTransformation__ToAssignment_4 )
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getToAssignment_4()); 
            // InternalDsl.g:5016:2: ( rule__RenameColumnTransformation__ToAssignment_4 )
            // InternalDsl.g:5016:3: rule__RenameColumnTransformation__ToAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnTransformationAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__Group__4__Impl"


    // $ANTLR start "rule__SelectColumnTransformation__Group__0"
    // InternalDsl.g:5025:1: rule__SelectColumnTransformation__Group__0 : rule__SelectColumnTransformation__Group__0__Impl rule__SelectColumnTransformation__Group__1 ;
    public final void rule__SelectColumnTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5029:1: ( rule__SelectColumnTransformation__Group__0__Impl rule__SelectColumnTransformation__Group__1 )
            // InternalDsl.g:5030:2: rule__SelectColumnTransformation__Group__0__Impl rule__SelectColumnTransformation__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SelectColumnTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__0"


    // $ANTLR start "rule__SelectColumnTransformation__Group__0__Impl"
    // InternalDsl.g:5037:1: rule__SelectColumnTransformation__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectColumnTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5041:1: ( ( 'select' ) )
            // InternalDsl.g:5042:1: ( 'select' )
            {
            // InternalDsl.g:5042:1: ( 'select' )
            // InternalDsl.g:5043:2: 'select'
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getSelectKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSelectColumnTransformationAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__0__Impl"


    // $ANTLR start "rule__SelectColumnTransformation__Group__1"
    // InternalDsl.g:5052:1: rule__SelectColumnTransformation__Group__1 : rule__SelectColumnTransformation__Group__1__Impl rule__SelectColumnTransformation__Group__2 ;
    public final void rule__SelectColumnTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5056:1: ( rule__SelectColumnTransformation__Group__1__Impl rule__SelectColumnTransformation__Group__2 )
            // InternalDsl.g:5057:2: rule__SelectColumnTransformation__Group__1__Impl rule__SelectColumnTransformation__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SelectColumnTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__1"


    // $ANTLR start "rule__SelectColumnTransformation__Group__1__Impl"
    // InternalDsl.g:5064:1: rule__SelectColumnTransformation__Group__1__Impl : ( '[' ) ;
    public final void rule__SelectColumnTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5068:1: ( ( '[' ) )
            // InternalDsl.g:5069:1: ( '[' )
            {
            // InternalDsl.g:5069:1: ( '[' )
            // InternalDsl.g:5070:2: '['
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSelectColumnTransformationAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__1__Impl"


    // $ANTLR start "rule__SelectColumnTransformation__Group__2"
    // InternalDsl.g:5079:1: rule__SelectColumnTransformation__Group__2 : rule__SelectColumnTransformation__Group__2__Impl rule__SelectColumnTransformation__Group__3 ;
    public final void rule__SelectColumnTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5083:1: ( rule__SelectColumnTransformation__Group__2__Impl rule__SelectColumnTransformation__Group__3 )
            // InternalDsl.g:5084:2: rule__SelectColumnTransformation__Group__2__Impl rule__SelectColumnTransformation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SelectColumnTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__2"


    // $ANTLR start "rule__SelectColumnTransformation__Group__2__Impl"
    // InternalDsl.g:5091:1: rule__SelectColumnTransformation__Group__2__Impl : ( ( rule__SelectColumnTransformation__ColumnAssignment_2 ) ) ;
    public final void rule__SelectColumnTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5095:1: ( ( ( rule__SelectColumnTransformation__ColumnAssignment_2 ) ) )
            // InternalDsl.g:5096:1: ( ( rule__SelectColumnTransformation__ColumnAssignment_2 ) )
            {
            // InternalDsl.g:5096:1: ( ( rule__SelectColumnTransformation__ColumnAssignment_2 ) )
            // InternalDsl.g:5097:2: ( rule__SelectColumnTransformation__ColumnAssignment_2 )
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_2()); 
            // InternalDsl.g:5098:2: ( rule__SelectColumnTransformation__ColumnAssignment_2 )
            // InternalDsl.g:5098:3: rule__SelectColumnTransformation__ColumnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__ColumnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__2__Impl"


    // $ANTLR start "rule__SelectColumnTransformation__Group__3"
    // InternalDsl.g:5106:1: rule__SelectColumnTransformation__Group__3 : rule__SelectColumnTransformation__Group__3__Impl rule__SelectColumnTransformation__Group__4 ;
    public final void rule__SelectColumnTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5110:1: ( rule__SelectColumnTransformation__Group__3__Impl rule__SelectColumnTransformation__Group__4 )
            // InternalDsl.g:5111:2: rule__SelectColumnTransformation__Group__3__Impl rule__SelectColumnTransformation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SelectColumnTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__3"


    // $ANTLR start "rule__SelectColumnTransformation__Group__3__Impl"
    // InternalDsl.g:5118:1: rule__SelectColumnTransformation__Group__3__Impl : ( ( rule__SelectColumnTransformation__Group_3__0 )* ) ;
    public final void rule__SelectColumnTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5122:1: ( ( ( rule__SelectColumnTransformation__Group_3__0 )* ) )
            // InternalDsl.g:5123:1: ( ( rule__SelectColumnTransformation__Group_3__0 )* )
            {
            // InternalDsl.g:5123:1: ( ( rule__SelectColumnTransformation__Group_3__0 )* )
            // InternalDsl.g:5124:2: ( rule__SelectColumnTransformation__Group_3__0 )*
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getGroup_3()); 
            // InternalDsl.g:5125:2: ( rule__SelectColumnTransformation__Group_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==21) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==RULE_STRING) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalDsl.g:5125:3: rule__SelectColumnTransformation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SelectColumnTransformation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSelectColumnTransformationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__3__Impl"


    // $ANTLR start "rule__SelectColumnTransformation__Group__4"
    // InternalDsl.g:5133:1: rule__SelectColumnTransformation__Group__4 : rule__SelectColumnTransformation__Group__4__Impl rule__SelectColumnTransformation__Group__5 ;
    public final void rule__SelectColumnTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5137:1: ( rule__SelectColumnTransformation__Group__4__Impl rule__SelectColumnTransformation__Group__5 )
            // InternalDsl.g:5138:2: rule__SelectColumnTransformation__Group__4__Impl rule__SelectColumnTransformation__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SelectColumnTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__4"


    // $ANTLR start "rule__SelectColumnTransformation__Group__4__Impl"
    // InternalDsl.g:5145:1: rule__SelectColumnTransformation__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__SelectColumnTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5149:1: ( ( ( ',' )? ) )
            // InternalDsl.g:5150:1: ( ( ',' )? )
            {
            // InternalDsl.g:5150:1: ( ( ',' )? )
            // InternalDsl.g:5151:2: ( ',' )?
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_4()); 
            // InternalDsl.g:5152:2: ( ',' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:5152:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__4__Impl"


    // $ANTLR start "rule__SelectColumnTransformation__Group__5"
    // InternalDsl.g:5160:1: rule__SelectColumnTransformation__Group__5 : rule__SelectColumnTransformation__Group__5__Impl ;
    public final void rule__SelectColumnTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5164:1: ( rule__SelectColumnTransformation__Group__5__Impl )
            // InternalDsl.g:5165:2: rule__SelectColumnTransformation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__5"


    // $ANTLR start "rule__SelectColumnTransformation__Group__5__Impl"
    // InternalDsl.g:5171:1: rule__SelectColumnTransformation__Group__5__Impl : ( ']' ) ;
    public final void rule__SelectColumnTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5175:1: ( ( ']' ) )
            // InternalDsl.g:5176:1: ( ']' )
            {
            // InternalDsl.g:5176:1: ( ']' )
            // InternalDsl.g:5177:2: ']'
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getRightSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelectColumnTransformationAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group__5__Impl"


    // $ANTLR start "rule__SelectColumnTransformation__Group_3__0"
    // InternalDsl.g:5187:1: rule__SelectColumnTransformation__Group_3__0 : rule__SelectColumnTransformation__Group_3__0__Impl rule__SelectColumnTransformation__Group_3__1 ;
    public final void rule__SelectColumnTransformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5191:1: ( rule__SelectColumnTransformation__Group_3__0__Impl rule__SelectColumnTransformation__Group_3__1 )
            // InternalDsl.g:5192:2: rule__SelectColumnTransformation__Group_3__0__Impl rule__SelectColumnTransformation__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__SelectColumnTransformation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group_3__0"


    // $ANTLR start "rule__SelectColumnTransformation__Group_3__0__Impl"
    // InternalDsl.g:5199:1: rule__SelectColumnTransformation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SelectColumnTransformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5203:1: ( ( ',' ) )
            // InternalDsl.g:5204:1: ( ',' )
            {
            // InternalDsl.g:5204:1: ( ',' )
            // InternalDsl.g:5205:2: ','
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group_3__0__Impl"


    // $ANTLR start "rule__SelectColumnTransformation__Group_3__1"
    // InternalDsl.g:5214:1: rule__SelectColumnTransformation__Group_3__1 : rule__SelectColumnTransformation__Group_3__1__Impl ;
    public final void rule__SelectColumnTransformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5218:1: ( rule__SelectColumnTransformation__Group_3__1__Impl )
            // InternalDsl.g:5219:2: rule__SelectColumnTransformation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group_3__1"


    // $ANTLR start "rule__SelectColumnTransformation__Group_3__1__Impl"
    // InternalDsl.g:5225:1: rule__SelectColumnTransformation__Group_3__1__Impl : ( ( rule__SelectColumnTransformation__ColumnAssignment_3_1 ) ) ;
    public final void rule__SelectColumnTransformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5229:1: ( ( ( rule__SelectColumnTransformation__ColumnAssignment_3_1 ) ) )
            // InternalDsl.g:5230:1: ( ( rule__SelectColumnTransformation__ColumnAssignment_3_1 ) )
            {
            // InternalDsl.g:5230:1: ( ( rule__SelectColumnTransformation__ColumnAssignment_3_1 ) )
            // InternalDsl.g:5231:2: ( rule__SelectColumnTransformation__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_3_1()); 
            // InternalDsl.g:5232:2: ( rule__SelectColumnTransformation__ColumnAssignment_3_1 )
            // InternalDsl.g:5232:3: rule__SelectColumnTransformation__ColumnAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectColumnTransformation__ColumnAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__Group_3__1__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group__0"
    // InternalDsl.g:5241:1: rule__RoundCellsTransformation__Group__0 : rule__RoundCellsTransformation__Group__0__Impl rule__RoundCellsTransformation__Group__1 ;
    public final void rule__RoundCellsTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5245:1: ( rule__RoundCellsTransformation__Group__0__Impl rule__RoundCellsTransformation__Group__1 )
            // InternalDsl.g:5246:2: rule__RoundCellsTransformation__Group__0__Impl rule__RoundCellsTransformation__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__RoundCellsTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__0"


    // $ANTLR start "rule__RoundCellsTransformation__Group__0__Impl"
    // InternalDsl.g:5253:1: rule__RoundCellsTransformation__Group__0__Impl : ( 'round' ) ;
    public final void rule__RoundCellsTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5257:1: ( ( 'round' ) )
            // InternalDsl.g:5258:1: ( 'round' )
            {
            // InternalDsl.g:5258:1: ( 'round' )
            // InternalDsl.g:5259:2: 'round'
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getRoundKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRoundCellsTransformationAccess().getRoundKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__0__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group__1"
    // InternalDsl.g:5268:1: rule__RoundCellsTransformation__Group__1 : rule__RoundCellsTransformation__Group__1__Impl rule__RoundCellsTransformation__Group__2 ;
    public final void rule__RoundCellsTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5272:1: ( rule__RoundCellsTransformation__Group__1__Impl rule__RoundCellsTransformation__Group__2 )
            // InternalDsl.g:5273:2: rule__RoundCellsTransformation__Group__1__Impl rule__RoundCellsTransformation__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RoundCellsTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__1"


    // $ANTLR start "rule__RoundCellsTransformation__Group__1__Impl"
    // InternalDsl.g:5280:1: rule__RoundCellsTransformation__Group__1__Impl : ( '[' ) ;
    public final void rule__RoundCellsTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5284:1: ( ( '[' ) )
            // InternalDsl.g:5285:1: ( '[' )
            {
            // InternalDsl.g:5285:1: ( '[' )
            // InternalDsl.g:5286:2: '['
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoundCellsTransformationAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__1__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group__2"
    // InternalDsl.g:5295:1: rule__RoundCellsTransformation__Group__2 : rule__RoundCellsTransformation__Group__2__Impl rule__RoundCellsTransformation__Group__3 ;
    public final void rule__RoundCellsTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5299:1: ( rule__RoundCellsTransformation__Group__2__Impl rule__RoundCellsTransformation__Group__3 )
            // InternalDsl.g:5300:2: rule__RoundCellsTransformation__Group__2__Impl rule__RoundCellsTransformation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__RoundCellsTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__2"


    // $ANTLR start "rule__RoundCellsTransformation__Group__2__Impl"
    // InternalDsl.g:5307:1: rule__RoundCellsTransformation__Group__2__Impl : ( ( rule__RoundCellsTransformation__ColumnsAssignment_2 ) ) ;
    public final void rule__RoundCellsTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5311:1: ( ( ( rule__RoundCellsTransformation__ColumnsAssignment_2 ) ) )
            // InternalDsl.g:5312:1: ( ( rule__RoundCellsTransformation__ColumnsAssignment_2 ) )
            {
            // InternalDsl.g:5312:1: ( ( rule__RoundCellsTransformation__ColumnsAssignment_2 ) )
            // InternalDsl.g:5313:2: ( rule__RoundCellsTransformation__ColumnsAssignment_2 )
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getColumnsAssignment_2()); 
            // InternalDsl.g:5314:2: ( rule__RoundCellsTransformation__ColumnsAssignment_2 )
            // InternalDsl.g:5314:3: rule__RoundCellsTransformation__ColumnsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__ColumnsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoundCellsTransformationAccess().getColumnsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__2__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group__3"
    // InternalDsl.g:5322:1: rule__RoundCellsTransformation__Group__3 : rule__RoundCellsTransformation__Group__3__Impl rule__RoundCellsTransformation__Group__4 ;
    public final void rule__RoundCellsTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5326:1: ( rule__RoundCellsTransformation__Group__3__Impl rule__RoundCellsTransformation__Group__4 )
            // InternalDsl.g:5327:2: rule__RoundCellsTransformation__Group__3__Impl rule__RoundCellsTransformation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RoundCellsTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__3"


    // $ANTLR start "rule__RoundCellsTransformation__Group__3__Impl"
    // InternalDsl.g:5334:1: rule__RoundCellsTransformation__Group__3__Impl : ( ( rule__RoundCellsTransformation__Group_3__0 )* ) ;
    public final void rule__RoundCellsTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5338:1: ( ( ( rule__RoundCellsTransformation__Group_3__0 )* ) )
            // InternalDsl.g:5339:1: ( ( rule__RoundCellsTransformation__Group_3__0 )* )
            {
            // InternalDsl.g:5339:1: ( ( rule__RoundCellsTransformation__Group_3__0 )* )
            // InternalDsl.g:5340:2: ( rule__RoundCellsTransformation__Group_3__0 )*
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getGroup_3()); 
            // InternalDsl.g:5341:2: ( rule__RoundCellsTransformation__Group_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==21) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==RULE_STRING) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalDsl.g:5341:3: rule__RoundCellsTransformation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RoundCellsTransformation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getRoundCellsTransformationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__3__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group__4"
    // InternalDsl.g:5349:1: rule__RoundCellsTransformation__Group__4 : rule__RoundCellsTransformation__Group__4__Impl rule__RoundCellsTransformation__Group__5 ;
    public final void rule__RoundCellsTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5353:1: ( rule__RoundCellsTransformation__Group__4__Impl rule__RoundCellsTransformation__Group__5 )
            // InternalDsl.g:5354:2: rule__RoundCellsTransformation__Group__4__Impl rule__RoundCellsTransformation__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__RoundCellsTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__4"


    // $ANTLR start "rule__RoundCellsTransformation__Group__4__Impl"
    // InternalDsl.g:5361:1: rule__RoundCellsTransformation__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__RoundCellsTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5365:1: ( ( ( ',' )? ) )
            // InternalDsl.g:5366:1: ( ( ',' )? )
            {
            // InternalDsl.g:5366:1: ( ( ',' )? )
            // InternalDsl.g:5367:2: ( ',' )?
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getCommaKeyword_4()); 
            // InternalDsl.g:5368:2: ( ',' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:5368:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRoundCellsTransformationAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__4__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group__5"
    // InternalDsl.g:5376:1: rule__RoundCellsTransformation__Group__5 : rule__RoundCellsTransformation__Group__5__Impl rule__RoundCellsTransformation__Group__6 ;
    public final void rule__RoundCellsTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5380:1: ( rule__RoundCellsTransformation__Group__5__Impl rule__RoundCellsTransformation__Group__6 )
            // InternalDsl.g:5381:2: rule__RoundCellsTransformation__Group__5__Impl rule__RoundCellsTransformation__Group__6
            {
            pushFollow(FOLLOW_52);
            rule__RoundCellsTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__5"


    // $ANTLR start "rule__RoundCellsTransformation__Group__5__Impl"
    // InternalDsl.g:5388:1: rule__RoundCellsTransformation__Group__5__Impl : ( ']' ) ;
    public final void rule__RoundCellsTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5392:1: ( ( ']' ) )
            // InternalDsl.g:5393:1: ( ']' )
            {
            // InternalDsl.g:5393:1: ( ']' )
            // InternalDsl.g:5394:2: ']'
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getRightSquareBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRoundCellsTransformationAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__5__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group__6"
    // InternalDsl.g:5403:1: rule__RoundCellsTransformation__Group__6 : rule__RoundCellsTransformation__Group__6__Impl rule__RoundCellsTransformation__Group__7 ;
    public final void rule__RoundCellsTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5407:1: ( rule__RoundCellsTransformation__Group__6__Impl rule__RoundCellsTransformation__Group__7 )
            // InternalDsl.g:5408:2: rule__RoundCellsTransformation__Group__6__Impl rule__RoundCellsTransformation__Group__7
            {
            pushFollow(FOLLOW_53);
            rule__RoundCellsTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__6"


    // $ANTLR start "rule__RoundCellsTransformation__Group__6__Impl"
    // InternalDsl.g:5415:1: rule__RoundCellsTransformation__Group__6__Impl : ( 'digits' ) ;
    public final void rule__RoundCellsTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5419:1: ( ( 'digits' ) )
            // InternalDsl.g:5420:1: ( 'digits' )
            {
            // InternalDsl.g:5420:1: ( 'digits' )
            // InternalDsl.g:5421:2: 'digits'
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getDigitsKeyword_6()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRoundCellsTransformationAccess().getDigitsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__6__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group__7"
    // InternalDsl.g:5430:1: rule__RoundCellsTransformation__Group__7 : rule__RoundCellsTransformation__Group__7__Impl ;
    public final void rule__RoundCellsTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5434:1: ( rule__RoundCellsTransformation__Group__7__Impl )
            // InternalDsl.g:5435:2: rule__RoundCellsTransformation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__7"


    // $ANTLR start "rule__RoundCellsTransformation__Group__7__Impl"
    // InternalDsl.g:5441:1: rule__RoundCellsTransformation__Group__7__Impl : ( ( rule__RoundCellsTransformation__DigitsAssignment_7 ) ) ;
    public final void rule__RoundCellsTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5445:1: ( ( ( rule__RoundCellsTransformation__DigitsAssignment_7 ) ) )
            // InternalDsl.g:5446:1: ( ( rule__RoundCellsTransformation__DigitsAssignment_7 ) )
            {
            // InternalDsl.g:5446:1: ( ( rule__RoundCellsTransformation__DigitsAssignment_7 ) )
            // InternalDsl.g:5447:2: ( rule__RoundCellsTransformation__DigitsAssignment_7 )
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getDigitsAssignment_7()); 
            // InternalDsl.g:5448:2: ( rule__RoundCellsTransformation__DigitsAssignment_7 )
            // InternalDsl.g:5448:3: rule__RoundCellsTransformation__DigitsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__DigitsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRoundCellsTransformationAccess().getDigitsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group__7__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group_3__0"
    // InternalDsl.g:5457:1: rule__RoundCellsTransformation__Group_3__0 : rule__RoundCellsTransformation__Group_3__0__Impl rule__RoundCellsTransformation__Group_3__1 ;
    public final void rule__RoundCellsTransformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5461:1: ( rule__RoundCellsTransformation__Group_3__0__Impl rule__RoundCellsTransformation__Group_3__1 )
            // InternalDsl.g:5462:2: rule__RoundCellsTransformation__Group_3__0__Impl rule__RoundCellsTransformation__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__RoundCellsTransformation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group_3__0"


    // $ANTLR start "rule__RoundCellsTransformation__Group_3__0__Impl"
    // InternalDsl.g:5469:1: rule__RoundCellsTransformation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RoundCellsTransformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5473:1: ( ( ',' ) )
            // InternalDsl.g:5474:1: ( ',' )
            {
            // InternalDsl.g:5474:1: ( ',' )
            // InternalDsl.g:5475:2: ','
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoundCellsTransformationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group_3__0__Impl"


    // $ANTLR start "rule__RoundCellsTransformation__Group_3__1"
    // InternalDsl.g:5484:1: rule__RoundCellsTransformation__Group_3__1 : rule__RoundCellsTransformation__Group_3__1__Impl ;
    public final void rule__RoundCellsTransformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5488:1: ( rule__RoundCellsTransformation__Group_3__1__Impl )
            // InternalDsl.g:5489:2: rule__RoundCellsTransformation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group_3__1"


    // $ANTLR start "rule__RoundCellsTransformation__Group_3__1__Impl"
    // InternalDsl.g:5495:1: rule__RoundCellsTransformation__Group_3__1__Impl : ( ( rule__RoundCellsTransformation__ColumnsAssignment_3_1 ) ) ;
    public final void rule__RoundCellsTransformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5499:1: ( ( ( rule__RoundCellsTransformation__ColumnsAssignment_3_1 ) ) )
            // InternalDsl.g:5500:1: ( ( rule__RoundCellsTransformation__ColumnsAssignment_3_1 ) )
            {
            // InternalDsl.g:5500:1: ( ( rule__RoundCellsTransformation__ColumnsAssignment_3_1 ) )
            // InternalDsl.g:5501:2: ( rule__RoundCellsTransformation__ColumnsAssignment_3_1 )
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getColumnsAssignment_3_1()); 
            // InternalDsl.g:5502:2: ( rule__RoundCellsTransformation__ColumnsAssignment_3_1 )
            // InternalDsl.g:5502:3: rule__RoundCellsTransformation__ColumnsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundCellsTransformation__ColumnsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundCellsTransformationAccess().getColumnsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__Group_3__1__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group__0"
    // InternalDsl.g:5511:1: rule__SetCellsTransformation__Group__0 : rule__SetCellsTransformation__Group__0__Impl rule__SetCellsTransformation__Group__1 ;
    public final void rule__SetCellsTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5515:1: ( rule__SetCellsTransformation__Group__0__Impl rule__SetCellsTransformation__Group__1 )
            // InternalDsl.g:5516:2: rule__SetCellsTransformation__Group__0__Impl rule__SetCellsTransformation__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__SetCellsTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__0"


    // $ANTLR start "rule__SetCellsTransformation__Group__0__Impl"
    // InternalDsl.g:5523:1: rule__SetCellsTransformation__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetCellsTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5527:1: ( ( 'set' ) )
            // InternalDsl.g:5528:1: ( 'set' )
            {
            // InternalDsl.g:5528:1: ( 'set' )
            // InternalDsl.g:5529:2: 'set'
            {
             before(grammarAccess.getSetCellsTransformationAccess().getSetKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__0__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group__1"
    // InternalDsl.g:5538:1: rule__SetCellsTransformation__Group__1 : rule__SetCellsTransformation__Group__1__Impl rule__SetCellsTransformation__Group__2 ;
    public final void rule__SetCellsTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5542:1: ( rule__SetCellsTransformation__Group__1__Impl rule__SetCellsTransformation__Group__2 )
            // InternalDsl.g:5543:2: rule__SetCellsTransformation__Group__1__Impl rule__SetCellsTransformation__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SetCellsTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__1"


    // $ANTLR start "rule__SetCellsTransformation__Group__1__Impl"
    // InternalDsl.g:5550:1: rule__SetCellsTransformation__Group__1__Impl : ( 'value' ) ;
    public final void rule__SetCellsTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5554:1: ( ( 'value' ) )
            // InternalDsl.g:5555:1: ( 'value' )
            {
            // InternalDsl.g:5555:1: ( 'value' )
            // InternalDsl.g:5556:2: 'value'
            {
             before(grammarAccess.getSetCellsTransformationAccess().getValueKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__1__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group__2"
    // InternalDsl.g:5565:1: rule__SetCellsTransformation__Group__2 : rule__SetCellsTransformation__Group__2__Impl rule__SetCellsTransformation__Group__3 ;
    public final void rule__SetCellsTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5569:1: ( rule__SetCellsTransformation__Group__2__Impl rule__SetCellsTransformation__Group__3 )
            // InternalDsl.g:5570:2: rule__SetCellsTransformation__Group__2__Impl rule__SetCellsTransformation__Group__3
            {
            pushFollow(FOLLOW_55);
            rule__SetCellsTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__2"


    // $ANTLR start "rule__SetCellsTransformation__Group__2__Impl"
    // InternalDsl.g:5577:1: rule__SetCellsTransformation__Group__2__Impl : ( ( rule__SetCellsTransformation__ValueAssignment_2 ) ) ;
    public final void rule__SetCellsTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5581:1: ( ( ( rule__SetCellsTransformation__ValueAssignment_2 ) ) )
            // InternalDsl.g:5582:1: ( ( rule__SetCellsTransformation__ValueAssignment_2 ) )
            {
            // InternalDsl.g:5582:1: ( ( rule__SetCellsTransformation__ValueAssignment_2 ) )
            // InternalDsl.g:5583:2: ( rule__SetCellsTransformation__ValueAssignment_2 )
            {
             before(grammarAccess.getSetCellsTransformationAccess().getValueAssignment_2()); 
            // InternalDsl.g:5584:2: ( rule__SetCellsTransformation__ValueAssignment_2 )
            // InternalDsl.g:5584:3: rule__SetCellsTransformation__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetCellsTransformationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__2__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group__3"
    // InternalDsl.g:5592:1: rule__SetCellsTransformation__Group__3 : rule__SetCellsTransformation__Group__3__Impl rule__SetCellsTransformation__Group__4 ;
    public final void rule__SetCellsTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5596:1: ( rule__SetCellsTransformation__Group__3__Impl rule__SetCellsTransformation__Group__4 )
            // InternalDsl.g:5597:2: rule__SetCellsTransformation__Group__3__Impl rule__SetCellsTransformation__Group__4
            {
            pushFollow(FOLLOW_56);
            rule__SetCellsTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__3"


    // $ANTLR start "rule__SetCellsTransformation__Group__3__Impl"
    // InternalDsl.g:5604:1: rule__SetCellsTransformation__Group__3__Impl : ( 'at' ) ;
    public final void rule__SetCellsTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5608:1: ( ( 'at' ) )
            // InternalDsl.g:5609:1: ( 'at' )
            {
            // InternalDsl.g:5609:1: ( 'at' )
            // InternalDsl.g:5610:2: 'at'
            {
             before(grammarAccess.getSetCellsTransformationAccess().getAtKeyword_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getAtKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__3__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group__4"
    // InternalDsl.g:5619:1: rule__SetCellsTransformation__Group__4 : rule__SetCellsTransformation__Group__4__Impl rule__SetCellsTransformation__Group__5 ;
    public final void rule__SetCellsTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5623:1: ( rule__SetCellsTransformation__Group__4__Impl rule__SetCellsTransformation__Group__5 )
            // InternalDsl.g:5624:2: rule__SetCellsTransformation__Group__4__Impl rule__SetCellsTransformation__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__SetCellsTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__4"


    // $ANTLR start "rule__SetCellsTransformation__Group__4__Impl"
    // InternalDsl.g:5631:1: rule__SetCellsTransformation__Group__4__Impl : ( 'column' ) ;
    public final void rule__SetCellsTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5635:1: ( ( 'column' ) )
            // InternalDsl.g:5636:1: ( 'column' )
            {
            // InternalDsl.g:5636:1: ( 'column' )
            // InternalDsl.g:5637:2: 'column'
            {
             before(grammarAccess.getSetCellsTransformationAccess().getColumnKeyword_4()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getColumnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__4__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group__5"
    // InternalDsl.g:5646:1: rule__SetCellsTransformation__Group__5 : rule__SetCellsTransformation__Group__5__Impl rule__SetCellsTransformation__Group__6 ;
    public final void rule__SetCellsTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5650:1: ( rule__SetCellsTransformation__Group__5__Impl rule__SetCellsTransformation__Group__6 )
            // InternalDsl.g:5651:2: rule__SetCellsTransformation__Group__5__Impl rule__SetCellsTransformation__Group__6
            {
            pushFollow(FOLLOW_55);
            rule__SetCellsTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__5"


    // $ANTLR start "rule__SetCellsTransformation__Group__5__Impl"
    // InternalDsl.g:5658:1: rule__SetCellsTransformation__Group__5__Impl : ( ( rule__SetCellsTransformation__ColumnAssignment_5 ) ) ;
    public final void rule__SetCellsTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5662:1: ( ( ( rule__SetCellsTransformation__ColumnAssignment_5 ) ) )
            // InternalDsl.g:5663:1: ( ( rule__SetCellsTransformation__ColumnAssignment_5 ) )
            {
            // InternalDsl.g:5663:1: ( ( rule__SetCellsTransformation__ColumnAssignment_5 ) )
            // InternalDsl.g:5664:2: ( rule__SetCellsTransformation__ColumnAssignment_5 )
            {
             before(grammarAccess.getSetCellsTransformationAccess().getColumnAssignment_5()); 
            // InternalDsl.g:5665:2: ( rule__SetCellsTransformation__ColumnAssignment_5 )
            // InternalDsl.g:5665:3: rule__SetCellsTransformation__ColumnAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__ColumnAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSetCellsTransformationAccess().getColumnAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__5__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group__6"
    // InternalDsl.g:5673:1: rule__SetCellsTransformation__Group__6 : rule__SetCellsTransformation__Group__6__Impl ;
    public final void rule__SetCellsTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5677:1: ( rule__SetCellsTransformation__Group__6__Impl )
            // InternalDsl.g:5678:2: rule__SetCellsTransformation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__6"


    // $ANTLR start "rule__SetCellsTransformation__Group__6__Impl"
    // InternalDsl.g:5684:1: rule__SetCellsTransformation__Group__6__Impl : ( ( rule__SetCellsTransformation__Group_6__0 )? ) ;
    public final void rule__SetCellsTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5688:1: ( ( ( rule__SetCellsTransformation__Group_6__0 )? ) )
            // InternalDsl.g:5689:1: ( ( rule__SetCellsTransformation__Group_6__0 )? )
            {
            // InternalDsl.g:5689:1: ( ( rule__SetCellsTransformation__Group_6__0 )? )
            // InternalDsl.g:5690:2: ( rule__SetCellsTransformation__Group_6__0 )?
            {
             before(grammarAccess.getSetCellsTransformationAccess().getGroup_6()); 
            // InternalDsl.g:5691:2: ( rule__SetCellsTransformation__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:5691:3: rule__SetCellsTransformation__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetCellsTransformation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetCellsTransformationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group__6__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group_6__0"
    // InternalDsl.g:5700:1: rule__SetCellsTransformation__Group_6__0 : rule__SetCellsTransformation__Group_6__0__Impl rule__SetCellsTransformation__Group_6__1 ;
    public final void rule__SetCellsTransformation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5704:1: ( rule__SetCellsTransformation__Group_6__0__Impl rule__SetCellsTransformation__Group_6__1 )
            // InternalDsl.g:5705:2: rule__SetCellsTransformation__Group_6__0__Impl rule__SetCellsTransformation__Group_6__1
            {
            pushFollow(FOLLOW_57);
            rule__SetCellsTransformation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group_6__0"


    // $ANTLR start "rule__SetCellsTransformation__Group_6__0__Impl"
    // InternalDsl.g:5712:1: rule__SetCellsTransformation__Group_6__0__Impl : ( 'at' ) ;
    public final void rule__SetCellsTransformation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5716:1: ( ( 'at' ) )
            // InternalDsl.g:5717:1: ( 'at' )
            {
            // InternalDsl.g:5717:1: ( 'at' )
            // InternalDsl.g:5718:2: 'at'
            {
             before(grammarAccess.getSetCellsTransformationAccess().getAtKeyword_6_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getAtKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group_6__0__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group_6__1"
    // InternalDsl.g:5727:1: rule__SetCellsTransformation__Group_6__1 : rule__SetCellsTransformation__Group_6__1__Impl rule__SetCellsTransformation__Group_6__2 ;
    public final void rule__SetCellsTransformation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5731:1: ( rule__SetCellsTransformation__Group_6__1__Impl rule__SetCellsTransformation__Group_6__2 )
            // InternalDsl.g:5732:2: rule__SetCellsTransformation__Group_6__1__Impl rule__SetCellsTransformation__Group_6__2
            {
            pushFollow(FOLLOW_22);
            rule__SetCellsTransformation__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group_6__1"


    // $ANTLR start "rule__SetCellsTransformation__Group_6__1__Impl"
    // InternalDsl.g:5739:1: rule__SetCellsTransformation__Group_6__1__Impl : ( 'row' ) ;
    public final void rule__SetCellsTransformation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5743:1: ( ( 'row' ) )
            // InternalDsl.g:5744:1: ( 'row' )
            {
            // InternalDsl.g:5744:1: ( 'row' )
            // InternalDsl.g:5745:2: 'row'
            {
             before(grammarAccess.getSetCellsTransformationAccess().getRowKeyword_6_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getRowKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group_6__1__Impl"


    // $ANTLR start "rule__SetCellsTransformation__Group_6__2"
    // InternalDsl.g:5754:1: rule__SetCellsTransformation__Group_6__2 : rule__SetCellsTransformation__Group_6__2__Impl ;
    public final void rule__SetCellsTransformation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5758:1: ( rule__SetCellsTransformation__Group_6__2__Impl )
            // InternalDsl.g:5759:2: rule__SetCellsTransformation__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group_6__2"


    // $ANTLR start "rule__SetCellsTransformation__Group_6__2__Impl"
    // InternalDsl.g:5765:1: rule__SetCellsTransformation__Group_6__2__Impl : ( ( rule__SetCellsTransformation__RowAssignment_6_2 ) ) ;
    public final void rule__SetCellsTransformation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5769:1: ( ( ( rule__SetCellsTransformation__RowAssignment_6_2 ) ) )
            // InternalDsl.g:5770:1: ( ( rule__SetCellsTransformation__RowAssignment_6_2 ) )
            {
            // InternalDsl.g:5770:1: ( ( rule__SetCellsTransformation__RowAssignment_6_2 ) )
            // InternalDsl.g:5771:2: ( rule__SetCellsTransformation__RowAssignment_6_2 )
            {
             before(grammarAccess.getSetCellsTransformationAccess().getRowAssignment_6_2()); 
            // InternalDsl.g:5772:2: ( rule__SetCellsTransformation__RowAssignment_6_2 )
            // InternalDsl.g:5772:3: rule__SetCellsTransformation__RowAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__SetCellsTransformation__RowAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSetCellsTransformationAccess().getRowAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__Group_6__2__Impl"


    // $ANTLR start "rule__SelectRowsTransformation__Group__0"
    // InternalDsl.g:5781:1: rule__SelectRowsTransformation__Group__0 : rule__SelectRowsTransformation__Group__0__Impl rule__SelectRowsTransformation__Group__1 ;
    public final void rule__SelectRowsTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5785:1: ( rule__SelectRowsTransformation__Group__0__Impl rule__SelectRowsTransformation__Group__1 )
            // InternalDsl.g:5786:2: rule__SelectRowsTransformation__Group__0__Impl rule__SelectRowsTransformation__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__SelectRowsTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group__0"


    // $ANTLR start "rule__SelectRowsTransformation__Group__0__Impl"
    // InternalDsl.g:5793:1: rule__SelectRowsTransformation__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectRowsTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5797:1: ( ( 'select' ) )
            // InternalDsl.g:5798:1: ( 'select' )
            {
            // InternalDsl.g:5798:1: ( 'select' )
            // InternalDsl.g:5799:2: 'select'
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getSelectKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSelectRowsTransformationAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group__0__Impl"


    // $ANTLR start "rule__SelectRowsTransformation__Group__1"
    // InternalDsl.g:5808:1: rule__SelectRowsTransformation__Group__1 : rule__SelectRowsTransformation__Group__1__Impl rule__SelectRowsTransformation__Group__2 ;
    public final void rule__SelectRowsTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5812:1: ( rule__SelectRowsTransformation__Group__1__Impl rule__SelectRowsTransformation__Group__2 )
            // InternalDsl.g:5813:2: rule__SelectRowsTransformation__Group__1__Impl rule__SelectRowsTransformation__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__SelectRowsTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group__1"


    // $ANTLR start "rule__SelectRowsTransformation__Group__1__Impl"
    // InternalDsl.g:5820:1: rule__SelectRowsTransformation__Group__1__Impl : ( ( rule__SelectRowsTransformation__StartAssignment_1 ) ) ;
    public final void rule__SelectRowsTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5824:1: ( ( ( rule__SelectRowsTransformation__StartAssignment_1 ) ) )
            // InternalDsl.g:5825:1: ( ( rule__SelectRowsTransformation__StartAssignment_1 ) )
            {
            // InternalDsl.g:5825:1: ( ( rule__SelectRowsTransformation__StartAssignment_1 ) )
            // InternalDsl.g:5826:2: ( rule__SelectRowsTransformation__StartAssignment_1 )
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getStartAssignment_1()); 
            // InternalDsl.g:5827:2: ( rule__SelectRowsTransformation__StartAssignment_1 )
            // InternalDsl.g:5827:3: rule__SelectRowsTransformation__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectRowsTransformationAccess().getStartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group__1__Impl"


    // $ANTLR start "rule__SelectRowsTransformation__Group__2"
    // InternalDsl.g:5835:1: rule__SelectRowsTransformation__Group__2 : rule__SelectRowsTransformation__Group__2__Impl rule__SelectRowsTransformation__Group__3 ;
    public final void rule__SelectRowsTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5839:1: ( rule__SelectRowsTransformation__Group__2__Impl rule__SelectRowsTransformation__Group__3 )
            // InternalDsl.g:5840:2: rule__SelectRowsTransformation__Group__2__Impl rule__SelectRowsTransformation__Group__3
            {
            pushFollow(FOLLOW_58);
            rule__SelectRowsTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group__2"


    // $ANTLR start "rule__SelectRowsTransformation__Group__2__Impl"
    // InternalDsl.g:5847:1: rule__SelectRowsTransformation__Group__2__Impl : ( ( rule__SelectRowsTransformation__Group_2__0 )? ) ;
    public final void rule__SelectRowsTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5851:1: ( ( ( rule__SelectRowsTransformation__Group_2__0 )? ) )
            // InternalDsl.g:5852:1: ( ( rule__SelectRowsTransformation__Group_2__0 )? )
            {
            // InternalDsl.g:5852:1: ( ( rule__SelectRowsTransformation__Group_2__0 )? )
            // InternalDsl.g:5853:2: ( rule__SelectRowsTransformation__Group_2__0 )?
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getGroup_2()); 
            // InternalDsl.g:5854:2: ( rule__SelectRowsTransformation__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==65) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:5854:3: rule__SelectRowsTransformation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectRowsTransformation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectRowsTransformationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group__2__Impl"


    // $ANTLR start "rule__SelectRowsTransformation__Group__3"
    // InternalDsl.g:5862:1: rule__SelectRowsTransformation__Group__3 : rule__SelectRowsTransformation__Group__3__Impl ;
    public final void rule__SelectRowsTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5866:1: ( rule__SelectRowsTransformation__Group__3__Impl )
            // InternalDsl.g:5867:2: rule__SelectRowsTransformation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group__3"


    // $ANTLR start "rule__SelectRowsTransformation__Group__3__Impl"
    // InternalDsl.g:5873:1: rule__SelectRowsTransformation__Group__3__Impl : ( ( rule__SelectRowsTransformation__Group_3__0 )? ) ;
    public final void rule__SelectRowsTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5877:1: ( ( ( rule__SelectRowsTransformation__Group_3__0 )? ) )
            // InternalDsl.g:5878:1: ( ( rule__SelectRowsTransformation__Group_3__0 )? )
            {
            // InternalDsl.g:5878:1: ( ( rule__SelectRowsTransformation__Group_3__0 )? )
            // InternalDsl.g:5879:2: ( rule__SelectRowsTransformation__Group_3__0 )?
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getGroup_3()); 
            // InternalDsl.g:5880:2: ( rule__SelectRowsTransformation__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:5880:3: rule__SelectRowsTransformation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectRowsTransformation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectRowsTransformationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group__3__Impl"


    // $ANTLR start "rule__SelectRowsTransformation__Group_2__0"
    // InternalDsl.g:5889:1: rule__SelectRowsTransformation__Group_2__0 : rule__SelectRowsTransformation__Group_2__0__Impl rule__SelectRowsTransformation__Group_2__1 ;
    public final void rule__SelectRowsTransformation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5893:1: ( rule__SelectRowsTransformation__Group_2__0__Impl rule__SelectRowsTransformation__Group_2__1 )
            // InternalDsl.g:5894:2: rule__SelectRowsTransformation__Group_2__0__Impl rule__SelectRowsTransformation__Group_2__1
            {
            pushFollow(FOLLOW_53);
            rule__SelectRowsTransformation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group_2__0"


    // $ANTLR start "rule__SelectRowsTransformation__Group_2__0__Impl"
    // InternalDsl.g:5901:1: rule__SelectRowsTransformation__Group_2__0__Impl : ( 'skip' ) ;
    public final void rule__SelectRowsTransformation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5905:1: ( ( 'skip' ) )
            // InternalDsl.g:5906:1: ( 'skip' )
            {
            // InternalDsl.g:5906:1: ( 'skip' )
            // InternalDsl.g:5907:2: 'skip'
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getSkipKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getSelectRowsTransformationAccess().getSkipKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group_2__0__Impl"


    // $ANTLR start "rule__SelectRowsTransformation__Group_2__1"
    // InternalDsl.g:5916:1: rule__SelectRowsTransformation__Group_2__1 : rule__SelectRowsTransformation__Group_2__1__Impl ;
    public final void rule__SelectRowsTransformation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5920:1: ( rule__SelectRowsTransformation__Group_2__1__Impl )
            // InternalDsl.g:5921:2: rule__SelectRowsTransformation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group_2__1"


    // $ANTLR start "rule__SelectRowsTransformation__Group_2__1__Impl"
    // InternalDsl.g:5927:1: rule__SelectRowsTransformation__Group_2__1__Impl : ( ( rule__SelectRowsTransformation__LengthAssignment_2_1 ) ) ;
    public final void rule__SelectRowsTransformation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5931:1: ( ( ( rule__SelectRowsTransformation__LengthAssignment_2_1 ) ) )
            // InternalDsl.g:5932:1: ( ( rule__SelectRowsTransformation__LengthAssignment_2_1 ) )
            {
            // InternalDsl.g:5932:1: ( ( rule__SelectRowsTransformation__LengthAssignment_2_1 ) )
            // InternalDsl.g:5933:2: ( rule__SelectRowsTransformation__LengthAssignment_2_1 )
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getLengthAssignment_2_1()); 
            // InternalDsl.g:5934:2: ( rule__SelectRowsTransformation__LengthAssignment_2_1 )
            // InternalDsl.g:5934:3: rule__SelectRowsTransformation__LengthAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__LengthAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectRowsTransformationAccess().getLengthAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group_2__1__Impl"


    // $ANTLR start "rule__SelectRowsTransformation__Group_3__0"
    // InternalDsl.g:5943:1: rule__SelectRowsTransformation__Group_3__0 : rule__SelectRowsTransformation__Group_3__0__Impl rule__SelectRowsTransformation__Group_3__1 ;
    public final void rule__SelectRowsTransformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5947:1: ( rule__SelectRowsTransformation__Group_3__0__Impl rule__SelectRowsTransformation__Group_3__1 )
            // InternalDsl.g:5948:2: rule__SelectRowsTransformation__Group_3__0__Impl rule__SelectRowsTransformation__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__SelectRowsTransformation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group_3__0"


    // $ANTLR start "rule__SelectRowsTransformation__Group_3__0__Impl"
    // InternalDsl.g:5955:1: rule__SelectRowsTransformation__Group_3__0__Impl : ( 'groupby' ) ;
    public final void rule__SelectRowsTransformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5959:1: ( ( 'groupby' ) )
            // InternalDsl.g:5960:1: ( 'groupby' )
            {
            // InternalDsl.g:5960:1: ( 'groupby' )
            // InternalDsl.g:5961:2: 'groupby'
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getGroupbyKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getSelectRowsTransformationAccess().getGroupbyKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group_3__0__Impl"


    // $ANTLR start "rule__SelectRowsTransformation__Group_3__1"
    // InternalDsl.g:5970:1: rule__SelectRowsTransformation__Group_3__1 : rule__SelectRowsTransformation__Group_3__1__Impl ;
    public final void rule__SelectRowsTransformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5974:1: ( rule__SelectRowsTransformation__Group_3__1__Impl )
            // InternalDsl.g:5975:2: rule__SelectRowsTransformation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group_3__1"


    // $ANTLR start "rule__SelectRowsTransformation__Group_3__1__Impl"
    // InternalDsl.g:5981:1: rule__SelectRowsTransformation__Group_3__1__Impl : ( ( rule__SelectRowsTransformation__GroupByAssignment_3_1 ) ) ;
    public final void rule__SelectRowsTransformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5985:1: ( ( ( rule__SelectRowsTransformation__GroupByAssignment_3_1 ) ) )
            // InternalDsl.g:5986:1: ( ( rule__SelectRowsTransformation__GroupByAssignment_3_1 ) )
            {
            // InternalDsl.g:5986:1: ( ( rule__SelectRowsTransformation__GroupByAssignment_3_1 ) )
            // InternalDsl.g:5987:2: ( rule__SelectRowsTransformation__GroupByAssignment_3_1 )
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getGroupByAssignment_3_1()); 
            // InternalDsl.g:5988:2: ( rule__SelectRowsTransformation__GroupByAssignment_3_1 )
            // InternalDsl.g:5988:3: rule__SelectRowsTransformation__GroupByAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectRowsTransformation__GroupByAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectRowsTransformationAccess().getGroupByAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__Group_3__1__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group__0"
    // InternalDsl.g:5997:1: rule__SortRowsTransformation__Group__0 : rule__SortRowsTransformation__Group__0__Impl rule__SortRowsTransformation__Group__1 ;
    public final void rule__SortRowsTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6001:1: ( rule__SortRowsTransformation__Group__0__Impl rule__SortRowsTransformation__Group__1 )
            // InternalDsl.g:6002:2: rule__SortRowsTransformation__Group__0__Impl rule__SortRowsTransformation__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__SortRowsTransformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__0"


    // $ANTLR start "rule__SortRowsTransformation__Group__0__Impl"
    // InternalDsl.g:6009:1: rule__SortRowsTransformation__Group__0__Impl : ( 'sort' ) ;
    public final void rule__SortRowsTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6013:1: ( ( 'sort' ) )
            // InternalDsl.g:6014:1: ( 'sort' )
            {
            // InternalDsl.g:6014:1: ( 'sort' )
            // InternalDsl.g:6015:2: 'sort'
            {
             before(grammarAccess.getSortRowsTransformationAccess().getSortKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSortRowsTransformationAccess().getSortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__0__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group__1"
    // InternalDsl.g:6024:1: rule__SortRowsTransformation__Group__1 : rule__SortRowsTransformation__Group__1__Impl rule__SortRowsTransformation__Group__2 ;
    public final void rule__SortRowsTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6028:1: ( rule__SortRowsTransformation__Group__1__Impl rule__SortRowsTransformation__Group__2 )
            // InternalDsl.g:6029:2: rule__SortRowsTransformation__Group__1__Impl rule__SortRowsTransformation__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__SortRowsTransformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__1"


    // $ANTLR start "rule__SortRowsTransformation__Group__1__Impl"
    // InternalDsl.g:6036:1: rule__SortRowsTransformation__Group__1__Impl : ( 'by' ) ;
    public final void rule__SortRowsTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6040:1: ( ( 'by' ) )
            // InternalDsl.g:6041:1: ( 'by' )
            {
            // InternalDsl.g:6041:1: ( 'by' )
            // InternalDsl.g:6042:2: 'by'
            {
             before(grammarAccess.getSortRowsTransformationAccess().getByKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSortRowsTransformationAccess().getByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__1__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group__2"
    // InternalDsl.g:6051:1: rule__SortRowsTransformation__Group__2 : rule__SortRowsTransformation__Group__2__Impl rule__SortRowsTransformation__Group__3 ;
    public final void rule__SortRowsTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6055:1: ( rule__SortRowsTransformation__Group__2__Impl rule__SortRowsTransformation__Group__3 )
            // InternalDsl.g:6056:2: rule__SortRowsTransformation__Group__2__Impl rule__SortRowsTransformation__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SortRowsTransformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__2"


    // $ANTLR start "rule__SortRowsTransformation__Group__2__Impl"
    // InternalDsl.g:6063:1: rule__SortRowsTransformation__Group__2__Impl : ( '[' ) ;
    public final void rule__SortRowsTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6067:1: ( ( '[' ) )
            // InternalDsl.g:6068:1: ( '[' )
            {
            // InternalDsl.g:6068:1: ( '[' )
            // InternalDsl.g:6069:2: '['
            {
             before(grammarAccess.getSortRowsTransformationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSortRowsTransformationAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__2__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group__3"
    // InternalDsl.g:6078:1: rule__SortRowsTransformation__Group__3 : rule__SortRowsTransformation__Group__3__Impl rule__SortRowsTransformation__Group__4 ;
    public final void rule__SortRowsTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6082:1: ( rule__SortRowsTransformation__Group__3__Impl rule__SortRowsTransformation__Group__4 )
            // InternalDsl.g:6083:2: rule__SortRowsTransformation__Group__3__Impl rule__SortRowsTransformation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SortRowsTransformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__3"


    // $ANTLR start "rule__SortRowsTransformation__Group__3__Impl"
    // InternalDsl.g:6090:1: rule__SortRowsTransformation__Group__3__Impl : ( ( rule__SortRowsTransformation__ColumnsAssignment_3 ) ) ;
    public final void rule__SortRowsTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6094:1: ( ( ( rule__SortRowsTransformation__ColumnsAssignment_3 ) ) )
            // InternalDsl.g:6095:1: ( ( rule__SortRowsTransformation__ColumnsAssignment_3 ) )
            {
            // InternalDsl.g:6095:1: ( ( rule__SortRowsTransformation__ColumnsAssignment_3 ) )
            // InternalDsl.g:6096:2: ( rule__SortRowsTransformation__ColumnsAssignment_3 )
            {
             before(grammarAccess.getSortRowsTransformationAccess().getColumnsAssignment_3()); 
            // InternalDsl.g:6097:2: ( rule__SortRowsTransformation__ColumnsAssignment_3 )
            // InternalDsl.g:6097:3: rule__SortRowsTransformation__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSortRowsTransformationAccess().getColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__3__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group__4"
    // InternalDsl.g:6105:1: rule__SortRowsTransformation__Group__4 : rule__SortRowsTransformation__Group__4__Impl rule__SortRowsTransformation__Group__5 ;
    public final void rule__SortRowsTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6109:1: ( rule__SortRowsTransformation__Group__4__Impl rule__SortRowsTransformation__Group__5 )
            // InternalDsl.g:6110:2: rule__SortRowsTransformation__Group__4__Impl rule__SortRowsTransformation__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SortRowsTransformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__4"


    // $ANTLR start "rule__SortRowsTransformation__Group__4__Impl"
    // InternalDsl.g:6117:1: rule__SortRowsTransformation__Group__4__Impl : ( ( rule__SortRowsTransformation__Group_4__0 )* ) ;
    public final void rule__SortRowsTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6121:1: ( ( ( rule__SortRowsTransformation__Group_4__0 )* ) )
            // InternalDsl.g:6122:1: ( ( rule__SortRowsTransformation__Group_4__0 )* )
            {
            // InternalDsl.g:6122:1: ( ( rule__SortRowsTransformation__Group_4__0 )* )
            // InternalDsl.g:6123:2: ( rule__SortRowsTransformation__Group_4__0 )*
            {
             before(grammarAccess.getSortRowsTransformationAccess().getGroup_4()); 
            // InternalDsl.g:6124:2: ( rule__SortRowsTransformation__Group_4__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==21) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==RULE_STRING) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalDsl.g:6124:3: rule__SortRowsTransformation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SortRowsTransformation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getSortRowsTransformationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__4__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group__5"
    // InternalDsl.g:6132:1: rule__SortRowsTransformation__Group__5 : rule__SortRowsTransformation__Group__5__Impl rule__SortRowsTransformation__Group__6 ;
    public final void rule__SortRowsTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6136:1: ( rule__SortRowsTransformation__Group__5__Impl rule__SortRowsTransformation__Group__6 )
            // InternalDsl.g:6137:2: rule__SortRowsTransformation__Group__5__Impl rule__SortRowsTransformation__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__SortRowsTransformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__5"


    // $ANTLR start "rule__SortRowsTransformation__Group__5__Impl"
    // InternalDsl.g:6144:1: rule__SortRowsTransformation__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__SortRowsTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6148:1: ( ( ( ',' )? ) )
            // InternalDsl.g:6149:1: ( ( ',' )? )
            {
            // InternalDsl.g:6149:1: ( ( ',' )? )
            // InternalDsl.g:6150:2: ( ',' )?
            {
             before(grammarAccess.getSortRowsTransformationAccess().getCommaKeyword_5()); 
            // InternalDsl.g:6151:2: ( ',' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==21) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:6151:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSortRowsTransformationAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__5__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group__6"
    // InternalDsl.g:6159:1: rule__SortRowsTransformation__Group__6 : rule__SortRowsTransformation__Group__6__Impl rule__SortRowsTransformation__Group__7 ;
    public final void rule__SortRowsTransformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6163:1: ( rule__SortRowsTransformation__Group__6__Impl rule__SortRowsTransformation__Group__7 )
            // InternalDsl.g:6164:2: rule__SortRowsTransformation__Group__6__Impl rule__SortRowsTransformation__Group__7
            {
            pushFollow(FOLLOW_59);
            rule__SortRowsTransformation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__6"


    // $ANTLR start "rule__SortRowsTransformation__Group__6__Impl"
    // InternalDsl.g:6171:1: rule__SortRowsTransformation__Group__6__Impl : ( ']' ) ;
    public final void rule__SortRowsTransformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6175:1: ( ( ']' ) )
            // InternalDsl.g:6176:1: ( ']' )
            {
            // InternalDsl.g:6176:1: ( ']' )
            // InternalDsl.g:6177:2: ']'
            {
             before(grammarAccess.getSortRowsTransformationAccess().getRightSquareBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSortRowsTransformationAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__6__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group__7"
    // InternalDsl.g:6186:1: rule__SortRowsTransformation__Group__7 : rule__SortRowsTransformation__Group__7__Impl ;
    public final void rule__SortRowsTransformation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6190:1: ( rule__SortRowsTransformation__Group__7__Impl )
            // InternalDsl.g:6191:2: rule__SortRowsTransformation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__7"


    // $ANTLR start "rule__SortRowsTransformation__Group__7__Impl"
    // InternalDsl.g:6197:1: rule__SortRowsTransformation__Group__7__Impl : ( ( rule__SortRowsTransformation__OrderAssignment_7 )? ) ;
    public final void rule__SortRowsTransformation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6201:1: ( ( ( rule__SortRowsTransformation__OrderAssignment_7 )? ) )
            // InternalDsl.g:6202:1: ( ( rule__SortRowsTransformation__OrderAssignment_7 )? )
            {
            // InternalDsl.g:6202:1: ( ( rule__SortRowsTransformation__OrderAssignment_7 )? )
            // InternalDsl.g:6203:2: ( rule__SortRowsTransformation__OrderAssignment_7 )?
            {
             before(grammarAccess.getSortRowsTransformationAccess().getOrderAssignment_7()); 
            // InternalDsl.g:6204:2: ( rule__SortRowsTransformation__OrderAssignment_7 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=17 && LA47_0<=18)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:6204:3: rule__SortRowsTransformation__OrderAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__SortRowsTransformation__OrderAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSortRowsTransformationAccess().getOrderAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group__7__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group_4__0"
    // InternalDsl.g:6213:1: rule__SortRowsTransformation__Group_4__0 : rule__SortRowsTransformation__Group_4__0__Impl rule__SortRowsTransformation__Group_4__1 ;
    public final void rule__SortRowsTransformation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6217:1: ( rule__SortRowsTransformation__Group_4__0__Impl rule__SortRowsTransformation__Group_4__1 )
            // InternalDsl.g:6218:2: rule__SortRowsTransformation__Group_4__0__Impl rule__SortRowsTransformation__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__SortRowsTransformation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group_4__0"


    // $ANTLR start "rule__SortRowsTransformation__Group_4__0__Impl"
    // InternalDsl.g:6225:1: rule__SortRowsTransformation__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SortRowsTransformation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6229:1: ( ( ',' ) )
            // InternalDsl.g:6230:1: ( ',' )
            {
            // InternalDsl.g:6230:1: ( ',' )
            // InternalDsl.g:6231:2: ','
            {
             before(grammarAccess.getSortRowsTransformationAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSortRowsTransformationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group_4__0__Impl"


    // $ANTLR start "rule__SortRowsTransformation__Group_4__1"
    // InternalDsl.g:6240:1: rule__SortRowsTransformation__Group_4__1 : rule__SortRowsTransformation__Group_4__1__Impl ;
    public final void rule__SortRowsTransformation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6244:1: ( rule__SortRowsTransformation__Group_4__1__Impl )
            // InternalDsl.g:6245:2: rule__SortRowsTransformation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group_4__1"


    // $ANTLR start "rule__SortRowsTransformation__Group_4__1__Impl"
    // InternalDsl.g:6251:1: rule__SortRowsTransformation__Group_4__1__Impl : ( ( rule__SortRowsTransformation__ColumnsAssignment_4_1 ) ) ;
    public final void rule__SortRowsTransformation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6255:1: ( ( ( rule__SortRowsTransformation__ColumnsAssignment_4_1 ) ) )
            // InternalDsl.g:6256:1: ( ( rule__SortRowsTransformation__ColumnsAssignment_4_1 ) )
            {
            // InternalDsl.g:6256:1: ( ( rule__SortRowsTransformation__ColumnsAssignment_4_1 ) )
            // InternalDsl.g:6257:2: ( rule__SortRowsTransformation__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getSortRowsTransformationAccess().getColumnsAssignment_4_1()); 
            // InternalDsl.g:6258:2: ( rule__SortRowsTransformation__ColumnsAssignment_4_1 )
            // InternalDsl.g:6258:3: rule__SortRowsTransformation__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSortRowsTransformationAccess().getColumnsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__Group_4__1__Impl"


    // $ANTLR start "rule__Pipeline__Group__0"
    // InternalDsl.g:6267:1: rule__Pipeline__Group__0 : rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1 ;
    public final void rule__Pipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6271:1: ( rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1 )
            // InternalDsl.g:6272:2: rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Pipeline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__0"


    // $ANTLR start "rule__Pipeline__Group__0__Impl"
    // InternalDsl.g:6279:1: rule__Pipeline__Group__0__Impl : ( 'pipe' ) ;
    public final void rule__Pipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6283:1: ( ( 'pipe' ) )
            // InternalDsl.g:6284:1: ( 'pipe' )
            {
            // InternalDsl.g:6284:1: ( 'pipe' )
            // InternalDsl.g:6285:2: 'pipe'
            {
             before(grammarAccess.getPipelineAccess().getPipeKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getPipeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__0__Impl"


    // $ANTLR start "rule__Pipeline__Group__1"
    // InternalDsl.g:6294:1: rule__Pipeline__Group__1 : rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2 ;
    public final void rule__Pipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6298:1: ( rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2 )
            // InternalDsl.g:6299:2: rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Pipeline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__1"


    // $ANTLR start "rule__Pipeline__Group__1__Impl"
    // InternalDsl.g:6306:1: rule__Pipeline__Group__1__Impl : ( '[' ) ;
    public final void rule__Pipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6310:1: ( ( '[' ) )
            // InternalDsl.g:6311:1: ( '[' )
            {
            // InternalDsl.g:6311:1: ( '[' )
            // InternalDsl.g:6312:2: '['
            {
             before(grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__1__Impl"


    // $ANTLR start "rule__Pipeline__Group__2"
    // InternalDsl.g:6321:1: rule__Pipeline__Group__2 : rule__Pipeline__Group__2__Impl rule__Pipeline__Group__3 ;
    public final void rule__Pipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6325:1: ( rule__Pipeline__Group__2__Impl rule__Pipeline__Group__3 )
            // InternalDsl.g:6326:2: rule__Pipeline__Group__2__Impl rule__Pipeline__Group__3
            {
            pushFollow(FOLLOW_60);
            rule__Pipeline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__2"


    // $ANTLR start "rule__Pipeline__Group__2__Impl"
    // InternalDsl.g:6333:1: rule__Pipeline__Group__2__Impl : ( ( rule__Pipeline__Group_2__0 ) ) ;
    public final void rule__Pipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6337:1: ( ( ( rule__Pipeline__Group_2__0 ) ) )
            // InternalDsl.g:6338:1: ( ( rule__Pipeline__Group_2__0 ) )
            {
            // InternalDsl.g:6338:1: ( ( rule__Pipeline__Group_2__0 ) )
            // InternalDsl.g:6339:2: ( rule__Pipeline__Group_2__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup_2()); 
            // InternalDsl.g:6340:2: ( rule__Pipeline__Group_2__0 )
            // InternalDsl.g:6340:3: rule__Pipeline__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__2__Impl"


    // $ANTLR start "rule__Pipeline__Group__3"
    // InternalDsl.g:6348:1: rule__Pipeline__Group__3 : rule__Pipeline__Group__3__Impl rule__Pipeline__Group__4 ;
    public final void rule__Pipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6352:1: ( rule__Pipeline__Group__3__Impl rule__Pipeline__Group__4 )
            // InternalDsl.g:6353:2: rule__Pipeline__Group__3__Impl rule__Pipeline__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Pipeline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__3"


    // $ANTLR start "rule__Pipeline__Group__3__Impl"
    // InternalDsl.g:6360:1: rule__Pipeline__Group__3__Impl : ( ']' ) ;
    public final void rule__Pipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6364:1: ( ( ']' ) )
            // InternalDsl.g:6365:1: ( ']' )
            {
            // InternalDsl.g:6365:1: ( ']' )
            // InternalDsl.g:6366:2: ']'
            {
             before(grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__3__Impl"


    // $ANTLR start "rule__Pipeline__Group__4"
    // InternalDsl.g:6375:1: rule__Pipeline__Group__4 : rule__Pipeline__Group__4__Impl ;
    public final void rule__Pipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6379:1: ( rule__Pipeline__Group__4__Impl )
            // InternalDsl.g:6380:2: rule__Pipeline__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__4"


    // $ANTLR start "rule__Pipeline__Group__4__Impl"
    // InternalDsl.g:6386:1: rule__Pipeline__Group__4__Impl : ( ';' ) ;
    public final void rule__Pipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6390:1: ( ( ';' ) )
            // InternalDsl.g:6391:1: ( ';' )
            {
            // InternalDsl.g:6391:1: ( ';' )
            // InternalDsl.g:6392:2: ';'
            {
             before(grammarAccess.getPipelineAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__4__Impl"


    // $ANTLR start "rule__Pipeline__Group_2__0"
    // InternalDsl.g:6402:1: rule__Pipeline__Group_2__0 : rule__Pipeline__Group_2__0__Impl rule__Pipeline__Group_2__1 ;
    public final void rule__Pipeline__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6406:1: ( rule__Pipeline__Group_2__0__Impl rule__Pipeline__Group_2__1 )
            // InternalDsl.g:6407:2: rule__Pipeline__Group_2__0__Impl rule__Pipeline__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Pipeline__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2__0"


    // $ANTLR start "rule__Pipeline__Group_2__0__Impl"
    // InternalDsl.g:6414:1: rule__Pipeline__Group_2__0__Impl : ( ( rule__Pipeline__TransformationAssignment_2_0 ) ) ;
    public final void rule__Pipeline__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6418:1: ( ( ( rule__Pipeline__TransformationAssignment_2_0 ) ) )
            // InternalDsl.g:6419:1: ( ( rule__Pipeline__TransformationAssignment_2_0 ) )
            {
            // InternalDsl.g:6419:1: ( ( rule__Pipeline__TransformationAssignment_2_0 ) )
            // InternalDsl.g:6420:2: ( rule__Pipeline__TransformationAssignment_2_0 )
            {
             before(grammarAccess.getPipelineAccess().getTransformationAssignment_2_0()); 
            // InternalDsl.g:6421:2: ( rule__Pipeline__TransformationAssignment_2_0 )
            // InternalDsl.g:6421:3: rule__Pipeline__TransformationAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__TransformationAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getTransformationAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_2__1"
    // InternalDsl.g:6429:1: rule__Pipeline__Group_2__1 : rule__Pipeline__Group_2__1__Impl rule__Pipeline__Group_2__2 ;
    public final void rule__Pipeline__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6433:1: ( rule__Pipeline__Group_2__1__Impl rule__Pipeline__Group_2__2 )
            // InternalDsl.g:6434:2: rule__Pipeline__Group_2__1__Impl rule__Pipeline__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Pipeline__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2__1"


    // $ANTLR start "rule__Pipeline__Group_2__1__Impl"
    // InternalDsl.g:6441:1: rule__Pipeline__Group_2__1__Impl : ( ( rule__Pipeline__Group_2_1__0 )* ) ;
    public final void rule__Pipeline__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6445:1: ( ( ( rule__Pipeline__Group_2_1__0 )* ) )
            // InternalDsl.g:6446:1: ( ( rule__Pipeline__Group_2_1__0 )* )
            {
            // InternalDsl.g:6446:1: ( ( rule__Pipeline__Group_2_1__0 )* )
            // InternalDsl.g:6447:2: ( rule__Pipeline__Group_2_1__0 )*
            {
             before(grammarAccess.getPipelineAccess().getGroup_2_1()); 
            // InternalDsl.g:6448:2: ( rule__Pipeline__Group_2_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==21) ) {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==12||LA48_1==40||LA48_1==44||LA48_1==46||LA48_1==48||LA48_1==53||(LA48_1>=55 && LA48_1<=56)||LA48_1==58||LA48_1==60||LA48_1==67) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalDsl.g:6448:3: rule__Pipeline__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Pipeline__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getPipelineAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_2__2"
    // InternalDsl.g:6456:1: rule__Pipeline__Group_2__2 : rule__Pipeline__Group_2__2__Impl ;
    public final void rule__Pipeline__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6460:1: ( rule__Pipeline__Group_2__2__Impl )
            // InternalDsl.g:6461:2: rule__Pipeline__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2__2"


    // $ANTLR start "rule__Pipeline__Group_2__2__Impl"
    // InternalDsl.g:6467:1: rule__Pipeline__Group_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__Pipeline__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6471:1: ( ( ( ',' )? ) )
            // InternalDsl.g:6472:1: ( ( ',' )? )
            {
            // InternalDsl.g:6472:1: ( ( ',' )? )
            // InternalDsl.g:6473:2: ( ',' )?
            {
             before(grammarAccess.getPipelineAccess().getCommaKeyword_2_2()); 
            // InternalDsl.g:6474:2: ( ',' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==21) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:6474:3: ','
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPipelineAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_1__0"
    // InternalDsl.g:6483:1: rule__Pipeline__Group_2_1__0 : rule__Pipeline__Group_2_1__0__Impl rule__Pipeline__Group_2_1__1 ;
    public final void rule__Pipeline__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6487:1: ( rule__Pipeline__Group_2_1__0__Impl rule__Pipeline__Group_2_1__1 )
            // InternalDsl.g:6488:2: rule__Pipeline__Group_2_1__0__Impl rule__Pipeline__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Pipeline__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2_1__0"


    // $ANTLR start "rule__Pipeline__Group_2_1__0__Impl"
    // InternalDsl.g:6495:1: rule__Pipeline__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Pipeline__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6499:1: ( ( ',' ) )
            // InternalDsl.g:6500:1: ( ',' )
            {
            // InternalDsl.g:6500:1: ( ',' )
            // InternalDsl.g:6501:2: ','
            {
             before(grammarAccess.getPipelineAccess().getCommaKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_2_1__1"
    // InternalDsl.g:6510:1: rule__Pipeline__Group_2_1__1 : rule__Pipeline__Group_2_1__1__Impl ;
    public final void rule__Pipeline__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6514:1: ( rule__Pipeline__Group_2_1__1__Impl )
            // InternalDsl.g:6515:2: rule__Pipeline__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2_1__1"


    // $ANTLR start "rule__Pipeline__Group_2_1__1__Impl"
    // InternalDsl.g:6521:1: rule__Pipeline__Group_2_1__1__Impl : ( ( rule__Pipeline__TransformationAssignment_2_1_1 ) ) ;
    public final void rule__Pipeline__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6525:1: ( ( ( rule__Pipeline__TransformationAssignment_2_1_1 ) ) )
            // InternalDsl.g:6526:1: ( ( rule__Pipeline__TransformationAssignment_2_1_1 ) )
            {
            // InternalDsl.g:6526:1: ( ( rule__Pipeline__TransformationAssignment_2_1_1 ) )
            // InternalDsl.g:6527:2: ( rule__Pipeline__TransformationAssignment_2_1_1 )
            {
             before(grammarAccess.getPipelineAccess().getTransformationAssignment_2_1_1()); 
            // InternalDsl.g:6528:2: ( rule__Pipeline__TransformationAssignment_2_1_1 )
            // InternalDsl.g:6528:3: rule__Pipeline__TransformationAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__TransformationAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getTransformationAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_2_1__1__Impl"


    // $ANTLR start "rule__Export__Group__0"
    // InternalDsl.g:6537:1: rule__Export__Group__0 : rule__Export__Group__0__Impl rule__Export__Group__1 ;
    public final void rule__Export__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6541:1: ( rule__Export__Group__0__Impl rule__Export__Group__1 )
            // InternalDsl.g:6542:2: rule__Export__Group__0__Impl rule__Export__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__Export__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__0"


    // $ANTLR start "rule__Export__Group__0__Impl"
    // InternalDsl.g:6549:1: rule__Export__Group__0__Impl : ( 'export' ) ;
    public final void rule__Export__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6553:1: ( ( 'export' ) )
            // InternalDsl.g:6554:1: ( 'export' )
            {
            // InternalDsl.g:6554:1: ( 'export' )
            // InternalDsl.g:6555:2: 'export'
            {
             before(grammarAccess.getExportAccess().getExportKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getExportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__0__Impl"


    // $ANTLR start "rule__Export__Group__1"
    // InternalDsl.g:6564:1: rule__Export__Group__1 : rule__Export__Group__1__Impl rule__Export__Group__2 ;
    public final void rule__Export__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6568:1: ( rule__Export__Group__1__Impl rule__Export__Group__2 )
            // InternalDsl.g:6569:2: rule__Export__Group__1__Impl rule__Export__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__Export__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__1"


    // $ANTLR start "rule__Export__Group__1__Impl"
    // InternalDsl.g:6576:1: rule__Export__Group__1__Impl : ( ( rule__Export__TableAssignment_1 ) ) ;
    public final void rule__Export__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6580:1: ( ( ( rule__Export__TableAssignment_1 ) ) )
            // InternalDsl.g:6581:1: ( ( rule__Export__TableAssignment_1 ) )
            {
            // InternalDsl.g:6581:1: ( ( rule__Export__TableAssignment_1 ) )
            // InternalDsl.g:6582:2: ( rule__Export__TableAssignment_1 )
            {
             before(grammarAccess.getExportAccess().getTableAssignment_1()); 
            // InternalDsl.g:6583:2: ( rule__Export__TableAssignment_1 )
            // InternalDsl.g:6583:3: rule__Export__TableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Export__TableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getTableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__1__Impl"


    // $ANTLR start "rule__Export__Group__2"
    // InternalDsl.g:6591:1: rule__Export__Group__2 : rule__Export__Group__2__Impl rule__Export__Group__3 ;
    public final void rule__Export__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6595:1: ( rule__Export__Group__2__Impl rule__Export__Group__3 )
            // InternalDsl.g:6596:2: rule__Export__Group__2__Impl rule__Export__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Export__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__2"


    // $ANTLR start "rule__Export__Group__2__Impl"
    // InternalDsl.g:6603:1: rule__Export__Group__2__Impl : ( 'to' ) ;
    public final void rule__Export__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6607:1: ( ( 'to' ) )
            // InternalDsl.g:6608:1: ( 'to' )
            {
            // InternalDsl.g:6608:1: ( 'to' )
            // InternalDsl.g:6609:2: 'to'
            {
             before(grammarAccess.getExportAccess().getToKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__2__Impl"


    // $ANTLR start "rule__Export__Group__3"
    // InternalDsl.g:6618:1: rule__Export__Group__3 : rule__Export__Group__3__Impl rule__Export__Group__4 ;
    public final void rule__Export__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6622:1: ( rule__Export__Group__3__Impl rule__Export__Group__4 )
            // InternalDsl.g:6623:2: rule__Export__Group__3__Impl rule__Export__Group__4
            {
            pushFollow(FOLLOW_62);
            rule__Export__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__3"


    // $ANTLR start "rule__Export__Group__3__Impl"
    // InternalDsl.g:6630:1: rule__Export__Group__3__Impl : ( ( rule__Export__PathAssignment_3 ) ) ;
    public final void rule__Export__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6634:1: ( ( ( rule__Export__PathAssignment_3 ) ) )
            // InternalDsl.g:6635:1: ( ( rule__Export__PathAssignment_3 ) )
            {
            // InternalDsl.g:6635:1: ( ( rule__Export__PathAssignment_3 ) )
            // InternalDsl.g:6636:2: ( rule__Export__PathAssignment_3 )
            {
             before(grammarAccess.getExportAccess().getPathAssignment_3()); 
            // InternalDsl.g:6637:2: ( rule__Export__PathAssignment_3 )
            // InternalDsl.g:6637:3: rule__Export__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Export__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__3__Impl"


    // $ANTLR start "rule__Export__Group__4"
    // InternalDsl.g:6645:1: rule__Export__Group__4 : rule__Export__Group__4__Impl rule__Export__Group__5 ;
    public final void rule__Export__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6649:1: ( rule__Export__Group__4__Impl rule__Export__Group__5 )
            // InternalDsl.g:6650:2: rule__Export__Group__4__Impl rule__Export__Group__5
            {
            pushFollow(FOLLOW_63);
            rule__Export__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__4"


    // $ANTLR start "rule__Export__Group__4__Impl"
    // InternalDsl.g:6657:1: rule__Export__Group__4__Impl : ( 'as' ) ;
    public final void rule__Export__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6661:1: ( ( 'as' ) )
            // InternalDsl.g:6662:1: ( 'as' )
            {
            // InternalDsl.g:6662:1: ( 'as' )
            // InternalDsl.g:6663:2: 'as'
            {
             before(grammarAccess.getExportAccess().getAsKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getAsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__4__Impl"


    // $ANTLR start "rule__Export__Group__5"
    // InternalDsl.g:6672:1: rule__Export__Group__5 : rule__Export__Group__5__Impl rule__Export__Group__6 ;
    public final void rule__Export__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6676:1: ( rule__Export__Group__5__Impl rule__Export__Group__6 )
            // InternalDsl.g:6677:2: rule__Export__Group__5__Impl rule__Export__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Export__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Export__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__5"


    // $ANTLR start "rule__Export__Group__5__Impl"
    // InternalDsl.g:6684:1: rule__Export__Group__5__Impl : ( ( rule__Export__OutputAssignment_5 ) ) ;
    public final void rule__Export__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6688:1: ( ( ( rule__Export__OutputAssignment_5 ) ) )
            // InternalDsl.g:6689:1: ( ( rule__Export__OutputAssignment_5 ) )
            {
            // InternalDsl.g:6689:1: ( ( rule__Export__OutputAssignment_5 ) )
            // InternalDsl.g:6690:2: ( rule__Export__OutputAssignment_5 )
            {
             before(grammarAccess.getExportAccess().getOutputAssignment_5()); 
            // InternalDsl.g:6691:2: ( rule__Export__OutputAssignment_5 )
            // InternalDsl.g:6691:3: rule__Export__OutputAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Export__OutputAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExportAccess().getOutputAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__5__Impl"


    // $ANTLR start "rule__Export__Group__6"
    // InternalDsl.g:6699:1: rule__Export__Group__6 : rule__Export__Group__6__Impl ;
    public final void rule__Export__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6703:1: ( rule__Export__Group__6__Impl )
            // InternalDsl.g:6704:2: rule__Export__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Export__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__6"


    // $ANTLR start "rule__Export__Group__6__Impl"
    // InternalDsl.g:6710:1: rule__Export__Group__6__Impl : ( ';' ) ;
    public final void rule__Export__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6714:1: ( ( ';' ) )
            // InternalDsl.g:6715:1: ( ';' )
            {
            // InternalDsl.g:6715:1: ( ';' )
            // InternalDsl.g:6716:2: ';'
            {
             before(grammarAccess.getExportAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__Group__6__Impl"


    // $ANTLR start "rule__MyDsl__AssignmentAssignment_0"
    // InternalDsl.g:6726:1: rule__MyDsl__AssignmentAssignment_0 : ( ruleAssignment ) ;
    public final void rule__MyDsl__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6730:1: ( ( ruleAssignment ) )
            // InternalDsl.g:6731:2: ( ruleAssignment )
            {
            // InternalDsl.g:6731:2: ( ruleAssignment )
            // InternalDsl.g:6732:3: ruleAssignment
            {
             before(grammarAccess.getMyDslAccess().getAssignmentAssignmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getMyDslAccess().getAssignmentAssignmentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__AssignmentAssignment_0"


    // $ANTLR start "rule__MyDsl__ExportAssignment_1"
    // InternalDsl.g:6741:1: rule__MyDsl__ExportAssignment_1 : ( ruleExport ) ;
    public final void rule__MyDsl__ExportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6745:1: ( ( ruleExport ) )
            // InternalDsl.g:6746:2: ( ruleExport )
            {
            // InternalDsl.g:6746:2: ( ruleExport )
            // InternalDsl.g:6747:3: ruleExport
            {
             before(grammarAccess.getMyDslAccess().getExportExportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getMyDslAccess().getExportExportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__ExportAssignment_1"


    // $ANTLR start "rule__Assignment__NameAssignment_0"
    // InternalDsl.g:6756:1: rule__Assignment__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6760:1: ( ( RULE_ID ) )
            // InternalDsl.g:6761:2: ( RULE_ID )
            {
            // InternalDsl.g:6761:2: ( RULE_ID )
            // InternalDsl.g:6762:3: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__NameAssignment_0"


    // $ANTLR start "rule__Assignment__ExpressionAssignment_2"
    // InternalDsl.g:6771:1: rule__Assignment__ExpressionAssignment_2 : ( ( rule__Assignment__ExpressionAlternatives_2_0 ) ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6775:1: ( ( ( rule__Assignment__ExpressionAlternatives_2_0 ) ) )
            // InternalDsl.g:6776:2: ( ( rule__Assignment__ExpressionAlternatives_2_0 ) )
            {
            // InternalDsl.g:6776:2: ( ( rule__Assignment__ExpressionAlternatives_2_0 ) )
            // InternalDsl.g:6777:3: ( rule__Assignment__ExpressionAlternatives_2_0 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAlternatives_2_0()); 
            // InternalDsl.g:6778:3: ( rule__Assignment__ExpressionAlternatives_2_0 )
            // InternalDsl.g:6778:4: rule__Assignment__ExpressionAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ExpressionAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExpressionAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpressionAssignment_2"


    // $ANTLR start "rule__CombinationOperations__OperationAssignment_0"
    // InternalDsl.g:6786:1: rule__CombinationOperations__OperationAssignment_0 : ( ( rule__CombinationOperations__OperationAlternatives_0_0 ) ) ;
    public final void rule__CombinationOperations__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6790:1: ( ( ( rule__CombinationOperations__OperationAlternatives_0_0 ) ) )
            // InternalDsl.g:6791:2: ( ( rule__CombinationOperations__OperationAlternatives_0_0 ) )
            {
            // InternalDsl.g:6791:2: ( ( rule__CombinationOperations__OperationAlternatives_0_0 ) )
            // InternalDsl.g:6792:3: ( rule__CombinationOperations__OperationAlternatives_0_0 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getOperationAlternatives_0_0()); 
            // InternalDsl.g:6793:3: ( rule__CombinationOperations__OperationAlternatives_0_0 )
            // InternalDsl.g:6793:4: rule__CombinationOperations__OperationAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CombinationOperations__OperationAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCombinationOperationsAccess().getOperationAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__OperationAssignment_0"


    // $ANTLR start "rule__CombinationOperations__TypeAssignment_1"
    // InternalDsl.g:6801:1: rule__CombinationOperations__TypeAssignment_1 : ( ( rule__CombinationOperations__TypeAlternatives_1_0 ) ) ;
    public final void rule__CombinationOperations__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6805:1: ( ( ( rule__CombinationOperations__TypeAlternatives_1_0 ) ) )
            // InternalDsl.g:6806:2: ( ( rule__CombinationOperations__TypeAlternatives_1_0 ) )
            {
            // InternalDsl.g:6806:2: ( ( rule__CombinationOperations__TypeAlternatives_1_0 ) )
            // InternalDsl.g:6807:3: ( rule__CombinationOperations__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getTypeAlternatives_1_0()); 
            // InternalDsl.g:6808:3: ( rule__CombinationOperations__TypeAlternatives_1_0 )
            // InternalDsl.g:6808:4: rule__CombinationOperations__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CombinationOperations__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCombinationOperationsAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__TypeAssignment_1"


    // $ANTLR start "rule__CombinationOperations__TableOperationAssignment_3"
    // InternalDsl.g:6816:1: rule__CombinationOperations__TableOperationAssignment_3 : ( ruleTableOperations ) ;
    public final void rule__CombinationOperations__TableOperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6820:1: ( ( ruleTableOperations ) )
            // InternalDsl.g:6821:2: ( ruleTableOperations )
            {
            // InternalDsl.g:6821:2: ( ruleTableOperations )
            // InternalDsl.g:6822:3: ruleTableOperations
            {
             before(grammarAccess.getCombinationOperationsAccess().getTableOperationTableOperationsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTableOperations();

            state._fsp--;

             after(grammarAccess.getCombinationOperationsAccess().getTableOperationTableOperationsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__TableOperationAssignment_3"


    // $ANTLR start "rule__CombinationOperations__TableOperationAssignment_4_1"
    // InternalDsl.g:6831:1: rule__CombinationOperations__TableOperationAssignment_4_1 : ( ruleTableOperations ) ;
    public final void rule__CombinationOperations__TableOperationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6835:1: ( ( ruleTableOperations ) )
            // InternalDsl.g:6836:2: ( ruleTableOperations )
            {
            // InternalDsl.g:6836:2: ( ruleTableOperations )
            // InternalDsl.g:6837:3: ruleTableOperations
            {
             before(grammarAccess.getCombinationOperationsAccess().getTableOperationTableOperationsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableOperations();

            state._fsp--;

             after(grammarAccess.getCombinationOperationsAccess().getTableOperationTableOperationsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CombinationOperations__TableOperationAssignment_4_1"


    // $ANTLR start "rule__TableOperations__OperationAssignment_0"
    // InternalDsl.g:6846:1: rule__TableOperations__OperationAssignment_0 : ( ( rule__TableOperations__OperationAlternatives_0_0 ) ) ;
    public final void rule__TableOperations__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6850:1: ( ( ( rule__TableOperations__OperationAlternatives_0_0 ) ) )
            // InternalDsl.g:6851:2: ( ( rule__TableOperations__OperationAlternatives_0_0 ) )
            {
            // InternalDsl.g:6851:2: ( ( rule__TableOperations__OperationAlternatives_0_0 ) )
            // InternalDsl.g:6852:3: ( rule__TableOperations__OperationAlternatives_0_0 )
            {
             before(grammarAccess.getTableOperationsAccess().getOperationAlternatives_0_0()); 
            // InternalDsl.g:6853:3: ( rule__TableOperations__OperationAlternatives_0_0 )
            // InternalDsl.g:6853:4: rule__TableOperations__OperationAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TableOperations__OperationAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTableOperationsAccess().getOperationAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOperations__OperationAssignment_0"


    // $ANTLR start "rule__TableOperations__TransformationsAssignment_1"
    // InternalDsl.g:6861:1: rule__TableOperations__TransformationsAssignment_1 : ( ruleTransformOperation ) ;
    public final void rule__TableOperations__TransformationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6865:1: ( ( ruleTransformOperation ) )
            // InternalDsl.g:6866:2: ( ruleTransformOperation )
            {
            // InternalDsl.g:6866:2: ( ruleTransformOperation )
            // InternalDsl.g:6867:3: ruleTransformOperation
            {
             before(grammarAccess.getTableOperationsAccess().getTransformationsTransformOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformOperation();

            state._fsp--;

             after(grammarAccess.getTableOperationsAccess().getTransformationsTransformOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOperations__TransformationsAssignment_1"


    // $ANTLR start "rule__SelectSource__NameAssignment"
    // InternalDsl.g:6876:1: rule__SelectSource__NameAssignment : ( RULE_ID ) ;
    public final void rule__SelectSource__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6880:1: ( ( RULE_ID ) )
            // InternalDsl.g:6881:2: ( RULE_ID )
            {
            // InternalDsl.g:6881:2: ( RULE_ID )
            // InternalDsl.g:6882:3: RULE_ID
            {
             before(grammarAccess.getSelectSourceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectSourceAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSource__NameAssignment"


    // $ANTLR start "rule__InlineSource__SourceExprAssignment_1"
    // InternalDsl.g:6891:1: rule__InlineSource__SourceExprAssignment_1 : ( ruleSource ) ;
    public final void rule__InlineSource__SourceExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6895:1: ( ( ruleSource ) )
            // InternalDsl.g:6896:2: ( ruleSource )
            {
            // InternalDsl.g:6896:2: ( ruleSource )
            // InternalDsl.g:6897:3: ruleSource
            {
             before(grammarAccess.getInlineSourceAccess().getSourceExprSourceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getInlineSourceAccess().getSourceExprSourceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineSource__SourceExprAssignment_1"


    // $ANTLR start "rule__SourceOperation__SourceAssignment"
    // InternalDsl.g:6906:1: rule__SourceOperation__SourceAssignment : ( ( rule__SourceOperation__SourceAlternatives_0 ) ) ;
    public final void rule__SourceOperation__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6910:1: ( ( ( rule__SourceOperation__SourceAlternatives_0 ) ) )
            // InternalDsl.g:6911:2: ( ( rule__SourceOperation__SourceAlternatives_0 ) )
            {
            // InternalDsl.g:6911:2: ( ( rule__SourceOperation__SourceAlternatives_0 ) )
            // InternalDsl.g:6912:3: ( rule__SourceOperation__SourceAlternatives_0 )
            {
             before(grammarAccess.getSourceOperationAccess().getSourceAlternatives_0()); 
            // InternalDsl.g:6913:3: ( rule__SourceOperation__SourceAlternatives_0 )
            // InternalDsl.g:6913:4: rule__SourceOperation__SourceAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SourceOperation__SourceAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceOperationAccess().getSourceAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOperation__SourceAssignment"


    // $ANTLR start "rule__TransformationTableOperation__TransformationAssignment_1"
    // InternalDsl.g:6921:1: rule__TransformationTableOperation__TransformationAssignment_1 : ( ruleTransformation ) ;
    public final void rule__TransformationTableOperation__TransformationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6925:1: ( ( ruleTransformation ) )
            // InternalDsl.g:6926:2: ( ruleTransformation )
            {
            // InternalDsl.g:6926:2: ( ruleTransformation )
            // InternalDsl.g:6927:3: ruleTransformation
            {
             before(grammarAccess.getTransformationTableOperationAccess().getTransformationTransformationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationTableOperationAccess().getTransformationTransformationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformationTableOperation__TransformationAssignment_1"


    // $ANTLR start "rule__SelectPipeline__NameAssignment"
    // InternalDsl.g:6936:1: rule__SelectPipeline__NameAssignment : ( RULE_ID ) ;
    public final void rule__SelectPipeline__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6940:1: ( ( RULE_ID ) )
            // InternalDsl.g:6941:2: ( RULE_ID )
            {
            // InternalDsl.g:6941:2: ( RULE_ID )
            // InternalDsl.g:6942:3: RULE_ID
            {
             before(grammarAccess.getSelectPipelineAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectPipelineAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectPipeline__NameAssignment"


    // $ANTLR start "rule__InlinePipeline__PipelineExprAssignment_1"
    // InternalDsl.g:6951:1: rule__InlinePipeline__PipelineExprAssignment_1 : ( rulePipeline ) ;
    public final void rule__InlinePipeline__PipelineExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6955:1: ( ( rulePipeline ) )
            // InternalDsl.g:6956:2: ( rulePipeline )
            {
            // InternalDsl.g:6956:2: ( rulePipeline )
            // InternalDsl.g:6957:3: rulePipeline
            {
             before(grammarAccess.getInlinePipelineAccess().getPipelineExprPipelineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePipeline();

            state._fsp--;

             after(grammarAccess.getInlinePipelineAccess().getPipelineExprPipelineParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlinePipeline__PipelineExprAssignment_1"


    // $ANTLR start "rule__PipelineTableOperation__PipelineAssignment"
    // InternalDsl.g:6966:1: rule__PipelineTableOperation__PipelineAssignment : ( ( rule__PipelineTableOperation__PipelineAlternatives_0 ) ) ;
    public final void rule__PipelineTableOperation__PipelineAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6970:1: ( ( ( rule__PipelineTableOperation__PipelineAlternatives_0 ) ) )
            // InternalDsl.g:6971:2: ( ( rule__PipelineTableOperation__PipelineAlternatives_0 ) )
            {
            // InternalDsl.g:6971:2: ( ( rule__PipelineTableOperation__PipelineAlternatives_0 ) )
            // InternalDsl.g:6972:3: ( rule__PipelineTableOperation__PipelineAlternatives_0 )
            {
             before(grammarAccess.getPipelineTableOperationAccess().getPipelineAlternatives_0()); 
            // InternalDsl.g:6973:3: ( rule__PipelineTableOperation__PipelineAlternatives_0 )
            // InternalDsl.g:6973:4: rule__PipelineTableOperation__PipelineAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PipelineTableOperation__PipelineAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineTableOperationAccess().getPipelineAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PipelineTableOperation__PipelineAssignment"


    // $ANTLR start "rule__TransformOperation__OperationAssignment_1"
    // InternalDsl.g:6981:1: rule__TransformOperation__OperationAssignment_1 : ( ( rule__TransformOperation__OperationAlternatives_1_0 ) ) ;
    public final void rule__TransformOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6985:1: ( ( ( rule__TransformOperation__OperationAlternatives_1_0 ) ) )
            // InternalDsl.g:6986:2: ( ( rule__TransformOperation__OperationAlternatives_1_0 ) )
            {
            // InternalDsl.g:6986:2: ( ( rule__TransformOperation__OperationAlternatives_1_0 ) )
            // InternalDsl.g:6987:3: ( rule__TransformOperation__OperationAlternatives_1_0 )
            {
             before(grammarAccess.getTransformOperationAccess().getOperationAlternatives_1_0()); 
            // InternalDsl.g:6988:3: ( rule__TransformOperation__OperationAlternatives_1_0 )
            // InternalDsl.g:6988:4: rule__TransformOperation__OperationAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TransformOperation__OperationAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformOperationAccess().getOperationAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__OperationAssignment_1"


    // $ANTLR start "rule__Table__OperationAssignment_0"
    // InternalDsl.g:6996:1: rule__Table__OperationAssignment_0 : ( ruleTableOperations ) ;
    public final void rule__Table__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7000:1: ( ( ruleTableOperations ) )
            // InternalDsl.g:7001:2: ( ruleTableOperations )
            {
            // InternalDsl.g:7001:2: ( ruleTableOperations )
            // InternalDsl.g:7002:3: ruleTableOperations
            {
             before(grammarAccess.getTableAccess().getOperationTableOperationsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTableOperations();

            state._fsp--;

             after(grammarAccess.getTableAccess().getOperationTableOperationsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__OperationAssignment_0"


    // $ANTLR start "rule__XmlType__PathAssignment_2_3"
    // InternalDsl.g:7011:1: rule__XmlType__PathAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__XmlType__PathAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7015:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7016:2: ( RULE_STRING )
            {
            // InternalDsl.g:7016:2: ( RULE_STRING )
            // InternalDsl.g:7017:3: RULE_STRING
            {
             before(grammarAccess.getXmlTypeAccess().getPathSTRINGTerminalRuleCall_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getXmlTypeAccess().getPathSTRINGTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XmlType__PathAssignment_2_3"


    // $ANTLR start "rule__JsonType__PathAssignment_2_3"
    // InternalDsl.g:7026:1: rule__JsonType__PathAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__JsonType__PathAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7030:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7031:2: ( RULE_STRING )
            {
            // InternalDsl.g:7031:2: ( RULE_STRING )
            // InternalDsl.g:7032:3: RULE_STRING
            {
             before(grammarAccess.getJsonTypeAccess().getPathSTRINGTerminalRuleCall_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getPathSTRINGTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonType__PathAssignment_2_3"


    // $ANTLR start "rule__HtmlType__CssPathAssignment_2_3"
    // InternalDsl.g:7041:1: rule__HtmlType__CssPathAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__HtmlType__CssPathAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7045:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7046:2: ( RULE_STRING )
            {
            // InternalDsl.g:7046:2: ( RULE_STRING )
            // InternalDsl.g:7047:3: RULE_STRING
            {
             before(grammarAccess.getHtmlTypeAccess().getCssPathSTRINGTerminalRuleCall_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHtmlTypeAccess().getCssPathSTRINGTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlType__CssPathAssignment_2_3"


    // $ANTLR start "rule__OutputType__TypeAssignment"
    // InternalDsl.g:7056:1: rule__OutputType__TypeAssignment : ( ( rule__OutputType__TypeAlternatives_0 ) ) ;
    public final void rule__OutputType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7060:1: ( ( ( rule__OutputType__TypeAlternatives_0 ) ) )
            // InternalDsl.g:7061:2: ( ( rule__OutputType__TypeAlternatives_0 ) )
            {
            // InternalDsl.g:7061:2: ( ( rule__OutputType__TypeAlternatives_0 ) )
            // InternalDsl.g:7062:3: ( rule__OutputType__TypeAlternatives_0 )
            {
             before(grammarAccess.getOutputTypeAccess().getTypeAlternatives_0()); 
            // InternalDsl.g:7063:3: ( rule__OutputType__TypeAlternatives_0 )
            // InternalDsl.g:7063:4: rule__OutputType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OutputType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputTypeAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputType__TypeAssignment"


    // $ANTLR start "rule__MetaData__MetadataAssignment"
    // InternalDsl.g:7071:1: rule__MetaData__MetadataAssignment : ( ( rule__MetaData__MetadataAlternatives_0 ) ) ;
    public final void rule__MetaData__MetadataAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7075:1: ( ( ( rule__MetaData__MetadataAlternatives_0 ) ) )
            // InternalDsl.g:7076:2: ( ( rule__MetaData__MetadataAlternatives_0 ) )
            {
            // InternalDsl.g:7076:2: ( ( rule__MetaData__MetadataAlternatives_0 ) )
            // InternalDsl.g:7077:3: ( rule__MetaData__MetadataAlternatives_0 )
            {
             before(grammarAccess.getMetaDataAccess().getMetadataAlternatives_0()); 
            // InternalDsl.g:7078:3: ( rule__MetaData__MetadataAlternatives_0 )
            // InternalDsl.g:7078:4: rule__MetaData__MetadataAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__MetadataAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataAccess().getMetadataAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__MetadataAssignment"


    // $ANTLR start "rule__SourceStore__MetadataAssignment_1"
    // InternalDsl.g:7086:1: rule__SourceStore__MetadataAssignment_1 : ( ruleMetaData ) ;
    public final void rule__SourceStore__MetadataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7090:1: ( ( ruleMetaData ) )
            // InternalDsl.g:7091:2: ( ruleMetaData )
            {
            // InternalDsl.g:7091:2: ( ruleMetaData )
            // InternalDsl.g:7092:3: ruleMetaData
            {
             before(grammarAccess.getSourceStoreAccess().getMetadataMetaDataParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getSourceStoreAccess().getMetadataMetaDataParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__MetadataAssignment_1"


    // $ANTLR start "rule__SourceStore__ColumnAssignment_3"
    // InternalDsl.g:7101:1: rule__SourceStore__ColumnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SourceStore__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7105:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7106:2: ( RULE_STRING )
            {
            // InternalDsl.g:7106:2: ( RULE_STRING )
            // InternalDsl.g:7107:3: RULE_STRING
            {
             before(grammarAccess.getSourceStoreAccess().getColumnSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceStoreAccess().getColumnSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceStore__ColumnAssignment_3"


    // $ANTLR start "rule__SourceCoumnSelect__ColumnAssignment_2"
    // InternalDsl.g:7116:1: rule__SourceCoumnSelect__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SourceCoumnSelect__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7120:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7121:2: ( RULE_STRING )
            {
            // InternalDsl.g:7121:2: ( RULE_STRING )
            // InternalDsl.g:7122:3: RULE_STRING
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceCoumnSelectAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__ColumnAssignment_2"


    // $ANTLR start "rule__SourceCoumnSelect__ColumnAssignment_3_1"
    // InternalDsl.g:7131:1: rule__SourceCoumnSelect__ColumnAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SourceCoumnSelect__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7135:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7136:2: ( RULE_STRING )
            {
            // InternalDsl.g:7136:2: ( RULE_STRING )
            // InternalDsl.g:7137:3: RULE_STRING
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceCoumnSelectAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceCoumnSelect__ColumnAssignment_3_1"


    // $ANTLR start "rule__Source__QueryAssignment_1"
    // InternalDsl.g:7146:1: rule__Source__QueryAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Source__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7150:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7151:2: ( RULE_STRING )
            {
            // InternalDsl.g:7151:2: ( RULE_STRING )
            // InternalDsl.g:7152:3: RULE_STRING
            {
             before(grammarAccess.getSourceAccess().getQuerySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getQuerySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__QueryAssignment_1"


    // $ANTLR start "rule__Source__FilePathAssignment_3"
    // InternalDsl.g:7161:1: rule__Source__FilePathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Source__FilePathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7165:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7166:2: ( RULE_STRING )
            {
            // InternalDsl.g:7166:2: ( RULE_STRING )
            // InternalDsl.g:7167:3: RULE_STRING
            {
             before(grammarAccess.getSourceAccess().getFilePathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getFilePathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__FilePathAssignment_3"


    // $ANTLR start "rule__Source__InputTypeAssignment_4_1"
    // InternalDsl.g:7176:1: rule__Source__InputTypeAssignment_4_1 : ( ruleInputType ) ;
    public final void rule__Source__InputTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7180:1: ( ( ruleInputType ) )
            // InternalDsl.g:7181:2: ( ruleInputType )
            {
            // InternalDsl.g:7181:2: ( ruleInputType )
            // InternalDsl.g:7182:3: ruleInputType
            {
             before(grammarAccess.getSourceAccess().getInputTypeInputTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputType();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getInputTypeInputTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__InputTypeAssignment_4_1"


    // $ANTLR start "rule__Source__StoreAssignment_5"
    // InternalDsl.g:7191:1: rule__Source__StoreAssignment_5 : ( ruleSourceStore ) ;
    public final void rule__Source__StoreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7195:1: ( ( ruleSourceStore ) )
            // InternalDsl.g:7196:2: ( ruleSourceStore )
            {
            // InternalDsl.g:7196:2: ( ruleSourceStore )
            // InternalDsl.g:7197:3: ruleSourceStore
            {
             before(grammarAccess.getSourceAccess().getStoreSourceStoreParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceStore();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getStoreSourceStoreParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__StoreAssignment_5"


    // $ANTLR start "rule__Source__SelectAssignment_6"
    // InternalDsl.g:7206:1: rule__Source__SelectAssignment_6 : ( ruleSourceCoumnSelect ) ;
    public final void rule__Source__SelectAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7210:1: ( ( ruleSourceCoumnSelect ) )
            // InternalDsl.g:7211:2: ( ruleSourceCoumnSelect )
            {
            // InternalDsl.g:7211:2: ( ruleSourceCoumnSelect )
            // InternalDsl.g:7212:3: ruleSourceCoumnSelect
            {
             before(grammarAccess.getSourceAccess().getSelectSourceCoumnSelectParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceCoumnSelect();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getSelectSourceCoumnSelectParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__SelectAssignment_6"


    // $ANTLR start "rule__AppendPathTransformation__PathAssignment_2"
    // InternalDsl.g:7221:1: rule__AppendPathTransformation__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AppendPathTransformation__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7225:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7226:2: ( RULE_STRING )
            {
            // InternalDsl.g:7226:2: ( RULE_STRING )
            // InternalDsl.g:7227:3: RULE_STRING
            {
             before(grammarAccess.getAppendPathTransformationAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAppendPathTransformationAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppendPathTransformation__PathAssignment_2"


    // $ANTLR start "rule__PathTransformation__OperationAssignment_0"
    // InternalDsl.g:7236:1: rule__PathTransformation__OperationAssignment_0 : ( ( rule__PathTransformation__OperationAlternatives_0_0 ) ) ;
    public final void rule__PathTransformation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7240:1: ( ( ( rule__PathTransformation__OperationAlternatives_0_0 ) ) )
            // InternalDsl.g:7241:2: ( ( rule__PathTransformation__OperationAlternatives_0_0 ) )
            {
            // InternalDsl.g:7241:2: ( ( rule__PathTransformation__OperationAlternatives_0_0 ) )
            // InternalDsl.g:7242:3: ( rule__PathTransformation__OperationAlternatives_0_0 )
            {
             before(grammarAccess.getPathTransformationAccess().getOperationAlternatives_0_0()); 
            // InternalDsl.g:7243:3: ( rule__PathTransformation__OperationAlternatives_0_0 )
            // InternalDsl.g:7243:4: rule__PathTransformation__OperationAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PathTransformation__OperationAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPathTransformationAccess().getOperationAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__OperationAssignment_0"


    // $ANTLR start "rule__PathTransformation__ColumnAssignment_2"
    // InternalDsl.g:7251:1: rule__PathTransformation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PathTransformation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7255:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7256:2: ( RULE_STRING )
            {
            // InternalDsl.g:7256:2: ( RULE_STRING )
            // InternalDsl.g:7257:3: RULE_STRING
            {
             before(grammarAccess.getPathTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPathTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__ColumnAssignment_2"


    // $ANTLR start "rule__GroupBy__ColumnAssignment_2"
    // InternalDsl.g:7266:1: rule__GroupBy__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GroupBy__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7270:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7271:2: ( RULE_STRING )
            {
            // InternalDsl.g:7271:2: ( RULE_STRING )
            // InternalDsl.g:7272:3: RULE_STRING
            {
             before(grammarAccess.getGroupByAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupByAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupBy__ColumnAssignment_2"


    // $ANTLR start "rule__FoldTransformation__OperationAssignment_0"
    // InternalDsl.g:7281:1: rule__FoldTransformation__OperationAssignment_0 : ( ( rule__FoldTransformation__OperationAlternatives_0_0 ) ) ;
    public final void rule__FoldTransformation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7285:1: ( ( ( rule__FoldTransformation__OperationAlternatives_0_0 ) ) )
            // InternalDsl.g:7286:2: ( ( rule__FoldTransformation__OperationAlternatives_0_0 ) )
            {
            // InternalDsl.g:7286:2: ( ( rule__FoldTransformation__OperationAlternatives_0_0 ) )
            // InternalDsl.g:7287:3: ( rule__FoldTransformation__OperationAlternatives_0_0 )
            {
             before(grammarAccess.getFoldTransformationAccess().getOperationAlternatives_0_0()); 
            // InternalDsl.g:7288:3: ( rule__FoldTransformation__OperationAlternatives_0_0 )
            // InternalDsl.g:7288:4: rule__FoldTransformation__OperationAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FoldTransformation__OperationAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFoldTransformationAccess().getOperationAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldTransformation__OperationAssignment_0"


    // $ANTLR start "rule__FoldTransformation__GroupByAssignment_1"
    // InternalDsl.g:7296:1: rule__FoldTransformation__GroupByAssignment_1 : ( ruleGroupBy ) ;
    public final void rule__FoldTransformation__GroupByAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7300:1: ( ( ruleGroupBy ) )
            // InternalDsl.g:7301:2: ( ruleGroupBy )
            {
            // InternalDsl.g:7301:2: ( ruleGroupBy )
            // InternalDsl.g:7302:3: ruleGroupBy
            {
             before(grammarAccess.getFoldTransformationAccess().getGroupByGroupByParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupBy();

            state._fsp--;

             after(grammarAccess.getFoldTransformationAccess().getGroupByGroupByParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldTransformation__GroupByAssignment_1"


    // $ANTLR start "rule__AddColumnTransformation__ColumnAssignment_1"
    // InternalDsl.g:7311:1: rule__AddColumnTransformation__ColumnAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AddColumnTransformation__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7315:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7316:2: ( RULE_STRING )
            {
            // InternalDsl.g:7316:2: ( RULE_STRING )
            // InternalDsl.g:7317:3: RULE_STRING
            {
             before(grammarAccess.getAddColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__ColumnAssignment_1"


    // $ANTLR start "rule__AddColumnTransformation__ValueAssignment_3"
    // InternalDsl.g:7326:1: rule__AddColumnTransformation__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AddColumnTransformation__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7330:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7331:2: ( RULE_STRING )
            {
            // InternalDsl.g:7331:2: ( RULE_STRING )
            // InternalDsl.g:7332:3: RULE_STRING
            {
             before(grammarAccess.getAddColumnTransformationAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddColumnTransformationAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddColumnTransformation__ValueAssignment_3"


    // $ANTLR start "rule__RemoveColumnTransformation__ColumnAssignment_2"
    // InternalDsl.g:7341:1: rule__RemoveColumnTransformation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RemoveColumnTransformation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7345:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7346:2: ( RULE_STRING )
            {
            // InternalDsl.g:7346:2: ( RULE_STRING )
            // InternalDsl.g:7347:3: RULE_STRING
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRemoveColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__ColumnAssignment_2"


    // $ANTLR start "rule__RemoveColumnTransformation__ColumnAssignment_3_1"
    // InternalDsl.g:7356:1: rule__RemoveColumnTransformation__ColumnAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RemoveColumnTransformation__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7360:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7361:2: ( RULE_STRING )
            {
            // InternalDsl.g:7361:2: ( RULE_STRING )
            // InternalDsl.g:7362:3: RULE_STRING
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRemoveColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveColumnTransformation__ColumnAssignment_3_1"


    // $ANTLR start "rule__RenameColumnTransformation__RegexAssignment_1"
    // InternalDsl.g:7371:1: rule__RenameColumnTransformation__RegexAssignment_1 : ( ( 'regex' ) ) ;
    public final void rule__RenameColumnTransformation__RegexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7375:1: ( ( ( 'regex' ) ) )
            // InternalDsl.g:7376:2: ( ( 'regex' ) )
            {
            // InternalDsl.g:7376:2: ( ( 'regex' ) )
            // InternalDsl.g:7377:3: ( 'regex' )
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getRegexRegexKeyword_1_0()); 
            // InternalDsl.g:7378:3: ( 'regex' )
            // InternalDsl.g:7379:4: 'regex'
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getRegexRegexKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getRenameColumnTransformationAccess().getRegexRegexKeyword_1_0()); 

            }

             after(grammarAccess.getRenameColumnTransformationAccess().getRegexRegexKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__RegexAssignment_1"


    // $ANTLR start "rule__RenameColumnTransformation__FromAssignment_2"
    // InternalDsl.g:7390:1: rule__RenameColumnTransformation__FromAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RenameColumnTransformation__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7394:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7395:2: ( RULE_STRING )
            {
            // InternalDsl.g:7395:2: ( RULE_STRING )
            // InternalDsl.g:7396:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getFromSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnTransformationAccess().getFromSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__FromAssignment_2"


    // $ANTLR start "rule__RenameColumnTransformation__ToAssignment_4"
    // InternalDsl.g:7405:1: rule__RenameColumnTransformation__ToAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RenameColumnTransformation__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7409:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7410:2: ( RULE_STRING )
            {
            // InternalDsl.g:7410:2: ( RULE_STRING )
            // InternalDsl.g:7411:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getToSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnTransformationAccess().getToSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__ToAssignment_4"


    // $ANTLR start "rule__SelectColumnTransformation__ColumnAssignment_2"
    // InternalDsl.g:7420:1: rule__SelectColumnTransformation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SelectColumnTransformation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7424:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7425:2: ( RULE_STRING )
            {
            // InternalDsl.g:7425:2: ( RULE_STRING )
            // InternalDsl.g:7426:3: RULE_STRING
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__ColumnAssignment_2"


    // $ANTLR start "rule__SelectColumnTransformation__ColumnAssignment_3_1"
    // InternalDsl.g:7435:1: rule__SelectColumnTransformation__ColumnAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SelectColumnTransformation__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7439:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7440:2: ( RULE_STRING )
            {
            // InternalDsl.g:7440:2: ( RULE_STRING )
            // InternalDsl.g:7441:3: RULE_STRING
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectColumnTransformation__ColumnAssignment_3_1"


    // $ANTLR start "rule__RoundCellsTransformation__ColumnsAssignment_2"
    // InternalDsl.g:7450:1: rule__RoundCellsTransformation__ColumnsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RoundCellsTransformation__ColumnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7454:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7455:2: ( RULE_STRING )
            {
            // InternalDsl.g:7455:2: ( RULE_STRING )
            // InternalDsl.g:7456:3: RULE_STRING
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getColumnsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoundCellsTransformationAccess().getColumnsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__ColumnsAssignment_2"


    // $ANTLR start "rule__RoundCellsTransformation__ColumnsAssignment_3_1"
    // InternalDsl.g:7465:1: rule__RoundCellsTransformation__ColumnsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RoundCellsTransformation__ColumnsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7469:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7470:2: ( RULE_STRING )
            {
            // InternalDsl.g:7470:2: ( RULE_STRING )
            // InternalDsl.g:7471:3: RULE_STRING
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getColumnsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoundCellsTransformationAccess().getColumnsSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__ColumnsAssignment_3_1"


    // $ANTLR start "rule__RoundCellsTransformation__DigitsAssignment_7"
    // InternalDsl.g:7480:1: rule__RoundCellsTransformation__DigitsAssignment_7 : ( RULE_INT ) ;
    public final void rule__RoundCellsTransformation__DigitsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7484:1: ( ( RULE_INT ) )
            // InternalDsl.g:7485:2: ( RULE_INT )
            {
            // InternalDsl.g:7485:2: ( RULE_INT )
            // InternalDsl.g:7486:3: RULE_INT
            {
             before(grammarAccess.getRoundCellsTransformationAccess().getDigitsINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRoundCellsTransformationAccess().getDigitsINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundCellsTransformation__DigitsAssignment_7"


    // $ANTLR start "rule__SetCellsTransformation__ValueAssignment_2"
    // InternalDsl.g:7495:1: rule__SetCellsTransformation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SetCellsTransformation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7499:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7500:2: ( RULE_STRING )
            {
            // InternalDsl.g:7500:2: ( RULE_STRING )
            // InternalDsl.g:7501:3: RULE_STRING
            {
             before(grammarAccess.getSetCellsTransformationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__ValueAssignment_2"


    // $ANTLR start "rule__SetCellsTransformation__ColumnAssignment_5"
    // InternalDsl.g:7510:1: rule__SetCellsTransformation__ColumnAssignment_5 : ( RULE_STRING ) ;
    public final void rule__SetCellsTransformation__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7514:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7515:2: ( RULE_STRING )
            {
            // InternalDsl.g:7515:2: ( RULE_STRING )
            // InternalDsl.g:7516:3: RULE_STRING
            {
             before(grammarAccess.getSetCellsTransformationAccess().getColumnSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getColumnSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__ColumnAssignment_5"


    // $ANTLR start "rule__SetCellsTransformation__RowAssignment_6_2"
    // InternalDsl.g:7525:1: rule__SetCellsTransformation__RowAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__SetCellsTransformation__RowAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7529:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7530:2: ( RULE_STRING )
            {
            // InternalDsl.g:7530:2: ( RULE_STRING )
            // InternalDsl.g:7531:3: RULE_STRING
            {
             before(grammarAccess.getSetCellsTransformationAccess().getRowSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSetCellsTransformationAccess().getRowSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetCellsTransformation__RowAssignment_6_2"


    // $ANTLR start "rule__SelectRowsTransformation__StartAssignment_1"
    // InternalDsl.g:7540:1: rule__SelectRowsTransformation__StartAssignment_1 : ( RULE_INT ) ;
    public final void rule__SelectRowsTransformation__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7544:1: ( ( RULE_INT ) )
            // InternalDsl.g:7545:2: ( RULE_INT )
            {
            // InternalDsl.g:7545:2: ( RULE_INT )
            // InternalDsl.g:7546:3: RULE_INT
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getStartINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSelectRowsTransformationAccess().getStartINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__StartAssignment_1"


    // $ANTLR start "rule__SelectRowsTransformation__LengthAssignment_2_1"
    // InternalDsl.g:7555:1: rule__SelectRowsTransformation__LengthAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SelectRowsTransformation__LengthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7559:1: ( ( RULE_INT ) )
            // InternalDsl.g:7560:2: ( RULE_INT )
            {
            // InternalDsl.g:7560:2: ( RULE_INT )
            // InternalDsl.g:7561:3: RULE_INT
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getLengthINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSelectRowsTransformationAccess().getLengthINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__LengthAssignment_2_1"


    // $ANTLR start "rule__SelectRowsTransformation__GroupByAssignment_3_1"
    // InternalDsl.g:7570:1: rule__SelectRowsTransformation__GroupByAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SelectRowsTransformation__GroupByAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7574:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7575:2: ( RULE_STRING )
            {
            // InternalDsl.g:7575:2: ( RULE_STRING )
            // InternalDsl.g:7576:3: RULE_STRING
            {
             before(grammarAccess.getSelectRowsTransformationAccess().getGroupBySTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectRowsTransformationAccess().getGroupBySTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectRowsTransformation__GroupByAssignment_3_1"


    // $ANTLR start "rule__SortRowsTransformation__ColumnsAssignment_3"
    // InternalDsl.g:7585:1: rule__SortRowsTransformation__ColumnsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SortRowsTransformation__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7589:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7590:2: ( RULE_STRING )
            {
            // InternalDsl.g:7590:2: ( RULE_STRING )
            // InternalDsl.g:7591:3: RULE_STRING
            {
             before(grammarAccess.getSortRowsTransformationAccess().getColumnsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSortRowsTransformationAccess().getColumnsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__ColumnsAssignment_3"


    // $ANTLR start "rule__SortRowsTransformation__ColumnsAssignment_4_1"
    // InternalDsl.g:7600:1: rule__SortRowsTransformation__ColumnsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__SortRowsTransformation__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7604:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7605:2: ( RULE_STRING )
            {
            // InternalDsl.g:7605:2: ( RULE_STRING )
            // InternalDsl.g:7606:3: RULE_STRING
            {
             before(grammarAccess.getSortRowsTransformationAccess().getColumnsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSortRowsTransformationAccess().getColumnsSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__ColumnsAssignment_4_1"


    // $ANTLR start "rule__SortRowsTransformation__OrderAssignment_7"
    // InternalDsl.g:7615:1: rule__SortRowsTransformation__OrderAssignment_7 : ( ( rule__SortRowsTransformation__OrderAlternatives_7_0 ) ) ;
    public final void rule__SortRowsTransformation__OrderAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7619:1: ( ( ( rule__SortRowsTransformation__OrderAlternatives_7_0 ) ) )
            // InternalDsl.g:7620:2: ( ( rule__SortRowsTransformation__OrderAlternatives_7_0 ) )
            {
            // InternalDsl.g:7620:2: ( ( rule__SortRowsTransformation__OrderAlternatives_7_0 ) )
            // InternalDsl.g:7621:3: ( rule__SortRowsTransformation__OrderAlternatives_7_0 )
            {
             before(grammarAccess.getSortRowsTransformationAccess().getOrderAlternatives_7_0()); 
            // InternalDsl.g:7622:3: ( rule__SortRowsTransformation__OrderAlternatives_7_0 )
            // InternalDsl.g:7622:4: rule__SortRowsTransformation__OrderAlternatives_7_0
            {
            pushFollow(FOLLOW_2);
            rule__SortRowsTransformation__OrderAlternatives_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSortRowsTransformationAccess().getOrderAlternatives_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortRowsTransformation__OrderAssignment_7"


    // $ANTLR start "rule__Pipeline__TransformationAssignment_2_0"
    // InternalDsl.g:7630:1: rule__Pipeline__TransformationAssignment_2_0 : ( ruleTransformation ) ;
    public final void rule__Pipeline__TransformationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7634:1: ( ( ruleTransformation ) )
            // InternalDsl.g:7635:2: ( ruleTransformation )
            {
            // InternalDsl.g:7635:2: ( ruleTransformation )
            // InternalDsl.g:7636:3: ruleTransformation
            {
             before(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__TransformationAssignment_2_0"


    // $ANTLR start "rule__Pipeline__TransformationAssignment_2_1_1"
    // InternalDsl.g:7645:1: rule__Pipeline__TransformationAssignment_2_1_1 : ( ruleTransformation ) ;
    public final void rule__Pipeline__TransformationAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7649:1: ( ( ruleTransformation ) )
            // InternalDsl.g:7650:2: ( ruleTransformation )
            {
            // InternalDsl.g:7650:2: ( ruleTransformation )
            // InternalDsl.g:7651:3: ruleTransformation
            {
             before(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__TransformationAssignment_2_1_1"


    // $ANTLR start "rule__Export__TableAssignment_1"
    // InternalDsl.g:7660:1: rule__Export__TableAssignment_1 : ( RULE_ID ) ;
    public final void rule__Export__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7664:1: ( ( RULE_ID ) )
            // InternalDsl.g:7665:2: ( RULE_ID )
            {
            // InternalDsl.g:7665:2: ( RULE_ID )
            // InternalDsl.g:7666:3: RULE_ID
            {
             before(grammarAccess.getExportAccess().getTableIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getTableIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__TableAssignment_1"


    // $ANTLR start "rule__Export__PathAssignment_3"
    // InternalDsl.g:7675:1: rule__Export__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Export__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7679:1: ( ( RULE_STRING ) )
            // InternalDsl.g:7680:2: ( RULE_STRING )
            {
            // InternalDsl.g:7680:2: ( RULE_STRING )
            // InternalDsl.g:7681:3: RULE_STRING
            {
             before(grammarAccess.getExportAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExportAccess().getPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__PathAssignment_3"


    // $ANTLR start "rule__Export__OutputAssignment_5"
    // InternalDsl.g:7690:1: rule__Export__OutputAssignment_5 : ( ruleOutputType ) ;
    public final void rule__Export__OutputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7694:1: ( ( ruleOutputType ) )
            // InternalDsl.g:7695:2: ( ruleOutputType )
            {
            // InternalDsl.g:7695:2: ( ruleOutputType )
            // InternalDsl.g:7696:3: ruleOutputType
            {
             before(grammarAccess.getExportAccess().getOutputOutputTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputType();

            state._fsp--;

             after(grammarAccess.getExportAccess().getOutputOutputTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Export__OutputAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000801810L,0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000106000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x15A1510000001000L,0x0000000000000008L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000094004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000E88000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000500000001000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000001E88000000L});

}