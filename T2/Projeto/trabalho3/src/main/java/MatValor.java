package main.java;

/**
 * Created by alexandre on 05/01/17.
 */
class Intervalo {
    private MatValor intervalo1;
    private MatValor intervalo2;

    public Intervalo(Object itv1, Object itv2){
        this.intervalo1 = new MatValor(itv1);
        this.intervalo2 = new MatValor(itv2);
    }
}

class Dominio {
    private String conjunto;
    private MatValor intervalo;

    public Dominio(String conj, MatValor itv){
        this.conjunto = conj;
        this.intervalo = new MatValor(itv);
    }
}

public class MatValor {
    private Object valor;

    public MatValor(Object v) {
        if(v == null) {
            throw new RuntimeException("v == null");
        }
        valor = v;
        // aceitar apenas numeros e constantes (declaradas como String)
        if(!(ehNumber() || ehString())) {
            throw new RuntimeException("tipo invalido de dado: " + v + " (" + v.getClass() + ")");
        }
    }

    public MatValor (Object intervalo1, Object intervalo2){
        this.valor = new Intervalo(intervalo1, intervalo2);
    }

    public Double comoDouble() {
        return ((Number)valor).doubleValue();
    }

    public String comoString() {
        return (String)valor;
    }

    public Intervalo comoIntervalo(){ // TODO: 06/01/17  terminar
        return (Intervalo)valor;
    }

    public boolean ehNumber() {
        return valor instanceof Number;
    }

    public boolean ehString() {
        return valor instanceof String;
    }

    public boolean ehIntervalo(){
        return valor instanceof Intervalo;
    }
}
