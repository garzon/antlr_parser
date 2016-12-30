import java.lang.*;
import java.util.*;
import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class MiniJavaSymbolCollector extends MiniJavaBaseVisitor<MiniJavaVar> {
    public boolean hasSyntaxError = false;
    public MiniJavaParser.GoalContext root = null;
    public HashMap<String, MiniJavaClass> classes = new HashMap<>();

    private String currentClassName;
    private MiniJavaClass currentClass;
    private MiniJavaVarCtxManager varCtx = new MiniJavaVarCtxManager();

    @Override public MiniJavaVar visitGoal(MiniJavaParser.GoalContext ctx) {
        root = ctx;
        return visitChildren(ctx);
    }

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
        visitChildren(ctx);
        varCtx.exitBlock();

        return MiniJavaVar.makeVoid();
    }

}
