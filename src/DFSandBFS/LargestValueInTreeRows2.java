package DFSandBFS;

import Tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInTreeRows2 {
    public static class WrapTree {
        Tree tree;
        int level;
        public WrapTree(Tree t, int l){
            tree = t;
            level = l;
        }
    }

    public static int[] largestValuesInTreeRows(Tree<Integer> t){
        List<Integer> list = new ArrayList<>();
        Queue<WrapTree> queue = new LinkedList<>();

        queue.add(new WrapTree(t, 0));

        while(!queue.isEmpty()){
            WrapTree wt = queue.remove();
            if((Integer)wt.tree.value > list.get(wt.level)){
                list.set(wt.level, (Integer)wt.tree.value);
            }

            if(wt.tree.left != null){
                queue.add(new WrapTree(wt.tree.left, wt.level + 1));
            }

            if(wt.tree.right != null){
                queue.add(new WrapTree(wt.tree.right, wt.level + 1));
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
