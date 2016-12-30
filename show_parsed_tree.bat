rm build/ -rf
mkdir build/
cp src/MiniJava.g4 build/
cd build/
antlr ./MiniJava.g4 && javac *.java && grun MiniJava goal -gui ../exampleMiniJavaProgram.minijava && cd ../