package main.java;

import java.util.HashMap;

/**
 * Created by alexandre on 06/01/17.
 */
class EntradaTabelaDeSimbolos {
    public String nome;
    public double valor;
    public String valorStr;
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
    public void inserirStr(String nome, String valor) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.valorStr = valor;
        tabelaDeSimbolos.put(nome, etds);
    }

    public EntradaTabelaDeSimbolos verificar(String nome) {
        if(!tabelaDeSimbolos.containsKey(nome))
            return null;
        else
            return tabelaDeSimbolos.get(nome);
    }
}