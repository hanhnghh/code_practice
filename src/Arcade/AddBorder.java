package Arcade;

import java.util.ArrayList;
import java.util.List;

public class AddBorder {

    public static String[] addBorder(String[] picture) {
        int rowLength = picture[0].length();
        int n = picture.length;
        StringBuilder sb = new StringBuilder();
        List<String> border = new ArrayList<>();


        for(int i = 0; i < rowLength + 2; i++){
           sb.append("*");
        }

        border.add(sb.toString());

        for(int i = 0; i < n; i++){
            border.add("*" + picture[i] + "*");
        }

        border.add(sb.toString());


        return border.toArray(new String[0]);
    }

}
