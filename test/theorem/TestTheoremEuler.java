package theorem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTheoremEuler {

    @Test
    public void testEuler_13() {
        assertEquals(12, new TheoremEuler().phi(13));
    }

    @Test
    public void testEuler_12() {
        assertEquals(2, new TheoremEuler().phi(12));
    }

}
