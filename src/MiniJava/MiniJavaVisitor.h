
// Generated from D:/ÎÄµµ/ÎÒÔÚFDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6

#pragma once


#include "antlr4-runtime.h"
#include "MiniJavaParser.h"


namespace MiniJava {

/**
 * This class defines an abstract visitor for a parse tree
 * produced by MiniJavaParser.
 */
class  MiniJavaVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by MiniJavaParser.
   */
    virtual antlrcpp::Any visitGoal(MiniJavaParser::GoalContext *context) = 0;

    virtual antlrcpp::Any visitMainClass(MiniJavaParser::MainClassContext *context) = 0;

    virtual antlrcpp::Any visitPermissionDesc(MiniJavaParser::PermissionDescContext *context) = 0;

    virtual antlrcpp::Any visitClassDeclaration(MiniJavaParser::ClassDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitDeclaration(MiniJavaParser::DeclarationContext *context) = 0;

    virtual antlrcpp::Any visitVarDeclaration(MiniJavaParser::VarDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitMethodDeclaration(MiniJavaParser::MethodDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitType(MiniJavaParser::TypeContext *context) = 0;

    virtual antlrcpp::Any visitStmtBlock(MiniJavaParser::StmtBlockContext *context) = 0;

    virtual antlrcpp::Any visitAssignSym(MiniJavaParser::AssignSymContext *context) = 0;

    virtual antlrcpp::Any visitStmt(MiniJavaParser::StmtContext *context) = 0;

    virtual antlrcpp::Any visitExp(MiniJavaParser::ExpContext *context) = 0;

    virtual antlrcpp::Any visitIntLiteral(MiniJavaParser::IntLiteralContext *context) = 0;


};

}  // namespace MiniJava
