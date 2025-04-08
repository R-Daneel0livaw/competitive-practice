package org.hine.easy.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreaterElementTest {

    @Test
    void testNextGreaterElement() {
        var nums1 = new int[] {4, 1, 2};
        var nums2 = new int[] {1, 3, 4, 2};
        var expected = new int[] {-1, 3, -1};
        var actual = new NextGreaterElement().nextGreaterElement(nums1, nums2);

        assertArrayEquals(expected, actual);
    }
}
