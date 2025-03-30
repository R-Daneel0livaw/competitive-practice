package org.hine.easy.array;

import java.util.HashSet;
import java.util.Set;

public class DoubleExists {

    public boolean isDoubleExists(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (var num : nums) {
            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) return true;
            set.add(num);
        }
        return false;
    }
}
