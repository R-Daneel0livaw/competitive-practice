package org.hine.easy.sorting;

public class SmallerThanCurrent {

    public int[] smallerThanCurrent(int[] nums) {
        var count = new int[101];
        var n = nums.length;

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        var res = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = count[nums[i] - 1];
            }
        }
        return res;
    }
}
