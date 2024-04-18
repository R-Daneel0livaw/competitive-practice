package org.hine.easy;

import org.hine.easy.util.TreeNode;

public class SameTree {

    public boolean sameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return sameTree(p.right, q.right) && sameTree(p.left, q.left);
    }
}