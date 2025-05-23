package org.hine.easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public int firstUniqueCharacter(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(count.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}