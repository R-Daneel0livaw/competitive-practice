package org.hine.easy.array;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}