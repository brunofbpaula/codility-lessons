package solutions.timeComplexity;

import java.util.HashMap;

public class PermMissingValues {
    public int Solution(int[] A){
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Insert numbers into the Map
        for (int num : A) {
            map.put(num, true);
        }

        // Iterate over the range [1, N+1]
        int N = A.length;
        for (int i = 1; i <= N + 1; i++) {

            // If there's not a key, we've found our missing value
            if (!map.containsKey(i)) {
                return i;
            }
        }

        return -1;
    }
}
