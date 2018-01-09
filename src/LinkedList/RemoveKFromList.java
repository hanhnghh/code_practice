package LinkedList;

public class RemoveKFromList {

    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> temp = l, prev = null;

        while(temp != null && temp.value == k){
            l = temp.next;
            temp = l;
        }

        while(temp != null){
            while(temp!= null && temp.value != k){
                prev = temp;
                temp = temp.next;
            }
            if(temp == null)
                return l;
            prev.next = temp.next;
            temp = prev.next;
        }

        return l;
    }
}

class ListNode<T> {
    T value;
    ListNode<T> next;

    ListNode(T x) {
        value = x;
        next = null;
    }
}
