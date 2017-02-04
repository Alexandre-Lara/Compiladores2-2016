// Generated from matematica.g4 by ANTLR 4.5
package main.java;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matematicaParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_retorno = 2, RULE_declaracao = 3, 
		RULE_print = 4, RULE_atribuicao = 5, RULE_funcao = 6, RULE_polinomio = 7, 
		RULE_monomio = 8, RULE_incognita = 9, RULE_coeficiente = 10, RULE_expoente = 11, 
		RULE_integral = 12, RULE_expressao = 13, RULE_intervaloIntegracao = 14, 
		RULE_limiteIntegracao = 15, RULE_identificadorF = 16, RULE_relacao = 17, 
		RULE_dominio = 18, RULE_contradominio = 19, RULE_intervalo = 20, RULE_seno = 21, 
		RULE_cosseno = 22, RULE_valor = 23, RULE_constante = 24, RULE_numeroComSinal = 25;
	public static final String[] ruleNames = {
		"programa", "bloco", "retorno", "declaracao", "print", "atribuicao", "funcao", 
		"polinomio", "monomio", "incognita", "coeficiente", "expoente", "integral", 
		"expressao", "intervaloIntegracao", "limiteIntegracao", "identificadorF", 
		"relacao", "dominio", "contradominio", "intervalo", "seno", "cosseno", 
		"valor", "constante", "numeroComSinal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'return'", "'print'", "'('", "')'", "'='", "'^'", "'integre'", 
		"'d'", "'-'", "'*'", "'/'", "'+'", "'de'", "'a'", "'{'", "'|'", "'}'", 
		"'N'", "'Z'", "'Q'", "'R'", "'['", "'<->'", "']'", "'sen'", "'cos'", "'+infinito'", 
		"'-infinito'", "'pi'", "'e'"
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

	@Override
	public String getGrammarFileName() { return "matematica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public matematicaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(matematicaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			bloco();
			setState(53);
			match(EOF);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << Identificador))) != 0)) {
				{
				{
				setState(55);
				declaracao();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(61);
				retorno();
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

	public static class RetornoContext extends ParserRuleContext {
		public String tipo;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode String() { return getToken(matematicaParser.String, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(70);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case T__8:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Identificador:
			case Numero:
				{
				setState(65);
				expressao(0);
				 ((RetornoContext)_localctx).tipo =  "expressao"; 
				}
				break;
			case String:
				{
				setState(68);
				match(String);
				 ((RetornoContext)_localctx).tipo =  "string"; 
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public String tipoDecl;
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				atribuicao();
				 ((DeclaracaoContext)_localctx).tipoDecl =  "atribuicao"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				funcao();
				 ((DeclaracaoContext)_localctx).tipoDecl =  "funcao";     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				print();
				 ((DeclaracaoContext)_localctx).tipoDecl =  "print";      
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

	public static class PrintContext extends ParserRuleContext {
		public String tipoPrint;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode String() { return getToken(matematicaParser.String, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__1);
			setState(84);
			match(T__2);
			setState(90);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case T__8:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Identificador:
			case Numero:
				{
				setState(85);
				expressao(0);
				 ((PrintContext)_localctx).tipoPrint =  "expressao";     
				}
				break;
			case String:
				{
				setState(88);
				match(String);
				 ((PrintContext)_localctx).tipoPrint =  "string";        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(92);
			match(T__3);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode Identificador() { return getToken(matematicaParser.Identificador, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(Identificador);
			setState(95);
			match(T__4);
			setState(96);
			expressao(0);
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

	public static class FuncaoContext extends ParserRuleContext {
		public String tipo;
		public IdentificadorFContext identificadorF() {
			return getRuleContext(IdentificadorFContext.class,0);
		}
		public SenoContext seno() {
			return getRuleContext(SenoContext.class,0);
		}
		public RelacaoContext relacao() {
			return getRuleContext(RelacaoContext.class,0);
		}
		public CossenoContext cosseno() {
			return getRuleContext(CossenoContext.class,0);
		}
		public PolinomioContext polinomio() {
			return getRuleContext(PolinomioContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcao);
		int _la;
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(98);
					relacao();
					}
				}

				setState(101);
				identificadorF();
				setState(102);
				match(T__4);
				setState(103);
				seno();
				 ((FuncaoContext)_localctx).tipo =  "seno";     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(106);
					relacao();
					}
				}

				setState(109);
				identificadorF();
				setState(110);
				match(T__4);
				setState(111);
				cosseno();
				 ((FuncaoContext)_localctx).tipo =  "cosseno";  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(114);
					relacao();
					}
				}

				setState(117);
				identificadorF();
				setState(118);
				match(T__4);
				setState(119);
				polinomio();
				 ((FuncaoContext)_localctx).tipo =  "polinomio";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				identificadorF();
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

	public static class PolinomioContext extends ParserRuleContext {
		public List<MonomioContext> monomio() {
			return getRuleContexts(MonomioContext.class);
		}
		public MonomioContext monomio(int i) {
			return getRuleContext(MonomioContext.class,i);
		}
		public PolinomioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterPolinomio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitPolinomio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitPolinomio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolinomioContext polinomio() throws RecognitionException {
		PolinomioContext _localctx = new PolinomioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_polinomio);
		try {
			int _alt;
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(126);
						monomio();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MonomioContext extends ParserRuleContext {
		public CoeficienteContext coef2;
		public IncognitaContext incognita() {
			return getRuleContext(IncognitaContext.class,0);
		}
		public CoeficienteContext coeficiente() {
			return getRuleContext(CoeficienteContext.class,0);
		}
		public ExpoenteContext expoente() {
			return getRuleContext(ExpoenteContext.class,0);
		}
		public MonomioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monomio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterMonomio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitMonomio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitMonomio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonomioContext monomio() throws RecognitionException {
		MonomioContext _localctx = new MonomioContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_monomio);
		int _la;
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				_la = _input.LA(1);
				if (_la==T__11 || _la==Numero) {
					{
					setState(133);
					coeficiente();
					}
				}

				setState(136);
				incognita();
				setState(138);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(137);
					expoente();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((MonomioContext)_localctx).coef2 = coeficiente();
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

	public static class IncognitaContext extends ParserRuleContext {
		public TerminalNode Identificador() { return getToken(matematicaParser.Identificador, 0); }
		public IncognitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incognita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterIncognita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitIncognita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitIncognita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncognitaContext incognita() throws RecognitionException {
		IncognitaContext _localctx = new IncognitaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_incognita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(Identificador);
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

	public static class CoeficienteContext extends ParserRuleContext {
		public NumeroComSinalContext numeroComSinal() {
			return getRuleContext(NumeroComSinalContext.class,0);
		}
		public CoeficienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coeficiente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterCoeficiente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitCoeficiente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitCoeficiente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoeficienteContext coeficiente() throws RecognitionException {
		CoeficienteContext _localctx = new CoeficienteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_coeficiente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			numeroComSinal();
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

	public static class ExpoenteContext extends ParserRuleContext {
		public NumeroComSinalContext numeroComSinal() {
			return getRuleContext(NumeroComSinalContext.class,0);
		}
		public ExpoenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expoente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterExpoente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitExpoente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitExpoente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpoenteContext expoente() throws RecognitionException {
		ExpoenteContext _localctx = new ExpoenteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expoente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__5);
			setState(148);
			numeroComSinal();
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

	public static class IntegralContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode Identificador() { return getToken(matematicaParser.Identificador, 0); }
		public IntervaloIntegracaoContext intervaloIntegracao() {
			return getRuleContext(IntervaloIntegracaoContext.class,0);
		}
		public IntegralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterIntegral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitIntegral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitIntegral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralContext integral() throws RecognitionException {
		IntegralContext _localctx = new IntegralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__6);
			setState(151);
			expressao(0);
			setState(152);
			match(T__7);
			setState(153);
			match(Identificador);
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(154);
				intervaloIntegracao();
				}
				break;
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

	public static class ExpressaoContext extends ParserRuleContext {
		public String tipo;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public IntegralContext integral() {
			return getRuleContext(IntegralContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public IdentificadorFContext identificadorF() {
			return getRuleContext(IdentificadorFContext.class,0);
		}
		public TerminalNode Identificador() { return getToken(matematicaParser.Identificador, 0); }
		public SenoContext seno() {
			return getRuleContext(SenoContext.class,0);
		}
		public CossenoContext cosseno() {
			return getRuleContext(CossenoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(158);
				match(T__8);
				setState(159);
				expressao(13);
				 ((ExpressaoContext)_localctx).tipo =  "unario";         
				}
				break;
			case 2:
				{
				setState(162);
				integral();
				 ((ExpressaoContext)_localctx).tipo =  "integral";       
				}
				break;
			case 3:
				{
				setState(165);
				match(T__2);
				setState(166);
				expressao(0);
				setState(167);
				match(T__3);
				 ((ExpressaoContext)_localctx).tipo =  "parenteses";     
				}
				break;
			case 4:
				{
				setState(170);
				valor();
				 ((ExpressaoContext)_localctx).tipo =  "valor";          
				}
				break;
			case 5:
				{
				setState(173);
				identificadorF();
				 ((ExpressaoContext)_localctx).tipo =  "identificadorF"; 
				}
				break;
			case 6:
				{
				setState(176);
				match(Identificador);
				 ((ExpressaoContext)_localctx).tipo =  "identificador";  
				}
				break;
			case 7:
				{
				setState(178);
				seno();
				 ((ExpressaoContext)_localctx).tipo =  "seno";           
				}
				break;
			case 8:
				{
				setState(181);
				cosseno();
				 ((ExpressaoContext)_localctx).tipo =  "cosseno";        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(186);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(187);
						match(T__5);
						setState(188);
						expressao(12);
						 ((ExpressaoContext)_localctx).tipo =  "potencia";       
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(191);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(192);
						match(T__9);
						setState(193);
						expressao(11);
						 ((ExpressaoContext)_localctx).tipo =  "multiplicacao";  
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						match(T__10);
						setState(198);
						expressao(10);
						 ((ExpressaoContext)_localctx).tipo =  "divisao";        
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(201);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(202);
						match(T__11);
						setState(203);
						expressao(9);
						 ((ExpressaoContext)_localctx).tipo =  "soma";           
						}
						break;
					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(206);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(207);
						match(T__8);
						setState(208);
						expressao(8);
						 ((ExpressaoContext)_localctx).tipo =  "subtracao";      
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntervaloIntegracaoContext extends ParserRuleContext {
		public LimiteIntegracaoContext l1;
		public LimiteIntegracaoContext l2;
		public List<LimiteIntegracaoContext> limiteIntegracao() {
			return getRuleContexts(LimiteIntegracaoContext.class);
		}
		public LimiteIntegracaoContext limiteIntegracao(int i) {
			return getRuleContext(LimiteIntegracaoContext.class,i);
		}
		public IntervaloIntegracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervaloIntegracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterIntervaloIntegracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitIntervaloIntegracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitIntervaloIntegracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervaloIntegracaoContext intervaloIntegracao() throws RecognitionException {
		IntervaloIntegracaoContext _localctx = new IntervaloIntegracaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_intervaloIntegracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__12);
			setState(217);
			((IntervaloIntegracaoContext)_localctx).l1 = limiteIntegracao();
			setState(218);
			match(T__13);
			setState(219);
			((IntervaloIntegracaoContext)_localctx).l2 = limiteIntegracao();
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

	public static class LimiteIntegracaoContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode Identificador() { return getToken(matematicaParser.Identificador, 0); }
		public LimiteIntegracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limiteIntegracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterLimiteIntegracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitLimiteIntegracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitLimiteIntegracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimiteIntegracaoContext limiteIntegracao() throws RecognitionException {
		LimiteIntegracaoContext _localctx = new LimiteIntegracaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_limiteIntegracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Numero:
				{
				setState(221);
				valor();
				}
				break;
			case Identificador:
				{
				setState(222);
				match(Identificador);
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

	public static class IdentificadorFContext extends ParserRuleContext {
		public Token ID1;
		public Token ID2;
		public List<TerminalNode> Identificador() { return getTokens(matematicaParser.Identificador); }
		public TerminalNode Identificador(int i) {
			return getToken(matematicaParser.Identificador, i);
		}
		public TerminalNode Numero() { return getToken(matematicaParser.Numero, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IdentificadorFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificadorF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterIdentificadorF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitIdentificadorF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitIdentificadorF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorFContext identificadorF() throws RecognitionException {
		IdentificadorFContext _localctx = new IdentificadorFContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identificadorF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			((IdentificadorFContext)_localctx).ID1 = match(Identificador);
			setState(226);
			match(T__2);
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(227);
				((IdentificadorFContext)_localctx).ID2 = match(Identificador);
				}
				break;
			case 2:
				{
				setState(228);
				match(Numero);
				}
				break;
			case 3:
				{
				setState(229);
				expressao(0);
				}
				break;
			}
			setState(232);
			match(T__3);
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

	public static class RelacaoContext extends ParserRuleContext {
		public DominioContext dominio() {
			return getRuleContext(DominioContext.class,0);
		}
		public ContradominioContext contradominio() {
			return getRuleContext(ContradominioContext.class,0);
		}
		public RelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitRelacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitRelacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacaoContext relacao() throws RecognitionException {
		RelacaoContext _localctx = new RelacaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__14);
			setState(235);
			dominio();
			setState(236);
			match(T__15);
			setState(237);
			contradominio();
			setState(238);
			match(T__16);
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

	public static class DominioContext extends ParserRuleContext {
		public IntervaloContext intervalo() {
			return getRuleContext(IntervaloContext.class,0);
		}
		public DominioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dominio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterDominio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitDominio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitDominio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DominioContext dominio() throws RecognitionException {
		DominioContext _localctx = new DominioContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(242);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(241);
				intervalo();
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

	public static class ContradominioContext extends ParserRuleContext {
		public IntervaloContext intervalo() {
			return getRuleContext(IntervaloContext.class,0);
		}
		public ContradominioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contradominio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterContradominio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitContradominio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitContradominio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContradominioContext contradominio() throws RecognitionException {
		ContradominioContext _localctx = new ContradominioContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_contradominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(246);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(245);
				intervalo();
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

	public static class IntervaloContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public IntervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterIntervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitIntervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitIntervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervaloContext intervalo() throws RecognitionException {
		IntervaloContext _localctx = new IntervaloContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__21);
			setState(249);
			valor();
			setState(250);
			match(T__22);
			setState(251);
			valor();
			setState(252);
			match(T__23);
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

	public static class SenoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public SenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterSeno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitSeno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitSeno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenoContext seno() throws RecognitionException {
		SenoContext _localctx = new SenoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_seno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__24);
			setState(255);
			match(T__2);
			setState(256);
			expressao(0);
			setState(257);
			match(T__3);
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

	public static class CossenoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CossenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cosseno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterCosseno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitCosseno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitCosseno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CossenoContext cosseno() throws RecognitionException {
		CossenoContext _localctx = new CossenoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cosseno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__25);
			setState(260);
			match(T__2);
			setState(261);
			expressao(0);
			setState(262);
			match(T__3);
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

	public static class ValorContext extends ParserRuleContext {
		public String tipo;
		public TerminalNode Numero() { return getToken(matematicaParser.Numero, 0); }
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valor);
		try {
			setState(269);
			switch (_input.LA(1)) {
			case Numero:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(Numero);
				 ((ValorContext)_localctx).tipo =  "numero";    
				}
				break;
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				constante();
				 ((ValorContext)_localctx).tipo =  "constante"; 
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

	public static class ConstanteContext extends ParserRuleContext {
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NumeroComSinalContext extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(matematicaParser.Numero, 0); }
		public NumeroComSinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroComSinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterNumeroComSinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitNumeroComSinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitNumeroComSinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroComSinalContext numeroComSinal() throws RecognitionException {
		NumeroComSinalContext _localctx = new NumeroComSinalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numeroComSinal);
		try {
			setState(276);
			switch (_input.LA(1)) {
			case Numero:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(Numero);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__11);
				setState(275);
				match(Numero);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\5\3A"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5T\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\5\bf\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bv\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\6\t\u0082\n\t\r"+
		"\t\16\t\u0083\5\t\u0086\n\t\3\n\5\n\u0089\n\n\3\n\3\n\5\n\u008d\n\n\3"+
		"\n\5\n\u0090\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u009e\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00bb\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00d6\n\17\f\17\16\17\u00d9\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00e9\n"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00f5\n\24"+
		"\3\25\3\25\5\25\u00f9\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0110"+
		"\n\31\3\32\3\32\3\33\3\33\3\33\5\33\u0117\n\33\3\33\2\3\34\34\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\24\27\3\2\35"+
		" \u0123\2\66\3\2\2\2\4<\3\2\2\2\6B\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\f`\3"+
		"\2\2\2\16}\3\2\2\2\20\u0085\3\2\2\2\22\u008f\3\2\2\2\24\u0091\3\2\2\2"+
		"\26\u0093\3\2\2\2\30\u0095\3\2\2\2\32\u0098\3\2\2\2\34\u00ba\3\2\2\2\36"+
		"\u00da\3\2\2\2 \u00e1\3\2\2\2\"\u00e3\3\2\2\2$\u00ec\3\2\2\2&\u00f2\3"+
		"\2\2\2(\u00f6\3\2\2\2*\u00fa\3\2\2\2,\u0100\3\2\2\2.\u0105\3\2\2\2\60"+
		"\u010f\3\2\2\2\62\u0111\3\2\2\2\64\u0116\3\2\2\2\66\67\5\4\3\2\678\7\2"+
		"\2\38\3\3\2\2\29;\5\b\5\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3"+
		"\2\2\2><\3\2\2\2?A\5\6\4\2@?\3\2\2\2@A\3\2\2\2A\5\3\2\2\2BH\7\3\2\2CD"+
		"\5\34\17\2DE\b\4\1\2EI\3\2\2\2FG\7#\2\2GI\b\4\1\2HC\3\2\2\2HF\3\2\2\2"+
		"I\7\3\2\2\2JK\5\f\7\2KL\b\5\1\2LT\3\2\2\2MN\5\16\b\2NO\b\5\1\2OT\3\2\2"+
		"\2PQ\5\n\6\2QR\b\5\1\2RT\3\2\2\2SJ\3\2\2\2SM\3\2\2\2SP\3\2\2\2T\t\3\2"+
		"\2\2UV\7\4\2\2V\\\7\5\2\2WX\5\34\17\2XY\b\6\1\2Y]\3\2\2\2Z[\7#\2\2[]\b"+
		"\6\1\2\\W\3\2\2\2\\Z\3\2\2\2]^\3\2\2\2^_\7\6\2\2_\13\3\2\2\2`a\7!\2\2"+
		"ab\7\7\2\2bc\5\34\17\2c\r\3\2\2\2df\5$\23\2ed\3\2\2\2ef\3\2\2\2fg\3\2"+
		"\2\2gh\5\"\22\2hi\7\7\2\2ij\5,\27\2jk\b\b\1\2k~\3\2\2\2ln\5$\23\2ml\3"+
		"\2\2\2mn\3\2\2\2no\3\2\2\2op\5\"\22\2pq\7\7\2\2qr\5.\30\2rs\b\b\1\2s~"+
		"\3\2\2\2tv\5$\23\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\"\22\2xy\7\7\2\2"+
		"yz\5\20\t\2z{\b\b\1\2{~\3\2\2\2|~\5\"\22\2}e\3\2\2\2}m\3\2\2\2}u\3\2\2"+
		"\2}|\3\2\2\2~\17\3\2\2\2\177\u0086\3\2\2\2\u0080\u0082\5\22\n\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\177\3\2\2\2\u0085\u0081\3\2\2\2\u0086\21"+
		"\3\2\2\2\u0087\u0089\5\26\f\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008c\5\24\13\2\u008b\u008d\5\30\r\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u0090\5\26"+
		"\f\2\u008f\u0088\3\2\2\2\u008f\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092"+
		"\7!\2\2\u0092\25\3\2\2\2\u0093\u0094\5\64\33\2\u0094\27\3\2\2\2\u0095"+
		"\u0096\7\b\2\2\u0096\u0097\5\64\33\2\u0097\31\3\2\2\2\u0098\u0099\7\t"+
		"\2\2\u0099\u009a\5\34\17\2\u009a\u009b\7\n\2\2\u009b\u009d\7!\2\2\u009c"+
		"\u009e\5\36\20\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\33\3\2"+
		"\2\2\u009f\u00a0\b\17\1\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5\34\17\17"+
		"\u00a2\u00a3\b\17\1\2\u00a3\u00bb\3\2\2\2\u00a4\u00a5\5\32\16\2\u00a5"+
		"\u00a6\b\17\1\2\u00a6\u00bb\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\5"+
		"\34\17\2\u00a9\u00aa\7\6\2\2\u00aa\u00ab\b\17\1\2\u00ab\u00bb\3\2\2\2"+
		"\u00ac\u00ad\5\60\31\2\u00ad\u00ae\b\17\1\2\u00ae\u00bb\3\2\2\2\u00af"+
		"\u00b0\5\"\22\2\u00b0\u00b1\b\17\1\2\u00b1\u00bb\3\2\2\2\u00b2\u00b3\7"+
		"!\2\2\u00b3\u00bb\b\17\1\2\u00b4\u00b5\5,\27\2\u00b5\u00b6\b\17\1\2\u00b6"+
		"\u00bb\3\2\2\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\b\17\1\2\u00b9\u00bb\3"+
		"\2\2\2\u00ba\u009f\3\2\2\2\u00ba\u00a4\3\2\2\2\u00ba\u00a7\3\2\2\2\u00ba"+
		"\u00ac\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b4\3\2"+
		"\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00d7\3\2\2\2\u00bc\u00bd\f\r\2\2\u00bd"+
		"\u00be\7\b\2\2\u00be\u00bf\5\34\17\16\u00bf\u00c0\b\17\1\2\u00c0\u00d6"+
		"\3\2\2\2\u00c1\u00c2\f\f\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\5\34\17\r"+
		"\u00c4\u00c5\b\17\1\2\u00c5\u00d6\3\2\2\2\u00c6\u00c7\f\13\2\2\u00c7\u00c8"+
		"\7\r\2\2\u00c8\u00c9\5\34\17\f\u00c9\u00ca\b\17\1\2\u00ca\u00d6\3\2\2"+
		"\2\u00cb\u00cc\f\n\2\2\u00cc\u00cd\7\16\2\2\u00cd\u00ce\5\34\17\13\u00ce"+
		"\u00cf\b\17\1\2\u00cf\u00d6\3\2\2\2\u00d0\u00d1\f\t\2\2\u00d1\u00d2\7"+
		"\13\2\2\u00d2\u00d3\5\34\17\n\u00d3\u00d4\b\17\1\2\u00d4\u00d6\3\2\2\2"+
		"\u00d5\u00bc\3\2\2\2\u00d5\u00c1\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d5\u00cb"+
		"\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\35\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\17\2"+
		"\2\u00db\u00dc\5 \21\2\u00dc\u00dd\7\20\2\2\u00dd\u00de\5 \21\2\u00de"+
		"\37\3\2\2\2\u00df\u00e2\5\60\31\2\u00e0\u00e2\7!\2\2\u00e1\u00df\3\2\2"+
		"\2\u00e1\u00e0\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4\7!\2\2\u00e4\u00e8\7"+
		"\5\2\2\u00e5\u00e9\7!\2\2\u00e6\u00e9\7\"\2\2\u00e7\u00e9\5\34\17\2\u00e8"+
		"\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\7\6\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee"+
		"\5&\24\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\5(\25\2\u00f0\u00f1\7\23\2\2"+
		"\u00f1%\3\2\2\2\u00f2\u00f4\t\2\2\2\u00f3\u00f5\5*\26\2\u00f4\u00f3\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f9"+
		"\5*\26\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9)\3\2\2\2\u00fa"+
		"\u00fb\7\30\2\2\u00fb\u00fc\5\60\31\2\u00fc\u00fd\7\31\2\2\u00fd\u00fe"+
		"\5\60\31\2\u00fe\u00ff\7\32\2\2\u00ff+\3\2\2\2\u0100\u0101\7\33\2\2\u0101"+
		"\u0102\7\5\2\2\u0102\u0103\5\34\17\2\u0103\u0104\7\6\2\2\u0104-\3\2\2"+
		"\2\u0105\u0106\7\34\2\2\u0106\u0107\7\5\2\2\u0107\u0108\5\34\17\2\u0108"+
		"\u0109\7\6\2\2\u0109/\3\2\2\2\u010a\u010b\7\"\2\2\u010b\u0110\b\31\1\2"+
		"\u010c\u010d\5\62\32\2\u010d\u010e\b\31\1\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010a\3\2\2\2\u010f\u010c\3\2\2\2\u0110\61\3\2\2\2\u0111\u0112\t\3\2"+
		"\2\u0112\63\3\2\2\2\u0113\u0117\7\"\2\2\u0114\u0115\7\16\2\2\u0115\u0117"+
		"\7\"\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0117\65\3\2\2\2\32<"+
		"@HS\\emu}\u0083\u0085\u0088\u008c\u008f\u009d\u00ba\u00d5\u00d7\u00e1"+
		"\u00e8\u00f4\u00f8\u010f\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}