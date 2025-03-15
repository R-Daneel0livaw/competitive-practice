package org.hine.easy.sorting;

public class BuyTwoChocolates {

    public int buyTwoChocolates(int[] prices, int money) {
        var minimum = Math.max(prices[0], prices[1]); var secondMinimum = Math.min(prices[0], prices[1]);
        for (int i = 2; i < prices.length; i++) {
            if (prices[i] < minimum) {
                secondMinimum = minimum;
                minimum = prices[i];
            } else {
                secondMinimum = Math.min(secondMinimum, prices[i]);
            }
        }

        var minCost = minimum + secondMinimum;

        return minCost <= money ? money - minCost : money;
    }
}