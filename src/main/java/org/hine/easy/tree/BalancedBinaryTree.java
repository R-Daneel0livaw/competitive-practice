package org.hine.easy.tree;

import org.hine.easy.util.TreeInfo;
import org.hine.easy.util.TreeNode;

public class BalancedBinaryTree {

    public boolean balancedBinaryTree(TreeNode root) {
        TreeInfo treeInfo = isBalanced(root);
        return treeInfo.balanced;
    }

    public TreeInfo isBalanced(TreeNode node) {
        if (node == null) return new TreeInfo(-1, true);

        TreeInfo left = isBalanced(node.left);
        if (!left.balanced) return new TreeInfo(-1, false);

        TreeInfo right = isBalanced(node.right);
        if (!right.balanced) return new TreeInfo(-1, false);

        if (Math.abs(left.height - right.height) < 2) {
            return new TreeInfo(Math.max(left.height,  right.height) + 1, true);
        }

        return new TreeInfo(-1, false);
    }
}