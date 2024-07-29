package crypto;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTheorems {

    @Test
    public void testIsRelativePrime1_1() {
        assertTrue(TheoremHelper.isRelativePrime(1, 1));
    }


    @Test
    public void testIsRelativePrime5_10_False() {
        assertFalse(TheoremHelper.isRelativePrime(10, 5));
    }


    @Test
    public void testIsRelativePrime3_5() {
        assertTrue(TheoremHelper.isRelativePrime(3, 5));
    }

}
