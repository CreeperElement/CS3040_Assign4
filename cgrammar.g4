grammar cgrammar;

program: MAIN OPENPAREN CLOSEPAREN block EOF;

block: OPENBRACK varDecl* statement* CLOSEBRACK;

varDecl
    : 'int' identifier ';'
        {from cparse import addVariable}
        {addVariable($identifier.value)}
;

statement:
    identifier '=' expr ';'
    | 'if' OPENPAREN expr CLOSEPAREN statement 'else' statement
    | 'if' OPENPAREN expr CLOSEPAREN statement
    | 'while' OPENPAREN expr CLOSEPAREN statement
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
