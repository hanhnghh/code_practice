package LinkedList;

public class RearrangeLastN {
    ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
        ListNode current = l, prev = null, rear = null;
        int total = 0;
        if(l == null || n == 0) return l;

        while(current != null){
            prev = current;
            current = current.next;
            total++;
        }

        if(n == total) return l;

        if(current == null){
            rear = prev;
            current = l;
            int i = 0;
            while(i < (total - n)){
                prev = current;
                current = current.next;
                i++;
            }

            prev.next = null;
            rear.next = l;
        }

        return current;
    }
}
