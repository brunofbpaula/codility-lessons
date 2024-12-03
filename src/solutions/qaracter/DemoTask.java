package solutions.qaracter;
// you can also use imports, for example:
// import java.util.*;
import java.util.HashSet;
import java.util.Set;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class DemoTask {
    public int solution(int[] A) {
        // Implement your solution here
        int smallest = 1;
        Set<Integer> positiveNumbers = new HashSet<>();

        for(int number : A){
            if(number > 0){
                positiveNumbers.add(number);
            }
        }

        while(positiveNumbers.contains(smallest)){
            smallest++;
        }

        return smallest;

    }
}
