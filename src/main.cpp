#include <iostream>
#include <fstream>

#include "antlr4-runtime/antlr4-runtime.h"

#include "MiniJava/MiniJavaParser.h"
#include "MiniJava/MiniJavaLexer.h"

#include "MyMiniJavaVisitor.h"

using namespace std;
using namespace MiniJava;
using namespace antlr4;

#pragma execution_character_set("utf-8")

int main(int argc, const char* argv[]) {
	ifstream ifs("../exampleMiniJavaProgram.minijava");
	if (!ifs.is_open()) return 1;

	ANTLRInputStream inputStream(ifs);

	MiniJavaLexer lexer(&inputStream);
	CommonTokenStream tokens(&lexer);
	MiniJavaParser parser(&tokens);

	tree::ParseTree *tree = parser.goal();
	MyMiniJavaVisitor visitor;
	//tree::ParseTreeVisitor::visit(tree);
	//visitor.visit(tree);

	cout << tree->toStringTree(&parser) << endl;

	return 0;
}