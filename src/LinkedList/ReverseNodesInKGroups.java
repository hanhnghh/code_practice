package LinkedList;

public class ReverseNodesInKGroups {
    ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
        if(l==null || l.next==null || k==1) return l;
        ListNode list = new ListNode(0);
        list.next = l;
        ListNode startNode = list;
        int i =0;
        while(l!=null){
            i++;
            if(i%k==0){
                startNode = reverse(startNode, l.next);
                //System.out.println(startNode.value);
                l= startNode.next;
            }else{
                l= l.next;
            }

        }
        return list.next;
    }

    //bao boc group can dao nguoc bang 2 node duoi: startNode va tren: endNode de tao lien ket giua group nay va 2 group can tren va duoi.
    //  0,1,2,3 -- 0,2,1,3 -- next begin 1
    public ListNode reverse(ListNode startNode, ListNode endNode){
        ListNode prev = endNode;
        ListNode nextStartNode = startNode.next;
        ListNode curr= startNode.next;
        while(curr!=endNode){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        startNode.next = prev;
        return nextStartNode;

    }

}
