import java.util.*;

public class IsCryptSolution {
    String[] crypt;
    Map<Character, Integer> solution;

    public IsCryptSolution(String[] crypt, char[][] solution){
        this.crypt = crypt;

        this.solution = new HashMap<Character, Integer>();

        for(int i = 0; i < solution.length; i++){
            this.solution.put(solution[i][0], Character.getNumericValue(solution[i][1]));
        }
    }

    int[] exponential(int n){

        int[] result = new int[n+1];
        result[0] = 1;
        for(int i = 1; i <= n; i++) {
            result[i] = result[i - 1] * 10;
        }

        return result;
    }

    int convertStringToNum(String str){
        int num = 0;
        int e = str.length() - 1;
        int[] exp = exponential(e);
        for(int i = 0; i < str.length(); i++){
            num += solution.get(str.charAt(i)) * exp[e];
            if(i == 0 && num == 0)
                return 0;
            e--;
        }
        return num;
    }

    boolean isCryptSolution(){
        int i = 0;
        int nums[] = new int[3];
        for(String item : crypt){
            nums[i] = convertStringToNum(item);
            if(nums[i] == 0)
                return false;
            System.out.println(nums[i]);
            i++;
        }
        if(nums[0] + nums[1] == nums[2])
            return true;
        return false;
    }
}