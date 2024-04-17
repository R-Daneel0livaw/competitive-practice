package org.hine.easy;

import org.hine.easy.util.TreeNode;

public class RangeSumBST {

    int ans;
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.ans = 0;
        dfs(root, low, high);
        return ans;
    }

    private void dfs(TreeNode node, int low, int high) {
        if (node != null) {
            if (node.val >= low && node.val <= high) this.ans += node.val;
            if (node.val > low) dfs(node.left, low, high);
            if (node.val < high) dfs(node.right, low, high);
        }
    }
}
