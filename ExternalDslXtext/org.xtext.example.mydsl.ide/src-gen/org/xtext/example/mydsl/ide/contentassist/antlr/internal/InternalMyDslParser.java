package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'merge'", "'append'", "'union'", "'intersection'", "'filepath'", "'lastmodified'", "'['", "','", "']'", "'('", "')'", "'transform'", "'='", "';'", "'xml'", "'{'", "'xpath'", "'}'", "'json'", "'jsonpath'", "'yaml'", "'csv'", "'auto'", "'html'", "'css'", "'store'", "'in'", "'selecting'", "'import'", "'from'", "'as'", "'canonicalize'", "'path'", "'get'", "'name'", "'fold'", "'max'", "'avg'", "'sum'", "'group'", "'by'", "'add'", "'with'", "'remove'", "'rename'", "'to'", "'select'", "'pipe'", "'export'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleMyDsl : ruleMyDsl EOF ;
    public final void entryRuleMyDsl() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMyDsl EOF )
            // InternalMyDsl.g:55:1: ruleMyDsl EOF
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
    // InternalMyDsl.g:62:1: ruleMyDsl : ( ( rule__MyDsl__Group__0 ) ) ;
    public final void ruleMyDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__MyDsl__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__MyDsl__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__MyDsl__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__MyDsl__Group__0 )
            {
             before(grammarAccess.getMyDslAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__MyDsl__Group__0 )
            // InternalMyDsl.g:69:4: rule__MyDsl__Group__0
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


    // $ANTLR start "entryRuleCombinationOperations"
    // InternalMyDsl.g:78:1: entryRuleCombinationOperations : ruleCombinationOperations EOF ;
    public final void entryRuleCombinationOperations() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCombinationOperations EOF )
            // InternalMyDsl.g:80:1: ruleCombinationOperations EOF
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
    // InternalMyDsl.g:87:1: ruleCombinationOperations : ( ( rule__CombinationOperations__Group__0 ) ) ;
    public final void ruleCombinationOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__CombinationOperations__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__CombinationOperations__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__CombinationOperations__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__CombinationOperations__Group__0 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__CombinationOperations__Group__0 )
            // InternalMyDsl.g:94:4: rule__CombinationOperations__Group__0
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
    // InternalMyDsl.g:103:1: entryRuleTableOperations : ruleTableOperations EOF ;
    public final void entryRuleTableOperations() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTableOperations EOF )
            // InternalMyDsl.g:105:1: ruleTableOperations EOF
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
    // InternalMyDsl.g:112:1: ruleTableOperations : ( ( rule__TableOperations__Alternatives ) ) ;
    public final void ruleTableOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__TableOperations__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__TableOperations__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__TableOperations__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__TableOperations__Alternatives )
            {
             before(grammarAccess.getTableOperationsAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__TableOperations__Alternatives )
            // InternalMyDsl.g:119:4: rule__TableOperations__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TableOperations__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTableOperationsAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSourceOperation"
    // InternalMyDsl.g:128:1: entryRuleSourceOperation : ruleSourceOperation EOF ;
    public final void entryRuleSourceOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSourceOperation EOF )
            // InternalMyDsl.g:130:1: ruleSourceOperation EOF
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
    // InternalMyDsl.g:137:1: ruleSourceOperation : ( ( rule__SourceOperation__SourceAssignment ) ) ;
    public final void ruleSourceOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__SourceOperation__SourceAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__SourceOperation__SourceAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__SourceOperation__SourceAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__SourceOperation__SourceAssignment )
            {
             before(grammarAccess.getSourceOperationAccess().getSourceAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__SourceOperation__SourceAssignment )
            // InternalMyDsl.g:144:4: rule__SourceOperation__SourceAssignment
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
    // InternalMyDsl.g:153:1: entryRuleTransformationTableOperation : ruleTransformationTableOperation EOF ;
    public final void entryRuleTransformationTableOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTransformationTableOperation EOF )
            // InternalMyDsl.g:155:1: ruleTransformationTableOperation EOF
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
    // InternalMyDsl.g:162:1: ruleTransformationTableOperation : ( ( rule__TransformationTableOperation__Group__0 ) ) ;
    public final void ruleTransformationTableOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__TransformationTableOperation__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__TransformationTableOperation__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__TransformationTableOperation__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__TransformationTableOperation__Group__0 )
            {
             before(grammarAccess.getTransformationTableOperationAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__TransformationTableOperation__Group__0 )
            // InternalMyDsl.g:169:4: rule__TransformationTableOperation__Group__0
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


    // $ANTLR start "entryRulePipelineTableOperation"
    // InternalMyDsl.g:178:1: entryRulePipelineTableOperation : rulePipelineTableOperation EOF ;
    public final void entryRulePipelineTableOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( rulePipelineTableOperation EOF )
            // InternalMyDsl.g:180:1: rulePipelineTableOperation EOF
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
    // InternalMyDsl.g:187:1: rulePipelineTableOperation : ( ( rule__PipelineTableOperation__PipelineAssignment ) ) ;
    public final void rulePipelineTableOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__PipelineTableOperation__PipelineAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__PipelineTableOperation__PipelineAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__PipelineTableOperation__PipelineAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__PipelineTableOperation__PipelineAssignment )
            {
             before(grammarAccess.getPipelineTableOperationAccess().getPipelineAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__PipelineTableOperation__PipelineAssignment )
            // InternalMyDsl.g:194:4: rule__PipelineTableOperation__PipelineAssignment
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
    // InternalMyDsl.g:203:1: entryRuleTransformOperation : ruleTransformOperation EOF ;
    public final void entryRuleTransformOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleTransformOperation EOF )
            // InternalMyDsl.g:205:1: ruleTransformOperation EOF
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
    // InternalMyDsl.g:212:1: ruleTransformOperation : ( ( rule__TransformOperation__Group__0 ) ) ;
    public final void ruleTransformOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__TransformOperation__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__TransformOperation__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__TransformOperation__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__TransformOperation__Group__0 )
            {
             before(grammarAccess.getTransformOperationAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__TransformOperation__Group__0 )
            // InternalMyDsl.g:219:4: rule__TransformOperation__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleTable EOF )
            // InternalMyDsl.g:230:1: ruleTable EOF
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
    // InternalMyDsl.g:237:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Table__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Table__Group__0 )
            // InternalMyDsl.g:244:4: rule__Table__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleXmlType : ruleXmlType EOF ;
    public final void entryRuleXmlType() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleXmlType EOF )
            // InternalMyDsl.g:255:1: ruleXmlType EOF
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
    // InternalMyDsl.g:262:1: ruleXmlType : ( ( rule__XmlType__Group__0 ) ) ;
    public final void ruleXmlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__XmlType__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__XmlType__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__XmlType__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__XmlType__Group__0 )
            {
             before(grammarAccess.getXmlTypeAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__XmlType__Group__0 )
            // InternalMyDsl.g:269:4: rule__XmlType__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleJsonType : ruleJsonType EOF ;
    public final void entryRuleJsonType() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleJsonType EOF )
            // InternalMyDsl.g:280:1: ruleJsonType EOF
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
    // InternalMyDsl.g:287:1: ruleJsonType : ( ( rule__JsonType__Group__0 ) ) ;
    public final void ruleJsonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__JsonType__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__JsonType__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__JsonType__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__JsonType__Group__0 )
            {
             before(grammarAccess.getJsonTypeAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__JsonType__Group__0 )
            // InternalMyDsl.g:294:4: rule__JsonType__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleYamlType : ruleYamlType EOF ;
    public final void entryRuleYamlType() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleYamlType EOF )
            // InternalMyDsl.g:305:1: ruleYamlType EOF
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
    // InternalMyDsl.g:312:1: ruleYamlType : ( ( rule__YamlType__Group__0 ) ) ;
    public final void ruleYamlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__YamlType__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__YamlType__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__YamlType__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__YamlType__Group__0 )
            {
             before(grammarAccess.getYamlTypeAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__YamlType__Group__0 )
            // InternalMyDsl.g:319:4: rule__YamlType__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleCsvType : ruleCsvType EOF ;
    public final void entryRuleCsvType() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleCsvType EOF )
            // InternalMyDsl.g:330:1: ruleCsvType EOF
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
    // InternalMyDsl.g:337:1: ruleCsvType : ( ( rule__CsvType__Group__0 ) ) ;
    public final void ruleCsvType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__CsvType__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__CsvType__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__CsvType__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__CsvType__Group__0 )
            {
             before(grammarAccess.getCsvTypeAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__CsvType__Group__0 )
            // InternalMyDsl.g:344:4: rule__CsvType__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleAutoType : ruleAutoType EOF ;
    public final void entryRuleAutoType() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleAutoType EOF )
            // InternalMyDsl.g:355:1: ruleAutoType EOF
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
    // InternalMyDsl.g:362:1: ruleAutoType : ( ( rule__AutoType__Group__0 ) ) ;
    public final void ruleAutoType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__AutoType__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__AutoType__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__AutoType__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__AutoType__Group__0 )
            {
             before(grammarAccess.getAutoTypeAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__AutoType__Group__0 )
            // InternalMyDsl.g:369:4: rule__AutoType__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleInputType : ruleInputType EOF ;
    public final void entryRuleInputType() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleInputType EOF )
            // InternalMyDsl.g:380:1: ruleInputType EOF
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
    // InternalMyDsl.g:387:1: ruleInputType : ( ( rule__InputType__Alternatives ) ) ;
    public final void ruleInputType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__InputType__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__InputType__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__InputType__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__InputType__Alternatives )
            {
             before(grammarAccess.getInputTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__InputType__Alternatives )
            // InternalMyDsl.g:394:4: rule__InputType__Alternatives
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
    // InternalMyDsl.g:403:1: entryRuleHtmlType : ruleHtmlType EOF ;
    public final void entryRuleHtmlType() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleHtmlType EOF )
            // InternalMyDsl.g:405:1: ruleHtmlType EOF
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
    // InternalMyDsl.g:412:1: ruleHtmlType : ( ( rule__HtmlType__Group__0 ) ) ;
    public final void ruleHtmlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__HtmlType__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__HtmlType__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__HtmlType__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__HtmlType__Group__0 )
            {
             before(grammarAccess.getHtmlTypeAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__HtmlType__Group__0 )
            // InternalMyDsl.g:419:4: rule__HtmlType__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleOutputType : ruleOutputType EOF ;
    public final void entryRuleOutputType() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleOutputType EOF )
            // InternalMyDsl.g:430:1: ruleOutputType EOF
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
    // InternalMyDsl.g:437:1: ruleOutputType : ( ( rule__OutputType__TypeAssignment ) ) ;
    public final void ruleOutputType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__OutputType__TypeAssignment ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__OutputType__TypeAssignment ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__OutputType__TypeAssignment ) )
            // InternalMyDsl.g:443:3: ( rule__OutputType__TypeAssignment )
            {
             before(grammarAccess.getOutputTypeAccess().getTypeAssignment()); 
            // InternalMyDsl.g:444:3: ( rule__OutputType__TypeAssignment )
            // InternalMyDsl.g:444:4: rule__OutputType__TypeAssignment
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
    // InternalMyDsl.g:453:1: entryRuleMetaData : ruleMetaData EOF ;
    public final void entryRuleMetaData() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleMetaData EOF )
            // InternalMyDsl.g:455:1: ruleMetaData EOF
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
    // InternalMyDsl.g:462:1: ruleMetaData : ( ( rule__MetaData__MetadataAssignment ) ) ;
    public final void ruleMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__MetaData__MetadataAssignment ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__MetaData__MetadataAssignment ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__MetaData__MetadataAssignment ) )
            // InternalMyDsl.g:468:3: ( rule__MetaData__MetadataAssignment )
            {
             before(grammarAccess.getMetaDataAccess().getMetadataAssignment()); 
            // InternalMyDsl.g:469:3: ( rule__MetaData__MetadataAssignment )
            // InternalMyDsl.g:469:4: rule__MetaData__MetadataAssignment
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
    // InternalMyDsl.g:478:1: entryRuleSourceStore : ruleSourceStore EOF ;
    public final void entryRuleSourceStore() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleSourceStore EOF )
            // InternalMyDsl.g:480:1: ruleSourceStore EOF
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
    // InternalMyDsl.g:487:1: ruleSourceStore : ( ( rule__SourceStore__Group__0 ) ) ;
    public final void ruleSourceStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__SourceStore__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__SourceStore__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__SourceStore__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__SourceStore__Group__0 )
            {
             before(grammarAccess.getSourceStoreAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__SourceStore__Group__0 )
            // InternalMyDsl.g:494:4: rule__SourceStore__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleSourceCoumnSelect : ruleSourceCoumnSelect EOF ;
    public final void entryRuleSourceCoumnSelect() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleSourceCoumnSelect EOF )
            // InternalMyDsl.g:505:1: ruleSourceCoumnSelect EOF
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
    // InternalMyDsl.g:512:1: ruleSourceCoumnSelect : ( ( rule__SourceCoumnSelect__Group__0 ) ) ;
    public final void ruleSourceCoumnSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__SourceCoumnSelect__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__SourceCoumnSelect__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__SourceCoumnSelect__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__SourceCoumnSelect__Group__0 )
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__SourceCoumnSelect__Group__0 )
            // InternalMyDsl.g:519:4: rule__SourceCoumnSelect__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleSource EOF )
            // InternalMyDsl.g:530:1: ruleSource EOF
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
    // InternalMyDsl.g:537:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Source__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Source__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Source__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Source__Group__0 )
            // InternalMyDsl.g:544:4: rule__Source__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleCanonicalizePathTransformation : ruleCanonicalizePathTransformation EOF ;
    public final void entryRuleCanonicalizePathTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleCanonicalizePathTransformation EOF )
            // InternalMyDsl.g:555:1: ruleCanonicalizePathTransformation EOF
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
    // InternalMyDsl.g:562:1: ruleCanonicalizePathTransformation : ( ( rule__CanonicalizePathTransformation__Group__0 ) ) ;
    public final void ruleCanonicalizePathTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__CanonicalizePathTransformation__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__CanonicalizePathTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__CanonicalizePathTransformation__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__CanonicalizePathTransformation__Group__0 )
            {
             before(grammarAccess.getCanonicalizePathTransformationAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__CanonicalizePathTransformation__Group__0 )
            // InternalMyDsl.g:569:4: rule__CanonicalizePathTransformation__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleGetPathTransformation : ruleGetPathTransformation EOF ;
    public final void entryRuleGetPathTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleGetPathTransformation EOF )
            // InternalMyDsl.g:580:1: ruleGetPathTransformation EOF
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
    // InternalMyDsl.g:587:1: ruleGetPathTransformation : ( ( rule__GetPathTransformation__Group__0 ) ) ;
    public final void ruleGetPathTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__GetPathTransformation__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__GetPathTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__GetPathTransformation__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__GetPathTransformation__Group__0 )
            {
             before(grammarAccess.getGetPathTransformationAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__GetPathTransformation__Group__0 )
            // InternalMyDsl.g:594:4: rule__GetPathTransformation__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleAppendPathTransformation : ruleAppendPathTransformation EOF ;
    public final void entryRuleAppendPathTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleAppendPathTransformation EOF )
            // InternalMyDsl.g:605:1: ruleAppendPathTransformation EOF
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
    // InternalMyDsl.g:612:1: ruleAppendPathTransformation : ( ( rule__AppendPathTransformation__Group__0 ) ) ;
    public final void ruleAppendPathTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__AppendPathTransformation__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__AppendPathTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__AppendPathTransformation__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__AppendPathTransformation__Group__0 )
            {
             before(grammarAccess.getAppendPathTransformationAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__AppendPathTransformation__Group__0 )
            // InternalMyDsl.g:619:4: rule__AppendPathTransformation__Group__0
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
    // InternalMyDsl.g:628:1: entryRulePathTransformation : rulePathTransformation EOF ;
    public final void entryRulePathTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( rulePathTransformation EOF )
            // InternalMyDsl.g:630:1: rulePathTransformation EOF
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
    // InternalMyDsl.g:637:1: rulePathTransformation : ( ( rule__PathTransformation__Group__0 ) ) ;
    public final void rulePathTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__PathTransformation__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__PathTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__PathTransformation__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__PathTransformation__Group__0 )
            {
             before(grammarAccess.getPathTransformationAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__PathTransformation__Group__0 )
            // InternalMyDsl.g:644:4: rule__PathTransformation__Group__0
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


    // $ANTLR start "entryRuleFoldMaxTranformation"
    // InternalMyDsl.g:653:1: entryRuleFoldMaxTranformation : ruleFoldMaxTranformation EOF ;
    public final void entryRuleFoldMaxTranformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleFoldMaxTranformation EOF )
            // InternalMyDsl.g:655:1: ruleFoldMaxTranformation EOF
            {
             before(grammarAccess.getFoldMaxTranformationRule()); 
            pushFollow(FOLLOW_1);
            ruleFoldMaxTranformation();

            state._fsp--;

             after(grammarAccess.getFoldMaxTranformationRule()); 
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
    // $ANTLR end "entryRuleFoldMaxTranformation"


    // $ANTLR start "ruleFoldMaxTranformation"
    // InternalMyDsl.g:662:1: ruleFoldMaxTranformation : ( ( rule__FoldMaxTranformation__Group__0 ) ) ;
    public final void ruleFoldMaxTranformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__FoldMaxTranformation__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__FoldMaxTranformation__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__FoldMaxTranformation__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__FoldMaxTranformation__Group__0 )
            {
             before(grammarAccess.getFoldMaxTranformationAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__FoldMaxTranformation__Group__0 )
            // InternalMyDsl.g:669:4: rule__FoldMaxTranformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FoldMaxTranformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFoldMaxTranformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoldMaxTranformation"


    // $ANTLR start "entryRuleFoldAverageTranformation"
    // InternalMyDsl.g:678:1: entryRuleFoldAverageTranformation : ruleFoldAverageTranformation EOF ;
    public final void entryRuleFoldAverageTranformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleFoldAverageTranformation EOF )
            // InternalMyDsl.g:680:1: ruleFoldAverageTranformation EOF
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
    // InternalMyDsl.g:687:1: ruleFoldAverageTranformation : ( ( rule__FoldAverageTranformation__Group__0 ) ) ;
    public final void ruleFoldAverageTranformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__FoldAverageTranformation__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__FoldAverageTranformation__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__FoldAverageTranformation__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__FoldAverageTranformation__Group__0 )
            {
             before(grammarAccess.getFoldAverageTranformationAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__FoldAverageTranformation__Group__0 )
            // InternalMyDsl.g:694:4: rule__FoldAverageTranformation__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleFoldSumTranformation : ruleFoldSumTranformation EOF ;
    public final void entryRuleFoldSumTranformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleFoldSumTranformation EOF )
            // InternalMyDsl.g:705:1: ruleFoldSumTranformation EOF
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
    // InternalMyDsl.g:712:1: ruleFoldSumTranformation : ( ( rule__FoldSumTranformation__Group__0 ) ) ;
    public final void ruleFoldSumTranformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__FoldSumTranformation__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__FoldSumTranformation__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__FoldSumTranformation__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__FoldSumTranformation__Group__0 )
            {
             before(grammarAccess.getFoldSumTranformationAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__FoldSumTranformation__Group__0 )
            // InternalMyDsl.g:719:4: rule__FoldSumTranformation__Group__0
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
    // InternalMyDsl.g:728:1: entryRuleGroupBy : ruleGroupBy EOF ;
    public final void entryRuleGroupBy() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleGroupBy EOF )
            // InternalMyDsl.g:730:1: ruleGroupBy EOF
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
    // InternalMyDsl.g:737:1: ruleGroupBy : ( ( rule__GroupBy__Group__0 ) ) ;
    public final void ruleGroupBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__GroupBy__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__GroupBy__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__GroupBy__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__GroupBy__Group__0 )
            {
             before(grammarAccess.getGroupByAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__GroupBy__Group__0 )
            // InternalMyDsl.g:744:4: rule__GroupBy__Group__0
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
    // InternalMyDsl.g:753:1: entryRuleFoldTransformation : ruleFoldTransformation EOF ;
    public final void entryRuleFoldTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleFoldTransformation EOF )
            // InternalMyDsl.g:755:1: ruleFoldTransformation EOF
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
    // InternalMyDsl.g:762:1: ruleFoldTransformation : ( ( rule__FoldTransformation__Group__0 ) ) ;
    public final void ruleFoldTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__FoldTransformation__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__FoldTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__FoldTransformation__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__FoldTransformation__Group__0 )
            {
             before(grammarAccess.getFoldTransformationAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__FoldTransformation__Group__0 )
            // InternalMyDsl.g:769:4: rule__FoldTransformation__Group__0
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
    // InternalMyDsl.g:778:1: entryRuleAddColumnTransformation : ruleAddColumnTransformation EOF ;
    public final void entryRuleAddColumnTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleAddColumnTransformation EOF )
            // InternalMyDsl.g:780:1: ruleAddColumnTransformation EOF
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
    // InternalMyDsl.g:787:1: ruleAddColumnTransformation : ( ( rule__AddColumnTransformation__Group__0 ) ) ;
    public final void ruleAddColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__AddColumnTransformation__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__AddColumnTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__AddColumnTransformation__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__AddColumnTransformation__Group__0 )
            {
             before(grammarAccess.getAddColumnTransformationAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__AddColumnTransformation__Group__0 )
            // InternalMyDsl.g:794:4: rule__AddColumnTransformation__Group__0
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
    // InternalMyDsl.g:803:1: entryRuleRemoveColumnTransformation : ruleRemoveColumnTransformation EOF ;
    public final void entryRuleRemoveColumnTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleRemoveColumnTransformation EOF )
            // InternalMyDsl.g:805:1: ruleRemoveColumnTransformation EOF
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
    // InternalMyDsl.g:812:1: ruleRemoveColumnTransformation : ( ( rule__RemoveColumnTransformation__Group__0 ) ) ;
    public final void ruleRemoveColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__RemoveColumnTransformation__Group__0 ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__RemoveColumnTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__RemoveColumnTransformation__Group__0 ) )
            // InternalMyDsl.g:818:3: ( rule__RemoveColumnTransformation__Group__0 )
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getGroup()); 
            // InternalMyDsl.g:819:3: ( rule__RemoveColumnTransformation__Group__0 )
            // InternalMyDsl.g:819:4: rule__RemoveColumnTransformation__Group__0
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
    // InternalMyDsl.g:828:1: entryRuleRenameColumnTransformation : ruleRenameColumnTransformation EOF ;
    public final void entryRuleRenameColumnTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleRenameColumnTransformation EOF )
            // InternalMyDsl.g:830:1: ruleRenameColumnTransformation EOF
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
    // InternalMyDsl.g:837:1: ruleRenameColumnTransformation : ( ( rule__RenameColumnTransformation__Group__0 ) ) ;
    public final void ruleRenameColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__RenameColumnTransformation__Group__0 ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__RenameColumnTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__RenameColumnTransformation__Group__0 ) )
            // InternalMyDsl.g:843:3: ( rule__RenameColumnTransformation__Group__0 )
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getGroup()); 
            // InternalMyDsl.g:844:3: ( rule__RenameColumnTransformation__Group__0 )
            // InternalMyDsl.g:844:4: rule__RenameColumnTransformation__Group__0
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
    // InternalMyDsl.g:853:1: entryRuleSelectColumnTransformation : ruleSelectColumnTransformation EOF ;
    public final void entryRuleSelectColumnTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleSelectColumnTransformation EOF )
            // InternalMyDsl.g:855:1: ruleSelectColumnTransformation EOF
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
    // InternalMyDsl.g:862:1: ruleSelectColumnTransformation : ( ( rule__SelectColumnTransformation__Group__0 ) ) ;
    public final void ruleSelectColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__SelectColumnTransformation__Group__0 ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__SelectColumnTransformation__Group__0 ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__SelectColumnTransformation__Group__0 ) )
            // InternalMyDsl.g:868:3: ( rule__SelectColumnTransformation__Group__0 )
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getGroup()); 
            // InternalMyDsl.g:869:3: ( rule__SelectColumnTransformation__Group__0 )
            // InternalMyDsl.g:869:4: rule__SelectColumnTransformation__Group__0
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
    // InternalMyDsl.g:878:1: entryRuleColumnTransformation : ruleColumnTransformation EOF ;
    public final void entryRuleColumnTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleColumnTransformation EOF )
            // InternalMyDsl.g:880:1: ruleColumnTransformation EOF
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
    // InternalMyDsl.g:887:1: ruleColumnTransformation : ( ( rule__ColumnTransformation__Alternatives ) ) ;
    public final void ruleColumnTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__ColumnTransformation__Alternatives ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__ColumnTransformation__Alternatives ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__ColumnTransformation__Alternatives ) )
            // InternalMyDsl.g:893:3: ( rule__ColumnTransformation__Alternatives )
            {
             before(grammarAccess.getColumnTransformationAccess().getAlternatives()); 
            // InternalMyDsl.g:894:3: ( rule__ColumnTransformation__Alternatives )
            // InternalMyDsl.g:894:4: rule__ColumnTransformation__Alternatives
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


    // $ANTLR start "entryRuleTransformation"
    // InternalMyDsl.g:903:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleTransformation EOF )
            // InternalMyDsl.g:905:1: ruleTransformation EOF
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
    // InternalMyDsl.g:912:1: ruleTransformation : ( ( rule__Transformation__Alternatives ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__Transformation__Alternatives ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__Transformation__Alternatives ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__Transformation__Alternatives ) )
            // InternalMyDsl.g:918:3: ( rule__Transformation__Alternatives )
            {
             before(grammarAccess.getTransformationAccess().getAlternatives()); 
            // InternalMyDsl.g:919:3: ( rule__Transformation__Alternatives )
            // InternalMyDsl.g:919:4: rule__Transformation__Alternatives
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
    // InternalMyDsl.g:928:1: entryRulePipeline : rulePipeline EOF ;
    public final void entryRulePipeline() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( rulePipeline EOF )
            // InternalMyDsl.g:930:1: rulePipeline EOF
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
    // InternalMyDsl.g:937:1: rulePipeline : ( ( rule__Pipeline__Group__0 ) ) ;
    public final void rulePipeline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__Pipeline__Group__0 ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__Pipeline__Group__0 ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__Pipeline__Group__0 ) )
            // InternalMyDsl.g:943:3: ( rule__Pipeline__Group__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup()); 
            // InternalMyDsl.g:944:3: ( rule__Pipeline__Group__0 )
            // InternalMyDsl.g:944:4: rule__Pipeline__Group__0
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
    // InternalMyDsl.g:953:1: entryRuleExport : ruleExport EOF ;
    public final void entryRuleExport() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleExport EOF )
            // InternalMyDsl.g:955:1: ruleExport EOF
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
    // InternalMyDsl.g:962:1: ruleExport : ( ( rule__Export__Group__0 ) ) ;
    public final void ruleExport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__Export__Group__0 ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__Export__Group__0 ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__Export__Group__0 ) )
            // InternalMyDsl.g:968:3: ( rule__Export__Group__0 )
            {
             before(grammarAccess.getExportAccess().getGroup()); 
            // InternalMyDsl.g:969:3: ( rule__Export__Group__0 )
            // InternalMyDsl.g:969:4: rule__Export__Group__0
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


    // $ANTLR start "rule__CombinationOperations__OperationAlternatives_0_0"
    // InternalMyDsl.g:977:1: rule__CombinationOperations__OperationAlternatives_0_0 : ( ( 'merge' ) | ( 'append' ) );
    public final void rule__CombinationOperations__OperationAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( ( 'merge' ) | ( 'append' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:982:2: ( 'merge' )
                    {
                    // InternalMyDsl.g:982:2: ( 'merge' )
                    // InternalMyDsl.g:983:3: 'merge'
                    {
                     before(grammarAccess.getCombinationOperationsAccess().getOperationMergeKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCombinationOperationsAccess().getOperationMergeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:988:2: ( 'append' )
                    {
                    // InternalMyDsl.g:988:2: ( 'append' )
                    // InternalMyDsl.g:989:3: 'append'
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
    // InternalMyDsl.g:998:1: rule__CombinationOperations__TypeAlternatives_1_0 : ( ( 'union' ) | ( 'intersection' ) );
    public final void rule__CombinationOperations__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( 'union' ) | ( 'intersection' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1003:2: ( 'union' )
                    {
                    // InternalMyDsl.g:1003:2: ( 'union' )
                    // InternalMyDsl.g:1004:3: 'union'
                    {
                     before(grammarAccess.getCombinationOperationsAccess().getTypeUnionKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCombinationOperationsAccess().getTypeUnionKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1009:2: ( 'intersection' )
                    {
                    // InternalMyDsl.g:1009:2: ( 'intersection' )
                    // InternalMyDsl.g:1010:3: 'intersection'
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


    // $ANTLR start "rule__TableOperations__Alternatives"
    // InternalMyDsl.g:1019:1: rule__TableOperations__Alternatives : ( ( ruleCombinationOperations ) | ( ruleTransformOperation ) | ( ruleSourceOperation ) );
    public final void rule__TableOperations__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( ( ruleCombinationOperations ) | ( ruleTransformOperation ) | ( ruleSourceOperation ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||(LA3_2>=18 && LA3_2<=19)||LA3_2==24) ) {
                    alt3=3;
                }
                else if ( (LA3_2==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1024:2: ( ruleCombinationOperations )
                    {
                    // InternalMyDsl.g:1024:2: ( ruleCombinationOperations )
                    // InternalMyDsl.g:1025:3: ruleCombinationOperations
                    {
                     before(grammarAccess.getTableOperationsAccess().getCombinationOperationsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCombinationOperations();

                    state._fsp--;

                     after(grammarAccess.getTableOperationsAccess().getCombinationOperationsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1030:2: ( ruleTransformOperation )
                    {
                    // InternalMyDsl.g:1030:2: ( ruleTransformOperation )
                    // InternalMyDsl.g:1031:3: ruleTransformOperation
                    {
                     before(grammarAccess.getTableOperationsAccess().getTransformOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTransformOperation();

                    state._fsp--;

                     after(grammarAccess.getTableOperationsAccess().getTransformOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1036:2: ( ruleSourceOperation )
                    {
                    // InternalMyDsl.g:1036:2: ( ruleSourceOperation )
                    // InternalMyDsl.g:1037:3: ruleSourceOperation
                    {
                     before(grammarAccess.getTableOperationsAccess().getSourceOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceOperation();

                    state._fsp--;

                     after(grammarAccess.getTableOperationsAccess().getSourceOperationParserRuleCall_2()); 

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
    // $ANTLR end "rule__TableOperations__Alternatives"


    // $ANTLR start "rule__TransformOperation__OperationAlternatives_1_1_0"
    // InternalMyDsl.g:1046:1: rule__TransformOperation__OperationAlternatives_1_1_0 : ( ( ruleTransformationTableOperation ) | ( rulePipelineTableOperation ) );
    public final void rule__TransformOperation__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( ( ruleTransformationTableOperation ) | ( rulePipelineTableOperation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1051:2: ( ruleTransformationTableOperation )
                    {
                    // InternalMyDsl.g:1051:2: ( ruleTransformationTableOperation )
                    // InternalMyDsl.g:1052:3: ruleTransformationTableOperation
                    {
                     before(grammarAccess.getTransformOperationAccess().getOperationTransformationTableOperationParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTransformationTableOperation();

                    state._fsp--;

                     after(grammarAccess.getTransformOperationAccess().getOperationTransformationTableOperationParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1057:2: ( rulePipelineTableOperation )
                    {
                    // InternalMyDsl.g:1057:2: ( rulePipelineTableOperation )
                    // InternalMyDsl.g:1058:3: rulePipelineTableOperation
                    {
                     before(grammarAccess.getTransformOperationAccess().getOperationPipelineTableOperationParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePipelineTableOperation();

                    state._fsp--;

                     after(grammarAccess.getTransformOperationAccess().getOperationPipelineTableOperationParserRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__TransformOperation__OperationAlternatives_1_1_0"


    // $ANTLR start "rule__InputType__Alternatives"
    // InternalMyDsl.g:1067:1: rule__InputType__Alternatives : ( ( ruleJsonType ) | ( ruleXmlType ) | ( ruleCsvType ) | ( ruleYamlType ) | ( ruleAutoType ) );
    public final void rule__InputType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( ( ruleJsonType ) | ( ruleXmlType ) | ( ruleCsvType ) | ( ruleYamlType ) | ( ruleAutoType ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 31:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1072:2: ( ruleJsonType )
                    {
                    // InternalMyDsl.g:1072:2: ( ruleJsonType )
                    // InternalMyDsl.g:1073:3: ruleJsonType
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
                    // InternalMyDsl.g:1078:2: ( ruleXmlType )
                    {
                    // InternalMyDsl.g:1078:2: ( ruleXmlType )
                    // InternalMyDsl.g:1079:3: ruleXmlType
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
                    // InternalMyDsl.g:1084:2: ( ruleCsvType )
                    {
                    // InternalMyDsl.g:1084:2: ( ruleCsvType )
                    // InternalMyDsl.g:1085:3: ruleCsvType
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
                    // InternalMyDsl.g:1090:2: ( ruleYamlType )
                    {
                    // InternalMyDsl.g:1090:2: ( ruleYamlType )
                    // InternalMyDsl.g:1091:3: ruleYamlType
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
                    // InternalMyDsl.g:1096:2: ( ruleAutoType )
                    {
                    // InternalMyDsl.g:1096:2: ( ruleAutoType )
                    // InternalMyDsl.g:1097:3: ruleAutoType
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
    // InternalMyDsl.g:1106:1: rule__OutputType__TypeAlternatives_0 : ( ( ruleHtmlType ) | ( ruleAutoType ) | ( ruleCsvType ) );
    public final void rule__OutputType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( ruleHtmlType ) | ( ruleAutoType ) | ( ruleCsvType ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1111:2: ( ruleHtmlType )
                    {
                    // InternalMyDsl.g:1111:2: ( ruleHtmlType )
                    // InternalMyDsl.g:1112:3: ruleHtmlType
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
                    // InternalMyDsl.g:1117:2: ( ruleAutoType )
                    {
                    // InternalMyDsl.g:1117:2: ( ruleAutoType )
                    // InternalMyDsl.g:1118:3: ruleAutoType
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
                    // InternalMyDsl.g:1123:2: ( ruleCsvType )
                    {
                    // InternalMyDsl.g:1123:2: ( ruleCsvType )
                    // InternalMyDsl.g:1124:3: ruleCsvType
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
    // InternalMyDsl.g:1133:1: rule__MetaData__MetadataAlternatives_0 : ( ( 'filepath' ) | ( 'lastmodified' ) );
    public final void rule__MetaData__MetadataAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( 'filepath' ) | ( 'lastmodified' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1138:2: ( 'filepath' )
                    {
                    // InternalMyDsl.g:1138:2: ( 'filepath' )
                    // InternalMyDsl.g:1139:3: 'filepath'
                    {
                     before(grammarAccess.getMetaDataAccess().getMetadataFilepathKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMetaDataAccess().getMetadataFilepathKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1144:2: ( 'lastmodified' )
                    {
                    // InternalMyDsl.g:1144:2: ( 'lastmodified' )
                    // InternalMyDsl.g:1145:3: 'lastmodified'
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


    // $ANTLR start "rule__PathTransformation__OperationAlternatives_2_0"
    // InternalMyDsl.g:1154:1: rule__PathTransformation__OperationAlternatives_2_0 : ( ( ruleAppendPathTransformation ) | ( ruleCanonicalizePathTransformation ) | ( ruleGetPathTransformation ) );
    public final void rule__PathTransformation__OperationAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( ( ruleAppendPathTransformation ) | ( ruleCanonicalizePathTransformation ) | ( ruleGetPathTransformation ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 42:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1159:2: ( ruleAppendPathTransformation )
                    {
                    // InternalMyDsl.g:1159:2: ( ruleAppendPathTransformation )
                    // InternalMyDsl.g:1160:3: ruleAppendPathTransformation
                    {
                     before(grammarAccess.getPathTransformationAccess().getOperationAppendPathTransformationParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAppendPathTransformation();

                    state._fsp--;

                     after(grammarAccess.getPathTransformationAccess().getOperationAppendPathTransformationParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1165:2: ( ruleCanonicalizePathTransformation )
                    {
                    // InternalMyDsl.g:1165:2: ( ruleCanonicalizePathTransformation )
                    // InternalMyDsl.g:1166:3: ruleCanonicalizePathTransformation
                    {
                     before(grammarAccess.getPathTransformationAccess().getOperationCanonicalizePathTransformationParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCanonicalizePathTransformation();

                    state._fsp--;

                     after(grammarAccess.getPathTransformationAccess().getOperationCanonicalizePathTransformationParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1171:2: ( ruleGetPathTransformation )
                    {
                    // InternalMyDsl.g:1171:2: ( ruleGetPathTransformation )
                    // InternalMyDsl.g:1172:3: ruleGetPathTransformation
                    {
                     before(grammarAccess.getPathTransformationAccess().getOperationGetPathTransformationParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGetPathTransformation();

                    state._fsp--;

                     after(grammarAccess.getPathTransformationAccess().getOperationGetPathTransformationParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__PathTransformation__OperationAlternatives_2_0"


    // $ANTLR start "rule__FoldTransformation__OperationAlternatives_0_0"
    // InternalMyDsl.g:1181:1: rule__FoldTransformation__OperationAlternatives_0_0 : ( ( ruleFoldMaxTranformation ) | ( ruleFoldSumTranformation ) | ( ruleFoldAverageTranformation ) );
    public final void rule__FoldTransformation__OperationAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( ( ruleFoldMaxTranformation ) | ( ruleFoldSumTranformation ) | ( ruleFoldAverageTranformation ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            else if ( (LA9_0==46) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==48) ) {
                    alt9=3;
                }
                else if ( (LA9_2==49) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1186:2: ( ruleFoldMaxTranformation )
                    {
                    // InternalMyDsl.g:1186:2: ( ruleFoldMaxTranformation )
                    // InternalMyDsl.g:1187:3: ruleFoldMaxTranformation
                    {
                     before(grammarAccess.getFoldTransformationAccess().getOperationFoldMaxTranformationParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFoldMaxTranformation();

                    state._fsp--;

                     after(grammarAccess.getFoldTransformationAccess().getOperationFoldMaxTranformationParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1192:2: ( ruleFoldSumTranformation )
                    {
                    // InternalMyDsl.g:1192:2: ( ruleFoldSumTranformation )
                    // InternalMyDsl.g:1193:3: ruleFoldSumTranformation
                    {
                     before(grammarAccess.getFoldTransformationAccess().getOperationFoldSumTranformationParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFoldSumTranformation();

                    state._fsp--;

                     after(grammarAccess.getFoldTransformationAccess().getOperationFoldSumTranformationParserRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1198:2: ( ruleFoldAverageTranformation )
                    {
                    // InternalMyDsl.g:1198:2: ( ruleFoldAverageTranformation )
                    // InternalMyDsl.g:1199:3: ruleFoldAverageTranformation
                    {
                     before(grammarAccess.getFoldTransformationAccess().getOperationFoldAverageTranformationParserRuleCall_0_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFoldAverageTranformation();

                    state._fsp--;

                     after(grammarAccess.getFoldTransformationAccess().getOperationFoldAverageTranformationParserRuleCall_0_0_2()); 

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
    // InternalMyDsl.g:1208:1: rule__ColumnTransformation__Alternatives : ( ( ruleAddColumnTransformation ) | ( ruleRemoveColumnTransformation ) | ( ruleRenameColumnTransformation ) | ( ruleSelectColumnTransformation ) );
    public final void rule__ColumnTransformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( ( ruleAddColumnTransformation ) | ( ruleRemoveColumnTransformation ) | ( ruleRenameColumnTransformation ) | ( ruleSelectColumnTransformation ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt10=1;
                }
                break;
            case 54:
                {
                alt10=2;
                }
                break;
            case 55:
                {
                alt10=3;
                }
                break;
            case 57:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1213:2: ( ruleAddColumnTransformation )
                    {
                    // InternalMyDsl.g:1213:2: ( ruleAddColumnTransformation )
                    // InternalMyDsl.g:1214:3: ruleAddColumnTransformation
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
                    // InternalMyDsl.g:1219:2: ( ruleRemoveColumnTransformation )
                    {
                    // InternalMyDsl.g:1219:2: ( ruleRemoveColumnTransformation )
                    // InternalMyDsl.g:1220:3: ruleRemoveColumnTransformation
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
                    // InternalMyDsl.g:1225:2: ( ruleRenameColumnTransformation )
                    {
                    // InternalMyDsl.g:1225:2: ( ruleRenameColumnTransformation )
                    // InternalMyDsl.g:1226:3: ruleRenameColumnTransformation
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
                    // InternalMyDsl.g:1231:2: ( ruleSelectColumnTransformation )
                    {
                    // InternalMyDsl.g:1231:2: ( ruleSelectColumnTransformation )
                    // InternalMyDsl.g:1232:3: ruleSelectColumnTransformation
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


    // $ANTLR start "rule__Transformation__Alternatives"
    // InternalMyDsl.g:1241:1: rule__Transformation__Alternatives : ( ( rulePathTransformation ) | ( ruleFoldTransformation ) | ( ruleColumnTransformation ) );
    public final void rule__Transformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( rulePathTransformation ) | ( ruleFoldTransformation ) | ( ruleColumnTransformation ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==46) ) {
                        alt11=2;
                    }
                    else if ( (LA11_4==12||LA11_4==42||LA11_4==44) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            case 52:
            case 54:
            case 55:
            case 57:
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
                    // InternalMyDsl.g:1246:2: ( rulePathTransformation )
                    {
                    // InternalMyDsl.g:1246:2: ( rulePathTransformation )
                    // InternalMyDsl.g:1247:3: rulePathTransformation
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
                    // InternalMyDsl.g:1252:2: ( ruleFoldTransformation )
                    {
                    // InternalMyDsl.g:1252:2: ( ruleFoldTransformation )
                    // InternalMyDsl.g:1253:3: ruleFoldTransformation
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
                    // InternalMyDsl.g:1258:2: ( ruleColumnTransformation )
                    {
                    // InternalMyDsl.g:1258:2: ( ruleColumnTransformation )
                    // InternalMyDsl.g:1259:3: ruleColumnTransformation
                    {
                     before(grammarAccess.getTransformationAccess().getColumnTransformationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnTransformation();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getColumnTransformationParserRuleCall_2()); 

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
    // InternalMyDsl.g:1268:1: rule__MyDsl__Group__0 : rule__MyDsl__Group__0__Impl rule__MyDsl__Group__1 ;
    public final void rule__MyDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( rule__MyDsl__Group__0__Impl rule__MyDsl__Group__1 )
            // InternalMyDsl.g:1273:2: rule__MyDsl__Group__0__Impl rule__MyDsl__Group__1
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
    // InternalMyDsl.g:1280:1: rule__MyDsl__Group__0__Impl : ( ( rule__MyDsl__PipelinesAssignment_0 )* ) ;
    public final void rule__MyDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( ( ( rule__MyDsl__PipelinesAssignment_0 )* ) )
            // InternalMyDsl.g:1285:1: ( ( rule__MyDsl__PipelinesAssignment_0 )* )
            {
            // InternalMyDsl.g:1285:1: ( ( rule__MyDsl__PipelinesAssignment_0 )* )
            // InternalMyDsl.g:1286:2: ( rule__MyDsl__PipelinesAssignment_0 )*
            {
             before(grammarAccess.getMyDslAccess().getPipelinesAssignment_0()); 
            // InternalMyDsl.g:1287:2: ( rule__MyDsl__PipelinesAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==23) ) {
                        int LA12_3 = input.LA(3);

                        if ( (LA12_3==58) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1287:3: rule__MyDsl__PipelinesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MyDsl__PipelinesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMyDslAccess().getPipelinesAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1295:1: rule__MyDsl__Group__1 : rule__MyDsl__Group__1__Impl rule__MyDsl__Group__2 ;
    public final void rule__MyDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( rule__MyDsl__Group__1__Impl rule__MyDsl__Group__2 )
            // InternalMyDsl.g:1300:2: rule__MyDsl__Group__1__Impl rule__MyDsl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MyDsl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyDsl__Group__2();

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
    // InternalMyDsl.g:1307:1: rule__MyDsl__Group__1__Impl : ( ( rule__MyDsl__SourcesAssignment_1 )* ) ;
    public final void rule__MyDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( ( ( rule__MyDsl__SourcesAssignment_1 )* ) )
            // InternalMyDsl.g:1312:1: ( ( rule__MyDsl__SourcesAssignment_1 )* )
            {
            // InternalMyDsl.g:1312:1: ( ( rule__MyDsl__SourcesAssignment_1 )* )
            // InternalMyDsl.g:1313:2: ( rule__MyDsl__SourcesAssignment_1 )*
            {
             before(grammarAccess.getMyDslAccess().getSourcesAssignment_1()); 
            // InternalMyDsl.g:1314:2: ( rule__MyDsl__SourcesAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==23) ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3==39) ) {
                            alt13=1;
                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1314:3: rule__MyDsl__SourcesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MyDsl__SourcesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMyDslAccess().getSourcesAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MyDsl__Group__2"
    // InternalMyDsl.g:1322:1: rule__MyDsl__Group__2 : rule__MyDsl__Group__2__Impl rule__MyDsl__Group__3 ;
    public final void rule__MyDsl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( rule__MyDsl__Group__2__Impl rule__MyDsl__Group__3 )
            // InternalMyDsl.g:1327:2: rule__MyDsl__Group__2__Impl rule__MyDsl__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__MyDsl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MyDsl__Group__3();

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
    // $ANTLR end "rule__MyDsl__Group__2"


    // $ANTLR start "rule__MyDsl__Group__2__Impl"
    // InternalMyDsl.g:1334:1: rule__MyDsl__Group__2__Impl : ( ( rule__MyDsl__TablesAssignment_2 )* ) ;
    public final void rule__MyDsl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( ( ( rule__MyDsl__TablesAssignment_2 )* ) )
            // InternalMyDsl.g:1339:1: ( ( rule__MyDsl__TablesAssignment_2 )* )
            {
            // InternalMyDsl.g:1339:1: ( ( rule__MyDsl__TablesAssignment_2 )* )
            // InternalMyDsl.g:1340:2: ( rule__MyDsl__TablesAssignment_2 )*
            {
             before(grammarAccess.getMyDslAccess().getTablesAssignment_2()); 
            // InternalMyDsl.g:1341:2: ( rule__MyDsl__TablesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1341:3: rule__MyDsl__TablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MyDsl__TablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMyDslAccess().getTablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__Group__2__Impl"


    // $ANTLR start "rule__MyDsl__Group__3"
    // InternalMyDsl.g:1349:1: rule__MyDsl__Group__3 : rule__MyDsl__Group__3__Impl ;
    public final void rule__MyDsl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( rule__MyDsl__Group__3__Impl )
            // InternalMyDsl.g:1354:2: rule__MyDsl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyDsl__Group__3__Impl();

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
    // $ANTLR end "rule__MyDsl__Group__3"


    // $ANTLR start "rule__MyDsl__Group__3__Impl"
    // InternalMyDsl.g:1360:1: rule__MyDsl__Group__3__Impl : ( ( rule__MyDsl__ExportAssignment_3 )* ) ;
    public final void rule__MyDsl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( ( ( rule__MyDsl__ExportAssignment_3 )* ) )
            // InternalMyDsl.g:1365:1: ( ( rule__MyDsl__ExportAssignment_3 )* )
            {
            // InternalMyDsl.g:1365:1: ( ( rule__MyDsl__ExportAssignment_3 )* )
            // InternalMyDsl.g:1366:2: ( rule__MyDsl__ExportAssignment_3 )*
            {
             before(grammarAccess.getMyDslAccess().getExportAssignment_3()); 
            // InternalMyDsl.g:1367:2: ( rule__MyDsl__ExportAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==59) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1367:3: rule__MyDsl__ExportAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__MyDsl__ExportAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMyDslAccess().getExportAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__Group__3__Impl"


    // $ANTLR start "rule__CombinationOperations__Group__0"
    // InternalMyDsl.g:1376:1: rule__CombinationOperations__Group__0 : rule__CombinationOperations__Group__0__Impl rule__CombinationOperations__Group__1 ;
    public final void rule__CombinationOperations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( rule__CombinationOperations__Group__0__Impl rule__CombinationOperations__Group__1 )
            // InternalMyDsl.g:1381:2: rule__CombinationOperations__Group__0__Impl rule__CombinationOperations__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1388:1: rule__CombinationOperations__Group__0__Impl : ( ( rule__CombinationOperations__OperationAssignment_0 ) ) ;
    public final void rule__CombinationOperations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( ( ( rule__CombinationOperations__OperationAssignment_0 ) ) )
            // InternalMyDsl.g:1393:1: ( ( rule__CombinationOperations__OperationAssignment_0 ) )
            {
            // InternalMyDsl.g:1393:1: ( ( rule__CombinationOperations__OperationAssignment_0 ) )
            // InternalMyDsl.g:1394:2: ( rule__CombinationOperations__OperationAssignment_0 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getOperationAssignment_0()); 
            // InternalMyDsl.g:1395:2: ( rule__CombinationOperations__OperationAssignment_0 )
            // InternalMyDsl.g:1395:3: rule__CombinationOperations__OperationAssignment_0
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
    // InternalMyDsl.g:1403:1: rule__CombinationOperations__Group__1 : rule__CombinationOperations__Group__1__Impl rule__CombinationOperations__Group__2 ;
    public final void rule__CombinationOperations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( rule__CombinationOperations__Group__1__Impl rule__CombinationOperations__Group__2 )
            // InternalMyDsl.g:1408:2: rule__CombinationOperations__Group__1__Impl rule__CombinationOperations__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1415:1: rule__CombinationOperations__Group__1__Impl : ( ( rule__CombinationOperations__TypeAssignment_1 )? ) ;
    public final void rule__CombinationOperations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( ( ( rule__CombinationOperations__TypeAssignment_1 )? ) )
            // InternalMyDsl.g:1420:1: ( ( rule__CombinationOperations__TypeAssignment_1 )? )
            {
            // InternalMyDsl.g:1420:1: ( ( rule__CombinationOperations__TypeAssignment_1 )? )
            // InternalMyDsl.g:1421:2: ( rule__CombinationOperations__TypeAssignment_1 )?
            {
             before(grammarAccess.getCombinationOperationsAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:1422:2: ( rule__CombinationOperations__TypeAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=13 && LA16_0<=14)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1422:3: rule__CombinationOperations__TypeAssignment_1
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
    // InternalMyDsl.g:1430:1: rule__CombinationOperations__Group__2 : rule__CombinationOperations__Group__2__Impl rule__CombinationOperations__Group__3 ;
    public final void rule__CombinationOperations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( rule__CombinationOperations__Group__2__Impl rule__CombinationOperations__Group__3 )
            // InternalMyDsl.g:1435:2: rule__CombinationOperations__Group__2__Impl rule__CombinationOperations__Group__3
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
    // InternalMyDsl.g:1442:1: rule__CombinationOperations__Group__2__Impl : ( '[' ) ;
    public final void rule__CombinationOperations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( ( '[' ) )
            // InternalMyDsl.g:1447:1: ( '[' )
            {
            // InternalMyDsl.g:1447:1: ( '[' )
            // InternalMyDsl.g:1448:2: '['
            {
             before(grammarAccess.getCombinationOperationsAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1457:1: rule__CombinationOperations__Group__3 : rule__CombinationOperations__Group__3__Impl rule__CombinationOperations__Group__4 ;
    public final void rule__CombinationOperations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( rule__CombinationOperations__Group__3__Impl rule__CombinationOperations__Group__4 )
            // InternalMyDsl.g:1462:2: rule__CombinationOperations__Group__3__Impl rule__CombinationOperations__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1469:1: rule__CombinationOperations__Group__3__Impl : ( ( rule__CombinationOperations__TableOperationAssignment_3 ) ) ;
    public final void rule__CombinationOperations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( ( rule__CombinationOperations__TableOperationAssignment_3 ) ) )
            // InternalMyDsl.g:1474:1: ( ( rule__CombinationOperations__TableOperationAssignment_3 ) )
            {
            // InternalMyDsl.g:1474:1: ( ( rule__CombinationOperations__TableOperationAssignment_3 ) )
            // InternalMyDsl.g:1475:2: ( rule__CombinationOperations__TableOperationAssignment_3 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_3()); 
            // InternalMyDsl.g:1476:2: ( rule__CombinationOperations__TableOperationAssignment_3 )
            // InternalMyDsl.g:1476:3: rule__CombinationOperations__TableOperationAssignment_3
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
    // InternalMyDsl.g:1484:1: rule__CombinationOperations__Group__4 : rule__CombinationOperations__Group__4__Impl rule__CombinationOperations__Group__5 ;
    public final void rule__CombinationOperations__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( rule__CombinationOperations__Group__4__Impl rule__CombinationOperations__Group__5 )
            // InternalMyDsl.g:1489:2: rule__CombinationOperations__Group__4__Impl rule__CombinationOperations__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1496:1: rule__CombinationOperations__Group__4__Impl : ( ( rule__CombinationOperations__Group_4__0 )* ) ;
    public final void rule__CombinationOperations__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( ( ( rule__CombinationOperations__Group_4__0 )* ) )
            // InternalMyDsl.g:1501:1: ( ( rule__CombinationOperations__Group_4__0 )* )
            {
            // InternalMyDsl.g:1501:1: ( ( rule__CombinationOperations__Group_4__0 )* )
            // InternalMyDsl.g:1502:2: ( rule__CombinationOperations__Group_4__0 )*
            {
             before(grammarAccess.getCombinationOperationsAccess().getGroup_4()); 
            // InternalMyDsl.g:1503:2: ( rule__CombinationOperations__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_ID||(LA17_1>=11 && LA17_1<=12)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1503:3: rule__CombinationOperations__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CombinationOperations__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:1511:1: rule__CombinationOperations__Group__5 : rule__CombinationOperations__Group__5__Impl rule__CombinationOperations__Group__6 ;
    public final void rule__CombinationOperations__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( rule__CombinationOperations__Group__5__Impl rule__CombinationOperations__Group__6 )
            // InternalMyDsl.g:1516:2: rule__CombinationOperations__Group__5__Impl rule__CombinationOperations__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1523:1: rule__CombinationOperations__Group__5__Impl : ( ( ',' )? ) ;
    public final void rule__CombinationOperations__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( ( ( ',' )? ) )
            // InternalMyDsl.g:1528:1: ( ( ',' )? )
            {
            // InternalMyDsl.g:1528:1: ( ( ',' )? )
            // InternalMyDsl.g:1529:2: ( ',' )?
            {
             before(grammarAccess.getCombinationOperationsAccess().getCommaKeyword_5()); 
            // InternalMyDsl.g:1530:2: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1530:3: ','
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:1538:1: rule__CombinationOperations__Group__6 : rule__CombinationOperations__Group__6__Impl ;
    public final void rule__CombinationOperations__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( rule__CombinationOperations__Group__6__Impl )
            // InternalMyDsl.g:1543:2: rule__CombinationOperations__Group__6__Impl
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
    // InternalMyDsl.g:1549:1: rule__CombinationOperations__Group__6__Impl : ( ']' ) ;
    public final void rule__CombinationOperations__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( ( ']' ) )
            // InternalMyDsl.g:1554:1: ( ']' )
            {
            // InternalMyDsl.g:1554:1: ( ']' )
            // InternalMyDsl.g:1555:2: ']'
            {
             before(grammarAccess.getCombinationOperationsAccess().getRightSquareBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1565:1: rule__CombinationOperations__Group_4__0 : rule__CombinationOperations__Group_4__0__Impl rule__CombinationOperations__Group_4__1 ;
    public final void rule__CombinationOperations__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( rule__CombinationOperations__Group_4__0__Impl rule__CombinationOperations__Group_4__1 )
            // InternalMyDsl.g:1570:2: rule__CombinationOperations__Group_4__0__Impl rule__CombinationOperations__Group_4__1
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
    // InternalMyDsl.g:1577:1: rule__CombinationOperations__Group_4__0__Impl : ( ',' ) ;
    public final void rule__CombinationOperations__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( ( ',' ) )
            // InternalMyDsl.g:1582:1: ( ',' )
            {
            // InternalMyDsl.g:1582:1: ( ',' )
            // InternalMyDsl.g:1583:2: ','
            {
             before(grammarAccess.getCombinationOperationsAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1592:1: rule__CombinationOperations__Group_4__1 : rule__CombinationOperations__Group_4__1__Impl ;
    public final void rule__CombinationOperations__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( rule__CombinationOperations__Group_4__1__Impl )
            // InternalMyDsl.g:1597:2: rule__CombinationOperations__Group_4__1__Impl
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
    // InternalMyDsl.g:1603:1: rule__CombinationOperations__Group_4__1__Impl : ( ( rule__CombinationOperations__TableOperationAssignment_4_1 ) ) ;
    public final void rule__CombinationOperations__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( ( ( rule__CombinationOperations__TableOperationAssignment_4_1 ) ) )
            // InternalMyDsl.g:1608:1: ( ( rule__CombinationOperations__TableOperationAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1608:1: ( ( rule__CombinationOperations__TableOperationAssignment_4_1 ) )
            // InternalMyDsl.g:1609:2: ( rule__CombinationOperations__TableOperationAssignment_4_1 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_4_1()); 
            // InternalMyDsl.g:1610:2: ( rule__CombinationOperations__TableOperationAssignment_4_1 )
            // InternalMyDsl.g:1610:3: rule__CombinationOperations__TableOperationAssignment_4_1
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


    // $ANTLR start "rule__TransformationTableOperation__Group__0"
    // InternalMyDsl.g:1619:1: rule__TransformationTableOperation__Group__0 : rule__TransformationTableOperation__Group__0__Impl rule__TransformationTableOperation__Group__1 ;
    public final void rule__TransformationTableOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( rule__TransformationTableOperation__Group__0__Impl rule__TransformationTableOperation__Group__1 )
            // InternalMyDsl.g:1624:2: rule__TransformationTableOperation__Group__0__Impl rule__TransformationTableOperation__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1631:1: rule__TransformationTableOperation__Group__0__Impl : ( '(' ) ;
    public final void rule__TransformationTableOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( ( '(' ) )
            // InternalMyDsl.g:1636:1: ( '(' )
            {
            // InternalMyDsl.g:1636:1: ( '(' )
            // InternalMyDsl.g:1637:2: '('
            {
             before(grammarAccess.getTransformationTableOperationAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1646:1: rule__TransformationTableOperation__Group__1 : rule__TransformationTableOperation__Group__1__Impl rule__TransformationTableOperation__Group__2 ;
    public final void rule__TransformationTableOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( rule__TransformationTableOperation__Group__1__Impl rule__TransformationTableOperation__Group__2 )
            // InternalMyDsl.g:1651:2: rule__TransformationTableOperation__Group__1__Impl rule__TransformationTableOperation__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1658:1: rule__TransformationTableOperation__Group__1__Impl : ( ( rule__TransformationTableOperation__TransformationAssignment_1 ) ) ;
    public final void rule__TransformationTableOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( ( ( rule__TransformationTableOperation__TransformationAssignment_1 ) ) )
            // InternalMyDsl.g:1663:1: ( ( rule__TransformationTableOperation__TransformationAssignment_1 ) )
            {
            // InternalMyDsl.g:1663:1: ( ( rule__TransformationTableOperation__TransformationAssignment_1 ) )
            // InternalMyDsl.g:1664:2: ( rule__TransformationTableOperation__TransformationAssignment_1 )
            {
             before(grammarAccess.getTransformationTableOperationAccess().getTransformationAssignment_1()); 
            // InternalMyDsl.g:1665:2: ( rule__TransformationTableOperation__TransformationAssignment_1 )
            // InternalMyDsl.g:1665:3: rule__TransformationTableOperation__TransformationAssignment_1
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
    // InternalMyDsl.g:1673:1: rule__TransformationTableOperation__Group__2 : rule__TransformationTableOperation__Group__2__Impl ;
    public final void rule__TransformationTableOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( rule__TransformationTableOperation__Group__2__Impl )
            // InternalMyDsl.g:1678:2: rule__TransformationTableOperation__Group__2__Impl
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
    // InternalMyDsl.g:1684:1: rule__TransformationTableOperation__Group__2__Impl : ( ')' ) ;
    public final void rule__TransformationTableOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( ( ')' ) )
            // InternalMyDsl.g:1689:1: ( ')' )
            {
            // InternalMyDsl.g:1689:1: ( ')' )
            // InternalMyDsl.g:1690:2: ')'
            {
             before(grammarAccess.getTransformationTableOperationAccess().getRightParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__TransformOperation__Group__0"
    // InternalMyDsl.g:1700:1: rule__TransformOperation__Group__0 : rule__TransformOperation__Group__0__Impl rule__TransformOperation__Group__1 ;
    public final void rule__TransformOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( rule__TransformOperation__Group__0__Impl rule__TransformOperation__Group__1 )
            // InternalMyDsl.g:1705:2: rule__TransformOperation__Group__0__Impl rule__TransformOperation__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1712:1: rule__TransformOperation__Group__0__Impl : ( ( rule__TransformOperation__SourceAssignment_0 ) ) ;
    public final void rule__TransformOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( ( ( rule__TransformOperation__SourceAssignment_0 ) ) )
            // InternalMyDsl.g:1717:1: ( ( rule__TransformOperation__SourceAssignment_0 ) )
            {
            // InternalMyDsl.g:1717:1: ( ( rule__TransformOperation__SourceAssignment_0 ) )
            // InternalMyDsl.g:1718:2: ( rule__TransformOperation__SourceAssignment_0 )
            {
             before(grammarAccess.getTransformOperationAccess().getSourceAssignment_0()); 
            // InternalMyDsl.g:1719:2: ( rule__TransformOperation__SourceAssignment_0 )
            // InternalMyDsl.g:1719:3: rule__TransformOperation__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TransformOperation__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformOperationAccess().getSourceAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1727:1: rule__TransformOperation__Group__1 : rule__TransformOperation__Group__1__Impl ;
    public final void rule__TransformOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( rule__TransformOperation__Group__1__Impl )
            // InternalMyDsl.g:1732:2: rule__TransformOperation__Group__1__Impl
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
    // InternalMyDsl.g:1738:1: rule__TransformOperation__Group__1__Impl : ( ( ( rule__TransformOperation__Group_1__0 ) ) ( ( rule__TransformOperation__Group_1__0 )* ) ) ;
    public final void rule__TransformOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( ( ( ( rule__TransformOperation__Group_1__0 ) ) ( ( rule__TransformOperation__Group_1__0 )* ) ) )
            // InternalMyDsl.g:1743:1: ( ( ( rule__TransformOperation__Group_1__0 ) ) ( ( rule__TransformOperation__Group_1__0 )* ) )
            {
            // InternalMyDsl.g:1743:1: ( ( ( rule__TransformOperation__Group_1__0 ) ) ( ( rule__TransformOperation__Group_1__0 )* ) )
            // InternalMyDsl.g:1744:2: ( ( rule__TransformOperation__Group_1__0 ) ) ( ( rule__TransformOperation__Group_1__0 )* )
            {
            // InternalMyDsl.g:1744:2: ( ( rule__TransformOperation__Group_1__0 ) )
            // InternalMyDsl.g:1745:3: ( rule__TransformOperation__Group_1__0 )
            {
             before(grammarAccess.getTransformOperationAccess().getGroup_1()); 
            // InternalMyDsl.g:1746:3: ( rule__TransformOperation__Group_1__0 )
            // InternalMyDsl.g:1746:4: rule__TransformOperation__Group_1__0
            {
            pushFollow(FOLLOW_13);
            rule__TransformOperation__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformOperationAccess().getGroup_1()); 

            }

            // InternalMyDsl.g:1749:2: ( ( rule__TransformOperation__Group_1__0 )* )
            // InternalMyDsl.g:1750:3: ( rule__TransformOperation__Group_1__0 )*
            {
             before(grammarAccess.getTransformOperationAccess().getGroup_1()); 
            // InternalMyDsl.g:1751:3: ( rule__TransformOperation__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1751:4: rule__TransformOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__TransformOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTransformOperationAccess().getGroup_1()); 

            }


            }


            }

        }
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


    // $ANTLR start "rule__TransformOperation__Group_1__0"
    // InternalMyDsl.g:1761:1: rule__TransformOperation__Group_1__0 : rule__TransformOperation__Group_1__0__Impl rule__TransformOperation__Group_1__1 ;
    public final void rule__TransformOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( rule__TransformOperation__Group_1__0__Impl rule__TransformOperation__Group_1__1 )
            // InternalMyDsl.g:1766:2: rule__TransformOperation__Group_1__0__Impl rule__TransformOperation__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__TransformOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransformOperation__Group_1__1();

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
    // $ANTLR end "rule__TransformOperation__Group_1__0"


    // $ANTLR start "rule__TransformOperation__Group_1__0__Impl"
    // InternalMyDsl.g:1773:1: rule__TransformOperation__Group_1__0__Impl : ( 'transform' ) ;
    public final void rule__TransformOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( 'transform' ) )
            // InternalMyDsl.g:1778:1: ( 'transform' )
            {
            // InternalMyDsl.g:1778:1: ( 'transform' )
            // InternalMyDsl.g:1779:2: 'transform'
            {
             before(grammarAccess.getTransformOperationAccess().getTransformKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransformOperationAccess().getTransformKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__Group_1__0__Impl"


    // $ANTLR start "rule__TransformOperation__Group_1__1"
    // InternalMyDsl.g:1788:1: rule__TransformOperation__Group_1__1 : rule__TransformOperation__Group_1__1__Impl ;
    public final void rule__TransformOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( rule__TransformOperation__Group_1__1__Impl )
            // InternalMyDsl.g:1793:2: rule__TransformOperation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransformOperation__Group_1__1__Impl();

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
    // $ANTLR end "rule__TransformOperation__Group_1__1"


    // $ANTLR start "rule__TransformOperation__Group_1__1__Impl"
    // InternalMyDsl.g:1799:1: rule__TransformOperation__Group_1__1__Impl : ( ( rule__TransformOperation__OperationAssignment_1_1 ) ) ;
    public final void rule__TransformOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( ( ( rule__TransformOperation__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:1804:1: ( ( rule__TransformOperation__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1804:1: ( ( rule__TransformOperation__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:1805:2: ( rule__TransformOperation__OperationAssignment_1_1 )
            {
             before(grammarAccess.getTransformOperationAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:1806:2: ( rule__TransformOperation__OperationAssignment_1_1 )
            // InternalMyDsl.g:1806:3: rule__TransformOperation__OperationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TransformOperation__OperationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformOperationAccess().getOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__Group_1__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalMyDsl.g:1815:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalMyDsl.g:1820:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1827:1: rule__Table__Group__0__Impl : ( ( rule__Table__NameAssignment_0 ) ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( ( ( rule__Table__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1832:1: ( ( rule__Table__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1832:1: ( ( rule__Table__NameAssignment_0 ) )
            // InternalMyDsl.g:1833:2: ( rule__Table__NameAssignment_0 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1834:2: ( rule__Table__NameAssignment_0 )
            // InternalMyDsl.g:1834:3: rule__Table__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1842:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalMyDsl.g:1847:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

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
    // InternalMyDsl.g:1854:1: rule__Table__Group__1__Impl : ( '=' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( ( '=' ) )
            // InternalMyDsl.g:1859:1: ( '=' )
            {
            // InternalMyDsl.g:1859:1: ( '=' )
            // InternalMyDsl.g:1860:2: '='
            {
             before(grammarAccess.getTableAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Table__Group__2"
    // InternalMyDsl.g:1869:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalMyDsl.g:1874:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalMyDsl.g:1881:1: rule__Table__Group__2__Impl : ( ( rule__Table__OperationAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( ( ( rule__Table__OperationAssignment_2 ) ) )
            // InternalMyDsl.g:1886:1: ( ( rule__Table__OperationAssignment_2 ) )
            {
            // InternalMyDsl.g:1886:1: ( ( rule__Table__OperationAssignment_2 ) )
            // InternalMyDsl.g:1887:2: ( rule__Table__OperationAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getOperationAssignment_2()); 
            // InternalMyDsl.g:1888:2: ( rule__Table__OperationAssignment_2 )
            // InternalMyDsl.g:1888:3: rule__Table__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__OperationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getOperationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalMyDsl.g:1896:1: rule__Table__Group__3 : rule__Table__Group__3__Impl ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( rule__Table__Group__3__Impl )
            // InternalMyDsl.g:1901:2: rule__Table__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__3__Impl();

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
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalMyDsl.g:1907:1: rule__Table__Group__3__Impl : ( ';' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( ( ';' ) )
            // InternalMyDsl.g:1912:1: ( ';' )
            {
            // InternalMyDsl.g:1912:1: ( ';' )
            // InternalMyDsl.g:1913:2: ';'
            {
             before(grammarAccess.getTableAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__XmlType__Group__0"
    // InternalMyDsl.g:1923:1: rule__XmlType__Group__0 : rule__XmlType__Group__0__Impl rule__XmlType__Group__1 ;
    public final void rule__XmlType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( rule__XmlType__Group__0__Impl rule__XmlType__Group__1 )
            // InternalMyDsl.g:1928:2: rule__XmlType__Group__0__Impl rule__XmlType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1935:1: rule__XmlType__Group__0__Impl : ( () ) ;
    public final void rule__XmlType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( ( () ) )
            // InternalMyDsl.g:1940:1: ( () )
            {
            // InternalMyDsl.g:1940:1: ( () )
            // InternalMyDsl.g:1941:2: ()
            {
             before(grammarAccess.getXmlTypeAccess().getXmlTypeAction_0()); 
            // InternalMyDsl.g:1942:2: ()
            // InternalMyDsl.g:1942:3: 
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
    // InternalMyDsl.g:1950:1: rule__XmlType__Group__1 : rule__XmlType__Group__1__Impl rule__XmlType__Group__2 ;
    public final void rule__XmlType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( rule__XmlType__Group__1__Impl rule__XmlType__Group__2 )
            // InternalMyDsl.g:1955:2: rule__XmlType__Group__1__Impl rule__XmlType__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1962:1: rule__XmlType__Group__1__Impl : ( 'xml' ) ;
    public final void rule__XmlType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1966:1: ( ( 'xml' ) )
            // InternalMyDsl.g:1967:1: ( 'xml' )
            {
            // InternalMyDsl.g:1967:1: ( 'xml' )
            // InternalMyDsl.g:1968:2: 'xml'
            {
             before(grammarAccess.getXmlTypeAccess().getXmlKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1977:1: rule__XmlType__Group__2 : rule__XmlType__Group__2__Impl ;
    public final void rule__XmlType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( rule__XmlType__Group__2__Impl )
            // InternalMyDsl.g:1982:2: rule__XmlType__Group__2__Impl
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
    // InternalMyDsl.g:1988:1: rule__XmlType__Group__2__Impl : ( ( rule__XmlType__Group_2__0 )? ) ;
    public final void rule__XmlType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1992:1: ( ( ( rule__XmlType__Group_2__0 )? ) )
            // InternalMyDsl.g:1993:1: ( ( rule__XmlType__Group_2__0 )? )
            {
            // InternalMyDsl.g:1993:1: ( ( rule__XmlType__Group_2__0 )? )
            // InternalMyDsl.g:1994:2: ( rule__XmlType__Group_2__0 )?
            {
             before(grammarAccess.getXmlTypeAccess().getGroup_2()); 
            // InternalMyDsl.g:1995:2: ( rule__XmlType__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1995:3: rule__XmlType__Group_2__0
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
    // InternalMyDsl.g:2004:1: rule__XmlType__Group_2__0 : rule__XmlType__Group_2__0__Impl rule__XmlType__Group_2__1 ;
    public final void rule__XmlType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( rule__XmlType__Group_2__0__Impl rule__XmlType__Group_2__1 )
            // InternalMyDsl.g:2009:2: rule__XmlType__Group_2__0__Impl rule__XmlType__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2016:1: rule__XmlType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__XmlType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( ( '{' ) )
            // InternalMyDsl.g:2021:1: ( '{' )
            {
            // InternalMyDsl.g:2021:1: ( '{' )
            // InternalMyDsl.g:2022:2: '{'
            {
             before(grammarAccess.getXmlTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2031:1: rule__XmlType__Group_2__1 : rule__XmlType__Group_2__1__Impl rule__XmlType__Group_2__2 ;
    public final void rule__XmlType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( rule__XmlType__Group_2__1__Impl rule__XmlType__Group_2__2 )
            // InternalMyDsl.g:2036:2: rule__XmlType__Group_2__1__Impl rule__XmlType__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2043:1: rule__XmlType__Group_2__1__Impl : ( 'xpath' ) ;
    public final void rule__XmlType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( ( 'xpath' ) )
            // InternalMyDsl.g:2048:1: ( 'xpath' )
            {
            // InternalMyDsl.g:2048:1: ( 'xpath' )
            // InternalMyDsl.g:2049:2: 'xpath'
            {
             before(grammarAccess.getXmlTypeAccess().getXpathKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2058:1: rule__XmlType__Group_2__2 : rule__XmlType__Group_2__2__Impl rule__XmlType__Group_2__3 ;
    public final void rule__XmlType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( rule__XmlType__Group_2__2__Impl rule__XmlType__Group_2__3 )
            // InternalMyDsl.g:2063:2: rule__XmlType__Group_2__2__Impl rule__XmlType__Group_2__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2070:1: rule__XmlType__Group_2__2__Impl : ( '=' ) ;
    public final void rule__XmlType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( ( '=' ) )
            // InternalMyDsl.g:2075:1: ( '=' )
            {
            // InternalMyDsl.g:2075:1: ( '=' )
            // InternalMyDsl.g:2076:2: '='
            {
             before(grammarAccess.getXmlTypeAccess().getEqualsSignKeyword_2_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:2085:1: rule__XmlType__Group_2__3 : rule__XmlType__Group_2__3__Impl rule__XmlType__Group_2__4 ;
    public final void rule__XmlType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( rule__XmlType__Group_2__3__Impl rule__XmlType__Group_2__4 )
            // InternalMyDsl.g:2090:2: rule__XmlType__Group_2__3__Impl rule__XmlType__Group_2__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2097:1: rule__XmlType__Group_2__3__Impl : ( ( rule__XmlType__PathAssignment_2_3 ) ) ;
    public final void rule__XmlType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( ( rule__XmlType__PathAssignment_2_3 ) ) )
            // InternalMyDsl.g:2102:1: ( ( rule__XmlType__PathAssignment_2_3 ) )
            {
            // InternalMyDsl.g:2102:1: ( ( rule__XmlType__PathAssignment_2_3 ) )
            // InternalMyDsl.g:2103:2: ( rule__XmlType__PathAssignment_2_3 )
            {
             before(grammarAccess.getXmlTypeAccess().getPathAssignment_2_3()); 
            // InternalMyDsl.g:2104:2: ( rule__XmlType__PathAssignment_2_3 )
            // InternalMyDsl.g:2104:3: rule__XmlType__PathAssignment_2_3
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
    // InternalMyDsl.g:2112:1: rule__XmlType__Group_2__4 : rule__XmlType__Group_2__4__Impl rule__XmlType__Group_2__5 ;
    public final void rule__XmlType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( rule__XmlType__Group_2__4__Impl rule__XmlType__Group_2__5 )
            // InternalMyDsl.g:2117:2: rule__XmlType__Group_2__4__Impl rule__XmlType__Group_2__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2124:1: rule__XmlType__Group_2__4__Impl : ( ',' ) ;
    public final void rule__XmlType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2128:1: ( ( ',' ) )
            // InternalMyDsl.g:2129:1: ( ',' )
            {
            // InternalMyDsl.g:2129:1: ( ',' )
            // InternalMyDsl.g:2130:2: ','
            {
             before(grammarAccess.getXmlTypeAccess().getCommaKeyword_2_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2139:1: rule__XmlType__Group_2__5 : rule__XmlType__Group_2__5__Impl ;
    public final void rule__XmlType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( rule__XmlType__Group_2__5__Impl )
            // InternalMyDsl.g:2144:2: rule__XmlType__Group_2__5__Impl
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
    // InternalMyDsl.g:2150:1: rule__XmlType__Group_2__5__Impl : ( '}' ) ;
    public final void rule__XmlType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2154:1: ( ( '}' ) )
            // InternalMyDsl.g:2155:1: ( '}' )
            {
            // InternalMyDsl.g:2155:1: ( '}' )
            // InternalMyDsl.g:2156:2: '}'
            {
             before(grammarAccess.getXmlTypeAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2166:1: rule__JsonType__Group__0 : rule__JsonType__Group__0__Impl rule__JsonType__Group__1 ;
    public final void rule__JsonType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( rule__JsonType__Group__0__Impl rule__JsonType__Group__1 )
            // InternalMyDsl.g:2171:2: rule__JsonType__Group__0__Impl rule__JsonType__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2178:1: rule__JsonType__Group__0__Impl : ( () ) ;
    public final void rule__JsonType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( ( () ) )
            // InternalMyDsl.g:2183:1: ( () )
            {
            // InternalMyDsl.g:2183:1: ( () )
            // InternalMyDsl.g:2184:2: ()
            {
             before(grammarAccess.getJsonTypeAccess().getJsonTypeAction_0()); 
            // InternalMyDsl.g:2185:2: ()
            // InternalMyDsl.g:2185:3: 
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
    // InternalMyDsl.g:2193:1: rule__JsonType__Group__1 : rule__JsonType__Group__1__Impl rule__JsonType__Group__2 ;
    public final void rule__JsonType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( rule__JsonType__Group__1__Impl rule__JsonType__Group__2 )
            // InternalMyDsl.g:2198:2: rule__JsonType__Group__1__Impl rule__JsonType__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2205:1: rule__JsonType__Group__1__Impl : ( 'json' ) ;
    public final void rule__JsonType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2209:1: ( ( 'json' ) )
            // InternalMyDsl.g:2210:1: ( 'json' )
            {
            // InternalMyDsl.g:2210:1: ( 'json' )
            // InternalMyDsl.g:2211:2: 'json'
            {
             before(grammarAccess.getJsonTypeAccess().getJsonKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2220:1: rule__JsonType__Group__2 : rule__JsonType__Group__2__Impl ;
    public final void rule__JsonType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( rule__JsonType__Group__2__Impl )
            // InternalMyDsl.g:2225:2: rule__JsonType__Group__2__Impl
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
    // InternalMyDsl.g:2231:1: rule__JsonType__Group__2__Impl : ( ( rule__JsonType__Group_2__0 )? ) ;
    public final void rule__JsonType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( ( ( rule__JsonType__Group_2__0 )? ) )
            // InternalMyDsl.g:2236:1: ( ( rule__JsonType__Group_2__0 )? )
            {
            // InternalMyDsl.g:2236:1: ( ( rule__JsonType__Group_2__0 )? )
            // InternalMyDsl.g:2237:2: ( rule__JsonType__Group_2__0 )?
            {
             before(grammarAccess.getJsonTypeAccess().getGroup_2()); 
            // InternalMyDsl.g:2238:2: ( rule__JsonType__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2238:3: rule__JsonType__Group_2__0
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
    // InternalMyDsl.g:2247:1: rule__JsonType__Group_2__0 : rule__JsonType__Group_2__0__Impl rule__JsonType__Group_2__1 ;
    public final void rule__JsonType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( rule__JsonType__Group_2__0__Impl rule__JsonType__Group_2__1 )
            // InternalMyDsl.g:2252:2: rule__JsonType__Group_2__0__Impl rule__JsonType__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2259:1: rule__JsonType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__JsonType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( ( '{' ) )
            // InternalMyDsl.g:2264:1: ( '{' )
            {
            // InternalMyDsl.g:2264:1: ( '{' )
            // InternalMyDsl.g:2265:2: '{'
            {
             before(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2274:1: rule__JsonType__Group_2__1 : rule__JsonType__Group_2__1__Impl rule__JsonType__Group_2__2 ;
    public final void rule__JsonType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( rule__JsonType__Group_2__1__Impl rule__JsonType__Group_2__2 )
            // InternalMyDsl.g:2279:2: rule__JsonType__Group_2__1__Impl rule__JsonType__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2286:1: rule__JsonType__Group_2__1__Impl : ( 'jsonpath' ) ;
    public final void rule__JsonType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( ( 'jsonpath' ) )
            // InternalMyDsl.g:2291:1: ( 'jsonpath' )
            {
            // InternalMyDsl.g:2291:1: ( 'jsonpath' )
            // InternalMyDsl.g:2292:2: 'jsonpath'
            {
             before(grammarAccess.getJsonTypeAccess().getJsonpathKeyword_2_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2301:1: rule__JsonType__Group_2__2 : rule__JsonType__Group_2__2__Impl rule__JsonType__Group_2__3 ;
    public final void rule__JsonType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( rule__JsonType__Group_2__2__Impl rule__JsonType__Group_2__3 )
            // InternalMyDsl.g:2306:2: rule__JsonType__Group_2__2__Impl rule__JsonType__Group_2__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2313:1: rule__JsonType__Group_2__2__Impl : ( '=' ) ;
    public final void rule__JsonType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( ( '=' ) )
            // InternalMyDsl.g:2318:1: ( '=' )
            {
            // InternalMyDsl.g:2318:1: ( '=' )
            // InternalMyDsl.g:2319:2: '='
            {
             before(grammarAccess.getJsonTypeAccess().getEqualsSignKeyword_2_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:2328:1: rule__JsonType__Group_2__3 : rule__JsonType__Group_2__3__Impl rule__JsonType__Group_2__4 ;
    public final void rule__JsonType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( rule__JsonType__Group_2__3__Impl rule__JsonType__Group_2__4 )
            // InternalMyDsl.g:2333:2: rule__JsonType__Group_2__3__Impl rule__JsonType__Group_2__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2340:1: rule__JsonType__Group_2__3__Impl : ( ( rule__JsonType__PathAssignment_2_3 ) ) ;
    public final void rule__JsonType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( ( ( rule__JsonType__PathAssignment_2_3 ) ) )
            // InternalMyDsl.g:2345:1: ( ( rule__JsonType__PathAssignment_2_3 ) )
            {
            // InternalMyDsl.g:2345:1: ( ( rule__JsonType__PathAssignment_2_3 ) )
            // InternalMyDsl.g:2346:2: ( rule__JsonType__PathAssignment_2_3 )
            {
             before(grammarAccess.getJsonTypeAccess().getPathAssignment_2_3()); 
            // InternalMyDsl.g:2347:2: ( rule__JsonType__PathAssignment_2_3 )
            // InternalMyDsl.g:2347:3: rule__JsonType__PathAssignment_2_3
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
    // InternalMyDsl.g:2355:1: rule__JsonType__Group_2__4 : rule__JsonType__Group_2__4__Impl rule__JsonType__Group_2__5 ;
    public final void rule__JsonType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( rule__JsonType__Group_2__4__Impl rule__JsonType__Group_2__5 )
            // InternalMyDsl.g:2360:2: rule__JsonType__Group_2__4__Impl rule__JsonType__Group_2__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2367:1: rule__JsonType__Group_2__4__Impl : ( ',' ) ;
    public final void rule__JsonType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2371:1: ( ( ',' ) )
            // InternalMyDsl.g:2372:1: ( ',' )
            {
            // InternalMyDsl.g:2372:1: ( ',' )
            // InternalMyDsl.g:2373:2: ','
            {
             before(grammarAccess.getJsonTypeAccess().getCommaKeyword_2_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2382:1: rule__JsonType__Group_2__5 : rule__JsonType__Group_2__5__Impl ;
    public final void rule__JsonType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( rule__JsonType__Group_2__5__Impl )
            // InternalMyDsl.g:2387:2: rule__JsonType__Group_2__5__Impl
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
    // InternalMyDsl.g:2393:1: rule__JsonType__Group_2__5__Impl : ( '}' ) ;
    public final void rule__JsonType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( ( '}' ) )
            // InternalMyDsl.g:2398:1: ( '}' )
            {
            // InternalMyDsl.g:2398:1: ( '}' )
            // InternalMyDsl.g:2399:2: '}'
            {
             before(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2409:1: rule__YamlType__Group__0 : rule__YamlType__Group__0__Impl rule__YamlType__Group__1 ;
    public final void rule__YamlType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( rule__YamlType__Group__0__Impl rule__YamlType__Group__1 )
            // InternalMyDsl.g:2414:2: rule__YamlType__Group__0__Impl rule__YamlType__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2421:1: rule__YamlType__Group__0__Impl : ( () ) ;
    public final void rule__YamlType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( ( () ) )
            // InternalMyDsl.g:2426:1: ( () )
            {
            // InternalMyDsl.g:2426:1: ( () )
            // InternalMyDsl.g:2427:2: ()
            {
             before(grammarAccess.getYamlTypeAccess().getYamlTypeAction_0()); 
            // InternalMyDsl.g:2428:2: ()
            // InternalMyDsl.g:2428:3: 
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
    // InternalMyDsl.g:2436:1: rule__YamlType__Group__1 : rule__YamlType__Group__1__Impl ;
    public final void rule__YamlType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( rule__YamlType__Group__1__Impl )
            // InternalMyDsl.g:2441:2: rule__YamlType__Group__1__Impl
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
    // InternalMyDsl.g:2447:1: rule__YamlType__Group__1__Impl : ( 'yaml' ) ;
    public final void rule__YamlType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2451:1: ( ( 'yaml' ) )
            // InternalMyDsl.g:2452:1: ( 'yaml' )
            {
            // InternalMyDsl.g:2452:1: ( 'yaml' )
            // InternalMyDsl.g:2453:2: 'yaml'
            {
             before(grammarAccess.getYamlTypeAccess().getYamlKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2463:1: rule__CsvType__Group__0 : rule__CsvType__Group__0__Impl rule__CsvType__Group__1 ;
    public final void rule__CsvType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( rule__CsvType__Group__0__Impl rule__CsvType__Group__1 )
            // InternalMyDsl.g:2468:2: rule__CsvType__Group__0__Impl rule__CsvType__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2475:1: rule__CsvType__Group__0__Impl : ( () ) ;
    public final void rule__CsvType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( ( () ) )
            // InternalMyDsl.g:2480:1: ( () )
            {
            // InternalMyDsl.g:2480:1: ( () )
            // InternalMyDsl.g:2481:2: ()
            {
             before(grammarAccess.getCsvTypeAccess().getCsvTypeAction_0()); 
            // InternalMyDsl.g:2482:2: ()
            // InternalMyDsl.g:2482:3: 
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
    // InternalMyDsl.g:2490:1: rule__CsvType__Group__1 : rule__CsvType__Group__1__Impl ;
    public final void rule__CsvType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( rule__CsvType__Group__1__Impl )
            // InternalMyDsl.g:2495:2: rule__CsvType__Group__1__Impl
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
    // InternalMyDsl.g:2501:1: rule__CsvType__Group__1__Impl : ( 'csv' ) ;
    public final void rule__CsvType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2505:1: ( ( 'csv' ) )
            // InternalMyDsl.g:2506:1: ( 'csv' )
            {
            // InternalMyDsl.g:2506:1: ( 'csv' )
            // InternalMyDsl.g:2507:2: 'csv'
            {
             before(grammarAccess.getCsvTypeAccess().getCsvKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2517:1: rule__AutoType__Group__0 : rule__AutoType__Group__0__Impl rule__AutoType__Group__1 ;
    public final void rule__AutoType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( rule__AutoType__Group__0__Impl rule__AutoType__Group__1 )
            // InternalMyDsl.g:2522:2: rule__AutoType__Group__0__Impl rule__AutoType__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2529:1: rule__AutoType__Group__0__Impl : ( () ) ;
    public final void rule__AutoType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( ( () ) )
            // InternalMyDsl.g:2534:1: ( () )
            {
            // InternalMyDsl.g:2534:1: ( () )
            // InternalMyDsl.g:2535:2: ()
            {
             before(grammarAccess.getAutoTypeAccess().getAutoTypeAction_0()); 
            // InternalMyDsl.g:2536:2: ()
            // InternalMyDsl.g:2536:3: 
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
    // InternalMyDsl.g:2544:1: rule__AutoType__Group__1 : rule__AutoType__Group__1__Impl ;
    public final void rule__AutoType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( rule__AutoType__Group__1__Impl )
            // InternalMyDsl.g:2549:2: rule__AutoType__Group__1__Impl
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
    // InternalMyDsl.g:2555:1: rule__AutoType__Group__1__Impl : ( 'auto' ) ;
    public final void rule__AutoType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2559:1: ( ( 'auto' ) )
            // InternalMyDsl.g:2560:1: ( 'auto' )
            {
            // InternalMyDsl.g:2560:1: ( 'auto' )
            // InternalMyDsl.g:2561:2: 'auto'
            {
             before(grammarAccess.getAutoTypeAccess().getAutoKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2571:1: rule__HtmlType__Group__0 : rule__HtmlType__Group__0__Impl rule__HtmlType__Group__1 ;
    public final void rule__HtmlType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( rule__HtmlType__Group__0__Impl rule__HtmlType__Group__1 )
            // InternalMyDsl.g:2576:2: rule__HtmlType__Group__0__Impl rule__HtmlType__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2583:1: rule__HtmlType__Group__0__Impl : ( () ) ;
    public final void rule__HtmlType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( ( () ) )
            // InternalMyDsl.g:2588:1: ( () )
            {
            // InternalMyDsl.g:2588:1: ( () )
            // InternalMyDsl.g:2589:2: ()
            {
             before(grammarAccess.getHtmlTypeAccess().getHtmlTypeAction_0()); 
            // InternalMyDsl.g:2590:2: ()
            // InternalMyDsl.g:2590:3: 
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
    // InternalMyDsl.g:2598:1: rule__HtmlType__Group__1 : rule__HtmlType__Group__1__Impl rule__HtmlType__Group__2 ;
    public final void rule__HtmlType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( rule__HtmlType__Group__1__Impl rule__HtmlType__Group__2 )
            // InternalMyDsl.g:2603:2: rule__HtmlType__Group__1__Impl rule__HtmlType__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2610:1: rule__HtmlType__Group__1__Impl : ( 'html' ) ;
    public final void rule__HtmlType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( ( 'html' ) )
            // InternalMyDsl.g:2615:1: ( 'html' )
            {
            // InternalMyDsl.g:2615:1: ( 'html' )
            // InternalMyDsl.g:2616:2: 'html'
            {
             before(grammarAccess.getHtmlTypeAccess().getHtmlKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2625:1: rule__HtmlType__Group__2 : rule__HtmlType__Group__2__Impl ;
    public final void rule__HtmlType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( rule__HtmlType__Group__2__Impl )
            // InternalMyDsl.g:2630:2: rule__HtmlType__Group__2__Impl
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
    // InternalMyDsl.g:2636:1: rule__HtmlType__Group__2__Impl : ( ( rule__HtmlType__Group_2__0 )? ) ;
    public final void rule__HtmlType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2640:1: ( ( ( rule__HtmlType__Group_2__0 )? ) )
            // InternalMyDsl.g:2641:1: ( ( rule__HtmlType__Group_2__0 )? )
            {
            // InternalMyDsl.g:2641:1: ( ( rule__HtmlType__Group_2__0 )? )
            // InternalMyDsl.g:2642:2: ( rule__HtmlType__Group_2__0 )?
            {
             before(grammarAccess.getHtmlTypeAccess().getGroup_2()); 
            // InternalMyDsl.g:2643:2: ( rule__HtmlType__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2643:3: rule__HtmlType__Group_2__0
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
    // InternalMyDsl.g:2652:1: rule__HtmlType__Group_2__0 : rule__HtmlType__Group_2__0__Impl rule__HtmlType__Group_2__1 ;
    public final void rule__HtmlType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( rule__HtmlType__Group_2__0__Impl rule__HtmlType__Group_2__1 )
            // InternalMyDsl.g:2657:2: rule__HtmlType__Group_2__0__Impl rule__HtmlType__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2664:1: rule__HtmlType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__HtmlType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( '{' ) )
            // InternalMyDsl.g:2669:1: ( '{' )
            {
            // InternalMyDsl.g:2669:1: ( '{' )
            // InternalMyDsl.g:2670:2: '{'
            {
             before(grammarAccess.getHtmlTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2679:1: rule__HtmlType__Group_2__1 : rule__HtmlType__Group_2__1__Impl rule__HtmlType__Group_2__2 ;
    public final void rule__HtmlType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( rule__HtmlType__Group_2__1__Impl rule__HtmlType__Group_2__2 )
            // InternalMyDsl.g:2684:2: rule__HtmlType__Group_2__1__Impl rule__HtmlType__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2691:1: rule__HtmlType__Group_2__1__Impl : ( 'css' ) ;
    public final void rule__HtmlType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( ( 'css' ) )
            // InternalMyDsl.g:2696:1: ( 'css' )
            {
            // InternalMyDsl.g:2696:1: ( 'css' )
            // InternalMyDsl.g:2697:2: 'css'
            {
             before(grammarAccess.getHtmlTypeAccess().getCssKeyword_2_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2706:1: rule__HtmlType__Group_2__2 : rule__HtmlType__Group_2__2__Impl rule__HtmlType__Group_2__3 ;
    public final void rule__HtmlType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( rule__HtmlType__Group_2__2__Impl rule__HtmlType__Group_2__3 )
            // InternalMyDsl.g:2711:2: rule__HtmlType__Group_2__2__Impl rule__HtmlType__Group_2__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2718:1: rule__HtmlType__Group_2__2__Impl : ( '=' ) ;
    public final void rule__HtmlType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( ( '=' ) )
            // InternalMyDsl.g:2723:1: ( '=' )
            {
            // InternalMyDsl.g:2723:1: ( '=' )
            // InternalMyDsl.g:2724:2: '='
            {
             before(grammarAccess.getHtmlTypeAccess().getEqualsSignKeyword_2_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:2733:1: rule__HtmlType__Group_2__3 : rule__HtmlType__Group_2__3__Impl rule__HtmlType__Group_2__4 ;
    public final void rule__HtmlType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( rule__HtmlType__Group_2__3__Impl rule__HtmlType__Group_2__4 )
            // InternalMyDsl.g:2738:2: rule__HtmlType__Group_2__3__Impl rule__HtmlType__Group_2__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2745:1: rule__HtmlType__Group_2__3__Impl : ( ( rule__HtmlType__CssPathAssignment_2_3 ) ) ;
    public final void rule__HtmlType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( ( ( rule__HtmlType__CssPathAssignment_2_3 ) ) )
            // InternalMyDsl.g:2750:1: ( ( rule__HtmlType__CssPathAssignment_2_3 ) )
            {
            // InternalMyDsl.g:2750:1: ( ( rule__HtmlType__CssPathAssignment_2_3 ) )
            // InternalMyDsl.g:2751:2: ( rule__HtmlType__CssPathAssignment_2_3 )
            {
             before(grammarAccess.getHtmlTypeAccess().getCssPathAssignment_2_3()); 
            // InternalMyDsl.g:2752:2: ( rule__HtmlType__CssPathAssignment_2_3 )
            // InternalMyDsl.g:2752:3: rule__HtmlType__CssPathAssignment_2_3
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
    // InternalMyDsl.g:2760:1: rule__HtmlType__Group_2__4 : rule__HtmlType__Group_2__4__Impl ;
    public final void rule__HtmlType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( rule__HtmlType__Group_2__4__Impl )
            // InternalMyDsl.g:2765:2: rule__HtmlType__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HtmlType__Group_2__4__Impl();

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
    // InternalMyDsl.g:2771:1: rule__HtmlType__Group_2__4__Impl : ( '}' ) ;
    public final void rule__HtmlType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( ( '}' ) )
            // InternalMyDsl.g:2776:1: ( '}' )
            {
            // InternalMyDsl.g:2776:1: ( '}' )
            // InternalMyDsl.g:2777:2: '}'
            {
             before(grammarAccess.getHtmlTypeAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHtmlTypeAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__SourceStore__Group__0"
    // InternalMyDsl.g:2787:1: rule__SourceStore__Group__0 : rule__SourceStore__Group__0__Impl rule__SourceStore__Group__1 ;
    public final void rule__SourceStore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( rule__SourceStore__Group__0__Impl rule__SourceStore__Group__1 )
            // InternalMyDsl.g:2792:2: rule__SourceStore__Group__0__Impl rule__SourceStore__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2799:1: rule__SourceStore__Group__0__Impl : ( 'store' ) ;
    public final void rule__SourceStore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( 'store' ) )
            // InternalMyDsl.g:2804:1: ( 'store' )
            {
            // InternalMyDsl.g:2804:1: ( 'store' )
            // InternalMyDsl.g:2805:2: 'store'
            {
             before(grammarAccess.getSourceStoreAccess().getStoreKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2814:1: rule__SourceStore__Group__1 : rule__SourceStore__Group__1__Impl rule__SourceStore__Group__2 ;
    public final void rule__SourceStore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( rule__SourceStore__Group__1__Impl rule__SourceStore__Group__2 )
            // InternalMyDsl.g:2819:2: rule__SourceStore__Group__1__Impl rule__SourceStore__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2826:1: rule__SourceStore__Group__1__Impl : ( ( rule__SourceStore__MetadataAssignment_1 ) ) ;
    public final void rule__SourceStore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2830:1: ( ( ( rule__SourceStore__MetadataAssignment_1 ) ) )
            // InternalMyDsl.g:2831:1: ( ( rule__SourceStore__MetadataAssignment_1 ) )
            {
            // InternalMyDsl.g:2831:1: ( ( rule__SourceStore__MetadataAssignment_1 ) )
            // InternalMyDsl.g:2832:2: ( rule__SourceStore__MetadataAssignment_1 )
            {
             before(grammarAccess.getSourceStoreAccess().getMetadataAssignment_1()); 
            // InternalMyDsl.g:2833:2: ( rule__SourceStore__MetadataAssignment_1 )
            // InternalMyDsl.g:2833:3: rule__SourceStore__MetadataAssignment_1
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
    // InternalMyDsl.g:2841:1: rule__SourceStore__Group__2 : rule__SourceStore__Group__2__Impl rule__SourceStore__Group__3 ;
    public final void rule__SourceStore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( rule__SourceStore__Group__2__Impl rule__SourceStore__Group__3 )
            // InternalMyDsl.g:2846:2: rule__SourceStore__Group__2__Impl rule__SourceStore__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2853:1: rule__SourceStore__Group__2__Impl : ( 'in' ) ;
    public final void rule__SourceStore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( ( 'in' ) )
            // InternalMyDsl.g:2858:1: ( 'in' )
            {
            // InternalMyDsl.g:2858:1: ( 'in' )
            // InternalMyDsl.g:2859:2: 'in'
            {
             before(grammarAccess.getSourceStoreAccess().getInKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2868:1: rule__SourceStore__Group__3 : rule__SourceStore__Group__3__Impl ;
    public final void rule__SourceStore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( rule__SourceStore__Group__3__Impl )
            // InternalMyDsl.g:2873:2: rule__SourceStore__Group__3__Impl
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
    // InternalMyDsl.g:2879:1: rule__SourceStore__Group__3__Impl : ( ( rule__SourceStore__ColumnAssignment_3 ) ) ;
    public final void rule__SourceStore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( ( ( rule__SourceStore__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:2884:1: ( ( rule__SourceStore__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:2884:1: ( ( rule__SourceStore__ColumnAssignment_3 ) )
            // InternalMyDsl.g:2885:2: ( rule__SourceStore__ColumnAssignment_3 )
            {
             before(grammarAccess.getSourceStoreAccess().getColumnAssignment_3()); 
            // InternalMyDsl.g:2886:2: ( rule__SourceStore__ColumnAssignment_3 )
            // InternalMyDsl.g:2886:3: rule__SourceStore__ColumnAssignment_3
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
    // InternalMyDsl.g:2895:1: rule__SourceCoumnSelect__Group__0 : rule__SourceCoumnSelect__Group__0__Impl rule__SourceCoumnSelect__Group__1 ;
    public final void rule__SourceCoumnSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( rule__SourceCoumnSelect__Group__0__Impl rule__SourceCoumnSelect__Group__1 )
            // InternalMyDsl.g:2900:2: rule__SourceCoumnSelect__Group__0__Impl rule__SourceCoumnSelect__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:2907:1: rule__SourceCoumnSelect__Group__0__Impl : ( 'selecting' ) ;
    public final void rule__SourceCoumnSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2911:1: ( ( 'selecting' ) )
            // InternalMyDsl.g:2912:1: ( 'selecting' )
            {
            // InternalMyDsl.g:2912:1: ( 'selecting' )
            // InternalMyDsl.g:2913:2: 'selecting'
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getSelectingKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSourceCoumnSelectAccess().getSelectingKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:2922:1: rule__SourceCoumnSelect__Group__1 : rule__SourceCoumnSelect__Group__1__Impl rule__SourceCoumnSelect__Group__2 ;
    public final void rule__SourceCoumnSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( rule__SourceCoumnSelect__Group__1__Impl rule__SourceCoumnSelect__Group__2 )
            // InternalMyDsl.g:2927:2: rule__SourceCoumnSelect__Group__1__Impl rule__SourceCoumnSelect__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2934:1: rule__SourceCoumnSelect__Group__1__Impl : ( '[' ) ;
    public final void rule__SourceCoumnSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2938:1: ( ( '[' ) )
            // InternalMyDsl.g:2939:1: ( '[' )
            {
            // InternalMyDsl.g:2939:1: ( '[' )
            // InternalMyDsl.g:2940:2: '['
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:2949:1: rule__SourceCoumnSelect__Group__2 : rule__SourceCoumnSelect__Group__2__Impl rule__SourceCoumnSelect__Group__3 ;
    public final void rule__SourceCoumnSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( rule__SourceCoumnSelect__Group__2__Impl rule__SourceCoumnSelect__Group__3 )
            // InternalMyDsl.g:2954:2: rule__SourceCoumnSelect__Group__2__Impl rule__SourceCoumnSelect__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2961:1: rule__SourceCoumnSelect__Group__2__Impl : ( ( rule__SourceCoumnSelect__ColumnAssignment_2 ) ) ;
    public final void rule__SourceCoumnSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( ( rule__SourceCoumnSelect__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:2966:1: ( ( rule__SourceCoumnSelect__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:2966:1: ( ( rule__SourceCoumnSelect__ColumnAssignment_2 ) )
            // InternalMyDsl.g:2967:2: ( rule__SourceCoumnSelect__ColumnAssignment_2 )
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:2968:2: ( rule__SourceCoumnSelect__ColumnAssignment_2 )
            // InternalMyDsl.g:2968:3: rule__SourceCoumnSelect__ColumnAssignment_2
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
    // InternalMyDsl.g:2976:1: rule__SourceCoumnSelect__Group__3 : rule__SourceCoumnSelect__Group__3__Impl rule__SourceCoumnSelect__Group__4 ;
    public final void rule__SourceCoumnSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( rule__SourceCoumnSelect__Group__3__Impl rule__SourceCoumnSelect__Group__4 )
            // InternalMyDsl.g:2981:2: rule__SourceCoumnSelect__Group__3__Impl rule__SourceCoumnSelect__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2988:1: rule__SourceCoumnSelect__Group__3__Impl : ( ( rule__SourceCoumnSelect__Group_3__0 )* ) ;
    public final void rule__SourceCoumnSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2992:1: ( ( ( rule__SourceCoumnSelect__Group_3__0 )* ) )
            // InternalMyDsl.g:2993:1: ( ( rule__SourceCoumnSelect__Group_3__0 )* )
            {
            // InternalMyDsl.g:2993:1: ( ( rule__SourceCoumnSelect__Group_3__0 )* )
            // InternalMyDsl.g:2994:2: ( rule__SourceCoumnSelect__Group_3__0 )*
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getGroup_3()); 
            // InternalMyDsl.g:2995:2: ( rule__SourceCoumnSelect__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_STRING) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2995:3: rule__SourceCoumnSelect__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SourceCoumnSelect__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:3003:1: rule__SourceCoumnSelect__Group__4 : rule__SourceCoumnSelect__Group__4__Impl rule__SourceCoumnSelect__Group__5 ;
    public final void rule__SourceCoumnSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( rule__SourceCoumnSelect__Group__4__Impl rule__SourceCoumnSelect__Group__5 )
            // InternalMyDsl.g:3008:2: rule__SourceCoumnSelect__Group__4__Impl rule__SourceCoumnSelect__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:3015:1: rule__SourceCoumnSelect__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__SourceCoumnSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3019:1: ( ( ( ',' )? ) )
            // InternalMyDsl.g:3020:1: ( ( ',' )? )
            {
            // InternalMyDsl.g:3020:1: ( ( ',' )? )
            // InternalMyDsl.g:3021:2: ( ',' )?
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_4()); 
            // InternalMyDsl.g:3022:2: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3022:3: ','
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:3030:1: rule__SourceCoumnSelect__Group__5 : rule__SourceCoumnSelect__Group__5__Impl ;
    public final void rule__SourceCoumnSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3034:1: ( rule__SourceCoumnSelect__Group__5__Impl )
            // InternalMyDsl.g:3035:2: rule__SourceCoumnSelect__Group__5__Impl
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
    // InternalMyDsl.g:3041:1: rule__SourceCoumnSelect__Group__5__Impl : ( ']' ) ;
    public final void rule__SourceCoumnSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( ( ']' ) )
            // InternalMyDsl.g:3046:1: ( ']' )
            {
            // InternalMyDsl.g:3046:1: ( ']' )
            // InternalMyDsl.g:3047:2: ']'
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getRightSquareBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:3057:1: rule__SourceCoumnSelect__Group_3__0 : rule__SourceCoumnSelect__Group_3__0__Impl rule__SourceCoumnSelect__Group_3__1 ;
    public final void rule__SourceCoumnSelect__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( rule__SourceCoumnSelect__Group_3__0__Impl rule__SourceCoumnSelect__Group_3__1 )
            // InternalMyDsl.g:3062:2: rule__SourceCoumnSelect__Group_3__0__Impl rule__SourceCoumnSelect__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3069:1: rule__SourceCoumnSelect__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SourceCoumnSelect__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( ( ',' ) )
            // InternalMyDsl.g:3074:1: ( ',' )
            {
            // InternalMyDsl.g:3074:1: ( ',' )
            // InternalMyDsl.g:3075:2: ','
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:3084:1: rule__SourceCoumnSelect__Group_3__1 : rule__SourceCoumnSelect__Group_3__1__Impl ;
    public final void rule__SourceCoumnSelect__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( rule__SourceCoumnSelect__Group_3__1__Impl )
            // InternalMyDsl.g:3089:2: rule__SourceCoumnSelect__Group_3__1__Impl
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
    // InternalMyDsl.g:3095:1: rule__SourceCoumnSelect__Group_3__1__Impl : ( ( rule__SourceCoumnSelect__ColumnAssignment_3_1 ) ) ;
    public final void rule__SourceCoumnSelect__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3099:1: ( ( ( rule__SourceCoumnSelect__ColumnAssignment_3_1 ) ) )
            // InternalMyDsl.g:3100:1: ( ( rule__SourceCoumnSelect__ColumnAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3100:1: ( ( rule__SourceCoumnSelect__ColumnAssignment_3_1 ) )
            // InternalMyDsl.g:3101:2: ( rule__SourceCoumnSelect__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_3_1()); 
            // InternalMyDsl.g:3102:2: ( rule__SourceCoumnSelect__ColumnAssignment_3_1 )
            // InternalMyDsl.g:3102:3: rule__SourceCoumnSelect__ColumnAssignment_3_1
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
    // InternalMyDsl.g:3111:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalMyDsl.g:3116:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3123:1: rule__Source__Group__0__Impl : ( ( rule__Source__NameAssignment_0 ) ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( ( ( rule__Source__NameAssignment_0 ) ) )
            // InternalMyDsl.g:3128:1: ( ( rule__Source__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:3128:1: ( ( rule__Source__NameAssignment_0 ) )
            // InternalMyDsl.g:3129:2: ( rule__Source__NameAssignment_0 )
            {
             before(grammarAccess.getSourceAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:3130:2: ( rule__Source__NameAssignment_0 )
            // InternalMyDsl.g:3130:3: rule__Source__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Source__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3138:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // InternalMyDsl.g:3143:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3150:1: rule__Source__Group__1__Impl : ( '=' ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( ( '=' ) )
            // InternalMyDsl.g:3155:1: ( '=' )
            {
            // InternalMyDsl.g:3155:1: ( '=' )
            // InternalMyDsl.g:3156:2: '='
            {
             before(grammarAccess.getSourceAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3165:1: rule__Source__Group__2 : rule__Source__Group__2__Impl rule__Source__Group__3 ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( rule__Source__Group__2__Impl rule__Source__Group__3 )
            // InternalMyDsl.g:3170:2: rule__Source__Group__2__Impl rule__Source__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3177:1: rule__Source__Group__2__Impl : ( 'import' ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( ( 'import' ) )
            // InternalMyDsl.g:3182:1: ( 'import' )
            {
            // InternalMyDsl.g:3182:1: ( 'import' )
            // InternalMyDsl.g:3183:2: 'import'
            {
             before(grammarAccess.getSourceAccess().getImportKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getImportKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:3192:1: rule__Source__Group__3 : rule__Source__Group__3__Impl rule__Source__Group__4 ;
    public final void rule__Source__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3196:1: ( rule__Source__Group__3__Impl rule__Source__Group__4 )
            // InternalMyDsl.g:3197:2: rule__Source__Group__3__Impl rule__Source__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3204:1: rule__Source__Group__3__Impl : ( ( rule__Source__QueryAssignment_3 )? ) ;
    public final void rule__Source__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3208:1: ( ( ( rule__Source__QueryAssignment_3 )? ) )
            // InternalMyDsl.g:3209:1: ( ( rule__Source__QueryAssignment_3 )? )
            {
            // InternalMyDsl.g:3209:1: ( ( rule__Source__QueryAssignment_3 )? )
            // InternalMyDsl.g:3210:2: ( rule__Source__QueryAssignment_3 )?
            {
             before(grammarAccess.getSourceAccess().getQueryAssignment_3()); 
            // InternalMyDsl.g:3211:2: ( rule__Source__QueryAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3211:3: rule__Source__QueryAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__QueryAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getQueryAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:3219:1: rule__Source__Group__4 : rule__Source__Group__4__Impl rule__Source__Group__5 ;
    public final void rule__Source__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( rule__Source__Group__4__Impl rule__Source__Group__5 )
            // InternalMyDsl.g:3224:2: rule__Source__Group__4__Impl rule__Source__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3231:1: rule__Source__Group__4__Impl : ( 'from' ) ;
    public final void rule__Source__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3235:1: ( ( 'from' ) )
            // InternalMyDsl.g:3236:1: ( 'from' )
            {
            // InternalMyDsl.g:3236:1: ( 'from' )
            // InternalMyDsl.g:3237:2: 'from'
            {
             before(grammarAccess.getSourceAccess().getFromKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getFromKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3246:1: rule__Source__Group__5 : rule__Source__Group__5__Impl rule__Source__Group__6 ;
    public final void rule__Source__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3250:1: ( rule__Source__Group__5__Impl rule__Source__Group__6 )
            // InternalMyDsl.g:3251:2: rule__Source__Group__5__Impl rule__Source__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3258:1: rule__Source__Group__5__Impl : ( ( rule__Source__FilePathAssignment_5 ) ) ;
    public final void rule__Source__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( ( ( rule__Source__FilePathAssignment_5 ) ) )
            // InternalMyDsl.g:3263:1: ( ( rule__Source__FilePathAssignment_5 ) )
            {
            // InternalMyDsl.g:3263:1: ( ( rule__Source__FilePathAssignment_5 ) )
            // InternalMyDsl.g:3264:2: ( rule__Source__FilePathAssignment_5 )
            {
             before(grammarAccess.getSourceAccess().getFilePathAssignment_5()); 
            // InternalMyDsl.g:3265:2: ( rule__Source__FilePathAssignment_5 )
            // InternalMyDsl.g:3265:3: rule__Source__FilePathAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Source__FilePathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getFilePathAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3273:1: rule__Source__Group__6 : rule__Source__Group__6__Impl rule__Source__Group__7 ;
    public final void rule__Source__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( rule__Source__Group__6__Impl rule__Source__Group__7 )
            // InternalMyDsl.g:3278:2: rule__Source__Group__6__Impl rule__Source__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3285:1: rule__Source__Group__6__Impl : ( ( rule__Source__Group_6__0 )? ) ;
    public final void rule__Source__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3289:1: ( ( ( rule__Source__Group_6__0 )? ) )
            // InternalMyDsl.g:3290:1: ( ( rule__Source__Group_6__0 )? )
            {
            // InternalMyDsl.g:3290:1: ( ( rule__Source__Group_6__0 )? )
            // InternalMyDsl.g:3291:2: ( rule__Source__Group_6__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_6()); 
            // InternalMyDsl.g:3292:2: ( rule__Source__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3292:3: rule__Source__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:3300:1: rule__Source__Group__7 : rule__Source__Group__7__Impl rule__Source__Group__8 ;
    public final void rule__Source__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( rule__Source__Group__7__Impl rule__Source__Group__8 )
            // InternalMyDsl.g:3305:2: rule__Source__Group__7__Impl rule__Source__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__Source__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__8();

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
    // InternalMyDsl.g:3312:1: rule__Source__Group__7__Impl : ( ( rule__Source__StoreAssignment_7 )* ) ;
    public final void rule__Source__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( ( ( rule__Source__StoreAssignment_7 )* ) )
            // InternalMyDsl.g:3317:1: ( ( rule__Source__StoreAssignment_7 )* )
            {
            // InternalMyDsl.g:3317:1: ( ( rule__Source__StoreAssignment_7 )* )
            // InternalMyDsl.g:3318:2: ( rule__Source__StoreAssignment_7 )*
            {
             before(grammarAccess.getSourceAccess().getStoreAssignment_7()); 
            // InternalMyDsl.g:3319:2: ( rule__Source__StoreAssignment_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:3319:3: rule__Source__StoreAssignment_7
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Source__StoreAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getStoreAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Source__Group__8"
    // InternalMyDsl.g:3327:1: rule__Source__Group__8 : rule__Source__Group__8__Impl rule__Source__Group__9 ;
    public final void rule__Source__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( rule__Source__Group__8__Impl rule__Source__Group__9 )
            // InternalMyDsl.g:3332:2: rule__Source__Group__8__Impl rule__Source__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__Source__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__9();

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
    // $ANTLR end "rule__Source__Group__8"


    // $ANTLR start "rule__Source__Group__8__Impl"
    // InternalMyDsl.g:3339:1: rule__Source__Group__8__Impl : ( ( rule__Source__SelectAssignment_8 )? ) ;
    public final void rule__Source__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3343:1: ( ( ( rule__Source__SelectAssignment_8 )? ) )
            // InternalMyDsl.g:3344:1: ( ( rule__Source__SelectAssignment_8 )? )
            {
            // InternalMyDsl.g:3344:1: ( ( rule__Source__SelectAssignment_8 )? )
            // InternalMyDsl.g:3345:2: ( rule__Source__SelectAssignment_8 )?
            {
             before(grammarAccess.getSourceAccess().getSelectAssignment_8()); 
            // InternalMyDsl.g:3346:2: ( rule__Source__SelectAssignment_8 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3346:3: rule__Source__SelectAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__SelectAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getSelectAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__8__Impl"


    // $ANTLR start "rule__Source__Group__9"
    // InternalMyDsl.g:3354:1: rule__Source__Group__9 : rule__Source__Group__9__Impl ;
    public final void rule__Source__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3358:1: ( rule__Source__Group__9__Impl )
            // InternalMyDsl.g:3359:2: rule__Source__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__9__Impl();

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
    // $ANTLR end "rule__Source__Group__9"


    // $ANTLR start "rule__Source__Group__9__Impl"
    // InternalMyDsl.g:3365:1: rule__Source__Group__9__Impl : ( ';' ) ;
    public final void rule__Source__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3369:1: ( ( ';' ) )
            // InternalMyDsl.g:3370:1: ( ';' )
            {
            // InternalMyDsl.g:3370:1: ( ';' )
            // InternalMyDsl.g:3371:2: ';'
            {
             before(grammarAccess.getSourceAccess().getSemicolonKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__9__Impl"


    // $ANTLR start "rule__Source__Group_6__0"
    // InternalMyDsl.g:3381:1: rule__Source__Group_6__0 : rule__Source__Group_6__0__Impl rule__Source__Group_6__1 ;
    public final void rule__Source__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( rule__Source__Group_6__0__Impl rule__Source__Group_6__1 )
            // InternalMyDsl.g:3386:2: rule__Source__Group_6__0__Impl rule__Source__Group_6__1
            {
            pushFollow(FOLLOW_37);
            rule__Source__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_6__1();

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
    // $ANTLR end "rule__Source__Group_6__0"


    // $ANTLR start "rule__Source__Group_6__0__Impl"
    // InternalMyDsl.g:3393:1: rule__Source__Group_6__0__Impl : ( 'as' ) ;
    public final void rule__Source__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3397:1: ( ( 'as' ) )
            // InternalMyDsl.g:3398:1: ( 'as' )
            {
            // InternalMyDsl.g:3398:1: ( 'as' )
            // InternalMyDsl.g:3399:2: 'as'
            {
             before(grammarAccess.getSourceAccess().getAsKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getAsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6__0__Impl"


    // $ANTLR start "rule__Source__Group_6__1"
    // InternalMyDsl.g:3408:1: rule__Source__Group_6__1 : rule__Source__Group_6__1__Impl ;
    public final void rule__Source__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( rule__Source__Group_6__1__Impl )
            // InternalMyDsl.g:3413:2: rule__Source__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_6__1__Impl();

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
    // $ANTLR end "rule__Source__Group_6__1"


    // $ANTLR start "rule__Source__Group_6__1__Impl"
    // InternalMyDsl.g:3419:1: rule__Source__Group_6__1__Impl : ( ( rule__Source__InputTypeAssignment_6_1 ) ) ;
    public final void rule__Source__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3423:1: ( ( ( rule__Source__InputTypeAssignment_6_1 ) ) )
            // InternalMyDsl.g:3424:1: ( ( rule__Source__InputTypeAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3424:1: ( ( rule__Source__InputTypeAssignment_6_1 ) )
            // InternalMyDsl.g:3425:2: ( rule__Source__InputTypeAssignment_6_1 )
            {
             before(grammarAccess.getSourceAccess().getInputTypeAssignment_6_1()); 
            // InternalMyDsl.g:3426:2: ( rule__Source__InputTypeAssignment_6_1 )
            // InternalMyDsl.g:3426:3: rule__Source__InputTypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__InputTypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getInputTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6__1__Impl"


    // $ANTLR start "rule__CanonicalizePathTransformation__Group__0"
    // InternalMyDsl.g:3435:1: rule__CanonicalizePathTransformation__Group__0 : rule__CanonicalizePathTransformation__Group__0__Impl rule__CanonicalizePathTransformation__Group__1 ;
    public final void rule__CanonicalizePathTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3439:1: ( rule__CanonicalizePathTransformation__Group__0__Impl rule__CanonicalizePathTransformation__Group__1 )
            // InternalMyDsl.g:3440:2: rule__CanonicalizePathTransformation__Group__0__Impl rule__CanonicalizePathTransformation__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3447:1: rule__CanonicalizePathTransformation__Group__0__Impl : ( () ) ;
    public final void rule__CanonicalizePathTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3451:1: ( ( () ) )
            // InternalMyDsl.g:3452:1: ( () )
            {
            // InternalMyDsl.g:3452:1: ( () )
            // InternalMyDsl.g:3453:2: ()
            {
             before(grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizePathTransformationAction_0()); 
            // InternalMyDsl.g:3454:2: ()
            // InternalMyDsl.g:3454:3: 
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
    // InternalMyDsl.g:3462:1: rule__CanonicalizePathTransformation__Group__1 : rule__CanonicalizePathTransformation__Group__1__Impl rule__CanonicalizePathTransformation__Group__2 ;
    public final void rule__CanonicalizePathTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3466:1: ( rule__CanonicalizePathTransformation__Group__1__Impl rule__CanonicalizePathTransformation__Group__2 )
            // InternalMyDsl.g:3467:2: rule__CanonicalizePathTransformation__Group__1__Impl rule__CanonicalizePathTransformation__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3474:1: rule__CanonicalizePathTransformation__Group__1__Impl : ( 'canonicalize' ) ;
    public final void rule__CanonicalizePathTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3478:1: ( ( 'canonicalize' ) )
            // InternalMyDsl.g:3479:1: ( 'canonicalize' )
            {
            // InternalMyDsl.g:3479:1: ( 'canonicalize' )
            // InternalMyDsl.g:3480:2: 'canonicalize'
            {
             before(grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizeKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3489:1: rule__CanonicalizePathTransformation__Group__2 : rule__CanonicalizePathTransformation__Group__2__Impl ;
    public final void rule__CanonicalizePathTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3493:1: ( rule__CanonicalizePathTransformation__Group__2__Impl )
            // InternalMyDsl.g:3494:2: rule__CanonicalizePathTransformation__Group__2__Impl
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
    // InternalMyDsl.g:3500:1: rule__CanonicalizePathTransformation__Group__2__Impl : ( 'path' ) ;
    public final void rule__CanonicalizePathTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3504:1: ( ( 'path' ) )
            // InternalMyDsl.g:3505:1: ( 'path' )
            {
            // InternalMyDsl.g:3505:1: ( 'path' )
            // InternalMyDsl.g:3506:2: 'path'
            {
             before(grammarAccess.getCanonicalizePathTransformationAccess().getPathKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3516:1: rule__GetPathTransformation__Group__0 : rule__GetPathTransformation__Group__0__Impl rule__GetPathTransformation__Group__1 ;
    public final void rule__GetPathTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( rule__GetPathTransformation__Group__0__Impl rule__GetPathTransformation__Group__1 )
            // InternalMyDsl.g:3521:2: rule__GetPathTransformation__Group__0__Impl rule__GetPathTransformation__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3528:1: rule__GetPathTransformation__Group__0__Impl : ( () ) ;
    public final void rule__GetPathTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( ( () ) )
            // InternalMyDsl.g:3533:1: ( () )
            {
            // InternalMyDsl.g:3533:1: ( () )
            // InternalMyDsl.g:3534:2: ()
            {
             before(grammarAccess.getGetPathTransformationAccess().getGetPathTransformationAction_0()); 
            // InternalMyDsl.g:3535:2: ()
            // InternalMyDsl.g:3535:3: 
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
    // InternalMyDsl.g:3543:1: rule__GetPathTransformation__Group__1 : rule__GetPathTransformation__Group__1__Impl rule__GetPathTransformation__Group__2 ;
    public final void rule__GetPathTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3547:1: ( rule__GetPathTransformation__Group__1__Impl rule__GetPathTransformation__Group__2 )
            // InternalMyDsl.g:3548:2: rule__GetPathTransformation__Group__1__Impl rule__GetPathTransformation__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3555:1: rule__GetPathTransformation__Group__1__Impl : ( 'get' ) ;
    public final void rule__GetPathTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( ( 'get' ) )
            // InternalMyDsl.g:3560:1: ( 'get' )
            {
            // InternalMyDsl.g:3560:1: ( 'get' )
            // InternalMyDsl.g:3561:2: 'get'
            {
             before(grammarAccess.getGetPathTransformationAccess().getGetKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGetPathTransformationAccess().getGetKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3570:1: rule__GetPathTransformation__Group__2 : rule__GetPathTransformation__Group__2__Impl rule__GetPathTransformation__Group__3 ;
    public final void rule__GetPathTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3574:1: ( rule__GetPathTransformation__Group__2__Impl rule__GetPathTransformation__Group__3 )
            // InternalMyDsl.g:3575:2: rule__GetPathTransformation__Group__2__Impl rule__GetPathTransformation__Group__3
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
    // InternalMyDsl.g:3582:1: rule__GetPathTransformation__Group__2__Impl : ( 'path' ) ;
    public final void rule__GetPathTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( ( 'path' ) )
            // InternalMyDsl.g:3587:1: ( 'path' )
            {
            // InternalMyDsl.g:3587:1: ( 'path' )
            // InternalMyDsl.g:3588:2: 'path'
            {
             before(grammarAccess.getGetPathTransformationAccess().getPathKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGetPathTransformationAccess().getPathKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:3597:1: rule__GetPathTransformation__Group__3 : rule__GetPathTransformation__Group__3__Impl ;
    public final void rule__GetPathTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( rule__GetPathTransformation__Group__3__Impl )
            // InternalMyDsl.g:3602:2: rule__GetPathTransformation__Group__3__Impl
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
    // InternalMyDsl.g:3608:1: rule__GetPathTransformation__Group__3__Impl : ( 'name' ) ;
    public final void rule__GetPathTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3612:1: ( ( 'name' ) )
            // InternalMyDsl.g:3613:1: ( 'name' )
            {
            // InternalMyDsl.g:3613:1: ( 'name' )
            // InternalMyDsl.g:3614:2: 'name'
            {
             before(grammarAccess.getGetPathTransformationAccess().getNameKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGetPathTransformationAccess().getNameKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:3624:1: rule__AppendPathTransformation__Group__0 : rule__AppendPathTransformation__Group__0__Impl rule__AppendPathTransformation__Group__1 ;
    public final void rule__AppendPathTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3628:1: ( rule__AppendPathTransformation__Group__0__Impl rule__AppendPathTransformation__Group__1 )
            // InternalMyDsl.g:3629:2: rule__AppendPathTransformation__Group__0__Impl rule__AppendPathTransformation__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3636:1: rule__AppendPathTransformation__Group__0__Impl : ( 'append' ) ;
    public final void rule__AppendPathTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( ( 'append' ) )
            // InternalMyDsl.g:3641:1: ( 'append' )
            {
            // InternalMyDsl.g:3641:1: ( 'append' )
            // InternalMyDsl.g:3642:2: 'append'
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
    // InternalMyDsl.g:3651:1: rule__AppendPathTransformation__Group__1 : rule__AppendPathTransformation__Group__1__Impl rule__AppendPathTransformation__Group__2 ;
    public final void rule__AppendPathTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( rule__AppendPathTransformation__Group__1__Impl rule__AppendPathTransformation__Group__2 )
            // InternalMyDsl.g:3656:2: rule__AppendPathTransformation__Group__1__Impl rule__AppendPathTransformation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3663:1: rule__AppendPathTransformation__Group__1__Impl : ( 'path' ) ;
    public final void rule__AppendPathTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( ( 'path' ) )
            // InternalMyDsl.g:3668:1: ( 'path' )
            {
            // InternalMyDsl.g:3668:1: ( 'path' )
            // InternalMyDsl.g:3669:2: 'path'
            {
             before(grammarAccess.getAppendPathTransformationAccess().getPathKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3678:1: rule__AppendPathTransformation__Group__2 : rule__AppendPathTransformation__Group__2__Impl ;
    public final void rule__AppendPathTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3682:1: ( rule__AppendPathTransformation__Group__2__Impl )
            // InternalMyDsl.g:3683:2: rule__AppendPathTransformation__Group__2__Impl
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
    // InternalMyDsl.g:3689:1: rule__AppendPathTransformation__Group__2__Impl : ( ( rule__AppendPathTransformation__PathAssignment_2 ) ) ;
    public final void rule__AppendPathTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3693:1: ( ( ( rule__AppendPathTransformation__PathAssignment_2 ) ) )
            // InternalMyDsl.g:3694:1: ( ( rule__AppendPathTransformation__PathAssignment_2 ) )
            {
            // InternalMyDsl.g:3694:1: ( ( rule__AppendPathTransformation__PathAssignment_2 ) )
            // InternalMyDsl.g:3695:2: ( rule__AppendPathTransformation__PathAssignment_2 )
            {
             before(grammarAccess.getAppendPathTransformationAccess().getPathAssignment_2()); 
            // InternalMyDsl.g:3696:2: ( rule__AppendPathTransformation__PathAssignment_2 )
            // InternalMyDsl.g:3696:3: rule__AppendPathTransformation__PathAssignment_2
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
    // InternalMyDsl.g:3705:1: rule__PathTransformation__Group__0 : rule__PathTransformation__Group__0__Impl rule__PathTransformation__Group__1 ;
    public final void rule__PathTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( rule__PathTransformation__Group__0__Impl rule__PathTransformation__Group__1 )
            // InternalMyDsl.g:3710:2: rule__PathTransformation__Group__0__Impl rule__PathTransformation__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3717:1: rule__PathTransformation__Group__0__Impl : ( 'in' ) ;
    public final void rule__PathTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( ( 'in' ) )
            // InternalMyDsl.g:3722:1: ( 'in' )
            {
            // InternalMyDsl.g:3722:1: ( 'in' )
            // InternalMyDsl.g:3723:2: 'in'
            {
             before(grammarAccess.getPathTransformationAccess().getInKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPathTransformationAccess().getInKeyword_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3732:1: rule__PathTransformation__Group__1 : rule__PathTransformation__Group__1__Impl rule__PathTransformation__Group__2 ;
    public final void rule__PathTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( rule__PathTransformation__Group__1__Impl rule__PathTransformation__Group__2 )
            // InternalMyDsl.g:3737:2: rule__PathTransformation__Group__1__Impl rule__PathTransformation__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:3744:1: rule__PathTransformation__Group__1__Impl : ( ( rule__PathTransformation__ColumnAssignment_1 ) ) ;
    public final void rule__PathTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( ( ( rule__PathTransformation__ColumnAssignment_1 ) ) )
            // InternalMyDsl.g:3749:1: ( ( rule__PathTransformation__ColumnAssignment_1 ) )
            {
            // InternalMyDsl.g:3749:1: ( ( rule__PathTransformation__ColumnAssignment_1 ) )
            // InternalMyDsl.g:3750:2: ( rule__PathTransformation__ColumnAssignment_1 )
            {
             before(grammarAccess.getPathTransformationAccess().getColumnAssignment_1()); 
            // InternalMyDsl.g:3751:2: ( rule__PathTransformation__ColumnAssignment_1 )
            // InternalMyDsl.g:3751:3: rule__PathTransformation__ColumnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PathTransformation__ColumnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathTransformationAccess().getColumnAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3759:1: rule__PathTransformation__Group__2 : rule__PathTransformation__Group__2__Impl ;
    public final void rule__PathTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3763:1: ( rule__PathTransformation__Group__2__Impl )
            // InternalMyDsl.g:3764:2: rule__PathTransformation__Group__2__Impl
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
    // InternalMyDsl.g:3770:1: rule__PathTransformation__Group__2__Impl : ( ( rule__PathTransformation__OperationAssignment_2 ) ) ;
    public final void rule__PathTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3774:1: ( ( ( rule__PathTransformation__OperationAssignment_2 ) ) )
            // InternalMyDsl.g:3775:1: ( ( rule__PathTransformation__OperationAssignment_2 ) )
            {
            // InternalMyDsl.g:3775:1: ( ( rule__PathTransformation__OperationAssignment_2 ) )
            // InternalMyDsl.g:3776:2: ( rule__PathTransformation__OperationAssignment_2 )
            {
             before(grammarAccess.getPathTransformationAccess().getOperationAssignment_2()); 
            // InternalMyDsl.g:3777:2: ( rule__PathTransformation__OperationAssignment_2 )
            // InternalMyDsl.g:3777:3: rule__PathTransformation__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PathTransformation__OperationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPathTransformationAccess().getOperationAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__FoldMaxTranformation__Group__0"
    // InternalMyDsl.g:3786:1: rule__FoldMaxTranformation__Group__0 : rule__FoldMaxTranformation__Group__0__Impl rule__FoldMaxTranformation__Group__1 ;
    public final void rule__FoldMaxTranformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( rule__FoldMaxTranformation__Group__0__Impl rule__FoldMaxTranformation__Group__1 )
            // InternalMyDsl.g:3791:2: rule__FoldMaxTranformation__Group__0__Impl rule__FoldMaxTranformation__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__FoldMaxTranformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoldMaxTranformation__Group__1();

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
    // $ANTLR end "rule__FoldMaxTranformation__Group__0"


    // $ANTLR start "rule__FoldMaxTranformation__Group__0__Impl"
    // InternalMyDsl.g:3798:1: rule__FoldMaxTranformation__Group__0__Impl : ( 'in' ) ;
    public final void rule__FoldMaxTranformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3802:1: ( ( 'in' ) )
            // InternalMyDsl.g:3803:1: ( 'in' )
            {
            // InternalMyDsl.g:3803:1: ( 'in' )
            // InternalMyDsl.g:3804:2: 'in'
            {
             before(grammarAccess.getFoldMaxTranformationAccess().getInKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFoldMaxTranformationAccess().getInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldMaxTranformation__Group__0__Impl"


    // $ANTLR start "rule__FoldMaxTranformation__Group__1"
    // InternalMyDsl.g:3813:1: rule__FoldMaxTranformation__Group__1 : rule__FoldMaxTranformation__Group__1__Impl rule__FoldMaxTranformation__Group__2 ;
    public final void rule__FoldMaxTranformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( rule__FoldMaxTranformation__Group__1__Impl rule__FoldMaxTranformation__Group__2 )
            // InternalMyDsl.g:3818:2: rule__FoldMaxTranformation__Group__1__Impl rule__FoldMaxTranformation__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__FoldMaxTranformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoldMaxTranformation__Group__2();

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
    // $ANTLR end "rule__FoldMaxTranformation__Group__1"


    // $ANTLR start "rule__FoldMaxTranformation__Group__1__Impl"
    // InternalMyDsl.g:3825:1: rule__FoldMaxTranformation__Group__1__Impl : ( ( rule__FoldMaxTranformation__ColumnAssignment_1 ) ) ;
    public final void rule__FoldMaxTranformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3829:1: ( ( ( rule__FoldMaxTranformation__ColumnAssignment_1 ) ) )
            // InternalMyDsl.g:3830:1: ( ( rule__FoldMaxTranformation__ColumnAssignment_1 ) )
            {
            // InternalMyDsl.g:3830:1: ( ( rule__FoldMaxTranformation__ColumnAssignment_1 ) )
            // InternalMyDsl.g:3831:2: ( rule__FoldMaxTranformation__ColumnAssignment_1 )
            {
             before(grammarAccess.getFoldMaxTranformationAccess().getColumnAssignment_1()); 
            // InternalMyDsl.g:3832:2: ( rule__FoldMaxTranformation__ColumnAssignment_1 )
            // InternalMyDsl.g:3832:3: rule__FoldMaxTranformation__ColumnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FoldMaxTranformation__ColumnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFoldMaxTranformationAccess().getColumnAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldMaxTranformation__Group__1__Impl"


    // $ANTLR start "rule__FoldMaxTranformation__Group__2"
    // InternalMyDsl.g:3840:1: rule__FoldMaxTranformation__Group__2 : rule__FoldMaxTranformation__Group__2__Impl rule__FoldMaxTranformation__Group__3 ;
    public final void rule__FoldMaxTranformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3844:1: ( rule__FoldMaxTranformation__Group__2__Impl rule__FoldMaxTranformation__Group__3 )
            // InternalMyDsl.g:3845:2: rule__FoldMaxTranformation__Group__2__Impl rule__FoldMaxTranformation__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__FoldMaxTranformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FoldMaxTranformation__Group__3();

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
    // $ANTLR end "rule__FoldMaxTranformation__Group__2"


    // $ANTLR start "rule__FoldMaxTranformation__Group__2__Impl"
    // InternalMyDsl.g:3852:1: rule__FoldMaxTranformation__Group__2__Impl : ( 'fold' ) ;
    public final void rule__FoldMaxTranformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3856:1: ( ( 'fold' ) )
            // InternalMyDsl.g:3857:1: ( 'fold' )
            {
            // InternalMyDsl.g:3857:1: ( 'fold' )
            // InternalMyDsl.g:3858:2: 'fold'
            {
             before(grammarAccess.getFoldMaxTranformationAccess().getFoldKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFoldMaxTranformationAccess().getFoldKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldMaxTranformation__Group__2__Impl"


    // $ANTLR start "rule__FoldMaxTranformation__Group__3"
    // InternalMyDsl.g:3867:1: rule__FoldMaxTranformation__Group__3 : rule__FoldMaxTranformation__Group__3__Impl ;
    public final void rule__FoldMaxTranformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3871:1: ( rule__FoldMaxTranformation__Group__3__Impl )
            // InternalMyDsl.g:3872:2: rule__FoldMaxTranformation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FoldMaxTranformation__Group__3__Impl();

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
    // $ANTLR end "rule__FoldMaxTranformation__Group__3"


    // $ANTLR start "rule__FoldMaxTranformation__Group__3__Impl"
    // InternalMyDsl.g:3878:1: rule__FoldMaxTranformation__Group__3__Impl : ( 'max' ) ;
    public final void rule__FoldMaxTranformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3882:1: ( ( 'max' ) )
            // InternalMyDsl.g:3883:1: ( 'max' )
            {
            // InternalMyDsl.g:3883:1: ( 'max' )
            // InternalMyDsl.g:3884:2: 'max'
            {
             before(grammarAccess.getFoldMaxTranformationAccess().getMaxKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFoldMaxTranformationAccess().getMaxKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldMaxTranformation__Group__3__Impl"


    // $ANTLR start "rule__FoldAverageTranformation__Group__0"
    // InternalMyDsl.g:3894:1: rule__FoldAverageTranformation__Group__0 : rule__FoldAverageTranformation__Group__0__Impl rule__FoldAverageTranformation__Group__1 ;
    public final void rule__FoldAverageTranformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3898:1: ( rule__FoldAverageTranformation__Group__0__Impl rule__FoldAverageTranformation__Group__1 )
            // InternalMyDsl.g:3899:2: rule__FoldAverageTranformation__Group__0__Impl rule__FoldAverageTranformation__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:3906:1: rule__FoldAverageTranformation__Group__0__Impl : ( () ) ;
    public final void rule__FoldAverageTranformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3910:1: ( ( () ) )
            // InternalMyDsl.g:3911:1: ( () )
            {
            // InternalMyDsl.g:3911:1: ( () )
            // InternalMyDsl.g:3912:2: ()
            {
             before(grammarAccess.getFoldAverageTranformationAccess().getFoldAverageTranformationAction_0()); 
            // InternalMyDsl.g:3913:2: ()
            // InternalMyDsl.g:3913:3: 
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
    // InternalMyDsl.g:3921:1: rule__FoldAverageTranformation__Group__1 : rule__FoldAverageTranformation__Group__1__Impl rule__FoldAverageTranformation__Group__2 ;
    public final void rule__FoldAverageTranformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3925:1: ( rule__FoldAverageTranformation__Group__1__Impl rule__FoldAverageTranformation__Group__2 )
            // InternalMyDsl.g:3926:2: rule__FoldAverageTranformation__Group__1__Impl rule__FoldAverageTranformation__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:3933:1: rule__FoldAverageTranformation__Group__1__Impl : ( 'fold' ) ;
    public final void rule__FoldAverageTranformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3937:1: ( ( 'fold' ) )
            // InternalMyDsl.g:3938:1: ( 'fold' )
            {
            // InternalMyDsl.g:3938:1: ( 'fold' )
            // InternalMyDsl.g:3939:2: 'fold'
            {
             before(grammarAccess.getFoldAverageTranformationAccess().getFoldKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3948:1: rule__FoldAverageTranformation__Group__2 : rule__FoldAverageTranformation__Group__2__Impl ;
    public final void rule__FoldAverageTranformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3952:1: ( rule__FoldAverageTranformation__Group__2__Impl )
            // InternalMyDsl.g:3953:2: rule__FoldAverageTranformation__Group__2__Impl
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
    // InternalMyDsl.g:3959:1: rule__FoldAverageTranformation__Group__2__Impl : ( 'avg' ) ;
    public final void rule__FoldAverageTranformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3963:1: ( ( 'avg' ) )
            // InternalMyDsl.g:3964:1: ( 'avg' )
            {
            // InternalMyDsl.g:3964:1: ( 'avg' )
            // InternalMyDsl.g:3965:2: 'avg'
            {
             before(grammarAccess.getFoldAverageTranformationAccess().getAvgKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFoldAverageTranformationAccess().getAvgKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:3975:1: rule__FoldSumTranformation__Group__0 : rule__FoldSumTranformation__Group__0__Impl rule__FoldSumTranformation__Group__1 ;
    public final void rule__FoldSumTranformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3979:1: ( rule__FoldSumTranformation__Group__0__Impl rule__FoldSumTranformation__Group__1 )
            // InternalMyDsl.g:3980:2: rule__FoldSumTranformation__Group__0__Impl rule__FoldSumTranformation__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:3987:1: rule__FoldSumTranformation__Group__0__Impl : ( () ) ;
    public final void rule__FoldSumTranformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3991:1: ( ( () ) )
            // InternalMyDsl.g:3992:1: ( () )
            {
            // InternalMyDsl.g:3992:1: ( () )
            // InternalMyDsl.g:3993:2: ()
            {
             before(grammarAccess.getFoldSumTranformationAccess().getFoldSumTranformationAction_0()); 
            // InternalMyDsl.g:3994:2: ()
            // InternalMyDsl.g:3994:3: 
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
    // InternalMyDsl.g:4002:1: rule__FoldSumTranformation__Group__1 : rule__FoldSumTranformation__Group__1__Impl rule__FoldSumTranformation__Group__2 ;
    public final void rule__FoldSumTranformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4006:1: ( rule__FoldSumTranformation__Group__1__Impl rule__FoldSumTranformation__Group__2 )
            // InternalMyDsl.g:4007:2: rule__FoldSumTranformation__Group__1__Impl rule__FoldSumTranformation__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyDsl.g:4014:1: rule__FoldSumTranformation__Group__1__Impl : ( 'fold' ) ;
    public final void rule__FoldSumTranformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4018:1: ( ( 'fold' ) )
            // InternalMyDsl.g:4019:1: ( 'fold' )
            {
            // InternalMyDsl.g:4019:1: ( 'fold' )
            // InternalMyDsl.g:4020:2: 'fold'
            {
             before(grammarAccess.getFoldSumTranformationAccess().getFoldKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:4029:1: rule__FoldSumTranformation__Group__2 : rule__FoldSumTranformation__Group__2__Impl ;
    public final void rule__FoldSumTranformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4033:1: ( rule__FoldSumTranformation__Group__2__Impl )
            // InternalMyDsl.g:4034:2: rule__FoldSumTranformation__Group__2__Impl
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
    // InternalMyDsl.g:4040:1: rule__FoldSumTranformation__Group__2__Impl : ( 'sum' ) ;
    public final void rule__FoldSumTranformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4044:1: ( ( 'sum' ) )
            // InternalMyDsl.g:4045:1: ( 'sum' )
            {
            // InternalMyDsl.g:4045:1: ( 'sum' )
            // InternalMyDsl.g:4046:2: 'sum'
            {
             before(grammarAccess.getFoldSumTranformationAccess().getSumKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:4056:1: rule__GroupBy__Group__0 : rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1 ;
    public final void rule__GroupBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4060:1: ( rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1 )
            // InternalMyDsl.g:4061:2: rule__GroupBy__Group__0__Impl rule__GroupBy__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyDsl.g:4068:1: rule__GroupBy__Group__0__Impl : ( 'group' ) ;
    public final void rule__GroupBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4072:1: ( ( 'group' ) )
            // InternalMyDsl.g:4073:1: ( 'group' )
            {
            // InternalMyDsl.g:4073:1: ( 'group' )
            // InternalMyDsl.g:4074:2: 'group'
            {
             before(grammarAccess.getGroupByAccess().getGroupKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:4083:1: rule__GroupBy__Group__1 : rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2 ;
    public final void rule__GroupBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4087:1: ( rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2 )
            // InternalMyDsl.g:4088:2: rule__GroupBy__Group__1__Impl rule__GroupBy__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4095:1: rule__GroupBy__Group__1__Impl : ( 'by' ) ;
    public final void rule__GroupBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4099:1: ( ( 'by' ) )
            // InternalMyDsl.g:4100:1: ( 'by' )
            {
            // InternalMyDsl.g:4100:1: ( 'by' )
            // InternalMyDsl.g:4101:2: 'by'
            {
             before(grammarAccess.getGroupByAccess().getByKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:4110:1: rule__GroupBy__Group__2 : rule__GroupBy__Group__2__Impl ;
    public final void rule__GroupBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4114:1: ( rule__GroupBy__Group__2__Impl )
            // InternalMyDsl.g:4115:2: rule__GroupBy__Group__2__Impl
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
    // InternalMyDsl.g:4121:1: rule__GroupBy__Group__2__Impl : ( ( rule__GroupBy__ColumnAssignment_2 ) ) ;
    public final void rule__GroupBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4125:1: ( ( ( rule__GroupBy__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:4126:1: ( ( rule__GroupBy__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:4126:1: ( ( rule__GroupBy__ColumnAssignment_2 ) )
            // InternalMyDsl.g:4127:2: ( rule__GroupBy__ColumnAssignment_2 )
            {
             before(grammarAccess.getGroupByAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:4128:2: ( rule__GroupBy__ColumnAssignment_2 )
            // InternalMyDsl.g:4128:3: rule__GroupBy__ColumnAssignment_2
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
    // InternalMyDsl.g:4137:1: rule__FoldTransformation__Group__0 : rule__FoldTransformation__Group__0__Impl rule__FoldTransformation__Group__1 ;
    public final void rule__FoldTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4141:1: ( rule__FoldTransformation__Group__0__Impl rule__FoldTransformation__Group__1 )
            // InternalMyDsl.g:4142:2: rule__FoldTransformation__Group__0__Impl rule__FoldTransformation__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalMyDsl.g:4149:1: rule__FoldTransformation__Group__0__Impl : ( ( rule__FoldTransformation__OperationAssignment_0 ) ) ;
    public final void rule__FoldTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4153:1: ( ( ( rule__FoldTransformation__OperationAssignment_0 ) ) )
            // InternalMyDsl.g:4154:1: ( ( rule__FoldTransformation__OperationAssignment_0 ) )
            {
            // InternalMyDsl.g:4154:1: ( ( rule__FoldTransformation__OperationAssignment_0 ) )
            // InternalMyDsl.g:4155:2: ( rule__FoldTransformation__OperationAssignment_0 )
            {
             before(grammarAccess.getFoldTransformationAccess().getOperationAssignment_0()); 
            // InternalMyDsl.g:4156:2: ( rule__FoldTransformation__OperationAssignment_0 )
            // InternalMyDsl.g:4156:3: rule__FoldTransformation__OperationAssignment_0
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
    // InternalMyDsl.g:4164:1: rule__FoldTransformation__Group__1 : rule__FoldTransformation__Group__1__Impl ;
    public final void rule__FoldTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4168:1: ( rule__FoldTransformation__Group__1__Impl )
            // InternalMyDsl.g:4169:2: rule__FoldTransformation__Group__1__Impl
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
    // InternalMyDsl.g:4175:1: rule__FoldTransformation__Group__1__Impl : ( ( rule__FoldTransformation__GroupByAssignment_1 )? ) ;
    public final void rule__FoldTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4179:1: ( ( ( rule__FoldTransformation__GroupByAssignment_1 )? ) )
            // InternalMyDsl.g:4180:1: ( ( rule__FoldTransformation__GroupByAssignment_1 )? )
            {
            // InternalMyDsl.g:4180:1: ( ( rule__FoldTransformation__GroupByAssignment_1 )? )
            // InternalMyDsl.g:4181:2: ( rule__FoldTransformation__GroupByAssignment_1 )?
            {
             before(grammarAccess.getFoldTransformationAccess().getGroupByAssignment_1()); 
            // InternalMyDsl.g:4182:2: ( rule__FoldTransformation__GroupByAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4182:3: rule__FoldTransformation__GroupByAssignment_1
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
    // InternalMyDsl.g:4191:1: rule__AddColumnTransformation__Group__0 : rule__AddColumnTransformation__Group__0__Impl rule__AddColumnTransformation__Group__1 ;
    public final void rule__AddColumnTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4195:1: ( rule__AddColumnTransformation__Group__0__Impl rule__AddColumnTransformation__Group__1 )
            // InternalMyDsl.g:4196:2: rule__AddColumnTransformation__Group__0__Impl rule__AddColumnTransformation__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4203:1: rule__AddColumnTransformation__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddColumnTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4207:1: ( ( 'add' ) )
            // InternalMyDsl.g:4208:1: ( 'add' )
            {
            // InternalMyDsl.g:4208:1: ( 'add' )
            // InternalMyDsl.g:4209:2: 'add'
            {
             before(grammarAccess.getAddColumnTransformationAccess().getAddKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4218:1: rule__AddColumnTransformation__Group__1 : rule__AddColumnTransformation__Group__1__Impl rule__AddColumnTransformation__Group__2 ;
    public final void rule__AddColumnTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4222:1: ( rule__AddColumnTransformation__Group__1__Impl rule__AddColumnTransformation__Group__2 )
            // InternalMyDsl.g:4223:2: rule__AddColumnTransformation__Group__1__Impl rule__AddColumnTransformation__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalMyDsl.g:4230:1: rule__AddColumnTransformation__Group__1__Impl : ( ( rule__AddColumnTransformation__ColumnAssignment_1 ) ) ;
    public final void rule__AddColumnTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4234:1: ( ( ( rule__AddColumnTransformation__ColumnAssignment_1 ) ) )
            // InternalMyDsl.g:4235:1: ( ( rule__AddColumnTransformation__ColumnAssignment_1 ) )
            {
            // InternalMyDsl.g:4235:1: ( ( rule__AddColumnTransformation__ColumnAssignment_1 ) )
            // InternalMyDsl.g:4236:2: ( rule__AddColumnTransformation__ColumnAssignment_1 )
            {
             before(grammarAccess.getAddColumnTransformationAccess().getColumnAssignment_1()); 
            // InternalMyDsl.g:4237:2: ( rule__AddColumnTransformation__ColumnAssignment_1 )
            // InternalMyDsl.g:4237:3: rule__AddColumnTransformation__ColumnAssignment_1
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
    // InternalMyDsl.g:4245:1: rule__AddColumnTransformation__Group__2 : rule__AddColumnTransformation__Group__2__Impl rule__AddColumnTransformation__Group__3 ;
    public final void rule__AddColumnTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4249:1: ( rule__AddColumnTransformation__Group__2__Impl rule__AddColumnTransformation__Group__3 )
            // InternalMyDsl.g:4250:2: rule__AddColumnTransformation__Group__2__Impl rule__AddColumnTransformation__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4257:1: rule__AddColumnTransformation__Group__2__Impl : ( 'with' ) ;
    public final void rule__AddColumnTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4261:1: ( ( 'with' ) )
            // InternalMyDsl.g:4262:1: ( 'with' )
            {
            // InternalMyDsl.g:4262:1: ( 'with' )
            // InternalMyDsl.g:4263:2: 'with'
            {
             before(grammarAccess.getAddColumnTransformationAccess().getWithKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4272:1: rule__AddColumnTransformation__Group__3 : rule__AddColumnTransformation__Group__3__Impl ;
    public final void rule__AddColumnTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4276:1: ( rule__AddColumnTransformation__Group__3__Impl )
            // InternalMyDsl.g:4277:2: rule__AddColumnTransformation__Group__3__Impl
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
    // InternalMyDsl.g:4283:1: rule__AddColumnTransformation__Group__3__Impl : ( ( rule__AddColumnTransformation__ValueAssignment_3 ) ) ;
    public final void rule__AddColumnTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4287:1: ( ( ( rule__AddColumnTransformation__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:4288:1: ( ( rule__AddColumnTransformation__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:4288:1: ( ( rule__AddColumnTransformation__ValueAssignment_3 ) )
            // InternalMyDsl.g:4289:2: ( rule__AddColumnTransformation__ValueAssignment_3 )
            {
             before(grammarAccess.getAddColumnTransformationAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:4290:2: ( rule__AddColumnTransformation__ValueAssignment_3 )
            // InternalMyDsl.g:4290:3: rule__AddColumnTransformation__ValueAssignment_3
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
    // InternalMyDsl.g:4299:1: rule__RemoveColumnTransformation__Group__0 : rule__RemoveColumnTransformation__Group__0__Impl rule__RemoveColumnTransformation__Group__1 ;
    public final void rule__RemoveColumnTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4303:1: ( rule__RemoveColumnTransformation__Group__0__Impl rule__RemoveColumnTransformation__Group__1 )
            // InternalMyDsl.g:4304:2: rule__RemoveColumnTransformation__Group__0__Impl rule__RemoveColumnTransformation__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:4311:1: rule__RemoveColumnTransformation__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveColumnTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4315:1: ( ( 'remove' ) )
            // InternalMyDsl.g:4316:1: ( 'remove' )
            {
            // InternalMyDsl.g:4316:1: ( 'remove' )
            // InternalMyDsl.g:4317:2: 'remove'
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getRemoveKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4326:1: rule__RemoveColumnTransformation__Group__1 : rule__RemoveColumnTransformation__Group__1__Impl rule__RemoveColumnTransformation__Group__2 ;
    public final void rule__RemoveColumnTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4330:1: ( rule__RemoveColumnTransformation__Group__1__Impl rule__RemoveColumnTransformation__Group__2 )
            // InternalMyDsl.g:4331:2: rule__RemoveColumnTransformation__Group__1__Impl rule__RemoveColumnTransformation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4338:1: rule__RemoveColumnTransformation__Group__1__Impl : ( '[' ) ;
    public final void rule__RemoveColumnTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4342:1: ( ( '[' ) )
            // InternalMyDsl.g:4343:1: ( '[' )
            {
            // InternalMyDsl.g:4343:1: ( '[' )
            // InternalMyDsl.g:4344:2: '['
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:4353:1: rule__RemoveColumnTransformation__Group__2 : rule__RemoveColumnTransformation__Group__2__Impl rule__RemoveColumnTransformation__Group__3 ;
    public final void rule__RemoveColumnTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4357:1: ( rule__RemoveColumnTransformation__Group__2__Impl rule__RemoveColumnTransformation__Group__3 )
            // InternalMyDsl.g:4358:2: rule__RemoveColumnTransformation__Group__2__Impl rule__RemoveColumnTransformation__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:4365:1: rule__RemoveColumnTransformation__Group__2__Impl : ( ( rule__RemoveColumnTransformation__ColumnAssignment_2 ) ) ;
    public final void rule__RemoveColumnTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4369:1: ( ( ( rule__RemoveColumnTransformation__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:4370:1: ( ( rule__RemoveColumnTransformation__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:4370:1: ( ( rule__RemoveColumnTransformation__ColumnAssignment_2 ) )
            // InternalMyDsl.g:4371:2: ( rule__RemoveColumnTransformation__ColumnAssignment_2 )
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:4372:2: ( rule__RemoveColumnTransformation__ColumnAssignment_2 )
            // InternalMyDsl.g:4372:3: rule__RemoveColumnTransformation__ColumnAssignment_2
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
    // InternalMyDsl.g:4380:1: rule__RemoveColumnTransformation__Group__3 : rule__RemoveColumnTransformation__Group__3__Impl rule__RemoveColumnTransformation__Group__4 ;
    public final void rule__RemoveColumnTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4384:1: ( rule__RemoveColumnTransformation__Group__3__Impl rule__RemoveColumnTransformation__Group__4 )
            // InternalMyDsl.g:4385:2: rule__RemoveColumnTransformation__Group__3__Impl rule__RemoveColumnTransformation__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:4392:1: rule__RemoveColumnTransformation__Group__3__Impl : ( ( rule__RemoveColumnTransformation__Group_3__0 )* ) ;
    public final void rule__RemoveColumnTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4396:1: ( ( ( rule__RemoveColumnTransformation__Group_3__0 )* ) )
            // InternalMyDsl.g:4397:1: ( ( rule__RemoveColumnTransformation__Group_3__0 )* )
            {
            // InternalMyDsl.g:4397:1: ( ( rule__RemoveColumnTransformation__Group_3__0 )* )
            // InternalMyDsl.g:4398:2: ( rule__RemoveColumnTransformation__Group_3__0 )*
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getGroup_3()); 
            // InternalMyDsl.g:4399:2: ( rule__RemoveColumnTransformation__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_STRING) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:4399:3: rule__RemoveColumnTransformation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RemoveColumnTransformation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMyDsl.g:4407:1: rule__RemoveColumnTransformation__Group__4 : rule__RemoveColumnTransformation__Group__4__Impl rule__RemoveColumnTransformation__Group__5 ;
    public final void rule__RemoveColumnTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4411:1: ( rule__RemoveColumnTransformation__Group__4__Impl rule__RemoveColumnTransformation__Group__5 )
            // InternalMyDsl.g:4412:2: rule__RemoveColumnTransformation__Group__4__Impl rule__RemoveColumnTransformation__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:4419:1: rule__RemoveColumnTransformation__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__RemoveColumnTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( ( ( ',' )? ) )
            // InternalMyDsl.g:4424:1: ( ( ',' )? )
            {
            // InternalMyDsl.g:4424:1: ( ( ',' )? )
            // InternalMyDsl.g:4425:2: ( ',' )?
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_4()); 
            // InternalMyDsl.g:4426:2: ( ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:4426:3: ','
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:4434:1: rule__RemoveColumnTransformation__Group__5 : rule__RemoveColumnTransformation__Group__5__Impl ;
    public final void rule__RemoveColumnTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4438:1: ( rule__RemoveColumnTransformation__Group__5__Impl )
            // InternalMyDsl.g:4439:2: rule__RemoveColumnTransformation__Group__5__Impl
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
    // InternalMyDsl.g:4445:1: rule__RemoveColumnTransformation__Group__5__Impl : ( ']' ) ;
    public final void rule__RemoveColumnTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4449:1: ( ( ']' ) )
            // InternalMyDsl.g:4450:1: ( ']' )
            {
            // InternalMyDsl.g:4450:1: ( ']' )
            // InternalMyDsl.g:4451:2: ']'
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getRightSquareBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4461:1: rule__RemoveColumnTransformation__Group_3__0 : rule__RemoveColumnTransformation__Group_3__0__Impl rule__RemoveColumnTransformation__Group_3__1 ;
    public final void rule__RemoveColumnTransformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4465:1: ( rule__RemoveColumnTransformation__Group_3__0__Impl rule__RemoveColumnTransformation__Group_3__1 )
            // InternalMyDsl.g:4466:2: rule__RemoveColumnTransformation__Group_3__0__Impl rule__RemoveColumnTransformation__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4473:1: rule__RemoveColumnTransformation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RemoveColumnTransformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4477:1: ( ( ',' ) )
            // InternalMyDsl.g:4478:1: ( ',' )
            {
            // InternalMyDsl.g:4478:1: ( ',' )
            // InternalMyDsl.g:4479:2: ','
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:4488:1: rule__RemoveColumnTransformation__Group_3__1 : rule__RemoveColumnTransformation__Group_3__1__Impl ;
    public final void rule__RemoveColumnTransformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4492:1: ( rule__RemoveColumnTransformation__Group_3__1__Impl )
            // InternalMyDsl.g:4493:2: rule__RemoveColumnTransformation__Group_3__1__Impl
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
    // InternalMyDsl.g:4499:1: rule__RemoveColumnTransformation__Group_3__1__Impl : ( ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 ) ) ;
    public final void rule__RemoveColumnTransformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4503:1: ( ( ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 ) ) )
            // InternalMyDsl.g:4504:1: ( ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4504:1: ( ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 ) )
            // InternalMyDsl.g:4505:2: ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_3_1()); 
            // InternalMyDsl.g:4506:2: ( rule__RemoveColumnTransformation__ColumnAssignment_3_1 )
            // InternalMyDsl.g:4506:3: rule__RemoveColumnTransformation__ColumnAssignment_3_1
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
    // InternalMyDsl.g:4515:1: rule__RenameColumnTransformation__Group__0 : rule__RenameColumnTransformation__Group__0__Impl rule__RenameColumnTransformation__Group__1 ;
    public final void rule__RenameColumnTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4519:1: ( rule__RenameColumnTransformation__Group__0__Impl rule__RenameColumnTransformation__Group__1 )
            // InternalMyDsl.g:4520:2: rule__RenameColumnTransformation__Group__0__Impl rule__RenameColumnTransformation__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4527:1: rule__RenameColumnTransformation__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameColumnTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4531:1: ( ( 'rename' ) )
            // InternalMyDsl.g:4532:1: ( 'rename' )
            {
            // InternalMyDsl.g:4532:1: ( 'rename' )
            // InternalMyDsl.g:4533:2: 'rename'
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getRenameKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:4542:1: rule__RenameColumnTransformation__Group__1 : rule__RenameColumnTransformation__Group__1__Impl rule__RenameColumnTransformation__Group__2 ;
    public final void rule__RenameColumnTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4546:1: ( rule__RenameColumnTransformation__Group__1__Impl rule__RenameColumnTransformation__Group__2 )
            // InternalMyDsl.g:4547:2: rule__RenameColumnTransformation__Group__1__Impl rule__RenameColumnTransformation__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalMyDsl.g:4554:1: rule__RenameColumnTransformation__Group__1__Impl : ( ( rule__RenameColumnTransformation__FromAssignment_1 ) ) ;
    public final void rule__RenameColumnTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( ( rule__RenameColumnTransformation__FromAssignment_1 ) ) )
            // InternalMyDsl.g:4559:1: ( ( rule__RenameColumnTransformation__FromAssignment_1 ) )
            {
            // InternalMyDsl.g:4559:1: ( ( rule__RenameColumnTransformation__FromAssignment_1 ) )
            // InternalMyDsl.g:4560:2: ( rule__RenameColumnTransformation__FromAssignment_1 )
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getFromAssignment_1()); 
            // InternalMyDsl.g:4561:2: ( rule__RenameColumnTransformation__FromAssignment_1 )
            // InternalMyDsl.g:4561:3: rule__RenameColumnTransformation__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnTransformationAccess().getFromAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:4569:1: rule__RenameColumnTransformation__Group__2 : rule__RenameColumnTransformation__Group__2__Impl rule__RenameColumnTransformation__Group__3 ;
    public final void rule__RenameColumnTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( rule__RenameColumnTransformation__Group__2__Impl rule__RenameColumnTransformation__Group__3 )
            // InternalMyDsl.g:4574:2: rule__RenameColumnTransformation__Group__2__Impl rule__RenameColumnTransformation__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4581:1: rule__RenameColumnTransformation__Group__2__Impl : ( 'to' ) ;
    public final void rule__RenameColumnTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4585:1: ( ( 'to' ) )
            // InternalMyDsl.g:4586:1: ( 'to' )
            {
            // InternalMyDsl.g:4586:1: ( 'to' )
            // InternalMyDsl.g:4587:2: 'to'
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getToKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRenameColumnTransformationAccess().getToKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:4596:1: rule__RenameColumnTransformation__Group__3 : rule__RenameColumnTransformation__Group__3__Impl ;
    public final void rule__RenameColumnTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4600:1: ( rule__RenameColumnTransformation__Group__3__Impl )
            // InternalMyDsl.g:4601:2: rule__RenameColumnTransformation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__Group__3__Impl();

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
    // InternalMyDsl.g:4607:1: rule__RenameColumnTransformation__Group__3__Impl : ( ( rule__RenameColumnTransformation__ToAssignment_3 ) ) ;
    public final void rule__RenameColumnTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4611:1: ( ( ( rule__RenameColumnTransformation__ToAssignment_3 ) ) )
            // InternalMyDsl.g:4612:1: ( ( rule__RenameColumnTransformation__ToAssignment_3 ) )
            {
            // InternalMyDsl.g:4612:1: ( ( rule__RenameColumnTransformation__ToAssignment_3 ) )
            // InternalMyDsl.g:4613:2: ( rule__RenameColumnTransformation__ToAssignment_3 )
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getToAssignment_3()); 
            // InternalMyDsl.g:4614:2: ( rule__RenameColumnTransformation__ToAssignment_3 )
            // InternalMyDsl.g:4614:3: rule__RenameColumnTransformation__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RenameColumnTransformation__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRenameColumnTransformationAccess().getToAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SelectColumnTransformation__Group__0"
    // InternalMyDsl.g:4623:1: rule__SelectColumnTransformation__Group__0 : rule__SelectColumnTransformation__Group__0__Impl rule__SelectColumnTransformation__Group__1 ;
    public final void rule__SelectColumnTransformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4627:1: ( rule__SelectColumnTransformation__Group__0__Impl rule__SelectColumnTransformation__Group__1 )
            // InternalMyDsl.g:4628:2: rule__SelectColumnTransformation__Group__0__Impl rule__SelectColumnTransformation__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:4635:1: rule__SelectColumnTransformation__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectColumnTransformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4639:1: ( ( 'select' ) )
            // InternalMyDsl.g:4640:1: ( 'select' )
            {
            // InternalMyDsl.g:4640:1: ( 'select' )
            // InternalMyDsl.g:4641:2: 'select'
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getSelectKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4650:1: rule__SelectColumnTransformation__Group__1 : rule__SelectColumnTransformation__Group__1__Impl rule__SelectColumnTransformation__Group__2 ;
    public final void rule__SelectColumnTransformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4654:1: ( rule__SelectColumnTransformation__Group__1__Impl rule__SelectColumnTransformation__Group__2 )
            // InternalMyDsl.g:4655:2: rule__SelectColumnTransformation__Group__1__Impl rule__SelectColumnTransformation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4662:1: rule__SelectColumnTransformation__Group__1__Impl : ( '[' ) ;
    public final void rule__SelectColumnTransformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4666:1: ( ( '[' ) )
            // InternalMyDsl.g:4667:1: ( '[' )
            {
            // InternalMyDsl.g:4667:1: ( '[' )
            // InternalMyDsl.g:4668:2: '['
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:4677:1: rule__SelectColumnTransformation__Group__2 : rule__SelectColumnTransformation__Group__2__Impl rule__SelectColumnTransformation__Group__3 ;
    public final void rule__SelectColumnTransformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4681:1: ( rule__SelectColumnTransformation__Group__2__Impl rule__SelectColumnTransformation__Group__3 )
            // InternalMyDsl.g:4682:2: rule__SelectColumnTransformation__Group__2__Impl rule__SelectColumnTransformation__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:4689:1: rule__SelectColumnTransformation__Group__2__Impl : ( ( rule__SelectColumnTransformation__ColumnAssignment_2 ) ) ;
    public final void rule__SelectColumnTransformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4693:1: ( ( ( rule__SelectColumnTransformation__ColumnAssignment_2 ) ) )
            // InternalMyDsl.g:4694:1: ( ( rule__SelectColumnTransformation__ColumnAssignment_2 ) )
            {
            // InternalMyDsl.g:4694:1: ( ( rule__SelectColumnTransformation__ColumnAssignment_2 ) )
            // InternalMyDsl.g:4695:2: ( rule__SelectColumnTransformation__ColumnAssignment_2 )
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_2()); 
            // InternalMyDsl.g:4696:2: ( rule__SelectColumnTransformation__ColumnAssignment_2 )
            // InternalMyDsl.g:4696:3: rule__SelectColumnTransformation__ColumnAssignment_2
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
    // InternalMyDsl.g:4704:1: rule__SelectColumnTransformation__Group__3 : rule__SelectColumnTransformation__Group__3__Impl rule__SelectColumnTransformation__Group__4 ;
    public final void rule__SelectColumnTransformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4708:1: ( rule__SelectColumnTransformation__Group__3__Impl rule__SelectColumnTransformation__Group__4 )
            // InternalMyDsl.g:4709:2: rule__SelectColumnTransformation__Group__3__Impl rule__SelectColumnTransformation__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:4716:1: rule__SelectColumnTransformation__Group__3__Impl : ( ( rule__SelectColumnTransformation__Group_3__0 )* ) ;
    public final void rule__SelectColumnTransformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4720:1: ( ( ( rule__SelectColumnTransformation__Group_3__0 )* ) )
            // InternalMyDsl.g:4721:1: ( ( rule__SelectColumnTransformation__Group_3__0 )* )
            {
            // InternalMyDsl.g:4721:1: ( ( rule__SelectColumnTransformation__Group_3__0 )* )
            // InternalMyDsl.g:4722:2: ( rule__SelectColumnTransformation__Group_3__0 )*
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getGroup_3()); 
            // InternalMyDsl.g:4723:2: ( rule__SelectColumnTransformation__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_STRING) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:4723:3: rule__SelectColumnTransformation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SelectColumnTransformation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalMyDsl.g:4731:1: rule__SelectColumnTransformation__Group__4 : rule__SelectColumnTransformation__Group__4__Impl rule__SelectColumnTransformation__Group__5 ;
    public final void rule__SelectColumnTransformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4735:1: ( rule__SelectColumnTransformation__Group__4__Impl rule__SelectColumnTransformation__Group__5 )
            // InternalMyDsl.g:4736:2: rule__SelectColumnTransformation__Group__4__Impl rule__SelectColumnTransformation__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:4743:1: rule__SelectColumnTransformation__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__SelectColumnTransformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4747:1: ( ( ( ',' )? ) )
            // InternalMyDsl.g:4748:1: ( ( ',' )? )
            {
            // InternalMyDsl.g:4748:1: ( ( ',' )? )
            // InternalMyDsl.g:4749:2: ( ',' )?
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_4()); 
            // InternalMyDsl.g:4750:2: ( ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4750:3: ','
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:4758:1: rule__SelectColumnTransformation__Group__5 : rule__SelectColumnTransformation__Group__5__Impl ;
    public final void rule__SelectColumnTransformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4762:1: ( rule__SelectColumnTransformation__Group__5__Impl )
            // InternalMyDsl.g:4763:2: rule__SelectColumnTransformation__Group__5__Impl
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
    // InternalMyDsl.g:4769:1: rule__SelectColumnTransformation__Group__5__Impl : ( ']' ) ;
    public final void rule__SelectColumnTransformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4773:1: ( ( ']' ) )
            // InternalMyDsl.g:4774:1: ( ']' )
            {
            // InternalMyDsl.g:4774:1: ( ']' )
            // InternalMyDsl.g:4775:2: ']'
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getRightSquareBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4785:1: rule__SelectColumnTransformation__Group_3__0 : rule__SelectColumnTransformation__Group_3__0__Impl rule__SelectColumnTransformation__Group_3__1 ;
    public final void rule__SelectColumnTransformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4789:1: ( rule__SelectColumnTransformation__Group_3__0__Impl rule__SelectColumnTransformation__Group_3__1 )
            // InternalMyDsl.g:4790:2: rule__SelectColumnTransformation__Group_3__0__Impl rule__SelectColumnTransformation__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4797:1: rule__SelectColumnTransformation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SelectColumnTransformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4801:1: ( ( ',' ) )
            // InternalMyDsl.g:4802:1: ( ',' )
            {
            // InternalMyDsl.g:4802:1: ( ',' )
            // InternalMyDsl.g:4803:2: ','
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:4812:1: rule__SelectColumnTransformation__Group_3__1 : rule__SelectColumnTransformation__Group_3__1__Impl ;
    public final void rule__SelectColumnTransformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4816:1: ( rule__SelectColumnTransformation__Group_3__1__Impl )
            // InternalMyDsl.g:4817:2: rule__SelectColumnTransformation__Group_3__1__Impl
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
    // InternalMyDsl.g:4823:1: rule__SelectColumnTransformation__Group_3__1__Impl : ( ( rule__SelectColumnTransformation__ColumnAssignment_3_1 ) ) ;
    public final void rule__SelectColumnTransformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4827:1: ( ( ( rule__SelectColumnTransformation__ColumnAssignment_3_1 ) ) )
            // InternalMyDsl.g:4828:1: ( ( rule__SelectColumnTransformation__ColumnAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4828:1: ( ( rule__SelectColumnTransformation__ColumnAssignment_3_1 ) )
            // InternalMyDsl.g:4829:2: ( rule__SelectColumnTransformation__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_3_1()); 
            // InternalMyDsl.g:4830:2: ( rule__SelectColumnTransformation__ColumnAssignment_3_1 )
            // InternalMyDsl.g:4830:3: rule__SelectColumnTransformation__ColumnAssignment_3_1
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


    // $ANTLR start "rule__Pipeline__Group__0"
    // InternalMyDsl.g:4839:1: rule__Pipeline__Group__0 : rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1 ;
    public final void rule__Pipeline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1 )
            // InternalMyDsl.g:4844:2: rule__Pipeline__Group__0__Impl rule__Pipeline__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4851:1: rule__Pipeline__Group__0__Impl : ( ( rule__Pipeline__NameAssignment_0 ) ) ;
    public final void rule__Pipeline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4855:1: ( ( ( rule__Pipeline__NameAssignment_0 ) ) )
            // InternalMyDsl.g:4856:1: ( ( rule__Pipeline__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:4856:1: ( ( rule__Pipeline__NameAssignment_0 ) )
            // InternalMyDsl.g:4857:2: ( rule__Pipeline__NameAssignment_0 )
            {
             before(grammarAccess.getPipelineAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:4858:2: ( rule__Pipeline__NameAssignment_0 )
            // InternalMyDsl.g:4858:3: rule__Pipeline__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:4866:1: rule__Pipeline__Group__1 : rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2 ;
    public final void rule__Pipeline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2 )
            // InternalMyDsl.g:4871:2: rule__Pipeline__Group__1__Impl rule__Pipeline__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalMyDsl.g:4878:1: rule__Pipeline__Group__1__Impl : ( '=' ) ;
    public final void rule__Pipeline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4882:1: ( ( '=' ) )
            // InternalMyDsl.g:4883:1: ( '=' )
            {
            // InternalMyDsl.g:4883:1: ( '=' )
            // InternalMyDsl.g:4884:2: '='
            {
             before(grammarAccess.getPipelineAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:4893:1: rule__Pipeline__Group__2 : rule__Pipeline__Group__2__Impl rule__Pipeline__Group__3 ;
    public final void rule__Pipeline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4897:1: ( rule__Pipeline__Group__2__Impl rule__Pipeline__Group__3 )
            // InternalMyDsl.g:4898:2: rule__Pipeline__Group__2__Impl rule__Pipeline__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:4905:1: rule__Pipeline__Group__2__Impl : ( 'pipe' ) ;
    public final void rule__Pipeline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4909:1: ( ( 'pipe' ) )
            // InternalMyDsl.g:4910:1: ( 'pipe' )
            {
            // InternalMyDsl.g:4910:1: ( 'pipe' )
            // InternalMyDsl.g:4911:2: 'pipe'
            {
             before(grammarAccess.getPipelineAccess().getPipeKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getPipeKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:4920:1: rule__Pipeline__Group__3 : rule__Pipeline__Group__3__Impl rule__Pipeline__Group__4 ;
    public final void rule__Pipeline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4924:1: ( rule__Pipeline__Group__3__Impl rule__Pipeline__Group__4 )
            // InternalMyDsl.g:4925:2: rule__Pipeline__Group__3__Impl rule__Pipeline__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4932:1: rule__Pipeline__Group__3__Impl : ( '[' ) ;
    public final void rule__Pipeline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4936:1: ( ( '[' ) )
            // InternalMyDsl.g:4937:1: ( '[' )
            {
            // InternalMyDsl.g:4937:1: ( '[' )
            // InternalMyDsl.g:4938:2: '['
            {
             before(grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:4947:1: rule__Pipeline__Group__4 : rule__Pipeline__Group__4__Impl rule__Pipeline__Group__5 ;
    public final void rule__Pipeline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4951:1: ( rule__Pipeline__Group__4__Impl rule__Pipeline__Group__5 )
            // InternalMyDsl.g:4952:2: rule__Pipeline__Group__4__Impl rule__Pipeline__Group__5
            {
            pushFollow(FOLLOW_53);
            rule__Pipeline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__5();

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
    // InternalMyDsl.g:4959:1: rule__Pipeline__Group__4__Impl : ( ( rule__Pipeline__Group_4__0 ) ) ;
    public final void rule__Pipeline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4963:1: ( ( ( rule__Pipeline__Group_4__0 ) ) )
            // InternalMyDsl.g:4964:1: ( ( rule__Pipeline__Group_4__0 ) )
            {
            // InternalMyDsl.g:4964:1: ( ( rule__Pipeline__Group_4__0 ) )
            // InternalMyDsl.g:4965:2: ( rule__Pipeline__Group_4__0 )
            {
             before(grammarAccess.getPipelineAccess().getGroup_4()); 
            // InternalMyDsl.g:4966:2: ( rule__Pipeline__Group_4__0 )
            // InternalMyDsl.g:4966:3: rule__Pipeline__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pipeline__Group__5"
    // InternalMyDsl.g:4974:1: rule__Pipeline__Group__5 : rule__Pipeline__Group__5__Impl rule__Pipeline__Group__6 ;
    public final void rule__Pipeline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4978:1: ( rule__Pipeline__Group__5__Impl rule__Pipeline__Group__6 )
            // InternalMyDsl.g:4979:2: rule__Pipeline__Group__5__Impl rule__Pipeline__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Pipeline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__6();

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
    // $ANTLR end "rule__Pipeline__Group__5"


    // $ANTLR start "rule__Pipeline__Group__5__Impl"
    // InternalMyDsl.g:4986:1: rule__Pipeline__Group__5__Impl : ( ']' ) ;
    public final void rule__Pipeline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4990:1: ( ( ']' ) )
            // InternalMyDsl.g:4991:1: ( ']' )
            {
            // InternalMyDsl.g:4991:1: ( ']' )
            // InternalMyDsl.g:4992:2: ']'
            {
             before(grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__5__Impl"


    // $ANTLR start "rule__Pipeline__Group__6"
    // InternalMyDsl.g:5001:1: rule__Pipeline__Group__6 : rule__Pipeline__Group__6__Impl ;
    public final void rule__Pipeline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5005:1: ( rule__Pipeline__Group__6__Impl )
            // InternalMyDsl.g:5006:2: rule__Pipeline__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group__6__Impl();

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
    // $ANTLR end "rule__Pipeline__Group__6"


    // $ANTLR start "rule__Pipeline__Group__6__Impl"
    // InternalMyDsl.g:5012:1: rule__Pipeline__Group__6__Impl : ( ';' ) ;
    public final void rule__Pipeline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5016:1: ( ( ';' ) )
            // InternalMyDsl.g:5017:1: ( ';' )
            {
            // InternalMyDsl.g:5017:1: ( ';' )
            // InternalMyDsl.g:5018:2: ';'
            {
             before(grammarAccess.getPipelineAccess().getSemicolonKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group__6__Impl"


    // $ANTLR start "rule__Pipeline__Group_4__0"
    // InternalMyDsl.g:5028:1: rule__Pipeline__Group_4__0 : rule__Pipeline__Group_4__0__Impl rule__Pipeline__Group_4__1 ;
    public final void rule__Pipeline__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5032:1: ( rule__Pipeline__Group_4__0__Impl rule__Pipeline__Group_4__1 )
            // InternalMyDsl.g:5033:2: rule__Pipeline__Group_4__0__Impl rule__Pipeline__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Pipeline__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4__1();

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
    // $ANTLR end "rule__Pipeline__Group_4__0"


    // $ANTLR start "rule__Pipeline__Group_4__0__Impl"
    // InternalMyDsl.g:5040:1: rule__Pipeline__Group_4__0__Impl : ( ( rule__Pipeline__TransformationAssignment_4_0 ) ) ;
    public final void rule__Pipeline__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5044:1: ( ( ( rule__Pipeline__TransformationAssignment_4_0 ) ) )
            // InternalMyDsl.g:5045:1: ( ( rule__Pipeline__TransformationAssignment_4_0 ) )
            {
            // InternalMyDsl.g:5045:1: ( ( rule__Pipeline__TransformationAssignment_4_0 ) )
            // InternalMyDsl.g:5046:2: ( rule__Pipeline__TransformationAssignment_4_0 )
            {
             before(grammarAccess.getPipelineAccess().getTransformationAssignment_4_0()); 
            // InternalMyDsl.g:5047:2: ( rule__Pipeline__TransformationAssignment_4_0 )
            // InternalMyDsl.g:5047:3: rule__Pipeline__TransformationAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__TransformationAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getTransformationAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_4__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_4__1"
    // InternalMyDsl.g:5055:1: rule__Pipeline__Group_4__1 : rule__Pipeline__Group_4__1__Impl rule__Pipeline__Group_4__2 ;
    public final void rule__Pipeline__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5059:1: ( rule__Pipeline__Group_4__1__Impl rule__Pipeline__Group_4__2 )
            // InternalMyDsl.g:5060:2: rule__Pipeline__Group_4__1__Impl rule__Pipeline__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__Pipeline__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4__2();

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
    // $ANTLR end "rule__Pipeline__Group_4__1"


    // $ANTLR start "rule__Pipeline__Group_4__1__Impl"
    // InternalMyDsl.g:5067:1: rule__Pipeline__Group_4__1__Impl : ( ( rule__Pipeline__Group_4_1__0 )* ) ;
    public final void rule__Pipeline__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5071:1: ( ( ( rule__Pipeline__Group_4_1__0 )* ) )
            // InternalMyDsl.g:5072:1: ( ( rule__Pipeline__Group_4_1__0 )* )
            {
            // InternalMyDsl.g:5072:1: ( ( rule__Pipeline__Group_4_1__0 )* )
            // InternalMyDsl.g:5073:2: ( rule__Pipeline__Group_4_1__0 )*
            {
             before(grammarAccess.getPipelineAccess().getGroup_4_1()); 
            // InternalMyDsl.g:5074:2: ( rule__Pipeline__Group_4_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==37||LA34_1==46||LA34_1==52||(LA34_1>=54 && LA34_1<=55)||LA34_1==57) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:5074:3: rule__Pipeline__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Pipeline__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getPipelineAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_4__1__Impl"


    // $ANTLR start "rule__Pipeline__Group_4__2"
    // InternalMyDsl.g:5082:1: rule__Pipeline__Group_4__2 : rule__Pipeline__Group_4__2__Impl ;
    public final void rule__Pipeline__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5086:1: ( rule__Pipeline__Group_4__2__Impl )
            // InternalMyDsl.g:5087:2: rule__Pipeline__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4__2__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_4__2"


    // $ANTLR start "rule__Pipeline__Group_4__2__Impl"
    // InternalMyDsl.g:5093:1: rule__Pipeline__Group_4__2__Impl : ( ( ',' )? ) ;
    public final void rule__Pipeline__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5097:1: ( ( ( ',' )? ) )
            // InternalMyDsl.g:5098:1: ( ( ',' )? )
            {
            // InternalMyDsl.g:5098:1: ( ( ',' )? )
            // InternalMyDsl.g:5099:2: ( ',' )?
            {
             before(grammarAccess.getPipelineAccess().getCommaKeyword_4_2()); 
            // InternalMyDsl.g:5100:2: ( ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:5100:3: ','
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPipelineAccess().getCommaKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_4__2__Impl"


    // $ANTLR start "rule__Pipeline__Group_4_1__0"
    // InternalMyDsl.g:5109:1: rule__Pipeline__Group_4_1__0 : rule__Pipeline__Group_4_1__0__Impl rule__Pipeline__Group_4_1__1 ;
    public final void rule__Pipeline__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5113:1: ( rule__Pipeline__Group_4_1__0__Impl rule__Pipeline__Group_4_1__1 )
            // InternalMyDsl.g:5114:2: rule__Pipeline__Group_4_1__0__Impl rule__Pipeline__Group_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Pipeline__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4_1__1();

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
    // $ANTLR end "rule__Pipeline__Group_4_1__0"


    // $ANTLR start "rule__Pipeline__Group_4_1__0__Impl"
    // InternalMyDsl.g:5121:1: rule__Pipeline__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Pipeline__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5125:1: ( ( ',' ) )
            // InternalMyDsl.g:5126:1: ( ',' )
            {
            // InternalMyDsl.g:5126:1: ( ',' )
            // InternalMyDsl.g:5127:2: ','
            {
             before(grammarAccess.getPipelineAccess().getCommaKeyword_4_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_4_1__0__Impl"


    // $ANTLR start "rule__Pipeline__Group_4_1__1"
    // InternalMyDsl.g:5136:1: rule__Pipeline__Group_4_1__1 : rule__Pipeline__Group_4_1__1__Impl ;
    public final void rule__Pipeline__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5140:1: ( rule__Pipeline__Group_4_1__1__Impl )
            // InternalMyDsl.g:5141:2: rule__Pipeline__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Pipeline__Group_4_1__1"


    // $ANTLR start "rule__Pipeline__Group_4_1__1__Impl"
    // InternalMyDsl.g:5147:1: rule__Pipeline__Group_4_1__1__Impl : ( ( rule__Pipeline__TransformationAssignment_4_1_1 ) ) ;
    public final void rule__Pipeline__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5151:1: ( ( ( rule__Pipeline__TransformationAssignment_4_1_1 ) ) )
            // InternalMyDsl.g:5152:1: ( ( rule__Pipeline__TransformationAssignment_4_1_1 ) )
            {
            // InternalMyDsl.g:5152:1: ( ( rule__Pipeline__TransformationAssignment_4_1_1 ) )
            // InternalMyDsl.g:5153:2: ( rule__Pipeline__TransformationAssignment_4_1_1 )
            {
             before(grammarAccess.getPipelineAccess().getTransformationAssignment_4_1_1()); 
            // InternalMyDsl.g:5154:2: ( rule__Pipeline__TransformationAssignment_4_1_1 )
            // InternalMyDsl.g:5154:3: rule__Pipeline__TransformationAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Pipeline__TransformationAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPipelineAccess().getTransformationAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__Group_4_1__1__Impl"


    // $ANTLR start "rule__Export__Group__0"
    // InternalMyDsl.g:5163:1: rule__Export__Group__0 : rule__Export__Group__0__Impl rule__Export__Group__1 ;
    public final void rule__Export__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5167:1: ( rule__Export__Group__0__Impl rule__Export__Group__1 )
            // InternalMyDsl.g:5168:2: rule__Export__Group__0__Impl rule__Export__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalMyDsl.g:5175:1: rule__Export__Group__0__Impl : ( 'export' ) ;
    public final void rule__Export__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5179:1: ( ( 'export' ) )
            // InternalMyDsl.g:5180:1: ( 'export' )
            {
            // InternalMyDsl.g:5180:1: ( 'export' )
            // InternalMyDsl.g:5181:2: 'export'
            {
             before(grammarAccess.getExportAccess().getExportKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:5190:1: rule__Export__Group__1 : rule__Export__Group__1__Impl rule__Export__Group__2 ;
    public final void rule__Export__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5194:1: ( rule__Export__Group__1__Impl rule__Export__Group__2 )
            // InternalMyDsl.g:5195:2: rule__Export__Group__1__Impl rule__Export__Group__2
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
    // InternalMyDsl.g:5202:1: rule__Export__Group__1__Impl : ( ( rule__Export__TableAssignment_1 ) ) ;
    public final void rule__Export__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5206:1: ( ( ( rule__Export__TableAssignment_1 ) ) )
            // InternalMyDsl.g:5207:1: ( ( rule__Export__TableAssignment_1 ) )
            {
            // InternalMyDsl.g:5207:1: ( ( rule__Export__TableAssignment_1 ) )
            // InternalMyDsl.g:5208:2: ( rule__Export__TableAssignment_1 )
            {
             before(grammarAccess.getExportAccess().getTableAssignment_1()); 
            // InternalMyDsl.g:5209:2: ( rule__Export__TableAssignment_1 )
            // InternalMyDsl.g:5209:3: rule__Export__TableAssignment_1
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
    // InternalMyDsl.g:5217:1: rule__Export__Group__2 : rule__Export__Group__2__Impl rule__Export__Group__3 ;
    public final void rule__Export__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5221:1: ( rule__Export__Group__2__Impl rule__Export__Group__3 )
            // InternalMyDsl.g:5222:2: rule__Export__Group__2__Impl rule__Export__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:5229:1: rule__Export__Group__2__Impl : ( 'to' ) ;
    public final void rule__Export__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5233:1: ( ( 'to' ) )
            // InternalMyDsl.g:5234:1: ( 'to' )
            {
            // InternalMyDsl.g:5234:1: ( 'to' )
            // InternalMyDsl.g:5235:2: 'to'
            {
             before(grammarAccess.getExportAccess().getToKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:5244:1: rule__Export__Group__3 : rule__Export__Group__3__Impl rule__Export__Group__4 ;
    public final void rule__Export__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5248:1: ( rule__Export__Group__3__Impl rule__Export__Group__4 )
            // InternalMyDsl.g:5249:2: rule__Export__Group__3__Impl rule__Export__Group__4
            {
            pushFollow(FOLLOW_55);
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
    // InternalMyDsl.g:5256:1: rule__Export__Group__3__Impl : ( ( rule__Export__PathAssignment_3 ) ) ;
    public final void rule__Export__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5260:1: ( ( ( rule__Export__PathAssignment_3 ) ) )
            // InternalMyDsl.g:5261:1: ( ( rule__Export__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:5261:1: ( ( rule__Export__PathAssignment_3 ) )
            // InternalMyDsl.g:5262:2: ( rule__Export__PathAssignment_3 )
            {
             before(grammarAccess.getExportAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:5263:2: ( rule__Export__PathAssignment_3 )
            // InternalMyDsl.g:5263:3: rule__Export__PathAssignment_3
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
    // InternalMyDsl.g:5271:1: rule__Export__Group__4 : rule__Export__Group__4__Impl rule__Export__Group__5 ;
    public final void rule__Export__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5275:1: ( rule__Export__Group__4__Impl rule__Export__Group__5 )
            // InternalMyDsl.g:5276:2: rule__Export__Group__4__Impl rule__Export__Group__5
            {
            pushFollow(FOLLOW_56);
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
    // InternalMyDsl.g:5283:1: rule__Export__Group__4__Impl : ( 'as' ) ;
    public final void rule__Export__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5287:1: ( ( 'as' ) )
            // InternalMyDsl.g:5288:1: ( 'as' )
            {
            // InternalMyDsl.g:5288:1: ( 'as' )
            // InternalMyDsl.g:5289:2: 'as'
            {
             before(grammarAccess.getExportAccess().getAsKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:5298:1: rule__Export__Group__5 : rule__Export__Group__5__Impl rule__Export__Group__6 ;
    public final void rule__Export__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5302:1: ( rule__Export__Group__5__Impl rule__Export__Group__6 )
            // InternalMyDsl.g:5303:2: rule__Export__Group__5__Impl rule__Export__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:5310:1: rule__Export__Group__5__Impl : ( ( rule__Export__OutputAssignment_5 ) ) ;
    public final void rule__Export__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5314:1: ( ( ( rule__Export__OutputAssignment_5 ) ) )
            // InternalMyDsl.g:5315:1: ( ( rule__Export__OutputAssignment_5 ) )
            {
            // InternalMyDsl.g:5315:1: ( ( rule__Export__OutputAssignment_5 ) )
            // InternalMyDsl.g:5316:2: ( rule__Export__OutputAssignment_5 )
            {
             before(grammarAccess.getExportAccess().getOutputAssignment_5()); 
            // InternalMyDsl.g:5317:2: ( rule__Export__OutputAssignment_5 )
            // InternalMyDsl.g:5317:3: rule__Export__OutputAssignment_5
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
    // InternalMyDsl.g:5325:1: rule__Export__Group__6 : rule__Export__Group__6__Impl ;
    public final void rule__Export__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5329:1: ( rule__Export__Group__6__Impl )
            // InternalMyDsl.g:5330:2: rule__Export__Group__6__Impl
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
    // InternalMyDsl.g:5336:1: rule__Export__Group__6__Impl : ( ';' ) ;
    public final void rule__Export__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5340:1: ( ( ';' ) )
            // InternalMyDsl.g:5341:1: ( ';' )
            {
            // InternalMyDsl.g:5341:1: ( ';' )
            // InternalMyDsl.g:5342:2: ';'
            {
             before(grammarAccess.getExportAccess().getSemicolonKeyword_6()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__MyDsl__PipelinesAssignment_0"
    // InternalMyDsl.g:5352:1: rule__MyDsl__PipelinesAssignment_0 : ( rulePipeline ) ;
    public final void rule__MyDsl__PipelinesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5356:1: ( ( rulePipeline ) )
            // InternalMyDsl.g:5357:2: ( rulePipeline )
            {
            // InternalMyDsl.g:5357:2: ( rulePipeline )
            // InternalMyDsl.g:5358:3: rulePipeline
            {
             before(grammarAccess.getMyDslAccess().getPipelinesPipelineParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePipeline();

            state._fsp--;

             after(grammarAccess.getMyDslAccess().getPipelinesPipelineParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__PipelinesAssignment_0"


    // $ANTLR start "rule__MyDsl__SourcesAssignment_1"
    // InternalMyDsl.g:5367:1: rule__MyDsl__SourcesAssignment_1 : ( ruleSource ) ;
    public final void rule__MyDsl__SourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5371:1: ( ( ruleSource ) )
            // InternalMyDsl.g:5372:2: ( ruleSource )
            {
            // InternalMyDsl.g:5372:2: ( ruleSource )
            // InternalMyDsl.g:5373:3: ruleSource
            {
             before(grammarAccess.getMyDslAccess().getSourcesSourceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getMyDslAccess().getSourcesSourceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__SourcesAssignment_1"


    // $ANTLR start "rule__MyDsl__TablesAssignment_2"
    // InternalMyDsl.g:5382:1: rule__MyDsl__TablesAssignment_2 : ( ruleTable ) ;
    public final void rule__MyDsl__TablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5386:1: ( ( ruleTable ) )
            // InternalMyDsl.g:5387:2: ( ruleTable )
            {
            // InternalMyDsl.g:5387:2: ( ruleTable )
            // InternalMyDsl.g:5388:3: ruleTable
            {
             before(grammarAccess.getMyDslAccess().getTablesTableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getMyDslAccess().getTablesTableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__TablesAssignment_2"


    // $ANTLR start "rule__MyDsl__ExportAssignment_3"
    // InternalMyDsl.g:5397:1: rule__MyDsl__ExportAssignment_3 : ( ruleExport ) ;
    public final void rule__MyDsl__ExportAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5401:1: ( ( ruleExport ) )
            // InternalMyDsl.g:5402:2: ( ruleExport )
            {
            // InternalMyDsl.g:5402:2: ( ruleExport )
            // InternalMyDsl.g:5403:3: ruleExport
            {
             before(grammarAccess.getMyDslAccess().getExportExportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExport();

            state._fsp--;

             after(grammarAccess.getMyDslAccess().getExportExportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyDsl__ExportAssignment_3"


    // $ANTLR start "rule__CombinationOperations__OperationAssignment_0"
    // InternalMyDsl.g:5412:1: rule__CombinationOperations__OperationAssignment_0 : ( ( rule__CombinationOperations__OperationAlternatives_0_0 ) ) ;
    public final void rule__CombinationOperations__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5416:1: ( ( ( rule__CombinationOperations__OperationAlternatives_0_0 ) ) )
            // InternalMyDsl.g:5417:2: ( ( rule__CombinationOperations__OperationAlternatives_0_0 ) )
            {
            // InternalMyDsl.g:5417:2: ( ( rule__CombinationOperations__OperationAlternatives_0_0 ) )
            // InternalMyDsl.g:5418:3: ( rule__CombinationOperations__OperationAlternatives_0_0 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getOperationAlternatives_0_0()); 
            // InternalMyDsl.g:5419:3: ( rule__CombinationOperations__OperationAlternatives_0_0 )
            // InternalMyDsl.g:5419:4: rule__CombinationOperations__OperationAlternatives_0_0
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
    // InternalMyDsl.g:5427:1: rule__CombinationOperations__TypeAssignment_1 : ( ( rule__CombinationOperations__TypeAlternatives_1_0 ) ) ;
    public final void rule__CombinationOperations__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5431:1: ( ( ( rule__CombinationOperations__TypeAlternatives_1_0 ) ) )
            // InternalMyDsl.g:5432:2: ( ( rule__CombinationOperations__TypeAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:5432:2: ( ( rule__CombinationOperations__TypeAlternatives_1_0 ) )
            // InternalMyDsl.g:5433:3: ( rule__CombinationOperations__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getCombinationOperationsAccess().getTypeAlternatives_1_0()); 
            // InternalMyDsl.g:5434:3: ( rule__CombinationOperations__TypeAlternatives_1_0 )
            // InternalMyDsl.g:5434:4: rule__CombinationOperations__TypeAlternatives_1_0
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
    // InternalMyDsl.g:5442:1: rule__CombinationOperations__TableOperationAssignment_3 : ( ruleTableOperations ) ;
    public final void rule__CombinationOperations__TableOperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5446:1: ( ( ruleTableOperations ) )
            // InternalMyDsl.g:5447:2: ( ruleTableOperations )
            {
            // InternalMyDsl.g:5447:2: ( ruleTableOperations )
            // InternalMyDsl.g:5448:3: ruleTableOperations
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
    // InternalMyDsl.g:5457:1: rule__CombinationOperations__TableOperationAssignment_4_1 : ( ruleTableOperations ) ;
    public final void rule__CombinationOperations__TableOperationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5461:1: ( ( ruleTableOperations ) )
            // InternalMyDsl.g:5462:2: ( ruleTableOperations )
            {
            // InternalMyDsl.g:5462:2: ( ruleTableOperations )
            // InternalMyDsl.g:5463:3: ruleTableOperations
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


    // $ANTLR start "rule__SourceOperation__SourceAssignment"
    // InternalMyDsl.g:5472:1: rule__SourceOperation__SourceAssignment : ( RULE_ID ) ;
    public final void rule__SourceOperation__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5476:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5477:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5477:2: ( RULE_ID )
            // InternalMyDsl.g:5478:3: RULE_ID
            {
             before(grammarAccess.getSourceOperationAccess().getSourceIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceOperationAccess().getSourceIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5487:1: rule__TransformationTableOperation__TransformationAssignment_1 : ( ruleTransformation ) ;
    public final void rule__TransformationTableOperation__TransformationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5491:1: ( ( ruleTransformation ) )
            // InternalMyDsl.g:5492:2: ( ruleTransformation )
            {
            // InternalMyDsl.g:5492:2: ( ruleTransformation )
            // InternalMyDsl.g:5493:3: ruleTransformation
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


    // $ANTLR start "rule__PipelineTableOperation__PipelineAssignment"
    // InternalMyDsl.g:5502:1: rule__PipelineTableOperation__PipelineAssignment : ( RULE_ID ) ;
    public final void rule__PipelineTableOperation__PipelineAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5506:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5507:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5507:2: ( RULE_ID )
            // InternalMyDsl.g:5508:3: RULE_ID
            {
             before(grammarAccess.getPipelineTableOperationAccess().getPipelineIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPipelineTableOperationAccess().getPipelineIDTerminalRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__TransformOperation__SourceAssignment_0"
    // InternalMyDsl.g:5517:1: rule__TransformOperation__SourceAssignment_0 : ( ruleSourceOperation ) ;
    public final void rule__TransformOperation__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5521:1: ( ( ruleSourceOperation ) )
            // InternalMyDsl.g:5522:2: ( ruleSourceOperation )
            {
            // InternalMyDsl.g:5522:2: ( ruleSourceOperation )
            // InternalMyDsl.g:5523:3: ruleSourceOperation
            {
             before(grammarAccess.getTransformOperationAccess().getSourceSourceOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceOperation();

            state._fsp--;

             after(grammarAccess.getTransformOperationAccess().getSourceSourceOperationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__SourceAssignment_0"


    // $ANTLR start "rule__TransformOperation__OperationAssignment_1_1"
    // InternalMyDsl.g:5532:1: rule__TransformOperation__OperationAssignment_1_1 : ( ( rule__TransformOperation__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__TransformOperation__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5536:1: ( ( ( rule__TransformOperation__OperationAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:5537:2: ( ( rule__TransformOperation__OperationAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:5537:2: ( ( rule__TransformOperation__OperationAlternatives_1_1_0 ) )
            // InternalMyDsl.g:5538:3: ( rule__TransformOperation__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getTransformOperationAccess().getOperationAlternatives_1_1_0()); 
            // InternalMyDsl.g:5539:3: ( rule__TransformOperation__OperationAlternatives_1_1_0 )
            // InternalMyDsl.g:5539:4: rule__TransformOperation__OperationAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TransformOperation__OperationAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformOperationAccess().getOperationAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransformOperation__OperationAssignment_1_1"


    // $ANTLR start "rule__Table__NameAssignment_0"
    // InternalMyDsl.g:5547:1: rule__Table__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5551:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5552:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5552:2: ( RULE_ID )
            // InternalMyDsl.g:5553:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_0"


    // $ANTLR start "rule__Table__OperationAssignment_2"
    // InternalMyDsl.g:5562:1: rule__Table__OperationAssignment_2 : ( ruleTableOperations ) ;
    public final void rule__Table__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5566:1: ( ( ruleTableOperations ) )
            // InternalMyDsl.g:5567:2: ( ruleTableOperations )
            {
            // InternalMyDsl.g:5567:2: ( ruleTableOperations )
            // InternalMyDsl.g:5568:3: ruleTableOperations
            {
             before(grammarAccess.getTableAccess().getOperationTableOperationsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTableOperations();

            state._fsp--;

             after(grammarAccess.getTableAccess().getOperationTableOperationsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__OperationAssignment_2"


    // $ANTLR start "rule__XmlType__PathAssignment_2_3"
    // InternalMyDsl.g:5577:1: rule__XmlType__PathAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__XmlType__PathAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5581:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5582:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5582:2: ( RULE_STRING )
            // InternalMyDsl.g:5583:3: RULE_STRING
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
    // InternalMyDsl.g:5592:1: rule__JsonType__PathAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__JsonType__PathAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5596:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5597:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5597:2: ( RULE_STRING )
            // InternalMyDsl.g:5598:3: RULE_STRING
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
    // InternalMyDsl.g:5607:1: rule__HtmlType__CssPathAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__HtmlType__CssPathAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5611:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5612:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5612:2: ( RULE_STRING )
            // InternalMyDsl.g:5613:3: RULE_STRING
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
    // InternalMyDsl.g:5622:1: rule__OutputType__TypeAssignment : ( ( rule__OutputType__TypeAlternatives_0 ) ) ;
    public final void rule__OutputType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5626:1: ( ( ( rule__OutputType__TypeAlternatives_0 ) ) )
            // InternalMyDsl.g:5627:2: ( ( rule__OutputType__TypeAlternatives_0 ) )
            {
            // InternalMyDsl.g:5627:2: ( ( rule__OutputType__TypeAlternatives_0 ) )
            // InternalMyDsl.g:5628:3: ( rule__OutputType__TypeAlternatives_0 )
            {
             before(grammarAccess.getOutputTypeAccess().getTypeAlternatives_0()); 
            // InternalMyDsl.g:5629:3: ( rule__OutputType__TypeAlternatives_0 )
            // InternalMyDsl.g:5629:4: rule__OutputType__TypeAlternatives_0
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
    // InternalMyDsl.g:5637:1: rule__MetaData__MetadataAssignment : ( ( rule__MetaData__MetadataAlternatives_0 ) ) ;
    public final void rule__MetaData__MetadataAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5641:1: ( ( ( rule__MetaData__MetadataAlternatives_0 ) ) )
            // InternalMyDsl.g:5642:2: ( ( rule__MetaData__MetadataAlternatives_0 ) )
            {
            // InternalMyDsl.g:5642:2: ( ( rule__MetaData__MetadataAlternatives_0 ) )
            // InternalMyDsl.g:5643:3: ( rule__MetaData__MetadataAlternatives_0 )
            {
             before(grammarAccess.getMetaDataAccess().getMetadataAlternatives_0()); 
            // InternalMyDsl.g:5644:3: ( rule__MetaData__MetadataAlternatives_0 )
            // InternalMyDsl.g:5644:4: rule__MetaData__MetadataAlternatives_0
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
    // InternalMyDsl.g:5652:1: rule__SourceStore__MetadataAssignment_1 : ( ruleMetaData ) ;
    public final void rule__SourceStore__MetadataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5656:1: ( ( ruleMetaData ) )
            // InternalMyDsl.g:5657:2: ( ruleMetaData )
            {
            // InternalMyDsl.g:5657:2: ( ruleMetaData )
            // InternalMyDsl.g:5658:3: ruleMetaData
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
    // InternalMyDsl.g:5667:1: rule__SourceStore__ColumnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SourceStore__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5671:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5672:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5672:2: ( RULE_STRING )
            // InternalMyDsl.g:5673:3: RULE_STRING
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
    // InternalMyDsl.g:5682:1: rule__SourceCoumnSelect__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SourceCoumnSelect__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5686:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5687:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5687:2: ( RULE_STRING )
            // InternalMyDsl.g:5688:3: RULE_STRING
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
    // InternalMyDsl.g:5697:1: rule__SourceCoumnSelect__ColumnAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SourceCoumnSelect__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5701:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5702:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5702:2: ( RULE_STRING )
            // InternalMyDsl.g:5703:3: RULE_STRING
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


    // $ANTLR start "rule__Source__NameAssignment_0"
    // InternalMyDsl.g:5712:1: rule__Source__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Source__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5716:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5717:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5717:2: ( RULE_ID )
            // InternalMyDsl.g:5718:3: RULE_ID
            {
             before(grammarAccess.getSourceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__NameAssignment_0"


    // $ANTLR start "rule__Source__QueryAssignment_3"
    // InternalMyDsl.g:5727:1: rule__Source__QueryAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Source__QueryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5731:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5732:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5732:2: ( RULE_STRING )
            // InternalMyDsl.g:5733:3: RULE_STRING
            {
             before(grammarAccess.getSourceAccess().getQuerySTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getQuerySTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__QueryAssignment_3"


    // $ANTLR start "rule__Source__FilePathAssignment_5"
    // InternalMyDsl.g:5742:1: rule__Source__FilePathAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Source__FilePathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5746:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5747:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5747:2: ( RULE_STRING )
            // InternalMyDsl.g:5748:3: RULE_STRING
            {
             before(grammarAccess.getSourceAccess().getFilePathSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getFilePathSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__FilePathAssignment_5"


    // $ANTLR start "rule__Source__InputTypeAssignment_6_1"
    // InternalMyDsl.g:5757:1: rule__Source__InputTypeAssignment_6_1 : ( ruleInputType ) ;
    public final void rule__Source__InputTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5761:1: ( ( ruleInputType ) )
            // InternalMyDsl.g:5762:2: ( ruleInputType )
            {
            // InternalMyDsl.g:5762:2: ( ruleInputType )
            // InternalMyDsl.g:5763:3: ruleInputType
            {
             before(grammarAccess.getSourceAccess().getInputTypeInputTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputType();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getInputTypeInputTypeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__InputTypeAssignment_6_1"


    // $ANTLR start "rule__Source__StoreAssignment_7"
    // InternalMyDsl.g:5772:1: rule__Source__StoreAssignment_7 : ( ruleSourceStore ) ;
    public final void rule__Source__StoreAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5776:1: ( ( ruleSourceStore ) )
            // InternalMyDsl.g:5777:2: ( ruleSourceStore )
            {
            // InternalMyDsl.g:5777:2: ( ruleSourceStore )
            // InternalMyDsl.g:5778:3: ruleSourceStore
            {
             before(grammarAccess.getSourceAccess().getStoreSourceStoreParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceStore();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getStoreSourceStoreParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__StoreAssignment_7"


    // $ANTLR start "rule__Source__SelectAssignment_8"
    // InternalMyDsl.g:5787:1: rule__Source__SelectAssignment_8 : ( ruleSourceCoumnSelect ) ;
    public final void rule__Source__SelectAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5791:1: ( ( ruleSourceCoumnSelect ) )
            // InternalMyDsl.g:5792:2: ( ruleSourceCoumnSelect )
            {
            // InternalMyDsl.g:5792:2: ( ruleSourceCoumnSelect )
            // InternalMyDsl.g:5793:3: ruleSourceCoumnSelect
            {
             before(grammarAccess.getSourceAccess().getSelectSourceCoumnSelectParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceCoumnSelect();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getSelectSourceCoumnSelectParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__SelectAssignment_8"


    // $ANTLR start "rule__AppendPathTransformation__PathAssignment_2"
    // InternalMyDsl.g:5802:1: rule__AppendPathTransformation__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AppendPathTransformation__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5806:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5807:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5807:2: ( RULE_STRING )
            // InternalMyDsl.g:5808:3: RULE_STRING
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


    // $ANTLR start "rule__PathTransformation__ColumnAssignment_1"
    // InternalMyDsl.g:5817:1: rule__PathTransformation__ColumnAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PathTransformation__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5821:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5822:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5822:2: ( RULE_STRING )
            // InternalMyDsl.g:5823:3: RULE_STRING
            {
             before(grammarAccess.getPathTransformationAccess().getColumnSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPathTransformationAccess().getColumnSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__ColumnAssignment_1"


    // $ANTLR start "rule__PathTransformation__OperationAssignment_2"
    // InternalMyDsl.g:5832:1: rule__PathTransformation__OperationAssignment_2 : ( ( rule__PathTransformation__OperationAlternatives_2_0 ) ) ;
    public final void rule__PathTransformation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5836:1: ( ( ( rule__PathTransformation__OperationAlternatives_2_0 ) ) )
            // InternalMyDsl.g:5837:2: ( ( rule__PathTransformation__OperationAlternatives_2_0 ) )
            {
            // InternalMyDsl.g:5837:2: ( ( rule__PathTransformation__OperationAlternatives_2_0 ) )
            // InternalMyDsl.g:5838:3: ( rule__PathTransformation__OperationAlternatives_2_0 )
            {
             before(grammarAccess.getPathTransformationAccess().getOperationAlternatives_2_0()); 
            // InternalMyDsl.g:5839:3: ( rule__PathTransformation__OperationAlternatives_2_0 )
            // InternalMyDsl.g:5839:4: rule__PathTransformation__OperationAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PathTransformation__OperationAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPathTransformationAccess().getOperationAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTransformation__OperationAssignment_2"


    // $ANTLR start "rule__FoldMaxTranformation__ColumnAssignment_1"
    // InternalMyDsl.g:5847:1: rule__FoldMaxTranformation__ColumnAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FoldMaxTranformation__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5851:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5852:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5852:2: ( RULE_STRING )
            // InternalMyDsl.g:5853:3: RULE_STRING
            {
             before(grammarAccess.getFoldMaxTranformationAccess().getColumnSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFoldMaxTranformationAccess().getColumnSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoldMaxTranformation__ColumnAssignment_1"


    // $ANTLR start "rule__GroupBy__ColumnAssignment_2"
    // InternalMyDsl.g:5862:1: rule__GroupBy__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GroupBy__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5866:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5867:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5867:2: ( RULE_STRING )
            // InternalMyDsl.g:5868:3: RULE_STRING
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
    // InternalMyDsl.g:5877:1: rule__FoldTransformation__OperationAssignment_0 : ( ( rule__FoldTransformation__OperationAlternatives_0_0 ) ) ;
    public final void rule__FoldTransformation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5881:1: ( ( ( rule__FoldTransformation__OperationAlternatives_0_0 ) ) )
            // InternalMyDsl.g:5882:2: ( ( rule__FoldTransformation__OperationAlternatives_0_0 ) )
            {
            // InternalMyDsl.g:5882:2: ( ( rule__FoldTransformation__OperationAlternatives_0_0 ) )
            // InternalMyDsl.g:5883:3: ( rule__FoldTransformation__OperationAlternatives_0_0 )
            {
             before(grammarAccess.getFoldTransformationAccess().getOperationAlternatives_0_0()); 
            // InternalMyDsl.g:5884:3: ( rule__FoldTransformation__OperationAlternatives_0_0 )
            // InternalMyDsl.g:5884:4: rule__FoldTransformation__OperationAlternatives_0_0
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
    // InternalMyDsl.g:5892:1: rule__FoldTransformation__GroupByAssignment_1 : ( ruleGroupBy ) ;
    public final void rule__FoldTransformation__GroupByAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5896:1: ( ( ruleGroupBy ) )
            // InternalMyDsl.g:5897:2: ( ruleGroupBy )
            {
            // InternalMyDsl.g:5897:2: ( ruleGroupBy )
            // InternalMyDsl.g:5898:3: ruleGroupBy
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
    // InternalMyDsl.g:5907:1: rule__AddColumnTransformation__ColumnAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AddColumnTransformation__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5911:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5912:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5912:2: ( RULE_STRING )
            // InternalMyDsl.g:5913:3: RULE_STRING
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
    // InternalMyDsl.g:5922:1: rule__AddColumnTransformation__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AddColumnTransformation__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5926:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5927:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5927:2: ( RULE_STRING )
            // InternalMyDsl.g:5928:3: RULE_STRING
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
    // InternalMyDsl.g:5937:1: rule__RemoveColumnTransformation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RemoveColumnTransformation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5941:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5942:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5942:2: ( RULE_STRING )
            // InternalMyDsl.g:5943:3: RULE_STRING
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
    // InternalMyDsl.g:5952:1: rule__RemoveColumnTransformation__ColumnAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RemoveColumnTransformation__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5956:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5957:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5957:2: ( RULE_STRING )
            // InternalMyDsl.g:5958:3: RULE_STRING
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


    // $ANTLR start "rule__RenameColumnTransformation__FromAssignment_1"
    // InternalMyDsl.g:5967:1: rule__RenameColumnTransformation__FromAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RenameColumnTransformation__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5971:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5972:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5972:2: ( RULE_STRING )
            // InternalMyDsl.g:5973:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getFromSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnTransformationAccess().getFromSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__FromAssignment_1"


    // $ANTLR start "rule__RenameColumnTransformation__ToAssignment_3"
    // InternalMyDsl.g:5982:1: rule__RenameColumnTransformation__ToAssignment_3 : ( RULE_STRING ) ;
    public final void rule__RenameColumnTransformation__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5986:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5987:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5987:2: ( RULE_STRING )
            // InternalMyDsl.g:5988:3: RULE_STRING
            {
             before(grammarAccess.getRenameColumnTransformationAccess().getToSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRenameColumnTransformationAccess().getToSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameColumnTransformation__ToAssignment_3"


    // $ANTLR start "rule__SelectColumnTransformation__ColumnAssignment_2"
    // InternalMyDsl.g:5997:1: rule__SelectColumnTransformation__ColumnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SelectColumnTransformation__ColumnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6001:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:6002:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:6002:2: ( RULE_STRING )
            // InternalMyDsl.g:6003:3: RULE_STRING
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
    // InternalMyDsl.g:6012:1: rule__SelectColumnTransformation__ColumnAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SelectColumnTransformation__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6016:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:6017:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:6017:2: ( RULE_STRING )
            // InternalMyDsl.g:6018:3: RULE_STRING
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


    // $ANTLR start "rule__Pipeline__NameAssignment_0"
    // InternalMyDsl.g:6027:1: rule__Pipeline__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Pipeline__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6031:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6032:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6032:2: ( RULE_ID )
            // InternalMyDsl.g:6033:3: RULE_ID
            {
             before(grammarAccess.getPipelineAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPipelineAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__NameAssignment_0"


    // $ANTLR start "rule__Pipeline__TransformationAssignment_4_0"
    // InternalMyDsl.g:6042:1: rule__Pipeline__TransformationAssignment_4_0 : ( ruleTransformation ) ;
    public final void rule__Pipeline__TransformationAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6046:1: ( ( ruleTransformation ) )
            // InternalMyDsl.g:6047:2: ( ruleTransformation )
            {
            // InternalMyDsl.g:6047:2: ( ruleTransformation )
            // InternalMyDsl.g:6048:3: ruleTransformation
            {
             before(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__TransformationAssignment_4_0"


    // $ANTLR start "rule__Pipeline__TransformationAssignment_4_1_1"
    // InternalMyDsl.g:6057:1: rule__Pipeline__TransformationAssignment_4_1_1 : ( ruleTransformation ) ;
    public final void rule__Pipeline__TransformationAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6061:1: ( ( ruleTransformation ) )
            // InternalMyDsl.g:6062:2: ( ruleTransformation )
            {
            // InternalMyDsl.g:6062:2: ( ruleTransformation )
            // InternalMyDsl.g:6063:3: ruleTransformation
            {
             before(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pipeline__TransformationAssignment_4_1_1"


    // $ANTLR start "rule__Export__TableAssignment_1"
    // InternalMyDsl.g:6072:1: rule__Export__TableAssignment_1 : ( RULE_ID ) ;
    public final void rule__Export__TableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6076:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6077:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6077:2: ( RULE_ID )
            // InternalMyDsl.g:6078:3: RULE_ID
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
    // InternalMyDsl.g:6087:1: rule__Export__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Export__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6091:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:6092:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:6092:2: ( RULE_STRING )
            // InternalMyDsl.g:6093:3: RULE_STRING
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
    // InternalMyDsl.g:6102:1: rule__Export__OutputAssignment_5 : ( ruleOutputType ) ;
    public final void rule__Export__OutputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6106:1: ( ( ruleOutputType ) )
            // InternalMyDsl.g:6107:2: ( ruleOutputType )
            {
            // InternalMyDsl.g:6107:2: ( ruleOutputType )
            // InternalMyDsl.g:6108:3: ruleOutputType
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x02D0402000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000025001000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000003A2000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000140000001000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000402000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00000007A2000000L});

}