package main.java;

/**
 * Created by alexandre on 05/01/17.
 */

public class VisitorMatematica extends matematicaBaseVisitor<Double> {

    private TabelaDeSimbolos tds = new TabelaDeSimbolos();

    @Override
    public Double visitPrograma(matematicaParser.ProgramaContext ctx) {
        return super.visitBloco(ctx.bloco());
    }

    @Override
    public Double visitBloco(matematicaParser.BlocoContext ctx) {
        for (int i = 0; i < ctx.declaracao().size(); i++){ //TODO: como iterar sobre a lista
            //super.visitAtribuicao(ctx.declaracao(i));
        }

        // caso o programa tenha return de alguma expressao
        if (ctx.expressao() != null)
        {
            return super.visitExpressao(ctx.expressao());
        }

        // caso o programa não tenha nenhum return
        return null;
    }

    @Override
    public Double visitDeclaracao(matematicaParser.DeclaracaoContext ctx) {
        while(!ctx.isEmpty()) // enquanto nao acabar as expressoes, executar ações apropriadas
        {
           if(ctx.tipoDecl.equals("atribuicao")){
               super.visitAtribuicao(ctx.atribuicao());
           }
           else if(ctx.tipoDecl.equals("funcao")){
               super.visitFuncao(ctx.funcao());
           }
           else if(ctx.tipoDecl.equals("print")){
               super.visitPrint(ctx.print());
           }
        }
        return null;
    }

    @Override
    public Double visitPrint(matematicaParser.PrintContext ctx) {
        if (ctx.tipoPrint.equals("expressao")){
            return visitExpressao(ctx.expressao());
        }
        else if (ctx.tipoPrint.equals("string")){
            System.out.println(ctx.String().getText());
        }
        return null;
    }

    @Override
    public Double visitAtribuicao(matematicaParser.AtribuicaoContext ctx) {
        // redeclaracao de variavel ou funcao
        if(tds.verificar(ctx.Identificador().getText()) != null){
            throw new RuntimeException("Erro semântico: "+ctx.Identificador().getText()+" Redeclaração de variável ou função.");
        }

        // inserir na tabela atribuicoes simples: valores e constantes
        else if(ctx.expressao().tipo.equals("valor")){ // um valor pode ser Numero ou Constante
            if(ctx.expressao().valor().tipo.equals("numero")){ // 'a = 8'
                tds.inserir(ctx.Identificador().getText(), Double.parseDouble(ctx.expressao().valor().Numero().getText()) );
            }
            else { //'a1 = +infinito'
                tds.inserirStr(ctx.Identificador().getText(), ctx.expressao().valor().constante().getText());
            }
        }

        // inserir na tabela atribuicoes de funcoes
        /* {N[10<->100]|N}
           mat(x) = x\n */
        else if(ctx.expressao().tipo.equals("identificadorF")){
            return super.visitIdentificadorF(ctx.expressao().identificadorF());
        }

        // nao permitir atribuicoes do tipo a  = b
        else if(ctx.expressao().tipo.equals("identificador")){
            throw new RuntimeException("Erro semântico: "+ctx.Identificador().getText()+" Não é permitido atribuição de uma variável a outra.");
        }

        return super.visitAtribuicao(ctx);
    }

    @Override
    public Double visitExpressao(matematicaParser.ExpressaoContext ctx) {
        if(ctx.tipo.equals("seno")){
            //calcular e retornar o valor do seno da expressao
        }
        else if(ctx.tipo.equals("cosseno")){
            //calcular e retornar o valor do cosseno da expressao
        }
        else if(ctx.tipo.equals("soma")){
            //calcular e retornar o valor da soma da expressao
        }
        else if (ctx.tipo.equals("subtracao")){
            //calcular e retornar o valor da subracao da expressao
        }
        else if (ctx.tipo.equals("divisao")){
            //calcular e retornar o valor da divisao da expressao
        }
        else if (ctx.tipo.equals("multiplicacao")){
            //calcular e retornar o valor da multiplicacao da expressao
        }
        else if (ctx.tipo.equals("exponencial")){
            //calcular e retornar o valor da exponencial da expressao
        }
        else if (ctx.tipo.equals("integral")){
            //calcular e retornar o valor da integral da expressao
        }
        else if (ctx.tipo.equals("parenteses")){
            //TODO : dúvida
        }
        else if (ctx.tipo.equals("unario")){ //negar e retornar o valor da expressao
            //negar um numero
            if(ctx.valor().tipo.equals("numero")){
                return -1*Double.parseDouble((ctx.valor().Numero().getText()));
            }
        }
        // retornar valores simples: valores e constantes
        else if(ctx.tipo.equals("valor")){ // um valor pode ser Numero ou Constante
            if(ctx.valor().tipo.equals("numero")){ // '8'
                return (Double.parseDouble(ctx.valor().Numero().getText()));
            }
            else { //'+infinito' TODO : dúvida
                //return ctx.valor().constante().getText();
            }
        }

        return super.visitExpressao(ctx);
    }

    // eh necessario armazenar na tabela de simbolos, o dominio e o contradominio da funcao e a variavel de dependencia ?
    @Override
    public Double visitIdentificadorF(matematicaParser.IdentificadorFContext ctx) {
        if (tds.verificar(ctx.ID1.getText()) != null){ // caso em q uma variavel ja tem o mesmo nome da funcao
            throw new RuntimeException("Erro semântico: "+ctx.ID1.getText()+" Redeclaração de variável ou funcao");
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
/*
    @Override
    public Double visitExpressao(matematicaParser.ExpressaoContext ctx) {
        MatValor valor = visitValor(ctx.valor());
        for (int i = 0; i < ctx.expressao().size(); i++){
            //matematicaParser. op1 = ctx.expressao(i);
        }
        return super.visitExpressao(ctx);
    }

*/
}
