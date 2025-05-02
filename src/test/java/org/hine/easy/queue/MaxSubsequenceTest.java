package org.hine.easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxSubsequenceTest {

    @Test
    void testMaxSubsequence() {
        var nums = new int[] {2, 1, 3, 3};
        var k = 2;
        var expected = new int[] {3, 3};
        var actual = new MaxSubsequence().maxSubsequence(nums, k);

        assertArrayEquals(expected, actual);
    }
}
