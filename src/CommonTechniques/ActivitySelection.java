package CommonTechniques;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public static int selectAcitivity(int[] start, int[] finish){
        List<Pair<Integer, Integer>> listActivity = new ArrayList<>();
        for(int i = 0; i < start.length; i++){
            listActivity.add(new Pair<>(start[i], finish[i]));
        }

        Collections.sort(listActivity, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        int count = 1;
        int i = 0;

        for(int j = i; j < listActivity.size(); j++) {
            if (listActivity.get(i).getValue() < listActivity.get(j).getKey()) {
                count++;
                i = j;
            }
        }


        return count;

    }
}
