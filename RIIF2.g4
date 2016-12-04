// §RIIF-2 language

grammar RIIF2;
//TODO: some of the attribute tokens are necessary some of them are not
//TODO: Build Object with HashTable (VariableTable)
//TODO: predicate ?

//TODO: attribute name that reserved are not presented as keywords because they are only as keywords as attribute name


program
    : typeDeclaration+ EOF
    ;

// §RIIF-2 declaration types

typeDeclaration
    : componentDeclaration
    | templateDeclaration      //RIIF-2: template
    | environmentDeclaration
    | requirementDeclaration
    ;

// §RIIF-2-v4 Component

componentDeclaration
    : COMPONENT Identifier
      (EXTENDS extendsList)?
      (IMPLEMENTS implementsList)?  ';'
      componentBodyElement*
      END_COMPONENT
    ;

componentBodyElement
    : fieldDeclaration
    | childComponentDeclaration
    | failModeDeclaration
    | assignment
    | setTemplate
    | assertion
    ;

fieldDeclaration
    : typeType fieldElement ';'
    | associativeInstanceDeclarator ';'
    | associativeInstanceAttributeDeclarator ';'
    ;

fieldElement
    : primitiveFieldDeclarator
    | associativeDeclarator // Identifier '[' ']'
    ;

childComponentDeclaration
    : CHILD_COMPONENT childComponentDeclarator ';'
    ;

failModeDeclaration
    : FAIL_MODE failModeDeclarator ';'
    ;

assignment
    : ASSIGN assignmentDeclarator ';'
    ;

setTemplate
    : SET assignmentDeclarator ';'
    ;

assertion
    : ASSERT (assignmentVariableAttributeId) ('<' | '>') expression ';'
    ;

// §RIIF-2-v4 template

templateDeclaration
    : TEMPLATE Identifier ( EXTENDS Identifier)? ';'
      templateBodyElement*
      END_TEMPLATE
    ;

templateBodyElement
    : abstractFieldDeclaration
    | abstractFailModeDeclaration
    | abstractPlatformDeclaration
    | imposeDeclaration
    ;

abstractFieldDeclaration
    : ABSTRACT fieldDeclaration
    ;

abstractFailModeDeclaration
    : ABSTRACT failModeDeclaration
    ;

abstractPlatformDeclaration
    : ABSTRACT PLATFORM Identifier ';'
    ;

imposeDeclaration
    : IMPOSE imposeDeclarator ';'
    ;

// §RIIF-2-v4 environment

environmentDeclaration
    : ENVIRONMENT Identifier ';'
      environmentBodyElement*
      END_ENVIRONMENT
    ;

environmentBodyElement
    : assignment
    | envParameterDeclaration
    ;

envParameterDeclaration
    : (INPUT|OUTPUT) PARAMETER variableId ':' primitiveType (':=' expression)? ';'
    ;

requirementDeclaration
    : REQUIREMENT Identifier ';'
      assertion*
      END_REQUIREMENT
    ;

// §RIIF-2-v4 Declarators

primitiveFieldDeclarator
    : primitiveFieldDeclaratorId  // Identifier
      ( ':' primitiveType ( ':=' primitiveFieldInitializer )?
      | ':' TYPE_TABLE            //Tables are not allowed assigned in-line ?
      | ':=' listInitializer
      )
    ;

associativeDeclarator
    : associativeDeclaratorId
    ;

associativeInstanceDeclarator
    : associativeInstanceDeclaratorId (':=' associativeInstanceDeclaratorInitializer )?
    ;

childComponentDeclarator
    : childComponentDeclaratorType childComponentDeclaratorId vector?
    ;

failModeDeclarator
    : primitiveFieldDeclaratorId // Identifier
    | associativeDeclaratorId   //Identifier '[' ']'
    | associativeInstanceDeclaratorId // Identifier '[' Identifier ']'
    ;

assignmentDeclarator
    : assignmentDeclaratorId vector? '=' assignmentInitializer
    ;

imposeDeclarator
    : imposeDeclaratorId '=' imposeInitializer
    ;

associativeInstanceAttributeDeclarator
    : associativeInstanceAttributeDeclaratorId
    ;

// §RIIF-2-v4 Initializers

primitiveFieldInitializer
    : expression
    ;

imposeInitializer
    : assignmentInitializer
    ;

associativeInstanceDeclaratorInitializer
    : assignmentInitializer
    ;

listInitializer
    : '{' item ( ','item )* '}'
    ;

arrayInitializer
    : '[' item ( ',' item )* ']'
    ;

assignmentInitializer
    : item
    ;

// §RIIF-2-v4.1 Ids

childComponentDeclaratorId
    : Identifier
    ;

primitiveFieldDeclaratorId
    : Identifier
    ;

associativeDeclaratorId
    : Identifier '[' ']'
    ;

associativeInstanceDeclaratorId
    : Identifier '[' Identifier ']'
    ;

associativeInstanceAttributeDeclaratorId
    : associativeInstanceDeclaratorId
      '\'' Identifier
    ;

variableId
    : primitiveFieldDeclaratorId
    | associativeInstanceDeclaratorId
    ;

assignmentDeclaratorId
    : assignmentVariableId
    | assignmentVariableAttributeId
    | assignmentTableItemId
    ;

assignmentVariableId
    : ( Identifier '.' )* variableId //either variables in current scope or hierachical
    ;

