package main.java;

/**
 * Created by alexandre on 05/01/17.
 */

public class VisitorMatematica extends matematicaBaseVisitor<Void> {

    private TabelaDeSimbolos tds = new TabelaDeSimbolos();

    @Override
    public Void visitAtribuicao(matematicaParser.AtribuicaoContext ctx) {
        // redeclaracao de variavel ou funcao
        if(tds.verificar(ctx.Identificador().getText()) != null){
            throw new RuntimeException("Erro semântico: "+ctx.Identificador().getText()+" Redeclaração de variável ou funcao");
        }
        // inserir na tabela atribuicoes simples 'x = 8'
        else if(ctx.expressao().tipo.equals("valor")){
            tds.inserir(ctx.Identificador().getText(), Double.parseDouble(ctx.expressao().valor().getText()) );
        }
        // inserir na tabela atribuicao de valores constantes: 'a1 = +infinito'
        else if(ctx.expressao().tipo.equals("valor")){
            tds.inserir(ctx.Identificador().getText(), Double.parseDouble(ctx.expressao().valor().getText()) );
        }
        return super.visitAtribuicao(ctx);
    }

    // eh necessario armazenar na tabela de simbolos, o dominio e o contradominio da funcao e a variavel de dependencia ?
    @Override
    public Void visitIdentificadorF(matematicaParser.IdentificadorFContext ctx) {
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
    public Void visitIntervaloInt(matematicaParser.IntervaloIntContext ctx) {
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
    public Void visitExpressao(matematicaParser.ExpressaoContext ctx) {
        MatValor valor = visitValor(ctx.valor());
        for (int i = 0; i < ctx.expressao().size(); i++){
            //matematicaParser. op1 = ctx.expressao(i);
        }
        return super.visitExpressao(ctx);
    }

*/
}
