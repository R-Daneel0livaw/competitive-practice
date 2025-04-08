package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Merge2DArraysTest {

    @Test
    void testMerge2DArrays() {
        var nums1 = new int[][] {{1, 2}, {2, 3}, {4, 5}};
        var nums2 = new int[][] {{1, 4}, {3, 2}, {4, 1}};
        var expected = new int[][] {{1, 6}, {2, 3}, {3, 2}, {4, 6}};
        var actual = new Merge2DArrays().merge2DArrays(nums1, nums2);

        assertArrayEquals(expected, actual);
    }
}
