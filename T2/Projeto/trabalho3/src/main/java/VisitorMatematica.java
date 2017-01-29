package main.java;

/**
 * Created by alexandre on 05/01/17.
 */

public class VisitorMatematica extends matematicaBaseVisitor<Double> {

    private TabelaDeSimbolos tds = new TabelaDeSimbolos();

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
        if(ctx.tipoPrint.equals("expressao")){
            try {
                System.out.println(visitExpressao(ctx.expressao()));
            }catch (NullPointerException e){ // TODO: Nao tou conseguindo tratar o erro - alem disso quero tratar o erro de variavel que comeca com d
                throw new NullPointerException(ctx.expressao().Identificador().getText()+ " A variável ou função não foi declarada.");
            }
        }
        else if(ctx.tipoPrint.equals("string")){
            System.out.println(ctx.String().getText()); // TODO : pq esta pegando o " "
        }
        return null;
    }

    @Override
    public Double visitAtribuicao(matematicaParser.AtribuicaoContext ctx) {
        // redeclaracao de variavel ou funcao
        if(tds.verificar(ctx.Identificador().getText()) != null){
            throw new RuntimeException("Erro semântico: Variavel ou ffuncao "+ctx.Identificador().getText()+"redeclarada.");
        }

        // inserir na tabela atribuicoes de funcoes
        /* {N[10<->100]|N}
           mat(x) = x\n */
        else if(ctx.expressao().tipo.equals("identificadorF")){
            return super.visitIdentificadorF(ctx.expressao().identificadorF());
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


        return super.visitFuncao(ctx);
    }

    @Override
    public Double visitExpressao(matematicaParser.ExpressaoContext ctx) {
        // Todo : tratar todas as exceções : exemplo +infinito - (+ infinito) - NaN

        if(ctx.tipo.equals("identificador")){
            //retornar o valor de um identificador
            EntradaTabelaDeSimbolos aux = tds.verificar(ctx.Identificador().getText());
            return aux.valor;
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
                throw new RuntimeException("Erro semântico: Não é possível realizar uma divisão onde o denominador é zero.");
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
            System.out.println("Integral");
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



    // eh necessario armazenar na tabela de simbolos, o dominio e o contradominio da funcao e a variavel de dependencia ?
    @Override
    public Double visitIdentificadorF(matematicaParser.IdentificadorFContext ctx) {
        if (tds.verificar(ctx.ID1.getText()) != null){ // caso em q uma variavel ja tem o mesmo nome da funcao
            throw new RuntimeException("Erro semântico: "+ctx.ID1.getText()+" Redeclaração de variável ou funcao");
        }
        else {
            tds.inserir();
        }


        //verificar se variavel de dependencia esta na tabela ou se eh nova, 'f(x)'
        if (tds.verificar((ctx.ID2.getText())) == null){
            tds.inserir(ctx.ID2.getText(),0);
        }

        return super.visitIdentificadorF(ctx);
    }

    @Override
    public Double visitIntervaloInt(matematicaParser.IntervaloIntContext ctx) {
        if (ctx.ID1.getText() == null){ // verificar se o identificador foi declarado
            throw new RuntimeException("Erro semântico: "+ctx.ID1.getText()+" Variável nao foi declarada.");
        }
        if (ctx.ID2.getText() == null || ctx.ID2.getText() == null){ // verificar se o identificador foi declarado
            throw new RuntimeException("Erro semântico: "+ctx.ID2.getText()+" Variável nao foi declarada.");
        }
        return super.visitIntervaloInt(ctx);
    }

}
