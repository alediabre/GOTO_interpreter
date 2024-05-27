// Generated from Anasint.g4 by ANTLR 4.7.2
package org.lenguajegoto;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Anasint extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, LETRA=4, IF=5, GOTO=6, PA=7, PC=8, 
		CA=9, CC=10, ASIGNA=11, DISTINTO=12, MAS=13, MENOS=14, UNO=15, CERO=16, 
		X=17, Y=18, Z=19, NUMERO=20, VAR_ENTRADA=21, VAR_TRABAJO=22, ETIQUETA=23;
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
			null, "' '", "'\t'", null, null, "'IF'", "'GOTO'", "'('", "')'", "'['", 
			"']'", "'<-'", "'!='", "'+'", "'-'", "'1'", "'0'", "'X'", "'Y'", "'Z'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "LETRA", "IF", "GOTO", "PA", 
			"PC", "CA", "CC", "ASIGNA", "DISTINTO", "MAS", "MENOS", "UNO", "CERO", 
			"X", "Y", "Z", "NUMERO", "VAR_ENTRADA", "VAR_TRABAJO", "ETIQUETA"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CA) | (1L << X) | (1L << Y) | (1L << Z) | (1L << VAR_ENTRADA) | (1L << VAR_TRABAJO))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\5\3$\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tH"+
		"\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\5\4\2\23\23\27\27\4\2\25\25\30\30\4\2\6\6\31\31\2L\2\33\3"+
		"\2\2\2\4#\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\63\3\2\2\2\f9\3\2\2\2\16@\3"+
		"\2\2\2\20G\3\2\2\2\22I\3\2\2\2\24K\3\2\2\2\26M\3\2\2\2\30O\3\2\2\2\32"+
		"\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\3\3\2\2\2\37 \7\13\2\2 !\5\30\r\2!\"\7\f\2\2\"$\3\2\2\2#\37\3\2\2\2#"+
		"$\3\2\2\2$%\3\2\2\2%&\5\6\4\2&\5\3\2\2\2\',\5\b\5\2(,\5\n\6\2),\5\f\7"+
		"\2*,\5\16\b\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-.\5"+
		"\20\t\2./\7\r\2\2/\60\5\20\t\2\60\61\7\17\2\2\61\62\7\21\2\2\62\t\3\2"+
		"\2\2\63\64\5\20\t\2\64\65\7\r\2\2\65\66\5\20\t\2\66\67\7\20\2\2\678\7"+
		"\21\2\28\13\3\2\2\29:\7\7\2\2:;\5\20\t\2;<\7\16\2\2<=\7\22\2\2=>\7\b\2"+
		"\2>?\5\30\r\2?\r\3\2\2\2@A\5\20\t\2AB\7\r\2\2BC\5\20\t\2C\17\3\2\2\2D"+
		"H\5\22\n\2EH\5\24\13\2FH\5\26\f\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\21\3"+
		"\2\2\2IJ\t\2\2\2J\23\3\2\2\2KL\7\24\2\2L\25\3\2\2\2MN\t\3\2\2N\27\3\2"+
		"\2\2OP\t\4\2\2P\31\3\2\2\2\6\35#+G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}