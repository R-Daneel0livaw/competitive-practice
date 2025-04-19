package org.hine.easy.stack;

import org.hine.easy.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingBST {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        var ans = new TreeNode(0); var curr = ans;
        for (var num : res) {
            curr.right = new TreeNode(num);
            curr = curr.right;
        }
        return ans.right;
    }

    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }
}
