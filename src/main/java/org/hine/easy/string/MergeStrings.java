package org.hine.easy.string;

public class MergeStrings {

    public String mergeStrings(String word1, String word2) {
        var m = word1.length(); var n = word2.length();
        var sb = new StringBuilder();

        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) sb.append(word1.charAt(i));
            if (i < n) sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}
