package org.hine.easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteGreatestValueTest {

    @Test
    void testDeleteGreatestValue() {
        var grid = new int[][] {{1, 2, 4}, {3,3, 1}};
        var expected = 8;
        var actual = new DeleteGreatestValue().deleteGreatestValue(grid);

        assertEquals(expected, actual);
    }
}
