package org.xtext.ide.contentassist.antlr.internal;

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
import org.xtext.services.BlogPostDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlogPostDSLParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(BlogPostDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalBlogPostDSL.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:54:1: ( ruleDomainmodel EOF )
            // InternalBlogPostDSL.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalBlogPostDSL.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__Group__0 ) ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:66:2: ( ( ( rule__Domainmodel__Group__0 ) ) )
            // InternalBlogPostDSL.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            {
            // InternalBlogPostDSL.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            // InternalBlogPostDSL.g:68:3: ( rule__Domainmodel__Group__0 )
            {
             before(grammarAccess.getDomainmodelAccess().getGroup()); 
            // InternalBlogPostDSL.g:69:3: ( rule__Domainmodel__Group__0 )
            // InternalBlogPostDSL.g:69:4: rule__Domainmodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleItemElement"
    // InternalBlogPostDSL.g:78:1: entryRuleItemElement : ruleItemElement EOF ;
    public final void entryRuleItemElement() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:79:1: ( ruleItemElement EOF )
            // InternalBlogPostDSL.g:80:1: ruleItemElement EOF
            {
             before(grammarAccess.getItemElementRule()); 
            pushFollow(FOLLOW_1);
            ruleItemElement();

            state._fsp--;

             after(grammarAccess.getItemElementRule()); 
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
    // $ANTLR end "entryRuleItemElement"


    // $ANTLR start "ruleItemElement"
    // InternalBlogPostDSL.g:87:1: ruleItemElement : ( ( rule__ItemElement__Alternatives ) ) ;
    public final void ruleItemElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:91:2: ( ( ( rule__ItemElement__Alternatives ) ) )
            // InternalBlogPostDSL.g:92:2: ( ( rule__ItemElement__Alternatives ) )
            {
            // InternalBlogPostDSL.g:92:2: ( ( rule__ItemElement__Alternatives ) )
            // InternalBlogPostDSL.g:93:3: ( rule__ItemElement__Alternatives )
            {
             before(grammarAccess.getItemElementAccess().getAlternatives()); 
            // InternalBlogPostDSL.g:94:3: ( rule__ItemElement__Alternatives )
            // InternalBlogPostDSL.g:94:4: rule__ItemElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ItemElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemElement"


    // $ANTLR start "entryRuleBlog"
    // InternalBlogPostDSL.g:103:1: entryRuleBlog : ruleBlog EOF ;
    public final void entryRuleBlog() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:104:1: ( ruleBlog EOF )
            // InternalBlogPostDSL.g:105:1: ruleBlog EOF
            {
             before(grammarAccess.getBlogRule()); 
            pushFollow(FOLLOW_1);
            ruleBlog();

            state._fsp--;

             after(grammarAccess.getBlogRule()); 
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
    // $ANTLR end "entryRuleBlog"


    // $ANTLR start "ruleBlog"
    // InternalBlogPostDSL.g:112:1: ruleBlog : ( ( rule__Blog__Group__0 ) ) ;
    public final void ruleBlog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:116:2: ( ( ( rule__Blog__Group__0 ) ) )
            // InternalBlogPostDSL.g:117:2: ( ( rule__Blog__Group__0 ) )
            {
            // InternalBlogPostDSL.g:117:2: ( ( rule__Blog__Group__0 ) )
            // InternalBlogPostDSL.g:118:3: ( rule__Blog__Group__0 )
            {
             before(grammarAccess.getBlogAccess().getGroup()); 
            // InternalBlogPostDSL.g:119:3: ( rule__Blog__Group__0 )
            // InternalBlogPostDSL.g:119:4: rule__Blog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Blog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlogAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlog"


    // $ANTLR start "entryRuleArticle"
    // InternalBlogPostDSL.g:128:1: entryRuleArticle : ruleArticle EOF ;
    public final void entryRuleArticle() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:129:1: ( ruleArticle EOF )
            // InternalBlogPostDSL.g:130:1: ruleArticle EOF
            {
             before(grammarAccess.getArticleRule()); 
            pushFollow(FOLLOW_1);
            ruleArticle();

            state._fsp--;

             after(grammarAccess.getArticleRule()); 
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
    // $ANTLR end "entryRuleArticle"


    // $ANTLR start "ruleArticle"
    // InternalBlogPostDSL.g:137:1: ruleArticle : ( ( rule__Article__Group__0 ) ) ;
    public final void ruleArticle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:141:2: ( ( ( rule__Article__Group__0 ) ) )
            // InternalBlogPostDSL.g:142:2: ( ( rule__Article__Group__0 ) )
            {
            // InternalBlogPostDSL.g:142:2: ( ( rule__Article__Group__0 ) )
            // InternalBlogPostDSL.g:143:3: ( rule__Article__Group__0 )
            {
             before(grammarAccess.getArticleAccess().getGroup()); 
            // InternalBlogPostDSL.g:144:3: ( rule__Article__Group__0 )
            // InternalBlogPostDSL.g:144:4: rule__Article__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Article__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArticle"


    // $ANTLR start "entryRuleElementDeclaration"
    // InternalBlogPostDSL.g:153:1: entryRuleElementDeclaration : ruleElementDeclaration EOF ;
    public final void entryRuleElementDeclaration() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:154:1: ( ruleElementDeclaration EOF )
            // InternalBlogPostDSL.g:155:1: ruleElementDeclaration EOF
            {
             before(grammarAccess.getElementDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleElementDeclaration();

            state._fsp--;

             after(grammarAccess.getElementDeclarationRule()); 
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
    // $ANTLR end "entryRuleElementDeclaration"


    // $ANTLR start "ruleElementDeclaration"
    // InternalBlogPostDSL.g:162:1: ruleElementDeclaration : ( ( rule__ElementDeclaration__Group__0 ) ) ;
    public final void ruleElementDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:166:2: ( ( ( rule__ElementDeclaration__Group__0 ) ) )
            // InternalBlogPostDSL.g:167:2: ( ( rule__ElementDeclaration__Group__0 ) )
            {
            // InternalBlogPostDSL.g:167:2: ( ( rule__ElementDeclaration__Group__0 ) )
            // InternalBlogPostDSL.g:168:3: ( rule__ElementDeclaration__Group__0 )
            {
             before(grammarAccess.getElementDeclarationAccess().getGroup()); 
            // InternalBlogPostDSL.g:169:3: ( rule__ElementDeclaration__Group__0 )
            // InternalBlogPostDSL.g:169:4: rule__ElementDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementDeclaration"


    // $ANTLR start "entryRuleTagImport"
    // InternalBlogPostDSL.g:178:1: entryRuleTagImport : ruleTagImport EOF ;
    public final void entryRuleTagImport() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:179:1: ( ruleTagImport EOF )
            // InternalBlogPostDSL.g:180:1: ruleTagImport EOF
            {
             before(grammarAccess.getTagImportRule()); 
            pushFollow(FOLLOW_1);
            ruleTagImport();

            state._fsp--;

             after(grammarAccess.getTagImportRule()); 
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
    // $ANTLR end "entryRuleTagImport"


    // $ANTLR start "ruleTagImport"
    // InternalBlogPostDSL.g:187:1: ruleTagImport : ( ( rule__TagImport__Group__0 ) ) ;
    public final void ruleTagImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:191:2: ( ( ( rule__TagImport__Group__0 ) ) )
            // InternalBlogPostDSL.g:192:2: ( ( rule__TagImport__Group__0 ) )
            {
            // InternalBlogPostDSL.g:192:2: ( ( rule__TagImport__Group__0 ) )
            // InternalBlogPostDSL.g:193:3: ( rule__TagImport__Group__0 )
            {
             before(grammarAccess.getTagImportAccess().getGroup()); 
            // InternalBlogPostDSL.g:194:3: ( rule__TagImport__Group__0 )
            // InternalBlogPostDSL.g:194:4: rule__TagImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TagImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagImport"


    // $ANTLR start "entryRuleTag"
    // InternalBlogPostDSL.g:203:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:204:1: ( ruleTag EOF )
            // InternalBlogPostDSL.g:205:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalBlogPostDSL.g:212:1: ruleTag : ( ( rule__Tag__NameAssignment ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:216:2: ( ( ( rule__Tag__NameAssignment ) ) )
            // InternalBlogPostDSL.g:217:2: ( ( rule__Tag__NameAssignment ) )
            {
            // InternalBlogPostDSL.g:217:2: ( ( rule__Tag__NameAssignment ) )
            // InternalBlogPostDSL.g:218:3: ( rule__Tag__NameAssignment )
            {
             before(grammarAccess.getTagAccess().getNameAssignment()); 
            // InternalBlogPostDSL.g:219:3: ( rule__Tag__NameAssignment )
            // InternalBlogPostDSL.g:219:4: rule__Tag__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Tag__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleTitle"
    // InternalBlogPostDSL.g:228:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:229:1: ( ruleTitle EOF )
            // InternalBlogPostDSL.g:230:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalBlogPostDSL.g:237:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:241:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalBlogPostDSL.g:242:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalBlogPostDSL.g:242:2: ( ( rule__Title__Group__0 ) )
            // InternalBlogPostDSL.g:243:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalBlogPostDSL.g:244:3: ( rule__Title__Group__0 )
            // InternalBlogPostDSL.g:244:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleDate"
    // InternalBlogPostDSL.g:253:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:254:1: ( ruleDate EOF )
            // InternalBlogPostDSL.g:255:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalBlogPostDSL.g:262:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:266:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalBlogPostDSL.g:267:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalBlogPostDSL.g:267:2: ( ( rule__Date__Group__0 ) )
            // InternalBlogPostDSL.g:268:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalBlogPostDSL.g:269:3: ( rule__Date__Group__0 )
            // InternalBlogPostDSL.g:269:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleTags"
    // InternalBlogPostDSL.g:278:1: entryRuleTags : ruleTags EOF ;
    public final void entryRuleTags() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:279:1: ( ruleTags EOF )
            // InternalBlogPostDSL.g:280:1: ruleTags EOF
            {
             before(grammarAccess.getTagsRule()); 
            pushFollow(FOLLOW_1);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getTagsRule()); 
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
    // $ANTLR end "entryRuleTags"


    // $ANTLR start "ruleTags"
    // InternalBlogPostDSL.g:287:1: ruleTags : ( ( rule__Tags__Group__0 ) ) ;
    public final void ruleTags() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:291:2: ( ( ( rule__Tags__Group__0 ) ) )
            // InternalBlogPostDSL.g:292:2: ( ( rule__Tags__Group__0 ) )
            {
            // InternalBlogPostDSL.g:292:2: ( ( rule__Tags__Group__0 ) )
            // InternalBlogPostDSL.g:293:3: ( rule__Tags__Group__0 )
            {
             before(grammarAccess.getTagsAccess().getGroup()); 
            // InternalBlogPostDSL.g:294:3: ( rule__Tags__Group__0 )
            // InternalBlogPostDSL.g:294:4: rule__Tags__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTags"


    // $ANTLR start "entryRuleTitleID"
    // InternalBlogPostDSL.g:303:1: entryRuleTitleID : ruleTitleID EOF ;
    public final void entryRuleTitleID() throws RecognitionException {
        try {
            // InternalBlogPostDSL.g:304:1: ( ruleTitleID EOF )
            // InternalBlogPostDSL.g:305:1: ruleTitleID EOF
            {
             before(grammarAccess.getTitleIDRule()); 
            pushFollow(FOLLOW_1);
            ruleTitleID();

            state._fsp--;

             after(grammarAccess.getTitleIDRule()); 
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
    // $ANTLR end "entryRuleTitleID"


    // $ANTLR start "ruleTitleID"
    // InternalBlogPostDSL.g:312:1: ruleTitleID : ( ( ( rule__TitleID__TitleidAssignment ) ) ( ( rule__TitleID__TitleidAssignment )* ) ) ;
    public final void ruleTitleID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:316:2: ( ( ( ( rule__TitleID__TitleidAssignment ) ) ( ( rule__TitleID__TitleidAssignment )* ) ) )
            // InternalBlogPostDSL.g:317:2: ( ( ( rule__TitleID__TitleidAssignment ) ) ( ( rule__TitleID__TitleidAssignment )* ) )
            {
            // InternalBlogPostDSL.g:317:2: ( ( ( rule__TitleID__TitleidAssignment ) ) ( ( rule__TitleID__TitleidAssignment )* ) )
            // InternalBlogPostDSL.g:318:3: ( ( rule__TitleID__TitleidAssignment ) ) ( ( rule__TitleID__TitleidAssignment )* )
            {
            // InternalBlogPostDSL.g:318:3: ( ( rule__TitleID__TitleidAssignment ) )
            // InternalBlogPostDSL.g:319:4: ( rule__TitleID__TitleidAssignment )
            {
             before(grammarAccess.getTitleIDAccess().getTitleidAssignment()); 
            // InternalBlogPostDSL.g:320:4: ( rule__TitleID__TitleidAssignment )
            // InternalBlogPostDSL.g:320:5: rule__TitleID__TitleidAssignment
            {
            pushFollow(FOLLOW_3);
            rule__TitleID__TitleidAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTitleIDAccess().getTitleidAssignment()); 

            }

            // InternalBlogPostDSL.g:323:3: ( ( rule__TitleID__TitleidAssignment )* )
            // InternalBlogPostDSL.g:324:4: ( rule__TitleID__TitleidAssignment )*
            {
             before(grammarAccess.getTitleIDAccess().getTitleidAssignment()); 
            // InternalBlogPostDSL.g:325:4: ( rule__TitleID__TitleidAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ALPHANUMERIC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBlogPostDSL.g:325:5: rule__TitleID__TitleidAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TitleID__TitleidAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTitleIDAccess().getTitleidAssignment()); 

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
    // $ANTLR end "ruleTitleID"


    // $ANTLR start "rule__ItemElement__Alternatives"
    // InternalBlogPostDSL.g:334:1: rule__ItemElement__Alternatives : ( ( ruleBlog ) | ( ruleArticle ) );
    public final void rule__ItemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:338:1: ( ( ruleBlog ) | ( ruleArticle ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlogPostDSL.g:339:2: ( ruleBlog )
                    {
                    // InternalBlogPostDSL.g:339:2: ( ruleBlog )
                    // InternalBlogPostDSL.g:340:3: ruleBlog
                    {
                     before(grammarAccess.getItemElementAccess().getBlogParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBlog();

                    state._fsp--;

                     after(grammarAccess.getItemElementAccess().getBlogParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlogPostDSL.g:345:2: ( ruleArticle )
                    {
                    // InternalBlogPostDSL.g:345:2: ( ruleArticle )
                    // InternalBlogPostDSL.g:346:3: ruleArticle
                    {
                     before(grammarAccess.getItemElementAccess().getArticleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArticle();

                    state._fsp--;

                     after(grammarAccess.getItemElementAccess().getArticleParserRuleCall_1()); 

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
    // $ANTLR end "rule__ItemElement__Alternatives"


    // $ANTLR start "rule__Domainmodel__Group__0"
    // InternalBlogPostDSL.g:355:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:359:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalBlogPostDSL.g:360:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Domainmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0"


    // $ANTLR start "rule__Domainmodel__Group__0__Impl"
    // InternalBlogPostDSL.g:367:1: rule__Domainmodel__Group__0__Impl : ( ( rule__Domainmodel__TagImportAssignment_0 )* ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:371:1: ( ( ( rule__Domainmodel__TagImportAssignment_0 )* ) )
            // InternalBlogPostDSL.g:372:1: ( ( rule__Domainmodel__TagImportAssignment_0 )* )
            {
            // InternalBlogPostDSL.g:372:1: ( ( rule__Domainmodel__TagImportAssignment_0 )* )
            // InternalBlogPostDSL.g:373:2: ( rule__Domainmodel__TagImportAssignment_0 )*
            {
             before(grammarAccess.getDomainmodelAccess().getTagImportAssignment_0()); 
            // InternalBlogPostDSL.g:374:2: ( rule__Domainmodel__TagImportAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBlogPostDSL.g:374:3: rule__Domainmodel__TagImportAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Domainmodel__TagImportAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getTagImportAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0__Impl"


    // $ANTLR start "rule__Domainmodel__Group__1"
    // InternalBlogPostDSL.g:382:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:386:1: ( rule__Domainmodel__Group__1__Impl )
            // InternalBlogPostDSL.g:387:2: rule__Domainmodel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__1"


    // $ANTLR start "rule__Domainmodel__Group__1__Impl"
    // InternalBlogPostDSL.g:393:1: rule__Domainmodel__Group__1__Impl : ( ( ( rule__Domainmodel__ItemElementAssignment_1 ) ) ( ( rule__Domainmodel__ItemElementAssignment_1 )* ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:397:1: ( ( ( ( rule__Domainmodel__ItemElementAssignment_1 ) ) ( ( rule__Domainmodel__ItemElementAssignment_1 )* ) ) )
            // InternalBlogPostDSL.g:398:1: ( ( ( rule__Domainmodel__ItemElementAssignment_1 ) ) ( ( rule__Domainmodel__ItemElementAssignment_1 )* ) )
            {
            // InternalBlogPostDSL.g:398:1: ( ( ( rule__Domainmodel__ItemElementAssignment_1 ) ) ( ( rule__Domainmodel__ItemElementAssignment_1 )* ) )
            // InternalBlogPostDSL.g:399:2: ( ( rule__Domainmodel__ItemElementAssignment_1 ) ) ( ( rule__Domainmodel__ItemElementAssignment_1 )* )
            {
            // InternalBlogPostDSL.g:399:2: ( ( rule__Domainmodel__ItemElementAssignment_1 ) )
            // InternalBlogPostDSL.g:400:3: ( rule__Domainmodel__ItemElementAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getItemElementAssignment_1()); 
            // InternalBlogPostDSL.g:401:3: ( rule__Domainmodel__ItemElementAssignment_1 )
            // InternalBlogPostDSL.g:401:4: rule__Domainmodel__ItemElementAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Domainmodel__ItemElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getItemElementAssignment_1()); 

            }

            // InternalBlogPostDSL.g:404:2: ( ( rule__Domainmodel__ItemElementAssignment_1 )* )
            // InternalBlogPostDSL.g:405:3: ( rule__Domainmodel__ItemElementAssignment_1 )*
            {
             before(grammarAccess.getDomainmodelAccess().getItemElementAssignment_1()); 
            // InternalBlogPostDSL.g:406:3: ( rule__Domainmodel__ItemElementAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13||LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBlogPostDSL.g:406:4: rule__Domainmodel__ItemElementAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Domainmodel__ItemElementAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getItemElementAssignment_1()); 

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
    // $ANTLR end "rule__Domainmodel__Group__1__Impl"


    // $ANTLR start "rule__Blog__Group__0"
    // InternalBlogPostDSL.g:416:1: rule__Blog__Group__0 : rule__Blog__Group__0__Impl rule__Blog__Group__1 ;
    public final void rule__Blog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:420:1: ( rule__Blog__Group__0__Impl rule__Blog__Group__1 )
            // InternalBlogPostDSL.g:421:2: rule__Blog__Group__0__Impl rule__Blog__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Blog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Blog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__0"


    // $ANTLR start "rule__Blog__Group__0__Impl"
    // InternalBlogPostDSL.g:428:1: rule__Blog__Group__0__Impl : ( 'blog {' ) ;
    public final void rule__Blog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:432:1: ( ( 'blog {' ) )
            // InternalBlogPostDSL.g:433:1: ( 'blog {' )
            {
            // InternalBlogPostDSL.g:433:1: ( 'blog {' )
            // InternalBlogPostDSL.g:434:2: 'blog {'
            {
             before(grammarAccess.getBlogAccess().getBlogKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBlogAccess().getBlogKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__0__Impl"


    // $ANTLR start "rule__Blog__Group__1"
    // InternalBlogPostDSL.g:443:1: rule__Blog__Group__1 : rule__Blog__Group__1__Impl rule__Blog__Group__2 ;
    public final void rule__Blog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:447:1: ( rule__Blog__Group__1__Impl rule__Blog__Group__2 )
            // InternalBlogPostDSL.g:448:2: rule__Blog__Group__1__Impl rule__Blog__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Blog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Blog__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__1"


    // $ANTLR start "rule__Blog__Group__1__Impl"
    // InternalBlogPostDSL.g:455:1: rule__Blog__Group__1__Impl : ( ( rule__Blog__DeclarationAssignment_1 ) ) ;
    public final void rule__Blog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:459:1: ( ( ( rule__Blog__DeclarationAssignment_1 ) ) )
            // InternalBlogPostDSL.g:460:1: ( ( rule__Blog__DeclarationAssignment_1 ) )
            {
            // InternalBlogPostDSL.g:460:1: ( ( rule__Blog__DeclarationAssignment_1 ) )
            // InternalBlogPostDSL.g:461:2: ( rule__Blog__DeclarationAssignment_1 )
            {
             before(grammarAccess.getBlogAccess().getDeclarationAssignment_1()); 
            // InternalBlogPostDSL.g:462:2: ( rule__Blog__DeclarationAssignment_1 )
            // InternalBlogPostDSL.g:462:3: rule__Blog__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Blog__DeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlogAccess().getDeclarationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__1__Impl"


    // $ANTLR start "rule__Blog__Group__2"
    // InternalBlogPostDSL.g:470:1: rule__Blog__Group__2 : rule__Blog__Group__2__Impl ;
    public final void rule__Blog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:474:1: ( rule__Blog__Group__2__Impl )
            // InternalBlogPostDSL.g:475:2: rule__Blog__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Blog__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__2"


    // $ANTLR start "rule__Blog__Group__2__Impl"
    // InternalBlogPostDSL.g:481:1: rule__Blog__Group__2__Impl : ( '}' ) ;
    public final void rule__Blog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:485:1: ( ( '}' ) )
            // InternalBlogPostDSL.g:486:1: ( '}' )
            {
            // InternalBlogPostDSL.g:486:1: ( '}' )
            // InternalBlogPostDSL.g:487:2: '}'
            {
             before(grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBlogAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__Group__2__Impl"


    // $ANTLR start "rule__Article__Group__0"
    // InternalBlogPostDSL.g:497:1: rule__Article__Group__0 : rule__Article__Group__0__Impl rule__Article__Group__1 ;
    public final void rule__Article__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:501:1: ( rule__Article__Group__0__Impl rule__Article__Group__1 )
            // InternalBlogPostDSL.g:502:2: rule__Article__Group__0__Impl rule__Article__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Article__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Article__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__0"


    // $ANTLR start "rule__Article__Group__0__Impl"
    // InternalBlogPostDSL.g:509:1: rule__Article__Group__0__Impl : ( 'articles {' ) ;
    public final void rule__Article__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:513:1: ( ( 'articles {' ) )
            // InternalBlogPostDSL.g:514:1: ( 'articles {' )
            {
            // InternalBlogPostDSL.g:514:1: ( 'articles {' )
            // InternalBlogPostDSL.g:515:2: 'articles {'
            {
             before(grammarAccess.getArticleAccess().getArticlesKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getArticleAccess().getArticlesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__0__Impl"


    // $ANTLR start "rule__Article__Group__1"
    // InternalBlogPostDSL.g:524:1: rule__Article__Group__1 : rule__Article__Group__1__Impl rule__Article__Group__2 ;
    public final void rule__Article__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:528:1: ( rule__Article__Group__1__Impl rule__Article__Group__2 )
            // InternalBlogPostDSL.g:529:2: rule__Article__Group__1__Impl rule__Article__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Article__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Article__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__1"


    // $ANTLR start "rule__Article__Group__1__Impl"
    // InternalBlogPostDSL.g:536:1: rule__Article__Group__1__Impl : ( ( rule__Article__DeclarationAssignment_1 ) ) ;
    public final void rule__Article__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:540:1: ( ( ( rule__Article__DeclarationAssignment_1 ) ) )
            // InternalBlogPostDSL.g:541:1: ( ( rule__Article__DeclarationAssignment_1 ) )
            {
            // InternalBlogPostDSL.g:541:1: ( ( rule__Article__DeclarationAssignment_1 ) )
            // InternalBlogPostDSL.g:542:2: ( rule__Article__DeclarationAssignment_1 )
            {
             before(grammarAccess.getArticleAccess().getDeclarationAssignment_1()); 
            // InternalBlogPostDSL.g:543:2: ( rule__Article__DeclarationAssignment_1 )
            // InternalBlogPostDSL.g:543:3: rule__Article__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Article__DeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getDeclarationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__1__Impl"


    // $ANTLR start "rule__Article__Group__2"
    // InternalBlogPostDSL.g:551:1: rule__Article__Group__2 : rule__Article__Group__2__Impl ;
    public final void rule__Article__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:555:1: ( rule__Article__Group__2__Impl )
            // InternalBlogPostDSL.g:556:2: rule__Article__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Article__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__2"


    // $ANTLR start "rule__Article__Group__2__Impl"
    // InternalBlogPostDSL.g:562:1: rule__Article__Group__2__Impl : ( '}' ) ;
    public final void rule__Article__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:566:1: ( ( '}' ) )
            // InternalBlogPostDSL.g:567:1: ( '}' )
            {
            // InternalBlogPostDSL.g:567:1: ( '}' )
            // InternalBlogPostDSL.g:568:2: '}'
            {
             before(grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__2__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__0"
    // InternalBlogPostDSL.g:578:1: rule__ElementDeclaration__Group__0 : rule__ElementDeclaration__Group__0__Impl rule__ElementDeclaration__Group__1 ;
    public final void rule__ElementDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:582:1: ( rule__ElementDeclaration__Group__0__Impl rule__ElementDeclaration__Group__1 )
            // InternalBlogPostDSL.g:583:2: rule__ElementDeclaration__Group__0__Impl rule__ElementDeclaration__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ElementDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group__0"


    // $ANTLR start "rule__ElementDeclaration__Group__0__Impl"
    // InternalBlogPostDSL.g:590:1: rule__ElementDeclaration__Group__0__Impl : ( ruleTitle ) ;
    public final void rule__ElementDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:594:1: ( ( ruleTitle ) )
            // InternalBlogPostDSL.g:595:1: ( ruleTitle )
            {
            // InternalBlogPostDSL.g:595:1: ( ruleTitle )
            // InternalBlogPostDSL.g:596:2: ruleTitle
            {
             before(grammarAccess.getElementDeclarationAccess().getTitleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getElementDeclarationAccess().getTitleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__1"
    // InternalBlogPostDSL.g:605:1: rule__ElementDeclaration__Group__1 : rule__ElementDeclaration__Group__1__Impl rule__ElementDeclaration__Group__2 ;
    public final void rule__ElementDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:609:1: ( rule__ElementDeclaration__Group__1__Impl rule__ElementDeclaration__Group__2 )
            // InternalBlogPostDSL.g:610:2: rule__ElementDeclaration__Group__1__Impl rule__ElementDeclaration__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ElementDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group__1"


    // $ANTLR start "rule__ElementDeclaration__Group__1__Impl"
    // InternalBlogPostDSL.g:617:1: rule__ElementDeclaration__Group__1__Impl : ( ( rule__ElementDeclaration__Group_1__0 )? ) ;
    public final void rule__ElementDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:621:1: ( ( ( rule__ElementDeclaration__Group_1__0 )? ) )
            // InternalBlogPostDSL.g:622:1: ( ( rule__ElementDeclaration__Group_1__0 )? )
            {
            // InternalBlogPostDSL.g:622:1: ( ( rule__ElementDeclaration__Group_1__0 )? )
            // InternalBlogPostDSL.g:623:2: ( rule__ElementDeclaration__Group_1__0 )?
            {
             before(grammarAccess.getElementDeclarationAccess().getGroup_1()); 
            // InternalBlogPostDSL.g:624:2: ( rule__ElementDeclaration__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalBlogPostDSL.g:624:3: rule__ElementDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDeclaration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementDeclarationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group__2"
    // InternalBlogPostDSL.g:632:1: rule__ElementDeclaration__Group__2 : rule__ElementDeclaration__Group__2__Impl ;
    public final void rule__ElementDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:636:1: ( rule__ElementDeclaration__Group__2__Impl )
            // InternalBlogPostDSL.g:637:2: rule__ElementDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group__2"


    // $ANTLR start "rule__ElementDeclaration__Group__2__Impl"
    // InternalBlogPostDSL.g:643:1: rule__ElementDeclaration__Group__2__Impl : ( ( rule__ElementDeclaration__Group_2__0 )? ) ;
    public final void rule__ElementDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:647:1: ( ( ( rule__ElementDeclaration__Group_2__0 )? ) )
            // InternalBlogPostDSL.g:648:1: ( ( rule__ElementDeclaration__Group_2__0 )? )
            {
            // InternalBlogPostDSL.g:648:1: ( ( rule__ElementDeclaration__Group_2__0 )? )
            // InternalBlogPostDSL.g:649:2: ( rule__ElementDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getElementDeclarationAccess().getGroup_2()); 
            // InternalBlogPostDSL.g:650:2: ( rule__ElementDeclaration__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBlogPostDSL.g:650:3: rule__ElementDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group_1__0"
    // InternalBlogPostDSL.g:659:1: rule__ElementDeclaration__Group_1__0 : rule__ElementDeclaration__Group_1__0__Impl rule__ElementDeclaration__Group_1__1 ;
    public final void rule__ElementDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:663:1: ( rule__ElementDeclaration__Group_1__0__Impl rule__ElementDeclaration__Group_1__1 )
            // InternalBlogPostDSL.g:664:2: rule__ElementDeclaration__Group_1__0__Impl rule__ElementDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ElementDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group_1__0"


    // $ANTLR start "rule__ElementDeclaration__Group_1__0__Impl"
    // InternalBlogPostDSL.g:671:1: rule__ElementDeclaration__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ElementDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:675:1: ( ( ',' ) )
            // InternalBlogPostDSL.g:676:1: ( ',' )
            {
            // InternalBlogPostDSL.g:676:1: ( ',' )
            // InternalBlogPostDSL.g:677:2: ','
            {
             before(grammarAccess.getElementDeclarationAccess().getCommaKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getElementDeclarationAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group_1__1"
    // InternalBlogPostDSL.g:686:1: rule__ElementDeclaration__Group_1__1 : rule__ElementDeclaration__Group_1__1__Impl ;
    public final void rule__ElementDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:690:1: ( rule__ElementDeclaration__Group_1__1__Impl )
            // InternalBlogPostDSL.g:691:2: rule__ElementDeclaration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group_1__1"


    // $ANTLR start "rule__ElementDeclaration__Group_1__1__Impl"
    // InternalBlogPostDSL.g:697:1: rule__ElementDeclaration__Group_1__1__Impl : ( ( rule__ElementDeclaration__DateAssignment_1_1 ) ) ;
    public final void rule__ElementDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:701:1: ( ( ( rule__ElementDeclaration__DateAssignment_1_1 ) ) )
            // InternalBlogPostDSL.g:702:1: ( ( rule__ElementDeclaration__DateAssignment_1_1 ) )
            {
            // InternalBlogPostDSL.g:702:1: ( ( rule__ElementDeclaration__DateAssignment_1_1 ) )
            // InternalBlogPostDSL.g:703:2: ( rule__ElementDeclaration__DateAssignment_1_1 )
            {
             before(grammarAccess.getElementDeclarationAccess().getDateAssignment_1_1()); 
            // InternalBlogPostDSL.g:704:2: ( rule__ElementDeclaration__DateAssignment_1_1 )
            // InternalBlogPostDSL.g:704:3: rule__ElementDeclaration__DateAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__DateAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementDeclarationAccess().getDateAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group_2__0"
    // InternalBlogPostDSL.g:713:1: rule__ElementDeclaration__Group_2__0 : rule__ElementDeclaration__Group_2__0__Impl rule__ElementDeclaration__Group_2__1 ;
    public final void rule__ElementDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:717:1: ( rule__ElementDeclaration__Group_2__0__Impl rule__ElementDeclaration__Group_2__1 )
            // InternalBlogPostDSL.g:718:2: rule__ElementDeclaration__Group_2__0__Impl rule__ElementDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ElementDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group_2__0"


    // $ANTLR start "rule__ElementDeclaration__Group_2__0__Impl"
    // InternalBlogPostDSL.g:725:1: rule__ElementDeclaration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ElementDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:729:1: ( ( ',' ) )
            // InternalBlogPostDSL.g:730:1: ( ',' )
            {
            // InternalBlogPostDSL.g:730:1: ( ',' )
            // InternalBlogPostDSL.g:731:2: ','
            {
             before(grammarAccess.getElementDeclarationAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getElementDeclarationAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__ElementDeclaration__Group_2__1"
    // InternalBlogPostDSL.g:740:1: rule__ElementDeclaration__Group_2__1 : rule__ElementDeclaration__Group_2__1__Impl ;
    public final void rule__ElementDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:744:1: ( rule__ElementDeclaration__Group_2__1__Impl )
            // InternalBlogPostDSL.g:745:2: rule__ElementDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group_2__1"


    // $ANTLR start "rule__ElementDeclaration__Group_2__1__Impl"
    // InternalBlogPostDSL.g:751:1: rule__ElementDeclaration__Group_2__1__Impl : ( ( rule__ElementDeclaration__TagAssignment_2_1 ) ) ;
    public final void rule__ElementDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:755:1: ( ( ( rule__ElementDeclaration__TagAssignment_2_1 ) ) )
            // InternalBlogPostDSL.g:756:1: ( ( rule__ElementDeclaration__TagAssignment_2_1 ) )
            {
            // InternalBlogPostDSL.g:756:1: ( ( rule__ElementDeclaration__TagAssignment_2_1 ) )
            // InternalBlogPostDSL.g:757:2: ( rule__ElementDeclaration__TagAssignment_2_1 )
            {
             before(grammarAccess.getElementDeclarationAccess().getTagAssignment_2_1()); 
            // InternalBlogPostDSL.g:758:2: ( rule__ElementDeclaration__TagAssignment_2_1 )
            // InternalBlogPostDSL.g:758:3: rule__ElementDeclaration__TagAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementDeclaration__TagAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getElementDeclarationAccess().getTagAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__TagImport__Group__0"
    // InternalBlogPostDSL.g:767:1: rule__TagImport__Group__0 : rule__TagImport__Group__0__Impl rule__TagImport__Group__1 ;
    public final void rule__TagImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:771:1: ( rule__TagImport__Group__0__Impl rule__TagImport__Group__1 )
            // InternalBlogPostDSL.g:772:2: rule__TagImport__Group__0__Impl rule__TagImport__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__TagImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TagImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagImport__Group__0"


    // $ANTLR start "rule__TagImport__Group__0__Impl"
    // InternalBlogPostDSL.g:779:1: rule__TagImport__Group__0__Impl : ( 'tag ' ) ;
    public final void rule__TagImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:783:1: ( ( 'tag ' ) )
            // InternalBlogPostDSL.g:784:1: ( 'tag ' )
            {
            // InternalBlogPostDSL.g:784:1: ( 'tag ' )
            // InternalBlogPostDSL.g:785:2: 'tag '
            {
             before(grammarAccess.getTagImportAccess().getTagKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTagImportAccess().getTagKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagImport__Group__0__Impl"


    // $ANTLR start "rule__TagImport__Group__1"
    // InternalBlogPostDSL.g:794:1: rule__TagImport__Group__1 : rule__TagImport__Group__1__Impl ;
    public final void rule__TagImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:798:1: ( rule__TagImport__Group__1__Impl )
            // InternalBlogPostDSL.g:799:2: rule__TagImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TagImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagImport__Group__1"


    // $ANTLR start "rule__TagImport__Group__1__Impl"
    // InternalBlogPostDSL.g:805:1: rule__TagImport__Group__1__Impl : ( ruleTag ) ;
    public final void rule__TagImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:809:1: ( ( ruleTag ) )
            // InternalBlogPostDSL.g:810:1: ( ruleTag )
            {
            // InternalBlogPostDSL.g:810:1: ( ruleTag )
            // InternalBlogPostDSL.g:811:2: ruleTag
            {
             before(grammarAccess.getTagImportAccess().getTagParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagImportAccess().getTagParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagImport__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalBlogPostDSL.g:821:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:825:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalBlogPostDSL.g:826:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalBlogPostDSL.g:833:1: rule__Title__Group__0__Impl : ( 'title=' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:837:1: ( ( 'title=' ) )
            // InternalBlogPostDSL.g:838:1: ( 'title=' )
            {
            // InternalBlogPostDSL.g:838:1: ( 'title=' )
            // InternalBlogPostDSL.g:839:2: 'title='
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalBlogPostDSL.g:848:1: rule__Title__Group__1 : rule__Title__Group__1__Impl ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:852:1: ( rule__Title__Group__1__Impl )
            // InternalBlogPostDSL.g:853:2: rule__Title__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalBlogPostDSL.g:859:1: rule__Title__Group__1__Impl : ( ( rule__Title__NameAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:863:1: ( ( ( rule__Title__NameAssignment_1 ) ) )
            // InternalBlogPostDSL.g:864:1: ( ( rule__Title__NameAssignment_1 ) )
            {
            // InternalBlogPostDSL.g:864:1: ( ( rule__Title__NameAssignment_1 ) )
            // InternalBlogPostDSL.g:865:2: ( rule__Title__NameAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getNameAssignment_1()); 
            // InternalBlogPostDSL.g:866:2: ( rule__Title__NameAssignment_1 )
            // InternalBlogPostDSL.g:866:3: rule__Title__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalBlogPostDSL.g:875:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:879:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalBlogPostDSL.g:880:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalBlogPostDSL.g:887:1: rule__Date__Group__0__Impl : ( 'date=' ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:891:1: ( ( 'date=' ) )
            // InternalBlogPostDSL.g:892:1: ( 'date=' )
            {
            // InternalBlogPostDSL.g:892:1: ( 'date=' )
            // InternalBlogPostDSL.g:893:2: 'date='
            {
             before(grammarAccess.getDateAccess().getDateKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalBlogPostDSL.g:902:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:906:1: ( rule__Date__Group__1__Impl )
            // InternalBlogPostDSL.g:907:2: rule__Date__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalBlogPostDSL.g:913:1: rule__Date__Group__1__Impl : ( ( rule__Date__NameAssignment_1 ) ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:917:1: ( ( ( rule__Date__NameAssignment_1 ) ) )
            // InternalBlogPostDSL.g:918:1: ( ( rule__Date__NameAssignment_1 ) )
            {
            // InternalBlogPostDSL.g:918:1: ( ( rule__Date__NameAssignment_1 ) )
            // InternalBlogPostDSL.g:919:2: ( rule__Date__NameAssignment_1 )
            {
             before(grammarAccess.getDateAccess().getNameAssignment_1()); 
            // InternalBlogPostDSL.g:920:2: ( rule__Date__NameAssignment_1 )
            // InternalBlogPostDSL.g:920:3: rule__Date__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Date__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Tags__Group__0"
    // InternalBlogPostDSL.g:929:1: rule__Tags__Group__0 : rule__Tags__Group__0__Impl rule__Tags__Group__1 ;
    public final void rule__Tags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:933:1: ( rule__Tags__Group__0__Impl rule__Tags__Group__1 )
            // InternalBlogPostDSL.g:934:2: rule__Tags__Group__0__Impl rule__Tags__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Tags__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tags__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__0"


    // $ANTLR start "rule__Tags__Group__0__Impl"
    // InternalBlogPostDSL.g:941:1: rule__Tags__Group__0__Impl : ( 'tags=[' ) ;
    public final void rule__Tags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:945:1: ( ( 'tags=[' ) )
            // InternalBlogPostDSL.g:946:1: ( 'tags=[' )
            {
            // InternalBlogPostDSL.g:946:1: ( 'tags=[' )
            // InternalBlogPostDSL.g:947:2: 'tags=['
            {
             before(grammarAccess.getTagsAccess().getTagsKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTagsAccess().getTagsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__0__Impl"


    // $ANTLR start "rule__Tags__Group__1"
    // InternalBlogPostDSL.g:956:1: rule__Tags__Group__1 : rule__Tags__Group__1__Impl rule__Tags__Group__2 ;
    public final void rule__Tags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:960:1: ( rule__Tags__Group__1__Impl rule__Tags__Group__2 )
            // InternalBlogPostDSL.g:961:2: rule__Tags__Group__1__Impl rule__Tags__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Tags__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tags__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__1"


    // $ANTLR start "rule__Tags__Group__1__Impl"
    // InternalBlogPostDSL.g:968:1: rule__Tags__Group__1__Impl : ( ( rule__Tags__NameAssignment_1 ) ) ;
    public final void rule__Tags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:972:1: ( ( ( rule__Tags__NameAssignment_1 ) ) )
            // InternalBlogPostDSL.g:973:1: ( ( rule__Tags__NameAssignment_1 ) )
            {
            // InternalBlogPostDSL.g:973:1: ( ( rule__Tags__NameAssignment_1 ) )
            // InternalBlogPostDSL.g:974:2: ( rule__Tags__NameAssignment_1 )
            {
             before(grammarAccess.getTagsAccess().getNameAssignment_1()); 
            // InternalBlogPostDSL.g:975:2: ( rule__Tags__NameAssignment_1 )
            // InternalBlogPostDSL.g:975:3: rule__Tags__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tags__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__1__Impl"


    // $ANTLR start "rule__Tags__Group__2"
    // InternalBlogPostDSL.g:983:1: rule__Tags__Group__2 : rule__Tags__Group__2__Impl rule__Tags__Group__3 ;
    public final void rule__Tags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:987:1: ( rule__Tags__Group__2__Impl rule__Tags__Group__3 )
            // InternalBlogPostDSL.g:988:2: rule__Tags__Group__2__Impl rule__Tags__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Tags__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tags__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__2"


    // $ANTLR start "rule__Tags__Group__2__Impl"
    // InternalBlogPostDSL.g:995:1: rule__Tags__Group__2__Impl : ( ( rule__Tags__Group_2__0 )* ) ;
    public final void rule__Tags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:999:1: ( ( ( rule__Tags__Group_2__0 )* ) )
            // InternalBlogPostDSL.g:1000:1: ( ( rule__Tags__Group_2__0 )* )
            {
            // InternalBlogPostDSL.g:1000:1: ( ( rule__Tags__Group_2__0 )* )
            // InternalBlogPostDSL.g:1001:2: ( rule__Tags__Group_2__0 )*
            {
             before(grammarAccess.getTagsAccess().getGroup_2()); 
            // InternalBlogPostDSL.g:1002:2: ( rule__Tags__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBlogPostDSL.g:1002:3: rule__Tags__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Tags__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTagsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__2__Impl"


    // $ANTLR start "rule__Tags__Group__3"
    // InternalBlogPostDSL.g:1010:1: rule__Tags__Group__3 : rule__Tags__Group__3__Impl ;
    public final void rule__Tags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1014:1: ( rule__Tags__Group__3__Impl )
            // InternalBlogPostDSL.g:1015:2: rule__Tags__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__3"


    // $ANTLR start "rule__Tags__Group__3__Impl"
    // InternalBlogPostDSL.g:1021:1: rule__Tags__Group__3__Impl : ( ']' ) ;
    public final void rule__Tags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1025:1: ( ( ']' ) )
            // InternalBlogPostDSL.g:1026:1: ( ']' )
            {
            // InternalBlogPostDSL.g:1026:1: ( ']' )
            // InternalBlogPostDSL.g:1027:2: ']'
            {
             before(grammarAccess.getTagsAccess().getRightSquareBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTagsAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group__3__Impl"


    // $ANTLR start "rule__Tags__Group_2__0"
    // InternalBlogPostDSL.g:1037:1: rule__Tags__Group_2__0 : rule__Tags__Group_2__0__Impl rule__Tags__Group_2__1 ;
    public final void rule__Tags__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1041:1: ( rule__Tags__Group_2__0__Impl rule__Tags__Group_2__1 )
            // InternalBlogPostDSL.g:1042:2: rule__Tags__Group_2__0__Impl rule__Tags__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Tags__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tags__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group_2__0"


    // $ANTLR start "rule__Tags__Group_2__0__Impl"
    // InternalBlogPostDSL.g:1049:1: rule__Tags__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Tags__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1053:1: ( ( ',' ) )
            // InternalBlogPostDSL.g:1054:1: ( ',' )
            {
            // InternalBlogPostDSL.g:1054:1: ( ',' )
            // InternalBlogPostDSL.g:1055:2: ','
            {
             before(grammarAccess.getTagsAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTagsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group_2__0__Impl"


    // $ANTLR start "rule__Tags__Group_2__1"
    // InternalBlogPostDSL.g:1064:1: rule__Tags__Group_2__1 : rule__Tags__Group_2__1__Impl ;
    public final void rule__Tags__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1068:1: ( rule__Tags__Group_2__1__Impl )
            // InternalBlogPostDSL.g:1069:2: rule__Tags__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tags__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group_2__1"


    // $ANTLR start "rule__Tags__Group_2__1__Impl"
    // InternalBlogPostDSL.g:1075:1: rule__Tags__Group_2__1__Impl : ( ( rule__Tags__NameAssignment_2_1 ) ) ;
    public final void rule__Tags__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1079:1: ( ( ( rule__Tags__NameAssignment_2_1 ) ) )
            // InternalBlogPostDSL.g:1080:1: ( ( rule__Tags__NameAssignment_2_1 ) )
            {
            // InternalBlogPostDSL.g:1080:1: ( ( rule__Tags__NameAssignment_2_1 ) )
            // InternalBlogPostDSL.g:1081:2: ( rule__Tags__NameAssignment_2_1 )
            {
             before(grammarAccess.getTagsAccess().getNameAssignment_2_1()); 
            // InternalBlogPostDSL.g:1082:2: ( rule__Tags__NameAssignment_2_1 )
            // InternalBlogPostDSL.g:1082:3: rule__Tags__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tags__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTagsAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__Group_2__1__Impl"


    // $ANTLR start "rule__Domainmodel__TagImportAssignment_0"
    // InternalBlogPostDSL.g:1091:1: rule__Domainmodel__TagImportAssignment_0 : ( ruleTagImport ) ;
    public final void rule__Domainmodel__TagImportAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1095:1: ( ( ruleTagImport ) )
            // InternalBlogPostDSL.g:1096:2: ( ruleTagImport )
            {
            // InternalBlogPostDSL.g:1096:2: ( ruleTagImport )
            // InternalBlogPostDSL.g:1097:3: ruleTagImport
            {
             before(grammarAccess.getDomainmodelAccess().getTagImportTagImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTagImport();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getTagImportTagImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__TagImportAssignment_0"


    // $ANTLR start "rule__Domainmodel__ItemElementAssignment_1"
    // InternalBlogPostDSL.g:1106:1: rule__Domainmodel__ItemElementAssignment_1 : ( ruleItemElement ) ;
    public final void rule__Domainmodel__ItemElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1110:1: ( ( ruleItemElement ) )
            // InternalBlogPostDSL.g:1111:2: ( ruleItemElement )
            {
            // InternalBlogPostDSL.g:1111:2: ( ruleItemElement )
            // InternalBlogPostDSL.g:1112:3: ruleItemElement
            {
             before(grammarAccess.getDomainmodelAccess().getItemElementItemElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItemElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getItemElementItemElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ItemElementAssignment_1"


    // $ANTLR start "rule__Blog__DeclarationAssignment_1"
    // InternalBlogPostDSL.g:1121:1: rule__Blog__DeclarationAssignment_1 : ( ruleElementDeclaration ) ;
    public final void rule__Blog__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1125:1: ( ( ruleElementDeclaration ) )
            // InternalBlogPostDSL.g:1126:2: ( ruleElementDeclaration )
            {
            // InternalBlogPostDSL.g:1126:2: ( ruleElementDeclaration )
            // InternalBlogPostDSL.g:1127:3: ruleElementDeclaration
            {
             before(grammarAccess.getBlogAccess().getDeclarationElementDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementDeclaration();

            state._fsp--;

             after(grammarAccess.getBlogAccess().getDeclarationElementDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blog__DeclarationAssignment_1"


    // $ANTLR start "rule__Article__DeclarationAssignment_1"
    // InternalBlogPostDSL.g:1136:1: rule__Article__DeclarationAssignment_1 : ( ruleElementDeclaration ) ;
    public final void rule__Article__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1140:1: ( ( ruleElementDeclaration ) )
            // InternalBlogPostDSL.g:1141:2: ( ruleElementDeclaration )
            {
            // InternalBlogPostDSL.g:1141:2: ( ruleElementDeclaration )
            // InternalBlogPostDSL.g:1142:3: ruleElementDeclaration
            {
             before(grammarAccess.getArticleAccess().getDeclarationElementDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementDeclaration();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getDeclarationElementDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__DeclarationAssignment_1"


    // $ANTLR start "rule__ElementDeclaration__DateAssignment_1_1"
    // InternalBlogPostDSL.g:1151:1: rule__ElementDeclaration__DateAssignment_1_1 : ( ruleDate ) ;
    public final void rule__ElementDeclaration__DateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1155:1: ( ( ruleDate ) )
            // InternalBlogPostDSL.g:1156:2: ( ruleDate )
            {
            // InternalBlogPostDSL.g:1156:2: ( ruleDate )
            // InternalBlogPostDSL.g:1157:3: ruleDate
            {
             before(grammarAccess.getElementDeclarationAccess().getDateDateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getElementDeclarationAccess().getDateDateParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__DateAssignment_1_1"


    // $ANTLR start "rule__ElementDeclaration__TagAssignment_2_1"
    // InternalBlogPostDSL.g:1166:1: rule__ElementDeclaration__TagAssignment_2_1 : ( ruleTags ) ;
    public final void rule__ElementDeclaration__TagAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1170:1: ( ( ruleTags ) )
            // InternalBlogPostDSL.g:1171:2: ( ruleTags )
            {
            // InternalBlogPostDSL.g:1171:2: ( ruleTags )
            // InternalBlogPostDSL.g:1172:3: ruleTags
            {
             before(grammarAccess.getElementDeclarationAccess().getTagTagsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTags();

            state._fsp--;

             after(grammarAccess.getElementDeclarationAccess().getTagTagsParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDeclaration__TagAssignment_2_1"


    // $ANTLR start "rule__Tag__NameAssignment"
    // InternalBlogPostDSL.g:1181:1: rule__Tag__NameAssignment : ( RULE_ID ) ;
    public final void rule__Tag__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1185:1: ( ( RULE_ID ) )
            // InternalBlogPostDSL.g:1186:2: ( RULE_ID )
            {
            // InternalBlogPostDSL.g:1186:2: ( RULE_ID )
            // InternalBlogPostDSL.g:1187:3: RULE_ID
            {
             before(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__NameAssignment"


    // $ANTLR start "rule__Title__NameAssignment_1"
    // InternalBlogPostDSL.g:1196:1: rule__Title__NameAssignment_1 : ( ruleTitleID ) ;
    public final void rule__Title__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1200:1: ( ( ruleTitleID ) )
            // InternalBlogPostDSL.g:1201:2: ( ruleTitleID )
            {
            // InternalBlogPostDSL.g:1201:2: ( ruleTitleID )
            // InternalBlogPostDSL.g:1202:3: ruleTitleID
            {
             before(grammarAccess.getTitleAccess().getNameTitleIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTitleID();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getNameTitleIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__NameAssignment_1"


    // $ANTLR start "rule__Date__NameAssignment_1"
    // InternalBlogPostDSL.g:1211:1: rule__Date__NameAssignment_1 : ( RULE_BLOGDATE ) ;
    public final void rule__Date__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1215:1: ( ( RULE_BLOGDATE ) )
            // InternalBlogPostDSL.g:1216:2: ( RULE_BLOGDATE )
            {
            // InternalBlogPostDSL.g:1216:2: ( RULE_BLOGDATE )
            // InternalBlogPostDSL.g:1217:3: RULE_BLOGDATE
            {
             before(grammarAccess.getDateAccess().getNameBLOGDATETerminalRuleCall_1_0()); 
            match(input,RULE_BLOGDATE,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getNameBLOGDATETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__NameAssignment_1"


    // $ANTLR start "rule__Tags__NameAssignment_1"
    // InternalBlogPostDSL.g:1226:1: rule__Tags__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Tags__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1230:1: ( ( ( RULE_ID ) ) )
            // InternalBlogPostDSL.g:1231:2: ( ( RULE_ID ) )
            {
            // InternalBlogPostDSL.g:1231:2: ( ( RULE_ID ) )
            // InternalBlogPostDSL.g:1232:3: ( RULE_ID )
            {
             before(grammarAccess.getTagsAccess().getNameTagCrossReference_1_0()); 
            // InternalBlogPostDSL.g:1233:3: ( RULE_ID )
            // InternalBlogPostDSL.g:1234:4: RULE_ID
            {
             before(grammarAccess.getTagsAccess().getNameTagIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTagsAccess().getNameTagIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTagsAccess().getNameTagCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__NameAssignment_1"


    // $ANTLR start "rule__Tags__NameAssignment_2_1"
    // InternalBlogPostDSL.g:1245:1: rule__Tags__NameAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Tags__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1249:1: ( ( ( RULE_ID ) ) )
            // InternalBlogPostDSL.g:1250:2: ( ( RULE_ID ) )
            {
            // InternalBlogPostDSL.g:1250:2: ( ( RULE_ID ) )
            // InternalBlogPostDSL.g:1251:3: ( RULE_ID )
            {
             before(grammarAccess.getTagsAccess().getNameTagCrossReference_2_1_0()); 
            // InternalBlogPostDSL.g:1252:3: ( RULE_ID )
            // InternalBlogPostDSL.g:1253:4: RULE_ID
            {
             before(grammarAccess.getTagsAccess().getNameTagIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTagsAccess().getNameTagIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTagsAccess().getNameTagCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tags__NameAssignment_2_1"


    // $ANTLR start "rule__TitleID__TitleidAssignment"
    // InternalBlogPostDSL.g:1264:1: rule__TitleID__TitleidAssignment : ( RULE_ALPHANUMERIC ) ;
    public final void rule__TitleID__TitleidAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlogPostDSL.g:1268:1: ( ( RULE_ALPHANUMERIC ) )
            // InternalBlogPostDSL.g:1269:2: ( RULE_ALPHANUMERIC )
            {
            // InternalBlogPostDSL.g:1269:2: ( RULE_ALPHANUMERIC )
            // InternalBlogPostDSL.g:1270:3: RULE_ALPHANUMERIC
            {
             before(grammarAccess.getTitleIDAccess().getTitleidALPHANUMERICTerminalRuleCall_0()); 
            match(input,RULE_ALPHANUMERIC,FOLLOW_2); 
             after(grammarAccess.getTitleIDAccess().getTitleidALPHANUMERICTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleID__TitleidAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});

}