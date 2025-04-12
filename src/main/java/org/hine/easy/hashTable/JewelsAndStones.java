package org.hine.easy.hashTable;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int jewelsAndStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (var c : jewels.toCharArray()) {
            set.add(c);
        }

        var ans = 0;
        for (var c : stones.toCharArray()) {
            if (set.contains(c)) ans++;
        }
        return ans;
    }
}
