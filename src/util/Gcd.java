package util;

import java.util.ArrayList;
import java.util.List;

public class Gcd {

    private final int gcd;
    private List<Integer> dividers;

    public Gcd(int a, int b) {
        if(a < b) {
            int c = a;
            a = b;
            b = c;
        }
        this.dividers = new ArrayList<>();
        this.gcd = calculateGcd(a, b);
    }

    public List<Integer> getDividers() {
        return this.dividers;
    }

    public int getGcd() {
        return this.gcd;
    }

    /**
     * Calculates the greatest common divider
     * @param a the first (greatest) number
     * @param b the second (lowest) number
     * @return the gcd of a and b
     */
    private int calculateGcd(int a, int b) {

        int gcd = 1;
        int test = b;

        while(test > 0) {

            if(a % test == 0 && b % test == 0) {
                this.dividers.add(test);
                if(test > gcd)
                    gcd = test;
            }

            test--;
        }

        return gcd;
    }

}
