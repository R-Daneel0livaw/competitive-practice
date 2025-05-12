package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayIntersection2Test {

    @Test
    void testArrayIntersection2() {
        var nums1 = new int[] {1, 2, 2, 1};
        var nums2 = new int[] {2, 2};
        var expected = new int[] {2, 2};
        var actual = new ArrayIntersection2().arrayIntersection2(nums1, nums2);

        assertArrayEquals(expected, actual);
    }
}
