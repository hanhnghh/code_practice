package Array;

public class FirstDuplicate {

    int[] arr;

    public FirstDuplicate(int[] arr){
        //arr[] = {1, 3, 3, 2, 2, 5, 1}
        this.arr = arr;
    }

    public int findFirstDuplicate(){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[Math.abs(arr[i])] < 0)
                return Math.abs(arr[i]);
            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }
        return -1;
    }
}
