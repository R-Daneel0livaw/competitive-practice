package org.hine.easy.hashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VowelSubstrings {

    public int countVowelSubstrings(String word) {
        var total = 0;
        var n = word.length();
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < n; i++) {
            if (!set.contains(word.charAt(i))) continue;
            Map<Character, Integer> freq = new HashMap<>();
            for (int j = i; j < n; j++) {
                var ch = word.charAt(j);
                if (!set.contains(ch)) break;
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                if (freq.size() == 5) total++;
            }
        }
        return total;
    }
}
