package org.hine.easy.sorting;

public class SpecialArray {

    public int specialArray(int[] nums) {
        var n = nums.length;
        var freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            freq[Math.min(n, nums[i])]++;
        }

        var numGreaterOrEqual = 0;
        for (int i = n; i >= 1; i--) {
            numGreaterOrEqual += freq[i];
            if (i == numGreaterOrEqual) return i;
        }
        return -1;
    }
}
