package Sorting;

import java.util.*;

public class SortByString {
    public static String sortByString(String s, String t) {
        StringBuilder sb = new StringBuilder();
        char[] sList = s.toCharArray();
        char[] tList = t.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Integer, Character> map2 = new HashMap<>();
        for(int i = 0; i < tList.length; i++){
            map1.put(tList[i], i);
            map2.put(i, tList[i]);
        }
        int[] orderList = new int[s.length()];
        for(int i = 0; i < sList.length; i++){
            orderList[i] = map1.get(sList[i]);
        }
        Arrays.sort(orderList);
        for(int i = 0; i < orderList.length; i++){
            sb.append(map2.get(orderList[i]));
        }
        return sb.toString();
    }
}
