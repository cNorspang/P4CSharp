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
		KEYWORD_LOCATION=21, KEYWORD_SETUP=22, KEYWORD_LOCATIONARRAY=23, KEYWORD_LOCATIONS=24, 
		KEYWORD_CHOICE=25, COMMA_SEPERATOR=26, BOOL_CMP_OPERATOR=27, CMP_OPERATOR=28, 
		ASSIGN_OPERATOR=29, COMPOUND_OPERATOR=30, TIMES_OPERATOR=31, DIVISION_OPERATOR=32, 
		PLUS_OPERATOR=33, MINUS_OPERATOR=34, ARROW_OPERATOR=35, AND_OPERATOR=36, 
		OR_OPERATOR=37, BOOL=38, NUM=39, VAR_NAME=40;
	public static final int
		RULE_prog = 0, RULE_buffernode = 1, RULE_setup = 2, RULE_locationsetup = 3, 
		RULE_locationmapping = 4, RULE_inBlock = 5, RULE_expression = 6, RULE_statement = 7, 
		RULE_assign = 8, RULE_declaration = 9, RULE_text_statement = 10, RULE_input_statement = 11, 
		RULE_if_chain_statement = 12, RULE_if_statement = 13, RULE_else_if_statement = 14, 
		RULE_else_statement = 15, RULE_travel_statement = 16, RULE_choice_statement = 17, 
		RULE_option_statment = 18, RULE_int_assign = 19, RULE_string_assign = 20, 
		RULE_input_assign = 21, RULE_location_assign = 22, RULE_int_declaration = 23, 
		RULE_string_declaration = 24, RULE_location_declaration = 25, RULE_predicate = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "buffernode", "setup", "locationsetup", "locationmapping", "inBlock", 
			"expression", "statement", "assign", "declaration", "text_statement", 
			"input_statement", "if_chain_statement", "if_statement", "else_if_statement", 
			"else_statement", "travel_statement", "choice_statement", "option_statment", 
			"int_assign", "string_assign", "input_assign", "location_assign", "int_declaration", 
			"string_declaration", "location_declaration", "predicate"
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
			setState(54);
			buffernode();
			setState(55);
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
			setState(57);
			setup();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
				{
				{
				setState(58);
				inBlock();
				}
				}
				setState(63);
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
			setState(64);
			match(KEYWORD_SETUP);
			setState(65);
			match(CURLY_LEFT);
			{
			setState(66);
			locationsetup();
			}
			setState(67);
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
			setState(69);
			match(KEYWORD_LOCATIONS);
			setState(70);
			match(ASSIGN_OPERATOR);
			setState(71);
			match(CURLY_LEFT);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				locationmapping();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR_NAME );
			setState(77);
			match(CURLY_RIGHT);
			setState(78);
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
		public List<TerminalNode> VAR_NAME() { return getTokens(BetterAdvGmParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(BetterAdvGmParser.VAR_NAME, i);
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
			setState(80);
			match(VAR_NAME);
			setState(81);
			match(ARROW_OPERATOR);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(VAR_NAME);
					setState(83);
					match(COMMA_SEPERATOR);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(89);
			match(VAR_NAME);
			setState(90);
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
		enterRule(_localctx, 10, RULE_inBlock);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
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
		public List<TerminalNode> VAR_NAME() { return getTokens(BetterAdvGmParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(BetterAdvGmParser.VAR_NAME, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES_OPERATOR() { return getToken(BetterAdvGmParser.TIMES_OPERATOR, 0); }
		public TerminalNode DIVISION_OPERATOR() { return getToken(BetterAdvGmParser.DIVISION_OPERATOR, 0); }
		public TerminalNode PLUS_OPERATOR() { return getToken(BetterAdvGmParser.PLUS_OPERATOR, 0); }
		public TerminalNode MINUS_OPERATOR() { return getToken(BetterAdvGmParser.MINUS_OPERATOR, 0); }
		public TerminalNode NUM() { return getToken(BetterAdvGmParser.NUM, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(99);
				match(VAR_NAME);
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				expression(7);
				}
				break;
			case 2:
				{
				setState(102);
				match(VAR_NAME);
				setState(103);
				_la = _input.LA(1);
				if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(104);
				expression(6);
				}
				break;
			case 3:
				{
				setState(105);
				match(VAR_NAME);
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				match(VAR_NAME);
				}
				break;
			case 4:
				{
				setState(108);
				match(VAR_NAME);
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				match(VAR_NAME);
				}
				break;
			case 5:
				{
				setState(111);
				match(NUM);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(115);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(118);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						match(VAR_NAME);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(124);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						match(VAR_NAME);
						}
						break;
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Travel_statementContext travel_statement() {
			return getRuleContext(Travel_statementContext.class,0);
		}
		public Choice_statementContext choice_statement() {
			return getRuleContext(Choice_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				text_statement();
				}
				break;
			case KEYWORD_INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				input_statement();
				}
				break;
			case KEYWORD_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				if_statement();
				}
				break;
			case TRAVEL_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				travel_statement();
				}
				break;
			case KEYWORD_CHOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				choice_statement();
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
		enterRule(_localctx, 16, RULE_assign);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				int_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				string_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				input_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
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
		enterRule(_localctx, 18, RULE_declaration);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				int_declaration();
				setState(145);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				string_declaration();
				setState(148);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				location_declaration();
				setState(151);
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
		public List<TerminalNode> STRING() { return getTokens(BetterAdvGmParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BetterAdvGmParser.STRING, i);
		}
		public List<TerminalNode> VAR_NAME() { return getTokens(BetterAdvGmParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(BetterAdvGmParser.VAR_NAME, i);
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
		enterRule(_localctx, 20, RULE_text_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(KEYWORD_TEXT);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==VAR_NAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(157);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==VAR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
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
		public List<TerminalNode> STRING() { return getTokens(BetterAdvGmParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BetterAdvGmParser.STRING, i);
		}
		public List<TerminalNode> VAR_NAME() { return getTokens(BetterAdvGmParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(BetterAdvGmParser.VAR_NAME, i);
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
		enterRule(_localctx, 22, RULE_input_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(KEYWORD_INPUT);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==VAR_NAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(168);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==VAR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(175);
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
		enterRule(_localctx, 24, RULE_if_chain_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			if_statement();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_ELSEIF) {
				{
				{
				setState(178);
				else_if_statement();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ELSE) {
				{
				setState(184);
				else_statement();
				}
			}

			setState(187);
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
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(KEYWORD_IF);
			setState(190);
			match(PAREN_LEFT);
			setState(191);
			predicate(0);
			setState(192);
			match(PAREN_RIGHT);
			setState(193);
			match(CURLY_LEFT);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				inBlock();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(199);
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
		enterRule(_localctx, 28, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(KEYWORD_ELSEIF);
			setState(202);
			match(PAREN_LEFT);
			setState(203);
			predicate(0);
			setState(204);
			match(PAREN_RIGHT);
			setState(205);
			match(CURLY_LEFT);
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				inBlock();
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(211);
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
		public InBlockContext inBlock() {
			return getRuleContext(InBlockContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(KEYWORD_ELSE);
			setState(214);
			match(CURLY_LEFT);
			setState(215);
			inBlock();
			setState(216);
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
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public Travel_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travel_statement; }
	}

	public final Travel_statementContext travel_statement() throws RecognitionException {
		Travel_statementContext _localctx = new Travel_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_travel_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(TRAVEL_KEYWORD);
			setState(219);
			match(VAR_NAME);
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
		enterRule(_localctx, 34, RULE_choice_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(KEYWORD_CHOICE);
			setState(223);
			match(CURLY_LEFT);
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				option_statment();
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==VAR_NAME );
			setState(229);
			match(CURLY_RIGHT);
			setState(230);
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
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public TerminalNode STRING() { return getToken(BetterAdvGmParser.STRING, 0); }
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
		enterRule(_localctx, 36, RULE_option_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==VAR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(233);
			match(CURLY_LEFT);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				inBlock();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(239);
			match(CURLY_RIGHT);
			setState(240);
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
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
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
		enterRule(_localctx, 38, RULE_int_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(242);
				match(VAR_NAME);
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OPERATOR || _la==COMPOUND_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				expression(0);
				setState(245);
				match(END_STMT);
				}
				break;
			case 2:
				{
				setState(247);
				int_declaration();
				setState(248);
				match(ASSIGN_OPERATOR);
				setState(249);
				expression(0);
				setState(250);
				match(END_STMT);
				}
				break;
			case 3:
				{
				setState(252);
				int_declaration();
				setState(253);
				match(ASSIGN_OPERATOR);
				setState(254);
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
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(BetterAdvGmParser.ASSIGN_OPERATOR, 0); }
		public TerminalNode STRING() { return getToken(BetterAdvGmParser.STRING, 0); }
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
		enterRule(_localctx, 40, RULE_string_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(258);
				match(VAR_NAME);
				setState(259);
				match(ASSIGN_OPERATOR);
				setState(260);
				match(STRING);
				setState(261);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				{
				setState(262);
				string_declaration();
				setState(263);
				match(ASSIGN_OPERATOR);
				setState(264);
				match(STRING);
				setState(265);
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
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
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
		enterRule(_localctx, 42, RULE_input_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(269);
				match(VAR_NAME);
				setState(270);
				match(ASSIGN_OPERATOR);
				setState(271);
				input_statement();
				}
				break;
			case KEYWORD_STRING:
				{
				setState(272);
				string_declaration();
				setState(273);
				match(ASSIGN_OPERATOR);
				setState(274);
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
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
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
		enterRule(_localctx, 44, RULE_location_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(278);
				match(VAR_NAME);
				setState(279);
				match(ASSIGN_OPERATOR);
				setState(280);
				match(CURLY_LEFT);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(281);
					inBlock();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				match(CURLY_RIGHT);
				setState(288);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				{
				setState(289);
				location_declaration();
				setState(290);
				match(ASSIGN_OPERATOR);
				setState(291);
				match(CURLY_LEFT);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(292);
					inBlock();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				match(CURLY_RIGHT);
				setState(299);
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
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public Int_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_declaration; }
	}

	public final Int_declarationContext int_declaration() throws RecognitionException {
		Int_declarationContext _localctx = new Int_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_int_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(KEYWORD_INT);
			setState(304);
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

	public static class String_declarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_STRING() { return getToken(BetterAdvGmParser.KEYWORD_STRING, 0); }
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(KEYWORD_STRING);
			setState(307);
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

	public static class Location_declarationContext extends ParserRuleContext {
		public TerminalNode KEYWORD_LOCATION() { return getToken(BetterAdvGmParser.KEYWORD_LOCATION, 0); }
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public Location_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_declaration; }
	}

	public final Location_declarationContext location_declaration() throws RecognitionException {
		Location_declarationContext _localctx = new Location_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_location_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(KEYWORD_LOCATION);
			setState(310);
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

	public static class PredicateContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(BetterAdvGmParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(BetterAdvGmParser.VAR_NAME, i);
		}
		public TerminalNode BOOL_CMP_OPERATOR() { return getToken(BetterAdvGmParser.BOOL_CMP_OPERATOR, 0); }
		public TerminalNode STRING() { return getToken(BetterAdvGmParser.STRING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CMP_OPERATOR() { return getToken(BetterAdvGmParser.CMP_OPERATOR, 0); }
		public TerminalNode BOOL() { return getToken(BetterAdvGmParser.BOOL, 0); }
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(313);
					match(VAR_NAME);
					setState(314);
					match(BOOL_CMP_OPERATOR);
					setState(315);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(316);
					match(STRING);
					setState(317);
					match(BOOL_CMP_OPERATOR);
					setState(318);
					match(VAR_NAME);
					}
					break;
				case 3:
					{
					setState(319);
					match(VAR_NAME);
					setState(320);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(321);
					match(VAR_NAME);
					}
					break;
				case 4:
					{
					setState(322);
					match(VAR_NAME);
					setState(323);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(324);
					expression(0);
					}
					break;
				case 5:
					{
					setState(325);
					expression(0);
					setState(326);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(327);
					match(VAR_NAME);
					}
					break;
				case 6:
					{
					setState(329);
					expression(0);
					setState(330);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(331);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(335);
				match(VAR_NAME);
				setState(336);
				match(BOOL_CMP_OPERATOR);
				setState(337);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(338);
				match(BOOL);
				setState(339);
				match(BOOL_CMP_OPERATOR);
				setState(340);
				match(VAR_NAME);
				}
				break;
			case 4:
				{
				setState(341);
				match(VAR_NAME);
				}
				break;
			case 5:
				{
				setState(342);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PredicateContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_predicate);
					setState(345);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(346);
					_la = _input.LA(1);
					if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(347);
					predicate(6);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 26:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\7\3>\n\3\f\3\16\3A"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5L\n\5\r\5\16\5M\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\5\7c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"s\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n\b\f"+
		"\b\16\b\u0084\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\5"+
		"\n\u0091\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n"+
		"\13\3\f\3\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\r\3\r\3\r\3\16\3\16\7\16\u00b6"+
		"\n\16\f\16\16\16\u00b9\13\16\3\16\5\16\u00bc\n\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\6\17\u00c6\n\17\r\17\16\17\u00c7\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\6\20\u00d2\n\20\r\20\16\20\u00d3\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\6\23\u00e4\n\23"+
		"\r\23\16\23\u00e5\3\23\3\23\3\23\3\24\3\24\3\24\6\24\u00ee\n\24\r\24\16"+
		"\24\u00ef\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0103\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u010e\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0117\n\27\3\30\3\30\3\30\3\30\7\30\u011d\n\30\f\30\16\30\u0120\13\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0128\n\30\f\30\16\30\u012b\13\30"+
		"\3\30\3\30\3\30\5\30\u0130\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0150\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u015a\n\34\3\34\3\34\3\34\7\34\u015f\n"+
		"\34\f\34\16\34\u0162\13\34\3\34\2\4\16\66\35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\b\3\2!\"\3\2#$\4\2\7\7**\3\2\37 \3"+
		"\2\35\36\3\2&\'\2\u0178\28\3\2\2\2\4;\3\2\2\2\6B\3\2\2\2\bG\3\2\2\2\n"+
		"R\3\2\2\2\fb\3\2\2\2\16r\3\2\2\2\20\u008a\3\2\2\2\22\u0090\3\2\2\2\24"+
		"\u009b\3\2\2\2\26\u009d\3\2\2\2\30\u00a8\3\2\2\2\32\u00b3\3\2\2\2\34\u00bf"+
		"\3\2\2\2\36\u00cb\3\2\2\2 \u00d7\3\2\2\2\"\u00dc\3\2\2\2$\u00e0\3\2\2"+
		"\2&\u00ea\3\2\2\2(\u0102\3\2\2\2*\u010d\3\2\2\2,\u0116\3\2\2\2.\u012f"+
		"\3\2\2\2\60\u0131\3\2\2\2\62\u0134\3\2\2\2\64\u0137\3\2\2\2\66\u0159\3"+
		"\2\2\289\5\4\3\29:\7\2\2\3:\3\3\2\2\2;?\5\6\4\2<>\5\f\7\2=<\3\2\2\2>A"+
		"\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\7\30\2\2CD\7\n\2\2"+
		"DE\5\b\5\2EF\7\13\2\2F\7\3\2\2\2GH\7\32\2\2HI\7\37\2\2IK\7\n\2\2JL\5\n"+
		"\6\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\13\2\2PQ\7"+
		"\6\2\2Q\t\3\2\2\2RS\7*\2\2SX\7%\2\2TU\7*\2\2UW\7\34\2\2VT\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7*\2\2\\]\7\6\2\2]\13"+
		"\3\2\2\2^c\5\20\t\2_c\5\16\b\2`c\5\22\n\2ac\5\24\13\2b^\3\2\2\2b_\3\2"+
		"\2\2b`\3\2\2\2ba\3\2\2\2c\r\3\2\2\2de\b\b\1\2ef\7*\2\2fg\t\2\2\2gs\5\16"+
		"\b\thi\7*\2\2ij\t\3\2\2js\5\16\b\bkl\7*\2\2lm\t\2\2\2ms\7*\2\2no\7*\2"+
		"\2op\t\3\2\2ps\7*\2\2qs\7)\2\2rd\3\2\2\2rh\3\2\2\2rk\3\2\2\2rn\3\2\2\2"+
		"rq\3\2\2\2s\u0082\3\2\2\2tu\f\13\2\2uv\t\2\2\2v\u0081\5\16\b\fwx\f\n\2"+
		"\2xy\t\3\2\2y\u0081\5\16\b\13z{\f\7\2\2{|\t\2\2\2|\u0081\7*\2\2}~\f\6"+
		"\2\2~\177\t\3\2\2\177\u0081\7*\2\2\u0080t\3\2\2\2\u0080w\3\2\2\2\u0080"+
		"z\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008b\5\26\f"+
		"\2\u0086\u008b\5\30\r\2\u0087\u008b\5\34\17\2\u0088\u008b\5\"\22\2\u0089"+
		"\u008b\5$\23\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\21\3\2\2\2\u008c\u0091"+
		"\5(\25\2\u008d\u0091\5*\26\2\u008e\u0091\5,\27\2\u008f\u0091\5.\30\2\u0090"+
		"\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\23\3\2\2\2\u0092\u0093\5\60\31\2\u0093\u0094\7\6\2\2\u0094"+
		"\u009c\3\2\2\2\u0095\u0096\5\62\32\2\u0096\u0097\7\6\2\2\u0097\u009c\3"+
		"\2\2\2\u0098\u0099\5\64\33\2\u0099\u009a\7\6\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0092\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\25\3\2\2"+
		"\2\u009d\u00a2\7\4\2\2\u009e\u009f\t\4\2\2\u009f\u00a1\7#\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6\u00a7\7\6"+
		"\2\2\u00a7\27\3\2\2\2\u00a8\u00ad\7\20\2\2\u00a9\u00aa\t\4\2\2\u00aa\u00ac"+
		"\7#\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\t\4"+
		"\2\2\u00b1\u00b2\7\6\2\2\u00b2\31\3\2\2\2\u00b3\u00b7\5\34\17\2\u00b4"+
		"\u00b6\5\36\20\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bc\5 \21\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\7\6\2\2\u00be\33\3\2\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1"+
		"\7\f\2\2\u00c1\u00c2\5\66\34\2\u00c2\u00c3\7\r\2\2\u00c3\u00c5\7\n\2\2"+
		"\u00c4\u00c6\5\f\7\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\13\2\2"+
		"\u00ca\35\3\2\2\2\u00cb\u00cc\7\24\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce"+
		"\5\66\34\2\u00ce\u00cf\7\r\2\2\u00cf\u00d1\7\n\2\2\u00d0\u00d2\5\f\7\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\13\2\2\u00d6\37\3\2\2\2\u00d7"+
		"\u00d8\7\23\2\2\u00d8\u00d9\7\n\2\2\u00d9\u00da\5\f\7\2\u00da\u00db\7"+
		"\13\2\2\u00db!\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\7*\2\2\u00de\u00df"+
		"\7\6\2\2\u00df#\3\2\2\2\u00e0\u00e1\7\33\2\2\u00e1\u00e3\7\n\2\2\u00e2"+
		"\u00e4\5&\24\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8"+
		"\u00e9\7\6\2\2\u00e9%\3\2\2\2\u00ea\u00eb\t\4\2\2\u00eb\u00ed\7\n\2\2"+
		"\u00ec\u00ee\5\f\7\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\13\2\2"+
		"\u00f2\u00f3\7\6\2\2\u00f3\'\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5\u00f6\t"+
		"\5\2\2\u00f6\u00f7\5\16\b\2\u00f7\u00f8\7\6\2\2\u00f8\u0103\3\2\2\2\u00f9"+
		"\u00fa\5\60\31\2\u00fa\u00fb\7\37\2\2\u00fb\u00fc\5\16\b\2\u00fc\u00fd"+
		"\7\6\2\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\5\60\31\2\u00ff\u0100\7\37\2"+
		"\2\u0100\u0101\5\30\r\2\u0101\u0103\3\2\2\2\u0102\u00f4\3\2\2\2\u0102"+
		"\u00f9\3\2\2\2\u0102\u00fe\3\2\2\2\u0103)\3\2\2\2\u0104\u0105\7*\2\2\u0105"+
		"\u0106\7\37\2\2\u0106\u0107\7\7\2\2\u0107\u010e\7\6\2\2\u0108\u0109\5"+
		"\62\32\2\u0109\u010a\7\37\2\2\u010a\u010b\7\7\2\2\u010b\u010c\7\6\2\2"+
		"\u010c\u010e\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u0108\3\2\2\2\u010e+\3"+
		"\2\2\2\u010f\u0110\7*\2\2\u0110\u0111\7\37\2\2\u0111\u0117\5\30\r\2\u0112"+
		"\u0113\5\62\32\2\u0113\u0114\7\37\2\2\u0114\u0115\5\30\r\2\u0115\u0117"+
		"\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0112\3\2\2\2\u0117-\3\2\2\2\u0118"+
		"\u0119\7*\2\2\u0119\u011a\7\37\2\2\u011a\u011e\7\n\2\2\u011b\u011d\5\f"+
		"\7\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\13"+
		"\2\2\u0122\u0130\7\6\2\2\u0123\u0124\5\64\33\2\u0124\u0125\7\37\2\2\u0125"+
		"\u0129\7\n\2\2\u0126\u0128\5\f\7\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7\13\2\2\u012d\u012e\7\6\2\2\u012e\u0130\3"+
		"\2\2\2\u012f\u0118\3\2\2\2\u012f\u0123\3\2\2\2\u0130/\3\2\2\2\u0131\u0132"+
		"\7\21\2\2\u0132\u0133\7*\2\2\u0133\61\3\2\2\2\u0134\u0135\7\5\2\2\u0135"+
		"\u0136\7*\2\2\u0136\63\3\2\2\2\u0137\u0138\7\27\2\2\u0138\u0139\7*\2\2"+
		"\u0139\65\3\2\2\2\u013a\u014f\b\34\1\2\u013b\u013c\7*\2\2\u013c\u013d"+
		"\7\35\2\2\u013d\u0150\7\7\2\2\u013e\u013f\7\7\2\2\u013f\u0140\7\35\2\2"+
		"\u0140\u0150\7*\2\2\u0141\u0142\7*\2\2\u0142\u0143\t\6\2\2\u0143\u0150"+
		"\7*\2\2\u0144\u0145\7*\2\2\u0145\u0146\t\6\2\2\u0146\u0150\5\16\b\2\u0147"+
		"\u0148\5\16\b\2\u0148\u0149\t\6\2\2\u0149\u014a\7*\2\2\u014a\u0150\3\2"+
		"\2\2\u014b\u014c\5\16\b\2\u014c\u014d\t\6\2\2\u014d\u014e\5\16\b\2\u014e"+
		"\u0150\3\2\2\2\u014f\u013b\3\2\2\2\u014f\u013e\3\2\2\2\u014f\u0141\3\2"+
		"\2\2\u014f\u0144\3\2\2\2\u014f\u0147\3\2\2\2\u014f\u014b\3\2\2\2\u0150"+
		"\u015a\3\2\2\2\u0151\u0152\7*\2\2\u0152\u0153\7\35\2\2\u0153\u015a\7("+
		"\2\2\u0154\u0155\7(\2\2\u0155\u0156\7\35\2\2\u0156\u015a\7*\2\2\u0157"+
		"\u015a\7*\2\2\u0158\u015a\7(\2\2\u0159\u013a\3\2\2\2\u0159\u0151\3\2\2"+
		"\2\u0159\u0154\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u0160"+
		"\3\2\2\2\u015b\u015c\f\7\2\2\u015c\u015d\t\7\2\2\u015d\u015f\5\66\34\b"+
		"\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\67\3\2\2\2\u0162\u0160\3\2\2\2\35?MXbr\u0080\u0082\u008a"+
		"\u0090\u009b\u00a2\u00ad\u00b7\u00bb\u00c7\u00d3\u00e5\u00ef\u0102\u010d"+
		"\u0116\u011e\u0129\u012f\u014f\u0159\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}