import java.lang.*;
import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */

public class MyMiniJavaVisitor extends MiniJavaBaseVisitor<MiniJavaVar> {
    MiniJavaVarCtxManager varCtx = new MiniJavaVarCtxManager();

    @Override public MiniJavaVar visitGoal(MiniJavaParser.GoalContext ctx) {
        varCtx.enterBlock();
        return visitChildren(ctx);
    }

    @Override public MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        varCtx.assignVar(ctx.ID().getText(), MiniJavaVar.makeInit(ctx.type().getText()));
        return MiniJavaVar.makeVoid();
    }

    private boolean checkAssignOprType(MiniJavaParser.AssignContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            System.err.printf("[ERR] Assignment '%s' of '%s': unexpected type '%s', '%s' expected", ctx.assignSym().getText(), ctx.getText(), type1, type2);
            return false;
        }
        return true;
    }

    private MiniJavaVar idFoundOrNot(ParserRuleContext ctx, String id) {
        MiniJavaVar findRes = varCtx.findVar(id);
        if(findRes == null) {
            System.err.printf("[ERR] Identifier '%s' in '%s' not found.\n", id, ctx.getText());
            return null;
        }
        return findRes;
    }

    @Override public MiniJavaVar visitId(MiniJavaParser.IdContext ctx) {
        String id = ctx.ID().getText();
        MiniJavaVar findRes = idFoundOrNot(ctx, id);
        if(findRes == null) return MiniJavaVar.makeRuntimeError();
        return findRes;
    }

    @Override public MiniJavaVar visitAssign(MiniJavaParser.AssignContext ctx) {
        String assignSym = ctx.assignSym().getText();
        String id = ctx.ID().getText();

        MiniJavaVar findRes = idFoundOrNot(ctx, id);
        if(findRes == null) return MiniJavaVar.makeRuntimeError();

        if(!assignSym.equals("=")) {
            if(findRes.value == null) {
                System.err.printf("[ERR] Variable '%s' used in '%s' before being initialized.\n", id, ctx.getText());
                return MiniJavaVar.makeRuntimeError();
            }
        }

        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;
        if(!checkAssignOprType(ctx, v.type, findRes.type)) return MiniJavaVar.makeRuntimeError();

        if(assignSym.equals("=")) return varCtx.assignVar(id, v);

        System.err.printf("[ERR] Assignment of '%s' is not implemented yet.\n", assignSym);
        return MiniJavaVar.makeRuntimeError();
    }

    @Override public MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx) {
        MiniJavaVar a = visit(ctx.exp());
        if(a.isError()) return a;
        if(a.type.equals("int"))
            System.out.println(a.value);
        if(a.type.equals("boolean"))
            System.out.println(a.value != 0);
        if(a.type.equals("int[]")) {
            System.out.println("println: int[] is not supported yet.");
        }
        return a;
    }

    private boolean checkUnaryOprType(MiniJavaParser.UnaryOpContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            System.err.printf("[ERR] unaryOp '%s' of '%s': unexpected type '%s', '%s' expected", ctx.op.getText(), ctx.getText(), type1, type2);
            return false;
        }
        return true;
    }

    @Override public MiniJavaVar visitUnaryOp(MiniJavaParser.UnaryOpContext ctx) {
        MiniJavaVar res = visit(ctx.first);
        if(res.isError()) return res;
        String type = res.type;
        switch (ctx.op.getText().charAt(0)) {
            case '!':
                if(!checkUnaryOprType(ctx, type, "boolean")) return MiniJavaVar.makeRuntimeError();
                res.value = !(boolean)res.value;
                break;
            case '+':
                if(!checkUnaryOprType(ctx, type, "int")) return MiniJavaVar.makeRuntimeError();
                break;
            case '-':
                if(!checkUnaryOprType(ctx, type, "int")) return MiniJavaVar.makeRuntimeError();
                res.value = -(int)res.value;
                break;
            case '~':
                if(!checkUnaryOprType(ctx, type, "int")) return MiniJavaVar.makeRuntimeError();
                res.value = ~(int)res.value;
                break;
            default:
                System.err.printf("unaryOp: '%s' is not supported yet.\n", ctx.op.getText());
                return MiniJavaVar.makeRuntimeError();
        }
        return res;
    }

    private boolean checkBinaryOprType(MiniJavaParser.BinaryOpContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            System.err.printf("[ERR] binaryOp '%s' of '%s': type '%s' and '%s' not match", ctx.op.getText(), ctx.getText(), type1, type2);
            return false;
        }
        return true;
    }

    private MiniJavaVar opNotImplemented(MiniJavaParser.BinaryOpContext ctx) {
        System.err.printf("[ERR] binaryOp '%s' of '%s': not implemented yet", ctx.op.getText(), ctx.getText());
        return MiniJavaVar.makeRuntimeError();
    }

    @Override public MiniJavaVar visitBinaryOp(MiniJavaParser.BinaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        MiniJavaVar second = visit(ctx.second);
        if(first.isError()) return first;
        if(second.isError()) return second;
        String opSym = ctx.op.getText();

        if(!checkBinaryOprType(ctx, first.type, second.type)) return MiniJavaVar.makeRuntimeError();

        if(opSym.equals("==")) {
            if(first.type.equals("int")) {
                return MiniJavaVar.makeBool((int)first.value == (int)second.value);
            }
            if(first.type.equals("boolean")) {
                return MiniJavaVar.makeBool((boolean)first.value == (boolean)second.value);
            }
            return opNotImplemented(ctx);
        }
        if(opSym.equals("!=")) {
            if(first.type.equals("int")) {
                return MiniJavaVar.makeBool((int)first.value != (int)second.value);
            }
            if(first.type.equals("boolean")) {
                return MiniJavaVar.makeBool((boolean)first.value != (boolean)second.value);
            }
            return opNotImplemented(ctx);
        }

        if(opSym.equals("||")) {
            if(!checkBinaryOprType(ctx, first.type, "boolean")) return MiniJavaVar.makeRuntimeError();
            return MiniJavaVar.makeBool((boolean)first.value || (boolean)second.value);
        }
        if(opSym.equals("&&")) {
            if(!checkBinaryOprType(ctx, first.type, "boolean")) return MiniJavaVar.makeRuntimeError();
            return MiniJavaVar.makeBool((boolean)first.value || (boolean)second.value);
        }

        if(!checkBinaryOprType(ctx, first.type, "int")) return MiniJavaVar.makeRuntimeError();

        if(opSym.equals("*"))
            return MiniJavaVar.makeInt((int)first.value * (int)second.value);
        if(opSym.equals("/"))
            return MiniJavaVar.makeInt((int)first.value / (int)second.value);
        if(opSym.equals("%"))
            return MiniJavaVar.makeInt((int)first.value % (int)second.value);
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

        return opNotImplemented(ctx);
    }

    @Override public MiniJavaVar visitIntLiteral(MiniJavaParser.IntLiteralContext ctx) {
        if(ctx.INT_BIN() != null) {
            return MiniJavaVar.makeInt(Integer.parseInt(ctx.getText().substring(2), 2));
        }
        if(ctx.INT_DEC() != null) {
            return MiniJavaVar.makeInt(Integer.parseInt(ctx.getText()));
        }
        if(ctx.INT_HEX() != null) {
            return MiniJavaVar.makeInt(Integer.parseInt(ctx.getText().substring(2), 16));
        }
        System.err.println("Unknown type of int literal.");
        return MiniJavaVar.makeRuntimeError();
    }

}