package org.hine.easy.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxUnitsOnTruckTest {

    @Test
    void testMaxUnitsOnTruck() {
        var boxTypes = new int[][] { {1, 3}, {2, 2}, {3, 1}};
        var truckSize = 4;
        var expected = 8;
        var actual = new MaxUnitsOnTruck().maxUnitsOnTruck(boxTypes, truckSize);

        assertEquals(expected, actual);
    }
}
