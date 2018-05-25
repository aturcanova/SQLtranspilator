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
		INNER=41, FULL=42, RIGHT=43, LEFT=44, OUTER=45, COUNT=46, SUM=47, MAX=48, 
		MIN=49, AVG=50, BYTEINT=51, SMALLINT=52, INTEGER=53, BIGINT=54, DECIMAL=55, 
		NUMERIC=56, FLOAT=57, CHAR=58, VARCHAR=59, DATE=60, TIME=61, TIMESTAMP=62, 
		LEFT_BRACKET=63, RIGHT_BRACKET=64, EQUALITY=65, LT=66, LE=67, GT=68, GE=69, 
		NE=70, NEQL=71, QUOT_MARKS=72, APOSTROF=73, SEMICOLON=74, COMMA=75, DOT=76, 
		ASTERISK=77, NAME=78, INT=79, WS=80;
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
		"RIGHT", "LEFT", "OUTER", "COUNT", "SUM", "MAX", "MIN", "AVG", "BYTEINT", 
		"SMALLINT", "INTEGER", "BIGINT", "DECIMAL", "NUMERIC", "FLOAT", "CHAR", 
		"VARCHAR", "DATE", "TIME", "TIMESTAMP", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"EQUALITY", "LT", "LE", "GT", "GE", "NE", "NEQL", "QUOT_MARKS", "APOSTROF", 
		"SEMICOLON", "COMMA", "DOT", "ASTERISK", "NAME", "INT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u0242\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\3D\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3"+
		"M\3M\3N\3N\3O\3O\7O\u0232\nO\fO\16O\u0235\13O\3P\3P\7P\u0239\nP\fP\16"+
		"P\u023c\13P\3Q\6Q\u023f\nQ\rQ\16Q\u0240\2\2R\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\3\2\5\6\2&&C\\aac|\7\2&&\62"+
		";C\\aac|\5\2\13\f\17\17\"\"\2\u0244\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\3\u00a3\3\2\2"+
		"\2\5\u00aa\3\2\2\2\7\u00af\3\2\2\2\t\u00b5\3\2\2\2\13\u00bb\3\2\2\2\r"+
		"\u00c2\3\2\2\2\17\u00c8\3\2\2\2\21\u00d1\3\2\2\2\23\u00d5\3\2\2\2\25\u00d9"+
		"\3\2\2\2\27\u00dc\3\2\2\2\31\u00e0\3\2\2\2\33\u00e4\3\2\2\2\35\u00ea\3"+
		"\2\2\2\37\u00ee\3\2\2\2!\u00f3\3\2\2\2#\u00fa\3\2\2\2%\u0101\3\2\2\2\'"+
		"\u010a\3\2\2\2)\u0110\3\2\2\2+\u0115\3\2\2\2-\u011c\3\2\2\2/\u0121\3\2"+
		"\2\2\61\u0125\3\2\2\2\63\u0128\3\2\2\2\65\u0130\3\2\2\2\67\u0134\3\2\2"+
		"\29\u013b\3\2\2\2;\u0142\3\2\2\2=\u0145\3\2\2\2?\u0148\3\2\2\2A\u014c"+
		"\3\2\2\2C\u0153\3\2\2\2E\u0157\3\2\2\2G\u015e\3\2\2\2I\u0163\3\2\2\2K"+
		"\u016a\3\2\2\2M\u0171\3\2\2\2O\u0176\3\2\2\2Q\u017e\3\2\2\2S\u0184\3\2"+
		"\2\2U\u018a\3\2\2\2W\u018f\3\2\2\2Y\u0195\3\2\2\2[\u019a\3\2\2\2]\u01a0"+
		"\3\2\2\2_\u01a6\3\2\2\2a\u01aa\3\2\2\2c\u01ae\3\2\2\2e\u01b2\3\2\2\2g"+
		"\u01b6\3\2\2\2i\u01be\3\2\2\2k\u01c7\3\2\2\2m\u01cf\3\2\2\2o\u01d6\3\2"+
		"\2\2q\u01de\3\2\2\2s\u01e6\3\2\2\2u\u01ec\3\2\2\2w\u01f1\3\2\2\2y\u01f9"+
		"\3\2\2\2{\u01fe\3\2\2\2}\u0203\3\2\2\2\177\u020d\3\2\2\2\u0081\u020f\3"+
		"\2\2\2\u0083\u0211\3\2\2\2\u0085\u0213\3\2\2\2\u0087\u0215\3\2\2\2\u0089"+
		"\u0218\3\2\2\2\u008b\u021a\3\2\2\2\u008d\u021d\3\2\2\2\u008f\u0220\3\2"+
		"\2\2\u0091\u0223\3\2\2\2\u0093\u0225\3\2\2\2\u0095\u0227\3\2\2\2\u0097"+
		"\u0229\3\2\2\2\u0099\u022b\3\2\2\2\u009b\u022d\3\2\2\2\u009d\u022f\3\2"+
		"\2\2\u009f\u0236\3\2\2\2\u00a1\u023e\3\2\2\2\u00a3\u00a4\7U\2\2\u00a4"+
		"\u00a5\7G\2\2\u00a5\u00a6\7N\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7E\2\2"+
		"\u00a8\u00a9\7V\2\2\u00a9\4\3\2\2\2\u00aa\u00ab\7H\2\2\u00ab\u00ac\7T"+
		"\2\2\u00ac\u00ad\7Q\2\2\u00ad\u00ae\7O\2\2\u00ae\6\3\2\2\2\u00af\u00b0"+
		"\7Y\2\2\u00b0\u00b1\7J\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\7T\2\2\u00b3"+
		"\u00b4\7G\2\2\u00b4\b\3\2\2\2\u00b5\u00b6\7I\2\2\u00b6\u00b7\7T\2\2\u00b7"+
		"\u00b8\7Q\2\2\u00b8\u00b9\7W\2\2\u00b9\u00ba\7R\2\2\u00ba\n\3\2\2\2\u00bb"+
		"\u00bc\7J\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7X\2\2\u00be\u00bf\7K\2\2"+
		"\u00bf\u00c0\7P\2\2\u00c0\u00c1\7I\2\2\u00c1\f\3\2\2\2\u00c2\u00c3\7Q"+
		"\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5\7F\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7"+
		"\7T\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7F\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb"+
		"\7U\2\2\u00cb\u00cc\7V\2\2\u00cc\u00cd\7K\2\2\u00cd\u00ce\7P\2\2\u00ce"+
		"\u00cf\7E\2\2\u00cf\u00d0\7V\2\2\u00d0\20\3\2\2\2\u00d1\u00d2\7C\2\2\u00d2"+
		"\u00d3\7N\2\2\u00d3\u00d4\7N\2\2\u00d4\22\3\2\2\2\u00d5\u00d6\7C\2\2\u00d6"+
		"\u00d7\7P\2\2\u00d7\u00d8\7F\2\2\u00d8\24\3\2\2\2\u00d9\u00da\7Q\2\2\u00da"+
		"\u00db\7T\2\2\u00db\26\3\2\2\2\u00dc\u00dd\7P\2\2\u00dd\u00de\7Q\2\2\u00de"+
		"\u00df\7V\2\2\u00df\30\3\2\2\2\u00e0\u00e1\7C\2\2\u00e1\u00e2\7F\2\2\u00e2"+
		"\u00e3\7F\2\2\u00e3\32\3\2\2\2\u00e4\u00e5\7C\2\2\u00e5\u00e6\7N\2\2\u00e6"+
		"\u00e7\7V\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7T\2\2\u00e9\34\3\2\2\2\u00ea"+
		"\u00eb\7C\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7E\2\2\u00ed\36\3\2\2\2\u00ee"+
		"\u00ef\7F\2\2\u00ef\u00f0\7G\2\2\u00f0\u00f1\7U\2\2\u00f1\u00f2\7E\2\2"+
		"\u00f2 \3\2\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f5\7T\2\2\u00f5\u00f6\7G\2"+
		"\2\u00f6\u00f7\7C\2\2\u00f7\u00f8\7V\2\2\u00f8\u00f9\7G\2\2\u00f9\"\3"+
		"\2\2\2\u00fa\u00fb\7U\2\2\u00fb\u00fc\7E\2\2\u00fc\u00fd\7J\2\2\u00fd"+
		"\u00fe\7G\2\2\u00fe\u00ff\7O\2\2\u00ff\u0100\7C\2\2\u0100$\3\2\2\2\u0101"+
		"\u0102\7F\2\2\u0102\u0103\7C\2\2\u0103\u0104\7V\2\2\u0104\u0105\7C\2\2"+
		"\u0105\u0106\7D\2\2\u0106\u0107\7C\2\2\u0107\u0108\7U\2\2\u0108\u0109"+
		"\7G\2\2\u0109&\3\2\2\2\u010a\u010b\7V\2\2\u010b\u010c\7C\2\2\u010c\u010d"+
		"\7D\2\2\u010d\u010e\7N\2\2\u010e\u010f\7G\2\2\u010f(\3\2\2\2\u0110\u0111"+
		"\7X\2\2\u0111\u0112\7K\2\2\u0112\u0113\7G\2\2\u0113\u0114\7Y\2\2\u0114"+
		"*\3\2\2\2\u0115\u0116\7E\2\2\u0116\u0117\7Q\2\2\u0117\u0118\7N\2\2\u0118"+
		"\u0119\7W\2\2\u0119\u011a\7O\2\2\u011a\u011b\7P\2\2\u011b,\3\2\2\2\u011c"+
		"\u011d\7F\2\2\u011d\u011e\7T\2\2\u011e\u011f\7Q\2\2\u011f\u0120\7R\2\2"+
		"\u0120.\3\2\2\2\u0121\u0122\7U\2\2\u0122\u0123\7G\2\2\u0123\u0124\7V\2"+
		"\2\u0124\60\3\2\2\2\u0125\u0126\7D\2\2\u0126\u0127\7[\2\2\u0127\62\3\2"+
		"\2\2\u0128\u0129\7R\2\2\u0129\u012a\7T\2\2\u012a\u012b\7K\2\2\u012b\u012c"+
		"\7O\2\2\u012c\u012d\7C\2\2\u012d\u012e\7T\2\2\u012e\u012f\7[\2\2\u012f"+
		"\64\3\2\2\2\u0130\u0131\7M\2\2\u0131\u0132\7G\2\2\u0132\u0133\7[\2\2\u0133"+
		"\66\3\2\2\2\u0134\u0135\7W\2\2\u0135\u0136\7P\2\2\u0136\u0137\7K\2\2\u0137"+
		"\u0138\7S\2\2\u0138\u0139\7W\2\2\u0139\u013a\7G\2\2\u013a8\3\2\2\2\u013b"+
		"\u013c\7T\2\2\u013c\u013d\7G\2\2\u013d\u013e\7P\2\2\u013e\u013f\7C\2\2"+
		"\u013f\u0140\7O\2\2\u0140\u0141\7G\2\2\u0141:\3\2\2\2\u0142\u0143\7V\2"+
		"\2\u0143\u0144\7Q\2\2\u0144<\3\2\2\2\u0145\u0146\7C\2\2\u0146\u0147\7"+
		"U\2\2\u0147>\3\2\2\2\u0148\u0149\7F\2\2\u0149\u014a\7G\2\2\u014a\u014b"+
		"\7N\2\2\u014b@\3\2\2\2\u014c\u014d\7F\2\2\u014d\u014e\7G\2\2\u014e\u014f"+
		"\7N\2\2\u014f\u0150\7G\2\2\u0150\u0151\7V\2\2\u0151\u0152\7G\2\2\u0152"+
		"B\3\2\2\2\u0153\u0154\7U\2\2\u0154\u0155\7G\2\2\u0155\u0156\7N\2\2\u0156"+
		"D\3\2\2\2\u0157\u0158\7K\2\2\u0158\u0159\7P\2\2\u0159\u015a\7U\2\2\u015a"+
		"\u015b\7G\2\2\u015b\u015c\7T\2\2\u015c\u015d\7V\2\2\u015dF\3\2\2\2\u015e"+
		"\u015f\7K\2\2\u015f\u0160\7P\2\2\u0160\u0161\7V\2\2\u0161\u0162\7Q\2\2"+
		"\u0162H\3\2\2\2\u0163\u0164\7X\2\2\u0164\u0165\7C\2\2\u0165\u0166\7N\2"+
		"\2\u0166\u0167\7W\2\2\u0167\u0168\7G\2\2\u0168\u0169\7U\2\2\u0169J\3\2"+
		"\2\2\u016a\u016b\7W\2\2\u016b\u016c\7R\2\2\u016c\u016d\7F\2\2\u016d\u016e"+
		"\7C\2\2\u016e\u016f\7V\2\2\u016f\u0170\7G\2\2\u0170L\3\2\2\2\u0171\u0172"+
		"\7L\2\2\u0172\u0173\7Q\2\2\u0173\u0174\7K\2\2\u0174\u0175\7P\2\2\u0175"+
		"N\3\2\2\2\u0176\u0177\7P\2\2\u0177\u0178\7C\2\2\u0178\u0179\7V\2\2\u0179"+
		"\u017a\7W\2\2\u017a\u017b\7T\2\2\u017b\u017c\7C\2\2\u017c\u017d\7N\2\2"+
		"\u017dP\3\2\2\2\u017e\u017f\7E\2\2\u017f\u0180\7T\2\2\u0180\u0181\7Q\2"+
		"\2\u0181\u0182\7U\2\2\u0182\u0183\7U\2\2\u0183R\3\2\2\2\u0184\u0185\7"+
		"K\2\2\u0185\u0186\7P\2\2\u0186\u0187\7P\2\2\u0187\u0188\7G\2\2\u0188\u0189"+
		"\7T\2\2\u0189T\3\2\2\2\u018a\u018b\7H\2\2\u018b\u018c\7W\2\2\u018c\u018d"+
		"\7N\2\2\u018d\u018e\7N\2\2\u018eV\3\2\2\2\u018f\u0190\7T\2\2\u0190\u0191"+
		"\7K\2\2\u0191\u0192\7I\2\2\u0192\u0193\7J\2\2\u0193\u0194\7V\2\2\u0194"+
		"X\3\2\2\2\u0195\u0196\7N\2\2\u0196\u0197\7G\2\2\u0197\u0198\7H\2\2\u0198"+
		"\u0199\7V\2\2\u0199Z\3\2\2\2\u019a\u019b\7Q\2\2\u019b\u019c\7W\2\2\u019c"+
		"\u019d\7V\2\2\u019d\u019e\7G\2\2\u019e\u019f\7T\2\2\u019f\\\3\2\2\2\u01a0"+
		"\u01a1\7E\2\2\u01a1\u01a2\7Q\2\2\u01a2\u01a3\7W\2\2\u01a3\u01a4\7P\2\2"+
		"\u01a4\u01a5\7V\2\2\u01a5^\3\2\2\2\u01a6\u01a7\7U\2\2\u01a7\u01a8\7W\2"+
		"\2\u01a8\u01a9\7O\2\2\u01a9`\3\2\2\2\u01aa\u01ab\7O\2\2\u01ab\u01ac\7"+
		"C\2\2\u01ac\u01ad\7Z\2\2\u01adb\3\2\2\2\u01ae\u01af\7O\2\2\u01af\u01b0"+
		"\7K\2\2\u01b0\u01b1\7P\2\2\u01b1d\3\2\2\2\u01b2\u01b3\7C\2\2\u01b3\u01b4"+
		"\7X\2\2\u01b4\u01b5\7I\2\2\u01b5f\3\2\2\2\u01b6\u01b7\7D\2\2\u01b7\u01b8"+
		"\7[\2\2\u01b8\u01b9\7V\2\2\u01b9\u01ba\7G\2\2\u01ba\u01bb\7K\2\2\u01bb"+
		"\u01bc\7P\2\2\u01bc\u01bd\7V\2\2\u01bdh\3\2\2\2\u01be\u01bf\7U\2\2\u01bf"+
		"\u01c0\7O\2\2\u01c0\u01c1\7C\2\2\u01c1\u01c2\7N\2\2\u01c2\u01c3\7N\2\2"+
		"\u01c3\u01c4\7K\2\2\u01c4\u01c5\7P\2\2\u01c5\u01c6\7V\2\2\u01c6j\3\2\2"+
		"\2\u01c7\u01c8\7K\2\2\u01c8\u01c9\7P\2\2\u01c9\u01ca\7V\2\2\u01ca\u01cb"+
		"\7G\2\2\u01cb\u01cc\7I\2\2\u01cc\u01cd\7G\2\2\u01cd\u01ce\7T\2\2\u01ce"+
		"l\3\2\2\2\u01cf\u01d0\7D\2\2\u01d0\u01d1\7K\2\2\u01d1\u01d2\7I\2\2\u01d2"+
		"\u01d3\7K\2\2\u01d3\u01d4\7P\2\2\u01d4\u01d5\7V\2\2\u01d5n\3\2\2\2\u01d6"+
		"\u01d7\7F\2\2\u01d7\u01d8\7G\2\2\u01d8\u01d9\7E\2\2\u01d9\u01da\7K\2\2"+
		"\u01da\u01db\7O\2\2\u01db\u01dc\7C\2\2\u01dc\u01dd\7N\2\2\u01ddp\3\2\2"+
		"\2\u01de\u01df\7P\2\2\u01df\u01e0\7W\2\2\u01e0\u01e1\7O\2\2\u01e1\u01e2"+
		"\7G\2\2\u01e2\u01e3\7T\2\2\u01e3\u01e4\7K\2\2\u01e4\u01e5\7E\2\2\u01e5"+
		"r\3\2\2\2\u01e6\u01e7\7H\2\2\u01e7\u01e8\7N\2\2\u01e8\u01e9\7Q\2\2\u01e9"+
		"\u01ea\7C\2\2\u01ea\u01eb\7V\2\2\u01ebt\3\2\2\2\u01ec\u01ed\7E\2\2\u01ed"+
		"\u01ee\7J\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\7T\2\2\u01f0v\3\2\2\2\u01f1"+
		"\u01f2\7X\2\2\u01f2\u01f3\7C\2\2\u01f3\u01f4\7T\2\2\u01f4\u01f5\7E\2\2"+
		"\u01f5\u01f6\7J\2\2\u01f6\u01f7\7C\2\2\u01f7\u01f8\7T\2\2\u01f8x\3\2\2"+
		"\2\u01f9\u01fa\7F\2\2\u01fa\u01fb\7C\2\2\u01fb\u01fc\7V\2\2\u01fc\u01fd"+
		"\7G\2\2\u01fdz\3\2\2\2\u01fe\u01ff\7V\2\2\u01ff\u0200\7K\2\2\u0200\u0201"+
		"\7O\2\2\u0201\u0202\7G\2\2\u0202|\3\2\2\2\u0203\u0204\7V\2\2\u0204\u0205"+
		"\7K\2\2\u0205\u0206\7O\2\2\u0206\u0207\7G\2\2\u0207\u0208\7U\2\2\u0208"+
		"\u0209\7V\2\2\u0209\u020a\7C\2\2\u020a\u020b\7O\2\2\u020b\u020c\7R\2\2"+
		"\u020c~\3\2\2\2\u020d\u020e\7*\2\2\u020e\u0080\3\2\2\2\u020f\u0210\7+"+
		"\2\2\u0210\u0082\3\2\2\2\u0211\u0212\7?\2\2\u0212\u0084\3\2\2\2\u0213"+
		"\u0214\7>\2\2\u0214\u0086\3\2\2\2\u0215\u0216\7>\2\2\u0216\u0217\7?\2"+
		"\2\u0217\u0088\3\2\2\2\u0218\u0219\7@\2\2\u0219\u008a\3\2\2\2\u021a\u021b"+
		"\7@\2\2\u021b\u021c\7?\2\2\u021c\u008c\3\2\2\2\u021d\u021e\7#\2\2\u021e"+
		"\u021f\7?\2\2\u021f\u008e\3\2\2\2\u0220\u0221\7>\2\2\u0221\u0222\7@\2"+
		"\2\u0222\u0090\3\2\2\2\u0223\u0224\7$\2\2\u0224\u0092\3\2\2\2\u0225\u0226"+
		"\7)\2\2\u0226\u0094\3\2\2\2\u0227\u0228\7=\2\2\u0228\u0096\3\2\2\2\u0229"+
		"\u022a\7.\2\2\u022a\u0098\3\2\2\2\u022b\u022c\7\60\2\2\u022c\u009a\3\2"+
		"\2\2\u022d\u022e\7,\2\2\u022e\u009c\3\2\2\2\u022f\u0233\t\2\2\2\u0230"+
		"\u0232\t\3\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u009e\3\2\2\2\u0235\u0233\3\2\2\2\u0236"+
		"\u023a\4\63;\2\u0237\u0239\4\62;\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2"+
		"\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u00a0\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023d\u023f\t\4\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u00a2\3\2\2\2\6\2\u0233"+
		"\u023a\u0240\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}