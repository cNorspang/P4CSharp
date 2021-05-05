//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from SWAE.g4 by ANTLR 4.7.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7.2")]
[System.CLSCompliant(false)]
public partial class SWAELexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		WHITESPACE=1, COMMENT=2, KEYWORD_TEXT=3, KEYWORD_STRING=4, END_STMT=5, 
		STRING=6, TRAVEL_KEYWORD=7, INCREMENT=8, CURLY_LEFT=9, CURLY_RIGHT=10, 
		PAREN_LEFT=11, PAREN_RIGHT=12, SQUARE_LEFT=13, SQUARE_RIGHT=14, KEYWORD_BOOL=15, 
		KEYWORD_INPUT=16, KEYWORD_INT=17, KEYWORD_IF=18, KEYWORD_ELSE=19, KEYWORD_ELSEIF=20, 
		KEYWORD_WHILE=21, KEYWORD_FOR=22, KEYWORD_LOCATION=23, KEYWORD_SETUP=24, 
		KEYWORD_PLAYER=25, KEYWORD_LOCATIONARRAY=26, KEYWORD_LOCATIONS=27, KEYWORD_CHOICE=28, 
		KEYWORD_RANDOM=29, COMMA_SEPERATOR=30, DOT=31, BOOL_CMP_OPERATOR=32, CMP_OPERATOR=33, 
		ASSIGN_OPERATOR=34, COMPOUND_OPERATOR=35, TIMES_OPERATOR=36, DIVISION_OPERATOR=37, 
		PLUS_OPERATOR=38, MINUS_OPERATOR=39, ARROW_OPERATOR=40, AND_OPERATOR=41, 
		OR_OPERATOR=42, BOOL=43, NUM=44, VAR_NAME=45;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"LETTERS", "WHITESPACE", "COMMENT", "KEYWORD_TEXT", "KEYWORD_STRING", 
		"END_STMT", "STRING", "TRAVEL_KEYWORD", "INCREMENT", "CURLY_LEFT", "CURLY_RIGHT", 
		"PAREN_LEFT", "PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_BOOL", 
		"KEYWORD_INPUT", "KEYWORD_INT", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", 
		"KEYWORD_WHILE", "KEYWORD_FOR", "KEYWORD_LOCATION", "KEYWORD_SETUP", "KEYWORD_PLAYER", 
		"KEYWORD_LOCATIONARRAY", "KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "KEYWORD_RANDOM", 
		"COMMA_SEPERATOR", "DOT", "BOOL_CMP_OPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", 
		"COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", 
		"MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "BOOL", 
		"NUM", "VAR_NAME"
	};


	public SWAELexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public SWAELexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, null, null, "'Text '", "'string '", "';'", null, "'Travel '", "'++'", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "'bool'", "'userInput'", "'int'", 
		"'if'", "'else'", "'else if'", "'while'", "'for'", "'Location'", "'setup'", 
		"'player'", "'LocationArray'", "'Locations'", "'choice'", "'Roll'", "','", 
		"'.'", null, null, "'='", null, "'*'", "'/'", "'+'", "'-'", "'->'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "WHITESPACE", "COMMENT", "KEYWORD_TEXT", "KEYWORD_STRING", "END_STMT", 
		"STRING", "TRAVEL_KEYWORD", "INCREMENT", "CURLY_LEFT", "CURLY_RIGHT", 
		"PAREN_LEFT", "PAREN_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "KEYWORD_BOOL", 
		"KEYWORD_INPUT", "KEYWORD_INT", "KEYWORD_IF", "KEYWORD_ELSE", "KEYWORD_ELSEIF", 
		"KEYWORD_WHILE", "KEYWORD_FOR", "KEYWORD_LOCATION", "KEYWORD_SETUP", "KEYWORD_PLAYER", 
		"KEYWORD_LOCATIONARRAY", "KEYWORD_LOCATIONS", "KEYWORD_CHOICE", "KEYWORD_RANDOM", 
		"COMMA_SEPERATOR", "DOT", "BOOL_CMP_OPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", 
		"COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", 
		"MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "BOOL", 
		"NUM", "VAR_NAME"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "SWAE.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static SWAELexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '/', '\x17C', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x4', '%', '\t', '%', '\x4', '&', 
		'\t', '&', '\x4', '\'', '\t', '\'', '\x4', '(', '\t', '(', '\x4', ')', 
		'\t', ')', '\x4', '*', '\t', '*', '\x4', '+', '\t', '+', '\x4', ',', '\t', 
		',', '\x4', '-', '\t', '-', '\x4', '.', '\t', '.', '\x4', '/', '\t', '/', 
		'\x3', '\x2', '\x3', '\x2', '\x3', '\x3', '\x6', '\x3', '\x63', '\n', 
		'\x3', '\r', '\x3', '\xE', '\x3', '\x64', '\x3', '\x3', '\x3', '\x3', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\a', '\x4', 'm', 
		'\n', '\x4', '\f', '\x4', '\xE', '\x4', 'p', '\v', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', 
		'\b', '\x3', '\b', '\a', '\b', '\x89', '\n', '\b', '\f', '\b', '\xE', 
		'\b', '\x8C', '\v', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', 
		'\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', 
		'\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', 
		'\v', '\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\x10', '\x3', '\x10', 
		'\x3', '\x11', '\x3', '\x11', '\x3', '\x11', '\x3', '\x11', '\x3', '\x11', 
		'\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', 
		'\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', 
		'\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x14', 
		'\x3', '\x14', '\x3', '\x14', '\x3', '\x15', '\x3', '\x15', '\x3', '\x15', 
		'\x3', '\x15', '\x3', '\x15', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', 
		'\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', 
		'\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', 
		'\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', 
		'\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', 
		'\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', 
		'\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', 
		'\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', 
		'\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', 
		'\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', 
		'\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', 
		'\x3', '\x1C', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', 
		'\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', 
		'\x3', '\x1D', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', 
		'\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1F', '\x3', '\x1F', 
		'\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', ' ', '\x3', ' ', '\x3', 
		'!', '\x3', '!', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', 
		'\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', 
		'\x3', '\"', '\x3', '\"', '\x5', '\"', '\x11E', '\n', '\"', '\x3', '#', 
		'\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', 
		'\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', 
		'\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', 
		'\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', 
		'\x3', '#', '\x3', '#', '\x3', '#', '\x5', '#', '\x13C', '\n', '#', '\x3', 
		'$', '\x3', '$', '\x3', '%', '\x3', '%', '\x3', '%', '\x3', '%', '\x3', 
		'%', '\x3', '%', '\x3', '%', '\x3', '%', '\x5', '%', '\x148', '\n', '%', 
		'\x3', '&', '\x3', '&', '\x3', '\'', '\x3', '\'', '\x3', '(', '\x3', '(', 
		'\x3', ')', '\x3', ')', '\x3', '*', '\x3', '*', '\x3', '*', '\x3', '+', 
		'\x3', '+', '\x3', '+', '\x3', '+', '\x3', '+', '\x3', '+', '\x3', '+', 
		'\x3', '+', '\x5', '+', '\x15D', '\n', '+', '\x3', ',', '\x3', ',', '\x3', 
		',', '\x3', ',', '\x3', ',', '\x3', ',', '\x5', ',', '\x165', '\n', ',', 
		'\x3', '-', '\x3', '-', '\x3', '-', '\x3', '-', '\x3', '-', '\x3', '-', 
		'\x3', '-', '\x3', '-', '\x3', '-', '\x5', '-', '\x170', '\n', '-', '\x3', 
		'.', '\x6', '.', '\x173', '\n', '.', '\r', '.', '\xE', '.', '\x174', '\x3', 
		'/', '\x3', '/', '\x6', '/', '\x179', '\n', '/', '\r', '/', '\xE', '/', 
		'\x17A', '\x3', 'n', '\x2', '\x30', '\x3', '\x2', '\x5', '\x3', '\a', 
		'\x4', '\t', '\x5', '\v', '\x6', '\r', '\a', '\xF', '\b', '\x11', '\t', 
		'\x13', '\n', '\x15', '\v', '\x17', '\f', '\x19', '\r', '\x1B', '\xE', 
		'\x1D', '\xF', '\x1F', '\x10', '!', '\x11', '#', '\x12', '%', '\x13', 
		'\'', '\x14', ')', '\x15', '+', '\x16', '-', '\x17', '/', '\x18', '\x31', 
		'\x19', '\x33', '\x1A', '\x35', '\x1B', '\x37', '\x1C', '\x39', '\x1D', 
		';', '\x1E', '=', '\x1F', '?', ' ', '\x41', '!', '\x43', '\"', '\x45', 
		'#', 'G', '$', 'I', '%', 'K', '&', 'M', '\'', 'O', '(', 'Q', ')', 'S', 
		'*', 'U', '+', 'W', ',', 'Y', '-', '[', '.', ']', '/', '\x3', '\x2', '\a', 
		'\x4', '\x2', '\x43', '\\', '\x63', '|', '\x5', '\x2', '\v', '\f', '\xF', 
		'\xF', '\"', '\"', '\x3', '\x2', '$', '$', '\x4', '\x2', '>', '>', '@', 
		'@', '\x3', '\x2', '\x32', ';', '\x2', '\x18F', '\x2', '\x5', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', 
		')', '\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x37', '\x3', '\x2', '\x2', '\x2', '\x2', '\x39', '\x3', '\x2', '\x2', 
		'\x2', '\x2', ';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '?', '\x3', '\x2', '\x2', '\x2', '\x2', '\x41', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x43', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x45', '\x3', '\x2', '\x2', '\x2', '\x2', 'G', '\x3', '\x2', '\x2', '\x2', 
		'\x2', 'I', '\x3', '\x2', '\x2', '\x2', '\x2', 'K', '\x3', '\x2', '\x2', 
		'\x2', '\x2', 'M', '\x3', '\x2', '\x2', '\x2', '\x2', 'O', '\x3', '\x2', 
		'\x2', '\x2', '\x2', 'Q', '\x3', '\x2', '\x2', '\x2', '\x2', 'S', '\x3', 
		'\x2', '\x2', '\x2', '\x2', 'U', '\x3', '\x2', '\x2', '\x2', '\x2', 'W', 
		'\x3', '\x2', '\x2', '\x2', '\x2', 'Y', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'[', '\x3', '\x2', '\x2', '\x2', '\x2', ']', '\x3', '\x2', '\x2', '\x2', 
		'\x3', '_', '\x3', '\x2', '\x2', '\x2', '\x5', '\x62', '\x3', '\x2', '\x2', 
		'\x2', '\a', 'h', '\x3', '\x2', '\x2', '\x2', '\t', 'v', '\x3', '\x2', 
		'\x2', '\x2', '\v', '|', '\x3', '\x2', '\x2', '\x2', '\r', '\x84', '\x3', 
		'\x2', '\x2', '\x2', '\xF', '\x86', '\x3', '\x2', '\x2', '\x2', '\x11', 
		'\x8F', '\x3', '\x2', '\x2', '\x2', '\x13', '\x97', '\x3', '\x2', '\x2', 
		'\x2', '\x15', '\x9A', '\x3', '\x2', '\x2', '\x2', '\x17', '\x9C', '\x3', 
		'\x2', '\x2', '\x2', '\x19', '\x9E', '\x3', '\x2', '\x2', '\x2', '\x1B', 
		'\xA0', '\x3', '\x2', '\x2', '\x2', '\x1D', '\xA2', '\x3', '\x2', '\x2', 
		'\x2', '\x1F', '\xA4', '\x3', '\x2', '\x2', '\x2', '!', '\xA6', '\x3', 
		'\x2', '\x2', '\x2', '#', '\xAB', '\x3', '\x2', '\x2', '\x2', '%', '\xB5', 
		'\x3', '\x2', '\x2', '\x2', '\'', '\xB9', '\x3', '\x2', '\x2', '\x2', 
		')', '\xBC', '\x3', '\x2', '\x2', '\x2', '+', '\xC1', '\x3', '\x2', '\x2', 
		'\x2', '-', '\xC9', '\x3', '\x2', '\x2', '\x2', '/', '\xCF', '\x3', '\x2', 
		'\x2', '\x2', '\x31', '\xD3', '\x3', '\x2', '\x2', '\x2', '\x33', '\xDC', 
		'\x3', '\x2', '\x2', '\x2', '\x35', '\xE2', '\x3', '\x2', '\x2', '\x2', 
		'\x37', '\xE9', '\x3', '\x2', '\x2', '\x2', '\x39', '\xF7', '\x3', '\x2', 
		'\x2', '\x2', ';', '\x101', '\x3', '\x2', '\x2', '\x2', '=', '\x108', 
		'\x3', '\x2', '\x2', '\x2', '?', '\x10D', '\x3', '\x2', '\x2', '\x2', 
		'\x41', '\x10F', '\x3', '\x2', '\x2', '\x2', '\x43', '\x11D', '\x3', '\x2', 
		'\x2', '\x2', '\x45', '\x13B', '\x3', '\x2', '\x2', '\x2', 'G', '\x13D', 
		'\x3', '\x2', '\x2', '\x2', 'I', '\x147', '\x3', '\x2', '\x2', '\x2', 
		'K', '\x149', '\x3', '\x2', '\x2', '\x2', 'M', '\x14B', '\x3', '\x2', 
		'\x2', '\x2', 'O', '\x14D', '\x3', '\x2', '\x2', '\x2', 'Q', '\x14F', 
		'\x3', '\x2', '\x2', '\x2', 'S', '\x151', '\x3', '\x2', '\x2', '\x2', 
		'U', '\x15C', '\x3', '\x2', '\x2', '\x2', 'W', '\x164', '\x3', '\x2', 
		'\x2', '\x2', 'Y', '\x16F', '\x3', '\x2', '\x2', '\x2', '[', '\x172', 
		'\x3', '\x2', '\x2', '\x2', ']', '\x178', '\x3', '\x2', '\x2', '\x2', 
		'_', '`', '\t', '\x2', '\x2', '\x2', '`', '\x4', '\x3', '\x2', '\x2', 
		'\x2', '\x61', '\x63', '\t', '\x3', '\x2', '\x2', '\x62', '\x61', '\x3', 
		'\x2', '\x2', '\x2', '\x63', '\x64', '\x3', '\x2', '\x2', '\x2', '\x64', 
		'\x62', '\x3', '\x2', '\x2', '\x2', '\x64', '\x65', '\x3', '\x2', '\x2', 
		'\x2', '\x65', '\x66', '\x3', '\x2', '\x2', '\x2', '\x66', 'g', '\b', 
		'\x3', '\x2', '\x2', 'g', '\x6', '\x3', '\x2', '\x2', '\x2', 'h', 'i', 
		'\a', '\x31', '\x2', '\x2', 'i', 'j', '\a', ',', '\x2', '\x2', 'j', 'n', 
		'\x3', '\x2', '\x2', '\x2', 'k', 'm', '\v', '\x2', '\x2', '\x2', 'l', 
		'k', '\x3', '\x2', '\x2', '\x2', 'm', 'p', '\x3', '\x2', '\x2', '\x2', 
		'n', 'o', '\x3', '\x2', '\x2', '\x2', 'n', 'l', '\x3', '\x2', '\x2', '\x2', 
		'o', 'q', '\x3', '\x2', '\x2', '\x2', 'p', 'n', '\x3', '\x2', '\x2', '\x2', 
		'q', 'r', '\a', ',', '\x2', '\x2', 'r', 's', '\a', '\x31', '\x2', '\x2', 
		's', 't', '\x3', '\x2', '\x2', '\x2', 't', 'u', '\b', '\x4', '\x2', '\x2', 
		'u', '\b', '\x3', '\x2', '\x2', '\x2', 'v', 'w', '\a', 'V', '\x2', '\x2', 
		'w', 'x', '\a', 'g', '\x2', '\x2', 'x', 'y', '\a', 'z', '\x2', '\x2', 
		'y', 'z', '\a', 'v', '\x2', '\x2', 'z', '{', '\a', '\"', '\x2', '\x2', 
		'{', '\n', '\x3', '\x2', '\x2', '\x2', '|', '}', '\a', 'u', '\x2', '\x2', 
		'}', '~', '\a', 'v', '\x2', '\x2', '~', '\x7F', '\a', 't', '\x2', '\x2', 
		'\x7F', '\x80', '\a', 'k', '\x2', '\x2', '\x80', '\x81', '\a', 'p', '\x2', 
		'\x2', '\x81', '\x82', '\a', 'i', '\x2', '\x2', '\x82', '\x83', '\a', 
		'\"', '\x2', '\x2', '\x83', '\f', '\x3', '\x2', '\x2', '\x2', '\x84', 
		'\x85', '\a', '=', '\x2', '\x2', '\x85', '\xE', '\x3', '\x2', '\x2', '\x2', 
		'\x86', '\x8A', '\a', '$', '\x2', '\x2', '\x87', '\x89', '\n', '\x4', 
		'\x2', '\x2', '\x88', '\x87', '\x3', '\x2', '\x2', '\x2', '\x89', '\x8C', 
		'\x3', '\x2', '\x2', '\x2', '\x8A', '\x88', '\x3', '\x2', '\x2', '\x2', 
		'\x8A', '\x8B', '\x3', '\x2', '\x2', '\x2', '\x8B', '\x8D', '\x3', '\x2', 
		'\x2', '\x2', '\x8C', '\x8A', '\x3', '\x2', '\x2', '\x2', '\x8D', '\x8E', 
		'\a', '$', '\x2', '\x2', '\x8E', '\x10', '\x3', '\x2', '\x2', '\x2', '\x8F', 
		'\x90', '\a', 'V', '\x2', '\x2', '\x90', '\x91', '\a', 't', '\x2', '\x2', 
		'\x91', '\x92', '\a', '\x63', '\x2', '\x2', '\x92', '\x93', '\a', 'x', 
		'\x2', '\x2', '\x93', '\x94', '\a', 'g', '\x2', '\x2', '\x94', '\x95', 
		'\a', 'n', '\x2', '\x2', '\x95', '\x96', '\a', '\"', '\x2', '\x2', '\x96', 
		'\x12', '\x3', '\x2', '\x2', '\x2', '\x97', '\x98', '\a', '-', '\x2', 
		'\x2', '\x98', '\x99', '\a', '-', '\x2', '\x2', '\x99', '\x14', '\x3', 
		'\x2', '\x2', '\x2', '\x9A', '\x9B', '\a', '}', '\x2', '\x2', '\x9B', 
		'\x16', '\x3', '\x2', '\x2', '\x2', '\x9C', '\x9D', '\a', '\x7F', '\x2', 
		'\x2', '\x9D', '\x18', '\x3', '\x2', '\x2', '\x2', '\x9E', '\x9F', '\a', 
		'*', '\x2', '\x2', '\x9F', '\x1A', '\x3', '\x2', '\x2', '\x2', '\xA0', 
		'\xA1', '\a', '+', '\x2', '\x2', '\xA1', '\x1C', '\x3', '\x2', '\x2', 
		'\x2', '\xA2', '\xA3', '\a', ']', '\x2', '\x2', '\xA3', '\x1E', '\x3', 
		'\x2', '\x2', '\x2', '\xA4', '\xA5', '\a', '_', '\x2', '\x2', '\xA5', 
		' ', '\x3', '\x2', '\x2', '\x2', '\xA6', '\xA7', '\a', '\x64', '\x2', 
		'\x2', '\xA7', '\xA8', '\a', 'q', '\x2', '\x2', '\xA8', '\xA9', '\a', 
		'q', '\x2', '\x2', '\xA9', '\xAA', '\a', 'n', '\x2', '\x2', '\xAA', '\"', 
		'\x3', '\x2', '\x2', '\x2', '\xAB', '\xAC', '\a', 'w', '\x2', '\x2', '\xAC', 
		'\xAD', '\a', 'u', '\x2', '\x2', '\xAD', '\xAE', '\a', 'g', '\x2', '\x2', 
		'\xAE', '\xAF', '\a', 't', '\x2', '\x2', '\xAF', '\xB0', '\a', 'K', '\x2', 
		'\x2', '\xB0', '\xB1', '\a', 'p', '\x2', '\x2', '\xB1', '\xB2', '\a', 
		'r', '\x2', '\x2', '\xB2', '\xB3', '\a', 'w', '\x2', '\x2', '\xB3', '\xB4', 
		'\a', 'v', '\x2', '\x2', '\xB4', '$', '\x3', '\x2', '\x2', '\x2', '\xB5', 
		'\xB6', '\a', 'k', '\x2', '\x2', '\xB6', '\xB7', '\a', 'p', '\x2', '\x2', 
		'\xB7', '\xB8', '\a', 'v', '\x2', '\x2', '\xB8', '&', '\x3', '\x2', '\x2', 
		'\x2', '\xB9', '\xBA', '\a', 'k', '\x2', '\x2', '\xBA', '\xBB', '\a', 
		'h', '\x2', '\x2', '\xBB', '(', '\x3', '\x2', '\x2', '\x2', '\xBC', '\xBD', 
		'\a', 'g', '\x2', '\x2', '\xBD', '\xBE', '\a', 'n', '\x2', '\x2', '\xBE', 
		'\xBF', '\a', 'u', '\x2', '\x2', '\xBF', '\xC0', '\a', 'g', '\x2', '\x2', 
		'\xC0', '*', '\x3', '\x2', '\x2', '\x2', '\xC1', '\xC2', '\a', 'g', '\x2', 
		'\x2', '\xC2', '\xC3', '\a', 'n', '\x2', '\x2', '\xC3', '\xC4', '\a', 
		'u', '\x2', '\x2', '\xC4', '\xC5', '\a', 'g', '\x2', '\x2', '\xC5', '\xC6', 
		'\a', '\"', '\x2', '\x2', '\xC6', '\xC7', '\a', 'k', '\x2', '\x2', '\xC7', 
		'\xC8', '\a', 'h', '\x2', '\x2', '\xC8', ',', '\x3', '\x2', '\x2', '\x2', 
		'\xC9', '\xCA', '\a', 'y', '\x2', '\x2', '\xCA', '\xCB', '\a', 'j', '\x2', 
		'\x2', '\xCB', '\xCC', '\a', 'k', '\x2', '\x2', '\xCC', '\xCD', '\a', 
		'n', '\x2', '\x2', '\xCD', '\xCE', '\a', 'g', '\x2', '\x2', '\xCE', '.', 
		'\x3', '\x2', '\x2', '\x2', '\xCF', '\xD0', '\a', 'h', '\x2', '\x2', '\xD0', 
		'\xD1', '\a', 'q', '\x2', '\x2', '\xD1', '\xD2', '\a', 't', '\x2', '\x2', 
		'\xD2', '\x30', '\x3', '\x2', '\x2', '\x2', '\xD3', '\xD4', '\a', 'N', 
		'\x2', '\x2', '\xD4', '\xD5', '\a', 'q', '\x2', '\x2', '\xD5', '\xD6', 
		'\a', '\x65', '\x2', '\x2', '\xD6', '\xD7', '\a', '\x63', '\x2', '\x2', 
		'\xD7', '\xD8', '\a', 'v', '\x2', '\x2', '\xD8', '\xD9', '\a', 'k', '\x2', 
		'\x2', '\xD9', '\xDA', '\a', 'q', '\x2', '\x2', '\xDA', '\xDB', '\a', 
		'p', '\x2', '\x2', '\xDB', '\x32', '\x3', '\x2', '\x2', '\x2', '\xDC', 
		'\xDD', '\a', 'u', '\x2', '\x2', '\xDD', '\xDE', '\a', 'g', '\x2', '\x2', 
		'\xDE', '\xDF', '\a', 'v', '\x2', '\x2', '\xDF', '\xE0', '\a', 'w', '\x2', 
		'\x2', '\xE0', '\xE1', '\a', 'r', '\x2', '\x2', '\xE1', '\x34', '\x3', 
		'\x2', '\x2', '\x2', '\xE2', '\xE3', '\a', 'r', '\x2', '\x2', '\xE3', 
		'\xE4', '\a', 'n', '\x2', '\x2', '\xE4', '\xE5', '\a', '\x63', '\x2', 
		'\x2', '\xE5', '\xE6', '\a', '{', '\x2', '\x2', '\xE6', '\xE7', '\a', 
		'g', '\x2', '\x2', '\xE7', '\xE8', '\a', 't', '\x2', '\x2', '\xE8', '\x36', 
		'\x3', '\x2', '\x2', '\x2', '\xE9', '\xEA', '\a', 'N', '\x2', '\x2', '\xEA', 
		'\xEB', '\a', 'q', '\x2', '\x2', '\xEB', '\xEC', '\a', '\x65', '\x2', 
		'\x2', '\xEC', '\xED', '\a', '\x63', '\x2', '\x2', '\xED', '\xEE', '\a', 
		'v', '\x2', '\x2', '\xEE', '\xEF', '\a', 'k', '\x2', '\x2', '\xEF', '\xF0', 
		'\a', 'q', '\x2', '\x2', '\xF0', '\xF1', '\a', 'p', '\x2', '\x2', '\xF1', 
		'\xF2', '\a', '\x43', '\x2', '\x2', '\xF2', '\xF3', '\a', 't', '\x2', 
		'\x2', '\xF3', '\xF4', '\a', 't', '\x2', '\x2', '\xF4', '\xF5', '\a', 
		'\x63', '\x2', '\x2', '\xF5', '\xF6', '\a', '{', '\x2', '\x2', '\xF6', 
		'\x38', '\x3', '\x2', '\x2', '\x2', '\xF7', '\xF8', '\a', 'N', '\x2', 
		'\x2', '\xF8', '\xF9', '\a', 'q', '\x2', '\x2', '\xF9', '\xFA', '\a', 
		'\x65', '\x2', '\x2', '\xFA', '\xFB', '\a', '\x63', '\x2', '\x2', '\xFB', 
		'\xFC', '\a', 'v', '\x2', '\x2', '\xFC', '\xFD', '\a', 'k', '\x2', '\x2', 
		'\xFD', '\xFE', '\a', 'q', '\x2', '\x2', '\xFE', '\xFF', '\a', 'p', '\x2', 
		'\x2', '\xFF', '\x100', '\a', 'u', '\x2', '\x2', '\x100', ':', '\x3', 
		'\x2', '\x2', '\x2', '\x101', '\x102', '\a', '\x65', '\x2', '\x2', '\x102', 
		'\x103', '\a', 'j', '\x2', '\x2', '\x103', '\x104', '\a', 'q', '\x2', 
		'\x2', '\x104', '\x105', '\a', 'k', '\x2', '\x2', '\x105', '\x106', '\a', 
		'\x65', '\x2', '\x2', '\x106', '\x107', '\a', 'g', '\x2', '\x2', '\x107', 
		'<', '\x3', '\x2', '\x2', '\x2', '\x108', '\x109', '\a', 'T', '\x2', '\x2', 
		'\x109', '\x10A', '\a', 'q', '\x2', '\x2', '\x10A', '\x10B', '\a', 'n', 
		'\x2', '\x2', '\x10B', '\x10C', '\a', 'n', '\x2', '\x2', '\x10C', '>', 
		'\x3', '\x2', '\x2', '\x2', '\x10D', '\x10E', '\a', '.', '\x2', '\x2', 
		'\x10E', '@', '\x3', '\x2', '\x2', '\x2', '\x10F', '\x110', '\a', '\x30', 
		'\x2', '\x2', '\x110', '\x42', '\x3', '\x2', '\x2', '\x2', '\x111', '\x112', 
		'\a', '?', '\x2', '\x2', '\x112', '\x11E', '\a', '?', '\x2', '\x2', '\x113', 
		'\x114', '\a', 'k', '\x2', '\x2', '\x114', '\x11E', '\a', 'u', '\x2', 
		'\x2', '\x115', '\x116', '\a', '#', '\x2', '\x2', '\x116', '\x11E', '\a', 
		'?', '\x2', '\x2', '\x117', '\x118', '\a', 'k', '\x2', '\x2', '\x118', 
		'\x119', '\a', 'u', '\x2', '\x2', '\x119', '\x11A', '\a', '\"', '\x2', 
		'\x2', '\x11A', '\x11B', '\a', 'p', '\x2', '\x2', '\x11B', '\x11C', '\a', 
		'q', '\x2', '\x2', '\x11C', '\x11E', '\a', 'v', '\x2', '\x2', '\x11D', 
		'\x111', '\x3', '\x2', '\x2', '\x2', '\x11D', '\x113', '\x3', '\x2', '\x2', 
		'\x2', '\x11D', '\x115', '\x3', '\x2', '\x2', '\x2', '\x11D', '\x117', 
		'\x3', '\x2', '\x2', '\x2', '\x11E', '\x44', '\x3', '\x2', '\x2', '\x2', 
		'\x11F', '\x120', '\a', 'i', '\x2', '\x2', '\x120', '\x121', '\a', 't', 
		'\x2', '\x2', '\x121', '\x122', '\a', 'g', '\x2', '\x2', '\x122', '\x123', 
		'\a', '\x63', '\x2', '\x2', '\x123', '\x124', '\a', 'v', '\x2', '\x2', 
		'\x124', '\x125', '\a', 'g', '\x2', '\x2', '\x125', '\x126', '\a', 't', 
		'\x2', '\x2', '\x126', '\x127', '\a', '\"', '\x2', '\x2', '\x127', '\x128', 
		'\a', 'v', '\x2', '\x2', '\x128', '\x129', '\a', 'j', '\x2', '\x2', '\x129', 
		'\x12A', '\a', '\x63', '\x2', '\x2', '\x12A', '\x13C', '\a', 'p', '\x2', 
		'\x2', '\x12B', '\x12C', '\a', 'n', '\x2', '\x2', '\x12C', '\x12D', '\a', 
		'g', '\x2', '\x2', '\x12D', '\x12E', '\a', 'u', '\x2', '\x2', '\x12E', 
		'\x12F', '\a', 'u', '\x2', '\x2', '\x12F', '\x130', '\a', 'g', '\x2', 
		'\x2', '\x130', '\x131', '\a', 't', '\x2', '\x2', '\x131', '\x132', '\a', 
		'\"', '\x2', '\x2', '\x132', '\x133', '\a', 'v', '\x2', '\x2', '\x133', 
		'\x134', '\a', 'j', '\x2', '\x2', '\x134', '\x135', '\a', '\x63', '\x2', 
		'\x2', '\x135', '\x13C', '\a', 'p', '\x2', '\x2', '\x136', '\x13C', '\t', 
		'\x5', '\x2', '\x2', '\x137', '\x138', '\a', '>', '\x2', '\x2', '\x138', 
		'\x13C', '\a', '?', '\x2', '\x2', '\x139', '\x13A', '\a', '@', '\x2', 
		'\x2', '\x13A', '\x13C', '\a', '?', '\x2', '\x2', '\x13B', '\x11F', '\x3', 
		'\x2', '\x2', '\x2', '\x13B', '\x12B', '\x3', '\x2', '\x2', '\x2', '\x13B', 
		'\x136', '\x3', '\x2', '\x2', '\x2', '\x13B', '\x137', '\x3', '\x2', '\x2', 
		'\x2', '\x13B', '\x139', '\x3', '\x2', '\x2', '\x2', '\x13C', '\x46', 
		'\x3', '\x2', '\x2', '\x2', '\x13D', '\x13E', '\a', '?', '\x2', '\x2', 
		'\x13E', 'H', '\x3', '\x2', '\x2', '\x2', '\x13F', '\x140', '\a', '-', 
		'\x2', '\x2', '\x140', '\x148', '\a', '?', '\x2', '\x2', '\x141', '\x142', 
		'\a', '/', '\x2', '\x2', '\x142', '\x148', '\a', '?', '\x2', '\x2', '\x143', 
		'\x144', '\a', ',', '\x2', '\x2', '\x144', '\x148', '\a', '?', '\x2', 
		'\x2', '\x145', '\x146', '\a', '\x31', '\x2', '\x2', '\x146', '\x148', 
		'\a', '?', '\x2', '\x2', '\x147', '\x13F', '\x3', '\x2', '\x2', '\x2', 
		'\x147', '\x141', '\x3', '\x2', '\x2', '\x2', '\x147', '\x143', '\x3', 
		'\x2', '\x2', '\x2', '\x147', '\x145', '\x3', '\x2', '\x2', '\x2', '\x148', 
		'J', '\x3', '\x2', '\x2', '\x2', '\x149', '\x14A', '\a', ',', '\x2', '\x2', 
		'\x14A', 'L', '\x3', '\x2', '\x2', '\x2', '\x14B', '\x14C', '\a', '\x31', 
		'\x2', '\x2', '\x14C', 'N', '\x3', '\x2', '\x2', '\x2', '\x14D', '\x14E', 
		'\a', '-', '\x2', '\x2', '\x14E', 'P', '\x3', '\x2', '\x2', '\x2', '\x14F', 
		'\x150', '\a', '/', '\x2', '\x2', '\x150', 'R', '\x3', '\x2', '\x2', '\x2', 
		'\x151', '\x152', '\a', '/', '\x2', '\x2', '\x152', '\x153', '\a', '@', 
		'\x2', '\x2', '\x153', 'T', '\x3', '\x2', '\x2', '\x2', '\x154', '\x155', 
		'\a', '(', '\x2', '\x2', '\x155', '\x15D', '\a', '(', '\x2', '\x2', '\x156', 
		'\x157', '\a', '\x63', '\x2', '\x2', '\x157', '\x158', '\a', 'p', '\x2', 
		'\x2', '\x158', '\x15D', '\a', '\x66', '\x2', '\x2', '\x159', '\x15A', 
		'\a', '\x43', '\x2', '\x2', '\x15A', '\x15B', '\a', 'P', '\x2', '\x2', 
		'\x15B', '\x15D', '\a', '\x46', '\x2', '\x2', '\x15C', '\x154', '\x3', 
		'\x2', '\x2', '\x2', '\x15C', '\x156', '\x3', '\x2', '\x2', '\x2', '\x15C', 
		'\x159', '\x3', '\x2', '\x2', '\x2', '\x15D', 'V', '\x3', '\x2', '\x2', 
		'\x2', '\x15E', '\x15F', '\a', '~', '\x2', '\x2', '\x15F', '\x165', '\a', 
		'~', '\x2', '\x2', '\x160', '\x161', '\a', 'q', '\x2', '\x2', '\x161', 
		'\x165', '\a', 't', '\x2', '\x2', '\x162', '\x163', '\a', 'Q', '\x2', 
		'\x2', '\x163', '\x165', '\a', 'T', '\x2', '\x2', '\x164', '\x15E', '\x3', 
		'\x2', '\x2', '\x2', '\x164', '\x160', '\x3', '\x2', '\x2', '\x2', '\x164', 
		'\x162', '\x3', '\x2', '\x2', '\x2', '\x165', 'X', '\x3', '\x2', '\x2', 
		'\x2', '\x166', '\x167', '\a', 'v', '\x2', '\x2', '\x167', '\x168', '\a', 
		't', '\x2', '\x2', '\x168', '\x169', '\a', 'w', '\x2', '\x2', '\x169', 
		'\x170', '\a', 'g', '\x2', '\x2', '\x16A', '\x16B', '\a', 'h', '\x2', 
		'\x2', '\x16B', '\x16C', '\a', '\x63', '\x2', '\x2', '\x16C', '\x16D', 
		'\a', 'n', '\x2', '\x2', '\x16D', '\x16E', '\a', 'u', '\x2', '\x2', '\x16E', 
		'\x170', '\a', 'g', '\x2', '\x2', '\x16F', '\x166', '\x3', '\x2', '\x2', 
		'\x2', '\x16F', '\x16A', '\x3', '\x2', '\x2', '\x2', '\x170', 'Z', '\x3', 
		'\x2', '\x2', '\x2', '\x171', '\x173', '\t', '\x6', '\x2', '\x2', '\x172', 
		'\x171', '\x3', '\x2', '\x2', '\x2', '\x173', '\x174', '\x3', '\x2', '\x2', 
		'\x2', '\x174', '\x172', '\x3', '\x2', '\x2', '\x2', '\x174', '\x175', 
		'\x3', '\x2', '\x2', '\x2', '\x175', '\\', '\x3', '\x2', '\x2', '\x2', 
		'\x176', '\x179', '\x5', '\x3', '\x2', '\x2', '\x177', '\x179', '\a', 
		'\x61', '\x2', '\x2', '\x178', '\x176', '\x3', '\x2', '\x2', '\x2', '\x178', 
		'\x177', '\x3', '\x2', '\x2', '\x2', '\x179', '\x17A', '\x3', '\x2', '\x2', 
		'\x2', '\x17A', '\x178', '\x3', '\x2', '\x2', '\x2', '\x17A', '\x17B', 
		'\x3', '\x2', '\x2', '\x2', '\x17B', '^', '\x3', '\x2', '\x2', '\x2', 
		'\xF', '\x2', '\x64', 'n', '\x8A', '\x11D', '\x13B', '\x147', '\x15C', 
		'\x164', '\x16F', '\x174', '\x178', '\x17A', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
