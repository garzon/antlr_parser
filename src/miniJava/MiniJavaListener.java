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
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar(MiniJavaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar(MiniJavaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(MiniJavaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(MiniJavaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code systemCall}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSystemCall(MiniJavaParser.SystemCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code systemCall}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSystemCall(MiniJavaParser.SystemCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn(MiniJavaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn(MiniJavaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MiniJavaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MiniJavaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setIndexOf}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSetIndexOf(MiniJavaParser.SetIndexOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setIndexOf}
	 * labeled alternative in {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSetIndexOf(MiniJavaParser.SetIndexOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dummy}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDummy(MiniJavaParser.DummyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dummy}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDummy(MiniJavaParser.DummyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(MiniJavaParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(MiniJavaParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(MiniJavaParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(MiniJavaParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code this}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterThis(MiniJavaParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code this}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitThis(MiniJavaParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getLength}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGetLength(MiniJavaParser.GetLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getLength}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGetLength(MiniJavaParser.GetLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(MiniJavaParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(MiniJavaParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterId(MiniJavaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitId(MiniJavaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newIntArr}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArr(MiniJavaParser.NewIntArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newIntArr}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArr(MiniJavaParser.NewIntArrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getMethod}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGetMethod(MiniJavaParser.GetMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getMethod}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGetMethod(MiniJavaParser.GetMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOp(MiniJavaParser.TernaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOp}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOp(MiniJavaParser.TernaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexOf}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIndexOf(MiniJavaParser.IndexOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexOf}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIndexOf(MiniJavaParser.IndexOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiniJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link MiniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiniJavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(MiniJavaParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(MiniJavaParser.BoolLiteralContext ctx);
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