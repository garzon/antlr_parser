
// Generated from D:/ÎÄµµ/ÎÒÔÚFDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6


#include "MiniJavaListener.h"
#include "MiniJavaVisitor.h"

#include "MiniJavaParser.h"


using namespace antlrcpp;
using namespace MiniJava;
using namespace antlr4;

MiniJavaParser::MiniJavaParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

MiniJavaParser::~MiniJavaParser() {
  delete _interpreter;
}

std::string MiniJavaParser::getGrammarFileName() const {
  return "MiniJava.g4";
}

const std::vector<std::string>& MiniJavaParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& MiniJavaParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- GoalContext ------------------------------------------------------------------

MiniJavaParser::GoalContext::GoalContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

MiniJavaParser::MainClassContext* MiniJavaParser::GoalContext::mainClass() {
  return getRuleContext<MiniJavaParser::MainClassContext>(0);
}

tree::TerminalNode* MiniJavaParser::GoalContext::EOF() {
  return getToken(MiniJavaParser::EOF, 0);
}

std::vector<MiniJavaParser::ClassDeclarationContext *> MiniJavaParser::GoalContext::classDeclaration() {
  return getRuleContexts<MiniJavaParser::ClassDeclarationContext>();
}

MiniJavaParser::ClassDeclarationContext* MiniJavaParser::GoalContext::classDeclaration(size_t i) {
  return getRuleContext<MiniJavaParser::ClassDeclarationContext>(i);
}


size_t MiniJavaParser::GoalContext::getRuleIndex() const {
  return MiniJavaParser::RuleGoal;
}

void MiniJavaParser::GoalContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGoal(this);
}

void MiniJavaParser::GoalContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGoal(this);
}


antlrcpp::Any MiniJavaParser::GoalContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitGoal(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::GoalContext* MiniJavaParser::goal() {
  GoalContext *_localctx = _tracker.createInstance<GoalContext>(_ctx, getState());
  enterRule(_localctx, 0, MiniJavaParser::RuleGoal);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(26);
    mainClass();
    setState(30);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << MiniJavaParser::T__0)
      | (1ULL << MiniJavaParser::T__2)
      | (1ULL << MiniJavaParser::T__12)
      | (1ULL << MiniJavaParser::T__13))) != 0)) {
      setState(27);
      classDeclaration();
      setState(32);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(33);
    match(MiniJavaParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MainClassContext ------------------------------------------------------------------

MiniJavaParser::MainClassContext::MainClassContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> MiniJavaParser::MainClassContext::ID() {
  return getTokens(MiniJavaParser::ID);
}

tree::TerminalNode* MiniJavaParser::MainClassContext::ID(size_t i) {
  return getToken(MiniJavaParser::ID, i);
}

MiniJavaParser::StmtBlockContext* MiniJavaParser::MainClassContext::stmtBlock() {
  return getRuleContext<MiniJavaParser::StmtBlockContext>(0);
}


size_t MiniJavaParser::MainClassContext::getRuleIndex() const {
  return MiniJavaParser::RuleMainClass;
}

void MiniJavaParser::MainClassContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMainClass(this);
}

void MiniJavaParser::MainClassContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMainClass(this);
}


antlrcpp::Any MiniJavaParser::MainClassContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitMainClass(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::MainClassContext* MiniJavaParser::mainClass() {
  MainClassContext *_localctx = _tracker.createInstance<MainClassContext>(_ctx, getState());
  enterRule(_localctx, 2, MiniJavaParser::RuleMainClass);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(35);
    match(MiniJavaParser::T__0);
    setState(36);
    match(MiniJavaParser::ID);
    setState(37);
    match(MiniJavaParser::T__1);
    setState(38);
    match(MiniJavaParser::T__2);
    setState(39);
    match(MiniJavaParser::T__3);
    setState(40);
    match(MiniJavaParser::T__4);
    setState(41);
    match(MiniJavaParser::T__5);
    setState(42);
    match(MiniJavaParser::T__6);
    setState(43);
    match(MiniJavaParser::T__7);
    setState(44);
    match(MiniJavaParser::T__8);
    setState(45);
    match(MiniJavaParser::T__9);
    setState(46);
    match(MiniJavaParser::ID);
    setState(47);
    match(MiniJavaParser::T__10);
    setState(48);
    stmtBlock();
    setState(49);
    match(MiniJavaParser::T__11);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PermissionDescContext ------------------------------------------------------------------

MiniJavaParser::PermissionDescContext::PermissionDescContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t MiniJavaParser::PermissionDescContext::getRuleIndex() const {
  return MiniJavaParser::RulePermissionDesc;
}

void MiniJavaParser::PermissionDescContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPermissionDesc(this);
}

void MiniJavaParser::PermissionDescContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPermissionDesc(this);
}


antlrcpp::Any MiniJavaParser::PermissionDescContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitPermissionDesc(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::PermissionDescContext* MiniJavaParser::permissionDesc() {
  PermissionDescContext *_localctx = _tracker.createInstance<PermissionDescContext>(_ctx, getState());
  enterRule(_localctx, 4, MiniJavaParser::RulePermissionDesc);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(51);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << MiniJavaParser::T__2)
      | (1ULL << MiniJavaParser::T__12)
      | (1ULL << MiniJavaParser::T__13))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassDeclarationContext ------------------------------------------------------------------

MiniJavaParser::ClassDeclarationContext::ClassDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> MiniJavaParser::ClassDeclarationContext::ID() {
  return getTokens(MiniJavaParser::ID);
}

tree::TerminalNode* MiniJavaParser::ClassDeclarationContext::ID(size_t i) {
  return getToken(MiniJavaParser::ID, i);
}

MiniJavaParser::PermissionDescContext* MiniJavaParser::ClassDeclarationContext::permissionDesc() {
  return getRuleContext<MiniJavaParser::PermissionDescContext>(0);
}

std::vector<MiniJavaParser::DeclarationContext *> MiniJavaParser::ClassDeclarationContext::declaration() {
  return getRuleContexts<MiniJavaParser::DeclarationContext>();
}

MiniJavaParser::DeclarationContext* MiniJavaParser::ClassDeclarationContext::declaration(size_t i) {
  return getRuleContext<MiniJavaParser::DeclarationContext>(i);
}


size_t MiniJavaParser::ClassDeclarationContext::getRuleIndex() const {
  return MiniJavaParser::RuleClassDeclaration;
}

void MiniJavaParser::ClassDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassDeclaration(this);
}

void MiniJavaParser::ClassDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassDeclaration(this);
}


