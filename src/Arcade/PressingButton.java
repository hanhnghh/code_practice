package Arcade;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PressingButton {

    public static String[] pressingButtons(String buttons) {

        if(buttons.equals(""))
            return new String[0];
        Map<String, String[]> map = new HashMap<>();
        String[] list2 = {"a", "b", "c"};
        map.put("2", list2);
        String[] list3 = {"d", "e", "f"};
        map.put("3", list3);
        String[] list4 = {"g", "h", "i"};
        map.put("4", list4);
        String[] list5 = {"j", "k", "l"};
        map.put("5", list5);
        String[] list6 = {"m", "n", "o"};
        map.put("6", list6);
        String[] list7 = {"p", "q", "r", "s"};
        map.put("7", list7);
        String[] list8 = {"t", "u", "v"};
        map.put("8", list8);
        String[] list9 = {"w", "x", "y", "z"};
        map.put("9", list9);

        String[] list = buttons.split("");
        List<StringBuilder> paths = new ArrayList<>();

        helper(list, 0, map, paths, new StringBuilder());
        String[] possibleButtons = new String[paths.size()];
        int i = 0;
        for(StringBuilder l : paths){
            possibleButtons[i++] = l.toString();
        }

        return possibleButtons;
    }

    private static void helper(String[] list, int count, Map<String, String[]> map, List<StringBuilder> paths, StringBuilder single){
        if(count == list.length){
            paths.add(new StringBuilder(single));
            return;
        }

        for(int i = 0; i < map.get(list[count]).length; i++){
            single.append(map.get(list[count])[i]);
            helper(list, count + 1, map, paths, single);
            single.deleteCharAt(single.length() - 1);
        }
    }
}
