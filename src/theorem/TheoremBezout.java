package theorem;

import com.misterl.location.positions.Pos3di;
import util.Fit;

/**
 * When d is the gcd of a and m, then: 'e = at * ms' holds.
 * Example: d = (3, 27) = 3. a = 3, m = 27 so 3 = 3t + 27s
 *
 * But more usefully:
 * d = (5, 27) = 1. a = 5, m = 27 so 1 = 5t + 27s <=> 5t == 1 mod 27
 * In other words: what is the multiplicative inverse of 5 in group mod 27?
 */
public class TheoremBezout {

    private final int key, modulo, result;
    private int inversion;

    public TheoremBezout(int key, int modulo, int result) {
        if(key == 0 || modulo == 0 || result < 0)
            throw new IllegalArgumentException("Theoreom of Bezout cannot be run with key '" + key + "', modulo '" + modulo + "' and result '" + result + "'.");
        this.key = key;
        this.modulo = modulo;
        this.result = result;
        this.inversion = -1;
        calculate();
    }

    public int getInversion() {
        return this.inversion;
    }

    public boolean isTheoremValid() {
        return inversion != -1;
    }

    private void calculate() {
        Pos3di vec1 = new Pos3di(key, 1, 0);
        Pos3di vec2 = new Pos3di(modulo, 0, 1);

        while(true) {

            int x1 = vec1.x();
            int x2 = vec2.x();

            // Break when either one of these happens
            if(x1 == result || x2 == result) {
                this.inversion = x1 == result ? vec1.y() : vec2.y();
                while(this.inversion < 0 || this.inversion > modulo)
                    this.inversion = this.inversion < 0 ? this.inversion + modulo : this.inversion - modulo;
                break;
            }

            if(x1 <= 0 || x2 <= 0)
                break;

            Fit f = new Fit(x1, x2);

            if(x1 > x2) {

                Pos3di copy = vec2.clone();
                copy.multiply(f.getAmountB());
                vec1 = (Pos3di) vec1.subtract(copy);

            }

            else {

                Pos3di copy = vec1.clone();
                copy.multiply(f.getAmountA());
                vec2 = (Pos3di) vec2.subtract(copy);

            }



            //System.out.println(": " + vec1.getFormat());
            //System.out.println(": " + vec2.getFormat());
            //System.out.println("\n");

        }

    }



}
