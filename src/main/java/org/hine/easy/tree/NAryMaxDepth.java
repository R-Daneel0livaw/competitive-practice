package org.hine.easy.tree;

import org.hine.easy.util.NAryTreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NAryMaxDepth {

    public int maxDepth(NAryTreeNode root) {
        if (root == null) return 0;

        if (root.children.isEmpty()) return 1;

        List<Integer> heights = new LinkedList<>();
        for (var node : root.children) {
            heights.add(maxDepth(node));
        }
        return Collections.max(heights) + 1;
    }
}
