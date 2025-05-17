package org.hine.easy.sorting;

import java.util.Arrays;

public class MinimumDifference {

    public int minimumDifference(int[] nums, int k) {
        var n = nums.length;
        Arrays.sort(nums);

        var min = Integer.MAX_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            min = Math.min(min, nums[i + k - 1] - nums[i]);
        }
        return min;
    }
}
