package util;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestUnit {

    @Test
    public void testUnitGroup() {
        assertEquals(List.of(1,3,5,7), new Unit().calculateUnits(8));
    }

    @Test
    public void testUnitGroupUnEven() {
        assertEquals(List.of(1,2,3,4,5,6,7,8,9,10,11,12), new Unit().calculateUnits(13).stream().sorted().toList());
    }

}
