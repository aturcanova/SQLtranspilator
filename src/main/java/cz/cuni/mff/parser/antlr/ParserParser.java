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
		INNER=41, FULL=42, RIGHT=43, LEFT=44, OUTER=45, COUNT=46, SUM=47, MAX=48, 
		MIN=49, AVG=50, BYTEINT=51, SMALLINT=52, INTEGER=53, BIGINT=54, DECIMAL=55, 
		NUMERIC=56, FLOAT=57, CHAR=58, VARCHAR=59, DATE=60, TIME=61, TIMESTAMP=62, 
		LEFT_BRACKET=63, RIGHT_BRACKET=64, EQUALITY=65, LT=66, LE=67, GT=68, GE=69, 
		NE=70, NEQL=71, QUOT_MARKS=72, APOSTROF=73, SEMICOLON=74, COMMA=75, DOT=76, 
		ASTERISK=77, NAME=78, TOKEN=79, INT=80, WS=81, ANY=82;
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
		RULE_aggregation_fnc = 55, RULE_agreggation_parameter = 56, RULE_column_definition = 57, 
		RULE_column_type = 58, RULE_name = 59, RULE_type = 60, RULE_value = 61;
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
		"drop_statement", "drop_stmnt", "view_name", "aggregation_function", "aggregation_fnc", 
		"agreggation_parameter", "column_definition", "column_type", "name", "type", 
		"value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'WHERE'", "'GROUP'", "'HAVING'", "'ORDER'", 
		"'DISTINCT'", "'ALL'", "'AND'", "'OR'", "'NOT'", "'ADD'", "'ALTER'", "'ASC'", 
		"'DESC'", "'CREATE'", "'SCHEMA'", "'DATABASE'", "'TABLE'", "'VIEW'", "'COLUMN'", 
		"'DROP'", "'SET'", "'BY'", "'PRIMARY'", "'KEY'", "'UNIQUE'", "'RENAME'", 
		"'TO'", "'AS'", "'DEL'", "'DELETE'", "'SEL'", "'INSERT'", "'INTO'", "'VALUES'", 
		"'UPDATE'", "'JOIN'", "'NATURAL'", "'CROSS'", "'INNER'", "'FULL'", "'RIGHT'", 
		"'LEFT'", "'OUTER'", "'COUNT'", "'SUM'", "'MAX'", "'MIN'", "'AVG'", "'BYTEINT'", 
		"'SMALLINT'", "'INTEGER'", "'BIGINT'", "'DECIMAL'", "'NUMERIC'", "'FLOAT'", 
		"'CHAR'", "'VARCHAR'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'('", "')'", 
		"'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'<>'", "'\"'", "'''", "';'", 
		"','", "'.'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "ORDER", "DISTINCT", 
		"ALL", "AND", "OR", "NOT", "ADD", "ALTER", "ASC", "DESC", "CREATE", "SCHEMA", 
		"DATABASE", "TABLE", "VIEW", "COLUMN", "DROP", "SET", "BY", "PRIMARY", 
		"KEY", "UNIQUE", "RENAME", "TO", "AS", "DEL", "DELETE", "SEL", "INSERT", 
		"INTO", "VALUES", "UPDATE", "JOIN", "NATURAL", "CROSS", "INNER", "FULL", 
		"RIGHT", "LEFT", "OUTER", "COUNT", "SUM", "MAX", "MIN", "AVG", "BYTEINT", 
		"SMALLINT", "INTEGER", "BIGINT", "DECIMAL", "NUMERIC", "FLOAT", "CHAR", 
		"VARCHAR", "DATE", "TIME", "TIMESTAMP", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"EQUALITY", "LT", "LE", "GT", "GE", "NE", "NEQL", "QUOT_MARKS", "APOSTROF", 
		"SEMICOLON", "COMMA", "DOT", "ASTERISK", "NAME", "TOKEN", "INT", "WS", 
		"ANY"
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
			setState(124);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				statement_type();
				setState(127);
				match(WS);
				setState(128);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				statement_type();
				setState(131);
				match(WS);
				setState(132);
				match(SEMICOLON);
				setState(133);
				match(WS);
				setState(134);
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
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case SEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				insert_into_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				update_statement();
				}
				break;
			case DEL:
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				delete_statement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				create_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				alter_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				match(WS);
				setState(149);
				select_parameters();
				setState(150);
				match(WS);
				setState(151);
				from_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				match(WS);
				setState(155);
				((Select_statementContext)_localctx).par = select_parameters();
				setState(156);
				match(WS);
				setState(157);
				from_statement();
				setState(158);
				match(WS);
				setState(159);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				where_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				where_statement();
				setState(166);
				match(WS);
				setState(167);
				order_by_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				where_statement();
				setState(170);
				match(WS);
				setState(171);
				group_by_statment();
				setState(172);
				match(WS);
				setState(173);
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
		public TerminalNode ASTERISK() { return getToken(ParserParser.ASTERISK, 0); }
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				select_distinct_all();
				setState(179);
				match(WS);
				setState(180);
				select_params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				select_distinct_all();
				setState(183);
				match(WS);
				setState(184);
				select_params();
				setState(185);
				match(WS);
				setState(186);
				match(COMMA);
				setState(187);
				match(WS);
				setState(188);
				select_parameters();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				select_params();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				select_params();
				setState(192);
				match(WS);
				setState(193);
				match(COMMA);
				setState(194);
				match(WS);
				setState(195);
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
			setState(199);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case SUM:
			case MAX:
			case MIN:
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				aggregation_function();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				table_name();
				setState(207);
				match(DOT);
				setState(208);
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
			setState(212);
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
			setState(214);
			match(FROM);
			setState(215);
			match(WS);
			setState(216);
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
			setState(218);
			match(WHERE);
			setState(219);
			match(WS);
			setState(220);
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(227);
					match(NOT);
					setState(228);
					match(WS);
					}
				}

				setState(231);
				condition();
				setState(232);
				match(WS);
				setState(233);
				logical_ops();
				setState(234);
				match(WS);
				setState(235);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				column();
				setState(240);
				equality_ops();
				setState(241);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				column();
				setState(244);
				equality_ops();
				setState(245);
				match(WS);
				setState(246);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				column();
				setState(249);
				match(WS);
				setState(250);
				equality_ops();
				setState(251);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				column();
				setState(254);
				match(WS);
				setState(255);
				equality_ops();
				setState(256);
				match(WS);
				setState(257);
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
			setState(262);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EQUALITY - 65)) | (1L << (LT - 65)) | (1L << (LE - 65)) | (1L << (GT - 65)) | (1L << (GE - 65)) | (1L << (NE - 65)) | (1L << (NEQL - 65)))) != 0)) ) {
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
			setState(264);
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(GROUP);
				setState(267);
				match(WS);
				setState(268);
				match(BY);
				setState(269);
				match(WS);
				setState(270);
				columns();
				setState(271);
				match(WS);
				setState(272);
				having_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(GROUP);
				setState(275);
				match(WS);
				setState(276);
				match(BY);
				setState(277);
				match(WS);
				setState(278);
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
			setState(281);
			match(HAVING);
			setState(282);
			match(WS);
			setState(283);
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
			setState(285);
			match(ORDER);
			setState(286);
			match(WS);
			setState(287);
			match(BY);
			setState(288);
			match(WS);
			setState(289);
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
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				column();
				setState(292);
				match(WS);
				setState(293);
				match(ASC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				column();
				setState(296);
				match(WS);
				setState(297);
				match(DESC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				column();
				setState(300);
				match(WS);
				setState(301);
				match(COMMA);
				setState(302);
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
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				table();
				setState(308);
				match(WS);
				setState(309);
				join();
				setState(310);
				match(WS);
				setState(311);
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
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				table_name();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(LEFT_BRACKET);
				setState(317);
				select_statement();
				setState(318);
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
			setState(322);
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
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(COMMA);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(JOIN);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(NATURAL);
				setState(327);
				match(WS);
				setState(328);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				match(CROSS);
				setState(330);
				match(WS);
				setState(331);
				match(JOIN);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				match(INNER);
				setState(333);
				match(WS);
				setState(334);
				match(JOIN);
				}
				break;
			case FULL:
			case RIGHT:
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << RIGHT) | (1L << LEFT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				match(WS);
				setState(337);
				match(OUTER);
				setState(338);
				match(WS);
				setState(339);
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
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				column();
				setState(344);
				match(WS);
				setState(345);
				match(COMMA);
				setState(346);
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
			setState(350);
			match(INSERT);
			setState(351);
			match(WS);
			setState(352);
			match(INTO);
			setState(353);
			match(WS);
			setState(354);
			table_name();
			setState(355);
			match(WS);
			setState(356);
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
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				instert_values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				select_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				insert_columns();
				setState(361);
				match(WS);
				setState(362);
				instert_values();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				insert_columns();
				setState(365);
				match(WS);
				setState(366);
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
			setState(370);
			match(LEFT_BRACKET);
			setState(371);
			columns();
			setState(372);
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
			setState(374);
			match(VALUES);
			setState(375);
			match(WS);
			setState(376);
			match(LEFT_BRACKET);
			setState(377);
			values();
			setState(378);
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
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				value();
				setState(382);
				match(COMMA);
				setState(383);
				match(WS);
				setState(384);
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
			setState(388);
			match(UPDATE);
			setState(389);
			match(WS);
			setState(390);
			table_name();
			setState(391);
			match(WS);
			setState(392);
			match(SET);
			setState(393);
			match(WS);
			setState(394);
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
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				update_columns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				update_columns();
				setState(398);
				match(WS);
				setState(399);
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
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				column_name();
				setState(404);
				match(EQUALITY);
				setState(405);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				column_name();
				setState(408);
				match(EQUALITY);
				setState(409);
				value();
				setState(410);
				match(COMMA);
				setState(411);
				match(WS);
				setState(412);
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
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==DEL || _la==DELETE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(417);
			match(WS);
			setState(418);
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
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				delete_database();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
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
			setState(424);
			match(DATABASE);
			setState(425);
			match(WS);
			setState(426);
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
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(FROM);
				setState(429);
				match(WS);
				setState(430);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(FROM);
				setState(432);
				match(WS);
				setState(433);
				table_name();
				setState(434);
				match(WS);
				setState(435);
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
			setState(439);
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
			setState(441);
			match(CREATE);
			setState(442);
			match(WS);
			setState(443);
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
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				create_table();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
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
			setState(449);
			match(TABLE);
			setState(450);
			match(WS);
			setState(451);
			table_name();
			setState(452);
			match(WS);
			setState(453);
			match(LEFT_BRACKET);
			setState(454);
			match(WS);
			setState(455);
			columns_definition();
			setState(456);
			match(WS);
			setState(457);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(VIEW);
				setState(460);
				match(WS);
				setState(461);
				table_name();
				setState(462);
				match(WS);
				setState(463);
				match(AS);
				setState(464);
				match(WS);
				setState(465);
				select_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(VIEW);
				setState(468);
				match(WS);
				setState(469);
				table_name();
				setState(470);
				match(WS);
				setState(471);
				create_view_columns();
				setState(472);
				match(WS);
				setState(473);
				match(AS);
				setState(474);
				match(WS);
				setState(475);
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
			setState(479);
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
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				column_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				column_definition();
				setState(483);
				match(COMMA);
				setState(484);
				match(WS);
				setState(485);
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
			setState(489);
			match(ALTER);
			setState(490);
			match(WS);
			setState(491);
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
			setState(493);
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
			setState(495);
			match(TABLE);
			setState(496);
			match(WS);
			setState(497);
			table_name();
			setState(498);
			match(WS);
			setState(499);
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
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				rename_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				rename_statement();
				setState(503);
				match(WS);
				setState(504);
				alter_tab();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				add_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				add_statement();
				setState(508);
				match(WS);
				setState(509);
				alter_tab();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
				drop_columns();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(512);
				drop_columns();
				setState(513);
				match(WS);
				setState(514);
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
			setState(518);
			match(RENAME);
			setState(519);
			match(WS);
			setState(520);
			column_name();
			setState(521);
			match(WS);
			setState(522);
			match(TO);
			setState(523);
			match(WS);
			setState(524);
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
			setState(526);
			match(ADD);
			setState(527);
			match(WS);
			setState(528);
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
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(DROP);
				setState(531);
				match(WS);
				setState(532);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(DROP);
				setState(534);
				match(WS);
				setState(535);
				column_name();
				setState(536);
				match(WS);
				setState(537);
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
			setState(541);
			match(DROP);
			setState(542);
			match(WS);
			setState(543);
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
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(DATABASE);
				setState(546);
				database_name();
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(TABLE);
				setState(548);
				match(WS);
				setState(549);
				table_name();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				match(VIEW);
				setState(551);
				match(WS);
				setState(552);
				view_name();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 4);
				{
				setState(553);
				match(COLUMN);
				setState(554);
				match(WS);
				setState(555);
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
			setState(558);
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
		public TerminalNode COUNT() { return getToken(ParserParser.COUNT, 0); }
		public Aggregation_fncContext aggregation_fnc() {
			return getRuleContext(Aggregation_fncContext.class,0);
		}
		public TerminalNode SUM() { return getToken(ParserParser.SUM, 0); }
		public TerminalNode MAX() { return getToken(ParserParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(ParserParser.MIN, 0); }
		public TerminalNode AVG() { return getToken(ParserParser.AVG, 0); }
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
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(COUNT);
				setState(561);
				aggregation_fnc();
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(SUM);
				setState(563);
				aggregation_fnc();
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				match(MAX);
				setState(565);
				aggregation_fnc();
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(566);
				match(MIN);
				setState(567);
				aggregation_fnc();
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 5);
				{
				setState(568);
				match(AVG);
				setState(569);
				aggregation_fnc();
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

	public static class Aggregation_fncContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(ParserParser.LEFT_BRACKET, 0); }
		public Agreggation_parameterContext agreggation_parameter() {
			return getRuleContext(Agreggation_parameterContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ParserParser.RIGHT_BRACKET, 0); }
		public Aggregation_fncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_fnc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAggregation_fnc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAggregation_fnc(this);
		}
	}

	public final Aggregation_fncContext aggregation_fnc() throws RecognitionException {
		Aggregation_fncContext _localctx = new Aggregation_fncContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_aggregation_fnc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(LEFT_BRACKET);
			setState(573);
			agreggation_parameter();
			setState(574);
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

	public static class Agreggation_parameterContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(ParserParser.ASTERISK, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public Agreggation_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agreggation_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAgreggation_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAgreggation_parameter(this);
		}
	}

	public final Agreggation_parameterContext agreggation_parameter() throws RecognitionException {
		Agreggation_parameterContext _localctx = new Agreggation_parameterContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_agreggation_parameter);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				match(ASTERISK);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
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
		enterRule(_localctx, 114, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			column_name();
			setState(581);
			match(WS);
			setState(582);
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
		enterRule(_localctx, 116, RULE_column_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
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
		enterRule(_localctx, 118, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
		enterRule(_localctx, 120, RULE_type);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(BYTEINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(SMALLINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				match(INTEGER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(BIGINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				match(DECIMAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
				match(NUMERIC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(594);
				match(FLOAT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(595);
				match(CHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(596);
				match(CHAR);
				setState(597);
				match(LEFT_BRACKET);
				setState(598);
				match(INT);
				setState(599);
				match(RIGHT_BRACKET);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(600);
				match(VARCHAR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(601);
				match(VARCHAR);
				setState(602);
				match(LEFT_BRACKET);
				setState(603);
				match(INT);
				setState(604);
				match(RIGHT_BRACKET);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(605);
				match(DATE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(606);
				match(TIME);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(607);
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
		enterRule(_localctx, 122, RULE_value);
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(NAME);
				}
				break;
			case APOSTROF:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(APOSTROF);
				setState(612);
				value();
				setState(613);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u026c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u008b"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0094\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a5\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b2\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c8\n\7\3\b\3\b"+
		"\3\t\3\t\5\t\u00ce\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00d5\n\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00e3\n\16\3\16\3\16\3\16"+
		"\5\16\u00e8\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f0\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u0107\n\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011a"+
		"\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0133\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013c\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0143\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0157\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u015f\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0173\n\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0185\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0194\n!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01a1\n\"\3#\3#\3#\3#\3"+
		"$\3$\5$\u01a9\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01b8\n&\3"+
		"\'\3\'\3(\3(\3(\3(\3)\3)\5)\u01c2\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01e0\n+\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\5-\u01ea\n-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u0207\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u021e\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u022f\n\66\3\67\3\67\38\38\38\38\38\38\38\38\38\3"+
		"8\58\u023d\n8\39\39\39\39\3:\3:\5:\u0245\n:\3;\3;\3;\3;\3<\3<\3=\3=\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0263\n"+
		">\3?\3?\3?\3?\3?\5?\u026a\n?\3?\2\2@\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\b\4"+
		"\2\3\3##\3\2\t\n\3\2CI\3\2\13\f\3\2,.\3\2!\"\2\u0276\2~\3\2\2\2\4\u008a"+
		"\3\2\2\2\6\u0093\3\2\2\2\b\u00a4\3\2\2\2\n\u00b1\3\2\2\2\f\u00c7\3\2\2"+
		"\2\16\u00c9\3\2\2\2\20\u00cd\3\2\2\2\22\u00d4\3\2\2\2\24\u00d6\3\2\2\2"+
		"\26\u00d8\3\2\2\2\30\u00dc\3\2\2\2\32\u00ef\3\2\2\2\34\u0106\3\2\2\2\36"+
		"\u0108\3\2\2\2 \u010a\3\2\2\2\"\u0119\3\2\2\2$\u011b\3\2\2\2&\u011f\3"+
		"\2\2\2(\u0132\3\2\2\2*\u013b\3\2\2\2,\u0142\3\2\2\2.\u0144\3\2\2\2\60"+
		"\u0156\3\2\2\2\62\u015e\3\2\2\2\64\u0160\3\2\2\2\66\u0172\3\2\2\28\u0174"+
		"\3\2\2\2:\u0178\3\2\2\2<\u0184\3\2\2\2>\u0186\3\2\2\2@\u0193\3\2\2\2B"+
		"\u01a0\3\2\2\2D\u01a2\3\2\2\2F\u01a8\3\2\2\2H\u01aa\3\2\2\2J\u01b7\3\2"+
		"\2\2L\u01b9\3\2\2\2N\u01bb\3\2\2\2P\u01c1\3\2\2\2R\u01c3\3\2\2\2T\u01df"+
		"\3\2\2\2V\u01e1\3\2\2\2X\u01e9\3\2\2\2Z\u01eb\3\2\2\2\\\u01ef\3\2\2\2"+
		"^\u01f1\3\2\2\2`\u0206\3\2\2\2b\u0208\3\2\2\2d\u0210\3\2\2\2f\u021d\3"+
		"\2\2\2h\u021f\3\2\2\2j\u022e\3\2\2\2l\u0230\3\2\2\2n\u023c\3\2\2\2p\u023e"+
		"\3\2\2\2r\u0244\3\2\2\2t\u0246\3\2\2\2v\u024a\3\2\2\2x\u024c\3\2\2\2z"+
		"\u0262\3\2\2\2|\u0269\3\2\2\2~\177\5\4\3\2\177\3\3\2\2\2\u0080\u0081\5"+
		"\6\4\2\u0081\u0082\7S\2\2\u0082\u0083\7L\2\2\u0083\u008b\3\2\2\2\u0084"+
		"\u0085\5\6\4\2\u0085\u0086\7S\2\2\u0086\u0087\7L\2\2\u0087\u0088\7S\2"+
		"\2\u0088\u0089\5\4\3\2\u0089\u008b\3\2\2\2\u008a\u0080\3\2\2\2\u008a\u0084"+
		"\3\2\2\2\u008b\5\3\2\2\2\u008c\u0094\5\b\5\2\u008d\u0094\5\64\33\2\u008e"+
		"\u0094\5> \2\u008f\u0094\5D#\2\u0090\u0094\5N(\2\u0091\u0094\5Z.\2\u0092"+
		"\u0094\5h\65\2\u0093\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2"+
		"\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\7\3\2\2\2\u0095\u0096\t\2\2\2\u0096\u0097\7S\2\2"+
		"\u0097\u0098\5\f\7\2\u0098\u0099\7S\2\2\u0099\u009a\5\26\f\2\u009a\u00a5"+
		"\3\2\2\2\u009b\u009c\t\2\2\2\u009c\u009d\7S\2\2\u009d\u009e\5\f\7\2\u009e"+
		"\u009f\7S\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\7S\2\2\u00a1\u00a2\5\n"+
		"\6\2\u00a2\u00a3\b\5\1\2\u00a3\u00a5\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4"+
		"\u009b\3\2\2\2\u00a5\t\3\2\2\2\u00a6\u00b2\5\30\r\2\u00a7\u00a8\5\30\r"+
		"\2\u00a8\u00a9\7S\2\2\u00a9\u00aa\5&\24\2\u00aa\u00b2\3\2\2\2\u00ab\u00ac"+
		"\5\30\r\2\u00ac\u00ad\7S\2\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\7S\2\2\u00af"+
		"\u00b0\5&\24\2\u00b0\u00b2\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00a7\3\2"+
		"\2\2\u00b1\u00ab\3\2\2\2\u00b2\13\3\2\2\2\u00b3\u00c8\7O\2\2\u00b4\u00b5"+
		"\5\16\b\2\u00b5\u00b6\7S\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00c8\3\2\2\2"+
		"\u00b8\u00b9\5\16\b\2\u00b9\u00ba\7S\2\2\u00ba\u00bb\5\20\t\2\u00bb\u00bc"+
		"\7S\2\2\u00bc\u00bd\7M\2\2\u00bd\u00be\7S\2\2\u00be\u00bf\5\f\7\2\u00bf"+
		"\u00c8\3\2\2\2\u00c0\u00c8\5\20\t\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7"+
		"S\2\2\u00c3\u00c4\7M\2\2\u00c4\u00c5\7S\2\2\u00c5\u00c6\5\f\7\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00b3\3\2\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00b8\3\2"+
		"\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8\r\3\2\2\2\u00c9\u00ca"+
		"\t\3\2\2\u00ca\17\3\2\2\2\u00cb\u00ce\5n8\2\u00cc\u00ce\5\22\n\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\21\3\2\2\2\u00cf\u00d5\5\24\13"+
		"\2\u00d0\u00d1\5.\30\2\u00d1\u00d2\7N\2\2\u00d2\u00d3\5\24\13\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\23\3\2\2"+
		"\2\u00d6\u00d7\5x=\2\u00d7\25\3\2\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00da"+
		"\7S\2\2\u00da\u00db\5*\26\2\u00db\27\3\2\2\2\u00dc\u00dd\7\5\2\2\u00dd"+
		"\u00de\7S\2\2\u00de\u00df\5\32\16\2\u00df\31\3\2\2\2\u00e0\u00e1\7\r\2"+
		"\2\u00e1\u00e3\7S\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00f0\5\34\17\2\u00e5\u00e6\7\r\2\2\u00e6\u00e8\7S\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\5\34\17\2\u00ea\u00eb\7S\2\2\u00eb\u00ec\5 \21\2\u00ec\u00ed\7S\2\2\u00ed"+
		"\u00ee\5\32\16\2\u00ee\u00f0\3\2\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e7\3"+
		"\2\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\5\22\n\2\u00f2\u00f3\5\36\20\2\u00f3"+
		"\u00f4\5|?\2\u00f4\u0107\3\2\2\2\u00f5\u00f6\5\22\n\2\u00f6\u00f7\5\36"+
		"\20\2\u00f7\u00f8\7S\2\2\u00f8\u00f9\5|?\2\u00f9\u0107\3\2\2\2\u00fa\u00fb"+
		"\5\22\n\2\u00fb\u00fc\7S\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\5|?\2\u00fe"+
		"\u0107\3\2\2\2\u00ff\u0100\5\22\n\2\u0100\u0101\7S\2\2\u0101\u0102\5\36"+
		"\20\2\u0102\u0103\7S\2\2\u0103\u0104\5|?\2\u0104\u0107\3\2\2\2\u0105\u0107"+
		"\3\2\2\2\u0106\u00f1\3\2\2\2\u0106\u00f5\3\2\2\2\u0106\u00fa\3\2\2\2\u0106"+
		"\u00ff\3\2\2\2\u0106\u0105\3\2\2\2\u0107\35\3\2\2\2\u0108\u0109\t\4\2"+
		"\2\u0109\37\3\2\2\2\u010a\u010b\t\5\2\2\u010b!\3\2\2\2\u010c\u010d\7\6"+
		"\2\2\u010d\u010e\7S\2\2\u010e\u010f\7\32\2\2\u010f\u0110\7S\2\2\u0110"+
		"\u0111\5\62\32\2\u0111\u0112\7S\2\2\u0112\u0113\5$\23\2\u0113\u011a\3"+
		"\2\2\2\u0114\u0115\7\6\2\2\u0115\u0116\7S\2\2\u0116\u0117\7\32\2\2\u0117"+
		"\u0118\7S\2\2\u0118\u011a\5\62\32\2\u0119\u010c\3\2\2\2\u0119\u0114\3"+
		"\2\2\2\u011a#\3\2\2\2\u011b\u011c\7\7\2\2\u011c\u011d\7S\2\2\u011d\u011e"+
		"\5\32\16\2\u011e%\3\2\2\2\u011f\u0120\7\b\2\2\u0120\u0121\7S\2\2\u0121"+
		"\u0122\7\32\2\2\u0122\u0123\7S\2\2\u0123\u0124\5(\25\2\u0124\'\3\2\2\2"+
		"\u0125\u0126\5\22\n\2\u0126\u0127\7S\2\2\u0127\u0128\7\20\2\2\u0128\u0133"+
		"\3\2\2\2\u0129\u012a\5\22\n\2\u012a\u012b\7S\2\2\u012b\u012c\7\21\2\2"+
		"\u012c\u0133\3\2\2\2\u012d\u012e\5\22\n\2\u012e\u012f\7S\2\2\u012f\u0130"+
		"\7M\2\2\u0130\u0131\5(\25\2\u0131\u0133\3\2\2\2\u0132\u0125\3\2\2\2\u0132"+
		"\u0129\3\2\2\2\u0132\u012d\3\2\2\2\u0133)\3\2\2\2\u0134\u013c\5,\27\2"+
		"\u0135\u0136\5,\27\2\u0136\u0137\7S\2\2\u0137\u0138\5\60\31\2\u0138\u0139"+
		"\7S\2\2\u0139\u013a\5*\26\2\u013a\u013c\3\2\2\2\u013b\u0134\3\2\2\2\u013b"+
		"\u0135\3\2\2\2\u013c+\3\2\2\2\u013d\u0143\5.\30\2\u013e\u013f\7A\2\2\u013f"+
		"\u0140\5\b\5\2\u0140\u0141\7B\2\2\u0141\u0143\3\2\2\2\u0142\u013d\3\2"+
		"\2\2\u0142\u013e\3\2\2\2\u0143-\3\2\2\2\u0144\u0145\5x=\2\u0145/\3\2\2"+
		"\2\u0146\u0157\7M\2\2\u0147\u0157\7(\2\2\u0148\u0149\7)\2\2\u0149\u014a"+
		"\7S\2\2\u014a\u0157\7(\2\2\u014b\u014c\7*\2\2\u014c\u014d\7S\2\2\u014d"+
		"\u0157\7(\2\2\u014e\u014f\7+\2\2\u014f\u0150\7S\2\2\u0150\u0157\7(\2\2"+
		"\u0151\u0152\t\6\2\2\u0152\u0153\7S\2\2\u0153\u0154\7/\2\2\u0154\u0155"+
		"\7S\2\2\u0155\u0157\7(\2\2\u0156\u0146\3\2\2\2\u0156\u0147\3\2\2\2\u0156"+
		"\u0148\3\2\2\2\u0156\u014b\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0151\3\2"+
		"\2\2\u0157\61\3\2\2\2\u0158\u015f\5\22\n\2\u0159\u015a\5\22\n\2\u015a"+
		"\u015b\7S\2\2\u015b\u015c\7M\2\2\u015c\u015d\5\62\32\2\u015d\u015f\3\2"+
		"\2\2\u015e\u0158\3\2\2\2\u015e\u0159\3\2\2\2\u015f\63\3\2\2\2\u0160\u0161"+
		"\7$\2\2\u0161\u0162\7S\2\2\u0162\u0163\7%\2\2\u0163\u0164\7S\2\2\u0164"+
		"\u0165\5.\30\2\u0165\u0166\7S\2\2\u0166\u0167\5\66\34\2\u0167\65\3\2\2"+
		"\2\u0168\u0173\5:\36\2\u0169\u0173\5\b\5\2\u016a\u016b\58\35\2\u016b\u016c"+
		"\7S\2\2\u016c\u016d\5:\36\2\u016d\u0173\3\2\2\2\u016e\u016f\58\35\2\u016f"+
		"\u0170\7S\2\2\u0170\u0171\5\b\5\2\u0171\u0173\3\2\2\2\u0172\u0168\3\2"+
		"\2\2\u0172\u0169\3\2\2\2\u0172\u016a\3\2\2\2\u0172\u016e\3\2\2\2\u0173"+
		"\67\3\2\2\2\u0174\u0175\7A\2\2\u0175\u0176\5\62\32\2\u0176\u0177\7B\2"+
		"\2\u01779\3\2\2\2\u0178\u0179\7&\2\2\u0179\u017a\7S\2\2\u017a\u017b\7"+
		"A\2\2\u017b\u017c\5<\37\2\u017c\u017d\7B\2\2\u017d;\3\2\2\2\u017e\u0185"+
		"\5|?\2\u017f\u0180\5|?\2\u0180\u0181\7M\2\2\u0181\u0182\7S\2\2\u0182\u0183"+
		"\5<\37\2\u0183\u0185\3\2\2\2\u0184\u017e\3\2\2\2\u0184\u017f\3\2\2\2\u0185"+
		"=\3\2\2\2\u0186\u0187\7\'\2\2\u0187\u0188\7S\2\2\u0188\u0189\5.\30\2\u0189"+
		"\u018a\7S\2\2\u018a\u018b\7\31\2\2\u018b\u018c\7S\2\2\u018c\u018d\5@!"+
		"\2\u018d?\3\2\2\2\u018e\u0194\5B\"\2\u018f\u0190\5B\"\2\u0190\u0191\7"+
		"S\2\2\u0191\u0192\5\30\r\2\u0192\u0194\3\2\2\2\u0193\u018e\3\2\2\2\u0193"+
		"\u018f\3\2\2\2\u0194A\3\2\2\2\u0195\u0196\5\24\13\2\u0196\u0197\7C\2\2"+
		"\u0197\u0198\5|?\2\u0198\u01a1\3\2\2\2\u0199\u019a\5\24\13\2\u019a\u019b"+
		"\7C\2\2\u019b\u019c\5|?\2\u019c\u019d\7M\2\2\u019d\u019e\7S\2\2\u019e"+
		"\u019f\5B\"\2\u019f\u01a1\3\2\2\2\u01a0\u0195\3\2\2\2\u01a0\u0199\3\2"+
		"\2\2\u01a1C\3\2\2\2\u01a2\u01a3\t\7\2\2\u01a3\u01a4\7S\2\2\u01a4\u01a5"+
		"\5F$\2\u01a5E\3\2\2\2\u01a6\u01a9\5H%\2\u01a7\u01a9\5J&\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9G\3\2\2\2\u01aa\u01ab\7\24\2\2\u01ab"+
		"\u01ac\7S\2\2\u01ac\u01ad\5L\'\2\u01adI\3\2\2\2\u01ae\u01af\7\4\2\2\u01af"+
		"\u01b0\7S\2\2\u01b0\u01b8\5.\30\2\u01b1\u01b2\7\4\2\2\u01b2\u01b3\7S\2"+
		"\2\u01b3\u01b4\5.\30\2\u01b4\u01b5\7S\2\2\u01b5\u01b6\5\30\r\2\u01b6\u01b8"+
		"\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b8K\3\2\2\2\u01b9"+
		"\u01ba\5x=\2\u01baM\3\2\2\2\u01bb\u01bc\7\22\2\2\u01bc\u01bd\7S\2\2\u01bd"+
		"\u01be\5P)\2\u01beO\3\2\2\2\u01bf\u01c2\5R*\2\u01c0\u01c2\5T+\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2Q\3\2\2\2\u01c3\u01c4\7\25\2\2"+
		"\u01c4\u01c5\7S\2\2\u01c5\u01c6\5.\30\2\u01c6\u01c7\7S\2\2\u01c7\u01c8"+
		"\7A\2\2\u01c8\u01c9\7S\2\2\u01c9\u01ca\5X-\2\u01ca\u01cb\7S\2\2\u01cb"+
		"\u01cc\7B\2\2\u01ccS\3\2\2\2\u01cd\u01ce\7\26\2\2\u01ce\u01cf\7S\2\2\u01cf"+
		"\u01d0\5.\30\2\u01d0\u01d1\7S\2\2\u01d1\u01d2\7 \2\2\u01d2\u01d3\7S\2"+
		"\2\u01d3\u01d4\5\b\5\2\u01d4\u01e0\3\2\2\2\u01d5\u01d6\7\26\2\2\u01d6"+
		"\u01d7\7S\2\2\u01d7\u01d8\5.\30\2\u01d8\u01d9\7S\2\2\u01d9\u01da\5V,\2"+
		"\u01da\u01db\7S\2\2\u01db\u01dc\7 \2\2\u01dc\u01dd\7S\2\2\u01dd\u01de"+
		"\5\b\5\2\u01de\u01e0\3\2\2\2\u01df\u01cd\3\2\2\2\u01df\u01d5\3\2\2\2\u01e0"+
		"U\3\2\2\2\u01e1\u01e2\5\62\32\2\u01e2W\3\2\2\2\u01e3\u01ea\5t;\2\u01e4"+
		"\u01e5\5t;\2\u01e5\u01e6\7M\2\2\u01e6\u01e7\7S\2\2\u01e7\u01e8\5X-\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01e3\3\2\2\2\u01e9\u01e4\3\2\2\2\u01eaY\3\2\2\2"+
		"\u01eb\u01ec\7\17\2\2\u01ec\u01ed\7S\2\2\u01ed\u01ee\5\\/\2\u01ee[\3\2"+
		"\2\2\u01ef\u01f0\5^\60\2\u01f0]\3\2\2\2\u01f1\u01f2\7\25\2\2\u01f2\u01f3"+
		"\7S\2\2\u01f3\u01f4\5.\30\2\u01f4\u01f5\7S\2\2\u01f5\u01f6\5`\61\2\u01f6"+
		"_\3\2\2\2\u01f7\u0207\5b\62\2\u01f8\u01f9\5b\62\2\u01f9\u01fa\7S\2\2\u01fa"+
		"\u01fb\5`\61\2\u01fb\u0207\3\2\2\2\u01fc\u0207\5d\63\2\u01fd\u01fe\5d"+
		"\63\2\u01fe\u01ff\7S\2\2\u01ff\u0200\5`\61\2\u0200\u0207\3\2\2\2\u0201"+
		"\u0207\5f\64\2\u0202\u0203\5f\64\2\u0203\u0204\7S\2\2\u0204\u0205\5`\61"+
		"\2\u0205\u0207\3\2\2\2\u0206\u01f7\3\2\2\2\u0206\u01f8\3\2\2\2\u0206\u01fc"+
		"\3\2\2\2\u0206\u01fd\3\2\2\2\u0206\u0201\3\2\2\2\u0206\u0202\3\2\2\2\u0207"+
		"a\3\2\2\2\u0208\u0209\7\36\2\2\u0209\u020a\7S\2\2\u020a\u020b\5\24\13"+
		"\2\u020b\u020c\7S\2\2\u020c\u020d\7\37\2\2\u020d\u020e\7S\2\2\u020e\u020f"+
		"\5\24\13\2\u020fc\3\2\2\2\u0210\u0211\7\16\2\2\u0211\u0212\7S\2\2\u0212"+
		"\u0213\5t;\2\u0213e\3\2\2\2\u0214\u0215\7\30\2\2\u0215\u0216\7S\2\2\u0216"+
		"\u021e\5\24\13\2\u0217\u0218\7\30\2\2\u0218\u0219\7S\2\2\u0219\u021a\5"+
		"\24\13\2\u021a\u021b\7S\2\2\u021b\u021c\5f\64\2\u021c\u021e\3\2\2\2\u021d"+
		"\u0214\3\2\2\2\u021d\u0217\3\2\2\2\u021eg\3\2\2\2\u021f\u0220\7\30\2\2"+
		"\u0220\u0221\7S\2\2\u0221\u0222\5j\66\2\u0222i\3\2\2\2\u0223\u0224\7\24"+
		"\2\2\u0224\u022f\5L\'\2\u0225\u0226\7\25\2\2\u0226\u0227\7S\2\2\u0227"+
		"\u022f\5.\30\2\u0228\u0229\7\26\2\2\u0229\u022a\7S\2\2\u022a\u022f\5l"+
		"\67\2\u022b\u022c\7\27\2\2\u022c\u022d\7S\2\2\u022d\u022f\5\24\13\2\u022e"+
		"\u0223\3\2\2\2\u022e\u0225\3\2\2\2\u022e\u0228\3\2\2\2\u022e\u022b\3\2"+
		"\2\2\u022fk\3\2\2\2\u0230\u0231\5x=\2\u0231m\3\2\2\2\u0232\u0233\7\60"+
		"\2\2\u0233\u023d\5p9\2\u0234\u0235\7\61\2\2\u0235\u023d\5p9\2\u0236\u0237"+
		"\7\62\2\2\u0237\u023d\5p9\2\u0238\u0239\7\63\2\2\u0239\u023d\5p9\2\u023a"+
		"\u023b\7\64\2\2\u023b\u023d\5p9\2\u023c\u0232\3\2\2\2\u023c\u0234\3\2"+
		"\2\2\u023c\u0236\3\2\2\2\u023c\u0238\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"o\3\2\2\2\u023e\u023f\7A\2\2\u023f\u0240\5r:\2\u0240\u0241\7B\2\2\u0241"+
		"q\3\2\2\2\u0242\u0245\7O\2\2\u0243\u0245\5\22\n\2\u0244\u0242\3\2\2\2"+
		"\u0244\u0243\3\2\2\2\u0245s\3\2\2\2\u0246\u0247\5\24\13\2\u0247\u0248"+
		"\7S\2\2\u0248\u0249\5v<\2\u0249u\3\2\2\2\u024a\u024b\5z>\2\u024bw\3\2"+
		"\2\2\u024c\u024d\7P\2\2\u024dy\3\2\2\2\u024e\u0263\7\65\2\2\u024f\u0263"+
		"\7\66\2\2\u0250\u0263\7\67\2\2\u0251\u0263\78\2\2\u0252\u0263\79\2\2\u0253"+
		"\u0263\7:\2\2\u0254\u0263\7;\2\2\u0255\u0263\7<\2\2\u0256\u0257\7<\2\2"+
		"\u0257\u0258\7A\2\2\u0258\u0259\7R\2\2\u0259\u0263\7B\2\2\u025a\u0263"+
		"\7=\2\2\u025b\u025c\7=\2\2\u025c\u025d\7A\2\2\u025d\u025e\7R\2\2\u025e"+
		"\u0263\7B\2\2\u025f\u0263\7>\2\2\u0260\u0263\7?\2\2\u0261\u0263\7@\2\2"+
		"\u0262\u024e\3\2\2\2\u0262\u024f\3\2\2\2\u0262\u0250\3\2\2\2\u0262\u0251"+
		"\3\2\2\2\u0262\u0252\3\2\2\2\u0262\u0253\3\2\2\2\u0262\u0254\3\2\2\2\u0262"+
		"\u0255\3\2\2\2\u0262\u0256\3\2\2\2\u0262\u025a\3\2\2\2\u0262\u025b\3\2"+
		"\2\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263"+
		"{\3\2\2\2\u0264\u026a\7P\2\2\u0265\u0266\7K\2\2\u0266\u0267\5|?\2\u0267"+
		"\u0268\7K\2\2\u0268\u026a\3\2\2\2\u0269\u0264\3\2\2\2\u0269\u0265\3\2"+
		"\2\2\u026a}\3\2\2\2#\u008a\u0093\u00a4\u00b1\u00c7\u00cd\u00d4\u00e2\u00e7"+
		"\u00ef\u0106\u0119\u0132\u013b\u0142\u0156\u015e\u0172\u0184\u0193\u01a0"+
		"\u01a8\u01b7\u01c1\u01df\u01e9\u0206\u021d\u022e\u023c\u0244\u0262\u0269";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}