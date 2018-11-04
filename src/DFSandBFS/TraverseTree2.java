package DFSandBFS;

import Tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraverseTree2 {
    public static int[] traverseTree(Tree<Integer> t){
        Queue<Tree> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(t);
        list.add(t.value);

        while (!queue.isEmpty()){
            Tree tree = queue.poll();
            if(tree.left != null) {
                queue.add(tree.left);
                list.add((Integer) tree.left.value);
            }
            if(tree.right != null) {
                queue.add(tree.right);
                list.add((Integer) tree.right.value);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
