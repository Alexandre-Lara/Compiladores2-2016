import java.util.regex.Pattern;

/**
 * Created by alexandre on 28/01/17.
 */
public class ExtraindoGraus {
    public static void main(String[] args){

        String poli = "-3x^3 - 3x^2 + 4";
        //String poli = "x^2 + 2*x + 1";

        Pattern.compile("(?=[+-])").split(poli);

        Pattern pegapoli = Pattern.compile("(?=[+-])");
        String[] m = pegapoli.split(poli);

        //System.out.println(m[0]);
        //System.out.println(m[1]);
        //System.out.println(m[2]);

        String polynomial= "-2x^2 +3x^1 + 6";
        String[] parts = polynomial.split("x\\^\\d+\\+?");
        for (String part : parts) {
            System.out.println(part);
        }


        polynomial= "1x^2+2x^1+1";
        parts = polynomial.split("x\\^\\d+\\+?");
        for (String part : parts) {
            System.out.println(part);
        }


    }
}
