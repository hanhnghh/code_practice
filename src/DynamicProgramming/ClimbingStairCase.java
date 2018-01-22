package DynamicProgramming;

public class ClimbingStairCase {
    int climbingStairs(int n) {
        int[] ways = new int[n+1];
        ways[1] = 1;
        ways[0] = 1;
        for(int i = 2; i <= n; i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }

}
