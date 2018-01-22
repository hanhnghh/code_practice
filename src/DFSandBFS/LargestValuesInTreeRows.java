package DFSandBFS;

import Tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValuesInTreeRows {
    class WrapTree{
        WrapTree(Tree t, int l){
            tree = t;
            level = l;
        }
        Tree tree;
        int level;
    }

    int[] largestValuesInTreeRows(Tree<Integer> t) {
        Queue<WrapTree> queue = new LinkedList<WrapTree>();
        List<Integer> array = new ArrayList<Integer>();
        if(t==null) return array.stream().mapToInt(i -> i).toArray();

        WrapTree w = new WrapTree(t, 0);
        queue.add(w);
        int index = 0;
        int max = Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            WrapTree temp = queue.remove();
            array.add(Integer.MIN_VALUE);

            if(temp.level == index){
                if((int)temp.tree.value > max){
                    max = (int)temp.tree.value;
                }
            } else {
                max = Integer.MIN_VALUE;
                index++;
                if((int)temp.tree.value > max)
                    max = (int)temp.tree.value;
            }
            array.set(index, max);

            if(temp.tree.left != null){
                queue.add(new WrapTree(temp.tree.left, temp.level + 1));
            }

            if(temp.tree.right != null){
                queue.add(new WrapTree(temp.tree.right, temp.level + 1));
            }
        }

        return array.stream().filter(i->i != Integer.MIN_VALUE).mapToInt(i->i).toArray();
    }

}