antlrcpp::Any MiniJavaParser::ClassDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitClassDeclaration(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::ClassDeclarationContext* MiniJavaParser::classDeclaration() {
  ClassDeclarationContext *_localctx = _tracker.createInstance<ClassDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 6, MiniJavaParser::RuleClassDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(54);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << MiniJavaParser::T__2)
      | (1ULL << MiniJavaParser::T__12)
      | (1ULL << MiniJavaParser::T__13))) != 0)) {
      setState(53);
      permissionDesc();
    }
    setState(56);
    match(MiniJavaParser::T__0);
    setState(57);
    match(MiniJavaParser::ID);
    setState(60);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == MiniJavaParser::T__14) {
      setState(58);
      match(MiniJavaParser::T__14);
      setState(59);
      match(MiniJavaParser::ID);
    }
    setState(62);
    match(MiniJavaParser::T__1);
    setState(66);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << MiniJavaParser::T__2)
      | (1ULL << MiniJavaParser::T__12)
      | (1ULL << MiniJavaParser::T__13)
      | (1ULL << MiniJavaParser::T__17)
      | (1ULL << MiniJavaParser::T__18))) != 0) || _la == MiniJavaParser::ID) {
      setState(63);
      declaration();
      setState(68);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(69);
    match(MiniJavaParser::T__11);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DeclarationContext ------------------------------------------------------------------

MiniJavaParser::DeclarationContext::DeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

MiniJavaParser::VarDeclarationContext* MiniJavaParser::DeclarationContext::varDeclaration() {
  return getRuleContext<MiniJavaParser::VarDeclarationContext>(0);
}

MiniJavaParser::MethodDeclarationContext* MiniJavaParser::DeclarationContext::methodDeclaration() {
  return getRuleContext<MiniJavaParser::MethodDeclarationContext>(0);
}


size_t MiniJavaParser::DeclarationContext::getRuleIndex() const {
  return MiniJavaParser::RuleDeclaration;
}

void MiniJavaParser::DeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDeclaration(this);
}

void MiniJavaParser::DeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDeclaration(this);
}


antlrcpp::Any MiniJavaParser::DeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitDeclaration(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::DeclarationContext* MiniJavaParser::declaration() {
  DeclarationContext *_localctx = _tracker.createInstance<DeclarationContext>(_ctx, getState());
  enterRule(_localctx, 8, MiniJavaParser::RuleDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(73);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(71);
      varDeclaration();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(72);
      methodDeclaration();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VarDeclarationContext ------------------------------------------------------------------

MiniJavaParser::VarDeclarationContext::VarDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

MiniJavaParser::TypeContext* MiniJavaParser::VarDeclarationContext::type() {
  return getRuleContext<MiniJavaParser::TypeContext>(0);
}

tree::TerminalNode* MiniJavaParser::VarDeclarationContext::ID() {
  return getToken(MiniJavaParser::ID, 0);
}


size_t MiniJavaParser::VarDeclarationContext::getRuleIndex() const {
  return MiniJavaParser::RuleVarDeclaration;
}

void MiniJavaParser::VarDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVarDeclaration(this);
}

void MiniJavaParser::VarDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVarDeclaration(this);
}


antlrcpp::Any MiniJavaParser::VarDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitVarDeclaration(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::VarDeclarationContext* MiniJavaParser::varDeclaration() {
  VarDeclarationContext *_localctx = _tracker.createInstance<VarDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 10, MiniJavaParser::RuleVarDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(75);
    type();
    setState(76);
    match(MiniJavaParser::ID);
    setState(77);
    match(MiniJavaParser::T__15);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MethodDeclarationContext ------------------------------------------------------------------

MiniJavaParser::MethodDeclarationContext::MethodDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<MiniJavaParser::TypeContext *> MiniJavaParser::MethodDeclarationContext::type() {
  return getRuleContexts<MiniJavaParser::TypeContext>();
}

MiniJavaParser::TypeContext* MiniJavaParser::MethodDeclarationContext::type(size_t i) {
  return getRuleContext<MiniJavaParser::TypeContext>(i);
}

std::vector<tree::TerminalNode *> MiniJavaParser::MethodDeclarationContext::ID() {
  return getTokens(MiniJavaParser::ID);
}

tree::TerminalNode* MiniJavaParser::MethodDeclarationContext::ID(size_t i) {
  return getToken(MiniJavaParser::ID, i);
}

MiniJavaParser::StmtBlockContext* MiniJavaParser::MethodDeclarationContext::stmtBlock() {
  return getRuleContext<MiniJavaParser::StmtBlockContext>(0);
}

MiniJavaParser::PermissionDescContext* MiniJavaParser::MethodDeclarationContext::permissionDesc() {
  return getRuleContext<MiniJavaParser::PermissionDescContext>(0);
}


size_t MiniJavaParser::MethodDeclarationContext::getRuleIndex() const {
  return MiniJavaParser::RuleMethodDeclaration;
}

void MiniJavaParser::MethodDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMethodDeclaration(this);
}

void MiniJavaParser::MethodDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMethodDeclaration(this);
}


antlrcpp::Any MiniJavaParser::MethodDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitMethodDeclaration(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::MethodDeclarationContext* MiniJavaParser::methodDeclaration() {
  MethodDeclarationContext *_localctx = _tracker.createInstance<MethodDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 12, MiniJavaParser::RuleMethodDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(80);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << MiniJavaParser::T__2)
      | (1ULL << MiniJavaParser::T__12)
      | (1ULL << MiniJavaParser::T__13))) != 0)) {
      setState(79);
      permissionDesc();
    }
    setState(82);
    type();
    setState(83);
    match(MiniJavaParser::ID);
    setState(84);
    match(MiniJavaParser::T__6);
    setState(96);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (((((_la - 18) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 18)) & ((1ULL << (MiniJavaParser::T__17 - 18))
      | (1ULL << (MiniJavaParser::T__18 - 18))
      | (1ULL << (MiniJavaParser::ID - 18)))) != 0)) {
      setState(85);
      type();
      setState(86);
      match(MiniJavaParser::ID);
      setState(93);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == MiniJavaParser::T__16) {
        setState(87);
        match(MiniJavaParser::T__16);
        setState(88);
        type();
        setState(89);
        match(MiniJavaParser::ID);
        setState(95);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
    }
    setState(98);
    match(MiniJavaParser::T__10);
    setState(99);
    stmtBlock();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeContext ------------------------------------------------------------------

MiniJavaParser::TypeContext::TypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* MiniJavaParser::TypeContext::ID() {
  return getToken(MiniJavaParser::ID, 0);
}


size_t MiniJavaParser::TypeContext::getRuleIndex() const {
  return MiniJavaParser::RuleType;
}

void MiniJavaParser::TypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterType(this);
}

void MiniJavaParser::TypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitType(this);
}


