package theorem;

import util.XsBinary;

public class TheoremFermat {

    public boolean isWeakPrime(int number, int modulo) {
        return new XsBinary(number, modulo-1, modulo).getResult() == 1;
    }



}
