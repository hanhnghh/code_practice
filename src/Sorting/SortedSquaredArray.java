package Sorting;

public class SortedSquaredArray {
    public static int[] sortedSquaredArray(int[] array) {
        int neg = -1;
        int pos;
        int[] result = new int[array.length];

        for(int v : array){
            if(v < 0)
                neg++;
            else
                break;
        }

        pos = neg + 1;
        int i = 0;
        while(i < array.length) {
            while(neg >= 0 && pos < array.length){
                if(Math.abs(array[neg]) < array[pos]) {
                    result[i++] = (int) Math.pow(array[neg--], 2);
                } else {
                    result[i++] = (int) Math.pow(array[pos++], 2);
                }
            }
            while(neg >= 0){
                result[i++] = (int) Math.pow(array[neg--], 2);
            }

            while(pos < array.length)
                result[i++] = (int) Math.pow(array[pos++], 2);
        }

        return result;
    }
}
