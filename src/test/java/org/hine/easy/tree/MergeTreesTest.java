package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeTreesTest {

    @Test
    void testMergeTrees() {
        var root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        var root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        var expected = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)));
        var actual = new MergeTrees().mergeTrees(root1, root2);

        assertTrue(areTreesEqual(expected, actual), "The merged tree does not match the expected structure or values.");

    }

    private boolean areTreesEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        return areTreesEqual(t1.left, t2.left) && areTreesEqual(t1.right, t2.right);
    }
}
