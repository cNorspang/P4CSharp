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
		KEYWORD_LOCATION=21, KEYWORD_SETUP=22, KEYWORD_LOCATIONARRAY=23, KEYWORD_LOCATIONS=24, 
		KEYWORD_CHOICE=25, COMMA_SEPERATOR=26, BOOL_CMP_OPERATOR=27, CMP_OPERATOR=28, 
		ASSIGN_OPERATOR=29, COMPOUND_OPERATOR=30, TIMES_OPERATOR=31, DIVISION_OPERATOR=32, 
		PLUS_OPERATOR=33, MINUS_OPERATOR=34, ARROW_OPERATOR=35, AND_OPERATOR=36, 
		OR_OPERATOR=37, BOOL=38, NUM=39, VAR_NAME=40;
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
			"KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "COMMA_SEPERATOR", "BOOL_CMP_OPERATOR", 
			"CMP_OPERATOR", "ASSIGN_OPERATOR", "COMPOUND_OPERATOR", "TIMES_OPERATOR", 
			"DIVISION_OPERATOR", "PLUS_OPERATOR", "MINUS_OPERATOR", "ARROW_OPERATOR", 
			"AND_OPERATOR", "OR_OPERATOR", "BOOL", "NUM", "VAR_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Text '", "'string '", "';'", null, "'Travel '", "'++'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'userInput'", "'int'", "'if'", 
			"'else'", "'else if'", "'while'", "'for'", "'Location'", "'setup'", "'LocationArray'", 
			"'Locations'", "'choice'", "','", null, null, "'='", "'+='", "'*'", "'/'", 
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
			"KEYWORD_CHOICE", "COMMA_SEPERATOR", "BOOL_CMP_OPERATOR", "CMP_OPERATOR", 
			"ASSIGN_OPERATOR", "COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", 
			"PLUS_OPERATOR", "MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", 
			"OR_OPERATOR", "BOOL", "NUM", "VAR_NAME"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\6\3Y\n\3\r\3\16\3Z\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00f3\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0111\n\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u012b\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0133\n\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\5(\u013e\n(\3)\6)\u0141\n)\r)\16)\u0142\3*\3*\6*\u0147\n"+
		"*\r*\16*\u0148\2\2+\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f"+
		"\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65"+
		"\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*\3\2\7\4\2C\\c|\5\2\13\f"+
		"\17\17\"\"\3\2$$\4\2>>@@\3\2\62;\2\u0159\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7^\3\2\2\2\td\3\2\2\2"+
		"\13l\3\2\2\2\rn\3\2\2\2\17w\3\2\2\2\21\177\3\2\2\2\23\u0082\3\2\2\2\25"+
		"\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008a\3\2\2\2\35\u008c"+
		"\3\2\2\2\37\u008e\3\2\2\2!\u0098\3\2\2\2#\u009c\3\2\2\2%\u009f\3\2\2\2"+
		"\'\u00a4\3\2\2\2)\u00ac\3\2\2\2+\u00b2\3\2\2\2-\u00b6\3\2\2\2/\u00bf\3"+
		"\2\2\2\61\u00c5\3\2\2\2\63\u00d3\3\2\2\2\65\u00dd\3\2\2\2\67\u00e4\3\2"+
		"\2\29\u00f2\3\2\2\2;\u0110\3\2\2\2=\u0112\3\2\2\2?\u0114\3\2\2\2A\u0117"+
		"\3\2\2\2C\u0119\3\2\2\2E\u011b\3\2\2\2G\u011d\3\2\2\2I\u011f\3\2\2\2K"+
		"\u012a\3\2\2\2M\u0132\3\2\2\2O\u013d\3\2\2\2Q\u0140\3\2\2\2S\u0146\3\2"+
		"\2\2UV\t\2\2\2V\4\3\2\2\2WY\t\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[\\\3\2\2\2\\]\b\3\2\2]\6\3\2\2\2^_\7V\2\2_`\7g\2\2`a\7z\2\2ab\7"+
		"v\2\2bc\7\"\2\2c\b\3\2\2\2de\7u\2\2ef\7v\2\2fg\7t\2\2gh\7k\2\2hi\7p\2"+
		"\2ij\7i\2\2jk\7\"\2\2k\n\3\2\2\2lm\7=\2\2m\f\3\2\2\2nr\7$\2\2oq\n\4\2"+
		"\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7$\2"+
		"\2v\16\3\2\2\2wx\7V\2\2xy\7t\2\2yz\7c\2\2z{\7x\2\2{|\7g\2\2|}\7n\2\2}"+
		"~\7\"\2\2~\20\3\2\2\2\177\u0080\7-\2\2\u0080\u0081\7-\2\2\u0081\22\3\2"+
		"\2\2\u0082\u0083\7}\2\2\u0083\24\3\2\2\2\u0084\u0085\7\177\2\2\u0085\26"+
		"\3\2\2\2\u0086\u0087\7*\2\2\u0087\30\3\2\2\2\u0088\u0089\7+\2\2\u0089"+
		"\32\3\2\2\2\u008a\u008b\7]\2\2\u008b\34\3\2\2\2\u008c\u008d\7_\2\2\u008d"+
		"\36\3\2\2\2\u008e\u008f\7w\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7K\2\2\u0093\u0094\7p\2\2\u0094\u0095\7r\2\2"+
		"\u0095\u0096\7w\2\2\u0096\u0097\7v\2\2\u0097 \3\2\2\2\u0098\u0099\7k\2"+
		"\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b\"\3\2\2\2\u009c\u009d\7"+
		"k\2\2\u009d\u009e\7h\2\2\u009e$\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3&\3\2\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7\"\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab(\3\2\2\2\u00ac"+
		"\u00ad\7y\2\2\u00ad\u00ae\7j\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7n\2\2"+
		"\u00b0\u00b1\7g\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7q\2"+
		"\2\u00b4\u00b5\7t\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7N\2\2\u00b7\u00b8\7"+
		"q\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc"+
		"\7k\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be.\3\2\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7w\2\2\u00c3"+
		"\u00c4\7r\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7N\2\2\u00c6\u00c7\7q\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2"+
		"\u00cb\u00cc\7q\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf"+
		"\7t\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7{\2\2\u00d2"+
		"\62\3\2\2\2\u00d3\u00d4\7N\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7e\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7q\2\2"+
		"\u00da\u00db\7p\2\2\u00db\u00dc\7u\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7"+
		"e\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2"+
		"\7e\2\2\u00e2\u00e3\7g\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7.\2\2\u00e58"+
		"\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7\u00f3\7?\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00f3\7u\2\2\u00ea\u00eb\7#\2\2\u00eb\u00f3\7?\2\2\u00ec\u00ed\7k\2\2"+
		"\u00ed\u00ee\7u\2\2\u00ee\u00ef\7\"\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7q\2\2\u00f1\u00f3\7v\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2"+
		"\u00ea\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7i\2\2\u00f5"+
		"\u00f6\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7v\2\2"+
		"\u00f9\u00fa\7g\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd"+
		"\7v\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7c\2\2\u00ff\u0111\7p\2\2\u0100"+
		"\u0101\7n\2\2\u0101\u0102\7g\2\2\u0102\u0103\7u\2\2\u0103\u0104\7u\2\2"+
		"\u0104\u0105\7g\2\2\u0105\u0106\7t\2\2\u0106\u0107\7\"\2\2\u0107\u0108"+
		"\7v\2\2\u0108\u0109\7j\2\2\u0109\u010a\7c\2\2\u010a\u0111\7p\2\2\u010b"+
		"\u0111\t\5\2\2\u010c\u010d\7>\2\2\u010d\u0111\7?\2\2\u010e\u010f\7@\2"+
		"\2\u010f\u0111\7?\2\2\u0110\u00f4\3\2\2\2\u0110\u0100\3\2\2\2\u0110\u010b"+
		"\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010e\3\2\2\2\u0111<\3\2\2\2\u0112"+
		"\u0113\7?\2\2\u0113>\3\2\2\2\u0114\u0115\7-\2\2\u0115\u0116\7?\2\2\u0116"+
		"@\3\2\2\2\u0117\u0118\7,\2\2\u0118B\3\2\2\2\u0119\u011a\7\61\2\2\u011a"+
		"D\3\2\2\2\u011b\u011c\7-\2\2\u011cF\3\2\2\2\u011d\u011e\7/\2\2\u011eH"+
		"\3\2\2\2\u011f\u0120\7/\2\2\u0120\u0121\7@\2\2\u0121J\3\2\2\2\u0122\u0123"+
		"\7(\2\2\u0123\u012b\7(\2\2\u0124\u0125\7c\2\2\u0125\u0126\7p\2\2\u0126"+
		"\u012b\7f\2\2\u0127\u0128\7C\2\2\u0128\u0129\7P\2\2\u0129\u012b\7F\2\2"+
		"\u012a\u0122\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0127\3\2\2\2\u012bL\3"+
		"\2\2\2\u012c\u012d\7~\2\2\u012d\u0133\7~\2\2\u012e\u012f\7q\2\2\u012f"+
		"\u0133\7t\2\2\u0130\u0131\7Q\2\2\u0131\u0133\7T\2\2\u0132\u012c\3\2\2"+
		"\2\u0132\u012e\3\2\2\2\u0132\u0130\3\2\2\2\u0133N\3\2\2\2\u0134\u0135"+
		"\7v\2\2\u0135\u0136\7t\2\2\u0136\u0137\7w\2\2\u0137\u013e\7g\2\2\u0138"+
		"\u0139\7h\2\2\u0139\u013a\7c\2\2\u013a\u013b\7n\2\2\u013b\u013c\7u\2\2"+
		"\u013c\u013e\7g\2\2\u013d\u0134\3\2\2\2\u013d\u0138\3\2\2\2\u013eP\3\2"+
		"\2\2\u013f\u0141\t\6\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143R\3\2\2\2\u0144\u0147\5\3\2\2"+
		"\u0145\u0147\7a\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149T\3\2\2\2\r\2Zr"+
		"\u00f2\u0110\u012a\u0132\u013d\u0142\u0146\u0148\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}