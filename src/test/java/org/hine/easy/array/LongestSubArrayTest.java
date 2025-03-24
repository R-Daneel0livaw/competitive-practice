package org.hine.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubArrayTest {

    @Test
    void testLongestSubArray() {
        var nums = new int[] {1, 4, 3, 3, 2};
        var expected = 2;
        var actual = new LongestSubArray().longestSubArray(nums);

        assertEquals(expected, actual);
    }
}
