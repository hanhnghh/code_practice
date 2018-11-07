package Tree;

public class ChangeRoot {
    public static int[] changeRoot(int[] parent, int newRoot) {

        int oldParent = parent[newRoot];
        parent[newRoot] = newRoot;
        int oldParent2 = parent[oldParent];
        parent[oldParent] = newRoot;
        newRoot = oldParent;
        while(oldParent2 != parent[oldParent2] && oldParent2 != parent[oldParent]) {
            oldParent2 = parent[oldParent2];
            parent[oldParent2] = newRoot;
            newRoot = oldParent2;
        }
        parent[oldParent2] = newRoot;

        return parent;
    }
}
