package org.hine.easy.array;

import org.hine.easy.array.RemoveElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    @Test
    void testRemoveElement() {
        int[] nums1 = {4, 3, 2, 1, 3, 1};
        int val1 = 3;
        int expected1 = 4;
        Assertions.assertEquals(expected1, new RemoveElement().removeElement(nums1, val1));

        int[] nums2 = {4, 2, 1, 1};
        int val2 = 3;
        int expected2 = 4;
        Assertions.assertEquals(expected2, new RemoveElement().removeElement(nums2, val2));
    }
}
