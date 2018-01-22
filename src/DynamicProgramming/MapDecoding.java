package DynamicProgramming;

public class MapDecoding {
    public static int mapDecoding(String message) {
        int M = 1000000007;
        char[] ch = message.toCharArray();
        if(message.equals("0"))
            return 0;
        if(message.equals(""))
            return 1;
        for(int i = 0; i < ch.length - 1; i++){
            if(ch[i]=='0' && ch[i+1]=='0')
                return 0;
            if(ch[i] > '2' && ch[i+1]=='0')
                return 0;
        }
        int[] decode = new int[ch.length];
        decode[0] = 1;
        if(ch.length >= 2){
            StringBuilder sb1 = new StringBuilder();
            decode[1] = ((ch[1] == '0') || Integer.parseInt(sb1.append("").append(ch[0]).append(ch[1]).toString()) > 26) ? 1 : 2;
            for(int i = 2; i < ch.length; i++){
                StringBuilder sb = new StringBuilder();
                int num = Integer.parseInt(sb.append("").append(ch[i-1]).append(ch[i]).toString());
                if(ch[i]!='0'){
                    if(num <= 26){
                        if(ch[i-1] == '0')
                            decode[i] = decode[i-1] % M;
                        else
                            decode[i] = decode[i-1] % M + decode[i-2] % M;
                    } else {
                        decode[i] = decode[i-1] % M;
                    }
                } else {
                    if(num <= 26){
                        decode[i] = decode[i-2] % M;
                    }
                }
            }
        }

        return decode[ch.length - 1];
    }
}
