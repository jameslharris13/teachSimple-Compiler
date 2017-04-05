grammar teachSimple;

program
    : programName
     block
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
    : identifier EQUAL constant
    ;

constantChr
    : 'CHR' LPAREN (unsignedInteger|identifier) RPAREN
    ;

constant
    : unsignedNumber
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
	
sign
    : PLUS | MINUS
    ;
	
string
    : STRING
    ;

	
typeDefinitionPart
   : 'TYPE' typeDefinition ( SEMI typeDefinition )* 
   ;

typeDefinition
   : identifier EQUAL
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
    : 'ARRAY' LBRACK typeList RBRACK 'OF' componentType
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
    : 'FUNCTION' identifier (formalParameterList)? COLON resultType 
      ( block )
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
    | exitStatement
	| emptyStatement
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
    ( (EQUAL | NOT_EQUAL | LT | LE | GE | GT | 'IN') simpleExpression )*
    ;

simpleExpression
    : term ( (PLUS | MINUS | 'OR') term )*
    ;

term
  : signedFactor ( (STAR | SLASH | 'DIV' | 'MOD' | 'AND') signedFactor )*
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
    : 'CASE' expression 'OF'
        caseListElement (caseListElement )* ?
      ( 'ELSE' statements )?
      'END'
    ;
	
caseListElement
    : constList statement
    ;

repetetiveStatement
    : whileStatement
    | repeatStatement
    | forStatement
    ;
	
whileStatement
    : 'WHILE' expression 'DO' statement
    ;

repeatStatement
    : 'REPEAT' identifier  LBRACK  statements RBRACK
    ;

forStatement
    : 'FOR' identifier ASSIGN forList 'DO' statement
    ;

forList
    : initialValue ('TO' | 'DOWNTO') finalValue
    ;

initialValue
    : expression
    ;

finalValue
    : expression
    ;
	
read
    : ('Read'| 'read') LPAREN? (string|variable|expression|STRING|constant)? RPAREN?
    ;

write 
    : ('Write'|'write') LPAREN  (string|expression|STRING|constant)  RPAREN
    ;	
	
IDENT  
	:  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
	;

NUM_INT
  : ('0'..'9')+
  ;
 
COMMENT
   :   SLASH STAR .*? STAR SLASH
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
