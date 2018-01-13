package Tree;

import java.util.ArrayList;

public class RestoreBinaryTree {
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
    public static Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder) {

        int n = inorder.length;
        return buildTree(inorder, preorder, 0, n - 1, 0);
    }
    /*
        inStart:  start index in inorder array
        inEnd:    end index in inorder array
        preStart: start index in preorder array

        index trong 2 array nay hoan toan khac biet nhau trong truong hop right tree = null, do do khong the dung index trong inorder cung la index trong preorder duoc(preStart = l + 1),
        ma phai dung cong thuc: preStart moi (tuc la node right tree moi) = preStart cu + so node left tree (= l - inStart) + 1(chinh la root node cua right tree moi nay))
        + l - inStart = so node left tree vi tu diem bat dau den diem ma gia tri 2 array bang nhau chinh la thuoc ve nhanh ben trai, ko quan tam nhanh ben trai co bao nhieu
        node, thua thieu node ra sao, chi can biet diem ma gia tri 2 array bang nhau chinh la root moi, the thoi.
        + 1: vi diem start moi se ko tinh root moi chinh la gia tri 2 array bang nhau
     */
    static Tree<Integer> buildTree(int[] inorder, int[] preorder, int inStart, int inEnd, int preStart){
        int l = 0;
        if(inStart > inEnd || preStart > preorder.length - 1)
            return null;
        Tree t = new Tree(preorder[preStart]);
        if(inStart == inEnd){
            return t;
        }

        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == preorder[preStart]) {
                l = i;
                break;
            }
        }

        t.left = buildTree(inorder, preorder, inStart, l - 1, preStart + 1);
        t.right = buildTree(inorder, preorder, l+1, inEnd, preStart + l - inStart + 1);

        return t;
    }
}
