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

        String sentence = new String(Files.readAllBytes(Paths.get("D:/exampleMiniJavaProgram.minijava")));

        MiniJavaLexer lexer = new MiniJavaLexer(
                new ANTLRInputStream(sentence)
        );

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);

        //if(args.length > 2 && args[1].equals("run")) {
            ParseTreeWalker walker = new ParseTreeWalker();
            MiniJavaSymbolCollector collector = new MiniJavaSymbolCollector();
            walker.walk(collector, parser.goal());

            MiniJavaEvaluator evaluator = new MiniJavaEvaluator();
            evaluator.classesInfo = collector.classes;
            evaluator.visit(parser.mainClass().stmtBlock());

        //} else {
            System.out.println(parser.goal().toStringTree(parser));
        //}
    }
}
