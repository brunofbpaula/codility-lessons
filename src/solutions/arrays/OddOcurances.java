package solutions.arrays;

import java.util.HashMap;

class OddOcurances {
    public int solution(int[] A) {

        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int number:A){
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        for(int number : countMap.keySet()){
            if(countMap.get(number) % 2 != 0){
                return number;
            }
        }

        return 0;
    }
}
