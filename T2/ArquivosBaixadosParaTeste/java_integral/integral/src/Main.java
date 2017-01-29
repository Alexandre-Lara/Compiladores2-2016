import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;


public class Main{

    public static void main(String[] args) {
        double[] c = {1, 1, 1}; // a + x + x^2 + x^3 ...
        PolynomialFunction f = new PolynomialFunction(c);
        PolynomialFunction f_linha = f.polynomialDerivative();
        System.out.println(f.value(2));
        System.out.println(f.toString());
        System.out.println(f_linha.toString());


        final double relativeAccuracy = 1e-4;
        final double absoluteAccuracy = 1e-8;
        final int minimalIterationCount = 3;
        final int maximalIterationCount = 32;


        UnivariateIntegrator integrator = new SimpsonIntegrator(relativeAccuracy, absoluteAccuracy,
                minimalIterationCount, maximalIterationCount);
        System.out.println( integrator.integrate(10000000, f_linha, 0, 2) );

        //UnivariateIntegrator x = new UnivariateIntegrator();
     //x + x^2
    }
}
