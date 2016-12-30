
// Generated from D:/ÎÄµµ/ÎÒÔÚFDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6

#pragma once


#include "antlr4-runtime.h"
#include "MiniJavaListener.h"


namespace MiniJava {

/**
 * This class provides an empty implementation of MiniJavaListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  MiniJavaBaseListener : public MiniJavaListener {
public:

  virtual void enterGoal(MiniJavaParser::GoalContext * /*ctx*/) override { }
  virtual void exitGoal(MiniJavaParser::GoalContext * /*ctx*/) override { }

  virtual void enterMainClass(MiniJavaParser::MainClassContext * /*ctx*/) override { }
  virtual void exitMainClass(MiniJavaParser::MainClassContext * /*ctx*/) override { }

  virtual void enterPermissionDesc(MiniJavaParser::PermissionDescContext * /*ctx*/) override { }
  virtual void exitPermissionDesc(MiniJavaParser::PermissionDescContext * /*ctx*/) override { }

  virtual void enterClassDeclaration(MiniJavaParser::ClassDeclarationContext * /*ctx*/) override { }
  virtual void exitClassDeclaration(MiniJavaParser::ClassDeclarationContext * /*ctx*/) override { }

  virtual void enterDeclaration(MiniJavaParser::DeclarationContext * /*ctx*/) override { }
  virtual void exitDeclaration(MiniJavaParser::DeclarationContext * /*ctx*/) override { }

  virtual void enterVarDeclaration(MiniJavaParser::VarDeclarationContext * /*ctx*/) override { }
  virtual void exitVarDeclaration(MiniJavaParser::VarDeclarationContext * /*ctx*/) override { }

  virtual void enterMethodDeclaration(MiniJavaParser::MethodDeclarationContext * /*ctx*/) override { }
  virtual void exitMethodDeclaration(MiniJavaParser::MethodDeclarationContext * /*ctx*/) override { }

  virtual void enterType(MiniJavaParser::TypeContext * /*ctx*/) override { }
  virtual void exitType(MiniJavaParser::TypeContext * /*ctx*/) override { }

  virtual void enterStmtBlock(MiniJavaParser::StmtBlockContext * /*ctx*/) override { }
  virtual void exitStmtBlock(MiniJavaParser::StmtBlockContext * /*ctx*/) override { }

  virtual void enterAssignSym(MiniJavaParser::AssignSymContext * /*ctx*/) override { }
  virtual void exitAssignSym(MiniJavaParser::AssignSymContext * /*ctx*/) override { }

  virtual void enterStmt(MiniJavaParser::StmtContext * /*ctx*/) override { }
  virtual void exitStmt(MiniJavaParser::StmtContext * /*ctx*/) override { }

  virtual void enterExp(MiniJavaParser::ExpContext * /*ctx*/) override { }
  virtual void exitExp(MiniJavaParser::ExpContext * /*ctx*/) override { }

  virtual void enterIntLiteral(MiniJavaParser::IntLiteralContext * /*ctx*/) override { }
  virtual void exitIntLiteral(MiniJavaParser::IntLiteralContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

}  // namespace MiniJava
