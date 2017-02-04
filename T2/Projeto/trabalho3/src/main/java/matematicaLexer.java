// Generated from matematica.g4 by ANTLR 4.5
package main.java;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matematicaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, Identificador=31, 
		Numero=32, String=33, Comentario=34, Espaco=35, Letra=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "Identificador", "Numero", 
		"String", "Comentario", "Espaco", "Letra", "Int", "Digito"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'return'", "'print'", "'('", "')'", "'='", "'-'", "'^'", "'*'", 
		"'/'", "'+'", "'integre'", "'d'", "'derive'", "'em'", "'de'", "'a'", "'{'", 
		"'|'", "'}'", "'N'", "'Z'", "'Q'", "'R'", "'['", "'<->'", "']'", "'sen'", 
		"'cos'", "'pi'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Identificador", "Numero", "String", 
		"Comentario", "Espaco", "Letra"
	};
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


	public matematicaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "matematica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 32:
			String_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void String_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

				  String s = getText();
				  s = s.substring(1, s.length() - 1);
				  setText(s);
				 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \7 \u00ab\n \f \16 \u00ae\13 \3"+
		"!\3!\3!\7!\u00b3\n!\f!\16!\u00b6\13!\5!\u00b8\n!\3!\3!\3!\3!\7!\u00be"+
		"\n!\f!\16!\u00c1\13!\5!\u00c3\n!\5!\u00c5\n!\3\"\3\"\7\"\u00c9\n\"\f\""+
		"\16\"\u00cc\13\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00d5\n#\f#\16#\u00d8\13#"+
		"\3#\3#\3#\3#\7#\u00de\n#\f#\16#\u00e1\13#\3#\3#\5#\u00e5\n#\3#\3#\3$\3"+
		"$\3$\3$\3%\3%\3&\3&\7&\u00f1\n&\f&\16&\u00f4\13&\3&\5&\u00f7\n&\3\'\3"+
		"\'\4\u00ca\u00df\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2\3\2\b\6\2C\\aaceg|\6\2\62;C"+
		"\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\4\2C\\c|\3\2\63;\u0103\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\3O\3\2\2\2\5V\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2\13`\3\2\2\2\rb\3\2"+
		"\2\2\17d\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27l\3\2\2\2\31t\3"+
		"\2\2\2\33v\3\2\2\2\35}\3\2\2\2\37\u0080\3\2\2\2!\u0083\3\2\2\2#\u0085"+
		"\3\2\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2"+
		"-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0095\3\2\2\2\65\u0099"+
		"\3\2\2\2\67\u009b\3\2\2\29\u009f\3\2\2\2;\u00a3\3\2\2\2=\u00a6\3\2\2\2"+
		"?\u00a8\3\2\2\2A\u00c4\3\2\2\2C\u00c6\3\2\2\2E\u00e4\3\2\2\2G\u00e8\3"+
		"\2\2\2I\u00ec\3\2\2\2K\u00f6\3\2\2\2M\u00f8\3\2\2\2OP\7t\2\2PQ\7g\2\2"+
		"QR\7v\2\2RS\7w\2\2ST\7t\2\2TU\7p\2\2U\4\3\2\2\2VW\7r\2\2WX\7t\2\2XY\7"+
		"k\2\2YZ\7p\2\2Z[\7v\2\2[\6\3\2\2\2\\]\7*\2\2]\b\3\2\2\2^_\7+\2\2_\n\3"+
		"\2\2\2`a\7?\2\2a\f\3\2\2\2bc\7/\2\2c\16\3\2\2\2de\7`\2\2e\20\3\2\2\2f"+
		"g\7,\2\2g\22\3\2\2\2hi\7\61\2\2i\24\3\2\2\2jk\7-\2\2k\26\3\2\2\2lm\7k"+
		"\2\2mn\7p\2\2no\7v\2\2op\7g\2\2pq\7i\2\2qr\7t\2\2rs\7g\2\2s\30\3\2\2\2"+
		"tu\7f\2\2u\32\3\2\2\2vw\7f\2\2wx\7g\2\2xy\7t\2\2yz\7k\2\2z{\7x\2\2{|\7"+
		"g\2\2|\34\3\2\2\2}~\7g\2\2~\177\7o\2\2\177\36\3\2\2\2\u0080\u0081\7f\2"+
		"\2\u0081\u0082\7g\2\2\u0082 \3\2\2\2\u0083\u0084\7c\2\2\u0084\"\3\2\2"+
		"\2\u0085\u0086\7}\2\2\u0086$\3\2\2\2\u0087\u0088\7~\2\2\u0088&\3\2\2\2"+
		"\u0089\u008a\7\177\2\2\u008a(\3\2\2\2\u008b\u008c\7P\2\2\u008c*\3\2\2"+
		"\2\u008d\u008e\7\\\2\2\u008e,\3\2\2\2\u008f\u0090\7S\2\2\u0090.\3\2\2"+
		"\2\u0091\u0092\7T\2\2\u0092\60\3\2\2\2\u0093\u0094\7]\2\2\u0094\62\3\2"+
		"\2\2\u0095\u0096\7>\2\2\u0096\u0097\7/\2\2\u0097\u0098\7@\2\2\u0098\64"+
		"\3\2\2\2\u0099\u009a\7_\2\2\u009a\66\3\2\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e8\3\2\2\2\u009f\u00a0\7e\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7u\2\2\u00a2:\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5<\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7>\3\2\2\2\u00a8\u00ac"+
		"\t\2\2\2\u00a9\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad@\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00af\u00b7\5K&\2\u00b0\u00b4\7\60\2\2\u00b1\u00b3\5M\'\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00c5\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba\u00c2\5K&\2\u00bb\u00bf"+
		"\7\60\2\2\u00bc\u00be\5M\'\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00af\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c5B\3\2\2\2\u00c6\u00ca\7$\2\2\u00c7"+
		"\u00c9\n\4\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7$\2\2\u00ce\u00cf\b\"\2\2\u00cfD\3\2\2\2\u00d0\u00d1\7\61\2\2"+
		"\u00d1\u00d2\7\61\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\n\4\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00e5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\7"+
		",\2\2\u00db\u00df\3\2\2\2\u00dc\u00de\13\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7,\2\2\u00e3\u00e5\7\61\2\2\u00e4"+
		"\u00d0\3\2\2\2\u00e4\u00d9\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b#"+
		"\3\2\u00e7F\3\2\2\2\u00e8\u00e9\t\5\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\b$\3\2\u00ebH\3\2\2\2\u00ec\u00ed\t\6\2\2\u00edJ\3\2\2\2\u00ee\u00f2"+
		"\t\7\2\2\u00ef\u00f1\5M\'\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f7\7\62\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"L\3\2\2\2\u00f8\u00f9\4\62;\2\u00f9N\3\2\2\2\17\2\u00ac\u00b4\u00b7\u00bf"+
		"\u00c2\u00c4\u00ca\u00d6\u00df\u00e4\u00f2\u00f6\4\3\"\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}