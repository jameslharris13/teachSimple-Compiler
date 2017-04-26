grammar teachSimple;

program
    : programName
      block
	|functionDeclaration
    ;
	
programName
    : 'PROGRAM' identifier (LPAREN identifierList RPAREN)? 
    | 'UNIT' identifier 
	; 

identifier
    : IDENT
    ;

block
	: (labelDeclarationPart
    | typeDefinitionPart
    | variableDeclarationPart
	| constantDefinitionPart
    | functionDeclaration
	| 'IMPLEMENTATION'
    )*
    compoundStatement
	;

labelDeclarationPart
    : 'LABEL' label ( COMMA label )* 
    ;
	
label
    : Integer
    ;

constantDefinitionPart
    : 'CONST' constantDefinition ( SEMI constantDefinition )* 
    ;

constantDefinition
    : identifier ASSIGN constant COLON type
    ;

constantChr
    : 'CHR' LPAREN (unsignedInteger|identifier) RPAREN
    ;

constant
    : Integer
    | sign unsignedNumber
    | identifier
    | sign identifier
    | string
    | constantChr
    ;

unsignedNumber
    : unsignedInteger
	;
	
unsignedInteger
	: NUM_INT
	;

Integer
    : NUM_INT
    ;

Double
	: NUM_DOUBLE
	;
	
sign
    : PLUS | MINUS
    ;
	
string
    : STRING
    ;

	
typeDefinitionPart
   : 'TYPE' typeDefinition
   ;

typeDefinition
   : identifier ASSIGN
    ( type
    | functionType
    )
    ;
	
functionType
    : 'FUNCTION' (formalParameterList)? COLON resultType
    ;

type
    : simpleType
    | structuredType
    ;

simpleType
    : typeIdentifier
    | stringtype
    ;

typeIdentifier
    : identifier
    | 'CHAR'
    | 'BOOLEAN'
    | 'INTEGER'
	| 'DOUBLE'
    | 'STRING'
    ;

structuredType
    : 'PACKED' unpackedStructuredType
	| unpackedStructuredType
    ;
	
unpackedStructuredType
    : arrayType
    ;

stringtype
    : 'STRING' LPAREN (identifier|unsignedNumber) RPAREN
    ;
	
arrayType
    : 'ARRAY' LBRACK label RBRACK 'OF' componentType
	;
	
typeList
  : indexType ( COMMA indexType )*
  ;
 
indexType
    : simpleType
    ;
	
componentType
    : type
    ;
		
variableDeclarationPart
    : 'VAR'  variableDeclaration ( COMMA variableDeclaration )* 
    ;
	
variableDeclaration
    : identifierList COLON type
    ;
		
functionDeclaration
    : 'FUNCTION'? identifier (formalParameterList)? COLON? resultType?
      ( block )?
    ;

formalParameterList
    : LPAREN formalParameterSection ( COMMA formalParameterSection )* RPAREN
    ;
	
formalParameterSection
    : parameterGroup
    | 'VAR' parameterGroup
    | 'FUNCTION' parameterGroup
    ;
	
parameterGroup
    : identifierList typeIdentifier
    ;

identifierList
    : identifier ( COMMA identifier )*
    ;
	
constList
	: constant ( COMMA constant) *
	;
	
resultType
    : typeIdentifier
    ;
	
statement
    : label WHITESPACE unlabelledStatement
    | unlabelledStatement
    ;

unlabelledStatement
    : simpleStatement
    | structuredStatement
    ;

exitStatement
    : 'EXIT'
    ;
	
simpleStatement
    : assignmentStatement
	| functionStatement
    | exitStatement
	| emptyStatement
	| commentStatement
	| incrementStatement
    | write
    | read
    ;

assignmentStatement
    : variable ASSIGN expression
    ;
	
variable
    : (identifier
      )
      ( LBRACK expression ( COMMA expression)* RBRACK
      | DOT identifier
      )*
    ;

expression
    : simpleExpression
    ( (EQUAL | NOT_EQUAL | NUM_INT | NUM_DOUBLE| LT | LE | GE | GT | 'IN')? simpleExpression )*
    ;

