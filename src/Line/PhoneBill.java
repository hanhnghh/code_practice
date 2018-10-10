package Line;

import java.util.*;

public class PhoneBill {

    public static int solution(String S) {
        String[] lines = S.split(System.getProperty("line.separator"));
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < lines.length; i++) {
            String[] elements = lines[i].split(",");

            elements[0] = elements[0].replace("\"", "").replaceAll("\\s+","");;
            elements[1] = elements[1].replace("-", "").replace("\"", "");

            String[] timeString = elements[0].split(":");
            int time = Integer.parseInt(timeString[0]) * 3600 + Integer.parseInt(timeString[1]) * 60 + Integer.parseInt(timeString[2]);
            int phoneNumber = Integer.parseInt(elements[1]);

            if(map.containsKey(phoneNumber)){
                map.put(phoneNumber, map.get(phoneNumber) + time);
            } else {
                map.put(phoneNumber, time);
            }
        }

        int money = 0;

        Map<Integer, Integer> sortedMap = sortByValue(map);
        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()){
            if(entry.getValue() < 300) {
                money += entry.getValue() * 3;
            } else {
                if(entry.getValue() % 60 == 0){
                    money += (entry.getValue() / 60 + 1)* 150;
                } else {
                    money += (entry.getValue() / 60 + 1)* 150;
                }
            }
        }

        return money;
    }

    private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap) {

        List<Map.Entry<Integer, Integer>> list =
                new LinkedList<Map.Entry<Integer, Integer>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list) {
            if (!sortedMap.containsValue(entry.getValue())) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
        }

        sortedMap.put((Integer)sortedMap.keySet().toArray()[0], 0);
        return sortedMap;
    }

}
