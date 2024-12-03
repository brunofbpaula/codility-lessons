package solutions.arrays;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // Implement your solution here

        if(K == 0 || A.length == 0){
            return A;
        }

        for(int step = 0; step < K; step++){

            int lastValue = A[A.length - 1];

            for(int index = A.length -1; index > 0; index--){

                A[index] = A[index - 1];

            }

            A[0] = lastValue;

        }

        return A;
    }
}
