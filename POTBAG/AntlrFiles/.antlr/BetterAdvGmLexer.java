// Generated from c:\Users\denni\Documents\P4\P4CSharp\POTBAG\AntlrFiles\BetterAdvGm.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, KEYWORD_TEXT=2, KEYWORD_STRING=3, END_STMT=4, STRING=5, 
		TRAVEL_KEYWORD=6, INCREMENT=7, CURLY_LEFT=8, CURLY_RIGHT=9, PAREN_LEFT=10, 
		PAREN_RIGHT=11, SQUARE_LEFT=12, SQUARE_RIGHT=13, KEYWORD_INPUT=14, KEYWORD_INT=15, 
		KEYWORD_IF=16, KEYWORD_ELSE=17, KEYWORD_ELSEIF=18, KEYWORD_WHILE=19, KEYWORD_FOR=20, 
		KEYWORD_LOCATION=21, KEYWORD_SETUP=22, KEYWORD_PLAYER=23, KEYWORD_LOCATIONARRAY=24, 
		KEYWORD_LOCATIONS=25, KEYWORD_CHOICE=26, COMMA_SEPERATOR=27, BOOL_CMP_OPERATOR=28, 
		CMP_OPERATOR=29, ASSIGN_OPERATOR=30, COMPOUND_OPERATOR=31, TIMES_OPERATOR=32, 
		DIVISION_OPERATOR=33, PLUS_OPERATOR=34, MINUS_OPERATOR=35, ARROW_OPERATOR=36, 
		AND_OPERATOR=37, OR_OPERATOR=38, BOOL=39, NUM=40, VAR_NAME=41;
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
			"KEYWORD_FOR", "KEYWORD_LOCATION", "KEYWORD_SETUP", "KEYWORD_PLAYER", 
			"KEYWORD_LOCATIONARRAY", "KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "COMMA_SEPERATOR", 
			"BOOL_CMP_OPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", "COMPOUND_OPERATOR", 
			"TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", "MINUS_OPERATOR", 
			"ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "BOOL", "NUM", "VAR_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Text '", "'string '", "';'", null, "'Travel '", "'++'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'userInput'", "'int'", "'if'", 
			"'else'", "'else if'", "'while'", "'for'", "'Location'", "'setup'", "'player'", 
			"'LocationArray'", "'Locations'", "'choice'", "','", null, null, "'='", 
			"'+='", "'*'", "'/'", "'+'", "'-'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "KEYWORD_TEXT", "KEYWORD_STRING", "END_STMT", "STRING", 
			"TRAVEL_KEYWORD", "INCREMENT", "CURLY_LEFT", "CURLY_RIGHT", "PAREN_LEFT", 
			"PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_INPUT", "KEYWORD_INT", 
			"KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", "KEYWORD_WHILE", "KEYWORD_FOR", 
			"KEYWORD_LOCATION", "KEYWORD_SETUP", "KEYWORD_PLAYER", "KEYWORD_LOCATIONARRAY", 
			"KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "COMMA_SEPERATOR", "BOOL_CMP_OPERATOR", 
			"CMP_OPERATOR", "ASSIGN_OPERATOR", "COMPOUND_OPERATOR", "TIMES_OPERATOR", 
			"DIVISION_OPERATOR", "PLUS_OPERATOR", "MINUS_OPERATOR", "ARROW_OPERATOR", 
			"AND_OPERATOR", "OR_OPERATOR", "BOOL", "NUM", "VAR_NAME"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0153\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\6\3[\n\3\r\3\16\3\\\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7s\n\7\f\7\16\7v\13\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u00fc\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u011a\n\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0134\n\'\3(\3(\3"+
		"(\3(\3(\3(\5(\u013c\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0147\n)\3*\6*\u014a"+
		"\n*\r*\16*\u014b\3+\3+\6+\u0150\n+\r+\16+\u0151\2\2,\3\2\5\3\7\4\t\5\13"+
		"\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'"+
		"\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+\3\2\7\4\2C\\c|\5\2\13\f\17\17\"\"\3\2$$\4\2>>@@\3\2\62;\2"+
		"\u0162\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\3W\3\2\2\2\5Z\3\2\2\2\7`\3\2\2\2\tf\3\2\2\2\13n\3\2\2\2\rp\3\2\2"+
		"\2\17y\3\2\2\2\21\u0081\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088"+
		"\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0090\3"+
		"\2\2\2!\u009a\3\2\2\2#\u009e\3\2\2\2%\u00a1\3\2\2\2\'\u00a6\3\2\2\2)\u00ae"+
		"\3\2\2\2+\u00b4\3\2\2\2-\u00b8\3\2\2\2/\u00c1\3\2\2\2\61\u00c7\3\2\2\2"+
		"\63\u00ce\3\2\2\2\65\u00dc\3\2\2\2\67\u00e6\3\2\2\29\u00ed\3\2\2\2;\u00fb"+
		"\3\2\2\2=\u0119\3\2\2\2?\u011b\3\2\2\2A\u011d\3\2\2\2C\u0120\3\2\2\2E"+
		"\u0122\3\2\2\2G\u0124\3\2\2\2I\u0126\3\2\2\2K\u0128\3\2\2\2M\u0133\3\2"+
		"\2\2O\u013b\3\2\2\2Q\u0146\3\2\2\2S\u0149\3\2\2\2U\u014f\3\2\2\2WX\t\2"+
		"\2\2X\4\3\2\2\2Y[\t\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]"+
		"^\3\2\2\2^_\b\3\2\2_\6\3\2\2\2`a\7V\2\2ab\7g\2\2bc\7z\2\2cd\7v\2\2de\7"+
		"\"\2\2e\b\3\2\2\2fg\7u\2\2gh\7v\2\2hi\7t\2\2ij\7k\2\2jk\7p\2\2kl\7i\2"+
		"\2lm\7\"\2\2m\n\3\2\2\2no\7=\2\2o\f\3\2\2\2pt\7$\2\2qs\n\4\2\2rq\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7$\2\2x\16\3\2"+
		"\2\2yz\7V\2\2z{\7t\2\2{|\7c\2\2|}\7x\2\2}~\7g\2\2~\177\7n\2\2\177\u0080"+
		"\7\"\2\2\u0080\20\3\2\2\2\u0081\u0082\7-\2\2\u0082\u0083\7-\2\2\u0083"+
		"\22\3\2\2\2\u0084\u0085\7}\2\2\u0085\24\3\2\2\2\u0086\u0087\7\177\2\2"+
		"\u0087\26\3\2\2\2\u0088\u0089\7*\2\2\u0089\30\3\2\2\2\u008a\u008b\7+\2"+
		"\2\u008b\32\3\2\2\2\u008c\u008d\7]\2\2\u008d\34\3\2\2\2\u008e\u008f\7"+
		"_\2\2\u008f\36\3\2\2\2\u0090\u0091\7w\2\2\u0091\u0092\7u\2\2\u0092\u0093"+
		"\7g\2\2\u0093\u0094\7t\2\2\u0094\u0095\7K\2\2\u0095\u0096\7p\2\2\u0096"+
		"\u0097\7r\2\2\u0097\u0098\7w\2\2\u0098\u0099\7v\2\2\u0099 \3\2\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d\"\3\2\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5&\3\2\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7h\2\2\u00ad(\3\2"+
		"\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2"+
		"\7n\2\2\u00b2\u00b3\7g\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00b7\7t\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7N\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0.\3\2\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7w\2\2"+
		"\u00c5\u00c6\7r\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7"+
		"n\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7{\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7N\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1"+
		"\7e\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7k\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7C\2\2\u00d7\u00d8\7t\2\2"+
		"\u00d8\u00d9\7t\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7{\2\2\u00db\64\3\2"+
		"\2\2\u00dc\u00dd\7N\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7e\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7p\2\2\u00e4\u00e5\7u\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7"+
		"\u00e8\7j\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7e\2\2"+
		"\u00eb\u00ec\7g\2\2\u00ec8\3\2\2\2\u00ed\u00ee\7.\2\2\u00ee:\3\2\2\2\u00ef"+
		"\u00f0\7?\2\2\u00f0\u00fc\7?\2\2\u00f1\u00f2\7k\2\2\u00f2\u00fc\7u\2\2"+
		"\u00f3\u00f4\7#\2\2\u00f4\u00fc\7?\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7"+
		"\7u\2\2\u00f7\u00f8\7\"\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7q\2\2\u00fa"+
		"\u00fc\7v\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f3\3\2"+
		"\2\2\u00fb\u00f5\3\2\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7i\2\2\u00fe\u00ff"+
		"\7t\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7c\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104\u0105\7\"\2\2\u0105\u0106\7v\2"+
		"\2\u0106\u0107\7j\2\2\u0107\u0108\7c\2\2\u0108\u011a\7p\2\2\u0109\u010a"+
		"\7n\2\2\u010a\u010b\7g\2\2\u010b\u010c\7u\2\2\u010c\u010d\7u\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7t\2\2\u010f\u0110\7\"\2\2\u0110\u0111\7v\2"+
		"\2\u0111\u0112\7j\2\2\u0112\u0113\7c\2\2\u0113\u011a\7p\2\2\u0114\u011a"+
		"\t\5\2\2\u0115\u0116\7>\2\2\u0116\u011a\7?\2\2\u0117\u0118\7@\2\2\u0118"+
		"\u011a\7?\2\2\u0119\u00fd\3\2\2\2\u0119\u0109\3\2\2\2\u0119\u0114\3\2"+
		"\2\2\u0119\u0115\3\2\2\2\u0119\u0117\3\2\2\2\u011a>\3\2\2\2\u011b\u011c"+
		"\7?\2\2\u011c@\3\2\2\2\u011d\u011e\7-\2\2\u011e\u011f\7?\2\2\u011fB\3"+
		"\2\2\2\u0120\u0121\7,\2\2\u0121D\3\2\2\2\u0122\u0123\7\61\2\2\u0123F\3"+
		"\2\2\2\u0124\u0125\7-\2\2\u0125H\3\2\2\2\u0126\u0127\7/\2\2\u0127J\3\2"+
		"\2\2\u0128\u0129\7/\2\2\u0129\u012a\7@\2\2\u012aL\3\2\2\2\u012b\u012c"+
		"\7(\2\2\u012c\u0134\7(\2\2\u012d\u012e\7c\2\2\u012e\u012f\7p\2\2\u012f"+
		"\u0134\7f\2\2\u0130\u0131\7C\2\2\u0131\u0132\7P\2\2\u0132\u0134\7F\2\2"+
		"\u0133\u012b\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0130\3\2\2\2\u0134N\3"+
		"\2\2\2\u0135\u0136\7~\2\2\u0136\u013c\7~\2\2\u0137\u0138\7q\2\2\u0138"+
		"\u013c\7t\2\2\u0139\u013a\7Q\2\2\u013a\u013c\7T\2\2\u013b\u0135\3\2\2"+
		"\2\u013b\u0137\3\2\2\2\u013b\u0139\3\2\2\2\u013cP\3\2\2\2\u013d\u013e"+
		"\7v\2\2\u013e\u013f\7t\2\2\u013f\u0140\7w\2\2\u0140\u0147\7g\2\2\u0141"+
		"\u0142\7h\2\2\u0142\u0143\7c\2\2\u0143\u0144\7n\2\2\u0144\u0145\7u\2\2"+
		"\u0145\u0147\7g\2\2\u0146\u013d\3\2\2\2\u0146\u0141\3\2\2\2\u0147R\3\2"+
		"\2\2\u0148\u014a\t\6\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014cT\3\2\2\2\u014d\u0150\5\3\2\2"+
		"\u014e\u0150\7a\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152V\3\2\2\2\r\2\\"+
		"t\u00fb\u0119\u0133\u013b\u0146\u014b\u014f\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}