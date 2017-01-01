import java.lang.*;
import java.util.*;
import miniJava.*;
import org.antlr.v4.runtime.*;

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
            CliUtil.err(ctx, "redefine class " + currentClassName, "Syntax");
            hasSyntaxError = true;
            return true;
        }
        return false;
    }

    private boolean hasUnknown(ParserRuleContext ctx, Token isUnknown) {
        if(isUnknown != null) {
            hasSyntaxError = true;
            CliUtil.err(ctx, "unknown symbol detected");
            return true;
        }
        return false;
    }

    @Override public MiniJavaVar visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        //if(hasUnknown(ctx, ctx.unknown)) return MiniJavaVar.makeError();

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
        varCtx.declareVar(ctx.args.getText(), MiniJavaVar.makeVoid());
        visit(ctx.stmtBlock());
        varCtx.exitBlock();

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();
        if(varCtx.isRedefinedVar(varName)) {
            CliUtil.err(ctx, String.format("Redefine variable '%s' of type '%s'", varName, varType), "Syntax");
            hasSyntaxError = true;
            return MiniJavaVar.makeError();
        }
        if(varCtx.isTopLevel()) {
            currentClass.property.put(varName, varType);
        }
        varCtx.declareVar(varName, MiniJavaVar.makeVoid());

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
            return CliUtil.err(ctx, "overloaded methods are not supported yet.", "Syntax");
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
            varCtx.declareVar(varName, MiniJavaVar.makeVoid());
        }
        currentClass.methodArgs.put(methodName, methodArgs);
        currentClass.methodArgsName.put(methodName, methodArgsName);

        MiniJavaVar res = visitChildren(ctx);

        varCtx.exitBlock();

        return res;
    }

    // checking syntax
    @Override public MiniJavaVar visitAssignToExp(MiniJavaParser.AssignToExpContext ctx) {
        hasSyntaxError = true;
        return CliUtil.err(ctx.prop, "Assignment to an expression is not supported. Please omit 'this.' when changing property.", "Syntax");
    }

    @Override public MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx) {
        if(ctx.lpar == null) {
            CliUtil.warn(ctx, "Missing '(' and ')' when calling 'println'");
        }
        return MiniJavaVar.makeVoid();
    }
}
