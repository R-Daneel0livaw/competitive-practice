package org.hine.easy.array;

public class SortedAndRotated {

    public boolean isSortedAndRotated(int[] nums) {
        var n = nums.length;
        if (n <= 1) return true;

        var inversionCount = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                inversionCount++;
                if (inversionCount > 1) return false;
            }
        }

        if (nums[0] < nums[n - 1]) {
            inversionCount++;
        }

        return inversionCount <= 1;
    }
}
