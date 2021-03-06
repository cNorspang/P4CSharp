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
		PAREN_RIGHT=11, SQUARE_LEFT=12, SQUARE_RIGHT=13, KEYWORD_BOOL=14, KEYWORD_INPUT=15, 
		KEYWORD_INT=16, KEYWORD_IF=17, KEYWORD_ELSE=18, KEYWORD_ELSEIF=19, KEYWORD_WHILE=20, 
		KEYWORD_FOR=21, KEYWORD_LOCATION=22, KEYWORD_SETUP=23, KEYWORD_PLAYER=24, 
		KEYWORD_LOCATIONARRAY=25, KEYWORD_LOCATIONS=26, KEYWORD_CHOICE=27, COMMA_SEPERATOR=28, 
		DOT=29, BOOL_CMP_OPERATOR=30, CMP_OPERATOR=31, ASSIGN_OPERATOR=32, COMPOUND_OPERATOR=33, 
		TIMES_OPERATOR=34, DIVISION_OPERATOR=35, PLUS_OPERATOR=36, MINUS_OPERATOR=37, 
		ARROW_OPERATOR=38, AND_OPERATOR=39, OR_OPERATOR=40, BOOL=41, NUM=42, VAR_NAME=43;
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
			"PAREN_LEFT", "PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_BOOL", 
			"KEYWORD_INPUT", "KEYWORD_INT", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", 
			"KEYWORD_WHILE", "KEYWORD_FOR", "KEYWORD_LOCATION", "KEYWORD_SETUP", 
			"KEYWORD_PLAYER", "KEYWORD_LOCATIONARRAY", "KEYWORD_LOCATIONS", "KEYWORD_CHOICE", 
			"COMMA_SEPERATOR", "DOT", "BOOL_CMP_OPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", 
			"COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", 
			"MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "BOOL", 
			"NUM", "VAR_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Text '", "'string '", "';'", null, "'Travel '", "'++'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'bool'", "'userInput'", "'int'", 
			"'if'", "'else'", "'else if'", "'while'", "'for'", "'Location'", "'setup'", 
			"'player'", "'LocationArray'", "'Locations'", "'choice'", "','", "'.'", 
			null, null, "'='", "'+='", "'*'", "'/'", "'+'", "'-'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "KEYWORD_TEXT", "KEYWORD_STRING", "END_STMT", "STRING", 
			"TRAVEL_KEYWORD", "INCREMENT", "CURLY_LEFT", "CURLY_RIGHT", "PAREN_LEFT", 
			"PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_BOOL", "KEYWORD_INPUT", 
			"KEYWORD_INT", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", "KEYWORD_WHILE", 
			"KEYWORD_FOR", "KEYWORD_LOCATION", "KEYWORD_SETUP", "KEYWORD_PLAYER", 
			"KEYWORD_LOCATIONARRAY", "KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "COMMA_SEPERATOR", 
			"DOT", "BOOL_CMP_OPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", "COMPOUND_OPERATOR", 
			"TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", "MINUS_OPERATOR", 
			"ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "BOOL", "NUM", "VAR_NAME"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\6\3_\n\3\r\3\16\3`\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7w\n\7\f\7\16\7"+
		"z\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0107\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0125\n!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\5)\u013f\n)\3*\3*\3*\3*\3*\3*\5*\u0147\n*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u0152\n+\3,\6,\u0155\n,\r,\16,\u0156\3-\3-\6-\u015b\n-\r-\16-\u015c"+
		"\2\2.\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35"+
		"\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35"+
		";\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-\3\2\7\4\2C\\c|\5\2\13\f\17\17\""+
		"\"\3\2$$\4\2>>@@\3\2\62;\2\u016d\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5^\3\2"+
		"\2\2\7d\3\2\2\2\tj\3\2\2\2\13r\3\2\2\2\rt\3\2\2\2\17}\3\2\2\2\21\u0085"+
		"\3\2\2\2\23\u0088\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3"+
		"\2\2\2\33\u0090\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0099\3\2\2"+
		"\2#\u00a3\3\2\2\2%\u00a7\3\2\2\2\'\u00aa\3\2\2\2)\u00af\3\2\2\2+\u00b7"+
		"\3\2\2\2-\u00bd\3\2\2\2/\u00c1\3\2\2\2\61\u00ca\3\2\2\2\63\u00d0\3\2\2"+
		"\2\65\u00d7\3\2\2\2\67\u00e5\3\2\2\29\u00ef\3\2\2\2;\u00f6\3\2\2\2=\u00f8"+
		"\3\2\2\2?\u0106\3\2\2\2A\u0124\3\2\2\2C\u0126\3\2\2\2E\u0128\3\2\2\2G"+
		"\u012b\3\2\2\2I\u012d\3\2\2\2K\u012f\3\2\2\2M\u0131\3\2\2\2O\u0133\3\2"+
		"\2\2Q\u013e\3\2\2\2S\u0146\3\2\2\2U\u0151\3\2\2\2W\u0154\3\2\2\2Y\u015a"+
		"\3\2\2\2[\\\t\2\2\2\\\4\3\2\2\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2"+
		"\2`a\3\2\2\2ab\3\2\2\2bc\b\3\2\2c\6\3\2\2\2de\7V\2\2ef\7g\2\2fg\7z\2\2"+
		"gh\7v\2\2hi\7\"\2\2i\b\3\2\2\2jk\7u\2\2kl\7v\2\2lm\7t\2\2mn\7k\2\2no\7"+
		"p\2\2op\7i\2\2pq\7\"\2\2q\n\3\2\2\2rs\7=\2\2s\f\3\2\2\2tx\7$\2\2uw\n\4"+
		"\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$"+
		"\2\2|\16\3\2\2\2}~\7V\2\2~\177\7t\2\2\177\u0080\7c\2\2\u0080\u0081\7x"+
		"\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7\"\2\2\u0084\20"+
		"\3\2\2\2\u0085\u0086\7-\2\2\u0086\u0087\7-\2\2\u0087\22\3\2\2\2\u0088"+
		"\u0089\7}\2\2\u0089\24\3\2\2\2\u008a\u008b\7\177\2\2\u008b\26\3\2\2\2"+
		"\u008c\u008d\7*\2\2\u008d\30\3\2\2\2\u008e\u008f\7+\2\2\u008f\32\3\2\2"+
		"\2\u0090\u0091\7]\2\2\u0091\34\3\2\2\2\u0092\u0093\7_\2\2\u0093\36\3\2"+
		"\2\2\u0094\u0095\7d\2\2\u0095\u0096\7q\2\2\u0096\u0097\7q\2\2\u0097\u0098"+
		"\7n\2\2\u0098 \3\2\2\2\u0099\u009a\7w\2\2\u009a\u009b\7u\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7t\2\2\u009d\u009e\7K\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7r\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7v\2\2\u00a2\"\3\2\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6$\3\2\2\2\u00a7"+
		"\u00a8\7k\2\2\u00a8\u00a9\7h\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae(\3\2\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7h\2\2\u00b6*\3\2"+
		"\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7g\2\2\u00bc,\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf"+
		"\7q\2\2\u00bf\u00c0\7t\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3"+
		"\7q\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9\60\3\2\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7w\2\2"+
		"\u00ce\u00cf\7r\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7"+
		"n\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7{\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6"+
		"\7t\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7N\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da"+
		"\7e\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7t\2\2"+
		"\u00e1\u00e2\7t\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7{\2\2\u00e4\66\3\2"+
		"\2\2\u00e5\u00e6\7N\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7u\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0"+
		"\u00f1\7j\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7e\2\2"+
		"\u00f4\u00f5\7g\2\2\u00f5:\3\2\2\2\u00f6\u00f7\7.\2\2\u00f7<\3\2\2\2\u00f8"+
		"\u00f9\7\60\2\2\u00f9>\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb\u0107\7?\2\2\u00fc"+
		"\u00fd\7k\2\2\u00fd\u0107\7u\2\2\u00fe\u00ff\7#\2\2\u00ff\u0107\7?\2\2"+
		"\u0100\u0101\7k\2\2\u0101\u0102\7u\2\2\u0102\u0103\7\"\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7q\2\2\u0105\u0107\7v\2\2\u0106\u00fa\3\2\2\2\u0106"+
		"\u00fc\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0100\3\2\2\2\u0107@\3\2\2\2"+
		"\u0108\u0109\7i\2\2\u0109\u010a\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7v\2\2\u010d\u010e\7g\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7\"\2\2\u0110\u0111\7v\2\2\u0111\u0112\7j\2\2\u0112\u0113\7c\2"+
		"\2\u0113\u0125\7p\2\2\u0114\u0115\7n\2\2\u0115\u0116\7g\2\2\u0116\u0117"+
		"\7u\2\2\u0117\u0118\7u\2\2\u0118\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7\"\2\2\u011b\u011c\7v\2\2\u011c\u011d\7j\2\2\u011d\u011e\7c\2"+
		"\2\u011e\u0125\7p\2\2\u011f\u0125\t\5\2\2\u0120\u0121\7>\2\2\u0121\u0125"+
		"\7?\2\2\u0122\u0123\7@\2\2\u0123\u0125\7?\2\2\u0124\u0108\3\2\2\2\u0124"+
		"\u0114\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125B\3\2\2\2\u0126\u0127\7?\2\2\u0127D\3\2\2\2\u0128\u0129\7-\2"+
		"\2\u0129\u012a\7?\2\2\u012aF\3\2\2\2\u012b\u012c\7,\2\2\u012cH\3\2\2\2"+
		"\u012d\u012e\7\61\2\2\u012eJ\3\2\2\2\u012f\u0130\7-\2\2\u0130L\3\2\2\2"+
		"\u0131\u0132\7/\2\2\u0132N\3\2\2\2\u0133\u0134\7/\2\2\u0134\u0135\7@\2"+
		"\2\u0135P\3\2\2\2\u0136\u0137\7(\2\2\u0137\u013f\7(\2\2\u0138\u0139\7"+
		"c\2\2\u0139\u013a\7p\2\2\u013a\u013f\7f\2\2\u013b\u013c\7C\2\2\u013c\u013d"+
		"\7P\2\2\u013d\u013f\7F\2\2\u013e\u0136\3\2\2\2\u013e\u0138\3\2\2\2\u013e"+
		"\u013b\3\2\2\2\u013fR\3\2\2\2\u0140\u0141\7~\2\2\u0141\u0147\7~\2\2\u0142"+
		"\u0143\7q\2\2\u0143\u0147\7t\2\2\u0144\u0145\7Q\2\2\u0145\u0147\7T\2\2"+
		"\u0146\u0140\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0144\3\2\2\2\u0147T\3"+
		"\2\2\2\u0148\u0149\7v\2\2\u0149\u014a\7t\2\2\u014a\u014b\7w\2\2\u014b"+
		"\u0152\7g\2\2\u014c\u014d\7h\2\2\u014d\u014e\7c\2\2\u014e\u014f\7n\2\2"+
		"\u014f\u0150\7u\2\2\u0150\u0152\7g\2\2\u0151\u0148\3\2\2\2\u0151\u014c"+
		"\3\2\2\2\u0152V\3\2\2\2\u0153\u0155\t\6\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157X\3\2\2\2"+
		"\u0158\u015b\5\3\2\2\u0159\u015b\7a\2\2\u015a\u0158\3\2\2\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"Z\3\2\2\2\r\2`x\u0106\u0124\u013e\u0146\u0151\u0156\u015a\u015c\3\b\2"+
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