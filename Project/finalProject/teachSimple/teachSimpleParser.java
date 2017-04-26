// Generated from teachSimple.g4 by ANTLR 4.6
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		Integer=46, Double=47, IDENT=48, NUM_INT=49, NUM_DOUBLE=50, COMMENT=51, 
		STRING=52, COLON=53, PLUS=54, MINUS=55, STAR=56, SLASH=57, ASSIGN=58, 
		COMMA=59, SEMI=60, EQUAL=61, NOT_EQUAL=62, LT=63, LE=64, GE=65, GT=66, 
		LPAREN=67, RPAREN=68, LBRACK=69, RBRACK=70, WHITESPACE=71, DOT=72, DOTDOT=73;
	public static final int
		RULE_program = 0, RULE_programName = 1, RULE_identifier = 2, RULE_block = 3, 
		RULE_labelDeclarationPart = 4, RULE_label = 5, RULE_constantDefinitionPart = 6, 
		RULE_constantDefinition = 7, RULE_constantChr = 8, RULE_constant = 9, 
		RULE_unsignedNumber = 10, RULE_unsignedInteger = 11, RULE_sign = 12, RULE_string = 13, 
		RULE_typeDefinitionPart = 14, RULE_typeDefinition = 15, RULE_functionType = 16, 
		RULE_type = 17, RULE_simpleType = 18, RULE_typeIdentifier = 19, RULE_structuredType = 20, 
		RULE_unpackedStructuredType = 21, RULE_stringtype = 22, RULE_arrayType = 23, 
		RULE_typeList = 24, RULE_indexType = 25, RULE_componentType = 26, RULE_variableDeclarationPart = 27, 
		RULE_variableDeclaration = 28, RULE_functionDeclaration = 29, RULE_formalParameterList = 30, 
		RULE_formalParameterSection = 31, RULE_parameterGroup = 32, RULE_identifierList = 33, 
		RULE_constList = 34, RULE_resultType = 35, RULE_statement = 36, RULE_unlabelledStatement = 37, 
		RULE_exitStatement = 38, RULE_simpleStatement = 39, RULE_assignmentStatement = 40, 
		RULE_variable = 41, RULE_expression = 42, RULE_simpleExpression = 43, 
		RULE_term = 44, RULE_signedFactor = 45, RULE_factor = 46, RULE_unsignedConstant = 47, 
		RULE_functionDesignator = 48, RULE_parameterList = 49, RULE_set = 50, 
		RULE_elementList = 51, RULE_element = 52, RULE_functionStatement = 53, 
		RULE_actualParameter = 54, RULE_emptyStatement = 55, RULE_empty = 56, 
		RULE_structuredStatement = 57, RULE_compoundStatement = 58, RULE_statements = 59, 
		RULE_conditionalStatement = 60, RULE_ifStatement = 61, RULE_switchStatement = 62, 
		RULE_caseListElement = 63, RULE_repetetiveStatement = 64, RULE_whileStatement = 65, 
		RULE_repeatStatement = 66, RULE_loopRepeatStatement = 67, RULE_forStatement = 68, 
		RULE_forList = 69, RULE_initialValue = 70, RULE_finalValue = 71, RULE_read = 72, 
		RULE_write = 73, RULE_commentStatement = 74, RULE_incrementStatement = 75;
	public static final String[] ruleNames = {
		"program", "programName", "identifier", "block", "labelDeclarationPart", 
		"label", "constantDefinitionPart", "constantDefinition", "constantChr", 
		"constant", "unsignedNumber", "unsignedInteger", "sign", "string", "typeDefinitionPart", 
		"typeDefinition", "functionType", "type", "simpleType", "typeIdentifier", 
		"structuredType", "unpackedStructuredType", "stringtype", "arrayType", 
		"typeList", "indexType", "componentType", "variableDeclarationPart", "variableDeclaration", 
		"functionDeclaration", "formalParameterList", "formalParameterSection", 
		"parameterGroup", "identifierList", "constList", "resultType", "statement", 
		"unlabelledStatement", "exitStatement", "simpleStatement", "assignmentStatement", 
		"variable", "expression", "simpleExpression", "term", "signedFactor", 
		"factor", "unsignedConstant", "functionDesignator", "parameterList", "set", 
		"elementList", "element", "functionStatement", "actualParameter", "emptyStatement", 
		"empty", "structuredStatement", "compoundStatement", "statements", "conditionalStatement", 
		"ifStatement", "switchStatement", "caseListElement", "repetetiveStatement", 
		"whileStatement", "repeatStatement", "loopRepeatStatement", "forStatement", 
		"forList", "initialValue", "finalValue", "read", "write", "commentStatement", 
		"incrementStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'UNIT'", "'IMPLEMENTATION'", "'LABEL'", "'CONST'", 
		"'CHR'", "'TYPE'", "'FUNCTION'", "'CHAR'", "'BOOLEAN'", "'INTEGER'", "'DOUBLE'", 
		"'STRING'", "'PACKED'", "'ARRAY'", "'OF'", "'VAR'", "'EXIT'", "'IN'", 
		"'OR'", "'DIV'", "'MOD'", "'AND'", "'NOT'", "'NIL'", "'BEGIN'", "'END'", 
		"'IF'", "'THEN'", "'ELSE'", "'SWITCH'", "'ON'", "'CASE'", "'WHILE'", "'DO'", 
		"'REPEAT'", "'UNTIL'", "'LOOP'", "'FOR'", "'TO'", "'DOWNTO'", "'Read'", 
		"'read'", "'Write'", "'write'", null, null, null, null, null, null, null, 
		"':'", "'+'", "'-'", "'*'", "'/'", "'='", "','", "';'", "'=='", "'!='", 
		"'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "']'", null, "'.'", 
		"'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "Integer", 
		"Double", "IDENT", "NUM_INT", "NUM_DOUBLE", "COMMENT", "STRING", "COLON", 
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				programName();
				setState(153);
				block();
				}
				break;
			case T__7:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				functionDeclaration();
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
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__0);
				setState(159);
				identifier();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(160);
					match(LPAREN);
					setState(161);
					identifierList();
					setState(162);
					match(RPAREN);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__1);
				setState(167);
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
			setState(170);
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
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
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
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__16) | (1L << IDENT))) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(172);
					labelDeclarationPart();
					}
					break;
				case T__6:
					{
					setState(173);
					typeDefinitionPart();
					}
					break;
				case T__16:
					{
					setState(174);
					variableDeclarationPart();
					}
					break;
				case T__4:
					{
					setState(175);
					constantDefinitionPart();
					}
					break;
				case T__7:
				case IDENT:
					{
					setState(176);
					functionDeclaration();
					}
					break;
				case T__2:
					{
					setState(177);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
		enterRule(_localctx, 8, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__3);
			setState(186);
			label();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				label();
				}
				}
				setState(193);
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
		enterRule(_localctx, 10, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(teachSimpleParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(teachSimpleParser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterConstantDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitConstantDefinitionPart(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__4);
			setState(197);
			constantDefinition();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(198);
				match(SEMI);
				setState(199);
				constantDefinition();
				}
				}
				setState(204);
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

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(teachSimpleParser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode COLON() { return getToken(teachSimpleParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitConstantDefinition(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			identifier();
			setState(206);
			match(ASSIGN);
			setState(207);
			constant();
			setState(208);
			match(COLON);
			setState(209);
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

	public static class ConstantChrContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterConstantChr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitConstantChr(this);
		}
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__5);
			setState(212);
			match(LPAREN);
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				{
				setState(213);
				unsignedInteger();
				}
				break;
			case IDENT:
				{
				setState(214);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(217);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(teachSimpleParser.Integer, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
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
		enterRule(_localctx, 18, RULE_constant);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(Integer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				sign();
				setState(221);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				sign();
				setState(225);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				constantChr();
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
		enterRule(_localctx, 20, RULE_unsignedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 22, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 24, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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

	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
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
		enterRule(_localctx, 28, RULE_typeDefinitionPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__6);
			setState(240);
			typeDefinition();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ASSIGN() { return getToken(teachSimpleParser.ASSIGN, 0); }
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
		enterRule(_localctx, 30, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			identifier();
			setState(243);
			match(ASSIGN);
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case IDENT:
				{
				setState(244);
				type();
				}
				break;
			case T__7:
				{
				setState(245);
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
		public TerminalNode COLON() { return getToken(teachSimpleParser.COLON, 0); }
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
		enterRule(_localctx, 32, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__7);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(249);
				formalParameterList();
				}
			}

			setState(252);
			match(COLON);
			setState(253);
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
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				simpleType();
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
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
		enterRule(_localctx, 38, RULE_typeIdentifier);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				identifier();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				match(T__12);
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
		enterRule(_localctx, 40, RULE_structuredType);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(T__13);
				setState(272);
				unpackedStructuredType();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
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
		enterRule(_localctx, 42, RULE_unpackedStructuredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 44, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__12);
			setState(279);
			match(LPAREN);
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(280);
				identifier();
				}
				break;
			case NUM_INT:
				{
				setState(281);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(284);
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
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
		enterRule(_localctx, 46, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__14);
			setState(287);
			match(LBRACK);
			setState(288);
			label();
			setState(289);
			match(RBRACK);
			setState(290);
			match(T__15);
			setState(291);
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
		enterRule(_localctx, 48, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			indexType();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				indexType();
				}
				}
				setState(300);
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
		enterRule(_localctx, 50, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 52, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		enterRule(_localctx, 54, RULE_variableDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__16);
			setState(306);
			variableDeclaration();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(307);
				match(COMMA);
				setState(308);
				variableDeclaration();
				}
				}
				setState(313);
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
		public TerminalNode COLON() { return getToken(teachSimpleParser.COLON, 0); }
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
		enterRule(_localctx, 56, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			identifierList();
			setState(315);
			match(COLON);
			setState(316);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(teachSimpleParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 58, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(318);
				match(T__7);
				}
			}

			setState(321);
			identifier();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(322);
				formalParameterList();
				}
			}

			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(325);
				match(COLON);
				}
			}

			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(328);
				resultType();
				}
				break;
			}
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(331);
				block();
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
		enterRule(_localctx, 60, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(LPAREN);
			setState(335);
			formalParameterSection();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(336);
				match(COMMA);
				setState(337);
				formalParameterSection();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
		enterRule(_localctx, 62, RULE_formalParameterSection);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				parameterGroup();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__16);
				setState(347);
				parameterGroup();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(T__7);
				setState(349);
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
		enterRule(_localctx, 64, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			identifierList();
			setState(353);
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
		enterRule(_localctx, 66, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			identifier();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				identifier();
				}
				}
				setState(362);
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
		enterRule(_localctx, 68, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			constant();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				constant();
				}
				}
				setState(370);
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
		enterRule(_localctx, 70, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				label();
				setState(374);
				match(WHITESPACE);
				setState(375);
				unlabelledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				unlabelledStatement();
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
		enterRule(_localctx, 74, RULE_unlabelledStatement);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__17:
			case T__23:
			case T__24:
			case T__26:
			case T__29:
			case T__32:
			case T__36:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case Integer:
			case Double:
			case IDENT:
			case NUM_INT:
			case COMMENT:
			case STRING:
			case PLUS:
			case MINUS:
			case SEMI:
			case LPAREN:
			case LBRACK:
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				simpleStatement();
				}
				break;
			case T__25:
			case T__27:
			case T__30:
			case T__33:
			case T__35:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
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
		enterRule(_localctx, 76, RULE_exitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
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
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public ExitStatementContext exitStatement() {
			return getRuleContext(ExitStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public CommentStatementContext commentStatement() {
			return getRuleContext(CommentStatementContext.class,0);
		}
		public IncrementStatementContext incrementStatement() {
			return getRuleContext(IncrementStatementContext.class,0);
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
		enterRule(_localctx, 78, RULE_simpleStatement);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				functionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				exitStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				emptyStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				commentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				incrementStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				write();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(393);
				read();
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
		enterRule(_localctx, 80, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			variable();
			setState(397);
			match(ASSIGN);
			setState(398);
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
		enterRule(_localctx, 82, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(400);
			identifier();
			}
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(414);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACK:
						{
						setState(401);
						match(LBRACK);
						setState(402);
						expression();
						setState(407);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(403);
							match(COMMA);
							setState(404);
							expression();
							}
							}
							setState(409);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(410);
						match(RBRACK);
						}
						break;
					case DOT:
						{
						setState(412);
						match(DOT);
						setState(413);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(418);
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
		public List<TerminalNode> NUM_INT() { return getTokens(teachSimpleParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(teachSimpleParser.NUM_INT, i);
		}
		public List<TerminalNode> NUM_DOUBLE() { return getTokens(teachSimpleParser.NUM_DOUBLE); }
		public TerminalNode NUM_DOUBLE(int i) {
			return getToken(teachSimpleParser.NUM_DOUBLE, i);
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
		enterRule(_localctx, 84, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			simpleExpression();
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(421);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(420);
						_la = _input.LA(1);
						if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (NUM_INT - 19)) | (1L << (NUM_DOUBLE - 19)) | (1L << (EQUAL - 19)) | (1L << (NOT_EQUAL - 19)) | (1L << (LT - 19)) | (1L << (LE - 19)) | (1L << (GE - 19)) | (1L << (GT - 19)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					setState(423);
					simpleExpression();
					}
					} 
				}
				setState(428);
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
		enterRule(_localctx, 86, RULE_simpleExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			term();
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(430);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					setState(433);
					term();
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public List<TerminalNode> ASSIGN() { return getTokens(teachSimpleParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(teachSimpleParser.ASSIGN, i);
		}
		public List<TerminalNode> LE() { return getTokens(teachSimpleParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(teachSimpleParser.LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(teachSimpleParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(teachSimpleParser.GT, i);
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
		enterRule(_localctx, 88, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			signedFactor();
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (STAR - 21)) | (1L << (SLASH - 21)) | (1L << (ASSIGN - 21)) | (1L << (LE - 21)) | (1L << (GT - 21)))) != 0)) {
						{
						setState(440);
						_la = _input.LA(1);
						if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (STAR - 21)) | (1L << (SLASH - 21)) | (1L << (ASSIGN - 21)) | (1L << (LE - 21)) | (1L << (GT - 21)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(443);
					signedFactor();
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 90, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(449);
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

			setState(452);
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
		public TerminalNode Integer() { return getToken(teachSimpleParser.Integer, 0); }
		public TerminalNode Double() { return getToken(teachSimpleParser.Double, 0); }
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
		enterRule(_localctx, 92, RULE_factor);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(LPAREN);
				setState(456);
				expression();
				setState(457);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				match(Integer);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				match(Double);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(464);
				match(T__23);
				setState(465);
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
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
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
		enterRule(_localctx, 94, RULE_unsignedConstant);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				unsignedNumber();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				constantChr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				string();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(T__24);
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
		enterRule(_localctx, 96, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			identifier();
			setState(475);
			match(LPAREN);
			setState(476);
			parameterList();
			setState(477);
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
		enterRule(_localctx, 98, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			actualParameter();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(480);
				match(COMMA);
				setState(481);
				actualParameter();
				}
				}
				setState(486);
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
		enterRule(_localctx, 100, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(LBRACK);
			setState(488);
			elementList();
			setState(489);
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
		enterRule(_localctx, 102, RULE_elementList);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__23:
			case T__24:
			case Integer:
			case Double:
			case IDENT:
			case NUM_INT:
			case STRING:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				element();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(492);
					match(COMMA);
					setState(493);
					element();
					}
					}
					setState(498);
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
		enterRule(_localctx, 104, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			expression();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(503);
				match(DOTDOT);
				setState(504);
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

	public static class FunctionStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(teachSimpleParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(teachSimpleParser.RPAREN, 0); }
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitFunctionStatement(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			identifier();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(508);
				match(LPAREN);
				setState(509);
				parameterList();
				setState(510);
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
			setState(514);
			expression();
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(515);
				match(COMMA);
				setState(516);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitEmpty(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_structuredStatement);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				compoundStatement();
				}
				break;
			case T__27:
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				conditionalStatement();
				}
				break;
			case T__33:
			case T__35:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
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
		enterRule(_localctx, 116, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(T__25);
			setState(529);
			statements();
			setState(530);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 118, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			statement();
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(533);
					match(SEMI);
					setState(534);
					statement();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 120, RULE_conditionalStatement);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				ifStatement();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
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
		enterRule(_localctx, 122, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__27);
			setState(545);
			expression();
			setState(546);
			match(T__28);
			setState(547);
			statement();
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(548);
				match(T__29);
				setState(549);
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
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(teachSimpleParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(teachSimpleParser.COLON, i);
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
		enterRule(_localctx, 124, RULE_switchStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__30);
			setState(553);
			expression();
			setState(554);
			match(T__31);
			setState(560); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(555);
					match(T__32);
					setState(556);
					label();
					setState(557);
					match(COLON);
					setState(558);
					caseListElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(562); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(564);
				match(T__29);
				setState(565);
				statements();
				}
			}

			setState(568);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
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
		enterRule(_localctx, 126, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(570);
				constList();
				}
				break;
			}
			setState(573);
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

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public LoopRepeatStatementContext loopRepeatStatement() {
			return getRuleContext(LoopRepeatStatementContext.class,0);
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
		enterRule(_localctx, 128, RULE_repetetiveStatement);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				whileStatement();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				repeatStatement();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				loopRepeatStatement();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
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
		enterRule(_localctx, 130, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__33);
			setState(582);
			expression();
			setState(583);
			match(T__34);
			setState(584);
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 132, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(T__35);
			setState(587);
			statements();
			setState(588);
			match(T__36);
			setState(589);
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

	public static class LoopRepeatStatementContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(teachSimpleParser.Integer, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LoopRepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopRepeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterLoopRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitLoopRepeatStatement(this);
		}
	}

	public final LoopRepeatStatementContext loopRepeatStatement() throws RecognitionException {
		LoopRepeatStatementContext _localctx = new LoopRepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_loopRepeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(T__37);
			setState(592);
			match(Integer);
			setState(593);
			statements();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 136, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(T__38);
			setState(596);
			identifier();
			setState(597);
			match(ASSIGN);
			setState(598);
			forList();
			setState(599);
			match(T__34);
			setState(600);
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
		enterRule(_localctx, 138, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			initialValue();
			setState(603);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(604);
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
		public TerminalNode Integer() { return getToken(teachSimpleParser.Integer, 0); }
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
		enterRule(_localctx, 140, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
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

	public static class FinalValueContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(teachSimpleParser.Integer, 0); }
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
		enterRule(_localctx, 142, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
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
		public TerminalNode STRING() { return getToken(teachSimpleParser.STRING, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
		enterRule(_localctx, 144, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(611);
				match(LPAREN);
				}
				break;
			}
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(614);
				string();
				}
				break;
			case 2:
				{
				setState(615);
				variable();
				}
				break;
			case 3:
				{
				setState(616);
				expression();
				}
				break;
			case 4:
				{
				setState(617);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(618);
				constant();
				}
				break;
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(621);
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
		enterRule(_localctx, 146, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(625);
			match(LPAREN);
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(626);
				string();
				}
				break;
			case 2:
				{
				setState(627);
				expression();
				}
				break;
			case 3:
				{
				setState(628);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(629);
				constant();
				}
				break;
			}
			setState(632);
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

	public static class CommentStatementContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(teachSimpleParser.COMMENT, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(teachSimpleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(teachSimpleParser.STRING, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(teachSimpleParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(teachSimpleParser.WHITESPACE, i);
		}
		public CommentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitCommentStatement(this);
		}
	}

	public final CommentStatementContext commentStatement() throws RecognitionException {
		CommentStatementContext _localctx = new CommentStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_commentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(COMMENT);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << Integer) | (1L << Double) | (1L << IDENT) | (1L << NUM_INT) | (1L << STRING) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LPAREN - 67)) | (1L << (LBRACK - 67)) | (1L << (WHITESPACE - 67)))) != 0)) {
				{
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(635);
					string();
					}
					break;
				case 2:
					{
					setState(636);
					variable();
					}
					break;
				case 3:
					{
					setState(637);
					expression();
					}
					break;
				case 4:
					{
					setState(638);
					match(STRING);
					}
					break;
				case 5:
					{
					setState(639);
					constant();
					}
					break;
				case 6:
					{
					setState(640);
					label();
					}
					break;
				case 7:
					{
					setState(641);
					match(WHITESPACE);
					}
					break;
				}
				}
				setState(646);
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

	public static class IncrementStatementContext extends ParserRuleContext {
		public List<TerminalNode> PLUS() { return getTokens(teachSimpleParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(teachSimpleParser.PLUS, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(teachSimpleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(teachSimpleParser.STRING, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(teachSimpleParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(teachSimpleParser.WHITESPACE, i);
		}
		public IncrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).enterIncrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof teachSimpleListener ) ((teachSimpleListener)listener).exitIncrementStatement(this);
		}
	}

	public final IncrementStatementContext incrementStatement() throws RecognitionException {
		IncrementStatementContext _localctx = new IncrementStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_incrementStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(654);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(647);
						string();
						}
						break;
					case 2:
						{
						setState(648);
						variable();
						}
						break;
					case 3:
						{
						setState(649);
						expression();
						}
						break;
					case 4:
						{
						setState(650);
						match(STRING);
						}
						break;
					case 5:
						{
						setState(651);
						constant();
						}
						break;
					case 6:
						{
						setState(652);
						label();
						}
						break;
					case 7:
						{
						setState(653);
						match(WHITESPACE);
						}
						break;
					}
					} 
				}
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(659);
			match(PLUS);
			setState(660);
			match(PLUS);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u0299\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\5\2\u009f\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u00a7\n\3\3\3\3\3\5\3\u00ab\n\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u00b5\n\5\f\5\16\5\u00b8\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6\u00c0\n\6\f\6\16\6\u00c3\13\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00cb\n\b"+
		"\f\b\16\b\u00ce\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00da"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e8"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00f9\n\21\3\22\3\22\5\22\u00fd\n\22\3\22\3\22\3\22\3\23\3"+
		"\23\5\23\u0104\n\23\3\24\3\24\5\24\u0108\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0110\n\25\3\26\3\26\3\26\5\26\u0115\n\26\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\5\30\u011d\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\7\32\u012b\n\32\f\32\16\32\u012e\13\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u0138\n\35\f\35\16\35\u013b\13\35"+
		"\3\36\3\36\3\36\3\36\3\37\5\37\u0142\n\37\3\37\3\37\5\37\u0146\n\37\3"+
		"\37\5\37\u0149\n\37\3\37\5\37\u014c\n\37\3\37\5\37\u014f\n\37\3 \3 \3"+
		" \3 \7 \u0155\n \f \16 \u0158\13 \3 \3 \3!\3!\3!\3!\3!\5!\u0161\n!\3\""+
		"\3\"\3\"\3#\3#\3#\7#\u0169\n#\f#\16#\u016c\13#\3$\3$\3$\7$\u0171\n$\f"+
		"$\16$\u0174\13$\3%\3%\3&\3&\3&\3&\3&\5&\u017d\n&\3\'\3\'\5\'\u0181\n\'"+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u018d\n)\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\7+\u0198\n+\f+\16+\u019b\13+\3+\3+\3+\3+\7+\u01a1\n+\f+\16+\u01a4\13"+
		"+\3,\3,\5,\u01a8\n,\3,\7,\u01ab\n,\f,\16,\u01ae\13,\3-\3-\5-\u01b2\n-"+
		"\3-\7-\u01b5\n-\f-\16-\u01b8\13-\3.\3.\5.\u01bc\n.\3.\7.\u01bf\n.\f.\16"+
		".\u01c2\13.\3/\5/\u01c5\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u01d5\n\60\3\61\3\61\3\61\3\61\5\61\u01db"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u01e5\n\63\f\63\16"+
		"\63\u01e8\13\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u01f1\n\65\f\65"+
		"\16\65\u01f4\13\65\3\65\5\65\u01f7\n\65\3\66\3\66\3\66\5\66\u01fc\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0203\n\67\38\38\38\58\u0208\n8\39\39\3"+
		":\3:\3;\3;\3;\5;\u0211\n;\3<\3<\3<\3<\3=\3=\3=\7=\u021a\n=\f=\16=\u021d"+
		"\13=\3>\3>\5>\u0221\n>\3?\3?\3?\3?\3?\3?\5?\u0229\n?\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\6@\u0233\n@\r@\16@\u0234\3@\3@\5@\u0239\n@\3@\3@\3A\5A\u023e\n"+
		"A\3A\3A\3B\3B\3B\3B\5B\u0246\nB\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3"+
		"E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3I\3I\3J\3J\5J\u0267\nJ\3"+
		"J\3J\3J\3J\3J\5J\u026e\nJ\3J\5J\u0271\nJ\3K\3K\3K\3K\3K\3K\5K\u0279\n"+
		"K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\7L\u0285\nL\fL\16L\u0288\13L\3M\3M\3M"+
		"\3M\3M\3M\3M\7M\u0291\nM\fM\16M\u0294\13M\3M\3M\3M\3M\3\u0234\2N\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\2\t\3\289\5\2\25\25\63\64?D\4\2\26\268"+
		"9\6\2\27\31:<BBDD\3\2*+\3\2,-\3\2./\u02ba\2\u009e\3\2\2\2\4\u00aa\3\2"+
		"\2\2\6\u00ac\3\2\2\2\b\u00b6\3\2\2\2\n\u00bb\3\2\2\2\f\u00c4\3\2\2\2\16"+
		"\u00c6\3\2\2\2\20\u00cf\3\2\2\2\22\u00d5\3\2\2\2\24\u00e7\3\2\2\2\26\u00e9"+
		"\3\2\2\2\30\u00eb\3\2\2\2\32\u00ed\3\2\2\2\34\u00ef\3\2\2\2\36\u00f1\3"+
		"\2\2\2 \u00f4\3\2\2\2\"\u00fa\3\2\2\2$\u0103\3\2\2\2&\u0107\3\2\2\2(\u010f"+
		"\3\2\2\2*\u0114\3\2\2\2,\u0116\3\2\2\2.\u0118\3\2\2\2\60\u0120\3\2\2\2"+
		"\62\u0127\3\2\2\2\64\u012f\3\2\2\2\66\u0131\3\2\2\28\u0133\3\2\2\2:\u013c"+
		"\3\2\2\2<\u0141\3\2\2\2>\u0150\3\2\2\2@\u0160\3\2\2\2B\u0162\3\2\2\2D"+
		"\u0165\3\2\2\2F\u016d\3\2\2\2H\u0175\3\2\2\2J\u017c\3\2\2\2L\u0180\3\2"+
		"\2\2N\u0182\3\2\2\2P\u018c\3\2\2\2R\u018e\3\2\2\2T\u0192\3\2\2\2V\u01a5"+
		"\3\2\2\2X\u01af\3\2\2\2Z\u01b9\3\2\2\2\\\u01c4\3\2\2\2^\u01d4\3\2\2\2"+
		"`\u01da\3\2\2\2b\u01dc\3\2\2\2d\u01e1\3\2\2\2f\u01e9\3\2\2\2h\u01f6\3"+
		"\2\2\2j\u01f8\3\2\2\2l\u01fd\3\2\2\2n\u0204\3\2\2\2p\u0209\3\2\2\2r\u020b"+
		"\3\2\2\2t\u0210\3\2\2\2v\u0212\3\2\2\2x\u0216\3\2\2\2z\u0220\3\2\2\2|"+
		"\u0222\3\2\2\2~\u022a\3\2\2\2\u0080\u023d\3\2\2\2\u0082\u0245\3\2\2\2"+
		"\u0084\u0247\3\2\2\2\u0086\u024c\3\2\2\2\u0088\u0251\3\2\2\2\u008a\u0255"+
		"\3\2\2\2\u008c\u025c\3\2\2\2\u008e\u0260\3\2\2\2\u0090\u0262\3\2\2\2\u0092"+
		"\u0264\3\2\2\2\u0094\u0272\3\2\2\2\u0096\u027c\3\2\2\2\u0098\u0292\3\2"+
		"\2\2\u009a\u009b\5\4\3\2\u009b\u009c\5\b\5\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009f\5<\37\2\u009e\u009a\3\2\2\2\u009e\u009d\3\2\2\2\u009f\3\3\2\2\2"+
		"\u00a0\u00a1\7\3\2\2\u00a1\u00a6\5\6\4\2\u00a2\u00a3\7E\2\2\u00a3\u00a4"+
		"\5D#\2\u00a4\u00a5\7F\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00ab\5\6"+
		"\4\2\u00aa\u00a0\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\5\3\2\2\2\u00ac\u00ad"+
		"\7\62\2\2\u00ad\7\3\2\2\2\u00ae\u00b5\5\n\6\2\u00af\u00b5\5\36\20\2\u00b0"+
		"\u00b5\58\35\2\u00b1\u00b5\5\16\b\2\u00b2\u00b5\5<\37\2\u00b3\u00b5\7"+
		"\5\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4"+
		"\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\5v<\2\u00ba\t\3\2\2\2\u00bb\u00bc\7\6\2\2\u00bc"+
		"\u00c1\5\f\7\2\u00bd\u00be\7=\2\2\u00be\u00c0\5\f\7\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\13\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\60\2\2\u00c5\r\3\2\2\2\u00c6"+
		"\u00c7\7\7\2\2\u00c7\u00cc\5\20\t\2\u00c8\u00c9\7>\2\2\u00c9\u00cb\5\20"+
		"\t\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\17\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\6\4"+
		"\2\u00d0\u00d1\7<\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\7\67\2\2\u00d3"+
		"\u00d4\5$\23\2\u00d4\21\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6\u00d9\7E\2\2"+
		"\u00d7\u00da\5\30\r\2\u00d8\u00da\5\6\4\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7F\2\2\u00dc\23\3\2\2\2\u00dd"+
		"\u00e8\7\60\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\5\26\f\2\u00e0\u00e8"+
		"\3\2\2\2\u00e1\u00e8\5\6\4\2\u00e2\u00e3\5\32\16\2\u00e3\u00e4\5\6\4\2"+
		"\u00e4\u00e8\3\2\2\2\u00e5\u00e8\5\34\17\2\u00e6\u00e8\5\22\n\2\u00e7"+
		"\u00dd\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\25\3\2\2\2\u00e9\u00ea"+
		"\5\30\r\2\u00ea\27\3\2\2\2\u00eb\u00ec\7\63\2\2\u00ec\31\3\2\2\2\u00ed"+
		"\u00ee\t\2\2\2\u00ee\33\3\2\2\2\u00ef\u00f0\7\66\2\2\u00f0\35\3\2\2\2"+
		"\u00f1\u00f2\7\t\2\2\u00f2\u00f3\5 \21\2\u00f3\37\3\2\2\2\u00f4\u00f5"+
		"\5\6\4\2\u00f5\u00f8\7<\2\2\u00f6\u00f9\5$\23\2\u00f7\u00f9\5\"\22\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9!\3\2\2\2\u00fa\u00fc\7\n\2\2"+
		"\u00fb\u00fd\5> \2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\7\67\2\2\u00ff\u0100\5H%\2\u0100#\3\2\2\2\u0101\u0104"+
		"\5&\24\2\u0102\u0104\5*\26\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"%\3\2\2\2\u0105\u0108\5(\25\2\u0106\u0108\5.\30\2\u0107\u0105\3\2\2\2"+
		"\u0107\u0106\3\2\2\2\u0108\'\3\2\2\2\u0109\u0110\5\6\4\2\u010a\u0110\7"+
		"\13\2\2\u010b\u0110\7\f\2\2\u010c\u0110\7\r\2\2\u010d\u0110\7\16\2\2\u010e"+
		"\u0110\7\17\2\2\u010f\u0109\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u010b\3"+
		"\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		")\3\2\2\2\u0111\u0112\7\20\2\2\u0112\u0115\5,\27\2\u0113\u0115\5,\27\2"+
		"\u0114\u0111\3\2\2\2\u0114\u0113\3\2\2\2\u0115+\3\2\2\2\u0116\u0117\5"+
		"\60\31\2\u0117-\3\2\2\2\u0118\u0119\7\17\2\2\u0119\u011c\7E\2\2\u011a"+
		"\u011d\5\6\4\2\u011b\u011d\5\26\f\2\u011c\u011a\3\2\2\2\u011c\u011b\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7F\2\2\u011f/\3\2\2\2\u0120\u0121"+
		"\7\21\2\2\u0121\u0122\7G\2\2\u0122\u0123\5\f\7\2\u0123\u0124\7H\2\2\u0124"+
		"\u0125\7\22\2\2\u0125\u0126\5\66\34\2\u0126\61\3\2\2\2\u0127\u012c\5\64"+
		"\33\2\u0128\u0129\7=\2\2\u0129\u012b\5\64\33\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\63\3\2\2"+
		"\2\u012e\u012c\3\2\2\2\u012f\u0130\5&\24\2\u0130\65\3\2\2\2\u0131\u0132"+
		"\5$\23\2\u0132\67\3\2\2\2\u0133\u0134\7\23\2\2\u0134\u0139\5:\36\2\u0135"+
		"\u0136\7=\2\2\u0136\u0138\5:\36\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a9\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013c\u013d\5D#\2\u013d\u013e\7\67\2\2\u013e\u013f\5$\23\2\u013f"+
		";\3\2\2\2\u0140\u0142\7\n\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2"+
		"\u0142\u0143\3\2\2\2\u0143\u0145\5\6\4\2\u0144\u0146\5> \2\u0145\u0144"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\7\67\2\2"+
		"\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u014c"+
		"\5H%\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014f\5\b\5\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f=\3\2\2\2"+
		"\u0150\u0151\7E\2\2\u0151\u0156\5@!\2\u0152\u0153\7=\2\2\u0153\u0155\5"+
		"@!\2\u0154\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7F"+
		"\2\2\u015a?\3\2\2\2\u015b\u0161\5B\"\2\u015c\u015d\7\23\2\2\u015d\u0161"+
		"\5B\"\2\u015e\u015f\7\n\2\2\u015f\u0161\5B\"\2\u0160\u015b\3\2\2\2\u0160"+
		"\u015c\3\2\2\2\u0160\u015e\3\2\2\2\u0161A\3\2\2\2\u0162\u0163\5D#\2\u0163"+
		"\u0164\5(\25\2\u0164C\3\2\2\2\u0165\u016a\5\6\4\2\u0166\u0167\7=\2\2\u0167"+
		"\u0169\5\6\4\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016bE\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0172"+
		"\5\24\13\2\u016e\u016f\7=\2\2\u016f\u0171\5\24\13\2\u0170\u016e\3\2\2"+
		"\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173G"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\5(\25\2\u0176I\3\2\2\2\u0177"+
		"\u0178\5\f\7\2\u0178\u0179\7I\2\2\u0179\u017a\5L\'\2\u017a\u017d\3\2\2"+
		"\2\u017b\u017d\5L\'\2\u017c\u0177\3\2\2\2\u017c\u017b\3\2\2\2\u017dK\3"+
		"\2\2\2\u017e\u0181\5P)\2\u017f\u0181\5t;\2\u0180\u017e\3\2\2\2\u0180\u017f"+
		"\3\2\2\2\u0181M\3\2\2\2\u0182\u0183\7\24\2\2\u0183O\3\2\2\2\u0184\u018d"+
		"\5R*\2\u0185\u018d\5l\67\2\u0186\u018d\5N(\2\u0187\u018d\5p9\2\u0188\u018d"+
		"\5\u0096L\2\u0189\u018d\5\u0098M\2\u018a\u018d\5\u0094K\2\u018b\u018d"+
		"\5\u0092J\2\u018c\u0184\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0186\3\2\2"+
		"\2\u018c\u0187\3\2\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018b\3\2\2\2\u018dQ\3\2\2\2\u018e\u018f\5T+\2\u018f\u0190"+
		"\7<\2\2\u0190\u0191\5V,\2\u0191S\3\2\2\2\u0192\u01a2\5\6\4\2\u0193\u0194"+
		"\7G\2\2\u0194\u0199\5V,\2\u0195\u0196\7=\2\2\u0196\u0198\5V,\2\u0197\u0195"+
		"\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7H\2\2\u019d\u01a1\3\2"+
		"\2\2\u019e\u019f\7J\2\2\u019f\u01a1\5\6\4\2\u01a0\u0193\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3U\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01ac\5X-\2\u01a6\u01a8"+
		"\t\3\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\5X-\2\u01aa\u01a7\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01adW\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b6"+
		"\5Z.\2\u01b0\u01b2\t\4\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\5Z.\2\u01b4\u01b1\3\2\2\2\u01b5\u01b8\3\2\2"+
		"\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7Y\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b9\u01c0\5\\/\2\u01ba\u01bc\t\5\2\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\5\\/\2\u01be\u01bb\3\2"+
		"\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"[\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\t\2\2\2\u01c4\u01c3\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5^\60\2\u01c7]\3"+
		"\2\2\2\u01c8\u01d5\5T+\2\u01c9\u01ca\7E\2\2\u01ca\u01cb\5V,\2\u01cb\u01cc"+
		"\7F\2\2\u01cc\u01d5\3\2\2\2\u01cd\u01d5\5b\62\2\u01ce\u01d5\5`\61\2\u01cf"+
		"\u01d5\5f\64\2\u01d0\u01d5\7\60\2\2\u01d1\u01d5\7\61\2\2\u01d2\u01d3\7"+
		"\32\2\2\u01d3\u01d5\5^\60\2\u01d4\u01c8\3\2\2\2\u01d4\u01c9\3\2\2\2\u01d4"+
		"\u01cd\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d4\u01d0\3\2"+
		"\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5_\3\2\2\2\u01d6\u01db"+
		"\5\26\f\2\u01d7\u01db\5\22\n\2\u01d8\u01db\5\34\17\2\u01d9\u01db\7\33"+
		"\2\2\u01da\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01d9\3\2\2\2\u01dba\3\2\2\2\u01dc\u01dd\5\6\4\2\u01dd\u01de\7E\2\2\u01de"+
		"\u01df\5d\63\2\u01df\u01e0\7F\2\2\u01e0c\3\2\2\2\u01e1\u01e6\5n8\2\u01e2"+
		"\u01e3\7=\2\2\u01e3\u01e5\5n8\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\3\2\2"+
		"\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7e\3\2\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e9\u01ea\7G\2\2\u01ea\u01eb\5h\65\2\u01eb\u01ec\7H\2\2\u01ec"+
		"g\3\2\2\2\u01ed\u01f2\5j\66\2\u01ee\u01ef\7=\2\2\u01ef\u01f1\5j\66\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f7\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6"+
		"\u01ed\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7i\3\2\2\2\u01f8\u01fb\5V,\2\u01f9"+
		"\u01fa\7K\2\2\u01fa\u01fc\5V,\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2"+
		"\2\u01fck\3\2\2\2\u01fd\u0202\5\6\4\2\u01fe\u01ff\7E\2\2\u01ff\u0200\5"+
		"d\63\2\u0200\u0201\7F\2\2\u0201\u0203\3\2\2\2\u0202\u01fe\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203m\3\2\2\2\u0204\u0207\5V,\2\u0205\u0206\7=\2\2\u0206"+
		"\u0208\5\30\r\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208o\3\2\2\2"+
		"\u0209\u020a\3\2\2\2\u020aq\3\2\2\2\u020b\u020c\3\2\2\2\u020cs\3\2\2\2"+
		"\u020d\u0211\5v<\2\u020e\u0211\5z>\2\u020f\u0211\5\u0082B\2\u0210\u020d"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211u\3\2\2\2\u0212"+
		"\u0213\7\34\2\2\u0213\u0214\5x=\2\u0214\u0215\7\35\2\2\u0215w\3\2\2\2"+
		"\u0216\u021b\5J&\2\u0217\u0218\7>\2\2\u0218\u021a\5J&\2\u0219\u0217\3"+
		"\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"y\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0221\5|?\2\u021f\u0221\5~@\2\u0220"+
		"\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221{\3\2\2\2\u0222\u0223\7\36\2\2"+
		"\u0223\u0224\5V,\2\u0224\u0225\7\37\2\2\u0225\u0228\5J&\2\u0226\u0227"+
		"\7 \2\2\u0227\u0229\5J&\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"}\3\2\2\2\u022a\u022b\7!\2\2\u022b\u022c\5V,\2\u022c\u0232\7\"\2\2\u022d"+
		"\u022e\7#\2\2\u022e\u022f\5\f\7\2\u022f\u0230\7\67\2\2\u0230\u0231\5\u0080"+
		"A\2\u0231\u0233\3\2\2\2\u0232\u022d\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0237\7 "+
		"\2\2\u0237\u0239\5x=\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u023b\7\35\2\2\u023b\177\3\2\2\2\u023c\u023e\5F$\2\u023d"+
		"\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\5J"+
		"&\2\u0240\u0081\3\2\2\2\u0241\u0246\5\u0084C\2\u0242\u0246\5\u0086D\2"+
		"\u0243\u0246\5\u0088E\2\u0244\u0246\5\u008aF\2\u0245\u0241\3\2\2\2\u0245"+
		"\u0242\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246\u0083\3\2"+
		"\2\2\u0247\u0248\7$\2\2\u0248\u0249\5V,\2\u0249\u024a\7%\2\2\u024a\u024b"+
		"\5J&\2\u024b\u0085\3\2\2\2\u024c\u024d\7&\2\2\u024d\u024e\5x=\2\u024e"+
		"\u024f\7\'\2\2\u024f\u0250\5V,\2\u0250\u0087\3\2\2\2\u0251\u0252\7(\2"+
		"\2\u0252\u0253\7\60\2\2\u0253\u0254\5x=\2\u0254\u0089\3\2\2\2\u0255\u0256"+
		"\7)\2\2\u0256\u0257\5\6\4\2\u0257\u0258\7<\2\2\u0258\u0259\5\u008cG\2"+
		"\u0259\u025a\7%\2\2\u025a\u025b\5J&\2\u025b\u008b\3\2\2\2\u025c\u025d"+
		"\5\u008eH\2\u025d\u025e\t\6\2\2\u025e\u025f\5\u0090I\2\u025f\u008d\3\2"+
		"\2\2\u0260\u0261\7\60\2\2\u0261\u008f\3\2\2\2\u0262\u0263\7\60\2\2\u0263"+
		"\u0091\3\2\2\2\u0264\u0266\t\7\2\2\u0265\u0267\7E\2\2\u0266\u0265\3\2"+
		"\2\2\u0266\u0267\3\2\2\2\u0267\u026d\3\2\2\2\u0268\u026e\5\34\17\2\u0269"+
		"\u026e\5T+\2\u026a\u026e\5V,\2\u026b\u026e\7\66\2\2\u026c\u026e\5\24\13"+
		"\2\u026d\u0268\3\2\2\2\u026d\u0269\3\2\2\2\u026d\u026a\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f"+
		"\u0271\7F\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0093\3\2"+
		"\2\2\u0272\u0273\t\b\2\2\u0273\u0278\7E\2\2\u0274\u0279\5\34\17\2\u0275"+
		"\u0279\5V,\2\u0276\u0279\7\66\2\2\u0277\u0279\5\24\13\2\u0278\u0274\3"+
		"\2\2\2\u0278\u0275\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027b\7F\2\2\u027b\u0095\3\2\2\2\u027c\u0286\7\65"+
		"\2\2\u027d\u0285\5\34\17\2\u027e\u0285\5T+\2\u027f\u0285\5V,\2\u0280\u0285"+
		"\7\66\2\2\u0281\u0285\5\24\13\2\u0282\u0285\5\f\7\2\u0283\u0285\7I\2\2"+
		"\u0284\u027d\3\2\2\2\u0284\u027e\3\2\2\2\u0284\u027f\3\2\2\2\u0284\u0280"+
		"\3\2\2\2\u0284\u0281\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285"+
		"\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0097\3\2"+
		"\2\2\u0288\u0286\3\2\2\2\u0289\u0291\5\34\17\2\u028a\u0291\5T+\2\u028b"+
		"\u0291\5V,\2\u028c\u0291\7\66\2\2\u028d\u0291\5\24\13\2\u028e\u0291\5"+
		"\f\7\2\u028f\u0291\7I\2\2\u0290\u0289\3\2\2\2\u0290\u028a\3\2\2\2\u0290"+
		"\u028b\3\2\2\2\u0290\u028c\3\2\2\2\u0290\u028d\3\2\2\2\u0290\u028e\3\2"+
		"\2\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\78"+
		"\2\2\u0296\u0297\78\2\2\u0297\u0099\3\2\2\2B\u009e\u00a6\u00aa\u00b4\u00b6"+
		"\u00c1\u00cc\u00d9\u00e7\u00f8\u00fc\u0103\u0107\u010f\u0114\u011c\u012c"+
		"\u0139\u0141\u0145\u0148\u014b\u014e\u0156\u0160\u016a\u0172\u017c\u0180"+
		"\u018c\u0199\u01a0\u01a2\u01a7\u01ac\u01b1\u01b6\u01bb\u01c0\u01c4\u01d4"+
		"\u01da\u01e6\u01f2\u01f6\u01fb\u0202\u0207\u0210\u021b\u0220\u0228\u0234"+
		"\u0238\u023d\u0245\u0266\u026d\u0270\u0278\u0284\u0286\u0290\u0292";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}