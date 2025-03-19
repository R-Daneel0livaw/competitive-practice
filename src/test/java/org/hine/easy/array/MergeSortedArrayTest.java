package org.hine.easy.array;

import org.hine.easy.array.MergeSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    void testMergeSortedArray() {
        int nums1[] = {2, 4, 6, 8, 0, 0, 0, 0};
        int nums2[] = {1, 3 , 5, 7};
        int m = 4;
        int n = 4;
        int[] expected1 = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected1, new MergeSortedArray().mergeSortedArray(nums1, nums2, m, n));
    }
}