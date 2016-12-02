package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlogPostDSLLexer extends Lexer {
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

    public InternalBlogPostDSLLexer() {;} 
    public InternalBlogPostDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBlogPostDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBlogPostDSL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:11:7: ( 'blog {' )
            // InternalBlogPostDSL.g:11:9: 'blog {'
            {
            match("blog {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:12:7: ( '}' )
            // InternalBlogPostDSL.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:13:7: ( 'articles {' )
            // InternalBlogPostDSL.g:13:9: 'articles {'
            {
            match("articles {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:14:7: ( ',' )
            // InternalBlogPostDSL.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:15:7: ( 'tag ' )
            // InternalBlogPostDSL.g:15:9: 'tag '
            {
            match("tag "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:16:7: ( 'title=' )
            // InternalBlogPostDSL.g:16:9: 'title='
            {
            match("title="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:17:7: ( 'date=' )
            // InternalBlogPostDSL.g:17:9: 'date='
            {
            match("date="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:18:7: ( 'tags=[' )
            // InternalBlogPostDSL.g:18:9: 'tags=['
            {
            match("tags=["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:19:7: ( ']' )
            // InternalBlogPostDSL.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_ALPHANUMERIC"
    public final void mRULE_ALPHANUMERIC() throws RecognitionException {
        try {
            int _type = RULE_ALPHANUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1279:19: ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '-' ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ )
            // InternalBlogPostDSL.g:1279:21: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '-' ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            {
            // InternalBlogPostDSL.g:1279:21: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBlogPostDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('-'); 
            // InternalBlogPostDSL.g:1279:55: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBlogPostDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHANUMERIC"

    // $ANTLR start "RULE_BLOGDATE"
    public final void mRULE_BLOGDATE() throws RecognitionException {
        try {
            int _type = RULE_BLOGDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1281:15: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' )
            // InternalBlogPostDSL.g:1281:17: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BLOGDATE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1283:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBlogPostDSL.g:1283:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBlogPostDSL.g:1283:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBlogPostDSL.g:1283:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBlogPostDSL.g:1283:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBlogPostDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1285:10: ( ( '0' .. '9' )+ )
            // InternalBlogPostDSL.g:1285:12: ( '0' .. '9' )+
            {
            // InternalBlogPostDSL.g:1285:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBlogPostDSL.g:1285:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1287:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBlogPostDSL.g:1287:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBlogPostDSL.g:1287:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBlogPostDSL.g:1287:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBlogPostDSL.g:1287:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBlogPostDSL.g:1287:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBlogPostDSL.g:1287:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBlogPostDSL.g:1287:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBlogPostDSL.g:1287:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBlogPostDSL.g:1287:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBlogPostDSL.g:1287:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1289:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBlogPostDSL.g:1289:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBlogPostDSL.g:1289:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBlogPostDSL.g:1289:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1291:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBlogPostDSL.g:1291:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBlogPostDSL.g:1291:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBlogPostDSL.g:1291:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalBlogPostDSL.g:1291:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBlogPostDSL.g:1291:41: ( '\\r' )? '\\n'
                    {
                    // InternalBlogPostDSL.g:1291:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalBlogPostDSL.g:1291:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1293:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBlogPostDSL.g:1293:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBlogPostDSL.g:1293:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBlogPostDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBlogPostDSL.g:1295:16: ( . )
            // InternalBlogPostDSL.g:1295:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalBlogPostDSL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_ALPHANUMERIC | RULE_BLOGDATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=18;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalBlogPostDSL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalBlogPostDSL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalBlogPostDSL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalBlogPostDSL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalBlogPostDSL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalBlogPostDSL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalBlogPostDSL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalBlogPostDSL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalBlogPostDSL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalBlogPostDSL.g:1:64: RULE_ALPHANUMERIC
                {
                mRULE_ALPHANUMERIC(); 

                }
                break;
            case 11 :
                // InternalBlogPostDSL.g:1:82: RULE_BLOGDATE
                {
                mRULE_BLOGDATE(); 

                }
                break;
            case 12 :
                // InternalBlogPostDSL.g:1:96: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // InternalBlogPostDSL.g:1:104: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // InternalBlogPostDSL.g:1:113: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // InternalBlogPostDSL.g:1:125: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalBlogPostDSL.g:1:141: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalBlogPostDSL.g:1:157: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalBlogPostDSL.g:1:165: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\22\1\uffff\1\22\1\uffff\2\22\1\uffff\1\35\1\22\1\20\1\uffff\3\20\2\uffff\1\22\1\uffff\1\22\2\uffff\1\22\1\uffff\3\22\1\uffff\1\35\5\uffff\5\22\1\35\2\22\1\uffff\3\22\1\35\1\uffff\1\22\1\uffff\1\22\2\uffff\1\35\1\22\1\uffff\1\24\1\22\1\24\1\22\2\uffff";
    static final String DFA14_eofS =
        "\76\uffff";
    static final String DFA14_minS =
        "\1\0\1\55\1\uffff\1\55\1\uffff\2\55\1\uffff\2\55\1\101\1\uffff\2\0\1\52\2\uffff\1\55\1\uffff\1\55\2\uffff\1\55\1\uffff\3\55\1\uffff\1\55\5\uffff\2\55\1\40\3\55\1\40\1\55\1\uffff\4\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\60\2\55\1\uffff\1\60\2\55\1\40\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\3\172\1\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\3\172\1\uffff\1\172\5\uffff\10\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\71\1\172\1\55\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\2\uffff\1\11\3\uffff\1\14\3\uffff\1\21\1\22\1\uffff\1\14\1\uffff\1\12\1\2\1\uffff\1\4\3\uffff\1\11\1\uffff\1\15\1\16\1\17\1\20\1\21\10\uffff\1\5\4\uffff\1\1\1\uffff\1\10\1\uffff\1\7\3\uffff\1\6\4\uffff\1\13\1\3";
    static final String DFA14_specialS =
        "\1\2\13\uffff\1\0\1\1\60\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\4\20\1\15\4\20\1\4\2\20\1\16\12\10\7\20\32\11\2\20\1\7\1\12\1\13\1\20\1\3\1\1\1\11\1\6\17\11\1\5\6\11\2\20\1\2\uff82\20",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\13\23\1\21\16\23",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\21\23\1\26\10\23",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\1\30\7\23\1\31\21\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\1\32\31\23",
            "",
            "\1\24\2\uffff\12\34\7\uffff\32\24\6\uffff\32\24",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\32\23",
            "\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "\0\36",
            "\0\36",
            "\1\37\4\uffff\1\40",
            "",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\16\23\1\42\13\23",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\23\23\1\43\6\23",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\6\23\1\44\23\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\23\23\1\45\6\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\23\23\1\46\6\23",
            "",
            "\1\24\2\uffff\12\47\7\uffff\32\24\6\uffff\32\24",
            "",
            "",
            "",
            "",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\6\23\1\50\23\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\10\23\1\51\21\23",
            "\1\52\14\uffff\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\22\23\1\53\7\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\13\23\1\54\16\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\4\23\1\55\25\23",
            "\1\24\2\uffff\12\56\7\uffff\32\24\6\uffff\32\24",
            "\1\57\14\uffff\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\32\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\2\23\1\60\27\23",
            "",
            "\1\24\2\uffff\12\23\3\uffff\1\61\3\uffff\32\23\6\uffff\32\23",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\4\23\1\62\25\23",
            "\1\24\2\uffff\12\23\3\uffff\1\63\3\uffff\32\23\6\uffff\32\23",
            "\1\64\2\uffff\12\65\7\uffff\32\24\6\uffff\32\24",
            "",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\13\23\1\66\16\23",
            "",
            "\1\24\2\uffff\12\23\3\uffff\1\67\3\uffff\32\23\6\uffff\32\23",
            "",
            "\12\70\7\uffff\32\24\6\uffff\32\24",
            "\1\24\2\uffff\12\65\7\uffff\32\24\6\uffff\32\24",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\4\23\1\71\25\23",
            "",
            "\12\72",
            "\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\22\23\1\73\7\23",
            "\1\74",
            "\1\75\14\uffff\1\24\2\uffff\12\23\7\uffff\32\23\6\uffff\32\23",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_ALPHANUMERIC | RULE_BLOGDATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( ((LA14_12>='\u0000' && LA14_12<='\uFFFF')) ) {s = 30;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_13 = input.LA(1);

                        s = -1;
                        if ( ((LA14_13>='\u0000' && LA14_13<='\uFFFF')) ) {s = 30;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='b') ) {s = 1;}

                        else if ( (LA14_0=='}') ) {s = 2;}

                        else if ( (LA14_0=='a') ) {s = 3;}

                        else if ( (LA14_0==',') ) {s = 4;}

                        else if ( (LA14_0=='t') ) {s = 5;}

                        else if ( (LA14_0=='d') ) {s = 6;}

                        else if ( (LA14_0==']') ) {s = 7;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 8;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='c'||(LA14_0>='e' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 9;}

                        else if ( (LA14_0=='^') ) {s = 10;}

                        else if ( (LA14_0=='_') ) {s = 11;}

                        else if ( (LA14_0=='\"') ) {s = 12;}

                        else if ( (LA14_0=='\'') ) {s = 13;}

                        else if ( (LA14_0=='/') ) {s = 14;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 15;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<='\\')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='|')||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}