package org.hine.easy.stack;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IncreasingBSTTest {

    @Test
    void testIncreasingBST() {
        var root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1, null, null),
                                null),
                        new TreeNode(4, null, null)
                ),
                new TreeNode(6,
                        null,
                        new TreeNode(8,
                                new TreeNode(7, null, null),
                                new TreeNode(9, null, null)
                        )
                )
        );

        var expected = new TreeNode(1, null,
                new TreeNode(2, null,
                        new TreeNode(3, null,
                                new TreeNode(4, null,
                                        new TreeNode(5, null,
                                                new TreeNode(6, null,
                                                        new TreeNode(7, null,
                                                                new TreeNode(8, null,
                                                                        new TreeNode(9, null, null)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        var actual = new IncreasingBST().increasingBST(root);

        assertTrue(areTreesEqual(expected, actual));
    }

    private boolean areTreesEqual(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;
        return areTreesEqual(a.left, b.left) && areTreesEqual(a.right, b.right);
    }
}
