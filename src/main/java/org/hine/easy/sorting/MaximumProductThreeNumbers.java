package org.hine.easy.sorting;

public class MaximumProductThreeNumbers {

    public int maximumProductThreeNumbers(int[] nums) {
        var min1 = Integer.MAX_VALUE; var min2 = Integer.MAX_VALUE;
        var max1 = Integer.MIN_VALUE; var max2 = Integer.MIN_VALUE; var max3 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num <= min1) {
                min2 = min1;
                min1 = num;
            } else if (num <= min2) {
                min2 = num;
            }

            if (num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num >= max2) {
                max3 = max2;
                max2 = num;
            } else if (num >= max3) {
                max3 = num;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}