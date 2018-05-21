// Generated from C:/Users/andre_000/Desktop/SQLTranspilator/src/main/java/cz/cuni/mff/parser/antlr\Parser.g4 by ANTLR 4.7
package cz.cuni.mff.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ANY=4;
	public static final int
		RULE_main = 0, RULE_statement_keyword = 1, RULE_select_params = 2, RULE_table = 3;
	public static final String[] ruleNames = {
		"main", "statement_keyword", "select_params", "table"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT '", "' FROM '", "' ;'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ANY"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public Statement_keywordContext statement_keyword() {
			return getRuleContext(Statement_keywordContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			statement_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_keywordContext extends ParserRuleContext {
		public Select_paramsContext par;
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public Select_paramsContext select_params() {
			return getRuleContext(Select_paramsContext.class,0);
		}
		public Statement_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStatement_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStatement_keyword(this);
		}
	}

	public final Statement_keywordContext statement_keyword() throws RecognitionException {
		Statement_keywordContext _localctx = new Statement_keywordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			((Statement_keywordContext)_localctx).par = select_params();
			setState(12);
			match(T__1);
			setState(13);
			table();
			setState(14);
			match(T__2);
			 System.out.println("Here is select statement!"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_paramsContext extends ParserRuleContext {
		public Select_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_params; }
	 
		public Select_paramsContext() { }
		public void copyFrom(Select_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamsContext extends Select_paramsContext {
		public List<TerminalNode> ANY() { return getTokens(ParserParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(ParserParser.ANY, i);
		}
		public ParamsContext(Select_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParams(this);
		}
	}

	public final Select_paramsContext select_params() throws RecognitionException {
		Select_paramsContext _localctx = new Select_paramsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_params);
		int _la;
		try {
			_localctx = new ParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				match(ANY);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANY );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public List<TerminalNode> ANY() { return getTokens(ParserParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(ParserParser.ANY, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				match(ANY);
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANY );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\36\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\25\n"+
		"\4\r\4\16\4\26\3\5\6\5\32\n\5\r\5\16\5\33\3\5\2\2\6\2\4\6\b\2\2\2\33\2"+
		"\n\3\2\2\2\4\f\3\2\2\2\6\24\3\2\2\2\b\31\3\2\2\2\n\13\5\4\3\2\13\3\3\2"+
		"\2\2\f\r\7\3\2\2\r\16\5\6\4\2\16\17\7\4\2\2\17\20\5\b\5\2\20\21\7\5\2"+
		"\2\21\22\b\3\1\2\22\5\3\2\2\2\23\25\7\6\2\2\24\23\3\2\2\2\25\26\3\2\2"+
		"\2\26\24\3\2\2\2\26\27\3\2\2\2\27\7\3\2\2\2\30\32\7\6\2\2\31\30\3\2\2"+
		"\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\t\3\2\2\2\4\26\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}