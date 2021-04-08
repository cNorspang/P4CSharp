// Generated from C:/Users/Norspang/RiderProjects/POTBAG/POTBAG/AntlrFiles\BetterAdvGm.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BetterAdvGmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, KEYWORD_TEXT=2, KEYWORD_STRING=3, END_STMT=4, STRING=5, 
		TRAVEL_KEYWORD=6, INCREMENT=7, CURLY_LEFT=8, CURLY_RIGHT=9, PAREN_LEFT=10, 
		PAREN_RIGHT=11, SQUARE_LEFT=12, SQUARE_RIGHT=13, KEYWORD_INPUT=14, KEYWORD_INT=15, 
		KEYWORD_IF=16, KEYWORD_ELSE=17, KEYWORD_ELSEIF=18, KEYWORD_WHILE=19, KEYWORD_FOR=20, 
		KEYWORD_LOCATION=21, KEYWORD_SETUP=22, KEYWORD_LOCATIONARRAY=23, KEYWORD_LOCATIONS=24, 
		KEYWORD_CHOICE=25, COMMA_SEPERATOR=26, CMP_OPERATOR=27, ASSIGN_OPERATOR=28, 
		COMPOUND_OPERATOR=29, TIMES_OPERATOR=30, DIVISION_OPERATOR=31, PLUS_OPERATOR=32, 
		MINUS_OPERATOR=33, ARROW_OPERATOR=34, AND_OPERATOR=35, OR_OPERATOR=36, 
		NUM=37, VAR_NAME=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTERS", "WHITESPACE", "KEYWORD_TEXT", "KEYWORD_STRING", "END_STMT", 
			"STRING", "TRAVEL_KEYWORD", "INCREMENT", "CURLY_LEFT", "CURLY_RIGHT", 
			"PAREN_LEFT", "PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_INPUT", 
			"KEYWORD_INT", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", "KEYWORD_WHILE", 
			"KEYWORD_FOR", "KEYWORD_LOCATION", "KEYWORD_SETUP", "KEYWORD_LOCATIONARRAY", 
			"KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "COMMA_SEPERATOR", "CMP_OPERATOR", 
			"ASSIGN_OPERATOR", "COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", 
			"PLUS_OPERATOR", "MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", 
			"OR_OPERATOR", "NUM", "VAR_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Text '", "'string '", "';'", null, "'Travel '", "'++'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'userInput'", "'int'", "'if'", 
			"'else'", "'else if'", "'while'", "'for'", "'Location'", "'setup'", "'LocationArray'", 
			"'Locations'", "'choice'", "','", null, "'='", "'+='", "'*'", "'/'", 
			"'+'", "'-'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "KEYWORD_TEXT", "KEYWORD_STRING", "END_STMT", "STRING", 
			"TRAVEL_KEYWORD", "INCREMENT", "CURLY_LEFT", "CURLY_RIGHT", "PAREN_LEFT", 
			"PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_INPUT", "KEYWORD_INT", 
			"KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", "KEYWORD_WHILE", "KEYWORD_FOR", 
			"KEYWORD_LOCATION", "KEYWORD_SETUP", "KEYWORD_LOCATIONARRAY", "KEYWORD_LOCATIONS", 
			"KEYWORD_CHOICE", "COMMA_SEPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", 
			"COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", 
			"MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "NUM", 
			"VAR_NAME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public BetterAdvGmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BetterAdvGm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\6\3U\n\3"+
		"\r\3\16\3V\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0108\n\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0122\n%\3&\3&\3&\3&\3&\3&\5&"+
		"\u012a\n&\3\'\6\'\u012d\n\'\r\'\16\'\u012e\3(\3(\6(\u0133\n(\r(\16(\u0134"+
		"\2\2)\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35"+
		"\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35"+
		";\36=\37? A!C\"E#G$I%K&M\'O(\3\2\6\4\2C\\c|\5\2\13\f\17\17\"\"\3\2$$\3"+
		"\2\62;\2\u0143\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5T\3\2\2"+
		"\2\7Z\3\2\2\2\t`\3\2\2\2\13h\3\2\2\2\rj\3\2\2\2\17s\3\2\2\2\21{\3\2\2"+
		"\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086"+
		"\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u0094\3\2\2\2#\u0098\3\2\2"+
		"\2%\u009b\3\2\2\2\'\u00a0\3\2\2\2)\u00a8\3\2\2\2+\u00ae\3\2\2\2-\u00b2"+
		"\3\2\2\2/\u00bb\3\2\2\2\61\u00c1\3\2\2\2\63\u00cf\3\2\2\2\65\u00d9\3\2"+
		"\2\2\67\u00e0\3\2\2\29\u0107\3\2\2\2;\u0109\3\2\2\2=\u010b\3\2\2\2?\u010e"+
		"\3\2\2\2A\u0110\3\2\2\2C\u0112\3\2\2\2E\u0114\3\2\2\2G\u0116\3\2\2\2I"+
		"\u0121\3\2\2\2K\u0129\3\2\2\2M\u012c\3\2\2\2O\u0132\3\2\2\2QR\t\2\2\2"+
		"R\4\3\2\2\2SU\t\3\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2"+
		"\2XY\b\3\2\2Y\6\3\2\2\2Z[\7V\2\2[\\\7g\2\2\\]\7z\2\2]^\7v\2\2^_\7\"\2"+
		"\2_\b\3\2\2\2`a\7u\2\2ab\7v\2\2bc\7t\2\2cd\7k\2\2de\7p\2\2ef\7i\2\2fg"+
		"\7\"\2\2g\n\3\2\2\2hi\7=\2\2i\f\3\2\2\2jn\7$\2\2km\n\4\2\2lk\3\2\2\2m"+
		"p\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7$\2\2r\16\3\2\2\2"+
		"st\7V\2\2tu\7t\2\2uv\7c\2\2vw\7x\2\2wx\7g\2\2xy\7n\2\2yz\7\"\2\2z\20\3"+
		"\2\2\2{|\7-\2\2|}\7-\2\2}\22\3\2\2\2~\177\7}\2\2\177\24\3\2\2\2\u0080"+
		"\u0081\7\177\2\2\u0081\26\3\2\2\2\u0082\u0083\7*\2\2\u0083\30\3\2\2\2"+
		"\u0084\u0085\7+\2\2\u0085\32\3\2\2\2\u0086\u0087\7]\2\2\u0087\34\3\2\2"+
		"\2\u0088\u0089\7_\2\2\u0089\36\3\2\2\2\u008a\u008b\7w\2\2\u008b\u008c"+
		"\7u\2\2\u008c\u008d\7g\2\2\u008d\u008e\7t\2\2\u008e\u008f\7K\2\2\u008f"+
		"\u0090\7p\2\2\u0090\u0091\7r\2\2\u0091\u0092\7w\2\2\u0092\u0093\7v\2\2"+
		"\u0093 \3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2"+
		"\2\u0097\"\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a$\3\2\2"+
		"\2\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f"+
		"\7g\2\2\u009f&\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3"+
		"\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7h\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad*\3\2\2\2\u00ae"+
		"\u00af\7h\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7t\2\2\u00b1,\3\2\2\2\u00b2"+
		"\u00b3\7N\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7c\2\2"+
		"\u00b6\u00b7\7v\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7r\2\2\u00c0\60\3\2\2\2\u00c1\u00c2"+
		"\7N\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7v\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2"+
		"\u00c9\u00ca\7C\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd"+
		"\7c\2\2\u00cd\u00ce\7{\2\2\u00ce\62\3\2\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1"+
		"\7q\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7u\2\2"+
		"\u00d8\64\3\2\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7"+
		"q\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7g\2\2\u00df\66"+
		"\3\2\2\2\u00e0\u00e1\7.\2\2\u00e18\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u0108"+
		"\7u\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7\"\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\u00e9\7q\2\2\u00e9\u0108\7v\2\2\u00ea\u00eb\7?\2\2"+
		"\u00eb\u0108\7?\2\2\u00ec\u00ed\7i\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7j\2"+
		"\2\u00f6\u00f7\7c\2\2\u00f7\u0108\7p\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7g\2\2\u00fd"+
		"\u00fe\7t\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7j\2"+
		"\2\u0101\u0102\7c\2\2\u0102\u0108\7p\2\2\u0103\u0104\7>\2\2\u0104\u0108"+
		"\7?\2\2\u0105\u0106\7@\2\2\u0106\u0108\7?\2\2\u0107\u00e2\3\2\2\2\u0107"+
		"\u00e4\3\2\2\2\u0107\u00ea\3\2\2\2\u0107\u00ec\3\2\2\2\u0107\u00f8\3\2"+
		"\2\2\u0107\u0103\3\2\2\2\u0107\u0105\3\2\2\2\u0108:\3\2\2\2\u0109\u010a"+
		"\7?\2\2\u010a<\3\2\2\2\u010b\u010c\7-\2\2\u010c\u010d\7?\2\2\u010d>\3"+
		"\2\2\2\u010e\u010f\7,\2\2\u010f@\3\2\2\2\u0110\u0111\7\61\2\2\u0111B\3"+
		"\2\2\2\u0112\u0113\7-\2\2\u0113D\3\2\2\2\u0114\u0115\7/\2\2\u0115F\3\2"+
		"\2\2\u0116\u0117\7/\2\2\u0117\u0118\7@\2\2\u0118H\3\2\2\2\u0119\u011a"+
		"\7(\2\2\u011a\u0122\7(\2\2\u011b\u011c\7c\2\2\u011c\u011d\7p\2\2\u011d"+
		"\u0122\7f\2\2\u011e\u011f\7C\2\2\u011f\u0120\7P\2\2\u0120\u0122\7F\2\2"+
		"\u0121\u0119\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122J\3"+
		"\2\2\2\u0123\u0124\7~\2\2\u0124\u012a\7~\2\2\u0125\u0126\7q\2\2\u0126"+
		"\u012a\7t\2\2\u0127\u0128\7Q\2\2\u0128\u012a\7T\2\2\u0129\u0123\3\2\2"+
		"\2\u0129\u0125\3\2\2\2\u0129\u0127\3\2\2\2\u012aL\3\2\2\2\u012b\u012d"+
		"\t\5\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012fN\3\2\2\2\u0130\u0133\5\3\2\2\u0131\u0133\7a\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135P\3\2\2\2\13\2Vn\u0107\u0121\u0129\u012e"+
		"\u0132\u0134\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}