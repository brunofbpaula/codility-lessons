package solutions.iterations;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class BinaryGap {
    public int solution(int N) {

        // Convert int to binary string and initialize variables
        // to store sequence strikes
        String binaryString = Integer.toBinaryString(N);
        int longestSequence = 0;
        int longestSequenceAux = 0;

        // Looping through the binary string
        for(int index = 0; index < binaryString.length(); index ++){

            // If a zero qaracter is found, increment sequence and continue
            if(binaryString.charAt(index) == '0') {
                longestSequenceAux += 1;
                continue;
            };

            // If not, check if current sequence is the longest
            if(longestSequenceAux > longestSequence){

                // If so, set the main variable
                longestSequence = longestSequenceAux;
            };

            // Reset sequence
            longestSequenceAux = 0;
        }

        return longestSequence;

    }
}
