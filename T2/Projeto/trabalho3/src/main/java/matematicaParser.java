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
		RULE_programa = 0, RULE_bloco = 1, RULE_declaracao = 2, RULE_print = 3, 
		RULE_atribuicao = 4, RULE_funcao = 5, RULE_integral = 6, RULE_expressao = 7, 
		RULE_intervaloInt = 8, RULE_identificadorF = 9, RULE_relacao = 10, RULE_dominio = 11, 
		RULE_contradominio = 12, RULE_intervalo = 13, RULE_seno = 14, RULE_cosseno = 15, 
		RULE_valor = 16, RULE_constante = 17;
	public static final String[] ruleNames = {
		"programa", "bloco", "declaracao", "print", "atribuicao", "funcao", "integral", 
		"expressao", "intervaloInt", "identificadorF", "relacao", "dominio", "contradominio", 
		"intervalo", "seno", "cosseno", "valor", "constante"
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
			setState(36);
			bloco();
			setState(37);
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__24) | (1L << T__25) | (1L << Identificador))) != 0)) {
				{
				{
				setState(39);
				declaracao();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(45);
				match(T__0);
				setState(46);
				expressao(0);
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

	public static class DeclaracaoContext extends ParserRuleContext {
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
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				funcao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				print();
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
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
			setState(55);
			match(T__2);
			setState(58);
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
				setState(56);
				expressao(0);
				}
				break;
			case String:
				{
				setState(57);
				match(String);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(60);
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
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Identificador);
			setState(63);
			match(T__4);
			setState(64);
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
		enterRule(_localctx, 10, RULE_funcao);
		int _la;
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(66);
					relacao();
					}
				}

				setState(69);
				seno();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(70);
					relacao();
					}
				}

				setState(73);
				cosseno();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(74);
					relacao();
					}
				}

				setState(77);
				identificadorF();
				setState(78);
				match(T__4);
				setState(79);
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
		enterRule(_localctx, 12, RULE_integral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__5);
			setState(84);
			expressao(0);
			setState(85);
			match(T__6);
			setState(86);
			match(Identificador);
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(87);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(91);
				match(T__7);
				setState(92);
				expressao(13);
				 ((ExpressaoContext)_localctx).tipo =  "unario";         
				}
				break;
			case 2:
				{
				setState(95);
				integral();
				 ((ExpressaoContext)_localctx).tipo =  "integral";       
				}
				break;
			case 3:
				{
				setState(98);
				match(T__2);
				setState(99);
				expressao(0);
				setState(100);
				match(T__3);
				 ((ExpressaoContext)_localctx).tipo =  "parenteses";     
				}
				break;
			case 4:
				{
				setState(103);
				valor();
				 ((ExpressaoContext)_localctx).tipo =  "valor";          
				}
				break;
			case 5:
				{
				setState(106);
				identificadorF();
				 ((ExpressaoContext)_localctx).tipo =  "identificadorF"; 
				}
				break;
			case 6:
				{
				setState(109);
				match(Identificador);
				 ((ExpressaoContext)_localctx).tipo =  "identificador";  
				}
				break;
			case 7:
				{
				setState(111);
				seno();
				 ((ExpressaoContext)_localctx).tipo =  "seno";           
				}
				break;
			case 8:
				{
				setState(114);
				cosseno();
				 ((ExpressaoContext)_localctx).tipo =  "cosseno";        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(119);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(120);
						match(T__8);
						setState(121);
						expressao(12);
						 ((ExpressaoContext)_localctx).tipo =  "exponencial";    
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(124);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(125);
						match(T__9);
						setState(126);
						expressao(11);
						 ((ExpressaoContext)_localctx).tipo =  "multiplicacao";  
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(129);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(130);
						match(T__10);
						setState(131);
						expressao(10);
						 ((ExpressaoContext)_localctx).tipo =  "divisao";        
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(134);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(135);
						match(T__11);
						setState(136);
						expressao(9);
						 ((ExpressaoContext)_localctx).tipo =  "soma";           
						}
						break;
					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(139);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(140);
						match(T__7);
						setState(141);
						expressao(8);
						 ((ExpressaoContext)_localctx).tipo =  "subtracao";      
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 16, RULE_intervaloInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__12);
			setState(152);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Numero:
				{
				setState(150);
				valor();
				}
				break;
			case Identificador:
				{
				setState(151);
				((IntervaloIntContext)_localctx).ID1 = match(Identificador);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			match(T__13);
			setState(157);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case Numero:
				{
				setState(155);
				valor();
				}
				break;
			case Identificador:
				{
				setState(156);
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
		enterRule(_localctx, 18, RULE_identificadorF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((IdentificadorFContext)_localctx).ID1 = match(Identificador);
			setState(160);
			match(T__2);
			setState(161);
			((IdentificadorFContext)_localctx).ID2 = match(Identificador);
			setState(162);
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
		enterRule(_localctx, 20, RULE_relacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__14);
			setState(165);
			dominio();
			setState(166);
			match(T__15);
			setState(167);
			contradominio();
			setState(168);
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
		enterRule(_localctx, 22, RULE_dominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(172);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(171);
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
		enterRule(_localctx, 24, RULE_contradominio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(176);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(175);
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
		enterRule(_localctx, 26, RULE_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__21);
			setState(179);
			valor();
			setState(180);
			match(T__22);
			setState(181);
			valor();
			setState(182);
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
		enterRule(_localctx, 28, RULE_seno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__24);
			setState(185);
			match(T__2);
			setState(186);
			expressao(0);
			setState(187);
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
		enterRule(_localctx, 30, RULE_cosseno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__25);
			setState(190);
			match(T__2);
			setState(191);
			expressao(0);
			setState(192);
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
		enterRule(_localctx, 32, RULE_valor);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case Numero:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(Numero);
				}
				break;
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				constante();
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
		enterRule(_localctx, 34, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		case 7:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\5\7F\n\7\3\7\3\7\5\7J\n\7\3\7\3\7\5\7N\n\7\3\7\3\7\3\7\3\7\5\7"+
		"T\n\7\3\b\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tx\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0093\n\t\f\t\16\t\u0096"+
		"\13\t\3\n\3\n\3\n\5\n\u009b\n\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00af\n\r\3\16\3\16"+
		"\5\16\u00b3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00c7\n\22\3\23\3\23\3\23\2\3"+
		"\20\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\24\27\3\2\35"+
		" \u00d4\2&\3\2\2\2\4,\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\n@\3\2\2\2\fS\3"+
		"\2\2\2\16U\3\2\2\2\20w\3\2\2\2\22\u0097\3\2\2\2\24\u00a1\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00ac\3\2\2\2\32\u00b0\3\2\2\2\34\u00b4\3\2\2\2\36\u00ba\3"+
		"\2\2\2 \u00bf\3\2\2\2\"\u00c6\3\2\2\2$\u00c8\3\2\2\2&\'\5\4\3\2\'(\7\2"+
		"\2\3(\3\3\2\2\2)+\5\6\4\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61"+
		"\3\2\2\2.,\3\2\2\2/\60\7\3\2\2\60\62\5\20\t\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\5\3\2\2\2\63\67\5\n\6\2\64\67\5\f\7\2\65\67\5\b\5\2\66\63\3\2\2"+
		"\2\66\64\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\7\4\2\29<\7\5\2\2:=\5\20"+
		"\t\2;=\7$\2\2<:\3\2\2\2<;\3\2\2\2=>\3\2\2\2>?\7\6\2\2?\t\3\2\2\2@A\7!"+
		"\2\2AB\7\7\2\2BC\5\20\t\2C\13\3\2\2\2DF\5\26\f\2ED\3\2\2\2EF\3\2\2\2F"+
		"G\3\2\2\2GT\5\36\20\2HJ\5\26\f\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KT\5 \21"+
		"\2LN\5\26\f\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\5\24\13\2PQ\7\7\2\2QR\5"+
		"\20\t\2RT\3\2\2\2SE\3\2\2\2SI\3\2\2\2SM\3\2\2\2T\r\3\2\2\2UV\7\b\2\2V"+
		"W\5\20\t\2WX\7\t\2\2XZ\7!\2\2Y[\5\22\n\2ZY\3\2\2\2Z[\3\2\2\2[\17\3\2\2"+
		"\2\\]\b\t\1\2]^\7\n\2\2^_\5\20\t\17_`\b\t\1\2`x\3\2\2\2ab\5\16\b\2bc\b"+
		"\t\1\2cx\3\2\2\2de\7\5\2\2ef\5\20\t\2fg\7\6\2\2gh\b\t\1\2hx\3\2\2\2ij"+
		"\5\"\22\2jk\b\t\1\2kx\3\2\2\2lm\5\24\13\2mn\b\t\1\2nx\3\2\2\2op\7!\2\2"+
		"px\b\t\1\2qr\5\36\20\2rs\b\t\1\2sx\3\2\2\2tu\5 \21\2uv\b\t\1\2vx\3\2\2"+
		"\2w\\\3\2\2\2wa\3\2\2\2wd\3\2\2\2wi\3\2\2\2wl\3\2\2\2wo\3\2\2\2wq\3\2"+
		"\2\2wt\3\2\2\2x\u0094\3\2\2\2yz\f\r\2\2z{\7\13\2\2{|\5\20\t\16|}\b\t\1"+
		"\2}\u0093\3\2\2\2~\177\f\f\2\2\177\u0080\7\f\2\2\u0080\u0081\5\20\t\r"+
		"\u0081\u0082\b\t\1\2\u0082\u0093\3\2\2\2\u0083\u0084\f\13\2\2\u0084\u0085"+
		"\7\r\2\2\u0085\u0086\5\20\t\f\u0086\u0087\b\t\1\2\u0087\u0093\3\2\2\2"+
		"\u0088\u0089\f\n\2\2\u0089\u008a\7\16\2\2\u008a\u008b\5\20\t\13\u008b"+
		"\u008c\b\t\1\2\u008c\u0093\3\2\2\2\u008d\u008e\f\t\2\2\u008e\u008f\7\n"+
		"\2\2\u008f\u0090\5\20\t\n\u0090\u0091\b\t\1\2\u0091\u0093\3\2\2\2\u0092"+
		"y\3\2\2\2\u0092~\3\2\2\2\u0092\u0083\3\2\2\2\u0092\u0088\3\2\2\2\u0092"+
		"\u008d\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\21\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009a\7\17\2\2\u0098\u009b"+
		"\5\"\22\2\u0099\u009b\7!\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009f\7\20\2\2\u009d\u00a0\5\"\22\2\u009e\u00a0\7"+
		"!\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u00a2"+
		"\7!\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\7!\2\2\u00a4\u00a5\7\6\2\2\u00a5"+
		"\25\3\2\2\2\u00a6\u00a7\7\21\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\22"+
		"\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\7\23\2\2\u00ab\27\3\2\2\2\u00ac"+
		"\u00ae\t\2\2\2\u00ad\u00af\5\34\17\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af\31\3\2\2\2\u00b0\u00b2\t\2\2\2\u00b1\u00b3\5\34\17\2\u00b2"+
		"\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\7\30\2"+
		"\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7\7\31\2\2\u00b7\u00b8\5\"\22\2\u00b8"+
		"\u00b9\7\32\2\2\u00b9\35\3\2\2\2\u00ba\u00bb\7\33\2\2\u00bb\u00bc\7\5"+
		"\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7\6\2\2\u00be\37\3\2\2\2\u00bf\u00c0"+
		"\7\34\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7\6\2\2"+
		"\u00c3!\3\2\2\2\u00c4\u00c7\7\"\2\2\u00c5\u00c7\5$\23\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c5\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\t\3\2\2\u00c9%\3"+
		"\2\2\2\23,\61\66<EIMSZw\u0092\u0094\u009a\u009f\u00ae\u00b2\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}