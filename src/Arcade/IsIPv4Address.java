package Arcade;

public class IsIPv4Address {
    public static boolean isIPv4Address(String inputString) {
        String[] numbers = inputString.split("\\.");
        if(numbers.length != 4)
            return false;
        for(String i : numbers){
            try {
                if (Integer.valueOf(i) > 255 || Integer.valueOf(i) < 0)
                    return false;
            } catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }
}
