package org.hine.easy;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTreeTest {

    @Test
    void testSubTree() {
        var root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        var subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        var expected = true;
        var actual = new SubTree().isSubTree(root,subRoot);

        assertEquals(expected, actual);
    }
}
