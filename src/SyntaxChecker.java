import java.lang.*;
import java.util.HashMap;

import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class SyntaxChecker {

    private static MiniJavaVar mockVar(MiniJavaVar original) {
        if(original.type.equals("boolean")) return MiniJavaVar.makeBool(true);
        if(original.type.equals("int")) return MiniJavaVar.makeInt(1);
        return original;
    }

    public static boolean println(MiniJavaParser.SystemCallContext ctx, MiniJavaVar v) {
        return Eval.visitSystemCall(ctx, v, true).isError();
    }

    public static MiniJavaVar binaryOp(MiniJavaParser.BinaryOpContext ctx, MiniJavaVar first, MiniJavaVar second) {
        first = mockVar(first);
        second = mockVar(second);
        return Eval.binaryOp(ctx, first, second);
    }
}
