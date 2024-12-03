package solutions.countingElements;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.HashSet;
import java.util.Set;

class FrogRiverOne {
    public int solution(int X, int[] A) {
        // Implement your solution here

        Set<Integer> leavesPositions = new HashSet<>();

        // We do a for loop to count seconds
        // Stopping only when  max time is exceeded
        for(int seconds = 0; seconds < A.length; seconds++){

            // Getting position of current leaf
            int leafPosition = A[seconds];

            // Storing only values between 1 and X
            if(leafPosition <= X){
                leavesPositions.add(leafPosition);
            }

            // If all positions to X have been covered,
            // return the amount of seconds it took
            if(leavesPositions.size() == X) {
                return seconds;
            }
        }

        // Timeout
        return -1;
    }
}

