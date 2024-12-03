package solutions.sorting;

// you can also use imports, for example:
// import java.util.*;
import java.util.HashSet;
import java.util.Set;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Distinct {
    public int solution(int[] A) {
        // Implement your solution here
        // Create set to store unique values
        Set<Integer> distinctNumbers = new HashSet<>();

        // Feed set
        for(int number: A){
            distinctNumbers.add(number);
        }

        // Return set size, the actual number of unique values
        return distinctNumbers.size();
    }
}

