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
		PAREN_RIGHT=11, SQUARE_LEFT=12, SQUARE_RIGHT=13, KEYWORD_INPUT=14, KEYWORD_INT=15, 
		KEYWORD_IF=16, KEYWORD_ELSE=17, KEYWORD_ELSEIF=18, KEYWORD_WHILE=19, KEYWORD_FOR=20, 
		KEYWORD_LOCATION=21, KEYWORD_SETUP=22, KEYWORD_PLAYER=23, KEYWORD_LOCATIONARRAY=24, 
		KEYWORD_LOCATIONS=25, KEYWORD_CHOICE=26, COMMA_SEPERATOR=27, BOOL_CMP_OPERATOR=28, 
		CMP_OPERATOR=29, ASSIGN_OPERATOR=30, COMPOUND_OPERATOR=31, TIMES_OPERATOR=32, 
		DIVISION_OPERATOR=33, PLUS_OPERATOR=34, MINUS_OPERATOR=35, ARROW_OPERATOR=36, 
		AND_OPERATOR=37, OR_OPERATOR=38, BOOL=39, NUM=40, VAR_NAME=41;
	public static final int
		RULE_prog = 0, RULE_buffernode = 1, RULE_setup = 2, RULE_locationsetup = 3, 
		RULE_locationmapping = 4, RULE_playersetup = 5, RULE_inBlock = 6, RULE_expression = 7, 
		RULE_statement = 8, RULE_assign = 9, RULE_declaration = 10, RULE_text_statement = 11, 
		RULE_input_statement = 12, RULE_if_chain_statement = 13, RULE_if_statement = 14, 
		RULE_else_if_statement = 15, RULE_else_statement = 16, RULE_travel_statement = 17, 
		RULE_choice_statement = 18, RULE_option_statment = 19, RULE_while_statement = 20, 
		RULE_int_assign = 21, RULE_string_assign = 22, RULE_input_assign = 23, 
		RULE_location_assign = 24, RULE_int_declaration = 25, RULE_string_declaration = 26, 
		RULE_location_declaration = 27, RULE_predicate = 28, RULE_variable = 29, 
		RULE_string_obj = 30, RULE_bool_obj = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "buffernode", "setup", "locationsetup", "locationmapping", "playersetup", 
			"inBlock", "expression", "statement", "assign", "declaration", "text_statement", 
			"input_statement", "if_chain_statement", "if_statement", "else_if_statement", 
			"else_statement", "travel_statement", "choice_statement", "option_statment", 
			"while_statement", "int_assign", "string_assign", "input_assign", "location_assign", 
			"int_declaration", "string_declaration", "location_declaration", "predicate", 
			"variable", "string_obj", "bool_obj"
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
			setState(64);
			buffernode();
			setState(65);
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
			setState(67);
			setup();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
				{
				{
				setState(68);
				inBlock();
				}
				}
				setState(73);
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
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public LocationsetupContext locationsetup() {
			return getRuleContext(LocationsetupContext.class,0);
		}
		public PlayersetupContext playersetup() {
			return getRuleContext(PlayersetupContext.class,0);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(KEYWORD_SETUP);
			setState(75);
			match(CURLY_LEFT);
			{
			setState(76);
			locationsetup();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_PLAYER) {
				{
				setState(77);
				playersetup();
				}
			}

			}
			setState(80);
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
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
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
			setState(82);
			match(KEYWORD_LOCATIONS);
			setState(83);
			match(ASSIGN_OPERATOR);
			setState(84);
			match(CURLY_LEFT);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				locationmapping();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR_NAME );
			setState(90);
			match(CURLY_RIGHT);
			setState(91);
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
			setState(93);
			variable();
			setState(94);
			match(ARROW_OPERATOR);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					variable();
					setState(96);
					match(COMMA_SEPERATOR);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(103);
			variable();
			setState(104);
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
			setState(106);
			match(KEYWORD_PLAYER);
			setState(107);
			match(CURLY_LEFT);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				assign();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_STRING) | (1L << KEYWORD_INT) | (1L << KEYWORD_LOCATION) | (1L << VAR_NAME))) != 0) );
			setState(113);
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_LEFT:
				{
				setState(122);
				match(PAREN_LEFT);
				setState(123);
				expression(0);
				setState(124);
				match(PAREN_RIGHT);
				}
				break;
			case VAR_NAME:
				{
				setState(126);
				variable();
				}
				break;
			case NUM:
				{
				setState(127);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(131);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(134);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				text_statement();
				}
				break;
			case KEYWORD_INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				input_statement();
				}
				break;
			case KEYWORD_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				if_chain_statement();
				}
				break;
			case TRAVEL_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				travel_statement();
				}
				break;
			case KEYWORD_CHOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				choice_statement();
				}
				break;
			case KEYWORD_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				int_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				string_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				input_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
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
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				int_declaration();
				setState(156);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				string_declaration();
				setState(159);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				location_declaration();
				setState(162);
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
			setState(166);
			match(KEYWORD_TEXT);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(167);
						string_obj();
						}
						break;
					case VAR_NAME:
						{
						setState(168);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(178);
				string_obj();
				}
				break;
			case VAR_NAME:
				{
				setState(179);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
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
			setState(184);
			match(KEYWORD_INPUT);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(185);
						string_obj();
						}
						break;
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
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(196);
				string_obj();
				}
				break;
			case VAR_NAME:
				{
				setState(197);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200);
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
			setState(202);
			if_statement();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_ELSEIF) {
				{
				{
				setState(203);
				else_if_statement();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ELSE) {
				{
				setState(209);
				else_statement();
				}
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
			setState(214);
			match(KEYWORD_IF);
			setState(215);
			match(PAREN_LEFT);
			setState(216);
			predicate(0);
			setState(217);
			match(PAREN_RIGHT);
			setState(218);
			match(CURLY_LEFT);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				inBlock();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(224);
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
			setState(226);
			match(KEYWORD_ELSEIF);
			setState(227);
			match(PAREN_LEFT);
			setState(228);
			predicate(0);
			setState(229);
			match(PAREN_RIGHT);
			setState(230);
			match(CURLY_LEFT);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				inBlock();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(236);
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
			setState(238);
			match(KEYWORD_ELSE);
			setState(239);
			match(CURLY_LEFT);
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				inBlock();
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(245);
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
			setState(247);
			match(TRAVEL_KEYWORD);
			setState(248);
			variable();
			setState(249);
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
			setState(251);
			match(KEYWORD_CHOICE);
			setState(252);
			match(CURLY_LEFT);
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				option_statment();
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==VAR_NAME );
			setState(258);
			match(CURLY_RIGHT);
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
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(261);
				variable();
				}
				break;
			case STRING:
				{
				setState(262);
				string_obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
			match(CURLY_LEFT);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				inBlock();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(271);
			match(CURLY_RIGHT);
			setState(272);
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
			setState(274);
			match(KEYWORD_WHILE);
			setState(275);
			match(PAREN_LEFT);
			setState(276);
			predicate(0);
			setState(277);
			match(PAREN_RIGHT);
			setState(278);
			match(CURLY_LEFT);
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				inBlock();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(284);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(286);
				variable();
				setState(287);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OPERATOR || _la==COMPOUND_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
				expression(0);
				setState(289);
				match(END_STMT);
				}
				break;
			case 2:
				{
				setState(291);
				int_declaration();
				setState(292);
				match(ASSIGN_OPERATOR);
				setState(293);
				expression(0);
				setState(294);
				match(END_STMT);
				}
				break;
			case 3:
				{
				setState(296);
				int_declaration();
				setState(297);
				match(ASSIGN_OPERATOR);
				setState(298);
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
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(302);
				variable();
				setState(303);
				match(ASSIGN_OPERATOR);
				setState(304);
				string_obj();
				setState(305);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				{
				setState(307);
				string_declaration();
				setState(308);
				match(ASSIGN_OPERATOR);
				setState(309);
				string_obj();
				setState(310);
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
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(314);
				variable();
				setState(315);
				match(ASSIGN_OPERATOR);
				setState(316);
				input_statement();
				}
				break;
			case KEYWORD_STRING:
				{
				setState(318);
				string_declaration();
				setState(319);
				match(ASSIGN_OPERATOR);
				setState(320);
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
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(324);
				variable();
				setState(325);
				match(ASSIGN_OPERATOR);
				setState(326);
				match(CURLY_LEFT);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(327);
					inBlock();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333);
				match(CURLY_RIGHT);
				setState(334);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				{
				setState(336);
				location_declaration();
				setState(337);
				match(ASSIGN_OPERATOR);
				setState(338);
				match(CURLY_LEFT);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(339);
					inBlock();
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				match(CURLY_RIGHT);
				setState(346);
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
		enterRule(_localctx, 50, RULE_int_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(KEYWORD_INT);
			setState(351);
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
		enterRule(_localctx, 52, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(KEYWORD_STRING);
			setState(354);
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
		enterRule(_localctx, 54, RULE_location_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(KEYWORD_LOCATION);
			setState(357);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(360);
					variable();
					setState(361);
					match(BOOL_CMP_OPERATOR);
					setState(362);
					string_obj();
					}
					break;
				case 2:
					{
					setState(364);
					string_obj();
					setState(365);
					match(BOOL_CMP_OPERATOR);
					setState(366);
					variable();
					}
					break;
				case 3:
					{
					setState(368);
					variable();
					setState(369);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(370);
					variable();
					}
					break;
				case 4:
					{
					setState(372);
					variable();
					setState(373);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(374);
					expression(0);
					}
					break;
				case 5:
					{
					setState(376);
					expression(0);
					setState(377);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(378);
					variable();
					}
					break;
				case 6:
					{
					setState(380);
					expression(0);
					setState(381);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(382);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(386);
				variable();
				setState(387);
				match(BOOL_CMP_OPERATOR);
				setState(388);
				bool_obj();
				}
				break;
			case 3:
				{
				setState(390);
				bool_obj();
				setState(391);
				match(BOOL_CMP_OPERATOR);
				setState(392);
				variable();
				}
				break;
			case 4:
				{
				setState(394);
				variable();
				}
				break;
			case 5:
				{
				setState(395);
				bool_obj();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
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
					setState(398);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(399);
					_la = _input.LA(1);
					if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(400);
					predicate(6);
					}
					} 
				}
				setState(405);
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
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
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

	public static class String_objContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BetterAdvGmParser.STRING, 0); }
		public String_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_obj; }
	}

	public final String_objContext string_obj() throws RecognitionException {
		String_objContext _localctx = new String_objContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
		enterRule(_localctx, 62, RULE_bool_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 28:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u019f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\3\4\3\4\5\4Q\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5Y\n\5\r\5\16\5Z\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7p\n\7\r\7"+
		"\16\7q\3\7\3\7\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0083\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13\3\13\3\13\5\13\u009c"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\3\r\3\r\5"+
		"\r\u00ac\n\r\3\r\3\r\7\r\u00b0\n\r\f\r\16\r\u00b3\13\r\3\r\3\r\5\r\u00b7"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00be\n\16\3\16\3\16\7\16\u00c2\n\16"+
		"\f\16\16\16\u00c5\13\16\3\16\3\16\5\16\u00c9\n\16\3\16\3\16\3\17\3\17"+
		"\7\17\u00cf\n\17\f\17\16\17\u00d2\13\17\3\17\5\17\u00d5\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00df\n\20\r\20\16\20\u00e0\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00eb\n\21\r\21\16\21\u00ec\3\21"+
		"\3\21\3\22\3\22\3\22\6\22\u00f4\n\22\r\22\16\22\u00f5\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\6\24\u0101\n\24\r\24\16\24\u0102\3\24\3\24"+
		"\3\24\3\25\3\25\5\25\u010a\n\25\3\25\3\25\6\25\u010e\n\25\r\25\16\25\u010f"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u011b\n\26\r\26\16"+
		"\26\u011c\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u012f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u013b\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0145\n\31\3\32\3\32\3\32\3\32\7\32\u014b\n\32\f\32\16\32\u014e"+
		"\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0157\n\32\f\32\16\32\u015a"+
		"\13\32\3\32\3\32\3\32\5\32\u015f\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u0183\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u018f\n\36\3\36\3\36\3\36\7\36\u0194\n\36\f\36\16\36\u0197\13\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\2\4\20:\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@\2\7\3\2\"#\3\2$%\3\2 !\3\2\36\37\3\2\'(\2\u01b4"+
		"\2B\3\2\2\2\4E\3\2\2\2\6L\3\2\2\2\bT\3\2\2\2\n_\3\2\2\2\fl\3\2\2\2\16"+
		"y\3\2\2\2\20\u0082\3\2\2\2\22\u0095\3\2\2\2\24\u009b\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\u00ba\3\2\2\2\34\u00cc\3\2\2\2\36\u00d8\3"+
		"\2\2\2 \u00e4\3\2\2\2\"\u00f0\3\2\2\2$\u00f9\3\2\2\2&\u00fd\3\2\2\2(\u0109"+
		"\3\2\2\2*\u0114\3\2\2\2,\u012e\3\2\2\2.\u013a\3\2\2\2\60\u0144\3\2\2\2"+
		"\62\u015e\3\2\2\2\64\u0160\3\2\2\2\66\u0163\3\2\2\28\u0166\3\2\2\2:\u018e"+
		"\3\2\2\2<\u0198\3\2\2\2>\u019a\3\2\2\2@\u019c\3\2\2\2BC\5\4\3\2CD\7\2"+
		"\2\3D\3\3\2\2\2EI\5\6\4\2FH\5\16\b\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3"+
		"\2\2\2J\5\3\2\2\2KI\3\2\2\2LM\7\30\2\2MN\7\n\2\2NP\5\b\5\2OQ\5\f\7\2P"+
		"O\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\13\2\2S\7\3\2\2\2TU\7\33\2\2UV\7 \2"+
		"\2VX\7\n\2\2WY\5\n\6\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2"+
		"\2\2\\]\7\13\2\2]^\7\6\2\2^\t\3\2\2\2_`\5<\37\2`f\7&\2\2ab\5<\37\2bc\7"+
		"\35\2\2ce\3\2\2\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf"+
		"\3\2\2\2ij\5<\37\2jk\7\6\2\2k\13\3\2\2\2lm\7\31\2\2mo\7\n\2\2np\5\24\13"+
		"\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\13\2\2t\r\3\2"+
		"\2\2uz\5\22\n\2vz\5\20\t\2wz\5\24\13\2xz\5\26\f\2yu\3\2\2\2yv\3\2\2\2"+
		"yw\3\2\2\2yx\3\2\2\2z\17\3\2\2\2{|\b\t\1\2|}\7\f\2\2}~\5\20\t\2~\177\7"+
		"\r\2\2\177\u0083\3\2\2\2\u0080\u0083\5<\37\2\u0081\u0083\7*\2\2\u0082"+
		"{\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u008c\3\2\2\2"+
		"\u0084\u0085\f\7\2\2\u0085\u0086\t\2\2\2\u0086\u008b\5\20\t\b\u0087\u0088"+
		"\f\6\2\2\u0088\u0089\t\3\2\2\u0089\u008b\5\20\t\7\u008a\u0084\3\2\2\2"+
		"\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\21\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0096\5\30\r\2\u0090"+
		"\u0096\5\32\16\2\u0091\u0096\5\34\17\2\u0092\u0096\5$\23\2\u0093\u0096"+
		"\5&\24\2\u0094\u0096\5*\26\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\23\3\2\2\2\u0097\u009c\5,\27\2\u0098\u009c\5.\30\2\u0099\u009c"+
		"\5\60\31\2\u009a\u009c\5\62\32\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\25\3\2\2\2\u009d\u009e"+
		"\5\64\33\2\u009e\u009f\7\6\2\2\u009f\u00a7\3\2\2\2\u00a0\u00a1\5\66\34"+
		"\2\u00a1\u00a2\7\6\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a4\58\35\2\u00a4\u00a5"+
		"\7\6\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00b1\7\4\2\2\u00a9\u00ac\5> \2"+
		"\u00aa\u00ac\5<\37\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\7$\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\5> \2\u00b5\u00b7\5<\37\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9"+
		"\31\3\2\2\2\u00ba\u00c3\7\20\2\2\u00bb\u00be\5> \2\u00bc\u00be\5<\37\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\7$\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c9\5> \2\u00c7\u00c9\5<\37\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\6\2\2\u00cb\33\3\2\2\2\u00cc"+
		"\u00d0\5\36\20\2\u00cd\u00cf\5 \21\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d5\5\"\22\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\6\2\2\u00d7\35\3\2\2\2\u00d8"+
		"\u00d9\7\22\2\2\u00d9\u00da\7\f\2\2\u00da\u00db\5:\36\2\u00db\u00dc\7"+
		"\r\2\2\u00dc\u00de\7\n\2\2\u00dd\u00df\5\16\b\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e3\7\13\2\2\u00e3\37\3\2\2\2\u00e4\u00e5\7\24\2\2\u00e5"+
		"\u00e6\7\f\2\2\u00e6\u00e7\5:\36\2\u00e7\u00e8\7\r\2\2\u00e8\u00ea\7\n"+
		"\2\2\u00e9\u00eb\5\16\b\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\13"+
		"\2\2\u00ef!\3\2\2\2\u00f0\u00f1\7\23\2\2\u00f1\u00f3\7\n\2\2\u00f2\u00f4"+
		"\5\16\b\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\13\2\2\u00f8#\3"+
		"\2\2\2\u00f9\u00fa\7\b\2\2\u00fa\u00fb\5<\37\2\u00fb\u00fc\7\6\2\2\u00fc"+
		"%\3\2\2\2\u00fd\u00fe\7\34\2\2\u00fe\u0100\7\n\2\2\u00ff\u0101\5(\25\2"+
		"\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\13\2\2\u0105\u0106\7\6\2\2"+
		"\u0106\'\3\2\2\2\u0107\u010a\5<\37\2\u0108\u010a\5> \2\u0109\u0107\3\2"+
		"\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\7\n\2\2\u010c"+
		"\u010e\5\16\b\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\13\2\2\u0112"+
		"\u0113\7\6\2\2\u0113)\3\2\2\2\u0114\u0115\7\25\2\2\u0115\u0116\7\f\2\2"+
		"\u0116\u0117\5:\36\2\u0117\u0118\7\r\2\2\u0118\u011a\7\n\2\2\u0119\u011b"+
		"\5\16\b\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\13\2\2\u011f+\3"+
		"\2\2\2\u0120\u0121\5<\37\2\u0121\u0122\t\4\2\2\u0122\u0123\5\20\t\2\u0123"+
		"\u0124\7\6\2\2\u0124\u012f\3\2\2\2\u0125\u0126\5\64\33\2\u0126\u0127\7"+
		" \2\2\u0127\u0128\5\20\t\2\u0128\u0129\7\6\2\2\u0129\u012f\3\2\2\2\u012a"+
		"\u012b\5\64\33\2\u012b\u012c\7 \2\2\u012c\u012d\5\32\16\2\u012d\u012f"+
		"\3\2\2\2\u012e\u0120\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u012a\3\2\2\2\u012f"+
		"-\3\2\2\2\u0130\u0131\5<\37\2\u0131\u0132\7 \2\2\u0132\u0133\5> \2\u0133"+
		"\u0134\7\6\2\2\u0134\u013b\3\2\2\2\u0135\u0136\5\66\34\2\u0136\u0137\7"+
		" \2\2\u0137\u0138\5> \2\u0138\u0139\7\6\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0130\3\2\2\2\u013a\u0135\3\2\2\2\u013b/\3\2\2\2\u013c\u013d\5<\37\2"+
		"\u013d\u013e\7 \2\2\u013e\u013f\5\32\16\2\u013f\u0145\3\2\2\2\u0140\u0141"+
		"\5\66\34\2\u0141\u0142\7 \2\2\u0142\u0143\5\32\16\2\u0143\u0145\3\2\2"+
		"\2\u0144\u013c\3\2\2\2\u0144\u0140\3\2\2\2\u0145\61\3\2\2\2\u0146\u0147"+
		"\5<\37\2\u0147\u0148\7 \2\2\u0148\u014c\7\n\2\2\u0149\u014b\5\16\b\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\13\2\2\u0150"+
		"\u0151\7\6\2\2\u0151\u015f\3\2\2\2\u0152\u0153\58\35\2\u0153\u0154\7 "+
		"\2\2\u0154\u0158\7\n\2\2\u0155\u0157\5\16\b\2\u0156\u0155\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\13\2\2\u015c\u015d\7\6\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0146\3\2\2\2\u015e\u0152\3\2\2\2\u015f\63\3\2\2"+
		"\2\u0160\u0161\7\21\2\2\u0161\u0162\5<\37\2\u0162\65\3\2\2\2\u0163\u0164"+
		"\7\5\2\2\u0164\u0165\5<\37\2\u0165\67\3\2\2\2\u0166\u0167\7\27\2\2\u0167"+
		"\u0168\5<\37\2\u01689\3\2\2\2\u0169\u0182\b\36\1\2\u016a\u016b\5<\37\2"+
		"\u016b\u016c\7\36\2\2\u016c\u016d\5> \2\u016d\u0183\3\2\2\2\u016e\u016f"+
		"\5> \2\u016f\u0170\7\36\2\2\u0170\u0171\5<\37\2\u0171\u0183\3\2\2\2\u0172"+
		"\u0173\5<\37\2\u0173\u0174\t\5\2\2\u0174\u0175\5<\37\2\u0175\u0183\3\2"+
		"\2\2\u0176\u0177\5<\37\2\u0177\u0178\t\5\2\2\u0178\u0179\5\20\t\2\u0179"+
		"\u0183\3\2\2\2\u017a\u017b\5\20\t\2\u017b\u017c\t\5\2\2\u017c\u017d\5"+
		"<\37\2\u017d\u0183\3\2\2\2\u017e\u017f\5\20\t\2\u017f\u0180\t\5\2\2\u0180"+
		"\u0181\5\20\t\2\u0181\u0183\3\2\2\2\u0182\u016a\3\2\2\2\u0182\u016e\3"+
		"\2\2\2\u0182\u0172\3\2\2\2\u0182\u0176\3\2\2\2\u0182\u017a\3\2\2\2\u0182"+
		"\u017e\3\2\2\2\u0183\u018f\3\2\2\2\u0184\u0185\5<\37\2\u0185\u0186\7\36"+
		"\2\2\u0186\u0187\5@!\2\u0187\u018f\3\2\2\2\u0188\u0189\5@!\2\u0189\u018a"+
		"\7\36\2\2\u018a\u018b\5<\37\2\u018b\u018f\3\2\2\2\u018c\u018f\5<\37\2"+
		"\u018d\u018f\5@!\2\u018e\u0169\3\2\2\2\u018e\u0184\3\2\2\2\u018e\u0188"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0195\3\2\2\2\u0190"+
		"\u0191\f\7\2\2\u0191\u0192\t\6\2\2\u0192\u0194\5:\36\b\u0193\u0190\3\2"+
		"\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		";\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7+\2\2\u0199=\3\2\2\2\u019a"+
		"\u019b\7\7\2\2\u019b?\3\2\2\2\u019c\u019d\7)\2\2\u019dA\3\2\2\2&IPZfq"+
		"y\u0082\u008a\u008c\u0095\u009b\u00a6\u00ab\u00b1\u00b6\u00bd\u00c3\u00c8"+
		"\u00d0\u00d4\u00e0\u00ec\u00f5\u0102\u0109\u010f\u011c\u012e\u013a\u0144"+
		"\u014c\u0158\u015e\u0182\u018e\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}