import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.function.Cos;
import org.apache.commons.math3.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.util.FastMath;


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

        double x = FastMath.cos(1);
        System.out.println("Testes cosseno: ");
        System.out.println( integrator.integrate(10000000, x, 0, Math.PI/2) );

        UnivariateFunction basicF = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.sin(x);
            }
        });
        DerivativeStructure xDS = new DerivativeStructure(1, 2, 0, x);
        System.out.println();

        //DerivativeStructure(double a1, DerivativeStructure ds1, double a2, DerivativeStructure ds2)
        //Linear combination constructor.
        DerivativeStructure a = new DerivativeStructure(1, 1);
        integrator.integrate(1000000, x, 0, 1);
        System.out.println(x.value(Math.PI/6));
        System.out.println(x.value(Math.PI));

    }
}
