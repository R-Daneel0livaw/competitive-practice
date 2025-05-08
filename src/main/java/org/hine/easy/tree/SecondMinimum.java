package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class SecondMinimum {

    private int min1;
    long ans = Long.MAX_VALUE;

    public int secondMinimum(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }

    private void dfs(TreeNode root) {
        if (root != null) {
            if (min1 < root.val && root.val < ans) {
                ans = root.val;
            } else if (min1 == root.val) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
}
