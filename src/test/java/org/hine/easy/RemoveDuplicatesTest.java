package org.hine.easy;

import org.hine.easy.array.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        int[] nums1 = {1, 1, 2, 3, 3, 4};
        int expected1 = 4;
        assertEquals(expected1, new RemoveDuplicates().removeDuplicates(nums1));

        int[] nums2 = {1};
        int expected2 = 1;
        assertEquals(expected2, new RemoveDuplicates().removeDuplicates(nums2));
    }
}