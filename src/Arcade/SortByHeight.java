package Arcade;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortByHeight {
    public static int[] sortByHeight(int[] a) {
        ArrayList<Integer> b = new ArrayList<>();
        int index;
        for(int i = 0; i < a.length; i++){
            if(a[i] != -1) {
                b.add(a[i]);
            }
        }
        Collections.sort(b);
        index = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != -1){
                a[i] = b.get(index);
                index++;
            }
        }

        return a;
    }
}
