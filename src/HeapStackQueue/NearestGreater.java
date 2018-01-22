package HeapStackQueue;

import java.util.Stack;

public class NearestGreater {
    public static int[] nearestGreater(int[] a) {
        int[] b = new int[a.length];
        Stack<NodeStack> stackIncrease = new Stack<>();
        Stack<NodeStack> stackDecrease = new Stack<>();
        for(int i = 0; i < a.length; i++){
            while(!stackIncrease.isEmpty() && a[i] >= stackIncrease.peek().value)
                stackIncrease.pop();
            b[i] = stackIncrease.isEmpty() ? -1 : stackIncrease.peek().index;
            stackIncrease.push(new NodeStack(a[i], i));
        }

        for(int i = a.length - 1; i >= 0; i--){
            while(!stackDecrease.isEmpty() && a[i] >= stackDecrease.peek().value)
                stackDecrease.pop();
            if(!stackDecrease.isEmpty()) {
                if (b[i] == -1 || (Math.abs(b[i] - i) > Math.abs(stackDecrease.peek().index - i))) {
                    b[i] = stackDecrease.peek().index;
                }
            }
            stackDecrease.push(new NodeStack(a[i], i));
        }
        return b;
    }

    static class NodeStack{
        int value;
        int index;

        public NodeStack(int v, int i){
            value = v;
            index = i;
        }
    }
}
