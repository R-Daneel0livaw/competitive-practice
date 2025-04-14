package org.hine.easy.stack;

import org.hine.easy.util.NAryTreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NAryTreePreorderTraversalTest {

    @Test
    void testNAryTreePreorderTraversal() {
        var root = new NAryTreeNode(1, Arrays.asList(
                new NAryTreeNode(3, Arrays.asList(
                        new NAryTreeNode(5),
                        new NAryTreeNode(6)
                )),
                new NAryTreeNode(2),
                new NAryTreeNode(4)
        ));
        var expected = new int[] {1, 3, 5, 6, 2, 4};
        var actual = new NAryTreePreorderTraversal().nAryTreePreorderTraversal(root).stream().mapToInt(Integer::intValue).toArray();

        assertArrayEquals(expected, actual);
    }
}
