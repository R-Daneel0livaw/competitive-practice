package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumBSTTest {

    @Test
    void testTwoSumBST() {
        var root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        var k = 9;
        var expected = true;
        var actual = new TwoSumBST().twoSumBST(root, k);

        assertEquals(expected, actual);
    }
}
