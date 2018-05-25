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
		ASTERISK=77, NAME=78, INT=79, WS=80;
	public static final int
		RULE_main = 0, RULE_statement = 1, RULE_statement_type = 2, RULE_select_statement = 3, 
		RULE_select_stmnt = 4, RULE_select_parameters = 5, RULE_select_distinct_all = 6, 
		RULE_select_params = 7, RULE_column = 8, RULE_column_name = 9, RULE_from_statement = 10, 
		RULE_where_statement = 11, RULE_conditions = 12, RULE_condition = 13, 
		RULE_equality_ops = 14, RULE_logical_ops = 15, RULE_group_by_statment = 16, 
		RULE_having_statement = 17, RULE_order_by_statement = 18, RULE_columns_sorted = 19, 
		RULE_asc_desc = 20, RULE_tables = 21, RULE_table = 22, RULE_table_name = 23, 
		RULE_join = 24, RULE_full_right_left = 25, RULE_columns = 26, RULE_insert_into_statement = 27, 
		RULE_insert_into_stmnt = 28, RULE_insert_columns = 29, RULE_instert_values = 30, 
		RULE_values = 31, RULE_update_statement = 32, RULE_update_stmnt = 33, 
		RULE_update_columns = 34, RULE_delete_statement = 35, RULE_delete_stmnt = 36, 
		RULE_delete_database = 37, RULE_delete_from = 38, RULE_database_name = 39, 
		RULE_create_statement = 40, RULE_create_stmnt = 41, RULE_create_table = 42, 
		RULE_create_view = 43, RULE_create_view_columns = 44, RULE_columns_definition = 45, 
		RULE_alter_statement = 46, RULE_alter_stmnt = 47, RULE_alter_table = 48, 
		RULE_alter_tab = 49, RULE_rename_statement = 50, RULE_add_statement = 51, 
		RULE_drop_columns = 52, RULE_drop_statement = 53, RULE_drop_stmnt = 54, 
		RULE_view_name = 55, RULE_aggregation_function = 56, RULE_aggregation_fnc = 57, 
		RULE_agreggation_parameter = 58, RULE_column_definition = 59, RULE_column_type = 60, 
		RULE_name = 61, RULE_type = 62, RULE_value = 63, RULE_val = 64;
	public static final String[] ruleNames = {
		"main", "statement", "statement_type", "select_statement", "select_stmnt", 
		"select_parameters", "select_distinct_all", "select_params", "column", 
		"column_name", "from_statement", "where_statement", "conditions", "condition", 
		"equality_ops", "logical_ops", "group_by_statment", "having_statement", 
		"order_by_statement", "columns_sorted", "asc_desc", "tables", "table", 
		"table_name", "join", "full_right_left", "columns", "insert_into_statement", 
		"insert_into_stmnt", "insert_columns", "instert_values", "values", "update_statement", 
		"update_stmnt", "update_columns", "delete_statement", "delete_stmnt", 
		"delete_database", "delete_from", "database_name", "create_statement", 
		"create_stmnt", "create_table", "create_view", "create_view_columns", 
		"columns_definition", "alter_statement", "alter_stmnt", "alter_table", 
		"alter_tab", "rename_statement", "add_statement", "drop_columns", "drop_statement", 
		"drop_stmnt", "view_name", "aggregation_function", "aggregation_fnc", 
		"agreggation_parameter", "column_definition", "column_type", "name", "type", 
		"value", "val"
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
		"SEMICOLON", "COMMA", "DOT", "ASTERISK", "NAME", "INT", "WS"
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
		public String code = null;
		public StatementContext statement;
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
			setState(130);
			((MainContext)_localctx).statement = statement();
			 ((MainContext)_localctx).code =  ((MainContext)_localctx).statement.code; 
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
		public String code = null;
		public Statement_typeContext statement_type;
		public StatementContext statement;
		public Statement_typeContext statement_type() {
			return getRuleContext(Statement_typeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserParser.SEMICOLON, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
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
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((StatementContext)_localctx).statement_type = statement_type();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(134);
					match(WS);
					}
				}

				setState(137);
				match(SEMICOLON);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(138);
					match(WS);
					}
				}

				 ((StatementContext)_localctx).code =  ((StatementContext)_localctx).statement_type.code + ";"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((StatementContext)_localctx).statement_type = statement_type();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(144);
					match(WS);
					}
				}

				setState(147);
				match(SEMICOLON);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(148);
					match(WS);
					}
				}

				setState(151);
				((StatementContext)_localctx).statement = statement();
				 ((StatementContext)_localctx).code =  ((StatementContext)_localctx).statement_type.code + ";\n\n" + ((StatementContext)_localctx).statement.code; 
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
		public String code = null;
		public Select_statementContext select_statement;
		public Insert_into_statementContext insert_into_statement;
		public Update_statementContext update_statement;
		public Delete_statementContext delete_statement;
		public Create_statementContext create_statement;
		public Alter_statementContext alter_statement;
		public Drop_statementContext drop_statement;
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case SEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				((Statement_typeContext)_localctx).select_statement = select_statement();
				 ((Statement_typeContext)_localctx).code =  ((Statement_typeContext)_localctx).select_statement.code; 
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				((Statement_typeContext)_localctx).insert_into_statement = insert_into_statement();
				 ((Statement_typeContext)_localctx).code =  ((Statement_typeContext)_localctx).insert_into_statement.code; 
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				((Statement_typeContext)_localctx).update_statement = update_statement();
				 ((Statement_typeContext)_localctx).code =  ((Statement_typeContext)_localctx).update_statement.code; 
				}
				break;
			case DEL:
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				((Statement_typeContext)_localctx).delete_statement = delete_statement();
				 ((Statement_typeContext)_localctx).code =  ((Statement_typeContext)_localctx).delete_statement.code; 
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				((Statement_typeContext)_localctx).create_statement = create_statement();
				 ((Statement_typeContext)_localctx).code =  ((Statement_typeContext)_localctx).create_statement.code; 
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				((Statement_typeContext)_localctx).alter_statement = alter_statement();
				 ((Statement_typeContext)_localctx).code =  ((Statement_typeContext)_localctx).alter_statement.code; 
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				((Statement_typeContext)_localctx).drop_statement = drop_statement();
				 ((Statement_typeContext)_localctx).code =  ((Statement_typeContext)_localctx).drop_statement.code; 
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
		public String code = null;
		public Select_parametersContext select_parameters;
		public From_statementContext from_statement;
		public Select_stmntContext select_stmnt;
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				match(WS);
				setState(181);
				((Select_statementContext)_localctx).select_parameters = select_parameters();
				setState(182);
				match(WS);
				setState(183);
				((Select_statementContext)_localctx).from_statement = from_statement();
				 ((Select_statementContext)_localctx).code =  "SELECT " + ((Select_statementContext)_localctx).select_parameters.code + "\n" + ((Select_statementContext)_localctx).from_statement.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				match(WS);
				setState(188);
				((Select_statementContext)_localctx).select_parameters = select_parameters();
				setState(189);
				match(WS);
				setState(190);
				((Select_statementContext)_localctx).from_statement = from_statement();
				setState(191);
				match(WS);
				setState(192);
				((Select_statementContext)_localctx).select_stmnt = select_stmnt();
				 ((Select_statementContext)_localctx).code =  "SELECT " + ((Select_statementContext)_localctx).select_parameters.code + "\n" + ((Select_statementContext)_localctx).from_statement.code + "\n" + ((Select_statementContext)_localctx).select_stmnt.code; 
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
		public String code = null;
		public Where_statementContext where_statement;
		public Order_by_statementContext order_by_statement;
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((Select_stmntContext)_localctx).where_statement = where_statement();
				 ((Select_stmntContext)_localctx).code =  ((Select_stmntContext)_localctx).where_statement.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((Select_stmntContext)_localctx).where_statement = where_statement();
				setState(201);
				match(WS);
				setState(202);
				((Select_stmntContext)_localctx).order_by_statement = order_by_statement();
				 ((Select_stmntContext)_localctx).code =  ((Select_stmntContext)_localctx).where_statement.code + " " + ((Select_stmntContext)_localctx).order_by_statement.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				((Select_stmntContext)_localctx).where_statement = where_statement();
				setState(206);
				match(WS);
				setState(207);
				group_by_statment();
				setState(208);
				match(WS);
				setState(209);
				((Select_stmntContext)_localctx).order_by_statement = order_by_statement();
				 ((Select_stmntContext)_localctx).code =  ((Select_stmntContext)_localctx).where_statement.code + " " + ((Select_stmntContext)_localctx).order_by_statement.code + " " + ((Select_stmntContext)_localctx).order_by_statement.code; 
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
		public String code = null;
		public Select_distinct_allContext select_distinct_all;
		public Select_paramsContext select_params;
		public Select_parametersContext select_parameters;
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
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ASTERISK);
				 ((Select_parametersContext)_localctx).code =  "*"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				((Select_parametersContext)_localctx).select_distinct_all = select_distinct_all();
				setState(217);
				match(WS);
				setState(218);
				((Select_parametersContext)_localctx).select_params = select_params();
				 ((Select_parametersContext)_localctx).code =  ((Select_parametersContext)_localctx).select_distinct_all.code + " " + ((Select_parametersContext)_localctx).select_params.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				((Select_parametersContext)_localctx).select_distinct_all = select_distinct_all();
				setState(222);
				match(WS);
				setState(223);
				((Select_parametersContext)_localctx).select_params = select_params();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(224);
					match(WS);
					}
				}

				setState(227);
				match(COMMA);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(228);
					match(WS);
					}
				}

				setState(231);
				((Select_parametersContext)_localctx).select_parameters = select_parameters();
				 ((Select_parametersContext)_localctx).code =  ((Select_parametersContext)_localctx).select_distinct_all.code + " " + ((Select_parametersContext)_localctx).select_params.code + ", " + " " + ((Select_parametersContext)_localctx).select_parameters.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				((Select_parametersContext)_localctx).select_params = select_params();
				 ((Select_parametersContext)_localctx).code =  ((Select_parametersContext)_localctx).select_params.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				((Select_parametersContext)_localctx).select_params = select_params();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(238);
					match(WS);
					}
				}

				setState(241);
				match(COMMA);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(242);
					match(WS);
					}
				}

				setState(245);
				((Select_parametersContext)_localctx).select_parameters = select_parameters();
				 ((Select_parametersContext)_localctx).code =  ((Select_parametersContext)_localctx).select_params.code + ", " + ((Select_parametersContext)_localctx).select_parameters.code; 
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
		public String code = null;
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
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISTINCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(DISTINCT);
				 ((Select_distinct_allContext)_localctx).code =  "DISTINCT"; 
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(ALL);
				 ((Select_distinct_allContext)_localctx).code =  "ALL"; 
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

	public static class Select_paramsContext extends ParserRuleContext {
		public String code = null;
		public Aggregation_functionContext aggregation_function;
		public ColumnContext column;
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
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case SUM:
			case MAX:
			case MIN:
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((Select_paramsContext)_localctx).aggregation_function = aggregation_function();
				 ((Select_paramsContext)_localctx).code =  ((Select_paramsContext)_localctx).aggregation_function.code; 
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				((Select_paramsContext)_localctx).column = column();
				 ((Select_paramsContext)_localctx).code =  ((Select_paramsContext)_localctx).column.code; 
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
		public String code = null;
		public Column_nameContext column_name;
		public Table_nameContext table_name;
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				((ColumnContext)_localctx).column_name = column_name();
				 ((ColumnContext)_localctx).code =  ((ColumnContext)_localctx).column_name.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				((ColumnContext)_localctx).table_name = table_name();
				setState(268);
				match(DOT);
				setState(269);
				((ColumnContext)_localctx).column_name = column_name();
				 ((ColumnContext)_localctx).code =  ((ColumnContext)_localctx).table_name.code + "." + ((ColumnContext)_localctx).column_name.code; 
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
		public String code = null;
		public NameContext name;
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
			setState(274);
			((Column_nameContext)_localctx).name = name();
			 ((Column_nameContext)_localctx).code =  ((Column_nameContext)_localctx).name.code; 
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
		public String code = null;
		public TablesContext tables;
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
			setState(277);
			match(FROM);
			setState(278);
			match(WS);
			setState(279);
			((From_statementContext)_localctx).tables = tables();
			 ((From_statementContext)_localctx).code =  "FROM " + ((From_statementContext)_localctx).tables.code; 
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
		public String code = null;
		public ConditionsContext conditions;
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
			setState(282);
			match(WHERE);
			setState(283);
			match(WS);
			setState(284);
			((Where_statementContext)_localctx).conditions = conditions();
			 ((Where_statementContext)_localctx).code =  "WHERE " + ((Where_statementContext)_localctx).conditions.code; 
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
		public String code = null;
		public ConditionContext condition;
		public Logical_opsContext logical_ops;
		public ConditionsContext conditions;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((ConditionsContext)_localctx).condition = condition();
				 ((ConditionsContext)_localctx).code =  ((ConditionsContext)_localctx).condition.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				((ConditionsContext)_localctx).condition = condition();
				setState(291);
				match(WS);
				setState(292);
				((ConditionsContext)_localctx).logical_ops = logical_ops();
				setState(293);
				match(WS);
				setState(294);
				((ConditionsContext)_localctx).conditions = conditions();
				 ((ConditionsContext)_localctx).code =  ((ConditionsContext)_localctx).condition.code + " " + ((ConditionsContext)_localctx).logical_ops.code + " " + ((ConditionsContext)_localctx).conditions.code; 
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
		public String code = null;
		public ColumnContext column;
		public Equality_opsContext equality_ops;
		public ValueContext value;
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			((ConditionContext)_localctx).column = column();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(300);
				match(WS);
				}
			}

			setState(303);
			((ConditionContext)_localctx).equality_ops = equality_ops();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(304);
				match(WS);
				}
			}

			setState(307);
			((ConditionContext)_localctx).value = value();
			 ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).column.code + ((ConditionContext)_localctx).equality_ops.code + ((ConditionContext)_localctx).value.code; 
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
		public String code = null;
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
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(EQUALITY);
				 ((Equality_opsContext)_localctx).code =  "="; 
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(LT);
				 ((Equality_opsContext)_localctx).code =  "<"; 
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(LE);
				 ((Equality_opsContext)_localctx).code =  "<="; 
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(GT);
				 ((Equality_opsContext)_localctx).code =  ">"; 
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(GE);
				 ((Equality_opsContext)_localctx).code =  ">="; 
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				match(NE);
				 ((Equality_opsContext)_localctx).code =  "!="; 
				}
				break;
			case NEQL:
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				match(NEQL);
				 ((Equality_opsContext)_localctx).code =  "<>"; 
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

	public static class Logical_opsContext extends ParserRuleContext {
		public String code = null;
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
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(AND);
				 ((Logical_opsContext)_localctx).code =  "AND"; 
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(OR);
				 ((Logical_opsContext)_localctx).code =  "OR"; 
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

	public static class Group_by_statmentContext extends ParserRuleContext {
		public String code = null;
		public ColumnsContext columns;
		public Having_statementContext having_statement;
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
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(GROUP);
				setState(333);
				match(WS);
				setState(334);
				match(BY);
				setState(335);
				match(WS);
				setState(336);
				((Group_by_statmentContext)_localctx).columns = columns();
				 ((Group_by_statmentContext)_localctx).code =  "GROUP BY " + ((Group_by_statmentContext)_localctx).columns.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(GROUP);
				setState(340);
				match(WS);
				setState(341);
				match(BY);
				setState(342);
				match(WS);
				setState(343);
				((Group_by_statmentContext)_localctx).columns = columns();
				setState(344);
				match(WS);
				setState(345);
				((Group_by_statmentContext)_localctx).having_statement = having_statement();
				 ((Group_by_statmentContext)_localctx).code =  "GROUP BY " + ((Group_by_statmentContext)_localctx).columns.code + " " + ((Group_by_statmentContext)_localctx).having_statement.code; 
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
		public String code = null;
		public ConditionsContext conditions;
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
			setState(350);
			match(HAVING);
			setState(351);
			match(WS);
			setState(352);
			((Having_statementContext)_localctx).conditions = conditions();
			 ((Having_statementContext)_localctx).code =  "HAVING " + ((Having_statementContext)_localctx).conditions.code; 
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
		public String code = null;
		public Columns_sortedContext columns_sorted;
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
			setState(355);
			match(ORDER);
			setState(356);
			match(WS);
			setState(357);
			match(BY);
			setState(358);
			match(WS);
			setState(359);
			((Order_by_statementContext)_localctx).columns_sorted = columns_sorted();
			 ((Order_by_statementContext)_localctx).code =  "ORDER BY " + ((Order_by_statementContext)_localctx).columns_sorted.code; 
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
		public String code = null;
		public ColumnContext column;
		public Asc_descContext asc_desc;
		public Columns_sortedContext columns_sorted;
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public Asc_descContext asc_desc() {
			return getRuleContext(Asc_descContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public Columns_sortedContext columns_sorted() {
			return getRuleContext(Columns_sortedContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			((Columns_sortedContext)_localctx).column = column();
			setState(363);
			((Columns_sortedContext)_localctx).asc_desc = asc_desc();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(364);
				match(WS);
				}
			}

			setState(367);
			match(COMMA);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(368);
				match(WS);
				}
			}

			setState(371);
			((Columns_sortedContext)_localctx).columns_sorted = columns_sorted();
			 ((Columns_sortedContext)_localctx).code =  ((Columns_sortedContext)_localctx).column.code + ((Columns_sortedContext)_localctx).asc_desc.code + ", " + ((Columns_sortedContext)_localctx).columns_sorted.code; 
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

	public static class Asc_descContext extends ParserRuleContext {
		public String code = null;
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public TerminalNode ASC() { return getToken(ParserParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ParserParser.DESC, 0); }
		public Asc_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAsc_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAsc_desc(this);
		}
	}

	public final Asc_descContext asc_desc() throws RecognitionException {
		Asc_descContext _localctx = new Asc_descContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asc_desc);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(WS);
				setState(375);
				match(ASC);
				 ((Asc_descContext)_localctx).code =  " ASC"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(WS);
				setState(378);
				match(DESC);
				 ((Asc_descContext)_localctx).code =  " DESC"; 
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
		public String code = null;
		public TableContext table;
		public JoinContext join;
		public TablesContext tables;
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
		enterRule(_localctx, 42, RULE_tables);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				((TablesContext)_localctx).table = table();
				 ((TablesContext)_localctx).code =  ((TablesContext)_localctx).table.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				((TablesContext)_localctx).table = table();
				setState(386);
				match(WS);
				setState(387);
				((TablesContext)_localctx).join = join();
				setState(388);
				match(WS);
				setState(389);
				((TablesContext)_localctx).tables = tables();
				 ((TablesContext)_localctx).code =  ((TablesContext)_localctx).table.code + " " + ((TablesContext)_localctx).join.code + " " + ((TablesContext)_localctx).tables.code; 
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
		public String code = null;
		public Table_nameContext table_name;
		public Select_statementContext select_statement;
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(ParserParser.LEFT_BRACKET, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ParserParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
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
		enterRule(_localctx, 44, RULE_table);
		int _la;
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				((TableContext)_localctx).table_name = table_name();
				 ((TableContext)_localctx).code =  ((TableContext)_localctx).table_name.code; 
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(LEFT_BRACKET);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(398);
					match(WS);
					}
				}

				setState(401);
				((TableContext)_localctx).select_statement = select_statement();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(402);
					match(WS);
					}
				}

				setState(405);
				match(RIGHT_BRACKET);
				 ((TableContext)_localctx).code =  "(" + ((TableContext)_localctx).select_statement.code + ")"; 
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
		public String code = null;
		public NameContext name;
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
		enterRule(_localctx, 46, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			((Table_nameContext)_localctx).name = name();
			 ((Table_nameContext)_localctx).code =  ((Table_nameContext)_localctx).name.code; 
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
		public String code = null;
		public Full_right_leftContext full_right_left;
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public TerminalNode JOIN() { return getToken(ParserParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(ParserParser.NATURAL, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public TerminalNode CROSS() { return getToken(ParserParser.CROSS, 0); }
		public TerminalNode INNER() { return getToken(ParserParser.INNER, 0); }
		public Full_right_leftContext full_right_left() {
			return getRuleContext(Full_right_leftContext.class,0);
		}
		public TerminalNode OUTER() { return getToken(ParserParser.OUTER, 0); }
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
		enterRule(_localctx, 48, RULE_join);
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(COMMA);
				 ((JoinContext)_localctx).code =  ","; 
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(JOIN);
				 ((JoinContext)_localctx).code =  "JOIN"; 
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(NATURAL);
				setState(418);
				match(WS);
				setState(419);
				match(JOIN);
				 ((JoinContext)_localctx).code =  "NATURAL JOIN"; 
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				match(CROSS);
				setState(422);
				match(WS);
				setState(423);
				match(JOIN);
				 ((JoinContext)_localctx).code =  "CROSS JOIN"; 
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				match(INNER);
				setState(426);
				match(WS);
				setState(427);
				match(JOIN);
				 ((JoinContext)_localctx).code =  "INNER JOIN"; 
				}
				break;
			case FULL:
			case RIGHT:
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				((JoinContext)_localctx).full_right_left = full_right_left();
				setState(430);
				match(WS);
				setState(431);
				match(OUTER);
				setState(432);
				match(WS);
				setState(433);
				match(JOIN);
				 ((JoinContext)_localctx).code =  ((JoinContext)_localctx).full_right_left.code + " OUTER JOIN"; 
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

	public static class Full_right_leftContext extends ParserRuleContext {
		public String code = null;
		public TerminalNode FULL() { return getToken(ParserParser.FULL, 0); }
		public TerminalNode RIGHT() { return getToken(ParserParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(ParserParser.LEFT, 0); }
		public Full_right_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_right_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFull_right_left(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFull_right_left(this);
		}
	}

	public final Full_right_leftContext full_right_left() throws RecognitionException {
		Full_right_leftContext _localctx = new Full_right_leftContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_full_right_left);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(FULL);
				 ((Full_right_leftContext)_localctx).code =  "FULL"; 
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(RIGHT);
				 ((Full_right_leftContext)_localctx).code =  "RIGHT"; 
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				match(LEFT);
				 ((Full_right_leftContext)_localctx).code =  "LEFT"; 
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
		public String code = null;
		public ColumnContext column;
		public ColumnsContext columns;
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
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
		enterRule(_localctx, 52, RULE_columns);
		int _la;
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				((ColumnsContext)_localctx).column = column();
				 ((ColumnsContext)_localctx).code =  ((ColumnsContext)_localctx).column.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				((ColumnsContext)_localctx).column = column();
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(450);
					match(WS);
					}
				}

				setState(453);
				match(COMMA);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(454);
					match(WS);
					}
				}

				setState(457);
				((ColumnsContext)_localctx).columns = columns();
				 ((ColumnsContext)_localctx).code =  ((ColumnsContext)_localctx).column.code + ", " + ((ColumnsContext)_localctx).columns.code; 
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
		public String code = null;
		public Table_nameContext table_name;
		public Insert_into_stmntContext insert_into_stmnt;
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
		enterRule(_localctx, 54, RULE_insert_into_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(INSERT);
			setState(463);
			match(WS);
			setState(464);
			match(INTO);
			setState(465);
			match(WS);
			setState(466);
			((Insert_into_statementContext)_localctx).table_name = table_name();
			setState(467);
			match(WS);
			setState(468);
			((Insert_into_statementContext)_localctx).insert_into_stmnt = insert_into_stmnt();
			 ((Insert_into_statementContext)_localctx).code =  "INSERT INTO " + ((Insert_into_statementContext)_localctx).table_name.code + " " + ((Insert_into_statementContext)_localctx).insert_into_stmnt.code; 
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
		public String code = null;
		public Instert_valuesContext instert_values;
		public Select_statementContext select_statement;
		public Insert_columnsContext insert_columns;
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
		enterRule(_localctx, 56, RULE_insert_into_stmnt);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				((Insert_into_stmntContext)_localctx).instert_values = instert_values();
				 ((Insert_into_stmntContext)_localctx).code =  ((Insert_into_stmntContext)_localctx).instert_values.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				((Insert_into_stmntContext)_localctx).select_statement = select_statement();
				 ((Insert_into_stmntContext)_localctx).code =  ((Insert_into_stmntContext)_localctx).select_statement.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				((Insert_into_stmntContext)_localctx).insert_columns = insert_columns();
				setState(478);
				match(WS);
				setState(479);
				((Insert_into_stmntContext)_localctx).instert_values = instert_values();
				 ((Insert_into_stmntContext)_localctx).code =  ((Insert_into_stmntContext)_localctx).insert_columns.code + " " + ((Insert_into_stmntContext)_localctx).instert_values.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				((Insert_into_stmntContext)_localctx).insert_columns = insert_columns();
				setState(483);
				match(WS);
				setState(484);
				((Insert_into_stmntContext)_localctx).select_statement = select_statement();
				 ((Insert_into_stmntContext)_localctx).code =  ((Insert_into_stmntContext)_localctx).insert_columns.code + " " + ((Insert_into_stmntContext)_localctx).select_statement.code; 
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
		public String code = null;
		public ColumnsContext columns;
		public TerminalNode LEFT_BRACKET() { return getToken(ParserParser.LEFT_BRACKET, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(ParserParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
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
		enterRule(_localctx, 58, RULE_insert_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(LEFT_BRACKET);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(490);
				match(WS);
				}
			}

			setState(493);
			((Insert_columnsContext)_localctx).columns = columns();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(494);
				match(WS);
				}
			}

			setState(497);
			match(RIGHT_BRACKET);
			 ((Insert_columnsContext)_localctx).code =  "(" + ((Insert_columnsContext)_localctx).columns.code + ")"; 
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
		public String code = null;
		public ValuesContext values;
		public TerminalNode VALUES() { return getToken(ParserParser.VALUES, 0); }
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
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
		enterRule(_localctx, 60, RULE_instert_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(VALUES);
			setState(501);
			match(WS);
			setState(502);
			match(LEFT_BRACKET);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(503);
				match(WS);
				}
			}

			setState(506);
			((Instert_valuesContext)_localctx).values = values();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(507);
				match(WS);
				}
			}

			setState(510);
			match(RIGHT_BRACKET);
			 ((Instert_valuesContext)_localctx).code =  "VALUES (" + ((Instert_valuesContext)_localctx).values.code + ")"; 
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
		public String code = null;
		public ValueContext value;
		public ValuesContext values;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
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
		enterRule(_localctx, 62, RULE_values);
		int _la;
		try {
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				((ValuesContext)_localctx).value = value();
				 ((ValuesContext)_localctx).code =  ((ValuesContext)_localctx).value.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				((ValuesContext)_localctx).value = value();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(517);
					match(WS);
					}
				}

				setState(520);
				match(COMMA);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(521);
					match(WS);
					}
				}

				setState(524);
				((ValuesContext)_localctx).values = values();
				 ((ValuesContext)_localctx).code =  ((ValuesContext)_localctx).value.code + ", " + ((ValuesContext)_localctx).values.code; 
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
		public String code = null;
		public Table_nameContext table_name;
		public Update_stmntContext update_stmnt;
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
		enterRule(_localctx, 64, RULE_update_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(UPDATE);
			setState(530);
			match(WS);
			setState(531);
			((Update_statementContext)_localctx).table_name = table_name();
			setState(532);
			match(WS);
			setState(533);
			match(SET);
			setState(534);
			match(WS);
			setState(535);
			((Update_statementContext)_localctx).update_stmnt = update_stmnt();
			 ((Update_statementContext)_localctx).code =  "UPDATE " + ((Update_statementContext)_localctx).table_name.code + " SET " + ((Update_statementContext)_localctx).update_stmnt.code; 
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
		public String code = null;
		public Update_columnsContext update_columns;
		public Where_statementContext where_statement;
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
		enterRule(_localctx, 66, RULE_update_stmnt);
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				((Update_stmntContext)_localctx).update_columns = update_columns();
				 ((Update_stmntContext)_localctx).code =  ((Update_stmntContext)_localctx).update_columns.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				((Update_stmntContext)_localctx).update_columns = update_columns();
				setState(542);
				match(WS);
				setState(543);
				((Update_stmntContext)_localctx).where_statement = where_statement();
				 ((Update_stmntContext)_localctx).code =  ((Update_stmntContext)_localctx).update_columns.code + " " + ((Update_stmntContext)_localctx).where_statement.code; 
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
		public String code = null;
		public Column_nameContext column_name;
		public ValueContext value;
		public Update_columnsContext update_columns;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode EQUALITY() { return getToken(ParserParser.EQUALITY, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
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
		enterRule(_localctx, 68, RULE_update_columns);
		int _la;
		try {
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				((Update_columnsContext)_localctx).column_name = column_name();
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(549);
					match(WS);
					}
				}

				setState(552);
				match(EQUALITY);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(553);
					match(WS);
					}
				}

				setState(556);
				((Update_columnsContext)_localctx).value = value();
				 ((Update_columnsContext)_localctx).code =  ((Update_columnsContext)_localctx).column_name.code + "=" + ((Update_columnsContext)_localctx).value.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				((Update_columnsContext)_localctx).column_name = column_name();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(560);
					match(WS);
					}
				}

				setState(563);
				match(EQUALITY);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(564);
					match(WS);
					}
				}

				setState(567);
				((Update_columnsContext)_localctx).value = value();
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(568);
					match(WS);
					}
				}

				setState(571);
				match(COMMA);
				setState(572);
				match(WS);
				setState(573);
				((Update_columnsContext)_localctx).update_columns = update_columns();
				 ((Update_columnsContext)_localctx).code =  ((Update_columnsContext)_localctx).column_name.code + "=" + ((Update_columnsContext)_localctx).value.code + ", " + ((Update_columnsContext)_localctx).update_columns.code; 
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
		public String code = null;
		public Delete_stmntContext delete_stmnt;
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
		enterRule(_localctx, 70, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_la = _input.LA(1);
			if ( !(_la==DEL || _la==DELETE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(579);
			match(WS);
			setState(580);
			((Delete_statementContext)_localctx).delete_stmnt = delete_stmnt();
			 ((Delete_statementContext)_localctx).code =  "DELETE " + ((Delete_statementContext)_localctx).delete_stmnt.code; 
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
		public String code = null;
		public Delete_databaseContext delete_database;
		public Delete_fromContext delete_from;
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
		enterRule(_localctx, 72, RULE_delete_stmnt);
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				((Delete_stmntContext)_localctx).delete_database = delete_database();
				 ((Delete_stmntContext)_localctx).code =  ((Delete_stmntContext)_localctx).delete_database.code; 
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				((Delete_stmntContext)_localctx).delete_from = delete_from();
				 ((Delete_stmntContext)_localctx).code =  ((Delete_stmntContext)_localctx).delete_from.code; 
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
		public String code = null;
		public Database_nameContext database_name;
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
		enterRule(_localctx, 74, RULE_delete_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(DATABASE);
			setState(592);
			match(WS);
			setState(593);
			((Delete_databaseContext)_localctx).database_name = database_name();
			 ((Delete_databaseContext)_localctx).code =  "DATABASE " + ((Delete_databaseContext)_localctx).database_name.code; 
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
		public String code = null;
		public Table_nameContext table_name;
		public Where_statementContext where_statement;
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
		enterRule(_localctx, 76, RULE_delete_from);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				match(FROM);
				setState(597);
				match(WS);
				setState(598);
				((Delete_fromContext)_localctx).table_name = table_name();
				 ((Delete_fromContext)_localctx).code =  "FROM " + ((Delete_fromContext)_localctx).table_name.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				match(FROM);
				setState(602);
				match(WS);
				setState(603);
				((Delete_fromContext)_localctx).table_name = table_name();
				setState(604);
				match(WS);
				setState(605);
				((Delete_fromContext)_localctx).where_statement = where_statement();
				 ((Delete_fromContext)_localctx).code =  "FROM " + ((Delete_fromContext)_localctx).table_name.code + " " + ((Delete_fromContext)_localctx).where_statement.code; 
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
		public String code = null;
		public NameContext name;
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
		enterRule(_localctx, 78, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			((Database_nameContext)_localctx).name = name();
			 ((Database_nameContext)_localctx).code =  ((Database_nameContext)_localctx).name.code; 
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
		public String code = null;
		public Create_stmntContext create_stmnt;
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
		enterRule(_localctx, 80, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(CREATE);
			setState(614);
			match(WS);
			setState(615);
			((Create_statementContext)_localctx).create_stmnt = create_stmnt();
			 ((Create_statementContext)_localctx).code =  "CREATE " + ((Create_statementContext)_localctx).create_stmnt.code; 
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
		public String code = null;
		public Create_tableContext create_table;
		public Create_viewContext create_view;
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
		enterRule(_localctx, 82, RULE_create_stmnt);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				((Create_stmntContext)_localctx).create_table = create_table();
				 ((Create_stmntContext)_localctx).code =  ((Create_stmntContext)_localctx).create_table.code; 
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				((Create_stmntContext)_localctx).create_view = create_view();
				 ((Create_stmntContext)_localctx).code =  ((Create_stmntContext)_localctx).create_view.code; 
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
		public String code = null;
		public Table_nameContext table_name;
		public Columns_definitionContext columns_definition;
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
		enterRule(_localctx, 84, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(TABLE);
			setState(627);
			match(WS);
			setState(628);
			((Create_tableContext)_localctx).table_name = table_name();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(629);
				match(WS);
				}
			}

			setState(632);
			match(LEFT_BRACKET);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(633);
				match(WS);
				}
			}

			setState(636);
			((Create_tableContext)_localctx).columns_definition = columns_definition();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(637);
				match(WS);
				}
			}

			setState(640);
			match(RIGHT_BRACKET);
			 ((Create_tableContext)_localctx).code =  "TABLE " + ((Create_tableContext)_localctx).table_name.code + "(" + ((Create_tableContext)_localctx).columns_definition.code + ")"; 
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
		public String code = null;
		public Table_nameContext table_name;
		public Select_statementContext select_statement;
		public Create_view_columnsContext create_view_columns;
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
		enterRule(_localctx, 86, RULE_create_view);
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(VIEW);
				setState(644);
				match(WS);
				setState(645);
				((Create_viewContext)_localctx).table_name = table_name();
				setState(646);
				match(WS);
				setState(647);
				match(AS);
				setState(648);
				match(WS);
				setState(649);
				((Create_viewContext)_localctx).select_statement = select_statement();
				 ((Create_viewContext)_localctx).code =  "VIEW " + ((Create_viewContext)_localctx).table_name.code + " AS " + ((Create_viewContext)_localctx).select_statement.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				match(VIEW);
				setState(653);
				match(WS);
				setState(654);
				((Create_viewContext)_localctx).table_name = table_name();
				setState(655);
				match(WS);
				setState(656);
				((Create_viewContext)_localctx).create_view_columns = create_view_columns();
				setState(657);
				match(WS);
				setState(658);
				match(AS);
				setState(659);
				match(WS);
				setState(660);
				((Create_viewContext)_localctx).select_statement = select_statement();
				 ((Create_viewContext)_localctx).code =  "VIEW " + ((Create_viewContext)_localctx).table_name.code + " " + ((Create_viewContext)_localctx).create_view_columns.code + " AS " + ((Create_viewContext)_localctx).select_statement.code; 
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
		public String code = null;
		public ColumnsContext columns;
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
		enterRule(_localctx, 88, RULE_create_view_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			((Create_view_columnsContext)_localctx).columns = columns();
			 ((Create_view_columnsContext)_localctx).code =  ((Create_view_columnsContext)_localctx).columns.code; 
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
		public String code = null;
		public Column_definitionContext column_definition;
		public Columns_definitionContext columns_definition;
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserParser.COMMA, 0); }
		public Columns_definitionContext columns_definition() {
			return getRuleContext(Columns_definitionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ParserParser.WS, i);
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
		enterRule(_localctx, 90, RULE_columns_definition);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				((Columns_definitionContext)_localctx).column_definition = column_definition();
				 ((Columns_definitionContext)_localctx).code =  ((Columns_definitionContext)_localctx).column_definition.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				((Columns_definitionContext)_localctx).column_definition = column_definition();
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(672);
					match(WS);
					}
				}

				setState(675);
				match(COMMA);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(676);
					match(WS);
					}
				}

				setState(679);
				((Columns_definitionContext)_localctx).columns_definition = columns_definition();
				 ((Columns_definitionContext)_localctx).code =  ((Columns_definitionContext)_localctx).column_definition.code + ", " + ((Columns_definitionContext)_localctx).columns_definition.code; 
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
		public String code = null;
		public Alter_stmntContext alter_stmnt;
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
		enterRule(_localctx, 92, RULE_alter_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(ALTER);
			setState(685);
			match(WS);
			setState(686);
			((Alter_statementContext)_localctx).alter_stmnt = alter_stmnt();
			 ((Alter_statementContext)_localctx).code =  "ALTER " + ((Alter_statementContext)_localctx).alter_stmnt.code; 
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
		public String code = null;
		public Alter_tableContext alter_table;
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
		enterRule(_localctx, 94, RULE_alter_stmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			((Alter_stmntContext)_localctx).alter_table = alter_table();
			 ((Alter_stmntContext)_localctx).code =  ((Alter_stmntContext)_localctx).alter_table.code; 
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
		public String code = null;
		public Table_nameContext table_name;
		public Alter_tabContext alter_tab;
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
		enterRule(_localctx, 96, RULE_alter_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(TABLE);
			setState(693);
			match(WS);
			setState(694);
			((Alter_tableContext)_localctx).table_name = table_name();
			setState(695);
			match(WS);
			setState(696);
			((Alter_tableContext)_localctx).alter_tab = alter_tab();
			 ((Alter_tableContext)_localctx).code =  "TABLE " + ((Alter_tableContext)_localctx).table_name.code + " " + ((Alter_tableContext)_localctx).alter_tab.code; 
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
		public String code = null;
		public Rename_statementContext rename_statement;
		public Alter_tabContext alter_tab;
		public Add_statementContext add_statement;
		public Drop_columnsContext drop_columns;
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
		enterRule(_localctx, 98, RULE_alter_tab);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				((Alter_tabContext)_localctx).rename_statement = rename_statement();
				 ((Alter_tabContext)_localctx).code =  ((Alter_tabContext)_localctx).rename_statement.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				((Alter_tabContext)_localctx).rename_statement = rename_statement();
				setState(703);
				match(WS);
				setState(704);
				((Alter_tabContext)_localctx).alter_tab = alter_tab();
				 ((Alter_tabContext)_localctx).code =  ((Alter_tabContext)_localctx).rename_statement.code + " " + ((Alter_tabContext)_localctx).alter_tab.code; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				((Alter_tabContext)_localctx).add_statement = add_statement();
				 ((Alter_tabContext)_localctx).code =  ((Alter_tabContext)_localctx).add_statement.code; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				((Alter_tabContext)_localctx).add_statement = add_statement();
				setState(711);
				match(WS);
				setState(712);
				((Alter_tabContext)_localctx).alter_tab = alter_tab();
				 ((Alter_tabContext)_localctx).code =  ((Alter_tabContext)_localctx).add_statement.code + " " + ((Alter_tabContext)_localctx).alter_tab.code; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(715);
				((Alter_tabContext)_localctx).drop_columns = drop_columns();
				 ((Alter_tabContext)_localctx).code =  ((Alter_tabContext)_localctx).drop_columns.code; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(718);
				((Alter_tabContext)_localctx).drop_columns = drop_columns();
				setState(719);
				match(WS);
				setState(720);
				((Alter_tabContext)_localctx).alter_tab = alter_tab();
				 ((Alter_tabContext)_localctx).code =  ((Alter_tabContext)_localctx).drop_columns.code + " " + ((Alter_tabContext)_localctx).alter_tab.code; 
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
		public String code = null;
		public Column_nameContext column_name;
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
		enterRule(_localctx, 100, RULE_rename_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(RENAME);
			setState(726);
			match(WS);
			setState(727);
			((Rename_statementContext)_localctx).column_name = column_name();
			setState(728);
			match(WS);
			setState(729);
			match(TO);
			setState(730);
			match(WS);
			setState(731);
			((Rename_statementContext)_localctx).column_name = column_name();
			 ((Rename_statementContext)_localctx).code =  "RENAME " + ((Rename_statementContext)_localctx).column_name.code + " TO " + ((Rename_statementContext)_localctx).column_name.code; 
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
		public String code = null;
		public Column_definitionContext column_definition;
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
		enterRule(_localctx, 102, RULE_add_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(ADD);
			setState(735);
			match(WS);
			setState(736);
			((Add_statementContext)_localctx).column_definition = column_definition();
			 ((Add_statementContext)_localctx).code =  "ADD " + ((Add_statementContext)_localctx).column_definition.code; 
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
		public String code = null;
		public Column_nameContext column_name;
		public Drop_columnsContext drop_columns;
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
		enterRule(_localctx, 104, RULE_drop_columns);
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(DROP);
				setState(740);
				match(WS);
				setState(741);
				((Drop_columnsContext)_localctx).column_name = column_name();
				 ((Drop_columnsContext)_localctx).code =  "DROP " + ((Drop_columnsContext)_localctx).column_name.code; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(DROP);
				setState(745);
				match(WS);
				setState(746);
				((Drop_columnsContext)_localctx).column_name = column_name();
				setState(747);
				match(WS);
				setState(748);
				((Drop_columnsContext)_localctx).drop_columns = drop_columns();
				 ((Drop_columnsContext)_localctx).code =  "DROP " + ((Drop_columnsContext)_localctx).column_name.code + " " + ((Drop_columnsContext)_localctx).drop_columns.code; 
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
		public String code = null;
		public Drop_stmntContext drop_stmnt;
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
		enterRule(_localctx, 106, RULE_drop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(DROP);
			setState(754);
			match(WS);
			setState(755);
			((Drop_statementContext)_localctx).drop_stmnt = drop_stmnt();
			 ((Drop_statementContext)_localctx).code =  "DROP " + ((Drop_statementContext)_localctx).drop_stmnt.code; 
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
		public String code = null;
		public Database_nameContext database_name;
		public Table_nameContext table_name;
		public View_nameContext view_name;
		public Column_nameContext column_name;
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
		enterRule(_localctx, 108, RULE_drop_stmnt);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(DATABASE);
				setState(759);
				((Drop_stmntContext)_localctx).database_name = database_name();
				 ((Drop_stmntContext)_localctx).code =  "DATABASE " + ((Drop_stmntContext)_localctx).database_name.code; 
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(TABLE);
				setState(763);
				match(WS);
				setState(764);
				((Drop_stmntContext)_localctx).table_name = table_name();
				 ((Drop_stmntContext)_localctx).code =  "TABLE " + ((Drop_stmntContext)_localctx).table_name.code; 
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(767);
				match(VIEW);
				setState(768);
				match(WS);
				setState(769);
				((Drop_stmntContext)_localctx).view_name = view_name();
				 ((Drop_stmntContext)_localctx).code =  "VIEW " + ((Drop_stmntContext)_localctx).view_name.code; 
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				match(COLUMN);
				setState(773);
				match(WS);
				setState(774);
				((Drop_stmntContext)_localctx).column_name = column_name();
				 ((Drop_stmntContext)_localctx).code =  "COLUMN " + ((Drop_stmntContext)_localctx).column_name.code; 
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
		public String code = null;
		public NameContext name;
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
		enterRule(_localctx, 110, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			((View_nameContext)_localctx).name = name();
			 ((View_nameContext)_localctx).code =  ((View_nameContext)_localctx).name.code; 
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
		public String code = null;
		public Aggregation_fncContext aggregation_fnc;
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
		enterRule(_localctx, 112, RULE_aggregation_function);
		try {
			setState(802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(COUNT);
				setState(783);
				((Aggregation_functionContext)_localctx).aggregation_fnc = aggregation_fnc();
				 ((Aggregation_functionContext)_localctx).code =  "COUNT" + ((Aggregation_functionContext)_localctx).aggregation_fnc.code; 
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				match(SUM);
				setState(787);
				((Aggregation_functionContext)_localctx).aggregation_fnc = aggregation_fnc();
				 ((Aggregation_functionContext)_localctx).code =  "SUM" + ((Aggregation_functionContext)_localctx).aggregation_fnc.code; 
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				match(MAX);
				setState(791);
				((Aggregation_functionContext)_localctx).aggregation_fnc = aggregation_fnc();
				 ((Aggregation_functionContext)_localctx).code =  "MAX" + ((Aggregation_functionContext)_localctx).aggregation_fnc.code; 
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				match(MIN);
				setState(795);
				((Aggregation_functionContext)_localctx).aggregation_fnc = aggregation_fnc();
				 ((Aggregation_functionContext)_localctx).code =  "MIN" + ((Aggregation_functionContext)_localctx).aggregation_fnc.code; 
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 5);
				{
				setState(798);
				match(AVG);
				setState(799);
				((Aggregation_functionContext)_localctx).aggregation_fnc = aggregation_fnc();
				 ((Aggregation_functionContext)_localctx).code =  "AVG" + ((Aggregation_functionContext)_localctx).aggregation_fnc.code; 
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
		public String code = null;
		public Agreggation_parameterContext agreggation_parameter;
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
		enterRule(_localctx, 114, RULE_aggregation_fnc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(LEFT_BRACKET);
			setState(805);
			((Aggregation_fncContext)_localctx).agreggation_parameter = agreggation_parameter();
			setState(806);
			match(RIGHT_BRACKET);
			 ((Aggregation_fncContext)_localctx).code =  "(" + ((Aggregation_fncContext)_localctx).agreggation_parameter.code + ")"; 
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
		public String code = null;
		public ColumnContext column;
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
		enterRule(_localctx, 116, RULE_agreggation_parameter);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				match(ASTERISK);
				 ((Agreggation_parameterContext)_localctx).code =  "*"; 
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				((Agreggation_parameterContext)_localctx).column = column();
				 ((Agreggation_parameterContext)_localctx).code =  ((Agreggation_parameterContext)_localctx).column.code; 
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
		public String code = null;
		public Column_nameContext column_name;
		public Column_typeContext column_type;
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
		enterRule(_localctx, 118, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			((Column_definitionContext)_localctx).column_name = column_name();
			setState(817);
			match(WS);
			setState(818);
			((Column_definitionContext)_localctx).column_type = column_type();
			 ((Column_definitionContext)_localctx).code =  ((Column_definitionContext)_localctx).column_name.code + " " + ((Column_definitionContext)_localctx).column_type.code; 
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
		public String code = null;
		public TypeContext type;
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
		enterRule(_localctx, 120, RULE_column_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			((Column_typeContext)_localctx).type = type();
			 ((Column_typeContext)_localctx).code =  ((Column_typeContext)_localctx).type.code; 
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
		public String code = null;
		public Token NAME;
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
		enterRule(_localctx, 122, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			((NameContext)_localctx).NAME = match(NAME);
			 ((NameContext)_localctx).code =  (((NameContext)_localctx).NAME!=null?((NameContext)_localctx).NAME.getText():null).toString(); 
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
		public String code = null;
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
		enterRule(_localctx, 124, RULE_type);
		try {
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				match(BYTEINT);
				 ((TypeContext)_localctx).code =  "TINYINT"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(SMALLINT);
				 ((TypeContext)_localctx).code =  "SMALLINT"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				match(INTEGER);
				 ((TypeContext)_localctx).code =  "INT"; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(833);
				match(BIGINT);
				 ((TypeContext)_localctx).code =  "BIGINT"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(835);
				match(DECIMAL);
				 ((TypeContext)_localctx).code =  "DOUBLE"; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(837);
				match(NUMERIC);
				 ((TypeContext)_localctx).code =  "DOUBLE"; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(839);
				match(FLOAT);
				 ((TypeContext)_localctx).code =  "FLOAT"; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(841);
				match(CHAR);
				 ((TypeContext)_localctx).code =  "CHAR"; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(843);
				match(CHAR);
				setState(844);
				match(LEFT_BRACKET);
				setState(845);
				match(INT);
				setState(846);
				match(RIGHT_BRACKET);
				 ((TypeContext)_localctx).code =  "CHAR(" + Integer.toString(INT) + ")"; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(848);
				match(VARCHAR);
				 ((TypeContext)_localctx).code =  "STRING"; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(850);
				match(VARCHAR);
				setState(851);
				match(LEFT_BRACKET);
				setState(852);
				match(INT);
				setState(853);
				match(RIGHT_BRACKET);
				 ((TypeContext)_localctx).code =  "STRING(" + Integer.toString(INT) + ")"; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(855);
				match(DATE);
				 ((TypeContext)_localctx).code =  "TIMESTAMP"; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(857);
				match(TIME);
				 ((TypeContext)_localctx).code =  "TIMESTAMP"; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(859);
				match(TIMESTAMP);
				 ((TypeContext)_localctx).code =  "TIMESTAMP"; 
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
		public String code = null;
		public ValContext val;
		public ValueContext value;
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
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
		enterRule(_localctx, 126, RULE_value);
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				((ValueContext)_localctx).val = val();
				 ((ValueContext)_localctx).code =  ((ValueContext)_localctx).val.code; 
				}
				break;
			case APOSTROF:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				match(APOSTROF);
				setState(867);
				((ValueContext)_localctx).value = value();
				setState(868);
				match(APOSTROF);
				 ((ValueContext)_localctx).code =  "'" + ((ValueContext)_localctx).value.code + "'"; 
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

	public static class ValContext extends ParserRuleContext {
		public String code = null;
		public Token NAME;
		public TerminalNode NAME() { return getToken(ParserParser.NAME, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			((ValContext)_localctx).NAME = match(NAME);
			 ((ValContext)_localctx).code =  (((ValContext)_localctx).NAME!=null?((ValContext)_localctx).NAME.getText():null).toString(); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u036f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\3\3\3\5\3\u008a\n\3\3\3\3"+
		"\3\5\3\u008e\n\3\3\3\3\3\3\3\3\3\5\3\u0094\n\3\3\3\3\3\5\3\u0098\n\3\3"+
		"\3\3\3\3\3\5\3\u009d\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b4\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00c6\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d7\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e4\n\7\3\7\3\7\5\7\u00e8"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f2\n\7\3\7\3\7\5\7\u00f6\n"+
		"\7\3\7\3\7\3\7\5\7\u00fb\n\7\3\b\3\b\3\b\3\b\5\b\u0101\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0109\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0113\n"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u012c\n\16\3\17\3\17\5\17"+
		"\u0130\n\17\3\17\3\17\5\17\u0134\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0147\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u014d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u015f\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u0170\n\25\3\25\3\25\5\25\u0174\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u017f\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u018b\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0192\n\30\3"+
		"\30\3\30\5\30\u0196\n\30\3\30\3\30\3\30\5\30\u019b\n\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01b7\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01bf\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u01c6"+
		"\n\34\3\34\3\34\5\34\u01ca\n\34\3\34\3\34\3\34\5\34\u01cf\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01ea\n\36\3\37"+
		"\3\37\5\37\u01ee\n\37\3\37\3\37\5\37\u01f2\n\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \5 \u01fb\n \3 \3 \5 \u01ff\n \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0209\n"+
		"!\3!\3!\5!\u020d\n!\3!\3!\3!\5!\u0212\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0225\n#\3$\3$\5$\u0229\n$\3$\3$\5$"+
		"\u022d\n$\3$\3$\3$\3$\3$\5$\u0234\n$\3$\3$\5$\u0238\n$\3$\3$\5$\u023c"+
		"\n$\3$\3$\3$\3$\3$\5$\u0243\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u0250"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0263\n"+
		"(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u0273\n+\3,\3,\3,\3,\5"+
		",\u0279\n,\3,\3,\5,\u027d\n,\3,\3,\5,\u0281\n,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u029a\n-\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\5/\u02a4\n/\3/\3/\5/\u02a8\n/\3/\3/\3/\5/\u02ad\n/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02d6\n\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02f2\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\58\u030c\n8\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0325\n:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\5"+
		"<\u0331\n<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\5@\u0360\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u036a\nA\3B\3B\3B\3B\2"+
		"\2C\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\2\4\4\2\3\3##\3\2!\"\2\u0399"+
		"\2\u0084\3\2\2\2\4\u009c\3\2\2\2\6\u00b3\3\2\2\2\b\u00c5\3\2\2\2\n\u00d6"+
		"\3\2\2\2\f\u00fa\3\2\2\2\16\u0100\3\2\2\2\20\u0108\3\2\2\2\22\u0112\3"+
		"\2\2\2\24\u0114\3\2\2\2\26\u0117\3\2\2\2\30\u011c\3\2\2\2\32\u012b\3\2"+
		"\2\2\34\u012d\3\2\2\2\36\u0146\3\2\2\2 \u014c\3\2\2\2\"\u015e\3\2\2\2"+
		"$\u0160\3\2\2\2&\u0165\3\2\2\2(\u016c\3\2\2\2*\u017e\3\2\2\2,\u018a\3"+
		"\2\2\2.\u019a\3\2\2\2\60\u019c\3\2\2\2\62\u01b6\3\2\2\2\64\u01be\3\2\2"+
		"\2\66\u01ce\3\2\2\28\u01d0\3\2\2\2:\u01e9\3\2\2\2<\u01eb\3\2\2\2>\u01f6"+
		"\3\2\2\2@\u0211\3\2\2\2B\u0213\3\2\2\2D\u0224\3\2\2\2F\u0242\3\2\2\2H"+
		"\u0244\3\2\2\2J\u024f\3\2\2\2L\u0251\3\2\2\2N\u0262\3\2\2\2P\u0264\3\2"+
		"\2\2R\u0267\3\2\2\2T\u0272\3\2\2\2V\u0274\3\2\2\2X\u0299\3\2\2\2Z\u029b"+
		"\3\2\2\2\\\u02ac\3\2\2\2^\u02ae\3\2\2\2`\u02b3\3\2\2\2b\u02b6\3\2\2\2"+
		"d\u02d5\3\2\2\2f\u02d7\3\2\2\2h\u02e0\3\2\2\2j\u02f1\3\2\2\2l\u02f3\3"+
		"\2\2\2n\u030b\3\2\2\2p\u030d\3\2\2\2r\u0324\3\2\2\2t\u0326\3\2\2\2v\u0330"+
		"\3\2\2\2x\u0332\3\2\2\2z\u0337\3\2\2\2|\u033a\3\2\2\2~\u035f\3\2\2\2\u0080"+
		"\u0369\3\2\2\2\u0082\u036b\3\2\2\2\u0084\u0085\5\4\3\2\u0085\u0086\b\2"+
		"\1\2\u0086\3\3\2\2\2\u0087\u0089\5\6\4\2\u0088\u008a\7R\2\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7L\2\2\u008c"+
		"\u008e\7R\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\b\3\1\2\u0090\u009d\3\2\2\2\u0091\u0093\5\6\4\2\u0092"+
		"\u0094\7R\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\7L\2\2\u0096\u0098\7R\2\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5\4\3\2\u009a\u009b\b\3\1\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0087\3\2\2\2\u009c\u0091\3\2\2\2\u009d\5\3\2\2\2"+
		"\u009e\u009f\5\b\5\2\u009f\u00a0\b\4\1\2\u00a0\u00b4\3\2\2\2\u00a1\u00a2"+
		"\58\35\2\u00a2\u00a3\b\4\1\2\u00a3\u00b4\3\2\2\2\u00a4\u00a5\5B\"\2\u00a5"+
		"\u00a6\b\4\1\2\u00a6\u00b4\3\2\2\2\u00a7\u00a8\5H%\2\u00a8\u00a9\b\4\1"+
		"\2\u00a9\u00b4\3\2\2\2\u00aa\u00ab\5R*\2\u00ab\u00ac\b\4\1\2\u00ac\u00b4"+
		"\3\2\2\2\u00ad\u00ae\5^\60\2\u00ae\u00af\b\4\1\2\u00af\u00b4\3\2\2\2\u00b0"+
		"\u00b1\5l\67\2\u00b1\u00b2\b\4\1\2\u00b2\u00b4\3\2\2\2\u00b3\u009e\3\2"+
		"\2\2\u00b3\u00a1\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3"+
		"\u00aa\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\7\3\2\2\2"+
		"\u00b5\u00b6\t\2\2\2\u00b6\u00b7\7R\2\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9"+
		"\7R\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\b\5\1\2\u00bb\u00c6\3\2\2\2\u00bc"+
		"\u00bd\t\2\2\2\u00bd\u00be\7R\2\2\u00be\u00bf\5\f\7\2\u00bf\u00c0\7R\2"+
		"\2\u00c0\u00c1\5\26\f\2\u00c1\u00c2\7R\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4"+
		"\b\5\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00b5\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c6"+
		"\t\3\2\2\2\u00c7\u00c8\5\30\r\2\u00c8\u00c9\b\6\1\2\u00c9\u00d7\3\2\2"+
		"\2\u00ca\u00cb\5\30\r\2\u00cb\u00cc\7R\2\2\u00cc\u00cd\5&\24\2\u00cd\u00ce"+
		"\b\6\1\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\7R\2\2\u00d1"+
		"\u00d2\5\"\22\2\u00d2\u00d3\7R\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d5\b\6"+
		"\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00c7\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6"+
		"\u00cf\3\2\2\2\u00d7\13\3\2\2\2\u00d8\u00d9\7O\2\2\u00d9\u00fb\b\7\1\2"+
		"\u00da\u00db\5\16\b\2\u00db\u00dc\7R\2\2\u00dc\u00dd\5\20\t\2\u00dd\u00de"+
		"\b\7\1\2\u00de\u00fb\3\2\2\2\u00df\u00e0\5\16\b\2\u00e0\u00e1\7R\2\2\u00e1"+
		"\u00e3\5\20\t\2\u00e2\u00e4\7R\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7M\2\2\u00e6\u00e8\7R\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\5\f\7\2\u00ea"+
		"\u00eb\b\7\1\2\u00eb\u00fb\3\2\2\2\u00ec\u00ed\5\20\t\2\u00ed\u00ee\b"+
		"\7\1\2\u00ee\u00fb\3\2\2\2\u00ef\u00f1\5\20\t\2\u00f0\u00f2\7R\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\7M"+
		"\2\2\u00f4\u00f6\7R\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\5\f\7\2\u00f8\u00f9\b\7\1\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00d8\3\2\2\2\u00fa\u00da\3\2\2\2\u00fa\u00df\3\2\2\2\u00fa"+
		"\u00ec\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fb\r\3\2\2\2\u00fc\u00fd\7\t\2\2"+
		"\u00fd\u0101\b\b\1\2\u00fe\u00ff\7\n\2\2\u00ff\u0101\b\b\1\2\u0100\u00fc"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\17\3\2\2\2\u0102\u0103\5r:\2\u0103"+
		"\u0104\b\t\1\2\u0104\u0109\3\2\2\2\u0105\u0106\5\22\n\2\u0106\u0107\b"+
		"\t\1\2\u0107\u0109\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0105\3\2\2\2\u0109"+
		"\21\3\2\2\2\u010a\u010b\5\24\13\2\u010b\u010c\b\n\1\2\u010c\u0113\3\2"+
		"\2\2\u010d\u010e\5\60\31\2\u010e\u010f\7N\2\2\u010f\u0110\5\24\13\2\u0110"+
		"\u0111\b\n\1\2\u0111\u0113\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010d\3\2"+
		"\2\2\u0113\23\3\2\2\2\u0114\u0115\5|?\2\u0115\u0116\b\13\1\2\u0116\25"+
		"\3\2\2\2\u0117\u0118\7\4\2\2\u0118\u0119\7R\2\2\u0119\u011a\5,\27\2\u011a"+
		"\u011b\b\f\1\2\u011b\27\3\2\2\2\u011c\u011d\7\5\2\2\u011d\u011e\7R\2\2"+
		"\u011e\u011f\5\32\16\2\u011f\u0120\b\r\1\2\u0120\31\3\2\2\2\u0121\u0122"+
		"\5\34\17\2\u0122\u0123\b\16\1\2\u0123\u012c\3\2\2\2\u0124\u0125\5\34\17"+
		"\2\u0125\u0126\7R\2\2\u0126\u0127\5 \21\2\u0127\u0128\7R\2\2\u0128\u0129"+
		"\5\32\16\2\u0129\u012a\b\16\1\2\u012a\u012c\3\2\2\2\u012b\u0121\3\2\2"+
		"\2\u012b\u0124\3\2\2\2\u012c\33\3\2\2\2\u012d\u012f\5\22\n\2\u012e\u0130"+
		"\7R\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\5\36\20\2\u0132\u0134\7R\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5\u0080A\2\u0136\u0137\b\17\1\2"+
		"\u0137\35\3\2\2\2\u0138\u0139\7C\2\2\u0139\u0147\b\20\1\2\u013a\u013b"+
		"\7D\2\2\u013b\u0147\b\20\1\2\u013c\u013d\7E\2\2\u013d\u0147\b\20\1\2\u013e"+
		"\u013f\7F\2\2\u013f\u0147\b\20\1\2\u0140\u0141\7G\2\2\u0141\u0147\b\20"+
		"\1\2\u0142\u0143\7H\2\2\u0143\u0147\b\20\1\2\u0144\u0145\7I\2\2\u0145"+
		"\u0147\b\20\1\2\u0146\u0138\3\2\2\2\u0146\u013a\3\2\2\2\u0146\u013c\3"+
		"\2\2\2\u0146\u013e\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0142\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\37\3\2\2\2\u0148\u0149\7\13\2\2\u0149\u014d\b\21"+
		"\1\2\u014a\u014b\7\f\2\2\u014b\u014d\b\21\1\2\u014c\u0148\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d!\3\2\2\2\u014e\u014f\7\6\2\2\u014f\u0150\7R\2\2\u0150"+
		"\u0151\7\32\2\2\u0151\u0152\7R\2\2\u0152\u0153\5\66\34\2\u0153\u0154\b"+
		"\22\1\2\u0154\u015f\3\2\2\2\u0155\u0156\7\6\2\2\u0156\u0157\7R\2\2\u0157"+
		"\u0158\7\32\2\2\u0158\u0159\7R\2\2\u0159\u015a\5\66\34\2\u015a\u015b\7"+
		"R\2\2\u015b\u015c\5$\23\2\u015c\u015d\b\22\1\2\u015d\u015f\3\2\2\2\u015e"+
		"\u014e\3\2\2\2\u015e\u0155\3\2\2\2\u015f#\3\2\2\2\u0160\u0161\7\7\2\2"+
		"\u0161\u0162\7R\2\2\u0162\u0163\5\32\16\2\u0163\u0164\b\23\1\2\u0164%"+
		"\3\2\2\2\u0165\u0166\7\b\2\2\u0166\u0167\7R\2\2\u0167\u0168\7\32\2\2\u0168"+
		"\u0169\7R\2\2\u0169\u016a\5(\25\2\u016a\u016b\b\24\1\2\u016b\'\3\2\2\2"+
		"\u016c\u016d\5\22\n\2\u016d\u016f\5*\26\2\u016e\u0170\7R\2\2\u016f\u016e"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\7M\2\2\u0172"+
		"\u0174\7R\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0176\5(\25\2\u0176\u0177\b\25\1\2\u0177)\3\2\2\2\u0178\u0179"+
		"\7R\2\2\u0179\u017a\7\20\2\2\u017a\u017f\b\26\1\2\u017b\u017c\7R\2\2\u017c"+
		"\u017d\7\21\2\2\u017d\u017f\b\26\1\2\u017e\u0178\3\2\2\2\u017e\u017b\3"+
		"\2\2\2\u017f+\3\2\2\2\u0180\u0181\5.\30\2\u0181\u0182\b\27\1\2\u0182\u018b"+
		"\3\2\2\2\u0183\u0184\5.\30\2\u0184\u0185\7R\2\2\u0185\u0186\5\62\32\2"+
		"\u0186\u0187\7R\2\2\u0187\u0188\5,\27\2\u0188\u0189\b\27\1\2\u0189\u018b"+
		"\3\2\2\2\u018a\u0180\3\2\2\2\u018a\u0183\3\2\2\2\u018b-\3\2\2\2\u018c"+
		"\u018d\5\60\31\2\u018d\u018e\b\30\1\2\u018e\u019b\3\2\2\2\u018f\u0191"+
		"\7A\2\2\u0190\u0192\7R\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\5\b\5\2\u0194\u0196\7R\2\2\u0195\u0194\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7B\2\2\u0198"+
		"\u0199\b\30\1\2\u0199\u019b\3\2\2\2\u019a\u018c\3\2\2\2\u019a\u018f\3"+
		"\2\2\2\u019b/\3\2\2\2\u019c\u019d\5|?\2\u019d\u019e\b\31\1\2\u019e\61"+
		"\3\2\2\2\u019f\u01a0\7M\2\2\u01a0\u01b7\b\32\1\2\u01a1\u01a2\7(\2\2\u01a2"+
		"\u01b7\b\32\1\2\u01a3\u01a4\7)\2\2\u01a4\u01a5\7R\2\2\u01a5\u01a6\7(\2"+
		"\2\u01a6\u01b7\b\32\1\2\u01a7\u01a8\7*\2\2\u01a8\u01a9\7R\2\2\u01a9\u01aa"+
		"\7(\2\2\u01aa\u01b7\b\32\1\2\u01ab\u01ac\7+\2\2\u01ac\u01ad\7R\2\2\u01ad"+
		"\u01ae\7(\2\2\u01ae\u01b7\b\32\1\2\u01af\u01b0\5\64\33\2\u01b0\u01b1\7"+
		"R\2\2\u01b1\u01b2\7/\2\2\u01b2\u01b3\7R\2\2\u01b3\u01b4\7(\2\2\u01b4\u01b5"+
		"\b\32\1\2\u01b5\u01b7\3\2\2\2\u01b6\u019f\3\2\2\2\u01b6\u01a1\3\2\2\2"+
		"\u01b6\u01a3\3\2\2\2\u01b6\u01a7\3\2\2\2\u01b6\u01ab\3\2\2\2\u01b6\u01af"+
		"\3\2\2\2\u01b7\63\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9\u01bf\b\33\1\2\u01ba"+
		"\u01bb\7-\2\2\u01bb\u01bf\b\33\1\2\u01bc\u01bd\7.\2\2\u01bd\u01bf\b\33"+
		"\1\2\u01be\u01b8\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\65\3\2\2\2\u01c0\u01c1\5\22\n\2\u01c1\u01c2\b\34\1\2\u01c2\u01cf\3\2"+
		"\2\2\u01c3\u01c5\5\22\n\2\u01c4\u01c6\7R\2\2\u01c5\u01c4\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\7M\2\2\u01c8\u01ca\7R\2"+
		"\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc"+
		"\5\66\34\2\u01cc\u01cd\b\34\1\2\u01cd\u01cf\3\2\2\2\u01ce\u01c0\3\2\2"+
		"\2\u01ce\u01c3\3\2\2\2\u01cf\67\3\2\2\2\u01d0\u01d1\7$\2\2\u01d1\u01d2"+
		"\7R\2\2\u01d2\u01d3\7%\2\2\u01d3\u01d4\7R\2\2\u01d4\u01d5\5\60\31\2\u01d5"+
		"\u01d6\7R\2\2\u01d6\u01d7\5:\36\2\u01d7\u01d8\b\35\1\2\u01d89\3\2\2\2"+
		"\u01d9\u01da\5> \2\u01da\u01db\b\36\1\2\u01db\u01ea\3\2\2\2\u01dc\u01dd"+
		"\5\b\5\2\u01dd\u01de\b\36\1\2\u01de\u01ea\3\2\2\2\u01df\u01e0\5<\37\2"+
		"\u01e0\u01e1\7R\2\2\u01e1\u01e2\5> \2\u01e2\u01e3\b\36\1\2\u01e3\u01ea"+
		"\3\2\2\2\u01e4\u01e5\5<\37\2\u01e5\u01e6\7R\2\2\u01e6\u01e7\5\b\5\2\u01e7"+
		"\u01e8\b\36\1\2\u01e8\u01ea\3\2\2\2\u01e9\u01d9\3\2\2\2\u01e9\u01dc\3"+
		"\2\2\2\u01e9\u01df\3\2\2\2\u01e9\u01e4\3\2\2\2\u01ea;\3\2\2\2\u01eb\u01ed"+
		"\7A\2\2\u01ec\u01ee\7R\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f1\5\66\34\2\u01f0\u01f2\7R\2\2\u01f1\u01f0\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7B\2\2\u01f4"+
		"\u01f5\b\37\1\2\u01f5=\3\2\2\2\u01f6\u01f7\7&\2\2\u01f7\u01f8\7R\2\2\u01f8"+
		"\u01fa\7A\2\2\u01f9\u01fb\7R\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\5@!\2\u01fd\u01ff\7R\2\2\u01fe\u01fd"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7B\2\2\u0201"+
		"\u0202\b \1\2\u0202?\3\2\2\2\u0203\u0204\5\u0080A\2\u0204\u0205\b!\1\2"+
		"\u0205\u0212\3\2\2\2\u0206\u0208\5\u0080A\2\u0207\u0209\7R\2\2\u0208\u0207"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\7M\2\2\u020b"+
		"\u020d\7R\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020f\5@!\2\u020f\u0210\b!\1\2\u0210\u0212\3\2\2\2\u0211\u0203"+
		"\3\2\2\2\u0211\u0206\3\2\2\2\u0212A\3\2\2\2\u0213\u0214\7\'\2\2\u0214"+
		"\u0215\7R\2\2\u0215\u0216\5\60\31\2\u0216\u0217\7R\2\2\u0217\u0218\7\31"+
		"\2\2\u0218\u0219\7R\2\2\u0219\u021a\5D#\2\u021a\u021b\b\"\1\2\u021bC\3"+
		"\2\2\2\u021c\u021d\5F$\2\u021d\u021e\b#\1\2\u021e\u0225\3\2\2\2\u021f"+
		"\u0220\5F$\2\u0220\u0221\7R\2\2\u0221\u0222\5\30\r\2\u0222\u0223\b#\1"+
		"\2\u0223\u0225\3\2\2\2\u0224\u021c\3\2\2\2\u0224\u021f\3\2\2\2\u0225E"+
		"\3\2\2\2\u0226\u0228\5\24\13\2\u0227\u0229\7R\2\2\u0228\u0227\3\2\2\2"+
		"\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\7C\2\2\u022b\u022d"+
		"\7R\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\5\u0080A\2\u022f\u0230\b$\1\2\u0230\u0243\3\2\2\2\u0231\u0233\5"+
		"\24\13\2\u0232\u0234\7R\2\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u0237\7C\2\2\u0236\u0238\7R\2\2\u0237\u0236\3\2\2"+
		"\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\5\u0080A\2\u023a"+
		"\u023c\7R\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023d\u023e\7M\2\2\u023e\u023f\7R\2\2\u023f\u0240\5F$\2\u0240\u0241"+
		"\b$\1\2\u0241\u0243\3\2\2\2\u0242\u0226\3\2\2\2\u0242\u0231\3\2\2\2\u0243"+
		"G\3\2\2\2\u0244\u0245\t\3\2\2\u0245\u0246\7R\2\2\u0246\u0247\5J&\2\u0247"+
		"\u0248\b%\1\2\u0248I\3\2\2\2\u0249\u024a\5L\'\2\u024a\u024b\b&\1\2\u024b"+
		"\u0250\3\2\2\2\u024c\u024d\5N(\2\u024d\u024e\b&\1\2\u024e\u0250\3\2\2"+
		"\2\u024f\u0249\3\2\2\2\u024f\u024c\3\2\2\2\u0250K\3\2\2\2\u0251\u0252"+
		"\7\24\2\2\u0252\u0253\7R\2\2\u0253\u0254\5P)\2\u0254\u0255\b\'\1\2\u0255"+
		"M\3\2\2\2\u0256\u0257\7\4\2\2\u0257\u0258\7R\2\2\u0258\u0259\5\60\31\2"+
		"\u0259\u025a\b(\1\2\u025a\u0263\3\2\2\2\u025b\u025c\7\4\2\2\u025c\u025d"+
		"\7R\2\2\u025d\u025e\5\60\31\2\u025e\u025f\7R\2\2\u025f\u0260\5\30\r\2"+
		"\u0260\u0261\b(\1\2\u0261\u0263\3\2\2\2\u0262\u0256\3\2\2\2\u0262\u025b"+
		"\3\2\2\2\u0263O\3\2\2\2\u0264\u0265\5|?\2\u0265\u0266\b)\1\2\u0266Q\3"+
		"\2\2\2\u0267\u0268\7\22\2\2\u0268\u0269\7R\2\2\u0269\u026a\5T+\2\u026a"+
		"\u026b\b*\1\2\u026bS\3\2\2\2\u026c\u026d\5V,\2\u026d\u026e\b+\1\2\u026e"+
		"\u0273\3\2\2\2\u026f\u0270\5X-\2\u0270\u0271\b+\1\2\u0271\u0273\3\2\2"+
		"\2\u0272\u026c\3\2\2\2\u0272\u026f\3\2\2\2\u0273U\3\2\2\2\u0274\u0275"+
		"\7\25\2\2\u0275\u0276\7R\2\2\u0276\u0278\5\60\31\2\u0277\u0279\7R\2\2"+
		"\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c"+
		"\7A\2\2\u027b\u027d\7R\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u0280\5\\/\2\u027f\u0281\7R\2\2\u0280\u027f\3\2\2"+
		"\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\7B\2\2\u0283\u0284"+
		"\b,\1\2\u0284W\3\2\2\2\u0285\u0286\7\26\2\2\u0286\u0287\7R\2\2\u0287\u0288"+
		"\5\60\31\2\u0288\u0289\7R\2\2\u0289\u028a\7 \2\2\u028a\u028b\7R\2\2\u028b"+
		"\u028c\5\b\5\2\u028c\u028d\b-\1\2\u028d\u029a\3\2\2\2\u028e\u028f\7\26"+
		"\2\2\u028f\u0290\7R\2\2\u0290\u0291\5\60\31\2\u0291\u0292\7R\2\2\u0292"+
		"\u0293\5Z.\2\u0293\u0294\7R\2\2\u0294\u0295\7 \2\2\u0295\u0296\7R\2\2"+
		"\u0296\u0297\5\b\5\2\u0297\u0298\b-\1\2\u0298\u029a\3\2\2\2\u0299\u0285"+
		"\3\2\2\2\u0299\u028e\3\2\2\2\u029aY\3\2\2\2\u029b\u029c\5\66\34\2\u029c"+
		"\u029d\b.\1\2\u029d[\3\2\2\2\u029e\u029f\5x=\2\u029f\u02a0\b/\1\2\u02a0"+
		"\u02ad\3\2\2\2\u02a1\u02a3\5x=\2\u02a2\u02a4\7R\2\2\u02a3\u02a2\3\2\2"+
		"\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\7M\2\2\u02a6\u02a8"+
		"\7R\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02aa\5\\/\2\u02aa\u02ab\b/\1\2\u02ab\u02ad\3\2\2\2\u02ac\u029e\3\2\2"+
		"\2\u02ac\u02a1\3\2\2\2\u02ad]\3\2\2\2\u02ae\u02af\7\17\2\2\u02af\u02b0"+
		"\7R\2\2\u02b0\u02b1\5`\61\2\u02b1\u02b2\b\60\1\2\u02b2_\3\2\2\2\u02b3"+
		"\u02b4\5b\62\2\u02b4\u02b5\b\61\1\2\u02b5a\3\2\2\2\u02b6\u02b7\7\25\2"+
		"\2\u02b7\u02b8\7R\2\2\u02b8\u02b9\5\60\31\2\u02b9\u02ba\7R\2\2\u02ba\u02bb"+
		"\5d\63\2\u02bb\u02bc\b\62\1\2\u02bcc\3\2\2\2\u02bd\u02be\5f\64\2\u02be"+
		"\u02bf\b\63\1\2\u02bf\u02d6\3\2\2\2\u02c0\u02c1\5f\64\2\u02c1\u02c2\7"+
		"R\2\2\u02c2\u02c3\5d\63\2\u02c3\u02c4\b\63\1\2\u02c4\u02d6\3\2\2\2\u02c5"+
		"\u02c6\5h\65\2\u02c6\u02c7\b\63\1\2\u02c7\u02d6\3\2\2\2\u02c8\u02c9\5"+
		"h\65\2\u02c9\u02ca\7R\2\2\u02ca\u02cb\5d\63\2\u02cb\u02cc\b\63\1\2\u02cc"+
		"\u02d6\3\2\2\2\u02cd\u02ce\5j\66\2\u02ce\u02cf\b\63\1\2\u02cf\u02d6\3"+
		"\2\2\2\u02d0\u02d1\5j\66\2\u02d1\u02d2\7R\2\2\u02d2\u02d3\5d\63\2\u02d3"+
		"\u02d4\b\63\1\2\u02d4\u02d6\3\2\2\2\u02d5\u02bd\3\2\2\2\u02d5\u02c0\3"+
		"\2\2\2\u02d5\u02c5\3\2\2\2\u02d5\u02c8\3\2\2\2\u02d5\u02cd\3\2\2\2\u02d5"+
		"\u02d0\3\2\2\2\u02d6e\3\2\2\2\u02d7\u02d8\7\36\2\2\u02d8\u02d9\7R\2\2"+
		"\u02d9\u02da\5\24\13\2\u02da\u02db\7R\2\2\u02db\u02dc\7\37\2\2\u02dc\u02dd"+
		"\7R\2\2\u02dd\u02de\5\24\13\2\u02de\u02df\b\64\1\2\u02dfg\3\2\2\2\u02e0"+
		"\u02e1\7\16\2\2\u02e1\u02e2\7R\2\2\u02e2\u02e3\5x=\2\u02e3\u02e4\b\65"+
		"\1\2\u02e4i\3\2\2\2\u02e5\u02e6\7\30\2\2\u02e6\u02e7\7R\2\2\u02e7\u02e8"+
		"\5\24\13\2\u02e8\u02e9\b\66\1\2\u02e9\u02f2\3\2\2\2\u02ea\u02eb\7\30\2"+
		"\2\u02eb\u02ec\7R\2\2\u02ec\u02ed\5\24\13\2\u02ed\u02ee\7R\2\2\u02ee\u02ef"+
		"\5j\66\2\u02ef\u02f0\b\66\1\2\u02f0\u02f2\3\2\2\2\u02f1\u02e5\3\2\2\2"+
		"\u02f1\u02ea\3\2\2\2\u02f2k\3\2\2\2\u02f3\u02f4\7\30\2\2\u02f4\u02f5\7"+
		"R\2\2\u02f5\u02f6\5n8\2\u02f6\u02f7\b\67\1\2\u02f7m\3\2\2\2\u02f8\u02f9"+
		"\7\24\2\2\u02f9\u02fa\5P)\2\u02fa\u02fb\b8\1\2\u02fb\u030c\3\2\2\2\u02fc"+
		"\u02fd\7\25\2\2\u02fd\u02fe\7R\2\2\u02fe\u02ff\5\60\31\2\u02ff\u0300\b"+
		"8\1\2\u0300\u030c\3\2\2\2\u0301\u0302\7\26\2\2\u0302\u0303\7R\2\2\u0303"+
		"\u0304\5p9\2\u0304\u0305\b8\1\2\u0305\u030c\3\2\2\2\u0306\u0307\7\27\2"+
		"\2\u0307\u0308\7R\2\2\u0308\u0309\5\24\13\2\u0309\u030a\b8\1\2\u030a\u030c"+
		"\3\2\2\2\u030b\u02f8\3\2\2\2\u030b\u02fc\3\2\2\2\u030b\u0301\3\2\2\2\u030b"+
		"\u0306\3\2\2\2\u030co\3\2\2\2\u030d\u030e\5|?\2\u030e\u030f\b9\1\2\u030f"+
		"q\3\2\2\2\u0310\u0311\7\60\2\2\u0311\u0312\5t;\2\u0312\u0313\b:\1\2\u0313"+
		"\u0325\3\2\2\2\u0314\u0315\7\61\2\2\u0315\u0316\5t;\2\u0316\u0317\b:\1"+
		"\2\u0317\u0325\3\2\2\2\u0318\u0319\7\62\2\2\u0319\u031a\5t;\2\u031a\u031b"+
		"\b:\1\2\u031b\u0325\3\2\2\2\u031c\u031d\7\63\2\2\u031d\u031e\5t;\2\u031e"+
		"\u031f\b:\1\2\u031f\u0325\3\2\2\2\u0320\u0321\7\64\2\2\u0321\u0322\5t"+
		";\2\u0322\u0323\b:\1\2\u0323\u0325\3\2\2\2\u0324\u0310\3\2\2\2\u0324\u0314"+
		"\3\2\2\2\u0324\u0318\3\2\2\2\u0324\u031c\3\2\2\2\u0324\u0320\3\2\2\2\u0325"+
		"s\3\2\2\2\u0326\u0327\7A\2\2\u0327\u0328\5v<\2\u0328\u0329\7B\2\2\u0329"+
		"\u032a\b;\1\2\u032au\3\2\2\2\u032b\u032c\7O\2\2\u032c\u0331\b<\1\2\u032d"+
		"\u032e\5\22\n\2\u032e\u032f\b<\1\2\u032f\u0331\3\2\2\2\u0330\u032b\3\2"+
		"\2\2\u0330\u032d\3\2\2\2\u0331w\3\2\2\2\u0332\u0333\5\24\13\2\u0333\u0334"+
		"\7R\2\2\u0334\u0335\5z>\2\u0335\u0336\b=\1\2\u0336y\3\2\2\2\u0337\u0338"+
		"\5~@\2\u0338\u0339\b>\1\2\u0339{\3\2\2\2\u033a\u033b\7P\2\2\u033b\u033c"+
		"\b?\1\2\u033c}\3\2\2\2\u033d\u033e\7\65\2\2\u033e\u0360\b@\1\2\u033f\u0340"+
		"\7\66\2\2\u0340\u0360\b@\1\2\u0341\u0342\7\67\2\2\u0342\u0360\b@\1\2\u0343"+
		"\u0344\78\2\2\u0344\u0360\b@\1\2\u0345\u0346\79\2\2\u0346\u0360\b@\1\2"+
		"\u0347\u0348\7:\2\2\u0348\u0360\b@\1\2\u0349\u034a\7;\2\2\u034a\u0360"+
		"\b@\1\2\u034b\u034c\7<\2\2\u034c\u0360\b@\1\2\u034d\u034e\7<\2\2\u034e"+
		"\u034f\7A\2\2\u034f\u0350\7Q\2\2\u0350\u0351\7B\2\2\u0351\u0360\b@\1\2"+
		"\u0352\u0353\7=\2\2\u0353\u0360\b@\1\2\u0354\u0355\7=\2\2\u0355\u0356"+
		"\7A\2\2\u0356\u0357\7Q\2\2\u0357\u0358\7B\2\2\u0358\u0360\b@\1\2\u0359"+
		"\u035a\7>\2\2\u035a\u0360\b@\1\2\u035b\u035c\7?\2\2\u035c\u0360\b@\1\2"+
		"\u035d\u035e\7@\2\2\u035e\u0360\b@\1\2\u035f\u033d\3\2\2\2\u035f\u033f"+
		"\3\2\2\2\u035f\u0341\3\2\2\2\u035f\u0343\3\2\2\2\u035f\u0345\3\2\2\2\u035f"+
		"\u0347\3\2\2\2\u035f\u0349\3\2\2\2\u035f\u034b\3\2\2\2\u035f\u034d\3\2"+
		"\2\2\u035f\u0352\3\2\2\2\u035f\u0354\3\2\2\2\u035f\u0359\3\2\2\2\u035f"+
		"\u035b\3\2\2\2\u035f\u035d\3\2\2\2\u0360\177\3\2\2\2\u0361\u0362\5\u0082"+
		"B\2\u0362\u0363\bA\1\2\u0363\u036a\3\2\2\2\u0364\u0365\7K\2\2\u0365\u0366"+
		"\5\u0080A\2\u0366\u0367\7K\2\2\u0367\u0368\bA\1\2\u0368\u036a\3\2\2\2"+
		"\u0369\u0361\3\2\2\2\u0369\u0364\3\2\2\2\u036a\u0081\3\2\2\2\u036b\u036c"+
		"\7P\2\2\u036c\u036d\bB\1\2\u036d\u0083\3\2\2\2D\u0089\u008d\u0093\u0097"+
		"\u009c\u00b3\u00c5\u00d6\u00e3\u00e7\u00f1\u00f5\u00fa\u0100\u0108\u0112"+
		"\u012b\u012f\u0133\u0146\u014c\u015e\u016f\u0173\u017e\u018a\u0191\u0195"+
		"\u019a\u01b6\u01be\u01c5\u01c9\u01ce\u01e9\u01ed\u01f1\u01fa\u01fe\u0208"+
		"\u020c\u0211\u0224\u0228\u022c\u0233\u0237\u023b\u0242\u024f\u0262\u0272"+
		"\u0278\u027c\u0280\u0299\u02a3\u02a7\u02ac\u02d5\u02f1\u030b\u0324\u0330"+
		"\u035f\u0369";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}