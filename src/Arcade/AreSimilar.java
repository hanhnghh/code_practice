package Arcade;

public class AreSimilar {

    public static boolean areSimilar(int[] a, int[] b) {
        int firstDiff = -1;
        int secondDiff = -1;
        int firstNumA = -1;
        int firstNumB = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                if(firstDiff == -1){
                    firstDiff = i;
                    firstNumA = a[i];
                    firstNumB = b[i];
                }
                else if(secondDiff == -1){
                    secondDiff = i;
                    if(b[i] != firstNumA || a[i] != firstNumB)
                        return false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
