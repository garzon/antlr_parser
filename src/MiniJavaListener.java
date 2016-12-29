package src;

import com.sun.istack.internal.NotNull;
import science.garzon.antlr.MiniJavaBaseListener;
import science.garzon.antlr.MiniJavaParser;

/**
 * Created by ougar_000 on 2016/12/29.
 */
public class MiniJavaListener extends MiniJavaBaseListener {
    @Override
    public void enterValue(@NotNull MiniJavaParser.ValueContext ctx) {
        if(ctx.INT() == null) {
            System.out.print(ctx.INT());
        } else {
            System.out.printf("\\u%04x", Integer.valueOf(ctx.INT().getText()));
        }
    }

}