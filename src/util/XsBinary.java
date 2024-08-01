package util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class XsBinary {

    private final int number, power, modulo;
    private final int result;

    public XsBinary(int number, int power, int modulo) {
        this.number = number;
        this.power = power;
        this.modulo = modulo;
        this.result = calculateResult();
    }

    public int calculateResult() {
        Integer[] binaryForm = new ToBinary().toBinary(power);

        //System.out.println(Arrays.stream(binaryForm).toList().stream().map(String::valueOf).collect(Collectors.joining(",")));

        // the value which we use
        long productOfValues = 1;
        // the first index in binaryForm is for example 2^12 while the last index is 2^0
        int powerIndex = binaryForm.length-1;

        for(int i = 0; i < binaryForm.length; i++) {

            // Each iteration we use a new instance of our number
            long value = number;
            //System.out.println("-------------------------");
            //System.out.println("Power index: " + powerIndex);

            // If a value is 0 in the binary form, we skip iteration
            if(binaryForm[i] == 0) {
                powerIndex--;
                continue;
            }

            // Else, we perform quadratic operation on value
            int loopAmount = powerIndex;
            while(loopAmount >= 1) {
                //System.out.print("  > " + value + " * " + value + " % " + modulo + " = ");
                value *= value;
                value %= modulo;
                //System.out.print(value + "\n");
                loopAmount--;
            }

            //System.out.print("Product: " + productOfValues + " * " + value + " % " + modulo);
            powerIndex--;
            productOfValues *= value;
            productOfValues %= modulo;
            //System.out.println(" = " + productOfValues);

        }

        return (int) productOfValues;

    }

    public int getResult() {
        return this.result;
    }

}
