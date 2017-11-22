// Generated from Demo.g4 by ANTLR 4.4
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, NUMBER=6, DEC=7, OPENPAREN=8, 
		CLOSEPAREN=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "NUMBER", "DEC", "OPENPAREN", 
		"CLOSEPAREN"
	};


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7!\n\7\3\7\6\7$\n\7\r\7\16\7%\3"+
		"\7\3\7\6\7*\n\7\r\7\16\7+\5\7.\n\7\3\7\5\7\61\n\7\3\7\3\7\6\7\65\n\7\r"+
		"\7\16\7\66\5\79\n\7\3\b\3\b\3\t\3\t\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\3\2\3\3\2\62;F\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\31\3\2\2\2\t\33\3\2\2\2\13\35"+
		"\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25\26\7\61\2\2"+
		"\26\4\3\2\2\2\27\30\7\'\2\2\30\6\3\2\2\2\31\32\7,\2\2\32\b\3\2\2\2\33"+
		"\34\7-\2\2\34\n\3\2\2\2\35\36\7/\2\2\36\f\3\2\2\2\37!\7&\2\2 \37\3\2\2"+
		"\2 !\3\2\2\2!#\3\2\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2"+
		"\2\2&-\3\2\2\2\')\7\60\2\2(*\t\2\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,.\3\2\2\2-\'\3\2\2\2-.\3\2\2\2.9\3\2\2\2/\61\7&\2\2\60/\3\2\2\2"+
		"\60\61\3\2\2\2\61\62\3\2\2\2\62\64\7\60\2\2\63\65\t\2\2\2\64\63\3\2\2"+
		"\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28 \3\2\2\28\60"+
		"\3\2\2\29\16\3\2\2\2:;\7\60\2\2;\20\3\2\2\2<=\7*\2\2=\22\3\2\2\2>?\7+"+
		"\2\2?\24\3\2\2\2\n\2 %+-\60\668\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}