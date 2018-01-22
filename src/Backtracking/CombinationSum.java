package Backtracking;

import java.util.*;

public class CombinationSum {
    public static String combinationSum(int[] a, int sum){
        Arrays.sort(a);
        if(sum < a[0])
            return "Empty";
        Set<Integer> tempSet = new LinkedHashSet<>();
        for(int i = 0; i < a.length; i++){
            tempSet.add(a[i]);
        }
        int[] a1 = new int[tempSet.size()];
        int j = 0;
        for(int i : tempSet){
            a1[j] = i;
            j++;
        }
        StringBuilder sb = new StringBuilder();
        Set<List<Integer>> set = new LinkedHashSet<>();
        helper(a1, sum, set, new ArrayList<>());
        if(set.size() == 0)
            return "Empty";
        for(List<Integer> list : set){
            sb.append("(");
            for(int i = 0; i < list.size(); i++) {
                if (i != list.size() - 1)
                    sb.append(list.get(i)).append(" ");
                else
                    sb.append(list.get(i));
            }
            sb.append(")");
        }

        return sb.toString();
    }

    static void helper(int[] a, int sum, Set<List<Integer>> set, List<Integer> list){
        if(sum == 0){
            List<Integer> temp = new ArrayList<>(list);
            Collections.sort(temp);
            set.add(temp);
            return;
        }

        for(int i = 0; i < a.length; i++){
            if(sum - a[i] >= 0){
                list.add(a[i]);
                helper(a, sum - a[i], set, list);
                list.remove(list.size()-1);
            } else {
                break;
            }
        }
    }
}
