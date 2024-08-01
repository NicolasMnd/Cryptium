package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrime {

    @Test
    public void testPrime_0_0() {
        assertEquals(2, new Prime().getPrime(0));
    }

    @Test
    public void testPrime_1_3() {
        assertEquals(3, new Prime().getPrime(1));
    }

    @Test
    public void testPrime_2_5() {
        assertEquals(5, new Prime().getPrime(2));
    }

}
