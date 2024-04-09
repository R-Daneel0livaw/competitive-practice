package org.hine.easy;

public class StudentsLunch {

    public int studentsLunch(int[] students, int[] sandwiches) {
        int zeros = 0; int ones = 0;
        for (int st : students) {
            if (st == 0) zeros++;
            else ones++;
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (zeros == 0) {
                    return ones;
                }
                zeros--;
            } else {
                if(ones == 0) {
                    return zeros;
                }
                ones--;
            }
        }
        return 0;
    }
}