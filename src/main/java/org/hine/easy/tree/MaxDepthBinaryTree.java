package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class MaxDepthBinaryTree {

    public int maxDepthBinaryTree(TreeNode root) {
        if (root == null) return 0;

        var leftHeight = maxDepthBinaryTree(root.left);
        var rightHeight = maxDepthBinaryTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}