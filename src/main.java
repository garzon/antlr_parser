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

    public static MiniJavaParser.GoalContext root;

    public static void main(String[] args) throws IOException {
        //String sentence = new String(Files.readAllBytes(Paths.get(args[1])));
        String sentence = new String(Files.readAllBytes(Paths.get("D:/exampleMiniJavaProgram.minijava")));

        MiniJavaLexer lexer = new MiniJavaLexer(
                new ANTLRInputStream(sentence)
        );
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);
        parser.setBuildParseTree(true);

        MiniJavaBaseListener treeSaver = new MiniJavaBaseListener() {
            @Override public void enterGoal (MiniJavaParser.GoalContext ctx){
                root = ctx;
            }
        };
        ParseTreeWalker.DEFAULT.walk(treeSaver, parser.goal());

        SymbolCollector collector = new SymbolCollector();
        collector.visit(root);

        TypeChecker checker = new TypeChecker();
        checker.classes = collector.classes;
        checker.visit(root);

        if(collector.hasSyntaxError || checker.hasSyntaxError) {
            System.err.println("There are syntax errors. Cannot execute the program.");
            return;
        }

        //if(args.length > 2 && args[1].equals("run")) {
            Evaluator evaluator = new Evaluator();
            evaluator.classes = collector.classes;
            if(evaluator.visit(root.mainClass()).isError()) System.err.println("Runtime Error");
        //} else {
            System.out.println(root.toStringTree(parser));
        //}
    }
}