antlrcpp::Any MiniJavaParser::TypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitType(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::TypeContext* MiniJavaParser::type() {
  TypeContext *_localctx = _tracker.createInstance<TypeContext>(_ctx, getState());
  enterRule(_localctx, 14, MiniJavaParser::RuleType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(107);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(101);
      match(MiniJavaParser::T__17);
      setState(102);
      match(MiniJavaParser::T__8);
      setState(103);
      match(MiniJavaParser::T__9);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(104);
      match(MiniJavaParser::T__18);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(105);
      match(MiniJavaParser::T__17);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(106);
      match(MiniJavaParser::ID);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StmtBlockContext ------------------------------------------------------------------

MiniJavaParser::StmtBlockContext::StmtBlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<MiniJavaParser::StmtContext *> MiniJavaParser::StmtBlockContext::stmt() {
  return getRuleContexts<MiniJavaParser::StmtContext>();
}

MiniJavaParser::StmtContext* MiniJavaParser::StmtBlockContext::stmt(size_t i) {
  return getRuleContext<MiniJavaParser::StmtContext>(i);
}


size_t MiniJavaParser::StmtBlockContext::getRuleIndex() const {
  return MiniJavaParser::RuleStmtBlock;
}

void MiniJavaParser::StmtBlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStmtBlock(this);
}

void MiniJavaParser::StmtBlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStmtBlock(this);
}


antlrcpp::Any MiniJavaParser::StmtBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitStmtBlock(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::StmtBlockContext* MiniJavaParser::stmtBlock() {
  StmtBlockContext *_localctx = _tracker.createInstance<StmtBlockContext>(_ctx, getState());
  enterRule(_localctx, 16, MiniJavaParser::RuleStmtBlock);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(109);
    match(MiniJavaParser::T__1);
    setState(113);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << MiniJavaParser::T__1)
      | (1ULL << MiniJavaParser::T__17)
      | (1ULL << MiniJavaParser::T__18)
      | (1ULL << MiniJavaParser::T__32)
      | (1ULL << MiniJavaParser::T__34)
      | (1ULL << MiniJavaParser::T__35)
      | (1ULL << MiniJavaParser::T__36))) != 0) || _la == MiniJavaParser::ID) {
      setState(110);
      stmt();
      setState(115);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(116);
    match(MiniJavaParser::T__11);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignSymContext ------------------------------------------------------------------

MiniJavaParser::AssignSymContext::AssignSymContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t MiniJavaParser::AssignSymContext::getRuleIndex() const {
  return MiniJavaParser::RuleAssignSym;
}

void MiniJavaParser::AssignSymContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssignSym(this);
}

void MiniJavaParser::AssignSymContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssignSym(this);
}


antlrcpp::Any MiniJavaParser::AssignSymContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitAssignSym(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::AssignSymContext* MiniJavaParser::assignSym() {
  AssignSymContext *_localctx = _tracker.createInstance<AssignSymContext>(_ctx, getState());
  enterRule(_localctx, 18, MiniJavaParser::RuleAssignSym);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(118);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << MiniJavaParser::T__19)
      | (1ULL << MiniJavaParser::T__20)
      | (1ULL << MiniJavaParser::T__21)
      | (1ULL << MiniJavaParser::T__22)
      | (1ULL << MiniJavaParser::T__23)
      | (1ULL << MiniJavaParser::T__24)
      | (1ULL << MiniJavaParser::T__25)
      | (1ULL << MiniJavaParser::T__26)
      | (1ULL << MiniJavaParser::T__27)
      | (1ULL << MiniJavaParser::T__28)
      | (1ULL << MiniJavaParser::T__29)
      | (1ULL << MiniJavaParser::T__30)
      | (1ULL << MiniJavaParser::T__31))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StmtContext ------------------------------------------------------------------

MiniJavaParser::StmtContext::StmtContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

MiniJavaParser::VarDeclarationContext* MiniJavaParser::StmtContext::varDeclaration() {
  return getRuleContext<MiniJavaParser::VarDeclarationContext>(0);
}

MiniJavaParser::StmtBlockContext* MiniJavaParser::StmtContext::stmtBlock() {
  return getRuleContext<MiniJavaParser::StmtBlockContext>(0);
}

std::vector<MiniJavaParser::ExpContext *> MiniJavaParser::StmtContext::exp() {
  return getRuleContexts<MiniJavaParser::ExpContext>();
}

MiniJavaParser::ExpContext* MiniJavaParser::StmtContext::exp(size_t i) {
  return getRuleContext<MiniJavaParser::ExpContext>(i);
}

std::vector<MiniJavaParser::StmtContext *> MiniJavaParser::StmtContext::stmt() {
  return getRuleContexts<MiniJavaParser::StmtContext>();
}

MiniJavaParser::StmtContext* MiniJavaParser::StmtContext::stmt(size_t i) {
  return getRuleContext<MiniJavaParser::StmtContext>(i);
}

tree::TerminalNode* MiniJavaParser::StmtContext::ID() {
  return getToken(MiniJavaParser::ID, 0);
}

MiniJavaParser::AssignSymContext* MiniJavaParser::StmtContext::assignSym() {
  return getRuleContext<MiniJavaParser::AssignSymContext>(0);
}


size_t MiniJavaParser::StmtContext::getRuleIndex() const {
  return MiniJavaParser::RuleStmt;
}

void MiniJavaParser::StmtContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStmt(this);
}

void MiniJavaParser::StmtContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStmt(this);
}


antlrcpp::Any MiniJavaParser::StmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitStmt(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::StmtContext* MiniJavaParser::stmt() {
  StmtContext *_localctx = _tracker.createInstance<StmtContext>(_ctx, getState());
  enterRule(_localctx, 20, MiniJavaParser::RuleStmt);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(160);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(120);
      varDeclaration();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(121);
      stmtBlock();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(122);
      match(MiniJavaParser::T__32);
      setState(123);
      match(MiniJavaParser::T__6);
      setState(124);
      exp(0);
      setState(125);
      match(MiniJavaParser::T__10);
      setState(126);
      stmt();
      setState(129);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
      case 1: {
        setState(127);
        match(MiniJavaParser::T__33);
        setState(128);
        stmt();
        break;
      }

      }
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(131);
      match(MiniJavaParser::T__34);
      setState(132);
      match(MiniJavaParser::T__6);
      setState(133);
      exp(0);
      setState(134);
      match(MiniJavaParser::T__10);
      setState(135);
      stmt();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(137);
      match(MiniJavaParser::T__35);
      setState(138);
      match(MiniJavaParser::T__6);
      setState(139);
      exp(0);
      setState(140);
      match(MiniJavaParser::T__10);
      setState(141);
      match(MiniJavaParser::T__15);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(143);
      match(MiniJavaParser::T__36);
      setState(144);
      exp(0);
      setState(145);
      match(MiniJavaParser::T__15);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(147);
      match(MiniJavaParser::ID);
      setState(148);
      assignSym();
      setState(149);
      exp(0);
      setState(150);
      match(MiniJavaParser::T__15);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(152);
      match(MiniJavaParser::ID);
      setState(153);
      match(MiniJavaParser::T__8);
      setState(154);
      exp(0);
      setState(155);
      match(MiniJavaParser::T__9);
      setState(156);
      assignSym();
      setState(157);
      exp(0);
      setState(158);
      match(MiniJavaParser::T__15);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpContext ------------------------------------------------------------------

MiniJavaParser::ExpContext::ExpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

MiniJavaParser::IntLiteralContext* MiniJavaParser::ExpContext::intLiteral() {
  return getRuleContext<MiniJavaParser::IntLiteralContext>(0);
}

tree::TerminalNode* MiniJavaParser::ExpContext::ID() {
  return getToken(MiniJavaParser::ID, 0);
}

std::vector<MiniJavaParser::ExpContext *> MiniJavaParser::ExpContext::exp() {
  return getRuleContexts<MiniJavaParser::ExpContext>();
}

MiniJavaParser::ExpContext* MiniJavaParser::ExpContext::exp(size_t i) {
  return getRuleContext<MiniJavaParser::ExpContext>(i);
}


size_t MiniJavaParser::ExpContext::getRuleIndex() const {
  return MiniJavaParser::RuleExp;
}

void MiniJavaParser::ExpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExp(this);
}

void MiniJavaParser::ExpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExp(this);
}


