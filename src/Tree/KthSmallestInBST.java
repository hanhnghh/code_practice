package Tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestInBST {
    //InOrder traversal but limited space
    int kthSmallestInBST(Tree<Integer> t, int k) {
        if(t.left == null && t.right == null && k ==1)
            return t.value;
        List<Integer> sortedList = new ArrayList<>();
        sortedList = insertToList(t, sortedList);
        System.out.println(sortedList.size());
        return sortedList.get(k-1);
    }

    List<Integer> insertToList(Tree<Integer> t, List<Integer> sortedList){
        if(t.left == null){
            sortedList.add(t.value);
            return sortedList;
        } else {
            sortedList = insertToList(t.left, sortedList);
        }
        sortedList.add(t.value);
        if(t.right == null){
            return sortedList;
        } else {
            sortedList = insertToList(t.right, sortedList);
        }
        return sortedList;
    }


}
