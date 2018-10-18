package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class ComposeRanges2 {

    public static String[] composeRanges(int[] nums) {

        if(nums.length == 0)
            return new String[]{""};

        int[] ranges = new int[nums.length + 1];
        for(int i = 0; i < ranges.length; i++){
            ranges[i] = -1;
        }

        ranges[0] = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                ranges[i] = ranges[i - 1];
            } else {
                ranges[i] = nums[i];
            }
        }
        List<String> result = new ArrayList<>();

        int startRange = 0;
        int endRange;

        for(int i = 0; i < ranges.length - 1; i++){
            if(ranges[i] != ranges[i+1]) {
                endRange = i;
                if(endRange != startRange) {
                    result.add(String.valueOf(nums[startRange]) + "->" + String.valueOf(nums[endRange]));
                } else {
                    result.add(String.valueOf(nums[startRange]));
                }
                startRange = i + 1;
            }
        }

        return result.toArray(new String[0]);

    }
}
