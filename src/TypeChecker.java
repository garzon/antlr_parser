import miniJava.MiniJavaBaseVisitor;
import miniJava.MiniJavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

/**
 * Created by ougar_000 on 2016/12/30.
 */
public class TypeChecker extends MiniJavaBaseVisitor<MiniJavaVar> {
    public boolean hasError = false;
    public HashMap<String, MiniJavaClass> classes = new HashMap<>();

    protected String currentClassName, currentMethodName, mainClassName;
    protected MiniJavaClass currentClass;
    protected MiniJavaVar thisVal = null;
    protected MiniJavaVarCtxManager varCtx = new MiniJavaVarCtxManager();

    public static String getElementType(String arrType) {
        assert (arrType.endsWith("[]"));
        return arrType.substring(0, arrType.length() - 2);
    }

    protected MiniJavaVar makeInit(ParserRuleContext ctx, String type) {
        MiniJavaVar res = MiniJavaVar.makeInit(ctx, classes, type);
        if(res.isError())
            hasError = true;
        return res;
    }

    protected MiniJavaVar makeInitVar(ParserRuleContext ctx, String type) {
        MiniJavaVar res = MiniJavaVar.makeInitVar(ctx, classes, type);
        if(res.isError())
            hasError = true;
        return res;
    }

    private static MiniJavaVar mockVar(MiniJavaVar original) {
        if(original.isError()) return original;
        if(original.type.equals("boolean")) return MiniJavaVar.makeBool(true);
        if(original.type.equals("int")) return MiniJavaVar.makeInt(1);
        if(MiniJavaVar.isArrayType(original.type)) {
            original.value = new Vector<MiniJavaVar>();
            return original;
        }
        assert (original.value instanceof MiniJavaInstance);
        if(((MiniJavaInstance)original.value).varCtx == null)
            ((MiniJavaInstance)original.value).varCtx = new MiniJavaVarCtx();
        return original;
    }

    protected boolean isArrayType(ParserRuleContext ctx, String type) {
        if(!MiniJavaVar.isArrayType(type)) {
            CliUtil.err(ctx, String.format("Type error: Array expected, got '%s'", type));
            hasError = true;
            return false;
        }
        return true;
    }

    protected boolean matchType(ParserRuleContext ctx, String type1, String type2) {
        if(!type1.equals(type2) && !MiniJavaVar.isParentClassOf(classes, type2, type1)) {
            CliUtil.err(ctx, String.format("Type error: '%s' expected, got '%s'", type2, type1));
            hasError = true;
            return false;
        }
        return true;
    }

