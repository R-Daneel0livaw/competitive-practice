package org.hine.easy;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeInorderTraversalTest {

    @Test
    void testBinaryTreeInorderTraversal() {
        var root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        var expected = Arrays.asList(4, 2, 5, 1, 3, 6);
        var actual = new BinaryTreeInorderTraversal().binaryTreeInorderTraversal(root);

        assertEquals(expected, actual);
    }
}