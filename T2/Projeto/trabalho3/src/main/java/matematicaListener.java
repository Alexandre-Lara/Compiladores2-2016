// Generated from matematica.g4 by ANTLR 4.5
package main.java;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matematicaParser}.
 */
public interface matematicaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link matematicaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(matematicaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(matematicaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(matematicaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(matematicaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(matematicaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(matematicaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(matematicaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(matematicaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(matematicaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(matematicaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(matematicaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(matematicaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(matematicaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(matematicaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(matematicaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(matematicaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#integral}.
	 * @param ctx the parse tree
	 */
	void enterIntegral(matematicaParser.IntegralContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#integral}.
	 * @param ctx the parse tree
	 */
	void exitIntegral(matematicaParser.IntegralContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#derivada}.
	 * @param ctx the parse tree
	 */
	void enterDerivada(matematicaParser.DerivadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#derivada}.
	 * @param ctx the parse tree
	 */
	void exitDerivada(matematicaParser.DerivadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#pontoDerivacao}.
	 * @param ctx the parse tree
	 */
	void enterPontoDerivacao(matematicaParser.PontoDerivacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#pontoDerivacao}.
	 * @param ctx the parse tree
	 */
	void exitPontoDerivacao(matematicaParser.PontoDerivacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#polinomio}.
	 * @param ctx the parse tree
	 */
	void enterPolinomio(matematicaParser.PolinomioContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#polinomio}.
	 * @param ctx the parse tree
	 */
	void exitPolinomio(matematicaParser.PolinomioContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#monomio}.
	 * @param ctx the parse tree
	 */
	void enterMonomio(matematicaParser.MonomioContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#monomio}.
	 * @param ctx the parse tree
	 */
	void exitMonomio(matematicaParser.MonomioContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#incognita}.
	 * @param ctx the parse tree
	 */
	void enterIncognita(matematicaParser.IncognitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#incognita}.
	 * @param ctx the parse tree
	 */
	void exitIncognita(matematicaParser.IncognitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#coeficiente}.
	 * @param ctx the parse tree
	 */
	void enterCoeficiente(matematicaParser.CoeficienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#coeficiente}.
	 * @param ctx the parse tree
	 */
	void exitCoeficiente(matematicaParser.CoeficienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#expoente}.
	 * @param ctx the parse tree
	 */
	void enterExpoente(matematicaParser.ExpoenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#expoente}.
	 * @param ctx the parse tree
	 */
	void exitExpoente(matematicaParser.ExpoenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#intervaloIntegracao}.
	 * @param ctx the parse tree
	 */
	void enterIntervaloIntegracao(matematicaParser.IntervaloIntegracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#intervaloIntegracao}.
	 * @param ctx the parse tree
	 */
	void exitIntervaloIntegracao(matematicaParser.IntervaloIntegracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#limiteIntegracao}.
	 * @param ctx the parse tree
	 */
	void enterLimiteIntegracao(matematicaParser.LimiteIntegracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#limiteIntegracao}.
	 * @param ctx the parse tree
	 */
	void exitLimiteIntegracao(matematicaParser.LimiteIntegracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#identificadorF}.
	 * @param ctx the parse tree
	 */
	void enterIdentificadorF(matematicaParser.IdentificadorFContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#identificadorF}.
	 * @param ctx the parse tree
	 */
	void exitIdentificadorF(matematicaParser.IdentificadorFContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(matematicaParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(matematicaParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#dominio}.
	 * @param ctx the parse tree
	 */
	void enterDominio(matematicaParser.DominioContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#dominio}.
	 * @param ctx the parse tree
	 */
	void exitDominio(matematicaParser.DominioContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#contradominio}.
	 * @param ctx the parse tree
	 */
	void enterContradominio(matematicaParser.ContradominioContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#contradominio}.
	 * @param ctx the parse tree
	 */
	void exitContradominio(matematicaParser.ContradominioContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#intervalo}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo(matematicaParser.IntervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#intervalo}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo(matematicaParser.IntervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#seno}.
	 * @param ctx the parse tree
	 */
	void enterSeno(matematicaParser.SenoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#seno}.
	 * @param ctx the parse tree
	 */
	void exitSeno(matematicaParser.SenoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#cosseno}.
	 * @param ctx the parse tree
	 */
	void enterCosseno(matematicaParser.CossenoContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#cosseno}.
	 * @param ctx the parse tree
	 */
	void exitCosseno(matematicaParser.CossenoContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(matematicaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(matematicaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(matematicaParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(matematicaParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#numeroComSinal}.
	 * @param ctx the parse tree
	 */
	void enterNumeroComSinal(matematicaParser.NumeroComSinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#numeroComSinal}.
	 * @param ctx the parse tree
	 */
	void exitNumeroComSinal(matematicaParser.NumeroComSinalContext ctx);
}