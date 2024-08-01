package util;

import java.util.ArrayList;
import java.util.List;

public class ToBinary {

    public Integer[] toBinary(int number) {

        List<Integer> digits = new ArrayList<>();

        while(number > 0) {

            if(number % 2 == 0)
                digits.add(0);
            else {
                digits.add(1);
                number -= 1;
            }

            number /= 2;
        }

        Integer[] digitArray = new Integer[digits.size()];
        int index = 0;

        for(int i = digits.size() - 1; i >= 0; i--)
            digitArray[index++] = digits.get(i);

        return digitArray;

    }

}
