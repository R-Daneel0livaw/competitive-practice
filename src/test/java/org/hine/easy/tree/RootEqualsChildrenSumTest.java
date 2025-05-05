package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RootEqualsChildrenSumTest {

    @Test
    void testRootEqualsChildrenSum() {
        var root = new TreeNode(5, new TreeNode(3), new TreeNode(2));
        var expected = true;
        var actual = new RootEqualsChildrenSum().rootEqualsChildrenSum(root);

        assertEquals(expected, actual);
    }
}
