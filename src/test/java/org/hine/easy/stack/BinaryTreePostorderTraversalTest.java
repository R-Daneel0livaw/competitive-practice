package org.hine.easy.stack;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreePostorderTraversalTest {

    @Test
    void testBinaryTreePostorderTraversal() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5, new TreeNode(6), new TreeNode(7))
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(8, new TreeNode(9), null)
                )
        );

        var expected = new int[] {4, 6, 7, 5, 2, 9, 8, 3, 1};
        var actual = new BinaryTreePostorderTraversal().postorderTraversal(root).stream().mapToInt(Integer::intValue).toArray();

        assertArrayEquals(expected, actual);
    }
}
