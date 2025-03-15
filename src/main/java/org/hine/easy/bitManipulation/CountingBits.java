package org.hine.easy.bitManipulation;

public class CountingBits {

    public int[] countingBits(int num) {
        var ans = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            ans[i] = ans[i & (i - 1)] + 1;
        }
        return ans;
    }
}
