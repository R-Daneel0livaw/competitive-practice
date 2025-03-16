package org.hine.easy.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        var expectedNumCount = nums.length + 1;

        Arrays.stream(nums).forEach(numSet::add);

        for (int i = 0; i < expectedNumCount; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}