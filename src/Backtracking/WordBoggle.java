package Backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBoggle {
    public static String[] wordBoggle(char[][] board, String[] words) {
        Set<String> list = new HashSet<>();
        int[] xMove = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] yMove = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[][] visited = new int[board.length][board[0].length];
        for(int[] i : visited)
            for(int j : i)
                j = 0;

        for(int i = 0; i < words.length; i++){
            for(int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[0].length; col++) {
                    if(board[row][col] == words[i].charAt(0)) {
                        helper(board, visited, words[i], 1, row, col, xMove, yMove, list);
                    }
                }
            }
        }
        if(list.size() == 0)
            return new String[0];
        int i = 0;

        String[] strings = new String[list.size()];
        for(String s : list){
            strings[i++] = s;
        }
        Arrays.sort(strings);
        return strings;
    }

    static void helper(char[][] board, int[][] visited, String word, int index, int x, int y, int[] xMove, int[] yMove, Set<String> list){
        if(index == word.length()) {
            list.add(word);
            for(int[] j : visited)
                for(int k : j)
                    k = 0;
            return;
        }

        for(int i = 0; i < xMove.length; i++){
            int nextRow = x + xMove[i];
            int nextCol = y + yMove[i];
            if(0 <= nextRow && nextRow < board.length && 0 <= nextCol && nextCol < board[0].length)
                if(visited[nextRow][nextCol] == 0)
                    if(board[nextRow][nextCol] == word.charAt(index)) {
                        visited[nextRow][nextCol] = 1;
                        helper(board, visited, word, index + 1, nextRow, nextCol, xMove, yMove, list);
                        visited[nextRow][nextCol] = 0;
                    }

        }
    }
}
