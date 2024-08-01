package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOrder {

    @Test
    public void testOrderElement_15_mod16() {
        assertEquals(2, new Order().getOrder(15, 16));
    }

    @Test
    public void testOrderElement_3_mod16() {
        assertEquals(4, new Order().getOrder(3, 16));
    }

}
