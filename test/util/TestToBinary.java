package util;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class TestToBinary {

    @Test
    public void testToBinary_12() {
        assertEquals(List.of(1, 1, 0, 0), Arrays.stream(new ToBinary().toBinary(12)).toList());
    }

    @Test
    public void testToBinary_102() {
        assertEquals(List.of(1, 1, 0, 0, 1, 1, 0), Arrays.stream(new ToBinary().toBinary(102)).toList());
    }


}
