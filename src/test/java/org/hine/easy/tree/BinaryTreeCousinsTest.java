package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeCousinsTest {

    @Test
    void testBinaryTreeCousins() {
        var root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5)));
        var x = 5; var y = 4;
        var expected = true;
        var actual = new BinaryTreeCousins().isCousins(root, x, y);

        assertEquals(expected, actual);
    }
}
