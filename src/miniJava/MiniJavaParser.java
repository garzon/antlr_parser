// Generated from D:/文档/我在FDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6
package miniJava;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, COMMENT=66, 
		INT_HEX=67, INT_BIN=68, INT_DEC=69, ID=70, WS=71;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_declaration = 3, 
		RULE_propertyDeclaration = 4, RULE_varDeclaration = 5, RULE_permissionDesc = 6, 
		RULE_argPair = 7, RULE_methodDeclaration = 8, RULE_type = 9, RULE_arrType = 10, 
		RULE_basicType = 11, RULE_stmtBlock = 12, RULE_assignSym = 13, RULE_stmtBody = 14, 
		RULE_stmt = 15, RULE_exp = 16, RULE_boolLiteral = 17, RULE_intLiteral = 18;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "declaration", "propertyDeclaration", 
		"varDeclaration", "permissionDesc", "argPair", "methodDeclaration", "type", 
		"arrType", "basicType", "stmtBlock", "assignSym", "stmtBody", "stmt", 
		"exp", "boolLiteral", "intLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "'='", "';'", "'private'", 
		"','", "'boolean'", "'int'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", 
		"'|='", "'^='", "'<<='", "'>>='", "'>>>='", "'return'", "'if'", "'else'", 
		"'while'", "'for'", "'System.out.println'", "'.'", "'length'", "'!'", 
		"'+'", "'-'", "'~'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
		"'?'", "':'", "'this'", "'new'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMMENT", "INT_HEX", "INT_BIN", "INT_DEC", 
		"ID", "WS"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			mainClass();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(39);
				classDeclaration();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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

	public static class MainClassContext extends ParserRuleContext {
		public Token className;
		public Token args;
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			((MainClassContext)_localctx).className = match(ID);
			setState(49);
			match(T__1);
			setState(50);
			match(T__2);
			setState(51);
			match(T__3);
			setState(52);
			match(T__4);
			setState(53);
			match(T__5);
			setState(54);
			match(T__6);
			setState(55);
			match(T__7);
			setState(56);
			match(T__8);
			setState(57);
			match(T__9);
			setState(58);
			((MainClassContext)_localctx).args = match(ID);
			setState(59);
			match(T__10);
			setState(60);
			stmtBlock();
			setState(61);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token parentName;
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__0);
			setState(64);
			((ClassDeclarationContext)_localctx).className = match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(65);
				match(T__12);
				setState(66);
				((ClassDeclarationContext)_localctx).parentName = match(ID);
				}
			}

			setState(69);
			match(T__1);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__15) | (1L << T__17) | (1L << T__18))) != 0) || _la==ID) {
				{
				{
				setState(70);
				declaration();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
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
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				methodDeclaration();
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			varDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
			match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(86);
				match(T__13);
				setState(87);
				exp(0);
				}
			}

			setState(90);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PermissionDescContext extends ParserRuleContext {
		public PermissionDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permissionDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPermissionDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPermissionDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPermissionDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermissionDescContext permissionDesc() throws RecognitionException {
		PermissionDescContext _localctx = new PermissionDescContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_permissionDesc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__15) ) {
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

	public static class ArgPairContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ArgPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArgPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArgPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArgPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgPairContext argPair() throws RecognitionException {
		ArgPairContext _localctx = new ArgPairContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type();
			setState(95);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext returnType;
		public Token methodName;
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public PermissionDescContext permissionDesc() {
			return getRuleContext(PermissionDescContext.class,0);
		}
		public List<ArgPairContext> argPair() {
			return getRuleContexts(ArgPairContext.class);
		}
		public ArgPairContext argPair(int i) {
			return getRuleContext(ArgPairContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__15) {
				{
				setState(97);
				permissionDesc();
				}
			}

			setState(100);
			((MethodDeclarationContext)_localctx).returnType = type();
			setState(101);
			((MethodDeclarationContext)_localctx).methodName = match(ID);
			setState(102);
			match(T__6);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__17) | (1L << T__18))) != 0) || _la==ID) {
				{
				setState(103);
				argPair();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(104);
					match(T__16);
					setState(105);
					argPair();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(113);
			match(T__10);
			setState(114);
			stmtBlock();
			}
		}
		catch (RecognitionException re) {
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
		public ArrTypeContext arrType() {
			return getRuleContext(ArrTypeContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				arrType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				basicType();
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

	public static class ArrTypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ArrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrTypeContext arrType() throws RecognitionException {
		ArrTypeContext _localctx = new ArrTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			basicType();
			setState(121);
			match(T__8);
			setState(122);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__17) | (1L << T__18))) != 0) || _la==ID) ) {
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

	public static class StmtBlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtBlockContext stmtBlock() throws RecognitionException {
		StmtBlockContext _localctx = new StmtBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__1);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (INT_HEX - 64)) | (1L << (INT_BIN - 64)) | (1L << (INT_DEC - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(127);
				stmt();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignSymContext extends ParserRuleContext {
		public AssignSymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignSym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignSym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignSym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignSym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignSymContext assignSym() throws RecognitionException {
		AssignSymContext _localctx = new AssignSymContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignSym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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

	public static class StmtBodyContext extends ParserRuleContext {
		public StmtBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBody; }
	 
		public StmtBodyContext() { }
		public void copyFrom(StmtBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtExpContext extends StmtBodyContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtExpContext(StmtBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStmtExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStmtExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStmtExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetIndexOfContext extends StmtBodyContext {
		public ExpContext idx;
		public ExpContext v;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public AssignSymContext assignSym() {
			return getRuleContext(AssignSymContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SetIndexOfContext(StmtBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSetIndexOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSetIndexOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitSetIndexOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignToExpContext extends StmtBodyContext {
		public ExpContext prop;
		public AssignSymContext assignSym() {
			return getRuleContext(AssignSymContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AssignToExpContext(StmtBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignToExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignToExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignToExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StmtBodyContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnContext(StmtBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StmtBodyContext {
		public ExpContext v;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public AssignSymContext assignSym() {
			return getRuleContext(AssignSymContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(StmtBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtBodyContext stmtBody() throws RecognitionException {
		StmtBodyContext _localctx = new StmtBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmtBody);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ID);
				setState(138);
				assignSym();
				setState(139);
				((AssignContext)_localctx).v = exp(0);
				}
				break;
			case 2:
				_localctx = new SetIndexOfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ID);
				setState(142);
				match(T__8);
				setState(143);
				((SetIndexOfContext)_localctx).idx = exp(0);
				setState(144);
				match(T__9);
				setState(145);
				assignSym();
				setState(146);
				((SetIndexOfContext)_localctx).v = exp(0);
				}
				break;
			case 3:
				_localctx = new StmtExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				exp(0);
				}
				break;
			case 4:
				_localctx = new AssignToExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				((AssignToExpContext)_localctx).prop = exp(0);
				setState(150);
				assignSym();
				setState(151);
				exp(0);
				}
				break;
			case 5:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(T__30);
				setState(154);
				exp(0);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SystemCallContext extends StmtContext {
		public Token systemCallName;
		public Token lpar;
		public Token rpar;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SystemCallContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSystemCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSystemCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitSystemCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends StmtContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StmtContext {
		public StmtContext start_stmt;
		public StmtBodyContext step_stmt;
		public StmtContext body;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtBodyContext stmtBody() {
			return getRuleContext(StmtBodyContext.class,0);
		}
		public ForContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalStmtContext extends StmtContext {
		public StmtBodyContext stmtBody() {
			return getRuleContext(StmtBodyContext.class,0);
		}
		public NormalStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNormalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNormalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNormalStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtContext extends StmtContext {
		public EmptyStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends StmtContext {
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public BlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StmtContext {
		public StmtContext t_stmt;
		public StmtContext f_stmt;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				varDeclaration();
				}
				break;
			case 2:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				stmtBlock();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__31);
				setState(160);
				match(T__6);
				setState(161);
				exp(0);
				setState(162);
				match(T__10);
				setState(163);
				((IfContext)_localctx).t_stmt = stmt();
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(164);
					match(T__32);
					setState(165);
					((IfContext)_localctx).f_stmt = stmt();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__33);
				setState(169);
				match(T__6);
				setState(170);
				exp(0);
				setState(171);
				match(T__10);
				setState(172);
				stmt();
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(T__34);
				setState(175);
				match(T__6);
				setState(176);
				((ForContext)_localctx).start_stmt = stmt();
				setState(177);
				exp(0);
				setState(178);
				match(T__14);
				setState(179);
				((ForContext)_localctx).step_stmt = stmtBody();
				setState(180);
				match(T__10);
				setState(181);
				((ForContext)_localctx).body = stmt();
				}
				break;
			case 6:
				_localctx = new SystemCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				((SystemCallContext)_localctx).systemCallName = match(T__35);
				setState(184);
				((SystemCallContext)_localctx).lpar = match(T__6);
				setState(185);
				exp(0);
				setState(186);
				((SystemCallContext)_localctx).rpar = match(T__10);
				setState(187);
				match(T__14);
				}
				break;
			case 7:
				_localctx = new SystemCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				((SystemCallContext)_localctx).systemCallName = match(T__35);
				setState(190);
				exp(0);
				setState(191);
				match(T__14);
				}
				break;
			case 8:
				_localctx = new NormalStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				stmtBody();
				setState(194);
				match(T__14);
				}
				break;
			case 9:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(196);
				match(T__14);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryOpContext extends ExpContext {
		public ExpContext first;
		public Token op;
		public ExpContext second;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinaryOpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetPropertyContext extends ExpContext {
		public ExpContext id;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GetPropertyContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGetProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGetProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitGetProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicBinaryOpContext extends ExpContext {
		public ExpContext first;
		public Token op;
		public ExpContext second;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LogicBinaryOpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLogicBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLogicBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLogicBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public NewExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MissingRPContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MissingRPContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMissingRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMissingRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMissingRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisContext extends ExpContext {
		public ThisContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOpContext extends ExpContext {
		public Token op;
		public ExpContext first;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryOpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetMethodContext extends ExpContext {
		public ExpContext id;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public GetMethodContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGetMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGetMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitGetMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends ExpContext {
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public LiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DummyContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDummy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDummy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitDummy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetLengthContext extends ExpContext {
		public ExpContext id;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GetLengthContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterGetLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitGetLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitGetLength(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewArrContext extends ExpContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NewArrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryOpContext extends ExpContext {
		public ExpContext first;
		public Token op;
		public ExpContext second;
		public ExpContext third;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TernaryOpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterTernaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitTernaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitTernaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexOfContext extends ExpContext {
		public ExpContext id;
		public ExpContext idx;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IndexOfContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIndexOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIndexOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIndexOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(200);
				intLiteral();
				}
				break;
			case 2:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				boolLiteral();
				}
				break;
			case 3:
				{
				_localctx = new DummyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(T__6);
				setState(203);
				exp(0);
				setState(204);
				match(T__10);
				}
				break;
			case 4:
				{
				_localctx = new MissingRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(T__6);
				setState(207);
				exp(21);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				((UnaryOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
					((UnaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				((UnaryOpContext)_localctx).first = exp(16);
				}
				break;
			case 6:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__61);
				}
				break;
			case 7:
				{
				_localctx = new NewArrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(T__62);
				setState(212);
				basicType();
				setState(213);
				match(T__8);
				setState(214);
				exp(0);
				setState(215);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new NewExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(T__62);
				setState(218);
				match(ID);
				setState(219);
				match(T__6);
				setState(220);
				match(T__10);
				}
				break;
			case 9:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(224);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(225);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						((BinaryOpContext)_localctx).second = exp(16);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(227);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(228);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						((BinaryOpContext)_localctx).second = exp(15);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(230);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(231);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						((BinaryOpContext)_localctx).second = exp(14);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						((BinaryOpContext)_localctx).second = exp(13);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__52 || _la==T__53) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						((BinaryOpContext)_localctx).second = exp(12);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(240);
						((BinaryOpContext)_localctx).op = match(T__54);
						setState(241);
						((BinaryOpContext)_localctx).second = exp(11);
						}
						break;
					case 7:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(242);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(243);
						((BinaryOpContext)_localctx).op = match(T__55);
						setState(244);
						((BinaryOpContext)_localctx).second = exp(10);
						}
						break;
					case 8:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(246);
						((BinaryOpContext)_localctx).op = match(T__56);
						setState(247);
						((BinaryOpContext)_localctx).second = exp(9);
						}
						break;
					case 9:
						{
						_localctx = new LogicBinaryOpContext(new ExpContext(_parentctx, _parentState));
						((LogicBinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(248);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(249);
						((LogicBinaryOpContext)_localctx).op = match(T__57);
						setState(250);
						((LogicBinaryOpContext)_localctx).second = exp(8);
						}
						break;
					case 10:
						{
						_localctx = new LogicBinaryOpContext(new ExpContext(_parentctx, _parentState));
						((LogicBinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(251);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(252);
						((LogicBinaryOpContext)_localctx).op = match(T__58);
						setState(253);
						((LogicBinaryOpContext)_localctx).second = exp(7);
						}
						break;
					case 11:
						{
						_localctx = new TernaryOpContext(new ExpContext(_parentctx, _parentState));
						((TernaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(254);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(255);
						((TernaryOpContext)_localctx).op = match(T__59);
						setState(256);
						((TernaryOpContext)_localctx).second = exp(0);
						setState(257);
						match(T__60);
						setState(258);
						((TernaryOpContext)_localctx).third = exp(6);
						}
						break;
					case 12:
						{
						_localctx = new GetMethodContext(new ExpContext(_parentctx, _parentState));
						((GetMethodContext)_localctx).id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(260);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(261);
						match(T__36);
						setState(262);
						match(ID);
						setState(263);
						match(T__6);
						setState(272);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__38 - 7)) | (1L << (T__39 - 7)) | (1L << (T__40 - 7)) | (1L << (T__41 - 7)) | (1L << (T__61 - 7)) | (1L << (T__62 - 7)) | (1L << (T__63 - 7)) | (1L << (T__64 - 7)) | (1L << (INT_HEX - 7)) | (1L << (INT_BIN - 7)) | (1L << (INT_DEC - 7)) | (1L << (ID - 7)))) != 0)) {
							{
							setState(264);
							exp(0);
							setState(269);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__16) {
								{
								{
								setState(265);
								match(T__16);
								setState(266);
								exp(0);
								}
								}
								setState(271);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(274);
						match(T__10);
						}
						break;
					case 13:
						{
						_localctx = new GetLengthContext(new ExpContext(_parentctx, _parentState));
						((GetLengthContext)_localctx).id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(275);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(276);
						match(T__36);
						setState(277);
						match(T__37);
						}
						break;
					case 14:
						{
						_localctx = new GetPropertyContext(new ExpContext(_parentctx, _parentState));
						((GetPropertyContext)_localctx).id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(278);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(279);
						match(T__36);
						setState(280);
						match(ID);
						}
						break;
					case 15:
						{
						_localctx = new IndexOfContext(new ExpContext(_parentctx, _parentState));
						((IndexOfContext)_localctx).id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(281);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(282);
						match(T__8);
						setState(283);
						((IndexOfContext)_localctx).idx = exp(0);
						setState(284);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==T__63 || _la==T__64) ) {
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

	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode INT_HEX() { return getToken(MiniJavaParser.INT_HEX, 0); }
		public TerminalNode INT_BIN() { return getToken(MiniJavaParser.INT_BIN, 0); }
		public TerminalNode INT_DEC() { return getToken(MiniJavaParser.INT_DEC, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (INT_HEX - 67)) | (1L << (INT_BIN - 67)) | (1L << (INT_DEC - 67)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4F\n\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3\5\5\5S\n\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7[\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\5\ne\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\5\nr\n\n\3\n\3\n\3\n"+
		"\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16\u0083\n\16"+
		"\f\16\16\16\u0086\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009e"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a9\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00c8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e1"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u010e\n\22\f\22\16\22\u0111\13\22\5\22\u0113\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0121\n\22"+
		"\f\22\16\22\u0124\13\22\3\23\3\23\3\24\3\24\3\24\2\3\"\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\r\4\2\5\5\22\22\5\2\7\7\24\25HH\4\2"+
		"\20\20\26 \3\2),\3\2-/\3\2*+\3\2\60\62\3\2\63\66\3\2\678\3\2BC\3\2EG\u0146"+
		"\2(\3\2\2\2\4\61\3\2\2\2\6A\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16"+
		"^\3\2\2\2\20`\3\2\2\2\22d\3\2\2\2\24x\3\2\2\2\26z\3\2\2\2\30~\3\2\2\2"+
		"\32\u0080\3\2\2\2\34\u0089\3\2\2\2\36\u009d\3\2\2\2 \u00c7\3\2\2\2\"\u00e0"+
		"\3\2\2\2$\u0125\3\2\2\2&\u0127\3\2\2\2(,\5\4\3\2)+\5\6\4\2*)\3\2\2\2+"+
		".\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\2\2\3\60\3\3\2"+
		"\2\2\61\62\7\3\2\2\62\63\7H\2\2\63\64\7\4\2\2\64\65\7\5\2\2\65\66\7\6"+
		"\2\2\66\67\7\7\2\2\678\7\b\2\289\7\t\2\29:\7\n\2\2:;\7\13\2\2;<\7\f\2"+
		"\2<=\7H\2\2=>\7\r\2\2>?\5\32\16\2?@\7\16\2\2@\5\3\2\2\2AB\7\3\2\2BE\7"+
		"H\2\2CD\7\17\2\2DF\7H\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GK\7\4\2\2HJ\5"+
		"\b\5\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7"+
		"\16\2\2O\7\3\2\2\2PS\5\n\6\2QS\5\22\n\2RP\3\2\2\2RQ\3\2\2\2S\t\3\2\2\2"+
		"TU\5\f\7\2U\13\3\2\2\2VW\5\24\13\2WZ\7H\2\2XY\7\20\2\2Y[\5\"\22\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\21\2\2]\r\3\2\2\2^_\t\2\2\2_\17\3\2\2"+
		"\2`a\5\24\13\2ab\7H\2\2b\21\3\2\2\2ce\5\16\b\2dc\3\2\2\2de\3\2\2\2ef\3"+
		"\2\2\2fg\5\24\13\2gh\7H\2\2hq\7\t\2\2in\5\20\t\2jk\7\23\2\2km\5\20\t\2"+
		"lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qi\3\2\2\2"+
		"qr\3\2\2\2rs\3\2\2\2st\7\r\2\2tu\5\32\16\2u\23\3\2\2\2vy\5\26\f\2wy\5"+
		"\30\r\2xv\3\2\2\2xw\3\2\2\2y\25\3\2\2\2z{\5\30\r\2{|\7\13\2\2|}\7\f\2"+
		"\2}\27\3\2\2\2~\177\t\3\2\2\177\31\3\2\2\2\u0080\u0084\7\4\2\2\u0081\u0083"+
		"\5 \21\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\16"+
		"\2\2\u0088\33\3\2\2\2\u0089\u008a\t\4\2\2\u008a\35\3\2\2\2\u008b\u008c"+
		"\7H\2\2\u008c\u008d\5\34\17\2\u008d\u008e\5\"\22\2\u008e\u009e\3\2\2\2"+
		"\u008f\u0090\7H\2\2\u0090\u0091\7\13\2\2\u0091\u0092\5\"\22\2\u0092\u0093"+
		"\7\f\2\2\u0093\u0094\5\34\17\2\u0094\u0095\5\"\22\2\u0095\u009e\3\2\2"+
		"\2\u0096\u009e\5\"\22\2\u0097\u0098\5\"\22\2\u0098\u0099\5\34\17\2\u0099"+
		"\u009a\5\"\22\2\u009a\u009e\3\2\2\2\u009b\u009c\7!\2\2\u009c\u009e\5\""+
		"\22\2\u009d\u008b\3\2\2\2\u009d\u008f\3\2\2\2\u009d\u0096\3\2\2\2\u009d"+
		"\u0097\3\2\2\2\u009d\u009b\3\2\2\2\u009e\37\3\2\2\2\u009f\u00c8\5\f\7"+
		"\2\u00a0\u00c8\5\32\16\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7\t\2\2\u00a3"+
		"\u00a4\5\"\22\2\u00a4\u00a5\7\r\2\2\u00a5\u00a8\5 \21\2\u00a6\u00a7\7"+
		"#\2\2\u00a7\u00a9\5 \21\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00c8\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\7\t\2\2\u00ac\u00ad\5\""+
		"\22\2\u00ad\u00ae\7\r\2\2\u00ae\u00af\5 \21\2\u00af\u00c8\3\2\2\2\u00b0"+
		"\u00b1\7%\2\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\5\""+
		"\22\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7\7\r\2\2\u00b7"+
		"\u00b8\5 \21\2\u00b8\u00c8\3\2\2\2\u00b9\u00ba\7&\2\2\u00ba\u00bb\7\t"+
		"\2\2\u00bb\u00bc\5\"\22\2\u00bc\u00bd\7\r\2\2\u00bd\u00be\7\21\2\2\u00be"+
		"\u00c8\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7\21"+
		"\2\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\5\36\20\2\u00c4\u00c5\7\21\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c8\7\21\2\2\u00c7\u009f\3\2\2\2\u00c7\u00a0\3"+
		"\2\2\2\u00c7\u00a1\3\2\2\2\u00c7\u00aa\3\2\2\2\u00c7\u00b0\3\2\2\2\u00c7"+
		"\u00b9\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8!\3\2\2\2\u00c9\u00ca\b\22\1\2\u00ca\u00e1\5&\24\2\u00cb\u00e1"+
		"\5$\23\2\u00cc\u00cd\7\t\2\2\u00cd\u00ce\5\"\22\2\u00ce\u00cf\7\r\2\2"+
		"\u00cf\u00e1\3\2\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00e1\5\"\22\27\u00d2\u00d3"+
		"\t\5\2\2\u00d3\u00e1\5\"\22\22\u00d4\u00e1\7@\2\2\u00d5\u00d6\7A\2\2\u00d6"+
		"\u00d7\5\30\r\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da"+
		"\7\f\2\2\u00da\u00e1\3\2\2\2\u00db\u00dc\7A\2\2\u00dc\u00dd\7H\2\2\u00dd"+
		"\u00de\7\t\2\2\u00de\u00e1\7\r\2\2\u00df\u00e1\7H\2\2\u00e0\u00c9\3\2"+
		"\2\2\u00e0\u00cb\3\2\2\2\u00e0\u00cc\3\2\2\2\u00e0\u00d0\3\2\2\2\u00e0"+
		"\u00d2\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00db\3\2"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1\u0122\3\2\2\2\u00e2\u00e3\f\21\2\2\u00e3"+
		"\u00e4\t\6\2\2\u00e4\u0121\5\"\22\22\u00e5\u00e6\f\20\2\2\u00e6\u00e7"+
		"\t\7\2\2\u00e7\u0121\5\"\22\21\u00e8\u00e9\f\17\2\2\u00e9\u00ea\t\b\2"+
		"\2\u00ea\u0121\5\"\22\20\u00eb\u00ec\f\16\2\2\u00ec\u00ed\t\t\2\2\u00ed"+
		"\u0121\5\"\22\17\u00ee\u00ef\f\r\2\2\u00ef\u00f0\t\n\2\2\u00f0\u0121\5"+
		"\"\22\16\u00f1\u00f2\f\f\2\2\u00f2\u00f3\79\2\2\u00f3\u0121\5\"\22\r\u00f4"+
		"\u00f5\f\13\2\2\u00f5\u00f6\7:\2\2\u00f6\u0121\5\"\22\f\u00f7\u00f8\f"+
		"\n\2\2\u00f8\u00f9\7;\2\2\u00f9\u0121\5\"\22\13\u00fa\u00fb\f\t\2\2\u00fb"+
		"\u00fc\7<\2\2\u00fc\u0121\5\"\22\n\u00fd\u00fe\f\b\2\2\u00fe\u00ff\7="+
		"\2\2\u00ff\u0121\5\"\22\t\u0100\u0101\f\7\2\2\u0101\u0102\7>\2\2\u0102"+
		"\u0103\5\"\22\2\u0103\u0104\7?\2\2\u0104\u0105\5\"\22\b\u0105\u0121\3"+
		"\2\2\2\u0106\u0107\f\26\2\2\u0107\u0108\7\'\2\2\u0108\u0109\7H\2\2\u0109"+
		"\u0112\7\t\2\2\u010a\u010f\5\"\22\2\u010b\u010c\7\23\2\2\u010c\u010e\5"+
		"\"\22\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u010a\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0121\7\r\2\2\u0115"+
		"\u0116\f\25\2\2\u0116\u0117\7\'\2\2\u0117\u0121\7(\2\2\u0118\u0119\f\24"+
		"\2\2\u0119\u011a\7\'\2\2\u011a\u0121\7H\2\2\u011b\u011c\f\23\2\2\u011c"+
		"\u011d\7\13\2\2\u011d\u011e\5\"\22\2\u011e\u011f\7\f\2\2\u011f\u0121\3"+
		"\2\2\2\u0120\u00e2\3\2\2\2\u0120\u00e5\3\2\2\2\u0120\u00e8\3\2\2\2\u0120"+
		"\u00eb\3\2\2\2\u0120\u00ee\3\2\2\2\u0120\u00f1\3\2\2\2\u0120\u00f4\3\2"+
		"\2\2\u0120\u00f7\3\2\2\2\u0120\u00fa\3\2\2\2\u0120\u00fd\3\2\2\2\u0120"+
		"\u0100\3\2\2\2\u0120\u0106\3\2\2\2\u0120\u0115\3\2\2\2\u0120\u0118\3\2"+
		"\2\2\u0120\u011b\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123#\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\t\13\2\2"+
		"\u0126%\3\2\2\2\u0127\u0128\t\f\2\2\u0128\'\3\2\2\2\24,EKRZdnqx\u0084"+
		"\u009d\u00a8\u00c7\u00e0\u010f\u0112\u0120\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}