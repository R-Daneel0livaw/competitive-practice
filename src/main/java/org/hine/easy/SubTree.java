package org.hine.easy;

import org.hine.easy.util.TreeNode;

public class SubTree {

    public boolean isSubTree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isIdentical(root, subRoot)) return true;
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    private boolean isIdentical(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return node1 == null && node2 == null;
        }
        return node1.val == node2.val && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);
    }
}
