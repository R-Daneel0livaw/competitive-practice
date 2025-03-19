package org.hine.easy.array;

import org.hine.easy.array.SearchInsertPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

    @Test
    void testSearchInsertPosition() {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int target1 = 2, expected1 = 1;
        Assertions.assertEquals(expected1, new SearchInsertPosition().searchInsertPosition(nums1, target1));

        int[] nums2 = {1, 2, 4, 5, 6, 7};
        int target2 = 3, expected2 = 2;
        Assertions.assertEquals(expected2, new SearchInsertPosition().searchInsertPosition(nums2, target2));
    }
}