// Generated from Analex.g4 by ANTLR 4.13.1
package org.lenguajegoto;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, COMMENT=4, LINE_COMMENT=5, LETRA=6, 
		IF=7, GOTO=8, PA=9, PC=10, CA=11, CC=12, ASIGNA=13, DISTINTO=14, MAS=15, 
		MENOS=16, UNO=17, CERO=18, X=19, Y=20, Z=21, INI_FUNCION=22, COMA=23, 
		NUMERO=24, VAR_ENTRADA=25, VAR_TRABAJO=26, ETIQUETA=27, ID_FUNCION=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "COMMENT", "LINE_COMMENT", "DIGITO", 
			"LETRA", "IF", "GOTO", "PA", "PC", "CA", "CC", "ASIGNA", "DISTINTO", 
			"MAS", "MENOS", "UNO", "CERO", "X", "Y", "Z", "INI_FUNCION", "COMA", 
			"NUMERO", "VAR_ENTRADA", "VAR_TRABAJO", "ETIQUETA", "ID_FUNCION"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001c\u00a6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0003\u0002E\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004]\b\u0004\n\u0004\f\u0004`\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u0091\b\u0018"+
		"\u000b\u0018\f\u0018\u0092\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00a2\b\u001c\n\u001c"+
		"\f\u001c\u00a5\t\u001c\u0001P\u0000\u001d\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0000\r\u0006\u000f\u0007\u0011\b\u0013"+
		"\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d\u000e\u001f\u000f!\u0010"+
		"#\u0011%\u0012\'\u0013)\u0014+\u0015-\u0016/\u00171\u00183\u00195\u001a"+
		"7\u001b9\u001c\u0001\u0000\u0004\u0002\u0000\n\n\r\r\u0001\u000009\u0001"+
		"\u0000AE\u0001\u0000AZ\u00aa\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003?"+
		"\u0001\u0000\u0000\u0000\u0005D\u0001\u0000\u0000\u0000\u0007J\u0001\u0000"+
		"\u0000\u0000\tX\u0001\u0000\u0000\u0000\u000bc\u0001\u0000\u0000\u0000"+
		"\re\u0001\u0000\u0000\u0000\u000fg\u0001\u0000\u0000\u0000\u0011j\u0001"+
		"\u0000\u0000\u0000\u0013o\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000"+
		"\u0000\u0017s\u0001\u0000\u0000\u0000\u0019u\u0001\u0000\u0000\u0000\u001b"+
		"w\u0001\u0000\u0000\u0000\u001dz\u0001\u0000\u0000\u0000\u001f}\u0001"+
		"\u0000\u0000\u0000!\u007f\u0001\u0000\u0000\u0000#\u0081\u0001\u0000\u0000"+
		"\u0000%\u0083\u0001\u0000\u0000\u0000\'\u0085\u0001\u0000\u0000\u0000"+
		")\u0087\u0001\u0000\u0000\u0000+\u0089\u0001\u0000\u0000\u0000-\u008b"+
		"\u0001\u0000\u0000\u0000/\u008d\u0001\u0000\u0000\u00001\u0090\u0001\u0000"+
		"\u0000\u00003\u0094\u0001\u0000\u0000\u00005\u0097\u0001\u0000\u0000\u0000"+
		"7\u009a\u0001\u0000\u0000\u00009\u009d\u0001\u0000\u0000\u0000;<\u0005"+
		" \u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0006\u0000\u0000\u0000>\u0002"+
		"\u0001\u0000\u0000\u0000?@\u0005\t\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0006\u0001\u0000\u0000B\u0004\u0001\u0000\u0000\u0000CE\u0005\r\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0005\n\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0006\u0002"+
		"\u0000\u0000I\u0006\u0001\u0000\u0000\u0000JK\u0005/\u0000\u0000KL\u0005"+
		"*\u0000\u0000LP\u0001\u0000\u0000\u0000MO\t\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000ST\u0005*\u0000\u0000TU\u0005/\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0006\u0003\u0000\u0000W\b\u0001\u0000\u0000\u0000XY\u0005/\u0000\u0000"+
		"YZ\u0005/\u0000\u0000Z^\u0001\u0000\u0000\u0000[]\b\u0000\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ab\u0006\u0004\u0000\u0000b\n\u0001\u0000\u0000\u0000cd\u0007"+
		"\u0001\u0000\u0000d\f\u0001\u0000\u0000\u0000ef\u0007\u0002\u0000\u0000"+
		"f\u000e\u0001\u0000\u0000\u0000gh\u0005I\u0000\u0000hi\u0005F\u0000\u0000"+
		"i\u0010\u0001\u0000\u0000\u0000jk\u0005G\u0000\u0000kl\u0005O\u0000\u0000"+
		"lm\u0005T\u0000\u0000mn\u0005O\u0000\u0000n\u0012\u0001\u0000\u0000\u0000"+
		"op\u0005(\u0000\u0000p\u0014\u0001\u0000\u0000\u0000qr\u0005)\u0000\u0000"+
		"r\u0016\u0001\u0000\u0000\u0000st\u0005[\u0000\u0000t\u0018\u0001\u0000"+
		"\u0000\u0000uv\u0005]\u0000\u0000v\u001a\u0001\u0000\u0000\u0000wx\u0005"+
		"<\u0000\u0000xy\u0005-\u0000\u0000y\u001c\u0001\u0000\u0000\u0000z{\u0005"+
		"!\u0000\u0000{|\u0005=\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0005"+
		"+\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0080\u0005-\u0000\u0000"+
		"\u0080\"\u0001\u0000\u0000\u0000\u0081\u0082\u00051\u0000\u0000\u0082"+
		"$\u0001\u0000\u0000\u0000\u0083\u0084\u00050\u0000\u0000\u0084&\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005X\u0000\u0000\u0086(\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005Y\u0000\u0000\u0088*\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005Z\u0000\u0000\u008a,\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"_\u0000\u0000\u008c.\u0001\u0000\u0000\u0000\u008d\u008e\u0005,\u0000"+
		"\u0000\u008e0\u0001\u0000\u0000\u0000\u008f\u0091\u0003\u000b\u0005\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u00932\u0001\u0000\u0000\u0000\u0094\u0095\u0003\'\u0013\u0000\u0095"+
		"\u0096\u00031\u0018\u0000\u00964\u0001\u0000\u0000\u0000\u0097\u0098\u0003"+
		"+\u0015\u0000\u0098\u0099\u00031\u0018\u0000\u00996\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0003\r\u0006\u0000\u009b\u009c\u00031\u0018\u0000"+
		"\u009c8\u0001\u0000\u0000\u0000\u009d\u009e\u0003-\u0016\u0000\u009e\u00a3"+
		"\u0007\u0003\u0000\u0000\u009f\u00a2\u0007\u0003\u0000\u0000\u00a0\u00a2"+
		"\u0003\u000b\u0005\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4:\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u0007\u0000DP^"+
		"\u0092\u00a1\u00a3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}