package org.hine.easy;

import org.hine.easy.util.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BinarySearchTreeMode {

    public int[] bstMode(TreeNode root) {
        Map<Integer, Integer> counter = new HashMap<>();
        dfs(root, counter);

        var maxFreq = counter.keySet().stream().max(Integer::compare).orElse(0);

        List<Integer> ans = counter.keySet().stream()
                .filter(key -> Objects.equals(counter.get(key), maxFreq))
                .toList();

        return ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private void dfs(TreeNode node, Map<Integer, Integer> counter) {
        if (node == null) return;
        counter.put(node.val, counter.getOrDefault(node.val, 0) + 1);
        dfs(node.left, counter);
        dfs(node.right, counter);
    }
}