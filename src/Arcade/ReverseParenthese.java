package Arcade;

public class ReverseParenthese {

    static String reverseString(String s){
        char[] try1 = s.toCharArray();
        String r = "";
        for (int i = try1.length-1; i>=0; i--)
            r += Character.toString(try1[i]);

        return r;
    }

    public static String reverseParentheses(String s) {
        int begin = 0;
        int end = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                begin = i;
            if(s.charAt(i) == ')'){
                end = i;
                String temp = s.substring(begin + 1, end);
                return reverseParentheses(s.substring(0, begin) + reverseString(temp) + s.substring(end + 1));
            }
        }
        return s;
    }
}
