package Arcade;

import java.util.HashMap;
import java.util.Map;

public class ReverseParenthese {
    public static String reverseParentheses(String s) {
        Map<Integer, String> map = new HashMap<>();
        int level = 0;
        String[] list = s.split("");
        int n = list.length;

        String[] resultArray = new String[n];
        String result = "";
        for(int i = 0, j = n - 1; i < n && j >= 0; i++, j--){
            if(list[i].equals("(") && list[j].equals(")")){
                level+= 1;
                String temp = "";
                for(int k = i; k <= j; k++){
                    temp += list[k];
                }

                if(level % 2 == 0){
                    result += reverseParentheses(temp);
                } else {
                    String tempReverse = reverseArray(temp.split(""));
                    result += reverseParentheses(tempReverse);
                }
            } else {
                resultArray[i] = list[i];
                resultArray[j] = list[j];
            }
        }
        reverseArray(s.split(""));
        return result;
    }

    private static String reverseArray(String[] a){
        String s = "";
        int n = a.length;
        for(int i = 0; i < a.length / 2 - 1; i++){
            String temp = a[i];
            a[i] = a[n - 1 - i];
            a[n-1-i] = temp;
        }
        for(int i = 0; i < a.length; i++) {
            s += a[i];
        }

        return s;
    }
}
