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
		QUOT_MARKS=61, APOSTROF=62, SEMICOLON=63, COMMA=64, DOT=65, NAME=66, WS=67, 
		TOKEN=68, INT=69, ANY=70;
	public static final int
		RULE_main = 0, RULE_statement = 1, RULE_statement_type = 2, RULE_select_statement = 3, 
		RULE_select_stmnt = 4, RULE_select_parameters = 5, RULE_select_distinct_all = 6, 
		RULE_select_params = 7, RULE_column = 8, RULE_column_name = 9, RULE_from_statement = 10, 
		RULE_where_statement = 11, RULE_conditions = 12, RULE_logical_ops = 13, 
		RULE_group_by_statment = 14, RULE_having_statement = 15, RULE_order_by_statement = 16, 
		RULE_columns_sorted = 17, RULE_tables = 18, RULE_table = 19, RULE_table_name = 20, 
		RULE_join = 21, RULE_columns = 22, RULE_insert_into_statement = 23, RULE_insert_into_stmnt = 24, 
		RULE_insert_columns = 25, RULE_instert_values = 26, RULE_values = 27, 
		RULE_update_statement = 28, RULE_update_stmnt = 29, RULE_update_columns = 30, 
		RULE_delete_statement = 31, RULE_delete_stmnt = 32, RULE_delete_database = 33, 
		RULE_delete_from = 34, RULE_database_name = 35, RULE_create_statement = 36, 
		RULE_create_stmnt = 37, RULE_create_table = 38, RULE_create_view = 39, 
		RULE_create_view_columns = 40, RULE_columns_definition = 41, RULE_alter_statement = 42, 
		RULE_alter_stmnt = 43, RULE_alter_table = 44, RULE_alter_tab = 45, RULE_rename_statement = 46, 
		RULE_add_statement = 47, RULE_drop_columns = 48, RULE_drop_statement = 49, 
		RULE_drop_stmnt = 50, RULE_view_name = 51, RULE_column_definition = 52, 
		RULE_column_type = 53, RULE_name = 54, RULE_type = 55, RULE_value = 56;
	public static final String[] ruleNames = {
		"main", "statement", "statement_type", "select_statement", "select_stmnt", 
		"select_parameters", "select_distinct_all", "select_params", "column", 
		"column_name", "from_statement", "where_statement", "conditions", "logical_ops", 
		"group_by_statment", "having_statement", "order_by_statement", "columns_sorted", 
		"tables", "table", "table_name", "join", "columns", "insert_into_statement", 
		"insert_into_stmnt", "insert_columns", "instert_values", "values", "update_statement", 
		"update_stmnt", "update_columns", "delete_statement", "delete_stmnt", 
		"delete_database", "delete_from", "database_name", "create_statement", 
		"create_stmnt", "create_table", "create_view", "create_view_columns", 
		"columns_definition", "alter_statement", "alter_stmnt", "alter_table", 
		"alter_tab", "rename_statement", "add_statement", "drop_columns", "drop_statement", 
		"drop_stmnt", "view_name", "column_definition", "column_type", "name", 
		"type", "value"
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
		"'TIME'", "'TIMESTAMP'", "'('", "')'", "'='", "'\"'", "'''", "';'", "','", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "ORDER", "DISTINCT", 
		"ALL", "AND", "OR", "NOT", "ADD", "ALTER", "ASC", "DESC", "CREATE", "SCHEMA", 
		"DATABASE", "TABLE", "VIEW", "COLUMN", "DROP", "SET", "BY", "PRIMARY", 
		"KEY", "UNIQUE", "RENAME", "TO", "AS", "DEL", "DELETE", "SEL", "INSERT", 
		"INTO", "VALUES", "UPDATE", "JOIN", "NATURAL", "CROSS", "INNER", "FULL", 
		"RIGHT", "LEFT", "OUTER", "BYTEINT", "SMALLINT", "INTEGER", "BIGINT", 
		"DECIMAL", "NUMERIC", "FLOAT", "CHAR", "VARCHAR", "DATE", "TIME", "TIMESTAMP", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "EQUALITY", "QUOT_MARKS", "APOSTROF", 
		"SEMICOLON", "COMMA", "DOT", "NAME", "WS", "TOKEN", "INT", "ANY"
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
			setState(114);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				statement_type();
				setState(117);
				match(WS);
				setState(118);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				statement_type();
				setState(121);
				match(WS);
				setState(122);
				match(SEMICOLON);
				setState(123);
				match(WS);
				setState(124);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case SEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				insert_into_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				update_statement();
				}
				break;
			case DEL:
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				delete_statement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				create_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				alter_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				match(WS);
				setState(139);
				select_parameters();
				setState(140);
				match(WS);
				setState(141);
				from_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				((Select_statementContext)_localctx).par = select_parameters();
				setState(146);
				match(WS);
				setState(147);
				from_statement();
				setState(148);
				match(WS);
				setState(149);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				where_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				where_statement();
				setState(156);
				match(WS);
				setState(157);
				order_by_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				where_statement();
				setState(160);
				match(WS);
				setState(161);
				group_by_statment();
				setState(162);
				match(WS);
				setState(163);
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
		public Select_paramsContext select_params() {
			return getRuleContext(Select_paramsContext.class,0);
		}
		public Select_distinct_allContext select_distinct_all() {
			return getRuleContext(Select_distinct_allContext.class,0);
		}
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				select_params();
				}
				break;
			case DISTINCT:
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				select_distinct_all();
				setState(169);
				match(WS);
				setState(170);
				select_params();
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
			setState(174);
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
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public Select_paramsContext select_params() {
			return getRuleContext(Select_paramsContext.class,0);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				column();
				setState(178);
				match(WS);
				setState(179);
				match(COMMA);
				setState(180);
				match(WS);
				setState(181);
				select_params();
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				table_name();
				setState(187);
				match(DOT);
				setState(188);
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
			setState(192);
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
			setState(194);
			match(FROM);
			setState(195);
			match(WS);
			setState(196);
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
			setState(198);
			match(WHERE);
			setState(199);
			match(WS);
			setState(200);
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
		public TerminalNode TOKEN() { return getToken(ParserParser.TOKEN, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(TOKEN);
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
		enterRule(_localctx, 26, RULE_logical_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 28, RULE_group_by_statment);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(GROUP);
				setState(207);
				match(WS);
				setState(208);
				match(BY);
				setState(209);
				match(WS);
				setState(210);
				columns();
				setState(211);
				match(WS);
				setState(212);
				having_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(GROUP);
				setState(215);
				match(WS);
				setState(216);
				match(BY);
				setState(217);
				match(WS);
				setState(218);
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
		enterRule(_localctx, 30, RULE_having_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(HAVING);
			setState(222);
			match(WS);
			setState(223);
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
		enterRule(_localctx, 32, RULE_order_by_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ORDER);
			setState(226);
			match(WS);
			setState(227);
			match(BY);
			setState(228);
			match(WS);
			setState(229);
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
		enterRule(_localctx, 34, RULE_columns_sorted);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				column();
				setState(232);
				match(WS);
				setState(233);
				match(ASC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				column();
				setState(236);
				match(WS);
				setState(237);
				match(DESC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				column();
				setState(240);
				match(WS);
				setState(241);
				match(COMMA);
				setState(242);
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
		enterRule(_localctx, 36, RULE_tables);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				table();
				setState(248);
				match(WS);
				setState(249);
				join();
				setState(250);
				match(WS);
				setState(251);
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
		enterRule(_localctx, 38, RULE_table);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				table_name();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(LEFT_BRACKET);
				setState(257);
				select_statement();
				setState(258);
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
		enterRule(_localctx, 40, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		enterRule(_localctx, 42, RULE_join);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(COMMA);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(JOIN);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(NATURAL);
				setState(267);
				match(WS);
				setState(268);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(CROSS);
				setState(270);
				match(WS);
				setState(271);
				match(JOIN);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(INNER);
				setState(273);
				match(WS);
				setState(274);
				match(JOIN);
				}
				break;
			case FULL:
			case RIGHT:
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FULL) | (1L << RIGHT) | (1L << LEFT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(276);
				match(WS);
				setState(277);
				match(OUTER);
				setState(278);
				match(WS);
				setState(279);
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
		enterRule(_localctx, 44, RULE_columns);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				column();
				setState(284);
				match(WS);
				setState(285);
				match(COMMA);
				setState(286);
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
		enterRule(_localctx, 46, RULE_insert_into_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(INSERT);
			setState(291);
			match(WS);
			setState(292);
			match(INTO);
			setState(293);
			match(WS);
			setState(294);
			table_name();
			setState(295);
			match(WS);
			setState(296);
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
		enterRule(_localctx, 48, RULE_insert_into_stmnt);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				instert_values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				select_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				insert_columns();
				setState(301);
				match(WS);
				setState(302);
				instert_values();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				insert_columns();
				setState(305);
				match(WS);
				setState(306);
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
		enterRule(_localctx, 50, RULE_insert_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(LEFT_BRACKET);
			setState(311);
			columns();
			setState(312);
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
		enterRule(_localctx, 52, RULE_instert_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(VALUES);
			setState(315);
			match(WS);
			setState(316);
			match(LEFT_BRACKET);
			setState(317);
			values();
			setState(318);
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
		enterRule(_localctx, 54, RULE_values);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				value();
				setState(322);
				match(COMMA);
				setState(323);
				match(WS);
				setState(324);
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
		enterRule(_localctx, 56, RULE_update_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(UPDATE);
			setState(329);
			match(WS);
			setState(330);
			table_name();
			setState(331);
			match(WS);
			setState(332);
			match(SET);
			setState(333);
			match(WS);
			setState(334);
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
		enterRule(_localctx, 58, RULE_update_stmnt);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				update_columns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				update_columns();
				setState(338);
				match(WS);
				setState(339);
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
		enterRule(_localctx, 60, RULE_update_columns);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				column_name();
				setState(344);
				match(EQUALITY);
				setState(345);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				column_name();
				setState(348);
				match(EQUALITY);
				setState(349);
				value();
				setState(350);
				match(COMMA);
				setState(351);
				match(WS);
				setState(352);
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
		enterRule(_localctx, 62, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==DEL || _la==DELETE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(357);
			match(WS);
			setState(358);
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
		enterRule(_localctx, 64, RULE_delete_stmnt);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				delete_database();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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
		enterRule(_localctx, 66, RULE_delete_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(DATABASE);
			setState(365);
			match(WS);
			setState(366);
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
		enterRule(_localctx, 68, RULE_delete_from);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(FROM);
				setState(369);
				match(WS);
				setState(370);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(FROM);
				setState(372);
				match(WS);
				setState(373);
				table_name();
				setState(374);
				match(WS);
				setState(375);
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
		enterRule(_localctx, 70, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		enterRule(_localctx, 72, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(CREATE);
			setState(382);
			match(WS);
			setState(383);
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
		enterRule(_localctx, 74, RULE_create_stmnt);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				create_table();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
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
		enterRule(_localctx, 76, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(TABLE);
			setState(390);
			match(WS);
			setState(391);
			table_name();
			setState(392);
			match(WS);
			setState(393);
			match(LEFT_BRACKET);
			setState(394);
			match(WS);
			setState(395);
			columns_definition();
			setState(396);
			match(WS);
			setState(397);
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
		enterRule(_localctx, 78, RULE_create_view);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(VIEW);
				setState(400);
				match(WS);
				setState(401);
				table_name();
				setState(402);
				match(WS);
				setState(403);
				match(AS);
				setState(404);
				match(WS);
				setState(405);
				select_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(VIEW);
				setState(408);
				match(WS);
				setState(409);
				table_name();
				setState(410);
				match(WS);
				setState(411);
				create_view_columns();
				setState(412);
				match(WS);
				setState(413);
				match(AS);
				setState(414);
				match(WS);
				setState(415);
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
		enterRule(_localctx, 80, RULE_create_view_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		enterRule(_localctx, 82, RULE_columns_definition);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				column_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				column_definition();
				setState(423);
				match(COMMA);
				setState(424);
				match(WS);
				setState(425);
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
		enterRule(_localctx, 84, RULE_alter_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(ALTER);
			setState(430);
			match(WS);
			setState(431);
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
		enterRule(_localctx, 86, RULE_alter_stmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 88, RULE_alter_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(TABLE);
			setState(436);
			match(WS);
			setState(437);
			table_name();
			setState(438);
			match(WS);
			setState(439);
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
		enterRule(_localctx, 90, RULE_alter_tab);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				rename_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				rename_statement();
				setState(443);
				match(WS);
				setState(444);
				alter_tab();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				add_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				add_statement();
				setState(448);
				match(WS);
				setState(449);
				alter_tab();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				drop_columns();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				drop_columns();
				setState(453);
				match(WS);
				setState(454);
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
		enterRule(_localctx, 92, RULE_rename_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(RENAME);
			setState(459);
			match(WS);
			setState(460);
			column_name();
			setState(461);
			match(WS);
			setState(462);
			match(TO);
			setState(463);
			match(WS);
			setState(464);
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
		enterRule(_localctx, 94, RULE_add_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(ADD);
			setState(467);
			match(WS);
			setState(468);
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
		enterRule(_localctx, 96, RULE_drop_columns);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(DROP);
				setState(471);
				match(WS);
				setState(472);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(DROP);
				setState(474);
				match(WS);
				setState(475);
				column_name();
				setState(476);
				match(WS);
				setState(477);
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
		enterRule(_localctx, 98, RULE_drop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(DROP);
			setState(482);
			match(WS);
			setState(483);
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
		enterRule(_localctx, 100, RULE_drop_stmnt);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(DATABASE);
				setState(486);
				database_name();
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(TABLE);
				setState(488);
				match(WS);
				setState(489);
				table_name();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(VIEW);
				setState(491);
				match(WS);
				setState(492);
				view_name();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(COLUMN);
				setState(494);
				match(WS);
				setState(495);
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
		enterRule(_localctx, 102, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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
		enterRule(_localctx, 104, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			column_name();
			setState(501);
			match(WS);
			setState(502);
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
		enterRule(_localctx, 106, RULE_column_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		enterRule(_localctx, 108, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		enterRule(_localctx, 110, RULE_type);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(BYTEINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(SMALLINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(INTEGER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(BIGINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(512);
				match(DECIMAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
				match(NUMERIC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(514);
				match(FLOAT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(515);
				match(CHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(516);
				match(CHAR);
				setState(517);
				match(LEFT_BRACKET);
				setState(518);
				match(INT);
				setState(519);
				match(RIGHT_BRACKET);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(520);
				match(VARCHAR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(521);
				match(VARCHAR);
				setState(522);
				match(LEFT_BRACKET);
				setState(523);
				match(INT);
				setState(524);
				match(RIGHT_BRACKET);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(525);
				match(DATE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(526);
				match(TIME);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(527);
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
		public List<TerminalNode> APOSTROF() { return getTokens(ParserParser.APOSTROF); }
		public TerminalNode APOSTROF(int i) {
			return getToken(ParserParser.APOSTROF, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> ANY() { return getTokens(ParserParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(ParserParser.ANY, i);
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
		enterRule(_localctx, 112, RULE_value);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APOSTROF:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(APOSTROF);
				setState(531);
				value();
				setState(532);
				match(APOSTROF);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(535); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(534);
					match(ANY);
					}
					}
					setState(537); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ANY );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0220\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0081\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u008a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u009b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a8"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00af\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c1\n\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f7\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0100\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0107\n\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u011b\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0123\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0137\n\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0149\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0158\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0165\n \3!\3!\3!\3!\3"+
		"\"\3\"\5\"\u016d\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u017c\n"+
		"$\3%\3%\3&\3&\3&\3&\3\'\3\'\5\'\u0186\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01a4\n)\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\5+\u01ae\n+\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01cb\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u01e2\n\62\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01f3\n\64\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\59\u0213\n9\3:\3:\3:\3:\3:\6:\u021a\n:\r:"+
		"\16:\u021b\5:\u021e\n:\3:\2\2;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\7\4\2\3\3##\3\2"+
		"\t\n\3\2\13\f\3\2,.\3\2!\"\2\u0221\2t\3\2\2\2\4\u0080\3\2\2\2\6\u0089"+
		"\3\2\2\2\b\u009a\3\2\2\2\n\u00a7\3\2\2\2\f\u00ae\3\2\2\2\16\u00b0\3\2"+
		"\2\2\20\u00b9\3\2\2\2\22\u00c0\3\2\2\2\24\u00c2\3\2\2\2\26\u00c4\3\2\2"+
		"\2\30\u00c8\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2\2\2\36\u00dd\3\2\2\2"+
		" \u00df\3\2\2\2\"\u00e3\3\2\2\2$\u00f6\3\2\2\2&\u00ff\3\2\2\2(\u0106\3"+
		"\2\2\2*\u0108\3\2\2\2,\u011a\3\2\2\2.\u0122\3\2\2\2\60\u0124\3\2\2\2\62"+
		"\u0136\3\2\2\2\64\u0138\3\2\2\2\66\u013c\3\2\2\28\u0148\3\2\2\2:\u014a"+
		"\3\2\2\2<\u0157\3\2\2\2>\u0164\3\2\2\2@\u0166\3\2\2\2B\u016c\3\2\2\2D"+
		"\u016e\3\2\2\2F\u017b\3\2\2\2H\u017d\3\2\2\2J\u017f\3\2\2\2L\u0185\3\2"+
		"\2\2N\u0187\3\2\2\2P\u01a3\3\2\2\2R\u01a5\3\2\2\2T\u01ad\3\2\2\2V\u01af"+
		"\3\2\2\2X\u01b3\3\2\2\2Z\u01b5\3\2\2\2\\\u01ca\3\2\2\2^\u01cc\3\2\2\2"+
		"`\u01d4\3\2\2\2b\u01e1\3\2\2\2d\u01e3\3\2\2\2f\u01f2\3\2\2\2h\u01f4\3"+
		"\2\2\2j\u01f6\3\2\2\2l\u01fa\3\2\2\2n\u01fc\3\2\2\2p\u0212\3\2\2\2r\u021d"+
		"\3\2\2\2tu\5\4\3\2u\3\3\2\2\2vw\5\6\4\2wx\7E\2\2xy\7A\2\2y\u0081\3\2\2"+
		"\2z{\5\6\4\2{|\7E\2\2|}\7A\2\2}~\7E\2\2~\177\5\4\3\2\177\u0081\3\2\2\2"+
		"\u0080v\3\2\2\2\u0080z\3\2\2\2\u0081\5\3\2\2\2\u0082\u008a\5\b\5\2\u0083"+
		"\u008a\5\60\31\2\u0084\u008a\5:\36\2\u0085\u008a\5@!\2\u0086\u008a\5J"+
		"&\2\u0087\u008a\5V,\2\u0088\u008a\5d\63\2\u0089\u0082\3\2\2\2\u0089\u0083"+
		"\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\7\3\2\2\2\u008b\u008c\t\2\2\2"+
		"\u008c\u008d\7E\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7E\2\2\u008f\u0090"+
		"\5\26\f\2\u0090\u009b\3\2\2\2\u0091\u0092\t\2\2\2\u0092\u0093\7E\2\2\u0093"+
		"\u0094\5\f\7\2\u0094\u0095\7E\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7E"+
		"\2\2\u0097\u0098\5\n\6\2\u0098\u0099\b\5\1\2\u0099\u009b\3\2\2\2\u009a"+
		"\u008b\3\2\2\2\u009a\u0091\3\2\2\2\u009b\t\3\2\2\2\u009c\u00a8\5\30\r"+
		"\2\u009d\u009e\5\30\r\2\u009e\u009f\7E\2\2\u009f\u00a0\5\"\22\2\u00a0"+
		"\u00a8\3\2\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\7E\2\2\u00a3\u00a4\5\36"+
		"\20\2\u00a4\u00a5\7E\2\2\u00a5\u00a6\5\"\22\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u009c\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8\13\3\2\2"+
		"\2\u00a9\u00af\5\20\t\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\7E\2\2\u00ac"+
		"\u00ad\5\20\t\2\u00ad\u00af\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3"+
		"\2\2\2\u00af\r\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1\17\3\2\2\2\u00b2\u00ba"+
		"\5\22\n\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7E\2\2\u00b5\u00b6\7B\2\2\u00b6"+
		"\u00b7\7E\2\2\u00b7\u00b8\5\20\t\2\u00b8\u00ba\3\2\2\2\u00b9\u00b2\3\2"+
		"\2\2\u00b9\u00b3\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00c1\5\24\13\2\u00bc"+
		"\u00bd\5*\26\2\u00bd\u00be\7C\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c1\3"+
		"\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\23\3\2\2\2\u00c2"+
		"\u00c3\5n8\2\u00c3\25\3\2\2\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6\7E\2\2\u00c6"+
		"\u00c7\5&\24\2\u00c7\27\3\2\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\7E\2\2"+
		"\u00ca\u00cb\5\32\16\2\u00cb\31\3\2\2\2\u00cc\u00cd\7F\2\2\u00cd\33\3"+
		"\2\2\2\u00ce\u00cf\t\4\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1"+
		"\u00d2\7E\2\2\u00d2\u00d3\7\32\2\2\u00d3\u00d4\7E\2\2\u00d4\u00d5\5.\30"+
		"\2\u00d5\u00d6\7E\2\2\u00d6\u00d7\5 \21\2\u00d7\u00de\3\2\2\2\u00d8\u00d9"+
		"\7\6\2\2\u00d9\u00da\7E\2\2\u00da\u00db\7\32\2\2\u00db\u00dc\7E\2\2\u00dc"+
		"\u00de\5.\30\2\u00dd\u00d0\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de\37\3\2\2"+
		"\2\u00df\u00e0\7\7\2\2\u00e0\u00e1\7E\2\2\u00e1\u00e2\5\32\16\2\u00e2"+
		"!\3\2\2\2\u00e3\u00e4\7\b\2\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7\32\2\2"+
		"\u00e6\u00e7\7E\2\2\u00e7\u00e8\5$\23\2\u00e8#\3\2\2\2\u00e9\u00ea\5\22"+
		"\n\2\u00ea\u00eb\7E\2\2\u00eb\u00ec\7\20\2\2\u00ec\u00f7\3\2\2\2\u00ed"+
		"\u00ee\5\22\n\2\u00ee\u00ef\7E\2\2\u00ef\u00f0\7\21\2\2\u00f0\u00f7\3"+
		"\2\2\2\u00f1\u00f2\5\22\n\2\u00f2\u00f3\7E\2\2\u00f3\u00f4\7B\2\2\u00f4"+
		"\u00f5\5$\23\2\u00f5\u00f7\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ed\3\2"+
		"\2\2\u00f6\u00f1\3\2\2\2\u00f7%\3\2\2\2\u00f8\u0100\5(\25\2\u00f9\u00fa"+
		"\5(\25\2\u00fa\u00fb\7E\2\2\u00fb\u00fc\5,\27\2\u00fc\u00fd\7E\2\2\u00fd"+
		"\u00fe\5&\24\2\u00fe\u0100\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00f9\3\2"+
		"\2\2\u0100\'\3\2\2\2\u0101\u0107\5*\26\2\u0102\u0103\7<\2\2\u0103\u0104"+
		"\5\b\5\2\u0104\u0105\7=\2\2\u0105\u0107\3\2\2\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0107)\3\2\2\2\u0108\u0109\5n8\2\u0109+\3\2\2\2\u010a\u011b"+
		"\7B\2\2\u010b\u011b\7(\2\2\u010c\u010d\7)\2\2\u010d\u010e\7E\2\2\u010e"+
		"\u011b\7(\2\2\u010f\u0110\7*\2\2\u0110\u0111\7E\2\2\u0111\u011b\7(\2\2"+
		"\u0112\u0113\7+\2\2\u0113\u0114\7E\2\2\u0114\u011b\7(\2\2\u0115\u0116"+
		"\t\5\2\2\u0116\u0117\7E\2\2\u0117\u0118\7/\2\2\u0118\u0119\7E\2\2\u0119"+
		"\u011b\7(\2\2\u011a\u010a\3\2\2\2\u011a\u010b\3\2\2\2\u011a\u010c\3\2"+
		"\2\2\u011a\u010f\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0115\3\2\2\2\u011b"+
		"-\3\2\2\2\u011c\u0123\5\22\n\2\u011d\u011e\5\22\n\2\u011e\u011f\7E\2\2"+
		"\u011f\u0120\7B\2\2\u0120\u0121\5.\30\2\u0121\u0123\3\2\2\2\u0122\u011c"+
		"\3\2\2\2\u0122\u011d\3\2\2\2\u0123/\3\2\2\2\u0124\u0125\7$\2\2\u0125\u0126"+
		"\7E\2\2\u0126\u0127\7%\2\2\u0127\u0128\7E\2\2\u0128\u0129\5*\26\2\u0129"+
		"\u012a\7E\2\2\u012a\u012b\5\62\32\2\u012b\61\3\2\2\2\u012c\u0137\5\66"+
		"\34\2\u012d\u0137\5\b\5\2\u012e\u012f\5\64\33\2\u012f\u0130\7E\2\2\u0130"+
		"\u0131\5\66\34\2\u0131\u0137\3\2\2\2\u0132\u0133\5\64\33\2\u0133\u0134"+
		"\7E\2\2\u0134\u0135\5\b\5\2\u0135\u0137\3\2\2\2\u0136\u012c\3\2\2\2\u0136"+
		"\u012d\3\2\2\2\u0136\u012e\3\2\2\2\u0136\u0132\3\2\2\2\u0137\63\3\2\2"+
		"\2\u0138\u0139\7<\2\2\u0139\u013a\5.\30\2\u013a\u013b\7=\2\2\u013b\65"+
		"\3\2\2\2\u013c\u013d\7&\2\2\u013d\u013e\7E\2\2\u013e\u013f\7<\2\2\u013f"+
		"\u0140\58\35\2\u0140\u0141\7=\2\2\u0141\67\3\2\2\2\u0142\u0149\5r:\2\u0143"+
		"\u0144\5r:\2\u0144\u0145\7B\2\2\u0145\u0146\7E\2\2\u0146\u0147\58\35\2"+
		"\u0147\u0149\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u01499\3"+
		"\2\2\2\u014a\u014b\7\'\2\2\u014b\u014c\7E\2\2\u014c\u014d\5*\26\2\u014d"+
		"\u014e\7E\2\2\u014e\u014f\7\31\2\2\u014f\u0150\7E\2\2\u0150\u0151\5<\37"+
		"\2\u0151;\3\2\2\2\u0152\u0158\5> \2\u0153\u0154\5> \2\u0154\u0155\7E\2"+
		"\2\u0155\u0156\5\30\r\2\u0156\u0158\3\2\2\2\u0157\u0152\3\2\2\2\u0157"+
		"\u0153\3\2\2\2\u0158=\3\2\2\2\u0159\u015a\5\24\13\2\u015a\u015b\7>\2\2"+
		"\u015b\u015c\5r:\2\u015c\u0165\3\2\2\2\u015d\u015e\5\24\13\2\u015e\u015f"+
		"\7>\2\2\u015f\u0160\5r:\2\u0160\u0161\7B\2\2\u0161\u0162\7E\2\2\u0162"+
		"\u0163\5> \2\u0163\u0165\3\2\2\2\u0164\u0159\3\2\2\2\u0164\u015d\3\2\2"+
		"\2\u0165?\3\2\2\2\u0166\u0167\t\6\2\2\u0167\u0168\7E\2\2\u0168\u0169\5"+
		"B\"\2\u0169A\3\2\2\2\u016a\u016d\5D#\2\u016b\u016d\5F$\2\u016c\u016a\3"+
		"\2\2\2\u016c\u016b\3\2\2\2\u016dC\3\2\2\2\u016e\u016f\7\24\2\2\u016f\u0170"+
		"\7E\2\2\u0170\u0171\5H%\2\u0171E\3\2\2\2\u0172\u0173\7\4\2\2\u0173\u0174"+
		"\7E\2\2\u0174\u017c\5*\26\2\u0175\u0176\7\4\2\2\u0176\u0177\7E\2\2\u0177"+
		"\u0178\5*\26\2\u0178\u0179\7E\2\2\u0179\u017a\5\30\r\2\u017a\u017c\3\2"+
		"\2\2\u017b\u0172\3\2\2\2\u017b\u0175\3\2\2\2\u017cG\3\2\2\2\u017d\u017e"+
		"\5n8\2\u017eI\3\2\2\2\u017f\u0180\7\22\2\2\u0180\u0181\7E\2\2\u0181\u0182"+
		"\5L\'\2\u0182K\3\2\2\2\u0183\u0186\5N(\2\u0184\u0186\5P)\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0184\3\2\2\2\u0186M\3\2\2\2\u0187\u0188\7\25\2\2\u0188"+
		"\u0189\7E\2\2\u0189\u018a\5*\26\2\u018a\u018b\7E\2\2\u018b\u018c\7<\2"+
		"\2\u018c\u018d\7E\2\2\u018d\u018e\5T+\2\u018e\u018f\7E\2\2\u018f\u0190"+
		"\7=\2\2\u0190O\3\2\2\2\u0191\u0192\7\26\2\2\u0192\u0193\7E\2\2\u0193\u0194"+
		"\5*\26\2\u0194\u0195\7E\2\2\u0195\u0196\7 \2\2\u0196\u0197\7E\2\2\u0197"+
		"\u0198\5\b\5\2\u0198\u01a4\3\2\2\2\u0199\u019a\7\26\2\2\u019a\u019b\7"+
		"E\2\2\u019b\u019c\5*\26\2\u019c\u019d\7E\2\2\u019d\u019e\5R*\2\u019e\u019f"+
		"\7E\2\2\u019f\u01a0\7 \2\2\u01a0\u01a1\7E\2\2\u01a1\u01a2\5\b\5\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u0191\3\2\2\2\u01a3\u0199\3\2\2\2\u01a4Q\3\2\2\2"+
		"\u01a5\u01a6\5.\30\2\u01a6S\3\2\2\2\u01a7\u01ae\5j\66\2\u01a8\u01a9\5"+
		"j\66\2\u01a9\u01aa\7B\2\2\u01aa\u01ab\7E\2\2\u01ab\u01ac\5T+\2\u01ac\u01ae"+
		"\3\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01a8\3\2\2\2\u01aeU\3\2\2\2\u01af"+
		"\u01b0\7\17\2\2\u01b0\u01b1\7E\2\2\u01b1\u01b2\5X-\2\u01b2W\3\2\2\2\u01b3"+
		"\u01b4\5Z.\2\u01b4Y\3\2\2\2\u01b5\u01b6\7\25\2\2\u01b6\u01b7\7E\2\2\u01b7"+
		"\u01b8\5*\26\2\u01b8\u01b9\7E\2\2\u01b9\u01ba\5\\/\2\u01ba[\3\2\2\2\u01bb"+
		"\u01cb\5^\60\2\u01bc\u01bd\5^\60\2\u01bd\u01be\7E\2\2\u01be\u01bf\5\\"+
		"/\2\u01bf\u01cb\3\2\2\2\u01c0\u01cb\5`\61\2\u01c1\u01c2\5`\61\2\u01c2"+
		"\u01c3\7E\2\2\u01c3\u01c4\5\\/\2\u01c4\u01cb\3\2\2\2\u01c5\u01cb\5b\62"+
		"\2\u01c6\u01c7\5b\62\2\u01c7\u01c8\7E\2\2\u01c8\u01c9\5\\/\2\u01c9\u01cb"+
		"\3\2\2\2\u01ca\u01bb\3\2\2\2\u01ca\u01bc\3\2\2\2\u01ca\u01c0\3\2\2\2\u01ca"+
		"\u01c1\3\2\2\2\u01ca\u01c5\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb]\3\2\2\2"+
		"\u01cc\u01cd\7\36\2\2\u01cd\u01ce\7E\2\2\u01ce\u01cf\5\24\13\2\u01cf\u01d0"+
		"\7E\2\2\u01d0\u01d1\7\37\2\2\u01d1\u01d2\7E\2\2\u01d2\u01d3\5\24\13\2"+
		"\u01d3_\3\2\2\2\u01d4\u01d5\7\16\2\2\u01d5\u01d6\7E\2\2\u01d6\u01d7\5"+
		"j\66\2\u01d7a\3\2\2\2\u01d8\u01d9\7\30\2\2\u01d9\u01da\7E\2\2\u01da\u01e2"+
		"\5\24\13\2\u01db\u01dc\7\30\2\2\u01dc\u01dd\7E\2\2\u01dd\u01de\5\24\13"+
		"\2\u01de\u01df\7E\2\2\u01df\u01e0\5b\62\2\u01e0\u01e2\3\2\2\2\u01e1\u01d8"+
		"\3\2\2\2\u01e1\u01db\3\2\2\2\u01e2c\3\2\2\2\u01e3\u01e4\7\30\2\2\u01e4"+
		"\u01e5\7E\2\2\u01e5\u01e6\5f\64\2\u01e6e\3\2\2\2\u01e7\u01e8\7\24\2\2"+
		"\u01e8\u01f3\5H%\2\u01e9\u01ea\7\25\2\2\u01ea\u01eb\7E\2\2\u01eb\u01f3"+
		"\5*\26\2\u01ec\u01ed\7\26\2\2\u01ed\u01ee\7E\2\2\u01ee\u01f3\5h\65\2\u01ef"+
		"\u01f0\7\27\2\2\u01f0\u01f1\7E\2\2\u01f1\u01f3\5\24\13\2\u01f2\u01e7\3"+
		"\2\2\2\u01f2\u01e9\3\2\2\2\u01f2\u01ec\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f3"+
		"g\3\2\2\2\u01f4\u01f5\5n8\2\u01f5i\3\2\2\2\u01f6\u01f7\5\24\13\2\u01f7"+
		"\u01f8\7E\2\2\u01f8\u01f9\5l\67\2\u01f9k\3\2\2\2\u01fa\u01fb\5p9\2\u01fb"+
		"m\3\2\2\2\u01fc\u01fd\7D\2\2\u01fdo\3\2\2\2\u01fe\u0213\7\60\2\2\u01ff"+
		"\u0213\7\61\2\2\u0200\u0213\7\62\2\2\u0201\u0213\7\63\2\2\u0202\u0213"+
		"\7\64\2\2\u0203\u0213\7\65\2\2\u0204\u0213\7\66\2\2\u0205\u0213\7\67\2"+
		"\2\u0206\u0207\7\67\2\2\u0207\u0208\7<\2\2\u0208\u0209\7G\2\2\u0209\u0213"+
		"\7=\2\2\u020a\u0213\78\2\2\u020b\u020c\78\2\2\u020c\u020d\7<\2\2\u020d"+
		"\u020e\7G\2\2\u020e\u0213\7=\2\2\u020f\u0213\79\2\2\u0210\u0213\7:\2\2"+
		"\u0211\u0213\7;\2\2\u0212\u01fe\3\2\2\2\u0212\u01ff\3\2\2\2\u0212\u0200"+
		"\3\2\2\2\u0212\u0201\3\2\2\2\u0212\u0202\3\2\2\2\u0212\u0203\3\2\2\2\u0212"+
		"\u0204\3\2\2\2\u0212\u0205\3\2\2\2\u0212\u0206\3\2\2\2\u0212\u020a\3\2"+
		"\2\2\u0212\u020b\3\2\2\2\u0212\u020f\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0211\3\2\2\2\u0213q\3\2\2\2\u0214\u0215\7@\2\2\u0215\u0216\5r:\2\u0216"+
		"\u0217\7@\2\2\u0217\u021e\3\2\2\2\u0218\u021a\7H\2\2\u0219\u0218\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e"+
		"\3\2\2\2\u021d\u0214\3\2\2\2\u021d\u0219\3\2\2\2\u021es\3\2\2\2\36\u0080"+
		"\u0089\u009a\u00a7\u00ae\u00b9\u00c0\u00dd\u00f6\u00ff\u0106\u011a\u0122"+
		"\u0136\u0148\u0157\u0164\u016c\u017b\u0185\u01a3\u01ad\u01ca\u01e1\u01f2"+
		"\u0212\u021b\u021d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}