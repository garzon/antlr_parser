// Generated from D:/ÎÄµµ/ÎÒÔÚFDU/MiniJavaCompilerProject/src\MiniJava.g4 by ANTLR 4.6
package science.garzon.antlr;
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
	 * Enter a parse tree produced by {@link MiniJavaParser#main_class}.
	 * @param ctx the parse tree
	 */
	void enterMain_class(MiniJavaParser.Main_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#main_class}.
	 * @param ctx the parse tree
	 */
	void exitMain_class(MiniJavaParser.Main_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(MiniJavaParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(MiniJavaParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(MiniJavaParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(MiniJavaParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(MiniJavaParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(MiniJavaParser.Method_declarationContext ctx);
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
}