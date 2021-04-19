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
		RULE_option_statment = 18, RULE_while_statement = 19, RULE_int_assign = 20, 
		RULE_string_assign = 21, RULE_input_assign = 22, RULE_location_assign = 23, 
		RULE_int_declaration = 24, RULE_string_declaration = 25, RULE_location_declaration = 26, 
		RULE_predicate = 27, RULE_variable = 28, RULE_string_obj = 29, RULE_bool_obj = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "buffernode", "setup", "locationsetup", "locationmapping", "inBlock", 
			"expression", "statement", "assign", "declaration", "text_statement", 
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
			setState(62);
			buffernode();
			setState(63);
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
			setState(65);
			setup();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
				{
				{
				setState(66);
				inBlock();
				}
				}
				setState(71);
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
			setState(72);
			match(KEYWORD_SETUP);
			setState(73);
			match(CURLY_LEFT);
			{
			setState(74);
			locationsetup();
			}
			setState(75);
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
			setState(77);
			match(KEYWORD_LOCATIONS);
			setState(78);
			match(ASSIGN_OPERATOR);
			setState(79);
			match(CURLY_LEFT);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				locationmapping();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR_NAME );
			setState(85);
			match(CURLY_RIGHT);
			setState(86);
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
			setState(88);
			variable();
			setState(89);
			match(ARROW_OPERATOR);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					variable();
					setState(91);
					match(COMMA_SEPERATOR);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(98);
			variable();
			setState(99);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_LEFT:
				{
				setState(108);
				match(PAREN_LEFT);
				setState(109);
				expression(0);
				setState(110);
				match(PAREN_RIGHT);
				}
				break;
			case VAR_NAME:
				{
				setState(112);
				variable();
				}
				break;
			case NUM:
				{
				setState(113);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(117);
						_la = _input.LA(1);
						if ( !(_la==TIMES_OPERATOR || _la==DIVISION_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(120);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(126);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				text_statement();
				}
				break;
			case KEYWORD_INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				input_statement();
				}
				break;
			case KEYWORD_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				if_chain_statement();
				}
				break;
			case TRAVEL_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				travel_statement();
				}
				break;
			case KEYWORD_CHOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				choice_statement();
				}
				break;
			case KEYWORD_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
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
		enterRule(_localctx, 16, RULE_assign);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				int_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				string_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				input_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				int_declaration();
				setState(142);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				string_declaration();
				setState(145);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				location_declaration();
				setState(148);
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
		enterRule(_localctx, 20, RULE_text_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(KEYWORD_TEXT);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(153);
						string_obj();
						}
						break;
					case VAR_NAME:
						{
						setState(154);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(157);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(164);
				string_obj();
				}
				break;
			case VAR_NAME:
				{
				setState(165);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
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
		enterRule(_localctx, 22, RULE_input_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(KEYWORD_INPUT);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(171);
						string_obj();
						}
						break;
					case VAR_NAME:
						{
						setState(172);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(175);
					match(PLUS_OPERATOR);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(182);
				string_obj();
				}
				break;
			case VAR_NAME:
				{
				setState(183);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
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
			setState(188);
			if_statement();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_ELSEIF) {
				{
				{
				setState(189);
				else_if_statement();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_ELSE) {
				{
				setState(195);
				else_statement();
				}
			}

			setState(198);
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
			setState(200);
			match(KEYWORD_IF);
			setState(201);
			match(PAREN_LEFT);
			setState(202);
			predicate(0);
			setState(203);
			match(PAREN_RIGHT);
			setState(204);
			match(CURLY_LEFT);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				inBlock();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(210);
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
			setState(212);
			match(KEYWORD_ELSEIF);
			setState(213);
			match(PAREN_LEFT);
			setState(214);
			predicate(0);
			setState(215);
			match(PAREN_RIGHT);
			setState(216);
			match(CURLY_LEFT);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				inBlock();
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(222);
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
		enterRule(_localctx, 30, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(KEYWORD_ELSE);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
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
		enterRule(_localctx, 32, RULE_travel_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(TRAVEL_KEYWORD);
			setState(234);
			variable();
			setState(235);
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
			setState(237);
			match(KEYWORD_CHOICE);
			setState(238);
			match(CURLY_LEFT);
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				option_statment();
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==VAR_NAME );
			setState(244);
			match(CURLY_RIGHT);
			setState(245);
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
		enterRule(_localctx, 36, RULE_option_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(247);
				variable();
				}
				break;
			case STRING:
				{
				setState(248);
				string_obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(251);
			match(CURLY_LEFT);
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				inBlock();
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0) );
			setState(257);
			match(CURLY_RIGHT);
			setState(258);
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
		public InBlockContext inBlock() {
			return getRuleContext(InBlockContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(BetterAdvGmParser.CURLY_RIGHT, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(KEYWORD_WHILE);
			setState(261);
			match(PAREN_LEFT);
			setState(262);
			predicate(0);
			setState(263);
			match(PAREN_RIGHT);
			setState(264);
			match(CURLY_LEFT);
			setState(265);
			inBlock();
			setState(266);
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
		enterRule(_localctx, 40, RULE_int_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(268);
				variable();
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OPERATOR || _la==COMPOUND_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				expression(0);
				setState(271);
				match(END_STMT);
				}
				break;
			case 2:
				{
				setState(273);
				int_declaration();
				setState(274);
				match(ASSIGN_OPERATOR);
				setState(275);
				expression(0);
				setState(276);
				match(END_STMT);
				}
				break;
			case 3:
				{
				setState(278);
				int_declaration();
				setState(279);
				match(ASSIGN_OPERATOR);
				setState(280);
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
		enterRule(_localctx, 42, RULE_string_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(284);
				variable();
				setState(285);
				match(ASSIGN_OPERATOR);
				setState(286);
				string_obj();
				setState(287);
				match(END_STMT);
				}
				break;
			case KEYWORD_STRING:
				{
				setState(289);
				string_declaration();
				setState(290);
				match(ASSIGN_OPERATOR);
				setState(291);
				string_obj();
				setState(292);
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
		enterRule(_localctx, 44, RULE_input_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(296);
				variable();
				setState(297);
				match(ASSIGN_OPERATOR);
				setState(298);
				input_statement();
				}
				break;
			case KEYWORD_STRING:
				{
				setState(300);
				string_declaration();
				setState(301);
				match(ASSIGN_OPERATOR);
				setState(302);
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
		enterRule(_localctx, 46, RULE_location_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(306);
				variable();
				setState(307);
				match(ASSIGN_OPERATOR);
				setState(308);
				match(CURLY_LEFT);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(309);
					inBlock();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(CURLY_RIGHT);
				setState(316);
				match(END_STMT);
				}
				break;
			case KEYWORD_LOCATION:
				{
				setState(318);
				location_declaration();
				setState(319);
				match(ASSIGN_OPERATOR);
				setState(320);
				match(CURLY_LEFT);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_TEXT) | (1L << KEYWORD_STRING) | (1L << TRAVEL_KEYWORD) | (1L << PAREN_LEFT) | (1L << KEYWORD_INPUT) | (1L << KEYWORD_INT) | (1L << KEYWORD_IF) | (1L << KEYWORD_WHILE) | (1L << KEYWORD_LOCATION) | (1L << KEYWORD_CHOICE) | (1L << NUM) | (1L << VAR_NAME))) != 0)) {
					{
					{
					setState(321);
					inBlock();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(CURLY_RIGHT);
				setState(328);
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
		enterRule(_localctx, 48, RULE_int_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(KEYWORD_INT);
			setState(333);
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
		enterRule(_localctx, 50, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(KEYWORD_STRING);
			setState(336);
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
		enterRule(_localctx, 52, RULE_location_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(KEYWORD_LOCATION);
			setState(339);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(342);
					variable();
					setState(343);
					match(BOOL_CMP_OPERATOR);
					setState(344);
					string_obj();
					}
					break;
				case 2:
					{
					setState(346);
					string_obj();
					setState(347);
					match(BOOL_CMP_OPERATOR);
					setState(348);
					variable();
					}
					break;
				case 3:
					{
					setState(350);
					variable();
					setState(351);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(352);
					variable();
					}
					break;
				case 4:
					{
					setState(354);
					variable();
					setState(355);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(356);
					expression(0);
					}
					break;
				case 5:
					{
					setState(358);
					expression(0);
					setState(359);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(360);
					variable();
					}
					break;
				case 6:
					{
					setState(362);
					expression(0);
					setState(363);
					_la = _input.LA(1);
					if ( !(_la==BOOL_CMP_OPERATOR || _la==CMP_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(364);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(368);
				variable();
				setState(369);
				match(BOOL_CMP_OPERATOR);
				setState(370);
				bool_obj();
				}
				break;
			case 3:
				{
				setState(372);
				bool_obj();
				setState(373);
				match(BOOL_CMP_OPERATOR);
				setState(374);
				variable();
				}
				break;
			case 4:
				{
				setState(376);
				variable();
				}
				break;
			case 5:
				{
				setState(377);
				bool_obj();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PredicateContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_predicate);
					setState(380);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(381);
					_la = _input.LA(1);
					if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(382);
					predicate(6);
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 56, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		enterRule(_localctx, 58, RULE_string_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		enterRule(_localctx, 60, RULE_bool_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\6\5T\n\5\r\5\16\5U\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6"+
		"\16\6c\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bu\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f\5"+
		"\f\u009e\n\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\f\3\f\5\f\u00a9"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u00b0\n\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r"+
		"\u00b7\13\r\3\r\3\r\5\r\u00bb\n\r\3\r\3\r\3\16\3\16\7\16\u00c1\n\16\f"+
		"\16\16\16\u00c4\13\16\3\16\5\16\u00c7\n\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\6\17\u00d1\n\17\r\17\16\17\u00d2\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\6\20\u00dd\n\20\r\20\16\20\u00de\3\20\3\20\3\21\3\21\3"+
		"\21\6\21\u00e6\n\21\r\21\16\21\u00e7\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\6\23\u00f3\n\23\r\23\16\23\u00f4\3\23\3\23\3\23\3\24\3\24\5"+
		"\24\u00fc\n\24\3\24\3\24\6\24\u0100\n\24\r\24\16\24\u0101\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011d\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0129\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0133\n\30\3\31\3\31\3\31\3\31\7\31\u0139"+
		"\n\31\f\31\16\31\u013c\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0145"+
		"\n\31\f\31\16\31\u0148\13\31\3\31\3\31\3\31\5\31\u014d\n\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0171\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u017d\n\35\3\35\3\35\3\35\7\35\u0182\n\35\f\35\16"+
		"\35\u0185\13\35\3\36\3\36\3\37\3\37\3 \3 \3 \2\4\168!\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\3\2!\"\3\2#$\3\2\37"+
		" \3\2\35\36\3\2&\'\2\u01a0\2@\3\2\2\2\4C\3\2\2\2\6J\3\2\2\2\bO\3\2\2\2"+
		"\nZ\3\2\2\2\fk\3\2\2\2\16t\3\2\2\2\20\u0087\3\2\2\2\22\u008d\3\2\2\2\24"+
		"\u0098\3\2\2\2\26\u009a\3\2\2\2\30\u00ac\3\2\2\2\32\u00be\3\2\2\2\34\u00ca"+
		"\3\2\2\2\36\u00d6\3\2\2\2 \u00e2\3\2\2\2\"\u00eb\3\2\2\2$\u00ef\3\2\2"+
		"\2&\u00fb\3\2\2\2(\u0106\3\2\2\2*\u011c\3\2\2\2,\u0128\3\2\2\2.\u0132"+
		"\3\2\2\2\60\u014c\3\2\2\2\62\u014e\3\2\2\2\64\u0151\3\2\2\2\66\u0154\3"+
		"\2\2\28\u017c\3\2\2\2:\u0186\3\2\2\2<\u0188\3\2\2\2>\u018a\3\2\2\2@A\5"+
		"\4\3\2AB\7\2\2\3B\3\3\2\2\2CG\5\6\4\2DF\5\f\7\2ED\3\2\2\2FI\3\2\2\2GE"+
		"\3\2\2\2GH\3\2\2\2H\5\3\2\2\2IG\3\2\2\2JK\7\30\2\2KL\7\n\2\2LM\5\b\5\2"+
		"MN\7\13\2\2N\7\3\2\2\2OP\7\32\2\2PQ\7\37\2\2QS\7\n\2\2RT\5\n\6\2SR\3\2"+
		"\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\13\2\2XY\7\6\2\2Y\t\3"+
		"\2\2\2Z[\5:\36\2[a\7%\2\2\\]\5:\36\2]^\7\34\2\2^`\3\2\2\2_\\\3\2\2\2`"+
		"c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\5:\36\2ef\7\6\2\2"+
		"f\13\3\2\2\2gl\5\20\t\2hl\5\16\b\2il\5\22\n\2jl\5\24\13\2kg\3\2\2\2kh"+
		"\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\r\3\2\2\2mn\b\b\1\2no\7\f\2\2op\5\16\b\2"+
		"pq\7\r\2\2qu\3\2\2\2ru\5:\36\2su\7)\2\2tm\3\2\2\2tr\3\2\2\2ts\3\2\2\2"+
		"u~\3\2\2\2vw\f\7\2\2wx\t\2\2\2x}\5\16\b\byz\f\6\2\2z{\t\3\2\2{}\5\16\b"+
		"\7|v\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\17\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0088\5\26\f\2\u0082\u0088\5\30\r\2\u0083"+
		"\u0088\5\32\16\2\u0084\u0088\5\"\22\2\u0085\u0088\5$\23\2\u0086\u0088"+
		"\5(\25\2\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\21\3\2\2"+
		"\2\u0089\u008e\5*\26\2\u008a\u008e\5,\27\2\u008b\u008e\5.\30\2\u008c\u008e"+
		"\5\60\31\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090\5\62\32\2\u0090\u0091"+
		"\7\6\2\2\u0091\u0099\3\2\2\2\u0092\u0093\5\64\33\2\u0093\u0094\7\6\2\2"+
		"\u0094\u0099\3\2\2\2\u0095\u0096\5\66\34\2\u0096\u0097\7\6\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099"+
		"\25\3\2\2\2\u009a\u00a3\7\4\2\2\u009b\u009e\5<\37\2\u009c\u009e\5:\36"+
		"\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\7#\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a9\5<\37\2\u00a7\u00a9\5:\36\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\6\2\2\u00ab\27\3\2\2"+
		"\2\u00ac\u00b5\7\20\2\2\u00ad\u00b0\5<\37\2\u00ae\u00b0\5:\36\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7#"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00bb\5<\37\2\u00b9\u00bb\5:\36\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\31\3\2\2"+
		"\2\u00be\u00c2\5\34\17\2\u00bf\u00c1\5\36\20\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\5 \21\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\6\2\2\u00c9\33\3\2\2"+
		"\2\u00ca\u00cb\7\22\2\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\58\35\2\u00cd"+
		"\u00ce\7\r\2\2\u00ce\u00d0\7\n\2\2\u00cf\u00d1\5\f\7\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\7\13\2\2\u00d5\35\3\2\2\2\u00d6\u00d7\7\24"+
		"\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\58\35\2\u00d9\u00da\7\r\2\2\u00da"+
		"\u00dc\7\n\2\2\u00db\u00dd\5\f\7\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7\13\2\2\u00e1\37\3\2\2\2\u00e2\u00e3\7\23\2\2\u00e3\u00e5\7\n"+
		"\2\2\u00e4\u00e6\5\f\7\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\13"+
		"\2\2\u00ea!\3\2\2\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed\5:\36\2\u00ed\u00ee"+
		"\7\6\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00f2\7\n\2\2\u00f1"+
		"\u00f3\5&\24\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\13\2\2\u00f7"+
		"\u00f8\7\6\2\2\u00f8%\3\2\2\2\u00f9\u00fc\5:\36\2\u00fa\u00fc\5<\37\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff"+
		"\7\n\2\2\u00fe\u0100\5\f\7\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\13"+
		"\2\2\u0104\u0105\7\6\2\2\u0105\'\3\2\2\2\u0106\u0107\7\25\2\2\u0107\u0108"+
		"\7\f\2\2\u0108\u0109\58\35\2\u0109\u010a\7\r\2\2\u010a\u010b\7\n\2\2\u010b"+
		"\u010c\5\f\7\2\u010c\u010d\7\13\2\2\u010d)\3\2\2\2\u010e\u010f\5:\36\2"+
		"\u010f\u0110\t\4\2\2\u0110\u0111\5\16\b\2\u0111\u0112\7\6\2\2\u0112\u011d"+
		"\3\2\2\2\u0113\u0114\5\62\32\2\u0114\u0115\7\37\2\2\u0115\u0116\5\16\b"+
		"\2\u0116\u0117\7\6\2\2\u0117\u011d\3\2\2\2\u0118\u0119\5\62\32\2\u0119"+
		"\u011a\7\37\2\2\u011a\u011b\5\30\r\2\u011b\u011d\3\2\2\2\u011c\u010e\3"+
		"\2\2\2\u011c\u0113\3\2\2\2\u011c\u0118\3\2\2\2\u011d+\3\2\2\2\u011e\u011f"+
		"\5:\36\2\u011f\u0120\7\37\2\2\u0120\u0121\5<\37\2\u0121\u0122\7\6\2\2"+
		"\u0122\u0129\3\2\2\2\u0123\u0124\5\64\33\2\u0124\u0125\7\37\2\2\u0125"+
		"\u0126\5<\37\2\u0126\u0127\7\6\2\2\u0127\u0129\3\2\2\2\u0128\u011e\3\2"+
		"\2\2\u0128\u0123\3\2\2\2\u0129-\3\2\2\2\u012a\u012b\5:\36\2\u012b\u012c"+
		"\7\37\2\2\u012c\u012d\5\30\r\2\u012d\u0133\3\2\2\2\u012e\u012f\5\64\33"+
		"\2\u012f\u0130\7\37\2\2\u0130\u0131\5\30\r\2\u0131\u0133\3\2\2\2\u0132"+
		"\u012a\3\2\2\2\u0132\u012e\3\2\2\2\u0133/\3\2\2\2\u0134\u0135\5:\36\2"+
		"\u0135\u0136\7\37\2\2\u0136\u013a\7\n\2\2\u0137\u0139\5\f\7\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\13\2\2\u013e\u013f\7"+
		"\6\2\2\u013f\u014d\3\2\2\2\u0140\u0141\5\66\34\2\u0141\u0142\7\37\2\2"+
		"\u0142\u0146\7\n\2\2\u0143\u0145\5\f\7\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\7\13\2\2\u014a\u014b\7\6\2\2\u014b\u014d\3"+
		"\2\2\2\u014c\u0134\3\2\2\2\u014c\u0140\3\2\2\2\u014d\61\3\2\2\2\u014e"+
		"\u014f\7\21\2\2\u014f\u0150\5:\36\2\u0150\63\3\2\2\2\u0151\u0152\7\5\2"+
		"\2\u0152\u0153\5:\36\2\u0153\65\3\2\2\2\u0154\u0155\7\27\2\2\u0155\u0156"+
		"\5:\36\2\u0156\67\3\2\2\2\u0157\u0170\b\35\1\2\u0158\u0159\5:\36\2\u0159"+
		"\u015a\7\35\2\2\u015a\u015b\5<\37\2\u015b\u0171\3\2\2\2\u015c\u015d\5"+
		"<\37\2\u015d\u015e\7\35\2\2\u015e\u015f\5:\36\2\u015f\u0171\3\2\2\2\u0160"+
		"\u0161\5:\36\2\u0161\u0162\t\5\2\2\u0162\u0163\5:\36\2\u0163\u0171\3\2"+
		"\2\2\u0164\u0165\5:\36\2\u0165\u0166\t\5\2\2\u0166\u0167\5\16\b\2\u0167"+
		"\u0171\3\2\2\2\u0168\u0169\5\16\b\2\u0169\u016a\t\5\2\2\u016a\u016b\5"+
		":\36\2\u016b\u0171\3\2\2\2\u016c\u016d\5\16\b\2\u016d\u016e\t\5\2\2\u016e"+
		"\u016f\5\16\b\2\u016f\u0171\3\2\2\2\u0170\u0158\3\2\2\2\u0170\u015c\3"+
		"\2\2\2\u0170\u0160\3\2\2\2\u0170\u0164\3\2\2\2\u0170\u0168\3\2\2\2\u0170"+
		"\u016c\3\2\2\2\u0171\u017d\3\2\2\2\u0172\u0173\5:\36\2\u0173\u0174\7\35"+
		"\2\2\u0174\u0175\5> \2\u0175\u017d\3\2\2\2\u0176\u0177\5> \2\u0177\u0178"+
		"\7\35\2\2\u0178\u0179\5:\36\2\u0179\u017d\3\2\2\2\u017a\u017d\5:\36\2"+
		"\u017b\u017d\5> \2\u017c\u0157\3\2\2\2\u017c\u0172\3\2\2\2\u017c\u0176"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\u0183\3\2\2\2\u017e"+
		"\u017f\f\7\2\2\u017f\u0180\t\6\2\2\u0180\u0182\58\35\b\u0181\u017e\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"9\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7*\2\2\u0187;\3\2\2\2\u0188"+
		"\u0189\7\7\2\2\u0189=\3\2\2\2\u018a\u018b\7(\2\2\u018b?\3\2\2\2#GUakt"+
		"|~\u0087\u008d\u0098\u009d\u00a3\u00a8\u00af\u00b5\u00ba\u00c2\u00c6\u00d2"+
		"\u00de\u00e7\u00f4\u00fb\u0101\u011c\u0128\u0132\u013a\u0146\u014c\u0170"+
		"\u017c\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}