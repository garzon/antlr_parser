import java.lang.*;
import java.util.HashMap;

import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class SyntaxChecker {

    public static boolean isArrayType(ParserRuleContext ctx, String type) {
        if(!type.endsWith("[]")) {
            CliUtil.err(ctx, String.format("Type error: Array expected, got '%s'", type));
            return false;
        }
        return true;
    }

    public static boolean matchType(ParserRuleContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            CliUtil.err(ctx, String.format("Type error: '%s' expected, got '%s'", type2, type1));
            return false;
        }
        return true;
    }

    public static boolean checkOprType(MiniJavaParser.BinaryOpContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            CliUtil.err(ctx, String.format("binaryOp '%s': operand type '%s' not match '%s'", ctx.op.getText(), type1, type2));
            return false;
        }
        return true;
    }

    public static boolean checkUnaryOprType(MiniJavaParser.UnaryOpContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            CliUtil.err(ctx, String.format("unaryOp '%s': unexpected type '%s', '%s' expected", ctx.op.getText(), ctx.getText(), type1, type2));
            return false;
        }
        return true;
    }

    public static boolean checkAssignOprType(MiniJavaParser.AssignContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            CliUtil.err(ctx, String.format("Assignment '%s': unexpected type '%s', '%s' expected", ctx.assignSym().getText(), type1, type2));
            return false;
        }
        return true;
    }

    public static MiniJavaVar opNotImplemented(ParserRuleContext ctx, String op) {
        CliUtil.err(ctx, String.format("Op %s is not implemented yet", op));
        return MiniJavaVar.makeRuntimeError();
    }

    private static MiniJavaVar mockVar(MiniJavaVar original) {
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

    public static MiniJavaVar unaryOp(MiniJavaParser.UnaryOpContext ctx, MiniJavaVar first) {
        first = mockVar(first);
        return Eval.unaryOp(ctx, first);
    }

    public static MiniJavaVar binaryOp(MiniJavaParser.BinaryOpContext ctx, MiniJavaVar first, MiniJavaVar second) {
        first = mockVar(first);
        second = mockVar(second);
        return Eval.binaryOp(ctx, first, second);
    }

    public static MiniJavaVar ternaryOp(MiniJavaParser.TernaryOpContext ctx, MiniJavaVar first, MiniJavaVar second, MiniJavaVar third) {
        first = mockVar(first);
        second = mockVar(second);
        third = mockVar(third);
        return Eval.ternaryOp(ctx, first, second, third);
    }
}
