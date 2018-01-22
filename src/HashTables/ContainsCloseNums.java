package HashTables;

import java.util.HashMap;

public class ContainsCloseNums {
    boolean containsCloseNums(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                if(i - hashMap.get(nums[i]) > k){
                    hashMap.put(nums[i], i);
                } else
                    return true;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return false;
    }

}
