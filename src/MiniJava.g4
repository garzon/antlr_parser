grammar MiniJava;

goal : mainClass (classDeclaration)* EOF;

mainClass : 'class' className=ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' args=ID ')' stmtBlock '}' ;

classDeclaration : 'class' className=ID ('extends' parentName=ID)? '{' (declaration)* '}' ;
declaration : propertyDeclaration | methodDeclaration ;
propertyDeclaration : varDeclaration ;
varDeclaration : type ID ';' ;
permissionDesc : 'public' | 'private' ;
argPair : type ID ;
methodDeclaration : permissionDesc? returnType=type methodName=ID '(' (argPair (',' argPair)* )? ')' stmtBlock ;

type : arrType | basicType ;
arrType : basicType '[' ']' ;
basicType : 'boolean' | 'int' | ID ;

stmtBlock : '{' (stmt)* '}' ;

assignSym : '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&='
    | '|=' | '^=' | '<<=' | '>>=' | '>>>='
;

stmt : varDeclaration #var
    | stmtBlock #block
    | 'if' '(' exp ')' t_stmt=stmt ('else' f_stmt=stmt)? #if
    | 'while' '(' exp ')' stmt #while
    | systemCallName='System.out.println' '(' exp ')' ';' #systemCall
    | 'return' exp ';' #return
    | ID assignSym v=exp ';' #assign
    | ID '[' idx=exp ']' assignSym v=exp ';' #setIndexOf
;

exp : intLiteral #literal
    | boolLiteral #literal
    | '(' exp ')' #dummy

    | id=exp '[' idx=exp ']' #indexOf
    | id=exp '.' ID '(' (exp (',' exp)* )? ')' #getMethod
    | id=exp '.' 'length' #getLength

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
COMMENT : '//'[^\n]*[\n] -> skip;