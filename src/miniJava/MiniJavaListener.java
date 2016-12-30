// Generated from D:/ÎÄµµ/ÎÒÔÚFDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6
package miniJava;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#permissionDesc}.
	 * @param ctx the parse tree
	 */
	void enterPermissionDesc(MiniJavaParser.PermissionDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#permissionDesc}.
	 * @param ctx the parse tree
	 */
	void exitPermissionDesc(MiniJavaParser.PermissionDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MiniJavaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MiniJavaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(MiniJavaParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(MiniJavaParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignSym}.
	 * @param ctx the parse tree
	 */
	void enterAssignSym(MiniJavaParser.AssignSymContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignSym}.
	 * @param ctx the parse tree
	 */
	void exitAssignSym(MiniJavaParser.AssignSymContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MiniJavaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MiniJavaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(MiniJavaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(MiniJavaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(MiniJavaParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(MiniJavaParser.IntLiteralContext ctx);
}