package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFit {

    @Test
    public void testFitAInB1() {
        assertEquals(new Fit(10, 34).getAmountA(), 3);
        assertEquals(new Fit(10, 34).getRestA(), 4);
    }

    @Test
    public void testFitAInB2() {
        assertEquals(new Fit(34, 34).getAmountA(), 1);
        assertEquals(new Fit(34, 34).getRestA(), 0);
    }

    @Test
    public void testFitAInB3() {
        assertEquals(new Fit(20, 34).getAmountA(), 1);
        assertEquals(new Fit(20, 34).getRestA(), 14);
    }

}
