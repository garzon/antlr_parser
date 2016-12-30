import java.lang.*;
import miniJava.*;
import com.sun.istack.internal.NotNull;

/**
 * Created by ougar_000 on 2016/12/30.
 */

public class MyMiniJavaVisitor extends MiniJavaBaseVisitor<Object> {
    @Override
    public Object visitStmt(@NotNull MiniJavaParser.StmtContext ctx) {
        if(ctx.stmt() != null) {
            System.out.print(ctx.stmt());
        }
        return 0;
    }

    @Override public Object visitGoal(MiniJavaParser.GoalContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMainClass(MiniJavaParser.MainClassContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPermissionDesc(MiniJavaParser.PermissionDescContext ctx) { return visitChildren(ctx); }

    @Override public Object visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDeclaration(MiniJavaParser.DeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitType(MiniJavaParser.TypeContext ctx) { return visitChildren(ctx); }

    @Override public Object visitStmtBlock(MiniJavaParser.StmtBlockContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAssignSym(MiniJavaParser.AssignSymContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExp(MiniJavaParser.ExpContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitIntLiteral(MiniJavaParser.IntLiteralContext ctx) {
        return visitChildren(ctx);
    }

}