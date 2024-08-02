package theorem;

import util.Gcd;
import util.Order;
import util.XsBinary;

public class TheoremShor {

    private final int modulo;
    private int p, q;

    public TheoremShor(int modulo) {
        this.modulo = modulo;
        this.crack();
    }

    public int p() {
        return this.p;
    }

    public int q() {
        return this.q;
    }

    public void crack() {

        int a = 2;

        while(a < modulo) {

            int ordeA = new Order().getOrder(a, modulo);

            // Als orde niet oneven is of a^e/2 mod m != -1 of 1, gaan we verder
            if(ordeA % 2 == 0 && Math.abs(new XsBinary(a, ordeA/2, modulo).getResult()) != 1) {

                int element = new XsBinary(a, ordeA/2, modulo).getResult();
                this.p = new Gcd(modulo, element - 1).getGcd();
                this.q = new Gcd(modulo, element + 1).getGcd();

            }

            a++;

        }

    }



}
