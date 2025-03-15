package org.hine.easy.sorting;

import java.util.Arrays;

public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        var sumAlice = Arrays.stream(A).sum();
        var sumBob = Arrays.stream(B).sum();

        if (sumAlice - sumBob == 0) return new int[]{0, 0};

        Arrays.sort(B);

        for (int j : A) {
            var index = binarySearch(B, j, sumAlice, sumBob);
            if (index != -1) return new int[]{j, B[index]};
        }
        return new int[]{0, 0};
    }

    private int binarySearch(int[] bob, int alice, int sumA, int sumB) {
        var left = 0; var right = bob.length - 1;
        while (left <= right) {
            var pivot = (left + right) / 2;
            if (sumA - alice + bob[pivot] == sumB - bob[pivot] + alice) {
                return pivot;
            } else if (sumA - alice + bob[pivot] > sumB - bob[pivot] + alice) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }
}