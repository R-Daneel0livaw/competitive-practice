package org.hine.easy;

import org.hine.easy.tree.DiameterBinaryTree;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiameterBinaryTreeTest {

    @Test
    void testDiameterBinaryTree() {
        var root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));

        var expected = 3;
        var actual = new DiameterBinaryTree().diameterBinaryTree(root);

        assertEquals(expected, actual);
    }
}