parser grammar Anasint;

options{
tokenVocab=Analex;
}

programa: instruccion+ prog*;
instruccion: (CA etiqueta CC)? instruccion_basica;

instruccion_basica: incremento | decremento | condicional | asignacion | salto_incondicional;

incremento: variable ASIGNA variable MAS UNO;
decremento: variable ASIGNA variable MENOS UNO;
condicional: IF condicion GOTO etiqueta;
asignacion: variable ASIGNA (variable|macro|godel);
salto_incondicional: GOTO etiqueta;


variable: var_entrada | var_salida | var_trabajo;
var_entrada: X | VAR_ENTRADA;
var_salida: Y;
var_trabajo: Z | VAR_TRABAJO;
variables: variable (COMA variables)?;

etiqueta: LETRA | ETIQUETA;

condicion: (variable DISTINTO CERO) | macro;

macro: ID_FUNCION PA variables PC;
godel: INI_GODEL PA PROGRAM_LABEL PC;

prog: prog_label instruccion+;
prog_label: HASHTAG PROGRAM_LABEL HASHTAG;
