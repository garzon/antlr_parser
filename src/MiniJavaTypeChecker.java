import miniJava.MiniJavaBaseVisitor;
import miniJava.MiniJavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;

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
        MiniJavaVar res = visitChildren(ctx);
        varCtx.exitBlock();
        return res;
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
        if(v.isError()) return MiniJavaVar.makeRuntimeError();
        MiniJavaVar criteria = Eval.visitIf(ctx, v);
        if(criteria.isError()) return MiniJavaVar.makeRuntimeError();

        MiniJavaVar ts = visit(ctx.t_stmt);
        MiniJavaVar fs = ctx.f_stmt == null ? MiniJavaVar.makeVoid() : visit(ctx.f_stmt);
        return (ts.isError() || fs.isError()) ? MiniJavaVar.makeRuntimeError() : MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitWhile(MiniJavaParser.WhileContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return MiniJavaVar.makeRuntimeError();
        return visit(ctx.stmt()).isError() ? MiniJavaVar.makeRuntimeError() : MiniJavaVar.makeVoid();
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
        if(!SyntaxChecker.matchType(ctx, v.type, retType)) return MiniJavaVar.makeRuntimeError();
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitAssign(MiniJavaParser.AssignContext ctx) {
        String assignSym = ctx.assignSym().getText();
        String id = ctx.ID().getText();

        MiniJavaVar findRes = Eval.idFoundOrNot(ctx, varCtx, id);
        if(findRes == null) return MiniJavaVar.makeRuntimeError();

        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;

        if(!SyntaxChecker.checkAssignOprType(ctx, v.type, findRes.type)) return MiniJavaVar.makeRuntimeError();
        if(assignSym.equals("=")) return MiniJavaVar.makeVoid();

        if(!SyntaxChecker.checkAssignOprType(ctx, findRes.type, "int")) return MiniJavaVar.makeRuntimeError();
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
        return SyntaxChecker.println(ctx, v) ? MiniJavaVar.makeRuntimeError() : MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitSetIndexOf(MiniJavaParser.SetIndexOfContext ctx) {
        String id = ctx.ID().getText();

        MiniJavaVar findRes = Eval.idFoundOrNot(ctx, varCtx, id);
        if(findRes == null) return MiniJavaVar.makeRuntimeError();
        if(!SyntaxChecker.isArrayType(ctx, findRes.type)) return MiniJavaVar.makeRuntimeError();

        MiniJavaVar idx = visit(ctx.idx);
        if(idx.isError()) return idx;
        if(!SyntaxChecker.matchType(ctx, idx.type, "int")) return MiniJavaVar.makeRuntimeError();

        MiniJavaVar v = visit(ctx.v);
        if(v.isError()) return v;
        if(!SyntaxChecker.matchType(ctx, v.type, findRes.type.substring(0, findRes.type.length() - 2)))
            return MiniJavaVar.makeRuntimeError();

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
        return MiniJavaVar.makeInit("this");
    }

    @Override public MiniJavaVar visit
}
