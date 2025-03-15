package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class DiameterBinaryTree {

    private int diameter;
    public int diameterBinaryTree(TreeNode root) {
        this.diameter = 0;
        longestPath(root);
        return this.diameter;
    }

    private int longestPath(TreeNode node) {
        if (node == null) return 0;

        var left = longestPath(node.left);
        var right = longestPath(node.right);

        this.diameter = Math.max(this.diameter, left + right);

        return Math.max(left, right) + 1;
    }
}