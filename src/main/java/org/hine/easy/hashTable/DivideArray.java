package org.hine.easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class DivideArray {

    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (var num : map.values()) {
            if (num % 2 != 0) return false;
        }
        return true;
    }
}
