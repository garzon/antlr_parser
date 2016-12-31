import java.lang.*;
import java.util.HashMap;

import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class SyntaxChecker {

    public static String getElementType(String arrType) {
        assert (arrType.endsWith("[]"));
        return arrType.substring(0, arrType.length() - 2);
    }

    public static MiniJavaVar mockVar(MiniJavaVar original) {
        if(original.type.equals("boolean")) return MiniJavaVar.makeBool(true);
        if(original.type.equals("int")) return MiniJavaVar.makeInt(1);
        return original;
    }

    public static boolean println(MiniJavaParser.SystemCallContext ctx, MiniJavaVar v) {
        return Eval.visitSystemCall(ctx, v, true).isError();
    }

    public static MiniJavaParser.MethodDeclarationContext getMethodContext(HashMap<String, MiniJavaClass> classes, String className, String methodName) {
        MiniJavaClass foundClass = classes.get(className);
        assert (foundClass != null);
        MiniJavaParser.MethodDeclarationContext res = foundClass.methods.get(methodName);
        return res;
    }
}
