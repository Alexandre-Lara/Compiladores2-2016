// Generated from matematica.g4 by ANTLR 4.5
package main.java;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link matematicaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface matematicaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link matematicaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(matematicaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(matematicaParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(matematicaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(matematicaParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(matematicaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(matematicaParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#integral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral(matematicaParser.IntegralContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(matematicaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#intervaloInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervaloInt(matematicaParser.IntervaloIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#identificadorF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificadorF(matematicaParser.IdentificadorFContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#relacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacao(matematicaParser.RelacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#dominio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDominio(matematicaParser.DominioContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#contradominio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradominio(matematicaParser.ContradominioContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalo(matematicaParser.IntervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#seno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeno(matematicaParser.SenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#cosseno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosseno(matematicaParser.CossenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(matematicaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(matematicaParser.ConstanteContext ctx);
}