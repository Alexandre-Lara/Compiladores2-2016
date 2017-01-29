http://partilho.com.br/docs/exercicio-de-java-programacao-de-formulas-na-fisica/

package Controle;
 
import javax.swing.JOptionPane;
 
public class FuncaoPrimeiroGrau {
 
    // Lembre-se que a função é dada por y = a.x + b
    private double a;
    private double b;
 
    // Esta é chamada construtora da classe
    // Isto significa que na hora de instanciar este objeto
    // Serão necessários 2 parâmetros: a e b 
    public FuncaoPrimeiroGrau(double a, double b) {
        this.a = a;
        this.b = b;
    }
 
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Esta função é dada por y = " + this.a + " . x" + " + " + this.b);
    }
 
    public void yParaxIguala(double x){
        JOptionPane.showMessageDialog(null, "Para x = " + x + " , y = " + (this.a * x + b));
 
    }
 
}