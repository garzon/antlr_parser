package src;

import com.sun.istack.internal.NotNull;
import science.garzon.antlr.MiniJavaBaseListener;
import science.garzon.antlr.MiniJavaParser;

/**
 * Created by ougar_000 on 2016/12/29.
 */
public class MiniJavaListener extends MiniJavaBaseListener {
    @Override
    public void enterStmt(@NotNull MiniJavaParser.StmtContext ctx) {
        if(ctx.stmt() != null) {
            System.out.printf("%s\n", ctx.stmt().toString());
        }
    }

}