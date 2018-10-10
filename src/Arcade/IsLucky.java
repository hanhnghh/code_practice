package Arcade;

public class IsLucky {
    public static boolean isLucky(int n) {
        int h1 = 0, h2 = 0;
        String[] s = String.valueOf(n).split("");
        for(int i = 0, j = s.length / 2; i < s.length / 2 && j < s.length; i++, j++){
            h1 += Integer.valueOf(s[i]);
            h2 += Integer.valueOf(s[j]);
        }

        return h1 == h2;
    }
}
