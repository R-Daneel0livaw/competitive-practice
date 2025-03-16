package org.hine.easy.hashTable;

import java.util.Map;

public class RomanToInteger {

    public int romanToInteger(String str) {
        Map<Character, Integer> map = Map.of('I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            char next = i + 1 < str.length() ? str.charAt(i + 1) : current;
            if (map.get(current) < map.get(next)) {
                result -= map.get(current);
            } else {
                result += map.get(current);
            }
        }
        return result;
    }
}