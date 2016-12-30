import java.lang.*;
import java.util.*;
import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class MiniJavaSymbolCollector extends MiniJavaBaseListener {
    public HashMap<String, MiniJavaClass> classes;

    public String currentClassName;


    @Override public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentClassName = ctx.ID()
    }

    @Override public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {

    }
}
