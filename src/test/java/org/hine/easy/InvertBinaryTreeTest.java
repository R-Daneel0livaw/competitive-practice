package org.hine.easy;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvertBinaryTreeTest {

    @Test
    void testInvertBinaryTree() {
        var root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        var expected = new TreeNode(4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1)));

        var actual = new InvertBinaryTree().invertBinaryTree(root);

        assertEquals(expected.val, actual.val);

        assertEquals(expected.left.val, actual.left.val);
        assertEquals(expected.left.left.val, actual.left.left.val);
        assertEquals(expected.left.right.val, actual.left.right.val);

        assertEquals(expected.right.val, actual.right.val);
        assertEquals(expected.right.left.val, actual.right.left.val);
        assertEquals(expected.right.right.val, actual.right.right.val);
    }
}
