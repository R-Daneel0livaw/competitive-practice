package org.hine.easy.sorting;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveNegative {

    public int largestPositiveNegative(int[] nums) {
        var ans = -1;
        Set<Integer> set = new HashSet<>();
        for (var num : nums) {
            var abs = Math.abs(num);
            if (abs > ans && set.contains(-num)) {
                ans = abs;
            }
            set.add(num);
        }
        return ans;
    }
}
