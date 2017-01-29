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
		Numero=32, Letra=33, String=34, Comentario=35, Espaco=36;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_retorno = 2, RULE_declaracao = 3, 
		RULE_print = 4, RULE_atribuicao = 5, RULE_funcao = 6, RULE_integral = 7, 
		RULE_expressao = 8, RULE_intervaloInt = 9, RULE_identificadorF = 10, RULE_relacao = 11, 
		RULE_dominio = 12, RULE_contradominio = 13, RULE_intervalo = 14, RULE_seno = 15, 
		RULE_cosseno = 16, RULE_valor = 17, RULE_constante = 18;
	public static final String[] ruleNames = {
		"programa", "bloco", "retorno", "declaracao", "print", "atribuicao", "funcao", 
		"integral", "expressao", "intervaloInt", "identificadorF", "relacao", 
		"dominio", "contradominio", "intervalo", "seno", "cosseno", "valor", "constante"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'return'", "'print'", "'('", "')'", "'='", "'integre'", "'d'", 
		"'-'", "'^'", "'*'", "'/'", "'+'", "'de'", "'a'", "'{'", "'|'", "'}'", 
		"'N'", "'Z'", "'Q'", "'R'", "'['", "'<->'", "']'", "'sen'", "'cos'", "'+infinito'", 
		"'-infinito'", "'pi'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Identificador", "Numero", "Letra", 
		"String", "Comentario", "Espaco"
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
			setState(38);
			bloco();
			setState(39);
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
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__24) | (1L << T__25) | (1L << Identificador))) != 0)) {
				{
				{
				setState(41);
				declaracao();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(47);
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
			setState(50);
			match(T__0);
			setState(56);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__7:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Identificador:
			case Numero:
				{
				setState(51);
				expressao(0);
				 ((RetornoContext)_localctx).tipo =  "expressao"; 
				}
				break;
			case String:
				{
				setState(54);
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
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				atribuicao();
				 ((DeclaracaoContext)_localctx).tipoDecl =  "atribuicao"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				funcao();
				 ((DeclaracaoContext)_localctx).tipoDecl =  "funcao";     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
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
			setState(69);
			match(T__1);
			setState(70);
			match(T__2);
			setState(76);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__7:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Identificador:
			case Numero:
				{
				setState(71);
				expressao(0);
				 ((PrintContext)_localctx).tipoPrint =  "expressao";     
				}
				break;
			case String:
				{
				setState(74);
				match(String);
				 ((PrintContext)_localctx).tipoPrint =  "string";        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
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
			setState(80);
			match(Identificador);
			setState(81);
			match(T__4);
			setState(82);
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
		public SenoContext seno() {
			return getRuleContext(SenoContext.class,0);
		}
		public RelacaoContext relacao() {
			return getRuleContext(RelacaoContext.class,0);
		}
		public CossenoContext cosseno() {
			return getRuleContext(CossenoContext.class,0);
		}
		public IdentificadorFContext identificadorF() {
			return getRuleContext(IdentificadorFContext.class,0);
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(84);
					relacao();
					}
				}

				setState(87);
				seno();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(88);
					relacao();
					}
				}

				setState(91);
				cosseno();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(92);
					relacao();
					}
				}

				setState(95);
				identificadorF();
				setState(96);
				match(T__4);
				setState(97);
				expressao(0);
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

	public static class IntegralContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode Identificador() { return getToken(matematicaParser.Identificador, 0); }
		public IntervaloIntContext intervaloInt() {
			return getRuleContext(IntervaloIntContext.class,0);
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
		enterRule(_localctx, 14, RULE_integral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__5);
			setState(102);
			expressao(0);
			setState(103);
			match(T__6);
			setState(104);
			match(Identificador);
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(105);
				intervaloInt();
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(109);
				match(T__7);
				setState(110);
				expressao(13);
				 ((ExpressaoContext)_localctx).tipo =  "unario";         
				}
				break;
			case 2:
				{
				setState(113);
				integral();
				 ((ExpressaoContext)_localctx).tipo =  "integral";       
				}
				break;
			case 3:
				{
				setState(116);
				match(T__2);
				setState(117);
				expressao(0);
				setState(118);
				match(T__3);
				 ((ExpressaoContext)_localctx).tipo =  "parenteses";     
				}
				break;
			case 4:
				{
				setState(121);
				valor();
				 ((ExpressaoContext)_localctx).tipo =  "valor";          
				}
				break;
			case 5:
				{
				setState(124);
				identificadorF();
				 ((ExpressaoContext)_localctx).tipo =  "identificadorF"; 
				}
				break;
			case 6:
				{
				setState(127);
				match(Identificador);
				 ((ExpressaoContext)_localctx).tipo =  "identificador";  
				}
				break;
			case 7:
				{
				setState(129);
				seno();
				 ((ExpressaoContext)_localctx).tipo =  "seno";           
				}
				break;
			case 8:
				{
				setState(132);
				cosseno();
				 ((ExpressaoContext)_localctx).tipo =  "cosseno";        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(137);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(138);
						match(T__8);
						setState(139);
						expressao(12);
						 ((ExpressaoContext)_localctx).tipo =  "potencia";       
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(142);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(143);
						match(T__9);
						setState(144);
						expressao(11);
						 ((ExpressaoContext)_localctx).tipo =  "multiplicacao";  
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(147);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(148);
						match(T__10);
						setState(149);
						expressao(10);
						 ((ExpressaoContext)_localctx).tipo =  "divisao";        
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(152);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(153);
						match(T__11);
						setState(154);
						expressao(9);
						 ((ExpressaoContext)_localctx).tipo =  "soma";           
						}
						break;
					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(157);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158);
						match(T__7);
						setState(159);
						expressao(8);
						 ((ExpressaoContext)_localctx).tipo =  "subtracao";      
						}
						break;
					}
					} 
				}
				setState(166);
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

	public static class IntervaloIntContext extends ParserRuleContext {
		public Token ID1;
		public Token ID2;
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> Identificador() { return getTokens(matematicaParser.Identificador); }
		public TerminalNode Identificador(int i) {
			return getToken(matematicaParser.Identificador, i);
		}
		public IntervaloIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervaloInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).enterIntervaloInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof matematicaListener ) ((matematicaListener)listener).exitIntervaloInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof matematicaVisitor ) return ((matematicaVisitor<? extends T>)visitor).visitIntervaloInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervaloIntContext intervaloInt() throws RecognitionException {
		IntervaloIntContext _localctx = new IntervaloIntContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_intervaloInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__12);
			setState(170);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Numero:
				{
				setState(168);
				valor();
				}
				break;
			case Identificador:
				{
				setState(169);
				((IntervaloIntContext)_localctx).ID1 = match(Identificador);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
			match(T__13);
			setState(175);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Numero:
				{
				setState(173);
				valor();
				}
				break;
			case Identificador:
				{
				setState(174);
				((IntervaloIntContext)_localctx).ID2 = match(Identificador);
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
		enterRule(_localctx, 20, RULE_identificadorF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((IdentificadorFContext)_localctx).ID1 = match(Identificador);
			setState(178);
			match(T__2);
			setState(179);
			((IdentificadorFContext)_localctx).ID2 = match(Identificador);
			setState(180);
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
		enterRule(_localctx, 22, RULE_relacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__14);
			setState(183);
			dominio();
			setState(184);
			match(T__15);
			setState(185);
			contradominio();
			setState(186);
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
		enterRule(_localctx, 24, RULE_dominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(190);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(189);
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
		enterRule(_localctx, 26, RULE_contradominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(194);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(193);
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
		enterRule(_localctx, 28, RULE_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__21);
			setState(197);
			valor();
			setState(198);
			match(T__22);
			setState(199);
			valor();
			setState(200);
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
		enterRule(_localctx, 30, RULE_seno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__24);
			setState(203);
			match(T__2);
			setState(204);
			expressao(0);
			setState(205);
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
		enterRule(_localctx, 32, RULE_cosseno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__25);
			setState(208);
			match(T__2);
			setState(209);
			expressao(0);
			setState(210);
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
		enterRule(_localctx, 34, RULE_valor);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case Numero:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
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
				setState(214);
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
		enterRule(_localctx, 36, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\5\3"+
		"\63\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\5\bX\n\b\3\b\3\b\5\b\\\n\b\3\b\3\b\5\b`\n\b\3\b\3\b\3\b\3\b"+
		"\5\bf\n\b\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a5\n\n\f\n\16"+
		"\n\u00a8\13\n\3\13\3\13\3\13\5\13\u00ad\n\13\3\13\3\13\3\13\5\13\u00b2"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00c1"+
		"\n\16\3\17\3\17\5\17\u00c5\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00dc\n\23\3\24\3\24\3\24\2\3\22\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\4\3\2\24\27\3\2\35 \u00e9\2(\3\2\2\2\4.\3\2\2\2\6\64\3\2"+
		"\2\2\bE\3\2\2\2\nG\3\2\2\2\fR\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22\u0089"+
		"\3\2\2\2\24\u00a9\3\2\2\2\26\u00b3\3\2\2\2\30\u00b8\3\2\2\2\32\u00be\3"+
		"\2\2\2\34\u00c2\3\2\2\2\36\u00c6\3\2\2\2 \u00cc\3\2\2\2\"\u00d1\3\2\2"+
		"\2$\u00db\3\2\2\2&\u00dd\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+-\5\b"+
		"\5\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\61\63\5\6\4\2\62\61\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64:\7\3\2\2\65"+
		"\66\5\22\n\2\66\67\b\4\1\2\67;\3\2\2\289\7$\2\29;\b\4\1\2:\65\3\2\2\2"+
		":8\3\2\2\2;\7\3\2\2\2<=\5\f\7\2=>\b\5\1\2>F\3\2\2\2?@\5\16\b\2@A\b\5\1"+
		"\2AF\3\2\2\2BC\5\n\6\2CD\b\5\1\2DF\3\2\2\2E<\3\2\2\2E?\3\2\2\2EB\3\2\2"+
		"\2F\t\3\2\2\2GH\7\4\2\2HN\7\5\2\2IJ\5\22\n\2JK\b\6\1\2KO\3\2\2\2LM\7$"+
		"\2\2MO\b\6\1\2NI\3\2\2\2NL\3\2\2\2OP\3\2\2\2PQ\7\6\2\2Q\13\3\2\2\2RS\7"+
		"!\2\2ST\7\7\2\2TU\5\22\n\2U\r\3\2\2\2VX\5\30\r\2WV\3\2\2\2WX\3\2\2\2X"+
		"Y\3\2\2\2Yf\5 \21\2Z\\\5\30\r\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]f\5\""+
		"\22\2^`\5\30\r\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\5\26\f\2bc\7\7\2\2cd"+
		"\5\22\n\2df\3\2\2\2eW\3\2\2\2e[\3\2\2\2e_\3\2\2\2f\17\3\2\2\2gh\7\b\2"+
		"\2hi\5\22\n\2ij\7\t\2\2jl\7!\2\2km\5\24\13\2lk\3\2\2\2lm\3\2\2\2m\21\3"+
		"\2\2\2no\b\n\1\2op\7\n\2\2pq\5\22\n\17qr\b\n\1\2r\u008a\3\2\2\2st\5\20"+
		"\t\2tu\b\n\1\2u\u008a\3\2\2\2vw\7\5\2\2wx\5\22\n\2xy\7\6\2\2yz\b\n\1\2"+
		"z\u008a\3\2\2\2{|\5$\23\2|}\b\n\1\2}\u008a\3\2\2\2~\177\5\26\f\2\177\u0080"+
		"\b\n\1\2\u0080\u008a\3\2\2\2\u0081\u0082\7!\2\2\u0082\u008a\b\n\1\2\u0083"+
		"\u0084\5 \21\2\u0084\u0085\b\n\1\2\u0085\u008a\3\2\2\2\u0086\u0087\5\""+
		"\22\2\u0087\u0088\b\n\1\2\u0088\u008a\3\2\2\2\u0089n\3\2\2\2\u0089s\3"+
		"\2\2\2\u0089v\3\2\2\2\u0089{\3\2\2\2\u0089~\3\2\2\2\u0089\u0081\3\2\2"+
		"\2\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u00a6\3\2\2\2\u008b\u008c"+
		"\f\r\2\2\u008c\u008d\7\13\2\2\u008d\u008e\5\22\n\16\u008e\u008f\b\n\1"+
		"\2\u008f\u00a5\3\2\2\2\u0090\u0091\f\f\2\2\u0091\u0092\7\f\2\2\u0092\u0093"+
		"\5\22\n\r\u0093\u0094\b\n\1\2\u0094\u00a5\3\2\2\2\u0095\u0096\f\13\2\2"+
		"\u0096\u0097\7\r\2\2\u0097\u0098\5\22\n\f\u0098\u0099\b\n\1\2\u0099\u00a5"+
		"\3\2\2\2\u009a\u009b\f\n\2\2\u009b\u009c\7\16\2\2\u009c\u009d\5\22\n\13"+
		"\u009d\u009e\b\n\1\2\u009e\u00a5\3\2\2\2\u009f\u00a0\f\t\2\2\u00a0\u00a1"+
		"\7\n\2\2\u00a1\u00a2\5\22\n\n\u00a2\u00a3\b\n\1\2\u00a3\u00a5\3\2\2\2"+
		"\u00a4\u008b\3\2\2\2\u00a4\u0090\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u009a"+
		"\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\7\17\2"+
		"\2\u00aa\u00ad\5$\23\2\u00ab\u00ad\7!\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\7\20\2\2\u00af\u00b2\5$\23\2"+
		"\u00b0\u00b2\7!\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\25\3"+
		"\2\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\7!\2\2\u00b6"+
		"\u00b7\7\6\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\7\21\2\2\u00b9\u00ba\5\32"+
		"\16\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7\23\2\2"+
		"\u00bd\31\3\2\2\2\u00be\u00c0\t\2\2\2\u00bf\u00c1\5\36\20\2\u00c0\u00bf"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\33\3\2\2\2\u00c2\u00c4\t\2\2\2\u00c3"+
		"\u00c5\5\36\20\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\35\3\2"+
		"\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\5$\23\2\u00c8\u00c9\7\31\2\2\u00c9"+
		"\u00ca\5$\23\2\u00ca\u00cb\7\32\2\2\u00cb\37\3\2\2\2\u00cc\u00cd\7\33"+
		"\2\2\u00cd\u00ce\7\5\2\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0\7\6\2\2\u00d0"+
		"!\3\2\2\2\u00d1\u00d2\7\34\2\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\5\22\n"+
		"\2\u00d4\u00d5\7\6\2\2\u00d5#\3\2\2\2\u00d6\u00d7\7\"\2\2\u00d7\u00dc"+
		"\b\23\1\2\u00d8\u00d9\5&\24\2\u00d9\u00da\b\23\1\2\u00da\u00dc\3\2\2\2"+
		"\u00db\u00d6\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc%\3\2\2\2\u00dd\u00de\t"+
		"\3\2\2\u00de\'\3\2\2\2\24.\62:ENW[_el\u0089\u00a4\u00a6\u00ac\u00b1\u00c0"+
		"\u00c4\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}