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
		RULE_dotnotaion = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "buffernode", "setup", "locationsetup", "locationmapping", "playersetup", 
			"inBlock", "expression", "statement", "assign", "declaration", "text_statement", 
			"input_statement", "if_chain_statement", "if_statement", "else_if_statement", 
			"else_statement", "travel_statement", "choice_statement", "option_statment", 
			"while_statement", "int_assign", "string_assign", "input_assign", "location_assign", 
			"bool_assign", "int_declaration", "string_declaration", "location_declaration", 
			"bool_declaration", "predicate", "variable", "string_obj", "bool_obj", 
			"dotnotaion"
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
			match(CURLY_LEFT);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				assign();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_STRING) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INT) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << VAR_NAME))) != 0) );
			setState(116);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_LEFT:
				{
				setState(125);
				match(PAREN_LEFT);
				setState(126);
				expression(0);
				setState(127);
				match(PAREN_RIGHT);
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(129);
				variable();
				}
				break;
			case NUM:
				{
				setState(130);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(134);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(143);
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				text_statement();
				}
				break;
			case KEYWORD_INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				input_statement();
				}
				break;
			case KEYWORD_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				if_chain_statement();
				}
				break;
			case TRAVEL_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				travel_statement();
				}
				break;
			case KEYWORD_CHOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				choice_statement();
				}
				break;
			case KEYWORD_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				int_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				string_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				bool_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				input_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
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
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				int_declaration();
				setState(160);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				string_declaration();
				setState(163);
				match(END_STMT);
				}
				break;
			case KEYWORD_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				bool_declaration();
				setState(166);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				location_declaration();
				setState(169);
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
			setState(173);
			match(KEYWORD_TEXT);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(174);
						string_obj();
						}
						break;
					case KEYWORD_PLAYER:
					case VAR_NAME:
						{
						setState(175);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(178);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(185);
				string_obj();
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(186);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(189);
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
			setState(191);
			match(KEYWORD_INPUT);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(192);
						string_obj();
						}
						break;
					case KEYWORD_PLAYER:
					case VAR_NAME:
						{
						setState(193);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(196);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(203);
				string_obj();
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(204);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(207);
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
			setState(209);
			if_statement();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_ELSEIF) {
				{
				{
				setState(210);
				else_if_statement();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ELSE) {
				{
				setState(216);
				else_statement();
				}
			}

			setState(219);
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
			setState(221);
			match(KEYWORD_IF);
			setState(222);
			match(PAREN_LEFT);
			setState(223);
			predicate(0);
			setState(224);
			match(PAREN_RIGHT);
			setState(225);
			match(CURLY_LEFT);
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				inBlock();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(231);
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
			setState(233);
			match(KEYWORD_ELSEIF);
			setState(234);
			match(PAREN_LEFT);
			setState(235);
			predicate(0);
			setState(236);
			match(PAREN_RIGHT);
			setState(237);
			match(CURLY_LEFT);
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				inBlock();
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(243);
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
			setState(245);
			match(KEYWORD_ELSE);
			setState(246);
			match(CURLY_LEFT);
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				inBlock();
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(252);
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
			setState(254);
			match(TRAVEL_KEYWORD);
			setState(255);
			variable();
			setState(256);
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
			setState(258);
			match(KEYWORD_CHOICE);
			setState(259);
			match(CURLY_LEFT);
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260);
				option_statment();
				}
				}
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << KEYWORD_PLAYER) | (1L << VAR_NAME))) != 0) );
			setState(265);
			match(CURLY_RIGHT);
			setState(266);
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
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(268);
				variable();
				}
				break;
			case STRING:
				{
				setState(269);
				string_obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(272);
			match(CURLY_LEFT);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273);
				inBlock();
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(278);
			match(CURLY_RIGHT);
			setState(279);
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
			setState(281);
			match(KEYWORD_WHILE);
			setState(282);
			match(PAREN_LEFT);
			setState(283);
			predicate(0);
			setState(284);
			match(PAREN_RIGHT);
			setState(285);
			match(CURLY_LEFT);
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(286);
				inBlock();
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(291);
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(293);
				variable();
				setState(294);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OPERATOR || _la==COMPOUND_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(295);
				expression(0);
				setState(296);
				match(END_STMT);
				}
				break;
			case 2:
				{
				setState(298);
				int_declaration();
				setState(299);
				match(ASSIGN_OPERATOR);
				setState(300);
				expression(0);
				setState(301);
				match(END_STMT);
				}
				break;
			case 3:
				{
				setState(303);
				int_declaration();
				setState(304);
				match(ASSIGN_OPERATOR);
				setState(305);
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
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(309);
				variable();
				setState(310);
				match(ASSIGN_OPERATOR);
				setState(311);
				string_obj();
				setState(312);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				{
				setState(314);
				string_declaration();
				setState(315);
				match(ASSIGN_OPERATOR);
				setState(316);
				string_obj();
				setState(317);
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
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(321);
				variable();
				setState(322);
				match(ASSIGN_OPERATOR);
				setState(323);
				input_statement();
				}
				break;
			case KEYWORD_STRING:
				{
				setState(325);
				string_declaration();
				setState(326);
				match(ASSIGN_OPERATOR);
				setState(327);
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
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(331);
				variable();
				setState(332);
				match(ASSIGN_OPERATOR);
				setState(333);
				match(CURLY_LEFT);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(334);
					inBlock();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				match(CURLY_RIGHT);
				setState(341);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				{
				setState(343);
				location_declaration();
				setState(344);
				match(ASSIGN_OPERATOR);
				setState(345);
				match(CURLY_LEFT);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(346);
					inBlock();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				match(CURLY_RIGHT);
				setState(353);
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
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(357);
				variable();
				setState(358);
				match(ASSIGN_OPERATOR);
				setState(359);
				bool_obj();
				setState(360);
				match(END_STMT);
				}
				break;
			case KEYWORD_BOOL:
				{
				setState(362);
				bool_declaration();
				setState(363);
				match(ASSIGN_OPERATOR);
				setState(364);
				bool_obj();
				setState(365);
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
			setState(369);
			match(KEYWORD_INT);
			setState(370);
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
			setState(372);
			match(KEYWORD_STRING);
			setState(373);
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
			setState(375);
			match(KEYWORD_LOCATION);
			setState(376);
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
			setState(378);
			match(KEYWORD_BOOL);
			setState(379);
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
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(382);
					variable();
					setState(383);
					match(BOOL_CMP_OPERATOR);
					setState(384);
					string_obj();
					}
					break;
				case 2:
					{
					setState(386);
					string_obj();
					setState(387);
					match(BOOL_CMP_OPERATOR);
					setState(388);
					variable();
					}
					break;
				case 3:
					{
					setState(390);
					variable();
					setState(391);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(392);
					variable();
					}
					break;
				case 4:
					{
					setState(394);
					variable();
					setState(395);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(396);
					expression(0);
					}
					break;
				case 5:
					{
					setState(398);
					expression(0);
					setState(399);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(400);
					variable();
					}
					break;
				case 6:
					{
					setState(402);
					expression(0);
					setState(403);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(404);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(408);
				variable();
				setState(409);
				match(BOOL_CMP_OPERATOR);
				setState(410);
				bool_obj();
				}
				break;
			case 3:
				{
				setState(412);
				bool_obj();
				setState(413);
				match(BOOL_CMP_OPERATOR);
				setState(414);
				variable();
				}
				break;
			case 4:
				{
				setState(416);
				variable();
				}
				break;
			case 5:
				{
				setState(417);
				bool_obj();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
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
					setState(420);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(421);
					_la = _input.LA(1);
					if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(422);
					predicate(6);
					}
					} 
				}
				setState(427);
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
		public DotnotaionContext dotnotaion() {
			return getRuleContext(DotnotaionContext.class,0);
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
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(VAR_NAME);
				}
				break;
			case KEYWORD_PLAYER:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				dotnotaion();
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
			setState(432);
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
			setState(434);
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

	public static class DotnotaionContext extends ParserRuleContext {
		public TerminalNode KEYWORD_PLAYER() { return getToken(BetterAdvGmParser.KEYWORD_PLAYER, 0); }
		public TerminalNode DOT() { return getToken(BetterAdvGmParser.DOT, 0); }
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public DotnotaionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotnotaion; }
	}

	public final DotnotaionContext dotnotaion() throws RecognitionException {
		DotnotaionContext _localctx = new DotnotaionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dotnotaion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(KEYWORD_PLAYER);
			setState(437);
			match(DOT);
			setState(438);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u01bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5]\n\5\r\5\16\5^\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7s"+
		"\n\7\r\7\16\7t\3\7\3\7\3\b\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0086\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008e\n\t\f\t\16\t\u0091"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00a0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ae"+
		"\n\f\3\r\3\r\3\r\5\r\u00b3\n\r\3\r\3\r\7\r\u00b7\n\r\f\r\16\r\u00ba\13"+
		"\r\3\r\3\r\5\r\u00be\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00c5\n\16\3\16\3"+
		"\16\7\16\u00c9\n\16\f\16\16\16\u00cc\13\16\3\16\3\16\5\16\u00d0\n\16\3"+
		"\16\3\16\3\17\3\17\7\17\u00d6\n\17\f\17\16\17\u00d9\13\17\3\17\5\17\u00dc"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00e6\n\20\r\20\16"+
		"\20\u00e7\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00f2\n\21\r\21"+
		"\16\21\u00f3\3\21\3\21\3\22\3\22\3\22\6\22\u00fb\n\22\r\22\16\22\u00fc"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\6\24\u0108\n\24\r\24\16"+
		"\24\u0109\3\24\3\24\3\24\3\25\3\25\5\25\u0111\n\25\3\25\3\25\6\25\u0115"+
		"\n\25\r\25\16\25\u0116\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\6"+
		"\26\u0122\n\26\r\26\16\26\u0123\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0136\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0142\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u014c\n\31\3\32\3\32\3\32\3\32\7\32\u0152\n"+
		"\32\f\32\16\32\u0155\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u015e"+
		"\n\32\f\32\16\32\u0161\13\32\3\32\3\32\3\32\5\32\u0166\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0172\n\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0199\n \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \5 \u01a5\n \3 \3 \3 \7 \u01aa\n \f \16 \u01ad"+
		"\13 \3!\3!\5!\u01b1\n!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\2\4\20>%\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\7\3\2$%\3"+
		"\2&\'\3\2\"#\3\2 !\3\2)*\2\u01d0\2H\3\2\2\2\4K\3\2\2\2\6R\3\2\2\2\bX\3"+
		"\2\2\2\nb\3\2\2\2\fo\3\2\2\2\16|\3\2\2\2\20\u0085\3\2\2\2\22\u0098\3\2"+
		"\2\2\24\u009f\3\2\2\2\26\u00ad\3\2\2\2\30\u00af\3\2\2\2\32\u00c1\3\2\2"+
		"\2\34\u00d3\3\2\2\2\36\u00df\3\2\2\2 \u00eb\3\2\2\2\"\u00f7\3\2\2\2$\u0100"+
		"\3\2\2\2&\u0104\3\2\2\2(\u0110\3\2\2\2*\u011b\3\2\2\2,\u0135\3\2\2\2."+
		"\u0141\3\2\2\2\60\u014b\3\2\2\2\62\u0165\3\2\2\2\64\u0171\3\2\2\2\66\u0173"+
		"\3\2\2\28\u0176\3\2\2\2:\u0179\3\2\2\2<\u017c\3\2\2\2>\u01a4\3\2\2\2@"+
		"\u01b0\3\2\2\2B\u01b2\3\2\2\2D\u01b4\3\2\2\2F\u01b6\3\2\2\2HI\5\4\3\2"+
		"IJ\7\2\2\3J\3\3\2\2\2KO\5\6\4\2LN\5\16\b\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2"+
		"\2OP\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RS\7\31\2\2ST\7\n\2\2TU\5\b\5\2UV\5\f"+
		"\7\2VW\7\13\2\2W\7\3\2\2\2XY\7\34\2\2YZ\7\"\2\2Z\\\7\n\2\2[]\5\n\6\2\\"+
		"[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\13\2\2a\t\3\2\2"+
		"\2bc\5@!\2ci\7(\2\2de\5@!\2ef\7\36\2\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2i"+
		"g\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5@!\2mn\7\6\2\2n\13\3\2\2\2"+
		"op\7\32\2\2pr\7\n\2\2qs\5\24\13\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2uv\3\2\2\2vw\7\13\2\2w\r\3\2\2\2x}\5\22\n\2y}\5\20\t\2z}\5\24\13\2"+
		"{}\5\26\f\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\17\3\2\2\2~\177\b"+
		"\t\1\2\177\u0080\7\f\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7\r\2\2\u0082"+
		"\u0086\3\2\2\2\u0083\u0086\5@!\2\u0084\u0086\7,\2\2\u0085~\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u008f\3\2\2\2\u0087\u0088\f\7"+
		"\2\2\u0088\u0089\t\2\2\2\u0089\u008e\5\20\t\b\u008a\u008b\f\6\2\2\u008b"+
		"\u008c\t\3\2\2\u008c\u008e\5\20\t\7\u008d\u0087\3\2\2\2\u008d\u008a\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\21\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0099\5\30\r\2\u0093\u0099\5\32"+
		"\16\2\u0094\u0099\5\34\17\2\u0095\u0099\5$\23\2\u0096\u0099\5&\24\2\u0097"+
		"\u0099\5*\26\2\u0098\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2"+
		"\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\23\3\2\2\2\u009a\u00a0\5,\27\2\u009b\u00a0\5.\30\2\u009c\u00a0\5\64\33"+
		"\2\u009d\u00a0\5\60\31\2\u009e\u00a0\5\62\32\2\u009f\u009a\3\2\2\2\u009f"+
		"\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2"+
		"\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\5\66\34\2\u00a2\u00a3\7\6\2\2\u00a3"+
		"\u00ae\3\2\2\2\u00a4\u00a5\58\35\2\u00a5\u00a6\7\6\2\2\u00a6\u00ae\3\2"+
		"\2\2\u00a7\u00a8\5<\37\2\u00a8\u00a9\7\6\2\2\u00a9\u00ae\3\2\2\2\u00aa"+
		"\u00ab\5:\36\2\u00ab\u00ac\7\6\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a1\3\2"+
		"\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\27\3\2\2\2\u00af\u00b8\7\4\2\2\u00b0\u00b3\5B\"\2\u00b1\u00b3\5@!\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7&"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00be\5B\"\2\u00bc\u00be\5@!\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\6\2\2\u00c0\31\3\2\2\2\u00c1"+
		"\u00ca\7\21\2\2\u00c2\u00c5\5B\"\2\u00c3\u00c5\5@!\2\u00c4\u00c2\3\2\2"+
		"\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7&\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\5B"+
		"\"\2\u00ce\u00d0\5@!\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\7\6\2\2\u00d2\33\3\2\2\2\u00d3\u00d7\5\36\20\2\u00d4"+
		"\u00d6\5 \21\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dc\5\"\22\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00de\7\6\2\2\u00de\35\3\2\2\2\u00df\u00e0\7\23\2\2\u00e0"+
		"\u00e1\7\f\2\2\u00e1\u00e2\5> \2\u00e2\u00e3\7\r\2\2\u00e3\u00e5\7\n\2"+
		"\2\u00e4\u00e6\5\16\b\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\13"+
		"\2\2\u00ea\37\3\2\2\2\u00eb\u00ec\7\25\2\2\u00ec\u00ed\7\f\2\2\u00ed\u00ee"+
		"\5> \2\u00ee\u00ef\7\r\2\2\u00ef\u00f1\7\n\2\2\u00f0\u00f2\5\16\b\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\13\2\2\u00f6!\3\2\2\2\u00f7\u00f8"+
		"\7\24\2\2\u00f8\u00fa\7\n\2\2\u00f9\u00fb\5\16\b\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\7\13\2\2\u00ff#\3\2\2\2\u0100\u0101\7\b\2\2\u0101"+
		"\u0102\5@!\2\u0102\u0103\7\6\2\2\u0103%\3\2\2\2\u0104\u0105\7\35\2\2\u0105"+
		"\u0107\7\n\2\2\u0106\u0108\5(\25\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\7\13\2\2\u010c\u010d\7\6\2\2\u010d\'\3\2\2\2\u010e\u0111\5@!\2"+
		"\u010f\u0111\5B\"\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\7\n\2\2\u0113\u0115\5\16\b\2\u0114\u0113\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\7\13\2\2\u0119\u011a\7\6\2\2\u011a)\3\2\2\2\u011b"+
		"\u011c\7\26\2\2\u011c\u011d\7\f\2\2\u011d\u011e\5> \2\u011e\u011f\7\r"+
		"\2\2\u011f\u0121\7\n\2\2\u0120\u0122\5\16\b\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\7\13\2\2\u0126+\3\2\2\2\u0127\u0128\5@!\2\u0128\u0129"+
		"\t\4\2\2\u0129\u012a\5\20\t\2\u012a\u012b\7\6\2\2\u012b\u0136\3\2\2\2"+
		"\u012c\u012d\5\66\34\2\u012d\u012e\7\"\2\2\u012e\u012f\5\20\t\2\u012f"+
		"\u0130\7\6\2\2\u0130\u0136\3\2\2\2\u0131\u0132\5\66\34\2\u0132\u0133\7"+
		"\"\2\2\u0133\u0134\5\32\16\2\u0134\u0136\3\2\2\2\u0135\u0127\3\2\2\2\u0135"+
		"\u012c\3\2\2\2\u0135\u0131\3\2\2\2\u0136-\3\2\2\2\u0137\u0138\5@!\2\u0138"+
		"\u0139\7\"\2\2\u0139\u013a\5B\"\2\u013a\u013b\7\6\2\2\u013b\u0142\3\2"+
		"\2\2\u013c\u013d\58\35\2\u013d\u013e\7\"\2\2\u013e\u013f\5B\"\2\u013f"+
		"\u0140\7\6\2\2\u0140\u0142\3\2\2\2\u0141\u0137\3\2\2\2\u0141\u013c\3\2"+
		"\2\2\u0142/\3\2\2\2\u0143\u0144\5@!\2\u0144\u0145\7\"\2\2\u0145\u0146"+
		"\5\32\16\2\u0146\u014c\3\2\2\2\u0147\u0148\58\35\2\u0148\u0149\7\"\2\2"+
		"\u0149\u014a\5\32\16\2\u014a\u014c\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u0147"+
		"\3\2\2\2\u014c\61\3\2\2\2\u014d\u014e\5@!\2\u014e\u014f\7\"\2\2\u014f"+
		"\u0153\7\n\2\2\u0150\u0152\5\16\b\2\u0151\u0150\3\2\2\2\u0152\u0155\3"+
		"\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0157\7\13\2\2\u0157\u0158\7\6\2\2\u0158\u0166\3"+
		"\2\2\2\u0159\u015a\5:\36\2\u015a\u015b\7\"\2\2\u015b\u015f\7\n\2\2\u015c"+
		"\u015e\5\16\b\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0163\7\13\2\2\u0163\u0164\7\6\2\2\u0164\u0166\3\2\2\2\u0165\u014d\3"+
		"\2\2\2\u0165\u0159\3\2\2\2\u0166\63\3\2\2\2\u0167\u0168\5@!\2\u0168\u0169"+
		"\7\"\2\2\u0169\u016a\5D#\2\u016a\u016b\7\6\2\2\u016b\u0172\3\2\2\2\u016c"+
		"\u016d\5<\37\2\u016d\u016e\7\"\2\2\u016e\u016f\5D#\2\u016f\u0170\7\6\2"+
		"\2\u0170\u0172\3\2\2\2\u0171\u0167\3\2\2\2\u0171\u016c\3\2\2\2\u0172\65"+
		"\3\2\2\2\u0173\u0174\7\22\2\2\u0174\u0175\5@!\2\u0175\67\3\2\2\2\u0176"+
		"\u0177\7\5\2\2\u0177\u0178\5@!\2\u01789\3\2\2\2\u0179\u017a\7\30\2\2\u017a"+
		"\u017b\5@!\2\u017b;\3\2\2\2\u017c\u017d\7\20\2\2\u017d\u017e\5@!\2\u017e"+
		"=\3\2\2\2\u017f\u0198\b \1\2\u0180\u0181\5@!\2\u0181\u0182\7 \2\2\u0182"+
		"\u0183\5B\"\2\u0183\u0199\3\2\2\2\u0184\u0185\5B\"\2\u0185\u0186\7 \2"+
		"\2\u0186\u0187\5@!\2\u0187\u0199\3\2\2\2\u0188\u0189\5@!\2\u0189\u018a"+
		"\t\5\2\2\u018a\u018b\5@!\2\u018b\u0199\3\2\2\2\u018c\u018d\5@!\2\u018d"+
		"\u018e\t\5\2\2\u018e\u018f\5\20\t\2\u018f\u0199\3\2\2\2\u0190\u0191\5"+
		"\20\t\2\u0191\u0192\t\5\2\2\u0192\u0193\5@!\2\u0193\u0199\3\2\2\2\u0194"+
		"\u0195\5\20\t\2\u0195\u0196\t\5\2\2\u0196\u0197\5\20\t\2\u0197\u0199\3"+
		"\2\2\2\u0198\u0180\3\2\2\2\u0198\u0184\3\2\2\2\u0198\u0188\3\2\2\2\u0198"+
		"\u018c\3\2\2\2\u0198\u0190\3\2\2\2\u0198\u0194\3\2\2\2\u0199\u01a5\3\2"+
		"\2\2\u019a\u019b\5@!\2\u019b\u019c\7 \2\2\u019c\u019d\5D#\2\u019d\u01a5"+
		"\3\2\2\2\u019e\u019f\5D#\2\u019f\u01a0\7 \2\2\u01a0\u01a1\5@!\2\u01a1"+
		"\u01a5\3\2\2\2\u01a2\u01a5\5@!\2\u01a3\u01a5\5D#\2\u01a4\u017f\3\2\2\2"+
		"\u01a4\u019a\3\2\2\2\u01a4\u019e\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\u01ab\3\2\2\2\u01a6\u01a7\f\7\2\2\u01a7\u01a8\t\6\2\2\u01a8"+
		"\u01aa\5> \b\u01a9\u01a6\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2"+
		"\2\u01ab\u01ac\3\2\2\2\u01ac?\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1"+
		"\7-\2\2\u01af\u01b1\5F$\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"A\3\2\2\2\u01b2\u01b3\7\7\2\2\u01b3C\3\2\2\2\u01b4\u01b5\7+\2\2\u01b5"+
		"E\3\2\2\2\u01b6\u01b7\7\32\2\2\u01b7\u01b8\7\37\2\2\u01b8\u01b9\7-\2\2"+
		"\u01b9G\3\2\2\2\'O^it|\u0085\u008d\u008f\u0098\u009f\u00ad\u00b2\u00b8"+
		"\u00bd\u00c4\u00ca\u00cf\u00d7\u00db\u00e7\u00f3\u00fc\u0109\u0110\u0116"+
		"\u0123\u0135\u0141\u014b\u0153\u015f\u0165\u0171\u0198\u01a4\u01ab\u01b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}