grammar BetterAdvGm;
//Main Rule
prog: buffernode EOF;

buffernode: setup inBlock*;

//Setup Rules
setup: KEYWORD_SETUP CURLY_LEFT (locationsetup /* playersetup | playersetup locationsetup */) CURLY_RIGHT;
//locationsetup: KEYWORD_LOCATIONARRAY SQUARE_LEFT (VAR_NAME COMMA_SEPERATOR)* VAR_NAME SQUARE_RIGHT END_STMT;
locationsetup: KEYWORD_LOCATIONS ASSIGN_OPERATOR CURLY_LEFT (locationmapping)+ CURLY_RIGHT END_STMT;
locationmapping: VAR_NAME ARROW_OPERATOR (VAR_NAME COMMA_SEPERATOR)* VAR_NAME END_STMT;

//Base Rules
inBlock: statement|expression|assign|declaration;
expression: expression (TIMES_OPERATOR|DIVISION_OPERATOR) expression
          | expression (PLUS_OPERATOR|MINUS_OPERATOR) expression
          | VAR_NAME (TIMES_OPERATOR|DIVISION_OPERATOR) expression
          | VAR_NAME (PLUS_OPERATOR | MINUS_OPERATOR) expression
          | expression (TIMES_OPERATOR|DIVISION_OPERATOR) VAR_NAME
          | expression (PLUS_OPERATOR | MINUS_OPERATOR) VAR_NAME
          | VAR_NAME (TIMES_OPERATOR|DIVISION_OPERATOR) VAR_NAME
          | VAR_NAME (PLUS_OPERATOR | MINUS_OPERATOR) VAR_NAME
          | NUM;



statement: text_statement | input_statement | if_statement | travel_statement | choice_statement;
assign: int_assign | string_assign | input_assign | location_assign;
declaration: int_declaration END_STMT | string_declaration END_STMT| location_declaration END_STMT;

//Statement Rules
text_statement: KEYWORD_TEXT ((STRING|VAR_NAME) PLUS_OPERATOR)* (STRING | VAR_NAME) END_STMT;
input_statement: KEYWORD_INPUT ((STRING|VAR_NAME) PLUS_OPERATOR)* (STRING | VAR_NAME) END_STMT;
if_statement: KEYWORD_IF PAREN_LEFT predicate PAREN_RIGHT CURLY_LEFT inBlock+ CURLY_RIGHT else_if_statement* else_statement? END_STMT;
else_if_statement: KEYWORD_ELSEIF PAREN_LEFT predicate PAREN_RIGHT CURLY_LEFT inBlock+ CURLY_RIGHT;
else_statement: KEYWORD_ELSE CURLY_LEFT inBlock CURLY_RIGHT;
travel_statement: TRAVEL_KEYWORD VAR_NAME END_STMT;
choice_statement: KEYWORD_CHOICE CURLY_LEFT (option_statment)+ CURLY_RIGHT END_STMT;
option_statment: (VAR_NAME |STRING) CURLY_LEFT inBlock+ CURLY_RIGHT END_STMT;

//Assign Rules
//TODO: Compund assign rules
int_assign: (VAR_NAME (ASSIGN_OPERATOR | COMPOUND_OPERATOR) expression END_STMT
            | int_declaration ASSIGN_OPERATOR expression END_STMT
            | int_declaration ASSIGN_OPERATOR input_statement
            );
string_assign: (VAR_NAME ASSIGN_OPERATOR STRING END_STMT | string_declaration ASSIGN_OPERATOR STRING END_STMT);
input_assign: (VAR_NAME ASSIGN_OPERATOR input_statement | string_declaration ASSIGN_OPERATOR input_statement);
location_assign: (VAR_NAME ASSIGN_OPERATOR '{' inBlock* '}' END_STMT
               | location_declaration ASSIGN_OPERATOR '{' inBlock* '}' END_STMT);

//Declaration Rules
int_declaration: KEYWORD_INT VAR_NAME;
string_declaration: KEYWORD_STRING VAR_NAME;
location_declaration: KEYWORD_LOCATION VAR_NAME;

//Special Rules
predicate: (VAR_NAME BOOL_CMP_OPERATOR STRING | STRING BOOL_CMP_OPERATOR VAR_NAME 
         | VAR_NAME (CMP_OPERATOR | BOOL_CMP_OPERATOR) VAR_NAME
         | VAR_NAME (CMP_OPERATOR | BOOL_CMP_OPERATOR) expression 
         | expression (CMP_OPERATOR | BOOL_CMP_OPERATOR) VAR_NAME 
         | expression (CMP_OPERATOR | BOOL_CMP_OPERATOR) expression) 
         | predicate (AND_OPERATOR | OR_OPERATOR) predicate
         | VAR_NAME BOOL_CMP_OPERATOR BOOL
         | BOOL BOOL_CMP_OPERATOR VAR_NAME
         | VAR_NAME
         | BOOL;

//Lexer Rules
fragment LETTERS   : [a-zA-Z];
WHITESPACE         : (' ' | '\t' | '\n' | '\r')+ -> skip;
KEYWORD_TEXT       : 'Text ';
KEYWORD_STRING     : 'string ';
END_STMT           : ';';
STRING             : '"' ~('"')* '"';
TRAVEL_KEYWORD     : 'Travel ';
INCREMENT          : '++';
CURLY_LEFT         : '{';
CURLY_RIGHT        : '}';
PAREN_LEFT         : '(';
PAREN_RIGHT        : ')';
SQUARE_LEFT        : '[';
SQUARE_RIGHT       : ']';
KEYWORD_INPUT      : 'userInput';
KEYWORD_INT        : 'int';
KEYWORD_IF         : 'if';
KEYWORD_ELSE       : 'else';
KEYWORD_ELSEIF     : 'else if';
KEYWORD_WHILE      : 'while';
KEYWORD_FOR        : 'for';
KEYWORD_LOCATION   : 'Location';
KEYWORD_SETUP      : 'setup';
KEYWORD_LOCATIONARRAY: 'LocationArray';
KEYWORD_LOCATIONS  : 'Locations';
KEYWORD_CHOICE     : 'choice';
COMMA_SEPERATOR    : ',';
BOOL_CMP_OPERATOR  : ('==' | 'is' | '!=' | 'is not');
CMP_OPERATOR       : ('greater than' | 'lesser than' |'<' | '>' | '<=' | '>=');
ASSIGN_OPERATOR    : '=';
COMPOUND_OPERATOR  : '+=';
TIMES_OPERATOR     : '*';
DIVISION_OPERATOR  : '/';
PLUS_OPERATOR      : '+';
MINUS_OPERATOR     : '-';
ARROW_OPERATOR     : '->';
AND_OPERATOR       : ('&&' | 'and' | 'AND');
OR_OPERATOR        : ('||'| 'or' | 'OR');
BOOL               : ('true' | 'false');
NUM                : [0-9]+;
VAR_NAME           : (LETTERS | '_')+;
