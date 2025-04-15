package org.hine.easy.stack;

import org.hine.easy.util.NAryTreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NAryTreePostorderTraversal {

    public List<Integer> nAryTreePostorderTraversal(NAryTreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<NAryTreeNode> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            var current = stack.pop();
            res.add(current.val);

            for (var child : current.children) stack.push(child);
        }
        Collections.reverse(res);
        return res;
    }
}
