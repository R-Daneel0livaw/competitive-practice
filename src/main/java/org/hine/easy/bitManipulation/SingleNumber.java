package org.hine.easy.bitManipulation;

public class SingleNumber {

    public int singeNumber(int[] arr) {
        var a = 0;
        for (var i : arr) {
            a ^= i;
        }
        return a;
    }
}
