// Generated from /home/tengfei/IdeaProjects/RIIF2_V4.1.1/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RIIF2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, COMPONENT=45, 
		END_COMPONENT=46, ENVIRONMENT=47, END_ENVIRONMENT=48, REQUIREMENT=49, 
		END_REQUIREMENT=50, CHILD_COMPONENT=51, FAIL_MODE=52, EXTENDS=53, ASSIGN=54, 
		ASSERT=55, INPUT=56, OUTPUT=57, PARAMETER=58, CONSTANT=59, TYPE_FLOAT=60, 
		TYPE_INTEGER=61, TYPE_STRING=62, TYPE_ENUM=63, FUNC_AGG_SINGLE=64, FUNC_GT_N_FAIL=65, 
		FUNC_LOG=66, FUNC_EXP=67, TEMPLATE=68, END_TEMPLATE=69, IMPOSE=70, ABSTRACT=71, 
		IMPLEMENTS=72, SELF=73, SET=74, TYPE_TABLE=75, PLATFORM=76, Identifier=77, 
		StringLiteral=78, FloatingPointLiteral=79, DecimalLiteral=80, WS=81, COMMENT=82, 
		LINE_COMMENT=83;
	public static final int
		RULE_program = 0, RULE_typeDeclaration = 1, RULE_componentDeclaration = 2, 
		RULE_componentBodyElement = 3, RULE_fieldDeclaration = 4, RULE_fieldElement = 5, 
		RULE_childComponentDeclaration = 6, RULE_failModeDeclaration = 7, RULE_assignment = 8, 
		RULE_setTemplate = 9, RULE_assertion = 10, RULE_templateDeclaration = 11, 
		RULE_templateBodyElement = 12, RULE_abstractFieldDeclaration = 13, RULE_abstractFailModeDeclaration = 14, 
		RULE_abstractPlatformDeclaration = 15, RULE_imposeDeclaration = 16, RULE_environmentDeclaration = 17, 
		RULE_environmentBodyElement = 18, RULE_envParameterDeclaration = 19, RULE_requirementDeclaration = 20, 
		RULE_variableDeclarator = 21, RULE_associativeDeclarator = 22, RULE_associativeInstanceDeclarator = 23, 
		RULE_childComponentDeclarator = 24, RULE_failModeDeclarator = 25, RULE_assignmentDeclarator = 26, 
		RULE_imposeDeclarator = 27, RULE_variableInitializer = 28, RULE_imposeInitializer = 29, 
		RULE_associativeInstanceDeclaratorInitializer = 30, RULE_listInitializer = 31, 
		RULE_arrayInitializer = 32, RULE_assignmentInitializer = 33, RULE_childComponentDeclaratorId = 34, 
		RULE_variableDeclaratorId = 35, RULE_associativeDeclaratorId = 36, RULE_associativeInstanceDeclaratorId = 37, 
		RULE_variableId = 38, RULE_assignmentDeclaratorId = 39, RULE_assignmentVariableId = 40, 
		RULE_assignmentVariableAttributeId = 41, RULE_assignmentTableItemId = 42, 
		RULE_imposeDeclaratorId = 43, RULE_primitiveType = 44, RULE_typeType = 45, 
		RULE_enumType = 46, RULE_item = 47, RULE_childComponentDeclaratorType = 48, 
		RULE_vector = 49, RULE_identifierList = 50, RULE_extendsList = 51, RULE_implementsList = 52, 
		RULE_expression = 53, RULE_primary = 54, RULE_literal = 55, RULE_funcCall = 56, 
		RULE_funcName = 57, RULE_funcArg = 58;
	public static final String[] ruleNames = {
		"program", "typeDeclaration", "componentDeclaration", "componentBodyElement", 
		"fieldDeclaration", "fieldElement", "childComponentDeclaration", "failModeDeclaration", 
		"assignment", "setTemplate", "assertion", "templateDeclaration", "templateBodyElement", 
		"abstractFieldDeclaration", "abstractFailModeDeclaration", "abstractPlatformDeclaration", 
		"imposeDeclaration", "environmentDeclaration", "environmentBodyElement", 
		"envParameterDeclaration", "requirementDeclaration", "variableDeclarator", 
		"associativeDeclarator", "associativeInstanceDeclarator", "childComponentDeclarator", 
		"failModeDeclarator", "assignmentDeclarator", "imposeDeclarator", "variableInitializer", 
		"imposeInitializer", "associativeInstanceDeclaratorInitializer", "listInitializer", 
		"arrayInitializer", "assignmentInitializer", "childComponentDeclaratorId", 
		"variableDeclaratorId", "associativeDeclaratorId", "associativeInstanceDeclaratorId", 
		"variableId", "assignmentDeclaratorId", "assignmentVariableId", "assignmentVariableAttributeId", 
		"assignmentTableItemId", "imposeDeclaratorId", "primitiveType", "typeType", 
		"enumType", "item", "childComponentDeclaratorType", "vector", "identifierList", 
		"extendsList", "implementsList", "expression", "primary", "literal", "funcCall", 
		"funcName", "funcArg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "':'", "':='", "'='", "'{'", "','", "'}'", 
		"'['", "']'", "'.'", "'''", "'#'", "'+'", "'-'", "'~'", "'!'", "'*'", 
		"'/'", "'%'", "'<='", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", 
		"'||'", "'?'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'>>='", "'>>>='", "'<<='", "'%='", "'('", "')'", "'component'", "'endcomponent'", 
		"'environment'", "'endenvironment'", "'requirement'", "'endrequirement'", 
		"'child_component'", "'fail_mode'", "'extends'", "'assign'", "'assert'", 
		"'input'", "'output'", "'parameter'", "'constant'", "'float'", "'integer'", 
		"'string'", "'enum'", "'agg_single_fail'", "'agg_gt_n_fail'", "'LOG'", 
		"'EXP'", "'template'", "'endtemplate'", "'impose'", "'abstract'", "'implements'", 
		"'self'", "'set'", "'table'", "'platform'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "COMPONENT", "END_COMPONENT", 
		"ENVIRONMENT", "END_ENVIRONMENT", "REQUIREMENT", "END_REQUIREMENT", "CHILD_COMPONENT", 
		"FAIL_MODE", "EXTENDS", "ASSIGN", "ASSERT", "INPUT", "OUTPUT", "PARAMETER", 
		"CONSTANT", "TYPE_FLOAT", "TYPE_INTEGER", "TYPE_STRING", "TYPE_ENUM", 
		"FUNC_AGG_SINGLE", "FUNC_GT_N_FAIL", "FUNC_LOG", "FUNC_EXP", "TEMPLATE", 
		"END_TEMPLATE", "IMPOSE", "ABSTRACT", "IMPLEMENTS", "SELF", "SET", "TYPE_TABLE", 
		"PLATFORM", "Identifier", "StringLiteral", "FloatingPointLiteral", "DecimalLiteral", 
		"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "RIIF2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RIIF2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RIIF2Parser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				typeDeclaration();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (COMPONENT - 45)) | (1L << (ENVIRONMENT - 45)) | (1L << (REQUIREMENT - 45)) | (1L << (TEMPLATE - 45)))) != 0) );
			setState(123);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public EnvironmentDeclarationContext environmentDeclaration() {
			return getRuleContext(EnvironmentDeclarationContext.class,0);
		}
		public RequirementDeclarationContext requirementDeclaration() {
			return getRuleContext(RequirementDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case COMPONENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				componentDeclaration();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				templateDeclaration();
				}
				break;
			case ENVIRONMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				environmentDeclaration();
				}
				break;
			case REQUIREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				requirementDeclaration();
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

	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(RIIF2Parser.COMPONENT, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TerminalNode END_COMPONENT() { return getToken(RIIF2Parser.END_COMPONENT, 0); }
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public ExtendsListContext extendsList() {
			return getRuleContext(ExtendsListContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(RIIF2Parser.IMPLEMENTS, 0); }
		public ImplementsListContext implementsList() {
			return getRuleContext(ImplementsListContext.class,0);
		}
		public List<ComponentBodyElementContext> componentBodyElement() {
			return getRuleContexts(ComponentBodyElementContext.class);
		}
		public ComponentBodyElementContext componentBodyElement(int i) {
			return getRuleContext(ComponentBodyElementContext.class,i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(COMPONENT);
			setState(132);
			match(Identifier);
			setState(135);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(133);
				match(EXTENDS);
				setState(134);
				extendsList();
				}
			}

			setState(139);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(137);
				match(IMPLEMENTS);
				setState(138);
				implementsList();
				}
			}

			setState(141);
			match(T__0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (CHILD_COMPONENT - 51)) | (1L << (FAIL_MODE - 51)) | (1L << (ASSIGN - 51)) | (1L << (ASSERT - 51)) | (1L << (PARAMETER - 51)) | (1L << (CONSTANT - 51)) | (1L << (SET - 51)))) != 0)) {
				{
				{
				setState(142);
				componentBodyElement();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(END_COMPONENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentBodyElementContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ChildComponentDeclarationContext childComponentDeclaration() {
			return getRuleContext(ChildComponentDeclarationContext.class,0);
		}
		public FailModeDeclarationContext failModeDeclaration() {
			return getRuleContext(FailModeDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SetTemplateContext setTemplate() {
			return getRuleContext(SetTemplateContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public ComponentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitComponentBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyElementContext componentBodyElement() throws RecognitionException {
		ComponentBodyElementContext _localctx = new ComponentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentBodyElement);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case PARAMETER:
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				fieldDeclaration();
				}
				break;
			case CHILD_COMPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				childComponentDeclaration();
				}
				break;
			case FAIL_MODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				failModeDeclaration();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				assignment();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				setTemplate();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				assertion();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public FieldElementContext fieldElement() {
			return getRuleContext(FieldElementContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			typeType();
			setState(159);
			fieldElement();
			setState(160);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldElementContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public AssociativeDeclaratorContext associativeDeclarator() {
			return getRuleContext(AssociativeDeclaratorContext.class,0);
		}
		public AssociativeInstanceDeclaratorContext associativeInstanceDeclarator() {
			return getRuleContext(AssociativeInstanceDeclaratorContext.class,0);
		}
		public FieldElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFieldElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFieldElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitFieldElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldElementContext fieldElement() throws RecognitionException {
		FieldElementContext _localctx = new FieldElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldElement);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				variableDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				associativeDeclarator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				associativeInstanceDeclarator();
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

	public static class ChildComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode CHILD_COMPONENT() { return getToken(RIIF2Parser.CHILD_COMPONENT, 0); }
		public ChildComponentDeclaratorContext childComponentDeclarator() {
			return getRuleContext(ChildComponentDeclaratorContext.class,0);
		}
		public ChildComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitChildComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildComponentDeclarationContext childComponentDeclaration() throws RecognitionException {
		ChildComponentDeclarationContext _localctx = new ChildComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_childComponentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(CHILD_COMPONENT);
			setState(168);
			childComponentDeclarator();
			setState(169);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FailModeDeclarationContext extends ParserRuleContext {
		public TerminalNode FAIL_MODE() { return getToken(RIIF2Parser.FAIL_MODE, 0); }
		public FailModeDeclaratorContext failModeDeclarator() {
			return getRuleContext(FailModeDeclaratorContext.class,0);
		}
		public FailModeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitFailModeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FailModeDeclarationContext failModeDeclaration() throws RecognitionException {
		FailModeDeclarationContext _localctx = new FailModeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_failModeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FAIL_MODE);
			setState(172);
			failModeDeclarator();
			setState(173);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RIIF2Parser.ASSIGN, 0); }
		public AssignmentDeclaratorContext assignmentDeclarator() {
			return getRuleContext(AssignmentDeclaratorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ASSIGN);
			setState(176);
			assignmentDeclarator();
			setState(177);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTemplateContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(RIIF2Parser.SET, 0); }
		public AssignmentDeclaratorContext assignmentDeclarator() {
			return getRuleContext(AssignmentDeclaratorContext.class,0);
		}
		public SetTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterSetTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitSetTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitSetTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTemplateContext setTemplate() throws RecognitionException {
		SetTemplateContext _localctx = new SetTemplateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(SET);
			setState(180);
			assignmentDeclarator();
			setState(181);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(RIIF2Parser.ASSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentVariableAttributeIdContext assignmentVariableAttributeId() {
			return getRuleContext(AssignmentVariableAttributeIdContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ASSERT);
			{
			setState(184);
			assignmentVariableAttributeId();
			}
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(186);
			expression(0);
			setState(187);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(RIIF2Parser.TEMPLATE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public TerminalNode END_TEMPLATE() { return getToken(RIIF2Parser.END_TEMPLATE, 0); }
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public List<TemplateBodyElementContext> templateBodyElement() {
			return getRuleContexts(TemplateBodyElementContext.class);
		}
		public TemplateBodyElementContext templateBodyElement(int i) {
			return getRuleContext(TemplateBodyElementContext.class,i);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_templateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(TEMPLATE);
			setState(190);
			match(Identifier);
			setState(193);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(191);
				match(EXTENDS);
				setState(192);
				match(Identifier);
				}
			}

			setState(195);
			match(T__0);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPOSE || _la==ABSTRACT) {
				{
				{
				setState(196);
				templateBodyElement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(END_TEMPLATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBodyElementContext extends ParserRuleContext {
		public AbstractFieldDeclarationContext abstractFieldDeclaration() {
			return getRuleContext(AbstractFieldDeclarationContext.class,0);
		}
		public AbstractFailModeDeclarationContext abstractFailModeDeclaration() {
			return getRuleContext(AbstractFailModeDeclarationContext.class,0);
		}
		public AbstractPlatformDeclarationContext abstractPlatformDeclaration() {
			return getRuleContext(AbstractPlatformDeclarationContext.class,0);
		}
		public ImposeDeclarationContext imposeDeclaration() {
			return getRuleContext(ImposeDeclarationContext.class,0);
		}
		public TemplateBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitTemplateBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBodyElementContext templateBodyElement() throws RecognitionException {
		TemplateBodyElementContext _localctx = new TemplateBodyElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_templateBodyElement);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				abstractFieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				abstractFailModeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				abstractPlatformDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				imposeDeclaration();
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

	public static class AbstractFieldDeclarationContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public AbstractFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAbstractFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractFieldDeclarationContext abstractFieldDeclaration() throws RecognitionException {
		AbstractFieldDeclarationContext _localctx = new AbstractFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_abstractFieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ABSTRACT);
			setState(211);
			fieldDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractFailModeDeclarationContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public FailModeDeclarationContext failModeDeclaration() {
			return getRuleContext(FailModeDeclarationContext.class,0);
		}
		public AbstractFailModeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFailModeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractFailModeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractFailModeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAbstractFailModeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractFailModeDeclarationContext abstractFailModeDeclaration() throws RecognitionException {
		AbstractFailModeDeclarationContext _localctx = new AbstractFailModeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_abstractFailModeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ABSTRACT);
			setState(214);
			failModeDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractPlatformDeclarationContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode PLATFORM() { return getToken(RIIF2Parser.PLATFORM, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AbstractPlatformDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractPlatformDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractPlatformDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractPlatformDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAbstractPlatformDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractPlatformDeclarationContext abstractPlatformDeclaration() throws RecognitionException {
		AbstractPlatformDeclarationContext _localctx = new AbstractPlatformDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_abstractPlatformDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ABSTRACT);
			setState(217);
			match(PLATFORM);
			setState(218);
			match(Identifier);
			setState(219);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImposeDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPOSE() { return getToken(RIIF2Parser.IMPOSE, 0); }
		public ImposeDeclaratorContext imposeDeclarator() {
			return getRuleContext(ImposeDeclaratorContext.class,0);
		}
		public ImposeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitImposeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImposeDeclarationContext imposeDeclaration() throws RecognitionException {
		ImposeDeclarationContext _localctx = new ImposeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_imposeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IMPOSE);
			setState(222);
			imposeDeclarator();
			setState(223);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentDeclarationContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(RIIF2Parser.ENVIRONMENT, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TerminalNode END_ENVIRONMENT() { return getToken(RIIF2Parser.END_ENVIRONMENT, 0); }
		public List<EnvironmentBodyElementContext> environmentBodyElement() {
			return getRuleContexts(EnvironmentBodyElementContext.class);
		}
		public EnvironmentBodyElementContext environmentBodyElement(int i) {
			return getRuleContext(EnvironmentBodyElementContext.class,i);
		}
		public EnvironmentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvironmentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvironmentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitEnvironmentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironmentDeclarationContext environmentDeclaration() throws RecognitionException {
		EnvironmentDeclarationContext _localctx = new EnvironmentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_environmentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ENVIRONMENT);
			setState(226);
			match(Identifier);
			setState(227);
			match(T__0);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(228);
				environmentBodyElement();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(END_ENVIRONMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentBodyElementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public EnvParameterDeclarationContext envParameterDeclaration() {
			return getRuleContext(EnvParameterDeclarationContext.class,0);
		}
		public EnvironmentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvironmentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvironmentBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitEnvironmentBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironmentBodyElementContext environmentBodyElement() throws RecognitionException {
		EnvironmentBodyElementContext _localctx = new EnvironmentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_environmentBodyElement);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				assignment();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				envParameterDeclaration();
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

	public static class EnvParameterDeclarationContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(RIIF2Parser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(RIIF2Parser.OUTPUT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnvParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_envParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitEnvParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvParameterDeclarationContext envParameterDeclaration() throws RecognitionException {
		EnvParameterDeclarationContext _localctx = new EnvParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_envParameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(241);
			match(PARAMETER);
			setState(242);
			variableId();
			setState(243);
			match(T__3);
			setState(244);
			primitiveType();
			setState(247);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(245);
				match(T__4);
				setState(246);
				expression(0);
				}
			}

			setState(249);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementDeclarationContext extends ParserRuleContext {
		public TerminalNode REQUIREMENT() { return getToken(RIIF2Parser.REQUIREMENT, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public TerminalNode END_REQUIREMENT() { return getToken(RIIF2Parser.END_REQUIREMENT, 0); }
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public RequirementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterRequirementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitRequirementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitRequirementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementDeclarationContext requirementDeclaration() throws RecognitionException {
		RequirementDeclarationContext _localctx = new RequirementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_requirementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(REQUIREMENT);
			setState(252);
			match(Identifier);
			setState(253);
			match(T__0);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSERT) {
				{
				{
				setState(254);
				assertion();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(END_REQUIREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode TYPE_TABLE() { return getToken(RIIF2Parser.TYPE_TABLE, 0); }
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			variableDeclaratorId();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(263);
				match(T__3);
				setState(264);
				primitiveType();
				setState(267);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(265);
					match(T__4);
					setState(266);
					variableInitializer();
					}
				}

				}
				break;
			case 2:
				{
				setState(269);
				match(T__3);
				setState(270);
				match(TYPE_TABLE);
				}
				break;
			case 3:
				{
				setState(271);
				match(T__4);
				setState(272);
				listInitializer();
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

	public static class AssociativeDeclaratorContext extends ParserRuleContext {
		public AssociativeDeclaratorIdContext associativeDeclaratorId() {
			return getRuleContext(AssociativeDeclaratorIdContext.class,0);
		}
		public AssociativeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssociativeDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativeDeclaratorContext associativeDeclarator() throws RecognitionException {
		AssociativeDeclaratorContext _localctx = new AssociativeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_associativeDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			associativeDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeInstanceDeclaratorContext extends ParserRuleContext {
		public AssociativeInstanceDeclaratorIdContext associativeInstanceDeclaratorId() {
			return getRuleContext(AssociativeInstanceDeclaratorIdContext.class,0);
		}
		public AssociativeInstanceDeclaratorInitializerContext associativeInstanceDeclaratorInitializer() {
			return getRuleContext(AssociativeInstanceDeclaratorInitializerContext.class,0);
		}
		public AssociativeInstanceDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeInstanceDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeInstanceDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeInstanceDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssociativeInstanceDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativeInstanceDeclaratorContext associativeInstanceDeclarator() throws RecognitionException {
		AssociativeInstanceDeclaratorContext _localctx = new AssociativeInstanceDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_associativeInstanceDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			associativeInstanceDeclaratorId();
			setState(280);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(278);
				match(T__4);
				setState(279);
				associativeInstanceDeclaratorInitializer();
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

	public static class ChildComponentDeclaratorContext extends ParserRuleContext {
		public ChildComponentDeclaratorTypeContext childComponentDeclaratorType() {
			return getRuleContext(ChildComponentDeclaratorTypeContext.class,0);
		}
		public ChildComponentDeclaratorIdContext childComponentDeclaratorId() {
			return getRuleContext(ChildComponentDeclaratorIdContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ChildComponentDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitChildComponentDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildComponentDeclaratorContext childComponentDeclarator() throws RecognitionException {
		ChildComponentDeclaratorContext _localctx = new ChildComponentDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_childComponentDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			childComponentDeclaratorType();
			setState(283);
			childComponentDeclaratorId();
			setState(285);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(284);
				vector();
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

	public static class FailModeDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public AssociativeDeclaratorIdContext associativeDeclaratorId() {
			return getRuleContext(AssociativeDeclaratorIdContext.class,0);
		}
		public AssociativeInstanceDeclaratorIdContext associativeInstanceDeclaratorId() {
			return getRuleContext(AssociativeInstanceDeclaratorIdContext.class,0);
		}
		public FailModeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitFailModeDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FailModeDeclaratorContext failModeDeclarator() throws RecognitionException {
		FailModeDeclaratorContext _localctx = new FailModeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_failModeDeclarator);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				associativeDeclaratorId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				associativeInstanceDeclaratorId();
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

	public static class AssignmentDeclaratorContext extends ParserRuleContext {
		public AssignmentDeclaratorIdContext assignmentDeclaratorId() {
			return getRuleContext(AssignmentDeclaratorIdContext.class,0);
		}
		public AssignmentInitializerContext assignmentInitializer() {
			return getRuleContext(AssignmentInitializerContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AssignmentDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssignmentDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentDeclaratorContext assignmentDeclarator() throws RecognitionException {
		AssignmentDeclaratorContext _localctx = new AssignmentDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			assignmentDeclaratorId();
			setState(294);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(293);
				vector();
				}
			}

			setState(296);
			match(T__5);
			setState(297);
			assignmentInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImposeDeclaratorContext extends ParserRuleContext {
		public ImposeDeclaratorIdContext imposeDeclaratorId() {
			return getRuleContext(ImposeDeclaratorIdContext.class,0);
		}
		public ImposeInitializerContext imposeInitializer() {
			return getRuleContext(ImposeInitializerContext.class,0);
		}
		public ImposeDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitImposeDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImposeDeclaratorContext imposeDeclarator() throws RecognitionException {
		ImposeDeclaratorContext _localctx = new ImposeDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_imposeDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			imposeDeclaratorId();
			setState(300);
			match(T__5);
			setState(301);
			imposeInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImposeInitializerContext extends ParserRuleContext {
		public AssignmentInitializerContext assignmentInitializer() {
			return getRuleContext(AssignmentInitializerContext.class,0);
		}
		public ImposeInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitImposeInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImposeInitializerContext imposeInitializer() throws RecognitionException {
		ImposeInitializerContext _localctx = new ImposeInitializerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_imposeInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			assignmentInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeInstanceDeclaratorInitializerContext extends ParserRuleContext {
		public AssignmentInitializerContext assignmentInitializer() {
			return getRuleContext(AssignmentInitializerContext.class,0);
		}
		public AssociativeInstanceDeclaratorInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeInstanceDeclaratorInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeInstanceDeclaratorInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeInstanceDeclaratorInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssociativeInstanceDeclaratorInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativeInstanceDeclaratorInitializerContext associativeInstanceDeclaratorInitializer() throws RecognitionException {
		AssociativeInstanceDeclaratorInitializerContext _localctx = new AssociativeInstanceDeclaratorInitializerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_associativeInstanceDeclaratorInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			assignmentInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListInitializerContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ListInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterListInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitListInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitListInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListInitializerContext listInitializer() throws RecognitionException {
		ListInitializerContext _localctx = new ListInitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_listInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__6);
			setState(310);
			item();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(311);
				match(T__7);
				setState(312);
				item();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__9);
			setState(321);
			item();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(322);
				match(T__7);
				setState(323);
				item();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentInitializerContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public AssignmentInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssignmentInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentInitializerContext assignmentInitializer() throws RecognitionException {
		AssignmentInitializerContext _localctx = new AssignmentInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignmentInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildComponentDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public ChildComponentDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitChildComponentDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildComponentDeclaratorIdContext childComponentDeclaratorId() throws RecognitionException {
		ChildComponentDeclaratorIdContext _localctx = new ChildComponentDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_childComponentDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AssociativeDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssociativeDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativeDeclaratorIdContext associativeDeclaratorId() throws RecognitionException {
		AssociativeDeclaratorIdContext _localctx = new AssociativeDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_associativeDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Identifier);
			setState(338);
			match(T__9);
			setState(339);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeInstanceDeclaratorIdContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public AssociativeInstanceDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeInstanceDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssociativeInstanceDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssociativeInstanceDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssociativeInstanceDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativeInstanceDeclaratorIdContext associativeInstanceDeclaratorId() throws RecognitionException {
		AssociativeInstanceDeclaratorIdContext _localctx = new AssociativeInstanceDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_associativeInstanceDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(Identifier);
			setState(342);
			match(T__9);
			setState(343);
			match(Identifier);
			setState(344);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public AssociativeInstanceDeclaratorIdContext associativeInstanceDeclaratorId() {
			return getRuleContext(AssociativeInstanceDeclaratorIdContext.class,0);
		}
		public VariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVariableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVariableId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitVariableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdContext variableId() throws RecognitionException {
		VariableIdContext _localctx = new VariableIdContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableId);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				associativeInstanceDeclaratorId();
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

	public static class AssignmentDeclaratorIdContext extends ParserRuleContext {
		public AssignmentVariableIdContext assignmentVariableId() {
			return getRuleContext(AssignmentVariableIdContext.class,0);
		}
		public AssignmentVariableAttributeIdContext assignmentVariableAttributeId() {
			return getRuleContext(AssignmentVariableAttributeIdContext.class,0);
		}
		public AssignmentTableItemIdContext assignmentTableItemId() {
			return getRuleContext(AssignmentTableItemIdContext.class,0);
		}
		public AssignmentDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssignmentDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentDeclaratorIdContext assignmentDeclaratorId() throws RecognitionException {
		AssignmentDeclaratorIdContext _localctx = new AssignmentDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_assignmentDeclaratorId);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				assignmentVariableId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				assignmentVariableAttributeId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				assignmentTableItemId();
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

	public static class AssignmentVariableIdContext extends ParserRuleContext {
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public AssignmentVariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentVariableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentVariableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentVariableId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssignmentVariableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentVariableIdContext assignmentVariableId() throws RecognitionException {
		AssignmentVariableIdContext _localctx = new AssignmentVariableIdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignmentVariableId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					match(Identifier);
					setState(356);
					match(T__11);
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(362);
			variableId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentVariableAttributeIdContext extends ParserRuleContext {
		public AssignmentVariableIdContext assignmentVariableId() {
			return getRuleContext(AssignmentVariableIdContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AssignmentVariableAttributeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentVariableAttributeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentVariableAttributeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentVariableAttributeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssignmentVariableAttributeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentVariableAttributeIdContext assignmentVariableAttributeId() throws RecognitionException {
		AssignmentVariableAttributeIdContext _localctx = new AssignmentVariableAttributeIdContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentVariableAttributeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			assignmentVariableId();
			setState(365);
			match(T__12);
			setState(366);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentTableItemIdContext extends ParserRuleContext {
		public AssignmentVariableAttributeIdContext assignmentVariableAttributeId() {
			return getRuleContext(AssignmentVariableAttributeIdContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public AssignmentTableItemIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentTableItemId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignmentTableItemId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignmentTableItemId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitAssignmentTableItemId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentTableItemIdContext assignmentTableItemId() throws RecognitionException {
		AssignmentTableItemIdContext _localctx = new AssignmentTableItemIdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignmentTableItemId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			assignmentVariableAttributeId();
			setState(369);
			match(T__9);
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(371);
			match(T__10);
			setState(372);
			match(T__9);
			setState(373);
			match(Identifier);
			setState(374);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImposeDeclaratorIdContext extends ParserRuleContext {
		public AssignmentDeclaratorIdContext assignmentDeclaratorId() {
			return getRuleContext(AssignmentDeclaratorIdContext.class,0);
		}
		public ImposeDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitImposeDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImposeDeclaratorIdContext imposeDeclaratorId() throws RecognitionException {
		ImposeDeclaratorIdContext _localctx = new ImposeDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_imposeDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			assignmentDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_FLOAT() { return getToken(RIIF2Parser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_INTEGER() { return getToken(RIIF2Parser.TYPE_INTEGER, 0); }
		public TerminalNode TYPE_STRING() { return getToken(RIIF2Parser.TYPE_STRING, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primitiveType);
		try {
			setState(383);
			switch (_input.LA(1)) {
			case TYPE_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(TYPE_FLOAT);
				}
				break;
			case TYPE_INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(TYPE_INTEGER);
				}
				break;
			case TYPE_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(TYPE_STRING);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(Identifier);
				}
				break;
			case TYPE_ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				enumType();
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

	public static class TypeTypeContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==PARAMETER || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_ENUM() { return getToken(RIIF2Parser.TYPE_ENUM, 0); }
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitEnumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(TYPE_ENUM);
			setState(388);
			match(T__6);
			setState(389);
			match(Identifier);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(390);
				match(T__7);
				setState(391);
				match(Identifier);
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ListInitializerContext listInitializer() {
			return getRuleContext(ListInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_item);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				arrayInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				listInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				expression(0);
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

	public static class ChildComponentDeclaratorTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public ChildComponentDeclaratorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDeclaratorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDeclaratorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDeclaratorType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitChildComponentDeclaratorType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildComponentDeclaratorTypeContext childComponentDeclaratorType() throws RecognitionException {
		ChildComponentDeclaratorTypeContext _localctx = new ChildComponentDeclaratorTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_childComponentDeclaratorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__9);
			setState(407);
			expression(0);
			setState(408);
			match(T__3);
			setState(409);
			expression(0);
			setState(410);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> Identifier() { return getTokens(RIIF2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(RIIF2Parser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(Identifier);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(413);
				match(T__7);
				setState(414);
				match(Identifier);
				}
				}
				setState(419);
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

	public static class ExtendsListContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExtendsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterExtendsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitExtendsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitExtendsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsListContext extendsList() throws RecognitionException {
		ExtendsListContext _localctx = new ExtendsListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_extendsList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsListContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ImplementsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImplementsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImplementsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitImplementsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsListContext implementsList() throws RecognitionException {
		ImplementsListContext _localctx = new ImplementsListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_implementsList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			identifierList();
			}
		}
		catch (RecognitionException re) {
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			switch (_input.LA(1)) {
			case T__9:
			case T__42:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case Identifier:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
				{
				setState(425);
				primary();
				}
				break;
			case T__14:
			case T__15:
				{
				setState(426);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(427);
				expression(14);
				}
				break;
			case T__16:
			case T__17:
				{
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(429);
				expression(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(479);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(432);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(433);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(434);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(435);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(436);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(437);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(438);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(446);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(439);
							match(T__1);
							setState(440);
							match(T__1);
							}
							break;
						case 2:
							{
							setState(441);
							match(T__2);
							setState(442);
							match(T__2);
							setState(443);
							match(T__2);
							}
							break;
						case 3:
							{
							setState(444);
							match(T__2);
							setState(445);
							match(T__2);
							}
							break;
						}
						setState(448);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(449);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(450);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__21) | (1L << T__22))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(451);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(452);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(453);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(454);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(455);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(456);
						match(T__25);
						setState(457);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(458);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(459);
						match(T__26);
						setState(460);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(461);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(462);
						match(T__27);
						setState(463);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(464);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(465);
						match(T__28);
						setState(466);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(467);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(468);
						match(T__29);
						setState(469);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(470);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(471);
						match(T__30);
						setState(472);
						expression(0);
						setState(473);
						match(T__3);
						setState(474);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(476);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(477);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(478);
						expression(1);
						}
						break;
					}
					} 
				}
				setState(483);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(RIIF2Parser.SELF, 0); }
		public TerminalNode Identifier() { return getToken(RIIF2Parser.Identifier, 0); }
		public AssignmentDeclaratorIdContext assignmentDeclaratorId() {
			return getRuleContext(AssignmentDeclaratorIdContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primary);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(T__42);
				setState(485);
				expression(0);
				setState(486);
				match(T__43);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(SELF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				assignmentDeclaratorId();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				funcCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				arrayInitializer();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(RIIF2Parser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(RIIF2Parser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(RIIF2Parser.FloatingPointLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (StringLiteral - 78)) | (1L << (FloatingPointLiteral - 78)) | (1L << (DecimalLiteral - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FuncCallContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			funcName();
			setState(499);
			match(T__42);
			setState(500);
			funcArg();
			setState(503);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(501);
				match(T__7);
				setState(502);
				funcArg();
				}
			}

			setState(505);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode FUNC_LOG() { return getToken(RIIF2Parser.FUNC_LOG, 0); }
		public TerminalNode FUNC_EXP() { return getToken(RIIF2Parser.FUNC_EXP, 0); }
		public TerminalNode FUNC_AGG_SINGLE() { return getToken(RIIF2Parser.FUNC_AGG_SINGLE, 0); }
		public TerminalNode FUNC_GT_N_FAIL() { return getToken(RIIF2Parser.FUNC_GT_N_FAIL, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_funcName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FUNC_AGG_SINGLE - 64)) | (1L << (FUNC_GT_N_FAIL - 64)) | (1L << (FUNC_LOG - 64)) | (1L << (FUNC_EXP - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FuncArgContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AssignmentDeclaratorIdContext assignmentDeclaratorId() {
			return getRuleContext(AssignmentDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RIIF2Visitor ) return ((RIIF2Visitor<? extends T>)visitor).visitFuncArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_funcArg);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(509);
				assignmentDeclaratorId();
				}
				setState(510);
				vector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 53:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3U\u0206\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\6"+
		"\2z\n\2\r\2\16\2{\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\4\3\4\3\4\3"+
		"\4\5\4\u008a\n\4\3\4\3\4\5\4\u008e\n\4\3\4\3\4\7\4\u0092\n\4\f\4\16\4"+
		"\u0095\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009f\n\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\5\7\u00a8\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5"+
		"\r\u00c4\n\r\3\r\3\r\7\r\u00c8\n\r\f\r\16\r\u00cb\13\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\5\16\u00d3\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00e8\n\23"+
		"\f\23\16\23\u00eb\13\23\3\23\3\23\3\24\3\24\5\24\u00f1\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00fa\n\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\7\26\u0102\n\26\f\26\16\26\u0105\13\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u010e\n\27\3\27\3\27\3\27\3\27\5\27\u0114\n\27\3\30\3\30\3"+
		"\31\3\31\3\31\5\31\u011b\n\31\3\32\3\32\3\32\5\32\u0120\n\32\3\33\3\33"+
		"\3\33\5\33\u0125\n\33\3\34\3\34\5\34\u0129\n\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\7!\u013c\n!\f!\16"+
		"!\u013f\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0147\n\"\f\"\16\"\u014a\13\"\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\5(\u015f"+
		"\n(\3)\3)\3)\5)\u0164\n)\3*\3*\7*\u0168\n*\f*\16*\u016b\13*\3*\3*\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\5.\u0182\n.\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\7\60\u018b\n\60\f\60\16\60\u018e\13\60\3\60"+
		"\3\60\3\61\3\61\3\61\5\61\u0195\n\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\7\64\u01a2\n\64\f\64\16\64\u01a5\13\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01b1\n\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01c1\n\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\7\67\u01e2\n\67\f\67\16\67\u01e5\13\67\38\38\38\38\38"+
		"\38\38\38\38\38\58\u01f1\n8\39\39\3:\3:\3:\3:\3:\5:\u01fa\n:\3:\3:\3;"+
		"\3;\3<\3<\3<\3<\5<\u0204\n<\3<\2\3l=\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\16\3\2"+
		"\4\5\3\2:;\4\2\20\20OO\3\2<=\3\2\21\22\3\2\23\24\3\2\25\27\4\2\4\5\30"+
		"\31\3\2\32\33\4\2\b\b\",\3\2PR\3\2BE\u020f\2y\3\2\2\2\4\u0083\3\2\2\2"+
		"\6\u0085\3\2\2\2\b\u009e\3\2\2\2\n\u00a0\3\2\2\2\f\u00a7\3\2\2\2\16\u00a9"+
		"\3\2\2\2\20\u00ad\3\2\2\2\22\u00b1\3\2\2\2\24\u00b5\3\2\2\2\26\u00b9\3"+
		"\2\2\2\30\u00bf\3\2\2\2\32\u00d2\3\2\2\2\34\u00d4\3\2\2\2\36\u00d7\3\2"+
		"\2\2 \u00da\3\2\2\2\"\u00df\3\2\2\2$\u00e3\3\2\2\2&\u00f0\3\2\2\2(\u00f2"+
		"\3\2\2\2*\u00fd\3\2\2\2,\u0108\3\2\2\2.\u0115\3\2\2\2\60\u0117\3\2\2\2"+
		"\62\u011c\3\2\2\2\64\u0124\3\2\2\2\66\u0126\3\2\2\28\u012d\3\2\2\2:\u0131"+
		"\3\2\2\2<\u0133\3\2\2\2>\u0135\3\2\2\2@\u0137\3\2\2\2B\u0142\3\2\2\2D"+
		"\u014d\3\2\2\2F\u014f\3\2\2\2H\u0151\3\2\2\2J\u0153\3\2\2\2L\u0157\3\2"+
		"\2\2N\u015e\3\2\2\2P\u0163\3\2\2\2R\u0169\3\2\2\2T\u016e\3\2\2\2V\u0172"+
		"\3\2\2\2X\u017a\3\2\2\2Z\u0181\3\2\2\2\\\u0183\3\2\2\2^\u0185\3\2\2\2"+
		"`\u0194\3\2\2\2b\u0196\3\2\2\2d\u0198\3\2\2\2f\u019e\3\2\2\2h\u01a6\3"+
		"\2\2\2j\u01a8\3\2\2\2l\u01b0\3\2\2\2n\u01f0\3\2\2\2p\u01f2\3\2\2\2r\u01f4"+
		"\3\2\2\2t\u01fd\3\2\2\2v\u0203\3\2\2\2xz\5\4\3\2yx\3\2\2\2z{\3\2\2\2{"+
		"y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\2\2\3~\3\3\2\2\2\177\u0084\5\6\4\2\u0080"+
		"\u0084\5\30\r\2\u0081\u0084\5$\23\2\u0082\u0084\5*\26\2\u0083\177\3\2"+
		"\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\5\3\2\2\2\u0085\u0086\7/\2\2\u0086\u0089\7O\2\2\u0087\u0088\7\67\2\2"+
		"\u0088\u008a\5h\65\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u008c\7J\2\2\u008c\u008e\5j\66\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\7\3\2\2\u0090\u0092\5\b"+
		"\5\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\60"+
		"\2\2\u0097\7\3\2\2\2\u0098\u009f\5\n\6\2\u0099\u009f\5\16\b\2\u009a\u009f"+
		"\5\20\t\2\u009b\u009f\5\22\n\2\u009c\u009f\5\24\13\2\u009d\u009f\5\26"+
		"\f\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e"+
		"\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\t\3\2\2\2"+
		"\u00a0\u00a1\5\\/\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\3\2\2\u00a3\13\3"+
		"\2\2\2\u00a4\u00a8\5,\27\2\u00a5\u00a8\5.\30\2\u00a6\u00a8\5\60\31\2\u00a7"+
		"\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\r\3\2\2\2"+
		"\u00a9\u00aa\7\65\2\2\u00aa\u00ab\5\62\32\2\u00ab\u00ac\7\3\2\2\u00ac"+
		"\17\3\2\2\2\u00ad\u00ae\7\66\2\2\u00ae\u00af\5\64\33\2\u00af\u00b0\7\3"+
		"\2\2\u00b0\21\3\2\2\2\u00b1\u00b2\78\2\2\u00b2\u00b3\5\66\34\2\u00b3\u00b4"+
		"\7\3\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\7L\2\2\u00b6\u00b7\5\66\34\2\u00b7"+
		"\u00b8\7\3\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\79\2\2\u00ba\u00bb\5T+\2\u00bb"+
		"\u00bc\t\2\2\2\u00bc\u00bd\5l\67\2\u00bd\u00be\7\3\2\2\u00be\27\3\2\2"+
		"\2\u00bf\u00c0\7F\2\2\u00c0\u00c3\7O\2\2\u00c1\u00c2\7\67\2\2\u00c2\u00c4"+
		"\7O\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c9\7\3\2\2\u00c6\u00c8\5\32\16\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7G\2\2\u00cd\31\3\2\2\2\u00ce\u00d3\5\34\17"+
		"\2\u00cf\u00d3\5\36\20\2\u00d0\u00d3\5 \21\2\u00d1\u00d3\5\"\22\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\7I\2\2\u00d5\u00d6\5\n\6\2\u00d6\35"+
		"\3\2\2\2\u00d7\u00d8\7I\2\2\u00d8\u00d9\5\20\t\2\u00d9\37\3\2\2\2\u00da"+
		"\u00db\7I\2\2\u00db\u00dc\7N\2\2\u00dc\u00dd\7O\2\2\u00dd\u00de\7\3\2"+
		"\2\u00de!\3\2\2\2\u00df\u00e0\7H\2\2\u00e0\u00e1\58\35\2\u00e1\u00e2\7"+
		"\3\2\2\u00e2#\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e5\7O\2\2\u00e5\u00e9"+
		"\7\3\2\2\u00e6\u00e8\5&\24\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\7\62\2\2\u00ed%\3\2\2\2\u00ee\u00f1\5\22\n\2\u00ef\u00f1"+
		"\5(\25\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\'\3\2\2\2\u00f2"+
		"\u00f3\t\3\2\2\u00f3\u00f4\7<\2\2\u00f4\u00f5\5N(\2\u00f5\u00f6\7\6\2"+
		"\2\u00f6\u00f9\5Z.\2\u00f7\u00f8\7\7\2\2\u00f8\u00fa\5l\67\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\3\2\2\u00fc"+
		")\3\2\2\2\u00fd\u00fe\7\63\2\2\u00fe\u00ff\7O\2\2\u00ff\u0103\7\3\2\2"+
		"\u0100\u0102\5\26\f\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0107\7\64\2\2\u0107+\3\2\2\2\u0108\u0113\5H%\2\u0109\u010a\7\6\2\2\u010a"+
		"\u010d\5Z.\2\u010b\u010c\7\7\2\2\u010c\u010e\5:\36\2\u010d\u010b\3\2\2"+
		"\2\u010d\u010e\3\2\2\2\u010e\u0114\3\2\2\2\u010f\u0110\7\6\2\2\u0110\u0114"+
		"\7M\2\2\u0111\u0112\7\7\2\2\u0112\u0114\5@!\2\u0113\u0109\3\2\2\2\u0113"+
		"\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0114-\3\2\2\2\u0115\u0116\5J&\2\u0116"+
		"/\3\2\2\2\u0117\u011a\5L\'\2\u0118\u0119\7\7\2\2\u0119\u011b\5> \2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\61\3\2\2\2\u011c\u011d\5b\62"+
		"\2\u011d\u011f\5F$\2\u011e\u0120\5d\63\2\u011f\u011e\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\63\3\2\2\2\u0121\u0125\5H%\2\u0122\u0125\5J&\2\u0123\u0125"+
		"\5L\'\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\65\3\2\2\2\u0126\u0128\5P)\2\u0127\u0129\5d\63\2\u0128\u0127\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\b\2\2\u012b\u012c"+
		"\5D#\2\u012c\67\3\2\2\2\u012d\u012e\5X-\2\u012e\u012f\7\b\2\2\u012f\u0130"+
		"\5<\37\2\u01309\3\2\2\2\u0131\u0132\5l\67\2\u0132;\3\2\2\2\u0133\u0134"+
		"\5D#\2\u0134=\3\2\2\2\u0135\u0136\5D#\2\u0136?\3\2\2\2\u0137\u0138\7\t"+
		"\2\2\u0138\u013d\5`\61\2\u0139\u013a\7\n\2\2\u013a\u013c\5`\61\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\13\2\2\u0141"+
		"A\3\2\2\2\u0142\u0143\7\f\2\2\u0143\u0148\5`\61\2\u0144\u0145\7\n\2\2"+
		"\u0145\u0147\5`\61\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\7\r\2\2\u014cC\3\2\2\2\u014d\u014e\5`\61\2\u014eE\3\2\2\2\u014f"+
		"\u0150\7O\2\2\u0150G\3\2\2\2\u0151\u0152\7O\2\2\u0152I\3\2\2\2\u0153\u0154"+
		"\7O\2\2\u0154\u0155\7\f\2\2\u0155\u0156\7\r\2\2\u0156K\3\2\2\2\u0157\u0158"+
		"\7O\2\2\u0158\u0159\7\f\2\2\u0159\u015a\7O\2\2\u015a\u015b\7\r\2\2\u015b"+
		"M\3\2\2\2\u015c\u015f\5H%\2\u015d\u015f\5L\'\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015fO\3\2\2\2\u0160\u0164\5R*\2\u0161\u0164\5T+\2\u0162"+
		"\u0164\5V,\2\u0163\u0160\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2"+
		"\2\u0164Q\3\2\2\2\u0165\u0166\7O\2\2\u0166\u0168\7\16\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\5N(\2\u016dS\3\2\2\2\u016e"+
		"\u016f\5R*\2\u016f\u0170\7\17\2\2\u0170\u0171\7O\2\2\u0171U\3\2\2\2\u0172"+
		"\u0173\5T+\2\u0173\u0174\7\f\2\2\u0174\u0175\t\4\2\2\u0175\u0176\7\r\2"+
		"\2\u0176\u0177\7\f\2\2\u0177\u0178\7O\2\2\u0178\u0179\7\r\2\2\u0179W\3"+
		"\2\2\2\u017a\u017b\5P)\2\u017bY\3\2\2\2\u017c\u0182\7>\2\2\u017d\u0182"+
		"\7?\2\2\u017e\u0182\7@\2\2\u017f\u0182\7O\2\2\u0180\u0182\5^\60\2\u0181"+
		"\u017c\3\2\2\2\u0181\u017d\3\2\2\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0180\3\2\2\2\u0182[\3\2\2\2\u0183\u0184\t\5\2\2\u0184]\3\2"+
		"\2\2\u0185\u0186\7A\2\2\u0186\u0187\7\t\2\2\u0187\u018c\7O\2\2\u0188\u0189"+
		"\7\n\2\2\u0189\u018b\7O\2\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\7\13\2\2\u0190_\3\2\2\2\u0191\u0195\5B\"\2\u0192\u0195"+
		"\5@!\2\u0193\u0195\5l\67\2\u0194\u0191\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0193\3\2\2\2\u0195a\3\2\2\2\u0196\u0197\7O\2\2\u0197c\3\2\2\2\u0198"+
		"\u0199\7\f\2\2\u0199\u019a\5l\67\2\u019a\u019b\7\6\2\2\u019b\u019c\5l"+
		"\67\2\u019c\u019d\7\r\2\2\u019de\3\2\2\2\u019e\u01a3\7O\2\2\u019f\u01a0"+
		"\7\n\2\2\u01a0\u01a2\7O\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4g\3\2\2\2\u01a5\u01a3\3\2\2\2"+
		"\u01a6\u01a7\5f\64\2\u01a7i\3\2\2\2\u01a8\u01a9\5f\64\2\u01a9k\3\2\2\2"+
		"\u01aa\u01ab\b\67\1\2\u01ab\u01b1\5n8\2\u01ac\u01ad\t\6\2\2\u01ad\u01b1"+
		"\5l\67\20\u01ae\u01af\t\7\2\2\u01af\u01b1\5l\67\17\u01b0\u01aa\3\2\2\2"+
		"\u01b0\u01ac\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01e3\3\2\2\2\u01b2\u01b3"+
		"\f\16\2\2\u01b3\u01b4\t\b\2\2\u01b4\u01e2\5l\67\17\u01b5\u01b6\f\r\2\2"+
		"\u01b6\u01b7\t\6\2\2\u01b7\u01e2\5l\67\16\u01b8\u01c0\f\f\2\2\u01b9\u01ba"+
		"\7\4\2\2\u01ba\u01c1\7\4\2\2\u01bb\u01bc\7\5\2\2\u01bc\u01bd\7\5\2\2\u01bd"+
		"\u01c1\7\5\2\2\u01be\u01bf\7\5\2\2\u01bf\u01c1\7\5\2\2\u01c0\u01b9\3\2"+
		"\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01e2\5l\67\r\u01c3\u01c4\f\13\2\2\u01c4\u01c5\t\t\2\2\u01c5\u01e2\5"+
		"l\67\f\u01c6\u01c7\f\n\2\2\u01c7\u01c8\t\n\2\2\u01c8\u01e2\5l\67\13\u01c9"+
		"\u01ca\f\t\2\2\u01ca\u01cb\7\34\2\2\u01cb\u01e2\5l\67\n\u01cc\u01cd\f"+
		"\b\2\2\u01cd\u01ce\7\35\2\2\u01ce\u01e2\5l\67\t\u01cf\u01d0\f\7\2\2\u01d0"+
		"\u01d1\7\36\2\2\u01d1\u01e2\5l\67\b\u01d2\u01d3\f\6\2\2\u01d3\u01d4\7"+
		"\37\2\2\u01d4\u01e2\5l\67\7\u01d5\u01d6\f\5\2\2\u01d6\u01d7\7 \2\2\u01d7"+
		"\u01e2\5l\67\6\u01d8\u01d9\f\4\2\2\u01d9\u01da\7!\2\2\u01da\u01db\5l\67"+
		"\2\u01db\u01dc\7\6\2\2\u01dc\u01dd\5l\67\5\u01dd\u01e2\3\2\2\2\u01de\u01df"+
		"\f\3\2\2\u01df\u01e0\t\13\2\2\u01e0\u01e2\5l\67\3\u01e1\u01b2\3\2\2\2"+
		"\u01e1\u01b5\3\2\2\2\u01e1\u01b8\3\2\2\2\u01e1\u01c3\3\2\2\2\u01e1\u01c6"+
		"\3\2\2\2\u01e1\u01c9\3\2\2\2\u01e1\u01cc\3\2\2\2\u01e1\u01cf\3\2\2\2\u01e1"+
		"\u01d2\3\2\2\2\u01e1\u01d5\3\2\2\2\u01e1\u01d8\3\2\2\2\u01e1\u01de\3\2"+
		"\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"m\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7-\2\2\u01e7\u01e8\5l\67\2\u01e8"+
		"\u01e9\7.\2\2\u01e9\u01f1\3\2\2\2\u01ea\u01f1\7K\2\2\u01eb\u01f1\7O\2"+
		"\2\u01ec\u01f1\5P)\2\u01ed\u01f1\5p9\2\u01ee\u01f1\5r:\2\u01ef\u01f1\5"+
		"B\"\2\u01f0\u01e6\3\2\2\2\u01f0\u01ea\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0"+
		"\u01ec\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2"+
		"\2\2\u01f1o\3\2\2\2\u01f2\u01f3\t\f\2\2\u01f3q\3\2\2\2\u01f4\u01f5\5t"+
		";\2\u01f5\u01f6\7-\2\2\u01f6\u01f9\5v<\2\u01f7\u01f8\7\n\2\2\u01f8\u01fa"+
		"\5v<\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fc\7.\2\2\u01fcs\3\2\2\2\u01fd\u01fe\t\r\2\2\u01feu\3\2\2\2\u01ff"+
		"\u0200\5P)\2\u0200\u0201\5d\63\2\u0201\u0204\3\2\2\2\u0202\u0204\5l\67"+
		"\2\u0203\u01ff\3\2\2\2\u0203\u0202\3\2\2\2\u0204w\3\2\2\2&{\u0083\u0089"+
		"\u008d\u0093\u009e\u00a7\u00c3\u00c9\u00d2\u00e9\u00f0\u00f9\u0103\u010d"+
		"\u0113\u011a\u011f\u0124\u0128\u013d\u0148\u015e\u0163\u0169\u0181\u018c"+
		"\u0194\u01a3\u01b0\u01c0\u01e1\u01e3\u01f0\u01f9\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}