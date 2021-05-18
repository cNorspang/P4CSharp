// Generated from u:\vatpri\Code\CS\P4CSharp\POTBAG\AntlrFiles\SWAE.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SWAEParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_buffernode = 1, RULE_setup = 2, RULE_locationsetup = 3, 
		RULE_locationmapping = 4, RULE_playersetup = 5, RULE_inBlock = 6, RULE_expression = 7, 
		RULE_statement = 8, RULE_assign = 9, RULE_declaration = 10, RULE_text_statement = 11, 
		RULE_input_statement = 12, RULE_if_chain_statement = 13, RULE_if_statement = 14, 
		RULE_else_if_statement = 15, RULE_else_statement = 16, RULE_travel_statement = 17, 
		RULE_choice_statement = 18, RULE_option_statment = 19, RULE_while_statement = 20, 
		RULE_anonymous_assign = 21, RULE_int_assign = 22, RULE_string_assign = 23, 
		RULE_input_assign = 24, RULE_location_assign = 25, RULE_bool_assign = 26, 
		RULE_int_declaration = 27, RULE_string_declaration = 28, RULE_location_declaration = 29, 
		RULE_bool_declaration = 30, RULE_predicate = 31, RULE_random = 32, RULE_variable = 33, 
		RULE_string_obj = 34, RULE_bool_obj = 35, RULE_dot_notaion = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "buffernode", "setup", "locationsetup", "locationmapping", "playersetup", 
			"inBlock", "expression", "statement", "assign", "declaration", "text_statement", 
			"input_statement", "if_chain_statement", "if_statement", "else_if_statement", 
			"else_statement", "travel_statement", "choice_statement", "option_statment", 
			"while_statement", "anonymous_assign", "int_assign", "string_assign", 
			"input_assign", "location_assign", "bool_assign", "int_declaration", 
			"string_declaration", "location_declaration", "bool_declaration", "predicate", 
			"random", "variable", "string_obj", "bool_obj", "dot_notaion"
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

	@Override
	public String getGrammarFileName() { return "SWAE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SWAEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public BuffernodeContext buffernode() {
			return getRuleContext(BuffernodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SWAEParser.EOF, 0); }
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
			setState(74);
			buffernode();
			setState(75);
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
		public List<Location_assignContext> location_assign() {
			return getRuleContexts(Location_assignContext.class);
		}
		public Location_assignContext location_assign(int i) {
			return getRuleContext(Location_assignContext.class,i);
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
			setState(77);
			setup();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_LOCATION) {
				{
				{
				setState(78);
				location_assign();
				}
				}
				setState(83);
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
		public TerminalNode KEYWORD_SETUP() { return getToken(SWAEParser.KEYWORD_SETUP, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public LocationsetupContext locationsetup() {
			return getRuleContext(LocationsetupContext.class,0);
		}
		public PlayersetupContext playersetup() {
			return getRuleContext(PlayersetupContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
			setState(84);
			match(KEYWORD_SETUP);
			setState(85);
			match(CURLY_LEFT);
			setState(86);
			locationsetup();
			setState(87);
			playersetup();
			setState(88);
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
		public TerminalNode KEYWORD_LOCATIONS() { return getToken(SWAEParser.KEYWORD_LOCATIONS, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SWAEParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
			setState(90);
			match(KEYWORD_LOCATIONS);
			setState(91);
			match(ASSIGN_OPERATOR);
			setState(92);
			match(CURLY_LEFT);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				locationmapping();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD_PLAYER || _la==VAR_NAME );
			setState(98);
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
		public TerminalNode ARROW_OPERATOR() { return getToken(SWAEParser.ARROW_OPERATOR, 0); }
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
		public List<TerminalNode> COMMA_SEPERATOR() { return getTokens(SWAEParser.COMMA_SEPERATOR); }
		public TerminalNode COMMA_SEPERATOR(int i) {
			return getToken(SWAEParser.COMMA_SEPERATOR, i);
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
			setState(100);
			variable();
			setState(101);
			match(ARROW_OPERATOR);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					variable();
					setState(103);
					match(COMMA_SEPERATOR);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(110);
			variable();
			setState(111);
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
		public TerminalNode KEYWORD_PLAYER() { return getToken(SWAEParser.KEYWORD_PLAYER, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SWAEParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
			setState(113);
			match(KEYWORD_PLAYER);
			setState(114);
			match(ASSIGN_OPERATOR);
			setState(115);
			match(CURLY_LEFT);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				assign();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_STRING) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INT) | (1L << KEYWORD_PLAYER) | (1L << VAR_NAME))) != 0) );
			setState(121);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
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
		public TerminalNode PAREN_LEFT() { return getToken(SWAEParser.PAREN_LEFT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(SWAEParser.PAREN_RIGHT, 0); }
		public TerminalNode MINUS_OPERATOR() { return getToken(SWAEParser.MINUS_OPERATOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SWAEParser.NUM, 0); }
		public TerminalNode TIMES_OPERATOR() { return getToken(SWAEParser.TIMES_OPERATOR, 0); }
		public TerminalNode DIVISION_OPERATOR() { return getToken(SWAEParser.DIVISION_OPERATOR, 0); }
		public TerminalNode PLUS_OPERATOR() { return getToken(SWAEParser.PLUS_OPERATOR, 0); }
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
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_LEFT:
				{
				setState(130);
				match(PAREN_LEFT);
				setState(131);
				expression(0);
				setState(132);
				match(PAREN_RIGHT);
				}
				break;
			case MINUS_OPERATOR:
				{
				setState(134);
				match(MINUS_OPERATOR);
				setState(135);
				expression(6);
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(136);
				variable();
				}
				break;
			case KEYWORD_RANDOM:
				{
				setState(137);
				random();
				}
				break;
			case NUM:
				{
				setState(138);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(151);
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				text_statement();
				}
				break;
			case KEYWORD_INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				input_statement();
				}
				break;
			case KEYWORD_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				if_chain_statement();
				}
				break;
			case TRAVEL_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				travel_statement();
				}
				break;
			case KEYWORD_CHOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				choice_statement();
				}
				break;
			case KEYWORD_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
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
		public Anonymous_assignContext anonymous_assign() {
			return getRuleContext(Anonymous_assignContext.class,0);
		}
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
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				anonymous_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				int_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				string_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				bool_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				input_assign();
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
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Bool_declarationContext bool_declaration() {
			return getRuleContext(Bool_declarationContext.class,0);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				int_declaration();
				setState(168);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				string_declaration();
				setState(171);
				match(END_STMT);
				}
				break;
			case KEYWORD_BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				bool_declaration();
				setState(174);
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
		public TerminalNode KEYWORD_TEXT() { return getToken(SWAEParser.KEYWORD_TEXT, 0); }
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
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
		public List<TerminalNode> PLUS_OPERATOR() { return getTokens(SWAEParser.PLUS_OPERATOR); }
		public TerminalNode PLUS_OPERATOR(int i) {
			return getToken(SWAEParser.PLUS_OPERATOR, i);
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
			setState(178);
			match(KEYWORD_TEXT);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(179);
						string_obj();
						}
						break;
					case KEYWORD_PLAYER:
					case VAR_NAME:
						{
						setState(180);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(183);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(190);
				string_obj();
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(191);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(194);
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
		public TerminalNode KEYWORD_INPUT() { return getToken(SWAEParser.KEYWORD_INPUT, 0); }
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
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
		public List<TerminalNode> PLUS_OPERATOR() { return getTokens(SWAEParser.PLUS_OPERATOR); }
		public TerminalNode PLUS_OPERATOR(int i) {
			return getToken(SWAEParser.PLUS_OPERATOR, i);
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
			setState(196);
			match(KEYWORD_INPUT);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(197);
						string_obj();
						}
						break;
					case KEYWORD_PLAYER:
					case VAR_NAME:
						{
						setState(198);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(201);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(208);
				string_obj();
				}
				break;
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(209);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
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
			setState(214);
			if_statement();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_ELSEIF) {
				{
				{
				setState(215);
				else_if_statement();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ELSE) {
				{
				setState(221);
				else_statement();
				}
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_IF() { return getToken(SWAEParser.KEYWORD_IF, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(SWAEParser.PAREN_LEFT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(SWAEParser.PAREN_RIGHT, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
			setState(224);
			match(KEYWORD_IF);
			setState(225);
			match(PAREN_LEFT);
			setState(226);
			predicate(0);
			setState(227);
			match(PAREN_RIGHT);
			setState(228);
			match(CURLY_LEFT);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				inBlock();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << KEYWORD_RANDOM) | (1L << MINUS_OPERATOR) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(234);
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
		public TerminalNode KEYWORD_ELSEIF() { return getToken(SWAEParser.KEYWORD_ELSEIF, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(SWAEParser.PAREN_LEFT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(SWAEParser.PAREN_RIGHT, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
			setState(236);
			match(KEYWORD_ELSEIF);
			setState(237);
			match(PAREN_LEFT);
			setState(238);
			predicate(0);
			setState(239);
			match(PAREN_RIGHT);
			setState(240);
			match(CURLY_LEFT);
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				inBlock();
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << KEYWORD_RANDOM) | (1L << MINUS_OPERATOR) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(246);
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
		public TerminalNode KEYWORD_ELSE() { return getToken(SWAEParser.KEYWORD_ELSE, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
			setState(248);
			match(KEYWORD_ELSE);
			setState(249);
			match(CURLY_LEFT);
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				inBlock();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << KEYWORD_RANDOM) | (1L << MINUS_OPERATOR) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(255);
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
		public TerminalNode TRAVEL_KEYWORD() { return getToken(SWAEParser.TRAVEL_KEYWORD, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
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
			setState(257);
			match(TRAVEL_KEYWORD);
			setState(258);
			variable();
			setState(259);
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
		public TerminalNode KEYWORD_CHOICE() { return getToken(SWAEParser.KEYWORD_CHOICE, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
			setState(261);
			match(KEYWORD_CHOICE);
			setState(262);
			match(CURLY_LEFT);
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				option_statment();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << PAREN_LEFT) | (1L << KEYWORD_PLAYER) | (1L << VAR_NAME))) != 0) );
			setState(268);
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

	public static class Option_statmentContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public String_objContext string_obj() {
			return getRuleContext(String_objContext.class,0);
		}
		public TerminalNode PAREN_LEFT() { return getToken(SWAEParser.PAREN_LEFT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(SWAEParser.PAREN_RIGHT, 0); }
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
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_LEFT) {
				{
				setState(270);
				match(PAREN_LEFT);
				setState(271);
				predicate(0);
				setState(272);
				match(PAREN_RIGHT);
				}
			}

			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(276);
				variable();
				}
				break;
			case STRING:
				{
				setState(277);
				string_obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			match(CURLY_LEFT);
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				inBlock();
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << KEYWORD_RANDOM) | (1L << MINUS_OPERATOR) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(286);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode KEYWORD_WHILE() { return getToken(SWAEParser.KEYWORD_WHILE, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(SWAEParser.PAREN_LEFT, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(SWAEParser.PAREN_RIGHT, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
			setState(288);
			match(KEYWORD_WHILE);
			setState(289);
			match(PAREN_LEFT);
			setState(290);
			predicate(0);
			setState(291);
			match(PAREN_RIGHT);
			setState(292);
			match(CURLY_LEFT);
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				inBlock();
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << KEYWORD_RANDOM) | (1L << MINUS_OPERATOR) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(298);
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

	public static class Anonymous_assignContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SWAEParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
		public Anonymous_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_assign; }
	}

	public final Anonymous_assignContext anonymous_assign() throws RecognitionException {
		Anonymous_assignContext _localctx = new Anonymous_assignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_anonymous_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			variable();
			setState(301);
			match(ASSIGN_OPERATOR);
			setState(302);
			variable();
			setState(303);
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

	public static class Int_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SWAEParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode COMPOUND_OPERATOR() { return getToken(SWAEParser.COMPOUND_OPERATOR, 0); }
		public Int_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assign; }
	}

	public final Int_assignContext int_assign() throws RecognitionException {
		Int_assignContext _localctx = new Int_assignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_int_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(305);
				variable();
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OPERATOR || _la==COMPOUND_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				expression(0);
				setState(308);
				match(END_STMT);
				}
				break;
			case KEYWORD_INT:
				{
				setState(310);
				int_declaration();
				setState(311);
				match(ASSIGN_OPERATOR);
				setState(312);
				expression(0);
				setState(313);
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

	public static class String_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SWAEParser.ASSIGN_OPERATOR, 0); }
		public String_objContext string_obj() {
			return getRuleContext(String_objContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
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
		enterRule(_localctx, 46, RULE_string_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(317);
				variable();
				setState(318);
				match(ASSIGN_OPERATOR);
				setState(319);
				string_obj();
				setState(320);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				{
				setState(322);
				string_declaration();
				setState(323);
				match(ASSIGN_OPERATOR);
				setState(324);
				string_obj();
				setState(325);
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
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SWAEParser.ASSIGN_OPERATOR, 0); }
		public Input_statementContext input_statement() {
			return getRuleContext(Input_statementContext.class,0);
		}
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public Input_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_assign; }
	}

	public final Input_assignContext input_assign() throws RecognitionException {
		Input_assignContext _localctx = new Input_assignContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_input_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(329);
				variable();
				setState(330);
				match(ASSIGN_OPERATOR);
				setState(331);
				input_statement();
				}
				break;
			case KEYWORD_STRING:
				{
				setState(333);
				string_declaration();
				setState(334);
				match(ASSIGN_OPERATOR);
				setState(335);
				input_statement();
				}
				break;
			case KEYWORD_INT:
				{
				setState(337);
				int_declaration();
				setState(338);
				match(ASSIGN_OPERATOR);
				setState(339);
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
		public Location_declarationContext location_declaration() {
			return getRuleContext(Location_declarationContext.class,0);
		}
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SWAEParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode CURLY_LEFT() { return getToken(SWAEParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(SWAEParser.CURLY_RIGHT, 0); }
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
		enterRule(_localctx, 50, RULE_location_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_BOOL) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_PLAYER) | (1L << KEYWORD_CHOICE) | (1L << KEYWORD_RANDOM) | (1L << MINUS_OPERATOR) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
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
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SWAEParser.ASSIGN_OPERATOR, 0); }
		public Bool_objContext bool_obj() {
			return getRuleContext(Bool_objContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(SWAEParser.END_STMT, 0); }
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
		enterRule(_localctx, 52, RULE_bool_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_PLAYER:
			case VAR_NAME:
				{
				setState(354);
				variable();
				setState(355);
				match(ASSIGN_OPERATOR);
				setState(356);
				bool_obj();
				setState(357);
				match(END_STMT);
				}
				break;
			case KEYWORD_BOOL:
				{
				setState(359);
				bool_declaration();
				setState(360);
				match(ASSIGN_OPERATOR);
				setState(361);
				bool_obj();
				setState(362);
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
		public TerminalNode KEYWORD_INT() { return getToken(SWAEParser.KEYWORD_INT, 0); }
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
		enterRule(_localctx, 54, RULE_int_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(KEYWORD_INT);
			setState(367);
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
		public TerminalNode KEYWORD_STRING() { return getToken(SWAEParser.KEYWORD_STRING, 0); }
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
		enterRule(_localctx, 56, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(KEYWORD_STRING);
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

	public static class Location_declarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_LOCATION() { return getToken(SWAEParser.KEYWORD_LOCATION, 0); }
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
		enterRule(_localctx, 58, RULE_location_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(KEYWORD_LOCATION);
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

	public static class Bool_declarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_BOOL() { return getToken(SWAEParser.KEYWORD_BOOL, 0); }
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
		enterRule(_localctx, 60, RULE_bool_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(KEYWORD_BOOL);
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

	public static class PredicateContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode BOOL_CMP_OPERATOR() { return getToken(SWAEParser.BOOL_CMP_OPERATOR, 0); }
		public String_objContext string_obj() {
			return getRuleContext(String_objContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CMP_OPERATOR() { return getToken(SWAEParser.CMP_OPERATOR, 0); }
		public Bool_objContext bool_obj() {
			return getRuleContext(Bool_objContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode AND_OPERATOR() { return getToken(SWAEParser.AND_OPERATOR, 0); }
		public TerminalNode OR_OPERATOR() { return getToken(SWAEParser.OR_OPERATOR, 0); }
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(379);
					variable();
					setState(380);
					match(BOOL_CMP_OPERATOR);
					setState(381);
					string_obj();
					}
					break;
				case 2:
					{
					setState(383);
					string_obj();
					setState(384);
					match(BOOL_CMP_OPERATOR);
					setState(385);
					variable();
					}
					break;
				case 3:
					{
					setState(387);
					variable();
					setState(388);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(389);
					variable();
					}
					break;
				case 4:
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
					expression(0);
					}
					break;
				case 5:
					{
					setState(395);
					expression(0);
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
					variable();
					}
					break;
				case 6:
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
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(405);
				variable();
				setState(406);
				match(BOOL_CMP_OPERATOR);
				setState(407);
				bool_obj();
				}
				break;
			case 3:
				{
				setState(409);
				bool_obj();
				setState(410);
				match(BOOL_CMP_OPERATOR);
				setState(411);
				variable();
				}
				break;
			case 4:
				{
				setState(413);
				variable();
				}
				break;
			case 5:
				{
				setState(414);
				bool_obj();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PredicateContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_predicate);
					setState(417);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(418);
					_la = _input.LA(1);
					if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(419);
					predicate(6);
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class RandomContext extends ParserRuleContext {
		public TerminalNode KEYWORD_RANDOM() { return getToken(SWAEParser.KEYWORD_RANDOM, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(SWAEParser.PAREN_LEFT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA_SEPERATOR() { return getToken(SWAEParser.COMMA_SEPERATOR, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(SWAEParser.PAREN_RIGHT, 0); }
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_random);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(KEYWORD_RANDOM);
			setState(426);
			match(PAREN_LEFT);
			setState(427);
			expression(0);
			setState(428);
			match(COMMA_SEPERATOR);
			setState(429);
			expression(0);
			setState(430);
			match(PAREN_RIGHT);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(SWAEParser.VAR_NAME, 0); }
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
		enterRule(_localctx, 66, RULE_variable);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(VAR_NAME);
				}
				break;
			case KEYWORD_PLAYER:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
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
		public TerminalNode STRING() { return getToken(SWAEParser.STRING, 0); }
		public String_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_obj; }
	}

	public final String_objContext string_obj() throws RecognitionException {
		String_objContext _localctx = new String_objContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_string_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		public TerminalNode BOOL() { return getToken(SWAEParser.BOOL, 0); }
		public Bool_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_obj; }
	}

	public final Bool_objContext bool_obj() throws RecognitionException {
		Bool_objContext _localctx = new Bool_objContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bool_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
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
		public TerminalNode KEYWORD_PLAYER() { return getToken(SWAEParser.KEYWORD_PLAYER, 0); }
		public TerminalNode DOT() { return getToken(SWAEParser.DOT, 0); }
		public TerminalNode VAR_NAME() { return getToken(SWAEParser.VAR_NAME, 0); }
		public Dot_notaionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_notaion; }
	}

	public final Dot_notaionContext dot_notaion() throws RecognitionException {
		Dot_notaionContext _localctx = new Dot_notaionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dot_notaion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(KEYWORD_PLAYER);
			setState(441);
			match(DOT);
			setState(442);
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
		case 31:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\7\3R\n\3\f\3\16"+
		"\3U\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5a\n\5\r\5\16\5b\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\6\7x\n\7\r\7\16\7y\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a1"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a8\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00b3\n\f\3\r\3\r\3\r\5\r\u00b8\n\r\3\r\3\r\7\r\u00bc"+
		"\n\r\f\r\16\r\u00bf\13\r\3\r\3\r\5\r\u00c3\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\5\16\u00ca\n\16\3\16\3\16\7\16\u00ce\n\16\f\16\16\16\u00d1\13\16\3\16"+
		"\3\16\5\16\u00d5\n\16\3\16\3\16\3\17\3\17\7\17\u00db\n\17\f\17\16\17\u00de"+
		"\13\17\3\17\5\17\u00e1\n\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00e9\n"+
		"\20\r\20\16\20\u00ea\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00f5"+
		"\n\21\r\21\16\21\u00f6\3\21\3\21\3\22\3\22\3\22\6\22\u00fe\n\22\r\22\16"+
		"\22\u00ff\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\6\24\u010b\n\24"+
		"\r\24\16\24\u010c\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0115\n\25\3\25\3"+
		"\25\5\25\u0119\n\25\3\25\3\25\6\25\u011d\n\25\r\25\16\25\u011e\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u0129\n\26\r\26\16\26\u012a\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u013e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u014a\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0158\n\32\3\33\3\33\3\33\3\33\7\33\u015e\n\33\f\33\16"+
		"\33\u0161\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u016f\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\5!\u0196\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01a2\n!\3!"+
		"\3!\3!\7!\u01a7\n!\f!\16!\u01aa\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#"+
		"\5#\u01b5\n#\3$\3$\3%\3%\3&\3&\3&\3&\3&\2\4\20@\'\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\3\2%&\3\2\'(\3\2"+
		"#$\3\2!\"\3\2*+\2\u01d2\2L\3\2\2\2\4O\3\2\2\2\6V\3\2\2\2\b\\\3\2\2\2\n"+
		"f\3\2\2\2\fs\3\2\2\2\16\u0081\3\2\2\2\20\u008d\3\2\2\2\22\u00a0\3\2\2"+
		"\2\24\u00a7\3\2\2\2\26\u00b2\3\2\2\2\30\u00b4\3\2\2\2\32\u00c6\3\2\2\2"+
		"\34\u00d8\3\2\2\2\36\u00e2\3\2\2\2 \u00ee\3\2\2\2\"\u00fa\3\2\2\2$\u0103"+
		"\3\2\2\2&\u0107\3\2\2\2(\u0114\3\2\2\2*\u0122\3\2\2\2,\u012e\3\2\2\2."+
		"\u013d\3\2\2\2\60\u0149\3\2\2\2\62\u0157\3\2\2\2\64\u0159\3\2\2\2\66\u016e"+
		"\3\2\2\28\u0170\3\2\2\2:\u0173\3\2\2\2<\u0176\3\2\2\2>\u0179\3\2\2\2@"+
		"\u01a1\3\2\2\2B\u01ab\3\2\2\2D\u01b4\3\2\2\2F\u01b6\3\2\2\2H\u01b8\3\2"+
		"\2\2J\u01ba\3\2\2\2LM\5\4\3\2MN\7\2\2\3N\3\3\2\2\2OS\5\6\4\2PR\5\64\33"+
		"\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\5\3\2\2\2US\3\2\2\2VW\7\32"+
		"\2\2WX\7\13\2\2XY\5\b\5\2YZ\5\f\7\2Z[\7\f\2\2[\7\3\2\2\2\\]\7\34\2\2]"+
		"^\7#\2\2^`\7\13\2\2_a\5\n\6\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2"+
		"cd\3\2\2\2de\7\f\2\2e\t\3\2\2\2fg\5D#\2gm\7)\2\2hi\5D#\2ij\7\37\2\2jl"+
		"\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2p"+
		"q\5D#\2qr\7\7\2\2r\13\3\2\2\2st\7\33\2\2tu\7#\2\2uw\7\13\2\2vx\5\24\13"+
		"\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\f\2\2|\r\3\2"+
		"\2\2}\u0082\5\22\n\2~\u0082\5\20\t\2\177\u0082\5\24\13\2\u0080\u0082\5"+
		"\26\f\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\17\3\2\2\2\u0083\u0084\b\t\1\2\u0084\u0085\7\r\2\2\u0085"+
		"\u0086\5\20\t\2\u0086\u0087\7\16\2\2\u0087\u008e\3\2\2\2\u0088\u0089\7"+
		"(\2\2\u0089\u008e\5\20\t\b\u008a\u008e\5D#\2\u008b\u008e\5B\"\2\u008c"+
		"\u008e\7-\2\2\u008d\u0083\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u008a\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0097\3\2\2\2\u008f"+
		"\u0090\f\7\2\2\u0090\u0091\t\2\2\2\u0091\u0096\5\20\t\b\u0092\u0093\f"+
		"\6\2\2\u0093\u0094\t\3\2\2\u0094\u0096\5\20\t\7\u0095\u008f\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\21\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a1\5\30\r\2\u009b\u00a1"+
		"\5\32\16\2\u009c\u00a1\5\34\17\2\u009d\u00a1\5$\23\2\u009e\u00a1\5&\24"+
		"\2\u009f\u00a1\5*\26\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c"+
		"\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\23\3\2\2\2\u00a2\u00a8\5,\27\2\u00a3\u00a8\5.\30\2\u00a4\u00a8\5\60\31"+
		"\2\u00a5\u00a8\5\66\34\2\u00a6\u00a8\5\62\32\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\25\3\2\2\2\u00a9\u00aa\58\35\2\u00aa\u00ab\7\7\2\2\u00ab\u00b3"+
		"\3\2\2\2\u00ac\u00ad\5:\36\2\u00ad\u00ae\7\7\2\2\u00ae\u00b3\3\2\2\2\u00af"+
		"\u00b0\5> \2\u00b0\u00b1\7\7\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a9\3\2\2"+
		"\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00bd"+
		"\7\5\2\2\u00b5\u00b8\5F$\2\u00b6\u00b8\5D#\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c2\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\5F"+
		"$\2\u00c1\u00c3\5D#\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\7\7\2\2\u00c5\31\3\2\2\2\u00c6\u00cf\7\22\2\2\u00c7"+
		"\u00ca\5F$\2\u00c8\u00ca\5D#\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\'\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d4\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\5F$\2\u00d3\u00d5\5D#\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\7\7\2\2\u00d7\33\3\2\2\2\u00d8\u00dc\5\36\20\2\u00d9\u00db\5 \21\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5\"\22\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\7\24\2"+
		"\2\u00e3\u00e4\7\r\2\2\u00e4\u00e5\5@!\2\u00e5\u00e6\7\16\2\2\u00e6\u00e8"+
		"\7\13\2\2\u00e7\u00e9\5\16\b\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\7\f\2\2\u00ed\37\3\2\2\2\u00ee\u00ef\7\26\2\2\u00ef\u00f0\7\r\2\2\u00f0"+
		"\u00f1\5@!\2\u00f1\u00f2\7\16\2\2\u00f2\u00f4\7\13\2\2\u00f3\u00f5\5\16"+
		"\b\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\f\2\2\u00f9!\3\2\2\2"+
		"\u00fa\u00fb\7\25\2\2\u00fb\u00fd\7\13\2\2\u00fc\u00fe\5\16\b\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\f\2\2\u0102#\3\2\2\2\u0103\u0104"+
		"\7\t\2\2\u0104\u0105\5D#\2\u0105\u0106\7\7\2\2\u0106%\3\2\2\2\u0107\u0108"+
		"\7\35\2\2\u0108\u010a\7\13\2\2\u0109\u010b\5(\25\2\u010a\u0109\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\7\f\2\2\u010f\'\3\2\2\2\u0110\u0111\7\r\2\2\u0111"+
		"\u0112\5@!\2\u0112\u0113\7\16\2\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0119\5D#\2\u0117\u0119"+
		"\5F$\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\7\13\2\2\u011b\u011d\5\16\b\2\u011c\u011b\3\2\2\2\u011d\u011e\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7\f\2\2\u0121)\3\2\2\2\u0122\u0123\7\27\2\2\u0123\u0124\7\r\2\2"+
		"\u0124\u0125\5@!\2\u0125\u0126\7\16\2\2\u0126\u0128\7\13\2\2\u0127\u0129"+
		"\5\16\b\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2"+
		"\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\f\2\2\u012d+\3"+
		"\2\2\2\u012e\u012f\5D#\2\u012f\u0130\7#\2\2\u0130\u0131\5D#\2\u0131\u0132"+
		"\7\7\2\2\u0132-\3\2\2\2\u0133\u0134\5D#\2\u0134\u0135\t\4\2\2\u0135\u0136"+
		"\5\20\t\2\u0136\u0137\7\7\2\2\u0137\u013e\3\2\2\2\u0138\u0139\58\35\2"+
		"\u0139\u013a\7#\2\2\u013a\u013b\5\20\t\2\u013b\u013c\7\7\2\2\u013c\u013e"+
		"\3\2\2\2\u013d\u0133\3\2\2\2\u013d\u0138\3\2\2\2\u013e/\3\2\2\2\u013f"+
		"\u0140\5D#\2\u0140\u0141\7#\2\2\u0141\u0142\5F$\2\u0142\u0143\7\7\2\2"+
		"\u0143\u014a\3\2\2\2\u0144\u0145\5:\36\2\u0145\u0146\7#\2\2\u0146\u0147"+
		"\5F$\2\u0147\u0148\7\7\2\2\u0148\u014a\3\2\2\2\u0149\u013f\3\2\2\2\u0149"+
		"\u0144\3\2\2\2\u014a\61\3\2\2\2\u014b\u014c\5D#\2\u014c\u014d\7#\2\2\u014d"+
		"\u014e\5\32\16\2\u014e\u0158\3\2\2\2\u014f\u0150\5:\36\2\u0150\u0151\7"+
		"#\2\2\u0151\u0152\5\32\16\2\u0152\u0158\3\2\2\2\u0153\u0154\58\35\2\u0154"+
		"\u0155\7#\2\2\u0155\u0156\5\32\16\2\u0156\u0158\3\2\2\2\u0157\u014b\3"+
		"\2\2\2\u0157\u014f\3\2\2\2\u0157\u0153\3\2\2\2\u0158\63\3\2\2\2\u0159"+
		"\u015a\5<\37\2\u015a\u015b\7#\2\2\u015b\u015f\7\13\2\2\u015c\u015e\5\16"+
		"\b\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\f"+
		"\2\2\u0163\65\3\2\2\2\u0164\u0165\5D#\2\u0165\u0166\7#\2\2\u0166\u0167"+
		"\5H%\2\u0167\u0168\7\7\2\2\u0168\u016f\3\2\2\2\u0169\u016a\5> \2\u016a"+
		"\u016b\7#\2\2\u016b\u016c\5H%\2\u016c\u016d\7\7\2\2\u016d\u016f\3\2\2"+
		"\2\u016e\u0164\3\2\2\2\u016e\u0169\3\2\2\2\u016f\67\3\2\2\2\u0170\u0171"+
		"\7\23\2\2\u0171\u0172\5D#\2\u01729\3\2\2\2\u0173\u0174\7\6\2\2\u0174\u0175"+
		"\5D#\2\u0175;\3\2\2\2\u0176\u0177\7\31\2\2\u0177\u0178\5D#\2\u0178=\3"+
		"\2\2\2\u0179\u017a\7\21\2\2\u017a\u017b\5D#\2\u017b?\3\2\2\2\u017c\u0195"+
		"\b!\1\2\u017d\u017e\5D#\2\u017e\u017f\7!\2\2\u017f\u0180\5F$\2\u0180\u0196"+
		"\3\2\2\2\u0181\u0182\5F$\2\u0182\u0183\7!\2\2\u0183\u0184\5D#\2\u0184"+
		"\u0196\3\2\2\2\u0185\u0186\5D#\2\u0186\u0187\t\5\2\2\u0187\u0188\5D#\2"+
		"\u0188\u0196\3\2\2\2\u0189\u018a\5D#\2\u018a\u018b\t\5\2\2\u018b\u018c"+
		"\5\20\t\2\u018c\u0196\3\2\2\2\u018d\u018e\5\20\t\2\u018e\u018f\t\5\2\2"+
		"\u018f\u0190\5D#\2\u0190\u0196\3\2\2\2\u0191\u0192\5\20\t\2\u0192\u0193"+
		"\t\5\2\2\u0193\u0194\5\20\t\2\u0194\u0196\3\2\2\2\u0195\u017d\3\2\2\2"+
		"\u0195\u0181\3\2\2\2\u0195\u0185\3\2\2\2\u0195\u0189\3\2\2\2\u0195\u018d"+
		"\3\2\2\2\u0195\u0191\3\2\2\2\u0196\u01a2\3\2\2\2\u0197\u0198\5D#\2\u0198"+
		"\u0199\7!\2\2\u0199\u019a\5H%\2\u019a\u01a2\3\2\2\2\u019b\u019c\5H%\2"+
		"\u019c\u019d\7!\2\2\u019d\u019e\5D#\2\u019e\u01a2\3\2\2\2\u019f\u01a2"+
		"\5D#\2\u01a0\u01a2\5H%\2\u01a1\u017c\3\2\2\2\u01a1\u0197\3\2\2\2\u01a1"+
		"\u019b\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a8\3\2"+
		"\2\2\u01a3\u01a4\f\7\2\2\u01a4\u01a5\t\6\2\2\u01a5\u01a7\5@!\b\u01a6\u01a3"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"A\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\36\2\2\u01ac\u01ad\7\r\2\2"+
		"\u01ad\u01ae\5\20\t\2\u01ae\u01af\7\37\2\2\u01af\u01b0\5\20\t\2\u01b0"+
		"\u01b1\7\16\2\2\u01b1C\3\2\2\2\u01b2\u01b5\7.\2\2\u01b3\u01b5\5J&\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5E\3\2\2\2\u01b6\u01b7\7\b\2\2"+
		"\u01b7G\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9I\3\2\2\2\u01ba\u01bb\7\33\2\2"+
		"\u01bb\u01bc\7 \2\2\u01bc\u01bd\7.\2\2\u01bdK\3\2\2\2&Sbmy\u0081\u008d"+
		"\u0095\u0097\u00a0\u00a7\u00b2\u00b7\u00bd\u00c2\u00c9\u00cf\u00d4\u00dc"+
		"\u00e0\u00ea\u00f6\u00ff\u010c\u0114\u0118\u011e\u012a\u013d\u0149\u0157"+
		"\u015f\u016e\u0195\u01a1\u01a8\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}