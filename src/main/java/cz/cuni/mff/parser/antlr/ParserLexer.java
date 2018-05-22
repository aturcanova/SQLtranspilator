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
		KEY=26, UNIQUE=27, RENAME=28, TO=29, LEFT_BRACKET=30, RIGHT_BRACKET=31, 
		SEMICOLON=32, COMMA=33, WS=34, TOKEN=35, ANY=36;
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
		"KEY", "UNIQUE", "RENAME", "TO", "LEFT_BRACKET", "RIGHT_BRACKET", "SEMICOLON", 
		"COMMA", "WS", "TOKEN", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\6#\u00f7\n#\r#\16#\u00f8\3"+
		"$\6$\u00fc\n$\r$\16$\u00fd\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\4\4\2\13\f\"\""+
		"\4\2C\\c|\2\u0102\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5R\3\2\2\2\7W\3\2\2\2\t]\3\2"+
		"\2\2\13c\3\2\2\2\rj\3\2\2\2\17p\3\2\2\2\21y\3\2\2\2\23}\3\2\2\2\25\u0081"+
		"\3\2\2\2\27\u0084\3\2\2\2\31\u0088\3\2\2\2\33\u008c\3\2\2\2\35\u0092\3"+
		"\2\2\2\37\u0096\3\2\2\2!\u009b\3\2\2\2#\u00a2\3\2\2\2%\u00a9\3\2\2\2\'"+
		"\u00b2\3\2\2\2)\u00b8\3\2\2\2+\u00bd\3\2\2\2-\u00c4\3\2\2\2/\u00c9\3\2"+
		"\2\2\61\u00cd\3\2\2\2\63\u00d0\3\2\2\2\65\u00d8\3\2\2\2\67\u00dc\3\2\2"+
		"\29\u00e3\3\2\2\2;\u00ea\3\2\2\2=\u00ed\3\2\2\2?\u00ef\3\2\2\2A\u00f1"+
		"\3\2\2\2C\u00f3\3\2\2\2E\u00f6\3\2\2\2G\u00fb\3\2\2\2I\u00ff\3\2\2\2K"+
		"L\7U\2\2LM\7G\2\2MN\7N\2\2NO\7G\2\2OP\7E\2\2PQ\7V\2\2Q\4\3\2\2\2RS\7H"+
		"\2\2ST\7T\2\2TU\7Q\2\2UV\7O\2\2V\6\3\2\2\2WX\7Y\2\2XY\7J\2\2YZ\7G\2\2"+
		"Z[\7T\2\2[\\\7G\2\2\\\b\3\2\2\2]^\7I\2\2^_\7T\2\2_`\7Q\2\2`a\7W\2\2ab"+
		"\7R\2\2b\n\3\2\2\2cd\7J\2\2de\7C\2\2ef\7X\2\2fg\7K\2\2gh\7P\2\2hi\7I\2"+
		"\2i\f\3\2\2\2jk\7Q\2\2kl\7T\2\2lm\7F\2\2mn\7G\2\2no\7T\2\2o\16\3\2\2\2"+
		"pq\7F\2\2qr\7K\2\2rs\7U\2\2st\7V\2\2tu\7K\2\2uv\7P\2\2vw\7E\2\2wx\7V\2"+
		"\2x\20\3\2\2\2yz\7C\2\2z{\7N\2\2{|\7N\2\2|\22\3\2\2\2}~\7C\2\2~\177\7"+
		"P\2\2\177\u0080\7F\2\2\u0080\24\3\2\2\2\u0081\u0082\7Q\2\2\u0082\u0083"+
		"\7T\2\2\u0083\26\3\2\2\2\u0084\u0085\7P\2\2\u0085\u0086\7Q\2\2\u0086\u0087"+
		"\7V\2\2\u0087\30\3\2\2\2\u0088\u0089\7C\2\2\u0089\u008a\7F\2\2\u008a\u008b"+
		"\7F\2\2\u008b\32\3\2\2\2\u008c\u008d\7C\2\2\u008d\u008e\7N\2\2\u008e\u008f"+
		"\7V\2\2\u008f\u0090\7G\2\2\u0090\u0091\7T\2\2\u0091\34\3\2\2\2\u0092\u0093"+
		"\7C\2\2\u0093\u0094\7U\2\2\u0094\u0095\7E\2\2\u0095\36\3\2\2\2\u0096\u0097"+
		"\7F\2\2\u0097\u0098\7G\2\2\u0098\u0099\7U\2\2\u0099\u009a\7E\2\2\u009a"+
		" \3\2\2\2\u009b\u009c\7E\2\2\u009c\u009d\7T\2\2\u009d\u009e\7G\2\2\u009e"+
		"\u009f\7C\2\2\u009f\u00a0\7V\2\2\u00a0\u00a1\7G\2\2\u00a1\"\3\2\2\2\u00a2"+
		"\u00a3\7U\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7J\2\2\u00a5\u00a6\7G\2\2"+
		"\u00a6\u00a7\7O\2\2\u00a7\u00a8\7C\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7F\2"+
		"\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7V\2\2\u00ac\u00ad\7C\2\2\u00ad\u00ae"+
		"\7D\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7G\2\2\u00b1"+
		"&\3\2\2\2\u00b2\u00b3\7V\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7D\2\2\u00b5"+
		"\u00b6\7N\2\2\u00b6\u00b7\7G\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7X\2\2\u00b9"+
		"\u00ba\7K\2\2\u00ba\u00bb\7G\2\2\u00bb\u00bc\7Y\2\2\u00bc*\3\2\2\2\u00bd"+
		"\u00be\7E\2\2\u00be\u00bf\7Q\2\2\u00bf\u00c0\7N\2\2\u00c0\u00c1\7W\2\2"+
		"\u00c1\u00c2\7O\2\2\u00c2\u00c3\7P\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7F\2"+
		"\2\u00c5\u00c6\7T\2\2\u00c6\u00c7\7Q\2\2\u00c7\u00c8\7R\2\2\u00c8.\3\2"+
		"\2\2\u00c9\u00ca\7U\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7V\2\2\u00cc\60"+
		"\3\2\2\2\u00cd\u00ce\7D\2\2\u00ce\u00cf\7[\2\2\u00cf\62\3\2\2\2\u00d0"+
		"\u00d1\7R\2\2\u00d1\u00d2\7T\2\2\u00d2\u00d3\7K\2\2\u00d3\u00d4\7O\2\2"+
		"\u00d4\u00d5\7C\2\2\u00d5\u00d6\7T\2\2\u00d6\u00d7\7[\2\2\u00d7\64\3\2"+
		"\2\2\u00d8\u00d9\7M\2\2\u00d9\u00da\7G\2\2\u00da\u00db\7[\2\2\u00db\66"+
		"\3\2\2\2\u00dc\u00dd\7W\2\2\u00dd\u00de\7P\2\2\u00de\u00df\7K\2\2\u00df"+
		"\u00e0\7S\2\2\u00e0\u00e1\7W\2\2\u00e1\u00e2\7G\2\2\u00e28\3\2\2\2\u00e3"+
		"\u00e4\7T\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7\7C\2\2"+
		"\u00e7\u00e8\7O\2\2\u00e8\u00e9\7G\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7V\2"+
		"\2\u00eb\u00ec\7Q\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee>\3\2\2\2"+
		"\u00ef\u00f0\7+\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7=\2\2\u00f2B\3\2\2\2\u00f3"+
		"\u00f4\7.\2\2\u00f4D\3\2\2\2\u00f5\u00f7\t\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9F\3\2\2\2"+
		"\u00fa\u00fc\t\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feH\3\2\2\2\u00ff\u0100\13\2\2\2\u0100"+
		"J\3\2\2\2\5\2\u00f8\u00fd\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}