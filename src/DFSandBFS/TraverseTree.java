package DFSandBFS;

import Tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraverseTree {
    //
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
    int[] traverseTree(Tree<Integer> t) {
        Queue<Tree> q = new LinkedList<Tree>();
        List<Integer> a = new ArrayList<>();
        if(t==null) return a.stream().mapToInt(i -> i).toArray();;
        q.add(t);

        while(!q.isEmpty()){
            Tree temp = q.remove();
            a.add((Integer)temp.value);

            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }

        return a.stream().mapToInt(i -> i).toArray();
    }

}
