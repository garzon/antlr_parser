// Generated from D:/ÎÄµµ/ÎÒÔÚFDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6
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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, ID=66, INT_HEX=67, 
		INT_BIN=68, INT_DEC=69, WS=70;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_permissionDesc = 2, RULE_classDeclaration = 3, 
		RULE_declaration = 4, RULE_varDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_type = 7, RULE_stmtBlock = 8, RULE_assignSym = 9, RULE_stmt = 10, 
		RULE_exp = 11, RULE_boolLiteral = 12, RULE_intLiteral = 13;
	public static final String[] ruleNames = {
		"goal", "mainClass", "permissionDesc", "classDeclaration", "declaration", 
		"varDeclaration", "methodDeclaration", "type", "stmtBlock", "assignSym", 
		"stmt", "exp", "boolLiteral", "intLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'private'", "'extends'", "';'", 
		"','", "'int'", "'boolean'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='", "'if'", "'else'", 
		"'while'", "'System.out.println'", "'return'", "'.'", "'length'", "'!'", 
		"'+'", "'-'", "'~'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", "'<'", 
		"'>'", "'<='", "'>='", "'instanceof'", "'=='", "'!='", "'&'", "'^'", "'|'", 
		"'&&'", "'||'", "'?'", "':'", "'this'", "'new'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ID", "INT_HEX", "INT_BIN", "INT_DEC", 
		"WS"
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
			setState(28);
			mainClass();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(29);
				classDeclaration();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
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
			setState(37);
			match(T__0);
			setState(38);
			match(ID);
			setState(39);
			match(T__1);
			setState(40);
			match(T__2);
			setState(41);
			match(T__3);
			setState(42);
			match(T__4);
			setState(43);
			match(T__5);
			setState(44);
			match(T__6);
			setState(45);
			match(T__7);
			setState(46);
			match(T__8);
			setState(47);
			match(T__9);
			setState(48);
			match(ID);
			setState(49);
			match(T__10);
			setState(50);
			stmtBlock();
			setState(51);
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
		enterRule(_localctx, 4, RULE_permissionDesc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__12) ) {
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
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			((ClassDeclarationContext)_localctx).className = match(ID);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(57);
				match(T__13);
				setState(58);
				((ClassDeclarationContext)_localctx).parentName = match(ID);
				}
			}

			setState(61);
			match(T__1);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__12 - 3)) | (1L << (T__16 - 3)) | (1L << (T__17 - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(62);
				declaration();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
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
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			type();
			setState(75);
			match(ID);
			setState(76);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public PermissionDescContext permissionDesc() {
			return getRuleContext(PermissionDescContext.class,0);
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
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__12) {
				{
				setState(78);
				permissionDesc();
				}
			}

			setState(81);
			type();
			setState(82);
			match(ID);
			setState(83);
			match(T__6);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__17 - 17)) | (1L << (ID - 17)))) != 0)) {
				{
				setState(84);
				type();
				setState(85);
				match(ID);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(86);
					match(T__15);
					setState(87);
					type();
					setState(88);
					match(ID);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(97);
			match(T__10);
			setState(98);
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
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__16);
				setState(101);
				match(T__8);
				setState(102);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(ID);
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
		enterRule(_localctx, 16, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__1);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << T__17) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || _la==ID) {
				{
				{
				setState(109);
				stmt();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		enterRule(_localctx, 18, RULE_assignSym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
	public static class SetIndexOfContext extends StmtContext {
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
		public SetIndexOfContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class ReturnContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class AssignContext extends StmtContext {
		public ExpContext v;
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public AssignSymContext assignSym() {
			return getRuleContext(AssignSymContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(StmtContext ctx) { copyFrom(ctx); }
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

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				varDeclaration();
				}
				break;
			case 2:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				stmtBlock();
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(T__30);
				setState(122);
				match(T__6);
				setState(123);
				exp(0);
				setState(124);
				match(T__10);
				setState(125);
				stmt();
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(126);
					match(T__31);
					setState(127);
					stmt();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(T__32);
				setState(131);
				match(T__6);
				setState(132);
				exp(0);
				setState(133);
				match(T__10);
				setState(134);
				stmt();
				}
				break;
			case 5:
				_localctx = new SystemCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				((SystemCallContext)_localctx).systemCallName = match(T__33);
				setState(137);
				match(T__6);
				setState(138);
				exp(0);
				setState(139);
				match(T__10);
				setState(140);
				match(T__14);
				}
				break;
			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(T__34);
				setState(143);
				exp(0);
				setState(144);
				match(T__14);
				}
				break;
			case 7:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				match(ID);
				setState(147);
				assignSym();
				setState(148);
				((AssignContext)_localctx).v = exp(0);
				setState(149);
				match(T__14);
				}
				break;
			case 8:
				_localctx = new SetIndexOfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				match(ID);
				setState(152);
				match(T__8);
				setState(153);
				((SetIndexOfContext)_localctx).idx = exp(0);
				setState(154);
				match(T__9);
				setState(155);
				assignSym();
				setState(156);
				((SetIndexOfContext)_localctx).v = exp(0);
				setState(157);
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
	public static class NewIntArrContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NewIntArrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterNewIntArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitNewIntArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitNewIntArr(this);
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
	public static class TernaryOpContext extends ExpContext {
		public ExpContext first;
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

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				intLiteral();
				}
				break;
			case 2:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new DummyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(T__6);
				setState(165);
				exp(0);
				setState(166);
				match(T__10);
				}
				break;
			case 4:
				{
				_localctx = new UnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				((UnaryOpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
					((UnaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				((UnaryOpContext)_localctx).first = exp(16);
				}
				break;
			case 5:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				boolLiteral();
				}
				break;
			case 6:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(T__61);
				}
				break;
			case 7:
				{
				_localctx = new NewIntArrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(T__62);
				setState(173);
				match(T__16);
				setState(174);
				match(T__8);
				setState(175);
				exp(0);
				setState(176);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new NewExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(T__62);
				setState(179);
				match(ID);
				setState(180);
				match(T__6);
				setState(181);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(184);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(185);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						((BinaryOpContext)_localctx).second = exp(16);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(187);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(188);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((BinaryOpContext)_localctx).second = exp(15);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(190);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(191);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((BinaryOpContext)_localctx).second = exp(14);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(193);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(194);
						((BinaryOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
							((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						((BinaryOpContext)_localctx).second = exp(13);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(196);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(197);
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
						setState(198);
						((BinaryOpContext)_localctx).second = exp(12);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(199);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(200);
						((BinaryOpContext)_localctx).op = match(T__54);
						setState(201);
						((BinaryOpContext)_localctx).second = exp(11);
						}
						break;
					case 7:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(202);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(203);
						((BinaryOpContext)_localctx).op = match(T__55);
						setState(204);
						((BinaryOpContext)_localctx).second = exp(10);
						}
						break;
					case 8:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(205);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(206);
						((BinaryOpContext)_localctx).op = match(T__56);
						setState(207);
						((BinaryOpContext)_localctx).second = exp(9);
						}
						break;
					case 9:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(208);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(209);
						((BinaryOpContext)_localctx).op = match(T__57);
						setState(210);
						((BinaryOpContext)_localctx).second = exp(8);
						}
						break;
					case 10:
						{
						_localctx = new BinaryOpContext(new ExpContext(_parentctx, _parentState));
						((BinaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(211);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(212);
						((BinaryOpContext)_localctx).op = match(T__58);
						setState(213);
						((BinaryOpContext)_localctx).second = exp(7);
						}
						break;
					case 11:
						{
						_localctx = new TernaryOpContext(new ExpContext(_parentctx, _parentState));
						((TernaryOpContext)_localctx).first = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(214);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(215);
						match(T__59);
						setState(216);
						((TernaryOpContext)_localctx).second = exp(0);
						setState(217);
						match(T__60);
						setState(218);
						((TernaryOpContext)_localctx).third = exp(6);
						}
						break;
					case 12:
						{
						_localctx = new IndexOfContext(new ExpContext(_parentctx, _parentState));
						((IndexOfContext)_localctx).id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(220);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(221);
						match(T__8);
						setState(222);
						((IndexOfContext)_localctx).idx = exp(0);
						setState(223);
						match(T__9);
						}
						break;
					case 13:
						{
						_localctx = new GetLengthContext(new ExpContext(_parentctx, _parentState));
						((GetLengthContext)_localctx).id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(225);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(226);
						match(T__35);
						setState(227);
						match(T__36);
						}
						break;
					case 14:
						{
						_localctx = new GetMethodContext(new ExpContext(_parentctx, _parentState));
						((GetMethodContext)_localctx).id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(228);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(229);
						match(T__35);
						setState(230);
						match(ID);
						setState(231);
						match(T__6);
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__37 - 7)) | (1L << (T__38 - 7)) | (1L << (T__39 - 7)) | (1L << (T__40 - 7)) | (1L << (T__61 - 7)) | (1L << (T__62 - 7)) | (1L << (T__63 - 7)) | (1L << (T__64 - 7)) | (1L << (ID - 7)) | (1L << (INT_HEX - 7)) | (1L << (INT_BIN - 7)) | (1L << (INT_DEC - 7)))) != 0)) {
							{
							setState(232);
							exp(0);
							setState(237);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__15) {
								{
								{
								setState(233);
								match(T__15);
								setState(234);
								exp(0);
								}
								}
								setState(239);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(242);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 24, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 26, RULE_intLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		case 11:
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
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5>\n\5\3\5\3\5\7\5B\n\5\f\5\16\5E\13\5"+
		"\3\5\3\5\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\b\5\bR\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\5\bb\n\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\7\nq\n\n\f\n\16\nt\13\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0083\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b9"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00ee\n\r\f\r\16\r\u00f1\13\r\5\r\u00f3\n\r\3\r\7\r\u00f6\n\r\f\r\16"+
		"\r\u00f9\13\r\3\16\3\16\3\17\3\17\3\17\2\3\30\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\f\4\2\5\5\17\17\3\2\25 \3\2(+\3\2,.\3\2)*\3\2/\61\3"+
		"\2\62\66\3\2\678\3\2BC\3\2EG\u011a\2\36\3\2\2\2\4\'\3\2\2\2\6\67\3\2\2"+
		"\2\b9\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16Q\3\2\2\2\20l\3\2\2\2\22n\3\2\2"+
		"\2\24w\3\2\2\2\26\u00a1\3\2\2\2\30\u00b8\3\2\2\2\32\u00fa\3\2\2\2\34\u00fc"+
		"\3\2\2\2\36\"\5\4\3\2\37!\5\b\5\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#"+
		"\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'(\7\3\2\2()\7D\2\2"+
		")*\7\4\2\2*+\7\5\2\2+,\7\6\2\2,-\7\7\2\2-.\7\b\2\2./\7\t\2\2/\60\7\n\2"+
		"\2\60\61\7\13\2\2\61\62\7\f\2\2\62\63\7D\2\2\63\64\7\r\2\2\64\65\5\22"+
		"\n\2\65\66\7\16\2\2\66\5\3\2\2\2\678\t\2\2\28\7\3\2\2\29:\7\3\2\2:=\7"+
		"D\2\2;<\7\20\2\2<>\7D\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?C\7\4\2\2@B\5"+
		"\n\6\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7"+
		"\16\2\2G\t\3\2\2\2HK\5\f\7\2IK\5\16\b\2JH\3\2\2\2JI\3\2\2\2K\13\3\2\2"+
		"\2LM\5\20\t\2MN\7D\2\2NO\7\21\2\2O\r\3\2\2\2PR\5\6\4\2QP\3\2\2\2QR\3\2"+
		"\2\2RS\3\2\2\2ST\5\20\t\2TU\7D\2\2Ua\7\t\2\2VW\5\20\t\2W^\7D\2\2XY\7\22"+
		"\2\2YZ\5\20\t\2Z[\7D\2\2[]\3\2\2\2\\X\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_b\3\2\2\2`^\3\2\2\2aV\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\r\2\2de\5"+
		"\22\n\2e\17\3\2\2\2fg\7\23\2\2gh\7\13\2\2hm\7\f\2\2im\7\24\2\2jm\7\23"+
		"\2\2km\7D\2\2lf\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\21\3\2\2\2nr\7"+
		"\4\2\2oq\5\26\f\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr"+
		"\3\2\2\2uv\7\16\2\2v\23\3\2\2\2wx\t\3\2\2x\25\3\2\2\2y\u00a2\5\f\7\2z"+
		"\u00a2\5\22\n\2{|\7!\2\2|}\7\t\2\2}~\5\30\r\2~\177\7\r\2\2\177\u0082\5"+
		"\26\f\2\u0080\u0081\7\"\2\2\u0081\u0083\5\26\f\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u00a2\3\2\2\2\u0084\u0085\7#\2\2\u0085\u0086\7\t"+
		"\2\2\u0086\u0087\5\30\r\2\u0087\u0088\7\r\2\2\u0088\u0089\5\26\f\2\u0089"+
		"\u00a2\3\2\2\2\u008a\u008b\7$\2\2\u008b\u008c\7\t\2\2\u008c\u008d\5\30"+
		"\r\2\u008d\u008e\7\r\2\2\u008e\u008f\7\21\2\2\u008f\u00a2\3\2\2\2\u0090"+
		"\u0091\7%\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7\21\2\2\u0093\u00a2\3"+
		"\2\2\2\u0094\u0095\7D\2\2\u0095\u0096\5\24\13\2\u0096\u0097\5\30\r\2\u0097"+
		"\u0098\7\21\2\2\u0098\u00a2\3\2\2\2\u0099\u009a\7D\2\2\u009a\u009b\7\13"+
		"\2\2\u009b\u009c\5\30\r\2\u009c\u009d\7\f\2\2\u009d\u009e\5\24\13\2\u009e"+
		"\u009f\5\30\r\2\u009f\u00a0\7\21\2\2\u00a0\u00a2\3\2\2\2\u00a1y\3\2\2"+
		"\2\u00a1z\3\2\2\2\u00a1{\3\2\2\2\u00a1\u0084\3\2\2\2\u00a1\u008a\3\2\2"+
		"\2\u00a1\u0090\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u0099\3\2\2\2\u00a2\27"+
		"\3\2\2\2\u00a3\u00a4\b\r\1\2\u00a4\u00b9\5\34\17\2\u00a5\u00b9\7D\2\2"+
		"\u00a6\u00a7\7\t\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\r\2\2\u00a9\u00b9"+
		"\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\u00b9\5\30\r\22\u00ac\u00b9\5\32\16"+
		"\2\u00ad\u00b9\7@\2\2\u00ae\u00af\7A\2\2\u00af\u00b0\7\23\2\2\u00b0\u00b1"+
		"\7\13\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\7\f\2\2\u00b3\u00b9\3\2\2\2"+
		"\u00b4\u00b5\7A\2\2\u00b5\u00b6\7D\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b9"+
		"\7\r\2\2\u00b8\u00a3\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00a6\3\2\2\2\u00b8"+
		"\u00aa\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b8\u00ae\3\2"+
		"\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00f7\3\2\2\2\u00ba\u00bb\f\21\2\2\u00bb"+
		"\u00bc\t\5\2\2\u00bc\u00f6\5\30\r\22\u00bd\u00be\f\20\2\2\u00be\u00bf"+
		"\t\6\2\2\u00bf\u00f6\5\30\r\21\u00c0\u00c1\f\17\2\2\u00c1\u00c2\t\7\2"+
		"\2\u00c2\u00f6\5\30\r\20\u00c3\u00c4\f\16\2\2\u00c4\u00c5\t\b\2\2\u00c5"+
		"\u00f6\5\30\r\17\u00c6\u00c7\f\r\2\2\u00c7\u00c8\t\t\2\2\u00c8\u00f6\5"+
		"\30\r\16\u00c9\u00ca\f\f\2\2\u00ca\u00cb\79\2\2\u00cb\u00f6\5\30\r\r\u00cc"+
		"\u00cd\f\13\2\2\u00cd\u00ce\7:\2\2\u00ce\u00f6\5\30\r\f\u00cf\u00d0\f"+
		"\n\2\2\u00d0\u00d1\7;\2\2\u00d1\u00f6\5\30\r\13\u00d2\u00d3\f\t\2\2\u00d3"+
		"\u00d4\7<\2\2\u00d4\u00f6\5\30\r\n\u00d5\u00d6\f\b\2\2\u00d6\u00d7\7="+
		"\2\2\u00d7\u00f6\5\30\r\t\u00d8\u00d9\f\7\2\2\u00d9\u00da\7>\2\2\u00da"+
		"\u00db\5\30\r\2\u00db\u00dc\7?\2\2\u00dc\u00dd\5\30\r\b\u00dd\u00f6\3"+
		"\2\2\2\u00de\u00df\f\25\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\5\30\r\2"+
		"\u00e1\u00e2\7\f\2\2\u00e2\u00f6\3\2\2\2\u00e3\u00e4\f\24\2\2\u00e4\u00e5"+
		"\7&\2\2\u00e5\u00f6\7\'\2\2\u00e6\u00e7\f\23\2\2\u00e7\u00e8\7&\2\2\u00e8"+
		"\u00e9\7D\2\2\u00e9\u00f2\7\t\2\2\u00ea\u00ef\5\30\r\2\u00eb\u00ec\7\22"+
		"\2\2\u00ec\u00ee\5\30\r\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\7\r\2\2\u00f5\u00ba\3\2\2\2\u00f5\u00bd\3\2\2\2\u00f5\u00c0\3\2"+
		"\2\2\u00f5\u00c3\3\2\2\2\u00f5\u00c6\3\2\2\2\u00f5\u00c9\3\2\2\2\u00f5"+
		"\u00cc\3\2\2\2\u00f5\u00cf\3\2\2\2\u00f5\u00d2\3\2\2\2\u00f5\u00d5\3\2"+
		"\2\2\u00f5\u00d8\3\2\2\2\u00f5\u00de\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5"+
		"\u00e6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\31\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\t\n\2\2\u00fb\33"+
		"\3\2\2\2\u00fc\u00fd\t\13\2\2\u00fd\35\3\2\2\2\22\"=CJQ^alr\u0082\u00a1"+
		"\u00b8\u00ef\u00f2\u00f5\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}