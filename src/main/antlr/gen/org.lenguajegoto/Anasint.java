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
		MENOS=16, UNO=17, CERO=18, X=19, Y=20, Z=21, NUMERO=22, VAR_ENTRADA=23, 
		VAR_TRABAJO=24, ETIQUETA=25;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_instruccion_basica = 2, 
		RULE_incremento = 3, RULE_decremento = 4, RULE_condicional = 5, RULE_skip = 6, 
		RULE_variable = 7, RULE_var_entrada = 8, RULE_var_salida = 9, RULE_var_trabajo = 10, 
		RULE_etiqueta = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "instruccion_basica", "incremento", "decremento", 
			"condicional", "skip", "variable", "var_entrada", "var_salida", "var_trabajo", 
			"etiqueta"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\t'", null, null, null, null, "'IF'", "'GOTO'", "'('", 
			"')'", "'['", "']'", "'<-'", "'!='", "'+'", "'-'", "'1'", "'0'", "'X'", 
			"'Y'", "'Z'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "COMMENT", "LINE_COMMENT", 
			"LETRA", "IF", "GOTO", "PA", "PC", "CA", "CC", "ASIGNA", "DISTINTO", 
			"MAS", "MENOS", "UNO", "CERO", "X", "Y", "Z", "NUMERO", "VAR_ENTRADA", 
			"VAR_TRABAJO", "ETIQUETA"
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				instruccion();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 28838016L) != 0) );
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CA) {
				{
				setState(29);
				match(CA);
				setState(30);
				etiqueta();
				setState(31);
				match(CC);
				}
			}

			setState(35);
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
		public SkipContext skip() {
			return getRuleContext(SkipContext.class,0);
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
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				incremento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				decremento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				condicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				skip();
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
			setState(43);
			variable();
			setState(44);
			match(ASIGNA);
			setState(45);
			variable();
			setState(46);
			match(MAS);
			setState(47);
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
			setState(49);
			variable();
			setState(50);
			match(ASIGNA);
			setState(51);
			variable();
			setState(52);
			match(MENOS);
			setState(53);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DISTINTO() { return getToken(Anasint.DISTINTO, 0); }
		public TerminalNode CERO() { return getToken(Anasint.CERO, 0); }
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
			setState(55);
			match(IF);
			setState(56);
			variable();
			setState(57);
			match(DISTINTO);
			setState(58);
			match(CERO);
			setState(59);
			match(GOTO);
			setState(60);
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
	public static class SkipContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode ASIGNA() { return getToken(Anasint.ASIGNA, 0); }
		public SkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipContext skip() throws RecognitionException {
		SkipContext _localctx = new SkipContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_skip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			variable();
			setState(63);
			match(ASIGNA);
			setState(64);
			variable();
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
		enterRule(_localctx, 14, RULE_variable);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case X:
			case VAR_ENTRADA:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				var_entrada();
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				var_salida();
				}
				break;
			case Z:
			case VAR_TRABAJO:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
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
		enterRule(_localctx, 16, RULE_var_entrada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
		enterRule(_localctx, 18, RULE_var_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
		enterRule(_localctx, 20, RULE_var_trabajo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
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
		enterRule(_localctx, 22, RULE_etiqueta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019P\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"*\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007F\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0003\u0002\u0000\u0013\u0013\u0017\u0017\u0002\u0000\u0015\u0015"+
		"\u0018\u0018\u0002\u0000\u0006\u0006\u0019\u0019J\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000"+
		"\u0006+\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\n7\u0001\u0000"+
		"\u0000\u0000\f>\u0001\u0000\u0000\u0000\u000eE\u0001\u0000\u0000\u0000"+
		"\u0010G\u0001\u0000\u0000\u0000\u0012I\u0001\u0000\u0000\u0000\u0014K"+
		"\u0001\u0000\u0000\u0000\u0016M\u0001\u0000\u0000\u0000\u0018\u001a\u0003"+
		"\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\u000b\u0000\u0000\u001e\u001f\u0003\u0016\u000b\u0000\u001f \u0005\f"+
		"\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001d\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0003\u0004\u0002"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%*\u0003\u0006\u0003\u0000&*\u0003"+
		"\b\u0004\u0000\'*\u0003\n\u0005\u0000(*\u0003\f\u0006\u0000)%\u0001\u0000"+
		"\u0000\u0000)&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0003\u000e\u0007"+
		"\u0000,-\u0005\r\u0000\u0000-.\u0003\u000e\u0007\u0000./\u0005\u000f\u0000"+
		"\u0000/0\u0005\u0011\u0000\u00000\u0007\u0001\u0000\u0000\u000012\u0003"+
		"\u000e\u0007\u000023\u0005\r\u0000\u000034\u0003\u000e\u0007\u000045\u0005"+
		"\u0010\u0000\u000056\u0005\u0011\u0000\u00006\t\u0001\u0000\u0000\u0000"+
		"78\u0005\u0007\u0000\u000089\u0003\u000e\u0007\u00009:\u0005\u000e\u0000"+
		"\u0000:;\u0005\u0012\u0000\u0000;<\u0005\b\u0000\u0000<=\u0003\u0016\u000b"+
		"\u0000=\u000b\u0001\u0000\u0000\u0000>?\u0003\u000e\u0007\u0000?@\u0005"+
		"\r\u0000\u0000@A\u0003\u000e\u0007\u0000A\r\u0001\u0000\u0000\u0000BF"+
		"\u0003\u0010\b\u0000CF\u0003\u0012\t\u0000DF\u0003\u0014\n\u0000EB\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"F\u000f\u0001\u0000\u0000\u0000GH\u0007\u0000\u0000\u0000H\u0011\u0001"+
		"\u0000\u0000\u0000IJ\u0005\u0014\u0000\u0000J\u0013\u0001\u0000\u0000"+
		"\u0000KL\u0007\u0001\u0000\u0000L\u0015\u0001\u0000\u0000\u0000MN\u0007"+
		"\u0002\u0000\u0000N\u0017\u0001\u0000\u0000\u0000\u0004\u001b!)E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}