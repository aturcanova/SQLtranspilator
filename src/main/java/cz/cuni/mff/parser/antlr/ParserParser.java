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
		INSERT=34, INTO=35, VALUES=36, UPDATE=37, LEFT_BRACKET=38, RIGHT_BRACKET=39, 
		EQUALITY=40, SEMICOLON=41, COMMA=42, DOT=43, WS=44, TOKEN=45, NAME=46, 
		ANY=47;
	public static final int
		RULE_main = 0, RULE_statement = 1, RULE_statement_type = 2, RULE_select_statement = 3, 
		RULE_select_stmnt = 4, RULE_select_parameters = 5, RULE_select_distinct_all = 6, 
		RULE_select_params = 7, RULE_column = 8, RULE_column_name = 9, RULE_from_statement = 10, 
		RULE_where_statement = 11, RULE_conditions = 12, RULE_logical_ops = 13, 
		RULE_group_by_statment = 14, RULE_having_statement = 15, RULE_order_by_statement = 16, 
		RULE_tables = 17, RULE_table_name = 18, RULE_columns = 19, RULE_insert_into_statement = 20, 
		RULE_insert_into_stmnt = 21, RULE_insert_columns = 22, RULE_instert_values = 23, 
		RULE_values = 24, RULE_value = 25, RULE_update_statement = 26, RULE_update_stmnt = 27, 
		RULE_update_columns = 28, RULE_delete_statement = 29, RULE_delete_stmnt = 30, 
		RULE_delete_database = 31, RULE_delete_from = 32, RULE_database_name = 33, 
		RULE_create_statement = 34, RULE_create_stmnt = 35, RULE_create_table = 36, 
		RULE_create_view = 37, RULE_create_view_columns = 38, RULE_columns_definition = 39, 
		RULE_alter_statement = 40, RULE_alter_stmnt = 41, RULE_alter_table = 42, 
		RULE_alter_tab = 43, RULE_rename_statement = 44, RULE_add_statement = 45, 
		RULE_drop_columns = 46, RULE_drop_statement = 47, RULE_drop_stmnt = 48, 
		RULE_view_name = 49, RULE_column_definition = 50, RULE_name = 51;
	public static final String[] ruleNames = {
		"main", "statement", "statement_type", "select_statement", "select_stmnt", 
		"select_parameters", "select_distinct_all", "select_params", "column", 
		"column_name", "from_statement", "where_statement", "conditions", "logical_ops", 
		"group_by_statment", "having_statement", "order_by_statement", "tables", 
		"table_name", "columns", "insert_into_statement", "insert_into_stmnt", 
		"insert_columns", "instert_values", "values", "value", "update_statement", 
		"update_stmnt", "update_columns", "delete_statement", "delete_stmnt", 
		"delete_database", "delete_from", "database_name", "create_statement", 
		"create_stmnt", "create_table", "create_view", "create_view_columns", 
		"columns_definition", "alter_statement", "alter_stmnt", "alter_table", 
		"alter_tab", "rename_statement", "add_statement", "drop_columns", "drop_statement", 
		"drop_stmnt", "view_name", "column_definition", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'WHERE'", "'GROUP'", "'HAVING'", "'ORDER'", 
		"'DISTINCT'", "'ALL'", "'AND'", "'OR'", "'NOT'", "'ADD'", "'ALTER'", "'ASC'", 
		"'DESC'", "'CREATE'", "'SCHEMA'", "'DATABASE'", "'TABLE'", "'VIEW'", "'COLUMN'", 
		"'DROP'", "'SET'", "'BY'", "'PRIMARY'", "'KEY'", "'UNIQUE'", "'RENAME'", 
		"'TO'", "'AS'", "'DEL'", "'DELETE'", "'SEL'", "'INSERT'", "'INTO'", "'VALUES'", 
		"'UPDATE'", "'('", "')'", "'='", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "ORDER", "DISTINCT", 
		"ALL", "AND", "OR", "NOT", "ADD", "ALTER", "ASC", "DESC", "CREATE", "SCHEMA", 
		"DATABASE", "TABLE", "VIEW", "COLUMN", "DROP", "SET", "BY", "PRIMARY", 
		"KEY", "UNIQUE", "RENAME", "TO", "AS", "DEL", "DELETE", "SEL", "INSERT", 
		"INTO", "VALUES", "UPDATE", "LEFT_BRACKET", "RIGHT_BRACKET", "EQUALITY", 
		"SEMICOLON", "COMMA", "DOT", "WS", "TOKEN", "NAME", "ANY"
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
			setState(104);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				statement_type();
				setState(107);
				match(WS);
				setState(108);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				statement_type();
				setState(111);
				match(WS);
				setState(112);
				match(SEMICOLON);
				setState(113);
				match(WS);
				setState(114);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case SEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				insert_into_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				update_statement();
				}
				break;
			case DEL:
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				delete_statement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				create_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				alter_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				match(WS);
				setState(129);
				select_parameters();
				setState(130);
				match(WS);
				setState(131);
				from_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==SELECT || _la==SEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				match(WS);
				setState(135);
				((Select_statementContext)_localctx).par = select_parameters();
				setState(136);
				match(WS);
				setState(137);
				from_statement();
				setState(138);
				match(WS);
				setState(139);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				where_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				where_statement();
				setState(146);
				match(WS);
				setState(147);
				order_by_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				where_statement();
				setState(150);
				match(WS);
				setState(151);
				group_by_statment();
				setState(152);
				match(WS);
				setState(153);
				order_by_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				select_params();
				}
				break;
			case DISTINCT:
			case ALL:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				select_distinct_all();
				setState(160);
				match(WS);
				setState(161);
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
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISTINCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(DISTINCT);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(ALL);
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 3);
				{
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				column();
				setState(172);
				match(WS);
				setState(173);
				match(COMMA);
				setState(174);
				match(WS);
				setState(175);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				table_name();
				setState(181);
				match(DOT);
				setState(182);
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
			setState(186);
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
			setState(188);
			match(FROM);
			setState(189);
			match(WS);
			setState(190);
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
			setState(192);
			match(WHERE);
			setState(193);
			match(WS);
			setState(194);
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
			setState(196);
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
			setState(198);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(GROUP);
				setState(201);
				match(WS);
				setState(202);
				match(BY);
				setState(203);
				match(WS);
				setState(204);
				columns();
				setState(205);
				match(WS);
				setState(206);
				having_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(GROUP);
				setState(209);
				match(WS);
				setState(210);
				match(BY);
				setState(211);
				match(WS);
				setState(212);
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
			setState(215);
			match(HAVING);
			setState(216);
			match(WS);
			setState(217);
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
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
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
			setState(219);
			match(ORDER);
			setState(220);
			match(WS);
			setState(221);
			match(BY);
			setState(222);
			match(WS);
			setState(223);
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

	public static class TablesContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
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
		enterRule(_localctx, 34, RULE_tables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			table_name();
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
		enterRule(_localctx, 36, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		enterRule(_localctx, 38, RULE_columns);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				column();
				setState(231);
				match(WS);
				setState(232);
				match(COMMA);
				setState(233);
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
		enterRule(_localctx, 40, RULE_insert_into_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(INSERT);
			setState(238);
			match(WS);
			setState(239);
			match(INTO);
			setState(240);
			match(WS);
			setState(241);
			table_name();
			setState(242);
			match(WS);
			setState(243);
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
		enterRule(_localctx, 42, RULE_insert_into_stmnt);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				instert_values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				select_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				insert_columns();
				setState(248);
				match(WS);
				setState(249);
				instert_values();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				insert_columns();
				setState(252);
				match(WS);
				setState(253);
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
		enterRule(_localctx, 44, RULE_insert_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(LEFT_BRACKET);
			setState(258);
			columns();
			setState(259);
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
		enterRule(_localctx, 46, RULE_instert_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(VALUES);
			setState(262);
			match(WS);
			setState(263);
			match(LEFT_BRACKET);
			setState(264);
			values();
			setState(265);
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
		enterRule(_localctx, 48, RULE_values);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				value();
				setState(269);
				match(COMMA);
				setState(270);
				match(WS);
				setState(271);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(ParserParser.TOKEN, 0); }
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
		enterRule(_localctx, 50, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 52, RULE_update_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(UPDATE);
			setState(278);
			match(WS);
			setState(279);
			table_name();
			setState(280);
			match(WS);
			setState(281);
			match(SET);
			setState(282);
			match(WS);
			setState(283);
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
		enterRule(_localctx, 54, RULE_update_stmnt);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				update_columns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				update_columns();
				setState(287);
				match(WS);
				setState(288);
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
		enterRule(_localctx, 56, RULE_update_columns);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				column_name();
				setState(293);
				match(EQUALITY);
				setState(294);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				column_name();
				setState(297);
				match(EQUALITY);
				setState(298);
				value();
				setState(299);
				match(COMMA);
				setState(300);
				match(WS);
				setState(301);
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
		enterRule(_localctx, 58, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==DEL || _la==DELETE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(306);
			match(WS);
			setState(307);
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
		enterRule(_localctx, 60, RULE_delete_stmnt);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				delete_database();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
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
		enterRule(_localctx, 62, RULE_delete_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(DATABASE);
			setState(314);
			match(WS);
			setState(315);
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
		enterRule(_localctx, 64, RULE_delete_from);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(FROM);
				setState(318);
				match(WS);
				setState(319);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(FROM);
				setState(321);
				match(WS);
				setState(322);
				table_name();
				setState(323);
				match(WS);
				setState(324);
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
		public TerminalNode TOKEN() { return getToken(ParserParser.TOKEN, 0); }
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
		enterRule(_localctx, 66, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		enterRule(_localctx, 68, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CREATE);
			setState(331);
			match(WS);
			setState(332);
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
		enterRule(_localctx, 70, RULE_create_stmnt);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				create_table();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
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
		enterRule(_localctx, 72, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(TABLE);
			setState(339);
			match(WS);
			setState(340);
			table_name();
			setState(341);
			match(WS);
			setState(342);
			match(LEFT_BRACKET);
			setState(343);
			match(WS);
			setState(344);
			columns_definition();
			setState(345);
			match(WS);
			setState(346);
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
		enterRule(_localctx, 74, RULE_create_view);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(VIEW);
				setState(349);
				match(WS);
				setState(350);
				table_name();
				setState(351);
				match(WS);
				setState(352);
				match(AS);
				setState(353);
				match(WS);
				setState(354);
				select_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(VIEW);
				setState(357);
				match(WS);
				setState(358);
				table_name();
				setState(359);
				match(WS);
				setState(360);
				create_view_columns();
				setState(361);
				match(WS);
				setState(362);
				match(AS);
				setState(363);
				match(WS);
				setState(364);
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
		enterRule(_localctx, 76, RULE_create_view_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		enterRule(_localctx, 78, RULE_columns_definition);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				column_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				column_definition();
				setState(372);
				match(COMMA);
				setState(373);
				match(WS);
				setState(374);
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
		enterRule(_localctx, 80, RULE_alter_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(ALTER);
			setState(379);
			match(WS);
			setState(380);
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
		enterRule(_localctx, 82, RULE_alter_stmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 84, RULE_alter_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(TABLE);
			setState(385);
			match(WS);
			setState(386);
			table_name();
			setState(387);
			match(WS);
			setState(388);
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
		enterRule(_localctx, 86, RULE_alter_tab);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				rename_statement();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				add_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				drop_columns();
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
		enterRule(_localctx, 88, RULE_rename_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(RENAME);
			setState(396);
			match(WS);
			setState(397);
			column_name();
			setState(398);
			match(WS);
			setState(399);
			match(TO);
			setState(400);
			match(WS);
			setState(401);
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
		enterRule(_localctx, 90, RULE_add_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(ADD);
			setState(404);
			match(WS);
			setState(405);
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
		enterRule(_localctx, 92, RULE_drop_columns);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(DROP);
				setState(408);
				match(WS);
				setState(409);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(DROP);
				setState(411);
				match(WS);
				setState(412);
				column_name();
				setState(413);
				match(WS);
				setState(414);
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
		enterRule(_localctx, 94, RULE_drop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(DROP);
			setState(419);
			match(WS);
			setState(420);
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
		enterRule(_localctx, 96, RULE_drop_stmnt);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATABASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(DATABASE);
				setState(423);
				database_name();
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(TABLE);
				setState(425);
				match(WS);
				setState(426);
				table_name();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(VIEW);
				setState(428);
				match(WS);
				setState(429);
				view_name();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
				match(COLUMN);
				setState(431);
				match(WS);
				setState(432);
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
		public TerminalNode TOKEN() { return getToken(ParserParser.TOKEN, 0); }
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
		enterRule(_localctx, 98, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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

	public static class Column_definitionContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(ParserParser.TOKEN, 0); }
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
		enterRule(_localctx, 100, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		enterRule(_localctx, 102, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01bc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3w\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a6\n"+
		"\7\3\b\3\b\3\b\5\b\u00ab\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00bb\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00d8\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00ee\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0102\n\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0114\n\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0125\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0132\n\36\3\37\3\37\3\37\3\37\3 \3 \5 \u013a\n \3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0149\n\"\3#\3#\3$\3$\3$\3$"+
		"\3%\3%\5%\u0153\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0171\n\'\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\5)\u017b\n)\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		"-\3-\3-\5-\u018c\n-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01a3\n\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01b4\n\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\5\4\2\3\3##\3"+
		"\2\13\f\3\2!\"\2\u01aa\2j\3\2\2\2\4v\3\2\2\2\6\177\3\2\2\2\b\u0090\3\2"+
		"\2\2\n\u009e\3\2\2\2\f\u00a5\3\2\2\2\16\u00aa\3\2\2\2\20\u00b3\3\2\2\2"+
		"\22\u00ba\3\2\2\2\24\u00bc\3\2\2\2\26\u00be\3\2\2\2\30\u00c2\3\2\2\2\32"+
		"\u00c6\3\2\2\2\34\u00c8\3\2\2\2\36\u00d7\3\2\2\2 \u00d9\3\2\2\2\"\u00dd"+
		"\3\2\2\2$\u00e3\3\2\2\2&\u00e5\3\2\2\2(\u00ed\3\2\2\2*\u00ef\3\2\2\2,"+
		"\u0101\3\2\2\2.\u0103\3\2\2\2\60\u0107\3\2\2\2\62\u0113\3\2\2\2\64\u0115"+
		"\3\2\2\2\66\u0117\3\2\2\28\u0124\3\2\2\2:\u0131\3\2\2\2<\u0133\3\2\2\2"+
		">\u0139\3\2\2\2@\u013b\3\2\2\2B\u0148\3\2\2\2D\u014a\3\2\2\2F\u014c\3"+
		"\2\2\2H\u0152\3\2\2\2J\u0154\3\2\2\2L\u0170\3\2\2\2N\u0172\3\2\2\2P\u017a"+
		"\3\2\2\2R\u017c\3\2\2\2T\u0180\3\2\2\2V\u0182\3\2\2\2X\u018b\3\2\2\2Z"+
		"\u018d\3\2\2\2\\\u0195\3\2\2\2^\u01a2\3\2\2\2`\u01a4\3\2\2\2b\u01b3\3"+
		"\2\2\2d\u01b5\3\2\2\2f\u01b7\3\2\2\2h\u01b9\3\2\2\2jk\5\4\3\2k\3\3\2\2"+
		"\2lm\5\6\4\2mn\7.\2\2no\7+\2\2ow\3\2\2\2pq\5\6\4\2qr\7.\2\2rs\7+\2\2s"+
		"t\7.\2\2tu\5\4\3\2uw\3\2\2\2vl\3\2\2\2vp\3\2\2\2w\5\3\2\2\2x\u0080\5\b"+
		"\5\2y\u0080\5*\26\2z\u0080\5\66\34\2{\u0080\5<\37\2|\u0080\5F$\2}\u0080"+
		"\5R*\2~\u0080\5`\61\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2"+
		"\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\7\3\2\2\2\u0081\u0082"+
		"\t\2\2\2\u0082\u0083\7.\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7.\2\2\u0085"+
		"\u0086\5\26\f\2\u0086\u0091\3\2\2\2\u0087\u0088\t\2\2\2\u0088\u0089\7"+
		".\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7.\2\2\u008b\u008c\5\26\f\2\u008c"+
		"\u008d\7.\2\2\u008d\u008e\5\n\6\2\u008e\u008f\b\5\1\2\u008f\u0091\3\2"+
		"\2\2\u0090\u0081\3\2\2\2\u0090\u0087\3\2\2\2\u0091\t\3\2\2\2\u0092\u009f"+
		"\5\30\r\2\u0093\u0094\5\30\r\2\u0094\u0095\7.\2\2\u0095\u0096\5\"\22\2"+
		"\u0096\u009f\3\2\2\2\u0097\u0098\5\30\r\2\u0098\u0099\7.\2\2\u0099\u009a"+
		"\5\36\20\2\u009a\u009b\7.\2\2\u009b\u009c\5\"\22\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009f\3\2\2\2\u009e\u0092\3\2\2\2\u009e\u0093\3\2\2\2\u009e\u0097"+
		"\3\2\2\2\u009e\u009d\3\2\2\2\u009f\13\3\2\2\2\u00a0\u00a6\5\20\t\2\u00a1"+
		"\u00a2\5\16\b\2\u00a2\u00a3\7.\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a6\3"+
		"\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\r\3\2\2\2\u00a7\u00ab"+
		"\7\t\2\2\u00a8\u00ab\7\n\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\17\3\2\2\2\u00ac\u00b4\5\22\n"+
		"\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7.\2\2\u00af\u00b0\7,\2\2\u00b0\u00b1"+
		"\7.\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b4\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3"+
		"\u00ad\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00bb\5\24\13\2\u00b6\u00b7\5&\24"+
		"\2\u00b7\u00b8\7-\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00bd\5h\65"+
		"\2\u00bd\25\3\2\2\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\7.\2\2\u00c0\u00c1"+
		"\5$\23\2\u00c1\27\3\2\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\7.\2\2\u00c4"+
		"\u00c5\5\32\16\2\u00c5\31\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7\33\3\2\2\2"+
		"\u00c8\u00c9\t\3\2\2\u00c9\35\3\2\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc"+
		"\7.\2\2\u00cc\u00cd\7\32\2\2\u00cd\u00ce\7.\2\2\u00ce\u00cf\5(\25\2\u00cf"+
		"\u00d0\7.\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d8\3\2\2\2\u00d2\u00d3\7\6"+
		"\2\2\u00d3\u00d4\7.\2\2\u00d4\u00d5\7\32\2\2\u00d5\u00d6\7.\2\2\u00d6"+
		"\u00d8\5(\25\2\u00d7\u00ca\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8\37\3\2\2"+
		"\2\u00d9\u00da\7\7\2\2\u00da\u00db\7.\2\2\u00db\u00dc\5\32\16\2\u00dc"+
		"!\3\2\2\2\u00dd\u00de\7\b\2\2\u00de\u00df\7.\2\2\u00df\u00e0\7\32\2\2"+
		"\u00e0\u00e1\7.\2\2\u00e1\u00e2\5(\25\2\u00e2#\3\2\2\2\u00e3\u00e4\5&"+
		"\24\2\u00e4%\3\2\2\2\u00e5\u00e6\5h\65\2\u00e6\'\3\2\2\2\u00e7\u00ee\5"+
		"\22\n\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\7.\2\2\u00ea\u00eb\7,\2\2\u00eb"+
		"\u00ec\5(\25\2\u00ec\u00ee\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2"+
		"\2\2\u00ee)\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f1\7.\2\2\u00f1\u00f2"+
		"\7%\2\2\u00f2\u00f3\7.\2\2\u00f3\u00f4\5&\24\2\u00f4\u00f5\7.\2\2\u00f5"+
		"\u00f6\5,\27\2\u00f6+\3\2\2\2\u00f7\u0102\5\60\31\2\u00f8\u0102\5\b\5"+
		"\2\u00f9\u00fa\5.\30\2\u00fa\u00fb\7.\2\2\u00fb\u00fc\5\60\31\2\u00fc"+
		"\u0102\3\2\2\2\u00fd\u00fe\5.\30\2\u00fe\u00ff\7.\2\2\u00ff\u0100\5\b"+
		"\5\2\u0100\u0102\3\2\2\2\u0101\u00f7\3\2\2\2\u0101\u00f8\3\2\2\2\u0101"+
		"\u00f9\3\2\2\2\u0101\u00fd\3\2\2\2\u0102-\3\2\2\2\u0103\u0104\7(\2\2\u0104"+
		"\u0105\5(\25\2\u0105\u0106\7)\2\2\u0106/\3\2\2\2\u0107\u0108\7&\2\2\u0108"+
		"\u0109\7.\2\2\u0109\u010a\7(\2\2\u010a\u010b\5\62\32\2\u010b\u010c\7)"+
		"\2\2\u010c\61\3\2\2\2\u010d\u0114\5\64\33\2\u010e\u010f\5\64\33\2\u010f"+
		"\u0110\7,\2\2\u0110\u0111\7.\2\2\u0111\u0112\5\62\32\2\u0112\u0114\3\2"+
		"\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0114\63\3\2\2\2\u0115\u0116"+
		"\7/\2\2\u0116\65\3\2\2\2\u0117\u0118\7\'\2\2\u0118\u0119\7.\2\2\u0119"+
		"\u011a\5&\24\2\u011a\u011b\7.\2\2\u011b\u011c\7\31\2\2\u011c\u011d\7."+
		"\2\2\u011d\u011e\58\35\2\u011e\67\3\2\2\2\u011f\u0125\5:\36\2\u0120\u0121"+
		"\5:\36\2\u0121\u0122\7.\2\2\u0122\u0123\5\30\r\2\u0123\u0125\3\2\2\2\u0124"+
		"\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u01259\3\2\2\2\u0126\u0127\5\24\13"+
		"\2\u0127\u0128\7*\2\2\u0128\u0129\5\64\33\2\u0129\u0132\3\2\2\2\u012a"+
		"\u012b\5\24\13\2\u012b\u012c\7*\2\2\u012c\u012d\5\64\33\2\u012d\u012e"+
		"\7,\2\2\u012e\u012f\7.\2\2\u012f\u0130\5:\36\2\u0130\u0132\3\2\2\2\u0131"+
		"\u0126\3\2\2\2\u0131\u012a\3\2\2\2\u0132;\3\2\2\2\u0133\u0134\t\4\2\2"+
		"\u0134\u0135\7.\2\2\u0135\u0136\5> \2\u0136=\3\2\2\2\u0137\u013a\5@!\2"+
		"\u0138\u013a\5B\"\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a?\3\2"+
		"\2\2\u013b\u013c\7\24\2\2\u013c\u013d\7.\2\2\u013d\u013e\5D#\2\u013eA"+
		"\3\2\2\2\u013f\u0140\7\4\2\2\u0140\u0141\7.\2\2\u0141\u0149\5&\24\2\u0142"+
		"\u0143\7\4\2\2\u0143\u0144\7.\2\2\u0144\u0145\5&\24\2\u0145\u0146\7.\2"+
		"\2\u0146\u0147\5\30\r\2\u0147\u0149\3\2\2\2\u0148\u013f\3\2\2\2\u0148"+
		"\u0142\3\2\2\2\u0149C\3\2\2\2\u014a\u014b\7/\2\2\u014bE\3\2\2\2\u014c"+
		"\u014d\7\22\2\2\u014d\u014e\7.\2\2\u014e\u014f\5H%\2\u014fG\3\2\2\2\u0150"+
		"\u0153\5J&\2\u0151\u0153\5L\'\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2"+
		"\2\u0153I\3\2\2\2\u0154\u0155\7\25\2\2\u0155\u0156\7.\2\2\u0156\u0157"+
		"\5&\24\2\u0157\u0158\7.\2\2\u0158\u0159\7(\2\2\u0159\u015a\7.\2\2\u015a"+
		"\u015b\5P)\2\u015b\u015c\7.\2\2\u015c\u015d\7)\2\2\u015dK\3\2\2\2\u015e"+
		"\u015f\7\26\2\2\u015f\u0160\7.\2\2\u0160\u0161\5&\24\2\u0161\u0162\7."+
		"\2\2\u0162\u0163\7 \2\2\u0163\u0164\7.\2\2\u0164\u0165\5\b\5\2\u0165\u0171"+
		"\3\2\2\2\u0166\u0167\7\26\2\2\u0167\u0168\7.\2\2\u0168\u0169\5&\24\2\u0169"+
		"\u016a\7.\2\2\u016a\u016b\5N(\2\u016b\u016c\7.\2\2\u016c\u016d\7 \2\2"+
		"\u016d\u016e\7.\2\2\u016e\u016f\5\b\5\2\u016f\u0171\3\2\2\2\u0170\u015e"+
		"\3\2\2\2\u0170\u0166\3\2\2\2\u0171M\3\2\2\2\u0172\u0173\5(\25\2\u0173"+
		"O\3\2\2\2\u0174\u017b\5f\64\2\u0175\u0176\5f\64\2\u0176\u0177\7,\2\2\u0177"+
		"\u0178\7.\2\2\u0178\u0179\5P)\2\u0179\u017b\3\2\2\2\u017a\u0174\3\2\2"+
		"\2\u017a\u0175\3\2\2\2\u017bQ\3\2\2\2\u017c\u017d\7\17\2\2\u017d\u017e"+
		"\7.\2\2\u017e\u017f\5T+\2\u017fS\3\2\2\2\u0180\u0181\5V,\2\u0181U\3\2"+
		"\2\2\u0182\u0183\7\25\2\2\u0183\u0184\7.\2\2\u0184\u0185\5&\24\2\u0185"+
		"\u0186\7.\2\2\u0186\u0187\5X-\2\u0187W\3\2\2\2\u0188\u018c\5Z.\2\u0189"+
		"\u018c\5\\/\2\u018a\u018c\5^\60\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018a\3\2\2\2\u018cY\3\2\2\2\u018d\u018e\7\36\2\2\u018e\u018f"+
		"\7.\2\2\u018f\u0190\5\24\13\2\u0190\u0191\7.\2\2\u0191\u0192\7\37\2\2"+
		"\u0192\u0193\7.\2\2\u0193\u0194\5\24\13\2\u0194[\3\2\2\2\u0195\u0196\7"+
		"\16\2\2\u0196\u0197\7.\2\2\u0197\u0198\5f\64\2\u0198]\3\2\2\2\u0199\u019a"+
		"\7\30\2\2\u019a\u019b\7.\2\2\u019b\u01a3\5\24\13\2\u019c\u019d\7\30\2"+
		"\2\u019d\u019e\7.\2\2\u019e\u019f\5\24\13\2\u019f\u01a0\7.\2\2\u01a0\u01a1"+
		"\5^\60\2\u01a1\u01a3\3\2\2\2\u01a2\u0199\3\2\2\2\u01a2\u019c\3\2\2\2\u01a3"+
		"_\3\2\2\2\u01a4\u01a5\7\30\2\2\u01a5\u01a6\7.\2\2\u01a6\u01a7\5b\62\2"+
		"\u01a7a\3\2\2\2\u01a8\u01a9\7\24\2\2\u01a9\u01b4\5D#\2\u01aa\u01ab\7\25"+
		"\2\2\u01ab\u01ac\7.\2\2\u01ac\u01b4\5&\24\2\u01ad\u01ae\7\26\2\2\u01ae"+
		"\u01af\7.\2\2\u01af\u01b4\5d\63\2\u01b0\u01b1\7\27\2\2\u01b1\u01b2\7."+
		"\2\2\u01b2\u01b4\5\24\13\2\u01b3\u01a8\3\2\2\2\u01b3\u01aa\3\2\2\2\u01b3"+
		"\u01ad\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b4c\3\2\2\2\u01b5\u01b6\7/\2\2\u01b6"+
		"e\3\2\2\2\u01b7\u01b8\7/\2\2\u01b8g\3\2\2\2\u01b9\u01ba\7\60\2\2\u01ba"+
		"i\3\2\2\2\30v\177\u0090\u009e\u00a5\u00aa\u00b3\u00ba\u00d7\u00ed\u0101"+
		"\u0113\u0124\u0131\u0139\u0148\u0152\u0170\u017a\u018b\u01a2\u01b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}