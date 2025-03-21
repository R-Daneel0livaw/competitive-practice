package org.hine.easy.queue;

public class MaximumProduct {

    public int maximumProduct(int[] nums) {
        int biggest = 0; int secondBiggest = 0;
        for (int num : nums) {
            if (num > biggest) {
                secondBiggest = biggest;
                biggest = num;
            } else {
                secondBiggest = Math.max(secondBiggest, num);
            }
        }
        return (biggest - 1) * (secondBiggest -1);
    }
}