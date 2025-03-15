package org.hine.easy.sorting;

public class MaxProductPairs {

    public int maxProductPairs(int[] nums) {
        var biggest = 0; var secondBiggest = 0;
        var smallest = Integer.MAX_VALUE; var secondSmallest = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > biggest) {
                secondBiggest = biggest;
                biggest = num;
            } else {
                secondBiggest = Math.max(secondBiggest, num);
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else {
                secondSmallest = Math.min(secondSmallest, num);
            }
        }
        return (biggest * secondBiggest) - (smallest * secondSmallest);
    }
}