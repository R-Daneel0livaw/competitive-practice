package org.hine.easy;

import org.hine.easy.stack.BinaryTreePreorderTraversal;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreePreorderTraversalTest {

    @Test
    void testBinaryTreePreorderTraversal() {
        var root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        var expected = Arrays.asList(1, 2, 4, 5, 3, 6);
        var actual = new BinaryTreePreorderTraversal().binaryTreePreorderTraversal(root);

        assertEquals(expected, actual);
    }
}