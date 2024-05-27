parser grammar Anasint;

options{
tokenVocab=Analex;
}

programa: instruccion+;
instruccion: (CA etiqueta CC)? instruccion_basica;

instruccion_basica: incremento | decremento | condicional | skip;

incremento: variable ASIGNA variable MAS UNO;
decremento: variable ASIGNA variable MENOS UNO;
condicional: IF variable DISTINTO CERO GOTO etiqueta;
skip: variable ASIGNA variable;

variable: var_entrada | var_salida | var_trabajo;
var_entrada: X | VAR_ENTRADA;
var_salida: Y;
var_trabajo: Z | VAR_TRABAJO;

etiqueta: LETRA | ETIQUETA;