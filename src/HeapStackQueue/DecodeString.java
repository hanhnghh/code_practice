package HeapStackQueue;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        String res = "";
        Stack<Integer> count = new Stack<>();
        count.push(0);
        if(s.equals(""))
            return "";
        res += findString(s, new int[]{0}, count);

        return res;
    }

    static String findString(String s, int[] index, Stack<Integer> count){
        String result = "";
        while(index[0] < s.length()){
            if(Character.isLetter(s.charAt(index[0]))) {
                result += s.charAt(index[0]);
                index[0]++;
            } else if(Character.isDigit(s.charAt(index[0]))){

                if(index[0] - 1 >= 0 && !Character.isDigit(s.charAt(index[0] - 1))) {
                    count.push(0);
                }

                if(!Character.isDigit(s.charAt(index[0] + 1))) {
                    count.push(count.pop() * 10 + Integer.parseInt(Character.toString(s.charAt(index[0]))));
                    index[0] += 1;
                    String temp = findString(s, index, count);
                    if (!count.isEmpty()) {
                        int n = count.pop();
                        for (int j = 0; j < n; j++)
                            result += temp;
                    }
                } else {
                    count.push(count.pop() * 10 + Integer.parseInt(Character.toString(s.charAt(index[0]))));
                    index[0] += 1;
                }

            } else if(s.charAt(index[0]) == '['){
                index[0] += 1;
                return findString(s, index, count);
            } else {
                index[0] += 1;
                return result;
            }

        }
        return result;
    }
}
