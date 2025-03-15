package org.hine.easy;

import org.hine.easy.tree.LeafSimilarTrees;
import org.hine.easy.util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeafSimilarTreesTest {

    @Test
    void testLeafSimilarTrees() {
        var root1 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8)));

        var root2 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));

        var expected = true;
        var actual = new LeafSimilarTrees().leafSimilarTrees(root1, root2);

        assertEquals(expected, actual);
    }
}