package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class ComposeRanges {
    public static String[] composeRanges(int[] nums) {
        int[] range = new int[nums.length];
        if(nums.length == 0){
            return new String[0];
        }
        for(int i = 0; i < nums.length; i++){
            range[i] = -1;
        }
        range[0] = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                range[i] = range[i-1] + 1;
                range[i-1] = -1;
            }
            else
                range[i] = 0;
        }

        List<String> ranges = new ArrayList<>();

        for(int i = 0; i < range.length; i++){
            if(range[i] == 0) {
                ranges.add(String.valueOf(nums[i]));
            }
            else if(range[i] != -1) {
                ranges.add(String.valueOf(nums[i - range[i]]) + "->" + String.valueOf(nums[i]));
            }
        }
        return ranges.toArray(new String[ranges.size()]);
    }
}
