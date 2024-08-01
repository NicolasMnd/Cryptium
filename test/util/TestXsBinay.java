package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestXsBinay {

    @Test
    public void testExponential() {
        assertEquals(34, new XsBinary(12, 809, 37).getResult());
    }

    @Test
    public void testExponential_120p810_m7() {
        assertEquals(0, new XsBinary(120, 810, 12).getResult());
    }

    @Test
    public void testExponential_1() {
        assertEquals(2, new XsBinary(2, 4, 7).getResult());
    }

    @Test
    public void testExponential_2() {
        assertEquals(26, new XsBinary(1029, 103039, 109).getResult());
    }

    @Test
    public void testExponential_3() {
        assertEquals(76, new XsBinary(927390, 1030391209, 1018).getResult());
    }

}
