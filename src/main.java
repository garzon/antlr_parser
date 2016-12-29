package src; /**
 * Created by ougar_000 on 2016/12/29.
 */

import java.io.*;
import java.nio.file.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import science.garzon.antlr.*;

import java.nio.file.Files;

public class main {

    public static void main(String[] args) throws IOException {

        String sentence = new String(Files.readAllBytes(Paths.get("d:/exampleMiniJavaProgram.minijava")));

        MiniJavaLexer lexer = new MiniJavaLexer(
                new ANTLRInputStream(sentence)
        );

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.mainClass();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MiniJavaListener(), tree);

        System.out.println();
    }
}
