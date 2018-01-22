package Sorting;

import java.util.ArrayList;

public class MergeKArrays {
        ArrayList<Integer> mergeKArrays(int[][] arrays) {
        int[] firstUnused = new int[arrays.length];
        ArrayList<Integer> result = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < arrays.length; i++) {
            n += arrays[i].length;
        }
        for (int i = 0; i < n; i++) {
            int minIndex = -1,
                    minValue = 0;
            for (int j = 0; j < arrays.length; j++) {
                if (firstUnused[j] < arrays[j].length) {
                    if ((minValue == 0 && minIndex == -1 && arrays[j][firstUnused[j]] - Integer.MAX_VALUE < minValue) || (minValue != 0 && arrays[j][firstUnused[j]] < minValue)) {
                        minIndex = j;
                        minValue = arrays[j][firstUnused[j]];
                    }
                }
            }
            result.add(minValue);
            firstUnused[minIndex]++;
        }
        return result;
    }
/*public static ArrayList<Integer> mergeKArrays(int[][] arrays) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 1; i < arrays.length; i++) {
            arrays[0] = helper(arrays, i);
        }
        for(int i : arrays[0]){
            result.add(i);
        }
        return result;
    }


    static int[] helper(int[][] arrays, int index){
        int i,j;
        int k = 0;
        int[] temp = new int[arrays[index].length + arrays[0].length];
        for(i = 0, j = 0; i < arrays[index].length && j < arrays[0].length; ){
            if(arrays[index][i] <= arrays[0][j]){
                temp[k++] = arrays[index][i];
                i++;
            } else {
                temp[k++] = arrays[0][j];
                j++;
            }
        }

        while (i < arrays[index].length){
            temp[k++] = arrays[index][i];
            i++;
        }

        while(j < arrays[0].length){
            temp[k++] = arrays[0][j];
            j++;
        }
        return temp;
    }*/
}
