#include <iostream>
#include <fstream>

#include "antlr4-runtime/antlr4-runtime.h"

#include "MiniJava/MiniJavaParser.h"
#include "MiniJava/MiniJavaLexer.h"

using namespace std;
using namespace MiniJava;
using namespace antlr4;

int main(int argc, const char* argv[]) {
	//String sentence = new String(Files.readAllBytes(Paths.get("d:/exampleMiniJavaProgram.minijava")));

	string sourceCode;
	ifstream ifs("../exampleMiniJavaProgram.minijava");
	Antlr

	MiniJavaLexer lexer(ifs);

	CommonTokenStream tokens = new CommonTokenStream(lexer);

	MiniJavaParser parser = new MiniJavaParser(tokens);
	ParseTree tree = parser.goal();

	MiniJavaVisitor visitor = new MiniJavaVisitor();
	visitor.visit(tree);

	System.out.println();
}