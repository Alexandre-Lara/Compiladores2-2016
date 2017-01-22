package t1;

public class AnalisadorSemantico extends LABaseVisitor<void>{

    PilhaDeTabelas tabela = new PilhaDeTabelas();
    
    @Override
    public void visitPrograma(LAParser.ProgramaContext ctx) {
        tabela.empilhar(new TabelaDeSimbolos("global"));
    }
        
    @Override
    public void visitCmd(LAParser.CmdContext ctx) {
        String nome, tipo;
        int linha;
        
        if(ctx.getStart().getText().equals("leia")){
            if(PilhaDeTabelas.existeSimbolo(ctx)){
                
            }
        }
    }

    @Override
    public void visitVariavel(LAParser.VariavelContext ctx) {
        
    }

    @Override
    public void visitDeclaracao_local(LAParser.Declaracao_localContext ctx) {
        tabela.empilhar(new TabelaDeSimbolos("local"));
        
        String nome, tipo;
        int linha;

        if(ctx.getStart().getText().equals("declare")){
            nome = ctx.IDENTIF().getText();
            tipo = ctx.tipo().tipo_estendido().tipo_basico_identificador().getText();
            if(!TDSlocal.existeSimbolo(nome)){
                    TDSlocal.adicionarSimbolo(nome, Tipo.VARIAVEL);
            }else{
                linha = ctx.IDENTIF().getSymbol().getLine();
                System.out.println("Linha "+linha+": identificador "+nome+" "+tipo+" "+linha);
            }
        }else{
            if(ctx.getStart().getText().equals("constante")){
                linha = ctx.IDENTIF().getSymbol().getLine();
                if(!TDSlocal.existeSimbolo(nome)){
                    TDSlocal.adicionarSimbolo(nome, Tipo.VARIAVEL);
                }else{
                    System.out.println("Linha "+linha+": identificador "+nome+" "+tipo+" "+linha);
                }
            }
            else{
                if(ctx.getStart().getText().equals("tipo")){
                    tipo = ctx.tipo().registro().getText();
                    TDSlocal.adicionarSimbolo(nome, Tipo.REGISTRO);
                }
            }
        }
    }

    @Override
    public Object visitDeclaracao_local_global(LAParser.Declaracao_local_globalContext ctx) {
        return super.visitDeclaracao_local_global(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaracoes(LAParser.DeclaracoesContext ctx) {
        return super.visitDeclaracoes(ctx); //To change body of generated methods, choose Tools | Templates.
    }
}
