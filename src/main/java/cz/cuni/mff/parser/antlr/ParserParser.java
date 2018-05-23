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
		SELECT=1, FROM=2, WHERE=3, GROUP=4, HAVING=5, ORDER=6, DISTINCT=7, ALL=8, 
		AND=9, OR=10, NOT=11, ADD=12, ALTER=13, ASC=14, DESC=15, CREATE=16, SCHEMA=17, 
		DATABASE=18, TABLE=19, VIEW=20, COLUMN=21, DROP=22, SET=23, BY=24, PRIMARY=25, 
		KEY=26, UNIQUE=27, RENAME=28, TO=29, AS=30, DEL=31, DELETE=32, SEL=33, 
		INSERT=34, INTO=35, VALUES=36, UPDATE=37, JOIN=38, NATURAL=39, CROSS=40, 
		INNER=41, FULL=42, RIGHT=43, LEFT=44, OUTER=45, BYTEINT=46, SMALLINT=47, 
		INTEGER=48, BIGINT=49, DECIMAL=50, NUMERIC=51, FLOAT=52, CHAR=53, VARCHAR=54, 
		DATE=55, TIME=56, TIMESTAMP=57, LEFT_BRACKET=58, RIGHT_BRACKET=59, EQUALITY=60, 
		LT=61, LE=62, GT=63, GE=64, NE=65, NEQL=66, QUOT_MARKS=67, APOSTROF=68, 
		SEMICOLON=69, COMMA=70, DOT=71, NAME=72, TOKEN=73, INT=74, WS=75, ANY=76;
	public static final int
		RULE_main = 0, RULE_statement = 1, RULE_statement_type = 2, RULE_select_statement = 3, 
		RULE_select_stmnt = 4, RULE_select_parameters = 5, RULE_select_distinct_all = 6, 
		RULE_select_params = 7, RULE_column = 8, RULE_column_name = 9, RULE_from_statement = 10, 
		RULE_where_statement = 11, RULE_conditions = 12, RULE_condition = 13, 
		RULE_equality_ops = 14, RULE_logical_ops = 15, RULE_group_by_statment = 16, 
		RULE_having_statement = 17, RULE_order_by_statement = 18, RULE_columns_sorted = 19, 
		RULE_tables = 20, RULE_table = 21, RULE_table_name = 22, RULE_join = 23, 
		RULE_columns = 24, RULE_insert_into_statement = 25, RULE_insert_into_stmnt = 26, 
		RULE_insert_columns = 27, RULE_instert_values = 28, RULE_values = 29, 
		RULE_update_statement = 30, RULE_update_stmnt = 31, RULE_update_columns = 32, 
		RULE_delete_statement = 33, RULE_delete_stmnt = 34, RULE_delete_database = 35, 
		RULE_delete_from = 36, RULE_database_name = 37, RULE_create_statement = 38, 
		RULE_create_stmnt = 39, RULE_create_table = 40, RULE_create_view = 41, 
		RULE_create_view_columns = 42, RULE_columns_definition = 43, RULE_alter_statement = 44, 
		RULE_alter_stmnt = 45, RULE_alter_table = 46, RULE_alter_tab = 47, RULE_rename_statement = 48, 
		RULE_add_statement = 49, RULE_drop_columns = 50, RULE_drop_statement = 51, 
		RULE_drop_stmnt = 52, RULE_view_name = 53, RULE_aggregation_function = 54, 
		RULE_column_definition = 55, RULE_column_type = 56, RULE_name = 57, RULE_type = 58, 
		RULE_value = 59;
	public static final String[] ruleNames = {
		"main", "statement", "statement_type", "select_statement", "select_stmnt", 
		"select_parameters", "select_distinct_all", "select_params", "column", 
		"column_name", "from_statement", "where_statement", "conditions", "condition", 
		"equality_ops", "logical_ops", "group_by_statment", "having_statement", 
		"order_by_statement", "columns_sorted", "tables", "table", "table_name", 
		"join", "columns", "insert_into_statement", "insert_into_stmnt", "insert_columns", 
		"instert_values", "values", "update_statement", "update_stmnt", "update_columns", 
		"delete_statement", "delete_stmnt", "delete_database", "delete_from", 
		"database_name", "create_statement", "create_stmnt", "create_table", "create_view", 
		"create_view_columns", "columns_definition", "alter_statement", "alter_stmnt", 
		"alter_table", "alter_tab", "rename_statement", "add_statement", "drop_columns", 
		"drop_statement", "drop_stmnt", "view_name", "aggregation_function", "column_definition", 
		"column_type", "name", "type", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'WHERE'", "'GROUP'", "'HAVING'", "'ORDER'", 
		"'DISTINCT'", "'ALL'", "'AND'", "'OR'", "'NOT'", "'ADD'", "'ALTER'", "'ASC'", 
		"'DESC'", "'CREATE'", "'SCHEMA'", "'DATABASE'", "'TABLE'", "'VIEW'", "'COLUMN'", 
		"'DROP'", "'SET'", "'BY'", "'PRIMARY'", "'KEY'", "'UNIQUE'", "'RENAME'", 
		"'TO'", "'AS'", "'DEL'", "'DELETE'", "'SEL'", "'INSERT'", "'INTO'", "'VALUES'", 
		"'UPDATE'", "'JOIN'", "'NATURAL'", "'CROSS'", "'INNER'", "'FULL'", "'RIGHT'", 
		"'LEFT'", "'OUTER'", "'BYTEINT'", "'SMALLINT'", "'INTEGER'", "'BIGINT'", 
		"'DECIMAL'", "'NUMERIC'", "'FLOAT'", "'CHAR'", "'VARCHAR'", "'DATE'", 
		"'TIME'", "'TIMESTAMP'", "'('", "')'", "'='", "'<'", "'<='", "'>'", "'>='", 
		"'!='", "'<>'", "'\"'", "'''", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "ORDER", "DISTINCT", 
		"ALL", "AND", "OR", "NOT", "ADD", "ALTER", "ASC", "DESC", "CREATE", "SCHEMA", 
		"DATABASE", "TABLE", "VIEW", "COLUMN", "DROP", "SET", "BY", "PRIMARY", 
		"KEY", "UNIQUE", "RENAME", "TO", "AS", "DEL", "DELETE", "SEL", "INSERT", 
		"INTO", "VALUES", "UPDATE", "JOIN", "NATURAL", "CROSS", "INNER", "FULL", 
		"RIGHT", "LEFT", "OUTER", "BYTEINT", "SMALLINT", "INTEGER", "BIGINT", 
		"DECIMAL", "NUMERIC", "FLOAT", "CHAR", "VARCHAR", "DATE", "TIME", "TIMESTAMP", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "EQUALITY", "LT", "LE", "GT", "GE", "NE", 
		"NEQL", "QUOT_MARKS", "APOSTROF", "SEMICOLON", "COMMA", "DOT", "NAME", 
		"TOKEN", "INT", "WS", "ANY"
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(120);
			statement();
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

	public static class StatementContext extends ParserRuleContext {
		public Statement_typeContext statement_type() {
			return getRuleContext(Statement_typeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserParser.SEMICOLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				statement_type();
				setState(123);
				match(WS);
				setState(124);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				statement_type();
				setState(127);
				match(WS);
				setState(128);
				match(SEMICOLON);
				setState(129);
				match(WS);
				setState(130);
				statement();
				}
				break;
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

	public static class Statement_typeContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Insert_into_statementContext insert_into_statement() {
			return getRuleContext(Insert_into_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Create_statementContext create_statement() {
			return getRuleContext(Create_statementContext.class,0);
		}
		public Alter_statementContext alter_statement() {
			return getRuleContext(Alter_statementContext.class,0);
		}
		public Drop_statementContext drop_statement() {
			return getRuleContext(Drop_statementContext.class,0);
		}
		public Statement_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStatement_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStatement_type(this);
		}
	}

	public final Statement_typeContext statement_type() throws RecognitionException {
		Statement_typeContext _localctx = new Statement_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement_type);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case SEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				insert_into_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				update_statement();
				}
				break;
			case DEL:
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				delete_statement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				create_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				alter_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				drop_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Select_statementContext extends ParserRuleContext {
		public Select_parametersContext par;
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Select_parametersContext select_parameters() {
			return getRuleContext(Select_parametersContext.class,0);
		}
		public From_statementContext from_statement() {
			return getRuleContext(From_statementContext.class,0);
		}
		public TerminalNode SEL() { return getToken(ParserParser.SEL, 0); }
		public TerminalNode SELECT() { return getToken(ParserParser.SELECT, 0); }
		public Select_stmntContext select_stmnt() {
			return getRuleContext(Select_stmntContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_statement);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				match(WS);
				setState(145);
				select_parameters();
				setState(146);
				match(WS);
				setState(147);
				from_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				match(WS);
				setState(151);
				((Select_statementContext)_localctx).par = select_parameters();
				setState(152);
				match(WS);
				setState(153);
				from_statement();
				setState(154);
				match(WS);
				setState(155);
				select_stmnt();
				 System.out.println("Here is select statement!"); 
				}
				break;
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

	public static class Select_stmntContext extends ParserRuleContext {
		public Where_statementContext where_statement() {
			return getRuleContext(Where_statementContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Order_by_statementContext order_by_statement() {
			return getRuleContext(Order_by_statementContext.class,0);
		}
		public Group_by_statmentContext group_by_statment() {
			return getRuleContext(Group_by_statmentContext.class,0);
		}
		public Select_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelect_stmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelect_stmnt(this);
		}
	}

	public final Select_stmntContext select_stmnt() throws RecognitionException {
		Select_stmntContext _localctx = new Select_stmntContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_stmnt);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				where_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				where_statement();
				setState(162);
				match(WS);
				setState(163);
				order_by_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				where_statement();
				setState(166);
				match(WS);
				setState(167);
				group_by_statment();
				setState(168);
				match(WS);
				setState(169);
				order_by_statement();
				}
				break;
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

	public static class Select_parametersContext extends ParserRuleContext {
		public Select_distinct_allContext select_distinct_all() {
			return getRuleContext(Select_distinct_allContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Select_paramsContext select_params() {
			return getRuleContext(Select_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public Select_parametersContext select_parameters() {
			return getRuleContext(Select_parametersContext.class,0);
		}
		public Select_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelect_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelect_parameters(this);
		}
	}

	public final Select_parametersContext select_parameters() throws RecognitionException {
		Select_parametersContext _localctx = new Select_parametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_select_parameters);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				select_distinct_all();
				setState(174);
				match(WS);
				setState(175);
				select_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				select_distinct_all();
				setState(178);
				match(WS);
				setState(179);
				select_params();
				setState(180);
				match(WS);
				setState(181);
				match(COMMA);
				setState(182);
				match(WS);
				setState(183);
				select_parameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				select_params();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				select_params();
				setState(187);
				match(WS);
				setState(188);
				match(COMMA);
				setState(189);
				match(WS);
				setState(190);
				select_parameters();
				}
				break;
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

	public static class Select_distinct_allContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(ParserParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(ParserParser.ALL, 0); }
		public Select_distinct_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_distinct_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelect_distinct_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelect_distinct_all(this);
		}
	}

	public final Select_distinct_allContext select_distinct_all() throws RecognitionException {
		Select_distinct_allContext _localctx = new Select_distinct_allContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_select_distinct_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		public Aggregation_functionContext aggregation_function() {
			return getRuleContext(Aggregation_functionContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public Select_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSelect_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSelect_params(this);
		}
	}

	public final Select_paramsContext select_params() throws RecognitionException {
		Select_paramsContext _localctx = new Select_paramsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select_params);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				aggregation_function();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				column();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColumnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ParserParser.DOT, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitColumn(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_column);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				table_name();
				setState(202);
				match(DOT);
				setState(203);
				column_name();
				}
				break;
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

	public static class Column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			name();
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

	public static class From_statementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ParserParser.FROM, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public From_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFrom_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFrom_statement(this);
		}
	}

	public final From_statementContext from_statement() throws RecognitionException {
		From_statementContext _localctx = new From_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_from_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(FROM);
			setState(210);
			match(WS);
			setState(211);
			tables();
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

	public static class Where_statementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ParserParser.WHERE, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public Where_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterWhere_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitWhere_statement(this);
		}
	}

	public final Where_statementContext where_statement() throws RecognitionException {
		Where_statementContext _localctx = new Where_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_where_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(WHERE);
			setState(214);
			match(WS);
			setState(215);
			conditions();
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

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ParserParser.NOT, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Logical_opsContext logical_ops() {
			return getRuleContext(Logical_opsContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitConditions(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditions);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(217);
					match(NOT);
					setState(218);
					match(WS);
					}
				}

				setState(221);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(222);
					match(NOT);
					setState(223);
					match(WS);
					}
				}

				setState(226);
				condition();
				setState(227);
				match(WS);
				setState(228);
				logical_ops();
				setState(229);
				match(WS);
				setState(230);
				conditions();
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public Equality_opsContext equality_ops() {
			return getRuleContext(Equality_opsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				column();
				setState(235);
				equality_ops();
				setState(236);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				column();
				setState(239);
				equality_ops();
				setState(240);
				match(WS);
				setState(241);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				column();
				setState(244);
				match(WS);
				setState(245);
				equality_ops();
				setState(246);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				column();
				setState(249);
				match(WS);
				setState(250);
				equality_ops();
				setState(251);
				match(WS);
				setState(252);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
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

	public static class Equality_opsContext extends ParserRuleContext {
		public TerminalNode EQUALITY() { return getToken(ParserParser.EQUALITY, 0); }
		public TerminalNode LT() { return getToken(ParserParser.LT, 0); }
		public TerminalNode LE() { return getToken(ParserParser.LE, 0); }
		public TerminalNode GT() { return getToken(ParserParser.GT, 0); }
		public TerminalNode GE() { return getToken(ParserParser.GE, 0); }
		public TerminalNode NE() { return getToken(ParserParser.NE, 0); }
		public TerminalNode NEQL() { return getToken(ParserParser.NEQL, 0); }
		public Equality_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterEquality_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitEquality_ops(this);
		}
	}

	public final Equality_opsContext equality_ops() throws RecognitionException {
		Equality_opsContext _localctx = new Equality_opsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equality_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (EQUALITY - 60)) | (1L << (LT - 60)) | (1L << (LE - 60)) | (1L << (GT - 60)) | (1L << (GE - 60)) | (1L << (NE - 60)) | (1L << (NEQL - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Logical_opsContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ParserParser.AND, 0); }
		public TerminalNode OR() { return getToken(ParserParser.OR, 0); }
		public Logical_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLogical_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLogical_ops(this);
		}
	}

	public final Logical_opsContext logical_ops() throws RecognitionException {
		Logical_opsContext _localctx = new Logical_opsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logical_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Group_by_statmentContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ParserParser.GROUP, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public TerminalNode BY() { return getToken(ParserParser.BY, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public Having_statementContext having_statement() {
			return getRuleContext(Having_statementContext.class,0);
		}
		public Group_by_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterGroup_by_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitGroup_by_statment(this);
		}
	}

	public final Group_by_statmentContext group_by_statment() throws RecognitionException {
		Group_by_statmentContext _localctx = new Group_by_statmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_group_by_statment);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(GROUP);
				setState(262);
				match(WS);
				setState(263);
				match(BY);
				setState(264);
				match(WS);
				setState(265);
				columns();
				setState(266);
				match(WS);
				setState(267);
				having_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(GROUP);
				setState(270);
				match(WS);
				setState(271);
				match(BY);
				setState(272);
				match(WS);
				setState(273);
				columns();
				}
				break;
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

	public static class Having_statementContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(ParserParser.HAVING, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public Having_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterHaving_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitHaving_statement(this);
		}
	}

	public final Having_statementContext having_statement() throws RecognitionException {
		Having_statementContext _localctx = new Having_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_having_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(HAVING);
			setState(277);
			match(WS);
			setState(278);
			conditions();
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

	public static class Order_by_statementContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ParserParser.ORDER, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public TerminalNode BY() { return getToken(ParserParser.BY, 0); }
		public Columns_sortedContext columns_sorted() {
			return getRuleContext(Columns_sortedContext.class,0);
		}
		public Order_by_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterOrder_by_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitOrder_by_statement(this);
		}
	}

	public final Order_by_statementContext order_by_statement() throws RecognitionException {
		Order_by_statementContext _localctx = new Order_by_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_order_by_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ORDER);
			setState(281);
			match(WS);
			setState(282);
			match(BY);
			setState(283);
			match(WS);
			setState(284);
			columns_sorted();
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

	public static class Columns_sortedContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public TerminalNode ASC() { return getToken(ParserParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ParserParser.DESC, 0); }
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public Columns_sortedContext columns_sorted() {
			return getRuleContext(Columns_sortedContext.class,0);
		}
		public Columns_sortedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns_sorted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterColumns_sorted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitColumns_sorted(this);
		}
	}

	public final Columns_sortedContext columns_sorted() throws RecognitionException {
		Columns_sortedContext _localctx = new Columns_sortedContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columns_sorted);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				column();
				setState(287);
				match(WS);
				setState(288);
				match(ASC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				column();
				setState(291);
				match(WS);
				setState(292);
				match(DESC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				column();
				setState(295);
				match(WS);
				setState(296);
				match(COMMA);
				setState(297);
				columns_sorted();
				}
				break;
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

	public static class TablesContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTables(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tables);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				table();
				setState(303);
				match(WS);
				setState(304);
				join();
				setState(305);
				match(WS);
				setState(306);
				tables();
				}
				break;
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(ParserParser.LEFT_BRACKET, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ParserParser.RIGHT_BRACKET, 0); }
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
		enterRule(_localctx, 42, RULE_table);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				table_name();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(LEFT_BRACKET);
				setState(312);
				select_statement();
				setState(313);
				match(RIGHT_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Table_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			name();
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

	public static class JoinContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public TerminalNode JOIN() { return getToken(ParserParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(ParserParser.NATURAL, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public TerminalNode CROSS() { return getToken(ParserParser.CROSS, 0); }
		public TerminalNode INNER() { return getToken(ParserParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(ParserParser.OUTER, 0); }
		public TerminalNode FULL() { return getToken(ParserParser.FULL, 0); }
		public TerminalNode RIGHT() { return getToken(ParserParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(ParserParser.LEFT, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitJoin(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_join);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(COMMA);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(JOIN);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(NATURAL);
				setState(322);
				match(WS);
				setState(323);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(CROSS);
				setState(325);
				match(WS);
				setState(326);
				match(JOIN);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				match(INNER);
				setState(328);
				match(WS);
				setState(329);
				match(JOIN);
				}
				break;
			case FULL:
			case RIGHT:
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(330);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << RIGHT) | (1L << LEFT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(331);
				match(WS);
				setState(332);
				match(OUTER);
				setState(333);
				match(WS);
				setState(334);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColumnsContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitColumns(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_columns);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				column();
				setState(339);
				match(WS);
				setState(340);
				match(COMMA);
				setState(341);
				columns();
				}
				break;
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

	public static class Insert_into_statementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ParserParser.INSERT, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public TerminalNode INTO() { return getToken(ParserParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Insert_into_stmntContext insert_into_stmnt() {
			return getRuleContext(Insert_into_stmntContext.class,0);
		}
		public Insert_into_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_into_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInsert_into_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInsert_into_statement(this);
		}
	}

	public final Insert_into_statementContext insert_into_statement() throws RecognitionException {
		Insert_into_statementContext _localctx = new Insert_into_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert_into_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(INSERT);
			setState(346);
			match(WS);
			setState(347);
			match(INTO);
			setState(348);
			match(WS);
			setState(349);
			table_name();
			setState(350);
			match(WS);
			setState(351);
			insert_into_stmnt();
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

	public static class Insert_into_stmntContext extends ParserRuleContext {
		public Instert_valuesContext instert_values() {
			return getRuleContext(Instert_valuesContext.class,0);
		}
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Insert_columnsContext insert_columns() {
			return getRuleContext(Insert_columnsContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Insert_into_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_into_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInsert_into_stmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInsert_into_stmnt(this);
		}
	}

	public final Insert_into_stmntContext insert_into_stmnt() throws RecognitionException {
		Insert_into_stmntContext _localctx = new Insert_into_stmntContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_insert_into_stmnt);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				instert_values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				select_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				insert_columns();
				setState(356);
				match(WS);
				setState(357);
				instert_values();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				insert_columns();
				setState(360);
				match(WS);
				setState(361);
				select_statement();
				}
				break;
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

	public static class Insert_columnsContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(ParserParser.LEFT_BRACKET, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ParserParser.RIGHT_BRACKET, 0); }
		public Insert_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInsert_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInsert_columns(this);
		}
	}

	public final Insert_columnsContext insert_columns() throws RecognitionException {
		Insert_columnsContext _localctx = new Insert_columnsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insert_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(LEFT_BRACKET);
			setState(366);
			columns();
			setState(367);
			match(RIGHT_BRACKET);
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

	public static class Instert_valuesContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(ParserParser.VALUES, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ParserParser.LEFT_BRACKET, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ParserParser.RIGHT_BRACKET, 0); }
		public Instert_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instert_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterInstert_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitInstert_values(this);
		}
	}

	public final Instert_valuesContext instert_values() throws RecognitionException {
		Instert_valuesContext _localctx = new Instert_valuesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_instert_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(VALUES);
			setState(370);
			match(WS);
			setState(371);
			match(LEFT_BRACKET);
			setState(372);
			values();
			setState(373);
			match(RIGHT_BRACKET);
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

	public static class ValuesContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_values);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				value();
				setState(377);
				match(COMMA);
				setState(378);
				match(WS);
				setState(379);
				values();
				}
				break;
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

	public static class Update_statementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ParserParser.UPDATE, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(ParserParser.SET, 0); }
		public Update_stmntContext update_stmnt() {
			return getRuleContext(Update_stmntContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitUpdate_statement(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_update_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(UPDATE);
			setState(384);
			match(WS);
			setState(385);
			table_name();
			setState(386);
			match(WS);
			setState(387);
			match(SET);
			setState(388);
			match(WS);
			setState(389);
			update_stmnt();
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

	public static class Update_stmntContext extends ParserRuleContext {
		public Update_columnsContext update_columns() {
			return getRuleContext(Update_columnsContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Where_statementContext where_statement() {
			return getRuleContext(Where_statementContext.class,0);
		}
		public Update_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterUpdate_stmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitUpdate_stmnt(this);
		}
	}

	public final Update_stmntContext update_stmnt() throws RecognitionException {
		Update_stmntContext _localctx = new Update_stmntContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_update_stmnt);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				update_columns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				update_columns();
				setState(393);
				match(WS);
				setState(394);
				where_statement();
				}
				break;
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

	public static class Update_columnsContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode EQUALITY() { return getToken(ParserParser.EQUALITY, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Update_columnsContext update_columns() {
			return getRuleContext(Update_columnsContext.class,0);
		}
		public Update_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterUpdate_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitUpdate_columns(this);
		}
	}

	public final Update_columnsContext update_columns() throws RecognitionException {
		Update_columnsContext _localctx = new Update_columnsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_columns);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				column_name();
				setState(399);
				match(EQUALITY);
				setState(400);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				column_name();
				setState(403);
				match(EQUALITY);
				setState(404);
				value();
				setState(405);
				match(COMMA);
				setState(406);
				match(WS);
				setState(407);
				update_columns();
				}
				break;
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

	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Delete_stmntContext delete_stmnt() {
			return getRuleContext(Delete_stmntContext.class,0);
		}
		public TerminalNode DEL() { return getToken(ParserParser.DEL, 0); }
		public TerminalNode DELETE() { return getToken(ParserParser.DELETE, 0); }
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDelete_statement(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !(_la==DEL || _la==DELETE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(412);
			match(WS);
			setState(413);
			delete_stmnt();
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

	public static class Delete_stmntContext extends ParserRuleContext {
		public Delete_databaseContext delete_database() {
			return getRuleContext(Delete_databaseContext.class,0);
		}
		public Delete_fromContext delete_from() {
			return getRuleContext(Delete_fromContext.class,0);
		}
		public Delete_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDelete_stmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDelete_stmnt(this);
		}
	}

	public final Delete_stmntContext delete_stmnt() throws RecognitionException {
		Delete_stmntContext _localctx = new Delete_stmntContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_delete_stmnt);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				delete_database();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				delete_from();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Delete_databaseContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(ParserParser.DATABASE, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Delete_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDelete_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDelete_database(this);
		}
	}

	public final Delete_databaseContext delete_database() throws RecognitionException {
		Delete_databaseContext _localctx = new Delete_databaseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_delete_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(DATABASE);
			setState(420);
			match(WS);
			setState(421);
			database_name();
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

	public static class Delete_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ParserParser.FROM, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Where_statementContext where_statement() {
			return getRuleContext(Where_statementContext.class,0);
		}
		public Delete_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDelete_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDelete_from(this);
		}
	}

	public final Delete_fromContext delete_from() throws RecognitionException {
		Delete_fromContext _localctx = new Delete_fromContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_delete_from);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(FROM);
				setState(424);
				match(WS);
				setState(425);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(FROM);
				setState(427);
				match(WS);
				setState(428);
				table_name();
				setState(429);
				match(WS);
				setState(430);
				where_statement();
				}
				break;
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

	public static class Database_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDatabase_name(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			name();
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

	public static class Create_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ParserParser.CREATE, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Create_stmntContext create_stmnt() {
			return getRuleContext(Create_stmntContext.class,0);
		}
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCreate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCreate_statement(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(CREATE);
			setState(437);
			match(WS);
			setState(438);
			create_stmnt();
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

	public static class Create_stmntContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Create_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCreate_stmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCreate_stmnt(this);
		}
	}

	public final Create_stmntContext create_stmnt() throws RecognitionException {
		Create_stmntContext _localctx = new Create_stmntContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_stmnt);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				create_table();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				create_view();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(ParserParser.TABLE, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(ParserParser.LEFT_BRACKET, 0); }
		public Columns_definitionContext columns_definition() {
			return getRuleContext(Columns_definitionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ParserParser.RIGHT_BRACKET, 0); }
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCreate_table(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(TABLE);
			setState(445);
			match(WS);
			setState(446);
			table_name();
			setState(447);
			match(WS);
			setState(448);
			match(LEFT_BRACKET);
			setState(449);
			match(WS);
			setState(450);
			columns_definition();
			setState(451);
			match(WS);
			setState(452);
			match(RIGHT_BRACKET);
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

	public static class Create_viewContext extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(ParserParser.VIEW, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(ParserParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Create_view_columnsContext create_view_columns() {
			return getRuleContext(Create_view_columnsContext.class,0);
		}
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCreate_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCreate_view(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_view);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(VIEW);
				setState(455);
				match(WS);
				setState(456);
				table_name();
				setState(457);
				match(WS);
				setState(458);
				match(AS);
				setState(459);
				match(WS);
				setState(460);
				select_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(VIEW);
				setState(463);
				match(WS);
				setState(464);
				table_name();
				setState(465);
				match(WS);
				setState(466);
				create_view_columns();
				setState(467);
				match(WS);
				setState(468);
				match(AS);
				setState(469);
				match(WS);
				setState(470);
				select_statement();
				}
				break;
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

	public static class Create_view_columnsContext extends ParserRuleContext {
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public Create_view_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCreate_view_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCreate_view_columns(this);
		}
	}

	public final Create_view_columnsContext create_view_columns() throws RecognitionException {
		Create_view_columnsContext _localctx = new Create_view_columnsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_view_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			columns();
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

	public static class Columns_definitionContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Columns_definitionContext columns_definition() {
			return getRuleContext(Columns_definitionContext.class,0);
		}
		public Columns_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterColumns_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitColumns_definition(this);
		}
	}

	public final Columns_definitionContext columns_definition() throws RecognitionException {
		Columns_definitionContext _localctx = new Columns_definitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_columns_definition);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				column_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				column_definition();
				setState(478);
				match(COMMA);
				setState(479);
				match(WS);
				setState(480);
				columns_definition();
				}
				break;
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

	public static class Alter_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ParserParser.ALTER, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Alter_stmntContext alter_stmnt() {
			return getRuleContext(Alter_stmntContext.class,0);
		}
		public Alter_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAlter_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAlter_statement(this);
		}
	}

	public final Alter_statementContext alter_statement() throws RecognitionException {
		Alter_statementContext _localctx = new Alter_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_alter_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(ALTER);
			setState(485);
			match(WS);
			setState(486);
			alter_stmnt();
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

	public static class Alter_stmntContext extends ParserRuleContext {
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Alter_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAlter_stmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAlter_stmnt(this);
		}
	}

	public final Alter_stmntContext alter_stmnt() throws RecognitionException {
		Alter_stmntContext _localctx = new Alter_stmntContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_alter_stmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			alter_table();
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

	public static class Alter_tableContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(ParserParser.TABLE, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_tabContext alter_tab() {
			return getRuleContext(Alter_tabContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAlter_table(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alter_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(TABLE);
			setState(491);
			match(WS);
			setState(492);
			table_name();
			setState(493);
			match(WS);
			setState(494);
			alter_tab();
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

	public static class Alter_tabContext extends ParserRuleContext {
		public Rename_statementContext rename_statement() {
			return getRuleContext(Rename_statementContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Alter_tabContext alter_tab() {
			return getRuleContext(Alter_tabContext.class,0);
		}
		public Add_statementContext add_statement() {
			return getRuleContext(Add_statementContext.class,0);
		}
		public Drop_columnsContext drop_columns() {
			return getRuleContext(Drop_columnsContext.class,0);
		}
		public Alter_tabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAlter_tab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAlter_tab(this);
		}
	}

	public final Alter_tabContext alter_tab() throws RecognitionException {
		Alter_tabContext _localctx = new Alter_tabContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alter_tab);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				rename_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				rename_statement();
				setState(498);
				match(WS);
				setState(499);
				alter_tab();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				add_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				add_statement();
				setState(503);
				match(WS);
				setState(504);
				alter_tab();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				drop_columns();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(507);
				drop_columns();
				setState(508);
				match(WS);
				setState(509);
				alter_tab();
				}
				break;
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

	public static class Rename_statementContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(ParserParser.RENAME, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode TO() { return getToken(ParserParser.TO, 0); }
		public Rename_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterRename_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitRename_statement(this);
		}
	}

	public final Rename_statementContext rename_statement() throws RecognitionException {
		Rename_statementContext _localctx = new Rename_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_rename_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(RENAME);
			setState(514);
			match(WS);
			setState(515);
			column_name();
			setState(516);
			match(WS);
			setState(517);
			match(TO);
			setState(518);
			match(WS);
			setState(519);
			column_name();
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

	public static class Add_statementContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ParserParser.ADD, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Add_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAdd_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAdd_statement(this);
		}
	}

	public final Add_statementContext add_statement() throws RecognitionException {
		Add_statementContext _localctx = new Add_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_add_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ADD);
			setState(522);
			match(WS);
			setState(523);
			column_definition();
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

	public static class Drop_columnsContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ParserParser.DROP, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Drop_columnsContext drop_columns() {
			return getRuleContext(Drop_columnsContext.class,0);
		}
		public Drop_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDrop_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDrop_columns(this);
		}
	}

	public final Drop_columnsContext drop_columns() throws RecognitionException {
		Drop_columnsContext _localctx = new Drop_columnsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_drop_columns);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(DROP);
				setState(526);
				match(WS);
				setState(527);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(DROP);
				setState(529);
				match(WS);
				setState(530);
				column_name();
				setState(531);
				match(WS);
				setState(532);
				drop_columns();
				}
				break;
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

	public static class Drop_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ParserParser.DROP, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Drop_stmntContext drop_stmnt() {
			return getRuleContext(Drop_stmntContext.class,0);
		}
		public Drop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDrop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDrop_statement(this);
		}
	}

	public final Drop_statementContext drop_statement() throws RecognitionException {
		Drop_statementContext _localctx = new Drop_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_drop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(DROP);
			setState(537);
			match(WS);
			setState(538);
			drop_stmnt();
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

	public static class Drop_stmntContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(ParserParser.DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ParserParser.TABLE, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(ParserParser.VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(ParserParser.COLUMN, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Drop_stmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDrop_stmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDrop_stmnt(this);
		}
	}

	public final Drop_stmntContext drop_stmnt() throws RecognitionException {
		Drop_stmntContext _localctx = new Drop_stmntContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_drop_stmnt);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(DATABASE);
				setState(541);
				database_name();
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(TABLE);
				setState(543);
				match(WS);
				setState(544);
				table_name();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				match(VIEW);
				setState(546);
				match(WS);
				setState(547);
				view_name();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				match(COLUMN);
				setState(549);
				match(WS);
				setState(550);
				column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class View_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitView_name(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			name();
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

	public static class Aggregation_functionContext extends ParserRuleContext {
		public Aggregation_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAggregation_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAggregation_function(this);
		}
	}

	public final Aggregation_functionContext aggregation_function() throws RecognitionException {
		Aggregation_functionContext _localctx = new Aggregation_functionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_aggregation_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public Column_typeContext column_type() {
			return getRuleContext(Column_typeContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			column_name();
			setState(558);
			match(WS);
			setState(559);
			column_type();
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

	public static class Column_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Column_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterColumn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitColumn_type(this);
		}
	}

	public final Column_typeContext column_type() throws RecognitionException {
		Column_typeContext _localctx = new Column_typeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_column_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			type();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ParserParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(NAME);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BYTEINT() { return getToken(ParserParser.BYTEINT, 0); }
		public TerminalNode SMALLINT() { return getToken(ParserParser.SMALLINT, 0); }
		public TerminalNode INTEGER() { return getToken(ParserParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(ParserParser.BIGINT, 0); }
		public TerminalNode DECIMAL() { return getToken(ParserParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(ParserParser.NUMERIC, 0); }
		public TerminalNode FLOAT() { return getToken(ParserParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(ParserParser.CHAR, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(ParserParser.LEFT_BRACKET, 0); }
		public TerminalNode INT() { return getToken(ParserParser.INT, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(ParserParser.RIGHT_BRACKET, 0); }
		public TerminalNode VARCHAR() { return getToken(ParserParser.VARCHAR, 0); }
		public TerminalNode DATE() { return getToken(ParserParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ParserParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ParserParser.TIMESTAMP, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_type);
		try {
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(BYTEINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(SMALLINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				match(INTEGER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				match(BIGINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(569);
				match(DECIMAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(570);
				match(NUMERIC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(571);
				match(FLOAT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(572);
				match(CHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(573);
				match(CHAR);
				setState(574);
				match(LEFT_BRACKET);
				setState(575);
				match(INT);
				setState(576);
				match(RIGHT_BRACKET);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(577);
				match(VARCHAR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(578);
				match(VARCHAR);
				setState(579);
				match(LEFT_BRACKET);
				setState(580);
				match(INT);
				setState(581);
				match(RIGHT_BRACKET);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(582);
				match(DATE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(583);
				match(TIME);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(584);
				match(TIMESTAMP);
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ParserParser.NAME, 0); }
		public List<TerminalNode> APOSTROF() { return getTokens(ParserParser.APOSTROF); }
		public TerminalNode APOSTROF(int i) {
			return getToken(ParserParser.APOSTROF, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_value);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(NAME);
				}
				break;
			case APOSTROF:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(APOSTROF);
				setState(589);
				value();
				setState(590);
				match(APOSTROF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u0255\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0087\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a1\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u00ae\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c3\n\7\3\b\3\b\3\t\3\t\5\t\u00c9"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00d0\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\5\16\u00de\n\16\3\16\3\16\3\16\5\16\u00e3\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00eb\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0102\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0115\n\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012e\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0137\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u013e\n\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u0152\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u015a\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016e\n\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0180\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u018f\n!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u019c\n\"\3#\3#\3#\3#\3$\3$\5$\u01a4\n"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01b3\n&\3\'\3\'\3(\3(\3("+
		"\3(\3)\3)\5)\u01bd\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01db\n+\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\5-\u01e5\n-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5"+
		"\61\u0202\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0219\n\64\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u022a\n\66\3\67\3\67\38\38\39\39\39\39\3:\3:\3;\3;\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u024c\n<\3=\3=\3=\3"+
		"=\3=\5=\u0253\n=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\b\4\2\3\3##\3\2\t"+
		"\n\3\2>D\3\2\13\f\3\2,.\3\2!\"\2\u025b\2z\3\2\2\2\4\u0086\3\2\2\2\6\u008f"+
		"\3\2\2\2\b\u00a0\3\2\2\2\n\u00ad\3\2\2\2\f\u00c2\3\2\2\2\16\u00c4\3\2"+
		"\2\2\20\u00c8\3\2\2\2\22\u00cf\3\2\2\2\24\u00d1\3\2\2\2\26\u00d3\3\2\2"+
		"\2\30\u00d7\3\2\2\2\32\u00ea\3\2\2\2\34\u0101\3\2\2\2\36\u0103\3\2\2\2"+
		" \u0105\3\2\2\2\"\u0114\3\2\2\2$\u0116\3\2\2\2&\u011a\3\2\2\2(\u012d\3"+
		"\2\2\2*\u0136\3\2\2\2,\u013d\3\2\2\2.\u013f\3\2\2\2\60\u0151\3\2\2\2\62"+
		"\u0159\3\2\2\2\64\u015b\3\2\2\2\66\u016d\3\2\2\28\u016f\3\2\2\2:\u0173"+
		"\3\2\2\2<\u017f\3\2\2\2>\u0181\3\2\2\2@\u018e\3\2\2\2B\u019b\3\2\2\2D"+
		"\u019d\3\2\2\2F\u01a3\3\2\2\2H\u01a5\3\2\2\2J\u01b2\3\2\2\2L\u01b4\3\2"+
		"\2\2N\u01b6\3\2\2\2P\u01bc\3\2\2\2R\u01be\3\2\2\2T\u01da\3\2\2\2V\u01dc"+
		"\3\2\2\2X\u01e4\3\2\2\2Z\u01e6\3\2\2\2\\\u01ea\3\2\2\2^\u01ec\3\2\2\2"+
		"`\u0201\3\2\2\2b\u0203\3\2\2\2d\u020b\3\2\2\2f\u0218\3\2\2\2h\u021a\3"+
		"\2\2\2j\u0229\3\2\2\2l\u022b\3\2\2\2n\u022d\3\2\2\2p\u022f\3\2\2\2r\u0233"+
		"\3\2\2\2t\u0235\3\2\2\2v\u024b\3\2\2\2x\u0252\3\2\2\2z{\5\4\3\2{\3\3\2"+
		"\2\2|}\5\6\4\2}~\7M\2\2~\177\7G\2\2\177\u0087\3\2\2\2\u0080\u0081\5\6"+
		"\4\2\u0081\u0082\7M\2\2\u0082\u0083\7G\2\2\u0083\u0084\7M\2\2\u0084\u0085"+
		"\5\4\3\2\u0085\u0087\3\2\2\2\u0086|\3\2\2\2\u0086\u0080\3\2\2\2\u0087"+
		"\5\3\2\2\2\u0088\u0090\5\b\5\2\u0089\u0090\5\64\33\2\u008a\u0090\5> \2"+
		"\u008b\u0090\5D#\2\u008c\u0090\5N(\2\u008d\u0090\5Z.\2\u008e\u0090\5h"+
		"\65\2\u008f\u0088\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\7\3\2\2\2\u0091\u0092\t\2\2\2\u0092\u0093\7M\2\2\u0093\u0094"+
		"\5\f\7\2\u0094\u0095\7M\2\2\u0095\u0096\5\26\f\2\u0096\u00a1\3\2\2\2\u0097"+
		"\u0098\t\2\2\2\u0098\u0099\7M\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7M\2"+
		"\2\u009b\u009c\5\26\f\2\u009c\u009d\7M\2\2\u009d\u009e\5\n\6\2\u009e\u009f"+
		"\b\5\1\2\u009f\u00a1\3\2\2\2\u00a0\u0091\3\2\2\2\u00a0\u0097\3\2\2\2\u00a1"+
		"\t\3\2\2\2\u00a2\u00ae\5\30\r\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7M\2"+
		"\2\u00a5\u00a6\5&\24\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8\5\30\r\2\u00a8"+
		"\u00a9\7M\2\2\u00a9\u00aa\5\"\22\2\u00aa\u00ab\7M\2\2\u00ab\u00ac\5&\24"+
		"\2\u00ac\u00ae\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a7"+
		"\3\2\2\2\u00ae\13\3\2\2\2\u00af\u00b0\5\16\b\2\u00b0\u00b1\7M\2\2\u00b1"+
		"\u00b2\5\20\t\2\u00b2\u00c3\3\2\2\2\u00b3\u00b4\5\16\b\2\u00b4\u00b5\7"+
		"M\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00b7\7M\2\2\u00b7\u00b8\7H\2\2\u00b8"+
		"\u00b9\7M\2\2\u00b9\u00ba\5\f\7\2\u00ba\u00c3\3\2\2\2\u00bb\u00c3\5\20"+
		"\t\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7M\2\2\u00be\u00bf\7H\2\2\u00bf"+
		"\u00c0\7M\2\2\u00c0\u00c1\5\f\7\2\u00c1\u00c3\3\2\2\2\u00c2\u00af\3\2"+
		"\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c3"+
		"\r\3\2\2\2\u00c4\u00c5\t\3\2\2\u00c5\17\3\2\2\2\u00c6\u00c9\5n8\2\u00c7"+
		"\u00c9\5\22\n\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\21\3\2\2"+
		"\2\u00ca\u00d0\5\24\13\2\u00cb\u00cc\5.\30\2\u00cc\u00cd\7I\2\2\u00cd"+
		"\u00ce\5\24\13\2\u00ce\u00d0\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3"+
		"\2\2\2\u00d0\23\3\2\2\2\u00d1\u00d2\5t;\2\u00d2\25\3\2\2\2\u00d3\u00d4"+
		"\7\4\2\2\u00d4\u00d5\7M\2\2\u00d5\u00d6\5*\26\2\u00d6\27\3\2\2\2\u00d7"+
		"\u00d8\7\5\2\2\u00d8\u00d9\7M\2\2\u00d9\u00da\5\32\16\2\u00da\31\3\2\2"+
		"\2\u00db\u00dc\7\r\2\2\u00dc\u00de\7M\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00eb\5\34\17\2\u00e0\u00e1\7\r\2\2"+
		"\u00e1\u00e3\7M\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\5\34\17\2\u00e5\u00e6\7M\2\2\u00e6\u00e7\5 \21\2"+
		"\u00e7\u00e8\7M\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00eb\3\2\2\2\u00ea\u00dd"+
		"\3\2\2\2\u00ea\u00e2\3\2\2\2\u00eb\33\3\2\2\2\u00ec\u00ed\5\22\n\2\u00ed"+
		"\u00ee\5\36\20\2\u00ee\u00ef\5x=\2\u00ef\u0102\3\2\2\2\u00f0\u00f1\5\22"+
		"\n\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7M\2\2\u00f3\u00f4\5x=\2\u00f4"+
		"\u0102\3\2\2\2\u00f5\u00f6\5\22\n\2\u00f6\u00f7\7M\2\2\u00f7\u00f8\5\36"+
		"\20\2\u00f8\u00f9\5x=\2\u00f9\u0102\3\2\2\2\u00fa\u00fb\5\22\n\2\u00fb"+
		"\u00fc\7M\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\7M\2\2\u00fe\u00ff\5x"+
		"=\2\u00ff\u0102\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ec\3\2\2\2\u0101"+
		"\u00f0\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\35\3\2\2\2\u0103\u0104\t\4\2\2\u0104\37\3\2\2\2\u0105\u0106"+
		"\t\5\2\2\u0106!\3\2\2\2\u0107\u0108\7\6\2\2\u0108\u0109\7M\2\2\u0109\u010a"+
		"\7\32\2\2\u010a\u010b\7M\2\2\u010b\u010c\5\62\32\2\u010c\u010d\7M\2\2"+
		"\u010d\u010e\5$\23\2\u010e\u0115\3\2\2\2\u010f\u0110\7\6\2\2\u0110\u0111"+
		"\7M\2\2\u0111\u0112\7\32\2\2\u0112\u0113\7M\2\2\u0113\u0115\5\62\32\2"+
		"\u0114\u0107\3\2\2\2\u0114\u010f\3\2\2\2\u0115#\3\2\2\2\u0116\u0117\7"+
		"\7\2\2\u0117\u0118\7M\2\2\u0118\u0119\5\32\16\2\u0119%\3\2\2\2\u011a\u011b"+
		"\7\b\2\2\u011b\u011c\7M\2\2\u011c\u011d\7\32\2\2\u011d\u011e\7M\2\2\u011e"+
		"\u011f\5(\25\2\u011f\'\3\2\2\2\u0120\u0121\5\22\n\2\u0121\u0122\7M\2\2"+
		"\u0122\u0123\7\20\2\2\u0123\u012e\3\2\2\2\u0124\u0125\5\22\n\2\u0125\u0126"+
		"\7M\2\2\u0126\u0127\7\21\2\2\u0127\u012e\3\2\2\2\u0128\u0129\5\22\n\2"+
		"\u0129\u012a\7M\2\2\u012a\u012b\7H\2\2\u012b\u012c\5(\25\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0120\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0128\3\2\2\2\u012e"+
		")\3\2\2\2\u012f\u0137\5,\27\2\u0130\u0131\5,\27\2\u0131\u0132\7M\2\2\u0132"+
		"\u0133\5\60\31\2\u0133\u0134\7M\2\2\u0134\u0135\5*\26\2\u0135\u0137\3"+
		"\2\2\2\u0136\u012f\3\2\2\2\u0136\u0130\3\2\2\2\u0137+\3\2\2\2\u0138\u013e"+
		"\5.\30\2\u0139\u013a\7<\2\2\u013a\u013b\5\b\5\2\u013b\u013c\7=\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013e-\3\2\2\2"+
		"\u013f\u0140\5t;\2\u0140/\3\2\2\2\u0141\u0152\7H\2\2\u0142\u0152\7(\2"+
		"\2\u0143\u0144\7)\2\2\u0144\u0145\7M\2\2\u0145\u0152\7(\2\2\u0146\u0147"+
		"\7*\2\2\u0147\u0148\7M\2\2\u0148\u0152\7(\2\2\u0149\u014a\7+\2\2\u014a"+
		"\u014b\7M\2\2\u014b\u0152\7(\2\2\u014c\u014d\t\6\2\2\u014d\u014e\7M\2"+
		"\2\u014e\u014f\7/\2\2\u014f\u0150\7M\2\2\u0150\u0152\7(\2\2\u0151\u0141"+
		"\3\2\2\2\u0151\u0142\3\2\2\2\u0151\u0143\3\2\2\2\u0151\u0146\3\2\2\2\u0151"+
		"\u0149\3\2\2\2\u0151\u014c\3\2\2\2\u0152\61\3\2\2\2\u0153\u015a\5\22\n"+
		"\2\u0154\u0155\5\22\n\2\u0155\u0156\7M\2\2\u0156\u0157\7H\2\2\u0157\u0158"+
		"\5\62\32\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u0154\3\2\2\2"+
		"\u015a\63\3\2\2\2\u015b\u015c\7$\2\2\u015c\u015d\7M\2\2\u015d\u015e\7"+
		"%\2\2\u015e\u015f\7M\2\2\u015f\u0160\5.\30\2\u0160\u0161\7M\2\2\u0161"+
		"\u0162\5\66\34\2\u0162\65\3\2\2\2\u0163\u016e\5:\36\2\u0164\u016e\5\b"+
		"\5\2\u0165\u0166\58\35\2\u0166\u0167\7M\2\2\u0167\u0168\5:\36\2\u0168"+
		"\u016e\3\2\2\2\u0169\u016a\58\35\2\u016a\u016b\7M\2\2\u016b\u016c\5\b"+
		"\5\2\u016c\u016e\3\2\2\2\u016d\u0163\3\2\2\2\u016d\u0164\3\2\2\2\u016d"+
		"\u0165\3\2\2\2\u016d\u0169\3\2\2\2\u016e\67\3\2\2\2\u016f\u0170\7<\2\2"+
		"\u0170\u0171\5\62\32\2\u0171\u0172\7=\2\2\u01729\3\2\2\2\u0173\u0174\7"+
		"&\2\2\u0174\u0175\7M\2\2\u0175\u0176\7<\2\2\u0176\u0177\5<\37\2\u0177"+
		"\u0178\7=\2\2\u0178;\3\2\2\2\u0179\u0180\5x=\2\u017a\u017b\5x=\2\u017b"+
		"\u017c\7H\2\2\u017c\u017d\7M\2\2\u017d\u017e\5<\37\2\u017e\u0180\3\2\2"+
		"\2\u017f\u0179\3\2\2\2\u017f\u017a\3\2\2\2\u0180=\3\2\2\2\u0181\u0182"+
		"\7\'\2\2\u0182\u0183\7M\2\2\u0183\u0184\5.\30\2\u0184\u0185\7M\2\2\u0185"+
		"\u0186\7\31\2\2\u0186\u0187\7M\2\2\u0187\u0188\5@!\2\u0188?\3\2\2\2\u0189"+
		"\u018f\5B\"\2\u018a\u018b\5B\"\2\u018b\u018c\7M\2\2\u018c\u018d\5\30\r"+
		"\2\u018d\u018f\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018fA"+
		"\3\2\2\2\u0190\u0191\5\24\13\2\u0191\u0192\7>\2\2\u0192\u0193\5x=\2\u0193"+
		"\u019c\3\2\2\2\u0194\u0195\5\24\13\2\u0195\u0196\7>\2\2\u0196\u0197\5"+
		"x=\2\u0197\u0198\7H\2\2\u0198\u0199\7M\2\2\u0199\u019a\5B\"\2\u019a\u019c"+
		"\3\2\2\2\u019b\u0190\3\2\2\2\u019b\u0194\3\2\2\2\u019cC\3\2\2\2\u019d"+
		"\u019e\t\7\2\2\u019e\u019f\7M\2\2\u019f\u01a0\5F$\2\u01a0E\3\2\2\2\u01a1"+
		"\u01a4\5H%\2\u01a2\u01a4\5J&\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2"+
		"\u01a4G\3\2\2\2\u01a5\u01a6\7\24\2\2\u01a6\u01a7\7M\2\2\u01a7\u01a8\5"+
		"L\'\2\u01a8I\3\2\2\2\u01a9\u01aa\7\4\2\2\u01aa\u01ab\7M\2\2\u01ab\u01b3"+
		"\5.\30\2\u01ac\u01ad\7\4\2\2\u01ad\u01ae\7M\2\2\u01ae\u01af\5.\30\2\u01af"+
		"\u01b0\7M\2\2\u01b0\u01b1\5\30\r\2\u01b1\u01b3\3\2\2\2\u01b2\u01a9\3\2"+
		"\2\2\u01b2\u01ac\3\2\2\2\u01b3K\3\2\2\2\u01b4\u01b5\5t;\2\u01b5M\3\2\2"+
		"\2\u01b6\u01b7\7\22\2\2\u01b7\u01b8\7M\2\2\u01b8\u01b9\5P)\2\u01b9O\3"+
		"\2\2\2\u01ba\u01bd\5R*\2\u01bb\u01bd\5T+\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bdQ\3\2\2\2\u01be\u01bf\7\25\2\2\u01bf\u01c0\7M\2\2\u01c0"+
		"\u01c1\5.\30\2\u01c1\u01c2\7M\2\2\u01c2\u01c3\7<\2\2\u01c3\u01c4\7M\2"+
		"\2\u01c4\u01c5\5X-\2\u01c5\u01c6\7M\2\2\u01c6\u01c7\7=\2\2\u01c7S\3\2"+
		"\2\2\u01c8\u01c9\7\26\2\2\u01c9\u01ca\7M\2\2\u01ca\u01cb\5.\30\2\u01cb"+
		"\u01cc\7M\2\2\u01cc\u01cd\7 \2\2\u01cd\u01ce\7M\2\2\u01ce\u01cf\5\b\5"+
		"\2\u01cf\u01db\3\2\2\2\u01d0\u01d1\7\26\2\2\u01d1\u01d2\7M\2\2\u01d2\u01d3"+
		"\5.\30\2\u01d3\u01d4\7M\2\2\u01d4\u01d5\5V,\2\u01d5\u01d6\7M\2\2\u01d6"+
		"\u01d7\7 \2\2\u01d7\u01d8\7M\2\2\u01d8\u01d9\5\b\5\2\u01d9\u01db\3\2\2"+
		"\2\u01da\u01c8\3\2\2\2\u01da\u01d0\3\2\2\2\u01dbU\3\2\2\2\u01dc\u01dd"+
		"\5\62\32\2\u01ddW\3\2\2\2\u01de\u01e5\5p9\2\u01df\u01e0\5p9\2\u01e0\u01e1"+
		"\7H\2\2\u01e1\u01e2\7M\2\2\u01e2\u01e3\5X-\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01de\3\2\2\2\u01e4\u01df\3\2\2\2\u01e5Y\3\2\2\2\u01e6\u01e7\7\17\2\2"+
		"\u01e7\u01e8\7M\2\2\u01e8\u01e9\5\\/\2\u01e9[\3\2\2\2\u01ea\u01eb\5^\60"+
		"\2\u01eb]\3\2\2\2\u01ec\u01ed\7\25\2\2\u01ed\u01ee\7M\2\2\u01ee\u01ef"+
		"\5.\30\2\u01ef\u01f0\7M\2\2\u01f0\u01f1\5`\61\2\u01f1_\3\2\2\2\u01f2\u0202"+
		"\5b\62\2\u01f3\u01f4\5b\62\2\u01f4\u01f5\7M\2\2\u01f5\u01f6\5`\61\2\u01f6"+
		"\u0202\3\2\2\2\u01f7\u0202\5d\63\2\u01f8\u01f9\5d\63\2\u01f9\u01fa\7M"+
		"\2\2\u01fa\u01fb\5`\61\2\u01fb\u0202\3\2\2\2\u01fc\u0202\5f\64\2\u01fd"+
		"\u01fe\5f\64\2\u01fe\u01ff\7M\2\2\u01ff\u0200\5`\61\2\u0200\u0202\3\2"+
		"\2\2\u0201\u01f2\3\2\2\2\u0201\u01f3\3\2\2\2\u0201\u01f7\3\2\2\2\u0201"+
		"\u01f8\3\2\2\2\u0201\u01fc\3\2\2\2\u0201\u01fd\3\2\2\2\u0202a\3\2\2\2"+
		"\u0203\u0204\7\36\2\2\u0204\u0205\7M\2\2\u0205\u0206\5\24\13\2\u0206\u0207"+
		"\7M\2\2\u0207\u0208\7\37\2\2\u0208\u0209\7M\2\2\u0209\u020a\5\24\13\2"+
		"\u020ac\3\2\2\2\u020b\u020c\7\16\2\2\u020c\u020d\7M\2\2\u020d\u020e\5"+
		"p9\2\u020ee\3\2\2\2\u020f\u0210\7\30\2\2\u0210\u0211\7M\2\2\u0211\u0219"+
		"\5\24\13\2\u0212\u0213\7\30\2\2\u0213\u0214\7M\2\2\u0214\u0215\5\24\13"+
		"\2\u0215\u0216\7M\2\2\u0216\u0217\5f\64\2\u0217\u0219\3\2\2\2\u0218\u020f"+
		"\3\2\2\2\u0218\u0212\3\2\2\2\u0219g\3\2\2\2\u021a\u021b\7\30\2\2\u021b"+
		"\u021c\7M\2\2\u021c\u021d\5j\66\2\u021di\3\2\2\2\u021e\u021f\7\24\2\2"+
		"\u021f\u022a\5L\'\2\u0220\u0221\7\25\2\2\u0221\u0222\7M\2\2\u0222\u022a"+
		"\5.\30\2\u0223\u0224\7\26\2\2\u0224\u0225\7M\2\2\u0225\u022a\5l\67\2\u0226"+
		"\u0227\7\27\2\2\u0227\u0228\7M\2\2\u0228\u022a\5\24\13\2\u0229\u021e\3"+
		"\2\2\2\u0229\u0220\3\2\2\2\u0229\u0223\3\2\2\2\u0229\u0226\3\2\2\2\u022a"+
		"k\3\2\2\2\u022b\u022c\5t;\2\u022cm\3\2\2\2\u022d\u022e\3\2\2\2\u022eo"+
		"\3\2\2\2\u022f\u0230\5\24\13\2\u0230\u0231\7M\2\2\u0231\u0232\5r:\2\u0232"+
		"q\3\2\2\2\u0233\u0234\5v<\2\u0234s\3\2\2\2\u0235\u0236\7J\2\2\u0236u\3"+
		"\2\2\2\u0237\u024c\7\60\2\2\u0238\u024c\7\61\2\2\u0239\u024c\7\62\2\2"+
		"\u023a\u024c\7\63\2\2\u023b\u024c\7\64\2\2\u023c\u024c\7\65\2\2\u023d"+
		"\u024c\7\66\2\2\u023e\u024c\7\67\2\2\u023f\u0240\7\67\2\2\u0240\u0241"+
		"\7<\2\2\u0241\u0242\7L\2\2\u0242\u024c\7=\2\2\u0243\u024c\78\2\2\u0244"+
		"\u0245\78\2\2\u0245\u0246\7<\2\2\u0246\u0247\7L\2\2\u0247\u024c\7=\2\2"+
		"\u0248\u024c\79\2\2\u0249\u024c\7:\2\2\u024a\u024c\7;\2\2\u024b\u0237"+
		"\3\2\2\2\u024b\u0238\3\2\2\2\u024b\u0239\3\2\2\2\u024b\u023a\3\2\2\2\u024b"+
		"\u023b\3\2\2\2\u024b\u023c\3\2\2\2\u024b\u023d\3\2\2\2\u024b\u023e\3\2"+
		"\2\2\u024b\u023f\3\2\2\2\u024b\u0243\3\2\2\2\u024b\u0244\3\2\2\2\u024b"+
		"\u0248\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024cw\3\2\2\2"+
		"\u024d\u0253\7J\2\2\u024e\u024f\7F\2\2\u024f\u0250\5x=\2\u0250\u0251\7"+
		"F\2\2\u0251\u0253\3\2\2\2\u0252\u024d\3\2\2\2\u0252\u024e\3\2\2\2\u0253"+
		"y\3\2\2\2!\u0086\u008f\u00a0\u00ad\u00c2\u00c8\u00cf\u00dd\u00e2\u00ea"+
		"\u0101\u0114\u012d\u0136\u013d\u0151\u0159\u016d\u017f\u018e\u019b\u01a3"+
		"\u01b2\u01bc\u01da\u01e4\u0201\u0218\u0229\u024b\u0252";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}