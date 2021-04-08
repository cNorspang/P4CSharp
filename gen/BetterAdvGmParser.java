// Generated from C:/Users/Norspang/RiderProjects/POTBAG/POTBAG/AntlrFiles\BetterAdvGm.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, KEYWORD_TEXT=2, KEYWORD_STRING=3, END_STMT=4, STRING=5, 
		TRAVEL_KEYWORD=6, INCREMENT=7, CURLY_LEFT=8, CURLY_RIGHT=9, PAREN_LEFT=10, 
		PAREN_RIGHT=11, SQUARE_LEFT=12, SQUARE_RIGHT=13, KEYWORD_INPUT=14, KEYWORD_INT=15, 
		KEYWORD_IF=16, KEYWORD_ELSE=17, KEYWORD_ELSEIF=18, KEYWORD_WHILE=19, KEYWORD_FOR=20, 
		KEYWORD_LOCATION=21, KEYWORD_SETUP=22, KEYWORD_LOCATIONARRAY=23, KEYWORD_LOCATIONS=24, 
		KEYWORD_CHOICE=25, COMMA_SEPERATOR=26, CMP_OPERATOR=27, ASSIGN_OPERATOR=28, 
		COMPOUND_OPERATOR=29, TIMES_OPERATOR=30, DIVISION_OPERATOR=31, PLUS_OPERATOR=32, 
		MINUS_OPERATOR=33, ARROW_OPERATOR=34, AND_OPERATOR=35, OR_OPERATOR=36, 
		NUM=37, VAR_NAME=38;
	public static final int
		RULE_prog = 0, RULE_setup = 1, RULE_locationsetup = 2, RULE_locationmapping = 3, 
		RULE_expression = 4, RULE_statement = 5, RULE_assign = 6, RULE_declaration = 7, 
		RULE_text_statement = 8, RULE_input_statement = 9, RULE_if_statement = 10, 
		RULE_travel_statement = 11, RULE_choice_statement = 12, RULE_option_statment = 13, 
		RULE_int_assign = 14, RULE_string_assign = 15, RULE_input_assign = 16, 
		RULE_location_assign = 17, RULE_int_declaration = 18, RULE_string_declaration = 19, 
		RULE_location_declaration = 20, RULE_predicate = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "setup", "locationsetup", "locationmapping", "expression", "statement", 
			"assign", "declaration", "text_statement", "input_statement", "if_statement", 
			"travel_statement", "choice_statement", "option_statment", "int_assign", 
			"string_assign", "input_assign", "location_assign", "int_declaration", 
			"string_declaration", "location_declaration", "predicate"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Text '", "'string '", "';'", null, "'Travel '", "'++'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "'userInput'", "'int'", "'if'", 
			"'else'", "'else if'", "'while'", "'for'", "'Location'", "'setup'", "'LocationArray'", 
			"'Locations'", "'choice'", "','", null, "'='", "'+='", "'*'", "'/'", 
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
			"KEYWORD_CHOICE", "COMMA_SEPERATOR", "CMP_OPERATOR", "ASSIGN_OPERATOR", 
			"COMPOUND_OPERATOR", "TIMES_OPERATOR", "DIVISION_OPERATOR", "PLUS_OPERATOR", 
			"MINUS_OPERATOR", "ARROW_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "NUM", 
			"VAR_NAME"
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
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BetterAdvGmParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			setup();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(45);
					statement();
					}
					break;
				case 2:
					{
					setState(46);
					assign();
					}
					break;
				case 3:
					{
					setState(47);
					declaration();
					}
					break;
				case 4:
					{
					setState(48);
					expression(0);
					}
					break;
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitSetup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitSetup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(KEYWORD_SETUP);
			setState(57);
			match(CURLY_LEFT);
			{
			setState(58);
			locationsetup();
			}
			setState(59);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterLocationsetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitLocationsetup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitLocationsetup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationsetupContext locationsetup() throws RecognitionException {
		LocationsetupContext _localctx = new LocationsetupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_locationsetup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(KEYWORD_LOCATIONS);
			setState(62);
			match(ASSIGN_OPERATOR);
			setState(63);
			match(CURLY_LEFT);
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				locationmapping();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR_NAME );
			setState(69);
			match(CURLY_RIGHT);
			setState(70);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterLocationmapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitLocationmapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitLocationmapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationmappingContext locationmapping() throws RecognitionException {
		LocationmappingContext _localctx = new LocationmappingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_locationmapping);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(VAR_NAME);
			setState(73);
			match(ARROW_OPERATOR);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(VAR_NAME);
					setState(75);
					match(COMMA_SEPERATOR);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(81);
			match(VAR_NAME);
			setState(82);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(85);
				match(VAR_NAME);
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				expression(7);
				}
				break;
			case 2:
				{
				setState(88);
				match(VAR_NAME);
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				expression(6);
				}
				break;
			case 3:
				{
				setState(91);
				match(VAR_NAME);
				setState(92);
				_la = _input.LA(1);
				if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				match(VAR_NAME);
				}
				break;
			case 4:
				{
				setState(94);
				match(VAR_NAME);
				setState(95);
				_la = _input.LA(1);
				if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(96);
				match(VAR_NAME);
				}
				break;
			case 5:
				{
				setState(97);
				match(NUM);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(101);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(104);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						match(VAR_NAME);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(110);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						match(VAR_NAME);
						}
						break;
					}
					} 
				}
				setState(116);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				text_statement();
				}
				break;
			case KEYWORD_INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				input_statement();
				}
				break;
			case KEYWORD_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				if_statement();
				}
				break;
			case TRAVEL_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				travel_statement();
				}
				break;
			case KEYWORD_CHOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				int_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				string_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				input_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				int_declaration();
				setState(131);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				string_declaration();
				setState(134);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				location_declaration();
				setState(137);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterText_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitText_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitText_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_statementContext text_statement() throws RecognitionException {
		Text_statementContext _localctx = new Text_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_text_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(KEYWORD_TEXT);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==VAR_NAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(143);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==VAR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterInput_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitInput_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitInput_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_statementContext input_statement() throws RecognitionException {
		Input_statementContext _localctx = new Input_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(KEYWORD_INPUT);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==VAR_NAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(154);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==VAR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
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
		public List<TerminalNode> PAREN_LEFT() { return getTokens(BetterAdvGmParser.PAREN_LEFT); }
		public TerminalNode PAREN_LEFT(int i) {
			return getToken(BetterAdvGmParser.PAREN_LEFT, i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<TerminalNode> PAREN_RIGHT() { return getTokens(BetterAdvGmParser.PAREN_RIGHT); }
		public TerminalNode PAREN_RIGHT(int i) {
			return getToken(BetterAdvGmParser.PAREN_RIGHT, i);
		}
		public List<TerminalNode> CURLY_LEFT() { return getTokens(BetterAdvGmParser.CURLY_LEFT); }
		public TerminalNode CURLY_LEFT(int i) {
			return getToken(BetterAdvGmParser.CURLY_LEFT, i);
		}
		public List<TerminalNode> CURLY_RIGHT() { return getTokens(BetterAdvGmParser.CURLY_RIGHT); }
		public TerminalNode CURLY_RIGHT(int i) {
			return getToken(BetterAdvGmParser.CURLY_RIGHT, i);
		}
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(BetterAdvGmParser.KEYWORD_ELSE, 0); }
		public TerminalNode KEYWORD_ELSEIF() { return getToken(BetterAdvGmParser.KEYWORD_ELSEIF, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(KEYWORD_IF);
			setState(164);
			match(PAREN_LEFT);
			setState(165);
			predicate(0);
			setState(166);
			match(PAREN_RIGHT);
			setState(167);
			match(CURLY_LEFT);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(168);
					statement();
					}
					break;
				case 2:
					{
					setState(169);
					expression(0);
					}
					break;
				case 3:
					{
					setState(170);
					assign();
					}
					break;
				case 4:
					{
					setState(171);
					declaration();
					}
					break;
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(176);
			match(CURLY_RIGHT);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ELSE || _la==KEYWORD_ELSEIF) {
				{
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD_ELSEIF) {
					{
					setState(177);
					match(KEYWORD_ELSEIF);
					setState(178);
					match(PAREN_LEFT);
					setState(179);
					predicate(0);
					setState(180);
					match(PAREN_RIGHT);
					setState(181);
					match(CURLY_LEFT);
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						setState(186);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(182);
							statement();
							}
							break;
						case 2:
							{
							setState(183);
							expression(0);
							}
							break;
						case 3:
							{
							setState(184);
							assign();
							}
							break;
						case 4:
							{
							setState(185);
							declaration();
							}
							break;
						}
						}
						setState(188); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
					setState(190);
					match(CURLY_RIGHT);
					}
				}

				setState(194);
				match(KEYWORD_ELSE);
				setState(195);
				match(CURLY_LEFT);
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(196);
					statement();
					}
					break;
				case 2:
					{
					setState(197);
					expression(0);
					}
					break;
				case 3:
					{
					setState(198);
					assign();
					}
					break;
				case 4:
					{
					setState(199);
					declaration();
					}
					break;
				}
				setState(202);
				match(CURLY_RIGHT);
				}
			}

			setState(206);
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

	public static class Travel_statementContext extends ParserRuleContext {
		public TerminalNode TRAVEL_KEYWORD() { return getToken(BetterAdvGmParser.TRAVEL_KEYWORD, 0); }
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public Travel_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_travel_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterTravel_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitTravel_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitTravel_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Travel_statementContext travel_statement() throws RecognitionException {
		Travel_statementContext _localctx = new Travel_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_travel_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(TRAVEL_KEYWORD);
			setState(209);
			match(VAR_NAME);
			setState(210);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterChoice_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitChoice_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitChoice_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Choice_statementContext choice_statement() throws RecognitionException {
		Choice_statementContext _localctx = new Choice_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_choice_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(KEYWORD_CHOICE);
			setState(213);
			match(CURLY_LEFT);
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				option_statment();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==VAR_NAME );
			setState(219);
			match(CURLY_RIGHT);
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

	public static class Option_statmentContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(BetterAdvGmParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public TerminalNode END_STMT() { return getToken(BetterAdvGmParser.END_STMT, 0); }
		public TerminalNode VAR_NAME() { return getToken(BetterAdvGmParser.VAR_NAME, 0); }
		public TerminalNode STRING() { return getToken(BetterAdvGmParser.STRING, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Option_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterOption_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitOption_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitOption_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_statmentContext option_statment() throws RecognitionException {
		Option_statmentContext _localctx = new Option_statmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_option_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==VAR_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			match(CURLY_LEFT);
			setState(228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(224);
					statement();
					}
					break;
				case 2:
					{
					setState(225);
					expression(0);
					}
					break;
				case 3:
					{
					setState(226);
					assign();
					}
					break;
				case 4:
					{
					setState(227);
					declaration();
					}
					break;
				}
				}
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(232);
			match(CURLY_RIGHT);
			setState(233);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterInt_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitInt_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitInt_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_assignContext int_assign() throws RecognitionException {
		Int_assignContext _localctx = new Int_assignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_int_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(235);
				match(VAR_NAME);
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OPERATOR || _la==COMPOUND_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				expression(0);
				setState(238);
				match(END_STMT);
				}
				break;
			case 2:
				{
				setState(240);
				int_declaration();
				setState(241);
				match(ASSIGN_OPERATOR);
				setState(242);
				expression(0);
				setState(243);
				match(END_STMT);
				}
				break;
			case 3:
				{
				setState(245);
				int_declaration();
				setState(246);
				match(ASSIGN_OPERATOR);
				setState(247);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterString_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitString_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitString_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_assignContext string_assign() throws RecognitionException {
		String_assignContext _localctx = new String_assignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(251);
				match(VAR_NAME);
				setState(252);
				match(ASSIGN_OPERATOR);
				setState(253);
				match(STRING);
				setState(254);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				{
				setState(255);
				string_declaration();
				setState(256);
				match(ASSIGN_OPERATOR);
				setState(257);
				match(STRING);
				setState(258);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterInput_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitInput_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitInput_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_assignContext input_assign() throws RecognitionException {
		Input_assignContext _localctx = new Input_assignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_input_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(262);
				match(VAR_NAME);
				setState(263);
				match(ASSIGN_OPERATOR);
				setState(264);
				input_statement();
				}
				break;
			case KEYWORD_STRING:
				{
				setState(265);
				string_declaration();
				setState(266);
				match(ASSIGN_OPERATOR);
				setState(267);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Location_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterLocation_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitLocation_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitLocation_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Location_assignContext location_assign() throws RecognitionException {
		Location_assignContext _localctx = new Location_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_location_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(271);
				match(VAR_NAME);
				setState(272);
				match(ASSIGN_OPERATOR);
				setState(273);
				match(CURLY_LEFT);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(274);
						statement();
						}
						break;
					case 2:
						{
						setState(275);
						assign();
						}
						break;
					case 3:
						{
						setState(276);
						declaration();
						}
						break;
					case 4:
						{
						setState(277);
						expression(0);
						}
						break;
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(CURLY_RIGHT);
				setState(284);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				{
				setState(285);
				location_declaration();
				setState(286);
				match(ASSIGN_OPERATOR);
				setState(287);
				match(CURLY_LEFT);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(288);
						statement();
						}
						break;
					case 2:
						{
						setState(289);
						assign();
						}
						break;
					case 3:
						{
						setState(290);
						declaration();
						}
						break;
					case 4:
						{
						setState(291);
						expression(0);
						}
						break;
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(CURLY_RIGHT);
				setState(298);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterInt_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitInt_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitInt_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_declarationContext int_declaration() throws RecognitionException {
		Int_declarationContext _localctx = new Int_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_int_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(KEYWORD_INT);
			setState(303);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterString_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitString_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitString_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(KEYWORD_STRING);
			setState(306);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterLocation_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitLocation_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitLocation_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Location_declarationContext location_declaration() throws RecognitionException {
		Location_declarationContext _localctx = new Location_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_location_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(KEYWORD_LOCATION);
			setState(309);
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
		public TerminalNode CMP_OPERATOR() { return getToken(BetterAdvGmParser.CMP_OPERATOR, 0); }
		public TerminalNode STRING() { return getToken(BetterAdvGmParser.STRING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetterAdvGmListener ) ((BetterAdvGmListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BetterAdvGmVisitor ) return ((BetterAdvGmVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(312);
				match(VAR_NAME);
				setState(313);
				match(CMP_OPERATOR);
				setState(314);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(315);
				match(STRING);
				setState(316);
				match(CMP_OPERATOR);
				setState(317);
				match(VAR_NAME);
				}
				break;
			case 3:
				{
				setState(318);
				match(VAR_NAME);
				setState(319);
				match(CMP_OPERATOR);
				setState(320);
				match(VAR_NAME);
				}
				break;
			case 4:
				{
				setState(321);
				match(VAR_NAME);
				setState(322);
				match(CMP_OPERATOR);
				setState(323);
				expression(0);
				}
				break;
			case 5:
				{
				setState(324);
				expression(0);
				setState(325);
				match(CMP_OPERATOR);
				setState(326);
				match(VAR_NAME);
				}
				break;
			case 6:
				{
				setState(328);
				expression(0);
				setState(329);
				match(CMP_OPERATOR);
				setState(330);
				expression(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PredicateContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_predicate);
					setState(334);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(335);
					_la = _input.LA(1);
					if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(336);
					predicate(2);
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 21:
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
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\6\4D\n\4\r\4\16\4E\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6s\n\6\f\6"+
		"\16\6v\13\6\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\b\5\b\u0083\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\n\7\n\u0093"+
		"\n\n\f\n\16\n\u0096\13\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u009e\n\13\f"+
		"\13\16\13\u00a1\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\6\f\u00af\n\f\r\f\16\f\u00b0\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\6\f\u00bd\n\f\r\f\16\f\u00be\3\f\3\f\5\f\u00c3\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\6\16\u00da\n\16\r\16\16\16\u00db\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\6\17\u00e7\n\17\r\17\16\17\u00e8\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00fc\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0107"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0110\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u0119\n\23\f\23\16\23\u011c\13\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0127\n\23\f\23\16\23\u012a\13"+
		"\23\3\23\3\23\3\23\5\23\u012f\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u014f\n\27\3\27\3\27"+
		"\3\27\7\27\u0154\n\27\f\27\16\27\u0157\13\27\3\27\2\4\n,\30\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\3\2 !\3\2\"#\4\2\7\7((\3\2\36"+
		"\37\3\2%&\2\u0180\2.\3\2\2\2\4:\3\2\2\2\6?\3\2\2\2\bJ\3\2\2\2\nd\3\2\2"+
		"\2\f|\3\2\2\2\16\u0082\3\2\2\2\20\u008d\3\2\2\2\22\u008f\3\2\2\2\24\u009a"+
		"\3\2\2\2\26\u00a5\3\2\2\2\30\u00d2\3\2\2\2\32\u00d6\3\2\2\2\34\u00e0\3"+
		"\2\2\2\36\u00fb\3\2\2\2 \u0106\3\2\2\2\"\u010f\3\2\2\2$\u012e\3\2\2\2"+
		"&\u0130\3\2\2\2(\u0133\3\2\2\2*\u0136\3\2\2\2,\u0139\3\2\2\2.\65\5\4\3"+
		"\2/\64\5\f\7\2\60\64\5\16\b\2\61\64\5\20\t\2\62\64\5\n\6\2\63/\3\2\2\2"+
		"\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\2\2\39\3\3\2\2\2:;\7\30\2"+
		"\2;<\7\n\2\2<=\5\6\4\2=>\7\13\2\2>\5\3\2\2\2?@\7\32\2\2@A\7\36\2\2AC\7"+
		"\n\2\2BD\5\b\5\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7"+
		"\13\2\2HI\7\6\2\2I\7\3\2\2\2JK\7(\2\2KP\7$\2\2LM\7(\2\2MO\7\34\2\2NL\3"+
		"\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7(\2\2TU\7"+
		"\6\2\2U\t\3\2\2\2VW\b\6\1\2WX\7(\2\2XY\t\2\2\2Ye\5\n\6\tZ[\7(\2\2[\\\t"+
		"\3\2\2\\e\5\n\6\b]^\7(\2\2^_\t\2\2\2_e\7(\2\2`a\7(\2\2ab\t\3\2\2be\7("+
		"\2\2ce\7\'\2\2dV\3\2\2\2dZ\3\2\2\2d]\3\2\2\2d`\3\2\2\2dc\3\2\2\2et\3\2"+
		"\2\2fg\f\13\2\2gh\t\2\2\2hs\5\n\6\fij\f\n\2\2jk\t\3\2\2ks\5\n\6\13lm\f"+
		"\7\2\2mn\t\2\2\2ns\7(\2\2op\f\6\2\2pq\t\3\2\2qs\7(\2\2rf\3\2\2\2ri\3\2"+
		"\2\2rl\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\13\3\2\2\2vt\3"+
		"\2\2\2w}\5\22\n\2x}\5\24\13\2y}\5\26\f\2z}\5\30\r\2{}\5\32\16\2|w\3\2"+
		"\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\r\3\2\2\2~\u0083\5\36\20"+
		"\2\177\u0083\5 \21\2\u0080\u0083\5\"\22\2\u0081\u0083\5$\23\2\u0082~\3"+
		"\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\17\3\2\2\2\u0084\u0085\5&\24\2\u0085\u0086\7\6\2\2\u0086\u008e\3\2\2"+
		"\2\u0087\u0088\5(\25\2\u0088\u0089\7\6\2\2\u0089\u008e\3\2\2\2\u008a\u008b"+
		"\5*\26\2\u008b\u008c\7\6\2\2\u008c\u008e\3\2\2\2\u008d\u0084\3\2\2\2\u008d"+
		"\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\21\3\2\2\2\u008f\u0094\7\4\2"+
		"\2\u0090\u0091\t\4\2\2\u0091\u0093\7\"\2\2\u0092\u0090\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\t\4\2\2\u0098\u0099\7\6\2\2\u0099\23\3\2\2"+
		"\2\u009a\u009f\7\20\2\2\u009b\u009c\t\4\2\2\u009c\u009e\7\"\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3"+
		"\u00a4\7\6\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\7\22\2\2\u00a6\u00a7\7\f\2"+
		"\2\u00a7\u00a8\5,\27\2\u00a8\u00a9\7\r\2\2\u00a9\u00ae\7\n\2\2\u00aa\u00af"+
		"\5\f\7\2\u00ab\u00af\5\n\6\2\u00ac\u00af\5\16\b\2\u00ad\u00af\5\20\t\2"+
		"\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00ce\7\13\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00b5\7"+
		"\f\2\2\u00b5\u00b6\5,\27\2\u00b6\u00b7\7\r\2\2\u00b7\u00bc\7\n\2\2\u00b8"+
		"\u00bd\5\f\7\2\u00b9\u00bd\5\n\6\2\u00ba\u00bd\5\16\b\2\u00bb\u00bd\5"+
		"\20\t\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\13\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00b3\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\23"+
		"\2\2\u00c5\u00ca\7\n\2\2\u00c6\u00cb\5\f\7\2\u00c7\u00cb\5\n\6\2\u00c8"+
		"\u00cb\5\16\b\2\u00c9\u00cb\5\20\t\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\7\13\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1\27\3\2\2\2\u00d2"+
		"\u00d3\7\b\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5\7\6\2\2\u00d5\31\3\2\2\2"+
		"\u00d6\u00d7\7\33\2\2\u00d7\u00d9\7\n\2\2\u00d8\u00da\5\34\17\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\13\2\2\u00de\u00df\7\6\2\2\u00df"+
		"\33\3\2\2\2\u00e0\u00e1\t\4\2\2\u00e1\u00e6\7\n\2\2\u00e2\u00e7\5\f\7"+
		"\2\u00e3\u00e7\5\n\6\2\u00e4\u00e7\5\16\b\2\u00e5\u00e7\5\20\t\2\u00e6"+
		"\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\7\13\2\2\u00eb\u00ec\7\6\2\2\u00ec\35\3\2\2"+
		"\2\u00ed\u00ee\7(\2\2\u00ee\u00ef\t\5\2\2\u00ef\u00f0\5\n\6\2\u00f0\u00f1"+
		"\7\6\2\2\u00f1\u00fc\3\2\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\7\36\2\2"+
		"\u00f4\u00f5\5\n\6\2\u00f5\u00f6\7\6\2\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8"+
		"\5&\24\2\u00f8\u00f9\7\36\2\2\u00f9\u00fa\5\24\13\2\u00fa\u00fc\3\2\2"+
		"\2\u00fb\u00ed\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\37"+
		"\3\2\2\2\u00fd\u00fe\7(\2\2\u00fe\u00ff\7\36\2\2\u00ff\u0100\7\7\2\2\u0100"+
		"\u0107\7\6\2\2\u0101\u0102\5(\25\2\u0102\u0103\7\36\2\2\u0103\u0104\7"+
		"\7\2\2\u0104\u0105\7\6\2\2\u0105\u0107\3\2\2\2\u0106\u00fd\3\2\2\2\u0106"+
		"\u0101\3\2\2\2\u0107!\3\2\2\2\u0108\u0109\7(\2\2\u0109\u010a\7\36\2\2"+
		"\u010a\u0110\5\24\13\2\u010b\u010c\5(\25\2\u010c\u010d\7\36\2\2\u010d"+
		"\u010e\5\24\13\2\u010e\u0110\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u010b\3"+
		"\2\2\2\u0110#\3\2\2\2\u0111\u0112\7(\2\2\u0112\u0113\7\36\2\2\u0113\u011a"+
		"\7\n\2\2\u0114\u0119\5\f\7\2\u0115\u0119\5\16\b\2\u0116\u0119\5\20\t\2"+
		"\u0117\u0119\5\n\6\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\13"+
		"\2\2\u011e\u012f\7\6\2\2\u011f\u0120\5*\26\2\u0120\u0121\7\36\2\2\u0121"+
		"\u0128\7\n\2\2\u0122\u0127\5\f\7\2\u0123\u0127\5\16\b\2\u0124\u0127\5"+
		"\20\t\2\u0125\u0127\5\n\6\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012c\7\13\2\2\u012c\u012d\7\6\2\2\u012d\u012f\3\2\2\2\u012e\u0111\3"+
		"\2\2\2\u012e\u011f\3\2\2\2\u012f%\3\2\2\2\u0130\u0131\7\21\2\2\u0131\u0132"+
		"\7(\2\2\u0132\'\3\2\2\2\u0133\u0134\7\5\2\2\u0134\u0135\7(\2\2\u0135)"+
		"\3\2\2\2\u0136\u0137\7\27\2\2\u0137\u0138\7(\2\2\u0138+\3\2\2\2\u0139"+
		"\u014e\b\27\1\2\u013a\u013b\7(\2\2\u013b\u013c\7\35\2\2\u013c\u014f\7"+
		"\7\2\2\u013d\u013e\7\7\2\2\u013e\u013f\7\35\2\2\u013f\u014f\7(\2\2\u0140"+
		"\u0141\7(\2\2\u0141\u0142\7\35\2\2\u0142\u014f\7(\2\2\u0143\u0144\7(\2"+
		"\2\u0144\u0145\7\35\2\2\u0145\u014f\5\n\6\2\u0146\u0147\5\n\6\2\u0147"+
		"\u0148\7\35\2\2\u0148\u0149\7(\2\2\u0149\u014f\3\2\2\2\u014a\u014b\5\n"+
		"\6\2\u014b\u014c\7\35\2\2\u014c\u014d\5\n\6\2\u014d\u014f\3\2\2\2\u014e"+
		"\u013a\3\2\2\2\u014e\u013d\3\2\2\2\u014e\u0140\3\2\2\2\u014e\u0143\3\2"+
		"\2\2\u014e\u0146\3\2\2\2\u014e\u014a\3\2\2\2\u014f\u0155\3\2\2\2\u0150"+
		"\u0151\f\3\2\2\u0151\u0152\t\6\2\2\u0152\u0154\5,\27\4\u0153\u0150\3\2"+
		"\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"-\3\2\2\2\u0157\u0155\3\2\2\2\"\63\65EPdrt|\u0082\u008d\u0094\u009f\u00ae"+
		"\u00b0\u00bc\u00be\u00c2\u00ca\u00ce\u00db\u00e6\u00e8\u00fb\u0106\u010f"+
		"\u0118\u011a\u0126\u0128\u012e\u014e\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}