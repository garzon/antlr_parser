
// Generated from D:/ÎÄµµ/ÎÒÔÚFDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6

#pragma once


#include "antlr4-runtime.h"
#include "MiniJavaParser.h"


namespace MiniJava {

/**
 * This interface defines an abstract listener for a parse tree produced by MiniJavaParser.
 */
class  MiniJavaListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterGoal(MiniJavaParser::GoalContext *ctx) = 0;
  virtual void exitGoal(MiniJavaParser::GoalContext *ctx) = 0;

  virtual void enterMainClass(MiniJavaParser::MainClassContext *ctx) = 0;
  virtual void exitMainClass(MiniJavaParser::MainClassContext *ctx) = 0;

  virtual void enterPermissionDesc(MiniJavaParser::PermissionDescContext *ctx) = 0;
  virtual void exitPermissionDesc(MiniJavaParser::PermissionDescContext *ctx) = 0;

  virtual void enterClassDeclaration(MiniJavaParser::ClassDeclarationContext *ctx) = 0;
  virtual void exitClassDeclaration(MiniJavaParser::ClassDeclarationContext *ctx) = 0;

  virtual void enterDeclaration(MiniJavaParser::DeclarationContext *ctx) = 0;
  virtual void exitDeclaration(MiniJavaParser::DeclarationContext *ctx) = 0;

  virtual void enterVarDeclaration(MiniJavaParser::VarDeclarationContext *ctx) = 0;
  virtual void exitVarDeclaration(MiniJavaParser::VarDeclarationContext *ctx) = 0;

  virtual void enterMethodDeclaration(MiniJavaParser::MethodDeclarationContext *ctx) = 0;
  virtual void exitMethodDeclaration(MiniJavaParser::MethodDeclarationContext *ctx) = 0;

  virtual void enterType(MiniJavaParser::TypeContext *ctx) = 0;
  virtual void exitType(MiniJavaParser::TypeContext *ctx) = 0;

  virtual void enterStmtBlock(MiniJavaParser::StmtBlockContext *ctx) = 0;
  virtual void exitStmtBlock(MiniJavaParser::StmtBlockContext *ctx) = 0;

  virtual void enterAssignSym(MiniJavaParser::AssignSymContext *ctx) = 0;
  virtual void exitAssignSym(MiniJavaParser::AssignSymContext *ctx) = 0;

  virtual void enterStmt(MiniJavaParser::StmtContext *ctx) = 0;
  virtual void exitStmt(MiniJavaParser::StmtContext *ctx) = 0;

  virtual void enterExp(MiniJavaParser::ExpContext *ctx) = 0;
  virtual void exitExp(MiniJavaParser::ExpContext *ctx) = 0;

  virtual void enterIntLiteral(MiniJavaParser::IntLiteralContext *ctx) = 0;
  virtual void exitIntLiteral(MiniJavaParser::IntLiteralContext *ctx) = 0;


};

}  // namespace MiniJava
