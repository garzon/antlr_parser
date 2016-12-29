package src; /**
 * Created by ougar_000 on 2016/12/29.
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import science.garzon.antlr.*;

public class main {

    public static void main(String[] args) {

        String sentence = "{1, 2, 3, 4}";

        MiniJavaLexer lexer = new MiniJavaLexer(
                new ANTLRInputStream(sentence)
        );

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MiniJavaListener(), tree);

        System.out.println();
    }
}
