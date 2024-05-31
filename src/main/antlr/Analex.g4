// Analizador léxico lenguaje GOTO
lexer grammar Analex;

BLANCO: ' ' -> skip;
TABULADOR: '\t' -> skip;
FIN_LINEA: '\r'?'\n' -> skip;

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

fragment DIGITO: [0-9];
LETRA: [A-E];

//PALABRAS RESERVADAS
IF: 'IF';
GOTO: 'GOTO';

//CARACTERES ESPECIALES
PA: '(';
PC: ')';
CA: '[';
CC: ']';
ASIGNA: '<-';
DISTINTO: '!=';
MAS : '+';
MENOS: '-';
UNO: '1';
CERO: '0';
X: 'X';
Y: 'Y';
Z: 'Z';

//GENERELADIDADES
NUMERO: DIGITO+;
VAR_ENTRADA: X NUMERO;
VAR_TRABAJO: Z NUMERO;
ETIQUETA: LETRA NUMERO;
