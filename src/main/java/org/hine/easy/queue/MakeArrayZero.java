package org.hine.easy.queue;

import java.util.HashSet;
import java.util.Set;

public class MakeArrayZero {

    public int makeArrayZero(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            a.add(num);
        }
        return a.size();
    }
}