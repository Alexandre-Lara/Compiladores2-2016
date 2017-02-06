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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, X=33, Identificador=34, Numero=35, String=36, Comentario=37, 
		Espaco=38, Letra=39;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_retorno = 2, RULE_declaracao = 3, 
		RULE_print = 4, RULE_atribuicao = 5, RULE_funcao = 6, RULE_expressao = 7, 
		RULE_integral = 8, RULE_derivada = 9, RULE_pontoDerivacao = 10, RULE_polinomio = 11, 
		RULE_monomio = 12, RULE_incognita = 13, RULE_coeficiente = 14, RULE_expoente = 15, 
		RULE_intervaloIntegracao = 16, RULE_limiteIntegracao = 17, RULE_identificadorF = 18, 
		RULE_relacao = 19, RULE_dominio = 20, RULE_contradominio = 21, RULE_intervalo = 22, 
		RULE_seno = 23, RULE_cosseno = 24, RULE_valor = 25, RULE_constante = 26, 
		RULE_numeroComSinal = 27;
	public static final String[] ruleNames = {
		"programa", "bloco", "retorno", "declaracao", "print", "atribuicao", "funcao", 
		"expressao", "integral", "derivada", "pontoDerivacao", "polinomio", "monomio", 
		"incognita", "coeficiente", "expoente", "intervaloIntegracao", "limiteIntegracao", 
		"identificadorF", "relacao", "dominio", "contradominio", "intervalo", 
		"seno", "cosseno", "valor", "constante", "numeroComSinal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'retorne'", "'print'", "'('", "')'", "'='", "'-'", "'+'", "'^'", 
		"'*'", "'/'", "'integre'", "'d'", "'derive'", "'em'", "'de'", "'a'", "'{'", 
		"'|'", "'}'", "'N'", "'Z'", "'Q'", "'R'", "'['", "'<->'", "']'", "'sen'", 
		"'cos'", "'pi'", "'e'", "'+infinito'", "'-infinito'", "'x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "X", "Identificador", 
		"Numero", "String", "Comentario", "Espaco", "Letra"
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
			setState(56);
			bloco();
			setState(57);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__16) | (1L << Identificador))) != 0)) {
				{
				{
				setState(59);
				declaracao();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(65);
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
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__0);
				setState(69);
				expressao(0);
				 ((RetornoContext)_localctx).tipo =  "expressao"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__0);
				setState(73);
				match(String);
				 ((RetornoContext)_localctx).tipo =  "string";    
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
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				atribuicao();
				 ((DeclaracaoContext)_localctx).tipoDecl =  "atribuicao"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				funcao();
				 ((DeclaracaoContext)_localctx).tipoDecl =  "funcao";     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
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
			setState(88);
			match(T__1);
			setState(89);
			match(T__2);
			setState(95);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__6:
			case T__10:
			case T__12:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case X:
			case Identificador:
			case Numero:
				{
				setState(90);
				expressao(0);
				 ((PrintContext)_localctx).tipoPrint =  "expressao";     
				}
				break;
			case String:
				{
				setState(93);
				match(String);
				 ((PrintContext)_localctx).tipoPrint =  "string";        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97);
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
			setState(99);
			match(Identificador);
			setState(100);
			match(T__4);
			setState(101);
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(103);
					relacao();
					}
				}

				setState(106);
				identificadorF();
				setState(107);
				match(T__4);
				setState(108);
				seno();
				 ((FuncaoContext)_localctx).tipo =  "seno";     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(111);
					relacao();
					}
				}

				setState(114);
				identificadorF();
				setState(115);
				match(T__4);
				setState(116);
				cosseno();
				 ((FuncaoContext)_localctx).tipo =  "cosseno";  
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(119);
					relacao();
					}
				}

				setState(122);
				identificadorF();
				setState(123);
				match(T__4);
				setState(124);
				polinomio();
				 ((FuncaoContext)_localctx).tipo =  "polinomio";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(127);
					relacao();
					}
				}

				setState(130);
				identificadorF();
				setState(131);
				match(T__4);
				setState(132);
				expressao(0);
				 ((FuncaoContext)_localctx).tipo =  "derivada"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
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
		public DerivadaContext derivada() {
			return getRuleContext(DerivadaContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public IdentificadorFContext identificadorF() {
			return getRuleContext(IdentificadorFContext.class,0);
		}
		public TerminalNode X() { return getToken(matematicaParser.X, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(139);
				match(T__5);
				setState(140);
				expressao(16);
				 ((ExpressaoContext)_localctx).tipo =  "unario";         
				}
				break;
			case 2:
				{
				setState(143);
				match(T__6);
				setState(144);
				expressao(15);
				 ((ExpressaoContext)_localctx).tipo =  "unarioSoma";     
				}
				break;
			case 3:
				{
				setState(147);
				integral();
				 ((ExpressaoContext)_localctx).tipo =  "integral";       
				}
				break;
			case 4:
				{
				setState(150);
				derivada();
				 ((ExpressaoContext)_localctx).tipo =  "derivada";       
				}
				break;
			case 5:
				{
				setState(153);
				match(T__2);
				setState(154);
				expressao(0);
				setState(155);
				match(T__3);
				 ((ExpressaoContext)_localctx).tipo =  "parenteses";     
				}
				break;
			case 6:
				{
				setState(158);
				valor();
				 ((ExpressaoContext)_localctx).tipo =  "valor";          
				}
				break;
			case 7:
				{
				setState(161);
				identificadorF();
				 ((ExpressaoContext)_localctx).tipo =  "identificadorF"; 
				}
				break;
			case 8:
				{
				setState(164);
				match(X);
				 ((ExpressaoContext)_localctx).tipo =  "X";              
				}
				break;
			case 9:
				{
				setState(166);
				match(Identificador);
				 ((ExpressaoContext)_localctx).tipo =  "identificador";  
				}
				break;
			case 10:
				{
				setState(168);
				seno();
				 ((ExpressaoContext)_localctx).tipo =  "seno";           
				}
				break;
			case 11:
				{
				setState(171);
				cosseno();
				 ((ExpressaoContext)_localctx).tipo =  "cosseno";        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(176);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(177);
						match(T__7);
						setState(178);
						expressao(13);
						 ((ExpressaoContext)_localctx).tipo =  "potencia";       
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(181);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(182);
						match(T__8);
						setState(183);
						expressao(12);
						 ((ExpressaoContext)_localctx).tipo =  "multiplicacao";  
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(186);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(187);
						match(T__9);
						setState(188);
						expressao(11);
						 ((ExpressaoContext)_localctx).tipo =  "divisao";        
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(191);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(192);
						match(T__6);
						setState(193);
						expressao(10);
						 ((ExpressaoContext)_localctx).tipo =  "soma";           
						}
						break;
					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(196);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(197);
						match(T__5);
						setState(198);
						expressao(9);
						 ((ExpressaoContext)_localctx).tipo =  "subtracao";      
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class IntegralContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode X() { return getToken(matematicaParser.X, 0); }
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
		enterRule(_localctx, 16, RULE_integral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__10);
			setState(207);
			expressao(0);
			setState(208);
			match(T__11);
			setState(209);
			match(X);
			setState(210);
			intervaloIntegracao();
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

	public static class DerivadaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PontoDerivacaoContext pontoDerivacao() {
			return getRuleContext(PontoDerivacaoContext.class,0);
		}
		public DerivadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterDerivada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitDerivada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitDerivada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivadaContext derivada() throws RecognitionException {
		DerivadaContext _localctx = new DerivadaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_derivada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__12);
			setState(213);
			expressao(0);
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(214);
				pontoDerivacao();
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

	public static class PontoDerivacaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PontoDerivacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pontoDerivacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterPontoDerivacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitPontoDerivacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitPontoDerivacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PontoDerivacaoContext pontoDerivacao() throws RecognitionException {
		PontoDerivacaoContext _localctx = new PontoDerivacaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pontoDerivacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__13);
			setState(218);
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
		enterRule(_localctx, 22, RULE_polinomio);
		try {
			int _alt;
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(221);
						monomio();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(224); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 24, RULE_monomio);
		int _la;
		try {
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(228);
					coeficiente();
					}
					break;
				}
				setState(231);
				incognita();
				setState(233);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(232);
					expoente();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
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
		public TerminalNode X() { return getToken(matematicaParser.X, 0); }
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
		enterRule(_localctx, 26, RULE_incognita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(X);
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
		public String tipo;
		public NumeroComSinalContext numeroComSinal() {
			return getRuleContext(NumeroComSinalContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		enterRule(_localctx, 28, RULE_coeficiente);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				numeroComSinal();
				 ((CoeficienteContext)_localctx).tipo =  "numero";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				expressao(0);
				 ((CoeficienteContext)_localctx).tipo =  "expressao";
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
		enterRule(_localctx, 30, RULE_expoente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__7);
			setState(249);
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
		enterRule(_localctx, 32, RULE_intervaloIntegracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__14);
			setState(252);
			((IntervaloIntegracaoContext)_localctx).l1 = limiteIntegracao();
			setState(253);
			match(T__15);
			setState(254);
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_limiteIntegracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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

	public static class IdentificadorFContext extends ParserRuleContext {
		public Token ID1;
		public Token ID2;
		public TerminalNode Identificador() { return getToken(matematicaParser.Identificador, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode X() { return getToken(matematicaParser.X, 0); }
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
		enterRule(_localctx, 36, RULE_identificadorF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((IdentificadorFContext)_localctx).ID1 = match(Identificador);
			setState(259);
			match(T__2);
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(260);
				((IdentificadorFContext)_localctx).ID2 = match(X);
				}
				break;
			case 2:
				{
				setState(261);
				expressao(0);
				}
				break;
			}
			setState(264);
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
		enterRule(_localctx, 38, RULE_relacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__16);
			setState(267);
			dominio();
			setState(268);
			match(T__17);
			setState(269);
			contradominio();
			setState(270);
			match(T__18);
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
		enterRule(_localctx, 40, RULE_dominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(274);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(273);
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
		enterRule(_localctx, 42, RULE_contradominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(278);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(277);
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
		enterRule(_localctx, 44, RULE_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__23);
			setState(281);
			valor();
			setState(282);
			match(T__24);
			setState(283);
			valor();
			setState(284);
			match(T__25);
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
		enterRule(_localctx, 46, RULE_seno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__26);
			setState(287);
			match(T__2);
			setState(288);
			expressao(0);
			setState(289);
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
		enterRule(_localctx, 48, RULE_cosseno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__27);
			setState(292);
			match(T__2);
			setState(293);
			expressao(0);
			setState(294);
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
		enterRule(_localctx, 50, RULE_valor);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case Numero:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(Numero);
				 ((ValorContext)_localctx).tipo =  "numero";    
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
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
		enterRule(_localctx, 52, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
		enterRule(_localctx, 54, RULE_numeroComSinal);
		try {
			setState(308);
			switch (_input.LA(1)) {
			case Numero:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(Numero);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(T__6);
				setState(307);
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
		case 7:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\7\3?\n\3\f\3"+
		"\16\3B\13\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"b\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\5\bk\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"s\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b1\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00cc\n\t\f\t\16\t\u00cf\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f\3\f\3\r\3\r\6\r\u00e1"+
		"\n\r\r\r\16\r\u00e2\5\r\u00e5\n\r\3\16\5\16\u00e8\n\16\3\16\3\16\5\16"+
		"\u00ec\n\16\3\16\5\16\u00ef\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00f9\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\5\24\u0109\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\5\26\u0115\n\26\3\27\3\27\5\27\u0119\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0130\n\33\3\34\3\34\3\35\3\35\3\35\5\35"+
		"\u0137\n\35\3\35\2\3\20\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668\2\4\3\2\26\31\3\2\37\"\u0145\2:\3\2\2\2\4@\3\2\2\2"+
		"\6M\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\fe\3\2\2\2\16\u008a\3\2\2\2\20\u00b0"+
		"\3\2\2\2\22\u00d0\3\2\2\2\24\u00d6\3\2\2\2\26\u00db\3\2\2\2\30\u00e4\3"+
		"\2\2\2\32\u00ee\3\2\2\2\34\u00f0\3\2\2\2\36\u00f8\3\2\2\2 \u00fa\3\2\2"+
		"\2\"\u00fd\3\2\2\2$\u0102\3\2\2\2&\u0104\3\2\2\2(\u010c\3\2\2\2*\u0112"+
		"\3\2\2\2,\u0116\3\2\2\2.\u011a\3\2\2\2\60\u0120\3\2\2\2\62\u0125\3\2\2"+
		"\2\64\u012f\3\2\2\2\66\u0131\3\2\2\28\u0136\3\2\2\2:;\5\4\3\2;<\7\2\2"+
		"\3<\3\3\2\2\2=?\5\b\5\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2CE\5\6\4\2DC\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FG\7\3\2\2GH\5"+
		"\20\t\2HI\b\4\1\2IN\3\2\2\2JK\7\3\2\2KL\7&\2\2LN\b\4\1\2MF\3\2\2\2MJ\3"+
		"\2\2\2N\7\3\2\2\2OP\5\f\7\2PQ\b\5\1\2QY\3\2\2\2RS\5\16\b\2ST\b\5\1\2T"+
		"Y\3\2\2\2UV\5\n\6\2VW\b\5\1\2WY\3\2\2\2XO\3\2\2\2XR\3\2\2\2XU\3\2\2\2"+
		"Y\t\3\2\2\2Z[\7\4\2\2[a\7\5\2\2\\]\5\20\t\2]^\b\6\1\2^b\3\2\2\2_`\7&\2"+
		"\2`b\b\6\1\2a\\\3\2\2\2a_\3\2\2\2bc\3\2\2\2cd\7\6\2\2d\13\3\2\2\2ef\7"+
		"$\2\2fg\7\7\2\2gh\5\20\t\2h\r\3\2\2\2ik\5(\25\2ji\3\2\2\2jk\3\2\2\2kl"+
		"\3\2\2\2lm\5&\24\2mn\7\7\2\2no\5\60\31\2op\b\b\1\2p\u008b\3\2\2\2qs\5"+
		"(\25\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\5&\24\2uv\7\7\2\2vw\5\62\32\2w"+
		"x\b\b\1\2x\u008b\3\2\2\2y{\5(\25\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\5&"+
		"\24\2}~\7\7\2\2~\177\5\30\r\2\177\u0080\b\b\1\2\u0080\u008b\3\2\2\2\u0081"+
		"\u0083\5(\25\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\5&\24\2\u0085\u0086\7\7\2\2\u0086\u0087\5\20\t\2\u0087"+
		"\u0088\b\b\1\2\u0088\u008b\3\2\2\2\u0089\u008b\5&\24\2\u008aj\3\2\2\2"+
		"\u008ar\3\2\2\2\u008az\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\17\3\2\2\2\u008c\u008d\b\t\1\2\u008d\u008e\7\b\2\2\u008e\u008f"+
		"\5\20\t\22\u008f\u0090\b\t\1\2\u0090\u00b1\3\2\2\2\u0091\u0092\7\t\2\2"+
		"\u0092\u0093\5\20\t\21\u0093\u0094\b\t\1\2\u0094\u00b1\3\2\2\2\u0095\u0096"+
		"\5\22\n\2\u0096\u0097\b\t\1\2\u0097\u00b1\3\2\2\2\u0098\u0099\5\24\13"+
		"\2\u0099\u009a\b\t\1\2\u009a\u00b1\3\2\2\2\u009b\u009c\7\5\2\2\u009c\u009d"+
		"\5\20\t\2\u009d\u009e\7\6\2\2\u009e\u009f\b\t\1\2\u009f\u00b1\3\2\2\2"+
		"\u00a0\u00a1\5\64\33\2\u00a1\u00a2\b\t\1\2\u00a2\u00b1\3\2\2\2\u00a3\u00a4"+
		"\5&\24\2\u00a4\u00a5\b\t\1\2\u00a5\u00b1\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7"+
		"\u00b1\b\t\1\2\u00a8\u00a9\7$\2\2\u00a9\u00b1\b\t\1\2\u00aa\u00ab\5\60"+
		"\31\2\u00ab\u00ac\b\t\1\2\u00ac\u00b1\3\2\2\2\u00ad\u00ae\5\62\32\2\u00ae"+
		"\u00af\b\t\1\2\u00af\u00b1\3\2\2\2\u00b0\u008c\3\2\2\2\u00b0\u0091\3\2"+
		"\2\2\u00b0\u0095\3\2\2\2\u00b0\u0098\3\2\2\2\u00b0\u009b\3\2\2\2\u00b0"+
		"\u00a0\3\2\2\2\u00b0\u00a3\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b0\u00a8\3\2"+
		"\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00cd\3\2\2\2\u00b2"+
		"\u00b3\f\16\2\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\5\20\t\17\u00b5\u00b6"+
		"\b\t\1\2\u00b6\u00cc\3\2\2\2\u00b7\u00b8\f\r\2\2\u00b8\u00b9\7\13\2\2"+
		"\u00b9\u00ba\5\20\t\16\u00ba\u00bb\b\t\1\2\u00bb\u00cc\3\2\2\2\u00bc\u00bd"+
		"\f\f\2\2\u00bd\u00be\7\f\2\2\u00be\u00bf\5\20\t\r\u00bf\u00c0\b\t\1\2"+
		"\u00c0\u00cc\3\2\2\2\u00c1\u00c2\f\13\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4"+
		"\5\20\t\f\u00c4\u00c5\b\t\1\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\f\n\2\2"+
		"\u00c7\u00c8\7\b\2\2\u00c8\u00c9\5\20\t\13\u00c9\u00ca\b\t\1\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00b2\3\2\2\2\u00cb\u00b7\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cb"+
		"\u00c1\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\21\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1"+
		"\7\r\2\2\u00d1\u00d2\5\20\t\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4\7#\2\2"+
		"\u00d4\u00d5\5\"\22\2\u00d5\23\3\2\2\2\u00d6\u00d7\7\17\2\2\u00d7\u00d9"+
		"\5\20\t\2\u00d8\u00da\5\26\f\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\25\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd\5\20\t\2\u00dd\27\3"+
		"\2\2\2\u00de\u00e5\3\2\2\2\u00df\u00e1\5\32\16\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\31\3\2\2\2\u00e6\u00e8"+
		"\5\36\20\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2"+
		"\u00e9\u00eb\5\34\17\2\u00ea\u00ec\5 \21\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\5\36\20\2\u00ee\u00e7\3\2\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\33\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1\35\3\2"+
		"\2\2\u00f2\u00f3\58\35\2\u00f3\u00f4\b\20\1\2\u00f4\u00f9\3\2\2\2\u00f5"+
		"\u00f6\5\20\t\2\u00f6\u00f7\b\20\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00f2\3"+
		"\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\37\3\2\2\2\u00fa\u00fb\7\n\2\2\u00fb"+
		"\u00fc\58\35\2\u00fc!\3\2\2\2\u00fd\u00fe\7\21\2\2\u00fe\u00ff\5$\23\2"+
		"\u00ff\u0100\7\22\2\2\u0100\u0101\5$\23\2\u0101#\3\2\2\2\u0102\u0103\5"+
		"\20\t\2\u0103%\3\2\2\2\u0104\u0105\7$\2\2\u0105\u0108\7\5\2\2\u0106\u0109"+
		"\7#\2\2\u0107\u0109\5\20\t\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\7\6\2\2\u010b\'\3\2\2\2\u010c\u010d\7\23\2"+
		"\2\u010d\u010e\5*\26\2\u010e\u010f\7\24\2\2\u010f\u0110\5,\27\2\u0110"+
		"\u0111\7\25\2\2\u0111)\3\2\2\2\u0112\u0114\t\2\2\2\u0113\u0115\5.\30\2"+
		"\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115+\3\2\2\2\u0116\u0118\t"+
		"\2\2\2\u0117\u0119\5.\30\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"-\3\2\2\2\u011a\u011b\7\32\2\2\u011b\u011c\5\64\33\2\u011c\u011d\7\33"+
		"\2\2\u011d\u011e\5\64\33\2\u011e\u011f\7\34\2\2\u011f/\3\2\2\2\u0120\u0121"+
		"\7\35\2\2\u0121\u0122\7\5\2\2\u0122\u0123\5\20\t\2\u0123\u0124\7\6\2\2"+
		"\u0124\61\3\2\2\2\u0125\u0126\7\36\2\2\u0126\u0127\7\5\2\2\u0127\u0128"+
		"\5\20\t\2\u0128\u0129\7\6\2\2\u0129\63\3\2\2\2\u012a\u012b\7%\2\2\u012b"+
		"\u0130\b\33\1\2\u012c\u012d\5\66\34\2\u012d\u012e\b\33\1\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012c\3\2\2\2\u0130\65\3\2\2\2\u0131"+
		"\u0132\t\3\2\2\u0132\67\3\2\2\2\u0133\u0137\7%\2\2\u0134\u0135\7\t\2\2"+
		"\u0135\u0137\7%\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u01379\3\2"+
		"\2\2\33@DMXajrz\u0082\u008a\u00b0\u00cb\u00cd\u00d9\u00e2\u00e4\u00e7"+
		"\u00eb\u00ee\u00f8\u0108\u0114\u0118\u012f\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}