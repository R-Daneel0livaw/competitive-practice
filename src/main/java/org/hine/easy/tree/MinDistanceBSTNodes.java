package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class MinDistanceBSTNodes {

    private int minDistance = Integer.MAX_VALUE;
    private TreeNode prev;

    public int minDistanceBSTNodes(TreeNode root) {
        inorderTraversal(root);
        return minDistance;
    }

    private void inorderTraversal(TreeNode root) {
        if (root == null) return;

        inorderTraversal(root.left);

        if (prev != null) {
            minDistance = Math.min(minDistance, root.val - prev.val);
        }
        prev = root;

        inorderTraversal(root.right);
    }
}
