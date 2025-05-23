package org.hine.easy.tree;

import org.hine.easy.util.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    private void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            path += Integer.toString(root.val);
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                path += "->";
                constructPaths(root.left, path, paths);
                constructPaths(root.right, path, paths);
            }
        }
    }
}
