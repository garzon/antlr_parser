
// Generated from D:/ÎÄµµ/ÎÒÔÚFDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6

#pragma once


#include "antlr4-runtime.h"
#include "MiniJavaVisitor.h"


namespace MiniJava {

/**
 * This class provides an empty implementation of MiniJavaVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  MiniJavaBaseVisitor : public MiniJavaVisitor {
public:

  virtual antlrcpp::Any visitGoal(MiniJavaParser::GoalContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMainClass(MiniJavaParser::MainClassContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitPermissionDesc(MiniJavaParser::PermissionDescContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitClassDeclaration(MiniJavaParser::ClassDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDeclaration(MiniJavaParser::DeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVarDeclaration(MiniJavaParser::VarDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMethodDeclaration(MiniJavaParser::MethodDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType(MiniJavaParser::TypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStmtBlock(MiniJavaParser::StmtBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAssignSym(MiniJavaParser::AssignSymContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStmt(MiniJavaParser::StmtContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExp(MiniJavaParser::ExpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIntLiteral(MiniJavaParser::IntLiteralContext *ctx) override {
    return visitChildren(ctx);
  }


};

}  // namespace MiniJava
