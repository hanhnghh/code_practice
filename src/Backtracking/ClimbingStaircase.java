package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStaircase {
    int[][] climbingStaircase(int n, int k) {
        List<List<Integer>> paths = new ArrayList<>();
        helper(0, n, k, paths, new ArrayList<Integer>());
        int[][] arr = new int[paths.size()][];
        int i = 0;
        for(List<Integer> l : paths){
            arr[i++] = l.stream().mapToInt(j->j).toArray();
        }
        return arr;
    }

    void helper(int current, int n, int k, List<List<Integer>> paths, List<Integer> single){
        if(current == n){
            paths.add(new ArrayList<>(single));
            return;
        }
        for(int i = 1; i <= k; i++){
            if(current + i <= n){
                single.add(i);
                helper(current + i, n, k, paths, single);
                single.remove(single.size() -1);
            }
        }

    }
}
