package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class InvertBinaryTree {

    public TreeNode invertBinaryTree(TreeNode root) {
        if (root == null) return null;

        TreeNode right = invertBinaryTree(root.right);
        TreeNode left = invertBinaryTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }
}