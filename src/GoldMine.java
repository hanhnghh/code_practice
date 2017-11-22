public class GoldMine {

    int[][] matrix;
    int row, col;
    int[][] pathArr;
    int[] steps = {-1, 0, 1};

    public GoldMine(int[][] arr, int r, int c){
        matrix = arr;
        row = r;
        col = c;
        for(int i = 0; i < row; i++){
            for(int j = 1; j < row; j++){
                pathArr[i][j] = 0;
            }
            pathArr[i][0] = matrix[i][0];
        }
    }

    public int findMaxGold(){
        for(int i = 1; i < col; i++){
            int max = 0;
            for(int j = 0; j < row; j++){
                for(int k = 0; k < 3; k++){
                    if(0 <= j + steps[k] &&  j + steps[k] < row){
                        pathArr[j][i] = pathArr[j][i-1] + matrix[j][i];
                    }
                    if(pathArr[j][i] > max)
                        max = pathArr[j][i];
                }
                pathArr[j][i] = max;
            }

        }

        int result = pathArr[0][col];
        for(int i = 0; i < row; i++){
            if(pathArr[i][col] > result)
                result = pathArr[i][col];
        }

        return result;
    }
}
