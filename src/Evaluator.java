import java.lang.*;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */

public class Evaluator extends TypeChecker {

    private MiniJavaVar returnVal = null;
    private MiniJavaVar thisVal = null;

    @Override public MiniJavaVar visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        return super.visitClassDeclaration(ctx);
    }

    @Override public MiniJavaVar visitMainClass(MiniJavaParser.MainClassContext ctx) {
        return super.visitMainClass(ctx);
    }

    @Override public MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();
        MiniJavaVar v = MiniJavaVar.makeInit(varType);
        if(ctx.exp() != null) {
            v = visit(ctx.exp());
            if(v.isError()) return MiniJavaVar.makeError();
            //if(!matchType(ctx, v.type, varType)) return MiniJavaVar.makeError();
            assert (matchType(ctx, v.type, varType));
        }
        varCtx.assignVar(varName, v);
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitStmtBlock(MiniJavaParser.StmtBlockContext ctx) {
        varCtx.enterBlock();
        for(MiniJavaParser.StmtContext stmt: ctx.stmt()) {
            if(visit(stmt).isError()) return MiniJavaVar.makeError();
            if(returnVal != null) {
                varCtx.exitBlock();
                return MiniJavaVar.makeVoid();
            }
        }
        varCtx.exitBlock();
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitBlock(MiniJavaParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override public MiniJavaVar visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        currentMethodName = ctx.methodName.getText();
        MiniJavaVar res = visit(ctx.stmtBlock());
        currentMethodName = null;
        return res;
    }

    @Override public MiniJavaVar visitIf(MiniJavaParser.IfContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return MiniJavaVar.makeError();
        else assert (matchType(ctx, v.type, "boolean"));

        MiniJavaVar stmt = MiniJavaVar.makeVoid();
        if((boolean)v.value) {
            stmt = visit(ctx.t_stmt);
        } else {
            if(ctx.f_stmt != null)
                stmt = visit(ctx.f_stmt);
        }
        return stmt;
    }

    @Override public MiniJavaVar visitWhile(MiniJavaParser.WhileContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) {
            return MiniJavaVar.makeError();
        }
        assert (matchType(ctx, v.type, "boolean"));

        while((boolean)v.value) {
            if(visit(ctx.stmt()).isError()) return MiniJavaVar.makeError();
        }
        return  MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitReturn(MiniJavaParser.ReturnContext ctx) {
        returnVal = super.visitReturn(ctx);
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitAssign(MiniJavaParser.AssignContext ctx) {
        String assignSym = ctx.assignSym().getText();
        String id = ctx.ID().getText();

        MiniJavaVar findRes = idFoundOrNot(ctx, varCtx, id);
        //if(findRes.isError()) return findRes;
        assert (!findRes.isError());

        if(!assignSym.equals("=")) {
            if(findRes.value == null) {
                return CliUtil.err(ctx, String.format("Variable '%s' used before being initialized.\n", id));
            }
        }

        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;

        assert (checkAssignOprType(ctx, v.type, findRes.type));
        if(assignSym.equals("=")) return varCtx.assignVar(id, v);

        assert (checkAssignOprType(ctx, findRes.type, "int"));// return MiniJavaVar.makeError();
        if(assignSym.equals("*=")) { findRes.value = (int)findRes.value * (int)v.value; return findRes; }
        if(assignSym.equals("/=")) { findRes.value = (int)findRes.value / (int)v.value; return findRes; }
        if(assignSym.equals("%=")) { findRes.value = (int)findRes.value % (int)v.value; return findRes; }
        if(assignSym.equals("&=")) { findRes.value = (int)findRes.value & (int)v.value; return findRes; }
        if(assignSym.equals("|=")) { findRes.value = (int)findRes.value | (int)v.value; return findRes; }
        if(assignSym.equals("^=")) { findRes.value = (int)findRes.value ^ (int)v.value; return findRes; }
        if(assignSym.equals("+=")) { findRes.value = (int)findRes.value + (int)v.value; return findRes; }
        if(assignSym.equals("-=")) { findRes.value = (int)findRes.value - (int)v.value; return findRes; }
        if(assignSym.equals("<<=")) { findRes.value = (int)findRes.value << (int)v.value; return findRes; }
        if(assignSym.equals(">>>=")) { findRes.value = (int)findRes.value >>> (int)v.value; return findRes; }
        if(assignSym.equals(">>=")) { findRes.value = (int)findRes.value >> (int)v.value; return findRes; }

        assert (false);
        //System.err.printf("[ERR] Assignment of '%s' is not implemented yet.\n", assignSym);
        return MiniJavaVar.makeError();
    }

    @Override public MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        return systemCall(ctx, v, false);
    }

    private MiniJavaVar outOfRangeError(ParserRuleContext ctx) {
        hasSyntaxError = true;
        return CliUtil.err(ctx, "index out of range.");
    }

    @Override public MiniJavaVar visitSetIndexOf(MiniJavaParser.SetIndexOfContext ctx) {
        String id = ctx.ID().getText();

        MiniJavaVar arr = idFoundOrNot(ctx, varCtx, id);
        assert (!arr.isError());// return findRes;
        assert (isArrayType(ctx, arr.type));// return MiniJavaVar.makeError();

        MiniJavaVar idx = visit(ctx.idx);
        if(idx.isError()) return idx;
        assert (matchType(ctx, idx.type, "int"));// return MiniJavaVar.makeError();

        MiniJavaVar v = visit(ctx.v);
        if(v.isError()) return v;
        assert (matchType(ctx, v.type, getElementType(arr.type)));//return MiniJavaVar.makeError();

        Vector<MiniJavaVar> vec = (Vector<MiniJavaVar>) arr.value;
        if((int)idx.value >= vec.size()) return outOfRangeError(ctx);

        vec.set((int)idx.value, v);

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitBoolLiteral(MiniJavaParser.BoolLiteralContext ctx) {
        return MiniJavaVar.makeBool(ctx.getText().equals("true"));
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
        return CliUtil.err(ctx, "Unknown type of int literal.");
    }

    @Override public MiniJavaVar visitThis(MiniJavaParser.ThisContext ctx) {
        if(thisVal == null) {
            return CliUtil.err(ctx, "[Runtime] Access 'this' in mainClass is not supported yet.");
        }
        return thisVal;
    }

    @Override public MiniJavaVar visitNewArr(MiniJavaParser.NewArrContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;
        assert (matchType(ctx, v.type, "int"));// return MiniJavaVar.makeError();

        MiniJavaVar res = MiniJavaVar.makeInit(ctx.basicType().getText() + "[]");
        Vector<MiniJavaVar> vec = new Vector<>();
        for(int i=0; i<(int)v.value; i++) {
            vec.add(MiniJavaVar.makeInit(ctx.basicType().getText()));
        }
        res.value = vec;

        return res;
    }

    private MiniJavaVar addPropertyOfClass(ParserRuleContext ctx, MiniJavaClass klass, MiniJavaInstance inst) {
        if(klass.parentClassName != null) {
            MiniJavaClass parentClass = classFoundOrNot(ctx, klass.parentClassName);
            if(parentClass == null) return MiniJavaVar.makeError();
            addPropertyOfClass(ctx, parentClass, inst);
        }
        for(String propName: klass.property.keySet()) {
            inst.varCtx.vars.put(propName, MiniJavaVar.makeInit(klass.property.get(propName)));
        }
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitNewExp(MiniJavaParser.NewExpContext ctx) {
        String className = ctx.ID().getText();
        MiniJavaClass res = classFoundOrNot(ctx, className);
        if(res == null) return MiniJavaVar.makeError();

        MiniJavaVar v = MiniJavaVar.makeInit(className);

        MiniJavaInstance inst = new MiniJavaInstance();
        inst.klass = res;
        if(addPropertyOfClass(ctx, res, inst) != null) return MiniJavaVar.makeError();

        v.value = inst;
        return v;
    }

    @Override public MiniJavaVar visitId(MiniJavaParser.IdContext ctx) {
        return super.visitId(ctx);
    }

    @Override public MiniJavaVar visitIndexOf(MiniJavaParser.IndexOfContext ctx) {
        MiniJavaVar arr = visit(ctx.id);
        if(arr.isError()) return arr;
        assert (isArrayType(ctx, arr.type));// return MiniJavaVar.makeError();

        MiniJavaVar idx = visit(ctx.idx);
        if(idx.isError()) return idx;
        assert (matchType(ctx, idx.type, "int"));// return MiniJavaVar.makeError();

        Vector<MiniJavaVar> vec = (Vector<MiniJavaVar>) arr.value;
        if((int)idx.value >= vec.size()) return outOfRangeError(ctx);

        return vec.get((int)idx.value);
    }

    @Override public MiniJavaVar visitGetLength(MiniJavaParser.GetLengthContext ctx) {
        MiniJavaVar arr = visit(ctx.id);
        if(arr.isError()) return arr;
        assert (isArrayType(ctx, arr.type));// return MiniJavaVar.makeError();

        Vector<MiniJavaVar> vec = (Vector<MiniJavaVar>) arr.value;

        return MiniJavaVar.makeInt(vec.size());
    }

    @Override public MiniJavaVar visitGetMethod(MiniJavaParser.GetMethodContext ctx) {
        MiniJavaVar id = visit(ctx.id);
        if(id.isError()) return id;

        String methodName = ctx.ID().getText();
        MiniJavaClass klass;

        if(id.type.equals("0this")) {
            if(currentClass == null) {
                // is null when in main class
                hasSyntaxError = true;
                return CliUtil.err(ctx, "calling 'this' in mainClass is not supported yet.");
            }
            klass = currentClass;
        } else {
            klass = classFoundOrNot(ctx, id.type);
            if(klass == null) return MiniJavaVar.makeError();
        }

        // now klass must be not null
        // TODO: find in parent class
        MiniJavaParser.MethodDeclarationContext method = methodFoundOrNot(ctx, klass, methodName);
        if(method == null)
            return MiniJavaVar.makeError();

        Vector<String> args = klass.methodArgs.get(methodName);
        assert (args != null);
        Vector<String> argsName = klass.methodArgsName.get(methodName);
        assert (argsName != null);

        String permission = klass.methodPermission.get(methodName);
        assert (permission != null);

        if(permission.equals("private")) {
            if(!id.type.equals("0this") && !currentClassName.equals(id.type)) {
                assert (false);
                /*hasSyntaxError = true;
                return CliUtil.err(ctx, String.format("Cannot access private method '%s.%s'.", id.type, methodName));*/
            }
        }

        List<MiniJavaParser.ExpContext> sendingArgs = ctx.exp();
        int n = argsName.size();
        if(sendingArgs.size()-1 != n) {
            assert (false);
            /*hasSyntaxError = true;
            return CliUtil.err(ctx, String.format("Number of args(%d) for calling method '%s.%s' should be %d.",
                    sendingArgs.size()-1, id.type, methodName, n));*/
        }

        Vector<MiniJavaVar> calculatedArgs = new Vector<>();
        int i = 0;
        for(MiniJavaParser.ExpContext exp: sendingArgs) {
            if(i == 0) {
                i += 1;
                continue;
            }
            MiniJavaVar arg = visit(exp);
            if(arg.isError()) return arg;
            assert (matchType(exp, arg.type, args.get(i-1)));
            calculatedArgs.add(arg);
            i += 1;
        }

        MiniJavaVarCtxManager savedCtx = varCtx;

        varCtx = new MiniJavaVarCtxManager();
        assert (id.value instanceof MiniJavaInstance);
        varCtx.createInstanceCtx((MiniJavaInstance)id.value);
        varCtx.enterBlock();
        for(i = 0; i < n; i++) {
            varCtx.assignVar(argsName.get(i), calculatedArgs.get(i));
        }
        MiniJavaVar ret = visit(method);
        varCtx.exitBlock();

        MiniJavaVar res = returnVal;
        returnVal = null;
        varCtx = savedCtx;

        if(ret.isError()) return MiniJavaVar.makeError();

        if(res == null) res = MiniJavaVar.makeVoid();
        assert (res.type.equals(method.returnType.getText()));
        return res;
    }

    @Override public MiniJavaVar visitUnaryOp(MiniJavaParser.UnaryOpContext ctx) {
        MiniJavaVar res = visit(ctx.first);
        return unaryOp(ctx, res);
    }

    @Override public MiniJavaVar visitBinaryOp(MiniJavaParser.BinaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        MiniJavaVar second = visit(ctx.second);
        return binaryOp(ctx, first, second);
    }

    @Override public MiniJavaVar visitTernaryOp(MiniJavaParser.TernaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        MiniJavaVar second = visit(ctx.second);
        MiniJavaVar third = visit(ctx.third);
        return ternaryOp(ctx, first, second, third);
    }

}