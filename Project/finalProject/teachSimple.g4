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

	
	
	
exitStatement
    : 'EXIT'
    ;

	
	
block
   : ( labelDeclarationPart
    | typeDefinitionPart
    | variableDeclarationPart
    | functionDeclaration
    )*
    compoundStatement
    ;
	
	
	
	
labelDeclarationPart
    : 'LABEL' label ( COMMA label )*
    ;

	
	
	
label
    : Integer
    ;

	
	
	
constant
    : unsignedNumber
    | sign unsignedNumber
    | identifier
    | sign identifier
    | string
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
	
	
	
	
typeDefinitionPart
   : 'TYPE' typeDefinition ( SEMI typeDefinition )* SEMI
   ;

   
   
   
typeDefinition
   : identifier EQUAL
    ( type
    | functionType
    )
    ;

	
	
	
functionType
    : 'FUNCTION' (formalParameterList)? COMMA resultType
    ;

	
	
	
functionDeclaration
    : 'FUNCTION' identifier (formalParameterList)? WHITESPACE resultType 
      ( block )
    ;

resultType
    : typeIdentifier
    ;
	
	
type
    : simpleType
    | structuredType
    ;
	
	
	
structuredType
    : 'PACKED' unpackedStructuredType
   | unpackedStructuredType
    ;

	
	
unpackedStructuredType
    : arrayType
    ;
	
	
	
	
simpleType
    : typeIdentifier
    | stringtype
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
	
	
	
typeIdentifier
    : identifier
    | 'CHAR'
    | 'BOOLEAN'
    | 'INTEGER'
    | 'STRING'
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
  
  
  
  
  
identifierList
    : identifier ( COMMA identifier )*
    ;

	
	
	
string
    : STRING
    ;
	
sign
    : PLUS | MINUS
    ;
	
	
	
	
variableDeclarationPart
    : 'VAR'  variableDeclaration ( COMMA variableDeclaration )* 
    ;
	
variableDeclaration
    : identifierList WHITESPACE type
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
    : statement ( SEMI statement )*
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
    : 'CASE' expression
        caseListElement (caseListElement )*?
      ( 'ELSE' statements )?
      'END'
    ;

	
	
	
caseListElement
    : constList statement
    ;

constList
    : constant ( COMMA constant )*
    ;
	
statement
    : label WHITESPACE unlabelledStatement
    | unlabelledStatement
    ;
	
	
	
	
unlabelledStatement
    : simpleStatement
    | structuredStatement
    ;

simpleStatement
    : assignmentStatement
    | exitStatement
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
    | string
    | 'NIL'
    ;

	
	
	
functionDesignator
    : identifier LPAREN parameterList RPAREN
    ;
	
parameterList
    : actualParameter ( COMMA actualParameter )*
    ;
	
actualParameter
    : expression (COMMA unsignedInteger)?
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
    : ('Read'| 'read') LPAREN? (string|variable|expression)? RPAREN?
    ;

write 
    : ('Write'|'Write'|'write') LPAREN  (string|expression|STRING|constant)  RPAREN
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
: ' '  
;

DOT             
: '.'
;

DOTDOT         
 : '..'
 ;
