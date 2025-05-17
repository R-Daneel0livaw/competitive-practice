package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPositiveNegativeTest {

    @Test
    void testLargestPositiveNegative() {
        var nums = new int[] {-1, 2, -3, 4, 3};
        var expected = 3;
        var actual = new LargestPositiveNegative().largestPositiveNegative(nums);

        assertEquals(expected, actual);
    }
}
