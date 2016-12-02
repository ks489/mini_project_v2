package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.BlogPostDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlogPostDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BLOGDATE", "RULE_ALPHANUMERIC", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'blog {'", "'}'", "'articles {'", "','", "'tag '", "'title='", "'date='", "'tags=['", "']'"
    };
    public static final int RULE_ALPHANUMERIC=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_BLOGDATE=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBlogPostDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlogPostDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlogPostDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBlogPostDSL.g"; }



     	private BlogPostDSLGrammarAccess grammarAccess;

        public InternalBlogPostDSLParser(TokenStream input, BlogPostDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected BlogPostDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalBlogPostDSL.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalBlogPostDSL.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalBlogPostDSL.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalBlogPostDSL.g:71:1: ruleDomainmodel returns [EObject current=null] : ( ( (lv_tagImport_0_0= ruleTagImport ) )* ( (lv_itemElement_1_0= ruleItemElement ) )+ ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_tagImport_0_0 = null;

        EObject lv_itemElement_1_0 = null;



        	enterRule();

        try {
            // InternalBlogPostDSL.g:77:2: ( ( ( (lv_tagImport_0_0= ruleTagImport ) )* ( (lv_itemElement_1_0= ruleItemElement ) )+ ) )
            // InternalBlogPostDSL.g:78:2: ( ( (lv_tagImport_0_0= ruleTagImport ) )* ( (lv_itemElement_1_0= ruleItemElement ) )+ )
            {
            // InternalBlogPostDSL.g:78:2: ( ( (lv_tagImport_0_0= ruleTagImport ) )* ( (lv_itemElement_1_0= ruleItemElement ) )+ )
            // InternalBlogPostDSL.g:79:3: ( (lv_tagImport_0_0= ruleTagImport ) )* ( (lv_itemElement_1_0= ruleItemElement ) )+
            {
            // InternalBlogPostDSL.g:79:3: ( (lv_tagImport_0_0= ruleTagImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBlogPostDSL.g:80:4: (lv_tagImport_0_0= ruleTagImport )
            	    {
            	    // InternalBlogPostDSL.g:80:4: (lv_tagImport_0_0= ruleTagImport )
            	    // InternalBlogPostDSL.g:81:5: lv_tagImport_0_0= ruleTagImport
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getTagImportTagImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tagImport_0_0=ruleTagImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					set(
            	    						current,
            	    						"tagImport",
            	    						lv_tagImport_0_0,
            	    						"org.xtext.BlogPostDSL.TagImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBlogPostDSL.g:98:3: ( (lv_itemElement_1_0= ruleItemElement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBlogPostDSL.g:99:4: (lv_itemElement_1_0= ruleItemElement )
            	    {
            	    // InternalBlogPostDSL.g:99:4: (lv_itemElement_1_0= ruleItemElement )
            	    // InternalBlogPostDSL.g:100:5: lv_itemElement_1_0= ruleItemElement
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getItemElementItemElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_itemElement_1_0=ruleItemElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					set(
            	    						current,
            	    						"itemElement",
            	    						lv_itemElement_1_0,
            	    						"org.xtext.BlogPostDSL.ItemElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleItemElement"
    // InternalBlogPostDSL.g:121:1: entryRuleItemElement returns [EObject current=null] : iv_ruleItemElement= ruleItemElement EOF ;
    public final EObject entryRuleItemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemElement = null;


        try {
            // InternalBlogPostDSL.g:121:52: (iv_ruleItemElement= ruleItemElement EOF )
            // InternalBlogPostDSL.g:122:2: iv_ruleItemElement= ruleItemElement EOF
            {
             newCompositeNode(grammarAccess.getItemElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemElement=ruleItemElement();

            state._fsp--;

             current =iv_ruleItemElement; 
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
    // $ANTLR end "entryRuleItemElement"


    // $ANTLR start "ruleItemElement"
    // InternalBlogPostDSL.g:128:1: ruleItemElement returns [EObject current=null] : (this_Blog_0= ruleBlog | this_Article_1= ruleArticle ) ;
    public final EObject ruleItemElement() throws RecognitionException {
        EObject current = null;

        EObject this_Blog_0 = null;

        EObject this_Article_1 = null;



        	enterRule();

        try {
            // InternalBlogPostDSL.g:134:2: ( (this_Blog_0= ruleBlog | this_Article_1= ruleArticle ) )
            // InternalBlogPostDSL.g:135:2: (this_Blog_0= ruleBlog | this_Article_1= ruleArticle )
            {
            // InternalBlogPostDSL.g:135:2: (this_Blog_0= ruleBlog | this_Article_1= ruleArticle )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBlogPostDSL.g:136:3: this_Blog_0= ruleBlog
                    {

                    			newCompositeNode(grammarAccess.getItemElementAccess().getBlogParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Blog_0=ruleBlog();

                    state._fsp--;


                    			current = this_Blog_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlogPostDSL.g:145:3: this_Article_1= ruleArticle
                    {

                    			newCompositeNode(grammarAccess.getItemElementAccess().getArticleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Article_1=ruleArticle();

                    state._fsp--;


                    			current = this_Article_1;
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
    // $ANTLR end "ruleItemElement"


    // $ANTLR start "entryRuleBlog"
    // InternalBlogPostDSL.g:157:1: entryRuleBlog returns [EObject current=null] : iv_ruleBlog= ruleBlog EOF ;
    public final EObject entryRuleBlog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlog = null;


        try {
            // InternalBlogPostDSL.g:157:45: (iv_ruleBlog= ruleBlog EOF )
            // InternalBlogPostDSL.g:158:2: iv_ruleBlog= ruleBlog EOF
            {
             newCompositeNode(grammarAccess.getBlogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlog=ruleBlog();

            state._fsp--;

             current =iv_ruleBlog; 
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
    // $ANTLR end "entryRuleBlog"


    // $ANTLR start "ruleBlog"
    // InternalBlogPostDSL.g:164:1: ruleBlog returns [EObject current=null] : (otherlv_0= 'blog {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}' ) ;
    public final EObject ruleBlog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_declaration_1_0 = null;



        	enterRule();

        try {
            // InternalBlogPostDSL.g:170:2: ( (otherlv_0= 'blog {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}' ) )
            // InternalBlogPostDSL.g:171:2: (otherlv_0= 'blog {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}' )
            {
            // InternalBlogPostDSL.g:171:2: (otherlv_0= 'blog {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}' )
            // InternalBlogPostDSL.g:172:3: otherlv_0= 'blog {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBlogAccess().getBlogKeyword_0());
            		
            // InternalBlogPostDSL.g:176:3: ( (lv_declaration_1_0= ruleElementDeclaration ) )
            // InternalBlogPostDSL.g:177:4: (lv_declaration_1_0= ruleElementDeclaration )
            {
            // InternalBlogPostDSL.g:177:4: (lv_declaration_1_0= ruleElementDeclaration )
            // InternalBlogPostDSL.g:178:5: lv_declaration_1_0= ruleElementDeclaration
            {

            					newCompositeNode(grammarAccess.getBlogAccess().getDeclarationElementDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_declaration_1_0=ruleElementDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlogRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_1_0,
            						"org.xtext.BlogPostDSL.ElementDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleBlog"


    // $ANTLR start "entryRuleArticle"
    // InternalBlogPostDSL.g:203:1: entryRuleArticle returns [EObject current=null] : iv_ruleArticle= ruleArticle EOF ;
    public final EObject entryRuleArticle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArticle = null;


        try {
            // InternalBlogPostDSL.g:203:48: (iv_ruleArticle= ruleArticle EOF )
            // InternalBlogPostDSL.g:204:2: iv_ruleArticle= ruleArticle EOF
            {
             newCompositeNode(grammarAccess.getArticleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArticle=ruleArticle();

            state._fsp--;

             current =iv_ruleArticle; 
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
    // $ANTLR end "entryRuleArticle"


    // $ANTLR start "ruleArticle"
    // InternalBlogPostDSL.g:210:1: ruleArticle returns [EObject current=null] : (otherlv_0= 'articles {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}' ) ;
    public final EObject ruleArticle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_declaration_1_0 = null;



        	enterRule();

        try {
            // InternalBlogPostDSL.g:216:2: ( (otherlv_0= 'articles {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}' ) )
            // InternalBlogPostDSL.g:217:2: (otherlv_0= 'articles {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}' )
            {
            // InternalBlogPostDSL.g:217:2: (otherlv_0= 'articles {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}' )
            // InternalBlogPostDSL.g:218:3: otherlv_0= 'articles {' ( (lv_declaration_1_0= ruleElementDeclaration ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getArticleAccess().getArticlesKeyword_0());
            		
            // InternalBlogPostDSL.g:222:3: ( (lv_declaration_1_0= ruleElementDeclaration ) )
            // InternalBlogPostDSL.g:223:4: (lv_declaration_1_0= ruleElementDeclaration )
            {
            // InternalBlogPostDSL.g:223:4: (lv_declaration_1_0= ruleElementDeclaration )
            // InternalBlogPostDSL.g:224:5: lv_declaration_1_0= ruleElementDeclaration
            {

            					newCompositeNode(grammarAccess.getArticleAccess().getDeclarationElementDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_declaration_1_0=ruleElementDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArticleRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_1_0,
            						"org.xtext.BlogPostDSL.ElementDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleArticle"


    // $ANTLR start "entryRuleElementDeclaration"
    // InternalBlogPostDSL.g:249:1: entryRuleElementDeclaration returns [EObject current=null] : iv_ruleElementDeclaration= ruleElementDeclaration EOF ;
    public final EObject entryRuleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDeclaration = null;


        try {
            // InternalBlogPostDSL.g:249:59: (iv_ruleElementDeclaration= ruleElementDeclaration EOF )
            // InternalBlogPostDSL.g:250:2: iv_ruleElementDeclaration= ruleElementDeclaration EOF
            {
             newCompositeNode(grammarAccess.getElementDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementDeclaration=ruleElementDeclaration();

            state._fsp--;

             current =iv_ruleElementDeclaration; 
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
    // $ANTLR end "entryRuleElementDeclaration"


    // $ANTLR start "ruleElementDeclaration"
    // InternalBlogPostDSL.g:256:1: ruleElementDeclaration returns [EObject current=null] : (this_Title_0= ruleTitle (otherlv_1= ',' ( (lv_date_2_0= ruleDate ) ) )? (otherlv_3= ',' ( (lv_tag_4_0= ruleTags ) ) )? ) ;
    public final EObject ruleElementDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Title_0 = null;

        EObject lv_date_2_0 = null;

        EObject lv_tag_4_0 = null;



        	enterRule();

        try {
            // InternalBlogPostDSL.g:262:2: ( (this_Title_0= ruleTitle (otherlv_1= ',' ( (lv_date_2_0= ruleDate ) ) )? (otherlv_3= ',' ( (lv_tag_4_0= ruleTags ) ) )? ) )
            // InternalBlogPostDSL.g:263:2: (this_Title_0= ruleTitle (otherlv_1= ',' ( (lv_date_2_0= ruleDate ) ) )? (otherlv_3= ',' ( (lv_tag_4_0= ruleTags ) ) )? )
            {
            // InternalBlogPostDSL.g:263:2: (this_Title_0= ruleTitle (otherlv_1= ',' ( (lv_date_2_0= ruleDate ) ) )? (otherlv_3= ',' ( (lv_tag_4_0= ruleTags ) ) )? )
            // InternalBlogPostDSL.g:264:3: this_Title_0= ruleTitle (otherlv_1= ',' ( (lv_date_2_0= ruleDate ) ) )? (otherlv_3= ',' ( (lv_tag_4_0= ruleTags ) ) )?
            {

            			newCompositeNode(grammarAccess.getElementDeclarationAccess().getTitleParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Title_0=ruleTitle();

            state._fsp--;


            			current = this_Title_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBlogPostDSL.g:272:3: (otherlv_1= ',' ( (lv_date_2_0= ruleDate ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalBlogPostDSL.g:273:4: otherlv_1= ',' ( (lv_date_2_0= ruleDate ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementDeclarationAccess().getCommaKeyword_1_0());
                    			
                    // InternalBlogPostDSL.g:277:4: ( (lv_date_2_0= ruleDate ) )
                    // InternalBlogPostDSL.g:278:5: (lv_date_2_0= ruleDate )
                    {
                    // InternalBlogPostDSL.g:278:5: (lv_date_2_0= ruleDate )
                    // InternalBlogPostDSL.g:279:6: lv_date_2_0= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getElementDeclarationAccess().getDateDateParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_date_2_0=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"date",
                    							lv_date_2_0,
                    							"org.xtext.BlogPostDSL.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBlogPostDSL.g:297:3: (otherlv_3= ',' ( (lv_tag_4_0= ruleTags ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBlogPostDSL.g:298:4: otherlv_3= ',' ( (lv_tag_4_0= ruleTags ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementDeclarationAccess().getCommaKeyword_2_0());
                    			
                    // InternalBlogPostDSL.g:302:4: ( (lv_tag_4_0= ruleTags ) )
                    // InternalBlogPostDSL.g:303:5: (lv_tag_4_0= ruleTags )
                    {
                    // InternalBlogPostDSL.g:303:5: (lv_tag_4_0= ruleTags )
                    // InternalBlogPostDSL.g:304:6: lv_tag_4_0= ruleTags
                    {

                    						newCompositeNode(grammarAccess.getElementDeclarationAccess().getTagTagsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tag_4_0=ruleTags();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"tag",
                    							lv_tag_4_0,
                    							"org.xtext.BlogPostDSL.Tags");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleElementDeclaration"


    // $ANTLR start "entryRuleTagImport"
    // InternalBlogPostDSL.g:326:1: entryRuleTagImport returns [EObject current=null] : iv_ruleTagImport= ruleTagImport EOF ;
    public final EObject entryRuleTagImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagImport = null;


        try {
            // InternalBlogPostDSL.g:326:50: (iv_ruleTagImport= ruleTagImport EOF )
            // InternalBlogPostDSL.g:327:2: iv_ruleTagImport= ruleTagImport EOF
            {
             newCompositeNode(grammarAccess.getTagImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTagImport=ruleTagImport();

            state._fsp--;

             current =iv_ruleTagImport; 
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
    // $ANTLR end "entryRuleTagImport"


    // $ANTLR start "ruleTagImport"
    // InternalBlogPostDSL.g:333:1: ruleTagImport returns [EObject current=null] : (otherlv_0= 'tag ' this_Tag_1= ruleTag ) ;
    public final EObject ruleTagImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Tag_1 = null;



        	enterRule();

        try {
            // InternalBlogPostDSL.g:339:2: ( (otherlv_0= 'tag ' this_Tag_1= ruleTag ) )
            // InternalBlogPostDSL.g:340:2: (otherlv_0= 'tag ' this_Tag_1= ruleTag )
            {
            // InternalBlogPostDSL.g:340:2: (otherlv_0= 'tag ' this_Tag_1= ruleTag )
            // InternalBlogPostDSL.g:341:3: otherlv_0= 'tag ' this_Tag_1= ruleTag
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTagImportAccess().getTagKeyword_0());
            		

            			newCompositeNode(grammarAccess.getTagImportAccess().getTagParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Tag_1=ruleTag();

            state._fsp--;


            			current = this_Tag_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleTagImport"


    // $ANTLR start "entryRuleTag"
    // InternalBlogPostDSL.g:357:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalBlogPostDSL.g:357:44: (iv_ruleTag= ruleTag EOF )
            // InternalBlogPostDSL.g:358:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalBlogPostDSL.g:364:1: ruleTag returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBlogPostDSL.g:370:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBlogPostDSL.g:371:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBlogPostDSL.g:371:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBlogPostDSL.g:372:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBlogPostDSL.g:372:3: (lv_name_0_0= RULE_ID )
            // InternalBlogPostDSL.g:373:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTagAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTagRule());
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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleTitle"
    // InternalBlogPostDSL.g:392:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalBlogPostDSL.g:392:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalBlogPostDSL.g:393:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalBlogPostDSL.g:399:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'title=' ( (lv_name_1_0= ruleTitleID ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlogPostDSL.g:405:2: ( (otherlv_0= 'title=' ( (lv_name_1_0= ruleTitleID ) ) ) )
            // InternalBlogPostDSL.g:406:2: (otherlv_0= 'title=' ( (lv_name_1_0= ruleTitleID ) ) )
            {
            // InternalBlogPostDSL.g:406:2: (otherlv_0= 'title=' ( (lv_name_1_0= ruleTitleID ) ) )
            // InternalBlogPostDSL.g:407:3: otherlv_0= 'title=' ( (lv_name_1_0= ruleTitleID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
            		
            // InternalBlogPostDSL.g:411:3: ( (lv_name_1_0= ruleTitleID ) )
            // InternalBlogPostDSL.g:412:4: (lv_name_1_0= ruleTitleID )
            {
            // InternalBlogPostDSL.g:412:4: (lv_name_1_0= ruleTitleID )
            // InternalBlogPostDSL.g:413:5: lv_name_1_0= ruleTitleID
            {

            					newCompositeNode(grammarAccess.getTitleAccess().getNameTitleIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleTitleID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.BlogPostDSL.TitleID");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleDate"
    // InternalBlogPostDSL.g:434:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalBlogPostDSL.g:434:45: (iv_ruleDate= ruleDate EOF )
            // InternalBlogPostDSL.g:435:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalBlogPostDSL.g:441:1: ruleDate returns [EObject current=null] : (otherlv_0= 'date=' ( (lv_name_1_0= RULE_BLOGDATE ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBlogPostDSL.g:447:2: ( (otherlv_0= 'date=' ( (lv_name_1_0= RULE_BLOGDATE ) ) ) )
            // InternalBlogPostDSL.g:448:2: (otherlv_0= 'date=' ( (lv_name_1_0= RULE_BLOGDATE ) ) )
            {
            // InternalBlogPostDSL.g:448:2: (otherlv_0= 'date=' ( (lv_name_1_0= RULE_BLOGDATE ) ) )
            // InternalBlogPostDSL.g:449:3: otherlv_0= 'date=' ( (lv_name_1_0= RULE_BLOGDATE ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDateAccess().getDateKeyword_0());
            		
            // InternalBlogPostDSL.g:453:3: ( (lv_name_1_0= RULE_BLOGDATE ) )
            // InternalBlogPostDSL.g:454:4: (lv_name_1_0= RULE_BLOGDATE )
            {
            // InternalBlogPostDSL.g:454:4: (lv_name_1_0= RULE_BLOGDATE )
            // InternalBlogPostDSL.g:455:5: lv_name_1_0= RULE_BLOGDATE
            {
            lv_name_1_0=(Token)match(input,RULE_BLOGDATE,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDateAccess().getNameBLOGDATETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.BlogPostDSL.BLOGDATE");
            				

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleTags"
    // InternalBlogPostDSL.g:475:1: entryRuleTags returns [EObject current=null] : iv_ruleTags= ruleTags EOF ;
    public final EObject entryRuleTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTags = null;


        try {
            // InternalBlogPostDSL.g:475:45: (iv_ruleTags= ruleTags EOF )
            // InternalBlogPostDSL.g:476:2: iv_ruleTags= ruleTags EOF
            {
             newCompositeNode(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTags=ruleTags();

            state._fsp--;

             current =iv_ruleTags; 
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
    // $ANTLR end "entryRuleTags"


    // $ANTLR start "ruleTags"
    // InternalBlogPostDSL.g:482:1: ruleTags returns [EObject current=null] : (otherlv_0= 'tags=[' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBlogPostDSL.g:488:2: ( (otherlv_0= 'tags=[' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']' ) )
            // InternalBlogPostDSL.g:489:2: (otherlv_0= 'tags=[' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']' )
            {
            // InternalBlogPostDSL.g:489:2: (otherlv_0= 'tags=[' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']' )
            // InternalBlogPostDSL.g:490:3: otherlv_0= 'tags=[' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTagsAccess().getTagsKeyword_0());
            		
            // InternalBlogPostDSL.g:494:3: ( (otherlv_1= RULE_ID ) )
            // InternalBlogPostDSL.g:495:4: (otherlv_1= RULE_ID )
            {
            // InternalBlogPostDSL.g:495:4: (otherlv_1= RULE_ID )
            // InternalBlogPostDSL.g:496:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getTagsAccess().getNameTagCrossReference_1_0());
            				

            }


            }

            // InternalBlogPostDSL.g:507:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBlogPostDSL.g:508:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTagsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBlogPostDSL.g:512:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalBlogPostDSL.g:513:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalBlogPostDSL.g:513:5: (otherlv_3= RULE_ID )
            	    // InternalBlogPostDSL.g:514:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTagsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(otherlv_3, grammarAccess.getTagsAccess().getNameTagCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTagsAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTags"


    // $ANTLR start "entryRuleTitleID"
    // InternalBlogPostDSL.g:534:1: entryRuleTitleID returns [EObject current=null] : iv_ruleTitleID= ruleTitleID EOF ;
    public final EObject entryRuleTitleID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitleID = null;


        try {
            // InternalBlogPostDSL.g:534:48: (iv_ruleTitleID= ruleTitleID EOF )
            // InternalBlogPostDSL.g:535:2: iv_ruleTitleID= ruleTitleID EOF
            {
             newCompositeNode(grammarAccess.getTitleIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitleID=ruleTitleID();

            state._fsp--;

             current =iv_ruleTitleID; 
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
    // $ANTLR end "entryRuleTitleID"


    // $ANTLR start "ruleTitleID"
    // InternalBlogPostDSL.g:541:1: ruleTitleID returns [EObject current=null] : ( (lv_titleid_0_0= RULE_ALPHANUMERIC ) )+ ;
    public final EObject ruleTitleID() throws RecognitionException {
        EObject current = null;

        Token lv_titleid_0_0=null;


        	enterRule();

        try {
            // InternalBlogPostDSL.g:547:2: ( ( (lv_titleid_0_0= RULE_ALPHANUMERIC ) )+ )
            // InternalBlogPostDSL.g:548:2: ( (lv_titleid_0_0= RULE_ALPHANUMERIC ) )+
            {
            // InternalBlogPostDSL.g:548:2: ( (lv_titleid_0_0= RULE_ALPHANUMERIC ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ALPHANUMERIC) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBlogPostDSL.g:549:3: (lv_titleid_0_0= RULE_ALPHANUMERIC )
            	    {
            	    // InternalBlogPostDSL.g:549:3: (lv_titleid_0_0= RULE_ALPHANUMERIC )
            	    // InternalBlogPostDSL.g:550:4: lv_titleid_0_0= RULE_ALPHANUMERIC
            	    {
            	    lv_titleid_0_0=(Token)match(input,RULE_ALPHANUMERIC,FOLLOW_14); 

            	    				newLeafNode(lv_titleid_0_0, grammarAccess.getTitleIDAccess().getTitleidALPHANUMERICTerminalRuleCall_0());
            	    			

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getTitleIDRule());
            	    				}
            	    				addWithLastConsumed(
            	    					current,
            	    					"titleid",
            	    					lv_titleid_0_0,
            	    					"org.xtext.BlogPostDSL.ALPHANUMERIC");
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


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
    // $ANTLR end "ruleTitleID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000042L});

}