antlrcpp::Any MiniJavaParser::ExpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitExp(this);
  else
    return visitor->visitChildren(this);
}


MiniJavaParser::ExpContext* MiniJavaParser::exp() {
   return exp(0);
}

MiniJavaParser::ExpContext* MiniJavaParser::exp(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  MiniJavaParser::ExpContext *_localctx = _tracker.createInstance<ExpContext>(_ctx, parentState);
  MiniJavaParser::ExpContext *previousContext = _localctx;
  size_t startState = 22;
  enterRecursionRule(_localctx, 22, MiniJavaParser::RuleExp, precedence);

    size_t _la = 0;

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(184);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      setState(163);
      intLiteral();
      break;
    }

    case 2: {
      setState(164);
      match(MiniJavaParser::ID);
      break;
    }

    case 3: {
      setState(165);
      match(MiniJavaParser::T__6);
      setState(166);
      exp(0);
      setState(167);
      match(MiniJavaParser::T__10);
      break;
    }

    case 4: {
      setState(169);
      _la = _input->LA(1);
      if (!((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << MiniJavaParser::T__39)
        | (1ULL << MiniJavaParser::T__40)
        | (1ULL << MiniJavaParser::T__41)
        | (1ULL << MiniJavaParser::T__42))) != 0))) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(170);
      exp(17);
      break;
    }

    case 5: {
      setState(171);
      match(MiniJavaParser::T__63);
      break;
    }

    case 6: {
      setState(172);
      match(MiniJavaParser::T__64);
      break;
    }

    case 7: {
      setState(173);
      match(MiniJavaParser::T__65);
      break;
    }

    case 8: {
      setState(174);
      match(MiniJavaParser::T__66);
      setState(175);
      match(MiniJavaParser::T__17);
      setState(176);
      match(MiniJavaParser::T__8);
      setState(177);
      exp(0);
      setState(178);
      match(MiniJavaParser::T__9);
      break;
    }

    case 9: {
      setState(180);
      match(MiniJavaParser::T__66);
      setState(181);
      match(MiniJavaParser::ID);
      setState(182);
      match(MiniJavaParser::T__6);
      setState(183);
      match(MiniJavaParser::T__10);
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(247);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(245);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(186);

          if (!(precpred(_ctx, 16))) throw FailedPredicateException(this, "precpred(_ctx, 16)");
          setState(187);
          _la = _input->LA(1);
          if (!((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << MiniJavaParser::T__43)
            | (1ULL << MiniJavaParser::T__44)
            | (1ULL << MiniJavaParser::T__45))) != 0))) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(188);
          exp(17);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(189);

          if (!(precpred(_ctx, 15))) throw FailedPredicateException(this, "precpred(_ctx, 15)");
          setState(190);
          _la = _input->LA(1);
          if (!(_la == MiniJavaParser::T__40

          || _la == MiniJavaParser::T__41)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(191);
          exp(16);
          break;
        }

        case 3: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(192);

          if (!(precpred(_ctx, 14))) throw FailedPredicateException(this, "precpred(_ctx, 14)");
          setState(193);
          _la = _input->LA(1);
          if (!((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << MiniJavaParser::T__46)
            | (1ULL << MiniJavaParser::T__47)
            | (1ULL << MiniJavaParser::T__48))) != 0))) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(194);
          exp(15);
          break;
        }

        case 4: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(195);

          if (!(precpred(_ctx, 13))) throw FailedPredicateException(this, "precpred(_ctx, 13)");
          setState(196);
          _la = _input->LA(1);
          if (!((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << MiniJavaParser::T__49)
            | (1ULL << MiniJavaParser::T__50)
            | (1ULL << MiniJavaParser::T__51)
            | (1ULL << MiniJavaParser::T__52)
            | (1ULL << MiniJavaParser::T__53))) != 0))) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(197);
          exp(14);
          break;
        }

        case 5: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(198);

          if (!(precpred(_ctx, 12))) throw FailedPredicateException(this, "precpred(_ctx, 12)");
          setState(199);
          _la = _input->LA(1);
          if (!(_la == MiniJavaParser::T__54

          || _la == MiniJavaParser::T__55)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(200);
          exp(13);
          break;
        }

        case 6: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(201);

          if (!(precpred(_ctx, 11))) throw FailedPredicateException(this, "precpred(_ctx, 11)");
          setState(202);
          match(MiniJavaParser::T__56);
          setState(203);
          exp(12);
          break;
        }

        case 7: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(204);

          if (!(precpred(_ctx, 10))) throw FailedPredicateException(this, "precpred(_ctx, 10)");
          setState(205);
          match(MiniJavaParser::T__57);
          setState(206);
          exp(11);
          break;
        }

        case 8: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(207);

          if (!(precpred(_ctx, 9))) throw FailedPredicateException(this, "precpred(_ctx, 9)");
          setState(208);
          match(MiniJavaParser::T__58);
          setState(209);
          exp(10);
          break;
        }

        case 9: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(210);

          if (!(precpred(_ctx, 8))) throw FailedPredicateException(this, "precpred(_ctx, 8)");
          setState(211);
          match(MiniJavaParser::T__59);
          setState(212);
          exp(9);
          break;
        }

        case 10: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(213);

          if (!(precpred(_ctx, 7))) throw FailedPredicateException(this, "precpred(_ctx, 7)");
          setState(214);
          match(MiniJavaParser::T__60);
          setState(215);
          exp(8);
          break;
        }

        case 11: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(216);

          if (!(precpred(_ctx, 6))) throw FailedPredicateException(this, "precpred(_ctx, 6)");
          setState(217);
          match(MiniJavaParser::T__61);
          setState(218);
          exp(0);
          setState(219);
          match(MiniJavaParser::T__62);
          setState(220);
          exp(7);
          break;
        }

        case 12: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(222);

          if (!(precpred(_ctx, 20))) throw FailedPredicateException(this, "precpred(_ctx, 20)");
          setState(223);
          match(MiniJavaParser::T__8);
          setState(224);
          exp(0);
          setState(225);
          match(MiniJavaParser::T__9);
          break;
        }

        case 13: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(227);

          if (!(precpred(_ctx, 19))) throw FailedPredicateException(this, "precpred(_ctx, 19)");
          setState(228);
          match(MiniJavaParser::T__37);
          setState(229);
          match(MiniJavaParser::T__38);
          break;
        }

        case 14: {
          _localctx = _tracker.createInstance<ExpContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExp);
          setState(230);

          if (!(precpred(_ctx, 18))) throw FailedPredicateException(this, "precpred(_ctx, 18)");
          setState(231);
          match(MiniJavaParser::T__37);
          setState(232);
          match(MiniJavaParser::ID);
          setState(233);
          match(MiniJavaParser::T__6);
          setState(242);
          _errHandler->sync(this);

          _la = _input->LA(1);
          if ((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << MiniJavaParser::T__6)
            | (1ULL << MiniJavaParser::T__39)
            | (1ULL << MiniJavaParser::T__40)
            | (1ULL << MiniJavaParser::T__41)
            | (1ULL << MiniJavaParser::T__42))) != 0) || ((((_la - 64) & ~ 0x3fULL) == 0) &&
            ((1ULL << (_la - 64)) & ((1ULL << (MiniJavaParser::T__63 - 64))
            | (1ULL << (MiniJavaParser::T__64 - 64))
            | (1ULL << (MiniJavaParser::T__65 - 64))
            | (1ULL << (MiniJavaParser::T__66 - 64))
            | (1ULL << (MiniJavaParser::ID - 64))
            | (1ULL << (MiniJavaParser::INT_HEX - 64))
            | (1ULL << (MiniJavaParser::INT_BIN - 64))
            | (1ULL << (MiniJavaParser::INT_DEC - 64)))) != 0)) {
            setState(234);
            exp(0);
            setState(239);
            _errHandler->sync(this);
            _la = _input->LA(1);
            while (_la == MiniJavaParser::T__16) {
              setState(235);
              match(MiniJavaParser::T__16);
              setState(236);
              exp(0);
              setState(241);
              _errHandler->sync(this);
              _la = _input->LA(1);
            }
          }
          setState(244);
          match(MiniJavaParser::T__10);
          break;
        }

        } 
      }
      setState(249);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 16, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- IntLiteralContext ------------------------------------------------------------------

