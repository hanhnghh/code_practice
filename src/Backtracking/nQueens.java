package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class nQueens {
    int[][] nQueens(int n) {
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 0;
            }
        }
        List<List<Integer>> paths = new ArrayList<>();

        helper(board, 0, n, paths, new ArrayList<Integer>());

        //Collections.sort(paths);
        int[][] arr = new int[paths.size()][];
        int i = 0;
        for(List<Integer> l : paths){
            arr[i++] = l.stream().mapToInt(j->j+1).toArray();
        }
        return arr;
    }

    boolean isSafe(int[][] board, int col, int row, int N){
        int i, j;

        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i=row, j=col; i>=0 && j>=0; i--, j--){
            if (board[i][j] == 1)
                return false;
        }

        for (i=row, j=col; j>=0 && i<N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    void helper(int[][] board, int col, int n, List<List<Integer>> paths, List<Integer> single){
        if(col == n){
            paths.add(new ArrayList<>(single));
            return;
        }
        for(int i = 0; i < n; i++){
            if(isSafe(board, col, i, n)){
                single.add(i);
                board[i][col] = 1;
                helper(board, col+1, n, paths, single);
                single.remove(single.size()-1);
                board[i][col] = 0;
            }
        }
    }

}
