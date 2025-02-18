package org.hine.easy;

public class FinalArrayState {

    public int[] finalArrayState(int[] nums, int k, int multiplier) {
        var n = nums.length;
        for (int i = 0; i < k; i++) {
            var minIndex = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                    break;
                }
            }
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}
