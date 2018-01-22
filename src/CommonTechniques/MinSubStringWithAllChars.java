package CommonTechniques;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinSubStringWithAllChars {
    String minSubstringWithAllChars(String s, String t) {
        char[] sList = s.toCharArray();
        char[] tList = s.toCharArray();
        if(s == "" || t== "")
            return "";

        Map<Character, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < tList.length; i++){
            map.put(tList[i], new ArrayList<Integer>());
        }

        for(int i = 0; i < sList.length; i++){
            if(map.containsKey(sList[i])){
                map.get(sList[i]).add(i);
            }
        }

        return "";

    }

}
