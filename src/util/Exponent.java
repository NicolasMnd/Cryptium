package util;

public class Exponent {

    private final int modulo;

    public Exponent(int modulo) {
        this.modulo = modulo;
    }

    public int getExponent() {
        int a = 2;
        int max = 1;
        while(a < modulo) {
            int orde = new Order().getOrder(a, modulo);
            if(orde > max)
                max = orde;
            a++;
        }
        return max;
    }

}
