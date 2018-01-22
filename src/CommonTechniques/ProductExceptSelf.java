package CommonTechniques;

public class ProductExceptSelf {
    int productExceptSelf(int[] nums, int m) {
        int n = nums.length;
        int suffix = 1;
        int[] prefix = new int[n];
        for(int i = 0; i < n; i++)
            prefix[i] = 1;

        for(int i = 1; i < n; i++){
            prefix[i] = (prefix[i-1] * nums[i-1])%m;
        }

        int sum = 0;
        for(int i = n-1; i >= 0; i--){
            sum += (prefix[i] * suffix) % m;
            suffix = (suffix * nums[i]) % m;
        }

        return sum % m;
    }
}
