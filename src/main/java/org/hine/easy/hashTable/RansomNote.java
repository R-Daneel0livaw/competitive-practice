package org.hine.easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean ransomNote(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (var c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (var c : ransomNote.toCharArray()) {
            var count = map.getOrDefault(c, 0);
            if (count == 0) return false;
            map.put(c, count - 1);
        }
        return true;
    }
}
