package org.hine.easy;

import org.hine.easy.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    public boolean leafSimilarTrees(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        dfs(root1, leaves1);
        dfs(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    public void dfs(TreeNode node, List<Integer> leaves) {
        if (node != null) {
            if (node.left == null && node.right == null) leaves.add(node.val);
            dfs(node.left, leaves);
            dfs(node.right, leaves);
        }
    }
}
