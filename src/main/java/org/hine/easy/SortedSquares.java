package org.hine.easy;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        var n = nums.length;
        var result = new int[n];
        var left = 0; var right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}