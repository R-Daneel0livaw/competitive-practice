package org.hine.easy.stack;

import org.hine.easy.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.peek();
            if (node.right == null || node.right == prev) {
                res.add(node.val);
                prev = node;
                stack.pop();
            } else {
                root = node.right;
            }
        }

        return res;
    }
}
