import com.sun.istack.internal.NotNull;
import science.garzon.antlr.hello.ArrayInitBaseListener;
import science.garzon.antlr.hello.ArrayInitParser;

/**
 * Created by ougar_000 on 2016/12/29.
 */
public class ShortToUnicode extends ArrayInitBaseListener {
    @Override
    public void enterInit(@NotNull ArrayInitParser.InitContext ctx) {
        //System.out.print('"');
    }

    @Override
    public void exitInit(@NotNull ArrayInitParser.InitContext ctx) {
        //System.out.print('"');
    }

    @Override
    public void enterValue(@NotNull ArrayInitParser.ValueContext ctx) {
        if(ctx.INT() == null) {
            System.out.print(ctx.INT());
        } else {
            System.out.printf("\\u%04x", Integer.valueOf(ctx.INT().getText()));
        }
    }

}