package crypto;

import util.Prime;

public class Rsa {

    private final int m, p, q;

    public Rsa(int p, int q) {
        if(!(new Prime().isPrime(p)) || !(new Prime().isPrime(q)))
            throw new IllegalArgumentException("Parameter p = '" + p + "' and/or '" + q + "' are not primes.");
        this.m = p*q;
        this.p = p;
        this.q = q;
    }

}
