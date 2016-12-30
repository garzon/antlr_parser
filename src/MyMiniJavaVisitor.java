import java.lang.*;
import miniJava.*;

/**
 * Created by ougar_000 on 2016/12/30.
 */

public class MyMiniJavaVisitor extends MiniJavaBaseVisitor<MiniJavaVar> {

    @Override public MiniJavaVar visitSystemCall(MiniJavaParser.SystemCallContext ctx) {
        MiniJavaVar a = visitChildren(ctx.exp());
        System.out.println(a.value);
        return a;
    }

    @Override public MiniJavaVar visitUnaryOp(MiniJavaParser.UnaryOpContext ctx) {
        switch (ctx.op.getText().charAt(0)) {
            case '!':
            case | '+' | '-' | '~'
        }
        return visitChildren(ctx);
    }

    @Override public MiniJavaVar visitIntLiteral(MiniJavaParser.IntLiteralContext ctx) {
        if(ctx.INT_BIN() != null) {
            return Integer.parseInt(ctx.getText().substring(2), 2);
        }
        if(ctx.INT_DEC() != null) {
            return Integer.parseInt(ctx.getText());
        }
        if(ctx.INT_HEX() != null) {
            return Integer.parseInt(ctx.getText().substring(2), 16);
        }
        System.err.println("Unknown type of int literal.");
        return 0;
    }

}