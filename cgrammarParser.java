// Generated from cgrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Alpha=10, Digit=11, OPENBRACK=12, CLOSEBRACK=13, OPENPAREN=14, CLOSEPAREN=15, 
		MAIN=16, WS=17;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_varDecl = 2, RULE_multiStatement = 3, 
		RULE_statement = 4, RULE_expr = 5, RULE_term = 6, RULE_factor = 7, RULE_literal = 8, 
		RULE_identifier = 9, RULE_restOfIdentifier = 10, RULE_alphaNum = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "varDecl", "multiStatement", "statement", "expr", 
			"term", "factor", "literal", "identifier", "restOfIdentifier", "alphaNum"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "';'", "'='", "'if'", "'else'", "'while'", "'+'", "'*'", 
			"'_'", null, null, "'{'", "'}'", "'('", "')'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Alpha", 
			"Digit", "OPENBRACK", "CLOSEBRACK", "OPENPAREN", "CLOSEPAREN", "MAIN", 
			"WS"
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
	public String getGrammarFileName() { return "cgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(cgrammarParser.MAIN, 0); }
		public TerminalNode OPENPAREN() { return getToken(cgrammarParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(cgrammarParser.CLOSEPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(cgrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(MAIN);
			setState(25);
			match(OPENPAREN);
			setState(26);
			match(CLOSEPAREN);
			setState(27);
			block();
			setState(28);
			match(EOF);
			from cparse import printVariables
			printVariables()
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPENBRACK() { return getToken(cgrammarParser.OPENBRACK, 0); }
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public MultiStatementContext multiStatement() {
			return getRuleContext(MultiStatementContext.class,0);
		}
		public TerminalNode CLOSEBRACK() { return getToken(cgrammarParser.CLOSEBRACK, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(OPENBRACK);
				setState(33);
				varDecl();
				setState(34);
				multiStatement();
				setState(35);
				match(CLOSEBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(OPENBRACK);
				setState(38);
				varDecl();
				setState(39);
				match(CLOSEBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(OPENBRACK);
				setState(42);
				multiStatement();
				setState(43);
				match(CLOSEBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(OPENBRACK);
				setState(46);
				match(CLOSEBRACK);
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

	public static class VarDeclContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__0);
				setState(50);
				((VarDeclContext)_localctx).identifier = identifier();
				setState(51);
				match(T__1);
				from cparse import addVariable
				addVariable((((VarDeclContext)_localctx).identifier!=null?_input.getText(((VarDeclContext)_localctx).identifier.start,((VarDeclContext)_localctx).identifier.stop):null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__0);
				setState(56);
				((VarDeclContext)_localctx).identifier = identifier();
				setState(57);
				match(T__1);
				setState(58);
				varDecl();
				from cparse import addVariable
				addVariable((((VarDeclContext)_localctx).identifier!=null?_input.getText(((VarDeclContext)_localctx).identifier.start,((VarDeclContext)_localctx).identifier.stop):null))
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

	public static class MultiStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MultiStatementContext multiStatement() {
			return getRuleContext(MultiStatementContext.class,0);
		}
		public MultiStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterMultiStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitMultiStatement(this);
		}
	}

	public final MultiStatementContext multiStatement() throws RecognitionException {
		MultiStatementContext _localctx = new MultiStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multiStatement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				statement();
				setState(65);
				multiStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(cgrammarParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(cgrammarParser.CLOSEPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				identifier();
				setState(71);
				match(T__2);
				setState(72);
				expr();
				setState(73);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__3);
				setState(76);
				match(OPENPAREN);
				setState(77);
				expr();
				setState(78);
				match(CLOSEPAREN);
				setState(79);
				statement();
				setState(80);
				match(T__4);
				setState(81);
				statement();
				from cparse import addIf
				addIf()
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(T__3);
				setState(86);
				match(OPENPAREN);
				setState(87);
				expr();
				setState(88);
				match(CLOSEPAREN);
				setState(89);
				statement();
				from cparse import addIf
				addIf()
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(T__5);
				setState(94);
				match(OPENPAREN);
				setState(95);
				expr();
				setState(96);
				match(CLOSEPAREN);
				setState(97);
				statement();
				from cparse import addWhile
				addWhile()
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				term();
				setState(106);
				match(T__6);
				setState(107);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				factor();
				setState(113);
				match(T__7);
				setState(114);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(cgrammarParser.OPENPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(cgrammarParser.CLOSEPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alpha:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				identifier();
				}
				break;
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				literal();
				}
				break;
			case OPENPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(OPENPAREN);
				setState(122);
				expr();
				setState(123);
				match(CLOSEPAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(cgrammarParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(cgrammarParser.Digit, i);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(Digit);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digit) {
				{
				{
				setState(128);
				match(Digit);
				}
				}
				setState(133);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Alpha() { return getToken(cgrammarParser.Alpha, 0); }
		public RestOfIdentifierContext restOfIdentifier() {
			return getRuleContext(RestOfIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(Alpha);
				setState(135);
				restOfIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(Alpha);
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

	public static class RestOfIdentifierContext extends ParserRuleContext {
		public AlphaNumContext alphaNum() {
			return getRuleContext(AlphaNumContext.class,0);
		}
		public RestOfIdentifierContext restOfIdentifier() {
			return getRuleContext(RestOfIdentifierContext.class,0);
		}
		public RestOfIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restOfIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterRestOfIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitRestOfIdentifier(this);
		}
	}

	public final RestOfIdentifierContext restOfIdentifier() throws RecognitionException {
		RestOfIdentifierContext _localctx = new RestOfIdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_restOfIdentifier);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				alphaNum();
				setState(140);
				restOfIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				alphaNum();
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

	public static class AlphaNumContext extends ParserRuleContext {
		public string value;
		public Token Alpha;
		public Token Digit;
		public TerminalNode Alpha() { return getToken(cgrammarParser.Alpha, 0); }
		public TerminalNode Digit() { return getToken(cgrammarParser.Digit, 0); }
		public AlphaNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphaNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).enterAlphaNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cgrammarListener ) ((cgrammarListener)listener).exitAlphaNum(this);
		}
	}

	public final AlphaNumContext alphaNum() throws RecognitionException {
		AlphaNumContext _localctx = new AlphaNumContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alphaNum);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alpha:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((AlphaNumContext)_localctx).Alpha = match(Alpha);
				_localctx.value = (((AlphaNumContext)_localctx).Alpha!=null?((AlphaNumContext)_localctx).Alpha.getText():null)
				}
				break;
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				((AlphaNumContext)_localctx).Digit = match(Digit);
				_localctx.value = (((AlphaNumContext)_localctx).Digit!=null?((AlphaNumContext)_localctx).Digit.getText():null)
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__8);
				_localctx.value = '_'
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u009c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3\5\5\5G\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6j"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\b\3\b\5\bx\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n\7\n\u0084\n\n\f\n\16\n\u0087\13"+
		"\n\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\f\3\f\5\f\u0092\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\2\2\2\u00a2\2\32\3\2\2\2\4\61\3\2\2\2\6@\3\2\2\2\bF\3\2\2\2\ni\3\2"+
		"\2\2\fp\3\2\2\2\16w\3\2\2\2\20\177\3\2\2\2\22\u0081\3\2\2\2\24\u008b\3"+
		"\2\2\2\26\u0091\3\2\2\2\30\u0099\3\2\2\2\32\33\7\22\2\2\33\34\7\20\2\2"+
		"\34\35\7\21\2\2\35\36\5\4\3\2\36\37\7\2\2\3\37 \b\2\1\2 !\b\2\1\2!\3\3"+
		"\2\2\2\"#\7\16\2\2#$\5\6\4\2$%\5\b\5\2%&\7\17\2\2&\62\3\2\2\2\'(\7\16"+
		"\2\2()\5\6\4\2)*\7\17\2\2*\62\3\2\2\2+,\7\16\2\2,-\5\b\5\2-.\7\17\2\2"+
		".\62\3\2\2\2/\60\7\16\2\2\60\62\7\17\2\2\61\"\3\2\2\2\61\'\3\2\2\2\61"+
		"+\3\2\2\2\61/\3\2\2\2\62\5\3\2\2\2\63\64\7\3\2\2\64\65\5\24\13\2\65\66"+
		"\7\4\2\2\66\67\b\4\1\2\678\b\4\1\28A\3\2\2\29:\7\3\2\2:;\5\24\13\2;<\7"+
		"\4\2\2<=\5\6\4\2=>\b\4\1\2>?\b\4\1\2?A\3\2\2\2@\63\3\2\2\2@9\3\2\2\2A"+
		"\7\3\2\2\2BC\5\n\6\2CD\5\b\5\2DG\3\2\2\2EG\5\n\6\2FB\3\2\2\2FE\3\2\2\2"+
		"G\t\3\2\2\2HI\5\24\13\2IJ\7\5\2\2JK\5\f\7\2KL\7\4\2\2Lj\3\2\2\2MN\7\6"+
		"\2\2NO\7\20\2\2OP\5\f\7\2PQ\7\21\2\2QR\5\n\6\2RS\7\7\2\2ST\5\n\6\2TU\b"+
		"\6\1\2UV\b\6\1\2Vj\3\2\2\2WX\7\6\2\2XY\7\20\2\2YZ\5\f\7\2Z[\7\21\2\2["+
		"\\\5\n\6\2\\]\b\6\1\2]^\b\6\1\2^j\3\2\2\2_`\7\b\2\2`a\7\20\2\2ab\5\f\7"+
		"\2bc\7\21\2\2cd\5\n\6\2de\b\6\1\2ef\b\6\1\2fj\3\2\2\2gj\5\4\3\2hj\7\4"+
		"\2\2iH\3\2\2\2iM\3\2\2\2iW\3\2\2\2i_\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\13\3"+
		"\2\2\2kl\5\16\b\2lm\7\t\2\2mn\5\f\7\2nq\3\2\2\2oq\5\16\b\2pk\3\2\2\2p"+
		"o\3\2\2\2q\r\3\2\2\2rs\5\20\t\2st\7\n\2\2tu\5\16\b\2ux\3\2\2\2vx\5\20"+
		"\t\2wr\3\2\2\2wv\3\2\2\2x\17\3\2\2\2y\u0080\5\24\13\2z\u0080\5\22\n\2"+
		"{|\7\20\2\2|}\5\f\7\2}~\7\21\2\2~\u0080\3\2\2\2\177y\3\2\2\2\177z\3\2"+
		"\2\2\177{\3\2\2\2\u0080\21\3\2\2\2\u0081\u0085\7\r\2\2\u0082\u0084\7\r"+
		"\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\f\2"+
		"\2\u0089\u008c\5\26\f\2\u008a\u008c\7\f\2\2\u008b\u0088\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\25\3\2\2\2\u008d\u008e\5\30\r\2\u008e\u008f\5\26"+
		"\f\2\u008f\u0092\3\2\2\2\u0090\u0092\5\30\r\2\u0091\u008d\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\27\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u009a\b\r\1"+
		"\2\u0095\u0096\7\r\2\2\u0096\u009a\b\r\1\2\u0097\u0098\7\13\2\2\u0098"+
		"\u009a\b\r\1\2\u0099\u0093\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\31\3\2\2\2\r\61@Fipw\177\u0085\u008b\u0091\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}