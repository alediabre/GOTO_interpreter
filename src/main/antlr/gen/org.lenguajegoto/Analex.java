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
		MENOS=16, UNO=17, CERO=18, X=19, Y=20, Z=21, NUMERO=22, VAR_ENTRADA=23, 
		VAR_TRABAJO=24, ETIQUETA=25;
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
			"MAS", "MENOS", "UNO", "CERO", "X", "Y", "Z", "NUMERO", "VAR_ENTRADA", 
			"VAR_TRABAJO", "ETIQUETA"
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
		"\u0004\u0000\u0019\u0093\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"I\b\u0003\n\u0003\f\u0003L\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0004\u0016\u0087\b\u0016\u000b\u0016\f\u0016\u0088\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001J\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0000\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015"+
		"\n\u0017\u000b\u0019\f\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011%"+
		"\u0012\'\u0013)\u0014+\u0015-\u0016/\u00171\u00183\u0019\u0001\u0000\u0003"+
		"\u0002\u0000\n\n\r\r\u0001\u000009\u0001\u0000AE\u0095\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00039\u0001"+
		"\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000\u0007D\u0001\u0000\u0000"+
		"\u0000\tR\u0001\u0000\u0000\u0000\u000b]\u0001\u0000\u0000\u0000\r_\u0001"+
		"\u0000\u0000\u0000\u000fa\u0001\u0000\u0000\u0000\u0011d\u0001\u0000\u0000"+
		"\u0000\u0013i\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017"+
		"m\u0001\u0000\u0000\u0000\u0019o\u0001\u0000\u0000\u0000\u001bq\u0001"+
		"\u0000\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001fw\u0001\u0000\u0000"+
		"\u0000!y\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000%}\u0001\u0000"+
		"\u0000\u0000\'\u007f\u0001\u0000\u0000\u0000)\u0081\u0001\u0000\u0000"+
		"\u0000+\u0083\u0001\u0000\u0000\u0000-\u0086\u0001\u0000\u0000\u0000/"+
		"\u008a\u0001\u0000\u0000\u00001\u008d\u0001\u0000\u0000\u00003\u0090\u0001"+
		"\u0000\u0000\u000056\u0005 \u0000\u000067\u0001\u0000\u0000\u000078\u0006"+
		"\u0000\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005\t\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;<\u0006\u0001\u0000\u0000<\u0004\u0001\u0000"+
		"\u0000\u0000=?\u0005\r\u0000\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0005\n\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0006\u0002\u0000\u0000C\u0006\u0001\u0000\u0000\u0000"+
		"DE\u0005/\u0000\u0000EF\u0005*\u0000\u0000FJ\u0001\u0000\u0000\u0000G"+
		"I\t\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0005*\u0000\u0000NO\u0005/\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PQ\u0006\u0003\u0000\u0000Q\b\u0001\u0000\u0000"+
		"\u0000RS\u0005/\u0000\u0000ST\u0005/\u0000\u0000TX\u0001\u0000\u0000\u0000"+
		"UW\b\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0006\u0004\u0000\u0000\\\n\u0001"+
		"\u0000\u0000\u0000]^\u0007\u0001\u0000\u0000^\f\u0001\u0000\u0000\u0000"+
		"_`\u0007\u0002\u0000\u0000`\u000e\u0001\u0000\u0000\u0000ab\u0005I\u0000"+
		"\u0000bc\u0005F\u0000\u0000c\u0010\u0001\u0000\u0000\u0000de\u0005G\u0000"+
		"\u0000ef\u0005O\u0000\u0000fg\u0005T\u0000\u0000gh\u0005O\u0000\u0000"+
		"h\u0012\u0001\u0000\u0000\u0000ij\u0005(\u0000\u0000j\u0014\u0001\u0000"+
		"\u0000\u0000kl\u0005)\u0000\u0000l\u0016\u0001\u0000\u0000\u0000mn\u0005"+
		"[\u0000\u0000n\u0018\u0001\u0000\u0000\u0000op\u0005]\u0000\u0000p\u001a"+
		"\u0001\u0000\u0000\u0000qr\u0005<\u0000\u0000rs\u0005-\u0000\u0000s\u001c"+
		"\u0001\u0000\u0000\u0000tu\u0005!\u0000\u0000uv\u0005=\u0000\u0000v\u001e"+
		"\u0001\u0000\u0000\u0000wx\u0005+\u0000\u0000x \u0001\u0000\u0000\u0000"+
		"yz\u0005-\u0000\u0000z\"\u0001\u0000\u0000\u0000{|\u00051\u0000\u0000"+
		"|$\u0001\u0000\u0000\u0000}~\u00050\u0000\u0000~&\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005X\u0000\u0000\u0080(\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005Y\u0000\u0000\u0082*\u0001\u0000\u0000\u0000\u0083\u0084\u0005Z"+
		"\u0000\u0000\u0084,\u0001\u0000\u0000\u0000\u0085\u0087\u0003\u000b\u0005"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089.\u0001\u0000\u0000\u0000\u008a\u008b\u0003\'\u0013\u0000"+
		"\u008b\u008c\u0003-\u0016\u0000\u008c0\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0003+\u0015\u0000\u008e\u008f\u0003-\u0016\u0000\u008f2\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0003\r\u0006\u0000\u0091\u0092\u0003-\u0016"+
		"\u0000\u00924\u0001\u0000\u0000\u0000\u0005\u0000>JX\u0088\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}