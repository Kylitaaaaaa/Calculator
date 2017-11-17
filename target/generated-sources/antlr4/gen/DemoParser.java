// Generated from Demo.g4 by ANTLR 4.4
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, NUMBER=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'$'", "'%'", "'('", "')'", "'*'", "'+'", "'-'", "NUMBER"
	};
	public static final int
		RULE_math_expression = 0;
	public static final String[] ruleNames = {
		"math_expression"
	};

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DemoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Math_expressionContext extends ParserRuleContext {
		public Math_expressionContext left;
		public Token op;
		public Math_expressionContext right;
		public TerminalNode NUMBER(int i) {
			return getToken(DemoParser.NUMBER, i);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(DemoParser.NUMBER); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterMath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitMath_expression(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		return math_expression(0);
	}

	private Math_expressionContext math_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, _parentState);
		Math_expressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_math_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(4);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(3); match(T__6);
					}
				}

				setState(6); match(NUMBER);
				}
				break;
			case 2:
				{
				setState(7); match(NUMBER);
				setState(8); match(T__4);
				setState(9); match(NUMBER);
				setState(10); match(T__3);
				}
				break;
			case 3:
				{
				setState(11); match(T__4);
				setState(12); ((Math_expressionContext)_localctx).left = math_expression(0);
				setState(13);
				((Math_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__5) | (1L << T__2))) != 0)) ) {
					((Math_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(14); ((Math_expressionContext)_localctx).right = math_expression(0);
				setState(15); match(T__3);
				}
				break;
			case 4:
				{
				setState(17); match(T__4);
				setState(18); ((Math_expressionContext)_localctx).left = math_expression(0);
				setState(19);
				((Math_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__0) ) {
					((Math_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(20); ((Math_expressionContext)_localctx).right = math_expression(0);
				setState(21); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(25);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(26);
						((Math_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__5) | (1L << T__2))) != 0)) ) {
							((Math_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(27); ((Math_expressionContext)_localctx).right = math_expression(3);
						}
						break;
					case 2:
						{
						_localctx = new Math_expressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
						setState(28);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(29);
						((Math_expressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
							((Math_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(30); ((Math_expressionContext)_localctx).right = math_expression(2);
						}
						break;
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expression_sempred(Math_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\'\4\2\t\2\3\2"+
		"\3\2\5\2\7\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\32\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\2\2\3\2\3\2\2\4\5\2\3\3\5\5\b\b\3\2\t\n+\2\31\3\2\2\2\4\6\b\2\1\2"+
		"\5\7\7\4\2\2\6\5\3\2\2\2\6\7\3\2\2\2\7\b\3\2\2\2\b\32\7\13\2\2\t\n\7\13"+
		"\2\2\n\13\7\6\2\2\13\f\7\13\2\2\f\32\7\7\2\2\r\16\7\6\2\2\16\17\5\2\2"+
		"\2\17\20\t\2\2\2\20\21\5\2\2\2\21\22\7\7\2\2\22\32\3\2\2\2\23\24\7\6\2"+
		"\2\24\25\5\2\2\2\25\26\t\3\2\2\26\27\5\2\2\2\27\30\7\7\2\2\30\32\3\2\2"+
		"\2\31\4\3\2\2\2\31\t\3\2\2\2\31\r\3\2\2\2\31\23\3\2\2\2\32#\3\2\2\2\33"+
		"\34\f\4\2\2\34\35\t\2\2\2\35\"\5\2\2\5\36\37\f\3\2\2\37 \t\3\2\2 \"\5"+
		"\2\2\4!\33\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2"+
		"\2%#\3\2\2\2\6\6\31!#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}