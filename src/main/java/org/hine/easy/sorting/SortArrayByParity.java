package org.hine.easy.sorting;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        var i = 0; var j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                var temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] % 2 == 0) i++;
            if (nums[j] % 2 == 1) j--;
        }
        return nums;
    }
}
