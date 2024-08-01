package util;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestPrimeFactor {

    @Test
    public void testPrimeFactorization_6() {
        assertEquals(List.of(2,3), new PrimeFactor().factor(6));
    }

    @Test
    public void testPrimeFactorization_12() {
        assertEquals(List.of(2,2,3), new PrimeFactor().factor(12));
    }

    @Test
    public void testPrimeFactorization_13() {
        assertEquals(List.of(13), new PrimeFactor().factor(13));
    }

    @Test
    public void testPrimeFactorization_15() {
        assertEquals(List.of(3,5), new PrimeFactor().factor(15));
    }

    @Test
    public void testPrimeFactorization_20() {
        assertEquals(List.of(2,2,5), new PrimeFactor().factor(20));
    }



}
