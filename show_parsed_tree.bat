cp src/MiniJava.g4 science/garzon/antlr/
cd science/garzon/antlr/
antlr ./MiniJava.g4 && javac *.java && grun MiniJava goal -gui ../../../exampleMiniJavaProgram.minijava && cd ../../..