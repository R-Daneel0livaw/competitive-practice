package org.hine.easy.tree;

import org.hine.easy.tree.ClosestBSTValue;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClosestBSTValueTest {

    @Test
    void testClosestBSTValue() {
        var root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(5));
        var target = 3.714286;

        var expected = 4;
        var actual = new ClosestBSTValue().closestBSTValue(root, target);

        assertEquals(expected, actual);
    }
}