package org.hine.easy.array;

public class KthMissingNumber {

    public int kthMissingNumber(int[] nums, int k) {
        var left = 0; var right = nums.length - 1;
        while (left <= right) {
            var pivot = left + (right - left) / 2;
            if (nums[pivot] - pivot - 1 < k) left = pivot + 1;
            else right = pivot - 1;
        }
        return left + k;
    }
}
