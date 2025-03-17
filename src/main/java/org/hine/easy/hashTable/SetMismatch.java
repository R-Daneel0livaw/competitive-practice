package org.hine.easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch {

    public int[] setMismatch(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dup = -1;
        int missing = 1;
        for (int num : nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(i)) {
                if(map.get(i) == 2) {
                    dup = i;
                }
            } else {
                missing = i;
            }
        }
        return new int[]{dup, missing};
    }
}