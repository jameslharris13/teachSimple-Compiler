// Generated from .\teachSimple.g4 by ANTLR 4.6
package teachSimple;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class teachSimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, Integer=38, 
		IDENT=39, NUM_INT=40, COMMENT=41, STRING=42, COLON=43, PLUS=44, MINUS=45, 
		STAR=46, SLASH=47, ASSIGN=48, COMMA=49, SEMI=50, EQUAL=51, NOT_EQUAL=52, 
		LT=53, LE=54, GE=55, GT=56, LPAREN=57, RPAREN=58, LBRACK=59, RBRACK=60, 
		WHITESPACE=61, DOT=62, DOTDOT=63;
	public static final int
		RULE_program = 0, RULE_programName = 1, RULE_identifier = 2, RULE_exitStatement = 3, 
		RULE_block = 4, RULE_labelDeclarationPart = 5, RULE_label = 6, RULE_constant = 7, 
		RULE_unsignedNumber = 8, RULE_unsignedInteger = 9, RULE_typeDefinitionPart = 10, 
		RULE_typeDefinition = 11, RULE_functionType = 12, RULE_functionDeclaration = 13, 
		RULE_resultType = 14, RULE_type = 15, RULE_structuredType = 16, RULE_unpackedStructuredType = 17, 
		RULE_simpleType = 18, RULE_formalParameterList = 19, RULE_formalParameterSection = 20, 
		RULE_parameterGroup = 21, RULE_typeIdentifier = 22, RULE_stringtype = 23, 
		RULE_arrayType = 24, RULE_typeList = 25, RULE_indexType = 26, RULE_componentType = 27, 
		RULE_identifierList = 28, RULE_string = 29, RULE_sign = 30, RULE_variableDeclarationPart = 31, 
		RULE_variableDeclaration = 32, RULE_structuredStatement = 33, RULE_compoundStatement = 34, 
		RULE_statements = 35, RULE_conditionalStatement = 36, RULE_ifStatement = 37, 
		RULE_switchStatement = 38, RULE_caseListElement = 39, RULE_constList = 40, 
		RULE_statement = 41, RULE_unlabelledStatement = 42, RULE_simpleStatement = 43, 
		RULE_assignmentStatement = 44, RULE_variable = 45, RULE_expression = 46, 
		RULE_simpleExpression = 47, RULE_term = 48, RULE_signedFactor = 49, RULE_factor = 50, 
		RULE_unsignedConstant = 51, RULE_functionDesignator = 52, RULE_parameterList = 53, 
		RULE_actualParameter = 54, RULE_set = 55, RULE_elementList = 56, RULE_element = 57, 
		RULE_repetetiveStatement = 58, RULE_whileStatement = 59, RULE_repeatStatement = 60, 
		RULE_forStatement = 61, RULE_forList = 62, RULE_initialValue = 63, RULE_finalValue = 64, 
		RULE_read = 65, RULE_write = 66;
	public static final String[] ruleNames = {
		"program", "programName", "identifier", "exitStatement", "block", "labelDeclarationPart", 
		"label", "constant", "unsignedNumber", "unsignedInteger", "typeDefinitionPart", 
		"typeDefinition", "functionType", "functionDeclaration", "resultType", 
		"type", "structuredType", "unpackedStructuredType", "simpleType", "formalParameterList", 
		"formalParameterSection", "parameterGroup", "typeIdentifier", "stringtype", 
		"arrayType", "typeList", "indexType", "componentType", "identifierList", 
		"string", "sign", "variableDeclarationPart", "variableDeclaration", "structuredStatement", 
		"compoundStatement", "statements", "conditionalStatement", "ifStatement", 
		"switchStatement", "caseListElement", "constList", "statement", "unlabelledStatement", 
		"simpleStatement", "assignmentStatement", "variable", "expression", "simpleExpression", 
		"term", "signedFactor", "factor", "unsignedConstant", "functionDesignator", 
		"parameterList", "actualParameter", "set", "elementList", "element", "repetetiveStatement", 
		"whileStatement", "repeatStatement", "forStatement", "forList", "initialValue", 
		"finalValue", "read", "write"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'UNIT'", "'EXIT'", "'LABEL'", "'TYPE'", "'FUNCTION'", 
		"'PACKED'", "'VAR'", "'CHAR'", "'BOOLEAN'", "'INTEGER'", "'STRING'", "'ARRAY'", 
		"'OF'", "'BEGIN'", "'END'", "'IF'", "'THEN'", "'ELSE'", "'CASE'", "'IN'", 
		"'OR'", "'DIV'", "'MOD'", "'AND'", "'NOT'", "'NIL'", "'WHILE'", "'DO'", 
		"'REPEAT'", "'FOR'", "'TO'", "'DOWNTO'", "'Read'", "'read'", "'Write'", 
		"'write'", null, null, null, null, null, "':'", "'+'", "'-'", "'*'", "'/'", 
		"'='", "','", "';'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'('", 
		"')'", "'['", "']'", "' '", "'.'", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "Integer", "IDENT", "NUM_INT", "COMMENT", "STRING", "COLON", 
		"PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "EQUAL", 
		"NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"WHITESPACE", "DOT", "DOTDOT"
	};
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
	public String getGrammarFileName() { return "teachSimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public teachSimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramNameContext programName() {
			return getRuleContext(ProgramNameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			programName();
			setState(135);
			block();
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

	public static class ProgramNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitProgramName(this);
		}
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programName);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__0);
				setState(138);
				identifier();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(139);
					match(LPAREN);
					setState(140);
					identifierList();
					setState(141);
					match(RPAREN);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__1);
				setState(146);
				identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(teachSimpleParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENT);
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

	public static class ExitStatementContext extends ParserRuleContext {
		public ExitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterExitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitExitStatement(this);
		}
	}

	public final ExitStatementContext exitStatement() throws RecognitionException {
		ExitStatementContext _localctx = new ExitStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__2);
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
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<LabelDeclarationPartContext> labelDeclarationPart() {
			return getRuleContexts(LabelDeclarationPartContext.class);
		}
		public LabelDeclarationPartContext labelDeclarationPart(int i) {
			return getRuleContext(LabelDeclarationPartContext.class,i);
		}
		public List<TypeDefinitionPartContext> typeDefinitionPart() {
			return getRuleContexts(TypeDefinitionPartContext.class);
		}
		public TypeDefinitionPartContext typeDefinitionPart(int i) {
			return getRuleContext(TypeDefinitionPartContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7))) != 0)) {
				{
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(153);
					labelDeclarationPart();
					}
					break;
				case T__4:
					{
					setState(154);
					typeDefinitionPart();
					}
					break;
				case T__7:
					{
					setState(155);
					variableDeclarationPart();
					}
					break;
				case T__5:
					{
					setState(156);
					functionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			compoundStatement();
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

	public static class LabelDeclarationPartContext extends ParserRuleContext {
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public LabelDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterLabelDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitLabelDeclarationPart(this);
		}
	}

	public final LabelDeclarationPartContext labelDeclarationPart() throws RecognitionException {
		LabelDeclarationPartContext _localctx = new LabelDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__3);
			setState(165);
			label();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				label();
				}
				}
				setState(172);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(teachSimpleParser.Integer, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Integer);
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

	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				sign();
				setState(177);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				sign();
				setState(181);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				string();
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitUnsignedNumber(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unsignedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			unsignedInteger();
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

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(teachSimpleParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitUnsignedInteger(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(NUM_INT);
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

	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(teachSimpleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(teachSimpleParser.SEMI, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterTypeDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitTypeDefinitionPart(this);
		}
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__4);
			setState(191);
			typeDefinition();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					match(SEMI);
					setState(193);
					typeDefinition();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(199);
			match(SEMI);
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(teachSimpleParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			identifier();
			setState(202);
			match(EQUAL);
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case IDENT:
				{
				setState(203);
				type();
				}
				break;
			case T__5:
				{
				setState(204);
				functionType();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(teachSimpleParser.COMMA, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__5);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(208);
				formalParameterList();
				}
			}

			setState(211);
			match(COMMA);
			setState(212);
			resultType();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(teachSimpleParser.WHITESPACE, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__5);
			setState(215);
			identifier();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(216);
				formalParameterList();
				}
			}

			setState(219);
			match(WHITESPACE);
			setState(220);
			resultType();
			{
			setState(221);
			block();
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitResultType(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			typeIdentifier();
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

	public static class TypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				simpleType();
				}
				break;
			case T__6:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				structuredType();
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

	public static class StructuredTypeContext extends ParserRuleContext {
		public UnpackedStructuredTypeContext unpackedStructuredType() {
			return getRuleContext(UnpackedStructuredTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitStructuredType(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_structuredType);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__6);
				setState(230);
				unpackedStructuredType();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				unpackedStructuredType();
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

	public static class UnpackedStructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterUnpackedStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitUnpackedStructuredType(this);
		}
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unpackedStructuredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			arrayType();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public StringtypeContext stringtype() {
			return getRuleContext(StringtypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simpleType);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				stringtype();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(LPAREN);
			setState(241);
			formalParameterSection();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				formalParameterSection();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(RPAREN);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitFormalParameterSection(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formalParameterSection);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				parameterGroup();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__7);
				setState(253);
				parameterGroup();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(T__5);
				setState(255);
				parameterGroup();
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitParameterGroup(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			identifierList();
			setState(259);
			typeIdentifier();
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

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeIdentifier);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				identifier();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				match(T__11);
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

	public static class StringtypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterStringtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitStringtype(this);
		}
	}

	public final StringtypeContext stringtype() throws RecognitionException {
		StringtypeContext _localctx = new StringtypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__11);
			setState(269);
			match(LPAREN);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(270);
				identifier();
				}
				break;
			case NUM_INT:
				{
				setState(271);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(274);
			match(RPAREN);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(teachSimpleParser.LBRACK, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(teachSimpleParser.RBRACK, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__12);
			setState(277);
			match(LBRACK);
			setState(278);
			typeList();
			setState(279);
			match(RBRACK);
			setState(280);
			match(T__13);
			setState(281);
			componentType();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			indexType();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(284);
				match(COMMA);
				setState(285);
				indexType();
				}
				}
				setState(290);
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

	public static class IndexTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitIndexType(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			simpleType();
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

	public static class ComponentTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitComponentType(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			type();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			identifier();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				identifier();
				}
				}
				setState(302);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(teachSimpleParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(teachSimpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(teachSimpleParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitVariableDeclarationPart(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__7);
			setState(308);
			variableDeclaration();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(309);
				match(COMMA);
				setState(310);
				variableDeclaration();
				}
				}
				setState(315);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(teachSimpleParser.WHITESPACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			identifierList();
			setState(317);
			match(WHITESPACE);
			setState(318);
			type();
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

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitStructuredStatement(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structuredStatement);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				compoundStatement();
				}
				break;
			case T__16:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				conditionalStatement();
				}
				break;
			case T__27:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				repetetiveStatement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__14);
			setState(326);
			statements();
			setState(327);
			match(T__15);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(teachSimpleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(teachSimpleParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			statement();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(330);
				match(SEMI);
				setState(331);
				statement();
				}
				}
				setState(336);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitConditionalStatement(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conditionalStatement);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				ifStatement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				switchStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__16);
			setState(342);
			expression();
			setState(343);
			match(T__17);
			setState(344);
			statement();
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(345);
				match(T__18);
				setState(346);
				statement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switchStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__19);
			setState(350);
			expression();
			setState(351);
			caseListElement();
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(352);
					caseListElement();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(358);
				match(T__18);
				setState(359);
				statements();
				}
			}

			setState(362);
			match(T__15);
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

	public static class CaseListElementContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitCaseListElement(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			constList();
			setState(365);
			statement();
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

	public static class ConstListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitConstList(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			constant();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				constant();
				}
				}
				setState(374);
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

	public static class StatementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(teachSimpleParser.WHITESPACE, 0); }
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_statement);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				label();
				setState(376);
				match(WHITESPACE);
				setState(377);
				unlabelledStatement();
				}
				break;
			case T__2:
			case T__14:
			case T__16:
			case T__19:
			case T__27:
			case T__29:
			case T__30:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				unlabelledStatement();
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

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitUnlabelledStatement(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unlabelledStatement);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				simpleStatement();
				}
				break;
			case T__14:
			case T__16:
			case T__19:
			case T__27:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				structuredStatement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ExitStatementContext exitStatement() {
			return getRuleContext(ExitStatementContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_simpleStatement);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				assignmentStatement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				exitStatement();
				}
				break;
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				write();
				}
				break;
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				read();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(teachSimpleParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			variable();
			setState(393);
			match(ASSIGN);
			setState(394);
			expression();
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(teachSimpleParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(teachSimpleParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(teachSimpleParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(teachSimpleParser.RBRACK, i);
		}
		public List<TerminalNode> DOT() { return getTokens(teachSimpleParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(teachSimpleParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(396);
			identifier();
			}
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(397);
					match(LBRACK);
					setState(398);
					expression();
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(399);
						match(COMMA);
						setState(400);
						expression();
						}
						}
						setState(405);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(406);
					match(RBRACK);
					}
					break;
				case DOT:
					{
					setState(408);
					match(DOT);
					setState(409);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(414);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(teachSimpleParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(teachSimpleParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(teachSimpleParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(teachSimpleParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> LT() { return getTokens(teachSimpleParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(teachSimpleParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(teachSimpleParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(teachSimpleParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(teachSimpleParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(teachSimpleParser.GE, i);
		}
		public List<TerminalNode> GT() { return getTokens(teachSimpleParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(teachSimpleParser.GT, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			simpleExpression();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				{
				setState(416);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(417);
				simpleExpression();
				}
				}
				setState(422);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(teachSimpleParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(teachSimpleParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(teachSimpleParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(teachSimpleParser.MINUS, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_simpleExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			term();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(425);
					term();
					}
					} 
				}
				setState(430);
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
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(teachSimpleParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(teachSimpleParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(teachSimpleParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(teachSimpleParser.SLASH, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			signedFactor();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(432);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(433);
				signedFactor();
				}
				}
				setState(438);
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

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(teachSimpleParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(teachSimpleParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitSignedFactor(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(439);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(442);
			factor();
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_factor);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(LPAREN);
				setState(446);
				expression();
				setState(447);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				match(T__25);
				setState(453);
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitUnsignedConstant(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unsignedConstant);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				unsignedNumber();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				string();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(T__26);
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

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitFunctionDesignator(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			identifier();
			setState(462);
			match(LPAREN);
			setState(463);
			parameterList();
			setState(464);
			match(RPAREN);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			actualParameter();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(467);
				match(COMMA);
				setState(468);
				actualParameter();
				}
				}
				setState(473);
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(teachSimpleParser.COMMA, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitActualParameter(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_actualParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			expression();
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(475);
				match(COMMA);
				setState(476);
				unsignedInteger();
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(teachSimpleParser.LBRACK, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(teachSimpleParser.RBRACK, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(LBRACK);
			setState(480);
			elementList();
			setState(481);
			match(RBRACK);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(teachSimpleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(teachSimpleParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementList);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case IDENT:
			case NUM_INT:
			case STRING:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				element();
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(484);
					match(COMMA);
					setState(485);
					element();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(teachSimpleParser.DOTDOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			expression();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(495);
				match(DOTDOT);
				setState(496);
				expression();
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

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterRepetetiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitRepetetiveStatement(this);
		}
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_repetetiveStatement);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				whileStatement();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				repeatStatement();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				forStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__27);
			setState(505);
			expression();
			setState(506);
			match(T__28);
			setState(507);
			statement();
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(teachSimpleParser.LBRACK, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(teachSimpleParser.RBRACK, 0); }
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitRepeatStatement(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__29);
			setState(510);
			identifier();
			setState(511);
			match(LBRACK);
			setState(512);
			statements();
			setState(513);
			match(RBRACK);
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

	public static class ForStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(teachSimpleParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__30);
			setState(516);
			identifier();
			setState(517);
			match(ASSIGN);
			setState(518);
			forList();
			setState(519);
			match(T__28);
			setState(520);
			statement();
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

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitForList(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			initialValue();
			setState(523);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(524);
			finalValue();
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

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitInitialValue(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			expression();
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

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitFinalValue(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			expression();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(531);
				match(LPAREN);
				}
				break;
			}
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(534);
				string();
				}
				break;
			case 2:
				{
				setState(535);
				variable();
				}
				break;
			case 3:
				{
				setState(536);
				expression();
				}
				break;
			}
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(539);
				match(RPAREN);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(teachSimpleParser.STRING, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(543);
			match(LPAREN);
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(544);
				string();
				}
				break;
			case 2:
				{
				setState(545);
				expression();
				}
				break;
			case 3:
				{
				setState(546);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(547);
				constant();
				}
				break;
			}
			setState(550);
			match(RPAREN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u022b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\u0092\n\3\3\3\3\3\5\3\u0096\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ab"+
		"\n\7\f\7\16\7\u00ae\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00bb\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16\f"+
		"\u00c8\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00d0\n\r\3\16\3\16\5\16\u00d4"+
		"\n\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00dc\n\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\3\22\5\22\u00eb\n\22\3"+
		"\23\3\23\3\24\3\24\5\24\u00f1\n\24\3\25\3\25\3\25\3\25\7\25\u00f7\n\25"+
		"\f\25\16\25\u00fa\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0103"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u010d\n\30\3\31\3\31"+
		"\3\31\3\31\5\31\u0113\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\7\33\u0121\n\33\f\33\16\33\u0124\13\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\7\36\u012d\n\36\f\36\16\36\u0130\13\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\7!\u013a\n!\f!\16!\u013d\13!\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\5#\u0146\n#\3$\3$\3$\3$\3%\3%\3%\7%\u014f\n%\f%\16%\u0152\13%\3&\3"+
		"&\5&\u0156\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u015e\n\'\3(\3(\3(\3(\7(\u0164"+
		"\n(\f(\16(\u0167\13(\3(\3(\5(\u016b\n(\3(\3(\3)\3)\3)\3*\3*\3*\7*\u0175"+
		"\n*\f*\16*\u0178\13*\3+\3+\3+\3+\3+\5+\u017f\n+\3,\3,\5,\u0183\n,\3-\3"+
		"-\3-\3-\5-\u0189\n-\3.\3.\3.\3.\3/\3/\3/\3/\3/\7/\u0194\n/\f/\16/\u0197"+
		"\13/\3/\3/\3/\3/\7/\u019d\n/\f/\16/\u01a0\13/\3\60\3\60\3\60\7\60\u01a5"+
		"\n\60\f\60\16\60\u01a8\13\60\3\61\3\61\3\61\7\61\u01ad\n\61\f\61\16\61"+
		"\u01b0\13\61\3\62\3\62\3\62\7\62\u01b5\n\62\f\62\16\62\u01b8\13\62\3\63"+
		"\5\63\u01bb\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u01c9\n\64\3\65\3\65\3\65\5\65\u01ce\n\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\7\67\u01d8\n\67\f\67\16\67\u01db\13\67\38\38\3"+
		"8\58\u01e0\n8\39\39\39\39\3:\3:\3:\7:\u01e9\n:\f:\16:\u01ec\13:\3:\5:"+
		"\u01ef\n:\3;\3;\3;\5;\u01f4\n;\3<\3<\3<\5<\u01f9\n<\3=\3=\3=\3=\3=\3>"+
		"\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\5C"+
		"\u0217\nC\3C\3C\3C\5C\u021c\nC\3C\5C\u021f\nC\3D\3D\3D\3D\3D\3D\5D\u0227"+
		"\nD\3D\3D\3D\3\u0165\2E\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\2\t\3\2./\4\2\27\27\65:\4\2\30\30./\4\2\31\33\60\61\3\2\"#\3\2"+
		"$%\3\2&\'\u022e\2\u0088\3\2\2\2\4\u0095\3\2\2\2\6\u0097\3\2\2\2\b\u0099"+
		"\3\2\2\2\n\u00a1\3\2\2\2\f\u00a6\3\2\2\2\16\u00af\3\2\2\2\20\u00ba\3\2"+
		"\2\2\22\u00bc\3\2\2\2\24\u00be\3\2\2\2\26\u00c0\3\2\2\2\30\u00cb\3\2\2"+
		"\2\32\u00d1\3\2\2\2\34\u00d8\3\2\2\2\36\u00e1\3\2\2\2 \u00e5\3\2\2\2\""+
		"\u00ea\3\2\2\2$\u00ec\3\2\2\2&\u00f0\3\2\2\2(\u00f2\3\2\2\2*\u0102\3\2"+
		"\2\2,\u0104\3\2\2\2.\u010c\3\2\2\2\60\u010e\3\2\2\2\62\u0116\3\2\2\2\64"+
		"\u011d\3\2\2\2\66\u0125\3\2\2\28\u0127\3\2\2\2:\u0129\3\2\2\2<\u0131\3"+
		"\2\2\2>\u0133\3\2\2\2@\u0135\3\2\2\2B\u013e\3\2\2\2D\u0145\3\2\2\2F\u0147"+
		"\3\2\2\2H\u014b\3\2\2\2J\u0155\3\2\2\2L\u0157\3\2\2\2N\u015f\3\2\2\2P"+
		"\u016e\3\2\2\2R\u0171\3\2\2\2T\u017e\3\2\2\2V\u0182\3\2\2\2X\u0188\3\2"+
		"\2\2Z\u018a\3\2\2\2\\\u018e\3\2\2\2^\u01a1\3\2\2\2`\u01a9\3\2\2\2b\u01b1"+
		"\3\2\2\2d\u01ba\3\2\2\2f\u01c8\3\2\2\2h\u01cd\3\2\2\2j\u01cf\3\2\2\2l"+
		"\u01d4\3\2\2\2n\u01dc\3\2\2\2p\u01e1\3\2\2\2r\u01ee\3\2\2\2t\u01f0\3\2"+
		"\2\2v\u01f8\3\2\2\2x\u01fa\3\2\2\2z\u01ff\3\2\2\2|\u0205\3\2\2\2~\u020c"+
		"\3\2\2\2\u0080\u0210\3\2\2\2\u0082\u0212\3\2\2\2\u0084\u0214\3\2\2\2\u0086"+
		"\u0220\3\2\2\2\u0088\u0089\5\4\3\2\u0089\u008a\5\n\6\2\u008a\3\3\2\2\2"+
		"\u008b\u008c\7\3\2\2\u008c\u0091\5\6\4\2\u008d\u008e\7;\2\2\u008e\u008f"+
		"\5:\36\2\u008f\u0090\7<\2\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0094\7\4\2\2\u0094\u0096\5\6"+
		"\4\2\u0095\u008b\3\2\2\2\u0095\u0093\3\2\2\2\u0096\5\3\2\2\2\u0097\u0098"+
		"\7)\2\2\u0098\7\3\2\2\2\u0099\u009a\7\5\2\2\u009a\t\3\2\2\2\u009b\u00a0"+
		"\5\f\7\2\u009c\u00a0\5\26\f\2\u009d\u00a0\5@!\2\u009e\u00a0\5\34\17\2"+
		"\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5F$\2\u00a5\13\3\2\2\2"+
		"\u00a6\u00a7\7\6\2\2\u00a7\u00ac\5\16\b\2\u00a8\u00a9\7\63\2\2\u00a9\u00ab"+
		"\5\16\b\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\r\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7"+
		"(\2\2\u00b0\17\3\2\2\2\u00b1\u00bb\5\22\n\2\u00b2\u00b3\5> \2\u00b3\u00b4"+
		"\5\22\n\2\u00b4\u00bb\3\2\2\2\u00b5\u00bb\5\6\4\2\u00b6\u00b7\5> \2\u00b7"+
		"\u00b8\5\6\4\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb\5<\37\2\u00ba\u00b1\3\2"+
		"\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\21\3\2\2\2\u00bc\u00bd\5\24\13\2\u00bd\23\3\2\2\2"+
		"\u00be\u00bf\7*\2\2\u00bf\25\3\2\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c6\5"+
		"\30\r\2\u00c2\u00c3\7\64\2\2\u00c3\u00c5\5\30\r\2\u00c4\u00c2\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\64\2\2\u00ca\27\3\2\2\2\u00cb"+
		"\u00cc\5\6\4\2\u00cc\u00cf\7\65\2\2\u00cd\u00d0\5 \21\2\u00ce\u00d0\5"+
		"\32\16\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\31\3\2\2\2\u00d1"+
		"\u00d3\7\b\2\2\u00d2\u00d4\5(\25\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\63\2\2\u00d6\u00d7\5\36\20\2\u00d7"+
		"\33\3\2\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00db\5\6\4\2\u00da\u00dc\5(\25"+
		"\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\7?\2\2\u00de\u00df\5\36\20\2\u00df\u00e0\5\n\6\2\u00e0\35\3\2\2\2\u00e1"+
		"\u00e2\5.\30\2\u00e2\37\3\2\2\2\u00e3\u00e6\5&\24\2\u00e4\u00e6\5\"\22"+
		"\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00e8"+
		"\7\t\2\2\u00e8\u00eb\5$\23\2\u00e9\u00eb\5$\23\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\5\62\32\2\u00ed%\3\2\2\2\u00ee"+
		"\u00f1\5.\30\2\u00ef\u00f1\5\60\31\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3"+
		"\2\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\7;\2\2\u00f3\u00f8\5*\26\2\u00f4\u00f5"+
		"\7\63\2\2\u00f5\u00f7\5*\26\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fc\7<\2\2\u00fc)\3\2\2\2\u00fd\u0103\5,\27\2\u00fe\u00ff"+
		"\7\n\2\2\u00ff\u0103\5,\27\2\u0100\u0101\7\b\2\2\u0101\u0103\5,\27\2\u0102"+
		"\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0100\3\2\2\2\u0103+\3\2\2\2"+
		"\u0104\u0105\5:\36\2\u0105\u0106\5.\30\2\u0106-\3\2\2\2\u0107\u010d\5"+
		"\6\4\2\u0108\u010d\7\13\2\2\u0109\u010d\7\f\2\2\u010a\u010d\7\r\2\2\u010b"+
		"\u010d\7\16\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d/\3\2\2\2\u010e\u010f"+
		"\7\16\2\2\u010f\u0112\7;\2\2\u0110\u0113\5\6\4\2\u0111\u0113\5\22\n\2"+
		"\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115"+
		"\7<\2\2\u0115\61\3\2\2\2\u0116\u0117\7\17\2\2\u0117\u0118\7=\2\2\u0118"+
		"\u0119\5\64\33\2\u0119\u011a\7>\2\2\u011a\u011b\7\20\2\2\u011b\u011c\5"+
		"8\35\2\u011c\63\3\2\2\2\u011d\u0122\5\66\34\2\u011e\u011f\7\63\2\2\u011f"+
		"\u0121\5\66\34\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u0123\65\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0126\5&\24\2\u0126\67\3\2\2\2\u0127\u0128\5 \21\2\u01289\3\2\2\2\u0129"+
		"\u012e\5\6\4\2\u012a\u012b\7\63\2\2\u012b\u012d\5\6\4\2\u012c\u012a\3"+
		"\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		";\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7,\2\2\u0132=\3\2\2\2\u0133"+
		"\u0134\t\2\2\2\u0134?\3\2\2\2\u0135\u0136\7\n\2\2\u0136\u013b\5B\"\2\u0137"+
		"\u0138\7\63\2\2\u0138\u013a\5B\"\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cA\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u013f\5:\36\2\u013f\u0140\7?\2\2\u0140\u0141\5 \21\2\u0141"+
		"C\3\2\2\2\u0142\u0146\5F$\2\u0143\u0146\5J&\2\u0144\u0146\5v<\2\u0145"+
		"\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146E\3\2\2\2"+
		"\u0147\u0148\7\21\2\2\u0148\u0149\5H%\2\u0149\u014a\7\22\2\2\u014aG\3"+
		"\2\2\2\u014b\u0150\5T+\2\u014c\u014d\7\64\2\2\u014d\u014f\5T+\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151I\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0156\5L\'\2\u0154\u0156"+
		"\5N(\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156K\3\2\2\2\u0157\u0158"+
		"\7\23\2\2\u0158\u0159\5^\60\2\u0159\u015a\7\24\2\2\u015a\u015d\5T+\2\u015b"+
		"\u015c\7\25\2\2\u015c\u015e\5T+\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015eM\3\2\2\2\u015f\u0160\7\26\2\2\u0160\u0161\5^\60\2\u0161\u0165"+
		"\5P)\2\u0162\u0164\5P)\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016a\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0168\u0169\7\25\2\2\u0169\u016b\5H%\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7\22\2\2\u016dO\3\2\2\2"+
		"\u016e\u016f\5R*\2\u016f\u0170\5T+\2\u0170Q\3\2\2\2\u0171\u0176\5\20\t"+
		"\2\u0172\u0173\7\63\2\2\u0173\u0175\5\20\t\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177S\3\2\2\2"+
		"\u0178\u0176\3\2\2\2\u0179\u017a\5\16\b\2\u017a\u017b\7?\2\2\u017b\u017c"+
		"\5V,\2\u017c\u017f\3\2\2\2\u017d\u017f\5V,\2\u017e\u0179\3\2\2\2\u017e"+
		"\u017d\3\2\2\2\u017fU\3\2\2\2\u0180\u0183\5X-\2\u0181\u0183\5D#\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183W\3\2\2\2\u0184\u0189\5Z.\2\u0185"+
		"\u0189\5\b\5\2\u0186\u0189\5\u0086D\2\u0187\u0189\5\u0084C\2\u0188\u0184"+
		"\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"Y\3\2\2\2\u018a\u018b\5\\/\2\u018b\u018c\7\62\2\2\u018c\u018d\5^\60\2"+
		"\u018d[\3\2\2\2\u018e\u019e\5\6\4\2\u018f\u0190\7=\2\2\u0190\u0195\5^"+
		"\60\2\u0191\u0192\7\63\2\2\u0192\u0194\5^\60\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7>\2\2\u0199\u019d\3\2\2\2\u019a"+
		"\u019b\7@\2\2\u019b\u019d\5\6\4\2\u019c\u018f\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"]\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a6\5`\61\2\u01a2\u01a3\t\3\2\2"+
		"\u01a3\u01a5\5`\61\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7_\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01ae\5b\62\2\u01aa\u01ab\t\4\2\2\u01ab\u01ad\5b\62\2\u01ac\u01aa\3\2"+
		"\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"a\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b6\5d\63\2\u01b2\u01b3\t\5\2\2"+
		"\u01b3\u01b5\5d\63\2\u01b4\u01b2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7c\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01bb\t\2\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\5f\64\2\u01bde\3\2\2\2\u01be\u01c9\5\\/\2\u01bf\u01c0"+
		"\7;\2\2\u01c0\u01c1\5^\60\2\u01c1\u01c2\7<\2\2\u01c2\u01c9\3\2\2\2\u01c3"+
		"\u01c9\5j\66\2\u01c4\u01c9\5h\65\2\u01c5\u01c9\5p9\2\u01c6\u01c7\7\34"+
		"\2\2\u01c7\u01c9\5f\64\2\u01c8\u01be\3\2\2\2\u01c8\u01bf\3\2\2\2\u01c8"+
		"\u01c3\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9g\3\2\2\2\u01ca\u01ce\5\22\n\2\u01cb\u01ce\5<\37\2\u01cc\u01ce"+
		"\7\35\2\2\u01cd\u01ca\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2"+
		"\u01cei\3\2\2\2\u01cf\u01d0\5\6\4\2\u01d0\u01d1\7;\2\2\u01d1\u01d2\5l"+
		"\67\2\u01d2\u01d3\7<\2\2\u01d3k\3\2\2\2\u01d4\u01d9\5n8\2\u01d5\u01d6"+
		"\7\63\2\2\u01d6\u01d8\5n8\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01dam\3\2\2\2\u01db\u01d9\3\2\2\2"+
		"\u01dc\u01df\5^\60\2\u01dd\u01de\7\63\2\2\u01de\u01e0\5\24\13\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0o\3\2\2\2\u01e1\u01e2\7=\2\2\u01e2"+
		"\u01e3\5r:\2\u01e3\u01e4\7>\2\2\u01e4q\3\2\2\2\u01e5\u01ea\5t;\2\u01e6"+
		"\u01e7\7\63\2\2\u01e7\u01e9\5t;\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2"+
		"\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ef\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01e5\3\2\2\2\u01ee\u01ed\3\2"+
		"\2\2\u01efs\3\2\2\2\u01f0\u01f3\5^\60\2\u01f1\u01f2\7A\2\2\u01f2\u01f4"+
		"\5^\60\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4u\3\2\2\2\u01f5"+
		"\u01f9\5x=\2\u01f6\u01f9\5z>\2\u01f7\u01f9\5|?\2\u01f8\u01f5\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9w\3\2\2\2\u01fa\u01fb\7\36\2\2"+
		"\u01fb\u01fc\5^\60\2\u01fc\u01fd\7\37\2\2\u01fd\u01fe\5T+\2\u01fey\3\2"+
		"\2\2\u01ff\u0200\7 \2\2\u0200\u0201\5\6\4\2\u0201\u0202\7=\2\2\u0202\u0203"+
		"\5H%\2\u0203\u0204\7>\2\2\u0204{\3\2\2\2\u0205\u0206\7!\2\2\u0206\u0207"+
		"\5\6\4\2\u0207\u0208\7\62\2\2\u0208\u0209\5~@\2\u0209\u020a\7\37\2\2\u020a"+
		"\u020b\5T+\2\u020b}\3\2\2\2\u020c\u020d\5\u0080A\2\u020d\u020e\t\6\2\2"+
		"\u020e\u020f\5\u0082B\2\u020f\177\3\2\2\2\u0210\u0211\5^\60\2\u0211\u0081"+
		"\3\2\2\2\u0212\u0213\5^\60\2\u0213\u0083\3\2\2\2\u0214\u0216\t\7\2\2\u0215"+
		"\u0217\7;\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021b\3\2"+
		"\2\2\u0218\u021c\5<\37\2\u0219\u021c\5\\/\2\u021a\u021c\5^\60\2\u021b"+
		"\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021e\3\2\2\2\u021d\u021f\7<\2\2\u021e\u021d\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0085\3\2\2\2\u0220\u0221\t\b\2\2\u0221\u0226\7;"+
		"\2\2\u0222\u0227\5<\37\2\u0223\u0227\5^\60\2\u0224\u0227\7,\2\2\u0225"+
		"\u0227\5\20\t\2\u0226\u0222\3\2\2\2\u0226\u0223\3\2\2\2\u0226\u0224\3"+
		"\2\2\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7<\2\2\u0229"+
		"\u0087\3\2\2\2\63\u0091\u0095\u009f\u00a1\u00ac\u00ba\u00c6\u00cf\u00d3"+
		"\u00db\u00e5\u00ea\u00f0\u00f8\u0102\u010c\u0112\u0122\u012e\u013b\u0145"+
		"\u0150\u0155\u015d\u0165\u016a\u0176\u017e\u0182\u0188\u0195\u019c\u019e"+
		"\u01a6\u01ae\u01b6\u01ba\u01c8\u01cd\u01d9\u01df\u01ea\u01ee\u01f3\u01f8"+
		"\u0216\u021b\u021e\u0226";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}