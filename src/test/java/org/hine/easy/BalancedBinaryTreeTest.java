package org.hine.easy;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedBinaryTreeTest {

    @Test
    void testBalancedBinaryTree() {
        var root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        var expected = true;
        var actual = new BalancedBinaryTree().balancedBinaryTree(root);

        assertEquals(expected, actual);
    }
}