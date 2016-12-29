grammar MiniJava;

goal : mainClass (classDeclaration)* ;

mainClass : 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' stmtBlock '}' ;

permissionDesc : 'public' | 'protected' | 'private' ;

classDeclaration : permissionDesc? 'class' ID ('extends' ID)? '{' (declaration)* '}' ;
declaration : varDeclaration | methodDeclaration ;
varDeclaration : type ID ';' ;
methodDeclaration : permissionDesc? type ID '(' (type ID (',' type ID)* )? ')' stmtBlock ;

type : 'int' '[' ']' | 'boolean' | 'int' | ID ;

stmtBlock : '{' (stmt)* '}' ;

assignSym : '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&='
    | '|=' | '^=' | '~=' | '<<=' | '>>=' | '>>>='
;

stmt : varDeclaration
    | stmtBlock
    | 'if' '(' exp ')' stmt ('else' stmt)?
    | 'while' '(' exp ')' stmt
    | 'System.out.println' '(' exp ')' ';'
    | 'return' exp ';'
    | ID assignSym exp ';'
    | ID '[' exp ']' assignSym exp ';'
;

exp : intLiteral
    | ID
    | '(' exp ')'
    | exp '[' exp ']'
    | exp '.' 'length'
    | exp '.' ID '(' (exp (',' exp)* )? ')'
    | ('!' | '+' | '-' | '~') exp
    | exp ('*' | '/' | '%') exp
    | exp ('+' | '-') exp
    | exp ('<<' | '>>' | '>>>') exp
    | exp ('<' | '>' | '<=' | '>=' | 'instanceof') exp
    | exp ('==' | '!=') exp
    | exp '&' exp
    | exp '^' exp
    | exp '|' exp
    | exp '&&' exp
    | exp '||' exp
    | exp '?' exp ':' exp
    | 'true'
    | 'false'
    | 'this'
    | 'new' 'int' '[' exp ']'
    | 'new' ID '(' ')'
;

intLiteral : INT_HEX | INT_BIN | INT_DEC ;

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
INT_HEX : '0x'[0-9a-fA-F]+ ;
INT_BIN : '0b'[01]+;
INT_DEC : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
