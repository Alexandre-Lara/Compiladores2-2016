package main.java;
import java.util.HashMap;
//import flanagan.integration.Integration;
//import flanagan.integration.IntegralFunction;

/**
 * Created by alexandre on 06/01/17.
 */

class FuncaoGenerica {
    double[] coeficientes;

    // 5 + 4x + x^2
    //coeficientes = {5, 4, 1};

    FuncaoGenerica(double[] coefs) {
        this.coeficientes = coefs;
    }
}


class EntradaTabelaDeSimbolos {
    public String nome;
    public double valor;
    public double[] coefs;
}

public class TabelaDeSimbolos {

    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;

    public TabelaDeSimbolos() {
        tabelaDeSimbolos = new HashMap<>();
    }

    public void inserir(String nome, double valor) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.valor = valor;
        tabelaDeSimbolos.put(nome, etds);
    }

    public void inserirFuncao(String nome, double[] valor) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.coefs = valor;
        tabelaDeSimbolos.put(nome, etds);
    }

    public EntradaTabelaDeSimbolos verificar(String nome) {
        if(!tabelaDeSimbolos.containsKey(nome))
            return null;
        else
            return tabelaDeSimbolos.get(nome);
    }
}