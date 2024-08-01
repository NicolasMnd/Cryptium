package util;

import theorem.TheoremEuclides;

public class Lcm {

    public int getLcm(int a, int b) {
        return (a * b) / new TheoremEuclides(a, b).getGcd();
    }

}
