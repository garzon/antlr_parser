import java.lang.*;
import java.util.List;
import java.util.Vector;

import miniJava.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by ougar_000 on 2016/12/30.
 */

public class Evaluator extends TypeChecker {

    private MiniJavaVar returnVal = null;

    @Override public MiniJavaVar visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        assert (false);
        return super.visitClassDeclaration(ctx);
    }

    @Override public MiniJavaVar visitMainClass(MiniJavaParser.MainClassContext ctx) {
        return super.visitMainClass(ctx);
    }

    @Override public MiniJavaVar visitPropertyDeclaration(MiniJavaParser.PropertyDeclarationContext ctx) {
        assert (false);
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        return super.visitVarDeclaration(ctx);
    }

    @Override public MiniJavaVar visitStmtBlock(MiniJavaParser.StmtBlockContext ctx) {
        varCtx.enterBlock();
        for(MiniJavaParser.StmtContext stmt: ctx.stmt()) {
            //System.out.println(stmt.getText());
            // reminder: adding grammar and not implementing checker might cause NullPointerException here
            // since you need to return something like MiniJavaVar.makeVoid() to indicate everything's fine
            if(visit(stmt).isError()) return MiniJavaVar.makeError();
            if(returnVal != null) {
                varCtx.exitBlock();
                return MiniJavaVar.makeVoid();
            }
        }
        varCtx.exitBlock();
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitStmtExp(MiniJavaParser.StmtExpContext ctx) {
        return visit(ctx.exp());
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
        while(true) {
            MiniJavaVar v = visit(ctx.exp());
            if(v.isError()) return v;
            assert (matchType(ctx, v.type, "boolean"));

            if(!(boolean)v.value) break;
            if(visit(ctx.stmt()).isError()) return MiniJavaVar.makeError();
        }
        return  MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitFor(MiniJavaParser.ForContext ctx) {
        varCtx.enterBlock();

        MiniJavaVar st = visit(ctx.start_stmt);
        if(st.isError()) return st;
        MiniJavaVar criteria = visit(ctx.exp());
        if(criteria.isError()) return criteria;
        assert (matchType(ctx, criteria.type, "boolean"));

        while((boolean)criteria.value) {
            MiniJavaVar body = visit(ctx.body);
            if(body.isError()) return body;

            MiniJavaVar stm = visit(ctx.step_stmt);
            if(stm.isError()) return stm;

            criteria = visit(ctx.exp());
            if(criteria.isError()) return criteria;
            assert (matchType(ctx, criteria.type, "boolean"));
        }

        varCtx.exitBlock();
        return MiniJavaVar.makeVoid();
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

        //CliUtil.printCtx(ctx);
        if(!assignSym.equals("=")) {
            if(isUsedBeforeInit(ctx, findRes, id)) return MiniJavaVar.makeError();
        }

        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;
        //if(isUsedBeforeInit(ctx, v, ctx.exp().getText())) return MiniJavaVar.makeError();

        assert (checkAssignOprType(ctx, v.type, findRes.type));
        if(assignSym.equals("=")) {
            //return varCtx.assignVar(id, MiniJavaVar.makeNewObj(findRes.type, v));
            findRes.value = v.value;
            return MiniJavaVar.makeVoid();
        }

        assert (checkAssignOprType(ctx, findRes.type, "int"));// return MiniJavaVar.makeError();
        if(assignSym.equals("*=")) { findRes.value = (int)findRes.value * (int)v.value; return findRes; }
        if(assignSym.equals("/=")) {
            if(divBy0(ctx, v)) return MiniJavaVar.makeError();
            findRes.value = (int)findRes.value / (int)v.value;
            return findRes;
        }
        if(assignSym.equals("%=")) {
            if(divBy0(ctx, v)) return MiniJavaVar.makeError();
            findRes.value = (int)findRes.value % (int)v.value;
            return findRes;
        }
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

    @Override public MiniJavaVar visitNormalStmt(MiniJavaParser.NormalStmtContext ctx) {
        return super.visitNormalStmt(ctx);
    }

    private MiniJavaVar outOfRangeError(ParserRuleContext ctx) {
        hasError = true;
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

        vec.get((int)idx.value).value = v.value;

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
        return super.visitThis(ctx);
    }

    @Override public MiniJavaVar visitNewArr(MiniJavaParser.NewArrContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;
        assert (matchType(ctx, v.type, "int"));// return MiniJavaVar.makeError();

        MiniJavaVar res = makeInit(ctx, ctx.basicType().getText() + "[]");
        Vector<MiniJavaVar> vec = new Vector<>();
        for(int i=0; i<(int)v.value; i++) {
            MiniJavaVar ele = MiniJavaVar.makeInitVar(ctx, classes, ctx.basicType().getText());
            /*if(ele.isError()) {
                hasError = true;
                return CliUtil.err(ctx, "Array of array is not supported yet.");
            }*/
            vec.add(ele);
        }
        res.value = vec;

        return res;
    }

    @Override public MiniJavaVar visitNewExp(MiniJavaParser.NewExpContext ctx) {
        return super.visitNewExp(ctx);
    }

    @Override public MiniJavaVar visitId(MiniJavaParser.IdContext ctx) {
        return super.visitId(ctx);
    }

    @Override public MiniJavaVar visitIndexOf(MiniJavaParser.IndexOfContext ctx) {
        MiniJavaVar arr = visit(ctx.id);
        if(arr.isError()) return arr;
        assert (isArrayType(ctx, arr.type));// return MiniJavaVar.makeError();

        if(isUsedBeforeInit(ctx, arr, ctx.id.getText())) return MiniJavaVar.makeError();

        MiniJavaVar idx = visit(ctx.idx);
        if(idx.isError()) return idx;
        assert (matchType(ctx, idx.type, "int"));// return MiniJavaVar.makeError();

        Vector<MiniJavaVar> vec = (Vector<MiniJavaVar>) arr.value;
        if((int)idx.value >= vec.size()) return outOfRangeError(ctx);

        MiniJavaVar res = vec.get((int)idx.value);
        return MiniJavaVar.makeNewObj(res);
    }

    @Override public MiniJavaVar visitGetLength(MiniJavaParser.GetLengthContext ctx) {
        MiniJavaVar arr = visit(ctx.id);
        if(arr.isError()) return arr;
        assert (isArrayType(ctx, arr.type));// return MiniJavaVar.makeError();

        Vector<MiniJavaVar> vec = (Vector<MiniJavaVar>) arr.value;

        return MiniJavaVar.makeInt(vec.size());
    }

    @Override public MiniJavaVar visitGetProperty(MiniJavaParser.GetPropertyContext ctx) {
        return getProperty(ctx);
    }

    @Override public MiniJavaVar visitGetMethod(MiniJavaParser.GetMethodContext ctx) {
        MiniJavaVar id = visit(ctx.id);
        if(id.isError()) return id;

        String methodName = ctx.ID().getText();
        MiniJavaClass klass;

        if(id.type.equals("0this")) {
            if(currentClass == null) {
                // is null when in main class
                hasError = true;
                return CliUtil.err(ctx, "calling 'this' in mainClass is not supported yet.");
            }
            klass = currentClass;

        } else {
            //klass = classFoundOrNot(ctx, id.type);
            //if(klass == null) return MiniJavaVar.makeError();
            assert (id.value instanceof MiniJavaInstance);
            klass = ((MiniJavaInstance)id.value).klass;
            assert (klass != null);
        }

        // now klass must be not null
        MiniJavaMethod method = methodFoundOrNot(ctx, klass, methodName);
        if(method == null)
            return MiniJavaVar.makeError();

        Vector<String> args = method.methodArgs;
        Vector<String> argsName = method.methodArgsName;
        String permission = method.methodPermission;

        if(permission.equals("private")) {
            if(!id.type.equals("0this") && !currentClassName.equals(id.type)) {
                assert (false);
                /*hasError = true;
                return CliUtil.err(ctx, String.format("Cannot access private method '%s.%s'.", id.type, methodName));*/
            }
        }

        List<MiniJavaParser.ExpContext> sendingArgs = ctx.exp();
        int n = argsName.size();
        if(sendingArgs.size()-1 != n) {
            assert (false);
            /*hasError = true;
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

        // save context
        MiniJavaVarCtxManager savedCtx = varCtx;
        String _currentClassName = currentClassName, _currentMethodName = currentMethodName;
        MiniJavaClass _currentClass = currentClass;
        MiniJavaVar _thisVal = thisVal;

        // make new context
        currentClass = klass;
        currentClassName = klass.name;
        thisVal = id;
        varCtx = new MiniJavaVarCtxManager();

        varCtx.enterBlock();
        for(i = 0; i < n; i++) {
            varCtx.declareVar(argsName.get(i), MiniJavaVar.makeNewObj(args.get(i), calculatedArgs.get(i)));
        }
        //System.out.printf("calling %s with ", methodName);System.out.println(calculatedArgs);

        // calling function
        MiniJavaVar ret = visit(method.method);

        // recover context
        varCtx.exitBlock();
        MiniJavaVar res = returnVal;
        returnVal = null;
        varCtx = savedCtx;
        currentClassName = _currentClassName;
        currentMethodName = _currentMethodName;
        currentClass = _currentClass;
        thisVal = _thisVal;

        if(ret.isError()) return MiniJavaVar.makeError();

        if(res == null) res = MiniJavaVar.makeVoid();

        if(!matchType(ctx, res.type, method.method.returnType.getText())) {
            System.err.printf("\t%s.%s(): Forgot to return a value?\n", klass.name, methodName);
            return MiniJavaVar.makeError();
        }
        return MiniJavaVar.makeNewObj(method.method.returnType.getText(), res);
    }

    @Override public MiniJavaVar visitDummy(MiniJavaParser.DummyContext ctx) {
        return super.visitDummy(ctx);
    }

    @Override public MiniJavaVar visitUnaryOp(MiniJavaParser.UnaryOpContext ctx) {
        MiniJavaVar res = visit(ctx.first);
        if(res.isError() || isUsedBeforeInit(ctx, res, ctx.first.getText())) return MiniJavaVar.makeError();
        return unaryOp(ctx, res);
    }

    @Override public MiniJavaVar visitBinaryOp(MiniJavaParser.BinaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        if(first.isError() || isUsedBeforeInit(ctx, first, ctx.first.getText())) return MiniJavaVar.makeError();
        MiniJavaVar second = visit(ctx.second);
        if(second.isError() || isUsedBeforeInit(ctx, second, ctx.second.getText())) return MiniJavaVar.makeError();
        /*if(ctx.getText().equals("num<aux01")) {
            System.out.println(ctx.getText());
            System.out.println(first);
            System.out.println(second);
        }*/
        return binaryOp(ctx, first, second);
    }

    @Override public MiniJavaVar visitLogicBinaryOp(MiniJavaParser.LogicBinaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        if(first.isError()) return first;
        if(!matchType(ctx, first.type, "boolean")) return MiniJavaVar.makeError();

        String opSym = ctx.op.getText();
        if(opSym.equals("||")) {
            if((boolean)first.value) return MiniJavaVar.makeBool(true);
            return visit(ctx.second);
        }

        if(opSym.equals("&&")) {
            if(!(boolean)first.value) return MiniJavaVar.makeBool(false);
            return visit(ctx.second);
        }

        return opNotImplemented(ctx, opSym);
    }

    @Override public MiniJavaVar visitTernaryOp(MiniJavaParser.TernaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        if(first.isError() || isUsedBeforeInit(ctx, first, ctx.first.getText())) return MiniJavaVar.makeError();
        MiniJavaVar second = visit(ctx.second);
        if(second.isError() || isUsedBeforeInit(ctx, second, ctx.second.getText())) return MiniJavaVar.makeError();
        MiniJavaVar third = visit(ctx.third);
        if(third.isError() || isUsedBeforeInit(ctx, third, ctx.third.getText())) return MiniJavaVar.makeError();
        return ternaryOp(ctx, first, second, third);
    }

}