package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class CompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        var d = computeDepth(root);
        if (d == 0) return 1;

        var left = 0; var right = (int) Math.pow(2, d) - 1;
        int middle;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (exists(middle, d, root)) left = middle + 1;
            else right = middle - 1;
        }
        return (int) Math.pow(2, d) - 1 + left;
    }

    private int computeDepth(TreeNode node) {
        var d = 0;
        while (node.left != null) {
            node = node.left;
            d++;
        }
        return d;
    }

    private boolean exists(int index, int d, TreeNode node) {
        var left = 0; var right = (int) Math.pow(2, d) - 1;
        int middle;
        for (int i = 0; i < d; i++) {
            middle = left + (right - left) / 2;
            if (index <= middle) {
                node = node.left;
                right = middle;
            } else {
                node = node.right;
                left = middle + 1;
            }
        }
        return node != null;
    }
}
