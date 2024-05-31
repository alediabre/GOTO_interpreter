// Generated from Anasint.g4 by ANTLR 4.13.1
package org.lenguajegoto;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(Anasint.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(Anasint.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instruccion_basica}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_basica(Anasint.Instruccion_basicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instruccion_basica}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_basica(Anasint.Instruccion_basicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(Anasint.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(Anasint.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#decremento}.
	 * @param ctx the parse tree
	 */
	void enterDecremento(Anasint.DecrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#decremento}.
	 * @param ctx the parse tree
	 */
	void exitDecremento(Anasint.DecrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#skip}.
	 * @param ctx the parse tree
	 */
	void enterSkip(Anasint.SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#skip}.
	 * @param ctx the parse tree
	 */
	void exitSkip(Anasint.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Anasint.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Anasint.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#var_entrada}.
	 * @param ctx the parse tree
	 */
	void enterVar_entrada(Anasint.Var_entradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#var_entrada}.
	 * @param ctx the parse tree
	 */
	void exitVar_entrada(Anasint.Var_entradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#var_salida}.
	 * @param ctx the parse tree
	 */
	void enterVar_salida(Anasint.Var_salidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#var_salida}.
	 * @param ctx the parse tree
	 */
	void exitVar_salida(Anasint.Var_salidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#var_trabajo}.
	 * @param ctx the parse tree
	 */
	void enterVar_trabajo(Anasint.Var_trabajoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#var_trabajo}.
	 * @param ctx the parse tree
	 */
	void exitVar_trabajo(Anasint.Var_trabajoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#etiqueta}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta(Anasint.EtiquetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#etiqueta}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta(Anasint.EtiquetaContext ctx);
}