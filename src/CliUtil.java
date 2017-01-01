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

    private static void underlineError(String source,
                                       Token offendingToken,
                                       int line,
                                       int charPositionInLine) {
        String[] lines = source.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if ( start>=0 && stop>=0 ) {
            for (int i=start; i<=stop; i++) System.err.print("^");
        }
        System.err.println();
    }

    public static void underlineError(Recognizer recognizer,
                                         Token offendingToken, int line,
                                         int charPositionInLine) {
        CommonTokenStream tokens =
                (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        underlineError(input, offendingToken, line, charPositionInLine);
    }

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

    public static String getTokensString(ParserRuleContext ctx) {
        String sourceContext = "";
        for(Token token: getFirst10Tokens(ctx)) {
            sourceContext += token.getText() + " ";
        }
        return sourceContext;
    }


    public static MiniJavaVar warn(ParserRuleContext ctx, String msg) {
        if(isRuntime) return MiniJavaVar.makeVoid();
        Token firstToken = ctx.getStart();
        String source = firstToken.getInputStream().toString();
        System.err.printf("[WARN] Line %d, Char %d:\n",
                firstToken.getLine(),
                firstToken.getCharPositionInLine());
        underlineError(source, firstToken, firstToken.getLine(), firstToken.getCharPositionInLine());
        System.err.printf("\t%s\n\n", msg);

        return MiniJavaVar.makeError();
    }

    public static MiniJavaVar err(ParserRuleContext ctx, String msg, String errType) {
        Token firstToken = ctx.getStart();
        String source = firstToken.getInputStream().toString();
        System.err.printf("[%s%s ERR] Line %d, Char %d:\n",
                isRuntime ? "Runtime " : "",
                errType,
                firstToken.getLine(),
                firstToken.getCharPositionInLine());
        underlineError(source, firstToken, firstToken.getLine(), firstToken.getCharPositionInLine());
        System.err.printf("\t%s\n\n", msg);
        return MiniJavaVar.makeError();
    }

    public static MiniJavaVar err(ParserRuleContext ctx, String msg) {
        return err(ctx, msg, "Semantic");
    }

    public static void printCtx(ParserRuleContext ctx) {
        Token firstToken = ctx.getStart();
        String sourceContext = getTokensString(ctx);
        System.out.printf("[Info] Line %d, Char %d, '%s': %s\n", firstToken.getLine(), firstToken.getCharPositionInLine(),
                sourceContext, ctx.getText());
    }
}
