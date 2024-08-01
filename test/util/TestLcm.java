package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLcm {

    @Test
    public void testGetLcm_2_4() {
        assertEquals(4, new Lcm().getLcm(2, 4));
    }

    @Test
    public void testGetLcm_3_12() {
        assertEquals(12, new Lcm().getLcm(3, 12));
    }

}
