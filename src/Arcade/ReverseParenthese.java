package Arcade;

import java.util.HashMap;
import java.util.Map;

public class ReverseParenthese {
    public static String reverseParentheses(String s) {
        Map<Integer, String> map = new HashMap<>();
        int level = 0;
        String[] list = s.split("");
        int n = list.length;

        String[] result = new String[n];

        for(int i = 0, j = n - 1; i < n/2 && j > n/2; i++, j--){
            if(list[i].equals("(") && list[j].equals(")")){

            } else {
                result[i] = list[i];
                result[j] = list[j];
            }
        }
        reverseArray(s.split(""));
        return s;
    }

    private static void reverseArray(String[] a){
        int n = a.length;
        for(int i = 0; i < a.length / 2 - 1; i++){
            String temp = a[i];
            a[i] = a[n - 1 - i];
            a[n-1-i] = temp;
        }
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