    protected boolean checkUnaryOprType(MiniJavaParser.UnaryOpContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            CliUtil.err(ctx, String.format("unaryOp '%s': unexpected type '%s', '%s' expected", ctx.op.getText(), ctx.getText(), type1, type2));
            hasError = true;
            return false;
        }
        return true;
    }

    protected boolean checkAssignOprType(MiniJavaParser.AssignContext ctx, String type1, String type2) {
        if(!type1.equals(type2) && !MiniJavaVar.isParentClassOf(classes, type2, type1)) {
            CliUtil.err(ctx, String.format("Assignment '%s': unexpected type '%s', '%s' expected", ctx.assignSym().getText(), type1, type2));
            hasError = true;
            return false;
        }
        return true;
    }

    protected boolean checkBinaryOprType(MiniJavaParser.BinaryOpContext ctx, String type1, String type2) {
        if(!type1.equals(type2)) {
            CliUtil.err(ctx, String.format("binaryOp '%s': operand type '%s' not match '%s'", ctx.op.getText(), type1, type2));
            hasError = true;
            return false;
        }
        return true;
    }

    protected MiniJavaVar opNotImplemented(ParserRuleContext ctx, String op) {
        hasError = true;
        return CliUtil.err(ctx, String.format("Op %s is not implemented yet", op), "Syntax");
    }

    protected MiniJavaClass classFoundOrNot(ParserRuleContext ctx, String className) {
        MiniJavaClass res = classes.get(className);
        if(className.equals(mainClassName)) {
            CliUtil.err(ctx, "refer to mainClass is not supported yet.", "Syntax");
            hasError = true;
            return null;
        }
        if(res == null) {
            CliUtil.err(ctx, "undefined class " + className, "Syntax");
            hasError = true;
        }
        return res;
    }

    protected MiniJavaParser.MethodDeclarationContext methodFoundOrNot(ParserRuleContext ctx, MiniJavaClass klass, String methodName) {
        MiniJavaParser.MethodDeclarationContext findRes = null;
        if(klass == null) {
            // main class
            if(methodName.equals("main")) return null;
        } else {
            findRes = klass.methods.get(methodName);
            MiniJavaClass searchClass = klass;
            while(findRes == null && searchClass.parentClassName != null) {
                searchClass = classFoundOrNot(ctx, searchClass.parentClassName);
                if(searchClass == null) return null;
                findRes = searchClass.methods.get(methodName);
            }
        }
        if(findRes == null) {
            CliUtil.err(ctx, String.format("Method '%s.%s' not found.", klass.name, methodName), "Syntax");
            hasError = true;
        }
        return findRes;
    }

    protected MiniJavaVar idFoundOrNot(ParserRuleContext ctx, MiniJavaVarCtxManager varCtx, String id) {
        MiniJavaVar findRes = varCtx.findVar(id);
        if(findRes == null) {
            // find in 'this' instance context in the case of omitting 'this' pointer
            if(thisVal != null) {
                assert (thisVal.value instanceof MiniJavaInstance);
                assert (((MiniJavaInstance)thisVal.value).varCtx != null);
                findRes = ((MiniJavaInstance)thisVal.value).varCtx.vars.get(id);
                if(findRes != null) {
                    //CliUtil.warn(ctx, String.format("Should add 'this.' before the identifier '%s'", id));
                    return findRes;
                }
            }
            hasError = true;
            return CliUtil.err(ctx, String.format("Identifier '%s' not found.", id), "Syntax");
        }
        return findRes;
    }

    protected MiniJavaVar propertyFoundOrNot(ParserRuleContext ctx, MiniJavaInstance inst, String propName) {
        MiniJavaVar findRes = inst.varCtx.vars.get(propName);
        if(findRes == null) {
            hasError = true;
            return CliUtil.err(ctx, String.format("Property '%s' of class '%s' not found.", propName, inst.klass.name), "Syntax");
        }
        return findRes;
    }

    @Override public MiniJavaVar visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        //System.err.println(ctx.getText());
        currentClassName = ctx.className.getText();
        currentClass = classFoundOrNot(ctx, currentClassName);
        assert (currentClass != null); // all classes except mainClass should have been collected in collector

        if(currentClass.parentClassName != null) {
            if(classFoundOrNot(ctx, currentClass.parentClassName) == null) {
                hasError = true;
                currentClass = null;
                currentClassName = null;
                return MiniJavaVar.makeError();
            }
        }

        varCtx.enterBlock();
        thisVal = createInstance(ctx, currentClassName);
        visitChildren(ctx);
        thisVal = null;
        varCtx.exitBlock();
        currentClass = null;
        currentClassName = null;

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentClassName = ctx.className.getText();
        mainClassName = currentClassName;
        currentClass = null;

        varCtx.enterBlock();
        varCtx.declareVar(ctx.args.getText(), MiniJavaVar.makeVoid());
        currentMethodName = "main";
        visit(ctx.stmtBlock());
        currentMethodName = null;
        varCtx.exitBlock();

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitPropertyDeclaration(MiniJavaParser.PropertyDeclarationContext ctx) {
        String varName = ctx.varDeclaration().ID().getText();
        String varType = ctx.varDeclaration().type().getText();

        MiniJavaVar v = makeInitVar(ctx, varType);
        if(ctx.varDeclaration().exp() != null) {
            v = visit(ctx.varDeclaration().exp());
            //if(v.isError()) return MiniJavaVar.makeError();
            //if(!matchType(ctx, v.type, varType)) return MiniJavaVar.makeError();
            matchType(ctx, v.type, varType);
        }
        assert (thisVal.value != null);
        assert (thisVal.value instanceof MiniJavaInstance);
        assert (((MiniJavaInstance)(thisVal.value)).varCtx != null);

        ((MiniJavaInstance)thisVal.value).varCtx.vars.put(varName, v);
        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        String varType = ctx.type().getText();

        MiniJavaVar v = makeInit(ctx, varType);
        if(ctx.exp() != null) {
            v = visit(ctx.exp());
            if(v.isError()) return MiniJavaVar.makeError();
            if(!matchType(ctx, v.type, varType)) return MiniJavaVar.makeError();
        }
        varCtx.declareVar(varName, MiniJavaVar.makeNewObj(varType, v));

        return MiniJavaVar.makeVoid();
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
            varCtx.declareVar(varName, makeInitVar(ctx, varType));
        }

        currentMethodName = ctx.methodName.getText();
        MiniJavaVar res = visit(ctx.stmtBlock());
        currentMethodName = null;
        varCtx.exitBlock();

        return res;
    }

    @Override public MiniJavaVar visitIf(MiniJavaParser.IfContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) {
            // return MiniJavaVar.makeError();
        } else {
            matchType(ctx, v.type, "boolean");
        }

        MiniJavaVar ts = visit(ctx.t_stmt);
        MiniJavaVar fs = ctx.f_stmt == null ? MiniJavaVar.makeVoid() : visit(ctx.f_stmt);
        return (ts.isError() || fs.isError()) ? MiniJavaVar.makeError() : MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitWhile(MiniJavaParser.WhileContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) {
            //return MiniJavaVar.makeError();
        } else {
            matchType(ctx, v.type, "boolean");
        }

        return visit(ctx.stmt()).isError() ? MiniJavaVar.makeError() : MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitFor(MiniJavaParser.ForContext ctx) {
        MiniJavaVar st = visit(ctx.start_stmt);
        MiniJavaVar criteria = visit(ctx.exp());
        MiniJavaVar body = visit(ctx.stmtBody());
        MiniJavaVar stm = visit(ctx.step_stmt);

        if(!criteria.isError())
            if(!matchType(ctx, criteria.type, "boolean"))
                return MiniJavaVar.makeError();

        return !st.isError() && !criteria.isError() && !body.isError() && !stm.isError() ? MiniJavaVar.makeVoid() : MiniJavaVar.makeError();
    }

    @Override public MiniJavaVar visitReturn(MiniJavaParser.ReturnContext ctx) {
        MiniJavaParser.MethodDeclarationContext currentMethod;
        currentMethod = methodFoundOrNot(ctx, currentClass, currentMethodName);
        String retType = "void";
        if(currentMethod == null && !currentMethodName.equals("main")) {
            assert(false);
        }
        if(currentMethod != null) {
            // not main method of main class
            retType = currentMethod.returnType.getText();
        }

        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;
        if(!matchType(ctx, v.type, retType)) return MiniJavaVar.makeError();
        return v;
    }

    protected boolean isUsedBeforeInit(ParserRuleContext ctx, MiniJavaVar v, String id) {
        if(v.value == null) {
            hasError = true;
            CliUtil.err(ctx, String.format("Variable '%s' used before being initialized.", id));
            return true;
        }
        return false;
    }

    @Override public MiniJavaVar visitAssign(MiniJavaParser.AssignContext ctx) {
        String assignSym = ctx.assignSym().getText();
        String id = ctx.ID().getText();

        MiniJavaVar findRes = idFoundOrNot(ctx, varCtx, id);
        if(findRes.isError()) return findRes;

        if(!assignSym.equals("=")) {
            if(isUsedBeforeInit(ctx, findRes, id)) return MiniJavaVar.makeError();
        }

        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;

        if(!checkAssignOprType(ctx, v.type, findRes.type)) return MiniJavaVar.makeError();
        if(assignSym.equals("=")) {
            //System.err.println(ctx.getText());
            findRes.value = mockVar(v).value;
            //return varCtx.assignVar(id, mockVar(findRes));
            return MiniJavaVar.makeVoid();
        }

        if(!checkAssignOprType(ctx, findRes.type, "int")) return MiniJavaVar.makeError();
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

        return opNotImplemented(ctx, assignSym);
    }

    public static MiniJavaVar systemCall(MiniJavaParser.SystemCallContext ctx, MiniJavaVar a, boolean doNotExec) {
        if(a.isError()) return a;
        if(a.type.equals("int")) {
            if(!doNotExec) System.out.println((int)a.value);
            return MiniJavaVar.makeVoid();
        }
        if(a.type.equals("boolean")) {
            if(!doNotExec) System.out.println((boolean)a.value);
            return MiniJavaVar.makeVoid();
        }
        /*if(a.type.equals("int[]")) {
            if(!doNotExec) System.out.println("println: int[] is not supported yet.");
            return MiniJavaVar.makeVoid();
        }*/
        if(!doNotExec) System.out.println((Vector<MiniJavaVar>)a.value);
        return MiniJavaVar.makeVoid();

        //return CliUtil.err(ctx, String.format("System.out.println: type '%s' is not supported.", a.type));
    }

    @Override public MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        return systemCall(ctx, v, true);
    }

    @Override public MiniJavaVar visitNormalStmt(MiniJavaParser.NormalStmtContext ctx) {
        return visit(ctx.stmtBody());
    }

    @Override public MiniJavaVar visitSetIndexOf(MiniJavaParser.SetIndexOfContext ctx) {
        String id = ctx.ID().getText();

        MiniJavaVar findRes = idFoundOrNot(ctx, varCtx, id);
        if(findRes.isError()) return findRes;
        if(!isArrayType(ctx, findRes.type)) return MiniJavaVar.makeError();

        MiniJavaVar idx = visit(ctx.idx);
        if(!idx.isError())// return idx;
            matchType(ctx, idx.type, "int");//) return MiniJavaVar.makeError();

        MiniJavaVar v = visit(ctx.v);
        if(v.isError()) return v;
        if(!matchType(ctx, v.type, getElementType(findRes.type)))
            return MiniJavaVar.makeError();

        return MiniJavaVar.makeVoid();
    }

    @Override public MiniJavaVar visitBoolLiteral(MiniJavaParser.BoolLiteralContext ctx) {
        return mockVar(MiniJavaVar.makeBool(true));
    }

    @Override public MiniJavaVar visitIntLiteral(MiniJavaParser.IntLiteralContext ctx) {
        return mockVar(MiniJavaVar.makeInt(1));
    }

    @Override public MiniJavaVar visitThis(MiniJavaParser.ThisContext ctx) {
        if(thisVal == null) {
            return CliUtil.err(ctx, "Access 'this' in mainClass is not supported yet.");
        }
        return thisVal;
    }

    @Override public MiniJavaVar visitNewArr(MiniJavaParser.NewArrContext ctx) {
        MiniJavaVar v = visit(ctx.exp());
        if(v.isError()) return v;
        if(!matchType(ctx, v.type, "int")) return MiniJavaVar.makeError();

        return makeInitVar(ctx, ctx.basicType().getText() + "[]");
    }

    protected MiniJavaVar addPropertyOfClass(ParserRuleContext ctx, MiniJavaClass klass, MiniJavaInstance inst) {
        if(klass.parentClassName != null) {
            MiniJavaClass parentClass = classFoundOrNot(ctx, klass.parentClassName);
            if(parentClass == null) return MiniJavaVar.makeError();
            addPropertyOfClass(ctx, parentClass, inst);
        }
        for(String propName: klass.property.keySet()) {
            inst.varCtx.vars.put(propName, makeInitVar(ctx, klass.property.get(propName)));
        }
        return MiniJavaVar.makeVoid();
    }

    protected MiniJavaVar createInstance(ParserRuleContext ctx, String className) {
        MiniJavaVar v = makeInitVar(ctx, className);
        if(v.isError()) return v;
        MiniJavaInstance inst = (MiniJavaInstance) v.value;
        if(addPropertyOfClass(ctx, inst.klass, inst).isError()) return MiniJavaVar.makeError();
        return v;
    }

    @Override public MiniJavaVar visitNewExp(MiniJavaParser.NewExpContext ctx) {
        String className = ctx.ID().getText();
        return createInstance(ctx, className);
    }

    @Override public MiniJavaVar visitId(MiniJavaParser.IdContext ctx) {
        return idFoundOrNot(ctx, varCtx, ctx.ID().getText());
    }

    @Override public MiniJavaVar visitIndexOf(MiniJavaParser.IndexOfContext ctx) {
        MiniJavaVar id = visit(ctx.id);
        if(id.isError()) return id;
        if(!isArrayType(ctx, id.type)) return MiniJavaVar.makeError();


        MiniJavaVar idx = visit(ctx.idx);
        if(idx.isError()) return idx;
        if(!matchType(ctx, idx.type, "int")) return MiniJavaVar.makeError();

        return makeInitVar(ctx, getElementType(id.type));
    }

    @Override public MiniJavaVar visitGetLength(MiniJavaParser.GetLengthContext ctx) {
        MiniJavaVar id = visit(ctx.id);
        if(id.isError()) return id;
        if(!isArrayType(ctx, id.type))
            return MiniJavaVar.makeError();

        return MiniJavaVar.makeInt(1);
    }

    protected MiniJavaVar getProperty(MiniJavaParser.GetPropertyContext ctx) {
        MiniJavaVar id = visit(ctx.id);
        if(id.isError()) return id;

        if(!(id.value instanceof MiniJavaInstance)) {
            if(id.type.equals("0this")) {
                id = thisVal;
                if(id == null) {
                    // 'this' in main class
                    return CliUtil.err(ctx, "'this' pointer in mainClass is not supported yet.");
                }
            } else {
                matchType(ctx, id.type, "an instance");
                return MiniJavaVar.makeError();
            }
        }

        return propertyFoundOrNot(ctx, (MiniJavaInstance)id.value, ctx.ID().getText());
    }

    @Override public MiniJavaVar visitGetProperty(MiniJavaParser.GetPropertyContext ctx) {
        return mockVar(getProperty(ctx));
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
            if(!(id.value instanceof MiniJavaInstance)) {
                matchType(ctx, id.type, "an instance");
                return MiniJavaVar.makeError();
            }
            klass = ((MiniJavaInstance)id.value).klass;
            assert (klass != null);
        }

        // now klass must be not null
        MiniJavaParser.MethodDeclarationContext method = methodFoundOrNot(ctx, klass, methodName);
        if(method == null)
            return MiniJavaVar.makeError();

        Vector<String> args = klass.methodArgs.get(methodName);
        assert (args != null);

        String permission = klass.methodPermission.get(methodName);
        assert (permission != null);

        String realObjType = klass.name;

        if(permission.equals("private")) {
            if(!id.type.equals("0this") && !currentClassName.equals(realObjType)) {
                hasError = true;
                return CliUtil.err(ctx, String.format("Cannot access private method '%s.%s'.", id.type, methodName));
            }
        }

        List<MiniJavaParser.ExpContext> sendingArgs = ctx.exp();
        int n = args.size();
        if(sendingArgs.size()-1 != n) {
            hasError = true;
            return CliUtil.err(ctx, String.format("Number of args(%d) for calling method '%s.%s' should be %d.",
                    sendingArgs.size()-1, id.type, methodName, n), "Syntax");
        }

        int i = 0;
        for(MiniJavaParser.ExpContext exp: sendingArgs) {
            if(i == 0) {
                i += 1;
                continue;
            }
            MiniJavaVar arg = visit(exp);
            if(arg.isError()) return arg;
            if(!matchType(exp, arg.type, args.get(i-1)))
                return MiniJavaVar.makeError();
            i += 1;
        }

        String retType = method.returnType.getText();
        MiniJavaVar res = makeInitVar(ctx, retType);
        if(res.value instanceof MiniJavaInstance) {
            res = createInstance(ctx, retType);
        }
        return res;
    }

    private boolean divBy0(MiniJavaParser.BinaryOpContext ctx, int vNotZero) {
        if(vNotZero == 0) {
            CliUtil.err(ctx, String.format("Op '%s': divided by zero", ctx.op.getText()));
            hasError = true;
            return true;
        }
        return false;
    }

    @Override public MiniJavaVar visitDummy(MiniJavaParser.DummyContext ctx) {
        return visit(ctx.exp());
    }

    @Override public MiniJavaVar visitMissingRP(MiniJavaParser.MissingRPContext ctx) {
        CliUtil.warn(ctx, String.format("Missing ')', has been (correctly?) corrected to (%s).", ctx.exp().getText()));
        return visit(ctx.exp());
    }

    @Override public MiniJavaVar visitUnaryOp(MiniJavaParser.UnaryOpContext ctx) {
        MiniJavaVar first = mockVar(visit(ctx.first));
        return unaryOp(ctx, first);
    }

    @Override public MiniJavaVar visitBinaryOp(MiniJavaParser.BinaryOpContext ctx) {
        MiniJavaVar first = mockVar(visit(ctx.first));
        MiniJavaVar second = mockVar(visit(ctx.second));
        return binaryOp(ctx, first, second);
    }

    @Override public MiniJavaVar visitLogicBinaryOp(MiniJavaParser.LogicBinaryOpContext ctx) {
        MiniJavaVar first = mockVar(visit(ctx.first));
        MiniJavaVar second = mockVar(visit(ctx.second));
        if(first.isError() || second.isError()) return MiniJavaVar.makeError();

        matchType(ctx, first.type, "boolean");
        matchType(ctx, second.type, "boolean");

        return MiniJavaVar.makeBool(true);
    }

    @Override public MiniJavaVar visitTernaryOp(MiniJavaParser.TernaryOpContext ctx) {
        MiniJavaVar first = mockVar(visit(ctx.first));
        MiniJavaVar second = mockVar(visit(ctx.second));
        MiniJavaVar third = mockVar(visit(ctx.third));
        return ternaryOp(ctx, first, second, third);
    }

    protected MiniJavaVar unaryOp(MiniJavaParser.UnaryOpContext ctx, MiniJavaVar res) {
        if(res.isError()) return res;
        String type = res.type;
        switch (ctx.op.getText().charAt(0)) {
            case '!':
                if(!checkUnaryOprType(ctx, type, "boolean")) return MiniJavaVar.makeError();
                res = MiniJavaVar.makeBool(!(boolean)res.value);
                //res.value = !(boolean)res.value;
                break;
            case '+':
                if(!checkUnaryOprType(ctx, type, "int")) return MiniJavaVar.makeError();
                res = MiniJavaVar.makeInt(+(int)res.value);
                break;
            case '-':
                if(!checkUnaryOprType(ctx, type, "int")) return MiniJavaVar.makeError();
                //res.value = -(int)res.value;
                res = MiniJavaVar.makeInt(-(int)res.value);
                break;
            case '~':
                if(!checkUnaryOprType(ctx, type, "int")) return MiniJavaVar.makeError();
                //res.value = ~(int)res.value;
                res = MiniJavaVar.makeInt(~(int)res.value);
                break;
            default:
                return opNotImplemented(ctx, ctx.op.getText());
        }
        return res;
    }

    protected MiniJavaVar binaryOp(MiniJavaParser.BinaryOpContext ctx, MiniJavaVar first, MiniJavaVar second) {
        if(first.isError()) return first;
        if(second.isError()) return second;
        String opSym = ctx.op.getText();

        if(!checkBinaryOprType(ctx, first.type, second.type)) return MiniJavaVar.makeError();

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

        if(!checkBinaryOprType(ctx, first.type, "int")) return MiniJavaVar.makeError();

        if(opSym.equals("*"))
            return MiniJavaVar.makeInt((int)first.value * (int)second.value);
        if(opSym.equals("/")) {
            if(divBy0(ctx, (int)second.value)) return MiniJavaVar.makeError();
            return MiniJavaVar.makeInt((int) first.value / (int)second.value);
        }
        if(opSym.equals("%")) {
            if(divBy0(ctx, (int)second.value)) return MiniJavaVar.makeError();
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

    protected MiniJavaVar ternaryOp(MiniJavaParser.TernaryOpContext ctx, MiniJavaVar first, MiniJavaVar second, MiniJavaVar third) {
        if(first.isError()) return first;
        if(second.isError()) return second;
        if(third.isError()) return third;

        String opSym = ctx.op.getText();
        if(opSym.equals("?")) {
            if(!matchType(ctx, first.type, "boolean")) return MiniJavaVar.makeError();
            if(!matchType(ctx, second.type, third.type)) return MiniJavaVar.makeError();
            if((boolean)first.value) return MiniJavaVar.makeNewObj(second);
            else return MiniJavaVar.makeNewObj(third);
        }

        return opNotImplemented(ctx, opSym);
    }
}
