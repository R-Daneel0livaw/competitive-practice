package org.hine.easy.bitManipulation;

public class ReverseBits {

    public int reverseBits(int n) {
        var ret = 0; var power = 31;
        while (n != 0) {
            ret += (n & 1) << power;
            n = n >>> 1;
            power -= 1;
        }
        return ret;
    }
}
