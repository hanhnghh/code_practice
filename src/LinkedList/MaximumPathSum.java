package LinkedList;

public class MaximumPathSum {

    Node root;
    int max_top = Integer.MIN_VALUE;

    public MaximumPathSum(Node r){
        root = r;
    }

    public int findMaxPath(Node node){

        if(node == null){
            return 0;
        }

        int l = findMaxPath(node.leftNode);
        int r = findMaxPath(node.rightNode);

        int max_single = Math.max(node.value, Math.max(node.value + l, node.value + r));

        max_top = Math.max(max_single, l + r + node.value);

        return max_single;
    }

    public int findMax(Node node){
        findMaxPath(root);
        return max_top;
    }
}

class Node {
    int value;
    Node rightNode;
    Node leftNode;

    public Node(int val){
        value = val;
        rightNode = null;
        leftNode = null;
    }
}