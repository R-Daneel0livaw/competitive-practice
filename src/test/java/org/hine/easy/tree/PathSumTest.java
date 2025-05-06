package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathSumTest {

    @Test
    void testPathSum() {
        var root = new TreeNode(1, new TreeNode(2), new TreeNode(3, null, new TreeNode(1)));
        var target = 5;
        var expected = true;
        var actual = new PathSum().hasPathSum(root, target);

        assertEquals(expected, actual);
    }
}
