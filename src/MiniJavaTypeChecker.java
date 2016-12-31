import miniJava.MiniJavaBaseVisitor;
import miniJava.MiniJavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class MiniJavaTypeChecker extends MiniJavaBaseVisitor<MiniJavaVar> {
    public boolean hasSyntaxError = false;
    public HashMap<String, MiniJavaClass> classes = new HashMap<>();

    private String currentClassName, currentMethodName;
    private MiniJavaClass currentClass;
    private MiniJavaVarCtxManager varCtx = new MiniJavaVarCtxManager();

    private MiniJavaClass findDefinedClass(ParserRuleContext ctx, String className) {
        MiniJavaClass res = classes.get(className);
        if(res == null) {
            CliUtil.err(ctx, "undefined class " + className);
            hasSyntaxError = true;
        }
        return res;
    }

    @Override public MiniJavaVar visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentClassName = ctx.className.getText();
        currentClass = findDefinedClass(ctx, currentClassName);

        varCtx.enterBlock();
        visitChildren(ctx);
        varCtx.exitBlock();
        currentClass = null;
        currentClassName = null;

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentClassName = ctx.className.getText();
        currentClass = null;

        varCtx.enterBlock();
        varCtx.assignVar(ctx.args.getText(), new MiniJavaVar("String[]", null));
        currentMethodName = "main";
        visit(ctx.stmtBlock());
        currentMethodName = null;
        varCtx.exitBlock();

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        return Eval.visitVarDeclaration(ctx, varCtx);
    }

    @Override public MiniJavaVar visitStmtBlock(MiniJavaParser.StmtBlockContext ctx) {
        varCtx.enterBlock();
        visitChildren(ctx);
        varCtx.exitBlock();
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitBlock(MiniJavaParser.BlockContext ctx) {
        return visit(ctx.stmtBlock());
    }

    @Override public MiniJavaVar visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        varCtx.enterBlock();

        for(MiniJavaParser.ArgPairContext arg: ctx.argPair()) {
            String varName, varType;
            varName = arg.ID().getText();
            varType = arg.type().getText();
            varCtx.assignVar(varName, MiniJavaVar.makeInit(varType));
        }

        currentMethodName = ctx.methodName.getText();
        MiniJavaVar res = visitChildren(ctx);
        currentMethodName = null;
        varCtx.exitBlock();

        return res;
    }

    @Override public MiniJavaVar visitIf(MiniJavaParser.IfContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return MiniJavaVar.makeError();
        MiniJavaVar criteria = Eval.visitIf(ctx, v);
        if(criteria.isError()) return MiniJavaVar.makeError();

        MiniJavaVar ts = visit(ctx.t_stmt);
        MiniJavaVar fs = ctx.f_stmt == null ? MiniJavaVar.makeVoid() : visit(ctx.f_stmt);
        return (ts.isError() || fs.isError()) ? MiniJavaVar.makeError() : MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitWhile(MiniJavaParser.WhileContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return MiniJavaVar.makeError();
        return visit(ctx.stmt()).isError() ? MiniJavaVar.makeError() : MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitReturn(MiniJavaParser.ReturnContext ctx) {
        MiniJavaParser.MethodDeclarationContext currentMethod;
        currentMethod = SyntaxChecker.getMethodContext(classes, currentClassName, currentMethodName);
        String retType = "void";
        if(currentMethod == null && !currentMethodName.equals("main")) {
            assert (false);
        }
        if(currentMethod != null) {
            retType = currentMethod.returnType.getText();
        }

        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;
        if(!SyntaxChecker.matchType(ctx, v.type, retType)) return MiniJavaVar.makeError();
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitAssign(MiniJavaParser.AssignContext ctx) {
        String assignSym = ctx.assignSym().getText();
        String id = ctx.ID().getText();

        MiniJavaVar findRes = Eval.idFoundOrNot(ctx, varCtx, id);
        if(findRes == null) {
            hasSyntaxError = true;
            return MiniJavaVar.makeError();
        }

        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;

        if(!SyntaxChecker.checkAssignOprType(ctx, v.type, findRes.type)) return MiniJavaVar.makeError();
        if(assignSym.equals("=")) return MiniJavaVar.makeVoid();

        if(!SyntaxChecker.checkAssignOprType(ctx, findRes.type, "int")) return MiniJavaVar.makeError();
        if(assignSym.equals("*=") ||
            assignSym.equals("/=") ||
            assignSym.equals("%=") ||
            assignSym.equals("&=") ||
            assignSym.equals("|=") ||
            assignSym.equals("^=") ||
            assignSym.equals("+=") ||
            assignSym.equals("-=") ||
            assignSym.equals("<<=") ||
            assignSym.equals(">>>=") ||
            assignSym.equals(">>=")) {
            return MiniJavaVar.makeVoid();
        }

        return SyntaxChecker.opNotImplemented(ctx, assignSym);
    }

    @Override public MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        return SyntaxChecker.println(ctx, v) ? MiniJavaVar.makeError() : MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitSetIndexOf(MiniJavaParser.SetIndexOfContext ctx) {
        String id = ctx.ID().getText();

        MiniJavaVar findRes = Eval.idFoundOrNot(ctx, varCtx, id);
        if(findRes == null) {
            hasSyntaxError = true;
            return MiniJavaVar.makeError();
        }
        if(!SyntaxChecker.isArrayType(ctx, findRes.type)) return MiniJavaVar.makeError();

        MiniJavaVar idx = visit(ctx.idx);
        if(idx.isError()) return idx;
        if(!SyntaxChecker.matchType(ctx, idx.type, "int")) return MiniJavaVar.makeError();

        MiniJavaVar v = visit(ctx.v);
        if(v.isError()) return v;
        if(!SyntaxChecker.matchType(ctx, v.type, SyntaxChecker.getElementType(findRes.type)))
            return MiniJavaVar.makeError();

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitUnaryOp(MiniJavaParser.UnaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        return SyntaxChecker.unaryOp(ctx, first);
    }

    @Override public MiniJavaVar visitBinaryOp(MiniJavaParser.BinaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        MiniJavaVar second = visit(ctx.second);
        return SyntaxChecker.binaryOp(ctx, first, second);
    }

    @Override public MiniJavaVar visitTernaryOp(MiniJavaParser.TernaryOpContext ctx) {
        MiniJavaVar first = visit(ctx.first);
        MiniJavaVar second = visit(ctx.second);
        MiniJavaVar third = visit(ctx.third);
        return SyntaxChecker.ternaryOp(ctx, first, second, third);
    }

    @Override public MiniJavaVar visitBoolLiteral(MiniJavaParser.BoolLiteralContext ctx) {
        return SyntaxChecker.mockVar(MiniJavaVar.makeInit("boolean"));
    }

    @Override public MiniJavaVar visitIntLiteral(MiniJavaParser.IntLiteralContext ctx) {
        return SyntaxChecker.mockVar(MiniJavaVar.makeInit("int"));
    }

    @Override public MiniJavaVar visitThis(MiniJavaParser.ThisContext ctx) {
        return MiniJavaVar.makeInit("0this");
    }

    @Override public MiniJavaVar visitNewArr(MiniJavaParser.NewArrContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;
        if(!SyntaxChecker.matchType(ctx, v.type, "int")) return MiniJavaVar.makeError();

        return MiniJavaVar.makeInit(ctx.basicType().getText() + "[]");
    }

    @Override public MiniJavaVar visitNewExp(MiniJavaParser.NewExpContext ctx) {
        String className = ctx.ID().getText();
        MiniJavaClass res = findDefinedClass(ctx, className);
        if(res == null) return MiniJavaVar.makeError();
        return MiniJavaVar.makeInit(className);
    }

    @Override public MiniJavaVar visitId(MiniJavaParser.IdContext ctx) {
        MiniJavaVar res = Eval.idFoundOrNot(ctx, varCtx, ctx.ID().getText());
        if(res.isError()) hasSyntaxError = true;
        return res;
    }

    @Override public MiniJavaVar visitIndexOf(MiniJavaParser.IndexOfContext ctx) {
        MiniJavaVar id = visit(ctx.id);
        if(id.isError()) return id;
        if(!SyntaxChecker.isArrayType(ctx, id.type)) {
            hasSyntaxError = true;
            return MiniJavaVar.makeError();
        }

        MiniJavaVar idx = visit(ctx.idx);
        if(idx.isError()) return idx;
        if(!SyntaxChecker.matchType(ctx, idx.type, "int")) return MiniJavaVar.makeError();

        return MiniJavaVar.makeInit(SyntaxChecker.getElementType(id.type));
    }

    @Override public MiniJavaVar visitGetLength(MiniJavaParser.GetLengthContext ctx) {
        MiniJavaVar id = visit(ctx.id);
        if(id.isError()) return id;
        if(!SyntaxChecker.isArrayType(ctx, id.type)) {
            hasSyntaxError = true;
            return MiniJavaVar.makeError();
        }

        return MiniJavaVar.makeInit("int");
    }

    @Override public MiniJavaVar visitGetMethod(MiniJavaParser.GetMethodContext ctx) {
        MiniJavaVar id = visit(ctx.id);
        if(id.isError()) return id;

        String methodName = ctx.ID().getText();
        MiniJavaClass klass;

        if(id.type.equals("0this")) {
            assert (currentClass != null);  // is null when in main class
            klass = currentClass;
        } else {
            klass = findDefinedClass(ctx, id.type);
            if(klass == null) return MiniJavaVar.makeError();
        }

        // TODO: find in parent class
        MiniJavaParser.MethodDeclarationContext method = Eval.methodFoundOrNot(ctx, klass, methodName);
        if(method == null) {
            hasSyntaxError = true;
            return MiniJavaVar.makeError();
        }

        Vector<String> args = klass.methodArgs.get(methodName);
        assert (args != null);

        String permission = klass.methodPermission.get(methodName);
        assert (permission != null);

        if(permission.equals("private")) {
            if(!id.type.equals("0this") && !currentClassName.equals(id.type)) {
                hasSyntaxError = true;
                CliUtil.err(ctx, String.format("Cannot access private method '%s.%s'.", id.type, methodName));
                return MiniJavaVar.makeError();
            }
        }

        List<MiniJavaParser.ExpContext> sendingArgs = ctx.exp();
        int n = args.size();
        if(sendingArgs.size() != n) {
            hasSyntaxError = true;
            CliUtil.err(ctx, String.format("Number of args(%d) for calling method '%s.%s' should be %d.",
                    sendingArgs.size(), id.type, methodName, n));
            return MiniJavaVar.makeError();
        }

        int i = 0;
        for(MiniJavaParser.ExpContext exp: sendingArgs) {
            MiniJavaVar arg = visit(exp);
            if(!SyntaxChecker.matchType(exp, arg.type, args.get(i))) {
                hasSyntaxError = true;
                return MiniJavaVar.makeError();
            }
            i += 1;
        }

        String retType = method.returnType.getText();
        return MiniJavaVar.makeInit(retType);
    }
}
