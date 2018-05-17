package Arcade;

public class MatrixElementSum {

    public static int matrixElementsSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int j = 0;
        int sum = 0;
        while(j < col){
            for(int i = 0; i < row; i++) {
                if (matrix[i][j] != 0) {
                    sum += matrix[i][j];
                } else {
                    break;
                }
            }
            j++;
        }
        return sum;
    }

}
