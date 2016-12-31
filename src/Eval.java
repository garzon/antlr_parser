/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.lang.*;

import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class Eval {

    public static MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx, MiniJavaVarCtxManager varCtx) {
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();
        varCtx.assignVar(varName, MiniJavaVar.makeInit(varType));
        return MiniJavaVar.makeVoid();
    }

    public static MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx, MiniJavaVar a, boolean doNotPrint) {
        if(a.isError()) return a;
        if(a.type.equals("int")) {
            if(!doNotPrint) System.out.println(a.value);
            return a;
        }
        if(a.type.equals("boolean")) {
            if(!doNotPrint) System.out.println(a.value != 0);
            return a;
        }
        if(a.type.equals("int[]")) {
            if(!doNotPrint) System.out.println("println: int[] is not supported yet.");
            return a;
        }
        CliUtil.err(ctx, String.format("System.out.println: type '%s' is not supported.", a.type));
        return MiniJavaVar.makeError();
    }

    public static MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx, MiniJavaVar a) {
        return visitSystemCall(ctx, a, false);
    }


}
