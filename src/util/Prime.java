package util;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    private int primeCount = 0;

    public Prime() {

    }

    public int getNextPrime() {
        return getPrime(primeCount++);
    }

    public int getPrime(int n) {
        return fib(n+2);
    }

    public boolean isPrime(int p) {
        int test = getNextPrime();
        while(test < p) {
            test = getNextPrime();
        }
        return p == test;
    }

    private int fib(int n) {
        int a = 0, b = 1;
        for(int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b += temp;
        }
        return b;
    }

}
