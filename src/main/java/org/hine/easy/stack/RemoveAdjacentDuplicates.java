package org.hine.easy.stack;

public class RemoveAdjacentDuplicates {
    public String removeAdjacentDuplicates(String s) {
        var sb = new StringBuilder();
        var sbLength = 0;

        for(char c : s.toCharArray()) {
            if(sbLength != 0 && c == sb.charAt(sbLength - 1)) {
                sb.deleteCharAt(sbLength-- - 1);
            } else {
                sb.append(c);
                sbLength++;
            }
        }
        return sb.toString();
    }
}