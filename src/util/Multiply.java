package util;

import java.util.List;

public class Multiply {

    public int multiply(List<Integer> original) {
        int a = 1;
        for(Integer i : original)
            a *= i;
        return a;
    }

}
