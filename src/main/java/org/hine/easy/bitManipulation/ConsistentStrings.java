package org.hine.easy.bitManipulation;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsistentStrings {

    public int consistentStrings(String allowed, String[] words) {
        var allowedChars = IntStream.range(0, allowed.length()).mapToObj(allowed::charAt)
                .collect(Collectors.toSet());

        var consistent = 0;

        for (String word : words) {
            var isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                var currentChart = word.charAt(i);
                if (!allowedChars.contains(currentChart)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) consistent++;
        }
        return consistent;
    }
}
