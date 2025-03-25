package org.hine.easy.array;

public class MoveZeros {

    public int[] moveZeros(int[] nums) {
        var lastFoundNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastFoundNonZeroIndex++] = nums[i];
            }
        }
        for (int i = lastFoundNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
