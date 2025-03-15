package org.hine.easy.sorting;

import java.util.Arrays;

public class AssignCookies {

    public int assignCookies(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        var contentChildren = 0; var cookIndex = 0;

        while (cookIndex < s.length && contentChildren < g.length) {
            if (s[cookIndex] >= g[contentChildren]) {
                contentChildren++;
            }
            cookIndex++;
        }
        return contentChildren;
    }
}