package HashTables;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PossibleSums {
    int possibleSums(int[] coins, int[] quantity) {
        Set<Integer> sums = new HashSet<Integer>();
        sums.add(0);
        for (int i = 0; i < quantity.length; ++i) {
            List<Integer> sumsNow = new ArrayList<Integer>(sums);
            for (Integer sum : sumsNow) {
                for (int j = 1; j <= quantity[i]; ++j) {
                    sums.add(sum + j * coins[i]);
                }
            }
        }
        return sums.size() - 1;
    }
}
