package org.hine.easy.array;

import org.hine.easy.array.ConvertArrayToBST;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConvertArrayToBSTTest {

    @Test
    void testConvertArrayToBST() {
        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode actual = new ConvertArrayToBST().convertArrayToBST(nums1);
        assertNotNull(actual);
    }
}