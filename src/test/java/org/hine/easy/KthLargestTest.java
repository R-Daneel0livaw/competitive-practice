package org.hine.easy;

import org.hine.easy.queue.KthLargest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KthLargestTest {

    @Test
    void testKthLargest() {
        var k = 3;
        var nums = new int[] {4, 5, 8, 2};
        var kthLargest = new KthLargest(k, nums);

        var expected1 = 4;
        var actual1 = kthLargest.add(3);
        assertEquals(expected1, actual1);

        var expected2 = 5;
        var actual2 = kthLargest.add(5);
        assertEquals(expected2, actual2);

        var expected3 = 5;
        var actual3 = kthLargest.add(10);
        assertEquals(expected3, actual3);

        var expected4 = 8;
        var actual4 = kthLargest.add(9);
        assertEquals(expected4, actual4);

        var expected5 = 8;
        var actual5 = kthLargest.add(4);
        assertEquals(expected5, actual5);
    }
}