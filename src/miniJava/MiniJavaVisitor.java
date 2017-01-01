// Generated from D:/文档/我在FDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6
package miniJava;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MiniJavaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(MiniJavaParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#permissionDesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermissionDesc(MiniJavaParser.PermissionDescContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#argPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgPair(MiniJavaParser.ArgPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#arrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrType(MiniJavaParser.ArrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(MiniJavaParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#stmtBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(MiniJavaParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#assignSym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSym(MiniJavaParser.AssignSymContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MiniJavaParser#stmtBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MiniJavaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setIndexOf}
	 * labeled alternative in {@link MiniJavaParser#stmtBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetIndexOf(MiniJavaParser.SetIndexOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExp}
	 * labeled alternative in {@link MiniJavaParser#stmtBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExp(MiniJavaParser.StmtExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link MiniJavaParser#stmtBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(MiniJavaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MiniJavaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(MiniJavaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(MiniJavaParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code systemCall}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemCall(MiniJavaParser.SystemCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalStmt}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalStmt(MiniJavaParser.NormalStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(MiniJavaParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(MiniJavaParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getProperty}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetProperty(MiniJavaParser.GetPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicBinaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicBinaryOp(MiniJavaParser.LogicBinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExp(MiniJavaParser.NewExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code this}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(MiniJavaParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(MiniJavaParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getMethod}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetMethod(MiniJavaParser.GetMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MiniJavaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dummy}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummy(MiniJavaParser.DummyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getLength}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetLength(MiniJavaParser.GetLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArr}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArr(MiniJavaParser.NewArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MiniJavaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOp(MiniJavaParser.TernaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexOf}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOf(MiniJavaParser.IndexOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(MiniJavaParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(MiniJavaParser.IntLiteralContext ctx);
}