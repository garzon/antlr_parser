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

public class mjava {

    public static MiniJavaParser.GoalContext root;

    public static void main(String[] args) throws IOException {
        if(args.length == 0) {
            System.out.println("Usage: java mjava MINIJAVA_SOURCE [OPTION=--tree]");
            System.exit(0);
            return;
        }

        String sentence = new String(Files.readAllBytes(Paths.get(args[0])));

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

        if(parser.getNumberOfSyntaxErrors() != 0) {
            System.err.println("There are syntax errors. Break.");
            System.exit(1);
            return;
        }

        SymbolCollector collector = new SymbolCollector();
        collector.visit(root);

        TypeChecker checker = new TypeChecker();
        checker.classes = collector.classes;
        checker.visit(root);

        if(collector.hasSyntaxError || checker.hasSyntaxError) {
            System.err.println("There are syntax errors. Break.");
            System.exit(2);
            return;
        }

        if(args.length > 1 && args[1].equals("--tree")) {
            System.out.println(root.toStringTree(parser));
        } else {
            CliUtil.isRuntime = true;
            Evaluator evaluator = new Evaluator();
            evaluator.classes = collector.classes;
            if(evaluator.visit(root.mainClass()).isError()) {
                System.err.println("Runtime Error");
                System.exit(3);
                return;
            }
        }

        System.exit(0);
    }
}
