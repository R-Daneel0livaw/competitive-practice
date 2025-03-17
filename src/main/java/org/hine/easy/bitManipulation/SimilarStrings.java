package org.hine.easy.bitManipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimilarStrings {

    public int similarStrings(String[] words) {
        Map<Set<Character>, Integer> charSetMap = new HashMap<>();

        var pairCount = 0;

        for (String word : words) {
            Set<Character> charSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                charSet.add(c);
            }
            pairCount += charSetMap.getOrDefault(charSet, 0);
            charSetMap.put(charSet, charSetMap.getOrDefault(charSet, 0) + 1);
        }
        return pairCount;
    }
}