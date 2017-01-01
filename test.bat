cp src/ build/ -r
cd build/src/ && javac *.java && javac miniJava/*.java
java mjava ../../exampleProgram/binarySearch.java > ../binarySearch.txt
java mjava ../../exampleProgram/binaryTree.java > ../binaryTree.txt
java mjava ../../exampleProgram/quickSort.java > ../quickSort.txt
java mjava ../../exampleProgram/treeVisitor.java > ../treeVisitor.txt
diff ../binarySearch.txt ../../exampleProgram/binarySearch.txt
diff ../binaryTree.txt ../../exampleProgram/binaryTree.txt
diff ../quickSort.txt ../../exampleProgram/quickSort.txt
diff ../treeVisitor.txt ../../exampleProgram/treeVisitor.txt
cd ../../