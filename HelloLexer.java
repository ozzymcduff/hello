// $ANTLR ANTLRVersion> HelloLexer.java generatedTimestamp>
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, WS=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'hello'", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"T__0", "ID", "WS"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }


	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch ( ruleIndex ) {
			case 0 : T__0_action((RuleContext)_localctx, actionIndex); break;
			case 1 : ID_action((RuleContext)_localctx, actionIndex); break;
			case 2 : WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	public void WS_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 0 : skip();  break;
		}
	}
	public void ID_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void T__0_action(RuleContext _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}

	public static final String _serializedATN =
		"\2\3\31\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\1\0\1\0\1\0\1\0\1\0\1\0\1\1\4"+
		"\1\17\b\1\13\1\f\1\20\1\2\4\2\24\b\2\13\2\f\2\25\1\2\1\2\3\1\1\uffff\3"+
		"\2\uffff\5\3\0\1\0\2\2AZaz\2\t\n\r\r\32\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1"+
		"\0\0\0\1\7\1\0\0\0\3\16\1\0\0\0\5\23\1\0\0\0\7\b\5h\0\0\b\t\5e\0\0\t\n"+
		"\5l\0\0\n\13\5l\0\0\13\f\5o\0\0\f\2\1\0\0\0\r\17\7\0\0\0\16\r\1\0\0\0"+
		"\17\20\1\0\0\0\20\16\1\0\0\0\20\21\1\0\0\0\21\4\1\0\0\0\22\24\7\1\0\0"+
		"\23\22\1\0\0\0\24\25\1\0\0\0\25\23\1\0\0\0\25\26\1\0\0\0\26\27\1\0\0\0"+
		"\27\30\6\2\0\0\30\6\1\0\0\0\3\0\20\25";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}