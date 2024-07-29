package theorem;

public class TheoremEuclides {

    private int number, base;
    private int rest, quotient, gcd;

    public TheoremEuclides(int number, int base) {
        this.number = number;
        this.base = base;
        setValues();
        executeAlgorithm();
    }

    void executeAlgorithm() {
        while(rest != 0) {
            this.number = base;
            this.base = rest;
            setValues();
        }
        this.gcd = base;
    }

    public int getGcd() {
        return this.gcd;
    }

    /**
     * Calculates the quotient & rest
     */
    private void setValues() {
        this.quotient = (int) Math.floor((double) number / base);
        this.rest = number - (quotient * base);
    }

}
