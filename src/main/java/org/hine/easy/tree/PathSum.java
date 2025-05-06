package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int target) {
        if (root == null) return false;

        target -= root.val;
        if (root.left == null && root.right == null) return (target == 0);
        return hasPathSum(root.left, target) || hasPathSum(root.right, target);
    }
}
