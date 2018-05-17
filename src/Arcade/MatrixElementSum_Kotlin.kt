package Arcade

class MatrixElementSum_Kotlin {
    fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
        var sum = 0
        var col = matrix.size
        var row = matrix[0].size
        var j = 0
        while(j  < col){
            var i = 0
            for(i in 0 until row-1) {
                if (matrix[i][j] != 0) {
                    sum += matrix[i][j]
                } else {
                    break
                }
            }
            j++
        }
        return sum
    }
}