package org.hine.easy;

import org.hine.easy.tree.SymmetricTree;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymmetricTreeTest {

    @Test
    void testSymmetricTree() {
        var root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        var expected = true;
        var actual = new SymmetricTree().symmetricTree(root);

        assertEquals(expected, actual);
    }
}