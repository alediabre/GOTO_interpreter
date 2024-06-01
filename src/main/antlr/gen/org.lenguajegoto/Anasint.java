// Generated from Anasint.g4 by ANTLR 4.13.1
package org.lenguajegoto;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Anasint extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, COMMENT=4, LINE_COMMENT=5, LETRA=6, 
		IF=7, GOTO=8, PA=9, PC=10, CA=11, CC=12, ASIGNA=13, DISTINTO=14, MAS=15, 
		MENOS=16, UNO=17, CERO=18, X=19, Y=20, Z=21, INI_FUNCION=22, COMA=23, 
		NUMERO=24, VAR_ENTRADA=25, VAR_TRABAJO=26, ETIQUETA=27, ID_FUNCION=28;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_instruccion_basica = 2, 
		RULE_incremento = 3, RULE_decremento = 4, RULE_condicional = 5, RULE_asignacion = 6, 
		RULE_salto_incondicional = 7, RULE_variable = 8, RULE_var_entrada = 9, 
		RULE_var_salida = 10, RULE_var_trabajo = 11, RULE_variables = 12, RULE_etiqueta = 13, 
		RULE_condicion = 14, RULE_macro = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "instruccion_basica", "incremento", "decremento", 
			"condicional", "asignacion", "salto_incondicional", "variable", "var_entrada", 
			"var_salida", "var_trabajo", "variables", "etiqueta", "condicion", "macro"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\t'", null, null, null, null, "'IF'", "'GOTO'", "'('", 
			"')'", "'['", "']'", "'<-'", "'!='", "'+'", "'-'", "'1'", "'0'", "'X'", 
			"'Y'", "'Z'", "'_'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "COMMENT", "LINE_COMMENT", 
			"LETRA", "IF", "GOTO", "PA", "PC", "CA", "CC", "ASIGNA", "DISTINTO", 
			"MAS", "MENOS", "UNO", "CERO", "X", "Y", "Z", "INI_FUNCION", "COMA", 
			"NUMERO", "VAR_ENTRADA", "VAR_TRABAJO", "ETIQUETA", "ID_FUNCION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Anasint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Anasint(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				instruccion();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 104335744L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public Instruccion_basicaContext instruccion_basica() {
			return getRuleContext(Instruccion_basicaContext.class,0);
		}
		public TerminalNode CA() { return getToken(Anasint.CA, 0); }
		public EtiquetaContext etiqueta() {
			return getRuleContext(EtiquetaContext.class,0);
		}
		public TerminalNode CC() { return getToken(Anasint.CC, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CA) {
				{
				setState(37);
				match(CA);
				setState(38);
				etiqueta();
				setState(39);
				match(CC);
				}
			}

			setState(43);
			instruccion_basica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instruccion_basicaContext extends ParserRuleContext {
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public DecrementoContext decremento() {
			return getRuleContext(DecrementoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Salto_incondicionalContext salto_incondicional() {
			return getRuleContext(Salto_incondicionalContext.class,0);
		}
		public Instruccion_basicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_basica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstruccion_basica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstruccion_basica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstruccion_basica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_basicaContext instruccion_basica() throws RecognitionException {
		Instruccion_basicaContext _localctx = new Instruccion_basicaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion_basica);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				incremento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				decremento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				condicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				asignacion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				salto_incondicional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ASIGNA() { return getToken(Anasint.ASIGNA, 0); }
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public TerminalNode UNO() { return getToken(Anasint.UNO, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			variable();
			setState(53);
			match(ASIGNA);
			setState(54);
			variable();
			setState(55);
			match(MAS);
			setState(56);
			match(UNO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecrementoContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ASIGNA() { return getToken(Anasint.ASIGNA, 0); }
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public TerminalNode UNO() { return getToken(Anasint.UNO, 0); }
		public DecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementoContext decremento() throws RecognitionException {
		DecrementoContext _localctx = new DecrementoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			variable();
			setState(59);
			match(ASIGNA);
			setState(60);
			variable();
			setState(61);
			match(MENOS);
			setState(62);
			match(UNO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Anasint.IF, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(Anasint.GOTO, 0); }
		public EtiquetaContext etiqueta() {
			return getRuleContext(EtiquetaContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			condicion();
			setState(66);
			match(GOTO);
			setState(67);
			etiqueta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ASIGNA() { return getToken(Anasint.ASIGNA, 0); }
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			variable();
			setState(70);
			match(ASIGNA);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case X:
			case Y:
			case Z:
			case VAR_ENTRADA:
			case VAR_TRABAJO:
				{
				setState(71);
				variable();
				}
				break;
			case ID_FUNCION:
				{
				setState(72);
				macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Salto_incondicionalContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(Anasint.GOTO, 0); }
		public EtiquetaContext etiqueta() {
			return getRuleContext(EtiquetaContext.class,0);
		}
		public Salto_incondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salto_incondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSalto_incondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSalto_incondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSalto_incondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Salto_incondicionalContext salto_incondicional() throws RecognitionException {
		Salto_incondicionalContext _localctx = new Salto_incondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_salto_incondicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(GOTO);
			setState(76);
			etiqueta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public Var_entradaContext var_entrada() {
			return getRuleContext(Var_entradaContext.class,0);
		}
		public Var_salidaContext var_salida() {
			return getRuleContext(Var_salidaContext.class,0);
		}
		public Var_trabajoContext var_trabajo() {
			return getRuleContext(Var_trabajoContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case X:
			case VAR_ENTRADA:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				var_entrada();
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				var_salida();
				}
				break;
			case Z:
			case VAR_TRABAJO:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				var_trabajo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_entradaContext extends ParserRuleContext {
		public TerminalNode X() { return getToken(Anasint.X, 0); }
		public TerminalNode VAR_ENTRADA() { return getToken(Anasint.VAR_ENTRADA, 0); }
		public Var_entradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVar_entrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVar_entrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVar_entrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_entradaContext var_entrada() throws RecognitionException {
		Var_entradaContext _localctx = new Var_entradaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_entrada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==X || _la==VAR_ENTRADA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_salidaContext extends ParserRuleContext {
		public TerminalNode Y() { return getToken(Anasint.Y, 0); }
		public Var_salidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_salida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVar_salida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVar_salida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVar_salida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_salidaContext var_salida() throws RecognitionException {
		Var_salidaContext _localctx = new Var_salidaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Y);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_trabajoContext extends ParserRuleContext {
		public TerminalNode Z() { return getToken(Anasint.Z, 0); }
		public TerminalNode VAR_TRABAJO() { return getToken(Anasint.VAR_TRABAJO, 0); }
		public Var_trabajoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_trabajo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVar_trabajo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVar_trabajo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVar_trabajo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_trabajoContext var_trabajo() throws RecognitionException {
		Var_trabajoContext _localctx = new Var_trabajoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_trabajo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==Z || _la==VAR_TRABAJO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Anasint.COMA, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			variable();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(90);
				match(COMA);
				setState(91);
				variables();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetaContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(Anasint.LETRA, 0); }
		public TerminalNode ETIQUETA() { return getToken(Anasint.ETIQUETA, 0); }
		public EtiquetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiqueta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEtiqueta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEtiqueta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEtiqueta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetaContext etiqueta() throws RecognitionException {
		EtiquetaContext _localctx = new EtiquetaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_etiqueta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==LETRA || _la==ETIQUETA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DISTINTO() { return getToken(Anasint.DISTINTO, 0); }
		public TerminalNode CERO() { return getToken(Anasint.CERO, 0); }
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicion);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case X:
			case Y:
			case Z:
			case VAR_ENTRADA:
			case VAR_TRABAJO:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(96);
				variable();
				setState(97);
				match(DISTINTO);
				setState(98);
				match(CERO);
				}
				}
				break;
			case ID_FUNCION:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MacroContext extends ParserRuleContext {
		public TerminalNode ID_FUNCION() { return getToken(Anasint.ID_FUNCION, 0); }
		public TerminalNode PA() { return getToken(Anasint.PA, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode PC() { return getToken(Anasint.PC, 0); }
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID_FUNCION);
			setState(104);
			match(PA);
			setState(105);
			variables();
			setState(106);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001cm\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00023\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006J\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bR\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f]\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000ef\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e\u0000\u0003\u0002\u0000\u0013\u0013\u0019\u0019\u0002"+
		"\u0000\u0015\u0015\u001a\u001a\u0002\u0000\u0006\u0006\u001b\u001bg\u0000"+
		"!\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u00042\u0001"+
		"\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000"+
		"\u0000\n@\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000\u000eK\u0001"+
		"\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000"+
		"\u0000\u0014U\u0001\u0000\u0000\u0000\u0016W\u0001\u0000\u0000\u0000\u0018"+
		"Y\u0001\u0000\u0000\u0000\u001a^\u0001\u0000\u0000\u0000\u001ce\u0001"+
		"\u0000\u0000\u0000\u001eg\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001"+
		"\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001\u0000\u0000\u0000"+
		"%&\u0005\u000b\u0000\u0000&\'\u0003\u001a\r\u0000\'(\u0005\f\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0003\u0004\u0002\u0000,\u0003\u0001"+
		"\u0000\u0000\u0000-3\u0003\u0006\u0003\u0000.3\u0003\b\u0004\u0000/3\u0003"+
		"\n\u0005\u000003\u0003\f\u0006\u000013\u0003\u000e\u0007\u00002-\u0001"+
		"\u0000\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0005\u0001\u0000"+
		"\u0000\u000045\u0003\u0010\b\u000056\u0005\r\u0000\u000067\u0003\u0010"+
		"\b\u000078\u0005\u000f\u0000\u000089\u0005\u0011\u0000\u00009\u0007\u0001"+
		"\u0000\u0000\u0000:;\u0003\u0010\b\u0000;<\u0005\r\u0000\u0000<=\u0003"+
		"\u0010\b\u0000=>\u0005\u0010\u0000\u0000>?\u0005\u0011\u0000\u0000?\t"+
		"\u0001\u0000\u0000\u0000@A\u0005\u0007\u0000\u0000AB\u0003\u001c\u000e"+
		"\u0000BC\u0005\b\u0000\u0000CD\u0003\u001a\r\u0000D\u000b\u0001\u0000"+
		"\u0000\u0000EF\u0003\u0010\b\u0000FI\u0005\r\u0000\u0000GJ\u0003\u0010"+
		"\b\u0000HJ\u0003\u001e\u000f\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000J\r\u0001\u0000\u0000\u0000KL\u0005\b\u0000\u0000LM\u0003"+
		"\u001a\r\u0000M\u000f\u0001\u0000\u0000\u0000NR\u0003\u0012\t\u0000OR"+
		"\u0003\u0014\n\u0000PR\u0003\u0016\u000b\u0000QN\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\u0011\u0001\u0000"+
		"\u0000\u0000ST\u0007\u0000\u0000\u0000T\u0013\u0001\u0000\u0000\u0000"+
		"UV\u0005\u0014\u0000\u0000V\u0015\u0001\u0000\u0000\u0000WX\u0007\u0001"+
		"\u0000\u0000X\u0017\u0001\u0000\u0000\u0000Y\\\u0003\u0010\b\u0000Z[\u0005"+
		"\u0017\u0000\u0000[]\u0003\u0018\f\u0000\\Z\u0001\u0000\u0000\u0000\\"+
		"]\u0001\u0000\u0000\u0000]\u0019\u0001\u0000\u0000\u0000^_\u0007\u0002"+
		"\u0000\u0000_\u001b\u0001\u0000\u0000\u0000`a\u0003\u0010\b\u0000ab\u0005"+
		"\u000e\u0000\u0000bc\u0005\u0012\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"df\u0003\u001e\u000f\u0000e`\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000f\u001d\u0001\u0000\u0000\u0000gh\u0005\u001c\u0000\u0000hi\u0005"+
		"\t\u0000\u0000ij\u0003\u0018\f\u0000jk\u0005\n\u0000\u0000k\u001f\u0001"+
		"\u0000\u0000\u0000\u0007#)2IQ\\e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}