/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.lang.*;

import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class Eval {
    private static boolean checkOprType(MiniJavaParser.BinaryOpContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            CliUtil.err(ctx, String.format("Op '%s': operand type '%s' not match '%s'", ctx.op.getText(), type1, type2));
            return false;
        }
        return true;
    }

    private static MiniJavaVar opNotImplemented(ParserRuleContext ctx, String op) {
        CliUtil.err(ctx, String.format("Op %s is not implemented yet", op));
        return MiniJavaVar.makeRuntimeError();
    }

    private static boolean divBy0(MiniJavaParser.BinaryOpContext ctx, int vNotZero) {
        if(vNotZero == 0) {
            CliUtil.err(ctx, String.format("Op '%s': divided by zero", ctx.op.getText()));
            return true;
        }
        return false;
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
        return MiniJavaVar.makeRuntimeError();
    }

    public static MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx, MiniJavaVar a) {
        return visitSystemCall(ctx, a, false);
    }

    public static MiniJavaVar binaryOp(MiniJavaParser.BinaryOpContext ctx, MiniJavaVar first, MiniJavaVar second) {
        if(first.isError()) return first;
        if(second.isError()) return second;
        String opSym = ctx.op.getText();

        if(!checkOprType(ctx, first.type, second.type)) return MiniJavaVar.makeRuntimeError();

        if(opSym.equals("==")) {
            if(first.type.equals("int")) {
                return MiniJavaVar.makeBool((int)first.value == (int)second.value);
            }
            if(first.type.equals("boolean")) {
                return MiniJavaVar.makeBool((boolean)first.value == (boolean)second.value);
            }
            return opNotImplemented(ctx, String.format("'%s' for type '%s'", opSym, first.type));
        }
        if(opSym.equals("!=")) {
            if(first.type.equals("int")) {
                return MiniJavaVar.makeBool((int)first.value != (int)second.value);
            }
            if(first.type.equals("boolean")) {
                return MiniJavaVar.makeBool((boolean)first.value != (boolean)second.value);
            }
            return opNotImplemented(ctx, String.format("'%s' for type '%s'", opSym, first.type));
        }

        if(opSym.equals("||")) {
            if(!checkOprType(ctx, first.type, "boolean")) return MiniJavaVar.makeRuntimeError();
            return MiniJavaVar.makeBool((boolean)first.value || (boolean)second.value);
        }
        if(opSym.equals("&&")) {
            if(!checkOprType(ctx, first.type, "boolean")) return MiniJavaVar.makeRuntimeError();
            return MiniJavaVar.makeBool((boolean)first.value && (boolean)second.value);
        }

        if(!checkOprType(ctx, first.type, "int")) return MiniJavaVar.makeRuntimeError();

        if(opSym.equals("*"))
            return MiniJavaVar.makeInt((int)first.value * (int)second.value);
        if(opSym.equals("/")) {
            if(divBy0(ctx, (int)second.value)) return MiniJavaVar.makeRuntimeError();
            return MiniJavaVar.makeInt((int) first.value / (int)second.value);
        }
        if(opSym.equals("%")) {
            if(divBy0(ctx, (int)second.value)) return MiniJavaVar.makeRuntimeError();
            return MiniJavaVar.makeInt((int) first.value % (int) second.value);
        }
        if(opSym.equals("+"))
            return MiniJavaVar.makeInt((int)first.value + (int)second.value);
        if(opSym.equals("-"))
            return MiniJavaVar.makeInt((int)first.value - (int)second.value);
        if(opSym.equals("<<"))
            return MiniJavaVar.makeInt((int)first.value << (int)second.value);
        if(opSym.equals(">>>"))
            return MiniJavaVar.makeInt((int)first.value >>> (int)second.value);
        if(opSym.equals(">>"))
            return MiniJavaVar.makeInt((int)first.value >> (int)second.value);
        if(opSym.equals("<"))
            return MiniJavaVar.makeBool((int)first.value < (int)second.value);
        if(opSym.equals("<="))
            return MiniJavaVar.makeBool((int)first.value <= (int)second.value);
        if(opSym.equals(">"))
            return MiniJavaVar.makeBool((int)first.value > (int)second.value);
        if(opSym.equals(">="))
            return MiniJavaVar.makeBool((int)first.value >= (int)second.value);
        if(opSym.equals("^"))
            return MiniJavaVar.makeInt((int)first.value ^ (int)second.value);
        if(opSym.equals("|"))
            return MiniJavaVar.makeInt((int)first.value | (int)second.value);
        if(opSym.equals("&"))
            return MiniJavaVar.makeInt((int)first.value & (int)second.value);

        return opNotImplemented(ctx, opSym);
    }
}
