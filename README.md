# MiniJava Interpreter
An interpreter of (a superset of) MiniJava language powered by ANTLR V4.6

## Demo
Input program:
```java
class MiniJava {
    public static void main(String[] args) {
        Seq seq = new Seq().Seq(15);
        for(int i=0; i<=15; i+=1)
            System.out.println(seq.get_fib(i));
        System.out.println(seq.fib_saver);
    }
}

class Seq {
    int[] fib_saver;
    
    // function behave like a constructor
    public Seq Seq(int n) {
        fib_saver = new int[n+1];
        fib_saver[1] = 1;
        fib_saver[0] = 1;
        for(int j=2; j<=n; j+=1)
            this.calc_fib(j);
        return this;
    }
    
    public int get_fib(int i) {
        return this.fib_saver[i];
    }
    
    private void calc_fib(int i) {
        fib_saver[i] = fib_saver[i-1] + fib_saver[i-2];
    }
}
```

Got output:
```
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
[int(1), int(1), int(2), int(3), int(5), int(8), int(13), int(21), int(34), int(55), int(89), int(144), int(233), int(377), int(610), int(987)]
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
    | 'return' exp #return
;

stmt : varDeclaration #var
    | stmtBlock #block
    | 'if' '(' exp ')' t_stmt=stmt ('else' f_stmt=stmt)? #if
    | 'while' '(' exp ')' stmt #while
    | 'for' '(' start_stmt=stmt exp ';' step_stmt=stmtBody ')' body=stmt #for
    | systemCallName='System.out.println' '(' exp ')' ';' #systemCall
    | stmtBody ';' #normalStmt
    | ';' #emptyStmt
;

exp : intLiteral #literal
    | boolLiteral #literal
    | '(' exp ')' #dummy

    | id=exp '.' ID '(' (exp (',' exp)* )? ')' #getMethod
    | id=exp '.' 'length' #getLength
    | id=exp '.' ID #getProperty
    | id=exp '[' idx=exp ']' #indexOf

    | op=('!' | '+' | '-' | '~') first=exp #unaryOp
    | first=exp op=('*' | '/' | '%') second=exp #binaryOp
    | first=exp op=('+' | '-') second=exp #binaryOp
    | first=exp op=('<<' | '>>' | '>>>') second=exp #binaryOp
    | first=exp op=('<' | '>' | '<=' | '>=' | 'instanceof') second=exp #binaryOp
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

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
INT_HEX : '0x'[0-9a-fA-F]+ ;
INT_BIN : '0b'[01]+;
INT_DEC : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
COMMENT : '//'~[\r\n]* -> skip;
```