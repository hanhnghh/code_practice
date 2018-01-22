package HashTables;

import java.util.HashMap;

public class AreFollowingPatterns {
    public boolean areFollowingPatterns(String[] strings, String[] patterns) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();

        int n = patterns.length;
        for(int i = 0; i < n; i++){
            if(!hashMap.containsKey(patterns[i])){
                hashMap.put(patterns[i], strings[i]);
            }
        }

        for(int i = 0; i < n; i++){
            if(!hashMap2.containsKey(strings[i])){
                hashMap2.put(strings[i], patterns[i]);
            }
        }

        for(int i = 0; i < n; i++){

            if(!hashMap.get(patterns[i]).equals(strings[i])){
                return false;
            }
            if(!hashMap2.get(strings[i]).equals(patterns[i])){
                return false;
            }
        }


        return true;
    }
}
