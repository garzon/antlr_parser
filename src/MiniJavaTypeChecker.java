import miniJava.MiniJavaBaseVisitor;
import miniJava.MiniJavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class MiniJavaTypeChecker extends MiniJavaBaseVisitor<MiniJavaVar> {
    public boolean hasSyntaxError = false;
    public HashMap<String, MiniJavaClass> classes = new HashMap<>();

    private String currentClassName;
    private MiniJavaClass currentClass;
    private MiniJavaVarCtxManager varCtx = new MiniJavaVarCtxManager();

    private MiniJavaClass findDefinedClass(ParserRuleContext ctx, String className) {
        MiniJavaClass res = classes.get(className);
        if(res == null) {
            CliUtil.err(ctx, "undefined class " + className);
            hasSyntaxError = true;
        }
        return res;
    }

    @Override public MiniJavaVar visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentClassName = ctx.className.getText();
        currentClass = findDefinedClass(ctx, currentClassName);

        varCtx.enterBlock();
        visitChildren(ctx);
        varCtx.exitBlock();
        currentClass = null;
        currentClassName = null;

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentClassName = ctx.className.getText();
        currentClass = null;

        varCtx.enterBlock();
        varCtx.assignVar(ctx.args.getText(), new MiniJavaVar("String[]", null));
        visit(ctx.stmtBlock());
        varCtx.exitBlock();

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();

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
        varCtx.enterBlock();

        for(MiniJavaParser.ArgPairContext arg: ctx.argPair()) {
            String varName, varType;
            varName = arg.ID().getText();
            varType = arg.type().getText();
            varCtx.assignVar(varName, MiniJavaVar.makeInit(varType));
        }

        MiniJavaVar res = visitChildren(ctx);

        varCtx.exitBlock();

        return res;
    }

    @Override public MiniJavaVar visitIf(MiniJavaParser.IfContext ctx) {
        return visitChildren(ctx);
    }

    @Override

}
