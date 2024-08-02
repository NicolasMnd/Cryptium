package theorem;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTheoremShor {

    @Test
    public void testTheoremShor() {
        TheoremShor sho = new TheoremShor(11*17);
        assertEquals(11*17, sho.p()*sho.q());
    }

}


