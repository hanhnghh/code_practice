package Tree;

public class FindProfession2 {

    public static String findProfession(int level, int pos) {
        Tree<Integer> tree = new Tree<Integer>(0);
        String[] result = new String[1];
        helper(tree, 1, 1, level, pos, result);
        return result[0];
    }

    private static void helper(Tree<Integer> tree, int level, int pos, int leverTarget, int posTarget, String[] pros){
        if(level == leverTarget) {
            if (pos == posTarget) {
                if (tree.value == 0) {
                    pros[0] = "Engineer";
                } else {
                    pros[0] = "Doctor";
                }
                return;
            } else {
                return;
            }
        }

        tree.left = new Tree(tree.value);
        tree.right = new Tree(1 - tree.value);
        helper(tree.left, level + 1,2 * pos - 1, leverTarget, posTarget, pros);
        helper(tree.right, level + 1,2 * pos, leverTarget, posTarget, pros);
    }
}
