package solutions.timeComplexity;

public class FrogJmp {

    public int solution(int X, int Y, int D) {

        // Number of jumps
        int jumps = 0;

        // Increment number of jumps
        // while X still hasn't surpassed or equalled Y
        while(X < Y){
            X += D;
            jumps +=1;
        }

        return jumps;

    }

    public int fastestSolution(int X, int Y, int D) {

        // Calculate the distance between Y and X
        int distance = Y - X;

        // Calculate the minimum number of jumps needed
        int jumps = (distance + D - 1) / D;

        return jumps;
    }

}
