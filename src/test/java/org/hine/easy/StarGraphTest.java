package org.hine.easy;

import org.hine.easy.graph.StarGraph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StarGraphTest {

    @Test
    void testStartGraph() {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};

        var expected = 2;
        var actual = new StarGraph().starGraph(edges);

        assertEquals(expected, actual);
    }
}