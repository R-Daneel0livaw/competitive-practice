package org.hine.easy;

import org.hine.easy.queue.RecentCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecentCounterTest {

    @Test
    void testRecentCounter() {
        var counter = new RecentCounter();

        var expected1 = 1;
        var actual1 = counter.ping(1);
        assertEquals(expected1, actual1);

        var expected2 = 2;
        var actual2 = counter.ping(2500);
        assertEquals(expected2, actual2);

        var expected3 = 3;
        var actual3 = counter.ping(3001);
        assertEquals(expected3, actual3);

        var expected4 = 3;
        var actual4 = counter.ping(3002);
        assertEquals(expected4, actual4);
    }
}