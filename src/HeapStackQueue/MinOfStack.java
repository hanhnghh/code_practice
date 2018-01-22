package HeapStackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinOfStack {
    //operations = ["push 10", "min", "push 5", "min", "push 8", "min", "pop", "min", "pop", "min"]
    public static int[] minimumOnStack(String[] operations) {
        Stack<Integer> minStack = new Stack<>();

        List<Integer> resultList = new LinkedList<>();

        for (String operation : operations) {
            String[] split = operation.split(" ");

            switch (split[0]) {
                case "push" :
                    Integer value = Integer.valueOf(split[1]);

                    if (minStack.isEmpty() || minStack.peek() > value) {
                        minStack.push(value);
                    } else {
                        minStack.push(minStack.peek());
                    }

                    break;

                case "pop" :
                    minStack.pop();
                    break;

                case "min" :
                    resultList.add(minStack.peek());
                    break;
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
    * int[] minimumOnStack(String[] operations) {

    Stack<Integer> elems = new Stack<Integer>();
    Stack<Integer> mins = new Stack<Integer>();

    int minCmds = 0;
    for (String operation: operations) {
        if (operation.equals("min")) {
            minCmds++;
        }
    }

    int[] result = new int[minCmds];
    int i = 0;

    for (String operation: operations) {
        String[] items = operation.split(" ");

        if (items[0].equals("push")) {
            int elem = Integer.parseInt(items[1]);
            elems.push(elem);
            if (mins.isEmpty() || mins.peek() >= elem) {
                mins.push(elem);
            }
        } else if (items[0].equals("pop")) {
            int elem = elems.pop();
            if (mins.peek() == elem) {
                mins.pop();
            }
        } else if (items[0].equals("min")) {
            result[i++] = mins.peek();
        }
    }
    return result;
}
    * */
}
