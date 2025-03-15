package org.hine.easy;

import org.hine.easy.tree.BinarySearchTreeMode;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeModeTest {

    @Test
    void testBinarySearchTreeMode() {
        var root = new TreeNode(1,
                null,
                new TreeNode(2, new TreeNode(2), null));

        var expected = new int[] {2};
        var actual = new BinarySearchTreeMode().bstMode(root);

        assertArrayEquals(expected, actual);
    }
}