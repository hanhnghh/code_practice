package Arcade;

import java.util.*;

public class StringPermutations {

    public static String[] stringPermutations(String s) {
        String[] array = s.split("");
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
        Set<String> permutations = new LinkedHashSet<>();
        boolean[] visited = new boolean[list.size()];

        helper(list, 0, visited, permutations, new StringBuilder());

        String[] result = permutations.toArray(new String[0]);
        return result;
    }

    private static void helper(List<String> list, int count, boolean[] visited, Set<String> permutations, StringBuilder sb){
        if(count == list.size()){
            permutations.add(sb.toString());
            return;
        }

        for(int i = 0; i < list.size(); i++){
            if(!visited[i]) {
                sb.append(list.get(i));
                visited[i] = true;
                helper(list, count + 1, visited, permutations, sb);
                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }
    }

}
