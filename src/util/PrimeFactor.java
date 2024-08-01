package util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeFactor {

    public List<Integer> factor(int number) {

        List<Integer> factors = new ArrayList<>();
        Prime prime = new Prime();
        int selectedPrime = prime.getNextPrime();
        int numberCopy = number;

        while(getProduct(factors) != numberCopy) {

            if(new Fit(selectedPrime, number).getRestA() != 0)
                selectedPrime = prime.getNextPrime();

            if(new Fit(selectedPrime, number).getRestA() == 0)
                factors.add(selectedPrime);

            number /= selectedPrime;

        }

        return factors;


    }

    private int getProduct(List<Integer> list) {
        int product = 1;
        for(Integer i : list)
            product *= i;
        return product;
    }

}
