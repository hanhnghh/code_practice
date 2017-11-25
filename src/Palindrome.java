public class Palindrome {
    // Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
    boolean isListPalindrome(ListNode<Integer> head) {
        ListNode<Integer> slowFwd = head, fastFwd = head, midNode = null, prevSlow = null, secondHalf;

        boolean res = true;

        if(head == null){
            return true;
        }

        if(head != null && head.next != null){
            while(fastFwd != null && fastFwd.next != null){
                fastFwd = fastFwd.next.next;

                prevSlow = slowFwd;
                slowFwd = slowFwd.next;
            }

            //odd case
            if(fastFwd != null){
                midNode = slowFwd;
                slowFwd = slowFwd.next;
            }

            secondHalf = slowFwd;
            prevSlow.next = null;
            secondHalf = reverseSecondHalf(secondHalf);
            res = compare2Parts(head, secondHalf);
        }

        return res;
    }

    ListNode<Integer> reverseSecondHalf(ListNode<Integer> root){
        ListNode<Integer> previous = null;
        ListNode<Integer> current = root;
        ListNode<Integer> next;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        root = previous;

        return root;
    }

    boolean compare2Parts(ListNode<Integer> first, ListNode<Integer> second){
        ListNode<Integer> test1 = first, temp1 = first;
        ListNode<Integer> test2 = second, temp2 = second;

        while(temp1 != null && temp2 != null){
            //System.out.println(temp1.value +  " : " + temp2.value);
            if(temp1.value.equals(temp2.value)){
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                return false;
            }
        }

        if(temp1 == null && temp2 == null){
            System.out.println("true");
            return true;
        }

        return false;
    }
}
