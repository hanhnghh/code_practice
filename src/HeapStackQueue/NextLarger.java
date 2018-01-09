package HeapStackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextLarger {

    /*public static int[] nextLarger(int[] a){
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < a.length - 1; i++){
            arr.add(findLarger(a, i, i+ 1));
        }
        arr.add(-1);
        return arr.stream().mapToInt(i -> i).toArray();
    }

    static int findLarger(int[] a, int start, int index){
        if(index == a.length)
            return -1;
        if(a[index] > a[start])
            return a[index];
        return findLarger(a, start, index + 1);

    }*/

    //int[] a = {6, 7, 3, 8}
    //output {7, 8, 8, -1}
    public static int[] nextLarger(int[] a) {
        int[] result = new int[a.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[i] >= stack.peek()) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(a[i]);
        }

        return result;
    }
}
