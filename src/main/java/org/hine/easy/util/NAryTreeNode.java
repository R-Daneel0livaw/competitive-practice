package org.hine.easy.util;

import java.util.ArrayList;
import java.util.List;

public class NAryTreeNode {
    public int val;
    public List<NAryTreeNode> children;

    public NAryTreeNode() {}

    public NAryTreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public NAryTreeNode(int val, List<NAryTreeNode> children) {
        this.val = val;
        this.children = children;
    }
}
