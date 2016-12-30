grammar MiniJava;

goal : mainClass (classDeclaration)* EOF;

mainClass : 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' stmtBlock '}' ;

permissionDesc : 'public' | 'protected' | 'private' ;

classDeclaration : permissionDesc? 'class' ID ('extends' ID)? '{' (declaration)* '}' ;
declaration : varDeclaration | methodDeclaration ;
varDeclaration : type ID ';' ;
methodDeclaration : permissionDesc? type ID '(' (type ID (',' type ID)* )? ')' stmtBlock ;

type : 'int' '[' ']' | 'boolean' | 'int' | ID ;

stmtBlock : '{' (stmt)* '}' ;

assignSym : '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&='
    | '|=' | '^=' | '<<=' | '>>=' | '>>>='
;

stmt : varDeclaration #var
    | stmtBlock #block
    | 'if' '(' exp ')' stmt ('else' stmt)? #if
    | 'while' '(' exp ')' stmt #while
    | systemCallName='System.out.println' '(' exp ')' ';' #systemCall
    | 'return' exp ';' #return
    | ID assignSym v=exp ';' #assign
    | ID '[' idx=exp ']' assignSym v=exp ';' #setIndexOf
;

exp : intLiteral #literal
    | ID #id
    | '(' exp ')' #dummy
    | id=exp '[' idx=exp ']' #indexOf
    | id=exp '.' 'length' #getLength
    | id=exp '.' ID '(' (exp (',' exp)* )? ')' #getMethod
    | op=('!' | '+' | '-' | '~') first=exp #unaryOp
    | first=exp op=('*' | '/' | '%') second=exp #binaryOp
    | first=exp op=('+' | '-') second=exp #binaryOp
    | first=exp op=('<<' | '>>' | '>>>') second=exp #binaryOp
    | first=exp op=('<' | '>' | '<=' | '>=' | 'instanceof') second=exp #binaryOp
    | first=exp op=('==' | '!=') second=exp #binaryOp
    | first=exp op='&' second=exp #binaryOp
    | first=exp op='^' second=exp #binaryOp
    | first=exp op='|' second=exp #binaryOp
    | first=exp op='&&' second=exp #binaryOp
    | first=exp op='||' second=exp #binaryOp
    | first=exp '?' second=exp ':' third=exp #ternaryOp
    | boolLiteral #literal
    | 'this' #this
    | 'new' 'int' '[' exp ']' #newIntArr
    | 'new' ID '(' ')' #newExp
;

boolLiteral : 'true' | 'false' ;
intLiteral : INT_HEX | INT_BIN | INT_DEC ;

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
INT_HEX : '0x'[0-9a-fA-F]+ ;
INT_BIN : '0b'[01]+;
INT_DEC : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
