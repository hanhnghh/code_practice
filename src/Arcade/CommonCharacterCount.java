package Arcade;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharacterCount {
    public static int commonCharacterCount(String s1, String s2) {
        String[] list1 = s1.split("");
        String[] list2 = s2.split("");
        int count = 0;

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        buildMap(list1, map1);
        buildMap(list2, map2);

        for(String key : map1.keySet()){
            if(map2.containsKey(key))
                count += Math.min(map1.get(key), map2.get(key));
        }

        return count;
    }

    private static void buildMap(String[] list, HashMap<String, Integer> map){
        for(int i = 0; i < list.length; i++){
            if(map.containsKey(list[i])){
                map.put(list[i], map.get(list[i]) + 1);
            } else {
                map.put(list[i], 1);
            }
        }
    }
}
