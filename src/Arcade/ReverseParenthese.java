package Arcade;

import java.util.HashMap;
import java.util.Map;

public class ReverseParenthese {



    public static String reverseParentheses(String s) {
        String[] list = s.split("");
        int n = list.length;

        StringBuilder result = new StringBuilder();
        int i = 0, j = n - 1;
        while(i < n || j >= 0){
            if(list[i].equals("(") || list[j].equals(")")){
                if(i < n && !list[i].equals("(")) {
                    result.append(list[i]);
                    i++;
                } else if(j <= 0 && !list[j].equals(")")) {
                    j--;
                } else {
                    StringBuilder temp = new StringBuilder();
                    for (int k = i + 1; k < j; k++) {
                        temp.append(list[k]);
                    }
                    String tempReversed = reverseArray(temp.toString().split(""));
                    result.append(reverseParentheses(tempReversed));

                    int pos = i;
                    i = j;
                    j = pos;
                }
            } else {
                if(!list[i].equals(")"))
                    result.append(list[i]);
                i++;
                j--;
            }
        }

        return result.toString();
    }

    private static String reverseArray(String[] a){
        StringBuilder s = new StringBuilder();
        int n = a.length;

        for(int i = n - 1; i >= 0; i--) {
            if(!a[i].equals("(") && !a[i].equals(")")) {
                s.append(a[i]);
            } else if(a[i].equals(")")){
                s.append("(");
            } else if(a[i].equals("(")){
                s.append(")");
            }
        }

        return s.toString();
    }
}
