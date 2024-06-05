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
	 * Enter a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#salto_incondicional}.
	 * @param ctx the parse tree
	 */
	void enterSalto_incondicional(Anasint.Salto_incondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#salto_incondicional}.
	 * @param ctx the parse tree
	 */
	void exitSalto_incondicional(Anasint.Salto_incondicionalContext ctx);
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
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(Anasint.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(Anasint.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(Anasint.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#godel}.
	 * @param ctx the parse tree
	 */
	void enterGodel(Anasint.GodelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#godel}.
	 * @param ctx the parse tree
	 */
	void exitGodel(Anasint.GodelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Anasint.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Anasint.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#prog_label}.
	 * @param ctx the parse tree
	 */
	void enterProg_label(Anasint.Prog_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#prog_label}.
	 * @param ctx the parse tree
	 */
	void exitProg_label(Anasint.Prog_labelContext ctx);
}