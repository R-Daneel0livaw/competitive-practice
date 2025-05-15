package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceBetweenArraysTest {

    @Test
    void testDistanceBetweenArrays() {
        var nums1 = new int[] {4, 5, 8};
        var nums2 = new int[] {10, 9, 1, 8};
        var d = 2;
        var expected = 2;
        var actual = new DistanceBetweenArrays().findDistance(nums1, nums2, d);

        assertEquals(expected, actual);
    }
}
