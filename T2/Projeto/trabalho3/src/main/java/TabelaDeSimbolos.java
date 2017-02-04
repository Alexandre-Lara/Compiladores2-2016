package main.java;

import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.function.Sin;

import java.util.HashMap;
/**
 * Created by alexandre on 06/01/17.
 */


class EntradaTabelaDeSimbolos {
    public String nome;
    public double valor;
    public double[] coefs;
    public Cos cosseno;
    public Sin seno;
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
    public void inserirSeno(String nome) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.seno = new Sin();
        tabelaDeSimbolos.put(nome, etds);
    }
    public void inserirCosseno(String nome) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.cosseno = new Cos();
        tabelaDeSimbolos.put(nome, etds);
    }

    public EntradaTabelaDeSimbolos verificar(String nome) {
        if(!tabelaDeSimbolos.containsKey(nome))
            return null;
        else
            return tabelaDeSimbolos.get(nome);
    }
}