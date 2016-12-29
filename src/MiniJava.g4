grammar MiniJava;

goal : main_class (class_declaration)* ;

main_class : 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' stmt_block '}' ;

class_declaration : 'class' ID ('extends' ID)? '{' (var_declaration)* (method_declaration)* '}' ;
var_declaration : type ID ';' ;
method_declaration : 'public' type ID '(' (type ID (',' type ID)* )? ')' '{' (stmt)* 'return' exp ';' '}' ;

type : 'int' '[' ']' | 'boolean' | 'int' | ID ;

stmt_block : '{' (stmt)* '}' ;

stmt : var_declaration
    | 'if' '(' exp ')' stmt 'else' stmt
    | 'while' '(' exp ')' stmt
    | 'System.out.println' '(' exp ')' ';'
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

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
int_literal : INT_HEX | INT_BIN | INT_DEC ;
INT_HEX : '0x'[0-9a-fA-F]+ ;
INT_BIN : '0b'[01]+;
INT_DEC : [+-]?[0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
