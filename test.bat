rm -rf build/
mkdir build
cp src/ build/ -r
cp antlr-4.6-complete.jar build/src/
cd build/src/ && javac *.java && javac miniJava/*.java
java mjava ../../exampleProgram/binarySearch.java > ../binarySearch.txt
java mjava ../../exampleProgram/binaryTree.java > ../binaryTree.txt
java mjava ../../exampleProgram/quickSort.java > ../quickSort.txt
java mjava ../../exampleProgram/treeVisitor.java > ../treeVisitor.txt
java mjava ../../exampleProgram/linkedList.java > ../linkedList.txt
java mjava ../../exampleProgram/bubbleSort.java > ../bubbleSort.txt
java mjava ../../exampleProgram/factorial.java > ../factorial.txt
java mjava ../../exampleProgram/fib.java > ../fib.txt
java mjava ../../exampleProgram/linearSearch.java > ../linearSearch.txt
java mjava ../../exampleProgram/polymorphism.java > ../polymorphism.txt
diff ../polymorphism.txt ../../exampleProgram/polymorphism.txt
diff ../linearSearch.txt ../../exampleProgram/linearSearch.txt
diff ../fib.txt ../../exampleProgram/fib.txt
diff ../factorial.txt ../../exampleProgram/factorial.txt
diff ../bubbleSort.txt ../../exampleProgram/bubbleSort.txt
diff ../linkedList.txt ../../exampleProgram/linkedList.txt
diff ../binarySearch.txt ../../exampleProgram/binarySearch.txt
diff ../binaryTree.txt ../../exampleProgram/binaryTree.txt
diff ../quickSort.txt ../../exampleProgram/quickSort.txt
diff ../treeVisitor.txt ../../exampleProgram/treeVisitor.txt
cd ../../