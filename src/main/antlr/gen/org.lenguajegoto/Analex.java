// Generated from Analex.g4 by ANTLR 4.7.2
package org.lenguajegoto;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, LETRA=4, IF=5, GOTO=6, PA=7, PC=8, 
		CA=9, CC=10, ASIGNA=11, DISTINTO=12, MAS=13, MENOS=14, UNO=15, CERO=16, 
		X=17, Y=18, Z=19, NUMERO=20, VAR_ENTRADA=21, VAR_TRABAJO=22, ETIQUETA=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "IF", "GOTO", 
			"PA", "PC", "CA", "CC", "ASIGNA", "DISTINTO", "MAS", "MENOS", "UNO", 
			"CERO", "X", "Y", "Z", "NUMERO", "VAR_ENTRADA", "VAR_TRABAJO", "ETIQUETA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26l\n\26\r\26\16\26m\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\2\13\6\r\7\17\b"+
		"\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\3\2\4\3\2\62;\3\2CG\2x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\67\3\2\2\2\7<\3"+
		"\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21N\3\2\2\2\23P\3"+
		"\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37"+
		"^\3\2\2\2!`\3\2\2\2#b\3\2\2\2%d\3\2\2\2\'f\3\2\2\2)h\3\2\2\2+k\3\2\2\2"+
		"-o\3\2\2\2/r\3\2\2\2\61u\3\2\2\2\63\64\7\"\2\2\64\65\3\2\2\2\65\66\b\2"+
		"\2\2\66\4\3\2\2\2\678\7\13\2\289\3\2\2\29:\b\3\2\2:\6\3\2\2\2;=\7\17\2"+
		"\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\f\2\2?@\3\2\2\2@A\b\4\2\2A\b\3\2"+
		"\2\2BC\t\2\2\2C\n\3\2\2\2DE\t\3\2\2E\f\3\2\2\2FG\7K\2\2GH\7H\2\2H\16\3"+
		"\2\2\2IJ\7I\2\2JK\7Q\2\2KL\7V\2\2LM\7Q\2\2M\20\3\2\2\2NO\7*\2\2O\22\3"+
		"\2\2\2PQ\7+\2\2Q\24\3\2\2\2RS\7]\2\2S\26\3\2\2\2TU\7_\2\2U\30\3\2\2\2"+
		"VW\7>\2\2WX\7/\2\2X\32\3\2\2\2YZ\7#\2\2Z[\7?\2\2[\34\3\2\2\2\\]\7-\2\2"+
		"]\36\3\2\2\2^_\7/\2\2_ \3\2\2\2`a\7\63\2\2a\"\3\2\2\2bc\7\62\2\2c$\3\2"+
		"\2\2de\7Z\2\2e&\3\2\2\2fg\7[\2\2g(\3\2\2\2hi\7\\\2\2i*\3\2\2\2jl\5\t\5"+
		"\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n,\3\2\2\2op\5%\23\2pq\5+\26"+
		"\2q.\3\2\2\2rs\5)\25\2st\5+\26\2t\60\3\2\2\2uv\5\13\6\2vw\5+\26\2w\62"+
		"\3\2\2\2\5\2<m\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}