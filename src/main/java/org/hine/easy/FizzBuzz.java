package org.hine.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            var divisibleBy3 = (i % 3 == 0);
            var divisibleBy5 = (i % 5 == 0);

            var str = "";

            if (divisibleBy3) str += "Fizz";
            if (divisibleBy5) str += "Buzz";
            if (str.isEmpty()) str = Integer.toString(i);

            ans.add(str);
        }
        return ans;
    }
}
