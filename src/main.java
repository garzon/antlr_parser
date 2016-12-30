/**
 * Created by ougar_000 on 2016/12/29.
 */

import java.io.*;
import java.nio.file.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import miniJava.*;

import java.nio.file.Files;

public class main {

    public static void main(String[] args) throws IOException {
        //String sentence = new String(Files.readAllBytes(Paths.get(args[1])));
        String sentence = new String(Files.readAllBytes(Paths.get("D:/exampleMiniJavaProgram.minijava")));

        MiniJavaLexer lexer = new MiniJavaLexer(
                new ANTLRInputStream(sentence)
        );

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();
        MiniJavaSymbolCollector collector = new MiniJavaSymbolCollector();
        parser.setBuildParseTree(true);
        walker.walk(collector, parser.goal());

        //if(args.length > 2 && args[1].equals("run")) {
            /*if(collector.hasSyntaxError) {
                System.out.println("There are syntax errors. Cannot execute the program.");
                return;
            }*/
            MiniJavaEvaluator evaluator = new MiniJavaEvaluator();
            evaluator.classesInfo = collector.classes;
            evaluator.visit(collector.root.mainClass());
        //} else {
            System.out.println(collector.root.toStringTree(parser));
        //}
    }
}
