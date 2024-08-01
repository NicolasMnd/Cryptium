package theorem;

import util.Multiply;
import util.PrimeFactor;

import java.util.List;
import java.util.stream.Collectors;

public class TheoremEuler {

    /**
     * Euler states that for p prime, a^p mod p = a. This follows from {@link proposition.OrderDivider}.
     * The amount of units in group mod p is p-1 (p = prime). So a^(p-1) mod p = 1. So a^p mod p = a.
     * The element a in group modulo p might have a lower order, but the order is always a divider of the order of the group.
     * @return the amount of units in the group
     */
    public int phi(int modulo) {
        List<Integer> primes = new PrimeFactor().factor(modulo);
        primes = primes.stream().map(a -> a-1).toList();
        return new Multiply().multiply(primes);
    }

}
