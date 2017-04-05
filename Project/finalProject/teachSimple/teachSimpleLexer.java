// Generated from teachSimple.g4 by ANTLR 4.6
package teachSimple;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class teachSimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, Integer=41, IDENT=42, NUM_INT=43, COMMENT=44, STRING=45, 
		COLON=46, PLUS=47, MINUS=48, STAR=49, SLASH=50, ASSIGN=51, COMMA=52, SEMI=53, 
		EQUAL=54, NOT_EQUAL=55, LT=56, LE=57, GE=58, GT=59, LPAREN=60, RPAREN=61, 
		LBRACK=62, RBRACK=63, WHITESPACE=64, DOT=65, DOTDOT=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "Integer", 
		"IDENT", "NUM_INT", "COMMENT", "STRING", "COLON", "PLUS", "MINUS", "STAR", 
		"SLASH", "ASSIGN", "COMMA", "SEMI", "EQUAL", "NOT_EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "WHITESPACE", "DOT", 
		"DOTDOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'UNIT'", "'IMPLEMENTATION'", "'LABEL'", "'CONST'", 
		"'CHR'", "'TYPE'", "'FUNCTION'", "'CHAR'", "'BOOLEAN'", "'INTEGER'", "'STRING'", 
		"'PACKED'", "'ARRAY'", "'OF'", "'VAR'", "'EXIT'", "'IN'", "'OR'", "'DIV'", 
		"'MOD'", "'AND'", "'NOT'", "'NIL'", "'BEGIN'", "'END'", "'IF'", "'THEN'", 
		"'ELSE'", "'CASE'", "'WHILE'", "'DO'", "'REPEAT'", "'FOR'", "'TO'", "'DOWNTO'", 
		"'Read'", "'read'", "'Write'", "'write'", null, null, null, null, null, 
		"':'", "'+'", "'-'", "'*'", "'/'", "'='", "','", "';'", "'=='", "'!='", 
		"'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "']'", null, "'.'", 
		"'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Integer", "IDENT", "NUM_INT", "COMMENT", 
		"STRING", "COLON", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", 
		"SEMI", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "WHITESPACE", "DOT", "DOTDOT"
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


	public teachSimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "teachSimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u01b8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\7+\u0165\n+\f+"+
		"\16+\u0168\13+\3,\6,\u016b\n,\r,\16,\u016c\3-\3-\3-\7-\u0172\n-\f-\16"+
		"-\u0175\13-\3-\3-\3-\3.\3.\3.\3.\7.\u017e\n.\f.\16.\u0181\13.\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\6A\u01ae\nA\rA\16A\u01af\3A\3A\3B\3B\3C\3C\3C\3\u0173"+
		"\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\3\2\6\4\2C\\c|\6\2\62;C\\"+
		"aac|\3\2))\5\2\13\f\17\17\"\"\u01bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u008f"+
		"\3\2\2\2\7\u0094\3\2\2\2\t\u00a3\3\2\2\2\13\u00a9\3\2\2\2\r\u00af\3\2"+
		"\2\2\17\u00b3\3\2\2\2\21\u00b8\3\2\2\2\23\u00c1\3\2\2\2\25\u00c6\3\2\2"+
		"\2\27\u00ce\3\2\2\2\31\u00d6\3\2\2\2\33\u00dd\3\2\2\2\35\u00e4\3\2\2\2"+
		"\37\u00ea\3\2\2\2!\u00ed\3\2\2\2#\u00f1\3\2\2\2%\u00f6\3\2\2\2\'\u00f9"+
		"\3\2\2\2)\u00fc\3\2\2\2+\u0100\3\2\2\2-\u0104\3\2\2\2/\u0108\3\2\2\2\61"+
		"\u010c\3\2\2\2\63\u0110\3\2\2\2\65\u0116\3\2\2\2\67\u011a\3\2\2\29\u011d"+
		"\3\2\2\2;\u0122\3\2\2\2=\u0127\3\2\2\2?\u012c\3\2\2\2A\u0132\3\2\2\2C"+
		"\u0135\3\2\2\2E\u013c\3\2\2\2G\u0140\3\2\2\2I\u0143\3\2\2\2K\u014a\3\2"+
		"\2\2M\u014f\3\2\2\2O\u0154\3\2\2\2Q\u015a\3\2\2\2S\u0160\3\2\2\2U\u0162"+
		"\3\2\2\2W\u016a\3\2\2\2Y\u016e\3\2\2\2[\u0179\3\2\2\2]\u0184\3\2\2\2_"+
		"\u0186\3\2\2\2a\u0188\3\2\2\2c\u018a\3\2\2\2e\u018c\3\2\2\2g\u018e\3\2"+
		"\2\2i\u0190\3\2\2\2k\u0192\3\2\2\2m\u0194\3\2\2\2o\u0197\3\2\2\2q\u019a"+
		"\3\2\2\2s\u019c\3\2\2\2u\u019f\3\2\2\2w\u01a2\3\2\2\2y\u01a4\3\2\2\2{"+
		"\u01a6\3\2\2\2}\u01a8\3\2\2\2\177\u01aa\3\2\2\2\u0081\u01ad\3\2\2\2\u0083"+
		"\u01b3\3\2\2\2\u0085\u01b5\3\2\2\2\u0087\u0088\7R\2\2\u0088\u0089\7T\2"+
		"\2\u0089\u008a\7Q\2\2\u008a\u008b\7I\2\2\u008b\u008c\7T\2\2\u008c\u008d"+
		"\7C\2\2\u008d\u008e\7O\2\2\u008e\4\3\2\2\2\u008f\u0090\7W\2\2\u0090\u0091"+
		"\7P\2\2\u0091\u0092\7K\2\2\u0092\u0093\7V\2\2\u0093\6\3\2\2\2\u0094\u0095"+
		"\7K\2\2\u0095\u0096\7O\2\2\u0096\u0097\7R\2\2\u0097\u0098\7N\2\2\u0098"+
		"\u0099\7G\2\2\u0099\u009a\7O\2\2\u009a\u009b\7G\2\2\u009b\u009c\7P\2\2"+
		"\u009c\u009d\7V\2\2\u009d\u009e\7C\2\2\u009e\u009f\7V\2\2\u009f\u00a0"+
		"\7K\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a2\7P\2\2\u00a2\b\3\2\2\2\u00a3\u00a4"+
		"\7N\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7D\2\2\u00a6\u00a7\7G\2\2\u00a7"+
		"\u00a8\7N\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7E\2\2\u00aa\u00ab\7Q\2\2\u00ab"+
		"\u00ac\7P\2\2\u00ac\u00ad\7U\2\2\u00ad\u00ae\7V\2\2\u00ae\f\3\2\2\2\u00af"+
		"\u00b0\7E\2\2\u00b0\u00b1\7J\2\2\u00b1\u00b2\7T\2\2\u00b2\16\3\2\2\2\u00b3"+
		"\u00b4\7V\2\2\u00b4\u00b5\7[\2\2\u00b5\u00b6\7R\2\2\u00b6\u00b7\7G\2\2"+
		"\u00b7\20\3\2\2\2\u00b8\u00b9\7H\2\2\u00b9\u00ba\7W\2\2\u00ba\u00bb\7"+
		"P\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\7K\2\2\u00be\u00bf"+
		"\7Q\2\2\u00bf\u00c0\7P\2\2\u00c0\22\3\2\2\2\u00c1\u00c2\7E\2\2\u00c2\u00c3"+
		"\7J\2\2\u00c3\u00c4\7C\2\2\u00c4\u00c5\7T\2\2\u00c5\24\3\2\2\2\u00c6\u00c7"+
		"\7D\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00c9\7Q\2\2\u00c9\u00ca\7N\2\2\u00ca"+
		"\u00cb\7G\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd\7P\2\2\u00cd\26\3\2\2\2\u00ce"+
		"\u00cf\7K\2\2\u00cf\u00d0\7P\2\2\u00d0\u00d1\7V\2\2\u00d1\u00d2\7G\2\2"+
		"\u00d2\u00d3\7I\2\2\u00d3\u00d4\7G\2\2\u00d4\u00d5\7T\2\2\u00d5\30\3\2"+
		"\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7V\2\2\u00d8\u00d9\7T\2\2\u00d9\u00da"+
		"\7K\2\2\u00da\u00db\7P\2\2\u00db\u00dc\7I\2\2\u00dc\32\3\2\2\2\u00dd\u00de"+
		"\7R\2\2\u00de\u00df\7C\2\2\u00df\u00e0\7E\2\2\u00e0\u00e1\7M\2\2\u00e1"+
		"\u00e2\7G\2\2\u00e2\u00e3\7F\2\2\u00e3\34\3\2\2\2\u00e4\u00e5\7C\2\2\u00e5"+
		"\u00e6\7T\2\2\u00e6\u00e7\7T\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9\7[\2\2"+
		"\u00e9\36\3\2\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7H\2\2\u00ec \3\2\2\2"+
		"\u00ed\u00ee\7X\2\2\u00ee\u00ef\7C\2\2\u00ef\u00f0\7T\2\2\u00f0\"\3\2"+
		"\2\2\u00f1\u00f2\7G\2\2\u00f2\u00f3\7Z\2\2\u00f3\u00f4\7K\2\2\u00f4\u00f5"+
		"\7V\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7K\2\2\u00f7\u00f8\7P\2\2\u00f8&\3"+
		"\2\2\2\u00f9\u00fa\7Q\2\2\u00fa\u00fb\7T\2\2\u00fb(\3\2\2\2\u00fc\u00fd"+
		"\7F\2\2\u00fd\u00fe\7K\2\2\u00fe\u00ff\7X\2\2\u00ff*\3\2\2\2\u0100\u0101"+
		"\7O\2\2\u0101\u0102\7Q\2\2\u0102\u0103\7F\2\2\u0103,\3\2\2\2\u0104\u0105"+
		"\7C\2\2\u0105\u0106\7P\2\2\u0106\u0107\7F\2\2\u0107.\3\2\2\2\u0108\u0109"+
		"\7P\2\2\u0109\u010a\7Q\2\2\u010a\u010b\7V\2\2\u010b\60\3\2\2\2\u010c\u010d"+
		"\7P\2\2\u010d\u010e\7K\2\2\u010e\u010f\7N\2\2\u010f\62\3\2\2\2\u0110\u0111"+
		"\7D\2\2\u0111\u0112\7G\2\2\u0112\u0113\7I\2\2\u0113\u0114\7K\2\2\u0114"+
		"\u0115\7P\2\2\u0115\64\3\2\2\2\u0116\u0117\7G\2\2\u0117\u0118\7P\2\2\u0118"+
		"\u0119\7F\2\2\u0119\66\3\2\2\2\u011a\u011b\7K\2\2\u011b\u011c\7H\2\2\u011c"+
		"8\3\2\2\2\u011d\u011e\7V\2\2\u011e\u011f\7J\2\2\u011f\u0120\7G\2\2\u0120"+
		"\u0121\7P\2\2\u0121:\3\2\2\2\u0122\u0123\7G\2\2\u0123\u0124\7N\2\2\u0124"+
		"\u0125\7U\2\2\u0125\u0126\7G\2\2\u0126<\3\2\2\2\u0127\u0128\7E\2\2\u0128"+
		"\u0129\7C\2\2\u0129\u012a\7U\2\2\u012a\u012b\7G\2\2\u012b>\3\2\2\2\u012c"+
		"\u012d\7Y\2\2\u012d\u012e\7J\2\2\u012e\u012f\7K\2\2\u012f\u0130\7N\2\2"+
		"\u0130\u0131\7G\2\2\u0131@\3\2\2\2\u0132\u0133\7F\2\2\u0133\u0134\7Q\2"+
		"\2\u0134B\3\2\2\2\u0135\u0136\7T\2\2\u0136\u0137\7G\2\2\u0137\u0138\7"+
		"R\2\2\u0138\u0139\7G\2\2\u0139\u013a\7C\2\2\u013a\u013b\7V\2\2\u013bD"+
		"\3\2\2\2\u013c\u013d\7H\2\2\u013d\u013e\7Q\2\2\u013e\u013f\7T\2\2\u013f"+
		"F\3\2\2\2\u0140\u0141\7V\2\2\u0141\u0142\7Q\2\2\u0142H\3\2\2\2\u0143\u0144"+
		"\7F\2\2\u0144\u0145\7Q\2\2\u0145\u0146\7Y\2\2\u0146\u0147\7P\2\2\u0147"+
		"\u0148\7V\2\2\u0148\u0149\7Q\2\2\u0149J\3\2\2\2\u014a\u014b\7T\2\2\u014b"+
		"\u014c\7g\2\2\u014c\u014d\7c\2\2\u014d\u014e\7f\2\2\u014eL\3\2\2\2\u014f"+
		"\u0150\7t\2\2\u0150\u0151\7g\2\2\u0151\u0152\7c\2\2\u0152\u0153\7f\2\2"+
		"\u0153N\3\2\2\2\u0154\u0155\7Y\2\2\u0155\u0156\7t\2\2\u0156\u0157\7k\2"+
		"\2\u0157\u0158\7v\2\2\u0158\u0159\7g\2\2\u0159P\3\2\2\2\u015a\u015b\7"+
		"y\2\2\u015b\u015c\7t\2\2\u015c\u015d\7k\2\2\u015d\u015e\7v\2\2\u015e\u015f"+
		"\7g\2\2\u015fR\3\2\2\2\u0160\u0161\5W,\2\u0161T\3\2\2\2\u0162\u0166\t"+
		"\2\2\2\u0163\u0165\t\3\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167V\3\2\2\2\u0168\u0166\3\2\2\2"+
		"\u0169\u016b\4\62;\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016dX\3\2\2\2\u016e\u016f\5e\63\2\u016f"+
		"\u0173\5c\62\2\u0170\u0172\13\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3"+
		"\2\2\2\u0173\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0177\5c\62\2\u0177\u0178\5e\63\2\u0178Z\3\2\2\2"+
		"\u0179\u017f\7)\2\2\u017a\u017b\7)\2\2\u017b\u017e\7)\2\2\u017c\u017e"+
		"\n\4\2\2\u017d\u017a\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0183\7)\2\2\u0183\\\3\2\2\2\u0184\u0185\7<\2\2\u0185^\3\2"+
		"\2\2\u0186\u0187\7-\2\2\u0187`\3\2\2\2\u0188\u0189\7/\2\2\u0189b\3\2\2"+
		"\2\u018a\u018b\7,\2\2\u018bd\3\2\2\2\u018c\u018d\7\61\2\2\u018df\3\2\2"+
		"\2\u018e\u018f\7?\2\2\u018fh\3\2\2\2\u0190\u0191\7.\2\2\u0191j\3\2\2\2"+
		"\u0192\u0193\7=\2\2\u0193l\3\2\2\2\u0194\u0195\7?\2\2\u0195\u0196\7?\2"+
		"\2\u0196n\3\2\2\2\u0197\u0198\7#\2\2\u0198\u0199\7?\2\2\u0199p\3\2\2\2"+
		"\u019a\u019b\7>\2\2\u019br\3\2\2\2\u019c\u019d\7>\2\2\u019d\u019e\7?\2"+
		"\2\u019et\3\2\2\2\u019f\u01a0\7@\2\2\u01a0\u01a1\7?\2\2\u01a1v\3\2\2\2"+
		"\u01a2\u01a3\7@\2\2\u01a3x\3\2\2\2\u01a4\u01a5\7*\2\2\u01a5z\3\2\2\2\u01a6"+
		"\u01a7\7+\2\2\u01a7|\3\2\2\2\u01a8\u01a9\7]\2\2\u01a9~\3\2\2\2\u01aa\u01ab"+
		"\7_\2\2\u01ab\u0080\3\2\2\2\u01ac\u01ae\t\5\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\bA\2\2\u01b2\u0082\3\2\2\2\u01b3\u01b4\7\60\2\2\u01b4"+
		"\u0084\3\2\2\2\u01b5\u01b6\7\60\2\2\u01b6\u01b7\7\60\2\2\u01b7\u0086\3"+
		"\2\2\2\t\2\u0166\u016c\u0173\u017d\u017f\u01af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}