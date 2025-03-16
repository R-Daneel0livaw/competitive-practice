package org.hine.easy;

import org.hine.easy.math.NumberWaterBottles;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberWaterBottlesTest {

    @Test
    void testNumberWaterBottles() {
        var numBottles = 9;
        var numExchange = 3;
        var expected = 13;
        var actual = new NumberWaterBottles().numWaterBottles(numBottles, numExchange);

        assertEquals(expected, actual);
    }
}