assignmentVariableAttributeId
    : assignmentVariableId
      '\'' Identifier  // notice that some of the identifier should be necessarily required
    ;

assignmentTableItemId
    : assignmentVariableAttributeId  // this identifier has to be ITEMS
     '[' ('#'| Identifier) ']'
     '[' Identifier ']'
    ;

imposeDeclaratorId
    : assignmentDeclaratorId
    ;

// §RIIF-2-v4 Type

primitiveType
    : TYPE_FLOAT
    | TYPE_INTEGER
    | TYPE_STRING
    | Identifier
    | enumType
    ;

typeType
    : PARAMETER
    | CONSTANT
    ;

enumType
    : TYPE_ENUM '{' Identifier ( ',' Identifier)* '}'
    ;

item
    : arrayInitializer
    | listInitializer
    | expression
    ;

childComponentDeclaratorType
    : Identifier
    ;

vector
    : '[' expression ':' expression ']'
    ;

identifierList
    : Identifier ( ',' Identifier )*
    ;

extendsList
    : identifierList
    ;

implementsList
    : identifierList
    ;

/*RIIF-2: ANTlr.4 expression (Same with JAVA)*/

expression
    : primary
    | ('+'|'-') expression
    | ('~'|'!') expression
    | expression ( '*' | '/' | '%' ) expression
    | expression ( '-' | '+' ) expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression ('<=' | '>=' | '>' | '<') expression
    | expression ('==' | '!=') expression
    | expression '&' expression
    | expression '^' expression
    | expression '|' expression
    | expression '&&' expression
    | expression '||' expression
    | expression '?' expression ':' expression
    | <assoc=right> expression
      (   '='
      |   '+='
      |   '-='
      |   '*='
      |   '/='
      |   '&='
      |   '|='
      |   '^='
      |   '>>='
      |   '>>>='
      |   '<<='
      |   '%='
      )
      expression
    ;

primary
    : '(' expression ')'
    | SELF
    | Identifier // for user defined or enum
    | assignmentDeclaratorId
    | literal
    | funcCall
    | arrayInitializer
    ;

/*Literal*/
literal
    : StringLiteral
    | DecimalLiteral
    | FloatingPointLiteral
    ;

funcCall
    : funcName '(' funcArg ( ',' funcArg ) ? ')'
    ;

funcName
    : FUNC_LOG
    | FUNC_EXP
    | FUNC_AGG_SINGLE
    | FUNC_GT_N_FAIL
    ;

funcArg
    : (assignmentDeclaratorId) vector
    | expression
    ;

// Lexer

// §RIIF-2-v4 Keywords

COMPONENT: 'component';
END_COMPONENT: 'endcomponent';
ENVIRONMENT: 'environment';
END_ENVIRONMENT: 'endenvironment';
REQUIREMENT: 'requirement';
END_REQUIREMENT: 'endrequirement';
CHILD_COMPONENT: 'child_component';
FAIL_MODE: 'fail_mode';
EXTENDS: 'extends';
ASSIGN: 'assign';
ASSERT: 'assert';
INPUT: 'input';
OUTPUT: 'output';
PARAMETER: 'parameter';
CONSTANT: 'constant';
TYPE_FLOAT: 'float';
TYPE_INTEGER: 'integer';
TYPE_STRING: 'string';
TYPE_ENUM: 'enum';
FUNC_AGG_SINGLE: 'agg_single_fail';
FUNC_GT_N_FAIL: 'agg_gt_n_fail';
FUNC_LOG: 'LOG';
FUNC_EXP: 'EXP';
//Second part
TEMPLATE: 'template';
END_TEMPLATE: 'endtemplate';
IMPOSE: 'impose';
ABSTRACT: 'abstract';
IMPLEMENTS: 'implements';
SELF: 'self';
SET: 'set';
TYPE_TABLE: 'table';
PLATFORM: 'platform';

/*Identification */
Identifier
    : (LETTER) (LETTER|DIGIT|UNDERSCORE)*
    ;

/*Literal Tokens */
StringLiteral
    : '"' ( ~('\\' | '"') )* '"'
    ;

FloatingPointLiteral
    : DIGIT+ '.' DIGIT* Exponent? FloatTypeSuffix?
    | '.' DIGIT+ Exponent? FloatTypeSuffix?
    | DIGIT+ Exponent FloatTypeSuffix?
    ;

DecimalLiteral
    : DIGIT+
    ;

WS: (' ' | '\r' | '\t' |' \u000C' | '\n' ) ->channel(HIDDEN) ;

COMMENT
    : '/*' .*? '*/'  ->channel(HIDDEN)
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN)
    ;

fragment
DIGIT: '0'..'9';
fragment
LETTER: ( 'a'..'z' | 'A'..'Z' );
fragment
UNDERSCORE: '_';
fragment
EscapeSequence
    : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    | UnicodeEscape
    | OctalEscape
    ;
fragment
OctalEscape
    : '\\' ('0'..'3')('0'..'7')('0'..'7')
    | '\\' ('0'..'7')('0'..'7')
    | '\\' ('0'..'7')
    ;
fragment
HexDigit
    : ('0'..'9' | 'a'..'f' | 'A'..'F')
    ;
fragment
UnicodeEscape
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
fragment
Exponent
    : ('e'|'E')('+'|'-')?DIGIT+
    ;
fragment
FloatTypeSuffix
    : ('f'|'F'|'d'|'D')
    ;