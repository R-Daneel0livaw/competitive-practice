package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondMinimumTest {

    @Test
    void testSecondMinimum() {
        var root = new TreeNode(2, new TreeNode(2), new TreeNode(5, new TreeNode(5), new TreeNode(7)));
        var expected = 5;
        var actual = new SecondMinimum().secondMinimum(root);

        assertEquals(expected, actual);
    }
}
