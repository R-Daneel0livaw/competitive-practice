package org.hine.easy;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertArrayToBSTTest {

    @Test
    void testConvertArrayToBST() {
        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode actual = new ConvertArrayToBST().convertArrayToBST(nums1);
        Assertions.assertNotNull(actual);
    }
}