simpleExpression
    : term ( (PLUS | MINUS | 'OR')? term )*
    ;

term
  : signedFactor ((STAR | SLASH | ASSIGN | 'DIV' | 'MOD' | 'AND' | LE | GT)? signedFactor )*
  ;

signedFactor
    : (PLUS|MINUS)? factor
    ;

factor
    : variable
    | LPAREN expression RPAREN
    | functionDesignator
    | unsignedConstant
    | set
	| Integer
	| Double
    | 'NOT' factor
    ;
	
unsignedConstant
	: unsignedNumber
	| constantChr
	| string
	| 'NIL'
	;

functionDesignator
    : identifier LPAREN parameterList RPAREN
    ;
	
parameterList
    : actualParameter ( COMMA actualParameter )*
    ;
	
set
    : LBRACK elementList RBRACK
    ;
	
elementList
    : element ( COMMA element )*
	|
    ;
	
element
    : expression ( DOTDOT expression )?
    ;

functionStatement
	: identifier ( LPAREN parameterList RPAREN )?
	;
	
actualParameter
    : expression (COMMA unsignedInteger)?
    ;

emptyStatement
	:
	;

empty
	: // Nothing 
	;
	
structuredStatement
    : compoundStatement
    | conditionalStatement
    | repetetiveStatement
    ;

compoundStatement
    : 'BEGIN'
    statements
      'END'
    ;

statements
    : statement (SEMI statement )*
    ;

conditionalStatement
    : ifStatement
    | switchStatement
    ;

ifStatement
    : 'IF' expression 'THEN' statement
      (
     'ELSE' statement
    )?
    ;
	
switchStatement
    : 'SWITCH' expression 'ON'
      ('CASE' label COLON caseListElement)+?
      ( 'ELSE' statements )?
      'END'
    ;
	
caseListElement
    : constList? statement
    ;

repetetiveStatement
    : whileStatement
    | repeatStatement
	| loopRepeatStatement
    | forStatement
    ;
	
whileStatement
    : 'WHILE' expression 'DO' statement
    ;

repeatStatement
    : 'REPEAT' statements 'UNTIL' expression
    ;

loopRepeatStatement
	:  'LOOP' Integer statements
	;
	
forStatement
    : 'FOR' identifier ASSIGN forList 'DO' statement
    ;

forList
    : initialValue ('TO' | 'DOWNTO') finalValue
    ;

initialValue
	: Integer
    ;

finalValue
    : Integer
    ;
	
read
    : ('Read'| 'read') LPAREN? (string|variable|expression|STRING|constant)? RPAREN?
    ;
write 
    : ('Write'|'write') LPAREN  (string|expression|STRING|constant)  RPAREN
    ;	
	
commentStatement
	: COMMENT (string|variable|expression|STRING|constant|label| WHITESPACE)*
	;

incrementStatement
    : (string|variable|expression|STRING|constant|label|WHITESPACE)* PLUS PLUS
	;
	
IDENT  
	:  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
	;

NUM_INT
  : ('0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9')+
  ;
 
NUM_DOUBLE
	: ('0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9')+ DOT ('0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9')+
	;
COMMENT
   :   SLASH SLASH
   ;
	
STRING
  : '\'' ('\'\'' | ~('\''))* '\''
  ;
 
COLON			
: ':' 
;

PLUS            
: '+' 
;

MINUS           
: '-' 
;

STAR            
: '*' 
;

SLASH           
: '/' 
;

ASSIGN         
 : '='
 ;

COMMA          
 : ',' 
 ;

SEMI         
 : ';' 
   ;
EQUAL         
  : '==' 
  ;
NOT_EQUAL     
  : '!=' 
  ;
LT             
: '<' 
 ;
LE           
  : '<=' 
  ;
GE             
 : '>='
 ;
GT            
  : '>'  
  ;
LPAREN         
 : '(' 
 ;
RPAREN       
  : ')'  
  ;
LBRACK       
  : '['  
  ;
RBRACK      
: ']'  
;
WHITESPACE 		
: [ \t\r\n]+ -> skip
;

DOT             
: '.'
;

DOTDOT         
 : '..'
 ;
