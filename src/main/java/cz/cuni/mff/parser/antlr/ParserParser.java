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
		KEY=26, UNIQUE=27, RENAME=28, TO=29, LEFT_BRACKET=30, RIGHT_BRACKET=31, 
		SEMICOLON=32, COMMA=33, WS=34, TOKEN=35, ANY=36;
	public static final int
		RULE_main = 0, RULE_statement = 1, RULE_statement_type = 2, RULE_select_statement = 3, 
		RULE_select_stmnt = 4, RULE_select_parameters = 5, RULE_select_distinct_all = 6, 
		RULE_select_params = 7, RULE_column_name = 8, RULE_from_statement = 9, 
		RULE_where_statement = 10, RULE_conditions = 11, RULE_logical_ops = 12, 
		RULE_group_by_statment = 13, RULE_having_statement = 14, RULE_order_by_statement = 15, 
		RULE_tables = 16, RULE_table = 17, RULE_columns = 18, RULE_insert_into_statement = 19, 
		RULE_update_statement = 20, RULE_delete_statement = 21, RULE_create_statement = 22, 
		RULE_alter_statement = 23, RULE_alter_stmnt = 24, RULE_alter_table = 25, 
		RULE_alter_tab = 26, RULE_rename_statement = 27, RULE_add_statement = 28, 
		RULE_drop_statement = 29, RULE_drop_stmnt = 30, RULE_column_definition = 31;
	public static final String[] ruleNames = {
		"main", "statement", "statement_type", "select_statement", "select_stmnt", 
		"select_parameters", "select_distinct_all", "select_params", "column_name", 
		"from_statement", "where_statement", "conditions", "logical_ops", "group_by_statment", 
		"having_statement", "order_by_statement", "tables", "table", "columns", 
		"insert_into_statement", "update_statement", "delete_statement", "create_statement", 
		"alter_statement", "alter_stmnt", "alter_table", "alter_tab", "rename_statement", 
		"add_statement", "drop_statement", "drop_stmnt", "column_definition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'WHERE'", "'GROUP'", "'HAVING'", "'ORDER'", 
		"'DISTINCT'", "'ALL'", "'AND'", "'OR'", "'NOT'", "'ADD'", "'ALTER'", "'ASC'", 
		"'DESC'", "'CREATE'", "'SCHEMA'", "'DATABASE'", "'TABLE'", "'VIEW'", "'COLUMN'", 
		"'DROP'", "'SET'", "'BY'", "'PRIMARY'", "'KEY'", "'UNIQUE'", "'RENAME'", 
		"'TO'", "'('", "')'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "GROUP", "HAVING", "ORDER", "DISTINCT", 
		"ALL", "AND", "OR", "NOT", "ADD", "ALTER", "ASC", "DESC", "CREATE", "SCHEMA", 
		"DATABASE", "TABLE", "VIEW", "COLUMN", "DROP", "SET", "BY", "PRIMARY", 
		"KEY", "UNIQUE", "RENAME", "TO", "LEFT_BRACKET", "RIGHT_BRACKET", "SEMICOLON", 
		"COMMA", "WS", "TOKEN", "ANY"
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
			setState(64);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				statement_type();
				setState(67);
				match(WS);
				setState(68);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				statement_type();
				setState(71);
				match(WS);
				setState(72);
				match(SEMICOLON);
				setState(73);
				match(WS);
				setState(74);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				select_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				insert_into_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				update_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				delete_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				create_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				alter_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				drop_statement();
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

	public static class Select_statementContext extends ParserRuleContext {
		public Select_parametersContext par;
		public TerminalNode SELECT() { return getToken(ParserParser.SELECT, 0); }
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
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(SELECT);
				setState(88);
				match(WS);
				setState(89);
				select_parameters();
				setState(90);
				match(WS);
				setState(91);
				from_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(SELECT);
				setState(94);
				match(WS);
				setState(95);
				((Select_statementContext)_localctx).par = select_parameters();
				setState(96);
				match(WS);
				setState(97);
				from_statement();
				setState(98);
				match(WS);
				setState(99);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				where_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				where_statement();
				setState(106);
				match(WS);
				setState(107);
				order_by_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				where_statement();
				setState(110);
				match(WS);
				setState(111);
				group_by_statment();
				setState(112);
				match(WS);
				setState(113);
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				select_params();
				}
				break;
			case DISTINCT:
			case ALL:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				select_distinct_all();
				setState(120);
				match(WS);
				setState(121);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISTINCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(DISTINCT);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
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
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				column_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				column_name();
				setState(132);
				match(WS);
				setState(133);
				match(COMMA);
				setState(134);
				match(WS);
				setState(135);
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

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(ParserParser.TOKEN, 0); }
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
		enterRule(_localctx, 16, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
		enterRule(_localctx, 18, RULE_from_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FROM);
			setState(142);
			match(WS);
			setState(143);
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
		enterRule(_localctx, 20, RULE_where_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(WHERE);
			setState(146);
			match(WS);
			setState(147);
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
		enterRule(_localctx, 22, RULE_conditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 24, RULE_logical_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 26, RULE_group_by_statment);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(GROUP);
				setState(154);
				match(WS);
				setState(155);
				match(BY);
				setState(156);
				match(WS);
				setState(157);
				columns();
				setState(158);
				match(WS);
				setState(159);
				having_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(GROUP);
				setState(162);
				match(WS);
				setState(163);
				match(BY);
				setState(164);
				match(WS);
				setState(165);
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
		enterRule(_localctx, 28, RULE_having_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(HAVING);
			setState(169);
			match(WS);
			setState(170);
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
		enterRule(_localctx, 30, RULE_order_by_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ORDER);
			setState(173);
			match(WS);
			setState(174);
			match(BY);
			setState(175);
			match(WS);
			setState(176);
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
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
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
		enterRule(_localctx, 32, RULE_tables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			table();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TOKEN() { return getToken(ParserParser.TOKEN, 0); }
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
		enterRule(_localctx, 34, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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

	public static class ColumnsContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
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
		enterRule(_localctx, 36, RULE_columns);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				column_name();
				setState(183);
				match(WS);
				setState(184);
				match(COMMA);
				setState(185);
				columns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
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

	public static class Insert_into_statementContext extends ParserRuleContext {
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
		enterRule(_localctx, 38, RULE_insert_into_statement);
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

	public static class Update_statementContext extends ParserRuleContext {
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
		enterRule(_localctx, 40, RULE_update_statement);
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

	public static class Delete_statementContext extends ParserRuleContext {
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
		enterRule(_localctx, 42, RULE_delete_statement);
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

	public static class Create_statementContext extends ParserRuleContext {
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
		enterRule(_localctx, 44, RULE_create_statement);
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
		enterRule(_localctx, 46, RULE_alter_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ALTER);
			setState(199);
			match(WS);
			setState(200);
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
		enterRule(_localctx, 48, RULE_alter_stmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
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
		enterRule(_localctx, 50, RULE_alter_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TABLE);
			setState(205);
			match(WS);
			setState(206);
			table();
			setState(207);
			match(WS);
			setState(208);
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
		enterRule(_localctx, 52, RULE_alter_tab);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				rename_statement();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				add_statement();
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
		enterRule(_localctx, 54, RULE_rename_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(RENAME);
			setState(215);
			match(WS);
			setState(216);
			column_name();
			setState(217);
			match(WS);
			setState(218);
			match(TO);
			setState(219);
			match(WS);
			setState(220);
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
		enterRule(_localctx, 56, RULE_add_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ADD);
			setState(223);
			match(WS);
			setState(224);
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
		enterRule(_localctx, 58, RULE_drop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(DROP);
			setState(227);
			match(WS);
			setState(228);
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
		public TerminalNode TABLE() { return getToken(ParserParser.TABLE, 0); }
		public TerminalNode WS() { return getToken(ParserParser.WS, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(ParserParser.VIEW, 0); }
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
		enterRule(_localctx, 60, RULE_drop_stmnt);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(TABLE);
				setState(231);
				match(WS);
				setState(232);
				table();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(VIEW);
				setState(234);
				match(WS);
				setState(235);
				table();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(COLUMN);
				setState(237);
				match(WS);
				setState(238);
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
		enterRule(_localctx, 62, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6w\n\6\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\5\b\u0083\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a9\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00bf\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\5\34\u00d7"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00f2\n \3!\3!\3!\2\2\""+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\3"+
		"\3\2\13\f\2\u00e9\2B\3\2\2\2\4N\3\2\2\2\6W\3\2\2\2\bh\3\2\2\2\nv\3\2\2"+
		"\2\f}\3\2\2\2\16\u0082\3\2\2\2\20\u008b\3\2\2\2\22\u008d\3\2\2\2\24\u008f"+
		"\3\2\2\2\26\u0093\3\2\2\2\30\u0097\3\2\2\2\32\u0099\3\2\2\2\34\u00a8\3"+
		"\2\2\2\36\u00aa\3\2\2\2 \u00ae\3\2\2\2\"\u00b4\3\2\2\2$\u00b6\3\2\2\2"+
		"&\u00be\3\2\2\2(\u00c0\3\2\2\2*\u00c2\3\2\2\2,\u00c4\3\2\2\2.\u00c6\3"+
		"\2\2\2\60\u00c8\3\2\2\2\62\u00cc\3\2\2\2\64\u00ce\3\2\2\2\66\u00d6\3\2"+
		"\2\28\u00d8\3\2\2\2:\u00e0\3\2\2\2<\u00e4\3\2\2\2>\u00f1\3\2\2\2@\u00f3"+
		"\3\2\2\2BC\5\4\3\2C\3\3\2\2\2DE\5\6\4\2EF\7$\2\2FG\7\"\2\2GO\3\2\2\2H"+
		"I\5\6\4\2IJ\7$\2\2JK\7\"\2\2KL\7$\2\2LM\5\4\3\2MO\3\2\2\2ND\3\2\2\2NH"+
		"\3\2\2\2O\5\3\2\2\2PX\5\b\5\2QX\5(\25\2RX\5*\26\2SX\5,\27\2TX\5.\30\2"+
		"UX\5\60\31\2VX\5<\37\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2"+
		"\2WU\3\2\2\2WV\3\2\2\2X\7\3\2\2\2YZ\7\3\2\2Z[\7$\2\2[\\\5\f\7\2\\]\7$"+
		"\2\2]^\5\24\13\2^i\3\2\2\2_`\7\3\2\2`a\7$\2\2ab\5\f\7\2bc\7$\2\2cd\5\24"+
		"\13\2de\7$\2\2ef\5\n\6\2fg\b\5\1\2gi\3\2\2\2hY\3\2\2\2h_\3\2\2\2i\t\3"+
		"\2\2\2jw\5\26\f\2kl\5\26\f\2lm\7$\2\2mn\5 \21\2nw\3\2\2\2op\5\26\f\2p"+
		"q\7$\2\2qr\5\34\17\2rs\7$\2\2st\5 \21\2tw\3\2\2\2uw\3\2\2\2vj\3\2\2\2"+
		"vk\3\2\2\2vo\3\2\2\2vu\3\2\2\2w\13\3\2\2\2x~\5\20\t\2yz\5\16\b\2z{\7$"+
		"\2\2{|\5\20\t\2|~\3\2\2\2}x\3\2\2\2}y\3\2\2\2~\r\3\2\2\2\177\u0083\7\t"+
		"\2\2\u0080\u0083\7\n\2\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\17\3\2\2\2\u0084\u008c\5\22\n\2\u0085"+
		"\u0086\5\22\n\2\u0086\u0087\7$\2\2\u0087\u0088\7#\2\2\u0088\u0089\7$\2"+
		"\2\u0089\u008a\5\20\t\2\u008a\u008c\3\2\2\2\u008b\u0084\3\2\2\2\u008b"+
		"\u0085\3\2\2\2\u008c\21\3\2\2\2\u008d\u008e\7%\2\2\u008e\23\3\2\2\2\u008f"+
		"\u0090\7\4\2\2\u0090\u0091\7$\2\2\u0091\u0092\5\"\22\2\u0092\25\3\2\2"+
		"\2\u0093\u0094\7\5\2\2\u0094\u0095\7$\2\2\u0095\u0096\5\30\r\2\u0096\27"+
		"\3\2\2\2\u0097\u0098\7%\2\2\u0098\31\3\2\2\2\u0099\u009a\t\2\2\2\u009a"+
		"\33\3\2\2\2\u009b\u009c\7\6\2\2\u009c\u009d\7$\2\2\u009d\u009e\7\32\2"+
		"\2\u009e\u009f\7$\2\2\u009f\u00a0\5&\24\2\u00a0\u00a1\7$\2\2\u00a1\u00a2"+
		"\5\36\20\2\u00a2\u00a9\3\2\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\7$\2\2"+
		"\u00a5\u00a6\7\32\2\2\u00a6\u00a7\7$\2\2\u00a7\u00a9\5&\24\2\u00a8\u009b"+
		"\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab"+
		"\u00ac\7$\2\2\u00ac\u00ad\5\30\r\2\u00ad\37\3\2\2\2\u00ae\u00af\7\b\2"+
		"\2\u00af\u00b0\7$\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\7$\2\2\u00b2\u00b3"+
		"\5&\24\2\u00b3!\3\2\2\2\u00b4\u00b5\5$\23\2\u00b5#\3\2\2\2\u00b6\u00b7"+
		"\7%\2\2\u00b7%\3\2\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba\7$\2\2\u00ba\u00bb"+
		"\7#\2\2\u00bb\u00bc\5&\24\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\5\22\n\2\u00be"+
		"\u00b8\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1)\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3+\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c5-\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7/\3\2\2\2\u00c8\u00c9\7\17\2"+
		"\2\u00c9\u00ca\7$\2\2\u00ca\u00cb\5\62\32\2\u00cb\61\3\2\2\2\u00cc\u00cd"+
		"\5\64\33\2\u00cd\63\3\2\2\2\u00ce\u00cf\7\25\2\2\u00cf\u00d0\7$\2\2\u00d0"+
		"\u00d1\5$\23\2\u00d1\u00d2\7$\2\2\u00d2\u00d3\5\66\34\2\u00d3\65\3\2\2"+
		"\2\u00d4\u00d7\58\35\2\u00d5\u00d7\5:\36\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\67\3\2\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\7$\2\2\u00da"+
		"\u00db\5\22\n\2\u00db\u00dc\7$\2\2\u00dc\u00dd\7\37\2\2\u00dd\u00de\7"+
		"$\2\2\u00de\u00df\5\22\n\2\u00df9\3\2\2\2\u00e0\u00e1\7\16\2\2\u00e1\u00e2"+
		"\7$\2\2\u00e2\u00e3\5@!\2\u00e3;\3\2\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00e6"+
		"\7$\2\2\u00e6\u00e7\5> \2\u00e7=\3\2\2\2\u00e8\u00e9\7\25\2\2\u00e9\u00ea"+
		"\7$\2\2\u00ea\u00f2\5$\23\2\u00eb\u00ec\7\26\2\2\u00ec\u00ed\7$\2\2\u00ed"+
		"\u00f2\5$\23\2\u00ee\u00ef\7\27\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f2\5\22"+
		"\n\2\u00f1\u00e8\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2"+
		"?\3\2\2\2\u00f3\u00f4\7%\2\2\u00f4A\3\2\2\2\rNWhv}\u0082\u008b\u00a8\u00be"+
		"\u00d6\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}