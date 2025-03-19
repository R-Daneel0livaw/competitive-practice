package org.hine.easy.array;

import org.hine.easy.array.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TwoSumTest {

    @Test
    void testTwoSum() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, new TwoSum().twoSum(nums1, target1));

        int[] nums2 = {3, 8, 12, 5};
        int target2 = 30;
        assertNull(new TwoSum().twoSum(nums2, target2));
    }
}