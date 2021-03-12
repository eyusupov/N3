// Generated from n3.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class n3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, COMMENT=23, BooleanLiteral=24, 
		String=25, IRIREF=26, PNAME_NS=27, PNAME_LN=28, BLANK_NODE_LABEL=29, LANGTAG=30, 
		INTEGER=31, DECIMAL=32, DOUBLE=33, EXPONENT=34, STRING_LITERAL_LONG_SINGLE_QUOTE=35, 
		STRING_LITERAL_LONG_QUOTE=36, STRING_LITERAL_QUOTE=37, STRING_LITERAL_SINGLE_QUOTE=38, 
		UCHAR=39, ECHAR=40, WS=41, ANON=42, QuickVarName=43, PN_CHARS_U=44, PN_CHARS_BASE=45, 
		PN_CHARS=46, BASE=47, PREFIX=48, PN_PREFIX=49, PN_LOCAL=50, PLX=51, PERCENT=52, 
		HEX=53, PN_LOCAL_ESC=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "COMMENT", "BooleanLiteral", 
			"String", "IRIREF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", 
			"INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
			"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
			"UCHAR", "ECHAR", "WS", "ANON", "QuickVarName", "PN_CHARS_U", "PN_CHARS_BASE", 
			"PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", 
			"HEX", "PN_LOCAL_ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@prefix'", "'@base'", "';'", "','", "'a'", "'has'", "'is'", 
			"'of'", "'='", "'<='", "'=>'", "'<-'", "'!'", "'^'", "'['", "']'", "'('", 
			"')'", "'{'", "'}'", "'^^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "COMMENT", 
			"BooleanLiteral", "String", "IRIREF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", 
			"LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
			"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
			"UCHAR", "ECHAR", "WS", "ANON", "QuickVarName", "PN_CHARS_U", "PN_CHARS_BASE", 
			"PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", 
			"HEX", "PN_LOCAL_ESC"
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


	public n3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "n3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\7\30\u00b0\n\30\f\30\16\30\u00b3\13"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00c0"+
		"\n\31\3\32\3\32\3\32\3\32\5\32\u00c6\n\32\3\33\3\33\3\33\3\33\7\33\u00cc"+
		"\n\33\f\33\16\33\u00cf\13\33\3\33\3\33\3\34\5\34\u00d4\n\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u00e0\n\36\3\36\3\36\7\36"+
		"\u00e4\n\36\f\36\16\36\u00e7\13\36\3\36\5\36\u00ea\n\36\3\37\3\37\6\37"+
		"\u00ee\n\37\r\37\16\37\u00ef\3\37\3\37\6\37\u00f4\n\37\r\37\16\37\u00f5"+
		"\7\37\u00f8\n\37\f\37\16\37\u00fb\13\37\3 \5 \u00fe\n \3 \6 \u0101\n "+
		"\r \16 \u0102\3!\5!\u0106\n!\3!\7!\u0109\n!\f!\16!\u010c\13!\3!\3!\6!"+
		"\u0110\n!\r!\16!\u0111\3\"\5\"\u0115\n\"\3\"\6\"\u0118\n\"\r\"\16\"\u0119"+
		"\3\"\3\"\7\"\u011e\n\"\f\"\16\"\u0121\13\"\3\"\3\"\3\"\6\"\u0126\n\"\r"+
		"\"\16\"\u0127\3\"\3\"\6\"\u012c\n\"\r\"\16\"\u012d\3\"\5\"\u0131\n\"\3"+
		"#\3#\5#\u0135\n#\3#\6#\u0138\n#\r#\16#\u0139\3$\3$\3$\3$\3$\3$\3$\5$\u0143"+
		"\n$\3$\3$\3$\5$\u0148\n$\7$\u014a\n$\f$\16$\u014d\13$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\5%\u015a\n%\3%\3%\3%\5%\u015f\n%\7%\u0161\n%\f%\16%\u0164"+
		"\13%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u016e\n&\f&\16&\u0171\13&\3&\3&\3\'\3"+
		"\'\3\'\3\'\7\'\u0179\n\'\f\'\16\'\u017c\13\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0194\n(\3)\3)\3)\3*\3"+
		"*\3*\3*\3+\3+\7+\u019f\n+\f+\16+\u01a2\13+\3+\3+\3,\3,\3,\7,\u01a9\n,"+
		"\f,\16,\u01ac\13,\3-\3-\5-\u01b0\n-\3.\5.\u01b3\n.\3/\3/\5/\u01b7\n/\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\7\62\u01c8\n\62\f\62\16\62\u01cb\13\62\3\62\5\62\u01ce\n\62\3\63\3"+
		"\63\3\63\5\63\u01d3\n\63\3\63\3\63\3\63\7\63\u01d8\n\63\f\63\16\63\u01db"+
		"\13\63\3\63\3\63\3\63\5\63\u01e0\n\63\5\63\u01e2\n\63\3\64\3\64\5\64\u01e6"+
		"\n\64\3\65\3\65\3\65\3\65\3\66\5\66\u01ed\n\66\3\67\3\67\3\67\2\28\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\34"+
		"\4\2\f\f\16\17\n\2\2\"$$>>@@^^``bb}\177\3\2\62;\4\2C\\c|\5\2\62;C\\c|"+
		"\4\2--//\4\2GGgg\4\2))^^\4\2$$^^\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\n"+
		"\2$$))^^ddhhppttvv\5\2\13\f\17\17\"\"\17\2C\\c|\u00c2\u00d8\u00da\u00f8"+
		"\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1"+
		"\u3003\ud801\uf902\ufdd1\ufdf2\uffff\7\2//\62;\u00b9\u00b9\u0302\u0371"+
		"\u2041\u2042\4\2DDdd\4\2CCcc\4\2UUuu\4\2RRrr\4\2TTtt\4\2HHhh\4\2KKkk\4"+
		"\2ZZzz\4\2\60\60<<\5\2\62;CHch\t\2##%\61==??ABaa\u0080\u0080\2\u022f\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\3o\3\2\2\2\5q\3\2\2\2\7y\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0083"+
		"\3\2\2\2\17\u0085\3\2\2\2\21\u0089\3\2\2\2\23\u008c\3\2\2\2\25\u008f\3"+
		"\2\2\2\27\u0091\3\2\2\2\31\u0094\3\2\2\2\33\u0097\3\2\2\2\35\u009a\3\2"+
		"\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4"+
		"\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00bf\3\2\2\2\63\u00c5\3\2\2\2\65\u00c7\3\2\2\2\67\u00d3\3\2\2\29\u00d7"+
		"\3\2\2\2;\u00da\3\2\2\2=\u00eb\3\2\2\2?\u00fd\3\2\2\2A\u0105\3\2\2\2C"+
		"\u0114\3\2\2\2E\u0132\3\2\2\2G\u013b\3\2\2\2I\u0152\3\2\2\2K\u0169\3\2"+
		"\2\2M\u0174\3\2\2\2O\u0193\3\2\2\2Q\u0195\3\2\2\2S\u0198\3\2\2\2U\u019c"+
		"\3\2\2\2W\u01a5\3\2\2\2Y\u01af\3\2\2\2[\u01b2\3\2\2\2]\u01b6\3\2\2\2_"+
		"\u01b8\3\2\2\2a\u01bd\3\2\2\2c\u01c4\3\2\2\2e\u01d2\3\2\2\2g\u01e5\3\2"+
		"\2\2i\u01e7\3\2\2\2k\u01ec\3\2\2\2m\u01ee\3\2\2\2op\7\60\2\2p\4\3\2\2"+
		"\2qr\7B\2\2rs\7r\2\2st\7t\2\2tu\7g\2\2uv\7h\2\2vw\7k\2\2wx\7z\2\2x\6\3"+
		"\2\2\2yz\7B\2\2z{\7d\2\2{|\7c\2\2|}\7u\2\2}~\7g\2\2~\b\3\2\2\2\177\u0080"+
		"\7=\2\2\u0080\n\3\2\2\2\u0081\u0082\7.\2\2\u0082\f\3\2\2\2\u0083\u0084"+
		"\7c\2\2\u0084\16\3\2\2\2\u0085\u0086\7j\2\2\u0086\u0087\7c\2\2\u0087\u0088"+
		"\7u\2\2\u0088\20\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7u\2\2\u008b\22"+
		"\3\2\2\2\u008c\u008d\7q\2\2\u008d\u008e\7h\2\2\u008e\24\3\2\2\2\u008f"+
		"\u0090\7?\2\2\u0090\26\3\2\2\2\u0091\u0092\7>\2\2\u0092\u0093\7?\2\2\u0093"+
		"\30\3\2\2\2\u0094\u0095\7?\2\2\u0095\u0096\7@\2\2\u0096\32\3\2\2\2\u0097"+
		"\u0098\7>\2\2\u0098\u0099\7/\2\2\u0099\34\3\2\2\2\u009a\u009b\7#\2\2\u009b"+
		"\36\3\2\2\2\u009c\u009d\7`\2\2\u009d \3\2\2\2\u009e\u009f\7]\2\2\u009f"+
		"\"\3\2\2\2\u00a0\u00a1\7_\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7*\2\2\u00a3"+
		"&\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7}\2\2\u00a7*"+
		"\3\2\2\2\u00a8\u00a9\7\177\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7`\2\2\u00ab"+
		"\u00ac\7`\2\2\u00ac.\3\2\2\2\u00ad\u00b1\7%\2\2\u00ae\u00b0\n\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\30\2\2\u00b5"+
		"\60\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7w\2\2\u00b9"+
		"\u00c0\7g\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd\u00be\7u\2\2\u00be\u00c0\7g\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00ba"+
		"\3\2\2\2\u00c0\62\3\2\2\2\u00c1\u00c6\5K&\2\u00c2\u00c6\5M\'\2\u00c3\u00c6"+
		"\5G$\2\u00c4\u00c6\5I%\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\64\3\2\2\2\u00c7\u00cd\7>\2\2"+
		"\u00c8\u00cc\n\3\2\2\u00c9\u00cc\5O(\2\u00ca\u00cc\5S*\2\u00cb\u00c8\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d1\7@\2\2\u00d1\66\3\2\2\2\u00d2\u00d4\5c\62\2\u00d3\u00d2"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6"+
		"8\3\2\2\2\u00d7\u00d8\5\67\34\2\u00d8\u00d9\5e\63\2\u00d9:\3\2\2\2\u00da"+
		"\u00db\7a\2\2\u00db\u00dc\7<\2\2\u00dc\u00df\3\2\2\2\u00dd\u00e0\5Y-\2"+
		"\u00de\u00e0\t\4\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e9"+
		"\3\2\2\2\u00e1\u00e4\5]/\2\u00e2\u00e4\7\60\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\5]/\2\u00e9\u00e5"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea<\3\2\2\2\u00eb\u00ed\7B\2\2\u00ec\u00ee"+
		"\t\5\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f9\3\2\2\2\u00f1\u00f3\7/\2\2\u00f2\u00f4\t\6"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa>\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fe\t\7\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103@\3\2\2\2\u0104\u0106"+
		"\t\7\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3\2\2\2\u0107"+
		"\u0109\t\4\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010f\7\60\2\2\u010e\u0110\t\4\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112B\3\2\2\2\u0113\u0115"+
		"\t\7\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0130\3\2\2\2\u0116"+
		"\u0118\t\4\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011f\7\60\2\2\u011c"+
		"\u011e\t\4\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0131\5E#\2\u0123\u0125\7\60\2\2\u0124\u0126\t\4\2\2\u0125\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0131\5E#\2\u012a\u012c\t\4\2\2\u012b\u012a\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0131\5E#\2\u0130\u0117\3\2\2\2\u0130\u0123\3\2\2\2\u0130"+
		"\u012b\3\2\2\2\u0131D\3\2\2\2\u0132\u0134\t\b\2\2\u0133\u0135\t\7\2\2"+
		"\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138"+
		"\t\4\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013aF\3\2\2\2\u013b\u013c\7)\2\2\u013c\u013d\7)\2\2\u013d"+
		"\u013e\7)\2\2\u013e\u014b\3\2\2\2\u013f\u0143\7)\2\2\u0140\u0141\7)\2"+
		"\2\u0141\u0143\7)\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0147\3\2\2\2\u0144\u0148\n\t\2\2\u0145\u0148\5Q)\2\u0146"+
		"\u0148\5O(\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2"+
		"\2\u0148\u014a\3\2\2\2\u0149\u0142\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\7)\2\2\u014f\u0150\7)\2\2\u0150\u0151\7)\2\2\u0151H\3\2\2\2\u0152"+
		"\u0153\7$\2\2\u0153\u0154\7$\2\2\u0154\u0155\7$\2\2\u0155\u0162\3\2\2"+
		"\2\u0156\u015a\7$\2\2\u0157\u0158\7$\2\2\u0158\u015a\7$\2\2\u0159\u0156"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015e\3\2\2\2\u015b"+
		"\u015f\n\n\2\2\u015c\u015f\5Q)\2\u015d\u015f\5O(\2\u015e\u015b\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u0159"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7$\2\2\u0166\u0167\7$\2"+
		"\2\u0167\u0168\7$\2\2\u0168J\3\2\2\2\u0169\u016f\7$\2\2\u016a\u016e\n"+
		"\13\2\2\u016b\u016e\5Q)\2\u016c\u016e\5O(\2\u016d\u016a\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\7$\2\2\u0173L\3\2\2\2\u0174\u017a\7)\2\2\u0175\u0179\n\f\2\2\u0176"+
		"\u0179\5Q)\2\u0177\u0179\5O(\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2"+
		"\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7)\2\2\u017e"+
		"N\3\2\2\2\u017f\u0180\7^\2\2\u0180\u0181\7w\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\5k\66\2\u0183\u0184\5k\66\2\u0184\u0185\5k\66\2\u0185\u0186\5k"+
		"\66\2\u0186\u0194\3\2\2\2\u0187\u0188\7^\2\2\u0188\u0189\7W\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\5k\66\2\u018b\u018c\5k\66\2\u018c\u018d\5k"+
		"\66\2\u018d\u018e\5k\66\2\u018e\u018f\5k\66\2\u018f\u0190\5k\66\2\u0190"+
		"\u0191\5k\66\2\u0191\u0192\5k\66\2\u0192\u0194\3\2\2\2\u0193\u017f\3\2"+
		"\2\2\u0193\u0187\3\2\2\2\u0194P\3\2\2\2\u0195\u0196\7^\2\2\u0196\u0197"+
		"\t\r\2\2\u0197R\3\2\2\2\u0198\u0199\t\16\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\b*\2\2\u019bT\3\2\2\2\u019c\u01a0\7]\2\2\u019d\u019f\5S*\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7_\2\2\u01a4"+
		"V\3\2\2\2\u01a5\u01a6\7A\2\2\u01a6\u01aa\5Y-\2\u01a7\u01a9\5]/\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01abX\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\5[.\2\u01ae\u01b0"+
		"\7a\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0Z\3\2\2\2\u01b1\u01b3"+
		"\t\17\2\2\u01b2\u01b1\3\2\2\2\u01b3\\\3\2\2\2\u01b4\u01b7\5Y-\2\u01b5"+
		"\u01b7\t\20\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7^\3\2\2\2"+
		"\u01b8\u01b9\t\21\2\2\u01b9\u01ba\t\22\2\2\u01ba\u01bb\t\23\2\2\u01bb"+
		"\u01bc\t\b\2\2\u01bc`\3\2\2\2\u01bd\u01be\t\24\2\2\u01be\u01bf\t\25\2"+
		"\2\u01bf\u01c0\t\b\2\2\u01c0\u01c1\t\26\2\2\u01c1\u01c2\t\27\2\2\u01c2"+
		"\u01c3\t\30\2\2\u01c3b\3\2\2\2\u01c4\u01cd\5[.\2\u01c5\u01c8\5]/\2\u01c6"+
		"\u01c8\7\60\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3"+
		"\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01ce\5]/\2\u01cd\u01c9\3\2\2\2\u01cd\u01ce\3\2\2"+
		"\2\u01ced\3\2\2\2\u01cf\u01d3\5Y-\2\u01d0\u01d3\4\62<\2\u01d1\u01d3\5"+
		"g\64\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"\u01e1\3\2\2\2\u01d4\u01d8\5]/\2\u01d5\u01d8\t\31\2\2\u01d6\u01d8\5g\64"+
		"\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01df\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01dc\u01e0\5]/\2\u01dd\u01e0\7<\2\2\u01de\u01e0\5g\64"+
		"\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e2"+
		"\3\2\2\2\u01e1\u01d9\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2f\3\2\2\2\u01e3"+
		"\u01e6\5i\65\2\u01e4\u01e6\5m\67\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2"+
		"\2\2\u01e6h\3\2\2\2\u01e7\u01e8\7\'\2\2\u01e8\u01e9\5k\66\2\u01e9\u01ea"+
		"\5k\66\2\u01eaj\3\2\2\2\u01eb\u01ed\t\32\2\2\u01ec\u01eb\3\2\2\2\u01ed"+
		"l\3\2\2\2\u01ee\u01ef\7^\2\2\u01ef\u01f0\t\33\2\2\u01f0n\3\2\2\2\67\2"+
		"\u00b1\u00bf\u00c5\u00cb\u00cd\u00d3\u00df\u00e3\u00e5\u00e9\u00ef\u00f5"+
		"\u00f9\u00fd\u0102\u0105\u010a\u0111\u0114\u0119\u011f\u0127\u012d\u0130"+
		"\u0134\u0139\u0142\u0147\u014b\u0159\u015e\u0162\u016d\u016f\u0178\u017a"+
		"\u0193\u01a0\u01aa\u01af\u01b2\u01b6\u01c7\u01c9\u01cd\u01d2\u01d7\u01d9"+
		"\u01df\u01e1\u01e5\u01ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}