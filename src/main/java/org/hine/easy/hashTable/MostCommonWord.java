package org.hine.easy.hashTable;

import java.util.*;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));

        var ans = "";
        var maxCount = 0;
        Map<String, Integer> wordCount = new HashMap<>();
        var wordBuffer = new StringBuilder();
        var chars = paragraph.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            var current = chars[i];

            if (Character.isLetter(current)) {
                wordBuffer.append(Character.toLowerCase(current));
                if (i != chars.length - 1) continue;
            }

            if (!wordBuffer.isEmpty()) {
                var word = wordBuffer.toString();
                if (!bannedWords.contains(word)) {
                    var count =  wordCount.getOrDefault(word, 0) + 1;
                    wordCount.put(word, count);
                    if (count > maxCount) {
                        ans = word;
                        maxCount = count;
                    }
                }
                wordBuffer = new StringBuilder();
            }
        }
        return ans;
    }
}
