package org.hine.easy;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeSumBSTTest {

    @Test
    void testRangeSumBST() {
        var root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        var low = 7; var high = 15;

        var expected = 32;
        var actual = new RangeSumBST().rangeSumBST(root, low, high);

        assertEquals(expected, actual);
    }
}