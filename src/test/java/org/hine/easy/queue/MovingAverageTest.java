package org.hine.easy.queue;

import org.hine.easy.queue.MovingAverage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovingAverageTest {

    @Test
    void testMovingAverage() {
        var size = 3;
        var ma = new MovingAverage(size);

        var next1 = 5;
        var expected1 = 5.0;
        var actual1 = ma.next(next1);

        assertEquals(expected1, actual1);

        var next2 = 5;
        var expected2 = 5.0;
        var actual2 = ma.next(next2);

        assertEquals(expected2, actual2);

        var next3 = 5;
        var expected3 = 5.0;
        var actual3 = ma.next(next3);

        assertEquals(expected3, actual3);

        var next4 = 20;
        var expected4 = 10.0;
        var actual4 = ma.next(next4);

        assertEquals(expected4, actual4);
    }
}
