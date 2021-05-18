// Generated from u:\vatpri\Code\CS\P4CSharp\POTBAG\AntlrFiles\SWAE.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SWAELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, COMMENT=2, KEYWORD_TEXT=3, KEYWORD_STRING=4, END_STMT=5, 
		STRING=6, TRAVEL_KEYWORD=7, INCREMENT=8, CURLY_LEFT=9, CURLY_RIGHT=10, 
		PAREN_LEFT=11, PAREN_RIGHT=12, SQUARE_LEFT=13, SQUARE_RIGHT=14, KEYWORD_BOOL=15, 
		KEYWORD_INPUT=16, KEYWORD_INT=17, KEYWORD_IF=18, KEYWORD_ELSE=19, KEYWORD_ELSEIF=20, 
		KEYWORD_WHILE=21, KEYWORD_FOR=22, KEYWORD_LOCATION=23, KEYWORD_SETUP=24, 
		KEYWORD_PLAYER=25, KEYWORD_LOCATIONS=26, KEYWORD_CHOICE=27, KEYWORD_RANDOM=28, 
		COMMA_SEPERATOR=29, DOT=30, BOOL_CMP_OPERATOR=31, CMP_OPERATOR=32, ASSIGN_OPERATOR=33, 
		COMPOUND_OPERATOR=34, TIMES_OPERATOR=35, DIVISION_OPERATOR=36, PLUS_OPERATOR=37, 
		MINUS_OPERATOR=38, ARROW_OPERATOR=39, AND_OPERATOR=40, OR_OPERATOR=41, 
		BOOL=42, NUM=43, VAR_NAME=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTERS", "WHITESPACE", "COMMENT", "KEYWORD_TEXT", "KEYWORD_STRING", 
			"END_STMT", "STRING", "TRAVEL_KEYWORD", "INCREMENT", "CURLY_LEFT", "CURLY_RIGHT", 
			"PAREN_LEFT", "PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_BOOL", 
			"KEYWORD_INPUT", "KEYWORD_INT", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", 
			"KEYWORD_WHILE", "KEYWORD_FOR", "KEYWORD_LOCATION", "KEYWORD_SETUP", 
			"KEYWORD_PLAYER", "KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "KEYWORD_RANDOM", 
			"COMMA_SEPERATOR", "DOT", "BOOL_CMP_OPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", 
			"COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", 
			"MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "BOOL", 
			"NUM", "VAR_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'Text '", "'string '", "';'", null, "'Travel '", "'++'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'bool'", "'userInput'", "'int'", 
			"'if'", "'else'", "'else if'", "'while'", "'for'", "'Location'", "'setup'", 
			"'player'", "'Locations'", "'choice'", "'Roll'", "','", "'.'", null, 
			null, "'='", null, "'*'", "'/'", "'+'", "'-'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "COMMENT", "KEYWORD_TEXT", "KEYWORD_STRING", "END_STMT", 
			"STRING", "TRAVEL_KEYWORD", "INCREMENT", "CURLY_LEFT", "CURLY_RIGHT", 
			"PAREN_LEFT", "PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_BOOL", 
			"KEYWORD_INPUT", "KEYWORD_INT", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", 
			"KEYWORD_WHILE", "KEYWORD_FOR", "KEYWORD_LOCATION", "KEYWORD_SETUP", 
			"KEYWORD_PLAYER", "KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "KEYWORD_RANDOM", 
			"COMMA_SEPERATOR", "DOT", "BOOL_CMP_OPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", 
			"COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", 
			"MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "BOOL", 
			"NUM", "VAR_NAME"
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


	public SWAELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SWAE.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u016c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\6\3a\n\3\r\3\16\3b\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4k\n\4\f\4\16\4n\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u0087\n\b\f\b\16"+
		"\b\u008a\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u010e\n!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u012c\n\"\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u0138\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u014d\n*\3+\3+\3+\3+\3+\3+\5+\u0155\n+\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\5,\u0160\n,\3-\6-\u0163\n-\r-\16-\u0164\3.\3.\6.\u0169"+
		"\n.\r.\16.\u016a\3l\2/\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.\3\2\7\4\2C\\"+
		"c|\5\2\13\f\17\17\"\"\3\2$$\4\2>>@@\3\2\62;\2\u017f\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\3]\3\2\2\2\5`\3\2\2\2\7f\3\2\2\2\tt\3\2\2\2\13z\3\2\2\2"+
		"\r\u0082\3\2\2\2\17\u0084\3\2\2\2\21\u008d\3\2\2\2\23\u0095\3\2\2\2\25"+
		"\u0098\3\2\2\2\27\u009a\3\2\2\2\31\u009c\3\2\2\2\33\u009e\3\2\2\2\35\u00a0"+
		"\3\2\2\2\37\u00a2\3\2\2\2!\u00a4\3\2\2\2#\u00a9\3\2\2\2%\u00b3\3\2\2\2"+
		"\'\u00b7\3\2\2\2)\u00ba\3\2\2\2+\u00bf\3\2\2\2-\u00c7\3\2\2\2/\u00cd\3"+
		"\2\2\2\61\u00d1\3\2\2\2\63\u00da\3\2\2\2\65\u00e0\3\2\2\2\67\u00e7\3\2"+
		"\2\29\u00f1\3\2\2\2;\u00f8\3\2\2\2=\u00fd\3\2\2\2?\u00ff\3\2\2\2A\u010d"+
		"\3\2\2\2C\u012b\3\2\2\2E\u012d\3\2\2\2G\u0137\3\2\2\2I\u0139\3\2\2\2K"+
		"\u013b\3\2\2\2M\u013d\3\2\2\2O\u013f\3\2\2\2Q\u0141\3\2\2\2S\u014c\3\2"+
		"\2\2U\u0154\3\2\2\2W\u015f\3\2\2\2Y\u0162\3\2\2\2[\u0168\3\2\2\2]^\t\2"+
		"\2\2^\4\3\2\2\2_a\t\3\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3"+
		"\2\2\2de\b\3\2\2e\6\3\2\2\2fg\7\61\2\2gh\7,\2\2hl\3\2\2\2ik\13\2\2\2j"+
		"i\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7,\2\2p"+
		"q\7\61\2\2qr\3\2\2\2rs\b\4\2\2s\b\3\2\2\2tu\7V\2\2uv\7g\2\2vw\7z\2\2w"+
		"x\7v\2\2xy\7\"\2\2y\n\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7t\2\2}~\7k\2\2~\177"+
		"\7p\2\2\177\u0080\7i\2\2\u0080\u0081\7\"\2\2\u0081\f\3\2\2\2\u0082\u0083"+
		"\7=\2\2\u0083\16\3\2\2\2\u0084\u0088\7$\2\2\u0085\u0087\n\4\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7$\2\2\u008c"+
		"\20\3\2\2\2\u008d\u008e\7V\2\2\u008e\u008f\7t\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7x\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7\"\2"+
		"\2\u0094\22\3\2\2\2\u0095\u0096\7-\2\2\u0096\u0097\7-\2\2\u0097\24\3\2"+
		"\2\2\u0098\u0099\7}\2\2\u0099\26\3\2\2\2\u009a\u009b\7\177\2\2\u009b\30"+
		"\3\2\2\2\u009c\u009d\7*\2\2\u009d\32\3\2\2\2\u009e\u009f\7+\2\2\u009f"+
		"\34\3\2\2\2\u00a0\u00a1\7]\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\7_\2\2\u00a3"+
		" \3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7n\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7p\2\2"+
		"\u00af\u00b0\7r\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7v\2\2\u00b2$\3\2\2"+
		"\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6&\3\2"+
		"\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7h\2\2\u00b9(\3\2\2\2\u00ba\u00bb"+
		"\7g\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be"+
		"*\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7h\2"+
		"\2\u00c6,\3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7"+
		"k\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc.\3\2\2\2\u00cd\u00ce"+
		"\7h\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7t\2\2\u00d0\60\3\2\2\2\u00d1\u00d2"+
		"\7N\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7c\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2"+
		"\u00d9\62\3\2\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7"+
		"v\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7r\2\2\u00df\64\3\2\2\2\u00e0\u00e1"+
		"\7r\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7{\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7N\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7v\2\2"+
		"\u00ec\u00ed\7k\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0"+
		"\7u\2\2\u00f08\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7g\2\2\u00f7"+
		":\3\2\2\2\u00f8\u00f9\7T\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7n\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7.\2\2\u00fe>\3\2\2\2\u00ff\u0100"+
		"\7\60\2\2\u0100@\3\2\2\2\u0101\u0102\7?\2\2\u0102\u010e\7?\2\2\u0103\u0104"+
		"\7k\2\2\u0104\u010e\7u\2\2\u0105\u0106\7#\2\2\u0106\u010e\7?\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7u\2\2\u0109\u010a\7\"\2\2\u010a\u010b\7p\2"+
		"\2\u010b\u010c\7q\2\2\u010c\u010e\7v\2\2\u010d\u0101\3\2\2\2\u010d\u0103"+
		"\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0107\3\2\2\2\u010eB\3\2\2\2\u010f"+
		"\u0110\7i\2\2\u0110\u0111\7t\2\2\u0111\u0112\7g\2\2\u0112\u0113\7c\2\2"+
		"\u0113\u0114\7v\2\2\u0114\u0115\7g\2\2\u0115\u0116\7t\2\2\u0116\u0117"+
		"\7\"\2\2\u0117\u0118\7v\2\2\u0118\u0119\7j\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u012c\7p\2\2\u011b\u011c\7n\2\2\u011c\u011d\7g\2\2\u011d\u011e\7u\2\2"+
		"\u011e\u011f\7u\2\2\u011f\u0120\7g\2\2\u0120\u0121\7t\2\2\u0121\u0122"+
		"\7\"\2\2\u0122\u0123\7v\2\2\u0123\u0124\7j\2\2\u0124\u0125\7c\2\2\u0125"+
		"\u012c\7p\2\2\u0126\u012c\t\5\2\2\u0127\u0128\7>\2\2\u0128\u012c\7?\2"+
		"\2\u0129\u012a\7@\2\2\u012a\u012c\7?\2\2\u012b\u010f\3\2\2\2\u012b\u011b"+
		"\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"D\3\2\2\2\u012d\u012e\7?\2\2\u012eF\3\2\2\2\u012f\u0130\7-\2\2\u0130\u0138"+
		"\7?\2\2\u0131\u0132\7/\2\2\u0132\u0138\7?\2\2\u0133\u0134\7,\2\2\u0134"+
		"\u0138\7?\2\2\u0135\u0136\7\61\2\2\u0136\u0138\7?\2\2\u0137\u012f\3\2"+
		"\2\2\u0137\u0131\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"H\3\2\2\2\u0139\u013a\7,\2\2\u013aJ\3\2\2\2\u013b\u013c\7\61\2\2\u013c"+
		"L\3\2\2\2\u013d\u013e\7-\2\2\u013eN\3\2\2\2\u013f\u0140\7/\2\2\u0140P"+
		"\3\2\2\2\u0141\u0142\7/\2\2\u0142\u0143\7@\2\2\u0143R\3\2\2\2\u0144\u0145"+
		"\7(\2\2\u0145\u014d\7(\2\2\u0146\u0147\7c\2\2\u0147\u0148\7p\2\2\u0148"+
		"\u014d\7f\2\2\u0149\u014a\7C\2\2\u014a\u014b\7P\2\2\u014b\u014d\7F\2\2"+
		"\u014c\u0144\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0149\3\2\2\2\u014dT\3"+
		"\2\2\2\u014e\u014f\7~\2\2\u014f\u0155\7~\2\2\u0150\u0151\7q\2\2\u0151"+
		"\u0155\7t\2\2\u0152\u0153\7Q\2\2\u0153\u0155\7T\2\2\u0154\u014e\3\2\2"+
		"\2\u0154\u0150\3\2\2\2\u0154\u0152\3\2\2\2\u0155V\3\2\2\2\u0156\u0157"+
		"\7v\2\2\u0157\u0158\7t\2\2\u0158\u0159\7w\2\2\u0159\u0160\7g\2\2\u015a"+
		"\u015b\7h\2\2\u015b\u015c\7c\2\2\u015c\u015d\7n\2\2\u015d\u015e\7u\2\2"+
		"\u015e\u0160\7g\2\2\u015f\u0156\3\2\2\2\u015f\u015a\3\2\2\2\u0160X\3\2"+
		"\2\2\u0161\u0163\t\6\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165Z\3\2\2\2\u0166\u0169\5\3\2\2"+
		"\u0167\u0169\7a\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\\\3\2\2\2\17\2"+
		"bl\u0088\u010d\u012b\u0137\u014c\u0154\u015f\u0164\u0168\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}