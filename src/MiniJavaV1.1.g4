grammar MiniJava;

goal : main_class (class_declaration)* ;

main_class : 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{' stmt '}' '}' ;

class_declaration : 'class' ID ('extends' ID)? '{' (var_declaration)* (method_declaration)* '}' ;
var_declaration : type ID ';' ;
method_declaration : 'public' type ID '(' (type ID (',' type ID)* )? ')' '{' (var_declaration)* (stmt)* 'return' exp ';' '}' ;

type : 'int' '[' ']' | 'boolean' | 'int' | ID ;

stmt : '{' (stmt)* '}'
    | 'if' '(' exp ')' stmt 'else' stmt
    | 'while' '(' exp ')' stmt
    | 'System.out.println' '(' exp ')' ';'
    | ID '=' exp ';'
    | ID '[' exp ']' '=' exp ';' ;

exp : exp '[' exp ']'
    | exp '.' 'length'
    | exp '.' ID '(' (exp (',' exp)* )? ')'
    | exp ('&&' | '<' | '+' | '-' | '*') exp
    | INT
    | 'true'
    | 'false'
    | ID
    | 'this'
    | 'new' 'int' '[' exp ']'
    | 'new' ID '(' ')'
    | '!' exp
    | '(' exp ')' ;

ID : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
