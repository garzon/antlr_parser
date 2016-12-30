/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.lang.*;

import miniJava.*;
import org.antlr.v4.runtime.*;

public class CliUtil {
    public static void err(ParserRuleContext ctx, String msg) {
        Token firstToken = ctx.getStart();
        System.err.printf("[ERR] @%d:%d in '%s':\n\t%s\n", firstToken.getLine(), firstToken.getCharPositionInLine(),
                                ctx.getText(), msg);
    }
}
