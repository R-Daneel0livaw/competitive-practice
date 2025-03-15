package org.hine.easy.array;

public class BuySellStock {

    public int buySellStock(int[] nums) {
       int minPrice = Integer.MAX_VALUE;
       int maxProfit = 0;

        for (int i = 0; i < nums.length; i++) {
            if(minPrice > nums[i]) {
                minPrice = nums[i];
            } else if (maxProfit < nums[i] - minPrice) {
                maxProfit = nums[i] - minPrice;
            }
        }
        return maxProfit;
    }
}