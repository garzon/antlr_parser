import java.lang.*;
import java.util.*;
import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class SymbolCollector extends MiniJavaBaseVisitor<MiniJavaVar> {
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
        currentClass.name = currentClassName;

        if(checkRedefinedClass(ctx)) return MiniJavaVar.makeError();

        if(ctx.parentName != null)
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

        if(checkRedefinedClass(ctx)) return MiniJavaVar.makeError();

        currentClass.parentClassName = null;
        currentClass.ctx = null;

        varCtx.enterBlock();
        varCtx.declareVar(ctx.args.getText(), MiniJavaVar.makeInitVar("String[]"));
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
            return MiniJavaVar.makeError();
        }
        if(varCtx.isTopLevel()) {
            currentClass.property.put(varName, varType);
        }
        varCtx.declareVar(varName, MiniJavaVar.makeInit(varType));

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

        if(currentClass.methods.get(methodName) != null) {
            hasSyntaxError = true;
            return CliUtil.err(ctx, "overloaded methods are not supported yet.");
        }
        currentClass.methods.put(methodName, ctx);
        currentClass.methodPermission.put(methodName, permission);

        varCtx.enterBlock();

        Vector<String> methodArgs = new Vector<>();
        Vector<String> methodArgsName = new Vector<>();
        for(MiniJavaParser.ArgPairContext arg: ctx.argPair()) {
            String varName, varType;
            varName = arg.ID().getText();
            varType = arg.type().getText();
            methodArgsName.add(varName);
            methodArgs.add(varType);
            varCtx.declareVar(varName, MiniJavaVar.makeInit(varType));
        }
        currentClass.methodArgs.put(methodName, methodArgs);
        currentClass.methodArgsName.put(methodName, methodArgsName);

        MiniJavaVar res = visitChildren(ctx);

        varCtx.exitBlock();

        return res;
    }

}
