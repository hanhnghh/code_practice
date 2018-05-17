package Arcade;

import java.util.*;

public class AllLongestString {

    /*For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
    allLongestStrings(inputArray) = ["aba", "vcd", "aba"].*/

    public static String[] allLongestStrings(String[] inputArray) {
        Map<Integer, List<String>> map = new TreeMap<>();
        int max = 0;
        for(int i = 0; i < inputArray.length; i++){
            if(max < inputArray[i].length())
                max = inputArray[i].length();

            if(map.containsKey(inputArray[i].length())){
                List<String> list = map.get(inputArray[i].length());
                list.add(inputArray[i]);
                map.put(inputArray[i].length(), list);
            } else {
                List<String> list= new ArrayList<>();
                list.add(inputArray[i]);
                map.put(inputArray[i].length(), list);
            }
        }
        return map.get(max).toArray(new String[map.get(max).size()]);
    }
}
