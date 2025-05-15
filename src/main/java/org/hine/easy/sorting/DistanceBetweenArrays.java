package org.hine.easy.sorting;

import java.util.Arrays;

public class DistanceBetweenArrays {

    public int findDistance(int[] nums1, int[] nums2, int d) {
        Arrays.sort(nums2);
        var distance = 0;
        for (var num : nums1) {
            if (notInRange(nums2, num - d, num + d)) distance++;
        }
        return distance;
    }

    private boolean notInRange(int[] nums, int from, int to) {
        var left = 0; var right = nums.length - 1;
        while (left <= right) {
            var middle = left + (right - left) / 2;
            if (nums[middle] >= from && nums[middle] <= to) return false;
            else if (nums[middle] > from) right = middle - 1;
            else left = middle + 1;
        }
        return true;
    }
}
