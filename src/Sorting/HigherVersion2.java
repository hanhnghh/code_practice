package Sorting;

public class HigherVersion2 {

    public static int higherVersion2(String ver1, String ver2) {
        String[] sVer1 = ver1.split("\\.");
        String[] sVer2 = ver2.split("\\.");
        int i = 0;
        int result = 0;
        while(i < sVer1.length){
            if(Integer.parseInt(sVer1[i]) > Integer.parseInt(sVer2[i])) {
                result = 1;
                break;
            }
            else if(Integer.parseInt(sVer1[i]) == Integer.parseInt(sVer2[i]))
                result = 0;
            else {
                result = -1;
                break;
            }
            i++;
        }
        return result;
    }
}
