package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBST {

    public boolean twoSumBST(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);
    }

    private boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }
}
