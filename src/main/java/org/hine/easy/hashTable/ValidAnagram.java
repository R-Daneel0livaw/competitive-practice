package org.hine.easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean validAnagram(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        if(s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            smap.put(t.charAt(i), smap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (char c : smap.keySet()) {
            if (smap.get(c) != 0) return false;
        }
        return true;
    }
}