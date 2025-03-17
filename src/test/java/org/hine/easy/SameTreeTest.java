package org.hine.easy;

import org.hine.easy.tree.SameTree;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {

    @Test
    void testSameTree() {
        var p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        var q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        var expected = true;
        var actual = new SameTree().sameTree(p, q);

        Assertions.assertEquals(expected, actual);
    }
}