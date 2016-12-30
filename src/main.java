/**
 * Created by ougar_000 on 2016/12/29.
 */

import java.io.*;
import java.nio.file.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import miniJava.*;

import java.nio.file.Files;

public class main {

    public static void main(String[] args) throws IOException {

        String sentence = new String(Files.readAllBytes(Paths.get("D:/exampleMiniJavaProgram.minijava")));

        MiniJavaLexer lexer = new MiniJavaLexer(
                new ANTLRInputStream(sentence)
        );

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.goal();

        if(args.length > 2 && args[1].equals("run")) {
            MyMiniJavaVisitor visitor = new MyMiniJavaVisitor();
            visitor.visit(tree);
        } else {
            System.out.println(tree.toStringTree(parser));
        }
    }
}
