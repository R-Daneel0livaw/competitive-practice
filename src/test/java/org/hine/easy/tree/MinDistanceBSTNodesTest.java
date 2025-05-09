package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinDistanceBSTNodesTest {

    @Test
    void testMinDistanceBSTNodes() {
        var root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
        var expected = 1;
        var actual = new MinDistanceBSTNodes().minDistanceBSTNodes(root);

        assertEquals(expected, actual);
    }
}
