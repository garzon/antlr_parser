/**
 * Created by ougar_000 on 2016/12/29.
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import science.garzon.antlr.hello.*;


public class main {

    public static void main(String[] args) {

        String sentence = "{99, 3, 451}";

        ArrayInitLexer lexer = new ArrayInitLexer(
                new ANTLRInputStream(sentence)
        );

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicode(), tree);

        System.out.println();
    }
}
