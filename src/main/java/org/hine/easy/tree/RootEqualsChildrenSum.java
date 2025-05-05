package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class RootEqualsChildrenSum {

    public boolean rootEqualsChildrenSum(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
