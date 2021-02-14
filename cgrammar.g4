grammar cgrammar;

program
    : MAIN OPENPAREN CLOSEPAREN block EOF
        {from cparse import printVariables}
        {printVariables()}
    ;

block
    : OPENBRACK varDecl multiStatement CLOSEBRACK
    | OPENBRACK varDecl CLOSEBRACK
    | OPENBRACK multiStatement CLOSEBRACK
    | OPENBRACK CLOSEBRACK
    ;

varDecl
    : 'int' identifier ';'
        {from cparse import addVariable}
        {addVariable($identifier.text)}
    | 'int' identifier ';' varDecl
        {from cparse import addVariable}
        {addVariable($identifier.text)}
    ;

multiStatement
    : statement multiStatement
    | statement
    ;

statement:
    identifier '=' expr ';'
    | 'if' OPENPAREN expr CLOSEPAREN statement 'else' statement
        {from cparse import addIf}
        {addIf()}
    | 'if' OPENPAREN expr CLOSEPAREN statement
        {from cparse import addIf}
        {addIf()}
    | 'while' OPENPAREN expr CLOSEPAREN statement
        {from cparse import addWhile}
        {addWhile()}
    | block
    | ';'
    ;

expr
    : term '+' expr
    | term;

term:
    factor '*' term
    | factor;

factor
    : identifier
    | literal
    | OPENPAREN expr CLOSEPAREN
    ;

literal
    : Digit Digit*
    ;

identifier
    : Alpha restOfIdentifier
    | Alpha
    ;

restOfIdentifier
    : alphaNum restOfIdentifier
    | alphaNum
    ;

alphaNum returns [string value]
    : Alpha
        {$value = $Alpha.text}
    | Digit
        {$value = $Digit.text}
    | '_'
        {$value = '_'}
    ;

Alpha: [a-z] | [A-Z];

Digit: [0-9];

OPENBRACK: '{';
CLOSEBRACK: '}';

OPENPAREN: '(';
CLOSEPAREN: ')';

MAIN: 'main';

WS: [ \r\n\t] + -> channel (HIDDEN);
