package main.java;

import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Created by alexandre on 05/01/17.
 */

public class VisitorMatematica extends matematicaBaseVisitor<Double> {

    private TabelaDeSimbolos tds = new TabelaDeSimbolos();
    final double relativeAccuracy = 1e-4;
    final double absoluteAccuracy = 1e-8;
    final int minimalIterationCount = 3;
    final int maximalIterationCount = 32;
    final int loops = 10000000;

    @Override
    public Double visitRetorno(matematicaParser.RetornoContext ctx) {
        System.out.print("RETORNO: ");
        if (ctx.tipo.equals("expressao")){
            System.out.println(visitExpressao(ctx.expressao()));
        }
        else if (ctx.tipo.equals("string")){
            System.out.println(ctx.String().getText());
        }
        else {
            System.out.println  ("A linguagem não aceita esse tipo de retorno.");
        }
        return null;
    }

    @Override
    public Double visitPrint(matematicaParser.PrintContext ctx) {
        if (ctx.tipoPrint.equals("expressao")) {
            if (ctx.expressao().tipo.equals("identificadorF")&& (ctx.expressao().identificadorF().Numero() == null && (ctx.expressao().identificadorF().expressao() == null))) {
                EntradaTabelaDeSimbolos etds = tds.verificar(ctx.expressao().identificadorF().ID1.getText());
                if (etds == null) {
                    throw new RuntimeException("ERRO SEMÂNTICO: A função que se deseja imprimir nao foi declarada.");
                } else if(etds.cosseno == null && etds.seno == null ) {
                    PolynomialFunction f = new PolynomialFunction(etds.coefs);
                    System.out.println(f.toString());
                    return null;
                }
                else if(etds.cosseno == null){
                    System.out.println("sin(x)");
                    return null;
                }
                else {
                   System.out.println("cos(x)");
                    return null;
                }
            }
            try {
                System.out.println(visitExpressao(ctx.expressao()));
            }
            catch (NullPointerException e) {
                throw new NullPointerException("ERRO SEMÂNTICO: A variável ou função não foi declarada, ou a função a se exibir esta mal formatada.");
            }
        }
        else if(ctx.tipoPrint.equals("string")){
            System.out.println(ctx.String().getText());
        }
        return null;
    }

    @Override
    public Double visitAtribuicao(matematicaParser.AtribuicaoContext ctx) {
        // redeclaracao de variavel ou funcao
        if(tds.verificar(ctx.Identificador().getText()) != null){
            throw new RuntimeException("Erro semântico: Variavel ou funcao "+ctx.Identificador().getText()+"redeclarada.");
        }

        else if(ctx.expressao().tipo.equals("identificadorF") && (ctx.expressao().identificadorF().Numero() == null)){
            throw new RuntimeException("Erro semântico: Não é possível atribuir uma funcao a uma variável.");
        }

        // inserir na tabela atribuicoes simples: valores e constante - um valor pode ser Numero ou Constante
        else {
            Double aux = visitExpressao(ctx.expressao());
            tds.inserir(ctx.Identificador().getText(), aux);
        }
        return null;
    }

