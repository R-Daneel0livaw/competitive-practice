package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingBitsTest {

    @Test
    void testCountingBits() {
        var num = 5;
        var expected = new int[] {0, 1, 1, 2, 1, 2};
        var actual = new CountingBits().countingBits(num);

        assertArrayEquals(expected, actual);
    }
}
