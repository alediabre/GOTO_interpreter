// Generated from Anasint.g4 by ANTLR 4.13.1
package org.lenguajegoto;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(Anasint.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instruccion_basica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_basica(Anasint.Instruccion_basicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(Anasint.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecremento(Anasint.DecrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#salto_incondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalto_incondicional(Anasint.Salto_incondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Anasint.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#var_entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_entrada(Anasint.Var_entradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#var_salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_salida(Anasint.Var_salidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#var_trabajo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_trabajo(Anasint.Var_trabajoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#etiqueta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiqueta(Anasint.EtiquetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(Anasint.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#godel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGodel(Anasint.GodelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Anasint.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#prog_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_label(Anasint.Prog_labelContext ctx);
}