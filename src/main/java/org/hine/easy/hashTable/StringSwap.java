package org.hine.easy.hashTable;

public class StringSwap {

    public boolean stringSwap(String s, String t) {
        var firstDiff = 0; var secondDiff =0;
        var numDiffs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                numDiffs++;
                if (numDiffs > 2) return false;
                else if (numDiffs == 1) firstDiff = i;
                else secondDiff = i;
            }
        }
        return s.charAt(firstDiff) == t.charAt(secondDiff) &&
                s.charAt(secondDiff) == t.charAt(firstDiff);

    }
}
