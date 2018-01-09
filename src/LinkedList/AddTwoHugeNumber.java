package LinkedList;

public class AddTwoHugeNumber {
    //Straight way: Doesn't work with very huge number
    /*LinkedList.ListNode<Integer> addTwoHugeNumbers(LinkedList.ListNode<Integer> a, LinkedList.ListNode<Integer> b) {
        long aNumber = convertListToNumber(a);
        long bNumber = convertListToNumber(b);

        long sum = aNumber + bNumber;
        System.out.println(aNumber);
        System.out.println(bNumber);
        System.out.println(sum);
        LinkedList.ListNode<Integer> sumList = convertNumberToList(sum);

        return sumList;
    }

    long convertListToNumber(LinkedList.ListNode<Integer> root){
        LinkedList.ListNode<Integer> temp = root;
        long aNumber = 0;
        if(temp != null){
            aNumber += temp.value;
            temp = temp.next;
        }

        while(temp != null){
            aNumber = aNumber * 10000 + temp.value;
            temp = temp.next;
        }

        return aNumber;
    }

    LinkedList.ListNode<Integer> convertNumberToList(long num){
        long a = num;
        long num1;
        int res;
        LinkedList.ListNode<Integer>next = null;

        while(true){
            num1 = a % 10000;
            res = (int)num1;
            LinkedList.ListNode<Integer> current = new LinkedList.ListNode<Integer>(res);
            current.next = next;
            next = current;
            a = a / 10000;
            if(a == 0){
                break;
            }
        }
        return next;
    }*/

    //Smart way: divide and conquer. Lay tung so tinh tu hang don vi cua a va b, roi tinh ra so tu hang don vi cua linked list tong, va xay dung
    // tung node trong linked list nay. Khong cong don thanh 1 so to roi moi convert sang linked list nhu o tren.
    ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> nextNode = null;
        int carry=0;
        a= reverse(a);
        b= reverse(b);
        while(a!=null || b!=null){
            if(a!=null){
                carry+= a.value;
                a=a.next;
            }
            if(b!=null){
                carry+=b.value;
                b= b.next;
            }
            ListNode<Integer> current = new ListNode<Integer>(carry%10000);
            current.next = nextNode;
            nextNode = current;
            carry = carry/10000;
        }

        if(carry > 0){
            ListNode<Integer> temp = new ListNode<Integer>(carry);
            temp.next = nextNode;
            return temp;
        }

        return nextNode;

    }

    ListNode<Integer> reverse(ListNode<Integer> head){
        ListNode<Integer> prev =null;
        while(head!=null){
            ListNode<Integer> temp = head.next;
            head.next= prev;
            prev= head;
            head= temp;
        }
        return prev;
    }

}
