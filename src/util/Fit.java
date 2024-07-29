package util;

public class Fit {

    private final int a, b;

    public Fit(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getAmountA() {
        return (int) Math.floor((double) b / a);
    }

    public int getAmountB() {
        return (int) Math.floor((double) a / b);
    }

    public int getRestA() {
        return b - (getAmountA() * a);
    }

    public int getRestB() {
        return a - (getAmountB() * b);
    }

}
