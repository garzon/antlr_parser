import java.lang.*;
import java.util.*;
import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class MiniJavaSymbolCollector extends MiniJavaBaseListener {
    public boolean hasSyntaxError = false;

    public MiniJavaParser.GoalContext root = null;

    public HashMap<String, MiniJavaClass> classes = new HashMap<>();

    private String currentClassName;
    private MiniJavaClass currentClass;

    @Override public void enterGoal(MiniJavaParser.GoalContext ctx) {
        root = ctx;
    }

    @Override public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentClassName = ctx.className.getText();
        currentClass = new MiniJavaClass();

        if(classes.get(currentClassName) != null) {
            CliUtil.err(ctx, "redefine class " + currentClassName);
            hasSyntaxError = true;
            return;
        }

        currentClass.parentClassName = ctx.parentName.getText();
        currentClass.ctx = ctx;

        classes.put(currentClassName, currentClass);
    }

    @Override public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentClass = null;
        currentClassName = null;
    }
}
