package Arcade;

public class DifferentPlaylists {
    public static int differentPlaylists(int n, int k, int l) {
        int modulo = 1;
        for(int i = 1; i <= 9; i++){
            modulo *= 10;
        }
        modulo += 7;

        int count = 1;
        if(k > n)
            return 0;

        int kTrack;
        if(l > k) {
            for (kTrack = 0; kTrack < k; kTrack++) {
                count *= (n - kTrack);
                count = count % modulo;
            }

            for (kTrack = k; kTrack < l; kTrack++) {
                count *= (n - k);
                count = count % modulo;
            }
        } else {
            for(kTrack = 0; kTrack < l; kTrack++){
                count *= (n - kTrack);
                count = count % modulo;
            }
        }

        return count;
    }

}
