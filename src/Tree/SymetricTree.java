package Tree;

/**
 * public class Tree<T> {
 *     public Tree(T x) {
 *         value = x;
 *     }
 *     public T value;
 *     public Tree<T> left;
 *     public Tree<T> right;
 * }
 */
public class SymetricTree {

    public static boolean isTreeSymmetric(Tree<Integer> t) {
        return isMirror(t, t);
    }

    private static boolean isMirror(Tree<Integer> left, Tree<Integer> right){
        if(left == null && right == null)
            return true;

        if(left != null && right != null && left.value.equals(right.value))
            return isMirror(left.left, right.right) && isMirror(left.right, right.right);
        else
            return false;
    }

}
