package pt.up.fe.els2023.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.up.fe.els2023.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'merge'", "'append'", "'union'", "'intersection'", "'['", "','", "']'", "'('", "')'", "'apply'", "';'", "'xml'", "'{'", "'xpath'", "'}'", "'json'", "'jsonpath'", "'yaml'", "'csv'", "'auto'", "'html'", "'css'", "'filepath'", "'lastmodified'", "'store'", "'in'", "'select'", "'import'", "'from'", "'as'", "'canonicalize'", "'path'", "'name'", "'of'", "'fold'", "'average'", "'sum'", "'group'", "'by'", "'add'", "'with'", "'remove'", "'rename'", "'regex'", "'to'", "'round'", "'digits'", "'set'", "'value'", "'at'", "'column'", "'row'", "'skip'", "'groupby'", "'sort'", "'descending'", "'ascending'", "'pipe'", "'export'"
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

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MyDsl";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMyDsl"
    // InternalDsl.g:64:1: entryRuleMyDsl returns [EObject current=null] : iv_ruleMyDsl= ruleMyDsl EOF ;
    public final EObject entryRuleMyDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyDsl = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleMyDsl= ruleMyDsl EOF )
            // InternalDsl.g:65:2: iv_ruleMyDsl= ruleMyDsl EOF
            {
             newCompositeNode(grammarAccess.getMyDslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyDsl=ruleMyDsl();

            state._fsp--;

             current =iv_ruleMyDsl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyDsl"


    // $ANTLR start "ruleMyDsl"
    // InternalDsl.g:71:1: ruleMyDsl returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleAssignment ) )* ( (lv_export_1_0= ruleExport ) )* ) ;
    public final EObject ruleMyDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;

        EObject lv_export_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( ( (lv_assignment_0_0= ruleAssignment ) )* ( (lv_export_1_0= ruleExport ) )* ) )
            // InternalDsl.g:78:2: ( ( (lv_assignment_0_0= ruleAssignment ) )* ( (lv_export_1_0= ruleExport ) )* )
            {
            // InternalDsl.g:78:2: ( ( (lv_assignment_0_0= ruleAssignment ) )* ( (lv_export_1_0= ruleExport ) )* )
            // InternalDsl.g:79:3: ( (lv_assignment_0_0= ruleAssignment ) )* ( (lv_export_1_0= ruleExport ) )*
            {
            // InternalDsl.g:79:3: ( (lv_assignment_0_0= ruleAssignment ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:80:4: (lv_assignment_0_0= ruleAssignment )
            	    {
            	    // InternalDsl.g:80:4: (lv_assignment_0_0= ruleAssignment )
            	    // InternalDsl.g:81:5: lv_assignment_0_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getMyDslAccess().getAssignmentAssignmentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_assignment_0_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMyDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignment",
            	    						lv_assignment_0_0,
            	    						"pt.up.fe.els2023.Dsl.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:98:3: ( (lv_export_1_0= ruleExport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==70) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:99:4: (lv_export_1_0= ruleExport )
            	    {
            	    // InternalDsl.g:99:4: (lv_export_1_0= ruleExport )
            	    // InternalDsl.g:100:5: lv_export_1_0= ruleExport
            	    {

            	    					newCompositeNode(grammarAccess.getMyDslAccess().getExportExportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_export_1_0=ruleExport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMyDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"export",
            	    						lv_export_1_0,
            	    						"pt.up.fe.els2023.Dsl.Export");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyDsl"


    // $ANTLR start "entryRuleAssignment"
    // InternalDsl.g:121:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalDsl.g:121:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalDsl.g:122:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalDsl.g:128:1: ruleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_1 = null;

        EObject lv_expression_2_2 = null;

        EObject lv_expression_2_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:134:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable ) ) ) ) )
            // InternalDsl.g:135:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable ) ) ) )
            {
            // InternalDsl.g:135:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable ) ) ) )
            // InternalDsl.g:136:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable ) ) )
            {
            // InternalDsl.g:136:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:137:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:137:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:138:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalDsl.g:158:3: ( ( (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable ) ) )
            // InternalDsl.g:159:4: ( (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable ) )
            {
            // InternalDsl.g:159:4: ( (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable ) )
            // InternalDsl.g:160:5: (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable )
            {
            // InternalDsl.g:160:5: (lv_expression_2_1= rulePipeline | lv_expression_2_2= ruleSource | lv_expression_2_3= ruleTable )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt3=1;
                }
                break;
            case 39:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case 12:
            case 13:
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:161:6: lv_expression_2_1= rulePipeline
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionPipelineParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_1=rulePipeline();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_1,
                    							"pt.up.fe.els2023.Dsl.Pipeline");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:177:6: lv_expression_2_2= ruleSource
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionSourceParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_2=ruleSource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_2,
                    							"pt.up.fe.els2023.Dsl.Source");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalDsl.g:193:6: lv_expression_2_3= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionTableParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_3=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_3,
                    							"pt.up.fe.els2023.Dsl.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleCombinationOperations"
    // InternalDsl.g:215:1: entryRuleCombinationOperations returns [EObject current=null] : iv_ruleCombinationOperations= ruleCombinationOperations EOF ;
    public final EObject entryRuleCombinationOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinationOperations = null;


        try {
            // InternalDsl.g:215:62: (iv_ruleCombinationOperations= ruleCombinationOperations EOF )
            // InternalDsl.g:216:2: iv_ruleCombinationOperations= ruleCombinationOperations EOF
            {
             newCompositeNode(grammarAccess.getCombinationOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCombinationOperations=ruleCombinationOperations();

            state._fsp--;

             current =iv_ruleCombinationOperations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCombinationOperations"


    // $ANTLR start "ruleCombinationOperations"
    // InternalDsl.g:222:1: ruleCombinationOperations returns [EObject current=null] : ( ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ) ;
    public final EObject ruleCombinationOperations() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_1=null;
        Token lv_operation_0_2=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_tableOperation_3_0 = null;

        EObject lv_tableOperation_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:228:2: ( ( ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ) )
            // InternalDsl.g:229:2: ( ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']' )
            {
            // InternalDsl.g:229:2: ( ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']' )
            // InternalDsl.g:230:3: ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']'
            {
            // InternalDsl.g:230:3: ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) )
            // InternalDsl.g:231:4: ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) )
            {
            // InternalDsl.g:231:4: ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) )
            // InternalDsl.g:232:5: (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' )
            {
            // InternalDsl.g:232:5: (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:233:6: lv_operation_0_1= 'merge'
                    {
                    lv_operation_0_1=(Token)match(input,12,FOLLOW_7); 

                    						newLeafNode(lv_operation_0_1, grammarAccess.getCombinationOperationsAccess().getOperationMergeKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCombinationOperationsRule());
                    						}
                    						setWithLastConsumed(current, "operation", lv_operation_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:244:6: lv_operation_0_2= 'append'
                    {
                    lv_operation_0_2=(Token)match(input,13,FOLLOW_7); 

                    						newLeafNode(lv_operation_0_2, grammarAccess.getCombinationOperationsAccess().getOperationAppendKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCombinationOperationsRule());
                    						}
                    						setWithLastConsumed(current, "operation", lv_operation_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalDsl.g:257:3: ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:258:4: ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) )
                    {
                    // InternalDsl.g:258:4: ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) )
                    // InternalDsl.g:259:5: (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' )
                    {
                    // InternalDsl.g:259:5: (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==15) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDsl.g:260:6: lv_type_1_1= 'union'
                            {
                            lv_type_1_1=(Token)match(input,14,FOLLOW_8); 

                            						newLeafNode(lv_type_1_1, grammarAccess.getCombinationOperationsAccess().getTypeUnionKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCombinationOperationsRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:271:6: lv_type_1_2= 'intersection'
                            {
                            lv_type_1_2=(Token)match(input,15,FOLLOW_8); 

                            						newLeafNode(lv_type_1_2, grammarAccess.getCombinationOperationsAccess().getTypeIntersectionKeyword_1_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCombinationOperationsRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_1_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCombinationOperationsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDsl.g:288:3: ( (lv_tableOperation_3_0= ruleTableOperations ) )
            // InternalDsl.g:289:4: (lv_tableOperation_3_0= ruleTableOperations )
            {
            // InternalDsl.g:289:4: (lv_tableOperation_3_0= ruleTableOperations )
            // InternalDsl.g:290:5: lv_tableOperation_3_0= ruleTableOperations
            {

            					newCompositeNode(grammarAccess.getCombinationOperationsAccess().getTableOperationTableOperationsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_tableOperation_3_0=ruleTableOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCombinationOperationsRule());
            					}
            					add(
            						current,
            						"tableOperation",
            						lv_tableOperation_3_0,
            						"pt.up.fe.els2023.Dsl.TableOperations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:307:3: (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_ID||(LA7_1>=12 && LA7_1<=13)||LA7_1==19) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:308:4: otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCombinationOperationsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDsl.g:312:4: ( (lv_tableOperation_5_0= ruleTableOperations ) )
            	    // InternalDsl.g:313:5: (lv_tableOperation_5_0= ruleTableOperations )
            	    {
            	    // InternalDsl.g:313:5: (lv_tableOperation_5_0= ruleTableOperations )
            	    // InternalDsl.g:314:6: lv_tableOperation_5_0= ruleTableOperations
            	    {

            	    						newCompositeNode(grammarAccess.getCombinationOperationsAccess().getTableOperationTableOperationsParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_tableOperation_5_0=ruleTableOperations();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCombinationOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tableOperation",
            	    							lv_tableOperation_5_0,
            	    							"pt.up.fe.els2023.Dsl.TableOperations");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDsl.g:332:3: (otherlv_6= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:333:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getCombinationOperationsAccess().getCommaKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCombinationOperationsAccess().getRightSquareBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCombinationOperations"


    // $ANTLR start "entryRuleTableOperations"
    // InternalDsl.g:346:1: entryRuleTableOperations returns [EObject current=null] : iv_ruleTableOperations= ruleTableOperations EOF ;
    public final EObject entryRuleTableOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableOperations = null;


        try {
            // InternalDsl.g:346:56: (iv_ruleTableOperations= ruleTableOperations EOF )
            // InternalDsl.g:347:2: iv_ruleTableOperations= ruleTableOperations EOF
            {
             newCompositeNode(grammarAccess.getTableOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableOperations=ruleTableOperations();

            state._fsp--;

             current =iv_ruleTableOperations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableOperations"


    // $ANTLR start "ruleTableOperations"
    // InternalDsl.g:353:1: ruleTableOperations returns [EObject current=null] : ( ( ( (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations ) ) ) ( (lv_transformations_1_0= ruleTransformOperation ) )* ) ;
    public final EObject ruleTableOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_1 = null;

        EObject lv_operation_0_2 = null;

        EObject lv_transformations_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:359:2: ( ( ( ( (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations ) ) ) ( (lv_transformations_1_0= ruleTransformOperation ) )* ) )
            // InternalDsl.g:360:2: ( ( ( (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations ) ) ) ( (lv_transformations_1_0= ruleTransformOperation ) )* )
            {
            // InternalDsl.g:360:2: ( ( ( (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations ) ) ) ( (lv_transformations_1_0= ruleTransformOperation ) )* )
            // InternalDsl.g:361:3: ( ( (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations ) ) ) ( (lv_transformations_1_0= ruleTransformOperation ) )*
            {
            // InternalDsl.g:361:3: ( ( (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations ) ) )
            // InternalDsl.g:362:4: ( (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations ) )
            {
            // InternalDsl.g:362:4: ( (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations ) )
            // InternalDsl.g:363:5: (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations )
            {
            // InternalDsl.g:363:5: (lv_operation_0_1= ruleSourceOperation | lv_operation_0_2= ruleCombinationOperations )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==19) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=12 && LA9_0<=13)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:364:6: lv_operation_0_1= ruleSourceOperation
                    {

                    						newCompositeNode(grammarAccess.getTableOperationsAccess().getOperationSourceOperationParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operation_0_1=ruleSourceOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableOperationsRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_1,
                    							"pt.up.fe.els2023.Dsl.SourceOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:380:6: lv_operation_0_2= ruleCombinationOperations
                    {

                    						newCompositeNode(grammarAccess.getTableOperationsAccess().getOperationCombinationOperationsParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operation_0_2=ruleCombinationOperations();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableOperationsRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_2,
                    							"pt.up.fe.els2023.Dsl.CombinationOperations");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalDsl.g:398:3: ( (lv_transformations_1_0= ruleTransformOperation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:399:4: (lv_transformations_1_0= ruleTransformOperation )
            	    {
            	    // InternalDsl.g:399:4: (lv_transformations_1_0= ruleTransformOperation )
            	    // InternalDsl.g:400:5: lv_transformations_1_0= ruleTransformOperation
            	    {

            	    					newCompositeNode(grammarAccess.getTableOperationsAccess().getTransformationsTransformOperationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_transformations_1_0=ruleTransformOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableOperationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transformations",
            	    						lv_transformations_1_0,
            	    						"pt.up.fe.els2023.Dsl.TransformOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableOperations"


    // $ANTLR start "entryRuleSelectSource"
    // InternalDsl.g:421:1: entryRuleSelectSource returns [EObject current=null] : iv_ruleSelectSource= ruleSelectSource EOF ;
    public final EObject entryRuleSelectSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectSource = null;


        try {
            // InternalDsl.g:421:53: (iv_ruleSelectSource= ruleSelectSource EOF )
            // InternalDsl.g:422:2: iv_ruleSelectSource= ruleSelectSource EOF
            {
             newCompositeNode(grammarAccess.getSelectSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectSource=ruleSelectSource();

            state._fsp--;

             current =iv_ruleSelectSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectSource"


    // $ANTLR start "ruleSelectSource"
    // InternalDsl.g:428:1: ruleSelectSource returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSelectSource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:434:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:435:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:435:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:436:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:436:3: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:437:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSelectSourceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSelectSourceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectSource"


    // $ANTLR start "entryRuleInlineSource"
    // InternalDsl.g:456:1: entryRuleInlineSource returns [EObject current=null] : iv_ruleInlineSource= ruleInlineSource EOF ;
    public final EObject entryRuleInlineSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineSource = null;


        try {
            // InternalDsl.g:456:53: (iv_ruleInlineSource= ruleInlineSource EOF )
            // InternalDsl.g:457:2: iv_ruleInlineSource= ruleInlineSource EOF
            {
             newCompositeNode(grammarAccess.getInlineSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineSource=ruleInlineSource();

            state._fsp--;

             current =iv_ruleInlineSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineSource"


    // $ANTLR start "ruleInlineSource"
    // InternalDsl.g:463:1: ruleInlineSource returns [EObject current=null] : (otherlv_0= '(' ( (lv_sourceExpr_1_0= ruleSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleInlineSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sourceExpr_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:469:2: ( (otherlv_0= '(' ( (lv_sourceExpr_1_0= ruleSource ) ) otherlv_2= ')' ) )
            // InternalDsl.g:470:2: (otherlv_0= '(' ( (lv_sourceExpr_1_0= ruleSource ) ) otherlv_2= ')' )
            {
            // InternalDsl.g:470:2: (otherlv_0= '(' ( (lv_sourceExpr_1_0= ruleSource ) ) otherlv_2= ')' )
            // InternalDsl.g:471:3: otherlv_0= '(' ( (lv_sourceExpr_1_0= ruleSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineSourceAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDsl.g:475:3: ( (lv_sourceExpr_1_0= ruleSource ) )
            // InternalDsl.g:476:4: (lv_sourceExpr_1_0= ruleSource )
            {
            // InternalDsl.g:476:4: (lv_sourceExpr_1_0= ruleSource )
            // InternalDsl.g:477:5: lv_sourceExpr_1_0= ruleSource
            {

            					newCompositeNode(grammarAccess.getInlineSourceAccess().getSourceExprSourceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_sourceExpr_1_0=ruleSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInlineSourceRule());
            					}
            					set(
            						current,
            						"sourceExpr",
            						lv_sourceExpr_1_0,
            						"pt.up.fe.els2023.Dsl.Source");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineSourceAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineSource"


    // $ANTLR start "entryRuleSourceOperation"
    // InternalDsl.g:502:1: entryRuleSourceOperation returns [EObject current=null] : iv_ruleSourceOperation= ruleSourceOperation EOF ;
    public final EObject entryRuleSourceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceOperation = null;


        try {
            // InternalDsl.g:502:56: (iv_ruleSourceOperation= ruleSourceOperation EOF )
            // InternalDsl.g:503:2: iv_ruleSourceOperation= ruleSourceOperation EOF
            {
             newCompositeNode(grammarAccess.getSourceOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceOperation=ruleSourceOperation();

            state._fsp--;

             current =iv_ruleSourceOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceOperation"


    // $ANTLR start "ruleSourceOperation"
    // InternalDsl.g:509:1: ruleSourceOperation returns [EObject current=null] : ( ( (lv_source_0_1= ruleSelectSource | lv_source_0_2= ruleInlineSource ) ) ) ;
    public final EObject ruleSourceOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_1 = null;

        EObject lv_source_0_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:515:2: ( ( ( (lv_source_0_1= ruleSelectSource | lv_source_0_2= ruleInlineSource ) ) ) )
            // InternalDsl.g:516:2: ( ( (lv_source_0_1= ruleSelectSource | lv_source_0_2= ruleInlineSource ) ) )
            {
            // InternalDsl.g:516:2: ( ( (lv_source_0_1= ruleSelectSource | lv_source_0_2= ruleInlineSource ) ) )
            // InternalDsl.g:517:3: ( (lv_source_0_1= ruleSelectSource | lv_source_0_2= ruleInlineSource ) )
            {
            // InternalDsl.g:517:3: ( (lv_source_0_1= ruleSelectSource | lv_source_0_2= ruleInlineSource ) )
            // InternalDsl.g:518:4: (lv_source_0_1= ruleSelectSource | lv_source_0_2= ruleInlineSource )
            {
            // InternalDsl.g:518:4: (lv_source_0_1= ruleSelectSource | lv_source_0_2= ruleInlineSource )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:519:5: lv_source_0_1= ruleSelectSource
                    {

                    					newCompositeNode(grammarAccess.getSourceOperationAccess().getSourceSelectSourceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_source_0_1=ruleSelectSource();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSourceOperationRule());
                    					}
                    					set(
                    						current,
                    						"source",
                    						lv_source_0_1,
                    						"pt.up.fe.els2023.Dsl.SelectSource");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalDsl.g:535:5: lv_source_0_2= ruleInlineSource
                    {

                    					newCompositeNode(grammarAccess.getSourceOperationAccess().getSourceInlineSourceParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_source_0_2=ruleInlineSource();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSourceOperationRule());
                    					}
                    					set(
                    						current,
                    						"source",
                    						lv_source_0_2,
                    						"pt.up.fe.els2023.Dsl.InlineSource");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceOperation"


    // $ANTLR start "entryRuleTransformationTableOperation"
    // InternalDsl.g:556:1: entryRuleTransformationTableOperation returns [EObject current=null] : iv_ruleTransformationTableOperation= ruleTransformationTableOperation EOF ;
    public final EObject entryRuleTransformationTableOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationTableOperation = null;


        try {
            // InternalDsl.g:556:69: (iv_ruleTransformationTableOperation= ruleTransformationTableOperation EOF )
            // InternalDsl.g:557:2: iv_ruleTransformationTableOperation= ruleTransformationTableOperation EOF
            {
             newCompositeNode(grammarAccess.getTransformationTableOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformationTableOperation=ruleTransformationTableOperation();

            state._fsp--;

             current =iv_ruleTransformationTableOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformationTableOperation"


    // $ANTLR start "ruleTransformationTableOperation"
    // InternalDsl.g:563:1: ruleTransformationTableOperation returns [EObject current=null] : (otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')' ) ;
    public final EObject ruleTransformationTableOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_transformation_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:569:2: ( (otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')' ) )
            // InternalDsl.g:570:2: (otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')' )
            {
            // InternalDsl.g:570:2: (otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')' )
            // InternalDsl.g:571:3: otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformationTableOperationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDsl.g:575:3: ( (lv_transformation_1_0= ruleTransformation ) )
            // InternalDsl.g:576:4: (lv_transformation_1_0= ruleTransformation )
            {
            // InternalDsl.g:576:4: (lv_transformation_1_0= ruleTransformation )
            // InternalDsl.g:577:5: lv_transformation_1_0= ruleTransformation
            {

            					newCompositeNode(grammarAccess.getTransformationTableOperationAccess().getTransformationTransformationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_transformation_1_0=ruleTransformation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationTableOperationRule());
            					}
            					set(
            						current,
            						"transformation",
            						lv_transformation_1_0,
            						"pt.up.fe.els2023.Dsl.Transformation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformationTableOperationAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformationTableOperation"


    // $ANTLR start "entryRuleSelectPipeline"
    // InternalDsl.g:602:1: entryRuleSelectPipeline returns [EObject current=null] : iv_ruleSelectPipeline= ruleSelectPipeline EOF ;
    public final EObject entryRuleSelectPipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectPipeline = null;


        try {
            // InternalDsl.g:602:55: (iv_ruleSelectPipeline= ruleSelectPipeline EOF )
            // InternalDsl.g:603:2: iv_ruleSelectPipeline= ruleSelectPipeline EOF
            {
             newCompositeNode(grammarAccess.getSelectPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectPipeline=ruleSelectPipeline();

            state._fsp--;

             current =iv_ruleSelectPipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectPipeline"


    // $ANTLR start "ruleSelectPipeline"
    // InternalDsl.g:609:1: ruleSelectPipeline returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSelectPipeline() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:615:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDsl.g:616:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDsl.g:616:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:617:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:617:3: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:618:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSelectPipelineAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSelectPipelineRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectPipeline"


    // $ANTLR start "entryRuleInlinePipeline"
    // InternalDsl.g:637:1: entryRuleInlinePipeline returns [EObject current=null] : iv_ruleInlinePipeline= ruleInlinePipeline EOF ;
    public final EObject entryRuleInlinePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlinePipeline = null;


        try {
            // InternalDsl.g:637:55: (iv_ruleInlinePipeline= ruleInlinePipeline EOF )
            // InternalDsl.g:638:2: iv_ruleInlinePipeline= ruleInlinePipeline EOF
            {
             newCompositeNode(grammarAccess.getInlinePipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlinePipeline=ruleInlinePipeline();

            state._fsp--;

             current =iv_ruleInlinePipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlinePipeline"


    // $ANTLR start "ruleInlinePipeline"
    // InternalDsl.g:644:1: ruleInlinePipeline returns [EObject current=null] : (otherlv_0= '(' ( (lv_pipelineExpr_1_0= rulePipeline ) ) otherlv_2= ')' ) ;
    public final EObject ruleInlinePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_pipelineExpr_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:650:2: ( (otherlv_0= '(' ( (lv_pipelineExpr_1_0= rulePipeline ) ) otherlv_2= ')' ) )
            // InternalDsl.g:651:2: (otherlv_0= '(' ( (lv_pipelineExpr_1_0= rulePipeline ) ) otherlv_2= ')' )
            {
            // InternalDsl.g:651:2: (otherlv_0= '(' ( (lv_pipelineExpr_1_0= rulePipeline ) ) otherlv_2= ')' )
            // InternalDsl.g:652:3: otherlv_0= '(' ( (lv_pipelineExpr_1_0= rulePipeline ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getInlinePipelineAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDsl.g:656:3: ( (lv_pipelineExpr_1_0= rulePipeline ) )
            // InternalDsl.g:657:4: (lv_pipelineExpr_1_0= rulePipeline )
            {
            // InternalDsl.g:657:4: (lv_pipelineExpr_1_0= rulePipeline )
            // InternalDsl.g:658:5: lv_pipelineExpr_1_0= rulePipeline
            {

            					newCompositeNode(grammarAccess.getInlinePipelineAccess().getPipelineExprPipelineParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_pipelineExpr_1_0=rulePipeline();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInlinePipelineRule());
            					}
            					set(
            						current,
            						"pipelineExpr",
            						lv_pipelineExpr_1_0,
            						"pt.up.fe.els2023.Dsl.Pipeline");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInlinePipelineAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlinePipeline"


    // $ANTLR start "entryRulePipelineTableOperation"
    // InternalDsl.g:683:1: entryRulePipelineTableOperation returns [EObject current=null] : iv_rulePipelineTableOperation= rulePipelineTableOperation EOF ;
    public final EObject entryRulePipelineTableOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipelineTableOperation = null;


        try {
            // InternalDsl.g:683:63: (iv_rulePipelineTableOperation= rulePipelineTableOperation EOF )
            // InternalDsl.g:684:2: iv_rulePipelineTableOperation= rulePipelineTableOperation EOF
            {
             newCompositeNode(grammarAccess.getPipelineTableOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePipelineTableOperation=rulePipelineTableOperation();

            state._fsp--;

             current =iv_rulePipelineTableOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePipelineTableOperation"


    // $ANTLR start "rulePipelineTableOperation"
    // InternalDsl.g:690:1: rulePipelineTableOperation returns [EObject current=null] : ( ( (lv_pipeline_0_1= ruleSelectPipeline | lv_pipeline_0_2= ruleInlinePipeline ) ) ) ;
    public final EObject rulePipelineTableOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_pipeline_0_1 = null;

        EObject lv_pipeline_0_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:696:2: ( ( ( (lv_pipeline_0_1= ruleSelectPipeline | lv_pipeline_0_2= ruleInlinePipeline ) ) ) )
            // InternalDsl.g:697:2: ( ( (lv_pipeline_0_1= ruleSelectPipeline | lv_pipeline_0_2= ruleInlinePipeline ) ) )
            {
            // InternalDsl.g:697:2: ( ( (lv_pipeline_0_1= ruleSelectPipeline | lv_pipeline_0_2= ruleInlinePipeline ) ) )
            // InternalDsl.g:698:3: ( (lv_pipeline_0_1= ruleSelectPipeline | lv_pipeline_0_2= ruleInlinePipeline ) )
            {
            // InternalDsl.g:698:3: ( (lv_pipeline_0_1= ruleSelectPipeline | lv_pipeline_0_2= ruleInlinePipeline ) )
            // InternalDsl.g:699:4: (lv_pipeline_0_1= ruleSelectPipeline | lv_pipeline_0_2= ruleInlinePipeline )
            {
            // InternalDsl.g:699:4: (lv_pipeline_0_1= ruleSelectPipeline | lv_pipeline_0_2= ruleInlinePipeline )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:700:5: lv_pipeline_0_1= ruleSelectPipeline
                    {

                    					newCompositeNode(grammarAccess.getPipelineTableOperationAccess().getPipelineSelectPipelineParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pipeline_0_1=ruleSelectPipeline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPipelineTableOperationRule());
                    					}
                    					set(
                    						current,
                    						"pipeline",
                    						lv_pipeline_0_1,
                    						"pt.up.fe.els2023.Dsl.SelectPipeline");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalDsl.g:716:5: lv_pipeline_0_2= ruleInlinePipeline
                    {

                    					newCompositeNode(grammarAccess.getPipelineTableOperationAccess().getPipelineInlinePipelineParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pipeline_0_2=ruleInlinePipeline();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPipelineTableOperationRule());
                    					}
                    					set(
                    						current,
                    						"pipeline",
                    						lv_pipeline_0_2,
                    						"pt.up.fe.els2023.Dsl.InlinePipeline");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePipelineTableOperation"


    // $ANTLR start "entryRuleTransformOperation"
    // InternalDsl.g:737:1: entryRuleTransformOperation returns [EObject current=null] : iv_ruleTransformOperation= ruleTransformOperation EOF ;
    public final EObject entryRuleTransformOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformOperation = null;


        try {
            // InternalDsl.g:737:59: (iv_ruleTransformOperation= ruleTransformOperation EOF )
            // InternalDsl.g:738:2: iv_ruleTransformOperation= ruleTransformOperation EOF
            {
             newCompositeNode(grammarAccess.getTransformOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformOperation=ruleTransformOperation();

            state._fsp--;

             current =iv_ruleTransformOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformOperation"


    // $ANTLR start "ruleTransformOperation"
    // InternalDsl.g:744:1: ruleTransformOperation returns [EObject current=null] : (otherlv_0= 'apply' ( ( (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation ) ) ) ) ;
    public final EObject ruleTransformOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_operation_1_1 = null;

        EObject lv_operation_1_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:750:2: ( (otherlv_0= 'apply' ( ( (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation ) ) ) ) )
            // InternalDsl.g:751:2: (otherlv_0= 'apply' ( ( (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation ) ) ) )
            {
            // InternalDsl.g:751:2: (otherlv_0= 'apply' ( ( (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation ) ) ) )
            // InternalDsl.g:752:3: otherlv_0= 'apply' ( ( (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformOperationAccess().getApplyKeyword_0());
            		
            // InternalDsl.g:756:3: ( ( (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation ) ) )
            // InternalDsl.g:757:4: ( (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation ) )
            {
            // InternalDsl.g:757:4: ( (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation ) )
            // InternalDsl.g:758:5: (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation )
            {
            // InternalDsl.g:758:5: (lv_operation_1_1= ruleTransformationTableOperation | lv_operation_1_2= rulePipelineTableOperation )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==13||LA13_1==38||LA13_1==42||LA13_1==44||LA13_1==46||LA13_1==51||(LA13_1>=53 && LA13_1<=54)||LA13_1==57||LA13_1==59||LA13_1==66) ) {
                    alt13=1;
                }
                else if ( (LA13_1==69) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:759:6: lv_operation_1_1= ruleTransformationTableOperation
                    {

                    						newCompositeNode(grammarAccess.getTransformOperationAccess().getOperationTransformationTableOperationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operation_1_1=ruleTransformationTableOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformOperationRule());
                    						}
                    						add(
                    							current,
                    							"operation",
                    							lv_operation_1_1,
                    							"pt.up.fe.els2023.Dsl.TransformationTableOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:775:6: lv_operation_1_2= rulePipelineTableOperation
                    {

                    						newCompositeNode(grammarAccess.getTransformOperationAccess().getOperationPipelineTableOperationParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operation_1_2=rulePipelineTableOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformOperationRule());
                    						}
                    						add(
                    							current,
                    							"operation",
                    							lv_operation_1_2,
                    							"pt.up.fe.els2023.Dsl.PipelineTableOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformOperation"


    // $ANTLR start "entryRuleTable"
    // InternalDsl.g:797:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalDsl.g:797:46: (iv_ruleTable= ruleTable EOF )
            // InternalDsl.g:798:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDsl.g:804:1: ruleTable returns [EObject current=null] : ( ( (lv_operation_0_0= ruleTableOperations ) ) otherlv_1= ';' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operation_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:810:2: ( ( ( (lv_operation_0_0= ruleTableOperations ) ) otherlv_1= ';' ) )
            // InternalDsl.g:811:2: ( ( (lv_operation_0_0= ruleTableOperations ) ) otherlv_1= ';' )
            {
            // InternalDsl.g:811:2: ( ( (lv_operation_0_0= ruleTableOperations ) ) otherlv_1= ';' )
            // InternalDsl.g:812:3: ( (lv_operation_0_0= ruleTableOperations ) ) otherlv_1= ';'
            {
            // InternalDsl.g:812:3: ( (lv_operation_0_0= ruleTableOperations ) )
            // InternalDsl.g:813:4: (lv_operation_0_0= ruleTableOperations )
            {
            // InternalDsl.g:813:4: (lv_operation_0_0= ruleTableOperations )
            // InternalDsl.g:814:5: lv_operation_0_0= ruleTableOperations
            {

            					newCompositeNode(grammarAccess.getTableAccess().getOperationTableOperationsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_operation_0_0=ruleTableOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_0_0,
            						"pt.up.fe.els2023.Dsl.TableOperations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleXmlType"
    // InternalDsl.g:839:1: entryRuleXmlType returns [EObject current=null] : iv_ruleXmlType= ruleXmlType EOF ;
    public final EObject entryRuleXmlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlType = null;


        try {
            // InternalDsl.g:839:48: (iv_ruleXmlType= ruleXmlType EOF )
            // InternalDsl.g:840:2: iv_ruleXmlType= ruleXmlType EOF
            {
             newCompositeNode(grammarAccess.getXmlTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmlType=ruleXmlType();

            state._fsp--;

             current =iv_ruleXmlType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXmlType"


    // $ANTLR start "ruleXmlType"
    // InternalDsl.g:846:1: ruleXmlType returns [EObject current=null] : ( () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? ) ;
    public final EObject ruleXmlType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDsl.g:852:2: ( ( () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? ) )
            // InternalDsl.g:853:2: ( () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? )
            {
            // InternalDsl.g:853:2: ( () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? )
            // InternalDsl.g:854:3: () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )?
            {
            // InternalDsl.g:854:3: ()
            // InternalDsl.g:855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXmlTypeAccess().getXmlTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getXmlTypeAccess().getXmlKeyword_1());
            		
            // InternalDsl.g:865:3: (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:866:4: otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getXmlTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getXmlTypeAccess().getXpathKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,11,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getXmlTypeAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalDsl.g:878:4: ( (lv_path_5_0= RULE_STRING ) )
                    // InternalDsl.g:879:5: (lv_path_5_0= RULE_STRING )
                    {
                    // InternalDsl.g:879:5: (lv_path_5_0= RULE_STRING )
                    // InternalDsl.g:880:6: lv_path_5_0= RULE_STRING
                    {
                    lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_path_5_0, grammarAccess.getXmlTypeAccess().getPathSTRINGTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getXmlTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getXmlTypeAccess().getCommaKeyword_2_4());
                    			
                    otherlv_7=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getXmlTypeAccess().getRightCurlyBracketKeyword_2_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXmlType"


    // $ANTLR start "entryRuleJsonType"
    // InternalDsl.g:909:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // InternalDsl.g:909:49: (iv_ruleJsonType= ruleJsonType EOF )
            // InternalDsl.g:910:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // InternalDsl.g:916:1: ruleJsonType returns [EObject current=null] : ( () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDsl.g:922:2: ( ( () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? ) )
            // InternalDsl.g:923:2: ( () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? )
            {
            // InternalDsl.g:923:2: ( () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? )
            // InternalDsl.g:924:3: () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )?
            {
            // InternalDsl.g:924:3: ()
            // InternalDsl.g:925:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonTypeAccess().getJsonTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonTypeAccess().getJsonKeyword_1());
            		
            // InternalDsl.g:935:3: (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:936:4: otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getJsonTypeAccess().getJsonpathKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,11,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getJsonTypeAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalDsl.g:948:4: ( (lv_path_5_0= RULE_STRING ) )
                    // InternalDsl.g:949:5: (lv_path_5_0= RULE_STRING )
                    {
                    // InternalDsl.g:949:5: (lv_path_5_0= RULE_STRING )
                    // InternalDsl.g:950:6: lv_path_5_0= RULE_STRING
                    {
                    lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_path_5_0, grammarAccess.getJsonTypeAccess().getPathSTRINGTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJsonTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getJsonTypeAccess().getCommaKeyword_2_4());
                    			
                    otherlv_7=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_2_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleYamlType"
    // InternalDsl.g:979:1: entryRuleYamlType returns [EObject current=null] : iv_ruleYamlType= ruleYamlType EOF ;
    public final EObject entryRuleYamlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYamlType = null;


        try {
            // InternalDsl.g:979:49: (iv_ruleYamlType= ruleYamlType EOF )
            // InternalDsl.g:980:2: iv_ruleYamlType= ruleYamlType EOF
            {
             newCompositeNode(grammarAccess.getYamlTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYamlType=ruleYamlType();

            state._fsp--;

             current =iv_ruleYamlType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYamlType"


    // $ANTLR start "ruleYamlType"
    // InternalDsl.g:986:1: ruleYamlType returns [EObject current=null] : ( () otherlv_1= 'yaml' ) ;
    public final EObject ruleYamlType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:992:2: ( ( () otherlv_1= 'yaml' ) )
            // InternalDsl.g:993:2: ( () otherlv_1= 'yaml' )
            {
            // InternalDsl.g:993:2: ( () otherlv_1= 'yaml' )
            // InternalDsl.g:994:3: () otherlv_1= 'yaml'
            {
            // InternalDsl.g:994:3: ()
            // InternalDsl.g:995:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getYamlTypeAccess().getYamlTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getYamlTypeAccess().getYamlKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYamlType"


    // $ANTLR start "entryRuleCsvType"
    // InternalDsl.g:1009:1: entryRuleCsvType returns [EObject current=null] : iv_ruleCsvType= ruleCsvType EOF ;
    public final EObject entryRuleCsvType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvType = null;


        try {
            // InternalDsl.g:1009:48: (iv_ruleCsvType= ruleCsvType EOF )
            // InternalDsl.g:1010:2: iv_ruleCsvType= ruleCsvType EOF
            {
             newCompositeNode(grammarAccess.getCsvTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvType=ruleCsvType();

            state._fsp--;

             current =iv_ruleCsvType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCsvType"


    // $ANTLR start "ruleCsvType"
    // InternalDsl.g:1016:1: ruleCsvType returns [EObject current=null] : ( () otherlv_1= 'csv' ) ;
    public final EObject ruleCsvType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1022:2: ( ( () otherlv_1= 'csv' ) )
            // InternalDsl.g:1023:2: ( () otherlv_1= 'csv' )
            {
            // InternalDsl.g:1023:2: ( () otherlv_1= 'csv' )
            // InternalDsl.g:1024:3: () otherlv_1= 'csv'
            {
            // InternalDsl.g:1024:3: ()
            // InternalDsl.g:1025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCsvTypeAccess().getCsvTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCsvTypeAccess().getCsvKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCsvType"


    // $ANTLR start "entryRuleAutoType"
    // InternalDsl.g:1039:1: entryRuleAutoType returns [EObject current=null] : iv_ruleAutoType= ruleAutoType EOF ;
    public final EObject entryRuleAutoType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoType = null;


        try {
            // InternalDsl.g:1039:49: (iv_ruleAutoType= ruleAutoType EOF )
            // InternalDsl.g:1040:2: iv_ruleAutoType= ruleAutoType EOF
            {
             newCompositeNode(grammarAccess.getAutoTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutoType=ruleAutoType();

            state._fsp--;

             current =iv_ruleAutoType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutoType"


    // $ANTLR start "ruleAutoType"
    // InternalDsl.g:1046:1: ruleAutoType returns [EObject current=null] : ( () otherlv_1= 'auto' ) ;
    public final EObject ruleAutoType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1052:2: ( ( () otherlv_1= 'auto' ) )
            // InternalDsl.g:1053:2: ( () otherlv_1= 'auto' )
            {
            // InternalDsl.g:1053:2: ( () otherlv_1= 'auto' )
            // InternalDsl.g:1054:3: () otherlv_1= 'auto'
            {
            // InternalDsl.g:1054:3: ()
            // InternalDsl.g:1055:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutoTypeAccess().getAutoTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAutoTypeAccess().getAutoKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutoType"


    // $ANTLR start "entryRuleInputType"
    // InternalDsl.g:1069:1: entryRuleInputType returns [EObject current=null] : iv_ruleInputType= ruleInputType EOF ;
    public final EObject entryRuleInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputType = null;


        try {
            // InternalDsl.g:1069:50: (iv_ruleInputType= ruleInputType EOF )
            // InternalDsl.g:1070:2: iv_ruleInputType= ruleInputType EOF
            {
             newCompositeNode(grammarAccess.getInputTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputType=ruleInputType();

            state._fsp--;

             current =iv_ruleInputType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputType"


    // $ANTLR start "ruleInputType"
    // InternalDsl.g:1076:1: ruleInputType returns [EObject current=null] : (this_JsonType_0= ruleJsonType | this_XmlType_1= ruleXmlType | this_CsvType_2= ruleCsvType | this_YamlType_3= ruleYamlType | this_AutoType_4= ruleAutoType ) ;
    public final EObject ruleInputType() throws RecognitionException {
        EObject current = null;

        EObject this_JsonType_0 = null;

        EObject this_XmlType_1 = null;

        EObject this_CsvType_2 = null;

        EObject this_YamlType_3 = null;

        EObject this_AutoType_4 = null;



        	enterRule();

        try {
            // InternalDsl.g:1082:2: ( (this_JsonType_0= ruleJsonType | this_XmlType_1= ruleXmlType | this_CsvType_2= ruleCsvType | this_YamlType_3= ruleYamlType | this_AutoType_4= ruleAutoType ) )
            // InternalDsl.g:1083:2: (this_JsonType_0= ruleJsonType | this_XmlType_1= ruleXmlType | this_CsvType_2= ruleCsvType | this_YamlType_3= ruleYamlType | this_AutoType_4= ruleAutoType )
            {
            // InternalDsl.g:1083:2: (this_JsonType_0= ruleJsonType | this_XmlType_1= ruleXmlType | this_CsvType_2= ruleCsvType | this_YamlType_3= ruleYamlType | this_AutoType_4= ruleAutoType )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            case 29:
                {
                alt16=4;
                }
                break;
            case 31:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1084:3: this_JsonType_0= ruleJsonType
                    {

                    			newCompositeNode(grammarAccess.getInputTypeAccess().getJsonTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonType_0=ruleJsonType();

                    state._fsp--;


                    			current = this_JsonType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1093:3: this_XmlType_1= ruleXmlType
                    {

                    			newCompositeNode(grammarAccess.getInputTypeAccess().getXmlTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XmlType_1=ruleXmlType();

                    state._fsp--;


                    			current = this_XmlType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1102:3: this_CsvType_2= ruleCsvType
                    {

                    			newCompositeNode(grammarAccess.getInputTypeAccess().getCsvTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CsvType_2=ruleCsvType();

                    state._fsp--;


                    			current = this_CsvType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:1111:3: this_YamlType_3= ruleYamlType
                    {

                    			newCompositeNode(grammarAccess.getInputTypeAccess().getYamlTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_YamlType_3=ruleYamlType();

                    state._fsp--;


                    			current = this_YamlType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:1120:3: this_AutoType_4= ruleAutoType
                    {

                    			newCompositeNode(grammarAccess.getInputTypeAccess().getAutoTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutoType_4=ruleAutoType();

                    state._fsp--;


                    			current = this_AutoType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputType"


    // $ANTLR start "entryRuleHtmlType"
    // InternalDsl.g:1132:1: entryRuleHtmlType returns [EObject current=null] : iv_ruleHtmlType= ruleHtmlType EOF ;
    public final EObject entryRuleHtmlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtmlType = null;


        try {
            // InternalDsl.g:1132:49: (iv_ruleHtmlType= ruleHtmlType EOF )
            // InternalDsl.g:1133:2: iv_ruleHtmlType= ruleHtmlType EOF
            {
             newCompositeNode(grammarAccess.getHtmlTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHtmlType=ruleHtmlType();

            state._fsp--;

             current =iv_ruleHtmlType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHtmlType"


    // $ANTLR start "ruleHtmlType"
    // InternalDsl.g:1139:1: ruleHtmlType returns [EObject current=null] : ( () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) (otherlv_6= ',' )? otherlv_7= '}' )? ) ;
    public final EObject ruleHtmlType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_cssPath_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDsl.g:1145:2: ( ( () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) (otherlv_6= ',' )? otherlv_7= '}' )? ) )
            // InternalDsl.g:1146:2: ( () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) (otherlv_6= ',' )? otherlv_7= '}' )? )
            {
            // InternalDsl.g:1146:2: ( () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) (otherlv_6= ',' )? otherlv_7= '}' )? )
            // InternalDsl.g:1147:3: () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) (otherlv_6= ',' )? otherlv_7= '}' )?
            {
            // InternalDsl.g:1147:3: ()
            // InternalDsl.g:1148:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHtmlTypeAccess().getHtmlTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getHtmlTypeAccess().getHtmlKeyword_1());
            		
            // InternalDsl.g:1158:3: (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) (otherlv_6= ',' )? otherlv_7= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1159:4: otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) (otherlv_6= ',' )? otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getHtmlTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getHtmlTypeAccess().getCssKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,11,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getHtmlTypeAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalDsl.g:1171:4: ( (lv_cssPath_5_0= RULE_STRING ) )
                    // InternalDsl.g:1172:5: (lv_cssPath_5_0= RULE_STRING )
                    {
                    // InternalDsl.g:1172:5: (lv_cssPath_5_0= RULE_STRING )
                    // InternalDsl.g:1173:6: lv_cssPath_5_0= RULE_STRING
                    {
                    lv_cssPath_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_cssPath_5_0, grammarAccess.getHtmlTypeAccess().getCssPathSTRINGTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHtmlTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"cssPath",
                    							lv_cssPath_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDsl.g:1189:4: (otherlv_6= ',' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==17) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDsl.g:1190:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_22); 

                            					newLeafNode(otherlv_6, grammarAccess.getHtmlTypeAccess().getCommaKeyword_2_4());
                            				

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getHtmlTypeAccess().getRightCurlyBracketKeyword_2_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHtmlType"


    // $ANTLR start "entryRuleOutputType"
    // InternalDsl.g:1204:1: entryRuleOutputType returns [EObject current=null] : iv_ruleOutputType= ruleOutputType EOF ;
    public final EObject entryRuleOutputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputType = null;


        try {
            // InternalDsl.g:1204:51: (iv_ruleOutputType= ruleOutputType EOF )
            // InternalDsl.g:1205:2: iv_ruleOutputType= ruleOutputType EOF
            {
             newCompositeNode(grammarAccess.getOutputTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputType=ruleOutputType();

            state._fsp--;

             current =iv_ruleOutputType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputType"


    // $ANTLR start "ruleOutputType"
    // InternalDsl.g:1211:1: ruleOutputType returns [EObject current=null] : ( ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) ) ) ;
    public final EObject ruleOutputType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:1217:2: ( ( ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) ) ) )
            // InternalDsl.g:1218:2: ( ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) ) )
            {
            // InternalDsl.g:1218:2: ( ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) ) )
            // InternalDsl.g:1219:3: ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) )
            {
            // InternalDsl.g:1219:3: ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) )
            // InternalDsl.g:1220:4: (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType )
            {
            // InternalDsl.g:1220:4: (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 31:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1221:5: lv_type_0_1= ruleHtmlType
                    {

                    					newCompositeNode(grammarAccess.getOutputTypeAccess().getTypeHtmlTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_1=ruleHtmlType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOutputTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_1,
                    						"pt.up.fe.els2023.Dsl.HtmlType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1237:5: lv_type_0_2= ruleAutoType
                    {

                    					newCompositeNode(grammarAccess.getOutputTypeAccess().getTypeAutoTypeParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleAutoType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOutputTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_2,
                    						"pt.up.fe.els2023.Dsl.AutoType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1253:5: lv_type_0_3= ruleCsvType
                    {

                    					newCompositeNode(grammarAccess.getOutputTypeAccess().getTypeCsvTypeParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_3=ruleCsvType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOutputTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_3,
                    						"pt.up.fe.els2023.Dsl.CsvType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputType"


    // $ANTLR start "entryRuleMetaData"
    // InternalDsl.g:1274:1: entryRuleMetaData returns [EObject current=null] : iv_ruleMetaData= ruleMetaData EOF ;
    public final EObject entryRuleMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaData = null;


        try {
            // InternalDsl.g:1274:49: (iv_ruleMetaData= ruleMetaData EOF )
            // InternalDsl.g:1275:2: iv_ruleMetaData= ruleMetaData EOF
            {
             newCompositeNode(grammarAccess.getMetaDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaData=ruleMetaData();

            state._fsp--;

             current =iv_ruleMetaData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaData"


    // $ANTLR start "ruleMetaData"
    // InternalDsl.g:1281:1: ruleMetaData returns [EObject current=null] : ( ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) ) ) ;
    public final EObject ruleMetaData() throws RecognitionException {
        EObject current = null;

        Token lv_metadata_0_1=null;
        Token lv_metadata_0_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1287:2: ( ( ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) ) ) )
            // InternalDsl.g:1288:2: ( ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) ) )
            {
            // InternalDsl.g:1288:2: ( ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) ) )
            // InternalDsl.g:1289:3: ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) )
            {
            // InternalDsl.g:1289:3: ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) )
            // InternalDsl.g:1290:4: (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' )
            {
            // InternalDsl.g:1290:4: (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            else if ( (LA20_0==35) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1291:5: lv_metadata_0_1= 'filepath'
                    {
                    lv_metadata_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_metadata_0_1, grammarAccess.getMetaDataAccess().getMetadataFilepathKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMetaDataRule());
                    					}
                    					setWithLastConsumed(current, "metadata", lv_metadata_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1302:5: lv_metadata_0_2= 'lastmodified'
                    {
                    lv_metadata_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_metadata_0_2, grammarAccess.getMetaDataAccess().getMetadataLastmodifiedKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMetaDataRule());
                    					}
                    					setWithLastConsumed(current, "metadata", lv_metadata_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaData"


    // $ANTLR start "entryRuleSourceStore"
    // InternalDsl.g:1318:1: entryRuleSourceStore returns [EObject current=null] : iv_ruleSourceStore= ruleSourceStore EOF ;
    public final EObject entryRuleSourceStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceStore = null;


        try {
            // InternalDsl.g:1318:52: (iv_ruleSourceStore= ruleSourceStore EOF )
            // InternalDsl.g:1319:2: iv_ruleSourceStore= ruleSourceStore EOF
            {
             newCompositeNode(grammarAccess.getSourceStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceStore=ruleSourceStore();

            state._fsp--;

             current =iv_ruleSourceStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceStore"


    // $ANTLR start "ruleSourceStore"
    // InternalDsl.g:1325:1: ruleSourceStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_column_3_0=null;
        EObject lv_metadata_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1331:2: ( (otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1332:2: (otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1332:2: (otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) ) )
            // InternalDsl.g:1333:3: otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceStoreAccess().getStoreKeyword_0());
            		
            // InternalDsl.g:1337:3: ( (lv_metadata_1_0= ruleMetaData ) )
            // InternalDsl.g:1338:4: (lv_metadata_1_0= ruleMetaData )
            {
            // InternalDsl.g:1338:4: (lv_metadata_1_0= ruleMetaData )
            // InternalDsl.g:1339:5: lv_metadata_1_0= ruleMetaData
            {

            					newCompositeNode(grammarAccess.getSourceStoreAccess().getMetadataMetaDataParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_metadata_1_0=ruleMetaData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSourceStoreRule());
            					}
            					set(
            						current,
            						"metadata",
            						lv_metadata_1_0,
            						"pt.up.fe.els2023.Dsl.MetaData");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceStoreAccess().getInKeyword_2());
            		
            // InternalDsl.g:1360:3: ( (lv_column_3_0= RULE_STRING ) )
            // InternalDsl.g:1361:4: (lv_column_3_0= RULE_STRING )
            {
            // InternalDsl.g:1361:4: (lv_column_3_0= RULE_STRING )
            // InternalDsl.g:1362:5: lv_column_3_0= RULE_STRING
            {
            lv_column_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_column_3_0, grammarAccess.getSourceStoreAccess().getColumnSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceStore"


    // $ANTLR start "entryRuleSourceCoumnSelect"
    // InternalDsl.g:1382:1: entryRuleSourceCoumnSelect returns [EObject current=null] : iv_ruleSourceCoumnSelect= ruleSourceCoumnSelect EOF ;
    public final EObject entryRuleSourceCoumnSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceCoumnSelect = null;


        try {
            // InternalDsl.g:1382:58: (iv_ruleSourceCoumnSelect= ruleSourceCoumnSelect EOF )
            // InternalDsl.g:1383:2: iv_ruleSourceCoumnSelect= ruleSourceCoumnSelect EOF
            {
             newCompositeNode(grammarAccess.getSourceCoumnSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceCoumnSelect=ruleSourceCoumnSelect();

            state._fsp--;

             current =iv_ruleSourceCoumnSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceCoumnSelect"


    // $ANTLR start "ruleSourceCoumnSelect"
    // InternalDsl.g:1389:1: ruleSourceCoumnSelect returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) ;
    public final EObject ruleSourceCoumnSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;
        Token lv_column_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:1395:2: ( (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) )
            // InternalDsl.g:1396:2: (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            {
            // InternalDsl.g:1396:2: (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            // InternalDsl.g:1397:3: otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceCoumnSelectAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceCoumnSelectAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDsl.g:1405:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalDsl.g:1406:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalDsl.g:1406:4: (lv_column_2_0= RULE_STRING )
            // InternalDsl.g:1407:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_column_2_0, grammarAccess.getSourceCoumnSelectAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceCoumnSelectRule());
            					}
            					addWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:1423:3: (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_STRING) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1424:4: otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:1428:4: ( (lv_column_4_0= RULE_STRING ) )
            	    // InternalDsl.g:1429:5: (lv_column_4_0= RULE_STRING )
            	    {
            	    // InternalDsl.g:1429:5: (lv_column_4_0= RULE_STRING )
            	    // InternalDsl.g:1430:6: lv_column_4_0= RULE_STRING
            	    {
            	    lv_column_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    						newLeafNode(lv_column_4_0, grammarAccess.getSourceCoumnSelectAccess().getColumnSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSourceCoumnSelectRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"column",
            	    							lv_column_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalDsl.g:1447:3: (otherlv_5= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:1448:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSourceCoumnSelectAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceCoumnSelect"


    // $ANTLR start "entryRuleSource"
    // InternalDsl.g:1461:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalDsl.g:1461:47: (iv_ruleSource= ruleSource EOF )
            // InternalDsl.g:1462:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalDsl.g:1468:1: ruleSource returns [EObject current=null] : (otherlv_0= 'import' ( (lv_query_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (lv_filePath_3_0= RULE_STRING ) ) (otherlv_4= 'as' ( (lv_inputType_5_0= ruleInputType ) ) )? ( (lv_store_6_0= ruleSourceStore ) )* ( (lv_select_7_0= ruleSourceCoumnSelect ) )? otherlv_8= ';' ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_query_1_0=null;
        Token otherlv_2=null;
        Token lv_filePath_3_0=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_inputType_5_0 = null;

        EObject lv_store_6_0 = null;

        EObject lv_select_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1474:2: ( (otherlv_0= 'import' ( (lv_query_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (lv_filePath_3_0= RULE_STRING ) ) (otherlv_4= 'as' ( (lv_inputType_5_0= ruleInputType ) ) )? ( (lv_store_6_0= ruleSourceStore ) )* ( (lv_select_7_0= ruleSourceCoumnSelect ) )? otherlv_8= ';' ) )
            // InternalDsl.g:1475:2: (otherlv_0= 'import' ( (lv_query_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (lv_filePath_3_0= RULE_STRING ) ) (otherlv_4= 'as' ( (lv_inputType_5_0= ruleInputType ) ) )? ( (lv_store_6_0= ruleSourceStore ) )* ( (lv_select_7_0= ruleSourceCoumnSelect ) )? otherlv_8= ';' )
            {
            // InternalDsl.g:1475:2: (otherlv_0= 'import' ( (lv_query_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (lv_filePath_3_0= RULE_STRING ) ) (otherlv_4= 'as' ( (lv_inputType_5_0= ruleInputType ) ) )? ( (lv_store_6_0= ruleSourceStore ) )* ( (lv_select_7_0= ruleSourceCoumnSelect ) )? otherlv_8= ';' )
            // InternalDsl.g:1476:3: otherlv_0= 'import' ( (lv_query_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (lv_filePath_3_0= RULE_STRING ) ) (otherlv_4= 'as' ( (lv_inputType_5_0= ruleInputType ) ) )? ( (lv_store_6_0= ruleSourceStore ) )* ( (lv_select_7_0= ruleSourceCoumnSelect ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceAccess().getImportKeyword_0());
            		
            // InternalDsl.g:1480:3: ( (lv_query_1_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1481:4: (lv_query_1_0= RULE_STRING )
                    {
                    // InternalDsl.g:1481:4: (lv_query_1_0= RULE_STRING )
                    // InternalDsl.g:1482:5: lv_query_1_0= RULE_STRING
                    {
                    lv_query_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    					newLeafNode(lv_query_1_0, grammarAccess.getSourceAccess().getQuerySTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"query",
                    						lv_query_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getFromKeyword_2());
            		
            // InternalDsl.g:1502:3: ( (lv_filePath_3_0= RULE_STRING ) )
            // InternalDsl.g:1503:4: (lv_filePath_3_0= RULE_STRING )
            {
            // InternalDsl.g:1503:4: (lv_filePath_3_0= RULE_STRING )
            // InternalDsl.g:1504:5: lv_filePath_3_0= RULE_STRING
            {
            lv_filePath_3_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_filePath_3_0, grammarAccess.getSourceAccess().getFilePathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filePath",
            						lv_filePath_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:1520:3: (otherlv_4= 'as' ( (lv_inputType_5_0= ruleInputType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1521:4: otherlv_4= 'as' ( (lv_inputType_5_0= ruleInputType ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getSourceAccess().getAsKeyword_4_0());
                    			
                    // InternalDsl.g:1525:4: ( (lv_inputType_5_0= ruleInputType ) )
                    // InternalDsl.g:1526:5: (lv_inputType_5_0= ruleInputType )
                    {
                    // InternalDsl.g:1526:5: (lv_inputType_5_0= ruleInputType )
                    // InternalDsl.g:1527:6: lv_inputType_5_0= ruleInputType
                    {

                    						newCompositeNode(grammarAccess.getSourceAccess().getInputTypeInputTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_inputType_5_0=ruleInputType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSourceRule());
                    						}
                    						set(
                    							current,
                    							"inputType",
                    							lv_inputType_5_0,
                    							"pt.up.fe.els2023.Dsl.InputType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1545:3: ( (lv_store_6_0= ruleSourceStore ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:1546:4: (lv_store_6_0= ruleSourceStore )
            	    {
            	    // InternalDsl.g:1546:4: (lv_store_6_0= ruleSourceStore )
            	    // InternalDsl.g:1547:5: lv_store_6_0= ruleSourceStore
            	    {

            	    					newCompositeNode(grammarAccess.getSourceAccess().getStoreSourceStoreParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_store_6_0=ruleSourceStore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"store",
            	    						lv_store_6_0,
            	    						"pt.up.fe.els2023.Dsl.SourceStore");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalDsl.g:1564:3: ( (lv_select_7_0= ruleSourceCoumnSelect ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1565:4: (lv_select_7_0= ruleSourceCoumnSelect )
                    {
                    // InternalDsl.g:1565:4: (lv_select_7_0= ruleSourceCoumnSelect )
                    // InternalDsl.g:1566:5: lv_select_7_0= ruleSourceCoumnSelect
                    {

                    					newCompositeNode(grammarAccess.getSourceAccess().getSelectSourceCoumnSelectParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_select_7_0=ruleSourceCoumnSelect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSourceRule());
                    					}
                    					set(
                    						current,
                    						"select",
                    						lv_select_7_0,
                    						"pt.up.fe.els2023.Dsl.SourceCoumnSelect");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSourceAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleCanonicalizePathTransformation"
    // InternalDsl.g:1591:1: entryRuleCanonicalizePathTransformation returns [EObject current=null] : iv_ruleCanonicalizePathTransformation= ruleCanonicalizePathTransformation EOF ;
    public final EObject entryRuleCanonicalizePathTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCanonicalizePathTransformation = null;


        try {
            // InternalDsl.g:1591:71: (iv_ruleCanonicalizePathTransformation= ruleCanonicalizePathTransformation EOF )
            // InternalDsl.g:1592:2: iv_ruleCanonicalizePathTransformation= ruleCanonicalizePathTransformation EOF
            {
             newCompositeNode(grammarAccess.getCanonicalizePathTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCanonicalizePathTransformation=ruleCanonicalizePathTransformation();

            state._fsp--;

             current =iv_ruleCanonicalizePathTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCanonicalizePathTransformation"


    // $ANTLR start "ruleCanonicalizePathTransformation"
    // InternalDsl.g:1598:1: ruleCanonicalizePathTransformation returns [EObject current=null] : ( () otherlv_1= 'canonicalize' otherlv_2= 'path' ) ;
    public final EObject ruleCanonicalizePathTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1604:2: ( ( () otherlv_1= 'canonicalize' otherlv_2= 'path' ) )
            // InternalDsl.g:1605:2: ( () otherlv_1= 'canonicalize' otherlv_2= 'path' )
            {
            // InternalDsl.g:1605:2: ( () otherlv_1= 'canonicalize' otherlv_2= 'path' )
            // InternalDsl.g:1606:3: () otherlv_1= 'canonicalize' otherlv_2= 'path'
            {
            // InternalDsl.g:1606:3: ()
            // InternalDsl.g:1607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizePathTransformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizeKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCanonicalizePathTransformationAccess().getPathKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCanonicalizePathTransformation"


    // $ANTLR start "entryRuleGetPathTransformation"
    // InternalDsl.g:1625:1: entryRuleGetPathTransformation returns [EObject current=null] : iv_ruleGetPathTransformation= ruleGetPathTransformation EOF ;
    public final EObject entryRuleGetPathTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPathTransformation = null;


        try {
            // InternalDsl.g:1625:62: (iv_ruleGetPathTransformation= ruleGetPathTransformation EOF )
            // InternalDsl.g:1626:2: iv_ruleGetPathTransformation= ruleGetPathTransformation EOF
            {
             newCompositeNode(grammarAccess.getGetPathTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetPathTransformation=ruleGetPathTransformation();

            state._fsp--;

             current =iv_ruleGetPathTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetPathTransformation"


    // $ANTLR start "ruleGetPathTransformation"
    // InternalDsl.g:1632:1: ruleGetPathTransformation returns [EObject current=null] : ( () otherlv_1= 'name' otherlv_2= 'of' otherlv_3= 'path' ) ;
    public final EObject ruleGetPathTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1638:2: ( ( () otherlv_1= 'name' otherlv_2= 'of' otherlv_3= 'path' ) )
            // InternalDsl.g:1639:2: ( () otherlv_1= 'name' otherlv_2= 'of' otherlv_3= 'path' )
            {
            // InternalDsl.g:1639:2: ( () otherlv_1= 'name' otherlv_2= 'of' otherlv_3= 'path' )
            // InternalDsl.g:1640:3: () otherlv_1= 'name' otherlv_2= 'of' otherlv_3= 'path'
            {
            // InternalDsl.g:1640:3: ()
            // InternalDsl.g:1641:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGetPathTransformationAccess().getGetPathTransformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getGetPathTransformationAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getGetPathTransformationAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGetPathTransformationAccess().getPathKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetPathTransformation"


    // $ANTLR start "entryRuleAppendPathTransformation"
    // InternalDsl.g:1663:1: entryRuleAppendPathTransformation returns [EObject current=null] : iv_ruleAppendPathTransformation= ruleAppendPathTransformation EOF ;
    public final EObject entryRuleAppendPathTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendPathTransformation = null;


        try {
            // InternalDsl.g:1663:65: (iv_ruleAppendPathTransformation= ruleAppendPathTransformation EOF )
            // InternalDsl.g:1664:2: iv_ruleAppendPathTransformation= ruleAppendPathTransformation EOF
            {
             newCompositeNode(grammarAccess.getAppendPathTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppendPathTransformation=ruleAppendPathTransformation();

            state._fsp--;

             current =iv_ruleAppendPathTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppendPathTransformation"


    // $ANTLR start "ruleAppendPathTransformation"
    // InternalDsl.g:1670:1: ruleAppendPathTransformation returns [EObject current=null] : (otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAppendPathTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1676:2: ( (otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1677:2: (otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1677:2: (otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) )
            // InternalDsl.g:1678:3: otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendPathTransformationAccess().getAppendKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAppendPathTransformationAccess().getPathKeyword_1());
            		
            // InternalDsl.g:1686:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalDsl.g:1687:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalDsl.g:1687:4: (lv_path_2_0= RULE_STRING )
            // InternalDsl.g:1688:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_2_0, grammarAccess.getAppendPathTransformationAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppendPathTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppendPathTransformation"


    // $ANTLR start "entryRulePathTransformation"
    // InternalDsl.g:1708:1: entryRulePathTransformation returns [EObject current=null] : iv_rulePathTransformation= rulePathTransformation EOF ;
    public final EObject entryRulePathTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathTransformation = null;


        try {
            // InternalDsl.g:1708:59: (iv_rulePathTransformation= rulePathTransformation EOF )
            // InternalDsl.g:1709:2: iv_rulePathTransformation= rulePathTransformation EOF
            {
             newCompositeNode(grammarAccess.getPathTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathTransformation=rulePathTransformation();

            state._fsp--;

             current =iv_rulePathTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathTransformation"


    // $ANTLR start "rulePathTransformation"
    // InternalDsl.g:1715:1: rulePathTransformation returns [EObject current=null] : ( ( ( (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation ) ) ) otherlv_1= 'in' ( (lv_column_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePathTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_column_2_0=null;
        EObject lv_operation_0_1 = null;

        EObject lv_operation_0_2 = null;

        EObject lv_operation_0_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:1721:2: ( ( ( ( (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation ) ) ) otherlv_1= 'in' ( (lv_column_2_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1722:2: ( ( ( (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation ) ) ) otherlv_1= 'in' ( (lv_column_2_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1722:2: ( ( ( (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation ) ) ) otherlv_1= 'in' ( (lv_column_2_0= RULE_STRING ) ) )
            // InternalDsl.g:1723:3: ( ( (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation ) ) ) otherlv_1= 'in' ( (lv_column_2_0= RULE_STRING ) )
            {
            // InternalDsl.g:1723:3: ( ( (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation ) ) )
            // InternalDsl.g:1724:4: ( (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation ) )
            {
            // InternalDsl.g:1724:4: ( (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation ) )
            // InternalDsl.g:1725:5: (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation )
            {
            // InternalDsl.g:1725:5: (lv_operation_0_1= ruleAppendPathTransformation | lv_operation_0_2= ruleCanonicalizePathTransformation | lv_operation_0_3= ruleGetPathTransformation )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt27=1;
                }
                break;
            case 42:
                {
                alt27=2;
                }
                break;
            case 44:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1726:6: lv_operation_0_1= ruleAppendPathTransformation
                    {

                    						newCompositeNode(grammarAccess.getPathTransformationAccess().getOperationAppendPathTransformationParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operation_0_1=ruleAppendPathTransformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPathTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_1,
                    							"pt.up.fe.els2023.Dsl.AppendPathTransformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1742:6: lv_operation_0_2= ruleCanonicalizePathTransformation
                    {

                    						newCompositeNode(grammarAccess.getPathTransformationAccess().getOperationCanonicalizePathTransformationParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operation_0_2=ruleCanonicalizePathTransformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPathTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_2,
                    							"pt.up.fe.els2023.Dsl.CanonicalizePathTransformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1758:6: lv_operation_0_3= ruleGetPathTransformation
                    {

                    						newCompositeNode(grammarAccess.getPathTransformationAccess().getOperationGetPathTransformationParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_27);
                    lv_operation_0_3=ruleGetPathTransformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPathTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_3,
                    							"pt.up.fe.els2023.Dsl.GetPathTransformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPathTransformationAccess().getInKeyword_1());
            		
            // InternalDsl.g:1780:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalDsl.g:1781:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalDsl.g:1781:4: (lv_column_2_0= RULE_STRING )
            // InternalDsl.g:1782:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_column_2_0, grammarAccess.getPathTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathTransformation"


    // $ANTLR start "entryRuleFoldAverageTranformation"
    // InternalDsl.g:1802:1: entryRuleFoldAverageTranformation returns [EObject current=null] : iv_ruleFoldAverageTranformation= ruleFoldAverageTranformation EOF ;
    public final EObject entryRuleFoldAverageTranformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoldAverageTranformation = null;


        try {
            // InternalDsl.g:1802:65: (iv_ruleFoldAverageTranformation= ruleFoldAverageTranformation EOF )
            // InternalDsl.g:1803:2: iv_ruleFoldAverageTranformation= ruleFoldAverageTranformation EOF
            {
             newCompositeNode(grammarAccess.getFoldAverageTranformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoldAverageTranformation=ruleFoldAverageTranformation();

            state._fsp--;

             current =iv_ruleFoldAverageTranformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoldAverageTranformation"


    // $ANTLR start "ruleFoldAverageTranformation"
    // InternalDsl.g:1809:1: ruleFoldAverageTranformation returns [EObject current=null] : ( () otherlv_1= 'fold' otherlv_2= 'average' ) ;
    public final EObject ruleFoldAverageTranformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1815:2: ( ( () otherlv_1= 'fold' otherlv_2= 'average' ) )
            // InternalDsl.g:1816:2: ( () otherlv_1= 'fold' otherlv_2= 'average' )
            {
            // InternalDsl.g:1816:2: ( () otherlv_1= 'fold' otherlv_2= 'average' )
            // InternalDsl.g:1817:3: () otherlv_1= 'fold' otherlv_2= 'average'
            {
            // InternalDsl.g:1817:3: ()
            // InternalDsl.g:1818:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFoldAverageTranformationAccess().getFoldAverageTranformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getFoldAverageTranformationAccess().getFoldKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFoldAverageTranformationAccess().getAverageKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoldAverageTranformation"


    // $ANTLR start "entryRuleFoldSumTranformation"
    // InternalDsl.g:1836:1: entryRuleFoldSumTranformation returns [EObject current=null] : iv_ruleFoldSumTranformation= ruleFoldSumTranformation EOF ;
    public final EObject entryRuleFoldSumTranformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoldSumTranformation = null;


        try {
            // InternalDsl.g:1836:61: (iv_ruleFoldSumTranformation= ruleFoldSumTranformation EOF )
            // InternalDsl.g:1837:2: iv_ruleFoldSumTranformation= ruleFoldSumTranformation EOF
            {
             newCompositeNode(grammarAccess.getFoldSumTranformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoldSumTranformation=ruleFoldSumTranformation();

            state._fsp--;

             current =iv_ruleFoldSumTranformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoldSumTranformation"


    // $ANTLR start "ruleFoldSumTranformation"
    // InternalDsl.g:1843:1: ruleFoldSumTranformation returns [EObject current=null] : ( () otherlv_1= 'fold' otherlv_2= 'sum' ) ;
    public final EObject ruleFoldSumTranformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1849:2: ( ( () otherlv_1= 'fold' otherlv_2= 'sum' ) )
            // InternalDsl.g:1850:2: ( () otherlv_1= 'fold' otherlv_2= 'sum' )
            {
            // InternalDsl.g:1850:2: ( () otherlv_1= 'fold' otherlv_2= 'sum' )
            // InternalDsl.g:1851:3: () otherlv_1= 'fold' otherlv_2= 'sum'
            {
            // InternalDsl.g:1851:3: ()
            // InternalDsl.g:1852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFoldSumTranformationAccess().getFoldSumTranformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getFoldSumTranformationAccess().getFoldKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFoldSumTranformationAccess().getSumKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoldSumTranformation"


    // $ANTLR start "entryRuleGroupBy"
    // InternalDsl.g:1870:1: entryRuleGroupBy returns [EObject current=null] : iv_ruleGroupBy= ruleGroupBy EOF ;
    public final EObject entryRuleGroupBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupBy = null;


        try {
            // InternalDsl.g:1870:48: (iv_ruleGroupBy= ruleGroupBy EOF )
            // InternalDsl.g:1871:2: iv_ruleGroupBy= ruleGroupBy EOF
            {
             newCompositeNode(grammarAccess.getGroupByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupBy=ruleGroupBy();

            state._fsp--;

             current =iv_ruleGroupBy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupBy"


    // $ANTLR start "ruleGroupBy"
    // InternalDsl.g:1877:1: ruleGroupBy returns [EObject current=null] : (otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1883:2: ( (otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1884:2: (otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1884:2: (otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) ) )
            // InternalDsl.g:1885:3: otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupByAccess().getGroupKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupByAccess().getByKeyword_1());
            		
            // InternalDsl.g:1893:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalDsl.g:1894:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalDsl.g:1894:4: (lv_column_2_0= RULE_STRING )
            // InternalDsl.g:1895:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_column_2_0, grammarAccess.getGroupByAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupByRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupBy"


    // $ANTLR start "entryRuleFoldTransformation"
    // InternalDsl.g:1915:1: entryRuleFoldTransformation returns [EObject current=null] : iv_ruleFoldTransformation= ruleFoldTransformation EOF ;
    public final EObject entryRuleFoldTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoldTransformation = null;


        try {
            // InternalDsl.g:1915:59: (iv_ruleFoldTransformation= ruleFoldTransformation EOF )
            // InternalDsl.g:1916:2: iv_ruleFoldTransformation= ruleFoldTransformation EOF
            {
             newCompositeNode(grammarAccess.getFoldTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoldTransformation=ruleFoldTransformation();

            state._fsp--;

             current =iv_ruleFoldTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoldTransformation"


    // $ANTLR start "ruleFoldTransformation"
    // InternalDsl.g:1922:1: ruleFoldTransformation returns [EObject current=null] : ( ( ( (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )? ) ;
    public final EObject ruleFoldTransformation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_1 = null;

        EObject lv_operation_0_2 = null;

        EObject lv_groupBy_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1928:2: ( ( ( ( (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )? ) )
            // InternalDsl.g:1929:2: ( ( ( (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )? )
            {
            // InternalDsl.g:1929:2: ( ( ( (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )? )
            // InternalDsl.g:1930:3: ( ( (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )?
            {
            // InternalDsl.g:1930:3: ( ( (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation ) ) )
            // InternalDsl.g:1931:4: ( (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation ) )
            {
            // InternalDsl.g:1931:4: ( (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation ) )
            // InternalDsl.g:1932:5: (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation )
            {
            // InternalDsl.g:1932:5: (lv_operation_0_1= ruleFoldSumTranformation | lv_operation_0_2= ruleFoldAverageTranformation )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==48) ) {
                    alt28=1;
                }
                else if ( (LA28_1==47) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1933:6: lv_operation_0_1= ruleFoldSumTranformation
                    {

                    						newCompositeNode(grammarAccess.getFoldTransformationAccess().getOperationFoldSumTranformationParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_operation_0_1=ruleFoldSumTranformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFoldTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_1,
                    							"pt.up.fe.els2023.Dsl.FoldSumTranformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1949:6: lv_operation_0_2= ruleFoldAverageTranformation
                    {

                    						newCompositeNode(grammarAccess.getFoldTransformationAccess().getOperationFoldAverageTranformationParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_38);
                    lv_operation_0_2=ruleFoldAverageTranformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFoldTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_2,
                    							"pt.up.fe.els2023.Dsl.FoldAverageTranformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalDsl.g:1967:3: ( (lv_groupBy_1_0= ruleGroupBy ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1968:4: (lv_groupBy_1_0= ruleGroupBy )
                    {
                    // InternalDsl.g:1968:4: (lv_groupBy_1_0= ruleGroupBy )
                    // InternalDsl.g:1969:5: lv_groupBy_1_0= ruleGroupBy
                    {

                    					newCompositeNode(grammarAccess.getFoldTransformationAccess().getGroupByGroupByParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_groupBy_1_0=ruleGroupBy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFoldTransformationRule());
                    					}
                    					set(
                    						current,
                    						"groupBy",
                    						lv_groupBy_1_0,
                    						"pt.up.fe.els2023.Dsl.GroupBy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoldTransformation"


    // $ANTLR start "entryRuleAddColumnTransformation"
    // InternalDsl.g:1990:1: entryRuleAddColumnTransformation returns [EObject current=null] : iv_ruleAddColumnTransformation= ruleAddColumnTransformation EOF ;
    public final EObject entryRuleAddColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddColumnTransformation = null;


        try {
            // InternalDsl.g:1990:64: (iv_ruleAddColumnTransformation= ruleAddColumnTransformation EOF )
            // InternalDsl.g:1991:2: iv_ruleAddColumnTransformation= ruleAddColumnTransformation EOF
            {
             newCompositeNode(grammarAccess.getAddColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddColumnTransformation=ruleAddColumnTransformation();

            state._fsp--;

             current =iv_ruleAddColumnTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddColumnTransformation"


    // $ANTLR start "ruleAddColumnTransformation"
    // InternalDsl.g:1997:1: ruleAddColumnTransformation returns [EObject current=null] : (otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddColumnTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_column_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2003:2: ( (otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalDsl.g:2004:2: (otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:2004:2: (otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalDsl.g:2005:3: otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAddColumnTransformationAccess().getAddKeyword_0());
            		
            // InternalDsl.g:2009:3: ( (lv_column_1_0= RULE_STRING ) )
            // InternalDsl.g:2010:4: (lv_column_1_0= RULE_STRING )
            {
            // InternalDsl.g:2010:4: (lv_column_1_0= RULE_STRING )
            // InternalDsl.g:2011:5: lv_column_1_0= RULE_STRING
            {
            lv_column_1_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_column_1_0, grammarAccess.getAddColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddColumnTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAddColumnTransformationAccess().getWithKeyword_2());
            		
            // InternalDsl.g:2031:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalDsl.g:2032:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalDsl.g:2032:4: (lv_value_3_0= RULE_STRING )
            // InternalDsl.g:2033:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getAddColumnTransformationAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddColumnTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddColumnTransformation"


    // $ANTLR start "entryRuleRemoveColumnTransformation"
    // InternalDsl.g:2053:1: entryRuleRemoveColumnTransformation returns [EObject current=null] : iv_ruleRemoveColumnTransformation= ruleRemoveColumnTransformation EOF ;
    public final EObject entryRuleRemoveColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveColumnTransformation = null;


        try {
            // InternalDsl.g:2053:67: (iv_ruleRemoveColumnTransformation= ruleRemoveColumnTransformation EOF )
            // InternalDsl.g:2054:2: iv_ruleRemoveColumnTransformation= ruleRemoveColumnTransformation EOF
            {
             newCompositeNode(grammarAccess.getRemoveColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveColumnTransformation=ruleRemoveColumnTransformation();

            state._fsp--;

             current =iv_ruleRemoveColumnTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemoveColumnTransformation"


    // $ANTLR start "ruleRemoveColumnTransformation"
    // InternalDsl.g:2060:1: ruleRemoveColumnTransformation returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) ;
    public final EObject ruleRemoveColumnTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;
        Token lv_column_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:2066:2: ( (otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) )
            // InternalDsl.g:2067:2: (otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            {
            // InternalDsl.g:2067:2: (otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            // InternalDsl.g:2068:3: otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveColumnTransformationAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveColumnTransformationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDsl.g:2076:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalDsl.g:2077:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalDsl.g:2077:4: (lv_column_2_0= RULE_STRING )
            // InternalDsl.g:2078:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_column_2_0, grammarAccess.getRemoveColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveColumnTransformationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:2094:3: (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_STRING) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalDsl.g:2095:4: otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:2099:4: ( (lv_column_4_0= RULE_STRING ) )
            	    // InternalDsl.g:2100:5: (lv_column_4_0= RULE_STRING )
            	    {
            	    // InternalDsl.g:2100:5: (lv_column_4_0= RULE_STRING )
            	    // InternalDsl.g:2101:6: lv_column_4_0= RULE_STRING
            	    {
            	    lv_column_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    						newLeafNode(lv_column_4_0, grammarAccess.getRemoveColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRemoveColumnTransformationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"column",
            	    							lv_column_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalDsl.g:2118:3: (otherlv_5= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:2119:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRemoveColumnTransformationAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemoveColumnTransformation"


    // $ANTLR start "entryRuleRenameColumnTransformation"
    // InternalDsl.g:2132:1: entryRuleRenameColumnTransformation returns [EObject current=null] : iv_ruleRenameColumnTransformation= ruleRenameColumnTransformation EOF ;
    public final EObject entryRuleRenameColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameColumnTransformation = null;


        try {
            // InternalDsl.g:2132:67: (iv_ruleRenameColumnTransformation= ruleRenameColumnTransformation EOF )
            // InternalDsl.g:2133:2: iv_ruleRenameColumnTransformation= ruleRenameColumnTransformation EOF
            {
             newCompositeNode(grammarAccess.getRenameColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameColumnTransformation=ruleRenameColumnTransformation();

            state._fsp--;

             current =iv_ruleRenameColumnTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRenameColumnTransformation"


    // $ANTLR start "ruleRenameColumnTransformation"
    // InternalDsl.g:2139:1: ruleRenameColumnTransformation returns [EObject current=null] : (otherlv_0= 'rename' ( (lv_regex_1_0= 'regex' ) )? ( (lv_from_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleRenameColumnTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_regex_1_0=null;
        Token lv_from_2_0=null;
        Token otherlv_3=null;
        Token lv_to_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2145:2: ( (otherlv_0= 'rename' ( (lv_regex_1_0= 'regex' ) )? ( (lv_from_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:2146:2: (otherlv_0= 'rename' ( (lv_regex_1_0= 'regex' ) )? ( (lv_from_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:2146:2: (otherlv_0= 'rename' ( (lv_regex_1_0= 'regex' ) )? ( (lv_from_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_STRING ) ) )
            // InternalDsl.g:2147:3: otherlv_0= 'rename' ( (lv_regex_1_0= 'regex' ) )? ( (lv_from_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_to_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameColumnTransformationAccess().getRenameKeyword_0());
            		
            // InternalDsl.g:2151:3: ( (lv_regex_1_0= 'regex' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:2152:4: (lv_regex_1_0= 'regex' )
                    {
                    // InternalDsl.g:2152:4: (lv_regex_1_0= 'regex' )
                    // InternalDsl.g:2153:5: lv_regex_1_0= 'regex'
                    {
                    lv_regex_1_0=(Token)match(input,55,FOLLOW_20); 

                    					newLeafNode(lv_regex_1_0, grammarAccess.getRenameColumnTransformationAccess().getRegexRegexKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRenameColumnTransformationRule());
                    					}
                    					setWithLastConsumed(current, "regex", lv_regex_1_0, "regex");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2165:3: ( (lv_from_2_0= RULE_STRING ) )
            // InternalDsl.g:2166:4: (lv_from_2_0= RULE_STRING )
            {
            // InternalDsl.g:2166:4: (lv_from_2_0= RULE_STRING )
            // InternalDsl.g:2167:5: lv_from_2_0= RULE_STRING
            {
            lv_from_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_from_2_0, grammarAccess.getRenameColumnTransformationAccess().getFromSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameColumnTransformationAccess().getToKeyword_3());
            		
            // InternalDsl.g:2187:3: ( (lv_to_4_0= RULE_STRING ) )
            // InternalDsl.g:2188:4: (lv_to_4_0= RULE_STRING )
            {
            // InternalDsl.g:2188:4: (lv_to_4_0= RULE_STRING )
            // InternalDsl.g:2189:5: lv_to_4_0= RULE_STRING
            {
            lv_to_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_to_4_0, grammarAccess.getRenameColumnTransformationAccess().getToSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRenameColumnTransformation"


    // $ANTLR start "entryRuleSelectColumnTransformation"
    // InternalDsl.g:2209:1: entryRuleSelectColumnTransformation returns [EObject current=null] : iv_ruleSelectColumnTransformation= ruleSelectColumnTransformation EOF ;
    public final EObject entryRuleSelectColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectColumnTransformation = null;


        try {
            // InternalDsl.g:2209:67: (iv_ruleSelectColumnTransformation= ruleSelectColumnTransformation EOF )
            // InternalDsl.g:2210:2: iv_ruleSelectColumnTransformation= ruleSelectColumnTransformation EOF
            {
             newCompositeNode(grammarAccess.getSelectColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectColumnTransformation=ruleSelectColumnTransformation();

            state._fsp--;

             current =iv_ruleSelectColumnTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectColumnTransformation"


    // $ANTLR start "ruleSelectColumnTransformation"
    // InternalDsl.g:2216:1: ruleSelectColumnTransformation returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) ;
    public final EObject ruleSelectColumnTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;
        Token otherlv_3=null;
        Token lv_column_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDsl.g:2222:2: ( (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) )
            // InternalDsl.g:2223:2: (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            {
            // InternalDsl.g:2223:2: (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            // InternalDsl.g:2224:3: otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectColumnTransformationAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectColumnTransformationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDsl.g:2232:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalDsl.g:2233:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalDsl.g:2233:4: (lv_column_2_0= RULE_STRING )
            // InternalDsl.g:2234:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_column_2_0, grammarAccess.getSelectColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectColumnTransformationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"column",
            						lv_column_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:2250:3: (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_STRING) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalDsl.g:2251:4: otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:2255:4: ( (lv_column_4_0= RULE_STRING ) )
            	    // InternalDsl.g:2256:5: (lv_column_4_0= RULE_STRING )
            	    {
            	    // InternalDsl.g:2256:5: (lv_column_4_0= RULE_STRING )
            	    // InternalDsl.g:2257:6: lv_column_4_0= RULE_STRING
            	    {
            	    lv_column_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    						newLeafNode(lv_column_4_0, grammarAccess.getSelectColumnTransformationAccess().getColumnSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectColumnTransformationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"column",
            	    							lv_column_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalDsl.g:2274:3: (otherlv_5= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:2275:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectColumnTransformationAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectColumnTransformation"


    // $ANTLR start "entryRuleColumnTransformation"
    // InternalDsl.g:2288:1: entryRuleColumnTransformation returns [EObject current=null] : iv_ruleColumnTransformation= ruleColumnTransformation EOF ;
    public final EObject entryRuleColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnTransformation = null;


        try {
            // InternalDsl.g:2288:61: (iv_ruleColumnTransformation= ruleColumnTransformation EOF )
            // InternalDsl.g:2289:2: iv_ruleColumnTransformation= ruleColumnTransformation EOF
            {
             newCompositeNode(grammarAccess.getColumnTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnTransformation=ruleColumnTransformation();

            state._fsp--;

             current =iv_ruleColumnTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnTransformation"


    // $ANTLR start "ruleColumnTransformation"
    // InternalDsl.g:2295:1: ruleColumnTransformation returns [EObject current=null] : (this_AddColumnTransformation_0= ruleAddColumnTransformation | this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation | this_RenameColumnTransformation_2= ruleRenameColumnTransformation | this_SelectColumnTransformation_3= ruleSelectColumnTransformation ) ;
    public final EObject ruleColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_AddColumnTransformation_0 = null;

        EObject this_RemoveColumnTransformation_1 = null;

        EObject this_RenameColumnTransformation_2 = null;

        EObject this_SelectColumnTransformation_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:2301:2: ( (this_AddColumnTransformation_0= ruleAddColumnTransformation | this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation | this_RenameColumnTransformation_2= ruleRenameColumnTransformation | this_SelectColumnTransformation_3= ruleSelectColumnTransformation ) )
            // InternalDsl.g:2302:2: (this_AddColumnTransformation_0= ruleAddColumnTransformation | this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation | this_RenameColumnTransformation_2= ruleRenameColumnTransformation | this_SelectColumnTransformation_3= ruleSelectColumnTransformation )
            {
            // InternalDsl.g:2302:2: (this_AddColumnTransformation_0= ruleAddColumnTransformation | this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation | this_RenameColumnTransformation_2= ruleRenameColumnTransformation | this_SelectColumnTransformation_3= ruleSelectColumnTransformation )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt35=1;
                }
                break;
            case 53:
                {
                alt35=2;
                }
                break;
            case 54:
                {
                alt35=3;
                }
                break;
            case 38:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalDsl.g:2303:3: this_AddColumnTransformation_0= ruleAddColumnTransformation
                    {

                    			newCompositeNode(grammarAccess.getColumnTransformationAccess().getAddColumnTransformationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddColumnTransformation_0=ruleAddColumnTransformation();

                    state._fsp--;


                    			current = this_AddColumnTransformation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2312:3: this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation
                    {

                    			newCompositeNode(grammarAccess.getColumnTransformationAccess().getRemoveColumnTransformationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveColumnTransformation_1=ruleRemoveColumnTransformation();

                    state._fsp--;


                    			current = this_RemoveColumnTransformation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:2321:3: this_RenameColumnTransformation_2= ruleRenameColumnTransformation
                    {

                    			newCompositeNode(grammarAccess.getColumnTransformationAccess().getRenameColumnTransformationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameColumnTransformation_2=ruleRenameColumnTransformation();

                    state._fsp--;


                    			current = this_RenameColumnTransformation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:2330:3: this_SelectColumnTransformation_3= ruleSelectColumnTransformation
                    {

                    			newCompositeNode(grammarAccess.getColumnTransformationAccess().getSelectColumnTransformationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectColumnTransformation_3=ruleSelectColumnTransformation();

                    state._fsp--;


                    			current = this_SelectColumnTransformation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnTransformation"


    // $ANTLR start "entryRuleRoundCellsTransformation"
    // InternalDsl.g:2342:1: entryRuleRoundCellsTransformation returns [EObject current=null] : iv_ruleRoundCellsTransformation= ruleRoundCellsTransformation EOF ;
    public final EObject entryRuleRoundCellsTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundCellsTransformation = null;


        try {
            // InternalDsl.g:2342:65: (iv_ruleRoundCellsTransformation= ruleRoundCellsTransformation EOF )
            // InternalDsl.g:2343:2: iv_ruleRoundCellsTransformation= ruleRoundCellsTransformation EOF
            {
             newCompositeNode(grammarAccess.getRoundCellsTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoundCellsTransformation=ruleRoundCellsTransformation();

            state._fsp--;

             current =iv_ruleRoundCellsTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoundCellsTransformation"


    // $ANTLR start "ruleRoundCellsTransformation"
    // InternalDsl.g:2349:1: ruleRoundCellsTransformation returns [EObject current=null] : (otherlv_0= 'round' otherlv_1= '[' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' otherlv_7= 'digits' ( (lv_digits_8_0= RULE_INT ) ) ) ;
    public final EObject ruleRoundCellsTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_columns_2_0=null;
        Token otherlv_3=null;
        Token lv_columns_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_digits_8_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2355:2: ( (otherlv_0= 'round' otherlv_1= '[' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' otherlv_7= 'digits' ( (lv_digits_8_0= RULE_INT ) ) ) )
            // InternalDsl.g:2356:2: (otherlv_0= 'round' otherlv_1= '[' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' otherlv_7= 'digits' ( (lv_digits_8_0= RULE_INT ) ) )
            {
            // InternalDsl.g:2356:2: (otherlv_0= 'round' otherlv_1= '[' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' otherlv_7= 'digits' ( (lv_digits_8_0= RULE_INT ) ) )
            // InternalDsl.g:2357:3: otherlv_0= 'round' otherlv_1= '[' ( (lv_columns_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' otherlv_7= 'digits' ( (lv_digits_8_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRoundCellsTransformationAccess().getRoundKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRoundCellsTransformationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDsl.g:2365:3: ( (lv_columns_2_0= RULE_STRING ) )
            // InternalDsl.g:2366:4: (lv_columns_2_0= RULE_STRING )
            {
            // InternalDsl.g:2366:4: (lv_columns_2_0= RULE_STRING )
            // InternalDsl.g:2367:5: lv_columns_2_0= RULE_STRING
            {
            lv_columns_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_columns_2_0, grammarAccess.getRoundCellsTransformationAccess().getColumnsSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoundCellsTransformationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"columns",
            						lv_columns_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:2383:3: (otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==17) ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1==RULE_STRING) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalDsl.g:2384:4: otherlv_3= ',' ( (lv_columns_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRoundCellsTransformationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:2388:4: ( (lv_columns_4_0= RULE_STRING ) )
            	    // InternalDsl.g:2389:5: (lv_columns_4_0= RULE_STRING )
            	    {
            	    // InternalDsl.g:2389:5: (lv_columns_4_0= RULE_STRING )
            	    // InternalDsl.g:2390:6: lv_columns_4_0= RULE_STRING
            	    {
            	    lv_columns_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    						newLeafNode(lv_columns_4_0, grammarAccess.getRoundCellsTransformationAccess().getColumnsSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRoundCellsTransformationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"columns",
            	    							lv_columns_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalDsl.g:2407:3: (otherlv_5= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:2408:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getRoundCellsTransformationAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_42); 

            			newLeafNode(otherlv_6, grammarAccess.getRoundCellsTransformationAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,58,FOLLOW_43); 

            			newLeafNode(otherlv_7, grammarAccess.getRoundCellsTransformationAccess().getDigitsKeyword_6());
            		
            // InternalDsl.g:2421:3: ( (lv_digits_8_0= RULE_INT ) )
            // InternalDsl.g:2422:4: (lv_digits_8_0= RULE_INT )
            {
            // InternalDsl.g:2422:4: (lv_digits_8_0= RULE_INT )
            // InternalDsl.g:2423:5: lv_digits_8_0= RULE_INT
            {
            lv_digits_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_digits_8_0, grammarAccess.getRoundCellsTransformationAccess().getDigitsINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoundCellsTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"digits",
            						lv_digits_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoundCellsTransformation"


    // $ANTLR start "entryRuleSetCellsTransformation"
    // InternalDsl.g:2443:1: entryRuleSetCellsTransformation returns [EObject current=null] : iv_ruleSetCellsTransformation= ruleSetCellsTransformation EOF ;
    public final EObject entryRuleSetCellsTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetCellsTransformation = null;


        try {
            // InternalDsl.g:2443:63: (iv_ruleSetCellsTransformation= ruleSetCellsTransformation EOF )
            // InternalDsl.g:2444:2: iv_ruleSetCellsTransformation= ruleSetCellsTransformation EOF
            {
             newCompositeNode(grammarAccess.getSetCellsTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetCellsTransformation=ruleSetCellsTransformation();

            state._fsp--;

             current =iv_ruleSetCellsTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetCellsTransformation"


    // $ANTLR start "ruleSetCellsTransformation"
    // InternalDsl.g:2450:1: ruleSetCellsTransformation returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'value' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'at' otherlv_4= 'column' ( (lv_column_5_0= RULE_STRING ) ) (otherlv_6= 'at' otherlv_7= 'row' ( (lv_row_8_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleSetCellsTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_column_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_row_8_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2456:2: ( (otherlv_0= 'set' otherlv_1= 'value' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'at' otherlv_4= 'column' ( (lv_column_5_0= RULE_STRING ) ) (otherlv_6= 'at' otherlv_7= 'row' ( (lv_row_8_0= RULE_STRING ) ) )? ) )
            // InternalDsl.g:2457:2: (otherlv_0= 'set' otherlv_1= 'value' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'at' otherlv_4= 'column' ( (lv_column_5_0= RULE_STRING ) ) (otherlv_6= 'at' otherlv_7= 'row' ( (lv_row_8_0= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:2457:2: (otherlv_0= 'set' otherlv_1= 'value' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'at' otherlv_4= 'column' ( (lv_column_5_0= RULE_STRING ) ) (otherlv_6= 'at' otherlv_7= 'row' ( (lv_row_8_0= RULE_STRING ) ) )? )
            // InternalDsl.g:2458:3: otherlv_0= 'set' otherlv_1= 'value' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= 'at' otherlv_4= 'column' ( (lv_column_5_0= RULE_STRING ) ) (otherlv_6= 'at' otherlv_7= 'row' ( (lv_row_8_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getSetCellsTransformationAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,60,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSetCellsTransformationAccess().getValueKeyword_1());
            		
            // InternalDsl.g:2466:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDsl.g:2467:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDsl.g:2467:4: (lv_value_2_0= RULE_STRING )
            // InternalDsl.g:2468:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(lv_value_2_0, grammarAccess.getSetCellsTransformationAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetCellsTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,61,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getSetCellsTransformationAccess().getAtKeyword_3());
            		
            otherlv_4=(Token)match(input,62,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getSetCellsTransformationAccess().getColumnKeyword_4());
            		
            // InternalDsl.g:2492:3: ( (lv_column_5_0= RULE_STRING ) )
            // InternalDsl.g:2493:4: (lv_column_5_0= RULE_STRING )
            {
            // InternalDsl.g:2493:4: (lv_column_5_0= RULE_STRING )
            // InternalDsl.g:2494:5: lv_column_5_0= RULE_STRING
            {
            lv_column_5_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

            					newLeafNode(lv_column_5_0, grammarAccess.getSetCellsTransformationAccess().getColumnSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetCellsTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:2510:3: (otherlv_6= 'at' otherlv_7= 'row' ( (lv_row_8_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==61) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:2511:4: otherlv_6= 'at' otherlv_7= 'row' ( (lv_row_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_48); 

                    				newLeafNode(otherlv_6, grammarAccess.getSetCellsTransformationAccess().getAtKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,63,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getSetCellsTransformationAccess().getRowKeyword_6_1());
                    			
                    // InternalDsl.g:2519:4: ( (lv_row_8_0= RULE_STRING ) )
                    // InternalDsl.g:2520:5: (lv_row_8_0= RULE_STRING )
                    {
                    // InternalDsl.g:2520:5: (lv_row_8_0= RULE_STRING )
                    // InternalDsl.g:2521:6: lv_row_8_0= RULE_STRING
                    {
                    lv_row_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_row_8_0, grammarAccess.getSetCellsTransformationAccess().getRowSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetCellsTransformationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"row",
                    							lv_row_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetCellsTransformation"


    // $ANTLR start "entryRuleCellTransformation"
    // InternalDsl.g:2542:1: entryRuleCellTransformation returns [EObject current=null] : iv_ruleCellTransformation= ruleCellTransformation EOF ;
    public final EObject entryRuleCellTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellTransformation = null;


        try {
            // InternalDsl.g:2542:59: (iv_ruleCellTransformation= ruleCellTransformation EOF )
            // InternalDsl.g:2543:2: iv_ruleCellTransformation= ruleCellTransformation EOF
            {
             newCompositeNode(grammarAccess.getCellTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellTransformation=ruleCellTransformation();

            state._fsp--;

             current =iv_ruleCellTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellTransformation"


    // $ANTLR start "ruleCellTransformation"
    // InternalDsl.g:2549:1: ruleCellTransformation returns [EObject current=null] : (this_RoundCellsTransformation_0= ruleRoundCellsTransformation | this_SetCellsTransformation_1= ruleSetCellsTransformation ) ;
    public final EObject ruleCellTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_RoundCellsTransformation_0 = null;

        EObject this_SetCellsTransformation_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:2555:2: ( (this_RoundCellsTransformation_0= ruleRoundCellsTransformation | this_SetCellsTransformation_1= ruleSetCellsTransformation ) )
            // InternalDsl.g:2556:2: (this_RoundCellsTransformation_0= ruleRoundCellsTransformation | this_SetCellsTransformation_1= ruleSetCellsTransformation )
            {
            // InternalDsl.g:2556:2: (this_RoundCellsTransformation_0= ruleRoundCellsTransformation | this_SetCellsTransformation_1= ruleSetCellsTransformation )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            else if ( (LA39_0==59) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:2557:3: this_RoundCellsTransformation_0= ruleRoundCellsTransformation
                    {

                    			newCompositeNode(grammarAccess.getCellTransformationAccess().getRoundCellsTransformationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoundCellsTransformation_0=ruleRoundCellsTransformation();

                    state._fsp--;


                    			current = this_RoundCellsTransformation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2566:3: this_SetCellsTransformation_1= ruleSetCellsTransformation
                    {

                    			newCompositeNode(grammarAccess.getCellTransformationAccess().getSetCellsTransformationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetCellsTransformation_1=ruleSetCellsTransformation();

                    state._fsp--;


                    			current = this_SetCellsTransformation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellTransformation"


    // $ANTLR start "entryRuleSelectRowsTransformation"
    // InternalDsl.g:2578:1: entryRuleSelectRowsTransformation returns [EObject current=null] : iv_ruleSelectRowsTransformation= ruleSelectRowsTransformation EOF ;
    public final EObject entryRuleSelectRowsTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectRowsTransformation = null;


        try {
            // InternalDsl.g:2578:65: (iv_ruleSelectRowsTransformation= ruleSelectRowsTransformation EOF )
            // InternalDsl.g:2579:2: iv_ruleSelectRowsTransformation= ruleSelectRowsTransformation EOF
            {
             newCompositeNode(grammarAccess.getSelectRowsTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectRowsTransformation=ruleSelectRowsTransformation();

            state._fsp--;

             current =iv_ruleSelectRowsTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectRowsTransformation"


    // $ANTLR start "ruleSelectRowsTransformation"
    // InternalDsl.g:2585:1: ruleSelectRowsTransformation returns [EObject current=null] : (otherlv_0= 'select' ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= 'skip' ( (lv_length_3_0= RULE_INT ) ) )? (otherlv_4= 'groupby' ( (lv_groupBy_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleSelectRowsTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_start_1_0=null;
        Token otherlv_2=null;
        Token lv_length_3_0=null;
        Token otherlv_4=null;
        Token lv_groupBy_5_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2591:2: ( (otherlv_0= 'select' ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= 'skip' ( (lv_length_3_0= RULE_INT ) ) )? (otherlv_4= 'groupby' ( (lv_groupBy_5_0= RULE_STRING ) ) )? ) )
            // InternalDsl.g:2592:2: (otherlv_0= 'select' ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= 'skip' ( (lv_length_3_0= RULE_INT ) ) )? (otherlv_4= 'groupby' ( (lv_groupBy_5_0= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:2592:2: (otherlv_0= 'select' ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= 'skip' ( (lv_length_3_0= RULE_INT ) ) )? (otherlv_4= 'groupby' ( (lv_groupBy_5_0= RULE_STRING ) ) )? )
            // InternalDsl.g:2593:3: otherlv_0= 'select' ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= 'skip' ( (lv_length_3_0= RULE_INT ) ) )? (otherlv_4= 'groupby' ( (lv_groupBy_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectRowsTransformationAccess().getSelectKeyword_0());
            		
            // InternalDsl.g:2597:3: ( (lv_start_1_0= RULE_INT ) )
            // InternalDsl.g:2598:4: (lv_start_1_0= RULE_INT )
            {
            // InternalDsl.g:2598:4: (lv_start_1_0= RULE_INT )
            // InternalDsl.g:2599:5: lv_start_1_0= RULE_INT
            {
            lv_start_1_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            					newLeafNode(lv_start_1_0, grammarAccess.getSelectRowsTransformationAccess().getStartINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRowsTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDsl.g:2615:3: (otherlv_2= 'skip' ( (lv_length_3_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==64) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:2616:4: otherlv_2= 'skip' ( (lv_length_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectRowsTransformationAccess().getSkipKeyword_2_0());
                    			
                    // InternalDsl.g:2620:4: ( (lv_length_3_0= RULE_INT ) )
                    // InternalDsl.g:2621:5: (lv_length_3_0= RULE_INT )
                    {
                    // InternalDsl.g:2621:5: (lv_length_3_0= RULE_INT )
                    // InternalDsl.g:2622:6: lv_length_3_0= RULE_INT
                    {
                    lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_length_3_0, grammarAccess.getSelectRowsTransformationAccess().getLengthINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectRowsTransformationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2639:3: (otherlv_4= 'groupby' ( (lv_groupBy_5_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==65) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:2640:4: otherlv_4= 'groupby' ( (lv_groupBy_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectRowsTransformationAccess().getGroupbyKeyword_3_0());
                    			
                    // InternalDsl.g:2644:4: ( (lv_groupBy_5_0= RULE_STRING ) )
                    // InternalDsl.g:2645:5: (lv_groupBy_5_0= RULE_STRING )
                    {
                    // InternalDsl.g:2645:5: (lv_groupBy_5_0= RULE_STRING )
                    // InternalDsl.g:2646:6: lv_groupBy_5_0= RULE_STRING
                    {
                    lv_groupBy_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_groupBy_5_0, grammarAccess.getSelectRowsTransformationAccess().getGroupBySTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectRowsTransformationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"groupBy",
                    							lv_groupBy_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectRowsTransformation"


    // $ANTLR start "entryRuleSortRowsTransformation"
    // InternalDsl.g:2667:1: entryRuleSortRowsTransformation returns [EObject current=null] : iv_ruleSortRowsTransformation= ruleSortRowsTransformation EOF ;
    public final EObject entryRuleSortRowsTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortRowsTransformation = null;


        try {
            // InternalDsl.g:2667:63: (iv_ruleSortRowsTransformation= ruleSortRowsTransformation EOF )
            // InternalDsl.g:2668:2: iv_ruleSortRowsTransformation= ruleSortRowsTransformation EOF
            {
             newCompositeNode(grammarAccess.getSortRowsTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSortRowsTransformation=ruleSortRowsTransformation();

            state._fsp--;

             current =iv_ruleSortRowsTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSortRowsTransformation"


    // $ANTLR start "ruleSortRowsTransformation"
    // InternalDsl.g:2674:1: ruleSortRowsTransformation returns [EObject current=null] : (otherlv_0= 'sort' otherlv_1= 'by' otherlv_2= '[' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ( ( (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' ) ) )? ) ;
    public final EObject ruleSortRowsTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_columns_3_0=null;
        Token otherlv_4=null;
        Token lv_columns_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_order_8_1=null;
        Token lv_order_8_2=null;


        	enterRule();

        try {
            // InternalDsl.g:2680:2: ( (otherlv_0= 'sort' otherlv_1= 'by' otherlv_2= '[' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ( ( (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' ) ) )? ) )
            // InternalDsl.g:2681:2: (otherlv_0= 'sort' otherlv_1= 'by' otherlv_2= '[' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ( ( (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' ) ) )? )
            {
            // InternalDsl.g:2681:2: (otherlv_0= 'sort' otherlv_1= 'by' otherlv_2= '[' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ( ( (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' ) ) )? )
            // InternalDsl.g:2682:3: otherlv_0= 'sort' otherlv_1= 'by' otherlv_2= '[' ( (lv_columns_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ( ( (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getSortRowsTransformationAccess().getSortKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSortRowsTransformationAccess().getByKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSortRowsTransformationAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDsl.g:2694:3: ( (lv_columns_3_0= RULE_STRING ) )
            // InternalDsl.g:2695:4: (lv_columns_3_0= RULE_STRING )
            {
            // InternalDsl.g:2695:4: (lv_columns_3_0= RULE_STRING )
            // InternalDsl.g:2696:5: lv_columns_3_0= RULE_STRING
            {
            lv_columns_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_columns_3_0, grammarAccess.getSortRowsTransformationAccess().getColumnsSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSortRowsTransformationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:2712:3: (otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==17) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==RULE_STRING) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalDsl.g:2713:4: otherlv_4= ',' ( (lv_columns_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSortRowsTransformationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDsl.g:2717:4: ( (lv_columns_5_0= RULE_STRING ) )
            	    // InternalDsl.g:2718:5: (lv_columns_5_0= RULE_STRING )
            	    {
            	    // InternalDsl.g:2718:5: (lv_columns_5_0= RULE_STRING )
            	    // InternalDsl.g:2719:6: lv_columns_5_0= RULE_STRING
            	    {
            	    lv_columns_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    						newLeafNode(lv_columns_5_0, grammarAccess.getSortRowsTransformationAccess().getColumnsSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSortRowsTransformationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"columns",
            	    							lv_columns_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalDsl.g:2736:3: (otherlv_6= ',' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==17) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:2737:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getSortRowsTransformationAccess().getCommaKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_51); 

            			newLeafNode(otherlv_7, grammarAccess.getSortRowsTransformationAccess().getRightSquareBracketKeyword_6());
            		
            // InternalDsl.g:2746:3: ( ( (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=67 && LA45_0<=68)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2747:4: ( (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' ) )
                    {
                    // InternalDsl.g:2747:4: ( (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' ) )
                    // InternalDsl.g:2748:5: (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' )
                    {
                    // InternalDsl.g:2748:5: (lv_order_8_1= 'descending' | lv_order_8_2= 'ascending' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==67) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==68) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalDsl.g:2749:6: lv_order_8_1= 'descending'
                            {
                            lv_order_8_1=(Token)match(input,67,FOLLOW_2); 

                            						newLeafNode(lv_order_8_1, grammarAccess.getSortRowsTransformationAccess().getOrderDescendingKeyword_7_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSortRowsTransformationRule());
                            						}
                            						setWithLastConsumed(current, "order", lv_order_8_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:2760:6: lv_order_8_2= 'ascending'
                            {
                            lv_order_8_2=(Token)match(input,68,FOLLOW_2); 

                            						newLeafNode(lv_order_8_2, grammarAccess.getSortRowsTransformationAccess().getOrderAscendingKeyword_7_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSortRowsTransformationRule());
                            						}
                            						setWithLastConsumed(current, "order", lv_order_8_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSortRowsTransformation"


    // $ANTLR start "entryRuleRowTransformation"
    // InternalDsl.g:2777:1: entryRuleRowTransformation returns [EObject current=null] : iv_ruleRowTransformation= ruleRowTransformation EOF ;
    public final EObject entryRuleRowTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowTransformation = null;


        try {
            // InternalDsl.g:2777:58: (iv_ruleRowTransformation= ruleRowTransformation EOF )
            // InternalDsl.g:2778:2: iv_ruleRowTransformation= ruleRowTransformation EOF
            {
             newCompositeNode(grammarAccess.getRowTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowTransformation=ruleRowTransformation();

            state._fsp--;

             current =iv_ruleRowTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRowTransformation"


    // $ANTLR start "ruleRowTransformation"
    // InternalDsl.g:2784:1: ruleRowTransformation returns [EObject current=null] : (this_SortRowsTransformation_0= ruleSortRowsTransformation | this_SelectRowsTransformation_1= ruleSelectRowsTransformation ) ;
    public final EObject ruleRowTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_SortRowsTransformation_0 = null;

        EObject this_SelectRowsTransformation_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:2790:2: ( (this_SortRowsTransformation_0= ruleSortRowsTransformation | this_SelectRowsTransformation_1= ruleSelectRowsTransformation ) )
            // InternalDsl.g:2791:2: (this_SortRowsTransformation_0= ruleSortRowsTransformation | this_SelectRowsTransformation_1= ruleSelectRowsTransformation )
            {
            // InternalDsl.g:2791:2: (this_SortRowsTransformation_0= ruleSortRowsTransformation | this_SelectRowsTransformation_1= ruleSelectRowsTransformation )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==66) ) {
                alt46=1;
            }
            else if ( (LA46_0==38) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2792:3: this_SortRowsTransformation_0= ruleSortRowsTransformation
                    {

                    			newCompositeNode(grammarAccess.getRowTransformationAccess().getSortRowsTransformationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SortRowsTransformation_0=ruleSortRowsTransformation();

                    state._fsp--;


                    			current = this_SortRowsTransformation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2801:3: this_SelectRowsTransformation_1= ruleSelectRowsTransformation
                    {

                    			newCompositeNode(grammarAccess.getRowTransformationAccess().getSelectRowsTransformationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectRowsTransformation_1=ruleSelectRowsTransformation();

                    state._fsp--;


                    			current = this_SelectRowsTransformation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRowTransformation"


    // $ANTLR start "entryRuleTransformation"
    // InternalDsl.g:2813:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // InternalDsl.g:2813:55: (iv_ruleTransformation= ruleTransformation EOF )
            // InternalDsl.g:2814:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalDsl.g:2820:1: ruleTransformation returns [EObject current=null] : (this_PathTransformation_0= rulePathTransformation | this_FoldTransformation_1= ruleFoldTransformation | this_ColumnTransformation_2= ruleColumnTransformation | this_CellTransformation_3= ruleCellTransformation | this_RowTransformation_4= ruleRowTransformation ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_PathTransformation_0 = null;

        EObject this_FoldTransformation_1 = null;

        EObject this_ColumnTransformation_2 = null;

        EObject this_CellTransformation_3 = null;

        EObject this_RowTransformation_4 = null;



        	enterRule();

        try {
            // InternalDsl.g:2826:2: ( (this_PathTransformation_0= rulePathTransformation | this_FoldTransformation_1= ruleFoldTransformation | this_ColumnTransformation_2= ruleColumnTransformation | this_CellTransformation_3= ruleCellTransformation | this_RowTransformation_4= ruleRowTransformation ) )
            // InternalDsl.g:2827:2: (this_PathTransformation_0= rulePathTransformation | this_FoldTransformation_1= ruleFoldTransformation | this_ColumnTransformation_2= ruleColumnTransformation | this_CellTransformation_3= ruleCellTransformation | this_RowTransformation_4= ruleRowTransformation )
            {
            // InternalDsl.g:2827:2: (this_PathTransformation_0= rulePathTransformation | this_FoldTransformation_1= ruleFoldTransformation | this_ColumnTransformation_2= ruleColumnTransformation | this_CellTransformation_3= ruleCellTransformation | this_RowTransformation_4= ruleRowTransformation )
            int alt47=5;
            switch ( input.LA(1) ) {
            case 13:
            case 42:
            case 44:
                {
                alt47=1;
                }
                break;
            case 46:
                {
                alt47=2;
                }
                break;
            case 51:
            case 53:
            case 54:
                {
                alt47=3;
                }
                break;
            case 38:
                {
                int LA47_4 = input.LA(2);

                if ( (LA47_4==RULE_INT) ) {
                    alt47=5;
                }
                else if ( (LA47_4==16) ) {
                    alt47=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 4, input);

                    throw nvae;
                }
                }
                break;
            case 57:
            case 59:
                {
                alt47=4;
                }
                break;
            case 66:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2828:3: this_PathTransformation_0= rulePathTransformation
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getPathTransformationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PathTransformation_0=rulePathTransformation();

                    state._fsp--;


                    			current = this_PathTransformation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2837:3: this_FoldTransformation_1= ruleFoldTransformation
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getFoldTransformationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FoldTransformation_1=ruleFoldTransformation();

                    state._fsp--;


                    			current = this_FoldTransformation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:2846:3: this_ColumnTransformation_2= ruleColumnTransformation
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getColumnTransformationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnTransformation_2=ruleColumnTransformation();

                    state._fsp--;


                    			current = this_ColumnTransformation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:2855:3: this_CellTransformation_3= ruleCellTransformation
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getCellTransformationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CellTransformation_3=ruleCellTransformation();

                    state._fsp--;


                    			current = this_CellTransformation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:2864:3: this_RowTransformation_4= ruleRowTransformation
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getRowTransformationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RowTransformation_4=ruleRowTransformation();

                    state._fsp--;


                    			current = this_RowTransformation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRulePipeline"
    // InternalDsl.g:2876:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalDsl.g:2876:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalDsl.g:2877:2: iv_rulePipeline= rulePipeline EOF
            {
             newCompositeNode(grammarAccess.getPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePipeline=rulePipeline();

            state._fsp--;

             current =iv_rulePipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePipeline"


    // $ANTLR start "rulePipeline"
    // InternalDsl.g:2883:1: rulePipeline returns [EObject current=null] : (otherlv_0= 'pipe' otherlv_1= '[' ( ( (lv_transformation_2_0= ruleTransformation ) ) (otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) ) )* (otherlv_5= ',' )? ) otherlv_6= ']' otherlv_7= ';' ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_transformation_2_0 = null;

        EObject lv_transformation_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2889:2: ( (otherlv_0= 'pipe' otherlv_1= '[' ( ( (lv_transformation_2_0= ruleTransformation ) ) (otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) ) )* (otherlv_5= ',' )? ) otherlv_6= ']' otherlv_7= ';' ) )
            // InternalDsl.g:2890:2: (otherlv_0= 'pipe' otherlv_1= '[' ( ( (lv_transformation_2_0= ruleTransformation ) ) (otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) ) )* (otherlv_5= ',' )? ) otherlv_6= ']' otherlv_7= ';' )
            {
            // InternalDsl.g:2890:2: (otherlv_0= 'pipe' otherlv_1= '[' ( ( (lv_transformation_2_0= ruleTransformation ) ) (otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) ) )* (otherlv_5= ',' )? ) otherlv_6= ']' otherlv_7= ';' )
            // InternalDsl.g:2891:3: otherlv_0= 'pipe' otherlv_1= '[' ( ( (lv_transformation_2_0= ruleTransformation ) ) (otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) ) )* (otherlv_5= ',' )? ) otherlv_6= ']' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPipelineAccess().getPipeKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDsl.g:2899:3: ( ( (lv_transformation_2_0= ruleTransformation ) ) (otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) ) )* (otherlv_5= ',' )? )
            // InternalDsl.g:2900:4: ( (lv_transformation_2_0= ruleTransformation ) ) (otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) ) )* (otherlv_5= ',' )?
            {
            // InternalDsl.g:2900:4: ( (lv_transformation_2_0= ruleTransformation ) )
            // InternalDsl.g:2901:5: (lv_transformation_2_0= ruleTransformation )
            {
            // InternalDsl.g:2901:5: (lv_transformation_2_0= ruleTransformation )
            // InternalDsl.g:2902:6: lv_transformation_2_0= ruleTransformation
            {

            						newCompositeNode(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_9);
            lv_transformation_2_0=ruleTransformation();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPipelineRule());
            						}
            						add(
            							current,
            							"transformation",
            							lv_transformation_2_0,
            							"pt.up.fe.els2023.Dsl.Transformation");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalDsl.g:2919:4: (otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==17) ) {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==13||LA48_1==38||LA48_1==42||LA48_1==44||LA48_1==46||LA48_1==51||(LA48_1>=53 && LA48_1<=54)||LA48_1==57||LA48_1==59||LA48_1==66) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalDsl.g:2920:5: otherlv_3= ',' ( (lv_transformation_4_0= ruleTransformation ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_3, grammarAccess.getPipelineAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalDsl.g:2924:5: ( (lv_transformation_4_0= ruleTransformation ) )
            	    // InternalDsl.g:2925:6: (lv_transformation_4_0= ruleTransformation )
            	    {
            	    // InternalDsl.g:2925:6: (lv_transformation_4_0= ruleTransformation )
            	    // InternalDsl.g:2926:7: lv_transformation_4_0= ruleTransformation
            	    {

            	    							newCompositeNode(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_transformation_4_0=ruleTransformation();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transformation",
            	    								lv_transformation_4_0,
            	    								"pt.up.fe.els2023.Dsl.Transformation");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalDsl.g:2944:4: (otherlv_5= ',' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==17) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2945:5: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getPipelineAccess().getCommaKeyword_2_2());
                    				

                    }
                    break;

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPipelineAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleExport"
    // InternalDsl.g:2963:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalDsl.g:2963:47: (iv_ruleExport= ruleExport EOF )
            // InternalDsl.g:2964:2: iv_ruleExport= ruleExport EOF
            {
             newCompositeNode(grammarAccess.getExportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExport=ruleExport();

            state._fsp--;

             current =iv_ruleExport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExport"


    // $ANTLR start "ruleExport"
    // InternalDsl.g:2970:1: ruleExport returns [EObject current=null] : (otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';' ) ;
    public final EObject ruleExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_table_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_output_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2976:2: ( (otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';' ) )
            // InternalDsl.g:2977:2: (otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';' )
            {
            // InternalDsl.g:2977:2: (otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';' )
            // InternalDsl.g:2978:3: otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportKeyword_0());
            		
            // InternalDsl.g:2982:3: ( (lv_table_1_0= RULE_ID ) )
            // InternalDsl.g:2983:4: (lv_table_1_0= RULE_ID )
            {
            // InternalDsl.g:2983:4: (lv_table_1_0= RULE_ID )
            // InternalDsl.g:2984:5: lv_table_1_0= RULE_ID
            {
            lv_table_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_table_1_0, grammarAccess.getExportAccess().getTableIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"table",
            						lv_table_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getExportAccess().getToKeyword_2());
            		
            // InternalDsl.g:3004:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalDsl.g:3005:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalDsl.g:3005:4: (lv_path_3_0= RULE_STRING )
            // InternalDsl.g:3006:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

            					newLeafNode(lv_path_3_0, grammarAccess.getExportAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getExportAccess().getAsKeyword_4());
            		
            // InternalDsl.g:3026:3: ( (lv_output_5_0= ruleOutputType ) )
            // InternalDsl.g:3027:4: (lv_output_5_0= ruleOutputType )
            {
            // InternalDsl.g:3027:4: (lv_output_5_0= ruleOutputType )
            // InternalDsl.g:3028:5: lv_output_5_0= ruleOutputType
            {

            					newCompositeNode(grammarAccess.getExportAccess().getOutputOutputTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_output_5_0=ruleOutputType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_5_0,
            						"pt.up.fe.els2023.Dsl.OutputType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExportAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExport"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000083010L,0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0A68544000002000L,0x0000000000000004L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000025000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000E8800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000005000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00000001E8800000L});

}