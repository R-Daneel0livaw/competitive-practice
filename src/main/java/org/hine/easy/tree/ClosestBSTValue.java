package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

public class ClosestBSTValue {

    public int closestBSTValue(TreeNode root, double target) {
        int val;
        var closest = root.val;
        while (root != null) {
            val = root.val;
            closest = Math.abs(val - target) < Math.abs(closest - target)
                    || (Math.abs(val - target) == Math.abs(closest - target) && val < closest) ? val : closest;
            root = target < root.val ? root.left : root.right;
        }
        return closest;
    }
}