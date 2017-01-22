/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

import java.util.ArrayList;
import java.util.List;

public class SemanticoListener extends LABaseListener{
    
    static PilhaDeTabelas pilhaDeTabela = new PilhaDeTabelas();
    
    @Override public void enterPrograma(LAParser.ProgramaContext ctx) { 
        pilhaDeTabela.empilhar(new TabelaDeSimbolos("global"));
    }
    
    @Override public void enterDeclaracao_local(LAParser.Declaracao_localContext ctx) { 
        TabelaDeSimbolos TDSAtual = pilhaDeTabela.topo();
        
        String nome, tipo;
        int linha;
        
        
        
    }
    
}
