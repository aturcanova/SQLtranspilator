// Generated from C:/Users/andre_000/Desktop/SQLTranspilator/src/main/java/cz/cuni/mff/parser/antlr\Parser.g4 by ANTLR 4.7
package cz.cuni.mff.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "GROUP", "HAVING", "ORDER", "DISTINCT", "ALL", 
		"AND", "OR", "NOT", "ADD", "ALTER", "ASC", "DESC", "CREATE", "SCHEMA", 
		"DATABASE", "TABLE", "VIEW", "COLUMN", "DROP", "SET", "BY", "PRIMARY", 
		"KEY", "UNIQUE", "RENAME", "TO", "AS", "DEL", "DELETE", "SEL", "INSERT", 
		"INTO", "VALUES", "UPDATE", "JOIN", "NATURAL", "CROSS", "INNER", "FULL", 
		"RIGHT", "LEFT", "OUTER", "BYTEINT", "SMALLINT", "INTEGER", "BIGINT", 
		"DECIMAL", "NUMERIC", "FLOAT", "CHAR", "VARCHAR", "DATE", "TIME", "TIMESTAMP", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "EQUALITY", "QUOT_MARKS", "APOSTROF", 
		"SEMICOLON", "COMMA", "DOT", "NAME", "WS", "TOKEN", "INT", "ANY"
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


	public ParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u020d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\7C\u01f6"+
		"\nC\fC\16C\u01f9\13C\3D\6D\u01fc\nD\rD\16D\u01fd\3E\6E\u0201\nE\rE\16"+
		"E\u0202\3F\3F\7F\u0207\nF\fF\16F\u020a\13F\3G\3G\2\2H\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\3\2\6\6\2&&C\\aac|"+
		"\7\2&&\62;C\\aac|\4\2\13\f\"\"\4\2C\\c|\2\u0210\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2"+
		"\5\u0096\3\2\2\2\7\u009b\3\2\2\2\t\u00a1\3\2\2\2\13\u00a7\3\2\2\2\r\u00ae"+
		"\3\2\2\2\17\u00b4\3\2\2\2\21\u00bd\3\2\2\2\23\u00c1\3\2\2\2\25\u00c5\3"+
		"\2\2\2\27\u00c8\3\2\2\2\31\u00cc\3\2\2\2\33\u00d0\3\2\2\2\35\u00d6\3\2"+
		"\2\2\37\u00da\3\2\2\2!\u00df\3\2\2\2#\u00e6\3\2\2\2%\u00ed\3\2\2\2\'\u00f6"+
		"\3\2\2\2)\u00fc\3\2\2\2+\u0101\3\2\2\2-\u0108\3\2\2\2/\u010d\3\2\2\2\61"+
		"\u0111\3\2\2\2\63\u0114\3\2\2\2\65\u011c\3\2\2\2\67\u0120\3\2\2\29\u0127"+
		"\3\2\2\2;\u012e\3\2\2\2=\u0131\3\2\2\2?\u0134\3\2\2\2A\u0138\3\2\2\2C"+
		"\u013f\3\2\2\2E\u0143\3\2\2\2G\u014a\3\2\2\2I\u014f\3\2\2\2K\u0156\3\2"+
		"\2\2M\u015d\3\2\2\2O\u0162\3\2\2\2Q\u016a\3\2\2\2S\u0170\3\2\2\2U\u0176"+
		"\3\2\2\2W\u017b\3\2\2\2Y\u0181\3\2\2\2[\u0186\3\2\2\2]\u018c\3\2\2\2_"+
		"\u0194\3\2\2\2a\u019d\3\2\2\2c\u01a5\3\2\2\2e\u01ac\3\2\2\2g\u01b4\3\2"+
		"\2\2i\u01bc\3\2\2\2k\u01c2\3\2\2\2m\u01c7\3\2\2\2o\u01cf\3\2\2\2q\u01d4"+
		"\3\2\2\2s\u01d9\3\2\2\2u\u01e3\3\2\2\2w\u01e5\3\2\2\2y\u01e7\3\2\2\2{"+
		"\u01e9\3\2\2\2}\u01eb\3\2\2\2\177\u01ed\3\2\2\2\u0081\u01ef\3\2\2\2\u0083"+
		"\u01f1\3\2\2\2\u0085\u01f3\3\2\2\2\u0087\u01fb\3\2\2\2\u0089\u0200\3\2"+
		"\2\2\u008b\u0204\3\2\2\2\u008d\u020b\3\2\2\2\u008f\u0090\7U\2\2\u0090"+
		"\u0091\7G\2\2\u0091\u0092\7N\2\2\u0092\u0093\7G\2\2\u0093\u0094\7E\2\2"+
		"\u0094\u0095\7V\2\2\u0095\4\3\2\2\2\u0096\u0097\7H\2\2\u0097\u0098\7T"+
		"\2\2\u0098\u0099\7Q\2\2\u0099\u009a\7O\2\2\u009a\6\3\2\2\2\u009b\u009c"+
		"\7Y\2\2\u009c\u009d\7J\2\2\u009d\u009e\7G\2\2\u009e\u009f\7T\2\2\u009f"+
		"\u00a0\7G\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\7I\2\2\u00a2\u00a3\7T\2\2\u00a3"+
		"\u00a4\7Q\2\2\u00a4\u00a5\7W\2\2\u00a5\u00a6\7R\2\2\u00a6\n\3\2\2\2\u00a7"+
		"\u00a8\7J\2\2\u00a8\u00a9\7C\2\2\u00a9\u00aa\7X\2\2\u00aa\u00ab\7K\2\2"+
		"\u00ab\u00ac\7P\2\2\u00ac\u00ad\7I\2\2\u00ad\f\3\2\2\2\u00ae\u00af\7Q"+
		"\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7F\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3"+
		"\7T\2\2\u00b3\16\3\2\2\2\u00b4\u00b5\7F\2\2\u00b5\u00b6\7K\2\2\u00b6\u00b7"+
		"\7U\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7K\2\2\u00b9\u00ba\7P\2\2\u00ba"+
		"\u00bb\7E\2\2\u00bb\u00bc\7V\2\2\u00bc\20\3\2\2\2\u00bd\u00be\7C\2\2\u00be"+
		"\u00bf\7N\2\2\u00bf\u00c0\7N\2\2\u00c0\22\3\2\2\2\u00c1\u00c2\7C\2\2\u00c2"+
		"\u00c3\7P\2\2\u00c3\u00c4\7F\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\7Q\2\2\u00c6"+
		"\u00c7\7T\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\7P\2\2\u00c9\u00ca\7Q\2\2\u00ca"+
		"\u00cb\7V\2\2\u00cb\30\3\2\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7F\2\2\u00ce"+
		"\u00cf\7F\2\2\u00cf\32\3\2\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\7N\2\2\u00d2"+
		"\u00d3\7V\2\2\u00d3\u00d4\7G\2\2\u00d4\u00d5\7T\2\2\u00d5\34\3\2\2\2\u00d6"+
		"\u00d7\7C\2\2\u00d7\u00d8\7U\2\2\u00d8\u00d9\7E\2\2\u00d9\36\3\2\2\2\u00da"+
		"\u00db\7F\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7U\2\2\u00dd\u00de\7E\2\2"+
		"\u00de \3\2\2\2\u00df\u00e0\7E\2\2\u00e0\u00e1\7T\2\2\u00e1\u00e2\7G\2"+
		"\2\u00e2\u00e3\7C\2\2\u00e3\u00e4\7V\2\2\u00e4\u00e5\7G\2\2\u00e5\"\3"+
		"\2\2\2\u00e6\u00e7\7U\2\2\u00e7\u00e8\7E\2\2\u00e8\u00e9\7J\2\2\u00e9"+
		"\u00ea\7G\2\2\u00ea\u00eb\7O\2\2\u00eb\u00ec\7C\2\2\u00ec$\3\2\2\2\u00ed"+
		"\u00ee\7F\2\2\u00ee\u00ef\7C\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1\7C\2\2"+
		"\u00f1\u00f2\7D\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4\7U\2\2\u00f4\u00f5"+
		"\7G\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7V\2\2\u00f7\u00f8\7C\2\2\u00f8\u00f9"+
		"\7D\2\2\u00f9\u00fa\7N\2\2\u00fa\u00fb\7G\2\2\u00fb(\3\2\2\2\u00fc\u00fd"+
		"\7X\2\2\u00fd\u00fe\7K\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7Y\2\2\u0100"+
		"*\3\2\2\2\u0101\u0102\7E\2\2\u0102\u0103\7Q\2\2\u0103\u0104\7N\2\2\u0104"+
		"\u0105\7W\2\2\u0105\u0106\7O\2\2\u0106\u0107\7P\2\2\u0107,\3\2\2\2\u0108"+
		"\u0109\7F\2\2\u0109\u010a\7T\2\2\u010a\u010b\7Q\2\2\u010b\u010c\7R\2\2"+
		"\u010c.\3\2\2\2\u010d\u010e\7U\2\2\u010e\u010f\7G\2\2\u010f\u0110\7V\2"+
		"\2\u0110\60\3\2\2\2\u0111\u0112\7D\2\2\u0112\u0113\7[\2\2\u0113\62\3\2"+
		"\2\2\u0114\u0115\7R\2\2\u0115\u0116\7T\2\2\u0116\u0117\7K\2\2\u0117\u0118"+
		"\7O\2\2\u0118\u0119\7C\2\2\u0119\u011a\7T\2\2\u011a\u011b\7[\2\2\u011b"+
		"\64\3\2\2\2\u011c\u011d\7M\2\2\u011d\u011e\7G\2\2\u011e\u011f\7[\2\2\u011f"+
		"\66\3\2\2\2\u0120\u0121\7W\2\2\u0121\u0122\7P\2\2\u0122\u0123\7K\2\2\u0123"+
		"\u0124\7S\2\2\u0124\u0125\7W\2\2\u0125\u0126\7G\2\2\u01268\3\2\2\2\u0127"+
		"\u0128\7T\2\2\u0128\u0129\7G\2\2\u0129\u012a\7P\2\2\u012a\u012b\7C\2\2"+
		"\u012b\u012c\7O\2\2\u012c\u012d\7G\2\2\u012d:\3\2\2\2\u012e\u012f\7V\2"+
		"\2\u012f\u0130\7Q\2\2\u0130<\3\2\2\2\u0131\u0132\7C\2\2\u0132\u0133\7"+
		"U\2\2\u0133>\3\2\2\2\u0134\u0135\7F\2\2\u0135\u0136\7G\2\2\u0136\u0137"+
		"\7N\2\2\u0137@\3\2\2\2\u0138\u0139\7F\2\2\u0139\u013a\7G\2\2\u013a\u013b"+
		"\7N\2\2\u013b\u013c\7G\2\2\u013c\u013d\7V\2\2\u013d\u013e\7G\2\2\u013e"+
		"B\3\2\2\2\u013f\u0140\7U\2\2\u0140\u0141\7G\2\2\u0141\u0142\7N\2\2\u0142"+
		"D\3\2\2\2\u0143\u0144\7K\2\2\u0144\u0145\7P\2\2\u0145\u0146\7U\2\2\u0146"+
		"\u0147\7G\2\2\u0147\u0148\7T\2\2\u0148\u0149\7V\2\2\u0149F\3\2\2\2\u014a"+
		"\u014b\7K\2\2\u014b\u014c\7P\2\2\u014c\u014d\7V\2\2\u014d\u014e\7Q\2\2"+
		"\u014eH\3\2\2\2\u014f\u0150\7X\2\2\u0150\u0151\7C\2\2\u0151\u0152\7N\2"+
		"\2\u0152\u0153\7W\2\2\u0153\u0154\7G\2\2\u0154\u0155\7U\2\2\u0155J\3\2"+
		"\2\2\u0156\u0157\7W\2\2\u0157\u0158\7R\2\2\u0158\u0159\7F\2\2\u0159\u015a"+
		"\7C\2\2\u015a\u015b\7V\2\2\u015b\u015c\7G\2\2\u015cL\3\2\2\2\u015d\u015e"+
		"\7L\2\2\u015e\u015f\7Q\2\2\u015f\u0160\7K\2\2\u0160\u0161\7P\2\2\u0161"+
		"N\3\2\2\2\u0162\u0163\7P\2\2\u0163\u0164\7C\2\2\u0164\u0165\7V\2\2\u0165"+
		"\u0166\7W\2\2\u0166\u0167\7T\2\2\u0167\u0168\7C\2\2\u0168\u0169\7N\2\2"+
		"\u0169P\3\2\2\2\u016a\u016b\7E\2\2\u016b\u016c\7T\2\2\u016c\u016d\7Q\2"+
		"\2\u016d\u016e\7U\2\2\u016e\u016f\7U\2\2\u016fR\3\2\2\2\u0170\u0171\7"+
		"K\2\2\u0171\u0172\7P\2\2\u0172\u0173\7P\2\2\u0173\u0174\7G\2\2\u0174\u0175"+
		"\7T\2\2\u0175T\3\2\2\2\u0176\u0177\7H\2\2\u0177\u0178\7W\2\2\u0178\u0179"+
		"\7N\2\2\u0179\u017a\7N\2\2\u017aV\3\2\2\2\u017b\u017c\7T\2\2\u017c\u017d"+
		"\7K\2\2\u017d\u017e\7I\2\2\u017e\u017f\7J\2\2\u017f\u0180\7V\2\2\u0180"+
		"X\3\2\2\2\u0181\u0182\7N\2\2\u0182\u0183\7G\2\2\u0183\u0184\7H\2\2\u0184"+
		"\u0185\7V\2\2\u0185Z\3\2\2\2\u0186\u0187\7Q\2\2\u0187\u0188\7W\2\2\u0188"+
		"\u0189\7V\2\2\u0189\u018a\7G\2\2\u018a\u018b\7T\2\2\u018b\\\3\2\2\2\u018c"+
		"\u018d\7D\2\2\u018d\u018e\7[\2\2\u018e\u018f\7V\2\2\u018f\u0190\7G\2\2"+
		"\u0190\u0191\7K\2\2\u0191\u0192\7P\2\2\u0192\u0193\7V\2\2\u0193^\3\2\2"+
		"\2\u0194\u0195\7U\2\2\u0195\u0196\7O\2\2\u0196\u0197\7C\2\2\u0197\u0198"+
		"\7N\2\2\u0198\u0199\7N\2\2\u0199\u019a\7K\2\2\u019a\u019b\7P\2\2\u019b"+
		"\u019c\7V\2\2\u019c`\3\2\2\2\u019d\u019e\7K\2\2\u019e\u019f\7P\2\2\u019f"+
		"\u01a0\7V\2\2\u01a0\u01a1\7G\2\2\u01a1\u01a2\7I\2\2\u01a2\u01a3\7G\2\2"+
		"\u01a3\u01a4\7T\2\2\u01a4b\3\2\2\2\u01a5\u01a6\7D\2\2\u01a6\u01a7\7K\2"+
		"\2\u01a7\u01a8\7I\2\2\u01a8\u01a9\7K\2\2\u01a9\u01aa\7P\2\2\u01aa\u01ab"+
		"\7V\2\2\u01abd\3\2\2\2\u01ac\u01ad\7F\2\2\u01ad\u01ae\7G\2\2\u01ae\u01af"+
		"\7E\2\2\u01af\u01b0\7K\2\2\u01b0\u01b1\7O\2\2\u01b1\u01b2\7C\2\2\u01b2"+
		"\u01b3\7N\2\2\u01b3f\3\2\2\2\u01b4\u01b5\7P\2\2\u01b5\u01b6\7W\2\2\u01b6"+
		"\u01b7\7O\2\2\u01b7\u01b8\7G\2\2\u01b8\u01b9\7T\2\2\u01b9\u01ba\7K\2\2"+
		"\u01ba\u01bb\7E\2\2\u01bbh\3\2\2\2\u01bc\u01bd\7H\2\2\u01bd\u01be\7N\2"+
		"\2\u01be\u01bf\7Q\2\2\u01bf\u01c0\7C\2\2\u01c0\u01c1\7V\2\2\u01c1j\3\2"+
		"\2\2\u01c2\u01c3\7E\2\2\u01c3\u01c4\7J\2\2\u01c4\u01c5\7C\2\2\u01c5\u01c6"+
		"\7T\2\2\u01c6l\3\2\2\2\u01c7\u01c8\7X\2\2\u01c8\u01c9\7C\2\2\u01c9\u01ca"+
		"\7T\2\2\u01ca\u01cb\7E\2\2\u01cb\u01cc\7J\2\2\u01cc\u01cd\7C\2\2\u01cd"+
		"\u01ce\7T\2\2\u01cen\3\2\2\2\u01cf\u01d0\7F\2\2\u01d0\u01d1\7C\2\2\u01d1"+
		"\u01d2\7V\2\2\u01d2\u01d3\7G\2\2\u01d3p\3\2\2\2\u01d4\u01d5\7V\2\2\u01d5"+
		"\u01d6\7K\2\2\u01d6\u01d7\7O\2\2\u01d7\u01d8\7G\2\2\u01d8r\3\2\2\2\u01d9"+
		"\u01da\7V\2\2\u01da\u01db\7K\2\2\u01db\u01dc\7O\2\2\u01dc\u01dd\7G\2\2"+
		"\u01dd\u01de\7U\2\2\u01de\u01df\7V\2\2\u01df\u01e0\7C\2\2\u01e0\u01e1"+
		"\7O\2\2\u01e1\u01e2\7R\2\2\u01e2t\3\2\2\2\u01e3\u01e4\7*\2\2\u01e4v\3"+
		"\2\2\2\u01e5\u01e6\7+\2\2\u01e6x\3\2\2\2\u01e7\u01e8\7?\2\2\u01e8z\3\2"+
		"\2\2\u01e9\u01ea\7$\2\2\u01ea|\3\2\2\2\u01eb\u01ec\7)\2\2\u01ec~\3\2\2"+
		"\2\u01ed\u01ee\7=\2\2\u01ee\u0080\3\2\2\2\u01ef\u01f0\7.\2\2\u01f0\u0082"+
		"\3\2\2\2\u01f1\u01f2\7\60\2\2\u01f2\u0084\3\2\2\2\u01f3\u01f7\t\2\2\2"+
		"\u01f4\u01f6\t\3\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0086\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fc\t\4\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0088\3\2\2\2\u01ff\u0201\t\5\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u008a\3\2\2\2\u0204\u0208\4\63;\2\u0205\u0207\4\62;\2\u0206"+
		"\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2"+
		"\2\2\u0209\u008c\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\13\2\2\2\u020c"+
		"\u008e\3\2\2\2\7\2\u01f7\u01fd\u0202\u0208\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}