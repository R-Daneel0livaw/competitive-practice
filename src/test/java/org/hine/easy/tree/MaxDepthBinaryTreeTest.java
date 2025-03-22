package org.hine.easy.tree;

import org.hine.easy.tree.MaxDepthBinaryTree;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxDepthBinaryTreeTest {

    @Test
    void testMaxDepthBinaryTree() {
        var root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        var expected = 3;
        var actual = new MaxDepthBinaryTree().maxDepthBinaryTree(root);

        assertEquals(expected, actual);
    }
}