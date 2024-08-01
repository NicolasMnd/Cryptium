package theorem;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestTheoremBezout {

    @Test
    public void testBezoutCorrect_Mod13_Key2_Inversion() {
        TheoremBezout bezout = new TheoremBezout(2, 13, 1);
        assertEquals((bezout.getInversion()*2) % 13, 1);
    }

    @Test
    public void testBezoutCorrect_Mod14_Key2_Inversion() {
        TheoremBezout bezout = new TheoremBezout(2, 14, 1);
        assertEquals(bezout.getInversion(), -1);
        assertFalse(bezout.isTheoremValid());
    }

}
