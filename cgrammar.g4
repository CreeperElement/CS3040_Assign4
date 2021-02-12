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
        {addVariable($identifier.value)}
    | 'int' identifier ';' varDecl
        {from cparse import addVariable}
        {addVariable($identifier.value)}
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

identifier returns [string value]
    : Alpha restOfIdentifier
        {$value = $Alpha.text + $restOfIdentifier.value}
    | Alpha
        {$value = $Alpha.text}
    ;

restOfIdentifier returns [string value]
    : alphaNum restOfIdentifier
        {$value = $alphaNum.value + $restOfIdentifier.value}
    | alphaNum
        {$value = $alphaNum.value}
    ;

alphaNum returns [string value]
    : Alpha
        {$value = $Alpha.text}
    | Digit
        {$value = $Digit.text}
    ;

Alpha: 'a' .. 'z' | 'A' .. 'Z';

Digit: '0' .. '9';

OPENBRACK: '{';
CLOSEBRACK: '}';

OPENPAREN: '(';
CLOSEPAREN: ')';

MAIN: 'main';

WS: [ \r\n\t] + -> channel (HIDDEN);
