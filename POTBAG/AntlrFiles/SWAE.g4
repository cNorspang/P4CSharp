grammar SWAE;
//Main Rule
prog: buffernode EOF;

buffernode: setup inBlock*;

//Setup Rules
setup: KEYWORD_SETUP CURLY_LEFT locationsetup playersetup CURLY_RIGHT;
//locationsetup: KEYWORD_LOCATIONARRAY SQUARE_LEFT (variable COMMA_SEPERATOR)* variable SQUARE_RIGHT END_STMT;
locationsetup: KEYWORD_LOCATIONS ASSIGN_OPERATOR CURLY_LEFT (locationmapping)+ CURLY_RIGHT;
locationmapping: variable ARROW_OPERATOR (variable COMMA_SEPERATOR)* variable END_STMT;
playersetup: KEYWORD_PLAYER ASSIGN_OPERATOR CURLY_LEFT (assign)+ CURLY_RIGHT;


//Base Rules
inBlock: statement|expression|assign|declaration;
/* //old version
expression: expression (TIMES_OPERATOR|DIVISION_OPERATOR) expression
          | expression (PLUS_OPERATOR|MINUS_OPERATOR) expression
          | variable (TIMES_OPERATOR|DIVISION_OPERATOR) expression
          | variable (PLUS_OPERATOR | MINUS_OPERATOR) expression
          | expression (TIMES_OPERATOR|DIVISION_OPERATOR) variable
          | expression (PLUS_OPERATOR | MINUS_OPERATOR) variable
          | variable (TIMES_OPERATOR|DIVISION_OPERATOR) variable
          | variable (PLUS_OPERATOR | MINUS_OPERATOR) variable
          | NUM;
          */

expression: expression (TIMES_OPERATOR|DIVISION_OPERATOR) expression
          | expression (PLUS_OPERATOR|MINUS_OPERATOR) expression
          | PAREN_LEFT expression PAREN_RIGHT
          | variable
          | random
          | NUM;


statement: text_statement | input_statement | if_chain_statement | travel_statement | choice_statement | while_statement;
assign: anonymous_assign | int_assign | string_assign | bool_assign | input_assign | location_assign;
declaration: int_declaration END_STMT | string_declaration END_STMT | bool_declaration END_STMT | location_declaration END_STMT;

//Statement Rules
text_statement: KEYWORD_TEXT ((string_obj|variable) PLUS_OPERATOR)* (string_obj | variable) END_STMT;
input_statement: KEYWORD_INPUT ((string_obj|variable) PLUS_OPERATOR)* (string_obj | variable) END_STMT;
if_chain_statement: if_statement else_if_statement* else_statement?;
if_statement: KEYWORD_IF PAREN_LEFT predicate PAREN_RIGHT CURLY_LEFT inBlock+ CURLY_RIGHT;
else_if_statement: KEYWORD_ELSEIF PAREN_LEFT predicate PAREN_RIGHT CURLY_LEFT inBlock+ CURLY_RIGHT;
else_statement: KEYWORD_ELSE CURLY_LEFT inBlock+ CURLY_RIGHT;
travel_statement: TRAVEL_KEYWORD variable END_STMT;
choice_statement: KEYWORD_CHOICE CURLY_LEFT (option_statment)+ CURLY_RIGHT;
option_statment: (PAREN_LEFT predicate PAREN_RIGHT)? (variable |string_obj) CURLY_LEFT inBlock+ CURLY_RIGHT;
while_statement: KEYWORD_WHILE PAREN_LEFT predicate PAREN_RIGHT CURLY_LEFT inBlock+ CURLY_RIGHT;

//Assign Rules
//TODO: Compund assign rules
anonymous_assign: variable ASSIGN_OPERATOR variable END_STMT;
int_assign: (variable (ASSIGN_OPERATOR | COMPOUND_OPERATOR) expression END_STMT
            | int_declaration ASSIGN_OPERATOR expression END_STMT
            | int_declaration ASSIGN_OPERATOR input_statement
            );
string_assign: (variable ASSIGN_OPERATOR string_obj END_STMT | string_declaration ASSIGN_OPERATOR string_obj END_STMT);
input_assign: (variable ASSIGN_OPERATOR input_statement | string_declaration ASSIGN_OPERATOR input_statement);
location_assign: (variable ASSIGN_OPERATOR CURLY_LEFT inBlock* CURLY_RIGHT
               | location_declaration ASSIGN_OPERATOR CURLY_LEFT inBlock* CURLY_RIGHT);
bool_assign: (variable ASSIGN_OPERATOR bool_obj END_STMT | bool_declaration ASSIGN_OPERATOR bool_obj END_STMT); 

//Declaration Rules
int_declaration: KEYWORD_INT variable;
string_declaration: KEYWORD_STRING variable;
location_declaration: KEYWORD_LOCATION variable;
bool_declaration: KEYWORD_BOOL variable;
//Special Rules
predicate: (variable BOOL_CMP_OPERATOR string_obj
         | string_obj BOOL_CMP_OPERATOR variable
         | variable (CMP_OPERATOR | BOOL_CMP_OPERATOR) variable
         | variable (CMP_OPERATOR | BOOL_CMP_OPERATOR) expression
         | expression (CMP_OPERATOR | BOOL_CMP_OPERATOR) variable
         | expression (CMP_OPERATOR | BOOL_CMP_OPERATOR) expression)
         | predicate (AND_OPERATOR | OR_OPERATOR) predicate
         | variable BOOL_CMP_OPERATOR bool_obj
         | bool_obj BOOL_CMP_OPERATOR variable
         | variable
         | bool_obj;

random: KEYWORD_RANDOM PAREN_LEFT expression COMMA_SEPERATOR expression PAREN_RIGHT;

variable: VAR_NAME | dot_notaion;
string_obj: STRING;
bool_obj: BOOL;
dot_notaion: KEYWORD_PLAYER DOT VAR_NAME;

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
KEYWORD_BOOL       : 'bool';
KEYWORD_INPUT      : 'userInput';
KEYWORD_INT        : 'int';
KEYWORD_IF         : 'if';
KEYWORD_ELSE       : 'else';
KEYWORD_ELSEIF     : 'else if';
KEYWORD_WHILE      : 'while';
KEYWORD_FOR        : 'for';
KEYWORD_LOCATION   : 'Location';
KEYWORD_SETUP      : 'setup';
KEYWORD_PLAYER     : 'player';
KEYWORD_LOCATIONARRAY: 'LocationArray';
KEYWORD_LOCATIONS  : 'Locations';
KEYWORD_CHOICE     : 'choice';
KEYWORD_RANDOM     : 'Roll';
COMMA_SEPERATOR    : ',';
DOT                : '.';
BOOL_CMP_OPERATOR  : ('==' | 'is' | '!=' | 'is not');
CMP_OPERATOR       : ('greater than' | 'lesser than' |'<' | '>' | '<=' | '>=');
ASSIGN_OPERATOR    : '=';
COMPOUND_OPERATOR  : ('+=' | '-=' | '*=' | '/=');
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
COMMENT           : '//';