# MiniJava Interpreter
An interpreter of (a superset of) MiniJava language powered by ANTLR V4.6

## Demo
Input program:
```java
class MiniJava {
    public static void main(String[] args) {
        // polymorphism
        Seq seq = new FactorialSeq();
        int l = 99999999;
        for(l=0; l<=5; l+=1)
            System.out.println(seq.get(l));
        seq = new FibSeq().FibSeq(10);
        int j = 7;
        for(l=0; l<=j; l+=1)
            System.out.println(seq.get(l));
    }
}

class Seq {
    public int get(int i) { return -1; }
    private void calc(int i) { }
}

class FactorialSeq extends Seq {
    public int get(int i) {
        if(i < 2) return 1;
        else return this.get(i-1)*i;
    }
}

class FibSeq extends Seq {
    int[] saver;
    
    // a function that behaves like a constructor
    public FibSeq FibSeq(int n) {
        saver = new int[n+1];
        saver[1] = 1;
        saver[0] = 1;
        for(int j=2; j<=n; j+=1)
            this.calc(j);
        return this;
    }
    
    public int get(int i) {
        return this.saver[i];
    }
    
    private void calc(int i) {
        saver[i] = saver[i-1] + saver[i-2];
    }
}
```

Got output:
```
1
1
2
6
24
120
1
1
2
3
5
8
13
21
```

## Get Started

Platform:    
Linux 3.19.0-69-generic #77~14.04.1-Ubuntu x86_64 GNU/Linux    
java/javac version 1.7.0_55

```
git clone https://github.com/garzon/miniJavaInterpreter.git
cd miniJavaInterpreter
mkdir build
cp src/ build/ -r
cp antlr-4.6-complete.jar build/src/
cd build/src/
javac -classpath ./*.jar -d ./ miniJava/*.java *.java
java -classpath "$(pwd):$(pwd)/antlr-4.6-complete.jar" mjava ../../exampleMiniJavaProgram.java
```

## Usage

`java mjava MINIJAVA_SOURCE [OPTION=--tree]`
- Run mini java program without any OPTION
- Print the lisp-style AST with `--tree` option

## Extra features

#### Interpreter features

- Correct output(with bugs somewhere..?)
- COMPLETE static type checking
- Friendly syntax, semantic and runtime error message
```
[Semantic ERR] Line 3, Char 32:
        Seq err = new Seq().Seq(false);
                                ^^^^^
	Type error: 'int' expected, got 'boolean'

[Semantic ERR] Line 5, Char 16:
        Seq a = new NotExistClass();
                ^^^
	class 'NotExistClass' undefined

[Semantic ERR] Line 10, Char 27:
        System.out.println seq.calc_fib(10);
                           ^^^
	Cannot access private method 'Seq.calc_fib'.

[Syntax ERR] Line 12, Char 16:
        int z = seq.do_not_exist;
                ^^^
	Property 'do_not_exist' of class 'Seq' not found.

[Semantic ERR] Line 14, Char 8:
        if(shouldBeBool) {
        ^^
	Type error: 'boolean' expected, got 'int'
```

#### Language features

- For statememt
```java
for(l=0; l<=15; l+=1)
    System.out.println(seq.get_fib(l));
```

- Private method
```java
class FibSeq extends Seq {
    private void calc_fib() { }
}
```

- Assign when declaring everywhere
```java
if(true) {
    int i = 1;
    return 1;
    int k = 2;
}
int i = 2;
```

- All java operators
```java
int i = (1 ^ 2 & 3) > 4 ? 5 : 6;
```

- Integer literals
```java
int i = 0xDEADBEEF; int j = 0b01010101;
```

- Polymorphism
```java
ReturnValClass res = new Return1();
System.out.println(res.get()); // output: 1
res = new Return2();
System.out.println(res.get()); // output: 2
class ReturnValClass{}
class Return1 extends ReturnValClass{public int get(){return 1;}}
class Return2 extends ReturnValClass{public int get(){return 2;}}
```

- Etc...