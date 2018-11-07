package Arcade;

public class ArrayChange {
    public static int arrayChange(int[] inputArray) {
        int count = 0;
        for(int i = 0; i < inputArray.length - 1; i++){
            if(inputArray[i+1] <= inputArray[i]){
                count += inputArray[i] + 1 - inputArray[i+1];
                inputArray[i+1] = inputArray[i] + 1;
            }
        }
        return count;
    }
}
