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
		ASTERISK=77, NAME=78, TOKEN=79, INT=80, WS=81, ANY=82;
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
		"SEMICOLON", "COMMA", "DOT", "ASTERISK", "NAME", "TOKEN", "INT", "WS", 
		"ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u024d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39"+
		"\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3A"+
		"\3A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3J\3J"+
		"\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\7O\u0236\nO\fO\16O\u0239\13O\3P\6P\u023c"+
		"\nP\rP\16P\u023d\3Q\3Q\7Q\u0242\nQ\fQ\16Q\u0245\13Q\3R\6R\u0248\nR\rR"+
		"\16R\u0249\3S\3S\2\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\3\2\6\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2"+
		"C\\c|\4\2\13\f\"\"\2\u0250\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\3\u00a7\3\2\2\2\5\u00ae\3\2\2\2\7\u00b3\3\2\2\2\t\u00b9\3\2\2"+
		"\2\13\u00bf\3\2\2\2\r\u00c6\3\2\2\2\17\u00cc\3\2\2\2\21\u00d5\3\2\2\2"+
		"\23\u00d9\3\2\2\2\25\u00dd\3\2\2\2\27\u00e0\3\2\2\2\31\u00e4\3\2\2\2\33"+
		"\u00e8\3\2\2\2\35\u00ee\3\2\2\2\37\u00f2\3\2\2\2!\u00f7\3\2\2\2#\u00fe"+
		"\3\2\2\2%\u0105\3\2\2\2\'\u010e\3\2\2\2)\u0114\3\2\2\2+\u0119\3\2\2\2"+
		"-\u0120\3\2\2\2/\u0125\3\2\2\2\61\u0129\3\2\2\2\63\u012c\3\2\2\2\65\u0134"+
		"\3\2\2\2\67\u0138\3\2\2\29\u013f\3\2\2\2;\u0146\3\2\2\2=\u0149\3\2\2\2"+
		"?\u014c\3\2\2\2A\u0150\3\2\2\2C\u0157\3\2\2\2E\u015b\3\2\2\2G\u0162\3"+
		"\2\2\2I\u0167\3\2\2\2K\u016e\3\2\2\2M\u0175\3\2\2\2O\u017a\3\2\2\2Q\u0182"+
		"\3\2\2\2S\u0188\3\2\2\2U\u018e\3\2\2\2W\u0193\3\2\2\2Y\u0199\3\2\2\2["+
		"\u019e\3\2\2\2]\u01a4\3\2\2\2_\u01aa\3\2\2\2a\u01ae\3\2\2\2c\u01b2\3\2"+
		"\2\2e\u01b6\3\2\2\2g\u01ba\3\2\2\2i\u01c2\3\2\2\2k\u01cb\3\2\2\2m\u01d3"+
		"\3\2\2\2o\u01da\3\2\2\2q\u01e2\3\2\2\2s\u01ea\3\2\2\2u\u01f0\3\2\2\2w"+
		"\u01f5\3\2\2\2y\u01fd\3\2\2\2{\u0202\3\2\2\2}\u0207\3\2\2\2\177\u0211"+
		"\3\2\2\2\u0081\u0213\3\2\2\2\u0083\u0215\3\2\2\2\u0085\u0217\3\2\2\2\u0087"+
		"\u0219\3\2\2\2\u0089\u021c\3\2\2\2\u008b\u021e\3\2\2\2\u008d\u0221\3\2"+
		"\2\2\u008f\u0224\3\2\2\2\u0091\u0227\3\2\2\2\u0093\u0229\3\2\2\2\u0095"+
		"\u022b\3\2\2\2\u0097\u022d\3\2\2\2\u0099\u022f\3\2\2\2\u009b\u0231\3\2"+
		"\2\2\u009d\u0233\3\2\2\2\u009f\u023b\3\2\2\2\u00a1\u023f\3\2\2\2\u00a3"+
		"\u0247\3\2\2\2\u00a5\u024b\3\2\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7G\2"+
		"\2\u00a9\u00aa\7N\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac\7E\2\2\u00ac\u00ad"+
		"\7V\2\2\u00ad\4\3\2\2\2\u00ae\u00af\7H\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1"+
		"\7Q\2\2\u00b1\u00b2\7O\2\2\u00b2\6\3\2\2\2\u00b3\u00b4\7Y\2\2\u00b4\u00b5"+
		"\7J\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\7T\2\2\u00b7\u00b8\7G\2\2\u00b8"+
		"\b\3\2\2\2\u00b9\u00ba\7I\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bc\7Q\2\2\u00bc"+
		"\u00bd\7W\2\2\u00bd\u00be\7R\2\2\u00be\n\3\2\2\2\u00bf\u00c0\7J\2\2\u00c0"+
		"\u00c1\7C\2\2\u00c1\u00c2\7X\2\2\u00c2\u00c3\7K\2\2\u00c3\u00c4\7P\2\2"+
		"\u00c4\u00c5\7I\2\2\u00c5\f\3\2\2\2\u00c6\u00c7\7Q\2\2\u00c7\u00c8\7T"+
		"\2\2\u00c8\u00c9\7F\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7T\2\2\u00cb\16"+
		"\3\2\2\2\u00cc\u00cd\7F\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7U\2\2\u00cf"+
		"\u00d0\7V\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2\7P\2\2\u00d2\u00d3\7E\2\2"+
		"\u00d3\u00d4\7V\2\2\u00d4\20\3\2\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7"+
		"N\2\2\u00d7\u00d8\7N\2\2\u00d8\22\3\2\2\2\u00d9\u00da\7C\2\2\u00da\u00db"+
		"\7P\2\2\u00db\u00dc\7F\2\2\u00dc\24\3\2\2\2\u00dd\u00de\7Q\2\2\u00de\u00df"+
		"\7T\2\2\u00df\26\3\2\2\2\u00e0\u00e1\7P\2\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3"+
		"\7V\2\2\u00e3\30\3\2\2\2\u00e4\u00e5\7C\2\2\u00e5\u00e6\7F\2\2\u00e6\u00e7"+
		"\7F\2\2\u00e7\32\3\2\2\2\u00e8\u00e9\7C\2\2\u00e9\u00ea\7N\2\2\u00ea\u00eb"+
		"\7V\2\2\u00eb\u00ec\7G\2\2\u00ec\u00ed\7T\2\2\u00ed\34\3\2\2\2\u00ee\u00ef"+
		"\7C\2\2\u00ef\u00f0\7U\2\2\u00f0\u00f1\7E\2\2\u00f1\36\3\2\2\2\u00f2\u00f3"+
		"\7F\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5\7U\2\2\u00f5\u00f6\7E\2\2\u00f6"+
		" \3\2\2\2\u00f7\u00f8\7E\2\2\u00f8\u00f9\7T\2\2\u00f9\u00fa\7G\2\2\u00fa"+
		"\u00fb\7C\2\2\u00fb\u00fc\7V\2\2\u00fc\u00fd\7G\2\2\u00fd\"\3\2\2\2\u00fe"+
		"\u00ff\7U\2\2\u00ff\u0100\7E\2\2\u0100\u0101\7J\2\2\u0101\u0102\7G\2\2"+
		"\u0102\u0103\7O\2\2\u0103\u0104\7C\2\2\u0104$\3\2\2\2\u0105\u0106\7F\2"+
		"\2\u0106\u0107\7C\2\2\u0107\u0108\7V\2\2\u0108\u0109\7C\2\2\u0109\u010a"+
		"\7D\2\2\u010a\u010b\7C\2\2\u010b\u010c\7U\2\2\u010c\u010d\7G\2\2\u010d"+
		"&\3\2\2\2\u010e\u010f\7V\2\2\u010f\u0110\7C\2\2\u0110\u0111\7D\2\2\u0111"+
		"\u0112\7N\2\2\u0112\u0113\7G\2\2\u0113(\3\2\2\2\u0114\u0115\7X\2\2\u0115"+
		"\u0116\7K\2\2\u0116\u0117\7G\2\2\u0117\u0118\7Y\2\2\u0118*\3\2\2\2\u0119"+
		"\u011a\7E\2\2\u011a\u011b\7Q\2\2\u011b\u011c\7N\2\2\u011c\u011d\7W\2\2"+
		"\u011d\u011e\7O\2\2\u011e\u011f\7P\2\2\u011f,\3\2\2\2\u0120\u0121\7F\2"+
		"\2\u0121\u0122\7T\2\2\u0122\u0123\7Q\2\2\u0123\u0124\7R\2\2\u0124.\3\2"+
		"\2\2\u0125\u0126\7U\2\2\u0126\u0127\7G\2\2\u0127\u0128\7V\2\2\u0128\60"+
		"\3\2\2\2\u0129\u012a\7D\2\2\u012a\u012b\7[\2\2\u012b\62\3\2\2\2\u012c"+
		"\u012d\7R\2\2\u012d\u012e\7T\2\2\u012e\u012f\7K\2\2\u012f\u0130\7O\2\2"+
		"\u0130\u0131\7C\2\2\u0131\u0132\7T\2\2\u0132\u0133\7[\2\2\u0133\64\3\2"+
		"\2\2\u0134\u0135\7M\2\2\u0135\u0136\7G\2\2\u0136\u0137\7[\2\2\u0137\66"+
		"\3\2\2\2\u0138\u0139\7W\2\2\u0139\u013a\7P\2\2\u013a\u013b\7K\2\2\u013b"+
		"\u013c\7S\2\2\u013c\u013d\7W\2\2\u013d\u013e\7G\2\2\u013e8\3\2\2\2\u013f"+
		"\u0140\7T\2\2\u0140\u0141\7G\2\2\u0141\u0142\7P\2\2\u0142\u0143\7C\2\2"+
		"\u0143\u0144\7O\2\2\u0144\u0145\7G\2\2\u0145:\3\2\2\2\u0146\u0147\7V\2"+
		"\2\u0147\u0148\7Q\2\2\u0148<\3\2\2\2\u0149\u014a\7C\2\2\u014a\u014b\7"+
		"U\2\2\u014b>\3\2\2\2\u014c\u014d\7F\2\2\u014d\u014e\7G\2\2\u014e\u014f"+
		"\7N\2\2\u014f@\3\2\2\2\u0150\u0151\7F\2\2\u0151\u0152\7G\2\2\u0152\u0153"+
		"\7N\2\2\u0153\u0154\7G\2\2\u0154\u0155\7V\2\2\u0155\u0156\7G\2\2\u0156"+
		"B\3\2\2\2\u0157\u0158\7U\2\2\u0158\u0159\7G\2\2\u0159\u015a\7N\2\2\u015a"+
		"D\3\2\2\2\u015b\u015c\7K\2\2\u015c\u015d\7P\2\2\u015d\u015e\7U\2\2\u015e"+
		"\u015f\7G\2\2\u015f\u0160\7T\2\2\u0160\u0161\7V\2\2\u0161F\3\2\2\2\u0162"+
		"\u0163\7K\2\2\u0163\u0164\7P\2\2\u0164\u0165\7V\2\2\u0165\u0166\7Q\2\2"+
		"\u0166H\3\2\2\2\u0167\u0168\7X\2\2\u0168\u0169\7C\2\2\u0169\u016a\7N\2"+
		"\2\u016a\u016b\7W\2\2\u016b\u016c\7G\2\2\u016c\u016d\7U\2\2\u016dJ\3\2"+
		"\2\2\u016e\u016f\7W\2\2\u016f\u0170\7R\2\2\u0170\u0171\7F\2\2\u0171\u0172"+
		"\7C\2\2\u0172\u0173\7V\2\2\u0173\u0174\7G\2\2\u0174L\3\2\2\2\u0175\u0176"+
		"\7L\2\2\u0176\u0177\7Q\2\2\u0177\u0178\7K\2\2\u0178\u0179\7P\2\2\u0179"+
		"N\3\2\2\2\u017a\u017b\7P\2\2\u017b\u017c\7C\2\2\u017c\u017d\7V\2\2\u017d"+
		"\u017e\7W\2\2\u017e\u017f\7T\2\2\u017f\u0180\7C\2\2\u0180\u0181\7N\2\2"+
		"\u0181P\3\2\2\2\u0182\u0183\7E\2\2\u0183\u0184\7T\2\2\u0184\u0185\7Q\2"+
		"\2\u0185\u0186\7U\2\2\u0186\u0187\7U\2\2\u0187R\3\2\2\2\u0188\u0189\7"+
		"K\2\2\u0189\u018a\7P\2\2\u018a\u018b\7P\2\2\u018b\u018c\7G\2\2\u018c\u018d"+
		"\7T\2\2\u018dT\3\2\2\2\u018e\u018f\7H\2\2\u018f\u0190\7W\2\2\u0190\u0191"+
		"\7N\2\2\u0191\u0192\7N\2\2\u0192V\3\2\2\2\u0193\u0194\7T\2\2\u0194\u0195"+
		"\7K\2\2\u0195\u0196\7I\2\2\u0196\u0197\7J\2\2\u0197\u0198\7V\2\2\u0198"+
		"X\3\2\2\2\u0199\u019a\7N\2\2\u019a\u019b\7G\2\2\u019b\u019c\7H\2\2\u019c"+
		"\u019d\7V\2\2\u019dZ\3\2\2\2\u019e\u019f\7Q\2\2\u019f\u01a0\7W\2\2\u01a0"+
		"\u01a1\7V\2\2\u01a1\u01a2\7G\2\2\u01a2\u01a3\7T\2\2\u01a3\\\3\2\2\2\u01a4"+
		"\u01a5\7E\2\2\u01a5\u01a6\7Q\2\2\u01a6\u01a7\7W\2\2\u01a7\u01a8\7P\2\2"+
		"\u01a8\u01a9\7V\2\2\u01a9^\3\2\2\2\u01aa\u01ab\7U\2\2\u01ab\u01ac\7W\2"+
		"\2\u01ac\u01ad\7O\2\2\u01ad`\3\2\2\2\u01ae\u01af\7O\2\2\u01af\u01b0\7"+
		"C\2\2\u01b0\u01b1\7Z\2\2\u01b1b\3\2\2\2\u01b2\u01b3\7O\2\2\u01b3\u01b4"+
		"\7K\2\2\u01b4\u01b5\7P\2\2\u01b5d\3\2\2\2\u01b6\u01b7\7C\2\2\u01b7\u01b8"+
		"\7X\2\2\u01b8\u01b9\7I\2\2\u01b9f\3\2\2\2\u01ba\u01bb\7D\2\2\u01bb\u01bc"+
		"\7[\2\2\u01bc\u01bd\7V\2\2\u01bd\u01be\7G\2\2\u01be\u01bf\7K\2\2\u01bf"+
		"\u01c0\7P\2\2\u01c0\u01c1\7V\2\2\u01c1h\3\2\2\2\u01c2\u01c3\7U\2\2\u01c3"+
		"\u01c4\7O\2\2\u01c4\u01c5\7C\2\2\u01c5\u01c6\7N\2\2\u01c6\u01c7\7N\2\2"+
		"\u01c7\u01c8\7K\2\2\u01c8\u01c9\7P\2\2\u01c9\u01ca\7V\2\2\u01caj\3\2\2"+
		"\2\u01cb\u01cc\7K\2\2\u01cc\u01cd\7P\2\2\u01cd\u01ce\7V\2\2\u01ce\u01cf"+
		"\7G\2\2\u01cf\u01d0\7I\2\2\u01d0\u01d1\7G\2\2\u01d1\u01d2\7T\2\2\u01d2"+
		"l\3\2\2\2\u01d3\u01d4\7D\2\2\u01d4\u01d5\7K\2\2\u01d5\u01d6\7I\2\2\u01d6"+
		"\u01d7\7K\2\2\u01d7\u01d8\7P\2\2\u01d8\u01d9\7V\2\2\u01d9n\3\2\2\2\u01da"+
		"\u01db\7F\2\2\u01db\u01dc\7G\2\2\u01dc\u01dd\7E\2\2\u01dd\u01de\7K\2\2"+
		"\u01de\u01df\7O\2\2\u01df\u01e0\7C\2\2\u01e0\u01e1\7N\2\2\u01e1p\3\2\2"+
		"\2\u01e2\u01e3\7P\2\2\u01e3\u01e4\7W\2\2\u01e4\u01e5\7O\2\2\u01e5\u01e6"+
		"\7G\2\2\u01e6\u01e7\7T\2\2\u01e7\u01e8\7K\2\2\u01e8\u01e9\7E\2\2\u01e9"+
		"r\3\2\2\2\u01ea\u01eb\7H\2\2\u01eb\u01ec\7N\2\2\u01ec\u01ed\7Q\2\2\u01ed"+
		"\u01ee\7C\2\2\u01ee\u01ef\7V\2\2\u01eft\3\2\2\2\u01f0\u01f1\7E\2\2\u01f1"+
		"\u01f2\7J\2\2\u01f2\u01f3\7C\2\2\u01f3\u01f4\7T\2\2\u01f4v\3\2\2\2\u01f5"+
		"\u01f6\7X\2\2\u01f6\u01f7\7C\2\2\u01f7\u01f8\7T\2\2\u01f8\u01f9\7E\2\2"+
		"\u01f9\u01fa\7J\2\2\u01fa\u01fb\7C\2\2\u01fb\u01fc\7T\2\2\u01fcx\3\2\2"+
		"\2\u01fd\u01fe\7F\2\2\u01fe\u01ff\7C\2\2\u01ff\u0200\7V\2\2\u0200\u0201"+
		"\7G\2\2\u0201z\3\2\2\2\u0202\u0203\7V\2\2\u0203\u0204\7K\2\2\u0204\u0205"+
		"\7O\2\2\u0205\u0206\7G\2\2\u0206|\3\2\2\2\u0207\u0208\7V\2\2\u0208\u0209"+
		"\7K\2\2\u0209\u020a\7O\2\2\u020a\u020b\7G\2\2\u020b\u020c\7U\2\2\u020c"+
		"\u020d\7V\2\2\u020d\u020e\7C\2\2\u020e\u020f\7O\2\2\u020f\u0210\7R\2\2"+
		"\u0210~\3\2\2\2\u0211\u0212\7*\2\2\u0212\u0080\3\2\2\2\u0213\u0214\7+"+
		"\2\2\u0214\u0082\3\2\2\2\u0215\u0216\7?\2\2\u0216\u0084\3\2\2\2\u0217"+
		"\u0218\7>\2\2\u0218\u0086\3\2\2\2\u0219\u021a\7>\2\2\u021a\u021b\7?\2"+
		"\2\u021b\u0088\3\2\2\2\u021c\u021d\7@\2\2\u021d\u008a\3\2\2\2\u021e\u021f"+
		"\7@\2\2\u021f\u0220\7?\2\2\u0220\u008c\3\2\2\2\u0221\u0222\7#\2\2\u0222"+
		"\u0223\7?\2\2\u0223\u008e\3\2\2\2\u0224\u0225\7>\2\2\u0225\u0226\7@\2"+
		"\2\u0226\u0090\3\2\2\2\u0227\u0228\7$\2\2\u0228\u0092\3\2\2\2\u0229\u022a"+
		"\7)\2\2\u022a\u0094\3\2\2\2\u022b\u022c\7=\2\2\u022c\u0096\3\2\2\2\u022d"+
		"\u022e\7.\2\2\u022e\u0098\3\2\2\2\u022f\u0230\7\60\2\2\u0230\u009a\3\2"+
		"\2\2\u0231\u0232\7,\2\2\u0232\u009c\3\2\2\2\u0233\u0237\t\2\2\2\u0234"+
		"\u0236\t\3\2\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u009e\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"\u023c\t\4\2\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u00a0\3\2\2\2\u023f\u0243\4\63;\2\u0240"+
		"\u0242\4\62;\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u00a2\3\2\2\2\u0245\u0243\3\2\2\2\u0246"+
		"\u0248\t\5\2\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u00a4\3\2\2\2\u024b\u024c\13\2\2\2\u024c"+
		"\u00a6\3\2\2\2\7\2\u0237\u023d\u0243\u0249\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}