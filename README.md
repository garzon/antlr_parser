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

## Grammar

Please refer to `src/MiniJava.g4` to get more details.

```
grammar MiniJava;

goal : mainClass (classDeclaration)* EOF;

mainClass : 'class' className=ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' args=ID ')' stmtBlock '}' ;

classDeclaration : 'class' className=ID ('extends' parentName=ID)? '{' (declaration)* '}' ;
declaration : propertyDeclaration | methodDeclaration ;
propertyDeclaration : varDeclaration ;
varDeclaration : type ID ('=' exp)? ';' ;
permissionDesc : 'public' | 'private' ;
argPair : type ID ;
methodDeclaration : permissionDesc? returnType=type methodName=ID '(' (argPair (',' argPair)* )? ')' stmtBlock ;

type : arrType | basicType;
arrType : basicType '[' ']' ;
basicType : 'boolean' | 'int' | 'void' | ID;

stmtBlock : '{' (stmt)* '}' ;

assignSym : '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&='
    | '|=' | '^=' | '<<=' | '>>=' | '>>>='
;

stmtBody : ID assignSym v=exp #assign
    | ID '[' idx=exp ']' assignSym v=exp #setIndexOf
    | exp #stmtExp
    | prop=exp assignSym exp #assignToExp
    | 'return' exp #return
;

stmt : varDeclaration #var
    | stmtBlock #block
    | 'if' '(' exp ')' t_stmt=stmt ('else' f_stmt=stmt)? #if
    | 'while' '(' exp ')' stmt #while
    | 'for' '(' start_stmt=stmt exp ';' step_stmt=stmtBody ')' body=stmt #for
    | systemCallName='System.out.println' lpar='(' exp rpar=')' ';' #systemCall
    | systemCallName='System.out.println' exp ';' #systemCall
    | stmtBody ';' #normalStmt
    | ';' #emptyStmt
;

exp : intLiteral #literal
    | boolLiteral #literal
    | '(' exp ')' #dummy
    | '(' exp #missingRP

    | id=exp '.' ID '(' (exp (',' exp)* )? ')' #getMethod
    | id=exp '.' 'length' #getLength
    | id=exp '.' ID #getProperty
    | id=exp '[' idx=exp ']' #indexOf

    | op=('!' | '+' | '-' | '~') first=exp #unaryOp
    | first=exp op=('*' | '/' | '%') second=exp #binaryOp
    | first=exp op=('+' | '-') second=exp #binaryOp
    | first=exp op=('<<' | '>>' | '>>>') second=exp #binaryOp
    | first=exp op=('<' | '>' | '<=' | '>=') second=exp #binaryOp
    | first=exp op=('==' | '!=') second=exp #binaryOp
    | first=exp op='&' second=exp #binaryOp
    | first=exp op='^' second=exp #binaryOp
    | first=exp op='|' second=exp #binaryOp
    | first=exp op='&&' second=exp #logicBinaryOp
    | first=exp op='||' second=exp #logicBinaryOp
    | first=exp op='?' second=exp ':' third=exp #ternaryOp

    | 'this' #this
    | 'new' basicType '[' exp ']' #newArr
    | 'new' ID '(' ')' #newExp
    | ID #id
;

boolLiteral : 'true' | 'false' ;
intLiteral : INT_HEX | INT_BIN | INT_DEC ;

WS : [ \t\r\n]+ -> skip ;
COMMENT : '//'~[\r\n]* -> skip;

INT_HEX : '0x'[0-9a-fA-F]+ ;
INT_BIN : '0b'[01]+;
INT_DEC : [0-9]+ ;

ID : [a-zA-Z_][a-zA-Z_0-9]*;
```