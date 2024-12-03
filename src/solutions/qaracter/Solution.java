package solutions.qaracter;

import java.util.*;

public class Solution {
    public boolean solution(int A) {
        return A % 2 == 0;
    }

    public String solution2(String S, int K) {
        // Implement your solution here

        List<String> weekDays = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

        // Get index of first day
        int firstDay = weekDays.indexOf(S);

        // Calculate target day
        int targetDay = firstDay + K;

        //
        int weekDay = targetDay / 7;

        return weekDays.get(weekDay);
    }
}
