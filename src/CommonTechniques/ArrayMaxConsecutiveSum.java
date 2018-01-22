package CommonTechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMaxConsecutiveSum {

    int arrayMaxConsecutiveSum2(int[] inputArray) {
        if(inputArray.length==0) return 0;
        int[] sum = new int[inputArray.length];
        sum[0]=inputArray[0];
        int max =Integer.MIN_VALUE;
        for(int i=1; i< inputArray.length; i++){
            sum[i] =Math.max(sum[i-1]+inputArray[i],inputArray[i]);
            max = Math.max(sum[i],max);
        }
        return max;
    }
    /*public static int arrayMaxConsecutiveSum2(int[] inputArray) {
        int[] maxSum = new int[inputArray.length];
        boolean[] contains = new boolean[inputArray.length];
        int[] maxTemp = new int[inputArray.length];
        for(int i = 1; i < inputArray.length; i++) {
            contains[i] = false;
            maxTemp[i] = Integer.MIN_VALUE;
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += inputArray[j];
                if (maxTemp[i] < sum)
                    maxTemp[i] = sum;
            }
        }

        maxSum[0] = inputArray[0];
        contains[0] = true;
        for(int i = 1; i < inputArray.length; i++){

            if(contains[i-1]){
                if(maxSum[i-1] > maxSum[i-1] + inputArray[i]){
                    maxSum[i] = maxSum[i-1];
                    contains[i] = false;
                } else {
                    if(maxSum[i-1] +inputArray[i] > inputArray[i])
                        maxSum[i] = maxSum[i-1] + inputArray[i];
                    else
                        maxSum[i] = inputArray[i];
                    contains[i] = true;
                }
            }
            else {
                maxSum[i] = inputArray[i];
                contains[i] = true;;
            }

            if(maxSum[i] < maxTemp[i]){
                maxSum[i] = maxTemp[i];
                contains[i] = true;
            }
        }

        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < maxSum.length; i++)
            temp.add(maxSum[i]);

        return Collections.max(temp);
    }*/

}
