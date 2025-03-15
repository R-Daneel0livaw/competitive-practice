package org.hine.easy.hashTable;

public class MajorityElement {

    public Integer majorityElement(int[] arr) {
        int count = 0;
        Integer candidate = null;

        for (int num : arr) {
           if (count == 0) {
               candidate = num;
           }
           count = num == candidate ? count  + 1 : count - 1;
        }
        return candidate;
    }
}