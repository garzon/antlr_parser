import java.lang.*;
import java.util.*;
import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class MiniJavaSymbolCollector extends MiniJavaBaseVisitor<MiniJavaVar> {
    public boolean hasSyntaxError = false;
    public HashMap<String, MiniJavaClass> classes = new HashMap<>();

    private String currentClassName;
    private MiniJavaClass currentClass;
    private MiniJavaVarCtxManager varCtx = new MiniJavaVarCtxManager();

    private boolean checkRedefinedClass(ParserRuleContext ctx) {
        if(classes.get(currentClassName) != null) {
            CliUtil.err(ctx, "redefine class " + currentClassName);
            hasSyntaxError = true;
            return true;
        }
        return false;
    }

    @Override public MiniJavaVar visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentClassName = ctx.className.getText();
        currentClass = new MiniJavaClass();

        if(checkRedefinedClass(ctx)) return MiniJavaVar.makeRuntimeError();

        currentClass.parentClassName = ctx.parentName.getText();
        currentClass.ctx = ctx;

        classes.put(currentClassName, currentClass);
        varCtx.enterBlock();
        visitChildren(ctx);
        varCtx.exitBlock();
        currentClass = null;
        currentClassName = null;

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentClassName = ctx.className.getText();
        currentClass = new MiniJavaClass();

        if(checkRedefinedClass(ctx)) return MiniJavaVar.makeRuntimeError();

        currentClass.parentClassName = null;
        currentClass.ctx = null;

        varCtx.enterBlock();
        varCtx.assignVar(ctx.args.getText(), new MiniJavaVar("String[]", null));
        visit(ctx.stmtBlock());
        varCtx.exitBlock();

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();
        if(varCtx.isRedefinedVar(varName)) {
            CliUtil.err(ctx, String.format("Redefine variable '%s' of type '%s'", varName, varType));
            hasSyntaxError = true;
            return MiniJavaVar.makeRuntimeError();
        }
        if(varCtx.isTopLevel()) {
            currentClass.property.put(varName, varType);
        }
        varCtx.assignVar(varName, MiniJavaVar.makeInit(varType));

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitStmtBlock(MiniJavaParser.StmtBlockContext ctx) {
        varCtx.enterBlock();
        MiniJavaVar res = visitChildren(ctx);
        varCtx.exitBlock();
        return res;
    }

    @Override public MiniJavaVar visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        String methodName = ctx.methodName.getText();
        String permission = ctx.permissionDesc().getText();

        if(permission == null) permission = "public";
        if(permission.equals("private")) {
            hasSyntaxError = true;
            return CliUtil.err(ctx, "private methods are not supported yet.");
        }

        currentClass.methods.put(methodName, ctx);
        currentClass.methodPermission.put(methodName, permission);

        HashMap<String, String> methodArgs = new HashMap<>();
        for(MiniJavaParser.ArgPairContext arg: ctx.argPair()) {
            methodArgs.put(arg.ID().getText(), arg.type().getText());
        }
        currentClass.methodArgs.put(methodName, methodArgs);

        return visitChildren(ctx);
    }

}
