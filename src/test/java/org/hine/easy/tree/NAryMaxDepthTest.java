package org.hine.easy.tree;

import org.hine.easy.util.NAryTreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NAryMaxDepthTest {

    @Test
    void testNAryMaxDepth() {
        var node5 = new NAryTreeNode(5);
        var node6 = new NAryTreeNode(6);

        var node3 = new NAryTreeNode(3, Arrays.asList(node5, node6));
        var node2 = new NAryTreeNode(2);
        var node4 = new NAryTreeNode(4);

        var root = new NAryTreeNode(1, Arrays.asList(node3, node2, node4));

        var expected = 3;
        var actual = new NAryMaxDepth().maxDepth(root);

        assertEquals(expected, actual);
    }
}
