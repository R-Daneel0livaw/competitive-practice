package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteTreeNodesTest {

    @Test
    void testCompleteTreeNodes() {
        var root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        var expected = 6;
        var actual = new CompleteTreeNodes().countNodes(root);

        assertEquals(expected, actual);
    }
}
