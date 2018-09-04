package Challenge;

import java.math.BigInteger;
import java.util.LinkedList;

public class KBonacci {

    //1, 1, 1, 3, 5
   /* public static String kbonacci(int k, int n) {
        if(n < k){
            return String.valueOf(1);
        }
        BigInteger[] kArray = new BigInteger[n+1];
        for(int i = 0; i < kArray.length; i++){
            kArray[i] = new BigInteger("0");
        }

        for(int i = 0; i < k; i++)
            kArray[i] = BigInteger.valueOf(1);

        for(int i = k; i <= n; i++){
            for(int j = i-k; j < i; j++){
                kArray[i] = kArray[i].add(kArray[j]);
            }
        }

        return String.valueOf(kArray[n]);
    }*/

    public static String kbonacci(int k, int n) {
        if (n < k) {
            return "1";
        }

        if (n == k) {
            return String.valueOf(k);
        }

        LinkedList<BigInteger> previousK = new LinkedList<BigInteger>();

        for (int i = 0; i < k; ++i) {
            previousK.add(BigInteger.ONE);
        }
        previousK.add(BigInteger.valueOf(k));

        BigInteger result = BigInteger.ZERO;
        for (int i = k + 1; i <= n; i++) {
            final BigInteger previous = previousK.getLast();
            result = previous.add(previous).subtract(previousK.getFirst());

            previousK.removeFirst();
            previousK.add(result);
        }

        return String.valueOf(result);
    }
}
