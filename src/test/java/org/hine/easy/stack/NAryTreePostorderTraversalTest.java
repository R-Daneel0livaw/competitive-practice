package org.hine.easy.stack;

import org.hine.easy.util.NAryTreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NAryTreePostorderTraversalTest {

    @Test
    void testNAryTreePostorderTraversal() {
        var root = new NAryTreeNode(1, Arrays.asList(
                new NAryTreeNode(3, Arrays.asList(
                        new NAryTreeNode(5),
                        new NAryTreeNode(6)
                )),
                new NAryTreeNode(2, new ArrayList<>()),
                new NAryTreeNode(4, new ArrayList<>())
        ));

        var expected = new int[] {5, 6, 3, 2, 4, 1};
        var actual = new NAryTreePostorderTraversal().nAryTreePostorderTraversal(root).stream().mapToInt(Integer::intValue).toArray();

        assertArrayEquals(expected, actual);
    }
}
