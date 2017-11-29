public class MergeTwoLinkedList {

    ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> node1 = l1, node2 = l2;
        ListNode<Integer> compareNode, head, current, root;
        if(node1 == null)
            return node2;
        else if(node2 == null)
            return node1;
        else {
            compareNode = node1.value >= node2.value ? node1 : node2;
            head = node1.value >= node2.value ? node2 : node1;
            current = new ListNode<Integer>(0);
            root = current;
            ListNode<Integer> temp;

            while(head != null){
                if(head.value >= compareNode.value){
                    temp = head;
                    head = compareNode;
                    compareNode = temp;
                }
                current.next = head;
                current = current.next;
                head = head.next;
            }

            if(head == null){
                while(compareNode != null){
                    head = compareNode;
                    current.next = head;
                    current = current.next;
                    compareNode = compareNode.next;
                }

            }

            return root.next;
        }
    }


}
