package org.hine.easy.stack;

import org.hine.easy.util.NAryTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NAryTreePreorderTraversal {

    public List<Integer> nAryTreePreorderTraversal(NAryTreeNode root) {
        Stack<NAryTreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        stack.push(root);
        while (!stack.isEmpty()) {
            var node = stack.pop();
            res.add(node.val);

            var children = node.children;
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }
        return res;
    }
}
