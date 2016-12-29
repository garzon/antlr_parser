grammar MiniJava;

goal : main_class (class_declaration)* ;

main_class : 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' stmt_block '}' ;

permission_desc : 'public' | 'protected' | 'private' ;

class_declaration : permission_desc? 'class' ID ('extends' ID)? '{' (declaration)* '}' ;
declaration : var_declaration | method_declaration ;
var_declaration : type ID ';' ;
method_declaration : permission_desc? type ID '(' (type ID (',' type ID)* )? ')' stmt_block ;

type : 'int' '[' ']' | 'boolean' | 'int' | ID ;

stmt_block : '{' (stmt)* '}' ;

stmt : var_declaration
    | stmt_block
    | 'if' '(' exp ')' stmt ('else' stmt)?
    | 'while' '(' exp ')' stmt
    | 'System.out.println' '(' exp ')' ';'
    | 'return' exp ';'
    | ID '=' exp ';'
    | ID '[' exp ']' '=' exp ';'
;

exp : int_literal
    | ID
    | exp '[' exp ']'
    | exp '.' 'length'
    | exp '.' ID '(' (exp (',' exp)* )? ')'
    | exp ('*' | '/') exp
    | exp ('+' | '-') exp
    | exp ('<' | '>' | '<=' | '>=' | '==' | '!=') exp
    | '!' exp
    | exp ('&&' | '||') exp
    | 'true'
    | 'false'
    | 'this'
    | 'new' 'int' '[' exp ']'
    | 'new' ID '(' ')'
    | '(' exp ')'
;

int_literal : INT_HEX | INT_BIN | INT_DEC ;

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
INT_HEX : '0x'[0-9a-fA-F]+ ;
INT_BIN : '0b'[01]+;
INT_DEC : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
