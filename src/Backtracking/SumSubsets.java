package Backtracking;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SumSubsets {
    int[][] sumSubsets(int[] arr, int num) {
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> single = new ArrayList<>();

        if(arr.length == 0){
            return new int[1][0];
        }

        for(int i = 0; i < arr.length; i++){
            single.add(arr[i]);
            helper(i, arr, arr[i], num, all, single);
            single.remove(single.size() - 1);
        }
        int i = 0;
        Set<List<Integer>> s = new LinkedHashSet<>(all);
        if(s.size() == 0)
            return new int[1][0];

        int[][] a = new int[s.size()][];
        for(List<Integer> l : s){
            a[i++] = l.stream().mapToInt(j->j).toArray();
        }

        return a;
    }

    void helper(int index, int[] arr, int current, int num, List<List<Integer>> all, List<Integer> single){
        if(current == num){
            all.add(new ArrayList<>(single));
            return;
        }

        for(int i = index + 1; i < arr.length; i++){
            if(current + arr[i] <= num){
                single.add(arr[i]);
                helper(i, arr, current + arr[i], num, all, single);
                single.remove(single.size() - 1);
            }
        }
    }

}
