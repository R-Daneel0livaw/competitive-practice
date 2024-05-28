package org.hine.easy;

import java.util.Map;
import java.util.stream.Collectors;

public class FindWords {

    public int findWords(String[] words, String chars) {
        Map<Character, Integer> counts = chars.chars().mapToObj(c -> (char) c).collect(
                Collectors.groupingBy(c -> c, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
        var ans = 0;
        for (String word : words) {
            Map<Character, Integer> wordCount = word.chars().mapToObj(c -> (char) c).collect(
                    Collectors.groupingBy(c -> c, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
            var good = true;
            for (Character c : wordCount.keySet()) {
                if (counts.getOrDefault(c, 0) < wordCount.get(c)) {
                    good = false;
                    break;
                }
            }

            if (good) ans += word.length();
        }
        return ans;
    }
}
