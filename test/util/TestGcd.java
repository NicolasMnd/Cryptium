package util;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestGcd {

    @Test
    public void testGcdEquals() {
        Gcd g = new Gcd(10, 10);
        assertEquals(g.getGcd(), 10);
    }

    @Test
    public void testGcd10_35() {
        Gcd g = new Gcd(10, 35);
        assertEquals(g.getGcd(), 5);
    }

    @Test
    public void testDividers() {
        Gcd g = new Gcd(10, 35);
        assertEquals(g.getDividers(), List.of(5, 1));
    }

}
