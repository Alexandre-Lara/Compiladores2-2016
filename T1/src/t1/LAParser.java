// Generated from LA.g4 by ANTLR 4.5.3
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		IDENTIF=60, INTEIRO=61, REAL=62, CADEIA=63, COMENTARIO=64;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_declaracao_local_global = 2, 
		RULE_declaracao_local = 3, RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, 
		RULE_ponteiros_opcionais = 7, RULE_outros_identificadores = 8, RULE_dimensao = 9, 
		RULE_tipo = 10, RULE_mais_identificadores = 11, RULE_mais_variaveis = 12, 
		RULE_tipo_basico = 13, RULE_tipo_basico_identificador = 14, RULE_tipo_estendido = 15, 
		RULE_valor_constante = 16, RULE_registro = 17, RULE_declaracao_global = 18, 
		RULE_parametros_opcionais = 19, RULE_parametro = 20, RULE_var_opcional = 21, 
		RULE_mais_parametros = 22, RULE_declaracoes_locais = 23, RULE_corpo = 24, 
		RULE_comandos = 25, RULE_cmd = 26, RULE_mais_expressao = 27, RULE_senao_opcional = 28, 
		RULE_chamada_atribuicao = 29, RULE_argumentos_opcionais = 30, RULE_selecao = 31, 
		RULE_mais_selecao = 32, RULE_constantes = 33, RULE_mais_constantes = 34, 
		RULE_numero_intervalo = 35, RULE_intervalo_opcional = 36, RULE_operador_uniario = 37, 
		RULE_expressao_aritmetica = 38, RULE_operador_multiplicacao = 39, RULE_operador_adicao = 40, 
		RULE_termo = 41, RULE_outros_termos = 42, RULE_fator = 43, RULE_outros_fatores = 44, 
		RULE_parcela = 45, RULE_parcela_unario = 46, RULE_parcela_nao_unario = 47, 
		RULE_outras_parcelas = 48, RULE_chamada_partes = 49, RULE_expressao_relacional = 50, 
		RULE_operador_opcional = 51, RULE_operador_relacional = 52, RULE_expressao = 53, 
		RULE_operador_nao = 54, RULE_termo_logico = 55, RULE_outros_termos_logicos = 56, 
		RULE_outros_fatores_logicos = 57, RULE_fator_logico = 58, RULE_parcela_logica = 59;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "declaracao_local_global", "declaracao_local", 
		"variavel", "mais_var", "identificador", "ponteiros_opcionais", "outros_identificadores", 
		"dimensao", "tipo", "mais_identificadores", "mais_variaveis", "tipo_basico", 
		"tipo_basico_identificador", "tipo_estendido", "valor_constante", "registro", 
		"declaracao_global", "parametros_opcionais", "parametro", "var_opcional", 
		"mais_parametros", "declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", 
		"senao_opcional", "chamada_atribuicao", "argumentos_opcionais", "selecao", 
		"mais_selecao", "constantes", "mais_constantes", "numero_intervalo", "intervalo_opcional", 
		"operador_uniario", "expressao_aritmetica", "operador_multiplicacao", 
		"operador_adicao", "termo", "outros_termos", "fator", "outros_fatores", 
		"parcela", "parcela_unario", "parcela_nao_unario", "outras_parcelas", 
		"chamada_partes", "expressao_relacional", "operador_opcional", "operador_relacional", 
		"expressao", "operador_nao", "termo_logico", "outros_termos_logicos", 
		"outros_fatores_logicos", "fator_logico", "parcela_logica"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
		"'='", "'tipo'", "','", "'^'", "'.'", "'['", "']'", "'literal'", "'inteiro'", 
		"'real'", "'logico'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'('", "')'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", 
		"'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'caso'", 
		"'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", "'fim_para'", 
		"'enquanto'", "'fim_enquanto'", "'retorne'", "'senao'", "'..'", "'-'", 
		"'*'", "'/'", "'+'", "'&'", "'%'", "'<>'", "'>='", "'<='", "'>'", "'<'", 
		"'nao'", "'ou'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENTIF", "INTEIRO", "REAL", "CADEIA", "COMENTARIO"
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
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	//Alessandra Camargo
	//Alexandre Lara
	//Lucas Callegari
	//Tiago Avellar
	static String grupo = "<, , 551996, 551910>"; 
	PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();

	public LAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			declaracoes();
			setState(121);
			match(T__0);
			setState(122);
			corpo();
			setState(123);
			match(T__1);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public Declaracao_local_globalContext declaracao_local_global() {
			return getRuleContext(Declaracao_local_globalContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__20) | (1L << T__24))) != 0)) {
				{
				setState(125);
				declaracao_local_global();
				setState(126);
				declaracoes();
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

	public static class Declaracao_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Declaracao_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_local_globalContext declaracao_local_global() throws RecognitionException {
		Declaracao_local_globalContext _localctx = new Declaracao_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_local_global);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				declaracao_local();
				}
				break;
			case T__20:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				declaracao_global();
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__2);
				setState(135);
				variavel();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__3);
				setState(137);
				match(IDENTIF);
				setState(138);
				match(T__4);
				setState(139);
				tipo_basico();
				setState(140);
				match(T__5);
				setState(141);
				valor_constante();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(T__6);
				setState(144);
				match(IDENTIF);
				setState(145);
				match(T__4);
				setState(146);
				tipo();
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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENTIF);
			setState(150);
			dimensao();
			setState(151);
			mais_var();
			setState(152);
			match(T__4);
			setState(153);
			tipo();
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

	public static class Mais_varContext extends ParserRuleContext {
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(155);
				match(T__7);
				setState(156);
				match(IDENTIF);
				setState(157);
				dimensao();
				setState(158);
				mais_var();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identificadoresContext outros_identificadores() {
			return getRuleContext(Outros_identificadoresContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			ponteiros_opcionais();
			setState(163);
			match(IDENTIF);
			setState(164);
			dimensao();
			setState(165);
			outros_identificadores();
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

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPonteiros_opcionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitPonteiros_opcionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(167);
				match(T__8);
				setState(168);
				ponteiros_opcionais();
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

	public static class Outros_identificadoresContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_identificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_identificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_identificadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_identificadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_identificadoresContext outros_identificadores() throws RecognitionException {
		Outros_identificadoresContext _localctx = new Outros_identificadoresContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_identificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(171);
				match(T__9);
				setState(172);
				identificador();
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

	public static class DimensaoContext extends ParserRuleContext {
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(175);
				match(T__10);
				setState(176);
				expressao_aritmetica();
				setState(177);
				match(T__11);
				setState(178);
				dimensao();
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

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(184);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				registro();
				}
				break;
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case IDENTIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				tipo_estendido();
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

	public static class Mais_identificadoresContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identificadoresContext mais_identificadores() {
			return getRuleContext(Mais_identificadoresContext.class,0);
		}
		public Mais_identificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_identificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_identificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_identificadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_identificadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_identificadoresContext mais_identificadores() throws RecognitionException {
		Mais_identificadoresContext _localctx = new Mais_identificadoresContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_identificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(186);
				match(T__7);
				setState(187);
				identificador();
				setState(188);
				mais_identificadores();
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

	public static class Mais_variaveisContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_variaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_variaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if (_la==IDENTIF) {
				{
				setState(192);
				variavel();
				setState(193);
				mais_variaveis();
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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

	public static class Tipo_basico_identificadorContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public Tipo_basico_identificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico_identificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_basico_identificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identificadorContext tipo_basico_identificador() throws RecognitionException {
		Tipo_basico_identificadorContext _localctx = new Tipo_basico_identificadorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_identificador);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				tipo_basico();
				}
				break;
			case IDENTIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(IDENTIF);
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_basico_identificadorContext tipo_basico_identificador() {
			return getRuleContext(Tipo_basico_identificadorContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			ponteiros_opcionais();
			setState(204);
			tipo_basico_identificador();
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(LAParser.REAL, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << INTEIRO) | (1L << REAL) | (1L << CADEIA))) != 0)) ) {
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

	public static class RegistroContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__18);
			setState(209);
			variavel();
			setState(210);
			mais_variaveis();
			setState(211);
			match(T__19);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public Parametros_opcionaisContext parametros_opcionais() {
			return getRuleContext(Parametros_opcionaisContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(233);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__20);
				setState(214);
				match(IDENTIF);
				setState(215);
				match(T__21);
				setState(216);
				parametros_opcionais();
				setState(217);
				match(T__22);
				setState(218);
				declaracoes_locais();
				setState(219);
				comandos();
				setState(220);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(T__24);
				setState(223);
				match(IDENTIF);
				setState(224);
				match(T__21);
				setState(225);
				parametros_opcionais();
				setState(226);
				match(T__22);
				setState(227);
				match(T__4);
				setState(228);
				tipo_estendido();
				setState(229);
				declaracoes_locais();
				setState(230);
				comandos();
				setState(231);
				match(T__25);
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

	public static class Parametros_opcionaisContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametros_opcionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParametros_opcionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_opcionaisContext parametros_opcionais() throws RecognitionException {
		Parametros_opcionaisContext _localctx = new Parametros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__26) | (1L << IDENTIF))) != 0)) {
				{
				setState(235);
				parametro();
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

	public static class ParametroContext extends ParserRuleContext {
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identificadoresContext mais_identificadores() {
			return getRuleContext(Mais_identificadoresContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			var_opcional();
			setState(239);
			identificador();
			setState(240);
			mais_identificadores();
			setState(241);
			match(T__4);
			setState(242);
			tipo_estendido();
			setState(243);
			mais_parametros();
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

	public static class Var_opcionalContext extends ParserRuleContext {
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVar_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitVar_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(245);
				match(T__26);
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

	public static class Mais_parametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(248);
				match(T__7);
				setState(249);
				parametro();
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

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes_locais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracoes_locais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				setState(252);
				declaracao_local();
				setState(253);
				declaracoes_locais();
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

	public static class CorpoContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			declaracoes_locais();
			setState(258);
			comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << IDENTIF))) != 0)) {
				{
				setState(260);
				cmd();
				setState(261);
				comandos();
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

	public static class CmdContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identificadoresContext mais_identificadores() {
			return getRuleContext(Mais_identificadoresContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public Outros_identificadoresContext outros_identificadores() {
			return getRuleContext(Outros_identificadoresContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(323);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__27);
				setState(266);
				match(T__21);
				setState(267);
				identificador();
				setState(268);
				mais_identificadores();
				setState(269);
				match(T__22);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(T__28);
				setState(272);
				match(T__21);
				setState(273);
				expressao();
				setState(274);
				mais_expressao();
				setState(275);
				match(T__22);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(T__29);
				setState(278);
				expressao();
				setState(279);
				match(T__30);
				setState(280);
				comandos();
				setState(281);
				senao_opcional();
				setState(282);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(T__32);
				setState(285);
				expressao_aritmetica();
				setState(286);
				match(T__33);
				setState(287);
				selecao();
				setState(288);
				senao_opcional();
				setState(289);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				match(T__35);
				setState(292);
				match(IDENTIF);
				setState(293);
				match(T__36);
				setState(294);
				expressao_aritmetica();
				setState(295);
				match(T__37);
				setState(296);
				expressao_aritmetica();
				setState(297);
				match(T__38);
				setState(298);
				comandos();
				setState(299);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				match(T__40);
				setState(302);
				expressao();
				setState(303);
				match(T__38);
				setState(304);
				comandos();
				setState(305);
				match(T__41);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(307);
				match(T__38);
				setState(308);
				comandos();
				setState(309);
				match(T__37);
				setState(310);
				expressao();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				match(T__8);
				setState(313);
				match(IDENTIF);
				setState(314);
				outros_identificadores();
				setState(315);
				dimensao();
				setState(316);
				match(T__36);
				setState(317);
				expressao();
				}
				break;
			case IDENTIF:
				enterOuterAlt(_localctx, 9);
				{
				setState(319);
				match(IDENTIF);
				setState(320);
				chamada_atribuicao();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				match(T__42);
				setState(322);
				expressao();
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_expressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_expressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(325);
				match(T__7);
				setState(326);
				expressao();
				setState(327);
				mais_expressao();
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSenao_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitSenao_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(331);
				match(T__43);
				setState(332);
				comandos();
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

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public Argumentos_opcionaisContext argumentos_opcionais() {
			return getRuleContext(Argumentos_opcionaisContext.class,0);
		}
		public Outros_identificadoresContext outros_identificadores() {
			return getRuleContext(Outros_identificadoresContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitChamada_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			setState(344);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(T__21);
				setState(336);
				argumentos_opcionais();
				setState(337);
				match(T__22);
				}
				break;
			case T__9:
			case T__10:
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				outros_identificadores();
				setState(340);
				dimensao();
				setState(341);
				match(T__36);
				setState(342);
				expressao();
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

	public static class Argumentos_opcionaisContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterArgumentos_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitArgumentos_opcionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitArgumentos_opcionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumentos_opcionaisContext argumentos_opcionais() throws RecognitionException {
		Argumentos_opcionaisContext _localctx = new Argumentos_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << T__21) | (1L << T__45) | (1L << T__49) | (1L << T__56) | (1L << IDENTIF) | (1L << INTEIRO) | (1L << REAL) | (1L << CADEIA))) != 0)) {
				{
				setState(346);
				expressao();
				setState(347);
				mais_expressao();
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

	public static class SelecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			constantes();
			setState(352);
			match(T__4);
			setState(353);
			comandos();
			setState(354);
			mais_selecao();
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

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if (_la==T__45 || _la==INTEIRO) {
				{
				setState(356);
				selecao();
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

	public static class ConstantesContext extends ParserRuleContext {
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			numero_intervalo();
			setState(360);
			mais_constantes();
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

	public static class Mais_constantesContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_constantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_constantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(362);
				match(T__7);
				setState(363);
				constantes();
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Operador_uniarioContext operador_uniario() {
			return getRuleContext(Operador_uniarioContext.class,0);
		}
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			operador_uniario();
			setState(367);
			match(INTEIRO);
			setState(368);
			intervalo_opcional();
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

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public Operador_uniarioContext operador_uniario() {
			return getRuleContext(Operador_uniarioContext.class,0);
		}
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIntervalo_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitIntervalo_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(370);
				match(T__44);
				setState(371);
				operador_uniario();
				setState(372);
				match(INTEIRO);
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

	public static class Operador_uniarioContext extends ParserRuleContext {
		public Operador_uniarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_uniario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOperador_uniario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOperador_uniario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOperador_uniario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_uniarioContext operador_uniario() throws RecognitionException {
		Operador_uniarioContext _localctx = new Operador_uniarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operador_uniario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(376);
				match(T__45);
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

	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExpressao_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressao_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			termo();
			setState(380);
			outros_termos();
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

	public static class Operador_multiplicacaoContext extends ParserRuleContext {
		public Operador_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOperador_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOperador_multiplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOperador_multiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_multiplicacaoContext operador_multiplicacao() throws RecognitionException {
		Operador_multiplicacaoContext _localctx = new Operador_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operador_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
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

	public static class Operador_adicaoContext extends ParserRuleContext {
		public Operador_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOperador_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOperador_adicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOperador_adicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_adicaoContext operador_adicao() throws RecognitionException {
		Operador_adicaoContext _localctx = new Operador_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operador_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__48) ) {
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			fator();
			setState(387);
			outros_fatores();
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

	public static class Outros_termosContext extends ParserRuleContext {
		public Operador_adicaoContext operador_adicao() {
			return getRuleContext(Operador_adicaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_termos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(389);
				operador_adicao();
				setState(390);
				termo();
				setState(391);
				outros_termos();
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

	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			parcela();
			setState(396);
			outras_parcelas();
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

	public static class Outros_fatoresContext extends ParserRuleContext {
		public Operador_multiplicacaoContext operador_multiplicacao() {
			return getRuleContext(Operador_multiplicacaoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_fatores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if (_la==T__46 || _la==T__47) {
				{
				setState(398);
				operador_multiplicacao();
				setState(399);
				fator();
				setState(400);
				outros_fatores();
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

	public static class ParcelaContext extends ParserRuleContext {
		public Operador_uniarioContext operador_uniario() {
			return getRuleContext(Operador_uniarioContext.class,0);
		}
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela);
		try {
			setState(408);
			switch (_input.LA(1)) {
			case T__8:
			case T__21:
			case T__45:
			case IDENTIF:
			case INTEIRO:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				operador_uniario();
				setState(405);
				parcela_unario();
				}
				break;
			case T__49:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				parcela_nao_unario();
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public Outros_identificadoresContext outros_identificadores() {
			return getRuleContext(Outros_identificadoresContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(LAParser.REAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_unario);
		try {
			setState(423);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(T__8);
				setState(411);
				match(IDENTIF);
				setState(412);
				outros_identificadores();
				setState(413);
				dimensao();
				}
				break;
			case IDENTIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(IDENTIF);
				setState(416);
				chamada_partes();
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(INTEIRO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(REAL);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(T__21);
				setState(420);
				expressao();
				setState(421);
				match(T__22);
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode IDENTIF() { return getToken(LAParser.IDENTIF, 0); }
		public Outros_identificadoresContext outros_identificadores() {
			return getRuleContext(Outros_identificadoresContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_nao_unario);
		try {
			setState(431);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(T__49);
				setState(426);
				match(IDENTIF);
				setState(427);
				outros_identificadores();
				setState(428);
				dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(CADEIA);
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

	public static class Outras_parcelasContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutras_parcelas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutras_parcelas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(433);
				match(T__50);
				setState(434);
				parcela();
				setState(435);
				outras_parcelas();
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

	public static class Chamada_partesContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Outros_identificadoresContext outros_identificadores() {
			return getRuleContext(Outros_identificadoresContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_partes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitChamada_partes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chamada_partes);
		try {
			setState(447);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(T__21);
				setState(440);
				expressao();
				setState(441);
				mais_expressao();
				setState(442);
				match(T__22);
				}
				break;
			case T__1:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__22:
			case T__23:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case IDENTIF:
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				outros_identificadores();
				setState(445);
				dimensao();
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

	public static class Expressao_relacionalContext extends ParserRuleContext {
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Operador_opcionalContext operador_opcional() {
			return getRuleContext(Operador_opcionalContext.class,0);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExpressao_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressao_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			expressao_aritmetica();
			setState(450);
			operador_opcional();
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

	public static class Operador_opcionalContext extends ParserRuleContext {
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Operador_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOperador_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOperador_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOperador_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_opcionalContext operador_opcional() throws RecognitionException {
		Operador_opcionalContext _localctx = new Operador_opcionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operador_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) {
				{
				setState(452);
				operador_relacional();
				setState(453);
				expressao_aritmetica();
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

	public static class Operador_relacionalContext extends ParserRuleContext {
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOperador_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOperador_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) ) {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			termo_logico();
			setState(460);
			outros_termos_logicos();
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

	public static class Operador_naoContext extends ParserRuleContext {
		public Operador_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOperador_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOperador_nao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOperador_nao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_naoContext operador_nao() throws RecognitionException {
		Operador_naoContext _localctx = new Operador_naoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_operador_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(462);
				match(T__56);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			fator_logico();
			setState(466);
			outros_fatores_logicos();
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos_logicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_termos_logicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(468);
				match(T__57);
				setState(469);
				termo_logico();
				setState(470);
				outros_termos_logicos();
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores_logicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_fatores_logicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if (_la==T__58) {
				{
				setState(474);
				match(T__58);
				setState(475);
				fator_logico();
				setState(476);
				outros_fatores_logicos();
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public Operador_naoContext operador_nao() {
			return getRuleContext(Operador_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			operador_nao();
			setState(481);
			parcela_logica();
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parcela_logica);
		try {
			setState(486);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(T__17);
				}
				break;
			case T__8:
			case T__21:
			case T__45:
			case T__49:
			case IDENTIF:
			case INTEIRO:
			case REAL:
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				expressao_relacional();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u01eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3\u0083\n\3\3\4\3\4\5\4\u0087\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0096\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a3\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\5\n\u00b0\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00b7\n\13\3\f\3\f\5\f\u00bb\n\f\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3"+
		"\16\3\16\3\16\5\16\u00c6\n\16\3\17\3\17\3\20\3\20\5\20\u00cc\n\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00ec\n\24\3\25\5\25\u00ef\n\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\5\27\u00f9\n\27\3\30\3\30\5\30\u00fd\n\30\3\31\3\31\3\31"+
		"\5\31\u0102\n\31\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u010a\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0146\n\34\3\35\3\35\3\35\3\35\5\35\u014c\n\35\3\36\3\36\5\36"+
		"\u0150\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u015b\n"+
		"\37\3 \3 \3 \5 \u0160\n \3!\3!\3!\3!\3!\3\"\5\"\u0168\n\"\3#\3#\3#\3$"+
		"\3$\5$\u016f\n$\3%\3%\3%\3%\3&\3&\3&\3&\5&\u0179\n&\3\'\5\'\u017c\n\'"+
		"\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3,\5,\u018c\n,\3-\3-\3-\3.\3."+
		"\3.\3.\5.\u0195\n.\3/\3/\3/\3/\5/\u019b\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01aa\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u01b2\n\61\3\62\3\62\3\62\3\62\5\62\u01b8\n\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01c2\n\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\5\65\u01ca\n\65\3\66\3\66\3\67\3\67\3\67\38\58\u01d2\n"+
		"8\39\39\39\3:\3:\3:\3:\5:\u01db\n:\3;\3;\3;\3;\5;\u01e1\n;\3<\3<\3<\3"+
		"=\3=\3=\5=\u01e9\n=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\7\3\2\17\22\4\2"+
		"\23\24?A\3\2\61\62\4\2\60\60\63\63\4\2\b\b\66:\u01e1\2z\3\2\2\2\4\u0082"+
		"\3\2\2\2\6\u0086\3\2\2\2\b\u0095\3\2\2\2\n\u0097\3\2\2\2\f\u00a2\3\2\2"+
		"\2\16\u00a4\3\2\2\2\20\u00ab\3\2\2\2\22\u00af\3\2\2\2\24\u00b6\3\2\2\2"+
		"\26\u00ba\3\2\2\2\30\u00c0\3\2\2\2\32\u00c5\3\2\2\2\34\u00c7\3\2\2\2\36"+
		"\u00cb\3\2\2\2 \u00cd\3\2\2\2\"\u00d0\3\2\2\2$\u00d2\3\2\2\2&\u00eb\3"+
		"\2\2\2(\u00ee\3\2\2\2*\u00f0\3\2\2\2,\u00f8\3\2\2\2.\u00fc\3\2\2\2\60"+
		"\u0101\3\2\2\2\62\u0103\3\2\2\2\64\u0109\3\2\2\2\66\u0145\3\2\2\28\u014b"+
		"\3\2\2\2:\u014f\3\2\2\2<\u015a\3\2\2\2>\u015f\3\2\2\2@\u0161\3\2\2\2B"+
		"\u0167\3\2\2\2D\u0169\3\2\2\2F\u016e\3\2\2\2H\u0170\3\2\2\2J\u0178\3\2"+
		"\2\2L\u017b\3\2\2\2N\u017d\3\2\2\2P\u0180\3\2\2\2R\u0182\3\2\2\2T\u0184"+
		"\3\2\2\2V\u018b\3\2\2\2X\u018d\3\2\2\2Z\u0194\3\2\2\2\\\u019a\3\2\2\2"+
		"^\u01a9\3\2\2\2`\u01b1\3\2\2\2b\u01b7\3\2\2\2d\u01c1\3\2\2\2f\u01c3\3"+
		"\2\2\2h\u01c9\3\2\2\2j\u01cb\3\2\2\2l\u01cd\3\2\2\2n\u01d1\3\2\2\2p\u01d3"+
		"\3\2\2\2r\u01da\3\2\2\2t\u01e0\3\2\2\2v\u01e2\3\2\2\2x\u01e8\3\2\2\2z"+
		"{\5\4\3\2{|\7\3\2\2|}\5\62\32\2}~\7\4\2\2~\3\3\2\2\2\177\u0080\5\6\4\2"+
		"\u0080\u0081\5\4\3\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\5\3\2\2\2\u0084\u0087\5\b\5\2\u0085\u0087\5&\24\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\7\3\2\2\2\u0088\u0089\7\5\2\2"+
		"\u0089\u0096\5\n\6\2\u008a\u008b\7\6\2\2\u008b\u008c\7>\2\2\u008c\u008d"+
		"\7\7\2\2\u008d\u008e\5\34\17\2\u008e\u008f\7\b\2\2\u008f\u0090\5\"\22"+
		"\2\u0090\u0096\3\2\2\2\u0091\u0092\7\t\2\2\u0092\u0093\7>\2\2\u0093\u0094"+
		"\7\7\2\2\u0094\u0096\5\26\f\2\u0095\u0088\3\2\2\2\u0095\u008a\3\2\2\2"+
		"\u0095\u0091\3\2\2\2\u0096\t\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\5"+
		"\24\13\2\u0099\u009a\5\f\7\2\u009a\u009b\7\7\2\2\u009b\u009c\5\26\f\2"+
		"\u009c\13\3\2\2\2\u009d\u009e\7\n\2\2\u009e\u009f\7>\2\2\u009f\u00a0\5"+
		"\24\13\2\u00a0\u00a1\5\f\7\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\r\3\2\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\7>\2\2"+
		"\u00a6\u00a7\5\24\13\2\u00a7\u00a8\5\22\n\2\u00a8\17\3\2\2\2\u00a9\u00aa"+
		"\7\13\2\2\u00aa\u00ac\5\20\t\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\21\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00b0\5\16\b\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2"+
		"\u00b3\5N(\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b7\3"+
		"\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\25\3\2\2\2\u00b8"+
		"\u00bb\5$\23\2\u00b9\u00bb\5 \21\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf"+
		"\5\30\r\2\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\31\3\2\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4\5\32\16\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\33\3\2\2\2\u00c7"+
		"\u00c8\t\2\2\2\u00c8\35\3\2\2\2\u00c9\u00cc\5\34\17\2\u00ca\u00cc\7>\2"+
		"\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00ce"+
		"\5\20\t\2\u00ce\u00cf\5\36\20\2\u00cf!\3\2\2\2\u00d0\u00d1\t\3\2\2\u00d1"+
		"#\3\2\2\2\u00d2\u00d3\7\25\2\2\u00d3\u00d4\5\n\6\2\u00d4\u00d5\5\32\16"+
		"\2\u00d5\u00d6\7\26\2\2\u00d6%\3\2\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00d9"+
		"\7>\2\2\u00d9\u00da\7\30\2\2\u00da\u00db\5(\25\2\u00db\u00dc\7\31\2\2"+
		"\u00dc\u00dd\5\60\31\2\u00dd\u00de\5\64\33\2\u00de\u00df\7\32\2\2\u00df"+
		"\u00ec\3\2\2\2\u00e0\u00e1\7\33\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7\30"+
		"\2\2\u00e3\u00e4\5(\25\2\u00e4\u00e5\7\31\2\2\u00e5\u00e6\7\7\2\2\u00e6"+
		"\u00e7\5 \21\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\5\64\33\2\u00e9\u00ea"+
		"\7\34\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00d7\3\2\2\2\u00eb\u00e0\3\2\2\2"+
		"\u00ec\'\3\2\2\2\u00ed\u00ef\5*\26\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef)\3\2\2\2\u00f0\u00f1\5,\27\2\u00f1\u00f2\5\16\b\2\u00f2\u00f3"+
		"\5\30\r\2\u00f3\u00f4\7\7\2\2\u00f4\u00f5\5 \21\2\u00f5\u00f6\5.\30\2"+
		"\u00f6+\3\2\2\2\u00f7\u00f9\7\35\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3"+
		"\2\2\2\u00f9-\3\2\2\2\u00fa\u00fb\7\n\2\2\u00fb\u00fd\5*\26\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd/\3\2\2\2\u00fe\u00ff\5\b\5\2\u00ff"+
		"\u0100\5\60\31\2\u0100\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0102\3"+
		"\2\2\2\u0102\61\3\2\2\2\u0103\u0104\5\60\31\2\u0104\u0105\5\64\33\2\u0105"+
		"\63\3\2\2\2\u0106\u0107\5\66\34\2\u0107\u0108\5\64\33\2\u0108\u010a\3"+
		"\2\2\2\u0109\u0106\3\2\2\2\u0109\u010a\3\2\2\2\u010a\65\3\2\2\2\u010b"+
		"\u010c\7\36\2\2\u010c\u010d\7\30\2\2\u010d\u010e\5\16\b\2\u010e\u010f"+
		"\5\30\r\2\u010f\u0110\7\31\2\2\u0110\u0146\3\2\2\2\u0111\u0112\7\37\2"+
		"\2\u0112\u0113\7\30\2\2\u0113\u0114\5l\67\2\u0114\u0115\58\35\2\u0115"+
		"\u0116\7\31\2\2\u0116\u0146\3\2\2\2\u0117\u0118\7 \2\2\u0118\u0119\5l"+
		"\67\2\u0119\u011a\7!\2\2\u011a\u011b\5\64\33\2\u011b\u011c\5:\36\2\u011c"+
		"\u011d\7\"\2\2\u011d\u0146\3\2\2\2\u011e\u011f\7#\2\2\u011f\u0120\5N("+
		"\2\u0120\u0121\7$\2\2\u0121\u0122\5@!\2\u0122\u0123\5:\36\2\u0123\u0124"+
		"\7%\2\2\u0124\u0146\3\2\2\2\u0125\u0126\7&\2\2\u0126\u0127\7>\2\2\u0127"+
		"\u0128\7\'\2\2\u0128\u0129\5N(\2\u0129\u012a\7(\2\2\u012a\u012b\5N(\2"+
		"\u012b\u012c\7)\2\2\u012c\u012d\5\64\33\2\u012d\u012e\7*\2\2\u012e\u0146"+
		"\3\2\2\2\u012f\u0130\7+\2\2\u0130\u0131\5l\67\2\u0131\u0132\7)\2\2\u0132"+
		"\u0133\5\64\33\2\u0133\u0134\7,\2\2\u0134\u0146\3\2\2\2\u0135\u0136\7"+
		")\2\2\u0136\u0137\5\64\33\2\u0137\u0138\7(\2\2\u0138\u0139\5l\67\2\u0139"+
		"\u0146\3\2\2\2\u013a\u013b\7\13\2\2\u013b\u013c\7>\2\2\u013c\u013d\5\22"+
		"\n\2\u013d\u013e\5\24\13\2\u013e\u013f\7\'\2\2\u013f\u0140\5l\67\2\u0140"+
		"\u0146\3\2\2\2\u0141\u0142\7>\2\2\u0142\u0146\5<\37\2\u0143\u0144\7-\2"+
		"\2\u0144\u0146\5l\67\2\u0145\u010b\3\2\2\2\u0145\u0111\3\2\2\2\u0145\u0117"+
		"\3\2\2\2\u0145\u011e\3\2\2\2\u0145\u0125\3\2\2\2\u0145\u012f\3\2\2\2\u0145"+
		"\u0135\3\2\2\2\u0145\u013a\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0146\67\3\2\2\2\u0147\u0148\7\n\2\2\u0148\u0149\5l\67\2\u0149\u014a"+
		"\58\35\2\u014a\u014c\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"9\3\2\2\2\u014d\u014e\7.\2\2\u014e\u0150\5\64\33\2\u014f\u014d\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150;\3\2\2\2\u0151\u0152\7\30\2\2\u0152\u0153\5"+
		"> \2\u0153\u0154\7\31\2\2\u0154\u015b\3\2\2\2\u0155\u0156\5\22\n\2\u0156"+
		"\u0157\5\24\13\2\u0157\u0158\7\'\2\2\u0158\u0159\5l\67\2\u0159\u015b\3"+
		"\2\2\2\u015a\u0151\3\2\2\2\u015a\u0155\3\2\2\2\u015b=\3\2\2\2\u015c\u015d"+
		"\5l\67\2\u015d\u015e\58\35\2\u015e\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160?\3\2\2\2\u0161\u0162\5D#\2\u0162\u0163\7\7\2\2\u0163"+
		"\u0164\5\64\33\2\u0164\u0165\5B\"\2\u0165A\3\2\2\2\u0166\u0168\5@!\2\u0167"+
		"\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168C\3\2\2\2\u0169\u016a\5H%\2\u016a"+
		"\u016b\5F$\2\u016bE\3\2\2\2\u016c\u016d\7\n\2\2\u016d\u016f\5D#\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016fG\3\2\2\2\u0170\u0171\5L\'\2\u0171"+
		"\u0172\7?\2\2\u0172\u0173\5J&\2\u0173I\3\2\2\2\u0174\u0175\7/\2\2\u0175"+
		"\u0176\5L\'\2\u0176\u0177\7?\2\2\u0177\u0179\3\2\2\2\u0178\u0174\3\2\2"+
		"\2\u0178\u0179\3\2\2\2\u0179K\3\2\2\2\u017a\u017c\7\60\2\2\u017b\u017a"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017cM\3\2\2\2\u017d\u017e\5T+\2\u017e\u017f"+
		"\5V,\2\u017fO\3\2\2\2\u0180\u0181\t\4\2\2\u0181Q\3\2\2\2\u0182\u0183\t"+
		"\5\2\2\u0183S\3\2\2\2\u0184\u0185\5X-\2\u0185\u0186\5Z.\2\u0186U\3\2\2"+
		"\2\u0187\u0188\5R*\2\u0188\u0189\5T+\2\u0189\u018a\5V,\2\u018a\u018c\3"+
		"\2\2\2\u018b\u0187\3\2\2\2\u018b\u018c\3\2\2\2\u018cW\3\2\2\2\u018d\u018e"+
		"\5\\/\2\u018e\u018f\5b\62\2\u018fY\3\2\2\2\u0190\u0191\5P)\2\u0191\u0192"+
		"\5X-\2\u0192\u0193\5Z.\2\u0193\u0195\3\2\2\2\u0194\u0190\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195[\3\2\2\2\u0196\u0197\5L\'\2\u0197\u0198\5^\60\2\u0198"+
		"\u019b\3\2\2\2\u0199\u019b\5`\61\2\u019a\u0196\3\2\2\2\u019a\u0199\3\2"+
		"\2\2\u019b]\3\2\2\2\u019c\u019d\7\13\2\2\u019d\u019e\7>\2\2\u019e\u019f"+
		"\5\22\n\2\u019f\u01a0\5\24\13\2\u01a0\u01aa\3\2\2\2\u01a1\u01a2\7>\2\2"+
		"\u01a2\u01aa\5d\63\2\u01a3\u01aa\7?\2\2\u01a4\u01aa\7@\2\2\u01a5\u01a6"+
		"\7\30\2\2\u01a6\u01a7\5l\67\2\u01a7\u01a8\7\31\2\2\u01a8\u01aa\3\2\2\2"+
		"\u01a9\u019c\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01a3\3\2\2\2\u01a9\u01a4"+
		"\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa_\3\2\2\2\u01ab\u01ac\7\64\2\2\u01ac"+
		"\u01ad\7>\2\2\u01ad\u01ae\5\22\n\2\u01ae\u01af\5\24\13\2\u01af\u01b2\3"+
		"\2\2\2\u01b0\u01b2\7A\2\2\u01b1\u01ab\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2"+
		"a\3\2\2\2\u01b3\u01b4\7\65\2\2\u01b4\u01b5\5\\/\2\u01b5\u01b6\5b\62\2"+
		"\u01b6\u01b8\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8c\3"+
		"\2\2\2\u01b9\u01ba\7\30\2\2\u01ba\u01bb\5l\67\2\u01bb\u01bc\58\35\2\u01bc"+
		"\u01bd\7\31\2\2\u01bd\u01c2\3\2\2\2\u01be\u01bf\5\22\n\2\u01bf\u01c0\5"+
		"\24\13\2\u01c0\u01c2\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2"+
		"e\3\2\2\2\u01c3\u01c4\5N(\2\u01c4\u01c5\5h\65\2\u01c5g\3\2\2\2\u01c6\u01c7"+
		"\5j\66\2\u01c7\u01c8\5N(\2\u01c8\u01ca\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01cai\3\2\2\2\u01cb\u01cc\t\6\2\2\u01cck\3\2\2\2\u01cd"+
		"\u01ce\5p9\2\u01ce\u01cf\5r:\2\u01cfm\3\2\2\2\u01d0\u01d2\7;\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2o\3\2\2\2\u01d3\u01d4\5v<\2\u01d4"+
		"\u01d5\5t;\2\u01d5q\3\2\2\2\u01d6\u01d7\7<\2\2\u01d7\u01d8\5p9\2\u01d8"+
		"\u01d9\5r:\2\u01d9\u01db\3\2\2\2\u01da\u01d6\3\2\2\2\u01da\u01db\3\2\2"+
		"\2\u01dbs\3\2\2\2\u01dc\u01dd\7=\2\2\u01dd\u01de\5v<\2\u01de\u01df\5t"+
		";\2\u01df\u01e1\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"u\3\2\2\2\u01e2\u01e3\5n8\2\u01e3\u01e4\5x=\2\u01e4w\3\2\2\2\u01e5\u01e9"+
		"\7\23\2\2\u01e6\u01e9\7\24\2\2\u01e7\u01e9\5f\64\2\u01e8\u01e5\3\2\2\2"+
		"\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9y\3\2\2\2(\u0082\u0086\u0095"+
		"\u00a2\u00ab\u00af\u00b6\u00ba\u00c0\u00c5\u00cb\u00eb\u00ee\u00f8\u00fc"+
		"\u0101\u0109\u0145\u014b\u014f\u015a\u015f\u0167\u016e\u0178\u017b\u018b"+
		"\u0194\u019a\u01a9\u01b1\u01b7\u01c1\u01c9\u01d1\u01da\u01e0\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}