    @Override
    public Double visitFuncao(matematicaParser.FuncaoContext ctx) {
        if (ctx.tipo.equals("polinomio")) {

            if (tds.verificar(ctx.identificadorF().ID1.getText()) != null) { // caso em q uma variavel ja tem o mesmo nome da funcao
                throw new RuntimeException("Erro semântico: " + ctx.identificadorF().ID1.getText() + " Redeclaração de variável ou funcao");
            } else {
                if (ctx.identificadorF().Numero() != null) {
                    throw new RuntimeException("Erro semântico: " + ctx.identificadorF().ID1.getText() + " A funcao deve ser do tipo f(x), onde f e x são identificadores.");
                } else {
                    HashMap<Double, Double> expCoef = new HashMap<>(); //par : coeficiente -> expoente
                    Double exp, coef;
                    for (int i = 0; i < ctx.polinomio().monomio().size(); i++) {
                        if (ctx.polinomio().monomio(i).coef2 != null) {
                            coef = Double.parseDouble(ctx.polinomio().monomio(i).coef2.numeroComSinal().getText());
                            exp = 0.0;
                        } else {
                            if (ctx.polinomio().monomio(i).coeficiente() == null) {
                                coef = 1.0;
                            } else {
                                coef = Double.parseDouble(ctx.polinomio().monomio(i).coeficiente().numeroComSinal().getText());
                            }
                            if (ctx.polinomio().monomio(i).expoente() == null) {
                                exp = 1.0;
                            } else {
                                exp = Double.parseDouble(ctx.polinomio().monomio(i).expoente().numeroComSinal().getText());
                            }
                        }
                        expCoef.put(exp, coef); // TODO: como tratar erros do sintatico
                    }
                    NavigableMap<Double, Double> expoentesCoeficientes = new TreeMap<>(expCoef);
                    int maiorExp = Double.valueOf(expoentesCoeficientes.lastKey()).intValue();
                    int tam = maiorExp + 1;
                    double[] coeficientes = new double[tam];
                    for (int i = 0; i <= maiorExp; i++) { //chaves: expoentes, valor : coeficientes
                        Double aux = expoentesCoeficientes.get((double) i);
                        if (aux != null) {
                            coeficientes[i] = expoentesCoeficientes.get((double) i); // Watch out for NullPointerExceptions!
                        } else {
                            coeficientes[i] = 0.0;
                        }
                    }
                    //for (double i : coeficientes){
                    //   System.out.println("Vetor :" + Double.toString(i));
                    //}
                    tds.inserirFuncao(ctx.identificadorF().ID1.getText(), coeficientes);
                }
            }
        }
        else if (ctx.tipo.equals("cosseno")){
            if (tds.verificar(ctx.identificadorF().ID1.getText()) != null) { // caso em q uma variavel ja tem o mesmo nome da funcao
                throw new RuntimeException("Erro semântico: " + ctx.identificadorF().ID1.getText() + " Redeclaração de variável ou funcao");
            }
            //System.out.println("---------");
            tds.inserirCosseno(ctx.identificadorF().ID1.getText());
            //EntradaTabelaDeSimbolos x = tds.verificar(ctx.identificadorF().getText());
            //System.out.println(x.nome);
            //System.out.println(x.cosseno);
            //System.out.println("---------");
        }
        else if (ctx.tipo.equals("seno")){
            if (tds.verificar(ctx.identificadorF().ID1.getText()) != null) { // caso em q uma variavel ja tem o mesmo nome da funcao
                throw new RuntimeException("Erro semântico: " + ctx.identificadorF().ID1.getText() + " Redeclaração de variável ou funcao");
            }
            tds.inserirSeno(ctx.identificadorF().ID1.getText());
        }
        return null;
    }

