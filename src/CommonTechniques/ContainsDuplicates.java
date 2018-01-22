package CommonTechniques;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    boolean containsDuplicates(int[] a) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            if(set.contains(a[i])) return true;
            set.add(a[i]);
        }
        return false;
    }

}
