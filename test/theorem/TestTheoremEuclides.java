package theorem;

import org.junit.Test;
import util.Gcd;

import static org.junit.Assert.assertEquals;

public class TestTheoremEuclides {

    @Test
    public void testEuclides() {
        TheoremEuclides e = new TheoremEuclides(22911, 9856);
        assertEquals(e.getGcd(), new Gcd(22911, 9856).getGcd());
    }

}
