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
		LT=61, LE=62, GT=63, GE=64, NE=65, NEQL=66, QUOT_MARKS=67, APOSTROF=68, 
		SEMICOLON=69, COMMA=70, DOT=71, NAME=72, TOKEN=73, INT=74, WS=75, ANY=76;
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
		"LEFT_BRACKET", "RIGHT_BRACKET", "EQUALITY", "LT", "LE", "GT", "GE", "NE", 
		"NEQL", "QUOT_MARKS", "APOSTROF", "SEMICOLON", "COMMA", "DOT", "NAME", 
		"TOKEN", "INT", "WS", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2N\u0229\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3"+
		">\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3"+
		"G\3H\3H\3I\3I\7I\u0212\nI\fI\16I\u0215\13I\3J\6J\u0218\nJ\rJ\16J\u0219"+
		"\3K\3K\7K\u021e\nK\fK\16K\u0221\13K\3L\6L\u0224\nL\rL\16L\u0225\3M\3M"+
		"\2\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\3\2\6\6\2&&C\\aac|\7\2&&\62"+
		";C\\aac|\4\2C\\c|\4\2\13\f\"\"\2\u022c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b"+
		"\3\2\2\2\5\u00a2\3\2\2\2\7\u00a7\3\2\2\2\t\u00ad\3\2\2\2\13\u00b3\3\2"+
		"\2\2\r\u00ba\3\2\2\2\17\u00c0\3\2\2\2\21\u00c9\3\2\2\2\23\u00cd\3\2\2"+
		"\2\25\u00d1\3\2\2\2\27\u00d4\3\2\2\2\31\u00d8\3\2\2\2\33\u00dc\3\2\2\2"+
		"\35\u00e2\3\2\2\2\37\u00e6\3\2\2\2!\u00eb\3\2\2\2#\u00f2\3\2\2\2%\u00f9"+
		"\3\2\2\2\'\u0102\3\2\2\2)\u0108\3\2\2\2+\u010d\3\2\2\2-\u0114\3\2\2\2"+
		"/\u0119\3\2\2\2\61\u011d\3\2\2\2\63\u0120\3\2\2\2\65\u0128\3\2\2\2\67"+
		"\u012c\3\2\2\29\u0133\3\2\2\2;\u013a\3\2\2\2=\u013d\3\2\2\2?\u0140\3\2"+
		"\2\2A\u0144\3\2\2\2C\u014b\3\2\2\2E\u014f\3\2\2\2G\u0156\3\2\2\2I\u015b"+
		"\3\2\2\2K\u0162\3\2\2\2M\u0169\3\2\2\2O\u016e\3\2\2\2Q\u0176\3\2\2\2S"+
		"\u017c\3\2\2\2U\u0182\3\2\2\2W\u0187\3\2\2\2Y\u018d\3\2\2\2[\u0192\3\2"+
		"\2\2]\u0198\3\2\2\2_\u01a0\3\2\2\2a\u01a9\3\2\2\2c\u01b1\3\2\2\2e\u01b8"+
		"\3\2\2\2g\u01c0\3\2\2\2i\u01c8\3\2\2\2k\u01ce\3\2\2\2m\u01d3\3\2\2\2o"+
		"\u01db\3\2\2\2q\u01e0\3\2\2\2s\u01e5\3\2\2\2u\u01ef\3\2\2\2w\u01f1\3\2"+
		"\2\2y\u01f3\3\2\2\2{\u01f5\3\2\2\2}\u01f7\3\2\2\2\177\u01fa\3\2\2\2\u0081"+
		"\u01fc\3\2\2\2\u0083\u01ff\3\2\2\2\u0085\u0202\3\2\2\2\u0087\u0205\3\2"+
		"\2\2\u0089\u0207\3\2\2\2\u008b\u0209\3\2\2\2\u008d\u020b\3\2\2\2\u008f"+
		"\u020d\3\2\2\2\u0091\u020f\3\2\2\2\u0093\u0217\3\2\2\2\u0095\u021b\3\2"+
		"\2\2\u0097\u0223\3\2\2\2\u0099\u0227\3\2\2\2\u009b\u009c\7U\2\2\u009c"+
		"\u009d\7G\2\2\u009d\u009e\7N\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7E\2\2"+
		"\u00a0\u00a1\7V\2\2\u00a1\4\3\2\2\2\u00a2\u00a3\7H\2\2\u00a3\u00a4\7T"+
		"\2\2\u00a4\u00a5\7Q\2\2\u00a5\u00a6\7O\2\2\u00a6\6\3\2\2\2\u00a7\u00a8"+
		"\7Y\2\2\u00a8\u00a9\7J\2\2\u00a9\u00aa\7G\2\2\u00aa\u00ab\7T\2\2\u00ab"+
		"\u00ac\7G\2\2\u00ac\b\3\2\2\2\u00ad\u00ae\7I\2\2\u00ae\u00af\7T\2\2\u00af"+
		"\u00b0\7Q\2\2\u00b0\u00b1\7W\2\2\u00b1\u00b2\7R\2\2\u00b2\n\3\2\2\2\u00b3"+
		"\u00b4\7J\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\7X\2\2\u00b6\u00b7\7K\2\2"+
		"\u00b7\u00b8\7P\2\2\u00b8\u00b9\7I\2\2\u00b9\f\3\2\2\2\u00ba\u00bb\7Q"+
		"\2\2\u00bb\u00bc\7T\2\2\u00bc\u00bd\7F\2\2\u00bd\u00be\7G\2\2\u00be\u00bf"+
		"\7T\2\2\u00bf\16\3\2\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c3"+
		"\7U\2\2\u00c3\u00c4\7V\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7P\2\2\u00c6"+
		"\u00c7\7E\2\2\u00c7\u00c8\7V\2\2\u00c8\20\3\2\2\2\u00c9\u00ca\7C\2\2\u00ca"+
		"\u00cb\7N\2\2\u00cb\u00cc\7N\2\2\u00cc\22\3\2\2\2\u00cd\u00ce\7C\2\2\u00ce"+
		"\u00cf\7P\2\2\u00cf\u00d0\7F\2\2\u00d0\24\3\2\2\2\u00d1\u00d2\7Q\2\2\u00d2"+
		"\u00d3\7T\2\2\u00d3\26\3\2\2\2\u00d4\u00d5\7P\2\2\u00d5\u00d6\7Q\2\2\u00d6"+
		"\u00d7\7V\2\2\u00d7\30\3\2\2\2\u00d8\u00d9\7C\2\2\u00d9\u00da\7F\2\2\u00da"+
		"\u00db\7F\2\2\u00db\32\3\2\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de\7N\2\2\u00de"+
		"\u00df\7V\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7T\2\2\u00e1\34\3\2\2\2\u00e2"+
		"\u00e3\7C\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7E\2\2\u00e5\36\3\2\2\2\u00e6"+
		"\u00e7\7F\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7U\2\2\u00e9\u00ea\7E\2\2"+
		"\u00ea \3\2\2\2\u00eb\u00ec\7E\2\2\u00ec\u00ed\7T\2\2\u00ed\u00ee\7G\2"+
		"\2\u00ee\u00ef\7C\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1\7G\2\2\u00f1\"\3"+
		"\2\2\2\u00f2\u00f3\7U\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f5\7J\2\2\u00f5"+
		"\u00f6\7G\2\2\u00f6\u00f7\7O\2\2\u00f7\u00f8\7C\2\2\u00f8$\3\2\2\2\u00f9"+
		"\u00fa\7F\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc\7V\2\2\u00fc\u00fd\7C\2\2"+
		"\u00fd\u00fe\7D\2\2\u00fe\u00ff\7C\2\2\u00ff\u0100\7U\2\2\u0100\u0101"+
		"\7G\2\2\u0101&\3\2\2\2\u0102\u0103\7V\2\2\u0103\u0104\7C\2\2\u0104\u0105"+
		"\7D\2\2\u0105\u0106\7N\2\2\u0106\u0107\7G\2\2\u0107(\3\2\2\2\u0108\u0109"+
		"\7X\2\2\u0109\u010a\7K\2\2\u010a\u010b\7G\2\2\u010b\u010c\7Y\2\2\u010c"+
		"*\3\2\2\2\u010d\u010e\7E\2\2\u010e\u010f\7Q\2\2\u010f\u0110\7N\2\2\u0110"+
		"\u0111\7W\2\2\u0111\u0112\7O\2\2\u0112\u0113\7P\2\2\u0113,\3\2\2\2\u0114"+
		"\u0115\7F\2\2\u0115\u0116\7T\2\2\u0116\u0117\7Q\2\2\u0117\u0118\7R\2\2"+
		"\u0118.\3\2\2\2\u0119\u011a\7U\2\2\u011a\u011b\7G\2\2\u011b\u011c\7V\2"+
		"\2\u011c\60\3\2\2\2\u011d\u011e\7D\2\2\u011e\u011f\7[\2\2\u011f\62\3\2"+
		"\2\2\u0120\u0121\7R\2\2\u0121\u0122\7T\2\2\u0122\u0123\7K\2\2\u0123\u0124"+
		"\7O\2\2\u0124\u0125\7C\2\2\u0125\u0126\7T\2\2\u0126\u0127\7[\2\2\u0127"+
		"\64\3\2\2\2\u0128\u0129\7M\2\2\u0129\u012a\7G\2\2\u012a\u012b\7[\2\2\u012b"+
		"\66\3\2\2\2\u012c\u012d\7W\2\2\u012d\u012e\7P\2\2\u012e\u012f\7K\2\2\u012f"+
		"\u0130\7S\2\2\u0130\u0131\7W\2\2\u0131\u0132\7G\2\2\u01328\3\2\2\2\u0133"+
		"\u0134\7T\2\2\u0134\u0135\7G\2\2\u0135\u0136\7P\2\2\u0136\u0137\7C\2\2"+
		"\u0137\u0138\7O\2\2\u0138\u0139\7G\2\2\u0139:\3\2\2\2\u013a\u013b\7V\2"+
		"\2\u013b\u013c\7Q\2\2\u013c<\3\2\2\2\u013d\u013e\7C\2\2\u013e\u013f\7"+
		"U\2\2\u013f>\3\2\2\2\u0140\u0141\7F\2\2\u0141\u0142\7G\2\2\u0142\u0143"+
		"\7N\2\2\u0143@\3\2\2\2\u0144\u0145\7F\2\2\u0145\u0146\7G\2\2\u0146\u0147"+
		"\7N\2\2\u0147\u0148\7G\2\2\u0148\u0149\7V\2\2\u0149\u014a\7G\2\2\u014a"+
		"B\3\2\2\2\u014b\u014c\7U\2\2\u014c\u014d\7G\2\2\u014d\u014e\7N\2\2\u014e"+
		"D\3\2\2\2\u014f\u0150\7K\2\2\u0150\u0151\7P\2\2\u0151\u0152\7U\2\2\u0152"+
		"\u0153\7G\2\2\u0153\u0154\7T\2\2\u0154\u0155\7V\2\2\u0155F\3\2\2\2\u0156"+
		"\u0157\7K\2\2\u0157\u0158\7P\2\2\u0158\u0159\7V\2\2\u0159\u015a\7Q\2\2"+
		"\u015aH\3\2\2\2\u015b\u015c\7X\2\2\u015c\u015d\7C\2\2\u015d\u015e\7N\2"+
		"\2\u015e\u015f\7W\2\2\u015f\u0160\7G\2\2\u0160\u0161\7U\2\2\u0161J\3\2"+
		"\2\2\u0162\u0163\7W\2\2\u0163\u0164\7R\2\2\u0164\u0165\7F\2\2\u0165\u0166"+
		"\7C\2\2\u0166\u0167\7V\2\2\u0167\u0168\7G\2\2\u0168L\3\2\2\2\u0169\u016a"+
		"\7L\2\2\u016a\u016b\7Q\2\2\u016b\u016c\7K\2\2\u016c\u016d\7P\2\2\u016d"+
		"N\3\2\2\2\u016e\u016f\7P\2\2\u016f\u0170\7C\2\2\u0170\u0171\7V\2\2\u0171"+
		"\u0172\7W\2\2\u0172\u0173\7T\2\2\u0173\u0174\7C\2\2\u0174\u0175\7N\2\2"+
		"\u0175P\3\2\2\2\u0176\u0177\7E\2\2\u0177\u0178\7T\2\2\u0178\u0179\7Q\2"+
		"\2\u0179\u017a\7U\2\2\u017a\u017b\7U\2\2\u017bR\3\2\2\2\u017c\u017d\7"+
		"K\2\2\u017d\u017e\7P\2\2\u017e\u017f\7P\2\2\u017f\u0180\7G\2\2\u0180\u0181"+
		"\7T\2\2\u0181T\3\2\2\2\u0182\u0183\7H\2\2\u0183\u0184\7W\2\2\u0184\u0185"+
		"\7N\2\2\u0185\u0186\7N\2\2\u0186V\3\2\2\2\u0187\u0188\7T\2\2\u0188\u0189"+
		"\7K\2\2\u0189\u018a\7I\2\2\u018a\u018b\7J\2\2\u018b\u018c\7V\2\2\u018c"+
		"X\3\2\2\2\u018d\u018e\7N\2\2\u018e\u018f\7G\2\2\u018f\u0190\7H\2\2\u0190"+
		"\u0191\7V\2\2\u0191Z\3\2\2\2\u0192\u0193\7Q\2\2\u0193\u0194\7W\2\2\u0194"+
		"\u0195\7V\2\2\u0195\u0196\7G\2\2\u0196\u0197\7T\2\2\u0197\\\3\2\2\2\u0198"+
		"\u0199\7D\2\2\u0199\u019a\7[\2\2\u019a\u019b\7V\2\2\u019b\u019c\7G\2\2"+
		"\u019c\u019d\7K\2\2\u019d\u019e\7P\2\2\u019e\u019f\7V\2\2\u019f^\3\2\2"+
		"\2\u01a0\u01a1\7U\2\2\u01a1\u01a2\7O\2\2\u01a2\u01a3\7C\2\2\u01a3\u01a4"+
		"\7N\2\2\u01a4\u01a5\7N\2\2\u01a5\u01a6\7K\2\2\u01a6\u01a7\7P\2\2\u01a7"+
		"\u01a8\7V\2\2\u01a8`\3\2\2\2\u01a9\u01aa\7K\2\2\u01aa\u01ab\7P\2\2\u01ab"+
		"\u01ac\7V\2\2\u01ac\u01ad\7G\2\2\u01ad\u01ae\7I\2\2\u01ae\u01af\7G\2\2"+
		"\u01af\u01b0\7T\2\2\u01b0b\3\2\2\2\u01b1\u01b2\7D\2\2\u01b2\u01b3\7K\2"+
		"\2\u01b3\u01b4\7I\2\2\u01b4\u01b5\7K\2\2\u01b5\u01b6\7P\2\2\u01b6\u01b7"+
		"\7V\2\2\u01b7d\3\2\2\2\u01b8\u01b9\7F\2\2\u01b9\u01ba\7G\2\2\u01ba\u01bb"+
		"\7E\2\2\u01bb\u01bc\7K\2\2\u01bc\u01bd\7O\2\2\u01bd\u01be\7C\2\2\u01be"+
		"\u01bf\7N\2\2\u01bff\3\2\2\2\u01c0\u01c1\7P\2\2\u01c1\u01c2\7W\2\2\u01c2"+
		"\u01c3\7O\2\2\u01c3\u01c4\7G\2\2\u01c4\u01c5\7T\2\2\u01c5\u01c6\7K\2\2"+
		"\u01c6\u01c7\7E\2\2\u01c7h\3\2\2\2\u01c8\u01c9\7H\2\2\u01c9\u01ca\7N\2"+
		"\2\u01ca\u01cb\7Q\2\2\u01cb\u01cc\7C\2\2\u01cc\u01cd\7V\2\2\u01cdj\3\2"+
		"\2\2\u01ce\u01cf\7E\2\2\u01cf\u01d0\7J\2\2\u01d0\u01d1\7C\2\2\u01d1\u01d2"+
		"\7T\2\2\u01d2l\3\2\2\2\u01d3\u01d4\7X\2\2\u01d4\u01d5\7C\2\2\u01d5\u01d6"+
		"\7T\2\2\u01d6\u01d7\7E\2\2\u01d7\u01d8\7J\2\2\u01d8\u01d9\7C\2\2\u01d9"+
		"\u01da\7T\2\2\u01dan\3\2\2\2\u01db\u01dc\7F\2\2\u01dc\u01dd\7C\2\2\u01dd"+
		"\u01de\7V\2\2\u01de\u01df\7G\2\2\u01dfp\3\2\2\2\u01e0\u01e1\7V\2\2\u01e1"+
		"\u01e2\7K\2\2\u01e2\u01e3\7O\2\2\u01e3\u01e4\7G\2\2\u01e4r\3\2\2\2\u01e5"+
		"\u01e6\7V\2\2\u01e6\u01e7\7K\2\2\u01e7\u01e8\7O\2\2\u01e8\u01e9\7G\2\2"+
		"\u01e9\u01ea\7U\2\2\u01ea\u01eb\7V\2\2\u01eb\u01ec\7C\2\2\u01ec\u01ed"+
		"\7O\2\2\u01ed\u01ee\7R\2\2\u01eet\3\2\2\2\u01ef\u01f0\7*\2\2\u01f0v\3"+
		"\2\2\2\u01f1\u01f2\7+\2\2\u01f2x\3\2\2\2\u01f3\u01f4\7?\2\2\u01f4z\3\2"+
		"\2\2\u01f5\u01f6\7>\2\2\u01f6|\3\2\2\2\u01f7\u01f8\7>\2\2\u01f8\u01f9"+
		"\7?\2\2\u01f9~\3\2\2\2\u01fa\u01fb\7@\2\2\u01fb\u0080\3\2\2\2\u01fc\u01fd"+
		"\7@\2\2\u01fd\u01fe\7?\2\2\u01fe\u0082\3\2\2\2\u01ff\u0200\7#\2\2\u0200"+
		"\u0201\7?\2\2\u0201\u0084\3\2\2\2\u0202\u0203\7>\2\2\u0203\u0204\7@\2"+
		"\2\u0204\u0086\3\2\2\2\u0205\u0206\7$\2\2\u0206\u0088\3\2\2\2\u0207\u0208"+
		"\7)\2\2\u0208\u008a\3\2\2\2\u0209\u020a\7=\2\2\u020a\u008c\3\2\2\2\u020b"+
		"\u020c\7.\2\2\u020c\u008e\3\2\2\2\u020d\u020e\7\60\2\2\u020e\u0090\3\2"+
		"\2\2\u020f\u0213\t\2\2\2\u0210\u0212\t\3\2\2\u0211\u0210\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0092\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0216\u0218\t\4\2\2\u0217\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0094\3\2"+
		"\2\2\u021b\u021f\4\63;\2\u021c\u021e\4\62;\2\u021d\u021c\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0096\3\2"+
		"\2\2\u0221\u021f\3\2\2\2\u0222\u0224\t\5\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0098\3\2"+
		"\2\2\u0227\u0228\13\2\2\2\u0228\u009a\3\2\2\2\7\2\u0213\u0219\u021f\u0225"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}