    @Override
    public Double visitExpressao(matematicaParser.ExpressaoContext ctx) {
        // Todo : tratar todas as exceções : exemplo +infinito - (+ infinito) - NaN

        if(ctx.tipo.equals("identificador")){
            //retornar o valor de um identificador
            EntradaTabelaDeSimbolos aux = tds.verificar(ctx.Identificador().getText());
            return aux.valor;
        }

        if(ctx.tipo.equals("identificadorF")){
            //retornar o valor de uma funcao calculada em um ponto
            if(ctx.identificadorF().Numero() != null || ctx.identificadorF().expressao() != null) {
                if (tds.verificar(ctx.identificadorF().ID1.getText()) == null) {
                    throw new RuntimeException("Erro semântico: " + ctx.identificadorF().ID1.getText() + " A funcao que se desejar avaliar não foi declarada.");
                } else {
                    EntradaTabelaDeSimbolos etds = tds.verificar(ctx.identificadorF().ID1.getText());
                    if(etds.cosseno == null && etds.seno == null ) {
                        PolynomialFunction f = new PolynomialFunction(etds.coefs);
                        return f.value(Double.parseDouble(ctx.identificadorF().Numero().getText()));
                    }
                    else if (etds.cosseno == null) {
                        if(ctx.identificadorF().Numero().getText() != null) {
                            return etds.seno.value(Double.parseDouble(ctx.identificadorF().Numero().getText()));
                        }
                        else {
                            return etds.seno.value(visitExpressao(ctx.identificadorF().expressao()));
                        }
                    }
                    else {
                        return etds.cosseno.value(Double.parseDouble(ctx.identificadorF().Numero().getText()));
                    }
                }
            }
            else {
                throw new RuntimeException("Erro semântico: Não é possivel avaliar a função no ponto: " + ctx.identificadorF().Numero().getText() + ".");
            }
        }

        else if(ctx.tipo.equals("seno")){
            //calcular e retornar o valor do seno da expressao - calculo é feito na regra do seno
            return visitSeno(ctx.seno()); // TODO : adaptar para funcoes
        }

        else if(ctx.tipo.equals("cosseno")){
            //calcular e retornar o valor do cosseno da expressao  - calculo é feito na regra do cosseno
            return visitCosseno(ctx.cosseno());
        }

        else if(ctx.tipo.equals("soma")){
            //calcular e retornar o valor da soma da expressao
            Double exp0 = visitExpressao(ctx.expressao(0));
            Double exp1 = visitExpressao(ctx.expressao(1));
            return (exp0 + exp1);
        }
        else if (ctx.tipo.equals("subtracao")){
            //calcular e retornar o valor da subracao da expressao
            Double exp0 = visitExpressao(ctx.expressao(0));
            Double exp1 = visitExpressao(ctx.expressao(1));
            return (exp0 - exp1);
        }

        else if (ctx.tipo.equals("divisao")){
            //calcular e retornar o valor da divisao da expressao
            Double exp0 = visitExpressao(ctx.expressao(0));
            Double exp1 = visitExpressao(ctx.expressao(1));
            try {
                return (exp0 / exp1);
            }catch (ArithmeticException e){
                throw new RuntimeException("ERRO SEMÂNTICO: Não é possível realizar uma divisão onde o denominador é zero.");
            }
        }

        else if (ctx.tipo.equals("multiplicacao")){
            //calcular e retornar o valor da multiplicacao da expressao
            Double exp0 = visitExpressao(ctx.expressao(0));
            Double exp1 = visitExpressao(ctx.expressao(1));
            return (exp0 * exp1);
        }

        else if (ctx.tipo.equals("potencia")){
            //calcular e retornar o valor da potencia da expressao
            Double exp0 = visitExpressao(ctx.expressao(0));
            Double exp1= visitExpressao(ctx.expressao(1));
            return Math.pow(exp0, exp1);
        }

        else if (ctx.tipo.equals("integral")){
            //calcular e retornar o valor da integral da expressao
            if (ctx.integral().expressao().tipo.equals("identificadorF")){
                if (tds.verificar(ctx.integral().expressao().identificadorF().ID1.getText()) == null){
                    throw new RuntimeException("ERRO SEMÂNTICO: A função que se deseja integrar nao foi declarada.");
                }
                else {
                    EntradaTabelaDeSimbolos funcao = tds.verificar(ctx.integral().expressao().identificadorF().ID1.getText());
                    PolynomialFunction f = new PolynomialFunction(funcao.coefs);
                    double l1 = visitLimiteIntegracao(ctx.integral().intervaloIntegracao().l1);
                    double l2 = visitLimiteIntegracao(ctx.integral().intervaloIntegracao().l2);
                    UnivariateIntegrator integrator = new SimpsonIntegrator(relativeAccuracy, absoluteAccuracy,
                                                                            minimalIterationCount, maximalIterationCount);
                    return integrator.integrate(loops, f, l1, l2);
                }
            }
        }

        else if (ctx.tipo.equals("parenteses")){
            return visitExpressao(ctx.expressao(0));
        }

        else if (ctx.tipo.equals("unario")){ //negar e retornar o valor da expressao
            //negar uma expressao
            return -1*visitExpressao(ctx.expressao(0));
        }

        // retornar valores simples: valores e constantes
        else if(ctx.tipo.equals("valor")){ // um valor pode ser Numero ou Constante
            return visitValor(ctx.valor());
        }

        return null;
    }

    @Override
    public Double visitSeno(matematicaParser.SenoContext ctx) {
        Double exp0 = visitExpressao(ctx.expressao());
        return Math.sin(exp0);
    }

    @Override
    public Double visitCosseno(matematicaParser.CossenoContext ctx) {
        Double exp0 = super.visitExpressao(ctx.expressao());
        return Math.cos(exp0);
    }

    @Override
    public Double visitValor(matematicaParser.ValorContext ctx) {
        // caso o valor seja simples tipo '3.4', '21' - retornar esse valor em double
        // caso contrario: temos uma constante, chamar o visitor de constantes
        if (ctx.tipo.equals("numero")){
            return Double.valueOf(ctx.Numero().getText());
        }
        else
            return visitConstante(ctx.constante());
    }

    @Override
    public Double visitConstante(matematicaParser.ConstanteContext ctx) {
        if(ctx.getText().equals("+infinito")){
            return Double.POSITIVE_INFINITY;
        }
        else if(ctx.getText().equals("-infinito")){
            return Double.NEGATIVE_INFINITY;
        }
        if(ctx.getText() == "pi"){
            return Math.PI;
        }
        else
            return Math.E; // euler
    }

    @Override
    public Double visitLimiteIntegracao(matematicaParser.LimiteIntegracaoContext ctx) {
        if (ctx.valor() != null){
            return visitValor(ctx.valor());
        }
        else if(ctx.Identificador() != null) {
            EntradaTabelaDeSimbolos etds = tds.verificar(ctx.Identificador().getText());
            if(etds == null){
                throw new RuntimeException("ERRO SEMÂNTICO: "+ctx.Identificador().getText()+" Variável nao foi declarada.");
            }
            return etds.valor;
        }
        else {
            throw new RuntimeException("ERRO SEMÂNTICO: Os limites de integração estão mal formatados.");
        }
    }

}
