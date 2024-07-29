package crypto;

import theorem.TheoremEuclides;
import util.Gcd;

public class TheoremHelper {

    /**
     * Determines if two parameters are relative primes. Meaning their gcd = 1
     * @param a first number
     * @param b second number
     * @return boolean determining if they are relative prime
     */
    public static boolean isRelativePrime(int a, int b) {
        return new Gcd(a, b).getGcd() == 1;
    }

}
