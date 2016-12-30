import java.lang.Object;
import miniJava.*;
import com.sun.istack.internal.NotNull;

/**
 * Created by ougar_000 on 2016/12/30.
 */

public class MyMiniJavaVisitor extends MiniJavaBaseVisitor<Object> {
    @Override
    public Object visitStmt(@NotNull MiniJavaParser.StmtContext ctx) {
        if(ctx.stmt() != null) {
            System.out.print(ctx.stmt());
        }
        return 0;
    }

}