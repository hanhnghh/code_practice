package Arcade;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {

    public static boolean palindromeRearranging(String inputString) {
        String[] list = inputString.split("");
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list.length; i++){
            if(map.containsKey(list[i])){
                map.put(list[i], map.get(list[i]) + 1);
            } else {
                map.put(list[i], 1);
            }
        }
        int count = 0;
        for(String key : map.keySet()){
            if(map.get(key) % 2 != 0)
                count++;
            if(count > 1)
                return false;
        }
        return true;
    }
}
