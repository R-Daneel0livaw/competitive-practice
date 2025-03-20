package org.hine.easy.graph;

import org.hine.easy.graph.FindPath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindPathTest {

    @Test
    void testFindPath() {
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        var n = 3;
        var source = 0;
        var destination = 2;

        var expected = true;
        var actual = new FindPath().findPath(n, edges, source, destination);

        assertEquals(expected, actual);
    }
}