package org.hine.easy.hashTable;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        var res = 0;

        for (var c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                res += 2;
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) res++;

        return res;
    }
}
