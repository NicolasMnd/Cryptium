package util;

public class Order {

    public int getOrder(int number, int modulo) {
        if(new Gcd(number, modulo).getGcd() > 1)
            return -1;
        int count = 1;
        int num = number;

        while(num != 1) {
            num *= number;
            num %= modulo;
            count++;
        }

        return count;
    }

}
