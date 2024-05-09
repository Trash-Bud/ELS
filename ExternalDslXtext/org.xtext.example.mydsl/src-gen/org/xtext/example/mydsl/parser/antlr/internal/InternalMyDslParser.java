package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'merge'", "'append'", "'union'", "'intersection'", "'['", "','", "']'", "'('", "')'", "'transform'", "'='", "';'", "'xml'", "'{'", "'xpath'", "'}'", "'json'", "'jsonpath'", "'yaml'", "'csv'", "'auto'", "'html'", "'css'", "'filepath'", "'lastmodified'", "'store'", "'in'", "'selecting'", "'import'", "'from'", "'as'", "'canonicalize'", "'path'", "'get'", "'name'", "'fold'", "'max'", "'avg'", "'sum'", "'group'", "'by'", "'add'", "'with'", "'remove'", "'rename'", "'to'", "'select'", "'pipe'", "'export'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MyDsl";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMyDsl"
    // InternalMyDsl.g:64:1: entryRuleMyDsl returns [EObject current=null] : iv_ruleMyDsl= ruleMyDsl EOF ;
    public final EObject entryRuleMyDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyDsl = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleMyDsl= ruleMyDsl EOF )
            // InternalMyDsl.g:65:2: iv_ruleMyDsl= ruleMyDsl EOF
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
    // InternalMyDsl.g:71:1: ruleMyDsl returns [EObject current=null] : ( ( (lv_pipelines_0_0= rulePipeline ) )* ( (lv_sources_1_0= ruleSource ) )* ( (lv_tables_2_0= ruleTable ) )* ( (lv_export_3_0= ruleExport ) )* ) ;
    public final EObject ruleMyDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_pipelines_0_0 = null;

        EObject lv_sources_1_0 = null;

        EObject lv_tables_2_0 = null;

        EObject lv_export_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_pipelines_0_0= rulePipeline ) )* ( (lv_sources_1_0= ruleSource ) )* ( (lv_tables_2_0= ruleTable ) )* ( (lv_export_3_0= ruleExport ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_pipelines_0_0= rulePipeline ) )* ( (lv_sources_1_0= ruleSource ) )* ( (lv_tables_2_0= ruleTable ) )* ( (lv_export_3_0= ruleExport ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_pipelines_0_0= rulePipeline ) )* ( (lv_sources_1_0= ruleSource ) )* ( (lv_tables_2_0= ruleTable ) )* ( (lv_export_3_0= ruleExport ) )* )
            // InternalMyDsl.g:79:3: ( (lv_pipelines_0_0= rulePipeline ) )* ( (lv_sources_1_0= ruleSource ) )* ( (lv_tables_2_0= ruleTable ) )* ( (lv_export_3_0= ruleExport ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_pipelines_0_0= rulePipeline ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==21) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==58) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_pipelines_0_0= rulePipeline )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_pipelines_0_0= rulePipeline )
            	    // InternalMyDsl.g:81:5: lv_pipelines_0_0= rulePipeline
            	    {

            	    					newCompositeNode(grammarAccess.getMyDslAccess().getPipelinesPipelineParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_pipelines_0_0=rulePipeline();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMyDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pipelines",
            	    						lv_pipelines_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Pipeline");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_sources_1_0= ruleSource ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==21) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==39) ) {
                            alt2=1;
                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_sources_1_0= ruleSource )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_sources_1_0= ruleSource )
            	    // InternalMyDsl.g:100:5: lv_sources_1_0= ruleSource
            	    {

            	    					newCompositeNode(grammarAccess.getMyDslAccess().getSourcesSourceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_sources_1_0=ruleSource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMyDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sources",
            	    						lv_sources_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Source");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:117:3: ( (lv_tables_2_0= ruleTable ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:118:4: (lv_tables_2_0= ruleTable )
            	    {
            	    // InternalMyDsl.g:118:4: (lv_tables_2_0= ruleTable )
            	    // InternalMyDsl.g:119:5: lv_tables_2_0= ruleTable
            	    {

            	    					newCompositeNode(grammarAccess.getMyDslAccess().getTablesTableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tables_2_0=ruleTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMyDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tables",
            	    						lv_tables_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Table");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:136:3: ( (lv_export_3_0= ruleExport ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==59) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:137:4: (lv_export_3_0= ruleExport )
            	    {
            	    // InternalMyDsl.g:137:4: (lv_export_3_0= ruleExport )
            	    // InternalMyDsl.g:138:5: lv_export_3_0= ruleExport
            	    {

            	    					newCompositeNode(grammarAccess.getMyDslAccess().getExportExportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_export_3_0=ruleExport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMyDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"export",
            	    						lv_export_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Export");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleCombinationOperations"
    // InternalMyDsl.g:159:1: entryRuleCombinationOperations returns [EObject current=null] : iv_ruleCombinationOperations= ruleCombinationOperations EOF ;
    public final EObject entryRuleCombinationOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinationOperations = null;


        try {
            // InternalMyDsl.g:159:62: (iv_ruleCombinationOperations= ruleCombinationOperations EOF )
            // InternalMyDsl.g:160:2: iv_ruleCombinationOperations= ruleCombinationOperations EOF
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
    // InternalMyDsl.g:166:1: ruleCombinationOperations returns [EObject current=null] : ( ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ) ;
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
            // InternalMyDsl.g:172:2: ( ( ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']' ) )
            // InternalMyDsl.g:173:2: ( ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']' )
            {
            // InternalMyDsl.g:173:2: ( ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']' )
            // InternalMyDsl.g:174:3: ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) ) ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )? otherlv_2= '[' ( (lv_tableOperation_3_0= ruleTableOperations ) ) (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )* (otherlv_6= ',' )? otherlv_7= ']'
            {
            // InternalMyDsl.g:174:3: ( ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) ) )
            // InternalMyDsl.g:175:4: ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) )
            {
            // InternalMyDsl.g:175:4: ( (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' ) )
            // InternalMyDsl.g:176:5: (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' )
            {
            // InternalMyDsl.g:176:5: (lv_operation_0_1= 'merge' | lv_operation_0_2= 'append' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:177:6: lv_operation_0_1= 'merge'
                    {
                    lv_operation_0_1=(Token)match(input,11,FOLLOW_5); 

                    						newLeafNode(lv_operation_0_1, grammarAccess.getCombinationOperationsAccess().getOperationMergeKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCombinationOperationsRule());
                    						}
                    						setWithLastConsumed(current, "operation", lv_operation_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:6: lv_operation_0_2= 'append'
                    {
                    lv_operation_0_2=(Token)match(input,12,FOLLOW_5); 

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

            // InternalMyDsl.g:201:3: ( ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:202:4: ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) )
                    {
                    // InternalMyDsl.g:202:4: ( (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' ) )
                    // InternalMyDsl.g:203:5: (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' )
                    {
                    // InternalMyDsl.g:203:5: (lv_type_1_1= 'union' | lv_type_1_2= 'intersection' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==13) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==14) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:204:6: lv_type_1_1= 'union'
                            {
                            lv_type_1_1=(Token)match(input,13,FOLLOW_6); 

                            						newLeafNode(lv_type_1_1, grammarAccess.getCombinationOperationsAccess().getTypeUnionKeyword_1_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCombinationOperationsRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_1_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:215:6: lv_type_1_2= 'intersection'
                            {
                            lv_type_1_2=(Token)match(input,14,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCombinationOperationsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:232:3: ( (lv_tableOperation_3_0= ruleTableOperations ) )
            // InternalMyDsl.g:233:4: (lv_tableOperation_3_0= ruleTableOperations )
            {
            // InternalMyDsl.g:233:4: (lv_tableOperation_3_0= ruleTableOperations )
            // InternalMyDsl.g:234:5: lv_tableOperation_3_0= ruleTableOperations
            {

            					newCompositeNode(grammarAccess.getCombinationOperationsAccess().getTableOperationTableOperationsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_tableOperation_3_0=ruleTableOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCombinationOperationsRule());
            					}
            					add(
            						current,
            						"tableOperation",
            						lv_tableOperation_3_0,
            						"org.xtext.example.mydsl.MyDsl.TableOperations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:251:3: (otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID||(LA8_1>=11 && LA8_1<=12)) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:252:4: otherlv_4= ',' ( (lv_tableOperation_5_0= ruleTableOperations ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCombinationOperationsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:256:4: ( (lv_tableOperation_5_0= ruleTableOperations ) )
            	    // InternalMyDsl.g:257:5: (lv_tableOperation_5_0= ruleTableOperations )
            	    {
            	    // InternalMyDsl.g:257:5: (lv_tableOperation_5_0= ruleTableOperations )
            	    // InternalMyDsl.g:258:6: lv_tableOperation_5_0= ruleTableOperations
            	    {

            	    						newCompositeNode(grammarAccess.getCombinationOperationsAccess().getTableOperationTableOperationsParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_tableOperation_5_0=ruleTableOperations();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCombinationOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tableOperation",
            	    							lv_tableOperation_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.TableOperations");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:276:3: (otherlv_6= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:277:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getCombinationOperationsAccess().getCommaKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:290:1: entryRuleTableOperations returns [EObject current=null] : iv_ruleTableOperations= ruleTableOperations EOF ;
    public final EObject entryRuleTableOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableOperations = null;


        try {
            // InternalMyDsl.g:290:56: (iv_ruleTableOperations= ruleTableOperations EOF )
            // InternalMyDsl.g:291:2: iv_ruleTableOperations= ruleTableOperations EOF
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
    // InternalMyDsl.g:297:1: ruleTableOperations returns [EObject current=null] : (this_CombinationOperations_0= ruleCombinationOperations | this_TransformOperation_1= ruleTransformOperation | this_SourceOperation_2= ruleSourceOperation ) ;
    public final EObject ruleTableOperations() throws RecognitionException {
        EObject current = null;

        EObject this_CombinationOperations_0 = null;

        EObject this_TransformOperation_1 = null;

        EObject this_SourceOperation_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:303:2: ( (this_CombinationOperations_0= ruleCombinationOperations | this_TransformOperation_1= ruleTransformOperation | this_SourceOperation_2= ruleSourceOperation ) )
            // InternalMyDsl.g:304:2: (this_CombinationOperations_0= ruleCombinationOperations | this_TransformOperation_1= ruleTransformOperation | this_SourceOperation_2= ruleSourceOperation )
            {
            // InternalMyDsl.g:304:2: (this_CombinationOperations_0= ruleCombinationOperations | this_TransformOperation_1= ruleTransformOperation | this_SourceOperation_2= ruleSourceOperation )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==20) ) {
                    alt10=2;
                }
                else if ( (LA10_2==EOF||(LA10_2>=16 && LA10_2<=17)||LA10_2==22) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:305:3: this_CombinationOperations_0= ruleCombinationOperations
                    {

                    			newCompositeNode(grammarAccess.getTableOperationsAccess().getCombinationOperationsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CombinationOperations_0=ruleCombinationOperations();

                    state._fsp--;


                    			current = this_CombinationOperations_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:314:3: this_TransformOperation_1= ruleTransformOperation
                    {

                    			newCompositeNode(grammarAccess.getTableOperationsAccess().getTransformOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransformOperation_1=ruleTransformOperation();

                    state._fsp--;


                    			current = this_TransformOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:323:3: this_SourceOperation_2= ruleSourceOperation
                    {

                    			newCompositeNode(grammarAccess.getTableOperationsAccess().getSourceOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceOperation_2=ruleSourceOperation();

                    state._fsp--;


                    			current = this_SourceOperation_2;
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
    // $ANTLR end "ruleTableOperations"


    // $ANTLR start "entryRuleSourceOperation"
    // InternalMyDsl.g:335:1: entryRuleSourceOperation returns [EObject current=null] : iv_ruleSourceOperation= ruleSourceOperation EOF ;
    public final EObject entryRuleSourceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceOperation = null;


        try {
            // InternalMyDsl.g:335:56: (iv_ruleSourceOperation= ruleSourceOperation EOF )
            // InternalMyDsl.g:336:2: iv_ruleSourceOperation= ruleSourceOperation EOF
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
    // InternalMyDsl.g:342:1: ruleSourceOperation returns [EObject current=null] : ( (lv_source_0_0= RULE_ID ) ) ;
    public final EObject ruleSourceOperation() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:348:2: ( ( (lv_source_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:349:2: ( (lv_source_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:349:2: ( (lv_source_0_0= RULE_ID ) )
            // InternalMyDsl.g:350:3: (lv_source_0_0= RULE_ID )
            {
            // InternalMyDsl.g:350:3: (lv_source_0_0= RULE_ID )
            // InternalMyDsl.g:351:4: lv_source_0_0= RULE_ID
            {
            lv_source_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_source_0_0, grammarAccess.getSourceOperationAccess().getSourceIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSourceOperationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"source",
            					lv_source_0_0,
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
    // $ANTLR end "ruleSourceOperation"


    // $ANTLR start "entryRuleTransformationTableOperation"
    // InternalMyDsl.g:370:1: entryRuleTransformationTableOperation returns [EObject current=null] : iv_ruleTransformationTableOperation= ruleTransformationTableOperation EOF ;
    public final EObject entryRuleTransformationTableOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationTableOperation = null;


        try {
            // InternalMyDsl.g:370:69: (iv_ruleTransformationTableOperation= ruleTransformationTableOperation EOF )
            // InternalMyDsl.g:371:2: iv_ruleTransformationTableOperation= ruleTransformationTableOperation EOF
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
    // InternalMyDsl.g:377:1: ruleTransformationTableOperation returns [EObject current=null] : (otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')' ) ;
    public final EObject ruleTransformationTableOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_transformation_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:383:2: ( (otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:384:2: (otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:384:2: (otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')' )
            // InternalMyDsl.g:385:3: otherlv_0= '(' ( (lv_transformation_1_0= ruleTransformation ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformationTableOperationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:389:3: ( (lv_transformation_1_0= ruleTransformation ) )
            // InternalMyDsl.g:390:4: (lv_transformation_1_0= ruleTransformation )
            {
            // InternalMyDsl.g:390:4: (lv_transformation_1_0= ruleTransformation )
            // InternalMyDsl.g:391:5: lv_transformation_1_0= ruleTransformation
            {

            					newCompositeNode(grammarAccess.getTransformationTableOperationAccess().getTransformationTransformationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_transformation_1_0=ruleTransformation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformationTableOperationRule());
            					}
            					set(
            						current,
            						"transformation",
            						lv_transformation_1_0,
            						"org.xtext.example.mydsl.MyDsl.Transformation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRulePipelineTableOperation"
    // InternalMyDsl.g:416:1: entryRulePipelineTableOperation returns [EObject current=null] : iv_rulePipelineTableOperation= rulePipelineTableOperation EOF ;
    public final EObject entryRulePipelineTableOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipelineTableOperation = null;


        try {
            // InternalMyDsl.g:416:63: (iv_rulePipelineTableOperation= rulePipelineTableOperation EOF )
            // InternalMyDsl.g:417:2: iv_rulePipelineTableOperation= rulePipelineTableOperation EOF
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
    // InternalMyDsl.g:423:1: rulePipelineTableOperation returns [EObject current=null] : ( (lv_pipeline_0_0= RULE_ID ) ) ;
    public final EObject rulePipelineTableOperation() throws RecognitionException {
        EObject current = null;

        Token lv_pipeline_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:429:2: ( ( (lv_pipeline_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:430:2: ( (lv_pipeline_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:430:2: ( (lv_pipeline_0_0= RULE_ID ) )
            // InternalMyDsl.g:431:3: (lv_pipeline_0_0= RULE_ID )
            {
            // InternalMyDsl.g:431:3: (lv_pipeline_0_0= RULE_ID )
            // InternalMyDsl.g:432:4: lv_pipeline_0_0= RULE_ID
            {
            lv_pipeline_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_pipeline_0_0, grammarAccess.getPipelineTableOperationAccess().getPipelineIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPipelineTableOperationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"pipeline",
            					lv_pipeline_0_0,
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
    // $ANTLR end "rulePipelineTableOperation"


    // $ANTLR start "entryRuleTransformOperation"
    // InternalMyDsl.g:451:1: entryRuleTransformOperation returns [EObject current=null] : iv_ruleTransformOperation= ruleTransformOperation EOF ;
    public final EObject entryRuleTransformOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformOperation = null;


        try {
            // InternalMyDsl.g:451:59: (iv_ruleTransformOperation= ruleTransformOperation EOF )
            // InternalMyDsl.g:452:2: iv_ruleTransformOperation= ruleTransformOperation EOF
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
    // InternalMyDsl.g:458:1: ruleTransformOperation returns [EObject current=null] : ( ( (lv_source_0_0= ruleSourceOperation ) ) (otherlv_1= 'transform' ( ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) ) ) )+ ) ;
    public final EObject ruleTransformOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_source_0_0 = null;

        EObject lv_operation_2_1 = null;

        EObject lv_operation_2_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:464:2: ( ( ( (lv_source_0_0= ruleSourceOperation ) ) (otherlv_1= 'transform' ( ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) ) ) )+ ) )
            // InternalMyDsl.g:465:2: ( ( (lv_source_0_0= ruleSourceOperation ) ) (otherlv_1= 'transform' ( ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) ) ) )+ )
            {
            // InternalMyDsl.g:465:2: ( ( (lv_source_0_0= ruleSourceOperation ) ) (otherlv_1= 'transform' ( ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) ) ) )+ )
            // InternalMyDsl.g:466:3: ( (lv_source_0_0= ruleSourceOperation ) ) (otherlv_1= 'transform' ( ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) ) ) )+
            {
            // InternalMyDsl.g:466:3: ( (lv_source_0_0= ruleSourceOperation ) )
            // InternalMyDsl.g:467:4: (lv_source_0_0= ruleSourceOperation )
            {
            // InternalMyDsl.g:467:4: (lv_source_0_0= ruleSourceOperation )
            // InternalMyDsl.g:468:5: lv_source_0_0= ruleSourceOperation
            {

            					newCompositeNode(grammarAccess.getTransformOperationAccess().getSourceSourceOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_source_0_0=ruleSourceOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformOperationRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.xtext.example.mydsl.MyDsl.SourceOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:485:3: (otherlv_1= 'transform' ( ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:486:4: otherlv_1= 'transform' ( ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTransformOperationAccess().getTransformKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:490:4: ( ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) ) )
            	    // InternalMyDsl.g:491:5: ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) )
            	    {
            	    // InternalMyDsl.g:491:5: ( (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation ) )
            	    // InternalMyDsl.g:492:6: (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation )
            	    {
            	    // InternalMyDsl.g:492:6: (lv_operation_2_1= ruleTransformationTableOperation | lv_operation_2_2= rulePipelineTableOperation )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==18) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==RULE_ID) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMyDsl.g:493:7: lv_operation_2_1= ruleTransformationTableOperation
            	            {

            	            							newCompositeNode(grammarAccess.getTransformOperationAccess().getOperationTransformationTableOperationParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_14);
            	            lv_operation_2_1=ruleTransformationTableOperation();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTransformOperationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"operation",
            	            								lv_operation_2_1,
            	            								"org.xtext.example.mydsl.MyDsl.TransformationTableOperation");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:509:7: lv_operation_2_2= rulePipelineTableOperation
            	            {

            	            							newCompositeNode(grammarAccess.getTransformOperationAccess().getOperationPipelineTableOperationParserRuleCall_1_1_0_1());
            	            						
            	            pushFollow(FOLLOW_14);
            	            lv_operation_2_2=rulePipelineTableOperation();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTransformOperationRule());
            	            							}
            	            							add(
            	            								current,
            	            								"operation",
            	            								lv_operation_2_2,
            	            								"org.xtext.example.mydsl.MyDsl.PipelineTableOperation");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleTransformOperation"


    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:532:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMyDsl.g:532:46: (iv_ruleTable= ruleTable EOF )
            // InternalMyDsl.g:533:2: iv_ruleTable= ruleTable EOF
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
    // InternalMyDsl.g:539:1: ruleTable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operation_2_0= ruleTableOperations ) ) otherlv_3= ';' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:545:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operation_2_0= ruleTableOperations ) ) otherlv_3= ';' ) )
            // InternalMyDsl.g:546:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operation_2_0= ruleTableOperations ) ) otherlv_3= ';' )
            {
            // InternalMyDsl.g:546:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operation_2_0= ruleTableOperations ) ) otherlv_3= ';' )
            // InternalMyDsl.g:547:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_operation_2_0= ruleTableOperations ) ) otherlv_3= ';'
            {
            // InternalMyDsl.g:547:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:548:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:548:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:549:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:569:3: ( (lv_operation_2_0= ruleTableOperations ) )
            // InternalMyDsl.g:570:4: (lv_operation_2_0= ruleTableOperations )
            {
            // InternalMyDsl.g:570:4: (lv_operation_2_0= ruleTableOperations )
            // InternalMyDsl.g:571:5: lv_operation_2_0= ruleTableOperations
            {

            					newCompositeNode(grammarAccess.getTableAccess().getOperationTableOperationsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_operation_2_0=ruleTableOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_2_0,
            						"org.xtext.example.mydsl.MyDsl.TableOperations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getSemicolonKeyword_3());
            		

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
    // InternalMyDsl.g:596:1: entryRuleXmlType returns [EObject current=null] : iv_ruleXmlType= ruleXmlType EOF ;
    public final EObject entryRuleXmlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlType = null;


        try {
            // InternalMyDsl.g:596:48: (iv_ruleXmlType= ruleXmlType EOF )
            // InternalMyDsl.g:597:2: iv_ruleXmlType= ruleXmlType EOF
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
    // InternalMyDsl.g:603:1: ruleXmlType returns [EObject current=null] : ( () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? ) ;
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
            // InternalMyDsl.g:609:2: ( ( () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? ) )
            // InternalMyDsl.g:610:2: ( () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? )
            {
            // InternalMyDsl.g:610:2: ( () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? )
            // InternalMyDsl.g:611:3: () otherlv_1= 'xml' (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )?
            {
            // InternalMyDsl.g:611:3: ()
            // InternalMyDsl.g:612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXmlTypeAccess().getXmlTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getXmlTypeAccess().getXmlKeyword_1());
            		
            // InternalMyDsl.g:622:3: (otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:623:4: otherlv_2= '{' otherlv_3= 'xpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getXmlTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getXmlTypeAccess().getXpathKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getXmlTypeAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalMyDsl.g:635:4: ( (lv_path_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:636:5: (lv_path_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:636:5: (lv_path_5_0= RULE_STRING )
                    // InternalMyDsl.g:637:6: lv_path_5_0= RULE_STRING
                    {
                    lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

                    otherlv_6=(Token)match(input,16,FOLLOW_21); 

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
    // InternalMyDsl.g:666:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // InternalMyDsl.g:666:49: (iv_ruleJsonType= ruleJsonType EOF )
            // InternalMyDsl.g:667:2: iv_ruleJsonType= ruleJsonType EOF
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
    // InternalMyDsl.g:673:1: ruleJsonType returns [EObject current=null] : ( () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? ) ;
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
            // InternalMyDsl.g:679:2: ( ( () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? ) )
            // InternalMyDsl.g:680:2: ( () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? )
            {
            // InternalMyDsl.g:680:2: ( () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )? )
            // InternalMyDsl.g:681:3: () otherlv_1= 'json' (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )?
            {
            // InternalMyDsl.g:681:3: ()
            // InternalMyDsl.g:682:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJsonTypeAccess().getJsonTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonTypeAccess().getJsonKeyword_1());
            		
            // InternalMyDsl.g:692:3: (otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:693:4: otherlv_2= '{' otherlv_3= 'jsonpath' otherlv_4= '=' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getJsonTypeAccess().getJsonpathKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getJsonTypeAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalMyDsl.g:705:4: ( (lv_path_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:706:5: (lv_path_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:706:5: (lv_path_5_0= RULE_STRING )
                    // InternalMyDsl.g:707:6: lv_path_5_0= RULE_STRING
                    {
                    lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

                    otherlv_6=(Token)match(input,16,FOLLOW_21); 

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
    // InternalMyDsl.g:736:1: entryRuleYamlType returns [EObject current=null] : iv_ruleYamlType= ruleYamlType EOF ;
    public final EObject entryRuleYamlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYamlType = null;


        try {
            // InternalMyDsl.g:736:49: (iv_ruleYamlType= ruleYamlType EOF )
            // InternalMyDsl.g:737:2: iv_ruleYamlType= ruleYamlType EOF
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
    // InternalMyDsl.g:743:1: ruleYamlType returns [EObject current=null] : ( () otherlv_1= 'yaml' ) ;
    public final EObject ruleYamlType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:749:2: ( ( () otherlv_1= 'yaml' ) )
            // InternalMyDsl.g:750:2: ( () otherlv_1= 'yaml' )
            {
            // InternalMyDsl.g:750:2: ( () otherlv_1= 'yaml' )
            // InternalMyDsl.g:751:3: () otherlv_1= 'yaml'
            {
            // InternalMyDsl.g:751:3: ()
            // InternalMyDsl.g:752:4: 
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
    // InternalMyDsl.g:766:1: entryRuleCsvType returns [EObject current=null] : iv_ruleCsvType= ruleCsvType EOF ;
    public final EObject entryRuleCsvType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvType = null;


        try {
            // InternalMyDsl.g:766:48: (iv_ruleCsvType= ruleCsvType EOF )
            // InternalMyDsl.g:767:2: iv_ruleCsvType= ruleCsvType EOF
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
    // InternalMyDsl.g:773:1: ruleCsvType returns [EObject current=null] : ( () otherlv_1= 'csv' ) ;
    public final EObject ruleCsvType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:779:2: ( ( () otherlv_1= 'csv' ) )
            // InternalMyDsl.g:780:2: ( () otherlv_1= 'csv' )
            {
            // InternalMyDsl.g:780:2: ( () otherlv_1= 'csv' )
            // InternalMyDsl.g:781:3: () otherlv_1= 'csv'
            {
            // InternalMyDsl.g:781:3: ()
            // InternalMyDsl.g:782:4: 
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
    // InternalMyDsl.g:796:1: entryRuleAutoType returns [EObject current=null] : iv_ruleAutoType= ruleAutoType EOF ;
    public final EObject entryRuleAutoType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoType = null;


        try {
            // InternalMyDsl.g:796:49: (iv_ruleAutoType= ruleAutoType EOF )
            // InternalMyDsl.g:797:2: iv_ruleAutoType= ruleAutoType EOF
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
    // InternalMyDsl.g:803:1: ruleAutoType returns [EObject current=null] : ( () otherlv_1= 'auto' ) ;
    public final EObject ruleAutoType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:809:2: ( ( () otherlv_1= 'auto' ) )
            // InternalMyDsl.g:810:2: ( () otherlv_1= 'auto' )
            {
            // InternalMyDsl.g:810:2: ( () otherlv_1= 'auto' )
            // InternalMyDsl.g:811:3: () otherlv_1= 'auto'
            {
            // InternalMyDsl.g:811:3: ()
            // InternalMyDsl.g:812:4: 
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
    // InternalMyDsl.g:826:1: entryRuleInputType returns [EObject current=null] : iv_ruleInputType= ruleInputType EOF ;
    public final EObject entryRuleInputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputType = null;


        try {
            // InternalMyDsl.g:826:50: (iv_ruleInputType= ruleInputType EOF )
            // InternalMyDsl.g:827:2: iv_ruleInputType= ruleInputType EOF
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
    // InternalMyDsl.g:833:1: ruleInputType returns [EObject current=null] : (this_JsonType_0= ruleJsonType | this_XmlType_1= ruleXmlType | this_CsvType_2= ruleCsvType | this_YamlType_3= ruleYamlType | this_AutoType_4= ruleAutoType ) ;
    public final EObject ruleInputType() throws RecognitionException {
        EObject current = null;

        EObject this_JsonType_0 = null;

        EObject this_XmlType_1 = null;

        EObject this_CsvType_2 = null;

        EObject this_YamlType_3 = null;

        EObject this_AutoType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:839:2: ( (this_JsonType_0= ruleJsonType | this_XmlType_1= ruleXmlType | this_CsvType_2= ruleCsvType | this_YamlType_3= ruleYamlType | this_AutoType_4= ruleAutoType ) )
            // InternalMyDsl.g:840:2: (this_JsonType_0= ruleJsonType | this_XmlType_1= ruleXmlType | this_CsvType_2= ruleCsvType | this_YamlType_3= ruleYamlType | this_AutoType_4= ruleAutoType )
            {
            // InternalMyDsl.g:840:2: (this_JsonType_0= ruleJsonType | this_XmlType_1= ruleXmlType | this_CsvType_2= ruleCsvType | this_YamlType_3= ruleYamlType | this_AutoType_4= ruleAutoType )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt15=1;
                }
                break;
            case 23:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 29:
                {
                alt15=4;
                }
                break;
            case 31:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:841:3: this_JsonType_0= ruleJsonType
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
                    // InternalMyDsl.g:850:3: this_XmlType_1= ruleXmlType
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
                    // InternalMyDsl.g:859:3: this_CsvType_2= ruleCsvType
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
                    // InternalMyDsl.g:868:3: this_YamlType_3= ruleYamlType
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
                    // InternalMyDsl.g:877:3: this_AutoType_4= ruleAutoType
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
    // InternalMyDsl.g:889:1: entryRuleHtmlType returns [EObject current=null] : iv_ruleHtmlType= ruleHtmlType EOF ;
    public final EObject entryRuleHtmlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtmlType = null;


        try {
            // InternalMyDsl.g:889:49: (iv_ruleHtmlType= ruleHtmlType EOF )
            // InternalMyDsl.g:890:2: iv_ruleHtmlType= ruleHtmlType EOF
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
    // InternalMyDsl.g:896:1: ruleHtmlType returns [EObject current=null] : ( () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleHtmlType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_cssPath_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:902:2: ( ( () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) otherlv_6= '}' )? ) )
            // InternalMyDsl.g:903:2: ( () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) otherlv_6= '}' )? )
            {
            // InternalMyDsl.g:903:2: ( () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) otherlv_6= '}' )? )
            // InternalMyDsl.g:904:3: () otherlv_1= 'html' (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) otherlv_6= '}' )?
            {
            // InternalMyDsl.g:904:3: ()
            // InternalMyDsl.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHtmlTypeAccess().getHtmlTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHtmlTypeAccess().getHtmlKeyword_1());
            		
            // InternalMyDsl.g:915:3: (otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) otherlv_6= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:916:4: otherlv_2= '{' otherlv_3= 'css' otherlv_4= '=' ( (lv_cssPath_5_0= RULE_STRING ) ) otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getHtmlTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getHtmlTypeAccess().getCssKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getHtmlTypeAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalMyDsl.g:928:4: ( (lv_cssPath_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:929:5: (lv_cssPath_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:929:5: (lv_cssPath_5_0= RULE_STRING )
                    // InternalMyDsl.g:930:6: lv_cssPath_5_0= RULE_STRING
                    {
                    lv_cssPath_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getHtmlTypeAccess().getRightCurlyBracketKeyword_2_4());
                    			

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
    // InternalMyDsl.g:955:1: entryRuleOutputType returns [EObject current=null] : iv_ruleOutputType= ruleOutputType EOF ;
    public final EObject entryRuleOutputType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputType = null;


        try {
            // InternalMyDsl.g:955:51: (iv_ruleOutputType= ruleOutputType EOF )
            // InternalMyDsl.g:956:2: iv_ruleOutputType= ruleOutputType EOF
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
    // InternalMyDsl.g:962:1: ruleOutputType returns [EObject current=null] : ( ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) ) ) ;
    public final EObject ruleOutputType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:968:2: ( ( ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) ) ) )
            // InternalMyDsl.g:969:2: ( ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) ) )
            {
            // InternalMyDsl.g:969:2: ( ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) ) )
            // InternalMyDsl.g:970:3: ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) )
            {
            // InternalMyDsl.g:970:3: ( (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType ) )
            // InternalMyDsl.g:971:4: (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType )
            {
            // InternalMyDsl.g:971:4: (lv_type_0_1= ruleHtmlType | lv_type_0_2= ruleAutoType | lv_type_0_3= ruleCsvType )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:972:5: lv_type_0_1= ruleHtmlType
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
                    						"org.xtext.example.mydsl.MyDsl.HtmlType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:988:5: lv_type_0_2= ruleAutoType
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
                    						"org.xtext.example.mydsl.MyDsl.AutoType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1004:5: lv_type_0_3= ruleCsvType
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
                    						"org.xtext.example.mydsl.MyDsl.CsvType");
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
    // InternalMyDsl.g:1025:1: entryRuleMetaData returns [EObject current=null] : iv_ruleMetaData= ruleMetaData EOF ;
    public final EObject entryRuleMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaData = null;


        try {
            // InternalMyDsl.g:1025:49: (iv_ruleMetaData= ruleMetaData EOF )
            // InternalMyDsl.g:1026:2: iv_ruleMetaData= ruleMetaData EOF
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
    // InternalMyDsl.g:1032:1: ruleMetaData returns [EObject current=null] : ( ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) ) ) ;
    public final EObject ruleMetaData() throws RecognitionException {
        EObject current = null;

        Token lv_metadata_0_1=null;
        Token lv_metadata_0_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1038:2: ( ( ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) ) ) )
            // InternalMyDsl.g:1039:2: ( ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) ) )
            {
            // InternalMyDsl.g:1039:2: ( ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) ) )
            // InternalMyDsl.g:1040:3: ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) )
            {
            // InternalMyDsl.g:1040:3: ( (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' ) )
            // InternalMyDsl.g:1041:4: (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' )
            {
            // InternalMyDsl.g:1041:4: (lv_metadata_0_1= 'filepath' | lv_metadata_0_2= 'lastmodified' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1042:5: lv_metadata_0_1= 'filepath'
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
                    // InternalMyDsl.g:1053:5: lv_metadata_0_2= 'lastmodified'
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
    // InternalMyDsl.g:1069:1: entryRuleSourceStore returns [EObject current=null] : iv_ruleSourceStore= ruleSourceStore EOF ;
    public final EObject entryRuleSourceStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceStore = null;


        try {
            // InternalMyDsl.g:1069:52: (iv_ruleSourceStore= ruleSourceStore EOF )
            // InternalMyDsl.g:1070:2: iv_ruleSourceStore= ruleSourceStore EOF
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
    // InternalMyDsl.g:1076:1: ruleSourceStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSourceStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_column_3_0=null;
        EObject lv_metadata_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1082:2: ( (otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1083:2: (otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1083:2: (otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1084:3: otherlv_0= 'store' ( (lv_metadata_1_0= ruleMetaData ) ) otherlv_2= 'in' ( (lv_column_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceStoreAccess().getStoreKeyword_0());
            		
            // InternalMyDsl.g:1088:3: ( (lv_metadata_1_0= ruleMetaData ) )
            // InternalMyDsl.g:1089:4: (lv_metadata_1_0= ruleMetaData )
            {
            // InternalMyDsl.g:1089:4: (lv_metadata_1_0= ruleMetaData )
            // InternalMyDsl.g:1090:5: lv_metadata_1_0= ruleMetaData
            {

            					newCompositeNode(grammarAccess.getSourceStoreAccess().getMetadataMetaDataParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_metadata_1_0=ruleMetaData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSourceStoreRule());
            					}
            					set(
            						current,
            						"metadata",
            						lv_metadata_1_0,
            						"org.xtext.example.mydsl.MyDsl.MetaData");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceStoreAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:1111:3: ( (lv_column_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1112:4: (lv_column_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1112:4: (lv_column_3_0= RULE_STRING )
            // InternalMyDsl.g:1113:5: lv_column_3_0= RULE_STRING
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
    // InternalMyDsl.g:1133:1: entryRuleSourceCoumnSelect returns [EObject current=null] : iv_ruleSourceCoumnSelect= ruleSourceCoumnSelect EOF ;
    public final EObject entryRuleSourceCoumnSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceCoumnSelect = null;


        try {
            // InternalMyDsl.g:1133:58: (iv_ruleSourceCoumnSelect= ruleSourceCoumnSelect EOF )
            // InternalMyDsl.g:1134:2: iv_ruleSourceCoumnSelect= ruleSourceCoumnSelect EOF
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
    // InternalMyDsl.g:1140:1: ruleSourceCoumnSelect returns [EObject current=null] : (otherlv_0= 'selecting' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1146:2: ( (otherlv_0= 'selecting' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) )
            // InternalMyDsl.g:1147:2: (otherlv_0= 'selecting' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            {
            // InternalMyDsl.g:1147:2: (otherlv_0= 'selecting' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            // InternalMyDsl.g:1148:3: otherlv_0= 'selecting' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceCoumnSelectAccess().getSelectingKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceCoumnSelectAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:1156:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1157:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1157:4: (lv_column_2_0= RULE_STRING )
            // InternalMyDsl.g:1158:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            // InternalMyDsl.g:1174:3: (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_STRING) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1175:4: otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:1179:4: ( (lv_column_4_0= RULE_STRING ) )
            	    // InternalMyDsl.g:1180:5: (lv_column_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:1180:5: (lv_column_4_0= RULE_STRING )
            	    // InternalMyDsl.g:1181:6: lv_column_4_0= RULE_STRING
            	    {
            	    lv_column_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
            	    break loop19;
                }
            } while (true);

            // InternalMyDsl.g:1198:3: (otherlv_5= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1199:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getSourceCoumnSelectAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:1212:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalMyDsl.g:1212:47: (iv_ruleSource= ruleSource EOF )
            // InternalMyDsl.g:1213:2: iv_ruleSource= ruleSource EOF
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
    // InternalMyDsl.g:1219:1: ruleSource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'import' ( (lv_query_3_0= RULE_STRING ) )? otherlv_4= 'from' ( (lv_filePath_5_0= RULE_STRING ) ) (otherlv_6= 'as' ( (lv_inputType_7_0= ruleInputType ) ) )? ( (lv_store_8_0= ruleSourceStore ) )* ( (lv_select_9_0= ruleSourceCoumnSelect ) )? otherlv_10= ';' ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_query_3_0=null;
        Token otherlv_4=null;
        Token lv_filePath_5_0=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_inputType_7_0 = null;

        EObject lv_store_8_0 = null;

        EObject lv_select_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1225:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'import' ( (lv_query_3_0= RULE_STRING ) )? otherlv_4= 'from' ( (lv_filePath_5_0= RULE_STRING ) ) (otherlv_6= 'as' ( (lv_inputType_7_0= ruleInputType ) ) )? ( (lv_store_8_0= ruleSourceStore ) )* ( (lv_select_9_0= ruleSourceCoumnSelect ) )? otherlv_10= ';' ) )
            // InternalMyDsl.g:1226:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'import' ( (lv_query_3_0= RULE_STRING ) )? otherlv_4= 'from' ( (lv_filePath_5_0= RULE_STRING ) ) (otherlv_6= 'as' ( (lv_inputType_7_0= ruleInputType ) ) )? ( (lv_store_8_0= ruleSourceStore ) )* ( (lv_select_9_0= ruleSourceCoumnSelect ) )? otherlv_10= ';' )
            {
            // InternalMyDsl.g:1226:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'import' ( (lv_query_3_0= RULE_STRING ) )? otherlv_4= 'from' ( (lv_filePath_5_0= RULE_STRING ) ) (otherlv_6= 'as' ( (lv_inputType_7_0= ruleInputType ) ) )? ( (lv_store_8_0= ruleSourceStore ) )* ( (lv_select_9_0= ruleSourceCoumnSelect ) )? otherlv_10= ';' )
            // InternalMyDsl.g:1227:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'import' ( (lv_query_3_0= RULE_STRING ) )? otherlv_4= 'from' ( (lv_filePath_5_0= RULE_STRING ) ) (otherlv_6= 'as' ( (lv_inputType_7_0= ruleInputType ) ) )? ( (lv_store_8_0= ruleSourceStore ) )* ( (lv_select_9_0= ruleSourceCoumnSelect ) )? otherlv_10= ';'
            {
            // InternalMyDsl.g:1227:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1228:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1228:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1229:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSourceAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getImportKeyword_2());
            		
            // InternalMyDsl.g:1253:3: ( (lv_query_3_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1254:4: (lv_query_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1254:4: (lv_query_3_0= RULE_STRING )
                    // InternalMyDsl.g:1255:5: lv_query_3_0= RULE_STRING
                    {
                    lv_query_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    					newLeafNode(lv_query_3_0, grammarAccess.getSourceAccess().getQuerySTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"query",
                    						lv_query_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,40,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getSourceAccess().getFromKeyword_4());
            		
            // InternalMyDsl.g:1275:3: ( (lv_filePath_5_0= RULE_STRING ) )
            // InternalMyDsl.g:1276:4: (lv_filePath_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:1276:4: (lv_filePath_5_0= RULE_STRING )
            // InternalMyDsl.g:1277:5: lv_filePath_5_0= RULE_STRING
            {
            lv_filePath_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_filePath_5_0, grammarAccess.getSourceAccess().getFilePathSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filePath",
            						lv_filePath_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1293:3: (otherlv_6= 'as' ( (lv_inputType_7_0= ruleInputType ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1294:4: otherlv_6= 'as' ( (lv_inputType_7_0= ruleInputType ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getSourceAccess().getAsKeyword_6_0());
                    			
                    // InternalMyDsl.g:1298:4: ( (lv_inputType_7_0= ruleInputType ) )
                    // InternalMyDsl.g:1299:5: (lv_inputType_7_0= ruleInputType )
                    {
                    // InternalMyDsl.g:1299:5: (lv_inputType_7_0= ruleInputType )
                    // InternalMyDsl.g:1300:6: lv_inputType_7_0= ruleInputType
                    {

                    						newCompositeNode(grammarAccess.getSourceAccess().getInputTypeInputTypeParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_inputType_7_0=ruleInputType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSourceRule());
                    						}
                    						set(
                    							current,
                    							"inputType",
                    							lv_inputType_7_0,
                    							"org.xtext.example.mydsl.MyDsl.InputType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1318:3: ( (lv_store_8_0= ruleSourceStore ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1319:4: (lv_store_8_0= ruleSourceStore )
            	    {
            	    // InternalMyDsl.g:1319:4: (lv_store_8_0= ruleSourceStore )
            	    // InternalMyDsl.g:1320:5: lv_store_8_0= ruleSourceStore
            	    {

            	    					newCompositeNode(grammarAccess.getSourceAccess().getStoreSourceStoreParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_store_8_0=ruleSourceStore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"store",
            	    						lv_store_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.SourceStore");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalMyDsl.g:1337:3: ( (lv_select_9_0= ruleSourceCoumnSelect ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1338:4: (lv_select_9_0= ruleSourceCoumnSelect )
                    {
                    // InternalMyDsl.g:1338:4: (lv_select_9_0= ruleSourceCoumnSelect )
                    // InternalMyDsl.g:1339:5: lv_select_9_0= ruleSourceCoumnSelect
                    {

                    					newCompositeNode(grammarAccess.getSourceAccess().getSelectSourceCoumnSelectParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_select_9_0=ruleSourceCoumnSelect();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSourceRule());
                    					}
                    					set(
                    						current,
                    						"select",
                    						lv_select_9_0,
                    						"org.xtext.example.mydsl.MyDsl.SourceCoumnSelect");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSourceAccess().getSemicolonKeyword_9());
            		

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
    // InternalMyDsl.g:1364:1: entryRuleCanonicalizePathTransformation returns [EObject current=null] : iv_ruleCanonicalizePathTransformation= ruleCanonicalizePathTransformation EOF ;
    public final EObject entryRuleCanonicalizePathTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCanonicalizePathTransformation = null;


        try {
            // InternalMyDsl.g:1364:71: (iv_ruleCanonicalizePathTransformation= ruleCanonicalizePathTransformation EOF )
            // InternalMyDsl.g:1365:2: iv_ruleCanonicalizePathTransformation= ruleCanonicalizePathTransformation EOF
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
    // InternalMyDsl.g:1371:1: ruleCanonicalizePathTransformation returns [EObject current=null] : ( () otherlv_1= 'canonicalize' otherlv_2= 'path' ) ;
    public final EObject ruleCanonicalizePathTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1377:2: ( ( () otherlv_1= 'canonicalize' otherlv_2= 'path' ) )
            // InternalMyDsl.g:1378:2: ( () otherlv_1= 'canonicalize' otherlv_2= 'path' )
            {
            // InternalMyDsl.g:1378:2: ( () otherlv_1= 'canonicalize' otherlv_2= 'path' )
            // InternalMyDsl.g:1379:3: () otherlv_1= 'canonicalize' otherlv_2= 'path'
            {
            // InternalMyDsl.g:1379:3: ()
            // InternalMyDsl.g:1380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCanonicalizePathTransformationAccess().getCanonicalizePathTransformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_32); 

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
    // InternalMyDsl.g:1398:1: entryRuleGetPathTransformation returns [EObject current=null] : iv_ruleGetPathTransformation= ruleGetPathTransformation EOF ;
    public final EObject entryRuleGetPathTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPathTransformation = null;


        try {
            // InternalMyDsl.g:1398:62: (iv_ruleGetPathTransformation= ruleGetPathTransformation EOF )
            // InternalMyDsl.g:1399:2: iv_ruleGetPathTransformation= ruleGetPathTransformation EOF
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
    // InternalMyDsl.g:1405:1: ruleGetPathTransformation returns [EObject current=null] : ( () otherlv_1= 'get' otherlv_2= 'path' otherlv_3= 'name' ) ;
    public final EObject ruleGetPathTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1411:2: ( ( () otherlv_1= 'get' otherlv_2= 'path' otherlv_3= 'name' ) )
            // InternalMyDsl.g:1412:2: ( () otherlv_1= 'get' otherlv_2= 'path' otherlv_3= 'name' )
            {
            // InternalMyDsl.g:1412:2: ( () otherlv_1= 'get' otherlv_2= 'path' otherlv_3= 'name' )
            // InternalMyDsl.g:1413:3: () otherlv_1= 'get' otherlv_2= 'path' otherlv_3= 'name'
            {
            // InternalMyDsl.g:1413:3: ()
            // InternalMyDsl.g:1414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGetPathTransformationAccess().getGetPathTransformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getGetPathTransformationAccess().getGetKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getGetPathTransformationAccess().getPathKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGetPathTransformationAccess().getNameKeyword_3());
            		

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
    // InternalMyDsl.g:1436:1: entryRuleAppendPathTransformation returns [EObject current=null] : iv_ruleAppendPathTransformation= ruleAppendPathTransformation EOF ;
    public final EObject entryRuleAppendPathTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendPathTransformation = null;


        try {
            // InternalMyDsl.g:1436:65: (iv_ruleAppendPathTransformation= ruleAppendPathTransformation EOF )
            // InternalMyDsl.g:1437:2: iv_ruleAppendPathTransformation= ruleAppendPathTransformation EOF
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
    // InternalMyDsl.g:1443:1: ruleAppendPathTransformation returns [EObject current=null] : (otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAppendPathTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1449:2: ( (otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1450:2: (otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1450:2: (otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1451:3: otherlv_0= 'append' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendPathTransformationAccess().getAppendKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAppendPathTransformationAccess().getPathKeyword_1());
            		
            // InternalMyDsl.g:1459:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1460:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1460:4: (lv_path_2_0= RULE_STRING )
            // InternalMyDsl.g:1461:5: lv_path_2_0= RULE_STRING
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
    // InternalMyDsl.g:1481:1: entryRulePathTransformation returns [EObject current=null] : iv_rulePathTransformation= rulePathTransformation EOF ;
    public final EObject entryRulePathTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathTransformation = null;


        try {
            // InternalMyDsl.g:1481:59: (iv_rulePathTransformation= rulePathTransformation EOF )
            // InternalMyDsl.g:1482:2: iv_rulePathTransformation= rulePathTransformation EOF
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
    // InternalMyDsl.g:1488:1: rulePathTransformation returns [EObject current=null] : (otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) ( ( (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation ) ) ) ) ;
    public final EObject rulePathTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_column_1_0=null;
        EObject lv_operation_2_1 = null;

        EObject lv_operation_2_2 = null;

        EObject lv_operation_2_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1494:2: ( (otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) ( ( (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation ) ) ) ) )
            // InternalMyDsl.g:1495:2: (otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) ( ( (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation ) ) ) )
            {
            // InternalMyDsl.g:1495:2: (otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) ( ( (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation ) ) ) )
            // InternalMyDsl.g:1496:3: otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) ( ( (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation ) ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPathTransformationAccess().getInKeyword_0());
            		
            // InternalMyDsl.g:1500:3: ( (lv_column_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1501:4: (lv_column_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1501:4: (lv_column_1_0= RULE_STRING )
            // InternalMyDsl.g:1502:5: lv_column_1_0= RULE_STRING
            {
            lv_column_1_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_column_1_0, grammarAccess.getPathTransformationAccess().getColumnSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1518:3: ( ( (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation ) ) )
            // InternalMyDsl.g:1519:4: ( (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation ) )
            {
            // InternalMyDsl.g:1519:4: ( (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation ) )
            // InternalMyDsl.g:1520:5: (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation )
            {
            // InternalMyDsl.g:1520:5: (lv_operation_2_1= ruleAppendPathTransformation | lv_operation_2_2= ruleCanonicalizePathTransformation | lv_operation_2_3= ruleGetPathTransformation )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt25=1;
                }
                break;
            case 42:
                {
                alt25=2;
                }
                break;
            case 44:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1521:6: lv_operation_2_1= ruleAppendPathTransformation
                    {

                    						newCompositeNode(grammarAccess.getPathTransformationAccess().getOperationAppendPathTransformationParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operation_2_1=ruleAppendPathTransformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPathTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_2_1,
                    							"org.xtext.example.mydsl.MyDsl.AppendPathTransformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1537:6: lv_operation_2_2= ruleCanonicalizePathTransformation
                    {

                    						newCompositeNode(grammarAccess.getPathTransformationAccess().getOperationCanonicalizePathTransformationParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operation_2_2=ruleCanonicalizePathTransformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPathTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_2_2,
                    							"org.xtext.example.mydsl.MyDsl.CanonicalizePathTransformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1553:6: lv_operation_2_3= ruleGetPathTransformation
                    {

                    						newCompositeNode(grammarAccess.getPathTransformationAccess().getOperationGetPathTransformationParserRuleCall_2_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operation_2_3=ruleGetPathTransformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPathTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_2_3,
                    							"org.xtext.example.mydsl.MyDsl.GetPathTransformation");
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
    // $ANTLR end "rulePathTransformation"


    // $ANTLR start "entryRuleFoldMaxTranformation"
    // InternalMyDsl.g:1575:1: entryRuleFoldMaxTranformation returns [EObject current=null] : iv_ruleFoldMaxTranformation= ruleFoldMaxTranformation EOF ;
    public final EObject entryRuleFoldMaxTranformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoldMaxTranformation = null;


        try {
            // InternalMyDsl.g:1575:61: (iv_ruleFoldMaxTranformation= ruleFoldMaxTranformation EOF )
            // InternalMyDsl.g:1576:2: iv_ruleFoldMaxTranformation= ruleFoldMaxTranformation EOF
            {
             newCompositeNode(grammarAccess.getFoldMaxTranformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoldMaxTranformation=ruleFoldMaxTranformation();

            state._fsp--;

             current =iv_ruleFoldMaxTranformation; 
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
    // $ANTLR end "entryRuleFoldMaxTranformation"


    // $ANTLR start "ruleFoldMaxTranformation"
    // InternalMyDsl.g:1582:1: ruleFoldMaxTranformation returns [EObject current=null] : (otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'fold' otherlv_3= 'max' ) ;
    public final EObject ruleFoldMaxTranformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_column_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1588:2: ( (otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'fold' otherlv_3= 'max' ) )
            // InternalMyDsl.g:1589:2: (otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'fold' otherlv_3= 'max' )
            {
            // InternalMyDsl.g:1589:2: (otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'fold' otherlv_3= 'max' )
            // InternalMyDsl.g:1590:3: otherlv_0= 'in' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'fold' otherlv_3= 'max'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFoldMaxTranformationAccess().getInKeyword_0());
            		
            // InternalMyDsl.g:1594:3: ( (lv_column_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1595:4: (lv_column_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1595:4: (lv_column_1_0= RULE_STRING )
            // InternalMyDsl.g:1596:5: lv_column_1_0= RULE_STRING
            {
            lv_column_1_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_column_1_0, grammarAccess.getFoldMaxTranformationAccess().getColumnSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoldMaxTranformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getFoldMaxTranformationAccess().getFoldKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFoldMaxTranformationAccess().getMaxKeyword_3());
            		

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
    // $ANTLR end "ruleFoldMaxTranformation"


    // $ANTLR start "entryRuleFoldAverageTranformation"
    // InternalMyDsl.g:1624:1: entryRuleFoldAverageTranformation returns [EObject current=null] : iv_ruleFoldAverageTranformation= ruleFoldAverageTranformation EOF ;
    public final EObject entryRuleFoldAverageTranformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoldAverageTranformation = null;


        try {
            // InternalMyDsl.g:1624:65: (iv_ruleFoldAverageTranformation= ruleFoldAverageTranformation EOF )
            // InternalMyDsl.g:1625:2: iv_ruleFoldAverageTranformation= ruleFoldAverageTranformation EOF
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
    // InternalMyDsl.g:1631:1: ruleFoldAverageTranformation returns [EObject current=null] : ( () otherlv_1= 'fold' otherlv_2= 'avg' ) ;
    public final EObject ruleFoldAverageTranformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1637:2: ( ( () otherlv_1= 'fold' otherlv_2= 'avg' ) )
            // InternalMyDsl.g:1638:2: ( () otherlv_1= 'fold' otherlv_2= 'avg' )
            {
            // InternalMyDsl.g:1638:2: ( () otherlv_1= 'fold' otherlv_2= 'avg' )
            // InternalMyDsl.g:1639:3: () otherlv_1= 'fold' otherlv_2= 'avg'
            {
            // InternalMyDsl.g:1639:3: ()
            // InternalMyDsl.g:1640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFoldAverageTranformationAccess().getFoldAverageTranformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getFoldAverageTranformationAccess().getFoldKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFoldAverageTranformationAccess().getAvgKeyword_2());
            		

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
    // InternalMyDsl.g:1658:1: entryRuleFoldSumTranformation returns [EObject current=null] : iv_ruleFoldSumTranformation= ruleFoldSumTranformation EOF ;
    public final EObject entryRuleFoldSumTranformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoldSumTranformation = null;


        try {
            // InternalMyDsl.g:1658:61: (iv_ruleFoldSumTranformation= ruleFoldSumTranformation EOF )
            // InternalMyDsl.g:1659:2: iv_ruleFoldSumTranformation= ruleFoldSumTranformation EOF
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
    // InternalMyDsl.g:1665:1: ruleFoldSumTranformation returns [EObject current=null] : ( () otherlv_1= 'fold' otherlv_2= 'sum' ) ;
    public final EObject ruleFoldSumTranformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1671:2: ( ( () otherlv_1= 'fold' otherlv_2= 'sum' ) )
            // InternalMyDsl.g:1672:2: ( () otherlv_1= 'fold' otherlv_2= 'sum' )
            {
            // InternalMyDsl.g:1672:2: ( () otherlv_1= 'fold' otherlv_2= 'sum' )
            // InternalMyDsl.g:1673:3: () otherlv_1= 'fold' otherlv_2= 'sum'
            {
            // InternalMyDsl.g:1673:3: ()
            // InternalMyDsl.g:1674:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFoldSumTranformationAccess().getFoldSumTranformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getFoldSumTranformationAccess().getFoldKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_2); 

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
    // InternalMyDsl.g:1692:1: entryRuleGroupBy returns [EObject current=null] : iv_ruleGroupBy= ruleGroupBy EOF ;
    public final EObject entryRuleGroupBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupBy = null;


        try {
            // InternalMyDsl.g:1692:48: (iv_ruleGroupBy= ruleGroupBy EOF )
            // InternalMyDsl.g:1693:2: iv_ruleGroupBy= ruleGroupBy EOF
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
    // InternalMyDsl.g:1699:1: ruleGroupBy returns [EObject current=null] : (otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_column_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1705:2: ( (otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1706:2: (otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1706:2: (otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1707:3: otherlv_0= 'group' otherlv_1= 'by' ( (lv_column_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupByAccess().getGroupKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupByAccess().getByKeyword_1());
            		
            // InternalMyDsl.g:1715:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1716:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1716:4: (lv_column_2_0= RULE_STRING )
            // InternalMyDsl.g:1717:5: lv_column_2_0= RULE_STRING
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
    // InternalMyDsl.g:1737:1: entryRuleFoldTransformation returns [EObject current=null] : iv_ruleFoldTransformation= ruleFoldTransformation EOF ;
    public final EObject entryRuleFoldTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoldTransformation = null;


        try {
            // InternalMyDsl.g:1737:59: (iv_ruleFoldTransformation= ruleFoldTransformation EOF )
            // InternalMyDsl.g:1738:2: iv_ruleFoldTransformation= ruleFoldTransformation EOF
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
    // InternalMyDsl.g:1744:1: ruleFoldTransformation returns [EObject current=null] : ( ( ( (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )? ) ;
    public final EObject ruleFoldTransformation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_1 = null;

        EObject lv_operation_0_2 = null;

        EObject lv_operation_0_3 = null;

        EObject lv_groupBy_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1750:2: ( ( ( ( (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )? ) )
            // InternalMyDsl.g:1751:2: ( ( ( (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )? )
            {
            // InternalMyDsl.g:1751:2: ( ( ( (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )? )
            // InternalMyDsl.g:1752:3: ( ( (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation ) ) ) ( (lv_groupBy_1_0= ruleGroupBy ) )?
            {
            // InternalMyDsl.g:1752:3: ( ( (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation ) ) )
            // InternalMyDsl.g:1753:4: ( (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation ) )
            {
            // InternalMyDsl.g:1753:4: ( (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation ) )
            // InternalMyDsl.g:1754:5: (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation )
            {
            // InternalMyDsl.g:1754:5: (lv_operation_0_1= ruleFoldMaxTranformation | lv_operation_0_2= ruleFoldSumTranformation | lv_operation_0_3= ruleFoldAverageTranformation )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            else if ( (LA26_0==46) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==49) ) {
                    alt26=2;
                }
                else if ( (LA26_2==48) ) {
                    alt26=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1755:6: lv_operation_0_1= ruleFoldMaxTranformation
                    {

                    						newCompositeNode(grammarAccess.getFoldTransformationAccess().getOperationFoldMaxTranformationParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_operation_0_1=ruleFoldMaxTranformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFoldTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_1,
                    							"org.xtext.example.mydsl.MyDsl.FoldMaxTranformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1771:6: lv_operation_0_2= ruleFoldSumTranformation
                    {

                    						newCompositeNode(grammarAccess.getFoldTransformationAccess().getOperationFoldSumTranformationParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_40);
                    lv_operation_0_2=ruleFoldSumTranformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFoldTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_2,
                    							"org.xtext.example.mydsl.MyDsl.FoldSumTranformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1787:6: lv_operation_0_3= ruleFoldAverageTranformation
                    {

                    						newCompositeNode(grammarAccess.getFoldTransformationAccess().getOperationFoldAverageTranformationParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_40);
                    lv_operation_0_3=ruleFoldAverageTranformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFoldTransformationRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_0_3,
                    							"org.xtext.example.mydsl.MyDsl.FoldAverageTranformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:1805:3: ( (lv_groupBy_1_0= ruleGroupBy ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1806:4: (lv_groupBy_1_0= ruleGroupBy )
                    {
                    // InternalMyDsl.g:1806:4: (lv_groupBy_1_0= ruleGroupBy )
                    // InternalMyDsl.g:1807:5: lv_groupBy_1_0= ruleGroupBy
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
                    						"org.xtext.example.mydsl.MyDsl.GroupBy");
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
    // InternalMyDsl.g:1828:1: entryRuleAddColumnTransformation returns [EObject current=null] : iv_ruleAddColumnTransformation= ruleAddColumnTransformation EOF ;
    public final EObject entryRuleAddColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddColumnTransformation = null;


        try {
            // InternalMyDsl.g:1828:64: (iv_ruleAddColumnTransformation= ruleAddColumnTransformation EOF )
            // InternalMyDsl.g:1829:2: iv_ruleAddColumnTransformation= ruleAddColumnTransformation EOF
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
    // InternalMyDsl.g:1835:1: ruleAddColumnTransformation returns [EObject current=null] : (otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddColumnTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_column_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1841:2: ( (otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1842:2: (otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1842:2: (otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1843:3: otherlv_0= 'add' ( (lv_column_1_0= RULE_STRING ) ) otherlv_2= 'with' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAddColumnTransformationAccess().getAddKeyword_0());
            		
            // InternalMyDsl.g:1847:3: ( (lv_column_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1848:4: (lv_column_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1848:4: (lv_column_1_0= RULE_STRING )
            // InternalMyDsl.g:1849:5: lv_column_1_0= RULE_STRING
            {
            lv_column_1_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            otherlv_2=(Token)match(input,53,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAddColumnTransformationAccess().getWithKeyword_2());
            		
            // InternalMyDsl.g:1869:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1870:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1870:4: (lv_value_3_0= RULE_STRING )
            // InternalMyDsl.g:1871:5: lv_value_3_0= RULE_STRING
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
    // InternalMyDsl.g:1891:1: entryRuleRemoveColumnTransformation returns [EObject current=null] : iv_ruleRemoveColumnTransformation= ruleRemoveColumnTransformation EOF ;
    public final EObject entryRuleRemoveColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveColumnTransformation = null;


        try {
            // InternalMyDsl.g:1891:67: (iv_ruleRemoveColumnTransformation= ruleRemoveColumnTransformation EOF )
            // InternalMyDsl.g:1892:2: iv_ruleRemoveColumnTransformation= ruleRemoveColumnTransformation EOF
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
    // InternalMyDsl.g:1898:1: ruleRemoveColumnTransformation returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1904:2: ( (otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) )
            // InternalMyDsl.g:1905:2: (otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            {
            // InternalMyDsl.g:1905:2: (otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            // InternalMyDsl.g:1906:3: otherlv_0= 'remove' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveColumnTransformationAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveColumnTransformationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:1914:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1915:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1915:4: (lv_column_2_0= RULE_STRING )
            // InternalMyDsl.g:1916:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            // InternalMyDsl.g:1932:3: (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_STRING) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1933:4: otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:1937:4: ( (lv_column_4_0= RULE_STRING ) )
            	    // InternalMyDsl.g:1938:5: (lv_column_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:1938:5: (lv_column_4_0= RULE_STRING )
            	    // InternalMyDsl.g:1939:6: lv_column_4_0= RULE_STRING
            	    {
            	    lv_column_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
            	    break loop28;
                }
            } while (true);

            // InternalMyDsl.g:1956:3: (otherlv_5= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1957:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getRemoveColumnTransformationAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:1970:1: entryRuleRenameColumnTransformation returns [EObject current=null] : iv_ruleRenameColumnTransformation= ruleRenameColumnTransformation EOF ;
    public final EObject entryRuleRenameColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameColumnTransformation = null;


        try {
            // InternalMyDsl.g:1970:67: (iv_ruleRenameColumnTransformation= ruleRenameColumnTransformation EOF )
            // InternalMyDsl.g:1971:2: iv_ruleRenameColumnTransformation= ruleRenameColumnTransformation EOF
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
    // InternalMyDsl.g:1977:1: ruleRenameColumnTransformation returns [EObject current=null] : (otherlv_0= 'rename' ( (lv_from_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleRenameColumnTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_from_1_0=null;
        Token otherlv_2=null;
        Token lv_to_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1983:2: ( (otherlv_0= 'rename' ( (lv_from_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1984:2: (otherlv_0= 'rename' ( (lv_from_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1984:2: (otherlv_0= 'rename' ( (lv_from_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1985:3: otherlv_0= 'rename' ( (lv_from_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_to_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameColumnTransformationAccess().getRenameKeyword_0());
            		
            // InternalMyDsl.g:1989:3: ( (lv_from_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1990:4: (lv_from_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1990:4: (lv_from_1_0= RULE_STRING )
            // InternalMyDsl.g:1991:5: lv_from_1_0= RULE_STRING
            {
            lv_from_1_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_from_1_0, grammarAccess.getRenameColumnTransformationAccess().getFromSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRenameColumnTransformationAccess().getToKeyword_2());
            		
            // InternalMyDsl.g:2011:3: ( (lv_to_3_0= RULE_STRING ) )
            // InternalMyDsl.g:2012:4: (lv_to_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:2012:4: (lv_to_3_0= RULE_STRING )
            // InternalMyDsl.g:2013:5: lv_to_3_0= RULE_STRING
            {
            lv_to_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_to_3_0, grammarAccess.getRenameColumnTransformationAccess().getToSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameColumnTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_3_0,
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
    // InternalMyDsl.g:2033:1: entryRuleSelectColumnTransformation returns [EObject current=null] : iv_ruleSelectColumnTransformation= ruleSelectColumnTransformation EOF ;
    public final EObject entryRuleSelectColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectColumnTransformation = null;


        try {
            // InternalMyDsl.g:2033:67: (iv_ruleSelectColumnTransformation= ruleSelectColumnTransformation EOF )
            // InternalMyDsl.g:2034:2: iv_ruleSelectColumnTransformation= ruleSelectColumnTransformation EOF
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
    // InternalMyDsl.g:2040:1: ruleSelectColumnTransformation returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:2046:2: ( (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' ) )
            // InternalMyDsl.g:2047:2: (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            {
            // InternalMyDsl.g:2047:2: (otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']' )
            // InternalMyDsl.g:2048:3: otherlv_0= 'select' otherlv_1= '[' ( (lv_column_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )* (otherlv_5= ',' )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectColumnTransformationAccess().getSelectKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectColumnTransformationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:2056:3: ( (lv_column_2_0= RULE_STRING ) )
            // InternalMyDsl.g:2057:4: (lv_column_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:2057:4: (lv_column_2_0= RULE_STRING )
            // InternalMyDsl.g:2058:5: lv_column_2_0= RULE_STRING
            {
            lv_column_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            // InternalMyDsl.g:2074:3: (otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_STRING) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:2075:4: otherlv_3= ',' ( (lv_column_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:2079:4: ( (lv_column_4_0= RULE_STRING ) )
            	    // InternalMyDsl.g:2080:5: (lv_column_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:2080:5: (lv_column_4_0= RULE_STRING )
            	    // InternalMyDsl.g:2081:6: lv_column_4_0= RULE_STRING
            	    {
            	    lv_column_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
            	    break loop30;
                }
            } while (true);

            // InternalMyDsl.g:2098:3: (otherlv_5= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2099:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectColumnTransformationAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyDsl.g:2112:1: entryRuleColumnTransformation returns [EObject current=null] : iv_ruleColumnTransformation= ruleColumnTransformation EOF ;
    public final EObject entryRuleColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnTransformation = null;


        try {
            // InternalMyDsl.g:2112:61: (iv_ruleColumnTransformation= ruleColumnTransformation EOF )
            // InternalMyDsl.g:2113:2: iv_ruleColumnTransformation= ruleColumnTransformation EOF
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
    // InternalMyDsl.g:2119:1: ruleColumnTransformation returns [EObject current=null] : (this_AddColumnTransformation_0= ruleAddColumnTransformation | this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation | this_RenameColumnTransformation_2= ruleRenameColumnTransformation | this_SelectColumnTransformation_3= ruleSelectColumnTransformation ) ;
    public final EObject ruleColumnTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_AddColumnTransformation_0 = null;

        EObject this_RemoveColumnTransformation_1 = null;

        EObject this_RenameColumnTransformation_2 = null;

        EObject this_SelectColumnTransformation_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2125:2: ( (this_AddColumnTransformation_0= ruleAddColumnTransformation | this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation | this_RenameColumnTransformation_2= ruleRenameColumnTransformation | this_SelectColumnTransformation_3= ruleSelectColumnTransformation ) )
            // InternalMyDsl.g:2126:2: (this_AddColumnTransformation_0= ruleAddColumnTransformation | this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation | this_RenameColumnTransformation_2= ruleRenameColumnTransformation | this_SelectColumnTransformation_3= ruleSelectColumnTransformation )
            {
            // InternalMyDsl.g:2126:2: (this_AddColumnTransformation_0= ruleAddColumnTransformation | this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation | this_RenameColumnTransformation_2= ruleRenameColumnTransformation | this_SelectColumnTransformation_3= ruleSelectColumnTransformation )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt32=1;
                }
                break;
            case 54:
                {
                alt32=2;
                }
                break;
            case 55:
                {
                alt32=3;
                }
                break;
            case 57:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2127:3: this_AddColumnTransformation_0= ruleAddColumnTransformation
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
                    // InternalMyDsl.g:2136:3: this_RemoveColumnTransformation_1= ruleRemoveColumnTransformation
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
                    // InternalMyDsl.g:2145:3: this_RenameColumnTransformation_2= ruleRenameColumnTransformation
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
                    // InternalMyDsl.g:2154:3: this_SelectColumnTransformation_3= ruleSelectColumnTransformation
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


    // $ANTLR start "entryRuleTransformation"
    // InternalMyDsl.g:2166:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // InternalMyDsl.g:2166:55: (iv_ruleTransformation= ruleTransformation EOF )
            // InternalMyDsl.g:2167:2: iv_ruleTransformation= ruleTransformation EOF
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
    // InternalMyDsl.g:2173:1: ruleTransformation returns [EObject current=null] : (this_PathTransformation_0= rulePathTransformation | this_FoldTransformation_1= ruleFoldTransformation | this_ColumnTransformation_2= ruleColumnTransformation ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_PathTransformation_0 = null;

        EObject this_FoldTransformation_1 = null;

        EObject this_ColumnTransformation_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2179:2: ( (this_PathTransformation_0= rulePathTransformation | this_FoldTransformation_1= ruleFoldTransformation | this_ColumnTransformation_2= ruleColumnTransformation ) )
            // InternalMyDsl.g:2180:2: (this_PathTransformation_0= rulePathTransformation | this_FoldTransformation_1= ruleFoldTransformation | this_ColumnTransformation_2= ruleColumnTransformation )
            {
            // InternalMyDsl.g:2180:2: (this_PathTransformation_0= rulePathTransformation | this_FoldTransformation_1= ruleFoldTransformation | this_ColumnTransformation_2= ruleColumnTransformation )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_STRING) ) {
                    int LA33_4 = input.LA(3);

                    if ( (LA33_4==46) ) {
                        alt33=2;
                    }
                    else if ( (LA33_4==12||LA33_4==42||LA33_4==44) ) {
                        alt33=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                alt33=2;
                }
                break;
            case 52:
            case 54:
            case 55:
            case 57:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2181:3: this_PathTransformation_0= rulePathTransformation
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
                    // InternalMyDsl.g:2190:3: this_FoldTransformation_1= ruleFoldTransformation
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
                    // InternalMyDsl.g:2199:3: this_ColumnTransformation_2= ruleColumnTransformation
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getColumnTransformationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnTransformation_2=ruleColumnTransformation();

                    state._fsp--;


                    			current = this_ColumnTransformation_2;
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
    // InternalMyDsl.g:2211:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalMyDsl.g:2211:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalMyDsl.g:2212:2: iv_rulePipeline= rulePipeline EOF
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
    // InternalMyDsl.g:2218:1: rulePipeline returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'pipe' otherlv_3= '[' ( ( (lv_transformation_4_0= ruleTransformation ) ) (otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) ) )* (otherlv_7= ',' )? ) otherlv_8= ']' otherlv_9= ';' ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_transformation_4_0 = null;

        EObject lv_transformation_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2224:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'pipe' otherlv_3= '[' ( ( (lv_transformation_4_0= ruleTransformation ) ) (otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) ) )* (otherlv_7= ',' )? ) otherlv_8= ']' otherlv_9= ';' ) )
            // InternalMyDsl.g:2225:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'pipe' otherlv_3= '[' ( ( (lv_transformation_4_0= ruleTransformation ) ) (otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) ) )* (otherlv_7= ',' )? ) otherlv_8= ']' otherlv_9= ';' )
            {
            // InternalMyDsl.g:2225:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'pipe' otherlv_3= '[' ( ( (lv_transformation_4_0= ruleTransformation ) ) (otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) ) )* (otherlv_7= ',' )? ) otherlv_8= ']' otherlv_9= ';' )
            // InternalMyDsl.g:2226:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'pipe' otherlv_3= '[' ( ( (lv_transformation_4_0= ruleTransformation ) ) (otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) ) )* (otherlv_7= ',' )? ) otherlv_8= ']' otherlv_9= ';'
            {
            // InternalMyDsl.g:2226:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:2227:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:2227:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:2228:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPipelineAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPipelineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getPipelineAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPipelineAccess().getPipeKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMyDsl.g:2256:3: ( ( (lv_transformation_4_0= ruleTransformation ) ) (otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) ) )* (otherlv_7= ',' )? )
            // InternalMyDsl.g:2257:4: ( (lv_transformation_4_0= ruleTransformation ) ) (otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) ) )* (otherlv_7= ',' )?
            {
            // InternalMyDsl.g:2257:4: ( (lv_transformation_4_0= ruleTransformation ) )
            // InternalMyDsl.g:2258:5: (lv_transformation_4_0= ruleTransformation )
            {
            // InternalMyDsl.g:2258:5: (lv_transformation_4_0= ruleTransformation )
            // InternalMyDsl.g:2259:6: lv_transformation_4_0= ruleTransformation
            {

            						newCompositeNode(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_4_0_0());
            					
            pushFollow(FOLLOW_8);
            lv_transformation_4_0=ruleTransformation();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPipelineRule());
            						}
            						add(
            							current,
            							"transformation",
            							lv_transformation_4_0,
            							"org.xtext.example.mydsl.MyDsl.Transformation");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDsl.g:2276:4: (otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==16) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==37||LA34_1==46||LA34_1==52||(LA34_1>=54 && LA34_1<=55)||LA34_1==57) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:2277:5: otherlv_5= ',' ( (lv_transformation_6_0= ruleTransformation ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getPipelineAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalMyDsl.g:2281:5: ( (lv_transformation_6_0= ruleTransformation ) )
            	    // InternalMyDsl.g:2282:6: (lv_transformation_6_0= ruleTransformation )
            	    {
            	    // InternalMyDsl.g:2282:6: (lv_transformation_6_0= ruleTransformation )
            	    // InternalMyDsl.g:2283:7: lv_transformation_6_0= ruleTransformation
            	    {

            	    							newCompositeNode(grammarAccess.getPipelineAccess().getTransformationTransformationParserRuleCall_4_1_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_transformation_6_0=ruleTransformation();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transformation",
            	    								lv_transformation_6_0,
            	    								"org.xtext.example.mydsl.MyDsl.Transformation");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalMyDsl.g:2301:4: (otherlv_7= ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2302:5: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_7, grammarAccess.getPipelineAccess().getCommaKeyword_4_2());
                    				

                    }
                    break;

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPipelineAccess().getSemicolonKeyword_6());
            		

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
    // InternalMyDsl.g:2320:1: entryRuleExport returns [EObject current=null] : iv_ruleExport= ruleExport EOF ;
    public final EObject entryRuleExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExport = null;


        try {
            // InternalMyDsl.g:2320:47: (iv_ruleExport= ruleExport EOF )
            // InternalMyDsl.g:2321:2: iv_ruleExport= ruleExport EOF
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
    // InternalMyDsl.g:2327:1: ruleExport returns [EObject current=null] : (otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';' ) ;
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
            // InternalMyDsl.g:2333:2: ( (otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';' ) )
            // InternalMyDsl.g:2334:2: (otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';' )
            {
            // InternalMyDsl.g:2334:2: (otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';' )
            // InternalMyDsl.g:2335:3: otherlv_0= 'export' ( (lv_table_1_0= RULE_ID ) ) otherlv_2= 'to' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_output_5_0= ruleOutputType ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getExportAccess().getExportKeyword_0());
            		
            // InternalMyDsl.g:2339:3: ( (lv_table_1_0= RULE_ID ) )
            // InternalMyDsl.g:2340:4: (lv_table_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2340:4: (lv_table_1_0= RULE_ID )
            // InternalMyDsl.g:2341:5: lv_table_1_0= RULE_ID
            {
            lv_table_1_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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

            otherlv_2=(Token)match(input,56,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getExportAccess().getToKeyword_2());
            		
            // InternalMyDsl.g:2361:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:2362:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:2362:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:2363:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

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

            otherlv_4=(Token)match(input,41,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getExportAccess().getAsKeyword_4());
            		
            // InternalMyDsl.g:2383:3: ( (lv_output_5_0= ruleOutputType ) )
            // InternalMyDsl.g:2384:4: (lv_output_5_0= ruleOutputType )
            {
            // InternalMyDsl.g:2384:4: (lv_output_5_0= ruleOutputType )
            // InternalMyDsl.g:2385:5: lv_output_5_0= ruleOutputType
            {

            					newCompositeNode(grammarAccess.getExportAccess().getOutputOutputTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_output_5_0=ruleOutputType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExportRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_5_0,
            						"org.xtext.example.mydsl.MyDsl.OutputType");
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x02D0402000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000025000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000E8800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000005000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000140000001000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000001E8800000L});

}