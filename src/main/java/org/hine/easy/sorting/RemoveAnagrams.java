package org.hine.easy.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {

    public List<String> removeAnagrams(String[] words) {
        var prev = "";
        List<String> res = new ArrayList<>();
        for (String word : words) {
            var ch = word.toCharArray();
            Arrays.sort(ch);
            var curr = String.valueOf(ch);
            if (!curr.equals(prev)) {
                res.add(word);
                prev = curr;
            }
        }
        return res;
    }
}