MiniJavaParser::IntLiteralContext::IntLiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* MiniJavaParser::IntLiteralContext::INT_HEX() {
  return getToken(MiniJavaParser::INT_HEX, 0);
}

tree::TerminalNode* MiniJavaParser::IntLiteralContext::INT_BIN() {
  return getToken(MiniJavaParser::INT_BIN, 0);
}

tree::TerminalNode* MiniJavaParser::IntLiteralContext::INT_DEC() {
  return getToken(MiniJavaParser::INT_DEC, 0);
}


size_t MiniJavaParser::IntLiteralContext::getRuleIndex() const {
  return MiniJavaParser::RuleIntLiteral;
}

void MiniJavaParser::IntLiteralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIntLiteral(this);
}

void MiniJavaParser::IntLiteralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<MiniJavaListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIntLiteral(this);
}


antlrcpp::Any MiniJavaParser::IntLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<MiniJavaVisitor*>(visitor))
    return parserVisitor->visitIntLiteral(this);
  else
    return visitor->visitChildren(this);
}

MiniJavaParser::IntLiteralContext* MiniJavaParser::intLiteral() {
  IntLiteralContext *_localctx = _tracker.createInstance<IntLiteralContext>(_ctx, getState());
  enterRule(_localctx, 24, MiniJavaParser::RuleIntLiteral);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(250);
    _la = _input->LA(1);
    if (!(((((_la - 69) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 69)) & ((1ULL << (MiniJavaParser::INT_HEX - 69))
      | (1ULL << (MiniJavaParser::INT_BIN - 69))
      | (1ULL << (MiniJavaParser::INT_DEC - 69)))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool MiniJavaParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 11: return expSempred(dynamic_cast<ExpContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool MiniJavaParser::expSempred(ExpContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 16);
    case 1: return precpred(_ctx, 15);
    case 2: return precpred(_ctx, 14);
    case 3: return precpred(_ctx, 13);
    case 4: return precpred(_ctx, 12);
    case 5: return precpred(_ctx, 11);
    case 6: return precpred(_ctx, 10);
    case 7: return precpred(_ctx, 9);
    case 8: return precpred(_ctx, 8);
    case 9: return precpred(_ctx, 7);
    case 10: return precpred(_ctx, 6);
    case 11: return precpred(_ctx, 20);
    case 12: return precpred(_ctx, 19);
    case 13: return precpred(_ctx, 18);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> MiniJavaParser::_decisionToDFA;
atn::PredictionContextCache MiniJavaParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN MiniJavaParser::_atn;
std::vector<uint16_t> MiniJavaParser::_serializedATN;

std::vector<std::string> MiniJavaParser::_ruleNames = {
  "goal", "mainClass", "permissionDesc", "classDeclaration", "declaration", 
  "varDeclaration", "methodDeclaration", "type", "stmtBlock", "assignSym", 
  "stmt", "exp", "intLiteral"
};

std::vector<std::string> MiniJavaParser::_literalNames = {
  "", "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
  "'String'", "'['", "']'", "')'", "'}'", "'protected'", "'private'", "'extends'", 
  "';'", "','", "'int'", "'boolean'", "'='", "'+='", "'-='", "'*='", "'/='", 
  "'%='", "'&='", "'|='", "'^='", "'~='", "'<<='", "'>>='", "'>>>='", "'if'", 
  "'else'", "'while'", "'System.out.println'", "'return'", "'.'", "'length'", 
  "'!'", "'+'", "'-'", "'~'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", 
  "'<'", "'>'", "'<='", "'>='", "'instanceof'", "'=='", "'!='", "'&'", "'^'", 
  "'|'", "'&&'", "'||'", "'?'", "':'", "'true'", "'false'", "'this'", "'new'"
};

std::vector<std::string> MiniJavaParser::_symbolicNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "ID", "INT_HEX", 
  "INT_BIN", "INT_DEC", "WS"
};

dfa::Vocabulary MiniJavaParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> MiniJavaParser::_tokenNames;

MiniJavaParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x430, 0xd6d1, 0x8206, 0xad2d, 0x4417, 0xaef1, 0x8d80, 0xaadd, 
    0x3, 0x4a, 0xff, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 0x9, 
    0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 0x4, 
    0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 0x9, 
    0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 0x3, 
    0x2, 0x3, 0x2, 0x7, 0x2, 0x1f, 0xa, 0x2, 0xc, 0x2, 0xe, 0x2, 0x22, 0xb, 
    0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 
    0x5, 0x5, 0x5, 0x39, 0xa, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
    0x5, 0x5, 0x3f, 0xa, 0x5, 0x3, 0x5, 0x3, 0x5, 0x7, 0x5, 0x43, 0xa, 0x5, 
    0xc, 0x5, 0xe, 0x5, 0x46, 0xb, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 0x3, 
    0x6, 0x5, 0x6, 0x4c, 0xa, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
    0x3, 0x8, 0x5, 0x8, 0x53, 0xa, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 
    0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x7, 0x8, 0x5e, 
    0xa, 0x8, 0xc, 0x8, 0xe, 0x8, 0x61, 0xb, 0x8, 0x5, 0x8, 0x63, 0xa, 0x8, 
    0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x6e, 0xa, 0x9, 0x3, 0xa, 0x3, 0xa, 0x7, 
    0xa, 0x72, 0xa, 0xa, 0xc, 0xa, 0xe, 0xa, 0x75, 0xb, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
    0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0x84, 0xa, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x5, 0xc, 0xa3, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0xbb, 0xa, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xd, 0x7, 0xd, 0xf0, 0xa, 0xd, 0xc, 0xd, 0xe, 0xd, 0xf3, 
    0xb, 0xd, 0x5, 0xd, 0xf5, 0xa, 0xd, 0x3, 0xd, 0x7, 0xd, 0xf8, 0xa, 0xd, 
    0xc, 0xd, 0xe, 0xd, 0xfb, 0xb, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x2, 
    0x3, 0x18, 0xf, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 
    0x16, 0x18, 0x1a, 0x2, 0xb, 0x4, 0x2, 0x5, 0x5, 0xf, 0x10, 0x3, 0x2, 
    0x16, 0x22, 0x3, 0x2, 0x2a, 0x2d, 0x3, 0x2, 0x2e, 0x30, 0x3, 0x2, 0x2b, 
    0x2c, 0x3, 0x2, 0x31, 0x33, 0x3, 0x2, 0x34, 0x38, 0x3, 0x2, 0x39, 0x3a, 
    0x3, 0x2, 0x47, 0x49, 0x11d, 0x2, 0x1c, 0x3, 0x2, 0x2, 0x2, 0x4, 0x25, 
    0x3, 0x2, 0x2, 0x2, 0x6, 0x35, 0x3, 0x2, 0x2, 0x2, 0x8, 0x38, 0x3, 0x2, 
    0x2, 0x2, 0xa, 0x4b, 0x3, 0x2, 0x2, 0x2, 0xc, 0x4d, 0x3, 0x2, 0x2, 0x2, 
    0xe, 0x52, 0x3, 0x2, 0x2, 0x2, 0x10, 0x6d, 0x3, 0x2, 0x2, 0x2, 0x12, 
    0x6f, 0x3, 0x2, 0x2, 0x2, 0x14, 0x78, 0x3, 0x2, 0x2, 0x2, 0x16, 0xa2, 
    0x3, 0x2, 0x2, 0x2, 0x18, 0xba, 0x3, 0x2, 0x2, 0x2, 0x1a, 0xfc, 0x3, 
    0x2, 0x2, 0x2, 0x1c, 0x20, 0x5, 0x4, 0x3, 0x2, 0x1d, 0x1f, 0x5, 0x8, 
    0x5, 0x2, 0x1e, 0x1d, 0x3, 0x2, 0x2, 0x2, 0x1f, 0x22, 0x3, 0x2, 0x2, 
    0x2, 0x20, 0x1e, 0x3, 0x2, 0x2, 0x2, 0x20, 0x21, 0x3, 0x2, 0x2, 0x2, 
    0x21, 0x23, 0x3, 0x2, 0x2, 0x2, 0x22, 0x20, 0x3, 0x2, 0x2, 0x2, 0x23, 
    0x24, 0x7, 0x2, 0x2, 0x3, 0x24, 0x3, 0x3, 0x2, 0x2, 0x2, 0x25, 0x26, 
    0x7, 0x3, 0x2, 0x2, 0x26, 0x27, 0x7, 0x46, 0x2, 0x2, 0x27, 0x28, 0x7, 
    0x4, 0x2, 0x2, 0x28, 0x29, 0x7, 0x5, 0x2, 0x2, 0x29, 0x2a, 0x7, 0x6, 
    0x2, 0x2, 0x2a, 0x2b, 0x7, 0x7, 0x2, 0x2, 0x2b, 0x2c, 0x7, 0x8, 0x2, 
    0x2, 0x2c, 0x2d, 0x7, 0x9, 0x2, 0x2, 0x2d, 0x2e, 0x7, 0xa, 0x2, 0x2, 
    0x2e, 0x2f, 0x7, 0xb, 0x2, 0x2, 0x2f, 0x30, 0x7, 0xc, 0x2, 0x2, 0x30, 
    0x31, 0x7, 0x46, 0x2, 0x2, 0x31, 0x32, 0x7, 0xd, 0x2, 0x2, 0x32, 0x33, 
    0x5, 0x12, 0xa, 0x2, 0x33, 0x34, 0x7, 0xe, 0x2, 0x2, 0x34, 0x5, 0x3, 
    0x2, 0x2, 0x2, 0x35, 0x36, 0x9, 0x2, 0x2, 0x2, 0x36, 0x7, 0x3, 0x2, 
    0x2, 0x2, 0x37, 0x39, 0x5, 0x6, 0x4, 0x2, 0x38, 0x37, 0x3, 0x2, 0x2, 
    0x2, 0x38, 0x39, 0x3, 0x2, 0x2, 0x2, 0x39, 0x3a, 0x3, 0x2, 0x2, 0x2, 
    0x3a, 0x3b, 0x7, 0x3, 0x2, 0x2, 0x3b, 0x3e, 0x7, 0x46, 0x2, 0x2, 0x3c, 
    0x3d, 0x7, 0x11, 0x2, 0x2, 0x3d, 0x3f, 0x7, 0x46, 0x2, 0x2, 0x3e, 0x3c, 
    0x3, 0x2, 0x2, 0x2, 0x3e, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x3f, 0x40, 0x3, 
    0x2, 0x2, 0x2, 0x40, 0x44, 0x7, 0x4, 0x2, 0x2, 0x41, 0x43, 0x5, 0xa, 
    0x6, 0x2, 0x42, 0x41, 0x3, 0x2, 0x2, 0x2, 0x43, 0x46, 0x3, 0x2, 0x2, 
    0x2, 0x44, 0x42, 0x3, 0x2, 0x2, 0x2, 0x44, 0x45, 0x3, 0x2, 0x2, 0x2, 
    0x45, 0x47, 0x3, 0x2, 0x2, 0x2, 0x46, 0x44, 0x3, 0x2, 0x2, 0x2, 0x47, 
    0x48, 0x7, 0xe, 0x2, 0x2, 0x48, 0x9, 0x3, 0x2, 0x2, 0x2, 0x49, 0x4c, 
    0x5, 0xc, 0x7, 0x2, 0x4a, 0x4c, 0x5, 0xe, 0x8, 0x2, 0x4b, 0x49, 0x3, 
    0x2, 0x2, 0x2, 0x4b, 0x4a, 0x3, 0x2, 0x2, 0x2, 0x4c, 0xb, 0x3, 0x2, 
    0x2, 0x2, 0x4d, 0x4e, 0x5, 0x10, 0x9, 0x2, 0x4e, 0x4f, 0x7, 0x46, 0x2, 
    0x2, 0x4f, 0x50, 0x7, 0x12, 0x2, 0x2, 0x50, 0xd, 0x3, 0x2, 0x2, 0x2, 
    0x51, 0x53, 0x5, 0x6, 0x4, 0x2, 0x52, 0x51, 0x3, 0x2, 0x2, 0x2, 0x52, 
    0x53, 0x3, 0x2, 0x2, 0x2, 0x53, 0x54, 0x3, 0x2, 0x2, 0x2, 0x54, 0x55, 
    0x5, 0x10, 0x9, 0x2, 0x55, 0x56, 0x7, 0x46, 0x2, 0x2, 0x56, 0x62, 0x7, 
    0x9, 0x2, 0x2, 0x57, 0x58, 0x5, 0x10, 0x9, 0x2, 0x58, 0x5f, 0x7, 0x46, 
    0x2, 0x2, 0x59, 0x5a, 0x7, 0x13, 0x2, 0x2, 0x5a, 0x5b, 0x5, 0x10, 0x9, 
    0x2, 0x5b, 0x5c, 0x7, 0x46, 0x2, 0x2, 0x5c, 0x5e, 0x3, 0x2, 0x2, 0x2, 
    0x5d, 0x59, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x61, 0x3, 0x2, 0x2, 0x2, 0x5f, 
    0x5d, 0x3, 0x2, 0x2, 0x2, 0x5f, 0x60, 0x3, 0x2, 0x2, 0x2, 0x60, 0x63, 
    0x3, 0x2, 0x2, 0x2, 0x61, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x62, 0x57, 0x3, 
    0x2, 0x2, 0x2, 0x62, 0x63, 0x3, 0x2, 0x2, 0x2, 0x63, 0x64, 0x3, 0x2, 
    0x2, 0x2, 0x64, 0x65, 0x7, 0xd, 0x2, 0x2, 0x65, 0x66, 0x5, 0x12, 0xa, 
    0x2, 0x66, 0xf, 0x3, 0x2, 0x2, 0x2, 0x67, 0x68, 0x7, 0x14, 0x2, 0x2, 
    0x68, 0x69, 0x7, 0xb, 0x2, 0x2, 0x69, 0x6e, 0x7, 0xc, 0x2, 0x2, 0x6a, 
    0x6e, 0x7, 0x15, 0x2, 0x2, 0x6b, 0x6e, 0x7, 0x14, 0x2, 0x2, 0x6c, 0x6e, 
    0x7, 0x46, 0x2, 0x2, 0x6d, 0x67, 0x3, 0x2, 0x2, 0x2, 0x6d, 0x6a, 0x3, 
    0x2, 0x2, 0x2, 0x6d, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x6d, 0x6c, 0x3, 0x2, 
    0x2, 0x2, 0x6e, 0x11, 0x3, 0x2, 0x2, 0x2, 0x6f, 0x73, 0x7, 0x4, 0x2, 
    0x2, 0x70, 0x72, 0x5, 0x16, 0xc, 0x2, 0x71, 0x70, 0x3, 0x2, 0x2, 0x2, 
    0x72, 0x75, 0x3, 0x2, 0x2, 0x2, 0x73, 0x71, 0x3, 0x2, 0x2, 0x2, 0x73, 
    0x74, 0x3, 0x2, 0x2, 0x2, 0x74, 0x76, 0x3, 0x2, 0x2, 0x2, 0x75, 0x73, 
    0x3, 0x2, 0x2, 0x2, 0x76, 0x77, 0x7, 0xe, 0x2, 0x2, 0x77, 0x13, 0x3, 
    0x2, 0x2, 0x2, 0x78, 0x79, 0x9, 0x3, 0x2, 0x2, 0x79, 0x15, 0x3, 0x2, 
    0x2, 0x2, 0x7a, 0xa3, 0x5, 0xc, 0x7, 0x2, 0x7b, 0xa3, 0x5, 0x12, 0xa, 
    0x2, 0x7c, 0x7d, 0x7, 0x23, 0x2, 0x2, 0x7d, 0x7e, 0x7, 0x9, 0x2, 0x2, 
    0x7e, 0x7f, 0x5, 0x18, 0xd, 0x2, 0x7f, 0x80, 0x7, 0xd, 0x2, 0x2, 0x80, 
    0x83, 0x5, 0x16, 0xc, 0x2, 0x81, 0x82, 0x7, 0x24, 0x2, 0x2, 0x82, 0x84, 
    0x5, 0x16, 0xc, 0x2, 0x83, 0x81, 0x3, 0x2, 0x2, 0x2, 0x83, 0x84, 0x3, 
    0x2, 0x2, 0x2, 0x84, 0xa3, 0x3, 0x2, 0x2, 0x2, 0x85, 0x86, 0x7, 0x25, 
    0x2, 0x2, 0x86, 0x87, 0x7, 0x9, 0x2, 0x2, 0x87, 0x88, 0x5, 0x18, 0xd, 
    0x2, 0x88, 0x89, 0x7, 0xd, 0x2, 0x2, 0x89, 0x8a, 0x5, 0x16, 0xc, 0x2, 
    0x8a, 0xa3, 0x3, 0x2, 0x2, 0x2, 0x8b, 0x8c, 0x7, 0x26, 0x2, 0x2, 0x8c, 
    0x8d, 0x7, 0x9, 0x2, 0x2, 0x8d, 0x8e, 0x5, 0x18, 0xd, 0x2, 0x8e, 0x8f, 
    0x7, 0xd, 0x2, 0x2, 0x8f, 0x90, 0x7, 0x12, 0x2, 0x2, 0x90, 0xa3, 0x3, 
    0x2, 0x2, 0x2, 0x91, 0x92, 0x7, 0x27, 0x2, 0x2, 0x92, 0x93, 0x5, 0x18, 
    0xd, 0x2, 0x93, 0x94, 0x7, 0x12, 0x2, 0x2, 0x94, 0xa3, 0x3, 0x2, 0x2, 
    0x2, 0x95, 0x96, 0x7, 0x46, 0x2, 0x2, 0x96, 0x97, 0x5, 0x14, 0xb, 0x2, 
    0x97, 0x98, 0x5, 0x18, 0xd, 0x2, 0x98, 0x99, 0x7, 0x12, 0x2, 0x2, 0x99, 
    0xa3, 0x3, 0x2, 0x2, 0x2, 0x9a, 0x9b, 0x7, 0x46, 0x2, 0x2, 0x9b, 0x9c, 
    0x7, 0xb, 0x2, 0x2, 0x9c, 0x9d, 0x5, 0x18, 0xd, 0x2, 0x9d, 0x9e, 0x7, 
    0xc, 0x2, 0x2, 0x9e, 0x9f, 0x5, 0x14, 0xb, 0x2, 0x9f, 0xa0, 0x5, 0x18, 
    0xd, 0x2, 0xa0, 0xa1, 0x7, 0x12, 0x2, 0x2, 0xa1, 0xa3, 0x3, 0x2, 0x2, 
    0x2, 0xa2, 0x7a, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x7b, 0x3, 0x2, 0x2, 0x2, 
    0xa2, 0x7c, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x85, 0x3, 0x2, 0x2, 0x2, 0xa2, 
    0x8b, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x91, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x95, 
    0x3, 0x2, 0x2, 0x2, 0xa2, 0x9a, 0x3, 0x2, 0x2, 0x2, 0xa3, 0x17, 0x3, 
    0x2, 0x2, 0x2, 0xa4, 0xa5, 0x8, 0xd, 0x1, 0x2, 0xa5, 0xbb, 0x5, 0x1a, 
    0xe, 0x2, 0xa6, 0xbb, 0x7, 0x46, 0x2, 0x2, 0xa7, 0xa8, 0x7, 0x9, 0x2, 
    0x2, 0xa8, 0xa9, 0x5, 0x18, 0xd, 0x2, 0xa9, 0xaa, 0x7, 0xd, 0x2, 0x2, 
    0xaa, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xab, 0xac, 0x9, 0x4, 0x2, 0x2, 0xac, 
    0xbb, 0x5, 0x18, 0xd, 0x13, 0xad, 0xbb, 0x7, 0x42, 0x2, 0x2, 0xae, 0xbb, 
    0x7, 0x43, 0x2, 0x2, 0xaf, 0xbb, 0x7, 0x44, 0x2, 0x2, 0xb0, 0xb1, 0x7, 
    0x45, 0x2, 0x2, 0xb1, 0xb2, 0x7, 0x14, 0x2, 0x2, 0xb2, 0xb3, 0x7, 0xb, 
    0x2, 0x2, 0xb3, 0xb4, 0x5, 0x18, 0xd, 0x2, 0xb4, 0xb5, 0x7, 0xc, 0x2, 
    0x2, 0xb5, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xb6, 0xb7, 0x7, 0x45, 0x2, 0x2, 
    0xb7, 0xb8, 0x7, 0x46, 0x2, 0x2, 0xb8, 0xb9, 0x7, 0x9, 0x2, 0x2, 0xb9, 
    0xbb, 0x7, 0xd, 0x2, 0x2, 0xba, 0xa4, 0x3, 0x2, 0x2, 0x2, 0xba, 0xa6, 
    0x3, 0x2, 0x2, 0x2, 0xba, 0xa7, 0x3, 0x2, 0x2, 0x2, 0xba, 0xab, 0x3, 
    0x2, 0x2, 0x2, 0xba, 0xad, 0x3, 0x2, 0x2, 0x2, 0xba, 0xae, 0x3, 0x2, 
    0x2, 0x2, 0xba, 0xaf, 0x3, 0x2, 0x2, 0x2, 0xba, 0xb0, 0x3, 0x2, 0x2, 
    0x2, 0xba, 0xb6, 0x3, 0x2, 0x2, 0x2, 0xbb, 0xf9, 0x3, 0x2, 0x2, 0x2, 
    0xbc, 0xbd, 0xc, 0x12, 0x2, 0x2, 0xbd, 0xbe, 0x9, 0x5, 0x2, 0x2, 0xbe, 
    0xf8, 0x5, 0x18, 0xd, 0x13, 0xbf, 0xc0, 0xc, 0x11, 0x2, 0x2, 0xc0, 0xc1, 
    0x9, 0x6, 0x2, 0x2, 0xc1, 0xf8, 0x5, 0x18, 0xd, 0x12, 0xc2, 0xc3, 0xc, 
    0x10, 0x2, 0x2, 0xc3, 0xc4, 0x9, 0x7, 0x2, 0x2, 0xc4, 0xf8, 0x5, 0x18, 
    0xd, 0x11, 0xc5, 0xc6, 0xc, 0xf, 0x2, 0x2, 0xc6, 0xc7, 0x9, 0x8, 0x2, 
    0x2, 0xc7, 0xf8, 0x5, 0x18, 0xd, 0x10, 0xc8, 0xc9, 0xc, 0xe, 0x2, 0x2, 
    0xc9, 0xca, 0x9, 0x9, 0x2, 0x2, 0xca, 0xf8, 0x5, 0x18, 0xd, 0xf, 0xcb, 
    0xcc, 0xc, 0xd, 0x2, 0x2, 0xcc, 0xcd, 0x7, 0x3b, 0x2, 0x2, 0xcd, 0xf8, 
    0x5, 0x18, 0xd, 0xe, 0xce, 0xcf, 0xc, 0xc, 0x2, 0x2, 0xcf, 0xd0, 0x7, 
    0x3c, 0x2, 0x2, 0xd0, 0xf8, 0x5, 0x18, 0xd, 0xd, 0xd1, 0xd2, 0xc, 0xb, 
    0x2, 0x2, 0xd2, 0xd3, 0x7, 0x3d, 0x2, 0x2, 0xd3, 0xf8, 0x5, 0x18, 0xd, 
    0xc, 0xd4, 0xd5, 0xc, 0xa, 0x2, 0x2, 0xd5, 0xd6, 0x7, 0x3e, 0x2, 0x2, 
    0xd6, 0xf8, 0x5, 0x18, 0xd, 0xb, 0xd7, 0xd8, 0xc, 0x9, 0x2, 0x2, 0xd8, 
    0xd9, 0x7, 0x3f, 0x2, 0x2, 0xd9, 0xf8, 0x5, 0x18, 0xd, 0xa, 0xda, 0xdb, 
    0xc, 0x8, 0x2, 0x2, 0xdb, 0xdc, 0x7, 0x40, 0x2, 0x2, 0xdc, 0xdd, 0x5, 
    0x18, 0xd, 0x2, 0xdd, 0xde, 0x7, 0x41, 0x2, 0x2, 0xde, 0xdf, 0x5, 0x18, 
    0xd, 0x9, 0xdf, 0xf8, 0x3, 0x2, 0x2, 0x2, 0xe0, 0xe1, 0xc, 0x16, 0x2, 
    0x2, 0xe1, 0xe2, 0x7, 0xb, 0x2, 0x2, 0xe2, 0xe3, 0x5, 0x18, 0xd, 0x2, 
    0xe3, 0xe4, 0x7, 0xc, 0x2, 0x2, 0xe4, 0xf8, 0x3, 0x2, 0x2, 0x2, 0xe5, 
    0xe6, 0xc, 0x15, 0x2, 0x2, 0xe6, 0xe7, 0x7, 0x28, 0x2, 0x2, 0xe7, 0xf8, 
    0x7, 0x29, 0x2, 0x2, 0xe8, 0xe9, 0xc, 0x14, 0x2, 0x2, 0xe9, 0xea, 0x7, 
    0x28, 0x2, 0x2, 0xea, 0xeb, 0x7, 0x46, 0x2, 0x2, 0xeb, 0xf4, 0x7, 0x9, 
    0x2, 0x2, 0xec, 0xf1, 0x5, 0x18, 0xd, 0x2, 0xed, 0xee, 0x7, 0x13, 0x2, 
    0x2, 0xee, 0xf0, 0x5, 0x18, 0xd, 0x2, 0xef, 0xed, 0x3, 0x2, 0x2, 0x2, 
    0xf0, 0xf3, 0x3, 0x2, 0x2, 0x2, 0xf1, 0xef, 0x3, 0x2, 0x2, 0x2, 0xf1, 
    0xf2, 0x3, 0x2, 0x2, 0x2, 0xf2, 0xf5, 0x3, 0x2, 0x2, 0x2, 0xf3, 0xf1, 
    0x3, 0x2, 0x2, 0x2, 0xf4, 0xec, 0x3, 0x2, 0x2, 0x2, 0xf4, 0xf5, 0x3, 
    0x2, 0x2, 0x2, 0xf5, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xf8, 0x7, 0xd, 
    0x2, 0x2, 0xf7, 0xbc, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xbf, 0x3, 0x2, 0x2, 
    0x2, 0xf7, 0xc2, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xc5, 0x3, 0x2, 0x2, 0x2, 
    0xf7, 0xc8, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xcb, 0x3, 0x2, 0x2, 0x2, 0xf7, 
    0xce, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xd1, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xd4, 
    0x3, 0x2, 0x2, 0x2, 0xf7, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xda, 0x3, 
    0x2, 0x2, 0x2, 0xf7, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xe5, 0x3, 0x2, 
    0x2, 0x2, 0xf7, 0xe8, 0x3, 0x2, 0x2, 0x2, 0xf8, 0xfb, 0x3, 0x2, 0x2, 
    0x2, 0xf9, 0xf7, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xfa, 0x3, 0x2, 0x2, 0x2, 
    0xfa, 0x19, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xf9, 0x3, 0x2, 0x2, 0x2, 0xfc, 
    0xfd, 0x9, 0xa, 0x2, 0x2, 0xfd, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x13, 0x20, 
    0x38, 0x3e, 0x44, 0x4b, 0x52, 0x5f, 0x62, 0x6d, 0x73, 0x83, 0xa2, 0xba, 
    0xf1, 0xf4, 0xf7, 0xf9, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

MiniJavaParser::Initializer MiniJavaParser::_init;
