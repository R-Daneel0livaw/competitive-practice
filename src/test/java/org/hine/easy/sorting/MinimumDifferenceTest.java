package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDifferenceTest {

    @Test
    void testMinimumDifference() {
        var nums = new int[] {9, 4, 1, 7};
        var k = 2;
        var expected = 2;
        var actual = new MinimumDifference().minimumDifference(nums, k);

        assertEquals(expected, actual);
    }
}
