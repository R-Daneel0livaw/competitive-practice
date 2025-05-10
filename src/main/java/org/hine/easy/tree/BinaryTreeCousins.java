package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCousins {

    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var siblings = false;
            var cousins = false;
            var nodesAtDepth = queue.size();

            for (int i = 0; i < nodesAtDepth; i++) {
                var node = queue.remove();
                if (node == null) {
                    siblings = false;
                } else {
                    if (node.val == x || node.val == y) {
                        if (!cousins) {
                            siblings = cousins = true;
                        } else {
                            return !siblings;
                        }
                    }
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                    queue.add(null);
                }
            }
            if (cousins) return false;
        }
        return false;
    }
}
