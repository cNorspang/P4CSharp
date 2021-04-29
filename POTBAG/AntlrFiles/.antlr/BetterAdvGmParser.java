// Generated from c:\Users\denni\Documents\P4\P4CSharp\POTBAG\AntlrFiles\BetterAdvGm.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BetterAdvGmParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_buffernode = 1, RULE_setup = 2, RULE_locationsetup = 3, 
		RULE_locationmapping = 4, RULE_playersetup = 5, RULE_inBlock = 6, RULE_expression = 7, 
		RULE_statement = 8, RULE_assign = 9, RULE_declaration = 10, RULE_text_statement = 11, 
		RULE_input_statement = 12, RULE_if_chain_statement = 13, RULE_if_statement = 14, 
		RULE_else_if_statement = 15, RULE_else_statement = 16, RULE_travel_statement = 17, 
		RULE_choice_statement = 18, RULE_option_statment = 19, RULE_while_statement = 20, 
		RULE_int_assign = 21, RULE_string_assign = 22, RULE_input_assign = 23, 
		RULE_location_assign = 24, RULE_bool_assign = 25, RULE_int_declaration = 26, 
		RULE_string_declaration = 27, RULE_location_declaration = 28, RULE_bool_declaration = 29, 
		RULE_predicate = 30, RULE_variable = 31, RULE_string_obj = 32, RULE_bool_obj = 33, 
		RULE_dot_notaion = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "buffernode", "setup", "locationsetup", "locationmapping", "playersetup", 
			"inBlock", "expression", "statement", "assign", "declaration", "text_statement", 
			"input_statement", "if_chain_statement", "if_statement", "else_if_statement", 
			"else_statement", "travel_statement", "choice_statement", "option_statment", 
			"while_statement", "int_assign", "string_assign", "input_assign", "location_assign", 
			"bool_assign", "int_declaration", "string_declaration", "location_declaration", 
			"bool_declaration", "predicate", "variable", "string_obj", "bool_obj", 
			"dot_notaion"
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

	@Override
	public String getGrammarFileName() { return "BetterAdvGm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BetterAdvGmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public BuffernodeContext buffernode() {
			return getRuleContext(BuffernodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BetterAdvGmParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			buffernode();
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuffernodeContext extends ParserRuleContext {
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public List<InBlockContext> inBlock() {
			return getRuleContexts(InBlockContext.class);
		}
		public InBlockContext inBlock(int i) {
			return getRuleContext(InBlockContext.class,i);
		}
		public BuffernodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buffernode; }
	}

	public final BuffernodeContext buffernode() throws RecognitionException {
		BuffernodeContext _localctx = new BuffernodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_buffernode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			setup();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
				{
				{
				setState(74);
				inBlock();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetupContext extends ParserRuleContext {
		public TerminalNode KEYWORD_SETUP() { return getToken(BetterAdvGmParser.KEYWORD_SETUP, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public LocationsetupContext locationsetup() {
			return getRuleContext(LocationsetupContext.class,0);
		}
		public PlayersetupContext playersetup() {
			return getRuleContext(PlayersetupContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(KEYWORD_SETUP);
			setState(81);
			match(CURLY_LEFT);
			setState(82);
			locationsetup();
			setState(83);
			playersetup();
			setState(84);
			match(CURLY_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationsetupContext extends ParserRuleContext {
		public TerminalNode KEYWORD_LOCATIONS() { return getToken(BetterAdvGmParser.KEYWORD_LOCATIONS, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(BetterAdvGmParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public List<LocationmappingContext> locationmapping() {
			return getRuleContexts(LocationmappingContext.class);
		}
		public LocationmappingContext locationmapping(int i) {
			return getRuleContext(LocationmappingContext.class,i);
		}
		public LocationsetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationsetup; }
	}

	public final LocationsetupContext locationsetup() throws RecognitionException {
		LocationsetupContext _localctx = new LocationsetupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_locationsetup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(KEYWORD_LOCATIONS);
			setState(87);
			match(ASSIGN_OPERATOR);
			setState(88);
			match(CURLY_LEFT);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				locationmapping();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD_PLAYER || _la==VAR_NAME );
			setState(94);
			match(CURLY_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationmappingContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ARROW_OPERATOR() { return getToken(BetterAdvGmParser.ARROW_OPERATOR, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public List<TerminalNode> COMMA_SEPERATOR() { return getTokens(BetterAdvGmParser.COMMA_SEPERATOR); }
		public TerminalNode COMMA_SEPERATOR(int i) {
			return getToken(BetterAdvGmParser.COMMA_SEPERATOR, i);
		}
		public LocationmappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationmapping; }
	}

	public final LocationmappingContext locationmapping() throws RecognitionException {
		LocationmappingContext _localctx = new LocationmappingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_locationmapping);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			variable();
			setState(97);
			match(ARROW_OPERATOR);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					variable();
					setState(99);
					match(COMMA_SEPERATOR);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(106);
			variable();
			setState(107);
			match(END_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlayersetupContext extends ParserRuleContext {
		public TerminalNode KEYWORD_PLAYER() { return getToken(BetterAdvGmParser.KEYWORD_PLAYER, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(BetterAdvGmParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public PlayersetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playersetup; }
	}

	public final PlayersetupContext playersetup() throws RecognitionException {
		PlayersetupContext _localctx = new PlayersetupContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_playersetup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(KEYWORD_PLAYER);
			setState(110);
			match(ASSIGN_OPERATOR);
			setState(111);
			match(CURLY_LEFT);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				assign();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_STRING) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INT) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << VAR_NAME))) != 0) );
			setState(117);
			match(CURLY_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inBlock; }
	}

	public final InBlockContext inBlock() throws RecognitionException {
		InBlockContext _localctx = new InBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inBlock);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode PAREN_LEFT() { return getToken(BetterAdvGmParser.PAREN_LEFT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(BetterAdvGmParser.PAREN_RIGHT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NUM() { return getToken(BetterAdvGmParser.NUM, 0); }
		public TerminalNode TIMES_OPERATOR() { return getToken(BetterAdvGmParser.TIMES_OPERATOR, 0); }
		public TerminalNode DIVISION_OPERATOR() { return getToken(BetterAdvGmParser.DIVISION_OPERATOR, 0); }
		public TerminalNode PLUS_OPERATOR() { return getToken(BetterAdvGmParser.PLUS_OPERATOR, 0); }
		public TerminalNode MINUS_OPERATOR() { return getToken(BetterAdvGmParser.MINUS_OPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_LEFT:
				{
				setState(126);
				match(PAREN_LEFT);
				setState(127);
				expression(0);
				setState(128);
				match(PAREN_RIGHT);
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(130);
				variable();
				}
				break;
			case NUM:
				{
				setState(131);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(135);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(136);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(138);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(139);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Text_statementContext text_statement() {
			return getRuleContext(Text_statementContext.class,0);
		}
		public Input_statementContext input_statement() {
			return getRuleContext(Input_statementContext.class,0);
		}
		public If_chain_statementContext if_chain_statement() {
			return getRuleContext(If_chain_statementContext.class,0);
		}
		public Travel_statementContext travel_statement() {
			return getRuleContext(Travel_statementContext.class,0);
		}
		public Choice_statementContext choice_statement() {
			return getRuleContext(Choice_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				text_statement();
				}
				break;
			case KEYWORD_INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				input_statement();
				}
				break;
			case KEYWORD_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				if_chain_statement();
				}
				break;
			case TRAVEL_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				travel_statement();
				}
				break;
			case KEYWORD_CHOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				choice_statement();
				}
				break;
			case KEYWORD_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				while_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Int_assignContext int_assign() {
			return getRuleContext(Int_assignContext.class,0);
		}
		public String_assignContext string_assign() {
			return getRuleContext(String_assignContext.class,0);
		}
		public Bool_assignContext bool_assign() {
			return getRuleContext(Bool_assignContext.class,0);
		}
		public Input_assignContext input_assign() {
			return getRuleContext(Input_assignContext.class,0);
		}
		public Location_assignContext location_assign() {
			return getRuleContext(Location_assignContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				int_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				string_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				bool_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				input_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				location_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Bool_declarationContext bool_declaration() {
			return getRuleContext(Bool_declarationContext.class,0);
		}
		public Location_declarationContext location_declaration() {
			return getRuleContext(Location_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				int_declaration();
				setState(161);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				string_declaration();
				setState(164);
				match(END_STMT);
				}
				break;
			case KEYWORD_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				bool_declaration();
				setState(167);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				location_declaration();
				setState(170);
				match(END_STMT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Text_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_TEXT() { return getToken(BetterAdvGmParser.KEYWORD_TEXT, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public List<String_objContext> string_obj() {
			return getRuleContexts(String_objContext.class);
		}
		public String_objContext string_obj(int i) {
			return getRuleContext(String_objContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> PLUS_OPERATOR() { return getTokens(BetterAdvGmParser.PLUS_OPERATOR); }
		public TerminalNode PLUS_OPERATOR(int i) {
			return getToken(BetterAdvGmParser.PLUS_OPERATOR, i);
		}
		public Text_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_statement; }
	}

	public final Text_statementContext text_statement() throws RecognitionException {
		Text_statementContext _localctx = new Text_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_text_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(KEYWORD_TEXT);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(175);
						string_obj();
						}
						break;
					case KEYWORD_PLAYER:
					case VAR_NAME:
						{
						setState(176);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(179);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(186);
				string_obj();
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(187);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			match(END_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_INPUT() { return getToken(BetterAdvGmParser.KEYWORD_INPUT, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public List<String_objContext> string_obj() {
			return getRuleContexts(String_objContext.class);
		}
		public String_objContext string_obj(int i) {
			return getRuleContext(String_objContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> PLUS_OPERATOR() { return getTokens(BetterAdvGmParser.PLUS_OPERATOR); }
		public TerminalNode PLUS_OPERATOR(int i) {
			return getToken(BetterAdvGmParser.PLUS_OPERATOR, i);
		}
		public Input_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_statement; }
	}

	public final Input_statementContext input_statement() throws RecognitionException {
		Input_statementContext _localctx = new Input_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_input_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(KEYWORD_INPUT);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(193);
						string_obj();
						}
						break;
					case KEYWORD_PLAYER:
					case VAR_NAME:
						{
						setState(194);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(197);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(204);
				string_obj();
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(205);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(208);
			match(END_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_chain_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_chain_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_chain_statement; }
	}

	public final If_chain_statementContext if_chain_statement() throws RecognitionException {
		If_chain_statementContext _localctx = new If_chain_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_chain_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			if_statement();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_ELSEIF) {
				{
				{
				setState(211);
				else_if_statement();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ELSE) {
				{
				setState(217);
				else_statement();
				}
			}

			setState(220);
			match(END_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_IF() { return getToken(BetterAdvGmParser.KEYWORD_IF, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(BetterAdvGmParser.PAREN_LEFT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(BetterAdvGmParser.PAREN_RIGHT, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public List<InBlockContext> inBlock() {
			return getRuleContexts(InBlockContext.class);
		}
		public InBlockContext inBlock(int i) {
			return getRuleContext(InBlockContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(KEYWORD_IF);
			setState(223);
			match(PAREN_LEFT);
			setState(224);
			predicate(0);
			setState(225);
			match(PAREN_RIGHT);
			setState(226);
			match(CURLY_LEFT);
			setState(228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				inBlock();
				}
				}
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(232);
			match(CURLY_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ELSEIF() { return getToken(BetterAdvGmParser.KEYWORD_ELSEIF, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(BetterAdvGmParser.PAREN_LEFT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(BetterAdvGmParser.PAREN_RIGHT, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public List<InBlockContext> inBlock() {
			return getRuleContexts(InBlockContext.class);
		}
		public InBlockContext inBlock(int i) {
			return getRuleContext(InBlockContext.class,i);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(KEYWORD_ELSEIF);
			setState(235);
			match(PAREN_LEFT);
			setState(236);
			predicate(0);
			setState(237);
			match(PAREN_RIGHT);
			setState(238);
			match(CURLY_LEFT);
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				inBlock();
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(244);
			match(CURLY_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ELSE() { return getToken(BetterAdvGmParser.KEYWORD_ELSE, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public List<InBlockContext> inBlock() {
			return getRuleContexts(InBlockContext.class);
		}
		public InBlockContext inBlock(int i) {
			return getRuleContext(InBlockContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(KEYWORD_ELSE);
			setState(247);
			match(CURLY_LEFT);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				inBlock();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(253);
			match(CURLY_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Travel_statementContext extends ParserRuleContext {
		public TerminalNode TRAVEL_KEYWORD() { return getToken(BetterAdvGmParser.TRAVEL_KEYWORD, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public Travel_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travel_statement; }
	}

	public final Travel_statementContext travel_statement() throws RecognitionException {
		Travel_statementContext _localctx = new Travel_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_travel_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(TRAVEL_KEYWORD);
			setState(256);
			variable();
			setState(257);
			match(END_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Choice_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_CHOICE() { return getToken(BetterAdvGmParser.KEYWORD_CHOICE, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public List<Option_statmentContext> option_statment() {
			return getRuleContexts(Option_statmentContext.class);
		}
		public Option_statmentContext option_statment(int i) {
			return getRuleContext(Option_statmentContext.class,i);
		}
		public Choice_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_statement; }
	}

	public final Choice_statementContext choice_statement() throws RecognitionException {
		Choice_statementContext _localctx = new Choice_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_choice_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(KEYWORD_CHOICE);
			setState(260);
			match(CURLY_LEFT);
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				option_statment();
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << KEYWORD_PLAYER) | (1L << VAR_NAME))) != 0) );
			setState(266);
			match(CURLY_RIGHT);
			setState(267);
			match(END_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_statmentContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public String_objContext string_obj() {
			return getRuleContext(String_objContext.class,0);
		}
		public List<InBlockContext> inBlock() {
			return getRuleContexts(InBlockContext.class);
		}
		public InBlockContext inBlock(int i) {
			return getRuleContext(InBlockContext.class,i);
		}
		public Option_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_statment; }
	}

	public final Option_statmentContext option_statment() throws RecognitionException {
		Option_statmentContext _localctx = new Option_statmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_option_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(269);
				variable();
				}
				break;
			case STRING:
				{
				setState(270);
				string_obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
			match(CURLY_LEFT);
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				inBlock();
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(279);
			match(CURLY_RIGHT);
			setState(280);
			match(END_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_WHILE() { return getToken(BetterAdvGmParser.KEYWORD_WHILE, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(BetterAdvGmParser.PAREN_LEFT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(BetterAdvGmParser.PAREN_RIGHT, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public List<InBlockContext> inBlock() {
			return getRuleContexts(InBlockContext.class);
		}
		public InBlockContext inBlock(int i) {
			return getRuleContext(InBlockContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(KEYWORD_WHILE);
			setState(283);
			match(PAREN_LEFT);
			setState(284);
			predicate(0);
			setState(285);
			match(PAREN_RIGHT);
			setState(286);
			match(CURLY_LEFT);
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				inBlock();
				}
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(292);
			match(CURLY_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(BetterAdvGmParser.ASSIGN_OPERATOR, 0); }
		public Input_statementContext input_statement() {
			return getRuleContext(Input_statementContext.class,0);
		}
		public TerminalNode COMPOUND_OPERATOR() { return getToken(BetterAdvGmParser.COMPOUND_OPERATOR, 0); }
		public Int_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assign; }
	}

	public final Int_assignContext int_assign() throws RecognitionException {
		Int_assignContext _localctx = new Int_assignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_int_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(294);
				variable();
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OPERATOR || _la==COMPOUND_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				expression(0);
				setState(297);
				match(END_STMT);
				}
				break;
			case 2:
				{
				setState(299);
				int_declaration();
				setState(300);
				match(ASSIGN_OPERATOR);
				setState(301);
				expression(0);
				setState(302);
				match(END_STMT);
				}
				break;
			case 3:
				{
				setState(304);
				int_declaration();
				setState(305);
				match(ASSIGN_OPERATOR);
				setState(306);
				input_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(BetterAdvGmParser.ASSIGN_OPERATOR, 0); }
		public String_objContext string_obj() {
			return getRuleContext(String_objContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public String_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assign; }
	}

	public final String_assignContext string_assign() throws RecognitionException {
		String_assignContext _localctx = new String_assignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(310);
				variable();
				setState(311);
				match(ASSIGN_OPERATOR);
				setState(312);
				string_obj();
				setState(313);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				{
				setState(315);
				string_declaration();
				setState(316);
				match(ASSIGN_OPERATOR);
				setState(317);
				string_obj();
				setState(318);
				match(END_STMT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(BetterAdvGmParser.ASSIGN_OPERATOR, 0); }
		public Input_statementContext input_statement() {
			return getRuleContext(Input_statementContext.class,0);
		}
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Input_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_assign; }
	}

	public final Input_assignContext input_assign() throws RecognitionException {
		Input_assignContext _localctx = new Input_assignContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_input_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(322);
				variable();
				setState(323);
				match(ASSIGN_OPERATOR);
				setState(324);
				input_statement();
				}
				break;
			case KEYWORD_STRING:
				{
				setState(326);
				string_declaration();
				setState(327);
				match(ASSIGN_OPERATOR);
				setState(328);
				input_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Location_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(BetterAdvGmParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public Location_declarationContext location_declaration() {
			return getRuleContext(Location_declarationContext.class,0);
		}
		public List<InBlockContext> inBlock() {
			return getRuleContexts(InBlockContext.class);
		}
		public InBlockContext inBlock(int i) {
			return getRuleContext(InBlockContext.class,i);
		}
		public Location_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_assign; }
	}

	public final Location_assignContext location_assign() throws RecognitionException {
		Location_assignContext _localctx = new Location_assignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_location_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(332);
				variable();
				setState(333);
				match(ASSIGN_OPERATOR);
				setState(334);
				match(CURLY_LEFT);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(335);
					inBlock();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				match(CURLY_RIGHT);
				setState(342);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				{
				setState(344);
				location_declaration();
				setState(345);
				match(ASSIGN_OPERATOR);
				setState(346);
				match(CURLY_LEFT);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(347);
					inBlock();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353);
				match(CURLY_RIGHT);
				setState(354);
				match(END_STMT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(BetterAdvGmParser.ASSIGN_OPERATOR, 0); }
		public Bool_objContext bool_obj() {
			return getRuleContext(Bool_objContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public Bool_declarationContext bool_declaration() {
			return getRuleContext(Bool_declarationContext.class,0);
		}
		public Bool_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_assign; }
	}

	public final Bool_assignContext bool_assign() throws RecognitionException {
		Bool_assignContext _localctx = new Bool_assignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(358);
				variable();
				setState(359);
				match(ASSIGN_OPERATOR);
				setState(360);
				bool_obj();
				setState(361);
				match(END_STMT);
				}
				break;
			case KEYWORD_BOOL:
				{
				setState(363);
				bool_declaration();
				setState(364);
				match(ASSIGN_OPERATOR);
				setState(365);
				bool_obj();
				setState(366);
				match(END_STMT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_declarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_INT() { return getToken(BetterAdvGmParser.KEYWORD_INT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Int_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_declaration; }
	}

	public final Int_declarationContext int_declaration() throws RecognitionException {
		Int_declarationContext _localctx = new Int_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_int_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(KEYWORD_INT);
			setState(371);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_declarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_STRING() { return getToken(BetterAdvGmParser.KEYWORD_STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(KEYWORD_STRING);
			setState(374);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Location_declarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_LOCATION() { return getToken(BetterAdvGmParser.KEYWORD_LOCATION, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Location_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_declaration; }
	}

	public final Location_declarationContext location_declaration() throws RecognitionException {
		Location_declarationContext _localctx = new Location_declarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_location_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(KEYWORD_LOCATION);
			setState(377);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_declarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_BOOL() { return getToken(BetterAdvGmParser.KEYWORD_BOOL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Bool_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_declaration; }
	}

	public final Bool_declarationContext bool_declaration() throws RecognitionException {
		Bool_declarationContext _localctx = new Bool_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bool_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(KEYWORD_BOOL);
			setState(380);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode BOOL_CMP_OPERATOR() { return getToken(BetterAdvGmParser.BOOL_CMP_OPERATOR, 0); }
		public String_objContext string_obj() {
			return getRuleContext(String_objContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CMP_OPERATOR() { return getToken(BetterAdvGmParser.CMP_OPERATOR, 0); }
		public Bool_objContext bool_obj() {
			return getRuleContext(Bool_objContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode AND_OPERATOR() { return getToken(BetterAdvGmParser.AND_OPERATOR, 0); }
		public TerminalNode OR_OPERATOR() { return getToken(BetterAdvGmParser.OR_OPERATOR, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(383);
					variable();
					setState(384);
					match(BOOL_CMP_OPERATOR);
					setState(385);
					string_obj();
					}
					break;
				case 2:
					{
					setState(387);
					string_obj();
					setState(388);
					match(BOOL_CMP_OPERATOR);
					setState(389);
					variable();
					}
					break;
				case 3:
					{
					setState(391);
					variable();
					setState(392);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(393);
					variable();
					}
					break;
				case 4:
					{
					setState(395);
					variable();
					setState(396);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(397);
					expression(0);
					}
					break;
				case 5:
					{
					setState(399);
					expression(0);
					setState(400);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(401);
					variable();
					}
					break;
				case 6:
					{
					setState(403);
					expression(0);
					setState(404);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(405);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(409);
				variable();
				setState(410);
				match(BOOL_CMP_OPERATOR);
				setState(411);
				bool_obj();
				}
				break;
			case 3:
				{
				setState(413);
				bool_obj();
				setState(414);
				match(BOOL_CMP_OPERATOR);
				setState(415);
				variable();
				}
				break;
			case 4:
				{
				setState(417);
				variable();
				}
				break;
			case 5:
				{
				setState(418);
				bool_obj();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PredicateContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_predicate);
					setState(421);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(422);
					_la = _input.LA(1);
					if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(423);
					predicate(6);
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public Dot_notaionContext dot_notaion() {
			return getRuleContext(Dot_notaionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variable);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(VAR_NAME);
				}
				break;
			case KEYWORD_PLAYER:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				dot_notaion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_objContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BetterAdvGmParser.STRING, 0); }
		public String_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_obj; }
	}

	public final String_objContext string_obj() throws RecognitionException {
		String_objContext _localctx = new String_objContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_string_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_objContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(BetterAdvGmParser.BOOL, 0); }
		public Bool_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_obj; }
	}

	public final Bool_objContext bool_obj() throws RecognitionException {
		Bool_objContext _localctx = new Bool_objContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bool_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_notaionContext extends ParserRuleContext {
		public TerminalNode KEYWORD_PLAYER() { return getToken(BetterAdvGmParser.KEYWORD_PLAYER, 0); }
		public TerminalNode DOT() { return getToken(BetterAdvGmParser.DOT, 0); }
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public Dot_notaionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_notaion; }
	}

	public final Dot_notaionContext dot_notaion() throws RecognitionException {
		Dot_notaionContext _localctx = new Dot_notaionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dot_notaion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(KEYWORD_PLAYER);
			setState(438);
			match(DOT);
			setState(439);
			match(VAR_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 30:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u01bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5]\n\5\r\5\16\5^\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\6"+
		"\7t\n\7\r\7\16\7u\3\7\3\7\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16\t"+
		"\u0092\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00af\n\f\3\r\3\r\3\r\5\r\u00b4\n\r\3\r\3\r\7\r\u00b8\n\r\f\r\16"+
		"\r\u00bb\13\r\3\r\3\r\5\r\u00bf\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00c6"+
		"\n\16\3\16\3\16\7\16\u00ca\n\16\f\16\16\16\u00cd\13\16\3\16\3\16\5\16"+
		"\u00d1\n\16\3\16\3\16\3\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17"+
		"\3\17\5\17\u00dd\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00e7"+
		"\n\20\r\20\16\20\u00e8\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00f3"+
		"\n\21\r\21\16\21\u00f4\3\21\3\21\3\22\3\22\3\22\6\22\u00fc\n\22\r\22\16"+
		"\22\u00fd\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\6\24\u0109\n\24"+
		"\r\24\16\24\u010a\3\24\3\24\3\24\3\25\3\25\5\25\u0112\n\25\3\25\3\25\6"+
		"\25\u0116\n\25\r\25\16\25\u0117\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\6\26\u0123\n\26\r\26\16\26\u0124\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0137\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0143\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014d\n\31\3\32\3\32\3\32\3\32\7\32"+
		"\u0153\n\32\f\32\16\32\u0156\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u015f\n\32\f\32\16\32\u0162\13\32\3\32\3\32\3\32\5\32\u0167\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0173\n\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u019a"+
		"\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01a6\n \3 \3 \3 \7 \u01ab\n \f "+
		"\16 \u01ae\13 \3!\3!\5!\u01b2\n!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\2\4\20>"+
		"%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"\2\7\3\2$%\3\2&\'\3\2\"#\3\2 !\3\2)*\2\u01d1\2H\3\2\2\2\4K\3\2\2\2\6R"+
		"\3\2\2\2\bX\3\2\2\2\nb\3\2\2\2\fo\3\2\2\2\16}\3\2\2\2\20\u0086\3\2\2\2"+
		"\22\u0099\3\2\2\2\24\u00a0\3\2\2\2\26\u00ae\3\2\2\2\30\u00b0\3\2\2\2\32"+
		"\u00c2\3\2\2\2\34\u00d4\3\2\2\2\36\u00e0\3\2\2\2 \u00ec\3\2\2\2\"\u00f8"+
		"\3\2\2\2$\u0101\3\2\2\2&\u0105\3\2\2\2(\u0111\3\2\2\2*\u011c\3\2\2\2,"+
		"\u0136\3\2\2\2.\u0142\3\2\2\2\60\u014c\3\2\2\2\62\u0166\3\2\2\2\64\u0172"+
		"\3\2\2\2\66\u0174\3\2\2\28\u0177\3\2\2\2:\u017a\3\2\2\2<\u017d\3\2\2\2"+
		">\u01a5\3\2\2\2@\u01b1\3\2\2\2B\u01b3\3\2\2\2D\u01b5\3\2\2\2F\u01b7\3"+
		"\2\2\2HI\5\4\3\2IJ\7\2\2\3J\3\3\2\2\2KO\5\6\4\2LN\5\16\b\2ML\3\2\2\2N"+
		"Q\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RS\7\31\2\2ST\7\n\2"+
		"\2TU\5\b\5\2UV\5\f\7\2VW\7\13\2\2W\7\3\2\2\2XY\7\34\2\2YZ\7\"\2\2Z\\\7"+
		"\n\2\2[]\5\n\6\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`"+
		"a\7\13\2\2a\t\3\2\2\2bc\5@!\2ci\7(\2\2de\5@!\2ef\7\36\2\2fh\3\2\2\2gd"+
		"\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5@!\2mn\7"+
		"\6\2\2n\13\3\2\2\2op\7\32\2\2pq\7\"\2\2qs\7\n\2\2rt\5\24\13\2sr\3\2\2"+
		"\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\13\2\2x\r\3\2\2\2y~\5\22"+
		"\n\2z~\5\20\t\2{~\5\24\13\2|~\5\26\f\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}"+
		"|\3\2\2\2~\17\3\2\2\2\177\u0080\b\t\1\2\u0080\u0081\7\f\2\2\u0081\u0082"+
		"\5\20\t\2\u0082\u0083\7\r\2\2\u0083\u0087\3\2\2\2\u0084\u0087\5@!\2\u0085"+
		"\u0087\7,\2\2\u0086\177\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2"+
		"\2\u0087\u0090\3\2\2\2\u0088\u0089\f\7\2\2\u0089\u008a\t\2\2\2\u008a\u008f"+
		"\5\20\t\b\u008b\u008c\f\6\2\2\u008c\u008d\t\3\2\2\u008d\u008f\5\20\t\7"+
		"\u008e\u0088\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u009a\5\30\r\2\u0094\u009a\5\32\16\2\u0095\u009a\5\34\17\2\u0096\u009a"+
		"\5$\23\2\u0097\u009a\5&\24\2\u0098\u009a\5*\26\2\u0099\u0093\3\2\2\2\u0099"+
		"\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\23\3\2\2\2\u009b\u00a1\5,\27\2\u009c\u00a1"+
		"\5.\30\2\u009d\u00a1\5\64\33\2\u009e\u00a1\5\60\31\2\u009f\u00a1\5\62"+
		"\32\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\5\66\34"+
		"\2\u00a3\u00a4\7\6\2\2\u00a4\u00af\3\2\2\2\u00a5\u00a6\58\35\2\u00a6\u00a7"+
		"\7\6\2\2\u00a7\u00af\3\2\2\2\u00a8\u00a9\5<\37\2\u00a9\u00aa\7\6\2\2\u00aa"+
		"\u00af\3\2\2\2\u00ab\u00ac\5:\36\2\u00ac\u00ad\7\6\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae"+
		"\u00ab\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b9\7\4\2\2\u00b1\u00b4\5B\"\2"+
		"\u00b2\u00b4\5@!\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\7&\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00be\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\5B\"\2\u00bd\u00bf\5@!\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\6\2\2\u00c1"+
		"\31\3\2\2\2\u00c2\u00cb\7\21\2\2\u00c3\u00c6\5B\"\2\u00c4\u00c6\5@!\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\7&\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00d1\5B\"\2\u00cf\u00d1\5@!\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\6\2\2\u00d3\33\3\2\2\2\u00d4"+
		"\u00d8\5\36\20\2\u00d5\u00d7\5 \21\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dd\5\"\22\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\6\2\2\u00df\35\3\2\2\2\u00e0"+
		"\u00e1\7\23\2\2\u00e1\u00e2\7\f\2\2\u00e2\u00e3\5> \2\u00e3\u00e4\7\r"+
		"\2\2\u00e4\u00e6\7\n\2\2\u00e5\u00e7\5\16\b\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\7\13\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7\25\2\2\u00ed"+
		"\u00ee\7\f\2\2\u00ee\u00ef\5> \2\u00ef\u00f0\7\r\2\2\u00f0\u00f2\7\n\2"+
		"\2\u00f1\u00f3\5\16\b\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\13"+
		"\2\2\u00f7!\3\2\2\2\u00f8\u00f9\7\24\2\2\u00f9\u00fb\7\n\2\2\u00fa\u00fc"+
		"\5\16\b\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\13\2\2\u0100#\3"+
		"\2\2\2\u0101\u0102\7\b\2\2\u0102\u0103\5@!\2\u0103\u0104\7\6\2\2\u0104"+
		"%\3\2\2\2\u0105\u0106\7\35\2\2\u0106\u0108\7\n\2\2\u0107\u0109\5(\25\2"+
		"\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\13\2\2\u010d\u010e\7\6\2\2"+
		"\u010e\'\3\2\2\2\u010f\u0112\5@!\2\u0110\u0112\5B\"\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7\n\2\2\u0114"+
		"\u0116\5\16\b\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\13\2\2\u011a"+
		"\u011b\7\6\2\2\u011b)\3\2\2\2\u011c\u011d\7\26\2\2\u011d\u011e\7\f\2\2"+
		"\u011e\u011f\5> \2\u011f\u0120\7\r\2\2\u0120\u0122\7\n\2\2\u0121\u0123"+
		"\5\16\b\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\13\2\2\u0127+\3"+
		"\2\2\2\u0128\u0129\5@!\2\u0129\u012a\t\4\2\2\u012a\u012b\5\20\t\2\u012b"+
		"\u012c\7\6\2\2\u012c\u0137\3\2\2\2\u012d\u012e\5\66\34\2\u012e\u012f\7"+
		"\"\2\2\u012f\u0130\5\20\t\2\u0130\u0131\7\6\2\2\u0131\u0137\3\2\2\2\u0132"+
		"\u0133\5\66\34\2\u0133\u0134\7\"\2\2\u0134\u0135\5\32\16\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0128\3\2\2\2\u0136\u012d\3\2\2\2\u0136\u0132\3\2\2\2\u0137"+
		"-\3\2\2\2\u0138\u0139\5@!\2\u0139\u013a\7\"\2\2\u013a\u013b\5B\"\2\u013b"+
		"\u013c\7\6\2\2\u013c\u0143\3\2\2\2\u013d\u013e\58\35\2\u013e\u013f\7\""+
		"\2\2\u013f\u0140\5B\"\2\u0140\u0141\7\6\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0138\3\2\2\2\u0142\u013d\3\2\2\2\u0143/\3\2\2\2\u0144\u0145\5@!\2\u0145"+
		"\u0146\7\"\2\2\u0146\u0147\5\32\16\2\u0147\u014d\3\2\2\2\u0148\u0149\5"+
		"8\35\2\u0149\u014a\7\"\2\2\u014a\u014b\5\32\16\2\u014b\u014d\3\2\2\2\u014c"+
		"\u0144\3\2\2\2\u014c\u0148\3\2\2\2\u014d\61\3\2\2\2\u014e\u014f\5@!\2"+
		"\u014f\u0150\7\"\2\2\u0150\u0154\7\n\2\2\u0151\u0153\5\16\b\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\13\2\2\u0158\u0159\7"+
		"\6\2\2\u0159\u0167\3\2\2\2\u015a\u015b\5:\36\2\u015b\u015c\7\"\2\2\u015c"+
		"\u0160\7\n\2\2\u015d\u015f\5\16\b\2\u015e\u015d\3\2\2\2\u015f\u0162\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0164\7\13\2\2\u0164\u0165\7\6\2\2\u0165\u0167\3"+
		"\2\2\2\u0166\u014e\3\2\2\2\u0166\u015a\3\2\2\2\u0167\63\3\2\2\2\u0168"+
		"\u0169\5@!\2\u0169\u016a\7\"\2\2\u016a\u016b\5D#\2\u016b\u016c\7\6\2\2"+
		"\u016c\u0173\3\2\2\2\u016d\u016e\5<\37\2\u016e\u016f\7\"\2\2\u016f\u0170"+
		"\5D#\2\u0170\u0171\7\6\2\2\u0171\u0173\3\2\2\2\u0172\u0168\3\2\2\2\u0172"+
		"\u016d\3\2\2\2\u0173\65\3\2\2\2\u0174\u0175\7\22\2\2\u0175\u0176\5@!\2"+
		"\u0176\67\3\2\2\2\u0177\u0178\7\5\2\2\u0178\u0179\5@!\2\u01799\3\2\2\2"+
		"\u017a\u017b\7\30\2\2\u017b\u017c\5@!\2\u017c;\3\2\2\2\u017d\u017e\7\20"+
		"\2\2\u017e\u017f\5@!\2\u017f=\3\2\2\2\u0180\u0199\b \1\2\u0181\u0182\5"+
		"@!\2\u0182\u0183\7 \2\2\u0183\u0184\5B\"\2\u0184\u019a\3\2\2\2\u0185\u0186"+
		"\5B\"\2\u0186\u0187\7 \2\2\u0187\u0188\5@!\2\u0188\u019a\3\2\2\2\u0189"+
		"\u018a\5@!\2\u018a\u018b\t\5\2\2\u018b\u018c\5@!\2\u018c\u019a\3\2\2\2"+
		"\u018d\u018e\5@!\2\u018e\u018f\t\5\2\2\u018f\u0190\5\20\t\2\u0190\u019a"+
		"\3\2\2\2\u0191\u0192\5\20\t\2\u0192\u0193\t\5\2\2\u0193\u0194\5@!\2\u0194"+
		"\u019a\3\2\2\2\u0195\u0196\5\20\t\2\u0196\u0197\t\5\2\2\u0197\u0198\5"+
		"\20\t\2\u0198\u019a\3\2\2\2\u0199\u0181\3\2\2\2\u0199\u0185\3\2\2\2\u0199"+
		"\u0189\3\2\2\2\u0199\u018d\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0195\3\2"+
		"\2\2\u019a\u01a6\3\2\2\2\u019b\u019c\5@!\2\u019c\u019d\7 \2\2\u019d\u019e"+
		"\5D#\2\u019e\u01a6\3\2\2\2\u019f\u01a0\5D#\2\u01a0\u01a1\7 \2\2\u01a1"+
		"\u01a2\5@!\2\u01a2\u01a6\3\2\2\2\u01a3\u01a6\5@!\2\u01a4\u01a6\5D#\2\u01a5"+
		"\u0180\3\2\2\2\u01a5\u019b\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01ac\3\2\2\2\u01a7\u01a8\f\7\2\2\u01a8"+
		"\u01a9\t\6\2\2\u01a9\u01ab\5> \b\u01aa\u01a7\3\2\2\2\u01ab\u01ae\3\2\2"+
		"\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad?\3\2\2\2\u01ae\u01ac"+
		"\3\2\2\2\u01af\u01b2\7-\2\2\u01b0\u01b2\5F$\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2A\3\2\2\2\u01b3\u01b4\7\7\2\2\u01b4C\3\2\2\2\u01b5"+
		"\u01b6\7+\2\2\u01b6E\3\2\2\2\u01b7\u01b8\7\32\2\2\u01b8\u01b9\7\37\2\2"+
		"\u01b9\u01ba\7-\2\2\u01baG\3\2\2\2\'O^iu}\u0086\u008e\u0090\u0099\u00a0"+
		"\u00ae\u00b3\u00b9\u00be\u00c5\u00cb\u00d0\u00d8\u00dc\u00e8\u00f4\u00fd"+
		"\u010a\u0111\u0117\u0124\u0136\u0142\u014c\u0154\u0160\u0166\u0172\u0199"+
		"\u01a5\u01ac\u01b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}