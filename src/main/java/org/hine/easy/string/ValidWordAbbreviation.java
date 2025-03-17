package org.hine.easy.string;

public class ValidWordAbbreviation {

    public boolean validWordAbbreviation(String word, String abbr) {
        if (word == null || abbr == null) return false;

        var wLen = word.length(); var aLen = abbr.length();

        if (aLen > wLen) return false;

        if (wLen == 0) return true;

        var i = 0; var j = 0;
        while (i < wLen && j < aLen) {
            if (word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }

            if (abbr.charAt(j) == '0' || !Character.isDigit(abbr.charAt(j))) return false;

            var num = 0;
            while (j < aLen && Character.isDigit(abbr.charAt(j))) {
                num = 10 * num + (abbr.charAt(j) - '0');
                j++;
            }

            i += num;
        }
        return i == wLen && j == aLen;
    }
}
