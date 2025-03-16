package org.hine.easy.math;

public class NumberWaterBottles {

    public int numWaterBottles(int numBottles, int numExchange) {
        var consumedBottles = 0;
        while (numBottles >= numExchange) {
            var k = numBottles / numExchange;
            consumedBottles += numExchange * k;
            numBottles -= numExchange * k;
            numBottles += k;
        }
        return consumedBottles + numBottles;
    }
}
