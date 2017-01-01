/**
 * Created by ougar_000 on 2016/12/30.
 */

import java.lang.*;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CliUtil {
    public static boolean isRuntime = false;

    public static Vector<Token> getFirst10Tokens(ParserRuleContext ctx) {
        Vector<Token> tokens = new Vector<>();
        Iterator itr = ctx.children.iterator();
        while(itr.hasNext()) {
            ParseTree o = (ParseTree)itr.next();
            if(o instanceof TerminalNode) {
                TerminalNode tnode = (TerminalNode)o;
                Token symbol = tnode.getSymbol();
                tokens.add(symbol);
                if(tokens.size() >= 10) break;
            }
        }
        return tokens;
    }

    public static MiniJavaVar warn(ParserRuleContext ctx, String msg) {
        if(isRuntime) return MiniJavaVar.makeVoid();

        Token firstToken = ctx.getStart();
        String sourceContext = "";
        for(Token token: getFirst10Tokens(ctx)) {
            sourceContext += token.getText() + " ";
        }
        // sourceContext += "...";
        System.err.printf("[WARN] Line %d, Char %d, '%s':\n\t%s\n",
                firstToken.getLine(),
                firstToken.getCharPositionInLine(),
                sourceContext, msg);

        return MiniJavaVar.makeError();
    }

    public static MiniJavaVar err(ParserRuleContext ctx, String msg) {
        Token firstToken = ctx.getStart();
        String sourceContext = "";
        for(Token token: getFirst10Tokens(ctx)) {
            sourceContext += token.getText() + " ";
        }
        // sourceContext += "...";
        System.err.printf("[%sERR] Line %d, Char %d, '%s':\n\t%s\n",
                isRuntime ? "Runtime " : "",
                firstToken.getLine(),
                firstToken.getCharPositionInLine(),
                sourceContext, msg);

        return MiniJavaVar.makeError();
    }

    public static void printCtx(ParserRuleContext ctx) {
        Token firstToken = ctx.getStart();
        String sourceContext = "";
        for(Token token: getFirst10Tokens(ctx)) {
            sourceContext += token.getText() + " ";
        }
        System.out.printf("[Info] Line %d, Char %d, '%s': %s\n", firstToken.getLine(), firstToken.getCharPositionInLine(),
                sourceContext, ctx.getText());
    }
}
