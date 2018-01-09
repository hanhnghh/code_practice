package Tree;

public class HasPathWithGivenSum {
    int step = -1;
    boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        step++;
        if(t == null){
            if(step == 0){
                if(s == 0)
                    return true;
                else
                    return false;
            }
        } else {
            if(isLeaf(t) && (s - t.value) == 0)
                return true;
            else if(isLeaf(t) && (s - t.value) != 0)
                return false;

            if(hasPathWithGivenSum(t.left, s - t.value)
                    || hasPathWithGivenSum(t.right, s - t.value))
                return true;
        }
        return false;
    }

    boolean isLeaf(Tree t){
        if(t.left == null && t.right == null)
            return true;
        return false;
    }

}

class Tree<T> {
   Tree(T x) {
     value = x;
   }
   T value;
   Tree<T> left;
   Tree<T> right;
}
