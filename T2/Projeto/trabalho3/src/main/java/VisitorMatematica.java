package main.java;

import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.util.FastMath;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Created by alexandre on 05/01/17.
 */

public class VisitorMatematica extends matematicaBaseVisitor<Double> {

    private TabelaDeSimbolos tds = new TabelaDeSimbolos();
    private double[] vetorCoefAuxiliar;
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
            if (ctx.expressao().tipo.equals("identificadorF")&& (ctx.expressao().identificadorF().expressao() == null && (ctx.expressao().identificadorF().expressao() == null))) {
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
            throw new RuntimeException("Erro semântico: Variavel ou funcao "+ctx.Identificador().getText()+" redeclarada.");
        }

        else if(ctx.expressao().tipo.equals("identificadorF") && (ctx.expressao().identificadorF().expressao() == null)){
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
        switch (ctx.tipo) {
            case "polinomio":

                if (tds.verificar(ctx.identificadorF().ID1.getText()) != null) { // caso em q uma variavel ja tem o mesmo nome da funcao
                    throw new RuntimeException("Erro semântico: Redeclaração de variável ou funcao: " + ctx.identificadorF().ID1.getText());
                } else {
                    if (ctx.identificadorF().expressao() != null) {
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
                            expCoef.put(exp, coef);
                        }
                        NavigableMap<Double, Double> expoentesCoeficientes = new TreeMap<>(expCoef);
                        int maiorExp = expoentesCoeficientes.lastKey().intValue();
                        int tam = maiorExp + 1;
                        double[] coeficientes = new double[tam];
                        for (int i = 0; i <= maiorExp; i++) { //chave: expoente | valor : coeficiente
                            Double aux = expoentesCoeficientes.get((double) i);
                            if (aux != null) {
                                coeficientes[i] = expoentesCoeficientes.get((double) i); // Watch out for NullPointerExceptions!
                            } else {
                                coeficientes[i] = 0.0;
                            }
                        }
                        tds.inserirFuncao(ctx.identificadorF().ID1.getText(), coeficientes);
                    }
                }
                break;

            case "cosseno":
                if (tds.verificar(ctx.identificadorF().ID1.getText()) != null) { // caso em q uma variavel ja tem o mesmo nome da funcao
                    throw new RuntimeException("Erro semântico: " + ctx.identificadorF().ID1.getText() + " Redeclaração de variável ou funcao");
                }
                tds.inserirCosseno(ctx.identificadorF().ID1.getText());
                break;

            case "seno":
                if (tds.verificar(ctx.identificadorF().ID1.getText()) != null) { // caso em q uma variavel ja tem o mesmo nome da funcao
                    throw new RuntimeException("Erro semântico: " + ctx.identificadorF().ID1.getText() + " Redeclaração de variável ou funcao");
                }
                tds.inserirSeno(ctx.identificadorF().ID1.getText());
                break;

            case "derivada":
                if (ctx.expressao().tipo.equals("derivada")) {
                    EntradaTabelaDeSimbolos etds = tds.verificar(ctx.expressao().derivada().expressao().identificadorF().ID1.getText());
                    if (etds.seno != null) {
                        tds.inserirCosseno(ctx.identificadorF().ID1.getText());
                        return null;
                    } else if (etds.cosseno != null) { //TODO : precisa salvar como -seno
                        tds.inserirSenoInv(ctx.identificadorF().ID1.getText());
                        return null;
                    }
                    visitExpressao(ctx.expressao());
                    tds.inserirFuncao(ctx.identificadorF().ID1.getText(), vetorCoefAuxiliar);
                    return null;
                } else {
                    throw new RuntimeException("Erro semântico: " + ctx.expressao().getText() + "Não é possível atribuir esse conteúdo a uma função.");
                }
        }
        return null;
    }

    @Override
    public Double visitExpressao(matematicaParser.ExpressaoContext ctx) {

        switch (ctx.tipo) {

            case "identificador":
                //retornar o valor de um identificador
                EntradaTabelaDeSimbolos aux = tds.verificar(ctx.Identificador().getText());
                return aux.valor;

            case "identificadorF":
                //retornar o valor de uma funcao calculada em um ponto
                if (ctx.identificadorF().expressao() != null || ctx.identificadorF().expressao() != null) {
                    if (tds.verificar(ctx.identificadorF().ID1.getText()) == null) {
                        throw new RuntimeException("Erro semântico: " + ctx.identificadorF().ID1.getText() + " A funcao que se desejar avaliar não foi declarada.");
                    } else {
                        EntradaTabelaDeSimbolos etds = tds.verificar(ctx.identificadorF().ID1.getText());
                        if (etds.cosseno == null && etds.seno == null) {
                            PolynomialFunction f = new PolynomialFunction(etds.coefs);
                            return f.value(visitExpressao(ctx.identificadorF().expressao()));
                        } else if (etds.cosseno == null) {
                            if (ctx.identificadorF().expressao().getText() != null) {
                                return etds.seno.value(visitExpressao(ctx.identificadorF().expressao()));
                            } else { //caso seja -sen, o valor estara como -1, veja construtor : senoInve
                                return etds.valor * etds.seno.value(visitExpressao(ctx.identificadorF().expressao()));
                            }
                        } else {
                            return etds.cosseno.value(visitExpressao(ctx.identificadorF().expressao()));
                        }
                    }
                } else {
                    throw new RuntimeException("Erro semântico: Não é possivel avaliar a função no ponto: " + visitExpressao(ctx.identificadorF().expressao()) + ".");
                }

            case "seno":
                //calcular e retornar o valor do seno da expressao - calculo é feito na regra do seno
                return visitSeno(ctx.seno());

            case "cosseno":
                //calcular e retornar o valor do cosseno da expressao  - calculo é feito na regra do cosseno
                return visitCosseno(ctx.cosseno());

            case "soma": {
                //calcular e retornar o valor da soma da expressao
                Double exp0 = visitExpressao(ctx.expressao(0));
                Double exp1 = visitExpressao(ctx.expressao(1));
                return (exp0 + exp1);
            }

            case "subtracao": {
                //calcular e retornar o valor da subracao da expressao
                Double exp0 = visitExpressao(ctx.expressao(0));
                Double exp1 = visitExpressao(ctx.expressao(1));
                return (exp0 - exp1);
            }

            case "divisao": {
                //calcular e retornar o valor da divisao da expressao
                Double exp0 = visitExpressao(ctx.expressao(0));
                Double exp1 = visitExpressao(ctx.expressao(1));
                try {
                    return (exp0 / exp1);
                } catch (ArithmeticException e) {
                    throw new RuntimeException("ERRO SEMÂNTICO: Não é possível realizar uma divisão onde o denominador é zero.");
                }
            }

            case "multiplicacao": {
                //calcular e retornar o valor da multiplicacao da expressao
                Double exp0 = visitExpressao(ctx.expressao(0));
                Double exp1 = visitExpressao(ctx.expressao(1));
                return (exp0 * exp1);
            }

            case "potencia": {
                //calcular e retornar o valor da potencia da expressao
                Double exp0 = visitExpressao(ctx.expressao(0));
                Double exp1 = visitExpressao(ctx.expressao(1));
                return Math.pow(exp0, exp1);
            }

            case "integral": {
                //calcular e retornar o valor da integral da expressao
                double l1 = visitLimiteIntegracao(ctx.integral().intervaloIntegracao().l1);
                double l2 = visitLimiteIntegracao(ctx.integral().intervaloIntegracao().l2);
                int inverte = 1;
                if (l1 > l2) {
                    inverte = -1;
                }
                if (ctx.integral().expressao().tipo.equals("identificadorF")) {
                    if (tds.verificar(ctx.integral().expressao().identificadorF().ID1.getText()) == null) {
                        throw new RuntimeException("ERRO SEMÂNTICO: A função que se deseja integrar nao foi declarada.");
                    } else {
                        EntradaTabelaDeSimbolos etds = tds.verificar(ctx.integral().expressao().identificadorF().ID1.getText());
                        if (etds.cosseno == null && etds.seno == null) {
                            PolynomialFunction f = new PolynomialFunction(etds.coefs);
                            UnivariateIntegrator integrator = new SimpsonIntegrator(relativeAccuracy, absoluteAccuracy,
                                    minimalIterationCount, maximalIterationCount);
                            return inverte * integrator.integrate(loops, f, l1, l2);
                        } else if (etds.seno == null) {
                            Sin seno = new Sin();
                            return inverte * (seno.value(l2) - seno.value(l1));
                        } else { // ja calcula a integral do sen e do -sen
                            Cos cos = new Cos();
                            return etds.valor * inverte * (-1 * cos.value(l2) - (-1 * cos.value(l1)));
                        }
                    }
                } else {
                    double[] constante = new double[1];
                    constante[0] = visitExpressao(ctx.integral().expressao());
                    PolynomialFunction f = new PolynomialFunction(constante);
                    UnivariateIntegrator integrator = new SimpsonIntegrator(relativeAccuracy, absoluteAccuracy,
                            minimalIterationCount, maximalIterationCount);
                    return inverte * integrator.integrate(loops, f, l1, l2);
                }
            }

            case "derivada": {
                //derivar a expressao
                boolean calcular = false;
                double valor = 0;
                if (ctx.derivada().pontoDerivacao() != null) {
                    calcular = true;
                    valor = visitExpressao(ctx.derivada().pontoDerivacao().expressao());
                }
                if (ctx.derivada().expressao().tipo.equals("identificadorF")) {
                    if (tds.verificar(ctx.derivada().expressao().identificadorF().ID1.getText()) == null) {
                        throw new RuntimeException("ERRO SEMÂNTICO: A função que se deseja derivar nao foi declarada.");
                    } else {
                        EntradaTabelaDeSimbolos etds = tds.verificar(ctx.derivada().expressao().identificadorF().ID1.getText());
                        if (etds.cosseno == null && etds.seno == null) {
                            PolynomialFunction f = new PolynomialFunction(etds.coefs);
                            PolynomialFunction fLinha = f.polynomialDerivative();
                            vetorCoefAuxiliar = new double[fLinha.degree() + 1];
                            vetorCoefAuxiliar = fLinha.getCoefficients();
                            if (calcular) {
                                return fLinha.value(valor);
                            }
                            return null;
                        } else if (etds.seno == null) {
                            Sin seno = new Sin();
                            if (calcular) {
                                return -1 * (seno.value(valor));
                            }
                            return null;
                        } else {
                            Cos cos = new Cos();
                            if (calcular) {
                                return etds.valor * cos.value(valor);
                            }
                            return null;
                        }
                    }
                } else {
                    double[] constante = new double[1];
                    constante[0] = visitExpressao(ctx.derivada().expressao());
                    PolynomialFunction f = new PolynomialFunction(constante);
                    PolynomialFunction fLinha = f.polynomialDerivative();
                    if (calcular) {
                        return fLinha.value(valor);
                    }
                    return null;
                }
            }

            case "parenteses":
                return visitExpressao(ctx.expressao(0));

            case "unario":  //negar e retornar o valor da expressao
                return -1 * visitExpressao(ctx.expressao(0));


            // retornar valores simples: valores e constantes
            case "valor":  // um valor pode ser Numero ou Constante
                return visitValor(ctx.valor());
        }
        return null;
    }

    @Override
    public Double visitSeno(matematicaParser.SenoContext ctx) {
        Double exp0 = visitExpressao(ctx.expressao());
        return FastMath.sin(exp0);
    }

    @Override
    public Double visitCosseno(matematicaParser.CossenoContext ctx) {
        Double exp0 = super.visitExpressao(ctx.expressao());
        return FastMath.cos(exp0);
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
        if(ctx.getText().equals("pi")){
            return FastMath.PI;
        }
        else
            return Math.E; // euler
    }

    @Override
    public Double visitLimiteIntegracao(matematicaParser.LimiteIntegracaoContext ctx) {
        if (ctx.expressao().valor() != null){
            return visitValor(ctx.expressao().valor());
        }
        else if(ctx.expressao().Identificador() != null) {
            EntradaTabelaDeSimbolos etds = tds.verificar(ctx.expressao().Identificador().getText());
            if(etds == null){
                throw new RuntimeException("ERRO SEMÂNTICO: "+ctx.expressao().Identificador().getText()+" Variável nao foi declarada.");
            }
            return etds.valor;
        }
        else {
            try {
                return visitExpressao(ctx.expressao());
            }
            catch (RuntimeException e) {
                throw new RuntimeException("ERRO SEMÂNTICO: Os limites de integração estão mal formatados.");
            }
        }
    }
}