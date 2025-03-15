package org.hine.easy.bitManipulation;

public class HammingWeight {

    public int hammingWeight(int n) {
        var sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
