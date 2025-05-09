package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePathsTest {

    @Test
    void testBinaryTreePaths() {
        var root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        List<String> expected = new LinkedList<>();
        expected.add("1->2->5");
        expected.add("1->3");
        var actual = new BinaryTreePaths().binaryTreePaths(root);

        assertEquals(expected, actual);
    }
}
