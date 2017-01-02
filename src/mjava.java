/**
 * Created by ougar_000 on 2016/12/29.
 */

import java.io.*;
import java.nio.file.*;

import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.*;
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

        MiniJavaLexer lexer = new MiniJavaLexer(new ANTLRInputStream(sentence)) {/*
            @Override public Token emit() {
                switch (getType()) {
                    case INVALID_ID:
                        // setType(ID);
                        Token result = super.emit();
                        int line = result.getLine(), charPos = result.getCharPositionInLine();
                        CliUtil.errHeader("Lexical", line, charPos);
                        String source = result.getInputStream().toString();
                        CliUtil.underlineError(source, result, line, charPos);
                        return result;
                    default:
                        return super.emit();
                }
            }*/
        };
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexerErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorListener());
        parser.setErrorHandler(new DefaultErrorStrategy() {
            @Override
            public void reportInputMismatch(Parser recognizer, InputMismatchException e) {
                String msg = "mismatched input " + getTokenErrorDisplay(e.getOffendingToken());
                IntervalSet expectedTokens = e.getExpectedTokens();
                String[] tokenNames = recognizer.getTokenNames();
                Vocabulary voc = VocabularyImpl.fromTokenNames(tokenNames);
                String expectingTokenString = expectedTokens.toString(voc);
                Token token = e.getOffendingToken();
                if(expectingTokenString.contains("';'")) {
                    // missing ';' after declaration
                    msg += ". maybe missing ';' before that token. Has been fixed.";
                    int line = token.getLine(), charPos = token.getCharPositionInLine();
                    CliUtil.errHeader("Syntax", line, charPos);
                    CliUtil.underlineError(recognizer, token, line, charPos);
                    System.err.printf("\t%s\n\n", msg);
                    return;
                }
                msg += " expecting one of " + expectingTokenString;
                recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
            }
        });
        parser.setBuildParseTree(true);

        MiniJavaBaseListener treeSaver = new MiniJavaBaseListener() {
            @Override public void enterGoal (MiniJavaParser.GoalContext ctx){
                root = ctx;
            }
        };
        ParseTreeWalker.DEFAULT.walk(treeSaver, parser.goal());

        if(parser.getNumberOfSyntaxErrors() != 0) {
            System.err.println("There are errors. Break.");
            System.exit(1);
            return;
        }

        SymbolCollector collector = new SymbolCollector();
        collector.visit(root);

        TypeChecker checker = new TypeChecker();
        checker.classes = collector.classes;
        checker.visit(root);

        if(parser.getNumberOfSyntaxErrors() != 0 || collector.hasSyntaxError || checker.hasError) {
            System.err.println("There are errors. Break.");
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
